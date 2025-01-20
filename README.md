# reflection-benchmark

Этот проект предназначен для сравнения различных способов вызова методов в Java с помощью JMH (Java Microbenchmarking Harness). Он включает несколько подходов, таких как прямой доступ, рефлексия, MethodHandles и использование `LambdaMetafactory`.

## Цель

Цель проекта — измерить производительность различных способов доступа к методам в Java и оценить их подходящие сценарии использования в зависимости от производительности.

Проект тестирует следующие методы:

1. **Прямой доступ**: прямой вызов метода объекта.
2. **Рефлексия**: использование Java Reflection для вызова метода.
3. **MethodHandles**: использование `MethodHandle` для вызова метода.
4. **LambdaMetafactory**: создание лямбда-выражений с помощью `LambdaMetafactory` для вызова метода.

## Результаты

|Benchmark               |Score|
|-|-|
|Main.directAccess       |0,593 ns/op|
|Main.lambdaMetafactory  |0,598 ns/op|
|Main.methodHandles      |2,544 ns/op|
|Main.reflection         |4,657 ns/op|
