# Class: `ForwardingBlockingQueue`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ForwardingBlockingQueue`

**Extends:** [`com.google.common.collect.ForwardingQueue<E>`](../../collect/ForwardingQueue.md)

**Implements:** `java.util.concurrent.BlockingQueue<E>`

## Type Parameters

- `E` extends `java.lang.Object`

## Description

A `BlockingQueue` which forwards all its method calls to another `BlockingQueue`.
 Subclasses should override one or more methods to modify the behavior of the backing collection
 as desired per the <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator
 pattern</a>.

 <p><b>`default` method warning:</b> This class does <i>not</i> forward calls to `default` methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the `ForwardingBlockingQueue`.
**Author:** Raimundo Mirisola
@param <E> the type of elements held in this collection
**Since:** 4.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `delegate()`

**Returns:** `java.util.concurrent.BlockingQueue<E>`

### `drainTo(`java.util.Collection<? super E>` c, `int` maxElements)`

**Returns:** `int`

### `drainTo(`java.util.Collection<? super E>` c)`

**Returns:** `int`

### `offer(`E` e, `long` timeout, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `boolean`

### `poll(`long` timeout, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `E`

### `put(`E` e)`

**Returns:** `void`

### `remainingCapacity()`

**Returns:** `int`

### `take()`

**Returns:** `E`

