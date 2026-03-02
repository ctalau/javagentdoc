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

**Parameters:**
- `index` (`int`)
- `element` (`E`)

**Returns:** `void`

### `addAll(int index, Collection<? extends E> elements)`

**Parameters:**
- `index` (`int`)
- `elements` (`java.util.Collection<? extends E>`)

**Returns:** `boolean`

### `get(int index)`

**Parameters:**
- `index` (`int`)

**Returns:** `E`

### `indexOf(Object element)`

**Parameters:**
- `element` (`java.lang.Object`)

**Returns:** `int`

### `lastIndexOf(Object element)`

**Parameters:**
- `element` (`java.lang.Object`)

**Returns:** `int`

### `listIterator()`

**Returns:** `java.util.ListIterator<E>`

### `listIterator(int index)`

**Parameters:**
- `index` (`int`)

**Returns:** `java.util.ListIterator<E>`

### `remove(int index)`

**Parameters:**
- `index` (`int`)

**Returns:** `E`

### `set(int index, E element)`

**Parameters:**
- `index` (`int`)
- `element` (`E`)

**Returns:** `E`

### `subList(int fromIndex, int toIndex)`

**Parameters:**
- `fromIndex` (`int`)
- `toIndex` (`int`)

**Returns:** `java.util.List<E>`

### `equals(Object object)`

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `standardAdd(E element)`

If you override #add(int, Object), you may wish to override #add(Object) to forward to this implementation.

**Parameters:**
- `element` (`E`)

**Returns:** `boolean`

### `standardAddAll(int index, Iterable<? extends E> elements)`

If you override #listIterator(int), you may
 wish to override #addAll(int, Collection) to forward to this implementation.

**Parameters:**
- `index` (`int`)
- `elements` (`java.lang.Iterable<? extends E>`)

**Returns:** `boolean`

### `standardIndexOf(Object element)`

If
 you override #listIterator(), you may wish to override #indexOf to forward to
 this implementation.

**Parameters:**
- `element` (`java.lang.Object`)

**Returns:** `int`

### `standardLastIndexOf(Object element)`

If you override #listIterator(int), you may wish to override
 #lastIndexOf to forward to this implementation.

**Parameters:**
- `element` (`java.lang.Object`)

**Returns:** `int`

### `standardIterator()`

If
 you override #listIterator(), you may wish to override #iterator to forward to
 this implementation.

**Returns:** `java.util.Iterator<E>`

### `standardListIterator()`

If you override #listIterator(int), you may wish to override
 #listIterator() to forward to this implementation.

**Returns:** `java.util.ListIterator<E>`

### `standardListIterator(int start)`

If you override any of these methods, you may wish to override #listIterator(int) to forward to this implementation.

**Parameters:**
- `start` (`int`)

**Returns:** `java.util.ListIterator<E>`

### `standardSubList(int fromIndex, int toIndex)`

If you override any other
 methods, you may wish to override #subList(int, int) to forward to this implementation.

**Parameters:**
- `fromIndex` (`int`)
- `toIndex` (`int`)

**Returns:** `java.util.List<E>`

### `standardEquals(Object object)`

If you override either of those methods, you may wish to override #equals(Object) to forward to this implementation.

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `standardHashCode()`

If you override
 #iterator, you may wish to override #hashCode to forward to this
 implementation.

**Returns:** `int`

