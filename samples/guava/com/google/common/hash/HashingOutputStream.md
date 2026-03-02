# Class: `HashingOutputStream`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.HashingOutputStream`

**Extends:** `java.io.FilterOutputStream`

## Description

## Fields

### `hasher`

**Type:** [`com.google.common.hash.Hasher`](./Hasher.md)

## Constructors

### `<init>(com.google.common.hash.HashFunction hashFunction, java.io.OutputStream out)`

The OutputStream should not be written to before or after the hand-off.

**Parameters:**
- `hashFunction` ([`com.google.common.hash.HashFunction`](./HashFunction.md))
- `out` (`java.io.OutputStream`)

## Methods

### `write(int b)`

**Returns:** `void`

**Parameters:**
- `b` (`int`)

### `write(byte[] bytes, int off, int len)`

**Returns:** `void`

**Parameters:**
- `bytes` (`byte[]`)
- `off` (`int`)
- `len` (`int`)

### `hash()`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

The result is
 unspecified if this method is called more than once on the same instance.

### `close()`

**Returns:** `void`

