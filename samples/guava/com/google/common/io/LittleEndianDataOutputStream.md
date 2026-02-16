# Class: `LittleEndianDataOutputStream`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.LittleEndianDataOutputStream`

**Extends:** [`java.io.FilterOutputStream`](../../../../java/io/FilterOutputStream.md)

**Implements:** [`java.io.DataOutput`](../../../../java/io/DataOutput.md)

## Description

An implementation of {@link DataOutput} that uses little-endian byte ordering for writing {@code
 char}, {@code short}, {@code int}, {@code float}, {@code double}, and {@code long} values.

 <p><b>Note:</b> This class intentionally violates the specification of its supertype {@code
 DataOutput}, which explicitly requires big-endian byte order.
@author Chris Nokleberg
@author Keith Bottner
@since 8.0

## Constructors

### `<init>([`java.io.OutputStream`](../../../../java/io/OutputStream.md) out)`

Creates a {@code LittleEndianDataOutputStream} that wraps the given stream.
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

@deprecated The semantics of {@code writeBytes(String s)} are considered dangerous. Please use
     {@link #writeUTF(String s)}, {@link #writeChars(String s)} or another write method instead.

### `writeChar(`int` v)`

**Returns:** `void`

Writes a char as specified by {@link DataOutputStream#writeChar(int)}, except using
 little-endian byte order.
@throws IOException if an I/O error occurs

### `writeChars(`java.lang.String` s)`

**Returns:** `void`

Writes a {@code String} as specified by {@link DataOutputStream#writeChars(String)}, except
 each character is written using little-endian byte order.
@throws IOException if an I/O error occurs

### `writeDouble(`double` v)`

**Returns:** `void`

Writes a {@code double} as specified by {@link DataOutputStream#writeDouble(double)}, except
 using little-endian byte order.
@throws IOException if an I/O error occurs

### `writeFloat(`float` v)`

**Returns:** `void`

Writes a {@code float} as specified by {@link DataOutputStream#writeFloat(float)}, except using
 little-endian byte order.
@throws IOException if an I/O error occurs

### `writeInt(`int` v)`

**Returns:** `void`

Writes an {@code int} as specified by {@link DataOutputStream#writeInt(int)}, except using
 little-endian byte order.
@throws IOException if an I/O error occurs

### `writeLong(`long` v)`

**Returns:** `void`

Writes a {@code long} as specified by {@link DataOutputStream#writeLong(long)}, except using
 little-endian byte order.
@throws IOException if an I/O error occurs

### `writeShort(`int` v)`

**Returns:** `void`

Writes a {@code short} as specified by {@link DataOutputStream#writeShort(int)}, except using
 little-endian byte order.
@throws IOException if an I/O error occurs

### `writeUTF(`java.lang.String` str)`

**Returns:** `void`

### `close()`

**Returns:** `void`

