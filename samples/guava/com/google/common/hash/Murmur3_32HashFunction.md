# Class: `Murmur3_32HashFunction`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.Murmur3_32HashFunction`

**Extends:** [`com.google.common.hash.AbstractHashFunction`](./AbstractHashFunction.md)

**Implements:** `java.io.Serializable`

## Description

## Fields

### `MURMUR3_32`

**Type:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

### `MURMUR3_32_FIXED`

**Type:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

### `GOOD_FAST_HASH_32`

**Type:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

### `CHUNK_SIZE`

**Type:** `int`

### `C1`

**Type:** `int`

### `C2`

**Type:** `int`

### `seed`

**Type:** `int`

### `supplementaryPlaneFix`

**Type:** `boolean`

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(int seed, boolean supplementaryPlaneFix)`

**Parameters:**
- `seed` (`int`)
- `supplementaryPlaneFix` (`boolean`)

## Methods

### `bits()`

**Returns:** `int`

### `newHasher()`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `toString()`

**Returns:** `java.lang.String`

### `equals(java.lang.Object object)`

**Returns:** `boolean`

**Parameters:**
- `object` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

### `hashInt(int input)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

**Parameters:**
- `input` (`int`)

### `hashLong(long input)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

**Parameters:**
- `input` (`long`)

### `hashUnencodedChars(java.lang.CharSequence input)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

**Parameters:**
- `input` (`java.lang.CharSequence`)

### `hashString(java.lang.CharSequence input, java.nio.charset.Charset charset)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

**Parameters:**
- `input` (`java.lang.CharSequence`)
- `charset` (`java.nio.charset.Charset`)

### `hashBytes(byte[] input, int off, int len)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

**Parameters:**
- `input` (`byte[]`)
- `off` (`int`)
- `len` (`int`)

### `getIntLittleEndian(byte[] input, int offset)`

**Returns:** `int`

**Parameters:**
- `input` (`byte[]`)
- `offset` (`int`)

### `mixK1(int k1)`

**Returns:** `int`

**Parameters:**
- `k1` (`int`)

### `mixH1(int h1, int k1)`

**Returns:** `int`

**Parameters:**
- `h1` (`int`)
- `k1` (`int`)

### `fmix(int h1, int length)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

**Parameters:**
- `h1` (`int`)
- `length` (`int`)

### `codePointToFourUtf8Bytes(int codePoint)`

**Returns:** `long`

**Parameters:**
- `codePoint` (`int`)

### `charToThreeUtf8Bytes(char c)`

**Returns:** `long`

**Parameters:**
- `c` (`char`)

### `charToTwoUtf8Bytes(char c)`

**Returns:** `long`

**Parameters:**
- `c` (`char`)

