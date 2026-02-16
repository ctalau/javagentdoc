# Class: `WrappingExecutorService`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.WrappingExecutorService`

**Implements:** `java.util.concurrent.ExecutorService`

## Description

An abstract `ExecutorService` that allows subclasses to wrap tasks before they are submitted to the underlying executor.

 <p>Note that task wrapping may occur even if the task is never executed.

 <p>For delegation without task-wrapping, see `ForwardingExecutorService`.
**Author:** Chris Nokleberg

## Fields

### `delegate`

**Type:** `java.util.concurrent.ExecutorService`

## Constructors

### `<init>(`java.util.concurrent.ExecutorService` delegate)`

## Methods

### `wrapTask(`java.util.concurrent.Callable<T>` callable)`

**Returns:** `java.util.concurrent.Callable<T>`

Wraps a `Callable` for submission to the underlying executor. This method is also applied
 to any `Runnable` passed to the default implementation of `wrapTask(Runnable)`.

### `wrapTask(`java.lang.Runnable` command)`

**Returns:** `java.lang.Runnable`

Wraps a `Runnable` for submission to the underlying executor. The default implementation
 delegates to `wrapTask(Callable)`.

### `wrapTasks(`java.util.Collection<? extends java.util.concurrent.Callable<T>>` tasks)`

**Returns:** [`com.google.common.collect.ImmutableList<java.util.concurrent.Callable<T>>`](../../collect/ImmutableList>.md)

Wraps a collection of tasks.
@throws NullPointerException if any element of `tasks` is null

### `execute(`java.lang.Runnable` command)`

**Returns:** `void`

### `submit(`java.util.concurrent.Callable<T>` task)`

**Returns:** `java.util.concurrent.Future<T>`

### `submit(`java.lang.Runnable` task)`

**Returns:** `java.util.concurrent.Future<?>`

### `submit(`java.lang.Runnable` task, `T` result)`

**Returns:** `java.util.concurrent.Future<T>`

### `invokeAll(`java.util.Collection<? extends java.util.concurrent.Callable<T>>` tasks)`

**Returns:** `java.util.List<java.util.concurrent.Future<T>>`

### `invokeAll(`java.util.Collection<? extends java.util.concurrent.Callable<T>>` tasks, `long` timeout, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `java.util.List<java.util.concurrent.Future<T>>`

### `invokeAny(`java.util.Collection<? extends java.util.concurrent.Callable<T>>` tasks)`

**Returns:** `T`

### `invokeAny(`java.util.Collection<? extends java.util.concurrent.Callable<T>>` tasks, `long` timeout, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `T`

### `shutdown()`

**Returns:** `void`

### `shutdownNow()`

**Returns:** `java.util.List<java.lang.Runnable>`

### `isShutdown()`

**Returns:** `boolean`

### `isTerminated()`

**Returns:** `boolean`

### `awaitTermination(`long` timeout, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `boolean`

