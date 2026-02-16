# Class: `AbstractHasher`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.AbstractHasher`

**Implements:** [`com.google.common.hash.Hasher`](./Hasher.md)

## Description

An abstract implementation of `Hasher`, which only requires subtypes to implement `putByte`. Subtypes may provide more efficient implementations, however.
**Author:** Dimitris Andreou

## Constructors

### `<init>()`

## Methods

### `putBoolean(`boolean` b)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putDouble(`double` d)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putFloat(`float` f)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putUnencodedChars(`java.lang.CharSequence` charSequence)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putString(`java.lang.CharSequence` charSequence, `java.nio.charset.Charset` charset)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putBytes(`byte[]` bytes)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putBytes(`byte[]` bytes, `int` off, `int` len)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putBytes(`java.nio.ByteBuffer` b)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putShort(`short` s)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putInt(`int` i)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putLong(`long` l)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putChar(`char` c)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putObject(`T` instance, [`com.google.common.hash.Funnel<? super T>`](./Funnel.md) funnel)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

