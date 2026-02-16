# Class: `ByteSource`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.ByteSource`

## Description

A readable source of bytes, such as a file. Unlike an {@link InputStream}, a {@code ByteSource}
 is not an open, stateful stream for input that can be read and closed. Instead, it is an
 immutable <i>supplier</i> of {@code InputStream} instances.

 <p>{@code ByteSource} provides two kinds of methods:

 <ul>
   <li><b>Methods that return a stream:</b> These methods should return a <i>new</i>, independent
       instance each time they are called. The caller is responsible for ensuring that the
       returned stream is closed.
   <li><b>Convenience methods:</b> These are implementations of common operations that are
       typically implemented by opening a stream using one of the methods in the first category,
       doing something and finally closing the stream that was opened.
 </ul>

 <p><b>Note:</b> In general, {@code ByteSource} is intended to be used for "file-like" sources
 that provide streams that are:

 <ul>
   <li><b>Finite:</b> Many operations, such as {@link #size()} and {@link #read()}, will either
       block indefinitely or fail if the source creates an infinite stream.
   <li><b>Non-destructive:</b> A <i>destructive</i> stream will consume or otherwise alter the
       bytes of the source as they are read from it. A source that provides such streams will not
       be reusable, and operations that read from the stream (including {@link #size()}, in some
       implementations) will prevent further operations from completing as expected.
 </ul>
@since 14.0
@author Colin Decker

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `asCharSource([`java.nio.charset.Charset`](../../../../java/nio/charset/Charset.md) charset)`

**Returns:** [`com.google.common.io.CharSource`](./CharSource.md)

Returns a {@link CharSource} view of this byte source that decodes bytes read from this source
 as characters using the given {@link Charset}.

 <p>If {@link CharSource#asByteSource} is called on the returned source with the same charset,
 the default implementation of this method will ensure that the original {@code ByteSource} is
 returned, rather than round-trip encoding. Subclasses that override this method should behave
 the same way.

### `openStream()`

**Returns:** [`java.io.InputStream`](../../../../java/io/InputStream.md)

Opens a new {@link InputStream} for reading from this source. This method returns a new,
 independent stream each time it is called.

 <p>The caller is responsible for ensuring that the returned stream is closed.
@throws IOException if an I/O error occurs while opening the stream

### `openBufferedStream()`

**Returns:** [`java.io.InputStream`](../../../../java/io/InputStream.md)

Opens a new buffered {@link InputStream} for reading from this source. The returned stream is
 not required to be a {@link BufferedInputStream} in order to allow implementations to simply
 delegate to {@link #openStream()} when the stream returned by that method does not benefit from
 additional buffering (for example, a {@code ByteArrayInputStream}). This method returns a new,
 independent stream each time it is called.

 <p>The caller is responsible for ensuring that the returned stream is closed.
@throws IOException if an I/O error occurs while opening the stream
@since 15.0 (in 14.0 with return type {@link BufferedInputStream})

### `slice(`long` offset, `long` length)`

**Returns:** [`com.google.common.io.ByteSource`](./ByteSource.md)

Returns a view of a slice of this byte source that is at most {@code length} bytes long
 starting at the given {@code offset}. If {@code offset} is greater than the size of this
 source, the returned source will be empty. If {@code offset + length} is greater than the size
 of this source, the returned source will contain the slice starting at {@code offset} and
 ending at the end of this source.
@throws IllegalArgumentException if {@code offset} or {@code length} is negative

### `isEmpty()`

**Returns:** `boolean`

Returns whether the source has zero bytes. The default implementation first checks {@link #sizeIfKnown}, returning true if it's known to be zero and false if it's known to be non-zero.
 If the size is not known, it falls back to opening a stream and checking for EOF.

 <p>Note that, in cases where {@code sizeIfKnown} returns zero, it is <i>possible</i> that bytes
 are actually available for reading. (For example, some special files may return a size of 0
 despite actually having content when read.) This means that a source may return {@code true}
 from {@code isEmpty()} despite having readable content.
@throws IOException if an I/O error occurs
@since 15.0

### `sizeIfKnown()`

**Returns:** [`com.google.common.base.Optional<java.lang.Long>`](../base/Optional.md)

Returns the size of this source in bytes, if the size can be easily determined without actually
 opening the data stream.

 <p>The default implementation returns {@link Optional#absent}. Some sources, such as a file,
 may return a non-absent value. Note that in such cases, it is <i>possible</i> that this method
 will return a different number of bytes than would be returned by reading all of the bytes (for
 example, some special files may return a size of 0 despite actually having content when read).

 <p>Additionally, for mutable sources such as files, a subsequent read may return a different
 number of bytes if the contents are changed.
@since 19.0

### `size()`

**Returns:** `long`

Returns the size of this source in bytes, even if doing so requires opening and traversing an
 entire stream. To avoid a potentially expensive operation, see {@link #sizeIfKnown}.

 <p>The default implementation calls {@link #sizeIfKnown} and returns the value if present. If
 absent, it will fall back to a heavyweight operation that will open a stream, read (or {@link InputStream#skip(long) skip}, if possible) to the end of the stream and return the total number
 of bytes that were read.

 <p>Note that for some sources that implement {@link #sizeIfKnown} to provide a more efficient
 implementation, it is <i>possible</i> that this method will return a different number of bytes
 than would be returned by reading all of the bytes (for example, some special files may return
 a size of 0 despite actually having content when read).

 <p>In either case, for mutable sources such as files, a subsequent read may return a different
 number of bytes if the contents are changed.
@throws IOException if an I/O error occurs while reading the size of this source

### `countBySkipping([`java.io.InputStream`](../../../../java/io/InputStream.md) in)`

**Returns:** `long`

Counts the bytes in the given input stream using skip if possible.

### `copyTo([`java.io.OutputStream`](../../../../java/io/OutputStream.md) output)`

**Returns:** `long`

Copies the contents of this byte source to the given {@code OutputStream}. Does not close
 {@code output}.
@return the number of bytes copied
@throws IOException if an I/O error occurs while reading from this source or writing to {@code
     output}

### `copyTo([`com.google.common.io.ByteSink`](./ByteSink.md) sink)`

**Returns:** `long`

Copies the contents of this byte source to the given {@code ByteSink}.
@return the number of bytes copied
@throws IOException if an I/O error occurs while reading from this source or writing to {@code
     sink}

### `read()`

**Returns:** `byte[]`

Reads the full contents of this byte source as a byte array.
@throws IOException if an I/O error occurs while reading from this source

### `read([`com.google.common.io.ByteProcessor<T>`](./ByteProcessor.md) processor)`

**Returns:** [`T`](T.md)

Reads the contents of this byte source using the given {@code processor} to process bytes as
 they are read. Stops when all bytes have been read or the consumer returns {@code false}.
 Returns the result produced by the processor.
@throws IOException if an I/O error occurs while reading from this source or if {@code
     processor} throws an {@code IOException}
@since 16.0

### `hash([`com.google.common.hash.HashFunction`](../hash/HashFunction.md) hashFunction)`

**Returns:** [`com.google.common.hash.HashCode`](../hash/HashCode.md)

Hashes the contents of this byte source using the given hash function.
@throws IOException if an I/O error occurs while reading from this source

### `contentEquals([`com.google.common.io.ByteSource`](./ByteSource.md) other)`

**Returns:** `boolean`

Checks that the contents of this byte source are equal to the contents of the given byte
 source.
@throws IOException if an I/O error occurs while reading from this source or {@code other}

### `concat(`java.lang.Iterable<? extends com.google.common.io.ByteSource>` sources)`

**Returns:** [`com.google.common.io.ByteSource`](./ByteSource.md)

Concatenates multiple {@link ByteSource} instances into a single source. Streams returned from
 the source will contain the concatenated data from the streams of the underlying sources.

 <p>Only one underlying stream will be open at a time. Closing the concatenated stream will
 close the open underlying stream.
@param sources the sources to concatenate
@return a {@code ByteSource} containing the concatenated data
@since 15.0

### `concat([`java.util.Iterator<? extends com.google.common.io.ByteSource>`](../../../../java/util/Iterator.md) sources)`

**Returns:** [`com.google.common.io.ByteSource`](./ByteSource.md)

Concatenates multiple {@link ByteSource} instances into a single source. Streams returned from
 the source will contain the concatenated data from the streams of the underlying sources.

 <p>Only one underlying stream will be open at a time. Closing the concatenated stream will
 close the open underlying stream.

 <p>Note: The input {@code Iterator} will be copied to an {@code ImmutableList} when this method
 is called. This will fail if the iterator is infinite and may cause problems if the iterator
 eagerly fetches data for each source when iterated (rather than producing sources that only
 load data through their streams). Prefer using the {@link #concat(Iterable)} overload if
 possible.
@param sources the sources to concatenate
@return a {@code ByteSource} containing the concatenated data
@throws NullPointerException if any of {@code sources} is {@code null}
@since 15.0

### `concat([`com.google.common.io.ByteSource[]`](./ByteSource.md) sources)`

**Returns:** [`com.google.common.io.ByteSource`](./ByteSource.md)

Concatenates multiple {@link ByteSource} instances into a single source. Streams returned from
 the source will contain the concatenated data from the streams of the underlying sources.

 <p>Only one underlying stream will be open at a time. Closing the concatenated stream will
 close the open underlying stream.
@param sources the sources to concatenate
@return a {@code ByteSource} containing the concatenated data
@throws NullPointerException if any of {@code sources} is {@code null}
@since 15.0

### `wrap(`byte[]` b)`

**Returns:** [`com.google.common.io.ByteSource`](./ByteSource.md)

Returns a view of the given byte array as a {@link ByteSource}. To view only a specific range
 in the array, use {@code ByteSource.wrap(b).slice(offset, length)}.

 <p>Note that the given byte array may be passed directly to methods on, for example, {@code
 OutputStream} (when {@code copyTo(OutputStream)} is called on the resulting {@code
 ByteSource}). This could allow a malicious {@code OutputStream} implementation to modify the
 contents of the array, but provides better performance in the normal case.
@since 15.0 (since 14.0 as {@code ByteStreams.asByteSource(byte[])}).

### `empty()`

**Returns:** [`com.google.common.io.ByteSource`](./ByteSource.md)

Returns an immutable {@link ByteSource} that contains no bytes.
@since 15.0

