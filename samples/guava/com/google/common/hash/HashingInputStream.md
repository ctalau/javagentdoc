# Class: `HashingInputStream`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.HashingInputStream`

**Extends:** `java.io.FilterInputStream`

## Description

## Fields

### `hasher`

**Type:** [`com.google.common.hash.Hasher`](./Hasher.md)

## Constructors

### `<init>(HashFunction hashFunction, InputStream in)`

The InputStream should not be read from before or after the hand-off.

**Parameters:**
- `hashFunction` ([`com.google.common.hash.HashFunction`](./HashFunction.md))
- `in` (`java.io.InputStream`)

## Methods

### `read()`

**Returns:** `int`

### `read(byte[] bytes, int off, int len)`

**Parameters:**
- `bytes` (`byte[]`)
- `off` (`int`)
- `len` (`int`)

**Returns:** `int`

### `markSupported()`

**Returns:** `boolean`

### `mark(int readlimit)`

**Parameters:**
- `readlimit` (`int`)

**Returns:** `void`

### `reset()`

**Returns:** `void`

### `hash()`

The result is unspecified
 if this method is called more than once on the same instance.

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

