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

### `awaitTermination(long timeout, TimeUnit unit)`

**Parameters:**
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `boolean`

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

### `isShutdown()`

**Returns:** `boolean`

### `isTerminated()`

**Returns:** `boolean`

### `shutdown()`

**Returns:** `void`

### `shutdownNow()`

**Returns:** `java.util.List<java.lang.Runnable>`

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

