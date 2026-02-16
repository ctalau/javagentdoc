# Class: `MapIteratorCache`

**Package:** [`com.google.common.graph`](README.md)

**Fully Qualified Name:** `com.google.common.graph.MapIteratorCache`

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

A map-like data structure that wraps a backing map and caches values while iterating through
 {@link #unmodifiableKeySet()}. By design, the cache is cleared when this structure is mutated. If
 this structure is never mutated, it provides a thread-safe view of the backing map.

 <p>The {@link MapIteratorCache} assumes ownership of the backing map, and cannot guarantee
 correctness in the face of external mutations to the backing map. As such, it is <b>strongly</b>
 recommended that the caller does not persist a reference to the backing map (unless the backing
 map is immutable).

 <p>This class is tailored toward use cases in common.graph. It is *NOT* a general purpose map.
@author James Sexton

## Fields

### `backingMap`

**Type:** [`java.util.Map<K,V>`](../../../../java/util/Map.md)

### `cacheEntry`

**Type:** [`java.util.Map.Entry<K,V>`](../../../../java/util/Map/Entry.md)

## Constructors

### `<init>([`java.util.Map<K,V>`](../../../../java/util/Map.md) backingMap)`

## Methods

### `put([`K`](K.md) key, [`V`](V.md) value)`

**Returns:** [`V`](V.md)

### `remove(`java.lang.Object` key)`

**Returns:** [`V`](V.md)

### `clear()`

**Returns:** `void`

### `get(`java.lang.Object` key)`

**Returns:** [`V`](V.md)

### `getWithoutCaching(`java.lang.Object` key)`

**Returns:** [`V`](V.md)

### `containsKey(`java.lang.Object` key)`

**Returns:** `boolean`

### `unmodifiableKeySet()`

**Returns:** [`java.util.Set<K>`](../../../../java/util/Set.md)

### `getIfCached(`java.lang.Object` key)`

**Returns:** [`V`](V.md)

### `clearCache()`

**Returns:** `void`

