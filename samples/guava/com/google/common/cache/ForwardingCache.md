# Class: `ForwardingCache`

**Package:** [`com.google.common.cache`](README.md)

**Fully Qualified Name:** `com.google.common.cache.ForwardingCache`

**Extends:** [`com.google.common.collect.ForwardingObject`](../collect/ForwardingObject.md)

**Implements:** [`com.google.common.cache.Cache<K,V>`](./Cache.md)

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

Subclasses should override one or
 more methods to modify the behavior of the backing cache as desired per the [decorator pattern](http://en.wikipedia.org/wiki/Decorator_pattern).

## Constructors

### `<init>()`

## Methods

### `delegate()`

**Returns:** [`com.google.common.cache.Cache<K,V>`](./Cache.md)

### `getIfPresent(java.lang.Object key)`

**Returns:** `V`

**Parameters:**
- `key` (`java.lang.Object`)

### `get(K key, java.util.concurrent.Callable<? extends V> valueLoader)`

**Returns:** `V`

**Parameters:**
- `key` (`K`)
- `valueLoader` (`java.util.concurrent.Callable<? extends V>`)

### `getAllPresent(java.lang.Iterable<? extends java.lang.Object> keys)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](../collect/ImmutableMap.md)

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

### `asMap()`

**Returns:** `java.util.concurrent.ConcurrentMap<K,V>`

### `cleanUp()`

**Returns:** `void`

