# Class: `LittleEndianDataInputStream`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.LittleEndianDataInputStream`

**Extends:** `java.io.FilterInputStream`

**Implements:** `java.io.DataInput`

## Description

**Note:** This class intentionally violates the specification of its supertype 
 DataInput, which explicitly requires big-endian byte order.

## Constructors

### `<init>(java.io.InputStream in)`

**Parameters:**
- `in` (`java.io.InputStream`): the stream to delegate to

## Methods

### `readLine()`

**Returns:** `java.lang.String`

### `readFully(byte[] b)`

**Returns:** `void`

**Parameters:**
- `b` (`byte[]`)

### `readFully(byte[] b, int off, int len)`

**Returns:** `void`

**Parameters:**
- `b` (`byte[]`)
- `off` (`int`)
- `len` (`int`)

### `skipBytes(int n)`

**Returns:** `int`

**Parameters:**
- `n` (`int`)

### `readUnsignedByte()`

**Returns:** `int`

### `readUnsignedShort()`

**Returns:** `int`

### `readInt()`

**Returns:** `int`

### `readLong()`

**Returns:** `long`

### `readFloat()`

**Returns:** `float`

### `readDouble()`

**Returns:** `double`

### `readUTF()`

**Returns:** `java.lang.String`

### `readShort()`

**Returns:** `short`

### `readChar()`

**Returns:** `char`

### `readByte()`

**Returns:** `byte`

### `readBoolean()`

**Returns:** `boolean`

### `readAndCheckByte()`

**Returns:** `byte`

