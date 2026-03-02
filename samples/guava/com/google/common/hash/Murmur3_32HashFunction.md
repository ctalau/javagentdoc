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

### `equals(Object object)`

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `hashInt(int input)`

**Parameters:**
- `input` (`int`)

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

### `hashLong(long input)`

**Parameters:**
- `input` (`long`)

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

### `hashUnencodedChars(CharSequence input)`

**Parameters:**
- `input` (`java.lang.CharSequence`)

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

### `hashString(CharSequence input, Charset charset)`

**Parameters:**
- `input` (`java.lang.CharSequence`)
- `charset` (`java.nio.charset.Charset`)

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

### `hashBytes(byte[] input, int off, int len)`

**Parameters:**
- `input` (`byte[]`)
- `off` (`int`)
- `len` (`int`)

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

### `getIntLittleEndian(byte[] input, int offset)`

**Parameters:**
- `input` (`byte[]`)
- `offset` (`int`)

**Returns:** `int`

### `mixK1(int k1)`

**Parameters:**
- `k1` (`int`)

**Returns:** `int`

### `mixH1(int h1, int k1)`

**Parameters:**
- `h1` (`int`)
- `k1` (`int`)

**Returns:** `int`

### `fmix(int h1, int length)`

**Parameters:**
- `h1` (`int`)
- `length` (`int`)

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

### `codePointToFourUtf8Bytes(int codePoint)`

**Parameters:**
- `codePoint` (`int`)

**Returns:** `long`

### `charToThreeUtf8Bytes(char c)`

**Parameters:**
- `c` (`char`)

**Returns:** `long`

### `charToTwoUtf8Bytes(char c)`

**Parameters:**
- `c` (`char`)

**Returns:** `long`

