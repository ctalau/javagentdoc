# Interface: `Hasher`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.Hasher`

**Extends:** [`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md)

## Description

A {@link PrimitiveSink} that can compute a hash code after reading the input. Each hasher should
 translate all multibyte values ({@link #putInt(int)}, {@link #putLong(long)}, etc) to bytes in
 little-endian order.

 <p><b>Warning:</b> The result of calling any methods after calling {@link #hash} is undefined.

 <p><b>Warning:</b> Using a specific character encoding when hashing a {@link CharSequence} with
 {@link #putString(CharSequence, Charset)} is generally only useful for cross-language
 compatibility (otherwise prefer {@link #putUnencodedChars}). However, the character encodings
 must be identical across languages. Also beware that {@link Charset} definitions may occasionally
 change between Java releases.

 <p><b>Warning:</b> Chunks of data that are put into the {@link Hasher} are not delimited. The
 resulting {@link HashCode} is dependent only on the bytes inserted, and the order in which they
 were inserted, not how those bytes were chunked into discrete put() operations. For example, the
 following three expressions all generate colliding hash codes:

 <pre>{@code
 newHasher().putByte(b1).putByte(b2).putByte(b3).hash()
 newHasher().putByte(b1).putBytes(new byte[] { b2, b3 }).hash()
 newHasher().putBytes(new byte[] { b1, b2, b3 }).hash()
 }</pre>

 <p>If you wish to avoid this, you should either prepend or append the size of each chunk. Keep in
 mind that when dealing with char sequences, the encoded form of two concatenated char sequences
 is not equivalent to the concatenation of their encoded form. Therefore, {@link #putString(CharSequence, Charset)} should only be used consistently with <i>complete</i>
 sequences and not broken into chunks.
@author Kevin Bourrillion
@since 11.0

## Methods

### `putByte(`byte` b)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putBytes(`byte[]` bytes)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putBytes(`byte[]` bytes, `int` off, `int` len)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putBytes([`java.nio.ByteBuffer`](../../../../java/nio/ByteBuffer.md) bytes)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putShort(`short` s)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putInt(`int` i)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putLong(`long` l)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putFloat(`float` f)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

Equivalent to {@code putInt(Float.floatToRawIntBits(f))}.

### `putDouble(`double` d)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

Equivalent to {@code putLong(Double.doubleToRawLongBits(d))}.

### `putBoolean(`boolean` b)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

Equivalent to {@code putByte(b ? (byte) 1 : (byte) 0)}.

### `putChar(`char` c)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `putUnencodedChars(`java.lang.CharSequence` charSequence)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

Equivalent to processing each {@code char} value in the {@code CharSequence}, in order. In
 other words, no character encoding is performed; the low byte and high byte of each {@code
 char} are hashed directly (in that order). The input must not be updated while this method is
 in progress.

 <p><b>Warning:</b> This method will produce different output than most other languages do when
 running the same hash function on the equivalent input. For cross-language compatibility, use
 {@link #putString}, usually with a charset of UTF-8. For other use cases, use {@code
 putUnencodedChars}.
@since 15.0 (since 11.0 as putString(CharSequence)).

### `putString(`java.lang.CharSequence` charSequence, [`java.nio.charset.Charset`](../../../../java/nio/charset/Charset.md) charset)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

Equivalent to {@code putBytes(charSequence.toString().getBytes(charset))}.

 <p><b>Warning:</b> This method, which reencodes the input before hashing it, is useful only for
 cross-language compatibility. For other use cases, prefer {@link #putUnencodedChars}, which is
 faster, produces the same output across Java releases, and hashes every {@code char} in the
 input, even if some are invalid.

### `putObject([`T`](T.md) instance, [`com.google.common.hash.Funnel<? super T>`](./Funnel.md) funnel)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

A simple convenience for {@code funnel.funnel(object, this)}.

### `hash()`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

Computes a hash code based on the data that have been provided to this hasher. The result is
 unspecified if this method is called more than once on the same instance.

### `hashCode()`

**Returns:** `int`

{@inheritDoc}
@deprecated This returns {@link Object#hashCode()}; you almost certainly mean to call {@code
     hash().asInt()}.

