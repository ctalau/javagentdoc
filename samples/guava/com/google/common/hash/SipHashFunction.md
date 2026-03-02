# Class: `SipHashFunction`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.SipHashFunction`

**Extends:** [`com.google.common.hash.AbstractHashFunction`](./AbstractHashFunction.md)

**Implements:** `java.io.Serializable`

## Description

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

### `<init>(int c, int d, long k0, long k1)`

**Parameters:**
- `c` (`int`): the number of compression rounds (must be positive)
- `d` (`int`): the number of finalization rounds (must be positive)
- `k0` (`long`): the first half of the key
- `k1` (`long`): the second half of the key

## Methods

### `bits()`

**Returns:** `int`

### `newHasher()`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `toString()`

**Returns:** `java.lang.String`

### `equals(Object object)`

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

