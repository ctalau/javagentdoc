# Class: `AbstractHashFunction`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.AbstractHashFunction`

**Implements:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

## Description

Skeleton implementation of `HashFunction` in terms of `newHasher()`.

 <p>TODO(lowasser): make public

## Constructors

### `<init>()`

## Methods

### `hashObject(`T` instance, [`com.google.common.hash.Funnel<? super T>`](./Funnel.md) funnel)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

### `hashUnencodedChars(`java.lang.CharSequence` input)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

### `hashString(`java.lang.CharSequence` input, `java.nio.charset.Charset` charset)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

### `hashInt(`int` input)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

### `hashLong(`long` input)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

### `hashBytes(`byte[]` input)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

### `hashBytes(`byte[]` input, `int` off, `int` len)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

### `hashBytes(`java.nio.ByteBuffer` input)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

### `newHasher(`int` expectedInputSize)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

