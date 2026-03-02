# Class: `CacheBuilder`

**Package:** [`com.google.common.cache`](README.md)

**Fully Qualified Name:** `com.google.common.cache.CacheBuilder`

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

Prefer [Caffeine](https://github.com/ben-manes/caffeine/wiki) over Guava's caching
 API

 
The successor to Guava's caching API is [Caffeine](https://github.com/ben-manes/caffeine/wiki). Its API is designed to make it a
 nearly drop-in replacement -- though it requires Java 8 APIs, is not available for Android or
 GWT/j2cl, and may have [different
 (usually better) behavior](https://github.com/ben-manes/caffeine/wiki/Guava) when multiple threads attempt concurrent mutations. Its equivalent
 to CacheBuilder is its [
 Caffeine](https://www.javadoc.io/doc/com.github.ben-manes.caffeine/caffeine/latest/com.github.benmanes.caffeine/com/github/benmanes/caffeine/cache/Caffeine.html) class. Caffeine offers better performance, more features (including asynchronous
 loading), and fewer [bugs](https://github.com/google/guava/issues?q=is%3Aopen+is%3Aissue+label%3Apackage%3Dcache+label%3Atype%3Ddefect).

 
Caffeine defines its own interfaces ([
 Cache](https://www.javadoc.io/doc/com.github.ben-manes.caffeine/caffeine/latest/com.github.benmanes.caffeine/com/github/benmanes/caffeine/cache/Cache.html), [
 LoadingCache](https://www.javadoc.io/doc/com.github.ben-manes.caffeine/caffeine/latest/com.github.benmanes.caffeine/com/github/benmanes/caffeine/cache/LoadingCache.html), [
 CacheLoader](https://www.javadoc.io/doc/com.github.ben-manes.caffeine/caffeine/latest/com.github.benmanes.caffeine/com/github/benmanes/caffeine/cache/CacheLoader.html), etc.), so you can use Caffeine without needing to use any Guava types.
 Caffeine's types are better than Guava's, especially for [their
 deep support for asynchronous operations](https://www.javadoc.io/doc/com.github.ben-manes.caffeine/caffeine/latest/com.github.benmanes.caffeine/com/github/benmanes/caffeine/cache/AsyncLoadingCache.html). But if you want to migrate to Caffeine with minimal
 code changes, you can use [its
 CaffeinatedGuava adapter class](https://www.javadoc.io/doc/com.github.ben-manes.caffeine/guava/latest/com.github.benmanes.caffeine.guava/com/github/benmanes/caffeine/guava/CaffeinatedGuava.html), which lets you build a Guava Cache or a Guava
 LoadingCache backed by a Guava CacheLoader.

 
Caffeine's API for asynchronous operations uses CompletableFuture: [
 AsyncLoadingCache.get](https://www.javadoc.io/doc/com.github.ben-manes.caffeine/caffeine/latest/com.github.benmanes.caffeine/com/github/benmanes/caffeine/cache/AsyncLoadingCache.html#get(K)) returns a CompletableFuture, and implementations of [
 AsyncCacheLoader.asyncLoad](https://www.javadoc.io/doc/com.github.ben-manes.caffeine/caffeine/latest/com.github.benmanes.caffeine/com/github/benmanes/caffeine/cache/AsyncCacheLoader.html#asyncLoad(K,java.util.concurrent.Executor)) must return a CompletableFuture. Users of Guava's com.google.common.util.concurrent.ListenableFuture can adapt between the two Future
 types by using [
 net.javacrumbs.futureconverter.java8guava.FutureConverter](https://github.com/lukas-krecan/future-converter#java8-guava).

 More on CacheBuilder

 CacheBuilder builds caches with any combination of the following features:

 

   - automatic loading of entries into the cache
   - least-recently-used eviction when a maximum size is exceeded (note that the cache is
       divided into segments, each of which does LRU internally)
   - time-based expiration of entries, measured since last access or last write
   - keys automatically wrapped in WeakReference
   - values automatically wrapped in WeakReference or SoftReference
   - notification of evicted (or otherwise removed) entries
   - accumulation of cache access statistics
 


 
These features are all optional; caches can be created using all or none of them. By default,
 cache instances created by CacheBuilder will not perform any type of eviction.

 
Usage example:

 

```

 LoadingCache<Key, Graph> graphs = CacheBuilder.newBuilder()
     .maximumSize(10000)
     .expireAfterWrite(Duration.ofMinutes(10))
     .removalListener(MY_LISTENER)
     .build(
         new CacheLoader<Key, Graph>() {
           public Graph load(Key key) throws AnyException {
             return createExpensiveGraph(key);
           }
         });
 
```


 
Or equivalently,

 

```

 // In real life this would come from a command-line flag or config file
 String spec = "maximumSize=10000,expireAfterWrite=10m";

 LoadingCache<Key, Graph> graphs = CacheBuilder.from(spec)
     .removalListener(MY_LISTENER)
     .build(
         new CacheLoader<Key, Graph>() {
           public Graph load(Key key) throws AnyException {
             return createExpensiveGraph(key);
           }
         });
 
```


 
The returned cache implements all optional operations of the LoadingCache and Cache interfaces. The asMap view (and its collection views) have *weakly consistent
 iterators*. This means that they are safe for concurrent use, but if other threads modify the
 cache after the iterator is created, it is undefined which of these changes, if any, are
 reflected in that iterator. These iterators never throw ConcurrentModificationException.

 
**Note:** by default, the returned cache uses equality comparisons (the equals method) to determine equality for keys or values. However, if #weakKeys was specified, the cache uses identity (==) comparisons instead for keys.
 Likewise, if #weakValues or #softValues was specified, the cache uses identity
 comparisons for values.

 
Entries are automatically evicted from the cache when any of maximumSize, maximumWeight, expireAfterWrite, expireAfterAccess, weakKeys,
 weakValues, or softValues are requested.

 
If maximumSize or maximumWeight is
 requested entries may be evicted on each cache modification.

 
If expireAfterWrite or expireAfterAccess
 is requested entries may be evicted on each cache modification, on occasional cache accesses, or
 on calls to Cache#cleanUp. Expired entries may be counted by Cache#size, but will
 never be visible to read or write operations.

 
If weakKeys, weakValues, or softValues are requested, it is possible for a key or value present in the cache to be reclaimed
 by the garbage collector. Entries with reclaimed keys or values may be removed from the cache on
 each cache modification, on occasional cache accesses, or on calls to Cache#cleanUp; such
 entries may be counted in Cache#size, but will never be visible to read or write
 operations.

 
Certain cache configurations will result in the accrual of periodic maintenance tasks which
 will be performed during write operations, or during occasional read operations in the absence of
 writes. The Cache#cleanUp method of the returned cache will also perform maintenance, but
 calling it should not be necessary with a high throughput cache. Only caches built with removalListener, expireAfterWrite, expireAfterAccess, weakKeys, weakValues, or softValues perform periodic maintenance.

 
The caches produced by CacheBuilder are serializable, and the deserialized caches
 retain all the configuration properties of the original cache. Note that the serialized form does
 *not* include cache contents, but only configuration.

 
See the Guava User Guide article on [caching](https://github.com/google/guava/wiki/CachesExplained) for a higher-level
 explanation.

## Fields

### `DEFAULT_INITIAL_CAPACITY`

**Type:** `int`

### `DEFAULT_CONCURRENCY_LEVEL`

**Type:** `int`

### `DEFAULT_EXPIRATION_NANOS`

**Type:** `int`

### `DEFAULT_REFRESH_NANOS`

**Type:** `int`

### `NULL_STATS_COUNTER`

**Type:** [`com.google.common.base.Supplier<? extends com.google.common.cache.AbstractCache.StatsCounter>`](../base/Supplier.md)

### `EMPTY_STATS`

**Type:** [`com.google.common.cache.CacheStats`](./CacheStats.md)

### `CACHE_STATS_COUNTER`

**Type:** [`com.google.common.base.Supplier<com.google.common.cache.AbstractCache.StatsCounter>`](../base/Supplier.md)

### `NULL_TICKER`

**Type:** [`com.google.common.base.Ticker`](../base/Ticker.md)

### `UNSET_INT`

**Type:** `int`

### `strictParsing`

**Type:** `boolean`

### `initialCapacity`

**Type:** `int`

### `concurrencyLevel`

**Type:** `int`

### `maximumSize`

**Type:** `long`

### `maximumWeight`

**Type:** `long`

### `weigher`

**Type:** [`com.google.common.cache.Weigher<? super K,? super V>`](./Weigher.md)

### `keyStrength`

**Type:** `com.google.common.cache.LocalCache.Strength`

### `valueStrength`

**Type:** `com.google.common.cache.LocalCache.Strength`

### `expireAfterWriteNanos`

**Type:** `long`

### `expireAfterAccessNanos`

**Type:** `long`

### `refreshNanos`

**Type:** `long`

### `keyEquivalence`

**Type:** [`com.google.common.base.Equivalence<java.lang.Object>`](../base/Equivalence.md)

### `valueEquivalence`

**Type:** [`com.google.common.base.Equivalence<java.lang.Object>`](../base/Equivalence.md)

### `removalListener`

**Type:** [`com.google.common.cache.RemovalListener<? super K,? super V>`](./RemovalListener.md)

### `ticker`

**Type:** [`com.google.common.base.Ticker`](../base/Ticker.md)

### `statsCounterSupplier`

**Type:** [`com.google.common.base.Supplier<? extends com.google.common.cache.AbstractCache.StatsCounter>`](../base/Supplier.md)

## Constructors

### `<init>()`

## Methods

### `newBuilder()`

Note that while this return type is CacheBuilder<Object, Object>, type parameters on
 the #build methods allow you to create a cache of any key and value type desired.

**Returns:** [`com.google.common.cache.CacheBuilder<java.lang.Object,java.lang.Object>`](./CacheBuilder.md)

### `from(CacheBuilderSpec spec)`

**Parameters:**
- `spec` ([`com.google.common.cache.CacheBuilderSpec`](./CacheBuilderSpec.md))

**Returns:** [`com.google.common.cache.CacheBuilder<java.lang.Object,java.lang.Object>`](./CacheBuilder.md)

### `from(String spec)`

This is especially useful for command-line configuration of a CacheBuilder.

**Parameters:**
- `spec` (`java.lang.String`): a String in the format specified by CacheBuilderSpec

**Returns:** [`com.google.common.cache.CacheBuilder<java.lang.Object,java.lang.Object>`](./CacheBuilder.md)

### `lenientParsing()`

Useful for tests and spec parsing.

**Returns:** [`com.google.common.cache.CacheBuilder<K,V>`](./CacheBuilder.md)

### `keyEquivalence(Equivalence<Object> equivalence)`

By default, the cache uses Equivalence#identity to determine key equality when
 #weakKeys is specified, and Equivalence#equals() otherwise.

**Parameters:**
- `equivalence` ([`com.google.common.base.Equivalence<java.lang.Object>`](../base/Equivalence.md))

**Returns:** [`com.google.common.cache.CacheBuilder<K,V>`](./CacheBuilder.md)

### `getKeyEquivalence()`

**Returns:** [`com.google.common.base.Equivalence<java.lang.Object>`](../base/Equivalence.md)

### `valueEquivalence(Equivalence<Object> equivalence)`

By default, the cache uses Equivalence#identity to determine value equality when
 #weakValues or #softValues is specified, and Equivalence#equals()
 otherwise.

**Parameters:**
- `equivalence` ([`com.google.common.base.Equivalence<java.lang.Object>`](../base/Equivalence.md))

**Returns:** [`com.google.common.cache.CacheBuilder<K,V>`](./CacheBuilder.md)

### `getValueEquivalence()`

**Returns:** [`com.google.common.base.Equivalence<java.lang.Object>`](../base/Equivalence.md)

### `initialCapacity(int initialCapacity)`

For example, if the initial capacity
 is 60, and the concurrency level is 8, then eight segments are created, each
 having a hash table of size eight. Providing a large enough estimate at construction time
 avoids the need for expensive resizing operations later, but setting this value unnecessarily
 high wastes memory.

**Parameters:**
- `initialCapacity` (`int`)

**Returns:** [`com.google.common.cache.CacheBuilder<K,V>`](./CacheBuilder.md)

### `getInitialCapacity()`

**Returns:** `int`

### `concurrencyLevel(int concurrencyLevel)`

Used as a hint for internal sizing. The
 table is internally partitioned to try to permit the indicated number of concurrent updates
 without contention. Because assignment of entries to these partitions is not necessarily
 uniform, the actual concurrency observed may vary. Ideally, you should choose a value to
 accommodate as many threads as will ever concurrently modify the table. Using a significantly
 higher value than you need can waste space and time, and a significantly lower value can lead
 to thread contention. But overestimates and underestimates within an order of magnitude do not
 usually have much noticeable impact. A value of one permits only one thread to modify the cache
 at a time, but since read operations and cache loading computations can proceed concurrently,
 this still yields higher concurrency than full synchronization.

 
Defaults to 4. **Note:**The default may change in the future. If you care about this
 value, you should always choose it explicitly.

 
The current implementation uses the concurrency level to create a fixed number of hashtable
 segments, each governed by its own write lock. The segment lock is taken once for each explicit
 write, and twice for each cache loading computation (once prior to loading the new value, and
 once after loading completes). Much internal cache management is performed at the segment
 granularity. For example, access queues and write queues are kept per segment when they are
 required by the selected eviction algorithm. As such, when writing unit tests it is not
 uncommon to specify concurrencyLevel(1) in order to achieve more deterministic eviction
 behavior.

 
Note that future implementations may abandon segment locking in favor of more advanced
 concurrency controls.

**Parameters:**
- `concurrencyLevel` (`int`)

**Returns:** [`com.google.common.cache.CacheBuilder<K,V>`](./CacheBuilder.md)

### `getConcurrencyLevel()`

**Returns:** `int`

### `maximumSize(long maximumSize)`

Note that the cache **may evict an entry before this limit is exceeded**. For example, in
 the current implementation, when concurrencyLevel is greater than 1, each
 resulting segment inside the cache *independently* limits its own size to approximately
 maximumSize / concurrencyLevel.

 
When eviction is necessary, the cache evicts entries that are less likely to be used again.
 For example, the cache may evict an entry because it hasn't been used recently or very often.

 
If maximumSize is zero, elements will be evicted immediately after being loaded into
 cache. This can be useful in testing, or to disable caching temporarily.

 
This feature cannot be used in conjunction with #maximumWeight.

**Parameters:**
- `maximumSize` (`long`): the maximum size of the cache

**Returns:** [`com.google.common.cache.CacheBuilder<K,V>`](./CacheBuilder.md)

### `maximumWeight(long maximumWeight)`

Weight is determined using the
 Weigher specified with #weigher, and use of this method requires a
 corresponding call to #weigher prior to calling #build.

 
Note that the cache **may evict an entry before this limit is exceeded**. For example, in
 the current implementation, when concurrencyLevel is greater than 1, each
 resulting segment inside the cache *independently* limits its own weight to approximately
 maximumWeight / concurrencyLevel.

 
When eviction is necessary, the cache evicts entries that are less likely to be used again.
 For example, the cache may evict an entry because it hasn't been used recently or very often.

 
If maximumWeight is zero, elements will be evicted immediately after being loaded
 into cache. This can be useful in testing, or to disable caching temporarily.

 
Note that weight is only used to determine whether the cache is over capacity; it has no
 effect on selecting which entry should be evicted next.

 
This feature cannot be used in conjunction with #maximumSize.

**Parameters:**
- `maximumWeight` (`long`): the maximum total weight of entries the cache may contain

**Returns:** [`com.google.common.cache.CacheBuilder<K,V>`](./CacheBuilder.md)

### `weigher(Weigher<? super K1,? super V1> weigher)`

Entry weight is taken into
 consideration by #maximumWeight(long) when determining which entries to evict, and use
 of this method requires a corresponding call to #maximumWeight(long) prior to calling
 #build. Weights are measured and recorded when entries are inserted into the cache, and
 are thus effectively static during the lifetime of a cache entry.

 
When the weight of an entry is zero it will not be considered for size-based eviction
 (though it still may be evicted by other means).

 
**Important note:** Instead of returning *this* as a CacheBuilder
 instance, this method returns CacheBuilder<K1, V1>. From this point on, either the
 original reference or the returned reference may be used to complete configuration and build
 the cache, but only the "generic" one is type-safe. That is, it will properly prevent you from
 building caches whose key or value types are incompatible with the types accepted by the
 weigher already provided; the CacheBuilder type cannot do this. For best results,
 simply use the standard method-chaining idiom, as illustrated in the documentation at top,
 configuring a CacheBuilder and building your Cache all in a single statement.

 
**Warning:** if you ignore the above advice, and use this CacheBuilder to build a
 cache whose key or value type is incompatible with the weigher, you will likely experience a
 ClassCastException at some *undefined* point in the future.

**Parameters:**
- `weigher` ([`com.google.common.cache.Weigher<? super K1,? super V1>`](./Weigher.md)): the weigher to use in calculating the weight of cache entries

**Returns:** [`com.google.common.cache.CacheBuilder<K1,V1>`](./CacheBuilder.md)

### `getMaximumWeight()`

**Returns:** `long`

### `getWeigher()`

**Returns:** [`com.google.common.cache.Weigher<K1,V1>`](./Weigher.md)

### `weakKeys()`

**Warning:** when this method is used, the resulting cache will use identity (==)
 comparison to determine equality of keys. Its Cache#asMap view will therefore
 technically violate the Map specification (in the same way that IdentityHashMap
 does).

 
Entries with keys that have been garbage collected may be counted in Cache#size, but
 will never be visible to read or write operations; such entries are cleaned up as part of the
 routine maintenance described in the class javadoc.

**Returns:** [`com.google.common.cache.CacheBuilder<K,V>`](./CacheBuilder.md)

### `setKeyStrength(LocalCache.Strength strength)`

**Parameters:**
- `strength` (`com.google.common.cache.LocalCache.Strength`)

**Returns:** [`com.google.common.cache.CacheBuilder<K,V>`](./CacheBuilder.md)

### `getKeyStrength()`

**Returns:** `com.google.common.cache.LocalCache.Strength`

### `weakValues()`

Weak values will be garbage collected once they are weakly reachable. This makes them a poor
 candidate for caching; consider #softValues instead.

 
**Note:** when this method is used, the resulting cache will use identity (==)
 comparison to determine equality of values.

 
Entries with values that have been garbage collected may be counted in Cache#size,
 but will never be visible to read or write operations; such entries are cleaned up as part of
 the routine maintenance described in the class javadoc.

**Returns:** [`com.google.common.cache.CacheBuilder<K,V>`](./CacheBuilder.md)

### `softValues()`

Softly-referenced objects will be
 garbage-collected in a *globally* least-recently-used manner, in response to memory
 demand.

 
**Warning:** in most circumstances it is better to set a per-cache maximum size instead of using soft references. You should only use this
 method if you are well familiar with the practical consequences of soft references.

 
**Note:** when this method is used, the resulting cache will use identity (==)
 comparison to determine equality of values.

 
Entries with values that have been garbage collected may be counted in Cache#size,
 but will never be visible to read or write operations; such entries are cleaned up as part of
 the routine maintenance described in the class javadoc.

**Returns:** [`com.google.common.cache.CacheBuilder<K,V>`](./CacheBuilder.md)

### `setValueStrength(LocalCache.Strength strength)`

**Parameters:**
- `strength` (`com.google.common.cache.LocalCache.Strength`)

**Returns:** [`com.google.common.cache.CacheBuilder<K,V>`](./CacheBuilder.md)

### `getValueStrength()`

**Returns:** `com.google.common.cache.LocalCache.Strength`

### `expireAfterWrite(Duration duration)`

When duration is zero, this method hands off to maximumSize(0), ignoring any otherwise-specified maximum size or weight. This can be
 useful in testing, or to disable caching temporarily without a code change.

 
Expired entries may be counted in Cache#size, but will never be visible to read or
 write operations. Expired entries are cleaned up as part of the routine maintenance described
 in the class javadoc.

**Parameters:**
- `duration` (`java.time.Duration`): the length of time after an entry is created that it should be automatically
       removed

**Returns:** [`com.google.common.cache.CacheBuilder<K,V>`](./CacheBuilder.md)

### `expireAfterWrite(long duration, TimeUnit unit)`

When duration is zero, this method hands off to maximumSize(0), ignoring any otherwise-specified maximum size or weight. This can be
 useful in testing, or to disable caching temporarily without a code change.

 
Expired entries may be counted in Cache#size, but will never be visible to read or
 write operations. Expired entries are cleaned up as part of the routine maintenance described
 in the class javadoc.

 
If you can represent the duration as a java.time.Duration (which should be preferred
 when feasible), use #expireAfterWrite(Duration) instead.

**Parameters:**
- `duration` (`long`): the length of time after an entry is created that it should be automatically
       removed
- `unit` (`java.util.concurrent.TimeUnit`): the unit that duration is expressed in

**Returns:** [`com.google.common.cache.CacheBuilder<K,V>`](./CacheBuilder.md)

### `getExpireAfterWriteNanos()`

**Returns:** `long`

### `expireAfterAccess(Duration duration)`

Access time is reset by all cache read and write operations (including 
 Cache.asMap().get(Object) and Cache.asMap().put(K, V)), but not by 
 containsKey(Object), nor by operations on the collection-views of Cache#asMap}. So,
 for example, iterating through Cache.asMap().entrySet() does not reset access time for
 the entries you retrieve.

 
When duration is zero, this method hands off to maximumSize(0), ignoring any otherwise-specified maximum size or weight. This can be
 useful in testing, or to disable caching temporarily without a code change.

 
Expired entries may be counted in Cache#size, but will never be visible to read or
 write operations. Expired entries are cleaned up as part of the routine maintenance described
 in the class javadoc.

**Parameters:**
- `duration` (`java.time.Duration`): the length of time after an entry is last accessed that it should be
       automatically removed

**Returns:** [`com.google.common.cache.CacheBuilder<K,V>`](./CacheBuilder.md)

### `expireAfterAccess(long duration, TimeUnit unit)`

Access time is reset by all cache read and write operations (including 
 Cache.asMap().get(Object) and Cache.asMap().put(K, V)), but not by 
 containsKey(Object), nor by operations on the collection-views of Cache#asMap. So, for
 example, iterating through Cache.asMap().entrySet() does not reset access time for the
 entries you retrieve.

 
When duration is zero, this method hands off to maximumSize(0), ignoring any otherwise-specified maximum size or weight. This can be
 useful in testing, or to disable caching temporarily without a code change.

 
Expired entries may be counted in Cache#size, but will never be visible to read or
 write operations. Expired entries are cleaned up as part of the routine maintenance described
 in the class javadoc.

 
If you can represent the duration as a java.time.Duration (which should be preferred
 when feasible), use #expireAfterAccess(Duration) instead.

**Parameters:**
- `duration` (`long`): the length of time after an entry is last accessed that it should be
       automatically removed
- `unit` (`java.util.concurrent.TimeUnit`): the unit that duration is expressed in

**Returns:** [`com.google.common.cache.CacheBuilder<K,V>`](./CacheBuilder.md)

### `getExpireAfterAccessNanos()`

**Returns:** `long`

### `refreshAfterWrite(Duration duration)`

The semantics
 of refreshes are specified in LoadingCache#refresh, and are performed by calling CacheLoader#reload.

 
As the default implementation of CacheLoader#reload is synchronous, it is
 recommended that users of this method override CacheLoader#reload with an asynchronous
 implementation; otherwise refreshes will be performed during unrelated cache read and write
 operations.

 
Currently automatic refreshes are performed when the first stale request for an entry
 occurs. The request triggering refresh will make a synchronous call to CacheLoader#reload
 to obtain a future of the new value. If the returned future is already complete, it is returned
 immediately. Otherwise, the old value is returned.

 
**Note:** *all exceptions thrown during refresh will be logged and then swallowed*.

**Parameters:**
- `duration` (`java.time.Duration`): the length of time after an entry is created that it should be considered
       stale, and thus eligible for refresh

**Returns:** [`com.google.common.cache.CacheBuilder<K,V>`](./CacheBuilder.md)

### `refreshAfterWrite(long duration, TimeUnit unit)`

The semantics
 of refreshes are specified in LoadingCache#refresh, and are performed by calling CacheLoader#reload.

 
As the default implementation of CacheLoader#reload is synchronous, it is
 recommended that users of this method override CacheLoader#reload with an asynchronous
 implementation; otherwise refreshes will be performed during unrelated cache read and write
 operations.

 
Currently automatic refreshes are performed when the first stale request for an entry
 occurs. The request triggering refresh will make a synchronous call to CacheLoader#reload
 and immediately return the new value if the returned future is complete, and the old value
 otherwise.

 
**Note:** *all exceptions thrown during refresh will be logged and then swallowed*.

 
If you can represent the duration as a java.time.Duration (which should be preferred
 when feasible), use #refreshAfterWrite(Duration) instead.

**Parameters:**
- `duration` (`long`): the length of time after an entry is created that it should be considered
       stale, and thus eligible for refresh
- `unit` (`java.util.concurrent.TimeUnit`): the unit that duration is expressed in

**Returns:** [`com.google.common.cache.CacheBuilder<K,V>`](./CacheBuilder.md)

### `getRefreshNanos()`

**Returns:** `long`

### `ticker(Ticker ticker)`

By default, System#nanoTime is used.

 
The primary intent of this method is to facilitate testing of caches with a fake or mock
 time source.

**Parameters:**
- `ticker` ([`com.google.common.base.Ticker`](../base/Ticker.md))

**Returns:** [`com.google.common.cache.CacheBuilder<K,V>`](./CacheBuilder.md)

### `getTicker(boolean recordsTime)`

**Parameters:**
- `recordsTime` (`boolean`)

**Returns:** [`com.google.common.base.Ticker`](../base/Ticker.md)

### `removalListener(RemovalListener<? super K1,? super V1> listener)`

Each cache created by this builder will invoke this listener
 as part of the routine maintenance described in the class documentation above.

 
**Warning:** after invoking this method, do not continue to use *this* cache builder
 reference; instead use the reference this method *returns*. At runtime, these point to the
 same instance, but only the returned reference has the correct generic type information to
 ensure type safety. For best results, use the standard method-chaining idiom illustrated in the
 class documentation above, configuring a builder and building your cache in a single statement.
 Failure to heed this advice can result in a ClassCastException being thrown by a cache
 operation at some *undefined* point in the future.

 
**Warning:** any exception thrown by listener will *not* be propagated to
 the Cache user, only logged via a Logger.

**Parameters:**
- `listener` ([`com.google.common.cache.RemovalListener<? super K1,? super V1>`](./RemovalListener.md))

**Returns:** [`com.google.common.cache.CacheBuilder<K1,V1>`](./CacheBuilder.md)

### `getRemovalListener()`

**Returns:** [`com.google.common.cache.RemovalListener<K1,V1>`](./RemovalListener.md)

### `recordStats()`

Without this
 Cache#stats will return zero for all statistics. Note that recording stats requires
 bookkeeping to be performed with each operation, and thus imposes a performance penalty on
 cache operation.

**Returns:** [`com.google.common.cache.CacheBuilder<K,V>`](./CacheBuilder.md)

### `isRecordingStats()`

**Returns:** `boolean`

### `getStatsCounterSupplier()`

**Returns:** [`com.google.common.base.Supplier<? extends com.google.common.cache.AbstractCache.StatsCounter>`](../base/Supplier.md)

### `build(CacheLoader<? super K1,V1> loader)`

If another thread is currently
 loading the value for this key, simply waits for that thread to finish and returns its loaded
 value. Note that multiple threads can concurrently load values for distinct keys.

 
This method does not alter the state of this CacheBuilder instance, so it can be
 invoked again to create multiple independent caches.

**Parameters:**
- `loader` ([`com.google.common.cache.CacheLoader<? super K1,V1>`](./CacheLoader.md)): the cache loader used to obtain new values

**Returns:** [`com.google.common.cache.LoadingCache<K1,V1>`](./LoadingCache.md)

### `build()`

Consider #build(CacheLoader) instead, if it is feasible to implement a 
 CacheLoader.

 
This method does not alter the state of this CacheBuilder instance, so it can be
 invoked again to create multiple independent caches.

**Returns:** [`com.google.common.cache.Cache<K1,V1>`](./Cache.md)

### `checkNonLoadingCache()`

**Returns:** `void`

### `checkWeightWithWeigher()`

**Returns:** `void`

### `toString()`

The exact form of the returned
 string is not specified.

**Returns:** `java.lang.String`

### `toNanosSaturated(Duration duration)`

Instead of throwing ArithmeticException, this method silently saturates to either
 Long#MAX_VALUE or Long#MIN_VALUE. This behavior can be useful when decomposing
 a duration in order to call a legacy API which requires a long, TimeUnit pair.

**Parameters:**
- `duration` (`java.time.Duration`)

**Returns:** `long`

