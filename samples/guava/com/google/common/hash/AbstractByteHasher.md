# Class: `AbstractByteHasher`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.AbstractByteHasher`

**Extends:** [`com.google.common.hash.AbstractHasher`](./AbstractHasher.md)

## Description

## Fields

### `scratch`

**Type:** `java.nio.ByteBuffer`

## Constructors

### `<init>()`

## Methods

### `update(byte b)`

**Returns:** `void`

**Parameters:**
- `b` (`byte`)

### `update(byte[] b)`

**Returns:** `void`

**Parameters:**
- `b` (`byte[]`)

### `update(byte[] b, int off, int len)`

**Returns:** `void`

**Parameters:**
- `b` (`byte[]`)
- `off` (`int`)
- `len` (`int`)

### `update(java.nio.ByteBuffer b)`

**Returns:** `void`

**Parameters:**
- `b` (`java.nio.ByteBuffer`)

### `update(int bytes)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

**Parameters:**
- `bytes` (`int`)

### `putByte(byte b)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

**Parameters:**
- `b` (`byte`)

### `putBytes(byte[] bytes)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

**Parameters:**
- `bytes` (`byte[]`)

### `putBytes(byte[] bytes, int off, int len)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

**Parameters:**
- `bytes` (`byte[]`)
- `off` (`int`)
- `len` (`int`)

### `putBytes(java.nio.ByteBuffer bytes)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

**Parameters:**
- `bytes` (`java.nio.ByteBuffer`)

### `putShort(short s)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

**Parameters:**
- `s` (`short`)

### `putInt(int i)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

**Parameters:**
- `i` (`int`)

### `putLong(long l)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

**Parameters:**
- `l` (`long`)

### `putChar(char c)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

**Parameters:**
- `c` (`char`)

