# Class: `ForwardingCache`

**Package:** [`com.google.common.cache`](README.md)

**Fully Qualified Name:** `com.google.common.cache.ForwardingCache`

**Extends:** [`com.google.common.collect.ForwardingObject`](../collect/ForwardingObject.md)

**Implements:** [`com.google.common.cache.Cache<K,V>`](./Cache.md)

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

A cache which forwards all its method calls to another cache. Subclasses should override one or
 more methods to modify the behavior of the backing cache as desired per the <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.
**Author:** Charles Fry
**Since:** 10.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `delegate()`

**Returns:** [`com.google.common.cache.Cache<K,V>`](./Cache.md)

### `getIfPresent(`java.lang.Object` key)`

**Returns:** `V`

**Since:** 11.0

### `get(`K` key, `java.util.concurrent.Callable<? extends V>` valueLoader)`

**Returns:** `V`

**Since:** 11.0

### `getAllPresent(`java.lang.Iterable<? extends java.lang.Object>` keys)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](../collect/ImmutableMap.md)

**Since:** 11.0

### `put(`K` key, `V` value)`

**Returns:** `void`

**Since:** 11.0

### `putAll(`java.util.Map<? extends K,? extends V>` m)`

**Returns:** `void`

**Since:** 12.0

### `invalidate(`java.lang.Object` key)`

**Returns:** `void`

### `invalidateAll(`java.lang.Iterable<? extends java.lang.Object>` keys)`

**Returns:** `void`

**Since:** 11.0

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

