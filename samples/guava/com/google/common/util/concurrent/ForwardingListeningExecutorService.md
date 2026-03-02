# Class: `ForwardingListeningExecutorService`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ForwardingListeningExecutorService`

**Extends:** [`com.google.common.util.concurrent.ForwardingExecutorService`](./ForwardingExecutorService.md)

**Implements:** [`com.google.common.util.concurrent.ListeningExecutorService`](./ListeningExecutorService.md)

## Description

Subclasses should override one or more methods to modify the behavior of the backing
 executor service as desired per the [decorator pattern](http://en.wikipedia.org/wiki/Decorator_pattern).

 
**default method warning:** This class does *not* forward calls to 
 default methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the ForwardingListeningExecutorService.

## Constructors

### `<init>()`

## Methods

### `delegate()`

**Returns:** [`com.google.common.util.concurrent.ListeningExecutorService`](./ListeningExecutorService.md)

### `submit(Callable<T> task)`

**Parameters:**
- `task` (`java.util.concurrent.Callable<T>`)

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<T>`](./ListenableFuture.md)

### `submit(Runnable task)`

**Parameters:**
- `task` (`java.lang.Runnable`)

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<?>`](./ListenableFuture.md)

### `submit(Runnable task, T result)`

**Parameters:**
- `task` (`java.lang.Runnable`)
- `result` (`T`)

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<T>`](./ListenableFuture.md)

