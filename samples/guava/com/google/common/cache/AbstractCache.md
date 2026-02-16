# Class: `AbstractCache`

**Package:** [`com.google.common.cache`](README.md)

**Fully Qualified Name:** `com.google.common.cache.AbstractCache`

**Implements:** [`com.google.common.cache.Cache<K,V>`](./Cache.md)

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

This class provides a skeletal implementation of the {@code Cache} interface to minimize the
 effort required to implement this interface.

 <p>To implement a cache, the programmer needs only to extend this class and provide an
 implementation for the {@link #put} and {@link #getIfPresent} methods. {@link #getAllPresent} is
 implemented in terms of {@link #getIfPresent}; {@link #putAll} is implemented in terms of {@link #put}, {@link #invalidateAll(Iterable)} is implemented in terms of {@link #invalidate}. The
 method {@link #cleanUp} is a no-op. All other methods throw an {@link UnsupportedOperationException}.
@author Charles Fry
@since 10.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `get([`K`](K.md) key, [`java.util.concurrent.Callable<? extends V>`](../../../../java/util/concurrent/Callable.md) valueLoader)`

**Returns:** [`V`](V.md)

@since 11.0

### `getAllPresent(`java.lang.Iterable<? extends java.lang.Object>` keys)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](../collect/ImmutableMap.md)

{@inheritDoc}

 <p>This implementation of {@code getAllPresent} lacks any insight into the internal cache data
 structure, and is thus forced to return the query keys instead of the cached keys. This is only
 possible with an unsafe cast which requires {@code keys} to actually be of type {@code K}.
@since 11.0

### `put([`K`](K.md) key, [`V`](V.md) value)`

**Returns:** `void`

@since 11.0

### `putAll([`java.util.Map<? extends K,? extends V>`](../../../../java/util/Map.md) m)`

**Returns:** `void`

@since 12.0

### `cleanUp()`

**Returns:** `void`

### `size()`

**Returns:** `long`

### `invalidate(`java.lang.Object` key)`

**Returns:** `void`

### `invalidateAll(`java.lang.Iterable<? extends java.lang.Object>` keys)`

**Returns:** `void`

@since 11.0

### `invalidateAll()`

**Returns:** `void`

### `stats()`

**Returns:** [`com.google.common.cache.CacheStats`](./CacheStats.md)

### `asMap()`

**Returns:** [`java.util.concurrent.ConcurrentMap<K,V>`](../../../../java/util/concurrent/ConcurrentMap.md)

