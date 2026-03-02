# Class: `MapMakerInternalMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.MapMakerInternalMap`

**Extends:** `java.util.AbstractMap<K,V>`

**Implements:** `java.util.concurrent.ConcurrentMap<K,V>`, `java.io.Serializable`

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`
- `E` extends `com.google.common.collect.MapMakerInternalMap.InternalEntry<K,V,E>`
- `S` extends `com.google.common.collect.MapMakerInternalMap.Segment<K,V,E,S>`

## Description

This implementation is heavily derived from revision 1.96 of [ConcurrentHashMap.java](http://tinyurl.com/ConcurrentHashMap).

## Fields

### `MAXIMUM_CAPACITY`

**Type:** `int`

MUST be a power of two no greater than 1<<30 to ensure
 that entries are indexable using ints.

### `MAX_SEGMENTS`

**Type:** `int`

### `CONTAINS_VALUE_RETRIES`

**Type:** `int`

### `DRAIN_THRESHOLD`

**Type:** `int`

This is used to avoid lock contention by recording a memento
 of reads and delaying a lock acquisition until the threshold is crossed or a mutation occurs.

 
This must be a (2^n)-1 as it is used as a mask.

### `DRAIN_MAX`

**Type:** `int`

This applies independently to
 the cleanup queue and both reference queues.

### `segmentMask`

**Type:** `int`

The upper bits of a key's hash code are used to choose
 the segment.

### `segmentShift`

**Type:** `int`

Helps prevent entries that end up in the same segment
 from also ending up in the same bucket.

### `segments`

**Type:** `com.google.common.collect.MapMakerInternalMap.Segment<K,V,E,S>[]`

### `concurrencyLevel`

**Type:** `int`

### `keyEquivalence`

**Type:** [`com.google.common.base.Equivalence<java.lang.Object>`](../base/Equivalence.md)

### `entryHelper`

**Type:** `com.google.common.collect.MapMakerInternalMap.InternalEntryHelper<K,V,E,S>`

### `UNSET_WEAK_VALUE_REFERENCE`

**Type:** `com.google.common.collect.MapMakerInternalMap.WeakValueReference<java.lang.Object,java.lang.Object,com.google.common.collect.MapMakerInternalMap.DummyInternalEntry>`

### `keySet`

**Type:** `java.util.Set<K>`

### `values`

**Type:** `java.util.Collection<V>`

### `entrySet`

**Type:** `java.util.Set<java.util.Map.Entry<K,V>>`

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(MapMaker builder, MapMakerInternalMap.InternalEntryHelper<K,V,E,S> entryHelper)`

**Parameters:**
- `builder` ([`com.google.common.collect.MapMaker`](./MapMaker.md))
- `entryHelper` (`com.google.common.collect.MapMakerInternalMap.InternalEntryHelper<K,V,E,S>`)

## Methods

### `create(MapMaker builder)`

**Parameters:**
- `builder` ([`com.google.common.collect.MapMaker`](./MapMaker.md))

**Returns:** [`com.google.common.collect.MapMakerInternalMap<K,V,? extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K,V,?>,?>`](./MapMakerInternalMap.md)

### `createWithDummyValues(MapMaker builder)`

The returned MapMakerInternalMap will be
 optimized to saved memory. Since MapMaker.Dummy is a singleton, we don't need to store
 any values at all. Because of this optimization, build.getValueStrength() must be
 Strength#STRONG.

 
This method is intended to only be used by the internal implementation of Interners,
 since a map of dummy values is the exact use case there.

**Parameters:**
- `builder` ([`com.google.common.collect.MapMaker`](./MapMaker.md))

**Returns:** [`com.google.common.collect.MapMakerInternalMap<K,com.google.common.collect.MapMaker.Dummy,? extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K,com.google.common.collect.MapMaker.Dummy,?>,?>`](./MapMakerInternalMap.md)

### `unsetWeakValueReference()`

**Returns:** `com.google.common.collect.MapMakerInternalMap.WeakValueReference<K,V,E>`

### `rehash(int h)`

This is critical when the concurrent hash map uses power-of-two length hash
 tables, that otherwise encounter collisions for hash codes that do not differ in lower or upper
 bits.

**Parameters:**
- `h` (`int`): hash code

**Returns:** `int`

### `copyEntry(E original, E newNext)`

Code should call Segment#copyEntry directly.

**Parameters:**
- `original` (`E`)
- `newNext` (`E`)

**Returns:** `E`

### `hash(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `int`

### `reclaimValue(MapMakerInternalMap.WeakValueReference<K,V,E> valueReference)`

**Parameters:**
- `valueReference` (`com.google.common.collect.MapMakerInternalMap.WeakValueReference<K,V,E>`)

**Returns:** `void`

### `reclaimKey(E entry)`

**Parameters:**
- `entry` (`E`)

**Returns:** `void`

### `isLiveForTesting(MapMakerInternalMap.InternalEntry<K,V,?> entry)`

Code should call Segment#getLiveValue
 instead.

**Parameters:**
- `entry` (`com.google.common.collect.MapMakerInternalMap.InternalEntry<K,V,?>`)

**Returns:** `boolean`

### `segmentFor(int hash)`

**Parameters:**
- `hash` (`int`): the hash code for the key

**Returns:** `com.google.common.collect.MapMakerInternalMap.Segment<K,V,E,S>`

### `createSegment(int initialCapacity)`

**Parameters:**
- `initialCapacity` (`int`)

**Returns:** `com.google.common.collect.MapMakerInternalMap.Segment<K,V,E,S>`

### `getLiveValue(E entry)`

Returns null if the entry is invalid, partially-collected
 or computing.

**Parameters:**
- `entry` (`E`)

**Returns:** `V`

### `newSegmentArray(int ssize)`

**Parameters:**
- `ssize` (`int`)

**Returns:** `com.google.common.collect.MapMakerInternalMap.Segment<K,V,E,S>[]`

### `keyStrength()`

**Returns:** `com.google.common.collect.MapMakerInternalMap.Strength`

### `valueStrength()`

**Returns:** `com.google.common.collect.MapMakerInternalMap.Strength`

### `valueEquivalence()`

**Returns:** [`com.google.common.base.Equivalence<java.lang.Object>`](../base/Equivalence.md)

### `isEmpty()`

**Returns:** `boolean`

### `size()`

**Returns:** `int`

### `get(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `V`

### `getEntry(Object key)`

The entry may be computing or partially
 collected. Does not impact recency ordering.

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `E`

### `containsKey(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `boolean`

### `containsValue(Object value)`

**Parameters:**
- `value` (`java.lang.Object`)

**Returns:** `boolean`

### `put(K key, V value)`

**Parameters:**
- `key` (`K`)
- `value` (`V`)

**Returns:** `V`

### `putIfAbsent(K key, V value)`

**Parameters:**
- `key` (`K`)
- `value` (`V`)

**Returns:** `V`

### `putAll(Map<? extends K,? extends V> m)`

**Parameters:**
- `m` (`java.util.Map<? extends K,? extends V>`)

**Returns:** `void`

### `remove(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `V`

### `remove(Object key, Object value)`

**Parameters:**
- `key` (`java.lang.Object`)
- `value` (`java.lang.Object`)

**Returns:** `boolean`

### `replace(K key, V oldValue, V newValue)`

**Parameters:**
- `key` (`K`)
- `oldValue` (`V`)
- `newValue` (`V`)

**Returns:** `boolean`

### `replace(K key, V value)`

**Parameters:**
- `key` (`K`)
- `value` (`V`)

**Returns:** `V`

### `clear()`

**Returns:** `void`

### `keySet()`

**Returns:** `java.util.Set<K>`

### `values()`

**Returns:** `java.util.Collection<V>`

### `entrySet()`

**Returns:** `java.util.Set<java.util.Map.Entry<K,V>>`

### `toArrayList(Collection<E> c)`

**Parameters:**
- `c` (`java.util.Collection<E>`)

**Returns:** `java.util.ArrayList<E>`

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject(ObjectInputStream in)`

**Parameters:**
- `in` (`java.io.ObjectInputStream`)

**Returns:** `void`

