# Class: `ForwardingCollection`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingCollection`

**Extends:** [`com.google.common.collect.ForwardingObject`](./ForwardingObject.md)

**Implements:** `java.util.Collection<E>`

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Subclasses should
 override one or more methods to modify the behavior of the backing collection as desired per the
 [decorator pattern](http://en.wikipedia.org/wiki/Decorator_pattern).

 
**Warning:** The methods of ForwardingCollection forward **indiscriminately** to
 the methods of the delegate. For example, overriding #add alone **will not** change
 the behavior of #addAll, which can lead to unexpected behavior. In this case, you should
 override addAll as well, either providing your own implementation, or delegating to the
 provided standardAddAll method.

 
**default method warning:** This class does *not* forward calls to 
 default methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the ForwardingCollection.

 
The standard methods are not guaranteed to be thread-safe, even when all of the
 methods that they depend on are thread-safe.

## Constructors

### `<init>()`

## Methods

### `delegate()`

**Returns:** `java.util.Collection<E>`

### `iterator()`

**Returns:** `java.util.Iterator<E>`

### `size()`

**Returns:** `int`

### `removeAll(java.util.Collection<?> collection)`

**Returns:** `boolean`

**Parameters:**
- `collection` (`java.util.Collection<?>`)

### `isEmpty()`

**Returns:** `boolean`

### `contains(java.lang.Object object)`

**Returns:** `boolean`

**Parameters:**
- `object` (`java.lang.Object`)

### `add(E element)`

**Returns:** `boolean`

**Parameters:**
- `element` (`E`)

### `remove(java.lang.Object object)`

**Returns:** `boolean`

**Parameters:**
- `object` (`java.lang.Object`)

### `containsAll(java.util.Collection<?> collection)`

**Returns:** `boolean`

**Parameters:**
- `collection` (`java.util.Collection<?>`)

### `addAll(java.util.Collection<? extends E> collection)`

**Returns:** `boolean`

**Parameters:**
- `collection` (`java.util.Collection<? extends E>`)

### `retainAll(java.util.Collection<?> collection)`

**Returns:** `boolean`

**Parameters:**
- `collection` (`java.util.Collection<?>`)

### `clear()`

**Returns:** `void`

### `toArray()`

**Returns:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`

### `toArray(T[] array)`

**Returns:** `T[]`

**Parameters:**
- `array` (`T[]`)

### `standardContains(java.lang.Object object)`

**Returns:** `boolean`

If you override
 #iterator, you may wish to override #contains to forward to this
 implementation.

**Parameters:**
- `object` (`java.lang.Object`)

### `standardContainsAll(java.util.Collection<?> collection)`

**Returns:** `boolean`

If you override
 #contains, you may wish to override #containsAll to forward to this
 implementation.

**Parameters:**
- `collection` (`java.util.Collection<?>`)

### `standardAddAll(java.util.Collection<? extends E> collection)`

**Returns:** `boolean`

If you override #add, you may wish to override #addAll to forward to this implementation.

**Parameters:**
- `collection` (`java.util.Collection<? extends E>`)

### `standardRemove(java.lang.Object object)`

**Returns:** `boolean`

If you override #iterator, you may wish to override #remove to forward to this implementation.

**Parameters:**
- `object` (`java.lang.Object`)

### `standardRemoveAll(java.util.Collection<?> collection)`

**Returns:** `boolean`

If you override #iterator, you may wish to override #removeAll to forward to this implementation.

**Parameters:**
- `collection` (`java.util.Collection<?>`)

### `standardRetainAll(java.util.Collection<?> collection)`

**Returns:** `boolean`

If you override #iterator, you may wish to override #retainAll to forward to this implementation.

**Parameters:**
- `collection` (`java.util.Collection<?>`)

### `standardClear()`

**Returns:** `void`

If you override #iterator, you may wish to override #clear to forward to this implementation.

### `standardIsEmpty()`

**Returns:** `boolean`

If you override
 #isEmpty, you may wish to override #isEmpty to forward to this implementation.
 Alternately, it may be more efficient to implement isEmpty as size() == 0.

### `standardToString()`

**Returns:** `java.lang.String`

If you override
 #iterator, you may wish to override #toString to forward to this
 implementation.

### `standardToArray()`

**Returns:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`

If you
 override #toArray(Object[]), you may wish to override #toArray to forward to
 this implementation.

### `standardToArray(T[] array)`

**Returns:** `T[]`

If you override either of these methods, you may wish to override #toArray
 to forward to this implementation.

**Parameters:**
- `array` (`T[]`)

