# Class: `AbstractHasher`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.AbstractHasher`

**Implements:** [`com.google.common.hash.Hasher`](./Hasher.md)

## Description

Subtypes may provide more efficient implementations, however.

## Constructors

### `<init>()`

## Methods

### `putBoolean(boolean b)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

**Parameters:**
- `b` (`boolean`)

### `putDouble(double d)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

**Parameters:**
- `d` (`double`)

### `putFloat(float f)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

**Parameters:**
- `f` (`float`)

### `putUnencodedChars(java.lang.CharSequence charSequence)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

**Parameters:**
- `charSequence` (`java.lang.CharSequence`)

### `putString(java.lang.CharSequence charSequence, java.nio.charset.Charset charset)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

**Parameters:**
- `charSequence` (`java.lang.CharSequence`)
- `charset` (`java.nio.charset.Charset`)

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

### `putBytes(java.nio.ByteBuffer b)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

**Parameters:**
- `b` (`java.nio.ByteBuffer`)

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

### `putObject(T instance, com.google.common.hash.Funnel<? super T> funnel)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

**Parameters:**
- `instance` (`T`)
- `funnel` ([`com.google.common.hash.Funnel<? super T>`](./Funnel.md))

