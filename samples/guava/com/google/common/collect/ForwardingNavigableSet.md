# Class: `ForwardingNavigableSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingNavigableSet`

**Extends:** [`com.google.common.collect.ForwardingSortedSet<E>`](./ForwardingSortedSet.md)

**Implements:** `java.util.NavigableSet<E>`

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Subclasses should
 override one or more methods to modify the behavior of the backing set as desired per the [decorator pattern](http://en.wikipedia.org/wiki/Decorator_pattern).

 
**Warning:** The methods of ForwardingNavigableSet forward *indiscriminately*
 to the methods of the delegate. For example, overriding #add alone *will not* change
 the behavior of #addAll, which can lead to unexpected behavior. In this case, you should
 override addAll as well, either providing your own implementation, or delegating to the
 provided standardAddAll method.

 
**default method warning:** This class does *not* forward calls to 
 default methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the ForwardingNavigableSet.

 
Each of the standard methods uses the set's comparator (or the natural ordering of the
 elements, if there is no comparator) to test element equality. As a result, if the comparator is
 not consistent with equals, some of the standard implementations may violate the Set
 contract.

 
The standard methods and the collection views they return are not guaranteed to be
 thread-safe, even when all of the methods that they depend on are thread-safe.

## Constructors

### `<init>()`

## Methods

### `delegate()`

**Returns:** `java.util.NavigableSet<E>`

### `lower(E e)`

**Parameters:**
- `e` (`E`)

**Returns:** `E`

### `standardLower(E e)`

If you override #headSet(Object, boolean), you may
 wish to override #lower to forward to this implementation.

**Parameters:**
- `e` (`E`)

**Returns:** `E`

### `floor(E e)`

**Parameters:**
- `e` (`E`)

**Returns:** `E`

### `standardFloor(E e)`

If you override #headSet(Object, boolean), you may
 wish to override #floor to forward to this implementation.

**Parameters:**
- `e` (`E`)

**Returns:** `E`

### `ceiling(E e)`

**Parameters:**
- `e` (`E`)

**Returns:** `E`

### `standardCeiling(E e)`

If you override #tailSet(Object, boolean), you may wish to
 override #ceiling to forward to this implementation.

**Parameters:**
- `e` (`E`)

**Returns:** `E`

### `higher(E e)`

**Parameters:**
- `e` (`E`)

**Returns:** `E`

### `standardHigher(E e)`

If you override #tailSet(Object, boolean), you may wish to
 override #higher to forward to this implementation.

**Parameters:**
- `e` (`E`)

**Returns:** `E`

### `pollFirst()`

**Returns:** `E`

### `standardPollFirst()`

If you
 override #iterator you may wish to override #pollFirst to forward to this
 implementation.

**Returns:** `E`

### `pollLast()`

**Returns:** `E`

### `standardPollLast()`

If you override #descendingIterator you may wish to override #pollLast to
 forward to this implementation.

**Returns:** `E`

### `standardFirst()`

**Returns:** `E`

### `standardLast()`

**Returns:** `E`

### `descendingSet()`

**Returns:** `java.util.NavigableSet<E>`

### `descendingIterator()`

**Returns:** `java.util.Iterator<E>`

### `subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)`

**Parameters:**
- `fromElement` (`E`)
- `fromInclusive` (`boolean`)
- `toElement` (`E`)
- `toInclusive` (`boolean`)

**Returns:** `java.util.NavigableSet<E>`

### `standardSubSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)`

In many cases, you may wish to override #subSet(Object, boolean, Object, boolean) to forward to this implementation.

**Parameters:**
- `fromElement` (`E`)
- `fromInclusive` (`boolean`)
- `toElement` (`E`)
- `toInclusive` (`boolean`)

**Returns:** `java.util.NavigableSet<E>`

### `standardSubSet(E fromElement, E toElement)`

If you override #subSet(Object, boolean, Object,
 boolean), you may wish to override #subSet(Object, Object) to forward to this
 implementation.

**Parameters:**
- `fromElement` (`E`)
- `toElement` (`E`)

**Returns:** `java.util.SortedSet<E>`

### `headSet(E toElement, boolean inclusive)`

**Parameters:**
- `toElement` (`E`)
- `inclusive` (`boolean`)

**Returns:** `java.util.NavigableSet<E>`

### `standardHeadSet(E toElement)`

If you override #headSet(Object, boolean), you may wish to override
 #headSet(Object) to forward to this implementation.

**Parameters:**
- `toElement` (`E`)

**Returns:** `java.util.SortedSet<E>`

### `tailSet(E fromElement, boolean inclusive)`

**Parameters:**
- `fromElement` (`E`)
- `inclusive` (`boolean`)

**Returns:** `java.util.NavigableSet<E>`

### `standardTailSet(E fromElement)`

If you override #tailSet(Object, boolean), you may wish to override
 #tailSet(Object) to forward to this implementation.

**Parameters:**
- `fromElement` (`E`)

**Returns:** `java.util.SortedSet<E>`

