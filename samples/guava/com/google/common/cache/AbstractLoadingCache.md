# Class: `AbstractLoadingCache`

**Package:** [`com.google.common.cache`](README.md)

**Fully Qualified Name:** `com.google.common.cache.AbstractLoadingCache`

**Extends:** [`com.google.common.cache.AbstractCache<K,V>`](./AbstractCache.md)

**Implements:** [`com.google.common.cache.LoadingCache<K,V>`](./LoadingCache.md)

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

This class provides a skeletal implementation of the `Cache` interface to minimize the
 effort required to implement this interface.

 <p>To implement a cache, the programmer needs only to extend this class and provide an
 implementation for the `get(Object)` and `getIfPresent` methods. `getUnchecked`, `get(Object, Callable)`, and `getAll` are implemented in terms of
 `get`; `getAllPresent` is implemented in terms of `getIfPresent`; `putAll` is implemented in terms of `put`, `invalidateAll(Iterable)` is implemented
 in terms of `invalidate`. The method `cleanUp` is a no-op. All other methods throw
 an `UnsupportedOperationException`.
**Author:** Charles Fry
**Since:** 11.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `getUnchecked(`K` key)`

**Returns:** `V`

### `getAll(`java.lang.Iterable<? extends K>` keys)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](../collect/ImmutableMap.md)

### `apply(`K` key)`

**Returns:** `V`

### `refresh(`K` key)`

**Returns:** `void`

