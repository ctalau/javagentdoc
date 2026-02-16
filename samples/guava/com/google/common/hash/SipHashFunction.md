# Class: `SipHashFunction`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.SipHashFunction`

**Extends:** [`com.google.common.hash.AbstractHashFunction`](./AbstractHashFunction.md)

**Implements:** [`java.io.Serializable`](../../../../java/io/Serializable.md)

## Description

{@link HashFunction} implementation of SipHash-c-d.
@author Kurt Alfred Kluever
@author Jean-Philippe Aumasson
@author Daniel J. Bernstein

## Fields

### `SIP_HASH_24`

**Type:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

### `c`

**Type:** `int`

### `d`

**Type:** `int`

### `k0`

**Type:** `long`

### `k1`

**Type:** `long`

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(`int` c, `int` d, `long` k0, `long` k1)`

@param c the number of compression rounds (must be positive)
@param d the number of finalization rounds (must be positive)
@param k0 the first half of the key
@param k1 the second half of the key

## Methods

### `bits()`

**Returns:** `int`

### `newHasher()`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `toString()`

**Returns:** `java.lang.String`

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

