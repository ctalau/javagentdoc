# Class: `MapIteratorCache`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.MapIteratorCache`

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

By design, the cache is cleared when this structure is mutated. If
 this structure is never mutated, it provides a thread-safe view of the backing map.

 
The MapIteratorCache assumes ownership of the backing map, and cannot guarantee
 correctness in the face of external mutations to the backing map. As such, it is **strongly**
 recommended that the caller does not persist a reference to the backing map (unless the backing
 map is immutable).

 
This class is tailored toward use cases in common.graph. It is *NOT* a general purpose map.

## Fields

### `backingMap`

**Type:** `java.util.Map<K,V>`

### `cacheEntry`

**Type:** `java.util.Map.Entry<K,V>`

## Constructors

### `<init>(Map<K,V> backingMap)`

**Parameters:**
- `backingMap` (`java.util.Map<K,V>`)

## Methods

### `put(K key, V value)`

**Parameters:**
- `key` (`K`)
- `value` (`V`)

**Returns:** `V`

### `remove(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `V`

### `clear()`

**Returns:** `void`

### `get(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `V`

### `getWithoutCaching(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `V`

### `containsKey(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `boolean`

### `unmodifiableKeySet()`

**Returns:** `java.util.Set<K>`

### `getIfCached(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `V`

### `clearCache()`

**Returns:** `void`

