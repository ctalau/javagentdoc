# Class: `CharSink`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.CharSink`

## Description

Unlike a Writer, a
 CharSink is not an open, stateful stream that can be written to and closed. Instead, it
 is an immutable *supplier* of Writer instances.

 
CharSink provides two kinds of methods:

 

   - **Methods that return a writer:** These methods should return a *new*, independent
       instance each time they are called. The caller is responsible for ensuring that the
       returned writer is closed.
   - **Convenience methods:** These are implementations of common operations that are
       typically implemented by opening a writer using one of the methods in the first category,
       doing something and finally closing the writer that was opened.
 


 
Any ByteSink may be viewed as a CharSink with a specific character encoding using ByteSink#asCharSink(Charset). Characters written to the
 resulting CharSink will written to the ByteSink as encoded bytes.

## Constructors

### `<init>()`

## Methods

### `openStream()`

This method returns a new, independent
 writer each time it is called.

 
The caller is responsible for ensuring that the returned writer is closed.

**Returns:** `java.io.Writer`

### `openBufferedStream()`

The returned stream is not
 required to be a BufferedWriter in order to allow implementations to simply delegate to
 #openStream() when the stream returned by that method does not benefit from additional
 buffering. This method returns a new, independent writer each time it is called.

 
The caller is responsible for ensuring that the returned writer is closed.

**Returns:** `java.io.Writer`

### `write(CharSequence charSequence)`

**Parameters:**
- `charSequence` (`java.lang.CharSequence`)

**Returns:** `void`

### `writeLines(Iterable<? extends CharSequence> lines)`

This method is equivalent to 
 writeLines(lines, System.getProperty("line.separator")).

**Parameters:**
- `lines` (`java.lang.Iterable<? extends java.lang.CharSequence>`)

**Returns:** `void`

### `writeLines(Iterable<? extends CharSequence> lines, String lineSeparator)`

**Parameters:**
- `lines` (`java.lang.Iterable<? extends java.lang.CharSequence>`)
- `lineSeparator` (`java.lang.String`)

**Returns:** `void`

### `writeLines(Stream<? extends CharSequence> lines)`

This method is equivalent to 
 writeLines(lines, System.getProperty("line.separator")).

**Parameters:**
- `lines` (`java.util.stream.Stream<? extends java.lang.CharSequence>`)

**Returns:** `void`

### `writeLines(Stream<? extends CharSequence> lines, String lineSeparator)`

**Parameters:**
- `lines` (`java.util.stream.Stream<? extends java.lang.CharSequence>`)
- `lineSeparator` (`java.lang.String`)

**Returns:** `void`

### `writeLines(Iterator<? extends CharSequence> lines, String lineSeparator)`

**Parameters:**
- `lines` (`java.util.Iterator<? extends java.lang.CharSequence>`)
- `lineSeparator` (`java.lang.String`)

**Returns:** `void`

### `writeFrom(Readable readable)`

Does not close readable if it is Closeable.

**Parameters:**
- `readable` (`java.lang.Readable`)

**Returns:** `long`

