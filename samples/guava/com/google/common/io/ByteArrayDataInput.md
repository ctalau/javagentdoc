# Interface: `ByteArrayDataInput`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.ByteArrayDataInput`

**Extends:** `java.io.DataInput`

## Description

An extension of `DataInput` for reading from in-memory byte arrays; its methods offer
 identical functionality but do not throw `IOException`.

 <p><b>Warning:</b> The caller is responsible for not attempting to read past the end of the
 array. If any method encounters the end of the array prematurely, it throws `IllegalStateException` to signify <i>programmer error</i>. This behavior is a technical violation
 of the supertype's contract, which specifies a checked exception.
**Author:** Kevin Bourrillion
**Since:** 1.0

## Methods

### `readFully(`byte[]` b)`

**Returns:** `void`

### `readFully(`byte[]` b, `int` off, `int` len)`

**Returns:** `void`

### `skipBytes(`int` n)`

**Returns:** `int`

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

