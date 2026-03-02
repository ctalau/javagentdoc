# Class: `ForwardingList`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingList`

**Extends:** [`com.google.common.collect.ForwardingCollection<E>`](./ForwardingCollection.md)

**Implements:** `java.util.List<E>`

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Subclasses should override one or
 more methods to modify the behavior of the backing list as desired per the [decorator pattern](http://en.wikipedia.org/wiki/Decorator_pattern).

 
This class does not implement java.util.RandomAccess. If the delegate supports random
 access, the ForwardingList subclass should implement the RandomAccess interface.

 
**Warning:** The methods of ForwardingList forward **indiscriminately** to the
 methods of the delegate. For example, overriding #add alone **will not** change the
 behavior of #addAll, which can lead to unexpected behavior. In this case, you should
 override addAll as well, either providing your own implementation, or delegating to the
 provided standardAddAll method.

 
**default method warning:** This class does *not* forward calls to 
 default methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the ForwardingList.

 
The standard methods and any collection views they return are not guaranteed to be
 thread-safe, even when all of the methods that they depend on are thread-safe.

## Constructors

### `<init>()`

## Methods

### `delegate()`

**Returns:** `java.util.List<E>`

### `add(int index, E element)`

**Returns:** `void`

**Parameters:**
- `index` (`int`)
- `element` (`E`)

### `addAll(int index, java.util.Collection<? extends E> elements)`

**Returns:** `boolean`

**Parameters:**
- `index` (`int`)
- `elements` (`java.util.Collection<? extends E>`)

### `get(int index)`

**Returns:** `E`

**Parameters:**
- `index` (`int`)

### `indexOf(java.lang.Object element)`

**Returns:** `int`

**Parameters:**
- `element` (`java.lang.Object`)

### `lastIndexOf(java.lang.Object element)`

**Returns:** `int`

**Parameters:**
- `element` (`java.lang.Object`)

### `listIterator()`

**Returns:** `java.util.ListIterator<E>`

### `listIterator(int index)`

**Returns:** `java.util.ListIterator<E>`

**Parameters:**
- `index` (`int`)

### `remove(int index)`

**Returns:** `E`

**Parameters:**
- `index` (`int`)

### `set(int index, E element)`

**Returns:** `E`

**Parameters:**
- `index` (`int`)
- `element` (`E`)

### `subList(int fromIndex, int toIndex)`

**Returns:** `java.util.List<E>`

**Parameters:**
- `fromIndex` (`int`)
- `toIndex` (`int`)

### `equals(java.lang.Object object)`

**Returns:** `boolean`

**Parameters:**
- `object` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

### `standardAdd(E element)`

**Returns:** `boolean`

If you override #add(int, Object), you may wish to override #add(Object) to forward to this implementation.

**Parameters:**
- `element` (`E`)

### `standardAddAll(int index, java.lang.Iterable<? extends E> elements)`

**Returns:** `boolean`

If you override #listIterator(int), you may
 wish to override #addAll(int, Collection) to forward to this implementation.

**Parameters:**
- `index` (`int`)
- `elements` (`java.lang.Iterable<? extends E>`)

### `standardIndexOf(java.lang.Object element)`

**Returns:** `int`

If
 you override #listIterator(), you may wish to override #indexOf to forward to
 this implementation.

**Parameters:**
- `element` (`java.lang.Object`)

### `standardLastIndexOf(java.lang.Object element)`

**Returns:** `int`

If you override #listIterator(int), you may wish to override
 #lastIndexOf to forward to this implementation.

**Parameters:**
- `element` (`java.lang.Object`)

### `standardIterator()`

**Returns:** `java.util.Iterator<E>`

If
 you override #listIterator(), you may wish to override #iterator to forward to
 this implementation.

### `standardListIterator()`

**Returns:** `java.util.ListIterator<E>`

If you override #listIterator(int), you may wish to override
 #listIterator() to forward to this implementation.

### `standardListIterator(int start)`

**Returns:** `java.util.ListIterator<E>`

If you override any of these methods, you may wish to override #listIterator(int) to forward to this implementation.

**Parameters:**
- `start` (`int`)

### `standardSubList(int fromIndex, int toIndex)`

**Returns:** `java.util.List<E>`

If you override any other
 methods, you may wish to override #subList(int, int) to forward to this implementation.

**Parameters:**
- `fromIndex` (`int`)
- `toIndex` (`int`)

### `standardEquals(java.lang.Object object)`

**Returns:** `boolean`

If you override either of those methods, you may wish to override #equals(Object) to forward to this implementation.

**Parameters:**
- `object` (`java.lang.Object`)

### `standardHashCode()`

**Returns:** `int`

If you override
 #iterator, you may wish to override #hashCode to forward to this
 implementation.

