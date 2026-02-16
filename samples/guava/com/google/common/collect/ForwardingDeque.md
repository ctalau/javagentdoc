# Class: `ForwardingDeque`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingDeque`

**Extends:** [`com.google.common.collect.ForwardingQueue<E>`](./ForwardingQueue.md)

**Implements:** [`java.util.Deque<E>`](../../../../java/util/Deque.md)

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A deque which forwards all its method calls to another deque. Subclasses should override one or
 more methods to modify the behavior of the backing deque as desired per the <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.

 <p><b>Warning:</b> The methods of {@code ForwardingDeque} forward <b>indiscriminately</b> to the
 methods of the delegate. For example, overriding {@link #add} alone <b>will not</b> change the
 behavior of {@link #offer} which can lead to unexpected behavior. In this case, you should
 override {@code offer} as well.

 <p><b>{@code default} method warning:</b> This class does <i>not</i> forward calls to {@code
 default} methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the {@code ForwardingDeque}.
@author Kurt Alfred Kluever
@since 12.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `delegate()`

**Returns:** [`java.util.Deque<E>`](../../../../java/util/Deque.md)

### `addFirst([`E`](E.md) e)`

**Returns:** `void`

### `addLast([`E`](E.md) e)`

**Returns:** `void`

### `descendingIterator()`

**Returns:** [`java.util.Iterator<E>`](../../../../java/util/Iterator.md)

### `getFirst()`

**Returns:** [`E`](E.md)

### `getLast()`

**Returns:** [`E`](E.md)

### `offerFirst([`E`](E.md) e)`

**Returns:** `boolean`

### `offerLast([`E`](E.md) e)`

**Returns:** `boolean`

### `peekFirst()`

**Returns:** [`E`](E.md)

### `peekLast()`

**Returns:** [`E`](E.md)

### `pollFirst()`

**Returns:** [`E`](E.md)

### `pollLast()`

**Returns:** [`E`](E.md)

### `pop()`

**Returns:** [`E`](E.md)

### `push([`E`](E.md) e)`

**Returns:** `void`

### `removeFirst()`

**Returns:** [`E`](E.md)

### `removeLast()`

**Returns:** [`E`](E.md)

### `removeFirstOccurrence(`java.lang.Object` o)`

**Returns:** `boolean`

### `removeLastOccurrence(`java.lang.Object` o)`

**Returns:** `boolean`

