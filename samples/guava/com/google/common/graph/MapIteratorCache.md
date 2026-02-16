# Class: `MapIteratorCache`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.MapIteratorCache`

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

A map-like data structure that wraps a backing map and caches values while iterating through
 `unmodifiableKeySet()`. By design, the cache is cleared when this structure is mutated. If
 this structure is never mutated, it provides a thread-safe view of the backing map.

 <p>The `MapIteratorCache` assumes ownership of the backing map, and cannot guarantee
 correctness in the face of external mutations to the backing map. As such, it is <b>strongly</b>
 recommended that the caller does not persist a reference to the backing map (unless the backing
 map is immutable).

 <p>This class is tailored toward use cases in common.graph. It is *NOT* a general purpose map.
**Author:** James Sexton

## Fields

### `backingMap`

**Type:** `java.util.Map<K,V>`

### `cacheEntry`

**Type:** `java.util.Map.Entry<K,V>`

## Constructors

### `<init>(`java.util.Map<K,V>` backingMap)`

## Methods

### `put(`K` key, `V` value)`

**Returns:** `V`

### `remove(`java.lang.Object` key)`

**Returns:** `V`

### `clear()`

**Returns:** `void`

### `get(`java.lang.Object` key)`

**Returns:** `V`

### `getWithoutCaching(`java.lang.Object` key)`

**Returns:** `V`

### `containsKey(`java.lang.Object` key)`

**Returns:** `boolean`

### `unmodifiableKeySet()`

**Returns:** `java.util.Set<K>`

### `getIfCached(`java.lang.Object` key)`

**Returns:** `V`

### `clearCache()`

**Returns:** `void`

