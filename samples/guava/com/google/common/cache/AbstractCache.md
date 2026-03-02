# Class: `AbstractCache`

**Package:** [`com.google.common.cache`](README.md)

**Fully Qualified Name:** `com.google.common.cache.AbstractCache`

**Implements:** [`com.google.common.cache.Cache<K,V>`](./Cache.md)

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

To implement a cache, the programmer needs only to extend this class and provide an
 implementation for the #put and #getIfPresent methods. #getAllPresent is
 implemented in terms of #getIfPresent; #putAll is implemented in terms of #put, #invalidateAll(Iterable) is implemented in terms of #invalidate. The
 method #cleanUp is a no-op. All other methods throw an UnsupportedOperationException.

## Constructors

### `<init>()`

## Methods

### `get(K key, java.util.concurrent.Callable<? extends V> valueLoader)`

**Returns:** `V`

**Parameters:**
- `key` (`K`)
- `valueLoader` (`java.util.concurrent.Callable<? extends V>`)

### `getAllPresent(java.lang.Iterable<? extends java.lang.Object> keys)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](../collect/ImmutableMap.md)

This implementation of getAllPresent lacks any insight into the internal cache data
 structure, and is thus forced to return the query keys instead of the cached keys. This is only
 possible with an unsafe cast which requires keys to actually be of type K.

**Parameters:**
- `keys` (`java.lang.Iterable<? extends java.lang.Object>`)

### `put(K key, V value)`

**Returns:** `void`

**Parameters:**
- `key` (`K`)
- `value` (`V`)

### `putAll(java.util.Map<? extends K,? extends V> m)`

**Returns:** `void`

**Parameters:**
- `m` (`java.util.Map<? extends K,? extends V>`)

### `cleanUp()`

**Returns:** `void`

### `size()`

**Returns:** `long`

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

### `stats()`

**Returns:** [`com.google.common.cache.CacheStats`](./CacheStats.md)

### `asMap()`

**Returns:** `java.util.concurrent.ConcurrentMap<K,V>`

