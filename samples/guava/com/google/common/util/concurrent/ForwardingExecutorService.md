# Class: `ForwardingExecutorService`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ForwardingExecutorService`

**Extends:** [`com.google.common.collect.ForwardingObject`](../../collect/ForwardingObject.md)

**Implements:** [`java.util.concurrent.ExecutorService`](../../../../../java/util/concurrent/ExecutorService.md)

## Description

An executor service which forwards all its method calls to another executor service. Subclasses
 should override one or more methods to modify the behavior of the backing executor service as
 desired per the <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.

 <p><b>{@code default} method warning:</b> This class does <i>not</i> forward calls to {@code
 default} methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the {@code ForwardingExecutorService}.
@author Kurt Alfred Kluever
@since 10.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `delegate()`

**Returns:** [`java.util.concurrent.ExecutorService`](../../../../../java/util/concurrent/ExecutorService.md)

### `awaitTermination(`long` timeout, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** `boolean`

### `invokeAll([`java.util.Collection<? extends java.util.concurrent.Callable<T>>`](../../../../../java/util/Collection>.md) tasks)`

**Returns:** [`java.util.List<java.util.concurrent.Future<T>>`](../../../../../java/util/List>.md)

### `invokeAll([`java.util.Collection<? extends java.util.concurrent.Callable<T>>`](../../../../../java/util/Collection>.md) tasks, `long` timeout, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** [`java.util.List<java.util.concurrent.Future<T>>`](../../../../../java/util/List>.md)

### `invokeAny([`java.util.Collection<? extends java.util.concurrent.Callable<T>>`](../../../../../java/util/Collection>.md) tasks)`

**Returns:** [`T`](T.md)

### `invokeAny([`java.util.Collection<? extends java.util.concurrent.Callable<T>>`](../../../../../java/util/Collection>.md) tasks, `long` timeout, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** [`T`](T.md)

### `isShutdown()`

**Returns:** `boolean`

### `isTerminated()`

**Returns:** `boolean`

### `shutdown()`

**Returns:** `void`

### `shutdownNow()`

**Returns:** [`java.util.List<java.lang.Runnable>`](../../../../../java/util/List.md)

### `execute(`java.lang.Runnable` command)`

**Returns:** `void`

### `submit([`java.util.concurrent.Callable<T>`](../../../../../java/util/concurrent/Callable.md) task)`

**Returns:** [`java.util.concurrent.Future<T>`](../../../../../java/util/concurrent/Future.md)

### `submit(`java.lang.Runnable` task)`

**Returns:** [`java.util.concurrent.Future<?>`](../../../../../java/util/concurrent/Future.md)

### `submit(`java.lang.Runnable` task, [`T`](T.md) result)`

**Returns:** [`java.util.concurrent.Future<T>`](../../../../../java/util/concurrent/Future.md)

