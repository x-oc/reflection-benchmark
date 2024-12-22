# Измерение производительности

JMH version: 1.37  
VM version: JDK 22.0.2, Java HotSpot(TM) 64-Bit Server VM, 22.0.2+9-70  
VM invoker: C:\Program Files\Java\jdk-22\bin\java.exe  
VM options: -javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2024.1.1\lib\idea_rt.jar=63038:C:\Program Files\JetBrains\IntelliJ IDEA 2024.1.1\bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8  
Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)  
Warmup: 1 iterations, 3 s each  
Measurement: 3 iterations, 5 s each  
Timeout: 10 min per iteration  
Threads: 1 thread, will synchronize iterations  
Benchmark mode: Average time, time/op  
Benchmark: backend.academy.Main.directAccess  


### Run progress: 0,00% complete, ETA 00:02:24

Warmup Fork: 1 of 1  
Warmup Iteration   1: 0,485 ns/op  
Iteration   1: 0,413 ns/op  
Iteration   2: 0,423 ns/op  
Iteration   3: 0,498 ns/op

### Run progress: 12,50% complete, ETA 00:02:30

Fork: 1 of 1  
Warmup Iteration   1: 0,483 ns/op  
Iteration   1: 0,446 ns/op  
Iteration   2: 0,615 ns/op  
Iteration   3: 0,720 ns/op

## Result "backend.academy.Main.directAccess":
0,593 �(99.9%) 2,519 ns/op [Average]  
(min, avg, max) = (0,446, 0,593, 0,720), stdev = 0,138  
CI (99.9%): [? 0, 3,112] (assumes normal distribution)


JMH version: 1.37  
VM version: JDK 22.0.2, Java HotSpot(TM) 64-Bit Server VM, 22.0.2+9-70  
VM invoker: C:\Program Files\Java\jdk-22\bin\java.exe  
VM options: -javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2024.1.1\lib\idea_rt.jar=63038:C:\Program Files\JetBrains\IntelliJ IDEA 2024.1.1\bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8  
Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)  
Warmup: 1 iterations, 3 s each  
Measurement: 3 iterations, 5 s each  
Timeout: 10 min per iteration  
Threads: 1 thread, will synchronize iterations  
Benchmark mode: Average time, time/op  
Benchmark: backend.academy.Main.lambdaMetafactory  

### Run progress: 25,00% complete, ETA 00:02:08
Warmup Fork: 1 of 1  
Warmup Iteration   1: 0,569 ns/op  
Iteration   1: 0,619 ns/op  
Iteration   2: 0,583 ns/op  
Iteration   3: 0,593 ns/op

### Run progress: 37,50% complete, ETA 00:01:46
Fork: 1 of 1  
Warmup Iteration   1: 0,538 ns/op  
Iteration   1: 0,583 ns/op  
Iteration   2: 0,600 ns/op  
Iteration   3: 0,611 ns/op


## Result "backend.academy.Main.lambdaMetafactory":
0,598 �(99.9%) 0,255 ns/op [Average]  
(min, avg, max) = (0,583, 0,598, 0,611), stdev = 0,014  
CI (99.9%): [0,343, 0,853] (assumes normal distribution)


JMH version: 1.37  
VM version: JDK 22.0.2, Java HotSpot(TM) 64-Bit Server VM, 22.0.2+9-70  
VM invoker: C:\Program Files\Java\jdk-22\bin\java.exe  
VM options: -javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2024.1.1\lib\idea_rt.jar=63038:C:\Program Files\JetBrains\IntelliJ IDEA 2024.1.1\bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8  
Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)  
Warmup: 1 iterations, 3 s each  
Measurement: 3 iterations, 5 s each  
Timeout: 10 min per iteration  
Threads: 1 thread, will synchronize iterations  
Benchmark mode: Average time, time/op  
Benchmark: backend.academy.Main.methodHandles  

### Run progress: 50,00% complete, ETA 00:01:25
Warmup Fork: 1 of 1  
Warmup Iteration   1: 2,325 ns/op  
Iteration   1: 2,629 ns/op  
Iteration   2: 2,384 ns/op  
Iteration   3: 2,412 ns/op

### Run progress: 62,50% complete, ETA 00:01:04
Fork: 1 of 1  
Warmup Iteration   1: 2,126 ns/op  
Iteration   1: 2,436 ns/op  
Iteration   2: 2,568 ns/op  
Iteration   3: 2,627 ns/op  


## Result "backend.academy.Main.methodHandles":
2,544 �(99.9%) 1,792 ns/op [Average]  
(min, avg, max) = (2,436, 2,544, 2,627), stdev = 0,098  
CI (99.9%): [0,752, 4,335] (assumes normal distribution)


JMH version: 1.37  
VM version: JDK 22.0.2, Java HotSpot(TM) 64-Bit Server VM, 22.0.2+9-70  
VM invoker: C:\Program Files\Java\jdk-22\bin\java.exe  
VM options: -javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2024.1.1\lib\idea_rt.jar=63038:C:\Program Files\JetBrains\IntelliJ IDEA 2024.1.1\bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8  
Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)  
Warmup: 1 iterations, 3 s each  
Measurement: 3 iterations, 5 s each  
Timeout: 10 min per iteration  
Threads: 1 thread, will synchronize iterations  
Benchmark mode: Average time, time/op  
Benchmark: backend.academy.Main.reflection  

### Run progress: 75,00% complete, ETA 00:00:42
Warmup Fork: 1 of 1  
Warmup Iteration   1: 4,906 ns/op  
Iteration   1: 5,039 ns/op  
Iteration   2: 4,777 ns/op  
Iteration   3: 5,305 ns/op

### Run progress: 87,50% complete, ETA 00:00:21
Fork: 1 of 1  
Warmup Iteration   1: 4,131 ns/op  
Iteration   1: 4,617 ns/op  
Iteration   2: 4,561 ns/op  
Iteration   3: 4,791 ns/op


## Result "backend.academy.Main.reflection":
4,657 �(99.9%) 2,188 ns/op [Average]  
(min, avg, max) = (4,561, 4,657, 4,791), stdev = 0,120  
CI (99.9%): [2,469, 6,844] (assumes normal distribution)


### Run complete. Total time: 00:02:50

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

NOTE: Current JVM experimentally supports Compiler Blackholes, and they are in use. Please exercise
extra caution when trusting the results, look into the generated code to check the benchmark still
works, and factor in a small probability of new VM bugs. Additionally, while comparisons between
different JVMs are already problematic, the performance difference caused by different Blackhole
modes can be very significant. Please make sure you use the consistent Blackhole mode for comparisons.

Benchmark               Mode  Cnt  Score   Error  Units  
Main.directAccess       avgt    3  0,593 � 2,519  ns/op  
Main.lambdaMetafactory  avgt    3  0,598 � 0,255  ns/op  
Main.methodHandles      avgt    3  2,544 � 1,792  ns/op  
Main.reflection         avgt    3  4,657 � 2,188  ns/op  
