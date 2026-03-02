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

**Parameters:**
- `b` (`boolean`)

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putDouble(double d)`

**Parameters:**
- `d` (`double`)

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putFloat(float f)`

**Parameters:**
- `f` (`float`)

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putUnencodedChars(CharSequence charSequence)`

**Parameters:**
- `charSequence` (`java.lang.CharSequence`)

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putString(CharSequence charSequence, Charset charset)`

**Parameters:**
- `charSequence` (`java.lang.CharSequence`)
- `charset` (`java.nio.charset.Charset`)

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

### `putBytes(ByteBuffer b)`

**Parameters:**
- `b` (`java.nio.ByteBuffer`)

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

### `putObject(T instance, Funnel<? super T> funnel)`

**Parameters:**
- `instance` (`T`)
- `funnel` ([`com.google.common.hash.Funnel<? super T>`](./Funnel.md))

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

