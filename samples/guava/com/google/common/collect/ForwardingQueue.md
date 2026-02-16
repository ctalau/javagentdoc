# Class: `ForwardingQueue`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingQueue`

**Extends:** [`com.google.common.collect.ForwardingCollection<E>`](./ForwardingCollection.md)

**Implements:** `java.util.Queue<E>`

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A queue which forwards all its method calls to another queue. Subclasses should override one or
 more methods to modify the behavior of the backing queue as desired per the <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.

 <p><b>Warning:</b> The methods of `ForwardingQueue` forward <b>indiscriminately</b> to the
 methods of the delegate. For example, overriding `add` alone <b>will not</b> change the
 behavior of `offer` which can lead to unexpected behavior. In this case, you should
 override `offer` as well, either providing your own implementation, or delegating to the
 provided `standardOffer` method.

 <p><b>`default` method warning:</b> This class does <i>not</i> forward calls to `default` methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the `ForwardingQueue`.

 <p>The `standard` methods are not guaranteed to be thread-safe, even when all of the
 methods that they depend on are thread-safe.
**Author:** Mike Bostock
**Author:** Louis Wasserman
**Since:** 2.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `delegate()`

**Returns:** `java.util.Queue<E>`

### `offer(`E` o)`

**Returns:** `boolean`

### `poll()`

**Returns:** `E`

### `remove()`

**Returns:** `E`

### `peek()`

**Returns:** `E`

### `element()`

**Returns:** `E`

### `standardOffer(`E` e)`

**Returns:** `boolean`

A sensible definition of `offer` in terms of `add`. If you override `add`,
 you may wish to override `offer` to forward to this implementation.
**Since:** 7.0

### `standardPeek()`

**Returns:** `E`

A sensible definition of `peek` in terms of `element`. If you override `element`, you may wish to override `peek` to forward to this implementation.
**Since:** 7.0

### `standardPoll()`

**Returns:** `E`

A sensible definition of `poll` in terms of `remove`. If you override `remove`, you may wish to override `poll` to forward to this implementation.
**Since:** 7.0

