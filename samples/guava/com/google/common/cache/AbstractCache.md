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

### `get(K key, Callable<? extends V> valueLoader)`

**Parameters:**
- `key` (`K`)
- `valueLoader` (`java.util.concurrent.Callable<? extends V>`)

**Returns:** `V`

### `getAllPresent(Iterable<? extends Object> keys)`

This implementation of getAllPresent lacks any insight into the internal cache data
 structure, and is thus forced to return the query keys instead of the cached keys. This is only
 possible with an unsafe cast which requires keys to actually be of type K.

**Parameters:**
- `keys` (`java.lang.Iterable<? extends java.lang.Object>`)

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](../collect/ImmutableMap.md)

### `put(K key, V value)`

**Parameters:**
- `key` (`K`)
- `value` (`V`)

**Returns:** `void`

### `putAll(Map<? extends K,? extends V> m)`

**Parameters:**
- `m` (`java.util.Map<? extends K,? extends V>`)

**Returns:** `void`

### `cleanUp()`

**Returns:** `void`

### `size()`

**Returns:** `long`

### `invalidate(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `void`

### `invalidateAll(Iterable<? extends Object> keys)`

**Parameters:**
- `keys` (`java.lang.Iterable<? extends java.lang.Object>`)

**Returns:** `void`

### `invalidateAll()`

**Returns:** `void`

### `stats()`

**Returns:** [`com.google.common.cache.CacheStats`](./CacheStats.md)

### `asMap()`

**Returns:** `java.util.concurrent.ConcurrentMap<K,V>`

