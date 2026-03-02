# Class: `LittleEndianDataOutputStream`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.LittleEndianDataOutputStream`

**Extends:** `java.io.FilterOutputStream`

**Implements:** `java.io.DataOutput`

## Description

**Note:** This class intentionally violates the specification of its supertype 
 DataOutput, which explicitly requires big-endian byte order.

## Constructors

### `<init>(java.io.OutputStream out)`

**Parameters:**
- `out` (`java.io.OutputStream`): the stream to delegate to

## Methods

### `write(byte[] b, int off, int len)`

**Returns:** `void`

**Parameters:**
- `b` (`byte[]`)
- `off` (`int`)
- `len` (`int`)

### `writeBoolean(boolean v)`

**Returns:** `void`

**Parameters:**
- `v` (`boolean`)

### `writeByte(int v)`

**Returns:** `void`

**Parameters:**
- `v` (`int`)

### `writeBytes(java.lang.String s)`

**Returns:** `void`

**Parameters:**
- `s` (`java.lang.String`)

### `writeChar(int v)`

**Returns:** `void`

**Parameters:**
- `v` (`int`)

### `writeChars(java.lang.String s)`

**Returns:** `void`

**Parameters:**
- `s` (`java.lang.String`)

### `writeDouble(double v)`

**Returns:** `void`

**Parameters:**
- `v` (`double`)

### `writeFloat(float v)`

**Returns:** `void`

**Parameters:**
- `v` (`float`)

### `writeInt(int v)`

**Returns:** `void`

**Parameters:**
- `v` (`int`)

### `writeLong(long v)`

**Returns:** `void`

**Parameters:**
- `v` (`long`)

### `writeShort(int v)`

**Returns:** `void`

**Parameters:**
- `v` (`int`)

### `writeUTF(java.lang.String str)`

**Returns:** `void`

**Parameters:**
- `str` (`java.lang.String`)

### `close()`

**Returns:** `void`

