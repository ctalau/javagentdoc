# Class: `ForwardingQueue`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingQueue`

**Extends:** [`com.google.common.collect.ForwardingCollection<E>`](./ForwardingCollection.md)

**Implements:** `java.util.Queue<E>`

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Subclasses should override one or
 more methods to modify the behavior of the backing queue as desired per the [decorator pattern](http://en.wikipedia.org/wiki/Decorator_pattern).

 
**Warning:** The methods of ForwardingQueue forward **indiscriminately** to the
 methods of the delegate. For example, overriding #add alone **will not** change the
 behavior of #offer which can lead to unexpected behavior. In this case, you should
 override offer as well, either providing your own implementation, or delegating to the
 provided standardOffer method.

 
**default method warning:** This class does *not* forward calls to 
 default methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the ForwardingQueue.

 
The standard methods are not guaranteed to be thread-safe, even when all of the
 methods that they depend on are thread-safe.

## Constructors

### `<init>()`

## Methods

### `delegate()`

**Returns:** `java.util.Queue<E>`

### `offer(E o)`

**Parameters:**
- `o` (`E`)

**Returns:** `boolean`

### `poll()`

**Returns:** `E`

### `remove()`

**Returns:** `E`

### `peek()`

**Returns:** `E`

### `element()`

**Returns:** `E`

### `standardOffer(E e)`

If you override #add,
 you may wish to override #offer to forward to this implementation.

**Parameters:**
- `e` (`E`)

**Returns:** `boolean`

### `standardPeek()`

If you override #element, you may wish to override #peek to forward to this implementation.

**Returns:** `E`

### `standardPoll()`

If you override #remove, you may wish to override #poll to forward to this implementation.

**Returns:** `E`

