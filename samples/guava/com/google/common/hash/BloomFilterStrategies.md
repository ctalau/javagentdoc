# Enum: `BloomFilterStrategies`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.BloomFilterStrategies`

**Implements:** `com.google.common.hash.BloomFilter.Strategy`

## Description

These strategies are part of the serialized form
 of the Bloom filters that use them, thus they must be preserved as is (no updates allowed, only
 introduction of new versions).

 
Important: the order of the constants cannot change, and they cannot be deleted - we depend on
 their ordinal for BloomFilter serialization.

## Constructors

### `<init>()`

## Methods

### `values()`

**Returns:** [`com.google.common.hash.BloomFilterStrategies[]`](./BloomFilterStrategies.md)

### `valueOf(java.lang.String name)`

**Returns:** [`com.google.common.hash.BloomFilterStrategies`](./BloomFilterStrategies.md)

**Parameters:**
- `name` (`java.lang.String`)

