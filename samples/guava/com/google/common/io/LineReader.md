# Class: `LineReader`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.LineReader`

## Description

Provides the same functionality as java.io.BufferedReader#readLine() but for all Readable objects, not just instances of
 Reader.

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

### `<init>(java.lang.Readable readable)`

**Parameters:**
- `readable` (`java.lang.Readable`)

## Methods

### `readLine()`

**Returns:** `java.lang.String`

A line is considered to be terminated by any one of a line feed (
 '\n'), a carriage return ('\r'), or a carriage return followed immediately by a
 linefeed ("\r\n").

