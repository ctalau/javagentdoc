# Class: `AbstractNonStreamingHashFunction`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.AbstractNonStreamingHashFunction`

**Extends:** [`com.google.common.hash.AbstractHashFunction`](./AbstractHashFunction.md)

## Description

All
 the hash computation done using #newHasher() are delegated to the #hashBytes(byte[], int, int) method.

## Constructors

### `<init>()`

## Methods

### `newHasher()`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `newHasher(int expectedInputSize)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

**Parameters:**
- `expectedInputSize` (`int`)

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

### `hashBytes(java.nio.ByteBuffer input)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

**Parameters:**
- `input` (`java.nio.ByteBuffer`)

