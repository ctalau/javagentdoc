# Class: `AbstractHashFunction`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.AbstractHashFunction`

**Implements:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

## Description

TODO(lowasser): make public

## Constructors

### `<init>()`

## Methods

### `hashObject(T instance, com.google.common.hash.Funnel<? super T> funnel)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

**Parameters:**
- `instance` (`T`)
- `funnel` ([`com.google.common.hash.Funnel<? super T>`](./Funnel.md))

### `hashUnencodedChars(java.lang.CharSequence input)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

**Parameters:**
- `input` (`java.lang.CharSequence`)

### `hashString(java.lang.CharSequence input, java.nio.charset.Charset charset)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

**Parameters:**
- `input` (`java.lang.CharSequence`)
- `charset` (`java.nio.charset.Charset`)

### `hashInt(int input)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

**Parameters:**
- `input` (`int`)

### `hashLong(long input)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

**Parameters:**
- `input` (`long`)

### `hashBytes(byte[] input)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

**Parameters:**
- `input` (`byte[]`)

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

### `newHasher(int expectedInputSize)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

**Parameters:**
- `expectedInputSize` (`int`)

