# Class: `AbstractCompositeHashFunction`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.AbstractCompositeHashFunction`

**Extends:** [`com.google.common.hash.AbstractHashFunction`](./AbstractHashFunction.md)

## Description

An abstract composition of multiple hash functions. {@linkplain #newHasher()} delegates to the
 {@code Hasher} objects of the delegate hash functions, and in the end, they are used by
 {@linkplain #makeHash(Hasher[])} that constructs the final {@code HashCode}.
@author Dimitris Andreou

## Fields

### `functions`

**Type:** [`com.google.common.hash.HashFunction[]`](./HashFunction.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>([`com.google.common.hash.HashFunction[]`](./HashFunction.md) functions)`

## Methods

### `makeHash([`com.google.common.hash.Hasher[]`](./Hasher.md) hashers)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

Constructs a {@code HashCode} from the {@code Hasher} objects of the functions. Each of them
 has consumed the entire input and they are ready to output a {@code HashCode}. The order of the
 hashers are the same order as the functions given to the constructor.

### `newHasher()`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `newHasher(`int` expectedInputSize)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `fromHashers([`com.google.common.hash.Hasher[]`](./Hasher.md) hashers)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

