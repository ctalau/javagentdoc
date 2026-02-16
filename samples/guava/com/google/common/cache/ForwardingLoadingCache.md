# Class: `ForwardingLoadingCache`

**Package:** [`com.google.common.cache`](README.md)

**Fully Qualified Name:** `com.google.common.cache.ForwardingLoadingCache`

**Extends:** [`com.google.common.cache.ForwardingCache<K,V>`](./ForwardingCache.md)

**Implements:** [`com.google.common.cache.LoadingCache<K,V>`](./LoadingCache.md)

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

A cache which forwards all its method calls to another cache. Subclasses should override one or
 more methods to modify the behavior of the backing cache as desired per the <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.

 <p>Note that `get`, `getUnchecked`, and `apply` all expose the same
 underlying functionality, so should probably be overridden as a group.
**Author:** Charles Fry
**Since:** 11.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `delegate()`

**Returns:** [`com.google.common.cache.LoadingCache<K,V>`](./LoadingCache.md)

### `get(`K` key)`

**Returns:** `V`

### `getUnchecked(`K` key)`

**Returns:** `V`

### `getAll(`java.lang.Iterable<? extends K>` keys)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](../collect/ImmutableMap.md)

### `apply(`K` key)`

**Returns:** `V`

### `refresh(`K` key)`

**Returns:** `void`

