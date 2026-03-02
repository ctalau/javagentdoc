# Class: `MapMaker`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.MapMaker`

## Description

Usage example:

 

```

 ConcurrentMap<Request, Stopwatch> timers = new MapMaker()
     .concurrencyLevel(4)
     .weakKeys()
     .makeMap();
 
```


 
These features are all optional; new MapMaker().makeMap() returns a valid concurrent
 map that behaves similarly to a ConcurrentHashMap.

 
The returned map is implemented as a hash table with similar performance characteristics to
 ConcurrentHashMap. It supports all optional operations of the ConcurrentMap
 interface. It does not permit null keys or values.

 
**Note:** by default, the returned map uses equality comparisons (the equals method) to determine equality for keys or values. However, if #weakKeys was
 specified, the map uses identity (==) comparisons instead for keys. Likewise, if #weakValues was specified, the map uses identity comparisons for values.

 
The view collections of the returned map have *weakly consistent iterators*. This means
 that they are safe for concurrent use, but if other threads modify the map after the iterator is
 created, it is undefined which of these changes, if any, are reflected in that iterator. These
 iterators never throw ConcurrentModificationException.

 
If #weakKeys or #weakValues are requested, it is possible for a key or value
 present in the map to be reclaimed by the garbage collector. Entries with reclaimed keys or
 values may be removed from the map on each map modification or on occasional map accesses; such
 entries may be counted by Map#size, but will never be visible to read or write
 operations. A partially-reclaimed entry is never exposed to the user. Any Map.Entry
 instance retrieved from the map's entry set is a snapshot of that
 entry's state at the time of retrieval; such entries do, however, support Map.Entry#setValue, which simply calls Map#put on the entry's key.

 
The maps produced by MapMaker are serializable, and the deserialized maps retain all
 the configuration properties of the original map. During deserialization, if the original map had
 used weak references, the entries are reconstructed as they were, but it's not unlikely they'll
 be quickly garbage-collected before they are ever accessed.

 
new MapMaker().weakKeys().makeMap() is a recommended replacement for java.util.WeakHashMap, but note that it compares keys using object identity whereas 
 WeakHashMap uses Object#equals.

## Fields

### `DEFAULT_INITIAL_CAPACITY`

**Type:** `int`

### `DEFAULT_CONCURRENCY_LEVEL`

**Type:** `int`

### `UNSET_INT`

**Type:** `int`

### `useCustomMap`

**Type:** `boolean`

### `initialCapacity`

**Type:** `int`

### `concurrencyLevel`

**Type:** `int`

### `keyStrength`

**Type:** `com.google.common.collect.MapMakerInternalMap.Strength`

### `valueStrength`

**Type:** `com.google.common.collect.MapMakerInternalMap.Strength`

### `keyEquivalence`

**Type:** [`com.google.common.base.Equivalence<java.lang.Object>`](../base/Equivalence.md)

## Constructors

### `<init>()`

## Methods

### `keyEquivalence(com.google.common.base.Equivalence<java.lang.Object> equivalence)`

**Returns:** [`com.google.common.collect.MapMaker`](./MapMaker.md)

By default, the map uses Equivalence#identity to determine key equality when #weakKeys is specified, and Equivalence#equals() otherwise. The only place this is
 used is in Interners.WeakInterner.

**Parameters:**
- `equivalence` ([`com.google.common.base.Equivalence<java.lang.Object>`](../base/Equivalence.md))

### `getKeyEquivalence()`

**Returns:** [`com.google.common.base.Equivalence<java.lang.Object>`](../base/Equivalence.md)

### `initialCapacity(int initialCapacity)`

**Returns:** [`com.google.common.collect.MapMaker`](./MapMaker.md)

For example, if the initial capacity
 is 60, and the concurrency level is 8, then eight segments are created, each
 having a hash table of size eight. Providing a large enough estimate at construction time
 avoids the need for expensive resizing operations later, but setting this value unnecessarily
 high wastes memory.

**Parameters:**
- `initialCapacity` (`int`)

### `getInitialCapacity()`

**Returns:** `int`

### `concurrencyLevel(int concurrencyLevel)`

**Returns:** [`com.google.common.collect.MapMaker`](./MapMaker.md)

Used as a hint for internal sizing. The
 table is internally partitioned to try to permit the indicated number of concurrent updates
 without contention. Because assignment of entries to these partitions is not necessarily
 uniform, the actual concurrency observed may vary. Ideally, you should choose a value to
 accommodate as many threads as will ever concurrently modify the table. Using a significantly
 higher value than you need can waste space and time, and a significantly lower value can lead
 to thread contention. But overestimates and underestimates within an order of magnitude do not
 usually have much noticeable impact. A value of one permits only one thread to modify the map
 at a time, but since read operations can proceed concurrently, this still yields higher
 concurrency than full synchronization. Defaults to 4.

 
**Note:** Prior to Guava release 9.0, the default was 16. It is possible the default will
 change again in the future. If you care about this value, you should always choose it
 explicitly.

**Parameters:**
- `concurrencyLevel` (`int`)

### `getConcurrencyLevel()`

**Returns:** `int`

### `weakKeys()`

**Returns:** [`com.google.common.collect.MapMaker`](./MapMaker.md)

**Warning:** when this method is used, the resulting map will use identity (==)
 comparison to determine equality of keys, which is a technical violation of the Map
 specification, and may not be what you expect.

### `setKeyStrength(com.google.common.collect.MapMakerInternalMap.Strength strength)`

**Returns:** [`com.google.common.collect.MapMaker`](./MapMaker.md)

**Parameters:**
- `strength` (`com.google.common.collect.MapMakerInternalMap.Strength`)

### `getKeyStrength()`

**Returns:** `com.google.common.collect.MapMakerInternalMap.Strength`

### `weakValues()`

**Returns:** [`com.google.common.collect.MapMaker`](./MapMaker.md)

Weak values will be garbage collected once they are weakly reachable. This makes them a poor
 candidate for caching.

 
**Warning:** when this method is used, the resulting map will use identity (==)
 comparison to determine equality of values. This technically violates the specifications of the
 methods containsValue, remove(Object, Object) and replace(K, V,
 V), and may not be what you expect.

### `setValueStrength(com.google.common.collect.MapMakerInternalMap.Strength strength)`

**Returns:** [`com.google.common.collect.MapMaker`](./MapMaker.md)

**Parameters:**
- `strength` (`com.google.common.collect.MapMakerInternalMap.Strength`)

### `getValueStrength()`

**Returns:** `com.google.common.collect.MapMakerInternalMap.Strength`

### `makeMap()`

**Returns:** `java.util.concurrent.ConcurrentMap<K,V>`

This method does not alter the state of this MapMaker
 instance, so it can be invoked again to create multiple independent maps.

 
The bulk operations putAll, equals, and clear are not guaranteed to
 be performed atomically on the returned map. Additionally, size and 
 containsValue are implemented as bulk read operations, and thus may fail to observe concurrent
 writes.

### `toString()`

**Returns:** `java.lang.String`

The exact form of the returned
 string is not specified.

