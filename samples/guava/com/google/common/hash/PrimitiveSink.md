# Interface: `PrimitiveSink`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.PrimitiveSink`

## Description

## Methods

### `putByte(byte b)`

**Returns:** [`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md)

**Parameters:**
- `b` (`byte`): a byte

### `putBytes(byte[] bytes)`

**Returns:** [`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md)

**Parameters:**
- `bytes` (`byte[]`): a byte array

### `putBytes(byte[] bytes, int off, int len)`

**Returns:** [`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md)

bytes[off] is the first byte written,
 bytes[off + len - 1] is the last.

**Parameters:**
- `bytes` (`byte[]`): a byte array
- `off` (`int`): the start offset in the array
- `len` (`int`): the number of bytes to write

### `putBytes(java.nio.ByteBuffer bytes)`

**Returns:** [`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md)

bytes.position() is the first
 byte written, bytes.limit() - 1 is the last. The position of the buffer will be equal
 to the limit when this method returns.

**Parameters:**
- `bytes` (`java.nio.ByteBuffer`): a byte buffer

### `putShort(short s)`

**Returns:** [`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md)

**Parameters:**
- `s` (`short`)

### `putInt(int i)`

**Returns:** [`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md)

**Parameters:**
- `i` (`int`)

### `putLong(long l)`

**Returns:** [`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md)

**Parameters:**
- `l` (`long`)

### `putFloat(float f)`

**Returns:** [`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md)

**Parameters:**
- `f` (`float`)

### `putDouble(double d)`

**Returns:** [`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md)

**Parameters:**
- `d` (`double`)

### `putBoolean(boolean b)`

**Returns:** [`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md)

**Parameters:**
- `b` (`boolean`)

### `putChar(char c)`

**Returns:** [`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md)

**Parameters:**
- `c` (`char`)

### `putUnencodedChars(java.lang.CharSequence charSequence)`

**Returns:** [`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md)

**Warning:** This method will produce different output than most other languages do when
 running on the equivalent input. For cross-language compatibility, use #putString,
 usually with a charset of UTF-8. For other use cases, use putUnencodedChars.

**Parameters:**
- `charSequence` (`java.lang.CharSequence`)

### `putString(java.lang.CharSequence charSequence, java.nio.charset.Charset charset)`

**Returns:** [`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md)

**Warning:** This method, which reencodes the input before processing it, is useful only
 for cross-language compatibility. For other use cases, prefer #putUnencodedChars, which
 is faster, produces the same output across Java releases, and processes every char in
 the input, even if some are invalid.

**Parameters:**
- `charSequence` (`java.lang.CharSequence`)
- `charset` (`java.nio.charset.Charset`)

