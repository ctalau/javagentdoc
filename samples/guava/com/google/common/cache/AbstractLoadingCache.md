# Class: `AbstractLoadingCache`

**Package:** [`com.google.common.cache`](README.md)

**Fully Qualified Name:** `com.google.common.cache.AbstractLoadingCache`

**Extends:** [`com.google.common.cache.AbstractCache<K,V>`](./AbstractCache.md)

**Implements:** [`com.google.common.cache.LoadingCache<K,V>`](./LoadingCache.md)

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

This class provides a skeletal implementation of the {@code Cache} interface to minimize the
 effort required to implement this interface.

 <p>To implement a cache, the programmer needs only to extend this class and provide an
 implementation for the {@link #get(Object)} and {@link #getIfPresent} methods. {@link #getUnchecked}, {@link #get(Object, Callable)}, and {@link #getAll} are implemented in terms of
 {@code get}; {@link #getAllPresent} is implemented in terms of {@code getIfPresent}; {@link #putAll} is implemented in terms of {@link #put}, {@link #invalidateAll(Iterable)} is implemented
 in terms of {@link #invalidate}. The method {@link #cleanUp} is a no-op. All other methods throw
 an {@link UnsupportedOperationException}.
@author Charles Fry
@since 11.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `getUnchecked([`K`](K.md) key)`

**Returns:** [`V`](V.md)

### `getAll(`java.lang.Iterable<? extends K>` keys)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](../collect/ImmutableMap.md)

### `apply([`K`](K.md) key)`

**Returns:** [`V`](V.md)

### `refresh([`K`](K.md) key)`

**Returns:** `void`

