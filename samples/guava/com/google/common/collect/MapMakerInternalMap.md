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

### `<init>(com.google.common.collect.MapMaker builder, com.google.common.collect.MapMakerInternalMap.InternalEntryHelper<K,V,E,S> entryHelper)`

**Parameters:**
- `builder` ([`com.google.common.collect.MapMaker`](./MapMaker.md))
- `entryHelper` (`com.google.common.collect.MapMakerInternalMap.InternalEntryHelper<K,V,E,S>`)

## Methods

### `create(com.google.common.collect.MapMaker builder)`

**Returns:** [`com.google.common.collect.MapMakerInternalMap<K,V,? extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K,V,?>,?>`](./MapMakerInternalMap.md)

**Parameters:**
- `builder` ([`com.google.common.collect.MapMaker`](./MapMaker.md))

### `createWithDummyValues(com.google.common.collect.MapMaker builder)`

**Returns:** [`com.google.common.collect.MapMakerInternalMap<K,com.google.common.collect.MapMaker.Dummy,? extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K,com.google.common.collect.MapMaker.Dummy,?>,?>`](./MapMakerInternalMap.md)

The returned MapMakerInternalMap will be
 optimized to saved memory. Since MapMaker.Dummy is a singleton, we don't need to store
 any values at all. Because of this optimization, build.getValueStrength() must be
 Strength#STRONG.

 
This method is intended to only be used by the internal implementation of Interners,
 since a map of dummy values is the exact use case there.

**Parameters:**
- `builder` ([`com.google.common.collect.MapMaker`](./MapMaker.md))

### `unsetWeakValueReference()`

**Returns:** `com.google.common.collect.MapMakerInternalMap.WeakValueReference<K,V,E>`

### `rehash(int h)`

**Returns:** `int`

This is critical when the concurrent hash map uses power-of-two length hash
 tables, that otherwise encounter collisions for hash codes that do not differ in lower or upper
 bits.

**Parameters:**
- `h` (`int`): hash code

### `copyEntry(E original, E newNext)`

**Returns:** `E`

Code should call Segment#copyEntry directly.

**Parameters:**
- `original` (`E`)
- `newNext` (`E`)

### `hash(java.lang.Object key)`

**Returns:** `int`

**Parameters:**
- `key` (`java.lang.Object`)

### `reclaimValue(com.google.common.collect.MapMakerInternalMap.WeakValueReference<K,V,E> valueReference)`

**Returns:** `void`

**Parameters:**
- `valueReference` (`com.google.common.collect.MapMakerInternalMap.WeakValueReference<K,V,E>`)

### `reclaimKey(E entry)`

**Returns:** `void`

**Parameters:**
- `entry` (`E`)

### `isLiveForTesting(com.google.common.collect.MapMakerInternalMap.InternalEntry<K,V,?> entry)`

**Returns:** `boolean`

Code should call Segment#getLiveValue
 instead.

**Parameters:**
- `entry` (`com.google.common.collect.MapMakerInternalMap.InternalEntry<K,V,?>`)

### `segmentFor(int hash)`

**Returns:** `com.google.common.collect.MapMakerInternalMap.Segment<K,V,E,S>`

**Parameters:**
- `hash` (`int`): the hash code for the key

### `createSegment(int initialCapacity)`

**Returns:** `com.google.common.collect.MapMakerInternalMap.Segment<K,V,E,S>`

**Parameters:**
- `initialCapacity` (`int`)

### `getLiveValue(E entry)`

**Returns:** `V`

Returns null if the entry is invalid, partially-collected
 or computing.

**Parameters:**
- `entry` (`E`)

### `newSegmentArray(int ssize)`

**Returns:** `com.google.common.collect.MapMakerInternalMap.Segment<K,V,E,S>[]`

**Parameters:**
- `ssize` (`int`)

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

### `get(java.lang.Object key)`

**Returns:** `V`

**Parameters:**
- `key` (`java.lang.Object`)

### `getEntry(java.lang.Object key)`

**Returns:** `E`

The entry may be computing or partially
 collected. Does not impact recency ordering.

**Parameters:**
- `key` (`java.lang.Object`)

### `containsKey(java.lang.Object key)`

**Returns:** `boolean`

**Parameters:**
- `key` (`java.lang.Object`)

### `containsValue(java.lang.Object value)`

**Returns:** `boolean`

**Parameters:**
- `value` (`java.lang.Object`)

### `put(K key, V value)`

**Returns:** `V`

**Parameters:**
- `key` (`K`)
- `value` (`V`)

### `putIfAbsent(K key, V value)`

**Returns:** `V`

**Parameters:**
- `key` (`K`)
- `value` (`V`)

### `putAll(java.util.Map<? extends K,? extends V> m)`

**Returns:** `void`

**Parameters:**
- `m` (`java.util.Map<? extends K,? extends V>`)

### `remove(java.lang.Object key)`

**Returns:** `V`

**Parameters:**
- `key` (`java.lang.Object`)

### `remove(java.lang.Object key, java.lang.Object value)`

**Returns:** `boolean`

**Parameters:**
- `key` (`java.lang.Object`)
- `value` (`java.lang.Object`)

### `replace(K key, V oldValue, V newValue)`

**Returns:** `boolean`

**Parameters:**
- `key` (`K`)
- `oldValue` (`V`)
- `newValue` (`V`)

### `replace(K key, V value)`

**Returns:** `V`

**Parameters:**
- `key` (`K`)
- `value` (`V`)

### `clear()`

**Returns:** `void`

### `keySet()`

**Returns:** `java.util.Set<K>`

### `values()`

**Returns:** `java.util.Collection<V>`

### `entrySet()`

**Returns:** `java.util.Set<java.util.Map.Entry<K,V>>`

### `toArrayList(java.util.Collection<E> c)`

**Returns:** `java.util.ArrayList<E>`

**Parameters:**
- `c` (`java.util.Collection<E>`)

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject(java.io.ObjectInputStream in)`

**Returns:** `void`

**Parameters:**
- `in` (`java.io.ObjectInputStream`)

