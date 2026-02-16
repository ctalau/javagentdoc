# Class: `CharSource`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.CharSource`

## Description

A readable source of characters, such as a text file. Unlike a `Reader`, a `CharSource` is not an open, stateful stream of characters that can be read and closed. Instead,
 it is an immutable <i>supplier</i> of `Reader` instances.

 <p>`CharSource` provides two kinds of methods:

 <ul>
   <li><b>Methods that return a reader:</b> These methods should return a <i>new</i>, independent
       instance each time they are called. The caller is responsible for ensuring that the
       returned reader is closed.
   <li><b>Convenience methods:</b> These are implementations of common operations that are
       typically implemented by opening a reader using one of the methods in the first category,
       doing something and finally closing the reader that was opened.
 </ul>

 <p>Several methods in this class, such as `readLines()`, break the contents of the source
 into lines. Like `BufferedReader`, these methods break lines on any of `\n`, `\r` or `\r\n`, do not include the line separator in each line and do not consider there to
 be an empty line at the end if the contents are terminated with a line separator.

 <p>Any `ByteSource` containing text encoded with a specific character
 encoding may be viewed as a `CharSource` using `ByteSource.asCharSource(Charset)`.

 <p><b>Note:</b> In general, `CharSource` is intended to be used for "file-like" sources
 that provide readers that are:

 <ul>
   <li><b>Finite:</b> Many operations, such as `length()` and `read()`, will either
       block indefinitely or fail if the source creates an infinite reader.
   <li><b>Non-destructive:</b> A <i>destructive</i> reader will consume or otherwise alter the
       source as they are read from it. A source that provides such readers will not be reusable,
       and operations that read from the stream (including `length()`, in some
       implementations) will prevent further operations from completing as expected.
 </ul>
**Since:** 14.0
**Author:** Colin Decker

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `asByteSource(`java.nio.charset.Charset` charset)`

**Returns:** [`com.google.common.io.ByteSource`](./ByteSource.md)

Returns a `ByteSource` view of this char source that encodes chars read from this source
 as bytes using the given `Charset`.

 <p>If `ByteSource.asCharSource` is called on the returned source with the same charset,
 the default implementation of this method will ensure that the original `CharSource` is
 returned, rather than round-trip encoding. Subclasses that override this method should behave
 the same way.
**Since:** 20.0

### `openStream()`

**Returns:** `java.io.Reader`

Opens a new `Reader` for reading from this source. This method returns a new, independent
 reader each time it is called.

 <p>The caller is responsible for ensuring that the returned reader is closed.
@throws IOException if an I/O error occurs while opening the reader

### `openBufferedStream()`

**Returns:** `java.io.BufferedReader`

Opens a new `BufferedReader` for reading from this source. This method returns a new,
 independent reader each time it is called.

 <p>The caller is responsible for ensuring that the returned reader is closed.
@throws IOException if an I/O error occurs while of opening the reader

### `lines()`

**Returns:** `java.util.stream.Stream<java.lang.String>`

Opens a new `Stream` for reading text one line at a time from this source. This method
 returns a new, independent stream each time it is called.

 <p>The returned stream is lazy and only reads from the source in the terminal operation. If an
 I/O error occurs while the stream is reading from the source or when the stream is closed, an
 `UncheckedIOException` is thrown.

 <p>Like `BufferedReader.readLine()`, this method considers a line to be a sequence of
 text that is terminated by (but does not include) one of `\r\n`, `\r` or `\n`. If the source's content does not end in a line termination sequence, it is treated as if
 it does.

 <p>The caller is responsible for ensuring that the returned stream is closed. For example:

 <pre>`try (Stream<String> lines = source.lines()) {
   lines.map(...)
      .filter(...)
      .forEach(...);
 `
 }</pre>
@throws IOException if an I/O error occurs while opening the stream
**Since:** 22.0

### `lengthIfKnown()`

**Returns:** [`com.google.common.base.Optional<java.lang.Long>`](../base/Optional.md)

Returns the size of this source in chars, if the size can be easily determined without actually
 opening the data stream.

 <p>The default implementation returns `Optional.absent`. Some sources, such as a `CharSequence`, may return a non-absent value. Note that in such cases, it is <i>possible</i>
 that this method will return a different number of chars than would be returned by reading all
 of the chars.

 <p>Additionally, for mutable sources such as `StringBuilder`s, a subsequent read may
 return a different number of chars if the contents are changed.
**Since:** 19.0

### `length()`

**Returns:** `long`

Returns the length of this source in chars, even if doing so requires opening and traversing an
 entire stream. To avoid a potentially expensive operation, see `lengthIfKnown`.

 <p>The default implementation calls `lengthIfKnown` and returns the value if present. If
 absent, it will fall back to a heavyweight operation that will open a stream, `Reader.skip(long) skip` to the end of the stream, and return the total number of chars that
 were skipped.

 <p>Note that for sources that implement `lengthIfKnown` to provide a more efficient
 implementation, it is <i>possible</i> that this method will return a different number of chars
 than would be returned by reading all of the chars.

 <p>In either case, for mutable sources such as files, a subsequent read may return a different
 number of chars if the contents are changed.
@throws IOException if an I/O error occurs while reading the length of this source
**Since:** 19.0

### `countBySkipping(`java.io.Reader` reader)`

**Returns:** `long`

### `copyTo(`java.lang.Appendable` appendable)`

**Returns:** `long`

Appends the contents of this source to the given `Appendable` (such as a `Writer`).
 Does not close `appendable` if it is `Closeable`.
@return the number of characters copied
@throws IOException if an I/O error occurs while reading from this source or writing to `appendable`

### `copyTo([`com.google.common.io.CharSink`](./CharSink.md) sink)`

**Returns:** `long`

Copies the contents of this source to the given sink.
@return the number of characters copied
@throws IOException if an I/O error occurs while reading from this source or writing to `sink`

### `read()`

**Returns:** `java.lang.String`

Reads the contents of this source as a string.
@throws IOException if an I/O error occurs while reading from this source

### `readFirstLine()`

**Returns:** `java.lang.String`

Reads the first line of this source as a string. Returns `null` if this source is empty.

 <p>Like `BufferedReader.readLine()`, this method considers a line to be a sequence of
 text that is terminated by (but does not include) one of `\r\n`, `\r` or `\n`. If the source's content does not end in a line termination sequence, it is treated as if
 it does.
@throws IOException if an I/O error occurs while reading from this source

### `readLines()`

**Returns:** [`com.google.common.collect.ImmutableList<java.lang.String>`](../collect/ImmutableList.md)

Reads all the lines of this source as a list of strings. The returned list will be empty if
 this source is empty.

 <p>Like `BufferedReader.readLine()`, this method considers a line to be a sequence of
 text that is terminated by (but does not include) one of `\r\n`, `\r` or `\n`. If the source's content does not end in a line termination sequence, it is treated as if
 it does.
@throws IOException if an I/O error occurs while reading from this source

### `readLines([`com.google.common.io.LineProcessor<T>`](./LineProcessor.md) processor)`

**Returns:** `T`

Reads lines of text from this source, processing each line as it is read using the given `LineProcessor`. Stops when all lines have been processed or the processor returns
 `false` and returns the result produced by the processor.

 <p>Like `BufferedReader.readLine()`, this method considers a line to be a sequence of
 text that is terminated by (but does not include) one of `\r\n`, `\r` or `\n`. If the source's content does not end in a line termination sequence, it is treated as if
 it does.
@throws IOException if an I/O error occurs while reading from this source or if `processor` throws an `IOException`
**Since:** 16.0

### `forEachLine(`java.util.function.Consumer<? super java.lang.String>` action)`

**Returns:** `void`

Reads all lines of text from this source, running the given `action` for each line as it
 is read.

 <p>Like `BufferedReader.readLine()`, this method considers a line to be a sequence of
 text that is terminated by (but does not include) one of `\r\n`, `\r` or `\n`. If the source's content does not end in a line termination sequence, it is treated as if
 it does.
@throws IOException if an I/O error occurs while reading from this source or if `action`
     throws an `UncheckedIOException`
**Since:** 22.0

### `isEmpty()`

**Returns:** `boolean`

Returns whether the source has zero chars. The default implementation first checks `lengthIfKnown`, returning true if it's known to be zero and false if it's known to be
 non-zero. If the length is not known, it falls back to opening a stream and checking for EOF.

 <p>Note that, in cases where `lengthIfKnown` returns zero, it is <i>possible</i> that
 chars are actually available for reading. This means that a source may return `true` from
 `isEmpty()` despite having readable content.
@throws IOException if an I/O error occurs
**Since:** 15.0

### `concat(`java.lang.Iterable<? extends com.google.common.io.CharSource>` sources)`

**Returns:** [`com.google.common.io.CharSource`](./CharSource.md)

Concatenates multiple `CharSource` instances into a single source. Streams returned from
 the source will contain the concatenated data from the streams of the underlying sources.

 <p>Only one underlying stream will be open at a time. Closing the concatenated stream will
 close the open underlying stream.
@param sources the sources to concatenate
@return a `CharSource` containing the concatenated data
**Since:** 15.0

### `concat(`java.util.Iterator<? extends com.google.common.io.CharSource>` sources)`

**Returns:** [`com.google.common.io.CharSource`](./CharSource.md)

Concatenates multiple `CharSource` instances into a single source. Streams returned from
 the source will contain the concatenated data from the streams of the underlying sources.

 <p>Only one underlying stream will be open at a time. Closing the concatenated stream will
 close the open underlying stream.

 <p>Note: The input `Iterator` will be copied to an `ImmutableList` when this method
 is called. This will fail if the iterator is infinite and may cause problems if the iterator
 eagerly fetches data for each source when iterated (rather than producing sources that only
 load data through their streams). Prefer using the `concat(Iterable)` overload if
 possible.
@param sources the sources to concatenate
@return a `CharSource` containing the concatenated data
@throws NullPointerException if any of `sources` is `null`
**Since:** 15.0

### `concat([`com.google.common.io.CharSource[]`](./CharSource.md) sources)`

**Returns:** [`com.google.common.io.CharSource`](./CharSource.md)

Concatenates multiple `CharSource` instances into a single source. Streams returned from
 the source will contain the concatenated data from the streams of the underlying sources.

 <p>Only one underlying stream will be open at a time. Closing the concatenated stream will
 close the open underlying stream.
@param sources the sources to concatenate
@return a `CharSource` containing the concatenated data
@throws NullPointerException if any of `sources` is `null`
**Since:** 15.0

### `wrap(`java.lang.CharSequence` charSequence)`

**Returns:** [`com.google.common.io.CharSource`](./CharSource.md)

Returns a view of the given character sequence as a `CharSource`. The behavior of the
 returned `CharSource` and any `Reader` instances created by it is unspecified if
 the `charSequence` is mutated while it is being read, so don't do that.
**Since:** 15.0 (since 14.0 as `CharStreams.asCharSource(String)`)

### `empty()`

**Returns:** [`com.google.common.io.CharSource`](./CharSource.md)

Returns an immutable `CharSource` that contains no characters.
**Since:** 15.0

