# Class: `AbstractByteHasher`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.AbstractByteHasher`

**Extends:** [`com.google.common.hash.AbstractHasher`](./AbstractHasher.md)

## Description

Abstract {@link Hasher} that handles converting primitives to bytes using a scratch {@code
 ByteBuffer} and streams all bytes to a sink to compute the hash.
@author Colin Decker

## Fields

### `scratch`

**Type:** [`java.nio.ByteBuffer`](../../../../java/nio/ByteBuffer.md)

## Constructors

### `<init>()`

## Methods

### `update(`byte` b)`

**Returns:** `void`

Updates this hasher with the given byte.

### `update(`byte[]` b)`

**Returns:** `void`

Updates this hasher with the given bytes.

### `update(`byte[]` b, `int` off, `int` len)`

**Returns:** `void`

Updates this hasher with {@code len} bytes starting at {@code off} in the given buffer.

### `update([`java.nio.ByteBuffer`](../../../../java/nio/ByteBuffer.md) b)`

**Returns:** `void`

Updates this hasher with bytes from the given buffer.

### `update(`int` bytes)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

Updates the sink with the given number of bytes from the buffer.

### `putByte(`byte` b)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putBytes(`byte[]` bytes)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putBytes(`byte[]` bytes, `int` off, `int` len)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putBytes([`java.nio.ByteBuffer`](../../../../java/nio/ByteBuffer.md) bytes)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putShort(`short` s)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putInt(`int` i)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putLong(`long` l)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putChar(`char` c)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

