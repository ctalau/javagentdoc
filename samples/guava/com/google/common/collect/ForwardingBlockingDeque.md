# Class: `ForwardingBlockingDeque`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingBlockingDeque`

**Extends:** [`com.google.common.collect.ForwardingDeque<E>`](./ForwardingDeque.md)

**Implements:** `java.util.concurrent.BlockingDeque<E>`

## Type Parameters

- `E` extends `java.lang.Object`

## Description

A `BlockingDeque` which forwards all its method calls to another `BlockingDeque`.
 Subclasses should override one or more methods to modify the behavior of the backing deque as
 desired per the <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.

 <p><b>Warning:</b> The methods of `ForwardingBlockingDeque` forward <b>indiscriminately</b>
 to the methods of the delegate. For example, overriding `add` alone <b>will not</b> change
 the behaviour of `offer` which can lead to unexpected behaviour. In this case, you should
 override `offer` as well, either providing your own implementation, or delegating to the
 provided `standardOffer` method.

 <p><b>`default` method warning:</b> This class does <i>not</i> forward calls to `default` methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the `ForwardingBlockingDeque`.

 <p>The `standard` methods are not guaranteed to be thread-safe, even when all of the
 methods that they depend on are thread-safe.
**Author:** Emily Soldal
**Since:** 14.0
**Deprecated:** This class has moved to `com.google.common.util.concurrent`. Please use `com.google.common.util.concurrent.ForwardingBlockingDeque` instead.

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `delegate()`

**Returns:** `java.util.concurrent.BlockingDeque<E>`

### `remainingCapacity()`

**Returns:** `int`

### `putFirst(`E` e)`

**Returns:** `void`

### `putLast(`E` e)`

**Returns:** `void`

### `offerFirst(`E` e, `long` timeout, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `boolean`

### `offerLast(`E` e, `long` timeout, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `boolean`

### `takeFirst()`

**Returns:** `E`

### `takeLast()`

**Returns:** `E`

### `pollFirst(`long` timeout, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `E`

### `pollLast(`long` timeout, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `E`

### `put(`E` e)`

**Returns:** `void`

### `offer(`E` e, `long` timeout, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `boolean`

### `take()`

**Returns:** `E`

### `poll(`long` timeout, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `E`

### `drainTo(`java.util.Collection<? super E>` c)`

**Returns:** `int`

### `drainTo(`java.util.Collection<? super E>` c, `int` maxElements)`

**Returns:** `int`

