# Class: `CacheBuilder`

**Package:** [`com.google.common.cache`](README.md)

**Fully Qualified Name:** `com.google.common.cache.CacheBuilder`

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

A builder of `LoadingCache` and `Cache` instances.

 <h2>Prefer <a href="https://github.com/ben-manes/caffeine/wiki">Caffeine</a> over Guava's caching
 API</h2>

 <p>The successor to Guava's caching API is <a href="https://github.com/ben-manes/caffeine/wiki">Caffeine</a>. Its API is designed to make it a
 nearly drop-in replacement -- though it requires Java 8 APIs, is not available for Android or
 GWT/j2cl, and may have <a href="https://github.com/ben-manes/caffeine/wiki/Guava">different
 (usually better) behavior</a> when multiple threads attempt concurrent mutations. Its equivalent
 to `CacheBuilder` is its <a href="https://www.javadoc.io/doc/com.github.ben-manes.caffeine/caffeine/latest/com.github.benmanes.caffeine/com/github/benmanes/caffeine/cache/Caffeine.html">`Caffeine`</a> class. Caffeine offers better performance, more features (including asynchronous
 loading), and fewer <a href="https://github.com/google/guava/issues?q=is%3Aopen+is%3Aissue+label%3Apackage%3Dcache+label%3Atype%3Ddefect">bugs</a>.

 <p>Caffeine defines its own interfaces (<a href="https://www.javadoc.io/doc/com.github.ben-manes.caffeine/caffeine/latest/com.github.benmanes.caffeine/com/github/benmanes/caffeine/cache/Cache.html">`Cache`</a>, <a href="https://www.javadoc.io/doc/com.github.ben-manes.caffeine/caffeine/latest/com.github.benmanes.caffeine/com/github/benmanes/caffeine/cache/LoadingCache.html">`LoadingCache`</a>, <a href="https://www.javadoc.io/doc/com.github.ben-manes.caffeine/caffeine/latest/com.github.benmanes.caffeine/com/github/benmanes/caffeine/cache/CacheLoader.html">`CacheLoader`</a>, etc.), so you can use Caffeine without needing to use any Guava types.
 Caffeine's types are better than Guava's, especially for <a href="https://www.javadoc.io/doc/com.github.ben-manes.caffeine/caffeine/latest/com.github.benmanes.caffeine/com/github/benmanes/caffeine/cache/AsyncLoadingCache.html">their
 deep support for asynchronous operations</a>. But if you want to migrate to Caffeine with minimal
 code changes, you can use <a href="https://www.javadoc.io/doc/com.github.ben-manes.caffeine/guava/latest/com.github.benmanes.caffeine.guava/com/github/benmanes/caffeine/guava/CaffeinatedGuava.html">its
 `CaffeinatedGuava` adapter class</a>, which lets you build a Guava `Cache` or a Guava
 `LoadingCache` backed by a Guava `CacheLoader`.

 <p>Caffeine's API for asynchronous operations uses `CompletableFuture`: <a href="https://www.javadoc.io/doc/com.github.ben-manes.caffeine/caffeine/latest/com.github.benmanes.caffeine/com/github/benmanes/caffeine/cache/AsyncLoadingCache.html#get(K)">`AsyncLoadingCache.get`</a> returns a `CompletableFuture`, and implementations of <a href="https://www.javadoc.io/doc/com.github.ben-manes.caffeine/caffeine/latest/com.github.benmanes.caffeine/com/github/benmanes/caffeine/cache/AsyncCacheLoader.html#asyncLoad(K,java.util.concurrent.Executor)">`AsyncCacheLoader.asyncLoad`</a> must return a `CompletableFuture`. Users of Guava's `com.google.common.util.concurrent.ListenableFuture` can adapt between the two `Future`
 types by using <a href="https://github.com/lukas-krecan/future-converter#java8-guava">`net.javacrumbs.futureconverter.java8guava.FutureConverter`</a>.

 <h2>More on `CacheBuilder`</h2>

 `CacheBuilder` builds caches with any combination of the following features:

 <ul>
   <li>automatic loading of entries into the cache
   <li>least-recently-used eviction when a maximum size is exceeded (note that the cache is
       divided into segments, each of which does LRU internally)
   <li>time-based expiration of entries, measured since last access or last write
   <li>keys automatically wrapped in `WeakReference`
   <li>values automatically wrapped in `WeakReference` or `SoftReference`
   <li>notification of evicted (or otherwise removed) entries
   <li>accumulation of cache access statistics
 </ul>

 <p>These features are all optional; caches can be created using all or none of them. By default,
 cache instances created by `CacheBuilder` will not perform any type of eviction.

 <p>Usage example:

 <pre>`LoadingCache<Key, Graph> graphs = CacheBuilder.newBuilder()
     .maximumSize(10000)
     .expireAfterWrite(Duration.ofMinutes(10))
     .removalListener(MY_LISTENER)
     .build(
         new CacheLoader<Key, Graph>() {
           public Graph load(Key key) throws AnyException {
             return createExpensiveGraph(key);
           `
         });
 }</pre>

 <p>Or equivalently,

 <pre>`// In real life this would come from a command-line flag or config file
 String spec = "maximumSize=10000,expireAfterWrite=10m";

 LoadingCache<Key, Graph> graphs = CacheBuilder.from(spec)
     .removalListener(MY_LISTENER)
     .build(
         new CacheLoader<Key, Graph>() {
           public Graph load(Key key) throws AnyException {
             return createExpensiveGraph(key);
           `
         });
 }</pre>

 <p>The returned cache implements all optional operations of the `LoadingCache` and `Cache` interfaces. The `asMap` view (and its collection views) have <i>weakly consistent
 iterators</i>. This means that they are safe for concurrent use, but if other threads modify the
 cache after the iterator is created, it is undefined which of these changes, if any, are
 reflected in that iterator. These iterators never throw `ConcurrentModificationException`.

 <p><b>Note:</b> by default, the returned cache uses equality comparisons (the `Object.equals equals` method) to determine equality for keys or values. However, if `weakKeys` was specified, the cache uses identity (`==`) comparisons instead for keys.
 Likewise, if `weakValues` or `softValues` was specified, the cache uses identity
 comparisons for values.

 <p>Entries are automatically evicted from the cache when any of `maximumSize(long) maximumSize`, `maximumWeight(long) maximumWeight`, `expireAfterWrite expireAfterWrite`, `expireAfterAccess expireAfterAccess`, `weakKeys weakKeys`,
 `weakValues weakValues`, or `softValues softValues` are requested.

 <p>If `maximumSize(long) maximumSize` or `maximumWeight(long) maximumWeight` is
 requested entries may be evicted on each cache modification.

 <p>If `expireAfterWrite expireAfterWrite` or `expireAfterAccess expireAfterAccess`
 is requested entries may be evicted on each cache modification, on occasional cache accesses, or
 on calls to `Cache.cleanUp`. Expired entries may be counted by `Cache.size`, but will
 never be visible to read or write operations.

 <p>If `weakKeys weakKeys`, `weakValues weakValues`, or `softValues softValues` are requested, it is possible for a key or value present in the cache to be reclaimed
 by the garbage collector. Entries with reclaimed keys or values may be removed from the cache on
 each cache modification, on occasional cache accesses, or on calls to `Cache.cleanUp`; such
 entries may be counted in `Cache.size`, but will never be visible to read or write
 operations.

 <p>Certain cache configurations will result in the accrual of periodic maintenance tasks which
 will be performed during write operations, or during occasional read operations in the absence of
 writes. The `Cache.cleanUp` method of the returned cache will also perform maintenance, but
 calling it should not be necessary with a high throughput cache. Only caches built with `removalListener removalListener`, `expireAfterWrite expireAfterWrite`, `expireAfterAccess expireAfterAccess`, `weakKeys weakKeys`, `weakValues weakValues`, or `softValues softValues` perform periodic maintenance.

 <p>The caches produced by `CacheBuilder` are serializable, and the deserialized caches
 retain all the configuration properties of the original cache. Note that the serialized form does
 <i>not</i> include cache contents, but only configuration.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/CachesExplained">caching</a> for a higher-level
 explanation.
@param <K> the most general key type this builder will be able to create caches for. This is
     normally `Object` unless it is constrained by using a method like `#removalListener`. Cache keys may not be null.
@param <V> the most general value type this builder will be able to create caches for. This is
     normally `Object` unless it is constrained by using a method like `#removalListener`. Cache values may not be null.
**Author:** Charles Fry
**Author:** Kevin Bourrillion
**Since:** 10.0

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

**Type:** [`com.google.common.cache.LocalCache.Strength`](LocalCache/Strength.md)

### `valueStrength`

**Type:** [`com.google.common.cache.LocalCache.Strength`](LocalCache/Strength.md)

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

**Returns:** [`com.google.common.cache.CacheBuilder<java.lang.Object,java.lang.Object>`](./CacheBuilder.md)

Constructs a new `CacheBuilder` instance with default settings, including strong keys,
 strong values, and no automatic eviction of any kind.

 <p>Note that while this return type is `CacheBuilder<Object, Object>`, type parameters on
 the `build` methods allow you to create a cache of any key and value type desired.

### `from([`com.google.common.cache.CacheBuilderSpec`](./CacheBuilderSpec.md) spec)`

**Returns:** [`com.google.common.cache.CacheBuilder<java.lang.Object,java.lang.Object>`](./CacheBuilder.md)

Constructs a new `CacheBuilder` instance with the settings specified in `spec`.
**Since:** 12.0

### `from(`java.lang.String` spec)`

**Returns:** [`com.google.common.cache.CacheBuilder<java.lang.Object,java.lang.Object>`](./CacheBuilder.md)

Constructs a new `CacheBuilder` instance with the settings specified in `spec`.
 This is especially useful for command-line configuration of a `CacheBuilder`.
@param spec a String in the format specified by `CacheBuilderSpec`
**Since:** 12.0

### `lenientParsing()`

**Returns:** [`com.google.common.cache.CacheBuilder<K,V>`](./CacheBuilder.md)

Enables lenient parsing. Useful for tests and spec parsing.
@return this `CacheBuilder` instance (for chaining)

### `keyEquivalence([`com.google.common.base.Equivalence<java.lang.Object>`](../base/Equivalence.md) equivalence)`

**Returns:** [`com.google.common.cache.CacheBuilder<K,V>`](./CacheBuilder.md)

Sets a custom `Equivalence` strategy for comparing keys.

 <p>By default, the cache uses `Equivalence.identity` to determine key equality when
 `weakKeys` is specified, and `Equivalence.equals()` otherwise.
@return this `CacheBuilder` instance (for chaining)

### `getKeyEquivalence()`

**Returns:** [`com.google.common.base.Equivalence<java.lang.Object>`](../base/Equivalence.md)

### `valueEquivalence([`com.google.common.base.Equivalence<java.lang.Object>`](../base/Equivalence.md) equivalence)`

**Returns:** [`com.google.common.cache.CacheBuilder<K,V>`](./CacheBuilder.md)

Sets a custom `Equivalence` strategy for comparing values.

 <p>By default, the cache uses `Equivalence.identity` to determine value equality when
 `weakValues` or `softValues` is specified, and `Equivalence.equals()`
 otherwise.
@return this `CacheBuilder` instance (for chaining)

### `getValueEquivalence()`

**Returns:** [`com.google.common.base.Equivalence<java.lang.Object>`](../base/Equivalence.md)

### `initialCapacity(`int` initialCapacity)`

**Returns:** [`com.google.common.cache.CacheBuilder<K,V>`](./CacheBuilder.md)

Sets the minimum total size for the internal hash tables. For example, if the initial capacity
 is `60`, and the concurrency level is `8`, then eight segments are created, each
 having a hash table of size eight. Providing a large enough estimate at construction time
 avoids the need for expensive resizing operations later, but setting this value unnecessarily
 high wastes memory.
@return this `CacheBuilder` instance (for chaining)
@throws IllegalArgumentException if `initialCapacity` is negative
@throws IllegalStateException if an initial capacity was already set

### `getInitialCapacity()`

**Returns:** `int`

### `concurrencyLevel(`int` concurrencyLevel)`

**Returns:** [`com.google.common.cache.CacheBuilder<K,V>`](./CacheBuilder.md)

Guides the allowed concurrency among update operations. Used as a hint for internal sizing. The
 table is internally partitioned to try to permit the indicated number of concurrent updates
 without contention. Because assignment of entries to these partitions is not necessarily
 uniform, the actual concurrency observed may vary. Ideally, you should choose a value to
 accommodate as many threads as will ever concurrently modify the table. Using a significantly
 higher value than you need can waste space and time, and a significantly lower value can lead
 to thread contention. But overestimates and underestimates within an order of magnitude do not
 usually have much noticeable impact. A value of one permits only one thread to modify the cache
 at a time, but since read operations and cache loading computations can proceed concurrently,
 this still yields higher concurrency than full synchronization.

 <p>Defaults to 4. <b>Note:</b>The default may change in the future. If you care about this
 value, you should always choose it explicitly.

 <p>The current implementation uses the concurrency level to create a fixed number of hashtable
 segments, each governed by its own write lock. The segment lock is taken once for each explicit
 write, and twice for each cache loading computation (once prior to loading the new value, and
 once after loading completes). Much internal cache management is performed at the segment
 granularity. For example, access queues and write queues are kept per segment when they are
 required by the selected eviction algorithm. As such, when writing unit tests it is not
 uncommon to specify `concurrencyLevel(1)` in order to achieve more deterministic eviction
 behavior.

 <p>Note that future implementations may abandon segment locking in favor of more advanced
 concurrency controls.
@return this `CacheBuilder` instance (for chaining)
@throws IllegalArgumentException if `concurrencyLevel` is nonpositive
@throws IllegalStateException if a concurrency level was already set

### `getConcurrencyLevel()`

**Returns:** `int`

### `maximumSize(`long` maximumSize)`

**Returns:** [`com.google.common.cache.CacheBuilder<K,V>`](./CacheBuilder.md)

Specifies the maximum number of entries the cache may contain.

 <p>Note that the cache <b>may evict an entry before this limit is exceeded</b>. For example, in
 the current implementation, when `concurrencyLevel` is greater than `1`, each
 resulting segment inside the cache <i>independently</i> limits its own size to approximately
 `maximumSize / concurrencyLevel`.

 <p>When eviction is necessary, the cache evicts entries that are less likely to be used again.
 For example, the cache may evict an entry because it hasn't been used recently or very often.

 <p>If `maximumSize` is zero, elements will be evicted immediately after being loaded into
 cache. This can be useful in testing, or to disable caching temporarily.

 <p>This feature cannot be used in conjunction with `maximumWeight`.
@param maximumSize the maximum size of the cache
@return this `CacheBuilder` instance (for chaining)
@throws IllegalArgumentException if `maximumSize` is negative
@throws IllegalStateException if a maximum size or weight was already set

### `maximumWeight(`long` maximumWeight)`

**Returns:** [`com.google.common.cache.CacheBuilder<K,V>`](./CacheBuilder.md)

Specifies the maximum weight of entries the cache may contain. Weight is determined using the
 `Weigher` specified with `weigher`, and use of this method requires a
 corresponding call to `weigher` prior to calling `build`.

 <p>Note that the cache <b>may evict an entry before this limit is exceeded</b>. For example, in
 the current implementation, when `concurrencyLevel` is greater than `1`, each
 resulting segment inside the cache <i>independently</i> limits its own weight to approximately
 `maximumWeight / concurrencyLevel`.

 <p>When eviction is necessary, the cache evicts entries that are less likely to be used again.
 For example, the cache may evict an entry because it hasn't been used recently or very often.

 <p>If `maximumWeight` is zero, elements will be evicted immediately after being loaded
 into cache. This can be useful in testing, or to disable caching temporarily.

 <p>Note that weight is only used to determine whether the cache is over capacity; it has no
 effect on selecting which entry should be evicted next.

 <p>This feature cannot be used in conjunction with `maximumSize`.
@param maximumWeight the maximum total weight of entries the cache may contain
@return this `CacheBuilder` instance (for chaining)
@throws IllegalArgumentException if `maximumWeight` is negative
@throws IllegalStateException if a maximum weight or size was already set
**Since:** 11.0

### `weigher([`com.google.common.cache.Weigher<? super K1,? super V1>`](./Weigher.md) weigher)`

**Returns:** [`com.google.common.cache.CacheBuilder<K1,V1>`](./CacheBuilder.md)

Specifies the weigher to use in determining the weight of entries. Entry weight is taken into
 consideration by `maximumWeight(long)` when determining which entries to evict, and use
 of this method requires a corresponding call to `maximumWeight(long)` prior to calling
 `build`. Weights are measured and recorded when entries are inserted into the cache, and
 are thus effectively static during the lifetime of a cache entry.

 <p>When the weight of an entry is zero it will not be considered for size-based eviction
 (though it still may be evicted by other means).

 <p><b>Important note:</b> Instead of returning <em>this</em> as a `CacheBuilder`
 instance, this method returns `CacheBuilder<K1, V1>`. From this point on, either the
 original reference or the returned reference may be used to complete configuration and build
 the cache, but only the "generic" one is type-safe. That is, it will properly prevent you from
 building caches whose key or value types are incompatible with the types accepted by the
 weigher already provided; the `CacheBuilder` type cannot do this. For best results,
 simply use the standard method-chaining idiom, as illustrated in the documentation at top,
 configuring a `CacheBuilder` and building your `Cache` all in a single statement.

 <p><b>Warning:</b> if you ignore the above advice, and use this `CacheBuilder` to build a
 cache whose key or value type is incompatible with the weigher, you will likely experience a
 `ClassCastException` at some <i>undefined</i> point in the future.
@param weigher the weigher to use in calculating the weight of cache entries
@return this `CacheBuilder` instance (for chaining)
@throws IllegalStateException if a weigher was already set or `maximumSize` was
     previously called
**Since:** 11.0

### `getMaximumWeight()`

**Returns:** `long`

### `getWeigher()`

**Returns:** [`com.google.common.cache.Weigher<K1,V1>`](./Weigher.md)

### `weakKeys()`

**Returns:** [`com.google.common.cache.CacheBuilder<K,V>`](./CacheBuilder.md)

Specifies that each key (not value) stored in the cache should be wrapped in a `WeakReference` (by default, strong references are used).

 <p><b>Warning:</b> when this method is used, the resulting cache will use identity (`==`)
 comparison to determine equality of keys. Its `Cache.asMap` view will therefore
 technically violate the `Map` specification (in the same way that `IdentityHashMap`
 does).

 <p>Entries with keys that have been garbage collected may be counted in `Cache.size`, but
 will never be visible to read or write operations; such entries are cleaned up as part of the
 routine maintenance described in the class javadoc.
@return this `CacheBuilder` instance (for chaining)
@throws IllegalStateException if the key strength was already set

### `setKeyStrength([`com.google.common.cache.LocalCache.Strength`](LocalCache/Strength.md) strength)`

**Returns:** [`com.google.common.cache.CacheBuilder<K,V>`](./CacheBuilder.md)

### `getKeyStrength()`

**Returns:** [`com.google.common.cache.LocalCache.Strength`](LocalCache/Strength.md)

### `weakValues()`

**Returns:** [`com.google.common.cache.CacheBuilder<K,V>`](./CacheBuilder.md)

Specifies that each value (not key) stored in the cache should be wrapped in a `WeakReference` (by default, strong references are used).

 <p>Weak values will be garbage collected once they are weakly reachable. This makes them a poor
 candidate for caching; consider `softValues` instead.

 <p><b>Note:</b> when this method is used, the resulting cache will use identity (`==`)
 comparison to determine equality of values.

 <p>Entries with values that have been garbage collected may be counted in `Cache.size`,
 but will never be visible to read or write operations; such entries are cleaned up as part of
 the routine maintenance described in the class javadoc.
@return this `CacheBuilder` instance (for chaining)
@throws IllegalStateException if the value strength was already set

### `softValues()`

**Returns:** [`com.google.common.cache.CacheBuilder<K,V>`](./CacheBuilder.md)

Specifies that each value (not key) stored in the cache should be wrapped in a `SoftReference` (by default, strong references are used). Softly-referenced objects will be
 garbage-collected in a <i>globally</i> least-recently-used manner, in response to memory
 demand.

 <p><b>Warning:</b> in most circumstances it is better to set a per-cache maximum size instead of using soft references. You should only use this
 method if you are well familiar with the practical consequences of soft references.

 <p><b>Note:</b> when this method is used, the resulting cache will use identity (`==`)
 comparison to determine equality of values.

 <p>Entries with values that have been garbage collected may be counted in `Cache.size`,
 but will never be visible to read or write operations; such entries are cleaned up as part of
 the routine maintenance described in the class javadoc.
@return this `CacheBuilder` instance (for chaining)
@throws IllegalStateException if the value strength was already set

### `setValueStrength([`com.google.common.cache.LocalCache.Strength`](LocalCache/Strength.md) strength)`

**Returns:** [`com.google.common.cache.CacheBuilder<K,V>`](./CacheBuilder.md)

### `getValueStrength()`

**Returns:** [`com.google.common.cache.LocalCache.Strength`](LocalCache/Strength.md)

### `expireAfterWrite(`java.time.Duration` duration)`

**Returns:** [`com.google.common.cache.CacheBuilder<K,V>`](./CacheBuilder.md)

Specifies that each entry should be automatically removed from the cache once a fixed duration
 has elapsed after the entry's creation, or the most recent replacement of its value.

 <p>When `duration` is zero, this method hands off to `maximumSize(long) maximumSize``(0)`, ignoring any otherwise-specified maximum size or weight. This can be
 useful in testing, or to disable caching temporarily without a code change.

 <p>Expired entries may be counted in `Cache.size`, but will never be visible to read or
 write operations. Expired entries are cleaned up as part of the routine maintenance described
 in the class javadoc.
@param duration the length of time after an entry is created that it should be automatically
     removed
@return this `CacheBuilder` instance (for chaining)
@throws IllegalArgumentException if `duration` is negative
@throws IllegalStateException if `expireAfterWrite` was already set
@throws ArithmeticException for durations greater than +/- approximately 292 years
**Since:** 25.0

### `expireAfterWrite(`long` duration, `java.util.concurrent.TimeUnit` unit)`

**Returns:** [`com.google.common.cache.CacheBuilder<K,V>`](./CacheBuilder.md)

Specifies that each entry should be automatically removed from the cache once a fixed duration
 has elapsed after the entry's creation, or the most recent replacement of its value.

 <p>When `duration` is zero, this method hands off to `maximumSize(long) maximumSize``(0)`, ignoring any otherwise-specified maximum size or weight. This can be
 useful in testing, or to disable caching temporarily without a code change.

 <p>Expired entries may be counted in `Cache.size`, but will never be visible to read or
 write operations. Expired entries are cleaned up as part of the routine maintenance described
 in the class javadoc.

 <p>If you can represent the duration as a `java.time.Duration` (which should be preferred
 when feasible), use `expireAfterWrite(Duration)` instead.
@param duration the length of time after an entry is created that it should be automatically
     removed
@param unit the unit that `duration` is expressed in
@return this `CacheBuilder` instance (for chaining)
@throws IllegalArgumentException if `duration` is negative
@throws IllegalStateException if `expireAfterWrite` was already set

### `getExpireAfterWriteNanos()`

**Returns:** `long`

### `expireAfterAccess(`java.time.Duration` duration)`

**Returns:** [`com.google.common.cache.CacheBuilder<K,V>`](./CacheBuilder.md)

Specifies that each entry should be automatically removed from the cache once a fixed duration
 has elapsed after the entry's creation, the most recent replacement of its value, or its last
 access. Access time is reset by all cache read and write operations (including `Cache.asMap().get(Object)` and `Cache.asMap().put(K, V)`), but not by `containsKey(Object)`, nor by operations on the collection-views of `Cache.asMap`}. So,
 for example, iterating through `Cache.asMap().entrySet()` does not reset access time for
 the entries you retrieve.

 <p>When `duration` is zero, this method hands off to `maximumSize(long) maximumSize``(0)`, ignoring any otherwise-specified maximum size or weight. This can be
 useful in testing, or to disable caching temporarily without a code change.

 <p>Expired entries may be counted in `Cache.size`, but will never be visible to read or
 write operations. Expired entries are cleaned up as part of the routine maintenance described
 in the class javadoc.
@param duration the length of time after an entry is last accessed that it should be
     automatically removed
@return this `CacheBuilder` instance (for chaining)
@throws IllegalArgumentException if `duration` is negative
@throws IllegalStateException if `expireAfterAccess` was already set
@throws ArithmeticException for durations greater than +/- approximately 292 years
**Since:** 25.0

### `expireAfterAccess(`long` duration, `java.util.concurrent.TimeUnit` unit)`

**Returns:** [`com.google.common.cache.CacheBuilder<K,V>`](./CacheBuilder.md)

Specifies that each entry should be automatically removed from the cache once a fixed duration
 has elapsed after the entry's creation, the most recent replacement of its value, or its last
 access. Access time is reset by all cache read and write operations (including `Cache.asMap().get(Object)` and `Cache.asMap().put(K, V)`), but not by `containsKey(Object)`, nor by operations on the collection-views of `Cache.asMap`. So, for
 example, iterating through `Cache.asMap().entrySet()` does not reset access time for the
 entries you retrieve.

 <p>When `duration` is zero, this method hands off to `maximumSize(long) maximumSize``(0)`, ignoring any otherwise-specified maximum size or weight. This can be
 useful in testing, or to disable caching temporarily without a code change.

 <p>Expired entries may be counted in `Cache.size`, but will never be visible to read or
 write operations. Expired entries are cleaned up as part of the routine maintenance described
 in the class javadoc.

 <p>If you can represent the duration as a `java.time.Duration` (which should be preferred
 when feasible), use `expireAfterAccess(Duration)` instead.
@param duration the length of time after an entry is last accessed that it should be
     automatically removed
@param unit the unit that `duration` is expressed in
@return this `CacheBuilder` instance (for chaining)
@throws IllegalArgumentException if `duration` is negative
@throws IllegalStateException if `expireAfterAccess` was already set

### `getExpireAfterAccessNanos()`

**Returns:** `long`

### `refreshAfterWrite(`java.time.Duration` duration)`

**Returns:** [`com.google.common.cache.CacheBuilder<K,V>`](./CacheBuilder.md)

Specifies that active entries are eligible for automatic refresh once a fixed duration has
 elapsed after the entry's creation, or the most recent replacement of its value. The semantics
 of refreshes are specified in `LoadingCache.refresh`, and are performed by calling `CacheLoader.reload`.

 <p>As the default implementation of `CacheLoader.reload` is synchronous, it is
 recommended that users of this method override `CacheLoader.reload` with an asynchronous
 implementation; otherwise refreshes will be performed during unrelated cache read and write
 operations.

 <p>Currently automatic refreshes are performed when the first stale request for an entry
 occurs. The request triggering refresh will make a synchronous call to `CacheLoader.reload`
 to obtain a future of the new value. If the returned future is already complete, it is returned
 immediately. Otherwise, the old value is returned.

 <p><b>Note:</b> <i>all exceptions thrown during refresh will be logged and then swallowed</i>.
@param duration the length of time after an entry is created that it should be considered
     stale, and thus eligible for refresh
@return this `CacheBuilder` instance (for chaining)
@throws IllegalArgumentException if `duration` is negative
@throws IllegalStateException if `refreshAfterWrite` was already set
@throws ArithmeticException for durations greater than +/- approximately 292 years
**Since:** 25.0

### `refreshAfterWrite(`long` duration, `java.util.concurrent.TimeUnit` unit)`

**Returns:** [`com.google.common.cache.CacheBuilder<K,V>`](./CacheBuilder.md)

Specifies that active entries are eligible for automatic refresh once a fixed duration has
 elapsed after the entry's creation, or the most recent replacement of its value. The semantics
 of refreshes are specified in `LoadingCache.refresh`, and are performed by calling `CacheLoader.reload`.

 <p>As the default implementation of `CacheLoader.reload` is synchronous, it is
 recommended that users of this method override `CacheLoader.reload` with an asynchronous
 implementation; otherwise refreshes will be performed during unrelated cache read and write
 operations.

 <p>Currently automatic refreshes are performed when the first stale request for an entry
 occurs. The request triggering refresh will make a synchronous call to `CacheLoader.reload`
 and immediately return the new value if the returned future is complete, and the old value
 otherwise.

 <p><b>Note:</b> <i>all exceptions thrown during refresh will be logged and then swallowed</i>.

 <p>If you can represent the duration as a `java.time.Duration` (which should be preferred
 when feasible), use `refreshAfterWrite(Duration)` instead.
@param duration the length of time after an entry is created that it should be considered
     stale, and thus eligible for refresh
@param unit the unit that `duration` is expressed in
@return this `CacheBuilder` instance (for chaining)
@throws IllegalArgumentException if `duration` is negative
@throws IllegalStateException if `refreshAfterWrite` was already set
**Since:** 11.0

### `getRefreshNanos()`

**Returns:** `long`

### `ticker([`com.google.common.base.Ticker`](../base/Ticker.md) ticker)`

**Returns:** [`com.google.common.cache.CacheBuilder<K,V>`](./CacheBuilder.md)

Specifies a nanosecond-precision time source for this cache. By default, `System.nanoTime` is used.

 <p>The primary intent of this method is to facilitate testing of caches with a fake or mock
 time source.
@return this `CacheBuilder` instance (for chaining)
@throws IllegalStateException if a ticker was already set

### `getTicker(`boolean` recordsTime)`

**Returns:** [`com.google.common.base.Ticker`](../base/Ticker.md)

### `removalListener([`com.google.common.cache.RemovalListener<? super K1,? super V1>`](./RemovalListener.md) listener)`

**Returns:** [`com.google.common.cache.CacheBuilder<K1,V1>`](./CacheBuilder.md)

Specifies a listener instance that caches should notify each time an entry is removed for any
 reason. Each cache created by this builder will invoke this listener
 as part of the routine maintenance described in the class documentation above.

 <p><b>Warning:</b> after invoking this method, do not continue to use <i>this</i> cache builder
 reference; instead use the reference this method <i>returns</i>. At runtime, these point to the
 same instance, but only the returned reference has the correct generic type information to
 ensure type safety. For best results, use the standard method-chaining idiom illustrated in the
 class documentation above, configuring a builder and building your cache in a single statement.
 Failure to heed this advice can result in a `ClassCastException` being thrown by a cache
 operation at some <i>undefined</i> point in the future.

 <p><b>Warning:</b> any exception thrown by `listener` will <i>not</i> be propagated to
 the `Cache` user, only logged via a `Logger`.
@return the cache builder reference that should be used instead of `this` for any
     remaining configuration and cache building
@return this `CacheBuilder` instance (for chaining)
@throws IllegalStateException if a removal listener was already set

### `getRemovalListener()`

**Returns:** [`com.google.common.cache.RemovalListener<K1,V1>`](./RemovalListener.md)

### `recordStats()`

**Returns:** [`com.google.common.cache.CacheBuilder<K,V>`](./CacheBuilder.md)

Enable the accumulation of `CacheStats` during the operation of the cache. Without this
 `Cache.stats` will return zero for all statistics. Note that recording stats requires
 bookkeeping to be performed with each operation, and thus imposes a performance penalty on
 cache operation.
@return this `CacheBuilder` instance (for chaining)
**Since:** 12.0 (previously, stats collection was automatic)

### `isRecordingStats()`

**Returns:** `boolean`

### `getStatsCounterSupplier()`

**Returns:** [`com.google.common.base.Supplier<? extends com.google.common.cache.AbstractCache.StatsCounter>`](../base/Supplier.md)

### `build([`com.google.common.cache.CacheLoader<? super K1,V1>`](./CacheLoader.md) loader)`

**Returns:** [`com.google.common.cache.LoadingCache<K1,V1>`](./LoadingCache.md)

Builds a cache, which either returns an already-loaded value for a given key or atomically
 computes or retrieves it using the supplied `CacheLoader`. If another thread is currently
 loading the value for this key, simply waits for that thread to finish and returns its loaded
 value. Note that multiple threads can concurrently load values for distinct keys.

 <p>This method does not alter the state of this `CacheBuilder` instance, so it can be
 invoked again to create multiple independent caches.
@param loader the cache loader used to obtain new values
@return a cache having the requested features

### `build()`

**Returns:** [`com.google.common.cache.Cache<K1,V1>`](./Cache.md)

Builds a cache which does not automatically load values when keys are requested.

 <p>Consider `build(CacheLoader)` instead, if it is feasible to implement a `CacheLoader`.

 <p>This method does not alter the state of this `CacheBuilder` instance, so it can be
 invoked again to create multiple independent caches.
@return a cache having the requested features
**Since:** 11.0

### `checkNonLoadingCache()`

**Returns:** `void`

### `checkWeightWithWeigher()`

**Returns:** `void`

### `toString()`

**Returns:** `java.lang.String`

Returns a string representation for this CacheBuilder instance. The exact form of the returned
 string is not specified.

### `toNanosSaturated(`java.time.Duration` duration)`

**Returns:** `long`

Returns the number of nanoseconds of the given duration without throwing or overflowing.

 <p>Instead of throwing `ArithmeticException`, this method silently saturates to either
 `Long.MAX_VALUE` or `Long.MIN_VALUE`. This behavior can be useful when decomposing
 a duration in order to call a legacy API which requires a `long, TimeUnit` pair.

