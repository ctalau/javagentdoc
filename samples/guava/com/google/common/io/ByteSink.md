# Class: `ByteSink`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.ByteSink`

## Description

A destination to which bytes can be written, such as a file. Unlike an `OutputStream`, a
 `ByteSink` is not an open, stateful stream that can be written to and closed. Instead, it
 is an immutable <i>supplier</i> of `OutputStream` instances.

 <p>`ByteSink` provides two kinds of methods:

 <ul>
   <li><b>Methods that return a stream:</b> These methods should return a <i>new</i>, independent
       instance each time they are called. The caller is responsible for ensuring that the
       returned stream is closed.
   <li><b>Convenience methods:</b> These are implementations of common operations that are
       typically implemented by opening a stream using one of the methods in the first category,
       doing something and finally closing the stream or channel that was opened.
 </ul>
**Since:** 14.0
**Author:** Colin Decker

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `asCharSink(`java.nio.charset.Charset` charset)`

**Returns:** [`com.google.common.io.CharSink`](./CharSink.md)

Returns a `CharSink` view of this `ByteSink` that writes characters to this sink as
 bytes encoded with the given `Charset`.

### `openStream()`

**Returns:** `java.io.OutputStream`

Opens a new `OutputStream` for writing to this sink. This method returns a new,
 independent stream each time it is called.

 <p>The caller is responsible for ensuring that the returned stream is closed.
@throws IOException if an I/O error occurs while opening the stream

### `openBufferedStream()`

**Returns:** `java.io.OutputStream`

Opens a new buffered `OutputStream` for writing to this sink. The returned stream is not
 required to be a `BufferedOutputStream` in order to allow implementations to simply
 delegate to `openStream()` when the stream returned by that method does not benefit from
 additional buffering (for example, a `ByteArrayOutputStream`). This method returns a new,
 independent stream each time it is called.

 <p>The caller is responsible for ensuring that the returned stream is closed.
@throws IOException if an I/O error occurs while opening the stream
**Since:** 15.0 (in 14.0 with return type `BufferedOutputStream`)

### `write(`byte[]` bytes)`

**Returns:** `void`

Writes all the given bytes to this sink.
@throws IOException if an I/O occurs while writing to this sink

### `writeFrom(`java.io.InputStream` input)`

**Returns:** `long`

Writes all the bytes from the given `InputStream` to this sink. Does not close `input`.
@return the number of bytes written
@throws IOException if an I/O occurs while reading from `input` or writing to this sink

