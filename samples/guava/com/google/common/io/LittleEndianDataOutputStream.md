# Class: `LittleEndianDataOutputStream`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.LittleEndianDataOutputStream`

**Extends:** `java.io.FilterOutputStream`

**Implements:** `java.io.DataOutput`

## Description

An implementation of `DataOutput` that uses little-endian byte ordering for writing `char`, `short`, `int`, `float`, `double`, and `long` values.

 <p><b>Note:</b> This class intentionally violates the specification of its supertype `DataOutput`, which explicitly requires big-endian byte order.
**Author:** Chris Nokleberg
**Author:** Keith Bottner
**Since:** 8.0

## Constructors

### `<init>(`java.io.OutputStream` out)`

Creates a `LittleEndianDataOutputStream` that wraps the given stream.
@param out the stream to delegate to

## Methods

### `write(`byte[]` b, `int` off, `int` len)`

**Returns:** `void`

### `writeBoolean(`boolean` v)`

**Returns:** `void`

### `writeByte(`int` v)`

**Returns:** `void`

### `writeBytes(`java.lang.String` s)`

**Returns:** `void`

**Deprecated:**The semantics of `writeBytes(String s)` are considered dangerous. Please use
     `writeUTF(String s)`, `writeChars(String s)` or another write method instead.

### `writeChar(`int` v)`

**Returns:** `void`

Writes a char as specified by `DataOutputStream.writeChar(int)`, except using
 little-endian byte order.
@throws IOException if an I/O error occurs

### `writeChars(`java.lang.String` s)`

**Returns:** `void`

Writes a `String` as specified by `DataOutputStream.writeChars(String)`, except
 each character is written using little-endian byte order.
@throws IOException if an I/O error occurs

### `writeDouble(`double` v)`

**Returns:** `void`

Writes a `double` as specified by `DataOutputStream.writeDouble(double)`, except
 using little-endian byte order.
@throws IOException if an I/O error occurs

### `writeFloat(`float` v)`

**Returns:** `void`

Writes a `float` as specified by `DataOutputStream.writeFloat(float)`, except using
 little-endian byte order.
@throws IOException if an I/O error occurs

### `writeInt(`int` v)`

**Returns:** `void`

Writes an `int` as specified by `DataOutputStream.writeInt(int)`, except using
 little-endian byte order.
@throws IOException if an I/O error occurs

### `writeLong(`long` v)`

**Returns:** `void`

Writes a `long` as specified by `DataOutputStream.writeLong(long)`, except using
 little-endian byte order.
@throws IOException if an I/O error occurs

### `writeShort(`int` v)`

**Returns:** `void`

Writes a `short` as specified by `DataOutputStream.writeShort(int)`, except using
 little-endian byte order.
@throws IOException if an I/O error occurs

### `writeUTF(`java.lang.String` str)`

**Returns:** `void`

### `close()`

**Returns:** `void`

