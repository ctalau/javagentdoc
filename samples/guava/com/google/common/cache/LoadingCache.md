# Interface: `LoadingCache`

**Package:** [`com.google.common.cache`](README.md)

**Fully Qualified Name:** `com.google.common.cache.LoadingCache`

**Extends:** [`com.google.common.cache.Cache<K,V>`](./Cache.md), [`com.google.common.base.Function<K,V>`](../base/Function.md)

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

Values are automatically loaded by the cache, and
 are stored in the cache until either evicted or manually invalidated. The common way to build
 instances is using CacheBuilder.

 
Implementations of this interface are expected to be thread-safe, and can be safely accessed
 by multiple concurrent threads.

 
When evaluated as a Function, a cache yields the same result as invoking #getUnchecked.

## Methods

### `get(K key)`

**Returns:** `V`

No observable state associated with this cache is modified until loading completes.

 
If another call to #get or #getUnchecked is currently loading the value for
 key, simply waits for that thread to finish and returns its loaded value. Note that
 multiple threads can concurrently load values for distinct keys.

 
Caches loaded by a CacheLoader will call CacheLoader#load to load new values
 into the cache. Newly loaded values are added to the cache using 
 Cache.asMap().putIfAbsent after loading has completed; if another value was associated with
 key while the new value was loading then a removal notification will be sent for the
 new value.

 
If the cache loader associated with this cache is known not to throw checked exceptions,
 then prefer #getUnchecked over this method.

**Parameters:**
- `key` (`K`)

### `getUnchecked(K key)`

**Returns:** `V`

No observable state associated with this cache is modified until loading completes.
 Unlike #get, this method does not throw a checked exception, and thus should only be
 used in situations where checked exceptions are not thrown by the cache loader.

 
If another call to #get or #getUnchecked is currently loading the value for
 key, simply waits for that thread to finish and returns its loaded value. Note that
 multiple threads can concurrently load values for distinct keys.

 
Caches loaded by a CacheLoader will call CacheLoader#load to load new values
 into the cache. Newly loaded values are added to the cache using 
 Cache.asMap().putIfAbsent after loading has completed; if another value was associated with
 key while the new value was loading then a removal notification will be sent for the
 new value.

 
**Warning:** this method silently converts checked exceptions to unchecked exceptions,
 and should not be used with cache loaders which throw checked exceptions. In such cases use
 #get instead.

**Parameters:**
- `key` (`K`)

### `getAll(java.lang.Iterable<? extends K> keys)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](../collect/ImmutableMap.md)

The returned map contains entries that were already cached, combined with newly
 loaded entries; it will never contain null keys or values.

 
Caches loaded by a CacheLoader will issue a single request to CacheLoader#loadAll for all keys which are not already present in the cache. All entries
 returned by CacheLoader#loadAll will be stored in the cache, over-writing any
 previously cached values. This method will throw an exception if CacheLoader#loadAll
 returns null, returns a map containing null keys or values, or fails to return an entry
 for each requested key.

 
Note that duplicate elements in keys, as determined by Object#equals, will
 be ignored.

**Parameters:**
- `keys` (`java.lang.Iterable<? extends K>`)

### `apply(K key)`

**Returns:** `V`

**Parameters:**
- `key` (`K`)

### `refresh(K key)`

**Returns:** `void`

While the new value is loading the
 previous value (if any) will continue to be returned by get(key) unless it is evicted.
 If the new value is loaded successfully it will replace the previous value in the cache; if an
 exception is thrown while refreshing the previous value will remain, *and the exception will
 be logged (using java.util.logging.Logger) and swallowed*.

 
Caches loaded by a CacheLoader will call CacheLoader#reload if the cache
 currently contains a value for key, and CacheLoader#load otherwise. Loading is
 asynchronous only if CacheLoader#reload was overridden with an asynchronous
 implementation.

 
Returns without doing anything if another thread is currently loading the value for 
 key. If the cache loader associated with this cache performs refresh asynchronously then this
 method may return before refresh completes.

**Parameters:**
- `key` (`K`)

### `asMap()`

**Returns:** `java.util.concurrent.ConcurrentMap<K,V>`

**Note that although the view *is* modifiable, no method on the returned map will ever
 cause entries to be automatically loaded.**

