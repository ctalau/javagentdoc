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

### `<init>(CacheBuilder<? super K,? super V> builder, CacheLoader<? super K,V> loader)`

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

This is critical when the concurrent hash map uses power-of-two length hash
 tables, that otherwise encounter collisions for hash codes that do not differ in lower or upper
 bits.

**Parameters:**
- `h` (`int`): hash code

**Returns:** `int`

### `newEntry(K key, int hash, ReferenceEntry<K,V> next)`

Code should call Segment#newEntry directly.

**Parameters:**
- `key` (`K`)
- `hash` (`int`)
- `next` ([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md))

**Returns:** [`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md)

### `copyEntry(ReferenceEntry<K,V> original, ReferenceEntry<K,V> newNext)`

Code should call Segment#copyEntry directly.

**Parameters:**
- `original` ([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md))
- `newNext` ([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md))

**Returns:** [`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md)

### `newValueReference(ReferenceEntry<K,V> entry, V value, int weight)`

Code should call Segment#setValue instead.

**Parameters:**
- `entry` ([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md))
- `value` (`V`)
- `weight` (`int`)

**Returns:** `com.google.common.cache.LocalCache.ValueReference<K,V>`

### `hash(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `int`

### `reclaimValue(LocalCache.ValueReference<K,V> valueReference)`

**Parameters:**
- `valueReference` (`com.google.common.cache.LocalCache.ValueReference<K,V>`)

**Returns:** `void`

### `reclaimKey(ReferenceEntry<K,V> entry)`

**Parameters:**
- `entry` ([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md))

**Returns:** `void`

### `isLive(ReferenceEntry<K,V> entry, long now)`

Code should call Segment#getLiveValue
 instead.

**Parameters:**
- `entry` ([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md))
- `now` (`long`)

**Returns:** `boolean`

### `segmentFor(int hash)`

**Parameters:**
- `hash` (`int`): the hash code for the key

**Returns:** `com.google.common.cache.LocalCache.Segment<K,V>`

### `createSegment(int initialCapacity, long maxSegmentWeight, AbstractCache.StatsCounter statsCounter)`

**Parameters:**
- `initialCapacity` (`int`)
- `maxSegmentWeight` (`long`)
- `statsCounter` (`com.google.common.cache.AbstractCache.StatsCounter`)

**Returns:** `com.google.common.cache.LocalCache.Segment<K,V>`

### `getLiveValue(ReferenceEntry<K,V> entry, long now)`

Returns null if the entry is invalid, partially-collected,
 loading, or expired. Unlike Segment#getLiveValue this method does not attempt to clean
 up stale entries. As such it should only be called outside a segment context, such as during
 iteration.

**Parameters:**
- `entry` ([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md))
- `now` (`long`)

**Returns:** `V`

### `isExpired(ReferenceEntry<K,V> entry, long now)`

**Parameters:**
- `entry` ([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md))
- `now` (`long`)

**Returns:** `boolean`

### `connectAccessOrder(ReferenceEntry<K,V> previous, ReferenceEntry<K,V> next)`

**Parameters:**
- `previous` ([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md))
- `next` ([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md))

**Returns:** `void`

### `nullifyAccessOrder(ReferenceEntry<K,V> nulled)`

**Parameters:**
- `nulled` ([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md))

**Returns:** `void`

### `connectWriteOrder(ReferenceEntry<K,V> previous, ReferenceEntry<K,V> next)`

**Parameters:**
- `previous` ([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md))
- `next` ([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md))

**Returns:** `void`

### `nullifyWriteOrder(ReferenceEntry<K,V> nulled)`

**Parameters:**
- `nulled` ([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md))

**Returns:** `void`

### `processPendingNotifications()`

This should be called every time expireEntries or
 evictEntry is called (once the lock is released).

**Returns:** `void`

### `newSegmentArray(int ssize)`

**Parameters:**
- `ssize` (`int`)

**Returns:** `com.google.common.cache.LocalCache.Segment<K,V>[]`

### `cleanUp()`

**Returns:** `void`

### `isEmpty()`

**Returns:** `boolean`

### `longSize()`

**Returns:** `long`

### `size()`

**Returns:** `int`

### `get(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `V`

### `get(K key, CacheLoader<? super K,V> loader)`

**Parameters:**
- `key` (`K`)
- `loader` ([`com.google.common.cache.CacheLoader<? super K,V>`](./CacheLoader.md))

**Returns:** `V`

### `getIfPresent(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `V`

### `getOrDefault(Object key, V defaultValue)`

**Parameters:**
- `key` (`java.lang.Object`)
- `defaultValue` (`V`)

**Returns:** `V`

### `getOrLoad(K key)`

**Parameters:**
- `key` (`K`)

**Returns:** `V`

### `getAllPresent(Iterable<?> keys)`

**Parameters:**
- `keys` (`java.lang.Iterable<?>`)

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](../collect/ImmutableMap.md)

### `getAll(Iterable<? extends K> keys)`

**Parameters:**
- `keys` (`java.lang.Iterable<? extends K>`)

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](../collect/ImmutableMap.md)

### `loadAll(Set<? extends K> keys, CacheLoader<? super K,V> loader)`

**Parameters:**
- `keys` (`java.util.Set<? extends K>`)
- `loader` ([`com.google.common.cache.CacheLoader<? super K,V>`](./CacheLoader.md))

**Returns:** `java.util.Map<K,V>`

### `getEntry(Object key)`

The entry may be loading, expired, or
 partially collected.

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** [`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md)

### `refresh(K key)`

**Parameters:**
- `key` (`K`)

**Returns:** `void`

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

### `compute(K key, BiFunction<? super K,? super @Nullable V,? extends @Nullable V> function)`

**Parameters:**
- `key` (`K`)
- `function` (`java.util.function.BiFunction<? super K,? super @org.checkerframework.checker.nullness.qual.Nullable V,? extends @org.checkerframework.checker.nullness.qual.Nullable V>`)

**Returns:** `V`

### `computeIfAbsent(K key, Function<? super K,? extends V> function)`

**Parameters:**
- `key` (`K`)
- `function` (`java.util.function.Function<? super K,? extends V>`)

**Returns:** `V`

### `computeIfPresent(K key, BiFunction<? super K,? super V,? extends @Nullable V> function)`

**Parameters:**
- `key` (`K`)
- `function` (`java.util.function.BiFunction<? super K,? super V,? extends @org.checkerframework.checker.nullness.qual.Nullable V>`)

**Returns:** `V`

### `merge(K key, V newValue, BiFunction<? super V,? super V,? extends @Nullable V> function)`

**Parameters:**
- `key` (`K`)
- `newValue` (`V`)
- `function` (`java.util.function.BiFunction<? super V,? super V,? extends @org.checkerframework.checker.nullness.qual.Nullable V>`)

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

### `invalidateAll(Iterable<?> keys)`

**Parameters:**
- `keys` (`java.lang.Iterable<?>`)

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

### `removeIf(BiPredicate<? super K,? super V> filter)`

**Parameters:**
- `filter` (`java.util.function.BiPredicate<? super K,? super V>`)

**Returns:** `boolean`

