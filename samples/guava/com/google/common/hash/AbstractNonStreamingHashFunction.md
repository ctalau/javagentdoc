# Class: `AbstractNonStreamingHashFunction`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.AbstractNonStreamingHashFunction`

**Extends:** [`com.google.common.hash.AbstractHashFunction`](./AbstractHashFunction.md)

## Description

Skeleton implementation of {@link HashFunction}, appropriate for non-streaming algorithms. All
 the hash computation done using {@linkplain #newHasher()} are delegated to the {@linkplain #hashBytes(byte[], int, int)} method.
@author Dimitris Andreou

## Constructors

### `<init>()`

## Methods

### `newHasher()`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `newHasher(`int` expectedInputSize)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `hashInt(`int` input)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

### `hashLong(`long` input)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

### `hashUnencodedChars(`java.lang.CharSequence` input)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

### `hashString(`java.lang.CharSequence` input, [`java.nio.charset.Charset`](../../../../java/nio/charset/Charset.md) charset)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

### `hashBytes(`byte[]` input, `int` off, `int` len)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

### `hashBytes([`java.nio.ByteBuffer`](../../../../java/nio/ByteBuffer.md) input)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

