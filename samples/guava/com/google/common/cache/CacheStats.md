# Class: `CacheStats`

**Package:** [`com.google.common.cache`](README.md)

**Fully Qualified Name:** `com.google.common.cache.CacheStats`

## Description

Statistics about the performance of a `Cache`. Instances of this class are immutable.

 <p>Cache statistics are incremented according to the following rules:

 <ul>
   <li>When a cache lookup encounters an existing cache entry `hitCount` is incremented.
   <li>When a cache lookup first encounters a missing cache entry, a new entry is loaded.
       <ul>
         <li>After successfully loading an entry `missCount` and `loadSuccessCount`
             are incremented, and the total loading time, in nanoseconds, is added to `totalLoadTime`.
         <li>When an exception is thrown while loading an entry, `missCount` and `loadExceptionCount` are incremented, and the total loading time, in nanoseconds, is
             added to `totalLoadTime`.
         <li>Cache lookups that encounter a missing cache entry that is still loading will wait
             for loading to complete (whether successful or not) and then increment `missCount`.
       </ul>
   <li>When an entry is evicted from the cache, `evictionCount` is incremented.
   <li>No stats are modified when a cache entry is invalidated or manually removed.
   <li>No stats are modified by operations invoked on the asMap view of
       the cache.
 </ul>

 <p>A lookup is specifically defined as an invocation of one of the methods `LoadingCache.get(Object)`, `LoadingCache.getUnchecked(Object)`, `Cache.get(Object,
 Callable)`, or `LoadingCache.getAll(Iterable)`.
**Author:** Charles Fry
**Since:** 10.0

## Fields

### `hitCount`

**Type:** `long`

### `missCount`

**Type:** `long`

### `loadSuccessCount`

**Type:** `long`

### `loadExceptionCount`

**Type:** `long`

### `totalLoadTime`

**Type:** `long`

### `evictionCount`

**Type:** `long`

## Constructors

### `<init>(`long` hitCount, `long` missCount, `long` loadSuccessCount, `long` loadExceptionCount, `long` totalLoadTime, `long` evictionCount)`

Constructs a new `CacheStats` instance.

 <p>Five parameters of the same type in a row is a bad thing, but this class is not constructed
 by end users and is too fine-grained for a builder.

## Methods

### `requestCount()`

**Returns:** `long`

Returns the number of times `Cache` lookup methods have returned either a cached or
 uncached value. This is defined as `hitCount + missCount`.

 <p><b>Note:</b> the values of the metrics are undefined in case of overflow (though it is
 guaranteed not to throw an exception). If you require specific handling, we recommend
 implementing your own stats collector.

### `hitCount()`

**Returns:** `long`

Returns the number of times `Cache` lookup methods have returned a cached value.

### `hitRate()`

**Returns:** `double`

Returns the ratio of cache requests which were hits. This is defined as `hitCount /
 requestCount`, or `1.0` when `requestCount == 0`. Note that `hitRate +
 missRate =~ 1.0`.

### `missCount()`

**Returns:** `long`

Returns the number of times `Cache` lookup methods have returned an uncached (newly
 loaded) value, or null. Multiple concurrent calls to `Cache` lookup methods on an absent
 value can result in multiple misses, all returning the results of a single cache load
 operation.

### `missRate()`

**Returns:** `double`

Returns the ratio of cache requests which were misses. This is defined as `missCount /
 requestCount`, or `0.0` when `requestCount == 0`. Note that `hitRate +
 missRate =~ 1.0`. Cache misses include all requests which weren't cache hits, including
 requests which resulted in either successful or failed loading attempts, and requests which
 waited for other threads to finish loading. It is thus the case that `missCount &gt;=
 loadSuccessCount + loadExceptionCount`. Multiple concurrent misses for the same key will result
 in a single load operation.

### `loadCount()`

**Returns:** `long`

Returns the total number of times that `Cache` lookup methods attempted to load new
 values. This includes both successful load operations and those that threw exceptions. This is
 defined as `loadSuccessCount + loadExceptionCount`.

 <p><b>Note:</b> the values of the metrics are undefined in case of overflow (though it is
 guaranteed not to throw an exception). If you require specific handling, we recommend
 implementing your own stats collector.

### `loadSuccessCount()`

**Returns:** `long`

Returns the number of times `Cache` lookup methods have successfully loaded a new value.
 This is usually incremented in conjunction with `missCount`, though `missCount` is
 also incremented when an exception is encountered during cache loading (see `loadExceptionCount`). Multiple concurrent misses for the same key will result in a single load
 operation. This may be incremented not in conjunction with `missCount` if the load occurs
 as a result of a refresh or if the cache loader returned more items than was requested. `missCount` may also be incremented not in conjunction with this (nor `loadExceptionCount`) on calls to `getIfPresent`.

### `loadExceptionCount()`

**Returns:** `long`

Returns the number of times `Cache` lookup methods threw an exception while loading a new
 value. This is usually incremented in conjunction with `missCount`, though `missCount` is also incremented when cache loading completes successfully (see `loadSuccessCount`). Multiple concurrent misses for the same key will result in a single load
 operation. This may be incremented not in conjunction with `missCount` if the load occurs
 as a result of a refresh or if the cache loader returned more items than was requested. `missCount` may also be incremented not in conjunction with this (nor `loadSuccessCount`)
 on calls to `getIfPresent`.

### `loadExceptionRate()`

**Returns:** `double`

Returns the ratio of cache loading attempts which threw exceptions. This is defined as `loadExceptionCount / (loadSuccessCount + loadExceptionCount)`, or `0.0` when `loadSuccessCount + loadExceptionCount == 0`.

 <p><b>Note:</b> the values of the metrics are undefined in case of overflow (though it is
 guaranteed not to throw an exception). If you require specific handling, we recommend
 implementing your own stats collector.

### `totalLoadTime()`

**Returns:** `long`

Returns the total number of nanoseconds the cache has spent loading new values. This can be
 used to calculate the miss penalty. This value is increased every time `loadSuccessCount`
 or `loadExceptionCount` is incremented.

### `averageLoadPenalty()`

**Returns:** `double`

Returns the average time spent loading new values. This is defined as `totalLoadTime /
 (loadSuccessCount + loadExceptionCount)`.

 <p><b>Note:</b> the values of the metrics are undefined in case of overflow (though it is
 guaranteed not to throw an exception). If you require specific handling, we recommend
 implementing your own stats collector.

### `evictionCount()`

**Returns:** `long`

Returns the number of times an entry has been evicted. This count does not include manual
 invalidations.

### `minus([`com.google.common.cache.CacheStats`](./CacheStats.md) other)`

**Returns:** [`com.google.common.cache.CacheStats`](./CacheStats.md)

Returns a new `CacheStats` representing the difference between this `CacheStats`
 and `other`. Negative values, which aren't supported by `CacheStats` will be
 rounded up to zero.

### `plus([`com.google.common.cache.CacheStats`](./CacheStats.md) other)`

**Returns:** [`com.google.common.cache.CacheStats`](./CacheStats.md)

Returns a new `CacheStats` representing the sum of this `CacheStats` and `other`.

 <p><b>Note:</b> the values of the metrics are undefined in case of overflow (though it is
 guaranteed not to throw an exception). If you require specific handling, we recommend
 implementing your own stats collector.
**Since:** 11.0

### `hashCode()`

**Returns:** `int`

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

### `toString()`

**Returns:** `java.lang.String`

