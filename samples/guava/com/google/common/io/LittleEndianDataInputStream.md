# Class: `LittleEndianDataInputStream`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.LittleEndianDataInputStream`

**Extends:** `java.io.FilterInputStream`

**Implements:** `java.io.DataInput`

## Description

An implementation of `DataInput` that uses little-endian byte ordering for reading `short`, `int`, `float`, `double`, and `long` values.

 <p><b>Note:</b> This class intentionally violates the specification of its supertype `DataInput`, which explicitly requires big-endian byte order.
**Author:** Chris Nokleberg
**Author:** Keith Bottner
**Since:** 8.0

## Constructors

### `<init>(`java.io.InputStream` in)`

Creates a `LittleEndianDataInputStream` that wraps the given stream.
@param in the stream to delegate to

## Methods

### `readLine()`

**Returns:** `java.lang.String`

This method will throw an `UnsupportedOperationException`.

### `readFully(`byte[]` b)`

**Returns:** `void`

### `readFully(`byte[]` b, `int` off, `int` len)`

**Returns:** `void`

### `skipBytes(`int` n)`

**Returns:** `int`

### `readUnsignedByte()`

**Returns:** `int`

### `readUnsignedShort()`

**Returns:** `int`

Reads an unsigned `short` as specified by `DataInputStream.readUnsignedShort()`,
 except using little-endian byte order.
@return the next two bytes of the input stream, interpreted as an unsigned 16-bit integer in
     little-endian byte order
@throws IOException if an I/O error occurs

### `readInt()`

**Returns:** `int`

Reads an integer as specified by `DataInputStream.readInt()`, except using little-endian
 byte order.
@return the next four bytes of the input stream, interpreted as an `int` in little-endian
     byte order
@throws IOException if an I/O error occurs

### `readLong()`

**Returns:** `long`

Reads a `long` as specified by `DataInputStream.readLong()`, except using
 little-endian byte order.
@return the next eight bytes of the input stream, interpreted as a `long` in
     little-endian byte order
@throws IOException if an I/O error occurs

### `readFloat()`

**Returns:** `float`

Reads a `float` as specified by `DataInputStream.readFloat()`, except using
 little-endian byte order.
@return the next four bytes of the input stream, interpreted as a `float` in
     little-endian byte order
@throws IOException if an I/O error occurs

### `readDouble()`

**Returns:** `double`

Reads a `double` as specified by `DataInputStream.readDouble()`, except using
 little-endian byte order.
@return the next eight bytes of the input stream, interpreted as a `double` in
     little-endian byte order
@throws IOException if an I/O error occurs

### `readUTF()`

**Returns:** `java.lang.String`

### `readShort()`

**Returns:** `short`

Reads a `short` as specified by `DataInputStream.readShort()`, except using
 little-endian byte order.
@return the next two bytes of the input stream, interpreted as a `short` in little-endian
     byte order.
@throws IOException if an I/O error occurs.

### `readChar()`

**Returns:** `char`

Reads a char as specified by `DataInputStream.readChar()`, except using little-endian
 byte order.
@return the next two bytes of the input stream, interpreted as a `char` in little-endian
     byte order
@throws IOException if an I/O error occurs

### `readByte()`

**Returns:** `byte`

### `readBoolean()`

**Returns:** `boolean`

### `readAndCheckByte()`

**Returns:** `byte`

Reads a byte from the input stream checking that the end of file (EOF) has not been
 encountered.
@return byte read from input
@throws IOException if an error is encountered while reading
@throws EOFException if the end of file (EOF) is encountered.

