# Class: `HashingOutputStream`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.HashingOutputStream`

**Extends:** [`java.io.FilterOutputStream`](../../../../java/io/FilterOutputStream.md)

## Description

An {@link OutputStream} that maintains a hash of the data written to it.
@author Nick Piepmeier
@since 16.0

## Fields

### `hasher`

**Type:** [`com.google.common.hash.Hasher`](./Hasher.md)

## Constructors

### `<init>([`com.google.common.hash.HashFunction`](./HashFunction.md) hashFunction, [`java.io.OutputStream`](../../../../java/io/OutputStream.md) out)`

Creates an output stream that hashes using the given {@link HashFunction}, and forwards all
 data written to it to the underlying {@link OutputStream}.

 <p>The {@link OutputStream} should not be written to before or after the hand-off.

## Methods

### `write(`int` b)`

**Returns:** `void`

### `write(`byte[]` bytes, `int` off, `int` len)`

**Returns:** `void`

### `hash()`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

Returns the {@link HashCode} based on the data written to this stream. The result is
 unspecified if this method is called more than once on the same instance.

### `close()`

**Returns:** `void`

