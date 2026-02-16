# Class: `ForwardingQueue`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingQueue`

**Extends:** [`com.google.common.collect.ForwardingCollection<E>`](./ForwardingCollection.md)

**Implements:** [`java.util.Queue<E>`](../../../../java/util/Queue.md)

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A queue which forwards all its method calls to another queue. Subclasses should override one or
 more methods to modify the behavior of the backing queue as desired per the <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.

 <p><b>Warning:</b> The methods of {@code ForwardingQueue} forward <b>indiscriminately</b> to the
 methods of the delegate. For example, overriding {@link #add} alone <b>will not</b> change the
 behavior of {@link #offer} which can lead to unexpected behavior. In this case, you should
 override {@code offer} as well, either providing your own implementation, or delegating to the
 provided {@code standardOffer} method.

 <p><b>{@code default} method warning:</b> This class does <i>not</i> forward calls to {@code
 default} methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the {@code ForwardingQueue}.

 <p>The {@code standard} methods are not guaranteed to be thread-safe, even when all of the
 methods that they depend on are thread-safe.
@author Mike Bostock
@author Louis Wasserman
@since 2.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `delegate()`

**Returns:** [`java.util.Queue<E>`](../../../../java/util/Queue.md)

### `offer([`E`](E.md) o)`

**Returns:** `boolean`

### `poll()`

**Returns:** [`E`](E.md)

### `remove()`

**Returns:** [`E`](E.md)

### `peek()`

**Returns:** [`E`](E.md)

### `element()`

**Returns:** [`E`](E.md)

### `standardOffer([`E`](E.md) e)`

**Returns:** `boolean`

A sensible definition of {@link #offer} in terms of {@link #add}. If you override {@link #add},
 you may wish to override {@link #offer} to forward to this implementation.
@since 7.0

### `standardPeek()`

**Returns:** [`E`](E.md)

A sensible definition of {@link #peek} in terms of {@link #element}. If you override {@link #element}, you may wish to override {@link #peek} to forward to this implementation.
@since 7.0

### `standardPoll()`

**Returns:** [`E`](E.md)

A sensible definition of {@link #poll} in terms of {@link #remove}. If you override {@link #remove}, you may wish to override {@link #poll} to forward to this implementation.
@since 7.0

