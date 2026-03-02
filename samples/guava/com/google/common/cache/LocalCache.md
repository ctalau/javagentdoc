# Class: `LocalCache`

**Package:** [`com.google.common.cache`](README.md)

**Fully Qualified Name:** `com.google.common.cache.LocalCache`

**Extends:** `java.util.AbstractMap<K,V>`

**Implements:** `java.util.concurrent.ConcurrentMap<K,V>`

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

This implementation is heavily derived from revision 1.96 of [ConcurrentHashMap.java](http://tinyurl.com/ConcurrentHashMap).

## Fields

### `MAXIMUM_CAPACITY`

**Type:** `int`

MUST be a power of two <= 1<<30 to ensure that entries are
 indexable using ints.

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

### `logger`

**Type:** `java.util.logging.Logger`

### `segmentMask`

**Type:** `int`

The upper bits of a key's hash code are used to choose
 the segment.

### `segmentShift`

**Type:** `int`

Helps prevent entries that end up in the same segment
 from also ending up in the same bucket.

### `segments`

**Type:** `com.google.common.cache.LocalCache.Segment<K,V>[]`

### `concurrencyLevel`

**Type:** `int`

### `keyEquivalence`

**Type:** [`com.google.common.base.Equivalence<java.lang.Object>`](../base/Equivalence.md)

### `valueEquivalence`

**Type:** [`com.google.common.base.Equivalence<java.lang.Object>`](../base/Equivalence.md)

### `keyStrength`

**Type:** `com.google.common.cache.LocalCache.Strength`

### `valueStrength`

**Type:** `com.google.common.cache.LocalCache.Strength`

### `maxWeight`

**Type:** `long`

UNSET_INT if there is no maximum.

### `weigher`

**Type:** [`com.google.common.cache.Weigher<K,V>`](./Weigher.md)

### `expireAfterAccessNanos`

**Type:** `long`

### `expireAfterWriteNanos`

**Type:** `long`

### `refreshNanos`

**Type:** `long`

### `removalNotificationQueue`

**Type:** `java.util.Queue<com.google.common.cache.RemovalNotification<K,V>>`

### `removalListener`

**Type:** [`com.google.common.cache.RemovalListener<K,V>`](./RemovalListener.md)

### `ticker`

**Type:** [`com.google.common.base.Ticker`](../base/Ticker.md)

### `entryFactory`

**Type:** `com.google.common.cache.LocalCache.EntryFactory`

### `globalStatsCounter`

**Type:** `com.google.common.cache.AbstractCache.StatsCounter`

Note that there are also per-segments stats counters which
 must be aggregated to obtain a global stats view.

### `defaultLoader`

**Type:** [`com.google.common.cache.CacheLoader<? super K,V>`](./CacheLoader.md)

### `UNSET`

**Type:** `com.google.common.cache.LocalCache.ValueReference<java.lang.Object,java.lang.Object>`

Indicates that the value hasn't been set yet.

### `DISCARDING_QUEUE`

**Type:** `java.util.Queue<?>`

### `keySet`

**Type:** `java.util.Set<K>`

### `values`

**Type:** `java.util.Collection<V>`

### `entrySet`

**Type:** `java.util.Set<java.util.Map.Entry<K,V>>`

## Constructors

### `<init>(com.google.common.cache.CacheBuilder<? super K,? super V> builder, com.google.common.cache.CacheLoader<? super K,V> loader)`

**Parameters:**
- `builder` ([`com.google.common.cache.CacheBuilder<? super K,? super V>`](./CacheBuilder.md))
- `loader` ([`com.google.common.cache.CacheLoader<? super K,V>`](./CacheLoader.md))

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

**Returns:** `com.google.common.cache.LocalCache.ValueReference<K,V>`

### `nullEntry()`

**Returns:** [`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md)

### `discardingQueue()`

**Returns:** `java.util.Queue<E>`

### `rehash(int h)`

**Returns:** `int`

This is critical when the concurrent hash map uses power-of-two length hash
 tables, that otherwise encounter collisions for hash codes that do not differ in lower or upper
 bits.

**Parameters:**
- `h` (`int`): hash code

### `newEntry(K key, int hash, com.google.common.cache.ReferenceEntry<K,V> next)`

**Returns:** [`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md)

Code should call Segment#newEntry directly.

**Parameters:**
- `key` (`K`)
- `hash` (`int`)
- `next` ([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md))

### `copyEntry(com.google.common.cache.ReferenceEntry<K,V> original, com.google.common.cache.ReferenceEntry<K,V> newNext)`

**Returns:** [`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md)

Code should call Segment#copyEntry directly.

**Parameters:**
- `original` ([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md))
- `newNext` ([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md))

### `newValueReference(com.google.common.cache.ReferenceEntry<K,V> entry, V value, int weight)`

**Returns:** `com.google.common.cache.LocalCache.ValueReference<K,V>`

Code should call Segment#setValue instead.

**Parameters:**
- `entry` ([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md))
- `value` (`V`)
- `weight` (`int`)

### `hash(java.lang.Object key)`

**Returns:** `int`

**Parameters:**
- `key` (`java.lang.Object`)

### `reclaimValue(com.google.common.cache.LocalCache.ValueReference<K,V> valueReference)`

**Returns:** `void`

**Parameters:**
- `valueReference` (`com.google.common.cache.LocalCache.ValueReference<K,V>`)

### `reclaimKey(com.google.common.cache.ReferenceEntry<K,V> entry)`

**Returns:** `void`

**Parameters:**
- `entry` ([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md))

### `isLive(com.google.common.cache.ReferenceEntry<K,V> entry, long now)`

**Returns:** `boolean`

Code should call Segment#getLiveValue
 instead.

**Parameters:**
- `entry` ([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md))
- `now` (`long`)

### `segmentFor(int hash)`

**Returns:** `com.google.common.cache.LocalCache.Segment<K,V>`

**Parameters:**
- `hash` (`int`): the hash code for the key

### `createSegment(int initialCapacity, long maxSegmentWeight, com.google.common.cache.AbstractCache.StatsCounter statsCounter)`

**Returns:** `com.google.common.cache.LocalCache.Segment<K,V>`

**Parameters:**
- `initialCapacity` (`int`)
- `maxSegmentWeight` (`long`)
- `statsCounter` (`com.google.common.cache.AbstractCache.StatsCounter`)

### `getLiveValue(com.google.common.cache.ReferenceEntry<K,V> entry, long now)`

**Returns:** `V`

Returns null if the entry is invalid, partially-collected,
 loading, or expired. Unlike Segment#getLiveValue this method does not attempt to clean
 up stale entries. As such it should only be called outside a segment context, such as during
 iteration.

**Parameters:**
- `entry` ([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md))
- `now` (`long`)

### `isExpired(com.google.common.cache.ReferenceEntry<K,V> entry, long now)`

**Returns:** `boolean`

**Parameters:**
- `entry` ([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md))
- `now` (`long`)

### `connectAccessOrder(com.google.common.cache.ReferenceEntry<K,V> previous, com.google.common.cache.ReferenceEntry<K,V> next)`

**Returns:** `void`

**Parameters:**
- `previous` ([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md))
- `next` ([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md))

### `nullifyAccessOrder(com.google.common.cache.ReferenceEntry<K,V> nulled)`

**Returns:** `void`

**Parameters:**
- `nulled` ([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md))

### `connectWriteOrder(com.google.common.cache.ReferenceEntry<K,V> previous, com.google.common.cache.ReferenceEntry<K,V> next)`

**Returns:** `void`

**Parameters:**
- `previous` ([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md))
- `next` ([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md))

### `nullifyWriteOrder(com.google.common.cache.ReferenceEntry<K,V> nulled)`

**Returns:** `void`

**Parameters:**
- `nulled` ([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md))

### `processPendingNotifications()`

**Returns:** `void`

This should be called every time expireEntries or
 evictEntry is called (once the lock is released).

### `newSegmentArray(int ssize)`

**Returns:** `com.google.common.cache.LocalCache.Segment<K,V>[]`

**Parameters:**
- `ssize` (`int`)

### `cleanUp()`

**Returns:** `void`

### `isEmpty()`

**Returns:** `boolean`

### `longSize()`

**Returns:** `long`

### `size()`

**Returns:** `int`

### `get(java.lang.Object key)`

**Returns:** `V`

**Parameters:**
- `key` (`java.lang.Object`)

### `get(K key, com.google.common.cache.CacheLoader<? super K,V> loader)`

**Returns:** `V`

**Parameters:**
- `key` (`K`)
- `loader` ([`com.google.common.cache.CacheLoader<? super K,V>`](./CacheLoader.md))

### `getIfPresent(java.lang.Object key)`

**Returns:** `V`

**Parameters:**
- `key` (`java.lang.Object`)

### `getOrDefault(java.lang.Object key, V defaultValue)`

**Returns:** `V`

**Parameters:**
- `key` (`java.lang.Object`)
- `defaultValue` (`V`)

### `getOrLoad(K key)`

**Returns:** `V`

**Parameters:**
- `key` (`K`)

### `getAllPresent(java.lang.Iterable<?> keys)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](../collect/ImmutableMap.md)

**Parameters:**
- `keys` (`java.lang.Iterable<?>`)

### `getAll(java.lang.Iterable<? extends K> keys)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](../collect/ImmutableMap.md)

**Parameters:**
- `keys` (`java.lang.Iterable<? extends K>`)

### `loadAll(java.util.Set<? extends K> keys, com.google.common.cache.CacheLoader<? super K,V> loader)`

**Returns:** `java.util.Map<K,V>`

**Parameters:**
- `keys` (`java.util.Set<? extends K>`)
- `loader` ([`com.google.common.cache.CacheLoader<? super K,V>`](./CacheLoader.md))

### `getEntry(java.lang.Object key)`

**Returns:** [`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md)

The entry may be loading, expired, or
 partially collected.

**Parameters:**
- `key` (`java.lang.Object`)

### `refresh(K key)`

**Returns:** `void`

**Parameters:**
- `key` (`K`)

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

### `compute(K key, java.util.function.BiFunction<? super K,? super @org.checkerframework.checker.nullness.qual.Nullable V,? extends @org.checkerframework.checker.nullness.qual.Nullable V> function)`

**Returns:** `V`

**Parameters:**
- `key` (`K`)
- `function` (`java.util.function.BiFunction<? super K,? super @org.checkerframework.checker.nullness.qual.Nullable V,? extends @org.checkerframework.checker.nullness.qual.Nullable V>`)

### `computeIfAbsent(K key, java.util.function.Function<? super K,? extends V> function)`

**Returns:** `V`

**Parameters:**
- `key` (`K`)
- `function` (`java.util.function.Function<? super K,? extends V>`)

### `computeIfPresent(K key, java.util.function.BiFunction<? super K,? super V,? extends @org.checkerframework.checker.nullness.qual.Nullable V> function)`

**Returns:** `V`

**Parameters:**
- `key` (`K`)
- `function` (`java.util.function.BiFunction<? super K,? super V,? extends @org.checkerframework.checker.nullness.qual.Nullable V>`)

### `merge(K key, V newValue, java.util.function.BiFunction<? super V,? super V,? extends @org.checkerframework.checker.nullness.qual.Nullable V> function)`

**Returns:** `V`

**Parameters:**
- `key` (`K`)
- `newValue` (`V`)
- `function` (`java.util.function.BiFunction<? super V,? super V,? extends @org.checkerframework.checker.nullness.qual.Nullable V>`)

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

### `invalidateAll(java.lang.Iterable<?> keys)`

**Returns:** `void`

**Parameters:**
- `keys` (`java.lang.Iterable<?>`)

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

### `removeIf(java.util.function.BiPredicate<? super K,? super V> filter)`

**Returns:** `boolean`

**Parameters:**
- `filter` (`java.util.function.BiPredicate<? super K,? super V>`)

