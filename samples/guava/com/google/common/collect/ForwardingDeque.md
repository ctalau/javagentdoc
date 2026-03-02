# Class: `ForwardingDeque`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingDeque`

**Extends:** [`com.google.common.collect.ForwardingQueue<E>`](./ForwardingQueue.md)

**Implements:** `java.util.Deque<E>`

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Subclasses should override one or
 more methods to modify the behavior of the backing deque as desired per the [decorator pattern](http://en.wikipedia.org/wiki/Decorator_pattern).

 
**Warning:** The methods of ForwardingDeque forward **indiscriminately** to the
 methods of the delegate. For example, overriding #add alone **will not** change the
 behavior of #offer which can lead to unexpected behavior. In this case, you should
 override offer as well.

 
**default method warning:** This class does *not* forward calls to 
 default methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the ForwardingDeque.

## Constructors

### `<init>()`

## Methods

### `delegate()`

**Returns:** `java.util.Deque<E>`

### `addFirst(E e)`

**Parameters:**
- `e` (`E`)

**Returns:** `void`

### `addLast(E e)`

**Parameters:**
- `e` (`E`)

**Returns:** `void`

### `descendingIterator()`

**Returns:** `java.util.Iterator<E>`

### `getFirst()`

**Returns:** `E`

### `getLast()`

**Returns:** `E`

### `offerFirst(E e)`

**Parameters:**
- `e` (`E`)

**Returns:** `boolean`

### `offerLast(E e)`

**Parameters:**
- `e` (`E`)

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

### `push(E e)`

**Parameters:**
- `e` (`E`)

**Returns:** `void`

### `removeFirst()`

**Returns:** `E`

### `removeLast()`

**Returns:** `E`

### `removeFirstOccurrence(Object o)`

**Parameters:**
- `o` (`java.lang.Object`)

**Returns:** `boolean`

### `removeLastOccurrence(Object o)`

**Parameters:**
- `o` (`java.lang.Object`)

**Returns:** `boolean`

