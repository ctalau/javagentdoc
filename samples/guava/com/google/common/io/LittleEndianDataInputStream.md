# Class: `LittleEndianDataInputStream`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.LittleEndianDataInputStream`

**Extends:** [`java.io.FilterInputStream`](../../../../java/io/FilterInputStream.md)

**Implements:** [`java.io.DataInput`](../../../../java/io/DataInput.md)

## Description

An implementation of {@link DataInput} that uses little-endian byte ordering for reading {@code
 short}, {@code int}, {@code float}, {@code double}, and {@code long} values.

 <p><b>Note:</b> This class intentionally violates the specification of its supertype {@code
 DataInput}, which explicitly requires big-endian byte order.
@author Chris Nokleberg
@author Keith Bottner
@since 8.0

## Constructors

### `<init>([`java.io.InputStream`](../../../../java/io/InputStream.md) in)`

Creates a {@code LittleEndianDataInputStream} that wraps the given stream.
@param in the stream to delegate to

## Methods

### `readLine()`

**Returns:** `java.lang.String`

This method will throw an {@link UnsupportedOperationException}.

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

Reads an unsigned {@code short} as specified by {@link DataInputStream#readUnsignedShort()},
 except using little-endian byte order.
@return the next two bytes of the input stream, interpreted as an unsigned 16-bit integer in
     little-endian byte order
@throws IOException if an I/O error occurs

### `readInt()`

**Returns:** `int`

Reads an integer as specified by {@link DataInputStream#readInt()}, except using little-endian
 byte order.
@return the next four bytes of the input stream, interpreted as an {@code int} in little-endian
     byte order
@throws IOException if an I/O error occurs

### `readLong()`

**Returns:** `long`

Reads a {@code long} as specified by {@link DataInputStream#readLong()}, except using
 little-endian byte order.
@return the next eight bytes of the input stream, interpreted as a {@code long} in
     little-endian byte order
@throws IOException if an I/O error occurs

### `readFloat()`

**Returns:** `float`

Reads a {@code float} as specified by {@link DataInputStream#readFloat()}, except using
 little-endian byte order.
@return the next four bytes of the input stream, interpreted as a {@code float} in
     little-endian byte order
@throws IOException if an I/O error occurs

### `readDouble()`

**Returns:** `double`

Reads a {@code double} as specified by {@link DataInputStream#readDouble()}, except using
 little-endian byte order.
@return the next eight bytes of the input stream, interpreted as a {@code double} in
     little-endian byte order
@throws IOException if an I/O error occurs

### `readUTF()`

**Returns:** `java.lang.String`

### `readShort()`

**Returns:** `short`

Reads a {@code short} as specified by {@link DataInputStream#readShort()}, except using
 little-endian byte order.
@return the next two bytes of the input stream, interpreted as a {@code short} in little-endian
     byte order.
@throws IOException if an I/O error occurs.

### `readChar()`

**Returns:** `char`

Reads a char as specified by {@link DataInputStream#readChar()}, except using little-endian
 byte order.
@return the next two bytes of the input stream, interpreted as a {@code char} in little-endian
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

