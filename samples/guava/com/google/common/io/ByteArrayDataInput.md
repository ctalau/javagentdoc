# Interface: `ByteArrayDataInput`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.ByteArrayDataInput`

**Extends:** `java.io.DataInput`

## Description

**Warning:** The caller is responsible for not attempting to read past the end of the
 array. If any method encounters the end of the array prematurely, it throws IllegalStateException to signify *programmer error*. This behavior is a technical violation
 of the supertype's contract, which specifies a checked exception.

## Methods

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

### `readBoolean()`

**Returns:** `boolean`

### `readByte()`

**Returns:** `byte`

### `readUnsignedByte()`

**Returns:** `int`

### `readShort()`

**Returns:** `short`

### `readUnsignedShort()`

**Returns:** `int`

### `readChar()`

**Returns:** `char`

### `readInt()`

**Returns:** `int`

### `readLong()`

**Returns:** `long`

### `readFloat()`

**Returns:** `float`

### `readDouble()`

**Returns:** `double`

### `readLine()`

**Returns:** `java.lang.String`

### `readUTF()`

**Returns:** `java.lang.String`

