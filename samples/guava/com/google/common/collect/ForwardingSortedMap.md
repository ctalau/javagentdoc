# Class: `ForwardingSortedMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingSortedMap`

**Extends:** [`com.google.common.collect.ForwardingMap<K,V>`](./ForwardingMap.md)

**Implements:** [`java.util.SortedMap<K,V>`](../../../../java/util/SortedMap.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A sorted map which forwards all its method calls to another sorted map. Subclasses should
 override one or more methods to modify the behavior of the backing sorted map as desired per the
 <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.

 <p><b>Warning:</b> The methods of {@code ForwardingSortedMap} forward <i>indiscriminately</i> to
 the methods of the delegate. For example, overriding {@link #put} alone <i>will not</i> change
 the behavior of {@link #putAll}, which can lead to unexpected behavior. In this case, you should
 override {@code putAll} as well, either providing your own implementation, or delegating to the
 provided {@code standardPutAll} method.

 <p><b>{@code default} method warning:</b> This class does <i>not</i> forward calls to {@code
 default} methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the {@code ForwardingSortedMap}.

 <p>Each of the {@code standard} methods, where appropriate, use the comparator of the map to test
 equality for both keys and values, unlike {@code ForwardingMap}.

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

**Returns:** [`java.util.SortedMap<K,V>`](../../../../java/util/SortedMap.md)

### `comparator()`

**Returns:** [`java.util.Comparator<? super K>`](../../../../java/util/Comparator.md)

### `firstKey()`

**Returns:** [`K`](K.md)

### `headMap([`K`](K.md) toKey)`

**Returns:** [`java.util.SortedMap<K,V>`](../../../../java/util/SortedMap.md)

### `lastKey()`

**Returns:** [`K`](K.md)

### `subMap([`K`](K.md) fromKey, [`K`](K.md) toKey)`

**Returns:** [`java.util.SortedMap<K,V>`](../../../../java/util/SortedMap.md)

### `tailMap([`K`](K.md) fromKey)`

**Returns:** [`java.util.SortedMap<K,V>`](../../../../java/util/SortedMap.md)

### `unsafeCompare([`java.util.Comparator<?>`](../../../../java/util/Comparator.md) comparator, `java.lang.Object` o1, `java.lang.Object` o2)`

**Returns:** `int`

### `standardContainsKey(`java.lang.Object` key)`

**Returns:** `boolean`

A sensible definition of {@link #containsKey} in terms of the {@code firstKey()} method of
 {@link #tailMap}. If you override {@link #tailMap}, you may wish to override {@link #containsKey} to forward to this implementation.
@since 7.0

### `standardSubMap([`K`](K.md) fromKey, [`K`](K.md) toKey)`

**Returns:** [`java.util.SortedMap<K,V>`](../../../../java/util/SortedMap.md)

A sensible default implementation of {@link #subMap(Object, Object)} in terms of {@link #headMap(Object)} and {@link #tailMap(Object)}. In some situations, you may wish to override
 {@link #subMap(Object, Object)} to forward to this implementation.
@since 7.0

