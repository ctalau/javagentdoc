# Class: `LineReader`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.LineReader`

## Description

A class for reading lines of text. Provides the same functionality as {@link java.io.BufferedReader#readLine()} but for all {@link Readable} objects, not just instances of
 {@link Reader}.
@author Chris Nokleberg
@since 1.0

## Fields

### `readable`

**Type:** `java.lang.Readable`

### `reader`

**Type:** [`java.io.Reader`](../../../../java/io/Reader.md)

### `cbuf`

**Type:** [`java.nio.CharBuffer`](../../../../java/nio/CharBuffer.md)

### `buf`

**Type:** `char[]`

### `lines`

**Type:** [`java.util.Queue<java.lang.String>`](../../../../java/util/Queue.md)

### `lineBuf`

**Type:** [`com.google.common.io.LineBuffer`](./LineBuffer.md)

## Constructors

### `<init>(`java.lang.Readable` readable)`

Creates a new instance that will read lines from the given {@code Readable} object.

## Methods

### `readLine()`

**Returns:** `java.lang.String`

Reads a line of text. A line is considered to be terminated by any one of a line feed ({@code
 '\n'}), a carriage return ({@code '\r'}), or a carriage return followed immediately by a
 linefeed ({@code "\r\n"}).
@return a {@code String} containing the contents of the line, not including any
     line-termination characters, or {@code null} if the end of the stream has been reached.
@throws IOException if an I/O error occurs

