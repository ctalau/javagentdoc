# Class: `Murmur3_32HashFunction`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.Murmur3_32HashFunction`

**Extends:** [`com.google.common.hash.AbstractHashFunction`](./AbstractHashFunction.md)

**Implements:** `java.io.Serializable`

## Description

See MurmurHash3_x86_32 in <a href="https://github.com/aappleby/smhasher/blob/master/src/MurmurHash3.cpp">the C++
 implementation</a>.
**Author:** Austin Appleby
**Author:** Dimitris Andreou
**Author:** Kurt Alfred Kluever

## Fields

### `MURMUR3_32`

**Type:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

### `MURMUR3_32_FIXED`

**Type:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

### `GOOD_FAST_HASH_32`

**Type:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

### `CHUNK_SIZE`

**Type:** `int`

### `C1`

**Type:** `int`

### `C2`

**Type:** `int`

### `seed`

**Type:** `int`

### `supplementaryPlaneFix`

**Type:** `boolean`

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(`int` seed, `boolean` supplementaryPlaneFix)`

## Methods

### `bits()`

**Returns:** `int`

### `newHasher()`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `toString()`

**Returns:** `java.lang.String`

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `hashInt(`int` input)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

### `hashLong(`long` input)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

### `hashUnencodedChars(`java.lang.CharSequence` input)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

### `hashString(`java.lang.CharSequence` input, `java.nio.charset.Charset` charset)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

### `hashBytes(`byte[]` input, `int` off, `int` len)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

### `getIntLittleEndian(`byte[]` input, `int` offset)`

**Returns:** `int`

### `mixK1(`int` k1)`

**Returns:** `int`

### `mixH1(`int` h1, `int` k1)`

**Returns:** `int`

### `fmix(`int` h1, `int` length)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

### `codePointToFourUtf8Bytes(`int` codePoint)`

**Returns:** `long`

### `charToThreeUtf8Bytes(`char` c)`

**Returns:** `long`

### `charToTwoUtf8Bytes(`char` c)`

**Returns:** `long`

