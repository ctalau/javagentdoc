# Class: `HashingInputStream`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.HashingInputStream`

**Extends:** `java.io.FilterInputStream`

## Description

An `InputStream` that maintains a hash of the data read from it.
**Author:** Qian Huang
**Since:** 16.0

## Fields

### `hasher`

**Type:** [`com.google.common.hash.Hasher`](./Hasher.md)

## Constructors

### `<init>([`com.google.common.hash.HashFunction`](./HashFunction.md) hashFunction, `java.io.InputStream` in)`

Creates an input stream that hashes using the given `HashFunction` and delegates all data
 read from it to the underlying `InputStream`.

 <p>The `InputStream` should not be read from before or after the hand-off.

## Methods

### `read()`

**Returns:** `int`

Reads the next byte of data from the underlying input stream and updates the hasher with the
 byte read.

### `read(`byte[]` bytes, `int` off, `int` len)`

**Returns:** `int`

Reads the specified bytes of data from the underlying input stream and updates the hasher with
 the bytes read.

### `markSupported()`

**Returns:** `boolean`

mark() is not supported for HashingInputStream
@return `false` always

### `mark(`int` readlimit)`

**Returns:** `void`

mark() is not supported for HashingInputStream

### `reset()`

**Returns:** `void`

reset() is not supported for HashingInputStream.
@throws IOException this operation is not supported

### `hash()`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

Returns the `HashCode` based on the data read from this stream. The result is unspecified
 if this method is called more than once on the same instance.

