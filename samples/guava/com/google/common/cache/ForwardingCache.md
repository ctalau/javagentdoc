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

### `getIfPresent(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `V`

### `get(K key, Callable<? extends V> valueLoader)`

**Parameters:**
- `key` (`K`)
- `valueLoader` (`java.util.concurrent.Callable<? extends V>`)

**Returns:** `V`

### `getAllPresent(Iterable<? extends Object> keys)`

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

### `size()`

**Returns:** `long`

### `stats()`

**Returns:** [`com.google.common.cache.CacheStats`](./CacheStats.md)

### `asMap()`

**Returns:** `java.util.concurrent.ConcurrentMap<K,V>`

### `cleanUp()`

**Returns:** `void`

