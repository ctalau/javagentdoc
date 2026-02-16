# Class: `AbstractStreamingHasher`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.AbstractStreamingHasher`

**Extends:** [`com.google.common.hash.AbstractHasher`](./AbstractHasher.md)

## Description

A convenience base class for implementors of `Hasher`; handles accumulating data until an
 entire "chunk" (of implementation-dependent length) is ready to be hashed.
**Author:** Kevin Bourrillion
**Author:** Dimitris Andreou

## Fields

### `buffer`

**Type:** `java.nio.ByteBuffer`

Buffer via which we pass data to the hash algorithm (the implementor)

### `bufferSize`

**Type:** `int`

Number of bytes to be filled before process() invocation(s).

### `chunkSize`

**Type:** `int`

Number of bytes processed per process() invocation.

## Constructors

### `<init>(`int` chunkSize)`

Constructor for use by subclasses. This hasher instance will process chunks of the specified
 size.
@param chunkSize the number of bytes available per `process(ByteBuffer)` invocation;
     must be at least 4

### `<init>(`int` chunkSize, `int` bufferSize)`

Constructor for use by subclasses. This hasher instance will process chunks of the specified
 size, using an internal buffer of `bufferSize` size, which must be a multiple of `chunkSize`.
@param chunkSize the number of bytes available per `process(ByteBuffer)` invocation;
     must be at least 4
@param bufferSize the size of the internal buffer. Must be a multiple of chunkSize

## Methods

### `process(`java.nio.ByteBuffer` bb)`

**Returns:** `void`

Processes the available bytes of the buffer (at most `chunk` bytes).

### `processRemaining(`java.nio.ByteBuffer` bb)`

**Returns:** `void`

This is invoked for the last bytes of the input, which are not enough to fill a whole chunk.
 The passed `ByteBuffer` is guaranteed to be non-empty.

 <p>This implementation simply pads with zeros and delegates to `process(ByteBuffer)`.

### `putBytes(`byte[]` bytes, `int` off, `int` len)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putBytes(`java.nio.ByteBuffer` readBuffer)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putBytesInternal(`java.nio.ByteBuffer` readBuffer)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putByte(`byte` b)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putShort(`short` s)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putChar(`char` c)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putInt(`int` i)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putLong(`long` l)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `hash()`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

### `makeHash()`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

Computes a hash code based on the data that have been provided to this hasher. This is called
 after all chunks are handled with `process` and any leftover bytes that did not make a
 complete chunk are handled with `processRemaining`.

### `munchIfFull()`

**Returns:** `void`

### `munch()`

**Returns:** `void`

