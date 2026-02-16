# Class: `MapRetrievalCache`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.MapRetrievalCache`

**Extends:** [`com.google.common.graph.MapIteratorCache<K,V>`](./MapIteratorCache.md)

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

A `MapIteratorCache` that adds additional caching. In addition to the caching provided by
 `MapIteratorCache`, this structure caches values for the two most recently retrieved keys.
**Author:** James Sexton

## Fields

### `cacheEntry1`

**Type:** [`com.google.common.graph.MapRetrievalCache.CacheEntry<K,V>`](MapRetrievalCache/CacheEntry.md)

### `cacheEntry2`

**Type:** [`com.google.common.graph.MapRetrievalCache.CacheEntry<K,V>`](MapRetrievalCache/CacheEntry.md)

## Constructors

### `<init>(`java.util.Map<K,V>` backingMap)`

## Methods

### `get(`java.lang.Object` key)`

**Returns:** `V`

### `getIfCached(`java.lang.Object` key)`

**Returns:** `V`

### `clearCache()`

**Returns:** `void`

### `addToCache(`K` key, `V` value)`

**Returns:** `void`

### `addToCache([`com.google.common.graph.MapRetrievalCache.CacheEntry<K,V>`](MapRetrievalCache/CacheEntry.md) entry)`

**Returns:** `void`

