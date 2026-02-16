# Class: `LocalCache`

**Package:** [`com.google.common.cache`](README.md)

**Fully Qualified Name:** `com.google.common.cache.LocalCache`

**Extends:** `java.util.AbstractMap<K,V>`

**Implements:** `java.util.concurrent.ConcurrentMap<K,V>`

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

The concurrent hash map implementation built by `CacheBuilder`.

 <p>This implementation is heavily derived from revision 1.96 of <a href="http://tinyurl.com/ConcurrentHashMap">ConcurrentHashMap.java</a>.
**Author:** Charles Fry
**Author:** Bob Lee (`com.google.common.collect.MapMaker`)
**Author:** Doug Lea (`ConcurrentHashMap`)

## Fields

### `MAXIMUM_CAPACITY`

**Type:** `int`

The maximum capacity, used if a higher value is implicitly specified by either of the
 constructors with arguments. MUST be a power of two `<= 1<<30` to ensure that entries are
 indexable using ints.

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

### `logger`

**Type:** `java.util.logging.Logger`

### `segmentMask`

**Type:** `int`

Mask value for indexing into segments. The upper bits of a key's hash code are used to choose
 the segment.

### `segmentShift`

**Type:** `int`

Shift value for indexing within segments. Helps prevent entries that end up in the same segment
 from also ending up in the same bucket.

### `segments`

**Type:** [`com.google.common.cache.LocalCache.Segment<K,V>[]`](LocalCache/Segment.md)

The segments, each of which is a specialized hash table.

### `concurrencyLevel`

**Type:** `int`

The concurrency level.

### `keyEquivalence`

**Type:** [`com.google.common.base.Equivalence<java.lang.Object>`](../base/Equivalence.md)

Strategy for comparing keys.

### `valueEquivalence`

**Type:** [`com.google.common.base.Equivalence<java.lang.Object>`](../base/Equivalence.md)

Strategy for comparing values.

### `keyStrength`

**Type:** [`com.google.common.cache.LocalCache.Strength`](LocalCache/Strength.md)

Strategy for referencing keys.

### `valueStrength`

**Type:** [`com.google.common.cache.LocalCache.Strength`](LocalCache/Strength.md)

Strategy for referencing values.

### `maxWeight`

**Type:** `long`

The maximum weight of this map. UNSET_INT if there is no maximum.

### `weigher`

**Type:** [`com.google.common.cache.Weigher<K,V>`](./Weigher.md)

Weigher to weigh cache entries.

### `expireAfterAccessNanos`

**Type:** `long`

How long after the last access to an entry the map will retain that entry.

### `expireAfterWriteNanos`

**Type:** `long`

How long after the last write to an entry the map will retain that entry.

### `refreshNanos`

**Type:** `long`

How long after the last write an entry becomes a candidate for refresh.

### `removalNotificationQueue`

**Type:** `java.util.Queue<com.google.common.cache.RemovalNotification<K,V>>`

Entries waiting to be consumed by the removal listener.

### `removalListener`

**Type:** [`com.google.common.cache.RemovalListener<K,V>`](./RemovalListener.md)

A listener that is invoked when an entry is removed due to expiration or garbage collection of
 soft/weak entries.

### `ticker`

**Type:** [`com.google.common.base.Ticker`](../base/Ticker.md)

Measures time in a testable way.

### `entryFactory`

**Type:** [`com.google.common.cache.LocalCache.EntryFactory`](LocalCache/EntryFactory.md)

Factory used to create new entries.

### `globalStatsCounter`

**Type:** [`com.google.common.cache.AbstractCache.StatsCounter`](AbstractCache/StatsCounter.md)

Accumulates global cache statistics. Note that there are also per-segments stats counters which
 must be aggregated to obtain a global stats view.

### `defaultLoader`

**Type:** [`com.google.common.cache.CacheLoader<? super K,V>`](./CacheLoader.md)

The default cache loader to use on loading operations.

### `UNSET`

**Type:** [`com.google.common.cache.LocalCache.ValueReference<java.lang.Object,java.lang.Object>`](LocalCache/ValueReference.md)

Placeholder. Indicates that the value hasn't been set yet.

### `DISCARDING_QUEUE`

**Type:** `java.util.Queue<?>`

### `keySet`

**Type:** `java.util.Set<K>`

### `values`

**Type:** `java.util.Collection<V>`

### `entrySet`

**Type:** `java.util.Set<java.util.Map.Entry<K,V>>`

## Constructors

### `<init>([`com.google.common.cache.CacheBuilder<? super K,? super V>`](./CacheBuilder.md) builder, [`com.google.common.cache.CacheLoader<? super K,V>`](./CacheLoader.md) loader)`

Creates a new, empty map with the specified strategy, initial capacity and concurrency level.

## Methods

### `evictsBySize()`

**Returns:** `boolean`

### `customWeigher()`

**Returns:** `boolean`

### `expires()`

**Returns:** `boolean`

### `expiresAfterWrite()`

**Returns:** `boolean`

### `expiresAfterAccess()`

**Returns:** `boolean`

### `refreshes()`

**Returns:** `boolean`

### `usesAccessQueue()`

**Returns:** `boolean`

### `usesWriteQueue()`

**Returns:** `boolean`

### `recordsWrite()`

**Returns:** `boolean`

### `recordsAccess()`

**Returns:** `boolean`

### `recordsTime()`

**Returns:** `boolean`

### `usesWriteEntries()`

**Returns:** `boolean`

### `usesAccessEntries()`

**Returns:** `boolean`

### `usesKeyReferences()`

**Returns:** `boolean`

### `usesValueReferences()`

**Returns:** `boolean`

### `unset()`

**Returns:** [`com.google.common.cache.LocalCache.ValueReference<K,V>`](LocalCache/ValueReference.md)

Singleton placeholder that indicates a value is being loaded.

### `nullEntry()`

**Returns:** [`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md)

### `discardingQueue()`

**Returns:** `java.util.Queue<E>`

Queue that discards all elements.

### `rehash(`int` h)`

**Returns:** `int`

Applies a supplemental hash function to a given hash code, which defends against poor quality
 hash functions. This is critical when the concurrent hash map uses power-of-two length hash
 tables, that otherwise encounter collisions for hash codes that do not differ in lower or upper
 bits.
@param h hash code

### `newEntry(`K` key, `int` hash, [`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md) next)`

**Returns:** [`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md)

This method is a convenience for testing. Code should call `Segment.newEntry` directly.

### `copyEntry([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md) original, [`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md) newNext)`

**Returns:** [`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md)

This method is a convenience for testing. Code should call `Segment.copyEntry` directly.

### `newValueReference([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md) entry, `V` value, `int` weight)`

**Returns:** [`com.google.common.cache.LocalCache.ValueReference<K,V>`](LocalCache/ValueReference.md)

This method is a convenience for testing. Code should call `Segment.setValue` instead.

### `hash(`java.lang.Object` key)`

**Returns:** `int`

### `reclaimValue([`com.google.common.cache.LocalCache.ValueReference<K,V>`](LocalCache/ValueReference.md) valueReference)`

**Returns:** `void`

### `reclaimKey([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md) entry)`

**Returns:** `void`

### `isLive([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md) entry, `long` now)`

**Returns:** `boolean`

This method is a convenience for testing. Code should call `Segment.getLiveValue`
 instead.

### `segmentFor(`int` hash)`

**Returns:** [`com.google.common.cache.LocalCache.Segment<K,V>`](LocalCache/Segment.md)

Returns the segment that should be used for a key with the given hash.
@param hash the hash code for the key
@return the segment

### `createSegment(`int` initialCapacity, `long` maxSegmentWeight, [`com.google.common.cache.AbstractCache.StatsCounter`](AbstractCache/StatsCounter.md) statsCounter)`

**Returns:** [`com.google.common.cache.LocalCache.Segment<K,V>`](LocalCache/Segment.md)

### `getLiveValue([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md) entry, `long` now)`

**Returns:** `V`

Gets the value from an entry. Returns null if the entry is invalid, partially-collected,
 loading, or expired. Unlike `Segment.getLiveValue` this method does not attempt to clean
 up stale entries. As such it should only be called outside a segment context, such as during
 iteration.

### `isExpired([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md) entry, `long` now)`

**Returns:** `boolean`

Returns true if the entry has expired.

### `connectAccessOrder([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md) previous, [`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md) next)`

**Returns:** `void`

### `nullifyAccessOrder([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md) nulled)`

**Returns:** `void`

### `connectWriteOrder([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md) previous, [`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md) next)`

**Returns:** `void`

### `nullifyWriteOrder([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md) nulled)`

**Returns:** `void`

### `processPendingNotifications()`

**Returns:** `void`

Notifies listeners that an entry has been automatically removed due to expiration, eviction, or
 eligibility for garbage collection. This should be called every time expireEntries or
 evictEntry is called (once the lock is released).

### `newSegmentArray(`int` ssize)`

**Returns:** [`com.google.common.cache.LocalCache.Segment<K,V>[]`](LocalCache/Segment.md)

### `cleanUp()`

**Returns:** `void`

### `isEmpty()`

**Returns:** `boolean`

### `longSize()`

**Returns:** `long`

### `size()`

**Returns:** `int`

### `get(`java.lang.Object` key)`

**Returns:** `V`

### `get(`K` key, [`com.google.common.cache.CacheLoader<? super K,V>`](./CacheLoader.md) loader)`

**Returns:** `V`

### `getIfPresent(`java.lang.Object` key)`

**Returns:** `V`

### `getOrDefault(`java.lang.Object` key, `V` defaultValue)`

**Returns:** `V`

### `getOrLoad(`K` key)`

**Returns:** `V`

### `getAllPresent(`java.lang.Iterable<?>` keys)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](../collect/ImmutableMap.md)

### `getAll(`java.lang.Iterable<? extends K>` keys)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](../collect/ImmutableMap.md)

### `loadAll(`java.util.Set<? extends K>` keys, [`com.google.common.cache.CacheLoader<? super K,V>`](./CacheLoader.md) loader)`

**Returns:** `java.util.Map<K,V>`

Returns the result of calling `CacheLoader.loadAll`, or null if `loader` doesn't
 implement `loadAll`.

### `getEntry(`java.lang.Object` key)`

**Returns:** [`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md)

Returns the internal entry for the specified key. The entry may be loading, expired, or
 partially collected.

### `refresh(`K` key)`

**Returns:** `void`

### `containsKey(`java.lang.Object` key)`

**Returns:** `boolean`

### `containsValue(`java.lang.Object` value)`

**Returns:** `boolean`

### `put(`K` key, `V` value)`

**Returns:** `V`

### `putIfAbsent(`K` key, `V` value)`

**Returns:** `V`

### `compute(`K` key, `java.util.function.BiFunction<? super K,? super @org.checkerframework.checker.nullness.qual.Nullable V,? extends @org.checkerframework.checker.nullness.qual.Nullable V>` function)`

**Returns:** `V`

### `computeIfAbsent(`K` key, `java.util.function.Function<? super K,? extends V>` function)`

**Returns:** `V`

### `computeIfPresent(`K` key, `java.util.function.BiFunction<? super K,? super V,? extends @org.checkerframework.checker.nullness.qual.Nullable V>` function)`

**Returns:** `V`

### `merge(`K` key, `V` newValue, `java.util.function.BiFunction<? super V,? super V,? extends @org.checkerframework.checker.nullness.qual.Nullable V>` function)`

**Returns:** `V`

### `putAll(`java.util.Map<? extends K,? extends V>` m)`

**Returns:** `void`

### `remove(`java.lang.Object` key)`

**Returns:** `V`

### `remove(`java.lang.Object` key, `java.lang.Object` value)`

**Returns:** `boolean`

### `replace(`K` key, `V` oldValue, `V` newValue)`

**Returns:** `boolean`

### `replace(`K` key, `V` value)`

**Returns:** `V`

### `clear()`

**Returns:** `void`

### `invalidateAll(`java.lang.Iterable<?>` keys)`

**Returns:** `void`

### `keySet()`

**Returns:** `java.util.Set<K>`

### `values()`

**Returns:** `java.util.Collection<V>`

### `entrySet()`

**Returns:** `java.util.Set<java.util.Map.Entry<K,V>>`

### `toArrayList(`java.util.Collection<E>` c)`

**Returns:** `java.util.ArrayList<E>`

### `removeIf(`java.util.function.BiPredicate<? super K,? super V>` filter)`

**Returns:** `boolean`

