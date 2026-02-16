# Class: `ForwardingListeningExecutorService`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ForwardingListeningExecutorService`

**Extends:** [`com.google.common.util.concurrent.ForwardingExecutorService`](./ForwardingExecutorService.md)

**Implements:** [`com.google.common.util.concurrent.ListeningExecutorService`](./ListeningExecutorService.md)

## Description

A listening executor service which forwards all its method calls to another listening executor
 service. Subclasses should override one or more methods to modify the behavior of the backing
 executor service as desired per the <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.

 <p><b>`default` method warning:</b> This class does <i>not</i> forward calls to `default` methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the `ForwardingListeningExecutorService`.
**Author:** Isaac Shum
**Since:** 10.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `delegate()`

**Returns:** [`com.google.common.util.concurrent.ListeningExecutorService`](./ListeningExecutorService.md)

### `submit(`java.util.concurrent.Callable<T>` task)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<T>`](./ListenableFuture.md)

### `submit(`java.lang.Runnable` task)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<?>`](./ListenableFuture.md)

### `submit(`java.lang.Runnable` task, `T` result)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<T>`](./ListenableFuture.md)

