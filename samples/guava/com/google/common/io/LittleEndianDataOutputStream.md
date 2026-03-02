# Class: `LittleEndianDataOutputStream`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.LittleEndianDataOutputStream`

**Extends:** `java.io.FilterOutputStream`

**Implements:** `java.io.DataOutput`

## Description

**Note:** This class intentionally violates the specification of its supertype 
 DataOutput, which explicitly requires big-endian byte order.

## Constructors

### `<init>(OutputStream out)`

**Parameters:**
- `out` (`java.io.OutputStream`): the stream to delegate to

## Methods

### `write(byte[] b, int off, int len)`

**Parameters:**
- `b` (`byte[]`)
- `off` (`int`)
- `len` (`int`)

**Returns:** `void`

### `writeBoolean(boolean v)`

**Parameters:**
- `v` (`boolean`)

**Returns:** `void`

### `writeByte(int v)`

**Parameters:**
- `v` (`int`)

**Returns:** `void`

### `writeBytes(String s)`

**Parameters:**
- `s` (`java.lang.String`)

**Returns:** `void`

### `writeChar(int v)`

**Parameters:**
- `v` (`int`)

**Returns:** `void`

### `writeChars(String s)`

**Parameters:**
- `s` (`java.lang.String`)

**Returns:** `void`

### `writeDouble(double v)`

**Parameters:**
- `v` (`double`)

**Returns:** `void`

### `writeFloat(float v)`

**Parameters:**
- `v` (`float`)

**Returns:** `void`

### `writeInt(int v)`

**Parameters:**
- `v` (`int`)

**Returns:** `void`

### `writeLong(long v)`

**Parameters:**
- `v` (`long`)

**Returns:** `void`

### `writeShort(int v)`

**Parameters:**
- `v` (`int`)

**Returns:** `void`

### `writeUTF(String str)`

**Parameters:**
- `str` (`java.lang.String`)

**Returns:** `void`

### `close()`

**Returns:** `void`

