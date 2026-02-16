# Class: `ForwardingDeque`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingDeque`

**Extends:** [`com.google.common.collect.ForwardingQueue<E>`](./ForwardingQueue.md)

**Implements:** `java.util.Deque<E>`

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A deque which forwards all its method calls to another deque. Subclasses should override one or
 more methods to modify the behavior of the backing deque as desired per the <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.

 <p><b>Warning:</b> The methods of `ForwardingDeque` forward <b>indiscriminately</b> to the
 methods of the delegate. For example, overriding `add` alone <b>will not</b> change the
 behavior of `offer` which can lead to unexpected behavior. In this case, you should
 override `offer` as well.

 <p><b>`default` method warning:</b> This class does <i>not</i> forward calls to `default` methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the `ForwardingDeque`.
**Author:** Kurt Alfred Kluever
**Since:** 12.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `delegate()`

**Returns:** `java.util.Deque<E>`

### `addFirst(`E` e)`

**Returns:** `void`

### `addLast(`E` e)`

**Returns:** `void`

### `descendingIterator()`

**Returns:** `java.util.Iterator<E>`

### `getFirst()`

**Returns:** `E`

### `getLast()`

**Returns:** `E`

### `offerFirst(`E` e)`

**Returns:** `boolean`

### `offerLast(`E` e)`

**Returns:** `boolean`

### `peekFirst()`

**Returns:** `E`

### `peekLast()`

**Returns:** `E`

### `pollFirst()`

**Returns:** `E`

### `pollLast()`

**Returns:** `E`

### `pop()`

**Returns:** `E`

### `push(`E` e)`

**Returns:** `void`

### `removeFirst()`

**Returns:** `E`

### `removeLast()`

**Returns:** `E`

### `removeFirstOccurrence(`java.lang.Object` o)`

**Returns:** `boolean`

### `removeLastOccurrence(`java.lang.Object` o)`

**Returns:** `boolean`

