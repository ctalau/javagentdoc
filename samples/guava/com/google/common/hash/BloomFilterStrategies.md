# Enum: `BloomFilterStrategies`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.BloomFilterStrategies`

**Implements:** [`com.google.common.hash.BloomFilter.Strategy`](BloomFilter/Strategy.md)

## Description

Collections of strategies of generating the k * log(M) bits required for an element to be mapped
 to a BloomFilter of M bits and k hash functions. These strategies are part of the serialized form
 of the Bloom filters that use them, thus they must be preserved as is (no updates allowed, only
 introduction of new versions).

 <p>Important: the order of the constants cannot change, and they cannot be deleted - we depend on
 their ordinal for BloomFilter serialization.
**Author:** Dimitris Andreou
**Author:** Kurt Alfred Kluever

## Constructors

### `<init>()`

## Methods

### `values()`

**Returns:** [`com.google.common.hash.BloomFilterStrategies[]`](./BloomFilterStrategies.md)

### `valueOf(`java.lang.String` name)`

**Returns:** [`com.google.common.hash.BloomFilterStrategies`](./BloomFilterStrategies.md)

