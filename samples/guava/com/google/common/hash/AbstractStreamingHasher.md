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

### `process(ByteBuffer bb)`

**Parameters:**
- `bb` (`java.nio.ByteBuffer`)

**Returns:** `void`

### `processRemaining(ByteBuffer bb)`

The passed ByteBuffer is guaranteed to be non-empty.

 
This implementation simply pads with zeros and delegates to #process(ByteBuffer).

**Parameters:**
- `bb` (`java.nio.ByteBuffer`)

**Returns:** `void`

### `putBytes(byte[] bytes, int off, int len)`

**Parameters:**
- `bytes` (`byte[]`)
- `off` (`int`)
- `len` (`int`)

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putBytes(ByteBuffer readBuffer)`

**Parameters:**
- `readBuffer` (`java.nio.ByteBuffer`)

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putBytesInternal(ByteBuffer readBuffer)`

**Parameters:**
- `readBuffer` (`java.nio.ByteBuffer`)

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putByte(byte b)`

**Parameters:**
- `b` (`byte`)

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putShort(short s)`

**Parameters:**
- `s` (`short`)

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putChar(char c)`

**Parameters:**
- `c` (`char`)

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putInt(int i)`

**Parameters:**
- `i` (`int`)

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putLong(long l)`

**Parameters:**
- `l` (`long`)

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `hash()`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

### `makeHash()`

This is called
 after all chunks are handled with #process and any leftover bytes that did not make a
 complete chunk are handled with #processRemaining.

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

### `munchIfFull()`

**Returns:** `void`

### `munch()`

**Returns:** `void`

