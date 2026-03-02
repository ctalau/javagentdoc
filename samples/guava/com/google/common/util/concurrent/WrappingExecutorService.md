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

### `<init>(java.util.concurrent.ExecutorService delegate)`

**Parameters:**
- `delegate` (`java.util.concurrent.ExecutorService`)

## Methods

### `wrapTask(java.util.concurrent.Callable<T> callable)`

**Returns:** `java.util.concurrent.Callable<T>`

This method is also applied
 to any Runnable passed to the default implementation of #wrapTask(Runnable).

**Parameters:**
- `callable` (`java.util.concurrent.Callable<T>`)

### `wrapTask(java.lang.Runnable command)`

**Returns:** `java.lang.Runnable`

The default implementation
 delegates to #wrapTask(Callable).

**Parameters:**
- `command` (`java.lang.Runnable`)

### `wrapTasks(java.util.Collection<? extends java.util.concurrent.Callable<T>> tasks)`

**Returns:** [`com.google.common.collect.ImmutableList<java.util.concurrent.Callable<T>>`](../../collect/ImmutableList.md)

**Parameters:**
- `tasks` (`java.util.Collection<? extends java.util.concurrent.Callable<T>>`)

### `execute(java.lang.Runnable command)`

**Returns:** `void`

**Parameters:**
- `command` (`java.lang.Runnable`)

### `submit(java.util.concurrent.Callable<T> task)`

**Returns:** `java.util.concurrent.Future<T>`

**Parameters:**
- `task` (`java.util.concurrent.Callable<T>`)

### `submit(java.lang.Runnable task)`

**Returns:** `java.util.concurrent.Future<?>`

**Parameters:**
- `task` (`java.lang.Runnable`)

### `submit(java.lang.Runnable task, T result)`

**Returns:** `java.util.concurrent.Future<T>`

**Parameters:**
- `task` (`java.lang.Runnable`)
- `result` (`T`)

### `invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> tasks)`

**Returns:** `java.util.List<java.util.concurrent.Future<T>>`

**Parameters:**
- `tasks` (`java.util.Collection<? extends java.util.concurrent.Callable<T>>`)

### `invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> tasks, long timeout, java.util.concurrent.TimeUnit unit)`

**Returns:** `java.util.List<java.util.concurrent.Future<T>>`

**Parameters:**
- `tasks` (`java.util.Collection<? extends java.util.concurrent.Callable<T>>`)
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> tasks)`

**Returns:** `T`

**Parameters:**
- `tasks` (`java.util.Collection<? extends java.util.concurrent.Callable<T>>`)

### `invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> tasks, long timeout, java.util.concurrent.TimeUnit unit)`

**Returns:** `T`

**Parameters:**
- `tasks` (`java.util.Collection<? extends java.util.concurrent.Callable<T>>`)
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `shutdown()`

**Returns:** `void`

### `shutdownNow()`

**Returns:** `java.util.List<java.lang.Runnable>`

### `isShutdown()`

**Returns:** `boolean`

### `isTerminated()`

**Returns:** `boolean`

### `awaitTermination(long timeout, java.util.concurrent.TimeUnit unit)`

**Returns:** `boolean`

**Parameters:**
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

