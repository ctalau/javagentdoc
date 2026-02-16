# Class: `LineReader`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.LineReader`

## Description

A class for reading lines of text. Provides the same functionality as `java.io.BufferedReader.readLine()` but for all `Readable` objects, not just instances of
 `Reader`.
**Author:** Chris Nokleberg
**Since:** 1.0

## Fields

### `readable`

**Type:** `java.lang.Readable`

### `reader`

**Type:** `java.io.Reader`

### `cbuf`

**Type:** `java.nio.CharBuffer`

### `buf`

**Type:** `char[]`

### `lines`

**Type:** `java.util.Queue<java.lang.String>`

### `lineBuf`

**Type:** [`com.google.common.io.LineBuffer`](./LineBuffer.md)

## Constructors

### `<init>(`java.lang.Readable` readable)`

Creates a new instance that will read lines from the given `Readable` object.

## Methods

### `readLine()`

**Returns:** `java.lang.String`

Reads a line of text. A line is considered to be terminated by any one of a line feed (`'\n'`), a carriage return (`'\r'`), or a carriage return followed immediately by a
 linefeed (`"\r\n"`).
@return a `String` containing the contents of the line, not including any
     line-termination characters, or `null` if the end of the stream has been reached.
@throws IOException if an I/O error occurs

