# Class: `HashingOutputStream`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.HashingOutputStream`

**Extends:** `java.io.FilterOutputStream`

## Description

## Fields

### `hasher`

**Type:** [`com.google.common.hash.Hasher`](./Hasher.md)

## Constructors

### `<init>(HashFunction hashFunction, OutputStream out)`

The OutputStream should not be written to before or after the hand-off.

**Parameters:**
- `hashFunction` ([`com.google.common.hash.HashFunction`](./HashFunction.md))
- `out` (`java.io.OutputStream`)

## Methods

### `write(int b)`

**Parameters:**
- `b` (`int`)

**Returns:** `void`

### `write(byte[] bytes, int off, int len)`

**Parameters:**
- `bytes` (`byte[]`)
- `off` (`int`)
- `len` (`int`)

**Returns:** `void`

### `hash()`

The result is
 unspecified if this method is called more than once on the same instance.

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

### `close()`

**Returns:** `void`

