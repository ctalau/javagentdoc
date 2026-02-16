# Class: `ForwardingNavigableMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingNavigableMap`

**Extends:** [`com.google.common.collect.ForwardingSortedMap<K,V>`](./ForwardingSortedMap.md)

**Implements:** `java.util.NavigableMap<K,V>`

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A navigable map which forwards all its method calls to another navigable map. Subclasses should
 override one or more methods to modify the behavior of the backing map as desired per the <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.

 <p><b>Warning:</b> The methods of `ForwardingNavigableMap` forward <i>indiscriminately</i>
 to the methods of the delegate. For example, overriding `put` alone <i>will not</i> change
 the behavior of `putAll`, which can lead to unexpected behavior. In this case, you should
 override `putAll` as well, either providing your own implementation, or delegating to the
 provided `standardPutAll` method.

 <p><b>`default` method warning:</b> This class does <i>not</i> forward calls to `default` methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the `ForwardingNavigableMap`.

 <p>Each of the `standard` methods uses the map's comparator (or the natural ordering of the
 elements, if there is no comparator) to test element equality. As a result, if the comparator is
 not consistent with equals, some of the standard implementations may violate the `Map`
 contract.

 <p>The `standard` methods and the collection views they return are not guaranteed to be
 thread-safe, even when all of the methods that they depend on are thread-safe.
**Author:** Louis Wasserman
**Since:** 12.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `delegate()`

**Returns:** `java.util.NavigableMap<K,V>`

### `lowerEntry(`K` key)`

**Returns:** `java.util.Map.Entry<K,V>`

### `standardLowerEntry(`K` key)`

**Returns:** `java.util.Map.Entry<K,V>`

A sensible definition of `lowerEntry` in terms of the `lastEntry()` of `headMap(Object, boolean)`. If you override `headMap`, you may wish to override `lowerEntry` to forward to this implementation.

### `lowerKey(`K` key)`

**Returns:** `K`

### `standardLowerKey(`K` key)`

**Returns:** `K`

A sensible definition of `lowerKey` in terms of `lowerEntry`. If you override
 `lowerEntry`, you may wish to override `lowerKey` to forward to this
 implementation.

### `floorEntry(`K` key)`

**Returns:** `java.util.Map.Entry<K,V>`

### `standardFloorEntry(`K` key)`

**Returns:** `java.util.Map.Entry<K,V>`

A sensible definition of `floorEntry` in terms of the `lastEntry()` of `headMap(Object, boolean)`. If you override `headMap`, you may wish to override `floorEntry` to forward to this implementation.

### `floorKey(`K` key)`

**Returns:** `K`

### `standardFloorKey(`K` key)`

**Returns:** `K`

A sensible definition of `floorKey` in terms of `floorEntry`. If you override
 `floorEntry`, you may wish to override `floorKey` to forward to this
 implementation.

### `ceilingEntry(`K` key)`

**Returns:** `java.util.Map.Entry<K,V>`

### `standardCeilingEntry(`K` key)`

**Returns:** `java.util.Map.Entry<K,V>`

A sensible definition of `ceilingEntry` in terms of the `firstEntry()` of `tailMap(Object, boolean)`. If you override `tailMap`, you may wish to override `ceilingEntry` to forward to this implementation.

### `ceilingKey(`K` key)`

**Returns:** `K`

### `standardCeilingKey(`K` key)`

**Returns:** `K`

A sensible definition of `ceilingKey` in terms of `ceilingEntry`. If you override
 `ceilingEntry`, you may wish to override `ceilingKey` to forward to this
 implementation.

### `higherEntry(`K` key)`

**Returns:** `java.util.Map.Entry<K,V>`

### `standardHigherEntry(`K` key)`

**Returns:** `java.util.Map.Entry<K,V>`

A sensible definition of `higherEntry` in terms of the `firstEntry()` of `tailMap(Object, boolean)`. If you override `tailMap`, you may wish to override `higherEntry` to forward to this implementation.

### `higherKey(`K` key)`

**Returns:** `K`

### `standardHigherKey(`K` key)`

**Returns:** `K`

A sensible definition of `higherKey` in terms of `higherEntry`. If you override
 `higherEntry`, you may wish to override `higherKey` to forward to this
 implementation.

### `firstEntry()`

**Returns:** `java.util.Map.Entry<K,V>`

### `standardFirstEntry()`

**Returns:** `java.util.Map.Entry<K,V>`

A sensible definition of `firstEntry` in terms of the `iterator()` of `entrySet`. If you override `entrySet`, you may wish to override `firstEntry` to
 forward to this implementation.

### `standardFirstKey()`

**Returns:** `K`

A sensible definition of `firstKey` in terms of `firstEntry`. If you override
 `firstEntry`, you may wish to override `firstKey` to forward to this
 implementation.

### `lastEntry()`

**Returns:** `java.util.Map.Entry<K,V>`

### `standardLastEntry()`

**Returns:** `java.util.Map.Entry<K,V>`

A sensible definition of `lastEntry` in terms of the `iterator()` of the `entrySet` of `descendingMap`. If you override `descendingMap`, you may wish to
 override `lastEntry` to forward to this implementation.

### `standardLastKey()`

**Returns:** `K`

A sensible definition of `lastKey` in terms of `lastEntry`. If you override `lastEntry`, you may wish to override `lastKey` to forward to this implementation.

### `pollFirstEntry()`

**Returns:** `java.util.Map.Entry<K,V>`

### `standardPollFirstEntry()`

**Returns:** `java.util.Map.Entry<K,V>`

A sensible definition of `pollFirstEntry` in terms of the `iterator` of `entrySet`. If you override `entrySet`, you may wish to override `pollFirstEntry` to
 forward to this implementation.

### `pollLastEntry()`

**Returns:** `java.util.Map.Entry<K,V>`

### `standardPollLastEntry()`

**Returns:** `java.util.Map.Entry<K,V>`

A sensible definition of `pollFirstEntry` in terms of the `iterator` of the `entrySet` of `descendingMap`. If you override `descendingMap`, you may wish to
 override `pollFirstEntry` to forward to this implementation.

### `descendingMap()`

**Returns:** `java.util.NavigableMap<K,V>`

### `navigableKeySet()`

**Returns:** `java.util.NavigableSet<K>`

### `descendingKeySet()`

**Returns:** `java.util.NavigableSet<K>`

### `standardDescendingKeySet()`

**Returns:** `java.util.NavigableSet<K>`

A sensible definition of `descendingKeySet` as the `navigableKeySet` of `descendingMap`. (The `StandardDescendingMap` implementation implements `navigableKeySet` on its own, so as not to cause an infinite loop.) If you override `descendingMap`, you may wish to override `descendingKeySet` to forward to this
 implementation.

### `standardSubMap(`K` fromKey, `K` toKey)`

**Returns:** `java.util.SortedMap<K,V>`

A sensible definition of `subMap(Object, Object)` in terms of `subMap(Object,
 boolean, Object, boolean)`. If you override `subMap(K, boolean, K, boolean)`, you may
 wish to override `subMap` to forward to this implementation.

### `subMap(`K` fromKey, `boolean` fromInclusive, `K` toKey, `boolean` toInclusive)`

**Returns:** `java.util.NavigableMap<K,V>`

### `headMap(`K` toKey, `boolean` inclusive)`

**Returns:** `java.util.NavigableMap<K,V>`

### `tailMap(`K` fromKey, `boolean` inclusive)`

**Returns:** `java.util.NavigableMap<K,V>`

### `standardHeadMap(`K` toKey)`

**Returns:** `java.util.SortedMap<K,V>`

A sensible definition of `headMap(Object)` in terms of `headMap(Object,
 boolean)`. If you override `headMap(K, boolean)`, you may wish to override `headMap` to forward to this implementation.

### `standardTailMap(`K` fromKey)`

**Returns:** `java.util.SortedMap<K,V>`

A sensible definition of `tailMap(Object)` in terms of `tailMap(Object,
 boolean)`. If you override `tailMap(K, boolean)`, you may wish to override `tailMap` to forward to this implementation.

