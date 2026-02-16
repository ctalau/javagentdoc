# Class: `CharSink`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.CharSink`

## Description

A destination to which characters can be written, such as a text file. Unlike a {@link Writer}, a
 {@code CharSink} is not an open, stateful stream that can be written to and closed. Instead, it
 is an immutable <i>supplier</i> of {@code Writer} instances.

 <p>{@code CharSink} provides two kinds of methods:

 <ul>
   <li><b>Methods that return a writer:</b> These methods should return a <i>new</i>, independent
       instance each time they are called. The caller is responsible for ensuring that the
       returned writer is closed.
   <li><b>Convenience methods:</b> These are implementations of common operations that are
       typically implemented by opening a writer using one of the methods in the first category,
       doing something and finally closing the writer that was opened.
 </ul>

 <p>Any {@link ByteSink} may be viewed as a {@code CharSink} with a specific {@linkplain Charset character encoding} using {@link ByteSink#asCharSink(Charset)}. Characters written to the
 resulting {@code CharSink} will written to the {@code ByteSink} as encoded bytes.
@since 14.0
@author Colin Decker

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `openStream()`

**Returns:** [`java.io.Writer`](../../../../java/io/Writer.md)

Opens a new {@link Writer} for writing to this sink. This method returns a new, independent
 writer each time it is called.

 <p>The caller is responsible for ensuring that the returned writer is closed.
@throws IOException if an I/O error occurs while opening the writer

### `openBufferedStream()`

**Returns:** [`java.io.Writer`](../../../../java/io/Writer.md)

Opens a new buffered {@link Writer} for writing to this sink. The returned stream is not
 required to be a {@link BufferedWriter} in order to allow implementations to simply delegate to
 {@link #openStream()} when the stream returned by that method does not benefit from additional
 buffering. This method returns a new, independent writer each time it is called.

 <p>The caller is responsible for ensuring that the returned writer is closed.
@throws IOException if an I/O error occurs while opening the writer
@since 15.0 (in 14.0 with return type {@link BufferedWriter})

### `write(`java.lang.CharSequence` charSequence)`

**Returns:** `void`

Writes the given character sequence to this sink.
@throws IOException if an I/O error while writing to this sink

### `writeLines(`java.lang.Iterable<? extends java.lang.CharSequence>` lines)`

**Returns:** `void`

Writes the given lines of text to this sink with each line (including the last) terminated with
 the operating system's default line separator. This method is equivalent to {@code
 writeLines(lines, System.getProperty("line.separator"))}.
@throws IOException if an I/O error occurs while writing to this sink

### `writeLines(`java.lang.Iterable<? extends java.lang.CharSequence>` lines, `java.lang.String` lineSeparator)`

**Returns:** `void`

Writes the given lines of text to this sink with each line (including the last) terminated with
 the given line separator.
@throws IOException if an I/O error occurs while writing to this sink

### `writeLines([`java.util.stream.Stream<? extends java.lang.CharSequence>`](../../../../java/util/stream/Stream.md) lines)`

**Returns:** `void`

Writes the given lines of text to this sink with each line (including the last) terminated with
 the operating system's default line separator. This method is equivalent to {@code
 writeLines(lines, System.getProperty("line.separator"))}.
@throws IOException if an I/O error occurs while writing to this sink
@since 22.0

### `writeLines([`java.util.stream.Stream<? extends java.lang.CharSequence>`](../../../../java/util/stream/Stream.md) lines, `java.lang.String` lineSeparator)`

**Returns:** `void`

Writes the given lines of text to this sink with each line (including the last) terminated with
 the given line separator.
@throws IOException if an I/O error occurs while writing to this sink
@since 22.0

### `writeLines([`java.util.Iterator<? extends java.lang.CharSequence>`](../../../../java/util/Iterator.md) lines, `java.lang.String` lineSeparator)`

**Returns:** `void`

### `writeFrom(`java.lang.Readable` readable)`

**Returns:** `long`

Writes all the text from the given {@link Readable} (such as a {@link Reader}) to this sink.
 Does not close {@code readable} if it is {@code Closeable}.
@return the number of characters written
@throws IOException if an I/O error occurs while reading from {@code readable} or writing to
     this sink

