# Class: `AbstractCompositeHashFunction`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.AbstractCompositeHashFunction`

**Extends:** [`com.google.common.hash.AbstractHashFunction`](./AbstractHashFunction.md)

## Description

#newHasher() delegates to the
 Hasher objects of the delegate hash functions, and in the end, they are used by
 #makeHash(Hasher[]) that constructs the final HashCode.

## Fields

### `functions`

**Type:** [`com.google.common.hash.HashFunction[]`](./HashFunction.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(com.google.common.hash.HashFunction[] functions)`

**Parameters:**
- `functions` ([`com.google.common.hash.HashFunction[]`](./HashFunction.md))

## Methods

### `makeHash(com.google.common.hash.Hasher[] hashers)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

Each of them
 has consumed the entire input and they are ready to output a HashCode. The order of the
 hashers are the same order as the functions given to the constructor.

**Parameters:**
- `hashers` ([`com.google.common.hash.Hasher[]`](./Hasher.md))

### `newHasher()`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `newHasher(int expectedInputSize)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

**Parameters:**
- `expectedInputSize` (`int`)

### `fromHashers(com.google.common.hash.Hasher[] hashers)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

**Parameters:**
- `hashers` ([`com.google.common.hash.Hasher[]`](./Hasher.md))

