# Class: `ByteSink`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.ByteSink`

## Description

Unlike an OutputStream, a
 ByteSink is not an open, stateful stream that can be written to and closed. Instead, it
 is an immutable *supplier* of OutputStream instances.

 
ByteSink provides two kinds of methods:

 

   - **Methods that return a stream:** These methods should return a *new*, independent
       instance each time they are called. The caller is responsible for ensuring that the
       returned stream is closed.
   - **Convenience methods:** These are implementations of common operations that are
       typically implemented by opening a stream using one of the methods in the first category,
       doing something and finally closing the stream or channel that was opened.

## Constructors

### `<init>()`

## Methods

### `asCharSink(Charset charset)`

**Parameters:**
- `charset` (`java.nio.charset.Charset`)

**Returns:** [`com.google.common.io.CharSink`](./CharSink.md)

### `openStream()`

This method returns a new,
 independent stream each time it is called.

 
The caller is responsible for ensuring that the returned stream is closed.

**Returns:** `java.io.OutputStream`

### `openBufferedStream()`

The returned stream is not
 required to be a BufferedOutputStream in order to allow implementations to simply
 delegate to #openStream() when the stream returned by that method does not benefit from
 additional buffering (for example, a ByteArrayOutputStream). This method returns a new,
 independent stream each time it is called.

 
The caller is responsible for ensuring that the returned stream is closed.

**Returns:** `java.io.OutputStream`

### `write(byte[] bytes)`

**Parameters:**
- `bytes` (`byte[]`)

**Returns:** `void`

### `writeFrom(InputStream input)`

Does not close 
 input.

**Parameters:**
- `input` (`java.io.InputStream`)

**Returns:** `long`

