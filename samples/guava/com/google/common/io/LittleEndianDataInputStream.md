# Class: `LittleEndianDataInputStream`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.LittleEndianDataInputStream`

**Extends:** `java.io.FilterInputStream`

**Implements:** `java.io.DataInput`

## Description

**Note:** This class intentionally violates the specification of its supertype 
 DataInput, which explicitly requires big-endian byte order.

## Constructors

### `<init>(InputStream in)`

**Parameters:**
- `in` (`java.io.InputStream`): the stream to delegate to

## Methods

### `readLine()`

**Returns:** `java.lang.String`

### `readFully(byte[] b)`

**Parameters:**
- `b` (`byte[]`)

**Returns:** `void`

### `readFully(byte[] b, int off, int len)`

**Parameters:**
- `b` (`byte[]`)
- `off` (`int`)
- `len` (`int`)

**Returns:** `void`

### `skipBytes(int n)`

**Parameters:**
- `n` (`int`)

**Returns:** `int`

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

