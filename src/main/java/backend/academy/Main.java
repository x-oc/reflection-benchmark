package backend.academy;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

@State(Scope.Thread)
public class Main {

    public static final int MEASUREMENT_TIME = 5;
    public static final String METHOD_NAME = "name";
    private Student student;
    private Method method;
    private MethodHandle methodHandle;
    private Function<Student, String> lambda;

    @SuppressWarnings("MagicNumber")
    public static void main(String[] args) throws RunnerException {
        Options options = new OptionsBuilder()
            .include(Main.class.getSimpleName())
            .shouldFailOnError(true)
            .shouldDoGC(true)
            .mode(Mode.AverageTime)
            .timeUnit(TimeUnit.NANOSECONDS)
            .forks(1)
            .warmupForks(1)
            .warmupIterations(1)
            .warmupTime(TimeValue.seconds(3))
            .measurementIterations(3)
            .measurementTime(TimeValue.seconds(MEASUREMENT_TIME))
            .build();
        new Runner(options).run();
    }

    @Setup
    public void setup()
        throws Throwable {
        student = new Student("Ivan", "Ivanov");
        method = Student.class.getMethod(METHOD_NAME);
        methodHandle = MethodHandles.lookup()
            .findVirtual(Student.class, METHOD_NAME, MethodType.methodType(String.class));

        lambda = (Function<Student, String>) LambdaMetafactory.metafactory(
            MethodHandles.lookup(),
            "apply",
            MethodType.methodType(Function.class),
            MethodType.methodType(Object.class, Object.class),
            methodHandle,
            MethodType.methodType(String.class, Student.class)
        ).getTarget().invokeExact();
    }

    @Benchmark
    public void directAccess(Blackhole bh) {
        String name = student.name();
        bh.consume(name);
    }

    @Benchmark
    public void reflection(Blackhole bh) throws InvocationTargetException, IllegalAccessException {
        String name = (String) method.invoke(student);
        bh.consume(name);
    }

    @Benchmark
    public void methodHandles(Blackhole bh) {
        String name;
        try {
            name = (String) methodHandle.invokeExact(student);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        bh.consume(name);
    }

    @Benchmark
    public void lambdaMetafactory(Blackhole bh) {
        String name = lambda.apply(student);
        bh.consume(name);
    }

    record Student(String name, String surname) {

    }
}
