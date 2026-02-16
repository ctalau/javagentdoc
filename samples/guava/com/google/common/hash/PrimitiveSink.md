# Interface: `PrimitiveSink`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.PrimitiveSink`

## Description

An object which can receive a stream of primitive values.
**Author:** Kevin Bourrillion
**Since:** 12.0 (in 11.0 as `Sink`)

## Methods

### `putByte(`byte` b)`

**Returns:** [`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md)

Puts a byte into this sink.
@param b a byte
@return this instance

### `putBytes(`byte[]` bytes)`

**Returns:** [`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md)

Puts an array of bytes into this sink.
@param bytes a byte array
@return this instance

### `putBytes(`byte[]` bytes, `int` off, `int` len)`

**Returns:** [`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md)

Puts a chunk of an array of bytes into this sink. `bytes[off]` is the first byte written,
 `bytes[off + len - 1]` is the last.
@param bytes a byte array
@param off the start offset in the array
@param len the number of bytes to write
@return this instance
@throws IndexOutOfBoundsException if `off < 0` or `off + len > bytes.length` or
     `len < 0`

### `putBytes(`java.nio.ByteBuffer` bytes)`

**Returns:** [`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md)

Puts the remaining bytes of a byte buffer into this sink. `bytes.position()` is the first
 byte written, `bytes.limit() - 1` is the last. The position of the buffer will be equal
 to the limit when this method returns.
@param bytes a byte buffer
@return this instance
**Since:** 23.0

### `putShort(`short` s)`

**Returns:** [`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md)

Puts a short into this sink.

### `putInt(`int` i)`

**Returns:** [`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md)

Puts an int into this sink.

### `putLong(`long` l)`

**Returns:** [`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md)

Puts a long into this sink.

### `putFloat(`float` f)`

**Returns:** [`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md)

Puts a float into this sink.

### `putDouble(`double` d)`

**Returns:** [`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md)

Puts a double into this sink.

### `putBoolean(`boolean` b)`

**Returns:** [`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md)

Puts a boolean into this sink.

### `putChar(`char` c)`

**Returns:** [`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md)

Puts a character into this sink.

### `putUnencodedChars(`java.lang.CharSequence` charSequence)`

**Returns:** [`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md)

Puts each 16-bit code unit from the `CharSequence` into this sink.

 <p><b>Warning:</b> This method will produce different output than most other languages do when
 running on the equivalent input. For cross-language compatibility, use `putString`,
 usually with a charset of UTF-8. For other use cases, use `putUnencodedChars`.
**Since:** 15.0 (since 11.0 as putString(CharSequence))

### `putString(`java.lang.CharSequence` charSequence, `java.nio.charset.Charset` charset)`

**Returns:** [`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md)

Puts a string into this sink using the given charset.

 <p><b>Warning:</b> This method, which reencodes the input before processing it, is useful only
 for cross-language compatibility. For other use cases, prefer `putUnencodedChars`, which
 is faster, produces the same output across Java releases, and processes every `char` in
 the input, even if some are invalid.

