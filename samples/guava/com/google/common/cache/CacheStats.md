# Class: `CacheStats`

**Package:** [`com.google.common.cache`](README.md)

**Fully Qualified Name:** `com.google.common.cache.CacheStats`

## Description

Instances of this class are immutable.

 
Cache statistics are incremented according to the following rules:

 

   - When a cache lookup encounters an existing cache entry hitCount is incremented.
   - When a cache lookup first encounters a missing cache entry, a new entry is loaded.
       

         - After successfully loading an entry missCount and loadSuccessCount
             are incremented, and the total loading time, in nanoseconds, is added to 
             totalLoadTime.
         - When an exception is thrown while loading an entry, missCount and 
             loadExceptionCount are incremented, and the total loading time, in nanoseconds, is
             added to totalLoadTime.
         - Cache lookups that encounter a missing cache entry that is still loading will wait
             for loading to complete (whether successful or not) and then increment 
             missCount.
       

   - When an entry is evicted from the cache, evictionCount is incremented.
   - No stats are modified when a cache entry is invalidated or manually removed.
   - No stats are modified by operations invoked on the asMap view of
       the cache.
 


 
A lookup is specifically defined as an invocation of one of the methods LoadingCache#get(Object), LoadingCache#getUnchecked(Object), Cache#get(Object,
 Callable), or LoadingCache#getAll(Iterable).

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

### `<init>(long hitCount, long missCount, long loadSuccessCount, long loadExceptionCount, long totalLoadTime, long evictionCount)`

Five parameters of the same type in a row is a bad thing, but this class is not constructed
 by end users and is too fine-grained for a builder.

**Parameters:**
- `hitCount` (`long`)
- `missCount` (`long`)
- `loadSuccessCount` (`long`)
- `loadExceptionCount` (`long`)
- `totalLoadTime` (`long`)
- `evictionCount` (`long`)

## Methods

### `requestCount()`

This is defined as hitCount + missCount.

 
**Note:** the values of the metrics are undefined in case of overflow (though it is
 guaranteed not to throw an exception). If you require specific handling, we recommend
 implementing your own stats collector.

**Returns:** `long`

### `hitCount()`

**Returns:** `long`

### `hitRate()`

This is defined as hitCount /
 requestCount, or 1.0 when requestCount == 0. Note that hitRate +
 missRate =~ 1.0.

**Returns:** `double`

### `missCount()`

Multiple concurrent calls to Cache lookup methods on an absent
 value can result in multiple misses, all returning the results of a single cache load
 operation.

**Returns:** `long`

### `missRate()`

This is defined as missCount /
 requestCount, or 0.0 when requestCount == 0. Note that hitRate +
 missRate =~ 1.0. Cache misses include all requests which weren't cache hits, including
 requests which resulted in either successful or failed loading attempts, and requests which
 waited for other threads to finish loading. It is thus the case that missCount &gt;=
 loadSuccessCount + loadExceptionCount. Multiple concurrent misses for the same key will result
 in a single load operation.

**Returns:** `double`

### `loadCount()`

This includes both successful load operations and those that threw exceptions. This is
 defined as loadSuccessCount + loadExceptionCount.

 
**Note:** the values of the metrics are undefined in case of overflow (though it is
 guaranteed not to throw an exception). If you require specific handling, we recommend
 implementing your own stats collector.

**Returns:** `long`

### `loadSuccessCount()`

This is usually incremented in conjunction with #missCount, though missCount is
 also incremented when an exception is encountered during cache loading (see #loadExceptionCount). Multiple concurrent misses for the same key will result in a single load
 operation. This may be incremented not in conjunction with missCount if the load occurs
 as a result of a refresh or if the cache loader returned more items than was requested. 
 missCount may also be incremented not in conjunction with this (nor #loadExceptionCount) on calls to getIfPresent.

**Returns:** `long`

### `loadExceptionCount()`

This is usually incremented in conjunction with missCount, though 
 missCount is also incremented when cache loading completes successfully (see #loadSuccessCount). Multiple concurrent misses for the same key will result in a single load
 operation. This may be incremented not in conjunction with missCount if the load occurs
 as a result of a refresh or if the cache loader returned more items than was requested. 
 missCount may also be incremented not in conjunction with this (nor #loadSuccessCount)
 on calls to getIfPresent.

**Returns:** `long`

### `loadExceptionRate()`

This is defined as 
 loadExceptionCount / (loadSuccessCount + loadExceptionCount), or 0.0 when 
 loadSuccessCount + loadExceptionCount == 0.

 
**Note:** the values of the metrics are undefined in case of overflow (though it is
 guaranteed not to throw an exception). If you require specific handling, we recommend
 implementing your own stats collector.

**Returns:** `double`

### `totalLoadTime()`

This can be
 used to calculate the miss penalty. This value is increased every time loadSuccessCount
 or loadExceptionCount is incremented.

**Returns:** `long`

### `averageLoadPenalty()`

This is defined as totalLoadTime /
 (loadSuccessCount + loadExceptionCount).

 
**Note:** the values of the metrics are undefined in case of overflow (though it is
 guaranteed not to throw an exception). If you require specific handling, we recommend
 implementing your own stats collector.

**Returns:** `double`

### `evictionCount()`

This count does not include manual
 invalidations.

**Returns:** `long`

### `minus(CacheStats other)`

Negative values, which aren't supported by CacheStats will be
 rounded up to zero.

**Parameters:**
- `other` ([`com.google.common.cache.CacheStats`](./CacheStats.md))

**Returns:** [`com.google.common.cache.CacheStats`](./CacheStats.md)

### `plus(CacheStats other)`

**Note:** the values of the metrics are undefined in case of overflow (though it is
 guaranteed not to throw an exception). If you require specific handling, we recommend
 implementing your own stats collector.

**Parameters:**
- `other` ([`com.google.common.cache.CacheStats`](./CacheStats.md))

**Returns:** [`com.google.common.cache.CacheStats`](./CacheStats.md)

### `hashCode()`

**Returns:** `int`

### `equals(Object object)`

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `toString()`

**Returns:** `java.lang.String`

