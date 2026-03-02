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

**Parameters:**
- `expectedInputSize` (`int`)

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

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

### `hashBytes(ByteBuffer input)`

**Parameters:**
- `input` (`java.nio.ByteBuffer`)

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

