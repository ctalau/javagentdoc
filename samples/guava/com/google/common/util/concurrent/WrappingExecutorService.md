# Class: `WrappingExecutorService`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.WrappingExecutorService`

**Implements:** [`java.util.concurrent.ExecutorService`](../../../../../java/util/concurrent/ExecutorService.md)

## Description

An abstract {@code ExecutorService} that allows subclasses to {@linkplain #wrapTask(Callable) wrap} tasks before they are submitted to the underlying executor.

 <p>Note that task wrapping may occur even if the task is never executed.

 <p>For delegation without task-wrapping, see {@link ForwardingExecutorService}.
@author Chris Nokleberg

## Fields

### `delegate`

**Type:** [`java.util.concurrent.ExecutorService`](../../../../../java/util/concurrent/ExecutorService.md)

## Constructors

### `<init>([`java.util.concurrent.ExecutorService`](../../../../../java/util/concurrent/ExecutorService.md) delegate)`

## Methods

### `wrapTask([`java.util.concurrent.Callable<T>`](../../../../../java/util/concurrent/Callable.md) callable)`

**Returns:** [`java.util.concurrent.Callable<T>`](../../../../../java/util/concurrent/Callable.md)

Wraps a {@code Callable} for submission to the underlying executor. This method is also applied
 to any {@code Runnable} passed to the default implementation of {@link #wrapTask(Runnable)}.

### `wrapTask(`java.lang.Runnable` command)`

**Returns:** `java.lang.Runnable`

Wraps a {@code Runnable} for submission to the underlying executor. The default implementation
 delegates to {@link #wrapTask(Callable)}.

### `wrapTasks([`java.util.Collection<? extends java.util.concurrent.Callable<T>>`](../../../../../java/util/Collection>.md) tasks)`

**Returns:** [`com.google.common.collect.ImmutableList<java.util.concurrent.Callable<T>>`](../../collect/ImmutableList>.md)

Wraps a collection of tasks.
@throws NullPointerException if any element of {@code tasks} is null

### `execute(`java.lang.Runnable` command)`

**Returns:** `void`

### `submit([`java.util.concurrent.Callable<T>`](../../../../../java/util/concurrent/Callable.md) task)`

**Returns:** [`java.util.concurrent.Future<T>`](../../../../../java/util/concurrent/Future.md)

### `submit(`java.lang.Runnable` task)`

**Returns:** [`java.util.concurrent.Future<?>`](../../../../../java/util/concurrent/Future.md)

### `submit(`java.lang.Runnable` task, [`T`](T.md) result)`

**Returns:** [`java.util.concurrent.Future<T>`](../../../../../java/util/concurrent/Future.md)

### `invokeAll([`java.util.Collection<? extends java.util.concurrent.Callable<T>>`](../../../../../java/util/Collection>.md) tasks)`

**Returns:** [`java.util.List<java.util.concurrent.Future<T>>`](../../../../../java/util/List>.md)

### `invokeAll([`java.util.Collection<? extends java.util.concurrent.Callable<T>>`](../../../../../java/util/Collection>.md) tasks, `long` timeout, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** [`java.util.List<java.util.concurrent.Future<T>>`](../../../../../java/util/List>.md)

### `invokeAny([`java.util.Collection<? extends java.util.concurrent.Callable<T>>`](../../../../../java/util/Collection>.md) tasks)`

**Returns:** [`T`](T.md)

### `invokeAny([`java.util.Collection<? extends java.util.concurrent.Callable<T>>`](../../../../../java/util/Collection>.md) tasks, `long` timeout, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** [`T`](T.md)

### `shutdown()`

**Returns:** `void`

### `shutdownNow()`

**Returns:** [`java.util.List<java.lang.Runnable>`](../../../../../java/util/List.md)

### `isShutdown()`

**Returns:** `boolean`

### `isTerminated()`

**Returns:** `boolean`

### `awaitTermination(`long` timeout, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** `boolean`

