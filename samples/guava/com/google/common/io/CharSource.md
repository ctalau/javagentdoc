# Class: `CharSource`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.CharSource`

## Description

Unlike a Reader, a 
 CharSource is not an open, stateful stream of characters that can be read and closed. Instead,
 it is an immutable *supplier* of Reader instances.

 
CharSource provides two kinds of methods:

 

   - **Methods that return a reader:** These methods should return a *new*, independent
       instance each time they are called. The caller is responsible for ensuring that the
       returned reader is closed.
   - **Convenience methods:** These are implementations of common operations that are
       typically implemented by opening a reader using one of the methods in the first category,
       doing something and finally closing the reader that was opened.
 


 
Several methods in this class, such as #readLines(), break the contents of the source
 into lines. Like BufferedReader, these methods break lines on any of \n, 
 \r or \r\n, do not include the line separator in each line and do not consider there to
 be an empty line at the end if the contents are terminated with a line separator.

 
Any ByteSource containing text encoded with a specific character
 encoding may be viewed as a CharSource using ByteSource#asCharSource(Charset).

 
**Note:** In general, CharSource is intended to be used for "file-like" sources
 that provide readers that are:

 

   - **Finite:** Many operations, such as #length() and #read(), will either
       block indefinitely or fail if the source creates an infinite reader.
   - **Non-destructive:** A *destructive* reader will consume or otherwise alter the
       source as they are read from it. A source that provides such readers will not be reusable,
       and operations that read from the stream (including #length(), in some
       implementations) will prevent further operations from completing as expected.

## Constructors

### `<init>()`

## Methods

### `asByteSource(java.nio.charset.Charset charset)`

**Returns:** [`com.google.common.io.ByteSource`](./ByteSource.md)

If ByteSource#asCharSource is called on the returned source with the same charset,
 the default implementation of this method will ensure that the original CharSource is
 returned, rather than round-trip encoding. Subclasses that override this method should behave
 the same way.

**Parameters:**
- `charset` (`java.nio.charset.Charset`)

### `openStream()`

**Returns:** `java.io.Reader`

This method returns a new, independent
 reader each time it is called.

 
The caller is responsible for ensuring that the returned reader is closed.

### `openBufferedStream()`

**Returns:** `java.io.BufferedReader`

This method returns a new,
 independent reader each time it is called.

 
The caller is responsible for ensuring that the returned reader is closed.

### `lines()`

**Returns:** `java.util.stream.Stream<java.lang.String>`

This method
 returns a new, independent stream each time it is called.

 
The returned stream is lazy and only reads from the source in the terminal operation. If an
 I/O error occurs while the stream is reading from the source or when the stream is closed, an
 UncheckedIOException is thrown.

 
Like BufferedReader#readLine(), this method considers a line to be a sequence of
 text that is terminated by (but does not include) one of \r\n, \r or 
 \n. If the source's content does not end in a line termination sequence, it is treated as if
 it does.

 
The caller is responsible for ensuring that the returned stream is closed. For example:

 

```

 try (Stream<String> lines = source.lines()) {
   lines.map(...)
      .filter(...)
      .forEach(...);
 }
 
```

### `lengthIfKnown()`

**Returns:** [`com.google.common.base.Optional<java.lang.Long>`](../base/Optional.md)

The default implementation returns Optional#absent. Some sources, such as a 
 CharSequence, may return a non-absent value. Note that in such cases, it is *possible*
 that this method will return a different number of chars than would be returned by reading all
 of the chars.

 
Additionally, for mutable sources such as StringBuilders, a subsequent read may
 return a different number of chars if the contents are changed.

### `length()`

**Returns:** `long`

To avoid a potentially expensive operation, see #lengthIfKnown.

 
The default implementation calls #lengthIfKnown and returns the value if present. If
 absent, it will fall back to a heavyweight operation that will open a stream, skip to the end of the stream, and return the total number of chars that
 were skipped.

 
Note that for sources that implement #lengthIfKnown to provide a more efficient
 implementation, it is *possible* that this method will return a different number of chars
 than would be returned by reading all of the chars.

 
In either case, for mutable sources such as files, a subsequent read may return a different
 number of chars if the contents are changed.

### `countBySkipping(java.io.Reader reader)`

**Returns:** `long`

**Parameters:**
- `reader` (`java.io.Reader`)

### `copyTo(java.lang.Appendable appendable)`

**Returns:** `long`

Does not close appendable if it is Closeable.

**Parameters:**
- `appendable` (`java.lang.Appendable`)

### `copyTo(com.google.common.io.CharSink sink)`

**Returns:** `long`

**Parameters:**
- `sink` ([`com.google.common.io.CharSink`](./CharSink.md))

### `read()`

**Returns:** `java.lang.String`

### `readFirstLine()`

**Returns:** `java.lang.String`

Returns null if this source is empty.

 
Like BufferedReader#readLine(), this method considers a line to be a sequence of
 text that is terminated by (but does not include) one of \r\n, \r or 
 \n. If the source's content does not end in a line termination sequence, it is treated as if
 it does.

### `readLines()`

**Returns:** [`com.google.common.collect.ImmutableList<java.lang.String>`](../collect/ImmutableList.md)

The returned list will be empty if
 this source is empty.

 
Like BufferedReader#readLine(), this method considers a line to be a sequence of
 text that is terminated by (but does not include) one of \r\n, \r or 
 \n. If the source's content does not end in a line termination sequence, it is treated as if
 it does.

### `readLines(com.google.common.io.LineProcessor<T> processor)`

**Returns:** `T`

Stops when all lines have been processed or the processor returns
 false and returns the result produced by the processor.

 
Like BufferedReader#readLine(), this method considers a line to be a sequence of
 text that is terminated by (but does not include) one of \r\n, \r or 
 \n. If the source's content does not end in a line termination sequence, it is treated as if
 it does.

**Parameters:**
- `processor` ([`com.google.common.io.LineProcessor<T>`](./LineProcessor.md))

### `forEachLine(java.util.function.Consumer<? super java.lang.String> action)`

**Returns:** `void`

Like BufferedReader#readLine(), this method considers a line to be a sequence of
 text that is terminated by (but does not include) one of \r\n, \r or 
 \n. If the source's content does not end in a line termination sequence, it is treated as if
 it does.

**Parameters:**
- `action` (`java.util.function.Consumer<? super java.lang.String>`)

### `isEmpty()`

**Returns:** `boolean`

The default implementation first checks #lengthIfKnown, returning true if it's known to be zero and false if it's known to be
 non-zero. If the length is not known, it falls back to opening a stream and checking for EOF.

 
Note that, in cases where lengthIfKnown returns zero, it is *possible* that
 chars are actually available for reading. This means that a source may return true from
 isEmpty() despite having readable content.

### `concat(java.lang.Iterable<? extends com.google.common.io.CharSource> sources)`

**Returns:** [`com.google.common.io.CharSource`](./CharSource.md)

Streams returned from
 the source will contain the concatenated data from the streams of the underlying sources.

 
Only one underlying stream will be open at a time. Closing the concatenated stream will
 close the open underlying stream.

**Parameters:**
- `sources` (`java.lang.Iterable<? extends com.google.common.io.CharSource>`): the sources to concatenate

### `concat(java.util.Iterator<? extends com.google.common.io.CharSource> sources)`

**Returns:** [`com.google.common.io.CharSource`](./CharSource.md)

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
- `sources` (`java.util.Iterator<? extends com.google.common.io.CharSource>`): the sources to concatenate

### `concat(com.google.common.io.CharSource[] sources)`

**Returns:** [`com.google.common.io.CharSource`](./CharSource.md)

Streams returned from
 the source will contain the concatenated data from the streams of the underlying sources.

 
Only one underlying stream will be open at a time. Closing the concatenated stream will
 close the open underlying stream.

**Parameters:**
- `sources` ([`com.google.common.io.CharSource[]`](./CharSource.md)): the sources to concatenate

### `wrap(java.lang.CharSequence charSequence)`

**Returns:** [`com.google.common.io.CharSource`](./CharSource.md)

The behavior of the
 returned CharSource and any Reader instances created by it is unspecified if
 the charSequence is mutated while it is being read, so don't do that.

**Parameters:**
- `charSequence` (`java.lang.CharSequence`)

### `empty()`

**Returns:** [`com.google.common.io.CharSource`](./CharSource.md)

