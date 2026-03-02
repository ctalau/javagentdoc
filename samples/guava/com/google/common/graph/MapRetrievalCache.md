# Class: `MapRetrievalCache`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.MapRetrievalCache`

**Extends:** [`com.google.common.graph.MapIteratorCache<K,V>`](./MapIteratorCache.md)

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

In addition to the caching provided by
 MapIteratorCache, this structure caches values for the two most recently retrieved keys.

## Fields

### `cacheEntry1`

**Type:** `com.google.common.graph.MapRetrievalCache.CacheEntry<K,V>`

### `cacheEntry2`

**Type:** `com.google.common.graph.MapRetrievalCache.CacheEntry<K,V>`

## Constructors

### `<init>(Map<K,V> backingMap)`

**Parameters:**
- `backingMap` (`java.util.Map<K,V>`)

## Methods

### `get(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `V`

### `getIfCached(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `V`

### `clearCache()`

**Returns:** `void`

### `addToCache(K key, V value)`

**Parameters:**
- `key` (`K`)
- `value` (`V`)

**Returns:** `void`

### `addToCache(MapRetrievalCache.CacheEntry<K,V> entry)`

**Parameters:**
- `entry` (`com.google.common.graph.MapRetrievalCache.CacheEntry<K,V>`)

**Returns:** `void`

