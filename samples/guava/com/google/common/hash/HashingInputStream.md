# Class: `HashingInputStream`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.HashingInputStream`

**Extends:** `java.io.FilterInputStream`

## Description

## Fields

### `hasher`

**Type:** [`com.google.common.hash.Hasher`](./Hasher.md)

## Constructors

### `<init>(com.google.common.hash.HashFunction hashFunction, java.io.InputStream in)`

The InputStream should not be read from before or after the hand-off.

**Parameters:**
- `hashFunction` ([`com.google.common.hash.HashFunction`](./HashFunction.md))
- `in` (`java.io.InputStream`)

## Methods

### `read()`

**Returns:** `int`

### `read(byte[] bytes, int off, int len)`

**Returns:** `int`

**Parameters:**
- `bytes` (`byte[]`)
- `off` (`int`)
- `len` (`int`)

### `markSupported()`

**Returns:** `boolean`

### `mark(int readlimit)`

**Returns:** `void`

**Parameters:**
- `readlimit` (`int`)

### `reset()`

**Returns:** `void`

### `hash()`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

The result is unspecified
 if this method is called more than once on the same instance.

