# Interface: `Weigher`

**Package:** [`com.google.common.cache`](README.md)

**Fully Qualified Name:** `com.google.common.cache.Weigher`

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

Calculates the weights of cache entries.
**Author:** Charles Fry
**Since:** 11.0

## Methods

### `weigh(`K` key, `V` value)`

**Returns:** `int`

Returns the weight of a cache entry. There is no unit for entry weights; rather they are simply
 relative to each other.
@return the weight of the entry; must be non-negative

