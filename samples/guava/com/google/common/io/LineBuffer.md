# Class: `LineBuffer`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.LineBuffer`

## Description

Package-protected abstract class that implements the line reading algorithm used by {@link LineReader}. Line separators are per {@link java.io.BufferedReader}: line feed, carriage return,
 or carriage return followed immediately by a linefeed.

 <p>Subclasses must implement {@link #handleLine}, call {@link #add} to pass character data, and
 call {@link #finish} at the end of stream.
@author Chris Nokleberg
@since 1.0

## Fields

### `line`

**Type:** `java.lang.StringBuilder`

Holds partial line contents.

### `sawReturn`

**Type:** `boolean`

Whether a line ending with a CR is pending processing.

## Constructors

### `<init>()`

## Methods

### `add(`char[]` cbuf, `int` off, `int` len)`

**Returns:** `void`

Process additional characters from the stream. When a line separator is found the contents of
 the line and the line separator itself are passed to the abstract {@link #handleLine} method.
@param cbuf the character buffer to process
@param off the offset into the buffer
@param len the number of characters to process
@throws IOException if an I/O error occurs
@see #finish

### `finishLine(`boolean` sawNewline)`

**Returns:** `boolean`

Called when a line is complete.

### `finish()`

**Returns:** `void`

Subclasses must call this method after finishing character processing, in order to ensure that
 any unterminated line in the buffer is passed to {@link #handleLine}.
@throws IOException if an I/O error occurs

### `handleLine(`java.lang.String` line, `java.lang.String` end)`

**Returns:** `void`

Called for each line found in the character data passed to {@link #add}.
@param line a line of text (possibly empty), without any line separators
@param end the line separator; one of {@code "\r"}, {@code "\n"}, {@code "\r\n"}, or {@code ""}
@throws IOException if an I/O error occurs

