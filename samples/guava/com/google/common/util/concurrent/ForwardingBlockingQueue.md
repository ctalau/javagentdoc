# Class: `ForwardingBlockingQueue`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ForwardingBlockingQueue`

**Extends:** [`com.google.common.collect.ForwardingQueue<E>`](../../collect/ForwardingQueue.md)

**Implements:** [`java.util.concurrent.BlockingQueue<E>`](../../../../../java/util/concurrent/BlockingQueue.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

A {@link BlockingQueue} which forwards all its method calls to another {@link BlockingQueue}.
 Subclasses should override one or more methods to modify the behavior of the backing collection
 as desired per the <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator
 pattern</a>.

 <p><b>{@code default} method warning:</b> This class does <i>not</i> forward calls to {@code
 default} methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the {@code ForwardingBlockingQueue}.
@author Raimundo Mirisola
@param <E> the type of elements held in this collection
@since 4.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `delegate()`

**Returns:** [`java.util.concurrent.BlockingQueue<E>`](../../../../../java/util/concurrent/BlockingQueue.md)

### `drainTo([`java.util.Collection<? super E>`](../../../../../java/util/Collection.md) c, `int` maxElements)`

**Returns:** `int`

### `drainTo([`java.util.Collection<? super E>`](../../../../../java/util/Collection.md) c)`

**Returns:** `int`

### `offer([`E`](E.md) e, `long` timeout, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** `boolean`

### `poll(`long` timeout, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** [`E`](E.md)

### `put([`E`](E.md) e)`

**Returns:** `void`

### `remainingCapacity()`

**Returns:** `int`

### `take()`

**Returns:** [`E`](E.md)

