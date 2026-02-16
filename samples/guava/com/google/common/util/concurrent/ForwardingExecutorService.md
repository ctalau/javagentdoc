# Class: `ForwardingExecutorService`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ForwardingExecutorService`

**Extends:** [`com.google.common.collect.ForwardingObject`](../../collect/ForwardingObject.md)

**Implements:** `java.util.concurrent.ExecutorService`

## Description

An executor service which forwards all its method calls to another executor service. Subclasses
 should override one or more methods to modify the behavior of the backing executor service as
 desired per the <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.

 <p><b>`default` method warning:</b> This class does <i>not</i> forward calls to `default` methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the `ForwardingExecutorService`.
**Author:** Kurt Alfred Kluever
**Since:** 10.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `delegate()`

**Returns:** `java.util.concurrent.ExecutorService`

### `awaitTermination(`long` timeout, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `boolean`

### `invokeAll(`java.util.Collection<? extends java.util.concurrent.Callable<T>>` tasks)`

**Returns:** `java.util.List<java.util.concurrent.Future<T>>`

### `invokeAll(`java.util.Collection<? extends java.util.concurrent.Callable<T>>` tasks, `long` timeout, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `java.util.List<java.util.concurrent.Future<T>>`

### `invokeAny(`java.util.Collection<? extends java.util.concurrent.Callable<T>>` tasks)`

**Returns:** `T`

### `invokeAny(`java.util.Collection<? extends java.util.concurrent.Callable<T>>` tasks, `long` timeout, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `T`

### `isShutdown()`

**Returns:** `boolean`

### `isTerminated()`

**Returns:** `boolean`

### `shutdown()`

**Returns:** `void`

### `shutdownNow()`

**Returns:** `java.util.List<java.lang.Runnable>`

### `execute(`java.lang.Runnable` command)`

**Returns:** `void`

### `submit(`java.util.concurrent.Callable<T>` task)`

**Returns:** `java.util.concurrent.Future<T>`

### `submit(`java.lang.Runnable` task)`

**Returns:** `java.util.concurrent.Future<?>`

### `submit(`java.lang.Runnable` task, `T` result)`

**Returns:** `java.util.concurrent.Future<T>`

