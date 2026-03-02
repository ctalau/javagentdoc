# Class: `ForwardingExecutorService`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ForwardingExecutorService`

**Extends:** [`com.google.common.collect.ForwardingObject`](../../collect/ForwardingObject.md)

**Implements:** `java.util.concurrent.ExecutorService`

## Description

Subclasses
 should override one or more methods to modify the behavior of the backing executor service as
 desired per the [decorator pattern](http://en.wikipedia.org/wiki/Decorator_pattern).

 
**default method warning:** This class does *not* forward calls to 
 default methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the ForwardingExecutorService.

## Constructors

### `<init>()`

## Methods

### `delegate()`

**Returns:** `java.util.concurrent.ExecutorService`

### `awaitTermination(long timeout, java.util.concurrent.TimeUnit unit)`

**Returns:** `boolean`

**Parameters:**
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

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

### `isShutdown()`

**Returns:** `boolean`

### `isTerminated()`

**Returns:** `boolean`

### `shutdown()`

**Returns:** `void`

### `shutdownNow()`

**Returns:** `java.util.List<java.lang.Runnable>`

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

