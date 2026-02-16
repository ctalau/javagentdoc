# Class: `ForwardingNavigableMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingNavigableMap`

**Extends:** [`com.google.common.collect.ForwardingSortedMap<K,V>`](./ForwardingSortedMap.md)

**Implements:** [`java.util.NavigableMap<K,V>`](../../../../java/util/NavigableMap.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A navigable map which forwards all its method calls to another navigable map. Subclasses should
 override one or more methods to modify the behavior of the backing map as desired per the <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.

 <p><b>Warning:</b> The methods of {@code ForwardingNavigableMap} forward <i>indiscriminately</i>
 to the methods of the delegate. For example, overriding {@link #put} alone <i>will not</i> change
 the behavior of {@link #putAll}, which can lead to unexpected behavior. In this case, you should
 override {@code putAll} as well, either providing your own implementation, or delegating to the
 provided {@code standardPutAll} method.

 <p><b>{@code default} method warning:</b> This class does <i>not</i> forward calls to {@code
 default} methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the {@code ForwardingNavigableMap}.

 <p>Each of the {@code standard} methods uses the map's comparator (or the natural ordering of the
 elements, if there is no comparator) to test element equality. As a result, if the comparator is
 not consistent with equals, some of the standard implementations may violate the {@code Map}
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

**Returns:** [`java.util.NavigableMap<K,V>`](../../../../java/util/NavigableMap.md)

### `lowerEntry([`K`](K.md) key)`

**Returns:** [`java.util.Map.Entry<K,V>`](../../../../java/util/Map/Entry.md)

### `standardLowerEntry([`K`](K.md) key)`

**Returns:** [`java.util.Map.Entry<K,V>`](../../../../java/util/Map/Entry.md)

A sensible definition of {@link #lowerEntry} in terms of the {@code lastEntry()} of {@link #headMap(Object, boolean)}. If you override {@code headMap}, you may wish to override {@code
 lowerEntry} to forward to this implementation.

### `lowerKey([`K`](K.md) key)`

**Returns:** [`K`](K.md)

### `standardLowerKey([`K`](K.md) key)`

**Returns:** [`K`](K.md)

A sensible definition of {@link #lowerKey} in terms of {@code lowerEntry}. If you override
 {@link #lowerEntry}, you may wish to override {@code lowerKey} to forward to this
 implementation.

### `floorEntry([`K`](K.md) key)`

**Returns:** [`java.util.Map.Entry<K,V>`](../../../../java/util/Map/Entry.md)

### `standardFloorEntry([`K`](K.md) key)`

**Returns:** [`java.util.Map.Entry<K,V>`](../../../../java/util/Map/Entry.md)

A sensible definition of {@link #floorEntry} in terms of the {@code lastEntry()} of {@link #headMap(Object, boolean)}. If you override {@code headMap}, you may wish to override {@code
 floorEntry} to forward to this implementation.

### `floorKey([`K`](K.md) key)`

**Returns:** [`K`](K.md)

### `standardFloorKey([`K`](K.md) key)`

**Returns:** [`K`](K.md)

A sensible definition of {@link #floorKey} in terms of {@code floorEntry}. If you override
 {@code floorEntry}, you may wish to override {@code floorKey} to forward to this
 implementation.

### `ceilingEntry([`K`](K.md) key)`

**Returns:** [`java.util.Map.Entry<K,V>`](../../../../java/util/Map/Entry.md)

### `standardCeilingEntry([`K`](K.md) key)`

**Returns:** [`java.util.Map.Entry<K,V>`](../../../../java/util/Map/Entry.md)

A sensible definition of {@link #ceilingEntry} in terms of the {@code firstEntry()} of {@link #tailMap(Object, boolean)}. If you override {@code tailMap}, you may wish to override {@code
 ceilingEntry} to forward to this implementation.

### `ceilingKey([`K`](K.md) key)`

**Returns:** [`K`](K.md)

### `standardCeilingKey([`K`](K.md) key)`

**Returns:** [`K`](K.md)

A sensible definition of {@link #ceilingKey} in terms of {@code ceilingEntry}. If you override
 {@code ceilingEntry}, you may wish to override {@code ceilingKey} to forward to this
 implementation.

### `higherEntry([`K`](K.md) key)`

**Returns:** [`java.util.Map.Entry<K,V>`](../../../../java/util/Map/Entry.md)

### `standardHigherEntry([`K`](K.md) key)`

**Returns:** [`java.util.Map.Entry<K,V>`](../../../../java/util/Map/Entry.md)

A sensible definition of {@link #higherEntry} in terms of the {@code firstEntry()} of {@link #tailMap(Object, boolean)}. If you override {@code tailMap}, you may wish to override {@code
 higherEntry} to forward to this implementation.

### `higherKey([`K`](K.md) key)`

**Returns:** [`K`](K.md)

### `standardHigherKey([`K`](K.md) key)`

**Returns:** [`K`](K.md)

A sensible definition of {@link #higherKey} in terms of {@code higherEntry}. If you override
 {@code higherEntry}, you may wish to override {@code higherKey} to forward to this
 implementation.

### `firstEntry()`

**Returns:** [`java.util.Map.Entry<K,V>`](../../../../java/util/Map/Entry.md)

### `standardFirstEntry()`

**Returns:** [`java.util.Map.Entry<K,V>`](../../../../java/util/Map/Entry.md)

A sensible definition of {@link #firstEntry} in terms of the {@code iterator()} of {@link #entrySet}. If you override {@code entrySet}, you may wish to override {@code firstEntry} to
 forward to this implementation.

### `standardFirstKey()`

**Returns:** [`K`](K.md)

A sensible definition of {@link #firstKey} in terms of {@code firstEntry}. If you override
 {@code firstEntry}, you may wish to override {@code firstKey} to forward to this
 implementation.

### `lastEntry()`

**Returns:** [`java.util.Map.Entry<K,V>`](../../../../java/util/Map/Entry.md)

### `standardLastEntry()`

**Returns:** [`java.util.Map.Entry<K,V>`](../../../../java/util/Map/Entry.md)

A sensible definition of {@link #lastEntry} in terms of the {@code iterator()} of the {@link #entrySet} of {@link #descendingMap}. If you override {@code descendingMap}, you may wish to
 override {@code lastEntry} to forward to this implementation.

### `standardLastKey()`

**Returns:** [`K`](K.md)

A sensible definition of {@link #lastKey} in terms of {@code lastEntry}. If you override {@code
 lastEntry}, you may wish to override {@code lastKey} to forward to this implementation.

### `pollFirstEntry()`

**Returns:** [`java.util.Map.Entry<K,V>`](../../../../java/util/Map/Entry.md)

### `standardPollFirstEntry()`

**Returns:** [`java.util.Map.Entry<K,V>`](../../../../java/util/Map/Entry.md)

A sensible definition of {@link #pollFirstEntry} in terms of the {@code iterator} of {@code
 entrySet}. If you override {@code entrySet}, you may wish to override {@code pollFirstEntry} to
 forward to this implementation.

### `pollLastEntry()`

**Returns:** [`java.util.Map.Entry<K,V>`](../../../../java/util/Map/Entry.md)

### `standardPollLastEntry()`

**Returns:** [`java.util.Map.Entry<K,V>`](../../../../java/util/Map/Entry.md)

A sensible definition of {@link #pollFirstEntry} in terms of the {@code iterator} of the {@code
 entrySet} of {@code descendingMap}. If you override {@code descendingMap}, you may wish to
 override {@code pollFirstEntry} to forward to this implementation.

### `descendingMap()`

**Returns:** [`java.util.NavigableMap<K,V>`](../../../../java/util/NavigableMap.md)

### `navigableKeySet()`

**Returns:** [`java.util.NavigableSet<K>`](../../../../java/util/NavigableSet.md)

### `descendingKeySet()`

**Returns:** [`java.util.NavigableSet<K>`](../../../../java/util/NavigableSet.md)

### `standardDescendingKeySet()`

**Returns:** [`java.util.NavigableSet<K>`](../../../../java/util/NavigableSet.md)

A sensible definition of {@link #descendingKeySet} as the {@code navigableKeySet} of {@link #descendingMap}. (The {@link StandardDescendingMap} implementation implements {@code
 navigableKeySet} on its own, so as not to cause an infinite loop.) If you override {@code
 descendingMap}, you may wish to override {@code descendingKeySet} to forward to this
 implementation.

### `standardSubMap([`K`](K.md) fromKey, [`K`](K.md) toKey)`

**Returns:** [`java.util.SortedMap<K,V>`](../../../../java/util/SortedMap.md)

A sensible definition of {@link #subMap(Object, Object)} in terms of {@link #subMap(Object,
 boolean, Object, boolean)}. If you override {@code subMap(K, boolean, K, boolean)}, you may
 wish to override {@code subMap} to forward to this implementation.

### `subMap([`K`](K.md) fromKey, `boolean` fromInclusive, [`K`](K.md) toKey, `boolean` toInclusive)`

**Returns:** [`java.util.NavigableMap<K,V>`](../../../../java/util/NavigableMap.md)

### `headMap([`K`](K.md) toKey, `boolean` inclusive)`

**Returns:** [`java.util.NavigableMap<K,V>`](../../../../java/util/NavigableMap.md)

### `tailMap([`K`](K.md) fromKey, `boolean` inclusive)`

**Returns:** [`java.util.NavigableMap<K,V>`](../../../../java/util/NavigableMap.md)

### `standardHeadMap([`K`](K.md) toKey)`

**Returns:** [`java.util.SortedMap<K,V>`](../../../../java/util/SortedMap.md)

A sensible definition of {@link #headMap(Object)} in terms of {@link #headMap(Object,
 boolean)}. If you override {@code headMap(K, boolean)}, you may wish to override {@code
 headMap} to forward to this implementation.

### `standardTailMap([`K`](K.md) fromKey)`

**Returns:** [`java.util.SortedMap<K,V>`](../../../../java/util/SortedMap.md)

A sensible definition of {@link #tailMap(Object)} in terms of {@link #tailMap(Object,
 boolean)}. If you override {@code tailMap(K, boolean)}, you may wish to override {@code
 tailMap} to forward to this implementation.

