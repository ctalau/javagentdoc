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

**Parameters:**
- `b` (`byte`)

**Returns:** `void`

### `update(byte[] b)`

**Parameters:**
- `b` (`byte[]`)

**Returns:** `void`

### `update(byte[] b, int off, int len)`

**Parameters:**
- `b` (`byte[]`)
- `off` (`int`)
- `len` (`int`)

**Returns:** `void`

### `update(ByteBuffer b)`

**Parameters:**
- `b` (`java.nio.ByteBuffer`)

**Returns:** `void`

### `update(int bytes)`

**Parameters:**
- `bytes` (`int`)

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putByte(byte b)`

**Parameters:**
- `b` (`byte`)

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putBytes(byte[] bytes)`

**Parameters:**
- `bytes` (`byte[]`)

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putBytes(byte[] bytes, int off, int len)`

**Parameters:**
- `bytes` (`byte[]`)
- `off` (`int`)
- `len` (`int`)

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putBytes(ByteBuffer bytes)`

**Parameters:**
- `bytes` (`java.nio.ByteBuffer`)

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putShort(short s)`

**Parameters:**
- `s` (`short`)

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putInt(int i)`

**Parameters:**
- `i` (`int`)

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putLong(long l)`

**Parameters:**
- `l` (`long`)

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putChar(char c)`

**Parameters:**
- `c` (`char`)

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

