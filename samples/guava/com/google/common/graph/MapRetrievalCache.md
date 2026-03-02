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

### `<init>(java.util.Map<K,V> backingMap)`

**Parameters:**
- `backingMap` (`java.util.Map<K,V>`)

## Methods

### `get(java.lang.Object key)`

**Returns:** `V`

**Parameters:**
- `key` (`java.lang.Object`)

### `getIfCached(java.lang.Object key)`

**Returns:** `V`

**Parameters:**
- `key` (`java.lang.Object`)

### `clearCache()`

**Returns:** `void`

### `addToCache(K key, V value)`

**Returns:** `void`

**Parameters:**
- `key` (`K`)
- `value` (`V`)

### `addToCache(com.google.common.graph.MapRetrievalCache.CacheEntry<K,V> entry)`

**Returns:** `void`

**Parameters:**
- `entry` (`com.google.common.graph.MapRetrievalCache.CacheEntry<K,V>`)

