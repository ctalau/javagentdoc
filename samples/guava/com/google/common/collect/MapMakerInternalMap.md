# Class: `MapMakerInternalMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.MapMakerInternalMap`

**Extends:** [`java.util.AbstractMap<K,V>`](../../../../java/util/AbstractMap.md)

**Implements:** [`java.util.concurrent.ConcurrentMap<K,V>`](../../../../java/util/concurrent/ConcurrentMap.md), [`java.io.Serializable`](../../../../java/io/Serializable.md)

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`
- `E` extends `com.google.common.collect.MapMakerInternalMap.InternalEntry<K,V,E>`
- `S` extends `com.google.common.collect.MapMakerInternalMap.Segment<K,V,E,S>`

## Description

The concurrent hash map implementation built by {@link MapMaker}.

 <p>This implementation is heavily derived from revision 1.96 of <a href="http://tinyurl.com/ConcurrentHashMap">ConcurrentHashMap.java</a>.
@param <K> the type of the keys in the map
@param <V> the type of the values in the map
@param <E> the type of the {@link InternalEntry} entry implementation used internally
@param <S> the type of the {@link Segment} entry implementation used internally
@author Bob Lee
@author Charles Fry
@author Doug Lea ({@code ConcurrentHashMap})

## Fields

### `MAXIMUM_CAPACITY`

**Type:** `int`

The maximum capacity, used if a higher value is implicitly specified by either of the
 constructors with arguments. MUST be a power of two no greater than {@code 1<<30} to ensure
 that entries are indexable using ints.

### `MAX_SEGMENTS`

**Type:** `int`

The maximum number of segments to allow; used to bound constructor arguments.

### `CONTAINS_VALUE_RETRIES`

**Type:** `int`

Number of (unsynchronized) retries in the containsValue method.

### `DRAIN_THRESHOLD`

**Type:** `int`

Number of cache access operations that can be buffered per segment before the cache's recency
 ordering information is updated. This is used to avoid lock contention by recording a memento
 of reads and delaying a lock acquisition until the threshold is crossed or a mutation occurs.

 <p>This must be a (2^n)-1 as it is used as a mask.

### `DRAIN_MAX`

**Type:** `int`

Maximum number of entries to be drained in a single cleanup run. This applies independently to
 the cleanup queue and both reference queues.

### `segmentMask`

**Type:** `int`

Mask value for indexing into segments. The upper bits of a key's hash code are used to choose
 the segment.

### `segmentShift`

**Type:** `int`

Shift value for indexing within segments. Helps prevent entries that end up in the same segment
 from also ending up in the same bucket.

### `segments`

**Type:** [`com.google.common.collect.MapMakerInternalMap.Segment<K,V,E,S>[]`](MapMakerInternalMap/Segment.md)

The segments, each of which is a specialized hash table.

### `concurrencyLevel`

**Type:** `int`

The concurrency level.

### `keyEquivalence`

**Type:** [`com.google.common.base.Equivalence<java.lang.Object>`](../base/Equivalence.md)

Strategy for comparing keys.

### `entryHelper`

**Type:** [`com.google.common.collect.MapMakerInternalMap.InternalEntryHelper<K,V,E,S>`](MapMakerInternalMap/InternalEntryHelper.md)

Strategy for handling entries and segments in a type-safe and efficient manner.

### `UNSET_WEAK_VALUE_REFERENCE`

**Type:** [`com.google.common.collect.MapMakerInternalMap.WeakValueReference<java.lang.Object,java.lang.Object,com.google.common.collect.MapMakerInternalMap.DummyInternalEntry>`](MapMakerInternalMap/WeakValueReference.md)

A singleton {@link WeakValueReference} used to denote an unset value in an entry with weak
 values.

### `keySet`

**Type:** [`java.util.Set<K>`](../../../../java/util/Set.md)

### `values`

**Type:** [`java.util.Collection<V>`](../../../../java/util/Collection.md)

### `entrySet`

**Type:** [`java.util.Set<java.util.Map.Entry<K,V>>`](../../../../java/util/Set>.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>([`com.google.common.collect.MapMaker`](./MapMaker.md) builder, [`com.google.common.collect.MapMakerInternalMap.InternalEntryHelper<K,V,E,S>`](MapMakerInternalMap/InternalEntryHelper.md) entryHelper)`

Creates a new, empty map with the specified strategy, initial capacity and concurrency level.

## Methods

### `create([`com.google.common.collect.MapMaker`](./MapMaker.md) builder)`

**Returns:** [`com.google.common.collect.MapMakerInternalMap<K,V,? extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K,V,?>,?>`](./MapMakerInternalMap,?>.md)

Returns a fresh {@link MapMakerInternalMap} as specified by the given {@code builder}.

### `createWithDummyValues([`com.google.common.collect.MapMaker`](./MapMaker.md) builder)`

**Returns:** [`com.google.common.collect.MapMakerInternalMap<K,com.google.common.collect.MapMaker.Dummy,? extends com.google.common.collect.MapMakerInternalMap.InternalEntry<K,com.google.common.collect.MapMaker.Dummy,?>,?>`](./MapMakerInternalMap,?>.md)

Returns a fresh {@link MapMakerInternalMap} with {@link MapMaker.Dummy} values but otherwise as
 specified by the given {@code builder}. The returned {@link MapMakerInternalMap} will be
 optimized to saved memory. Since {@link MapMaker.Dummy} is a singleton, we don't need to store
 any values at all. Because of this optimization, {@code build.getValueStrength()} must be
 {@link Strength#STRONG}.

 <p>This method is intended to only be used by the internal implementation of {@link Interners},
 since a map of dummy values is the exact use case there.

### `unsetWeakValueReference()`

**Returns:** [`com.google.common.collect.MapMakerInternalMap.WeakValueReference<K,V,E>`](MapMakerInternalMap/WeakValueReference.md)

### `rehash(`int` h)`

**Returns:** `int`

Applies a supplemental hash function to a given hash code, which defends against poor quality
 hash functions. This is critical when the concurrent hash map uses power-of-two length hash
 tables, that otherwise encounter collisions for hash codes that do not differ in lower or upper
 bits.
@param h hash code

### `copyEntry([`E`](E.md) original, [`E`](E.md) newNext)`

**Returns:** [`E`](E.md)

This method is a convenience for testing. Code should call {@link Segment#copyEntry} directly.

### `hash(`java.lang.Object` key)`

**Returns:** `int`

### `reclaimValue([`com.google.common.collect.MapMakerInternalMap.WeakValueReference<K,V,E>`](MapMakerInternalMap/WeakValueReference.md) valueReference)`

**Returns:** `void`

### `reclaimKey([`E`](E.md) entry)`

**Returns:** `void`

### `isLiveForTesting([`com.google.common.collect.MapMakerInternalMap.InternalEntry<K,V,?>`](MapMakerInternalMap/InternalEntry.md) entry)`

**Returns:** `boolean`

This method is a convenience for testing. Code should call {@link Segment#getLiveValue}
 instead.

### `segmentFor(`int` hash)`

**Returns:** [`com.google.common.collect.MapMakerInternalMap.Segment<K,V,E,S>`](MapMakerInternalMap/Segment.md)

Returns the segment that should be used for a key with the given hash.
@param hash the hash code for the key
@return the segment

### `createSegment(`int` initialCapacity)`

**Returns:** [`com.google.common.collect.MapMakerInternalMap.Segment<K,V,E,S>`](MapMakerInternalMap/Segment.md)

### `getLiveValue([`E`](E.md) entry)`

**Returns:** [`V`](V.md)

Gets the value from an entry. Returns {@code null} if the entry is invalid, partially-collected
 or computing.

### `newSegmentArray(`int` ssize)`

**Returns:** [`com.google.common.collect.MapMakerInternalMap.Segment<K,V,E,S>[]`](MapMakerInternalMap/Segment.md)

### `keyStrength()`

**Returns:** [`com.google.common.collect.MapMakerInternalMap.Strength`](MapMakerInternalMap/Strength.md)

### `valueStrength()`

**Returns:** [`com.google.common.collect.MapMakerInternalMap.Strength`](MapMakerInternalMap/Strength.md)

### `valueEquivalence()`

**Returns:** [`com.google.common.base.Equivalence<java.lang.Object>`](../base/Equivalence.md)

### `isEmpty()`

**Returns:** `boolean`

### `size()`

**Returns:** `int`

### `get(`java.lang.Object` key)`

**Returns:** [`V`](V.md)

### `getEntry(`java.lang.Object` key)`

**Returns:** [`E`](E.md)

Returns the internal entry for the specified key. The entry may be computing or partially
 collected. Does not impact recency ordering.

### `containsKey(`java.lang.Object` key)`

**Returns:** `boolean`

### `containsValue(`java.lang.Object` value)`

**Returns:** `boolean`

### `put([`K`](K.md) key, [`V`](V.md) value)`

**Returns:** [`V`](V.md)

### `putIfAbsent([`K`](K.md) key, [`V`](V.md) value)`

**Returns:** [`V`](V.md)

### `putAll([`java.util.Map<? extends K,? extends V>`](../../../../java/util/Map.md) m)`

**Returns:** `void`

### `remove(`java.lang.Object` key)`

**Returns:** [`V`](V.md)

### `remove(`java.lang.Object` key, `java.lang.Object` value)`

**Returns:** `boolean`

### `replace([`K`](K.md) key, [`V`](V.md) oldValue, [`V`](V.md) newValue)`

**Returns:** `boolean`

### `replace([`K`](K.md) key, [`V`](V.md) value)`

**Returns:** [`V`](V.md)

### `clear()`

**Returns:** `void`

### `keySet()`

**Returns:** [`java.util.Set<K>`](../../../../java/util/Set.md)

### `values()`

**Returns:** [`java.util.Collection<V>`](../../../../java/util/Collection.md)

### `entrySet()`

**Returns:** [`java.util.Set<java.util.Map.Entry<K,V>>`](../../../../java/util/Set>.md)

### `toArrayList([`java.util.Collection<E>`](../../../../java/util/Collection.md) c)`

**Returns:** [`java.util.ArrayList<E>`](../../../../java/util/ArrayList.md)

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject([`java.io.ObjectInputStream`](../../../../java/io/ObjectInputStream.md) in)`

**Returns:** `void`

