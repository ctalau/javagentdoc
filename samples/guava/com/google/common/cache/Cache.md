# Interface: `Cache`

**Package:** [`com.google.common.cache`](README.md)

**Fully Qualified Name:** `com.google.common.cache.Cache`

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

A semi-persistent mapping from keys to values. Cache entries are manually added using `get(Object, Callable)` or `put(Object, Object)`, and are stored in the cache until either
 evicted or manually invalidated. The common way to build instances is using `CacheBuilder`.

 <p>Implementations of this interface are expected to be thread-safe, and can be safely accessed
 by multiple concurrent threads.
@param <K> the type of the cache's keys, which are not permitted to be null
@param <V> the type of the cache's values, which are not permitted to be null
**Author:** Charles Fry
**Since:** 10.0

## Methods

### `getIfPresent(`java.lang.Object` key)`

**Returns:** `V`

Returns the value associated with `key` in this cache, or `null` if there is no
 cached value for `key`.
**Since:** 11.0

### `get(`K` key, `java.util.concurrent.Callable<? extends V>` loader)`

**Returns:** `V`

Returns the value associated with `key` in this cache, obtaining that value from `loader` if necessary. The method improves upon the conventional "if cached, return; otherwise
 create, cache and return" pattern. For further improvements, use `LoadingCache` and its
 `LoadingCache.get(Object) get(K)` method instead of this one.

 <p>Among the improvements that this method and `LoadingCache.get(K)` both provide are:

 <ul>
   <li>awaiting the result of a pending load rather than
       starting a redundant one
   <li>eliminating the error-prone caching boilerplate
   <li>tracking load statistics
 </ul>

 <p>Among the further improvements that `LoadingCache` can provide but this method cannot:

 <ul>
   <li>consolidation of the loader logic to a single
       authoritative location
   <li>refreshing of entries, including automated refreshing
   <li>bulk loading requests, including bulk loading implementations
 </ul>

 <p><b>Warning:</b> For any given key, every `loader` used with it should compute the same
 value. Otherwise, a call that passes one `loader` may return the result of another call
 with a differently behaving `loader`. For example, a call that requests a short timeout
 for an RPC may wait for a similar call that requests a long timeout, or a call by an
 unprivileged user may return a resource accessible only to a privileged user making a similar
 call. To prevent this problem, create a key object that includes all values that affect the
 result of the query. Or use `LoadingCache.get(K)`, which lacks the ability to refer to
 state other than that in the key.

 <p><b>Warning:</b> as with `CacheLoader.load`, `loader` <b>must not</b> return
 `null`; it may either return a non-null value or throw an exception.

 <p>No observable state associated with this cache is modified until loading completes.
@throws ExecutionException if a checked exception was thrown while loading the value
@throws UncheckedExecutionException if an unchecked exception was thrown while loading the
     value
@throws ExecutionError if an error was thrown while loading the value
**Since:** 11.0

### `getAllPresent(`java.lang.Iterable<? extends java.lang.Object>` keys)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](../collect/ImmutableMap.md)

Returns a map of the values associated with `keys` in this cache. The returned map will
 only contain entries which are already present in the cache.
**Since:** 11.0

### `put(`K` key, `V` value)`

**Returns:** `void`

Associates `value` with `key` in this cache. If the cache previously contained a
 value associated with `key`, the old value is replaced by `value`.

 <p>Prefer `get(Object, Callable)` when using the conventional "if cached, return;
 otherwise create, cache and return" pattern.
**Since:** 11.0

### `putAll(`java.util.Map<? extends K,? extends V>` m)`

**Returns:** `void`

Copies all of the mappings from the specified map to the cache. The effect of this call is
 equivalent to that of calling `put(k, v)` on this map once for each mapping from key
 `k` to value `v` in the specified map. The behavior of this operation is undefined
 if the specified map is modified while the operation is in progress.
**Since:** 12.0

### `invalidate(`java.lang.Object` key)`

**Returns:** `void`

Discards any cached value for key `key`.

### `invalidateAll(`java.lang.Iterable<? extends java.lang.Object>` keys)`

**Returns:** `void`

Discards any cached values for keys `keys`.
**Since:** 11.0

### `invalidateAll()`

**Returns:** `void`

Discards all entries in the cache.

### `size()`

**Returns:** `long`

Returns the approximate number of entries in this cache.

### `stats()`

**Returns:** [`com.google.common.cache.CacheStats`](./CacheStats.md)

Returns a current snapshot of this cache's cumulative statistics, or a set of default values if
 the cache is not recording statistics. All statistics begin at zero and never decrease over the
 lifetime of the cache.

 <p><b>Warning:</b> this cache may not be recording statistical data. For example, a cache
 created using `CacheBuilder` only does so if the `CacheBuilder.recordStats` method
 was called. If statistics are not being recorded, a `CacheStats` instance with zero for
 all values is returned.

### `asMap()`

**Returns:** `java.util.concurrent.ConcurrentMap<K,V>`

Returns a view of the entries stored in this cache as a thread-safe map. Modifications made to
 the map directly affect the cache.

 <p>Iterators from the returned map are at least <i>weakly consistent</i>: they are safe for
 concurrent use, but if the cache is modified (including by eviction) after the iterator is
 created, it is undefined which of the changes (if any) will be reflected in that iterator.

### `cleanUp()`

**Returns:** `void`

Performs any pending maintenance operations needed by the cache. Exactly which activities are
 performed -- if any -- is implementation-dependent.

