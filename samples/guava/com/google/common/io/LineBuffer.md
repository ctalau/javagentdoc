# Class: `LineBuffer`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.LineBuffer`

## Description

Line separators are per java.io.BufferedReader: line feed, carriage return,
 or carriage return followed immediately by a linefeed.

 
Subclasses must implement #handleLine, call #add to pass character data, and
 call #finish at the end of stream.

## Fields

### `line`

**Type:** `java.lang.StringBuilder`

### `sawReturn`

**Type:** `boolean`

## Constructors

### `<init>()`

## Methods

### `add(char[] cbuf, int off, int len)`

When a line separator is found the contents of
 the line and the line separator itself are passed to the abstract #handleLine method.

**Parameters:**
- `cbuf` (`char[]`): the character buffer to process
- `off` (`int`): the offset into the buffer
- `len` (`int`): the number of characters to process

**Returns:** `void`

### `finishLine(boolean sawNewline)`

**Parameters:**
- `sawNewline` (`boolean`)

**Returns:** `boolean`

### `finish()`

**Returns:** `void`

### `handleLine(String line, String end)`

**Parameters:**
- `line` (`java.lang.String`): a line of text (possibly empty), without any line separators
- `end` (`java.lang.String`): the line separator; one of "\r", "\n", "\r\n", or ""

**Returns:** `void`

