# Class: `AbstractStreamingHasher`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.AbstractStreamingHasher`

**Extends:** [`com.google.common.hash.AbstractHasher`](./AbstractHasher.md)

## Description

## Fields

### `buffer`

**Type:** `java.nio.ByteBuffer`

### `bufferSize`

**Type:** `int`

### `chunkSize`

**Type:** `int`

## Constructors

### `<init>(int chunkSize)`

This hasher instance will process chunks of the specified
 size.

**Parameters:**
- `chunkSize` (`int`): the number of bytes available per #process(ByteBuffer) invocation;
     must be at least 4

### `<init>(int chunkSize, int bufferSize)`

This hasher instance will process chunks of the specified
 size, using an internal buffer of bufferSize size, which must be a multiple of 
 chunkSize.

**Parameters:**
- `chunkSize` (`int`): the number of bytes available per #process(ByteBuffer) invocation;
     must be at least 4
- `bufferSize` (`int`): the size of the internal buffer. Must be a multiple of chunkSize

## Methods

### `process(java.nio.ByteBuffer bb)`

**Returns:** `void`

**Parameters:**
- `bb` (`java.nio.ByteBuffer`)

### `processRemaining(java.nio.ByteBuffer bb)`

**Returns:** `void`

The passed ByteBuffer is guaranteed to be non-empty.

 
This implementation simply pads with zeros and delegates to #process(ByteBuffer).

**Parameters:**
- `bb` (`java.nio.ByteBuffer`)

### `putBytes(byte[] bytes, int off, int len)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

**Parameters:**
- `bytes` (`byte[]`)
- `off` (`int`)
- `len` (`int`)

### `putBytes(java.nio.ByteBuffer readBuffer)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

**Parameters:**
- `readBuffer` (`java.nio.ByteBuffer`)

### `putBytesInternal(java.nio.ByteBuffer readBuffer)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

**Parameters:**
- `readBuffer` (`java.nio.ByteBuffer`)

### `putByte(byte b)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

**Parameters:**
- `b` (`byte`)

### `putShort(short s)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

**Parameters:**
- `s` (`short`)

### `putChar(char c)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

**Parameters:**
- `c` (`char`)

### `putInt(int i)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

**Parameters:**
- `i` (`int`)

### `putLong(long l)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

**Parameters:**
- `l` (`long`)

### `hash()`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

### `makeHash()`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

This is called
 after all chunks are handled with #process and any leftover bytes that did not make a
 complete chunk are handled with #processRemaining.

### `munchIfFull()`

**Returns:** `void`

### `munch()`

**Returns:** `void`

