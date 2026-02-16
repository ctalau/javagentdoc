# Class: `CharSink`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.CharSink`

## Description

A destination to which characters can be written, such as a text file. Unlike a `Writer`, a
 `CharSink` is not an open, stateful stream that can be written to and closed. Instead, it
 is an immutable <i>supplier</i> of `Writer` instances.

 <p>`CharSink` provides two kinds of methods:

 <ul>
   <li><b>Methods that return a writer:</b> These methods should return a <i>new</i>, independent
       instance each time they are called. The caller is responsible for ensuring that the
       returned writer is closed.
   <li><b>Convenience methods:</b> These are implementations of common operations that are
       typically implemented by opening a writer using one of the methods in the first category,
       doing something and finally closing the writer that was opened.
 </ul>

 <p>Any `ByteSink` may be viewed as a `CharSink` with a specific character encoding using `ByteSink.asCharSink(Charset)`. Characters written to the
 resulting `CharSink` will written to the `ByteSink` as encoded bytes.
**Since:** 14.0
**Author:** Colin Decker

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `openStream()`

**Returns:** `java.io.Writer`

Opens a new `Writer` for writing to this sink. This method returns a new, independent
 writer each time it is called.

 <p>The caller is responsible for ensuring that the returned writer is closed.
@throws IOException if an I/O error occurs while opening the writer

### `openBufferedStream()`

**Returns:** `java.io.Writer`

Opens a new buffered `Writer` for writing to this sink. The returned stream is not
 required to be a `BufferedWriter` in order to allow implementations to simply delegate to
 `openStream()` when the stream returned by that method does not benefit from additional
 buffering. This method returns a new, independent writer each time it is called.

 <p>The caller is responsible for ensuring that the returned writer is closed.
@throws IOException if an I/O error occurs while opening the writer
**Since:** 15.0 (in 14.0 with return type `BufferedWriter`)

### `write(`java.lang.CharSequence` charSequence)`

**Returns:** `void`

Writes the given character sequence to this sink.
@throws IOException if an I/O error while writing to this sink

### `writeLines(`java.lang.Iterable<? extends java.lang.CharSequence>` lines)`

**Returns:** `void`

Writes the given lines of text to this sink with each line (including the last) terminated with
 the operating system's default line separator. This method is equivalent to `writeLines(lines, System.getProperty("line.separator"))`.
@throws IOException if an I/O error occurs while writing to this sink

### `writeLines(`java.lang.Iterable<? extends java.lang.CharSequence>` lines, `java.lang.String` lineSeparator)`

**Returns:** `void`

Writes the given lines of text to this sink with each line (including the last) terminated with
 the given line separator.
@throws IOException if an I/O error occurs while writing to this sink

### `writeLines(`java.util.stream.Stream<? extends java.lang.CharSequence>` lines)`

**Returns:** `void`

Writes the given lines of text to this sink with each line (including the last) terminated with
 the operating system's default line separator. This method is equivalent to `writeLines(lines, System.getProperty("line.separator"))`.
@throws IOException if an I/O error occurs while writing to this sink
**Since:** 22.0

### `writeLines(`java.util.stream.Stream<? extends java.lang.CharSequence>` lines, `java.lang.String` lineSeparator)`

**Returns:** `void`

Writes the given lines of text to this sink with each line (including the last) terminated with
 the given line separator.
@throws IOException if an I/O error occurs while writing to this sink
**Since:** 22.0

### `writeLines(`java.util.Iterator<? extends java.lang.CharSequence>` lines, `java.lang.String` lineSeparator)`

**Returns:** `void`

### `writeFrom(`java.lang.Readable` readable)`

**Returns:** `long`

Writes all the text from the given `Readable` (such as a `Reader`) to this sink.
 Does not close `readable` if it is `Closeable`.
@return the number of characters written
@throws IOException if an I/O error occurs while reading from `readable` or writing to
     this sink

