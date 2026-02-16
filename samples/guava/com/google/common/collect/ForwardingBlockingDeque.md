# Class: `ForwardingBlockingDeque`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingBlockingDeque`

**Extends:** [`com.google.common.collect.ForwardingDeque<E>`](./ForwardingDeque.md)

**Implements:** [`java.util.concurrent.BlockingDeque<E>`](../../../../java/util/concurrent/BlockingDeque.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

A {@link BlockingDeque} which forwards all its method calls to another {@code BlockingDeque}.
 Subclasses should override one or more methods to modify the behavior of the backing deque as
 desired per the <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.

 <p><b>Warning:</b> The methods of {@code ForwardingBlockingDeque} forward <b>indiscriminately</b>
 to the methods of the delegate. For example, overriding {@link #add} alone <b>will not</b> change
 the behaviour of {@link #offer} which can lead to unexpected behaviour. In this case, you should
 override {@code offer} as well, either providing your own implementation, or delegating to the
 provided {@code standardOffer} method.

 <p><b>{@code default} method warning:</b> This class does <i>not</i> forward calls to {@code
 default} methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the {@code ForwardingBlockingDeque}.

 <p>The {@code standard} methods are not guaranteed to be thread-safe, even when all of the
 methods that they depend on are thread-safe.
@author Emily Soldal
@since 14.0
@deprecated This class has moved to {@code com.google.common.util.concurrent}. Please use {@link com.google.common.util.concurrent.ForwardingBlockingDeque} instead.

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `delegate()`

**Returns:** [`java.util.concurrent.BlockingDeque<E>`](../../../../java/util/concurrent/BlockingDeque.md)

### `remainingCapacity()`

**Returns:** `int`

### `putFirst([`E`](E.md) e)`

**Returns:** `void`

### `putLast([`E`](E.md) e)`

**Returns:** `void`

### `offerFirst([`E`](E.md) e, `long` timeout, [`java.util.concurrent.TimeUnit`](../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** `boolean`

### `offerLast([`E`](E.md) e, `long` timeout, [`java.util.concurrent.TimeUnit`](../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** `boolean`

### `takeFirst()`

**Returns:** [`E`](E.md)

### `takeLast()`

**Returns:** [`E`](E.md)

### `pollFirst(`long` timeout, [`java.util.concurrent.TimeUnit`](../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** [`E`](E.md)

### `pollLast(`long` timeout, [`java.util.concurrent.TimeUnit`](../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** [`E`](E.md)

### `put([`E`](E.md) e)`

**Returns:** `void`

### `offer([`E`](E.md) e, `long` timeout, [`java.util.concurrent.TimeUnit`](../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** `boolean`

### `take()`

**Returns:** [`E`](E.md)

### `poll(`long` timeout, [`java.util.concurrent.TimeUnit`](../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** [`E`](E.md)

### `drainTo([`java.util.Collection<? super E>`](../../../../java/util/Collection.md) c)`

**Returns:** `int`

### `drainTo([`java.util.Collection<? super E>`](../../../../java/util/Collection.md) c, `int` maxElements)`

**Returns:** `int`

