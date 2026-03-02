# Class: `ForwardingLoadingCache`

**Package:** [`com.google.common.cache`](README.md)

**Fully Qualified Name:** `com.google.common.cache.ForwardingLoadingCache`

**Extends:** [`com.google.common.cache.ForwardingCache<K,V>`](./ForwardingCache.md)

**Implements:** [`com.google.common.cache.LoadingCache<K,V>`](./LoadingCache.md)

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

Subclasses should override one or
 more methods to modify the behavior of the backing cache as desired per the [decorator pattern](http://en.wikipedia.org/wiki/Decorator_pattern).

 
Note that #get, #getUnchecked, and #apply all expose the same
 underlying functionality, so should probably be overridden as a group.

## Constructors

### `<init>()`

## Methods

### `delegate()`

**Returns:** [`com.google.common.cache.LoadingCache<K,V>`](./LoadingCache.md)

### `get(K key)`

**Parameters:**
- `key` (`K`)

**Returns:** `V`

### `getUnchecked(K key)`

**Parameters:**
- `key` (`K`)

**Returns:** `V`

### `getAll(Iterable<? extends K> keys)`

**Parameters:**
- `keys` (`java.lang.Iterable<? extends K>`)

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](../collect/ImmutableMap.md)

### `apply(K key)`

**Parameters:**
- `key` (`K`)

**Returns:** `V`

### `refresh(K key)`

**Parameters:**
- `key` (`K`)

**Returns:** `void`

