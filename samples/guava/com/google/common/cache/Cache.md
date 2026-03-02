# Interface: `Cache`

**Package:** [`com.google.common.cache`](README.md)

**Fully Qualified Name:** `com.google.common.cache.Cache`

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

Cache entries are manually added using #get(Object, Callable) or #put(Object, Object), and are stored in the cache until either
 evicted or manually invalidated. The common way to build instances is using CacheBuilder.

 
Implementations of this interface are expected to be thread-safe, and can be safely accessed
 by multiple concurrent threads.

## Methods

### `getIfPresent(java.lang.Object key)`

**Returns:** `V`

**Parameters:**
- `key` (`java.lang.Object`)

### `get(K key, java.util.concurrent.Callable<? extends V> loader)`

**Returns:** `V`

The method improves upon the conventional "if cached, return; otherwise
 create, cache and return" pattern. For further improvements, use LoadingCache and its
 get(K) method instead of this one.

 
Among the improvements that this method and LoadingCache.get(K) both provide are:

 

   - awaiting the result of a pending load rather than
       starting a redundant one
   - eliminating the error-prone caching boilerplate
   - tracking load statistics
 


 
Among the further improvements that LoadingCache can provide but this method cannot:

 

   - consolidation of the loader logic to a single
       authoritative location
   - refreshing of entries, including automated refreshing
   - bulk loading requests, including bulk loading implementations
 


 
**Warning:** For any given key, every loader used with it should compute the same
 value. Otherwise, a call that passes one loader may return the result of another call
 with a differently behaving loader. For example, a call that requests a short timeout
 for an RPC may wait for a similar call that requests a long timeout, or a call by an
 unprivileged user may return a resource accessible only to a privileged user making a similar
 call. To prevent this problem, create a key object that includes all values that affect the
 result of the query. Or use LoadingCache.get(K), which lacks the ability to refer to
 state other than that in the key.

 
**Warning:** as with CacheLoader#load, loader **must not** return
 null; it may either return a non-null value or throw an exception.

 
No observable state associated with this cache is modified until loading completes.

**Parameters:**
- `key` (`K`)
- `loader` (`java.util.concurrent.Callable<? extends V>`)

### `getAllPresent(java.lang.Iterable<? extends java.lang.Object> keys)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](../collect/ImmutableMap.md)

The returned map will
 only contain entries which are already present in the cache.

**Parameters:**
- `keys` (`java.lang.Iterable<? extends java.lang.Object>`)

### `put(K key, V value)`

**Returns:** `void`

If the cache previously contained a
 value associated with key, the old value is replaced by value.

 
Prefer #get(Object, Callable) when using the conventional "if cached, return;
 otherwise create, cache and return" pattern.

**Parameters:**
- `key` (`K`)
- `value` (`V`)

### `putAll(java.util.Map<? extends K,? extends V> m)`

**Returns:** `void`

The effect of this call is
 equivalent to that of calling put(k, v) on this map once for each mapping from key
 k to value v in the specified map. The behavior of this operation is undefined
 if the specified map is modified while the operation is in progress.

**Parameters:**
- `m` (`java.util.Map<? extends K,? extends V>`)

### `invalidate(java.lang.Object key)`

**Returns:** `void`

**Parameters:**
- `key` (`java.lang.Object`)

### `invalidateAll(java.lang.Iterable<? extends java.lang.Object> keys)`

**Returns:** `void`

**Parameters:**
- `keys` (`java.lang.Iterable<? extends java.lang.Object>`)

### `invalidateAll()`

**Returns:** `void`

### `size()`

**Returns:** `long`

### `stats()`

**Returns:** [`com.google.common.cache.CacheStats`](./CacheStats.md)

All statistics begin at zero and never decrease over the
 lifetime of the cache.

 
**Warning:** this cache may not be recording statistical data. For example, a cache
 created using CacheBuilder only does so if the CacheBuilder#recordStats method
 was called. If statistics are not being recorded, a CacheStats instance with zero for
 all values is returned.

### `asMap()`

**Returns:** `java.util.concurrent.ConcurrentMap<K,V>`

Modifications made to
 the map directly affect the cache.

 
Iterators from the returned map are at least *weakly consistent*: they are safe for
 concurrent use, but if the cache is modified (including by eviction) after the iterator is
 created, it is undefined which of the changes (if any) will be reflected in that iterator.

### `cleanUp()`

**Returns:** `void`

Exactly which activities are
 performed -- if any -- is implementation-dependent.

