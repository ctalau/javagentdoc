# Class: `WrappingExecutorService`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.WrappingExecutorService`

**Implements:** `java.util.concurrent.ExecutorService`

## Description

Note that task wrapping may occur even if the task is never executed.

 
For delegation without task-wrapping, see ForwardingExecutorService.

## Fields

### `delegate`

**Type:** `java.util.concurrent.ExecutorService`

## Constructors

### `<init>(ExecutorService delegate)`

**Parameters:**
- `delegate` (`java.util.concurrent.ExecutorService`)

## Methods

### `wrapTask(Callable<T> callable)`

This method is also applied
 to any Runnable passed to the default implementation of #wrapTask(Runnable).

**Parameters:**
- `callable` (`java.util.concurrent.Callable<T>`)

**Returns:** `java.util.concurrent.Callable<T>`

### `wrapTask(Runnable command)`

The default implementation
 delegates to #wrapTask(Callable).

**Parameters:**
- `command` (`java.lang.Runnable`)

**Returns:** `java.lang.Runnable`

### `wrapTasks(Collection<? extends Callable<T>> tasks)`

**Parameters:**
- `tasks` (`java.util.Collection<? extends java.util.concurrent.Callable<T>>`)

**Returns:** [`com.google.common.collect.ImmutableList<java.util.concurrent.Callable<T>>`](../../collect/ImmutableList.md)

### `execute(Runnable command)`

**Parameters:**
- `command` (`java.lang.Runnable`)

**Returns:** `void`

### `submit(Callable<T> task)`

**Parameters:**
- `task` (`java.util.concurrent.Callable<T>`)

**Returns:** `java.util.concurrent.Future<T>`

### `submit(Runnable task)`

**Parameters:**
- `task` (`java.lang.Runnable`)

**Returns:** `java.util.concurrent.Future<?>`

### `submit(Runnable task, T result)`

**Parameters:**
- `task` (`java.lang.Runnable`)
- `result` (`T`)

**Returns:** `java.util.concurrent.Future<T>`

### `invokeAll(Collection<? extends Callable<T>> tasks)`

**Parameters:**
- `tasks` (`java.util.Collection<? extends java.util.concurrent.Callable<T>>`)

**Returns:** `java.util.List<java.util.concurrent.Future<T>>`

### `invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit)`

**Parameters:**
- `tasks` (`java.util.Collection<? extends java.util.concurrent.Callable<T>>`)
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `java.util.List<java.util.concurrent.Future<T>>`

### `invokeAny(Collection<? extends Callable<T>> tasks)`

**Parameters:**
- `tasks` (`java.util.Collection<? extends java.util.concurrent.Callable<T>>`)

**Returns:** `T`

### `invokeAny(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit)`

**Parameters:**
- `tasks` (`java.util.Collection<? extends java.util.concurrent.Callable<T>>`)
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `T`

### `shutdown()`

**Returns:** `void`

### `shutdownNow()`

**Returns:** `java.util.List<java.lang.Runnable>`

### `isShutdown()`

**Returns:** `boolean`

### `isTerminated()`

**Returns:** `boolean`

### `awaitTermination(long timeout, TimeUnit unit)`

**Parameters:**
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `boolean`

