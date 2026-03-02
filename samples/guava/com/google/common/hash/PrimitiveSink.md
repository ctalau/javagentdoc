# Interface: `PrimitiveSink`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.PrimitiveSink`

## Description

## Methods

### `putByte(byte b)`

**Parameters:**
- `b` (`byte`): a byte

**Returns:** [`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md)

### `putBytes(byte[] bytes)`

**Parameters:**
- `bytes` (`byte[]`): a byte array

**Returns:** [`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md)

### `putBytes(byte[] bytes, int off, int len)`

bytes[off] is the first byte written,
 bytes[off + len - 1] is the last.

**Parameters:**
- `bytes` (`byte[]`): a byte array
- `off` (`int`): the start offset in the array
- `len` (`int`): the number of bytes to write

**Returns:** [`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md)

### `putBytes(ByteBuffer bytes)`

bytes.position() is the first
 byte written, bytes.limit() - 1 is the last. The position of the buffer will be equal
 to the limit when this method returns.

**Parameters:**
- `bytes` (`java.nio.ByteBuffer`): a byte buffer

**Returns:** [`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md)

### `putShort(short s)`

**Parameters:**
- `s` (`short`)

**Returns:** [`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md)

### `putInt(int i)`

**Parameters:**
- `i` (`int`)

**Returns:** [`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md)

### `putLong(long l)`

**Parameters:**
- `l` (`long`)

**Returns:** [`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md)

### `putFloat(float f)`

**Parameters:**
- `f` (`float`)

**Returns:** [`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md)

### `putDouble(double d)`

**Parameters:**
- `d` (`double`)

**Returns:** [`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md)

### `putBoolean(boolean b)`

**Parameters:**
- `b` (`boolean`)

**Returns:** [`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md)

### `putChar(char c)`

**Parameters:**
- `c` (`char`)

**Returns:** [`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md)

### `putUnencodedChars(CharSequence charSequence)`

**Warning:** This method will produce different output than most other languages do when
 running on the equivalent input. For cross-language compatibility, use #putString,
 usually with a charset of UTF-8. For other use cases, use putUnencodedChars.

**Parameters:**
- `charSequence` (`java.lang.CharSequence`)

**Returns:** [`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md)

### `putString(CharSequence charSequence, Charset charset)`

**Warning:** This method, which reencodes the input before processing it, is useful only
 for cross-language compatibility. For other use cases, prefer #putUnencodedChars, which
 is faster, produces the same output across Java releases, and processes every char in
 the input, even if some are invalid.

**Parameters:**
- `charSequence` (`java.lang.CharSequence`)
- `charset` (`java.nio.charset.Charset`)

**Returns:** [`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md)

