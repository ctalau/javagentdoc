# Interface: `Hasher`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.Hasher`

**Extends:** [`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md)

## Description

Each hasher should
 translate all multibyte values (#putInt(int), #putLong(long), etc) to bytes in
 little-endian order.

 
**Warning:** The result of calling any methods after calling #hash is undefined.

 
**Warning:** Using a specific character encoding when hashing a CharSequence with
 #putString(CharSequence, Charset) is generally only useful for cross-language
 compatibility (otherwise prefer #putUnencodedChars). However, the character encodings
 must be identical across languages. Also beware that Charset definitions may occasionally
 change between Java releases.

 
**Warning:** Chunks of data that are put into the Hasher are not delimited. The
 resulting HashCode is dependent only on the bytes inserted, and the order in which they
 were inserted, not how those bytes were chunked into discrete put() operations. For example, the
 following three expressions all generate colliding hash codes:

 

```

 newHasher().putByte(b1).putByte(b2).putByte(b3).hash()
 newHasher().putByte(b1).putBytes(new byte[] { b2, b3 }).hash()
 newHasher().putBytes(new byte[] { b1, b2, b3 }).hash()
 
```


 
If you wish to avoid this, you should either prepend or append the size of each chunk. Keep in
 mind that when dealing with char sequences, the encoded form of two concatenated char sequences
 is not equivalent to the concatenation of their encoded form. Therefore, #putString(CharSequence, Charset) should only be used consistently with *complete*
 sequences and not broken into chunks.

## Methods

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

### `putFloat(float f)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

**Parameters:**
- `f` (`float`)

### `putDouble(double d)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

**Parameters:**
- `d` (`double`)

### `putBoolean(boolean b)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

**Parameters:**
- `b` (`boolean`)

### `putChar(char c)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

**Parameters:**
- `c` (`char`)

### `putUnencodedChars(java.lang.CharSequence charSequence)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

In
 other words, no character encoding is performed; the low byte and high byte of each 
 char are hashed directly (in that order). The input must not be updated while this method is
 in progress.

 
**Warning:** This method will produce different output than most other languages do when
 running the same hash function on the equivalent input. For cross-language compatibility, use
 #putString, usually with a charset of UTF-8. For other use cases, use 
 putUnencodedChars.

**Parameters:**
- `charSequence` (`java.lang.CharSequence`)

### `putString(java.lang.CharSequence charSequence, java.nio.charset.Charset charset)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

**Warning:** This method, which reencodes the input before hashing it, is useful only for
 cross-language compatibility. For other use cases, prefer #putUnencodedChars, which is
 faster, produces the same output across Java releases, and hashes every char in the
 input, even if some are invalid.

**Parameters:**
- `charSequence` (`java.lang.CharSequence`)
- `charset` (`java.nio.charset.Charset`)

### `putObject(T instance, com.google.common.hash.Funnel<? super T> funnel)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

**Parameters:**
- `instance` (`T`)
- `funnel` ([`com.google.common.hash.Funnel<? super T>`](./Funnel.md))

### `hash()`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

The result is
 unspecified if this method is called more than once on the same instance.

### `hashCode()`

**Returns:** `int`

