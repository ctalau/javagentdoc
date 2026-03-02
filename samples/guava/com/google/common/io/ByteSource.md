# Class: `ByteSource`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.ByteSource`

## Description

Unlike an InputStream, a ByteSource
 is not an open, stateful stream for input that can be read and closed. Instead, it is an
 immutable *supplier* of InputStream instances.

 
ByteSource provides two kinds of methods:

 

   - **Methods that return a stream:** These methods should return a *new*, independent
       instance each time they are called. The caller is responsible for ensuring that the
       returned stream is closed.
   - **Convenience methods:** These are implementations of common operations that are
       typically implemented by opening a stream using one of the methods in the first category,
       doing something and finally closing the stream that was opened.
 


 
**Note:** In general, ByteSource is intended to be used for "file-like" sources
 that provide streams that are:

 

   - **Finite:** Many operations, such as #size() and #read(), will either
       block indefinitely or fail if the source creates an infinite stream.
   - **Non-destructive:** A *destructive* stream will consume or otherwise alter the
       bytes of the source as they are read from it. A source that provides such streams will not
       be reusable, and operations that read from the stream (including #size(), in some
       implementations) will prevent further operations from completing as expected.

## Constructors

### `<init>()`

## Methods

### `asCharSource(java.nio.charset.Charset charset)`

**Returns:** [`com.google.common.io.CharSource`](./CharSource.md)

If CharSource#asByteSource is called on the returned source with the same charset,
 the default implementation of this method will ensure that the original ByteSource is
 returned, rather than round-trip encoding. Subclasses that override this method should behave
 the same way.

**Parameters:**
- `charset` (`java.nio.charset.Charset`)

### `openStream()`

**Returns:** `java.io.InputStream`

This method returns a new,
 independent stream each time it is called.

 
The caller is responsible for ensuring that the returned stream is closed.

### `openBufferedStream()`

**Returns:** `java.io.InputStream`

The returned stream is
 not required to be a BufferedInputStream in order to allow implementations to simply
 delegate to #openStream() when the stream returned by that method does not benefit from
 additional buffering (for example, a ByteArrayInputStream). This method returns a new,
 independent stream each time it is called.

 
The caller is responsible for ensuring that the returned stream is closed.

### `slice(long offset, long length)`

**Returns:** [`com.google.common.io.ByteSource`](./ByteSource.md)

If offset is greater than the size of this
 source, the returned source will be empty. If offset + length is greater than the size
 of this source, the returned source will contain the slice starting at offset and
 ending at the end of this source.

**Parameters:**
- `offset` (`long`)
- `length` (`long`)

### `isEmpty()`

**Returns:** `boolean`

The default implementation first checks #sizeIfKnown, returning true if it's known to be zero and false if it's known to be non-zero.
 If the size is not known, it falls back to opening a stream and checking for EOF.

 
Note that, in cases where sizeIfKnown returns zero, it is *possible* that bytes
 are actually available for reading. (For example, some special files may return a size of 0
 despite actually having content when read.) This means that a source may return true
 from isEmpty() despite having readable content.

### `sizeIfKnown()`

**Returns:** [`com.google.common.base.Optional<java.lang.Long>`](../base/Optional.md)

The default implementation returns Optional#absent. Some sources, such as a file,
 may return a non-absent value. Note that in such cases, it is *possible* that this method
 will return a different number of bytes than would be returned by reading all of the bytes (for
 example, some special files may return a size of 0 despite actually having content when read).

 
Additionally, for mutable sources such as files, a subsequent read may return a different
 number of bytes if the contents are changed.

### `size()`

**Returns:** `long`

To avoid a potentially expensive operation, see #sizeIfKnown.

 
The default implementation calls #sizeIfKnown and returns the value if present. If
 absent, it will fall back to a heavyweight operation that will open a stream, read (or skip, if possible) to the end of the stream and return the total number
 of bytes that were read.

 
Note that for some sources that implement #sizeIfKnown to provide a more efficient
 implementation, it is *possible* that this method will return a different number of bytes
 than would be returned by reading all of the bytes (for example, some special files may return
 a size of 0 despite actually having content when read).

 
In either case, for mutable sources such as files, a subsequent read may return a different
 number of bytes if the contents are changed.

### `countBySkipping(java.io.InputStream in)`

**Returns:** `long`

**Parameters:**
- `in` (`java.io.InputStream`)

### `copyTo(java.io.OutputStream output)`

**Returns:** `long`

Does not close
 output.

**Parameters:**
- `output` (`java.io.OutputStream`)

### `copyTo(com.google.common.io.ByteSink sink)`

**Returns:** `long`

**Parameters:**
- `sink` ([`com.google.common.io.ByteSink`](./ByteSink.md))

### `read()`

**Returns:** `byte[]`

### `read(com.google.common.io.ByteProcessor<T> processor)`

**Returns:** `T`

Stops when all bytes have been read or the consumer returns false.
 Returns the result produced by the processor.

**Parameters:**
- `processor` ([`com.google.common.io.ByteProcessor<T>`](./ByteProcessor.md))

### `hash(com.google.common.hash.HashFunction hashFunction)`

**Returns:** [`com.google.common.hash.HashCode`](../hash/HashCode.md)

**Parameters:**
- `hashFunction` ([`com.google.common.hash.HashFunction`](../hash/HashFunction.md))

### `contentEquals(com.google.common.io.ByteSource other)`

**Returns:** `boolean`

**Parameters:**
- `other` ([`com.google.common.io.ByteSource`](./ByteSource.md))

### `concat(java.lang.Iterable<? extends com.google.common.io.ByteSource> sources)`

**Returns:** [`com.google.common.io.ByteSource`](./ByteSource.md)

Streams returned from
 the source will contain the concatenated data from the streams of the underlying sources.

 
Only one underlying stream will be open at a time. Closing the concatenated stream will
 close the open underlying stream.

**Parameters:**
- `sources` (`java.lang.Iterable<? extends com.google.common.io.ByteSource>`): the sources to concatenate

### `concat(java.util.Iterator<? extends com.google.common.io.ByteSource> sources)`

**Returns:** [`com.google.common.io.ByteSource`](./ByteSource.md)

Streams returned from
 the source will contain the concatenated data from the streams of the underlying sources.

 
Only one underlying stream will be open at a time. Closing the concatenated stream will
 close the open underlying stream.

 
Note: The input Iterator will be copied to an ImmutableList when this method
 is called. This will fail if the iterator is infinite and may cause problems if the iterator
 eagerly fetches data for each source when iterated (rather than producing sources that only
 load data through their streams). Prefer using the #concat(Iterable) overload if
 possible.

**Parameters:**
- `sources` (`java.util.Iterator<? extends com.google.common.io.ByteSource>`): the sources to concatenate

### `concat(com.google.common.io.ByteSource[] sources)`

**Returns:** [`com.google.common.io.ByteSource`](./ByteSource.md)

Streams returned from
 the source will contain the concatenated data from the streams of the underlying sources.

 
Only one underlying stream will be open at a time. Closing the concatenated stream will
 close the open underlying stream.

**Parameters:**
- `sources` ([`com.google.common.io.ByteSource[]`](./ByteSource.md)): the sources to concatenate

### `wrap(byte[] b)`

**Returns:** [`com.google.common.io.ByteSource`](./ByteSource.md)

To view only a specific range
 in the array, use ByteSource.wrap(b).slice(offset, length).

 
Note that the given byte array may be passed directly to methods on, for example, 
 OutputStream (when copyTo(OutputStream) is called on the resulting 
 ByteSource). This could allow a malicious OutputStream implementation to modify the
 contents of the array, but provides better performance in the normal case.

**Parameters:**
- `b` (`byte[]`)

### `empty()`

**Returns:** [`com.google.common.io.ByteSource`](./ByteSource.md)

