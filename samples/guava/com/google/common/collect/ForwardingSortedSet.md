# Class: `ForwardingSortedSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingSortedSet`

**Extends:** [`com.google.common.collect.ForwardingSet<E>`](./ForwardingSet.md)

**Implements:** [`java.util.SortedSet<E>`](../../../../java/util/SortedSet.md)

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A sorted set which forwards all its method calls to another sorted set. Subclasses should
 override one or more methods to modify the behavior of the backing sorted set as desired per the
 <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.

 <p><b>Warning:</b> The methods of {@code ForwardingSortedSet} forward <i>indiscriminately</i> to
 the methods of the delegate. For example, overriding {@link #add} alone <i>will not</i> change
 the behavior of {@link #addAll}, which can lead to unexpected behavior. In this case, you should
 override {@code addAll} as well, either providing your own implementation, or delegating to the
 provided {@code standardAddAll} method.

 <p><b>{@code default} method warning:</b> This class does <i>not</i> forward calls to {@code
 default} methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the {@code ForwardingSortedSet}.

 <p>Each of the {@code standard} methods, where appropriate, uses the set's comparator (or the
 natural ordering of the elements, if there is no comparator) to test element equality. As a
 result, if the comparator is not consistent with equals, some of the standard implementations may
 violate the {@code Set} contract.

 <p>The {@code standard} methods and the collection views they return are not guaranteed to be
 thread-safe, even when all of the methods that they depend on are thread-safe.
@author Mike Bostock
@author Louis Wasserman
@since 2.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `delegate()`

**Returns:** [`java.util.SortedSet<E>`](../../../../java/util/SortedSet.md)

### `comparator()`

**Returns:** [`java.util.Comparator<? super E>`](../../../../java/util/Comparator.md)

### `first()`

**Returns:** [`E`](E.md)

### `headSet([`E`](E.md) toElement)`

**Returns:** [`java.util.SortedSet<E>`](../../../../java/util/SortedSet.md)

### `last()`

**Returns:** [`E`](E.md)

### `subSet([`E`](E.md) fromElement, [`E`](E.md) toElement)`

**Returns:** [`java.util.SortedSet<E>`](../../../../java/util/SortedSet.md)

### `tailSet([`E`](E.md) fromElement)`

**Returns:** [`java.util.SortedSet<E>`](../../../../java/util/SortedSet.md)

### `standardContains(`java.lang.Object` object)`

**Returns:** `boolean`

A sensible definition of {@link #contains} in terms of the {@code first()} method of {@link #tailSet}. If you override {@link #tailSet}, you may wish to override {@link #contains} to
 forward to this implementation.
@since 7.0

### `standardRemove(`java.lang.Object` object)`

**Returns:** `boolean`

A sensible definition of {@link #remove} in terms of the {@code iterator()} method of {@link #tailSet}. If you override {@link #tailSet}, you may wish to override {@link #remove} to
 forward to this implementation.
@since 7.0

### `standardSubSet([`E`](E.md) fromElement, [`E`](E.md) toElement)`

**Returns:** [`java.util.SortedSet<E>`](../../../../java/util/SortedSet.md)

A sensible default implementation of {@link #subSet(Object, Object)} in terms of {@link #headSet(Object)} and {@link #tailSet(Object)}. In some situations, you may wish to override
 {@link #subSet(Object, Object)} to forward to this implementation.
@since 7.0

