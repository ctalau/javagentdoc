# Class: `ForwardingNavigableSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingNavigableSet`

**Extends:** [`com.google.common.collect.ForwardingSortedSet<E>`](./ForwardingSortedSet.md)

**Implements:** [`java.util.NavigableSet<E>`](../../../../java/util/NavigableSet.md)

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A navigable set which forwards all its method calls to another navigable set. Subclasses should
 override one or more methods to modify the behavior of the backing set as desired per the <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.

 <p><b>Warning:</b> The methods of {@code ForwardingNavigableSet} forward <i>indiscriminately</i>
 to the methods of the delegate. For example, overriding {@link #add} alone <i>will not</i> change
 the behavior of {@link #addAll}, which can lead to unexpected behavior. In this case, you should
 override {@code addAll} as well, either providing your own implementation, or delegating to the
 provided {@code standardAddAll} method.

 <p><b>{@code default} method warning:</b> This class does <i>not</i> forward calls to {@code
 default} methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the {@code ForwardingNavigableSet}.

 <p>Each of the {@code standard} methods uses the set's comparator (or the natural ordering of the
 elements, if there is no comparator) to test element equality. As a result, if the comparator is
 not consistent with equals, some of the standard implementations may violate the {@code Set}
 contract.

 <p>The {@code standard} methods and the collection views they return are not guaranteed to be
 thread-safe, even when all of the methods that they depend on are thread-safe.
@author Louis Wasserman
@since 12.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `delegate()`

**Returns:** [`java.util.NavigableSet<E>`](../../../../java/util/NavigableSet.md)

### `lower([`E`](E.md) e)`

**Returns:** [`E`](E.md)

### `standardLower([`E`](E.md) e)`

**Returns:** [`E`](E.md)

A sensible definition of {@link #lower} in terms of the {@code descendingIterator} method of
 {@link #headSet(Object, boolean)}. If you override {@link #headSet(Object, boolean)}, you may
 wish to override {@link #lower} to forward to this implementation.

### `floor([`E`](E.md) e)`

**Returns:** [`E`](E.md)

### `standardFloor([`E`](E.md) e)`

**Returns:** [`E`](E.md)

A sensible definition of {@link #floor} in terms of the {@code descendingIterator} method of
 {@link #headSet(Object, boolean)}. If you override {@link #headSet(Object, boolean)}, you may
 wish to override {@link #floor} to forward to this implementation.

### `ceiling([`E`](E.md) e)`

**Returns:** [`E`](E.md)

### `standardCeiling([`E`](E.md) e)`

**Returns:** [`E`](E.md)

A sensible definition of {@link #ceiling} in terms of the {@code iterator} method of {@link #tailSet(Object, boolean)}. If you override {@link #tailSet(Object, boolean)}, you may wish to
 override {@link #ceiling} to forward to this implementation.

### `higher([`E`](E.md) e)`

**Returns:** [`E`](E.md)

### `standardHigher([`E`](E.md) e)`

**Returns:** [`E`](E.md)

A sensible definition of {@link #higher} in terms of the {@code iterator} method of {@link #tailSet(Object, boolean)}. If you override {@link #tailSet(Object, boolean)}, you may wish to
 override {@link #higher} to forward to this implementation.

### `pollFirst()`

**Returns:** [`E`](E.md)

### `standardPollFirst()`

**Returns:** [`E`](E.md)

A sensible definition of {@link #pollFirst} in terms of the {@code iterator} method. If you
 override {@link #iterator} you may wish to override {@link #pollFirst} to forward to this
 implementation.

### `pollLast()`

**Returns:** [`E`](E.md)

### `standardPollLast()`

**Returns:** [`E`](E.md)

A sensible definition of {@link #pollLast} in terms of the {@code descendingIterator} method.
 If you override {@link #descendingIterator} you may wish to override {@link #pollLast} to
 forward to this implementation.

### `standardFirst()`

**Returns:** [`E`](E.md)

### `standardLast()`

**Returns:** [`E`](E.md)

### `descendingSet()`

**Returns:** [`java.util.NavigableSet<E>`](../../../../java/util/NavigableSet.md)

### `descendingIterator()`

**Returns:** [`java.util.Iterator<E>`](../../../../java/util/Iterator.md)

### `subSet([`E`](E.md) fromElement, `boolean` fromInclusive, [`E`](E.md) toElement, `boolean` toInclusive)`

**Returns:** [`java.util.NavigableSet<E>`](../../../../java/util/NavigableSet.md)

### `standardSubSet([`E`](E.md) fromElement, `boolean` fromInclusive, [`E`](E.md) toElement, `boolean` toInclusive)`

**Returns:** [`java.util.NavigableSet<E>`](../../../../java/util/NavigableSet.md)

A sensible definition of {@link #subSet(Object, boolean, Object, boolean)} in terms of the
 {@code headSet} and {@code tailSet} methods. In many cases, you may wish to override {@link #subSet(Object, boolean, Object, boolean)} to forward to this implementation.

### `standardSubSet([`E`](E.md) fromElement, [`E`](E.md) toElement)`

**Returns:** [`java.util.SortedSet<E>`](../../../../java/util/SortedSet.md)

A sensible definition of {@link #subSet(Object, Object)} in terms of the {@link #subSet(Object,
 boolean, Object, boolean)} method. If you override {@link #subSet(Object, boolean, Object,
 boolean)}, you may wish to override {@link #subSet(Object, Object)} to forward to this
 implementation.

### `headSet([`E`](E.md) toElement, `boolean` inclusive)`

**Returns:** [`java.util.NavigableSet<E>`](../../../../java/util/NavigableSet.md)

### `standardHeadSet([`E`](E.md) toElement)`

**Returns:** [`java.util.SortedSet<E>`](../../../../java/util/SortedSet.md)

A sensible definition of {@link #headSet(Object)} in terms of the {@link #headSet(Object,
 boolean)} method. If you override {@link #headSet(Object, boolean)}, you may wish to override
 {@link #headSet(Object)} to forward to this implementation.

### `tailSet([`E`](E.md) fromElement, `boolean` inclusive)`

**Returns:** [`java.util.NavigableSet<E>`](../../../../java/util/NavigableSet.md)

### `standardTailSet([`E`](E.md) fromElement)`

**Returns:** [`java.util.SortedSet<E>`](../../../../java/util/SortedSet.md)

A sensible definition of {@link #tailSet(Object)} in terms of the {@link #tailSet(Object,
 boolean)} method. If you override {@link #tailSet(Object, boolean)}, you may wish to override
 {@link #tailSet(Object)} to forward to this implementation.

