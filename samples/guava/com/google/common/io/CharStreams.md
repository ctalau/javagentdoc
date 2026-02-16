# Class: `CharStreams`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.CharStreams`

## Description

Provides utility methods for working with character streams.

 <p>Some of the methods in this class take arguments with a generic type of `Readable &
 Closeable`. A `java.io.Reader` implements both of those interfaces. Similarly for `Appendable & Closeable` and `java.io.Writer`.
**Author:** Chris Nokleberg
**Author:** Bin Zhu
**Author:** Colin Decker
**Since:** 1.0

## Fields

### `DEFAULT_BUF_SIZE`

**Type:** `int`

## Constructors

### `<init>()`

## Methods

### `createBuffer()`

**Returns:** `java.nio.CharBuffer`

Creates a new `CharBuffer` for buffering reads or writes.

### `copy(`java.lang.Readable` from, `java.lang.Appendable` to)`

**Returns:** `long`

Copies all characters between the `Readable` and `Appendable` objects. Does not
 close or flush either object.
@param from the object to read from
@param to the object to write to
@return the number of characters copied
@throws IOException if an I/O error occurs

### `copyReaderToBuilder(`java.io.Reader` from, `java.lang.StringBuilder` to)`

**Returns:** `long`

Copies all characters between the `Reader` and `StringBuilder` objects. Does not
 close or flush the reader.

 <p>This is identical to `copy(Readable, Appendable)` but optimized for these specific
 types. CharBuffer has poor performance when being written into or read out of so round tripping
 all the bytes through the buffer takes a long time. With these specialized types we can just
 use a char array.
@param from the object to read from
@param to the object to write to
@return the number of characters copied
@throws IOException if an I/O error occurs

### `copyReaderToWriter(`java.io.Reader` from, `java.io.Writer` to)`

**Returns:** `long`

Copies all characters between the `Reader` and `Writer` objects. Does not close or
 flush the reader or writer.

 <p>This is identical to `copy(Readable, Appendable)` but optimized for these specific
 types. CharBuffer has poor performance when being written into or read out of so round tripping
 all the bytes through the buffer takes a long time. With these specialized types we can just
 use a char array.
@param from the object to read from
@param to the object to write to
@return the number of characters copied
@throws IOException if an I/O error occurs

### `toString(`java.lang.Readable` r)`

**Returns:** `java.lang.String`

Reads all characters from a `Readable` object into a `String`. Does not close the
 `Readable`.
@param r the object to read from
@return a string containing all the characters
@throws IOException if an I/O error occurs

### `toStringBuilder(`java.lang.Readable` r)`

**Returns:** `java.lang.StringBuilder`

Reads all characters from a `Readable` object into a new `StringBuilder` instance.
 Does not close the `Readable`.
@param r the object to read from
@return a `StringBuilder` containing all the characters
@throws IOException if an I/O error occurs

### `readLines(`java.lang.Readable` r)`

**Returns:** `java.util.List<java.lang.String>`

Reads all of the lines from a `Readable` object. The lines do not include
 line-termination characters, but do include other leading and trailing whitespace.

 <p>Does not close the `Readable`. If reading files or resources you should use the `Files.readLines` and `Resources.readLines` methods.
@param r the object to read from
@return a mutable `List` containing all the lines
@throws IOException if an I/O error occurs

### `readLines(`java.lang.Readable` readable, [`com.google.common.io.LineProcessor<T>`](./LineProcessor.md) processor)`

**Returns:** `T`

Streams lines from a `Readable` object, stopping when the processor returns `false`
 or all lines have been read and returning the result produced by the processor. Does not close
 `readable`. Note that this method may not fully consume the contents of `readable`
 if the processor stops processing early.
@throws IOException if an I/O error occurs
**Since:** 14.0

### `exhaust(`java.lang.Readable` readable)`

**Returns:** `long`

Reads and discards data from the given `Readable` until the end of the stream is reached.
 Returns the total number of chars read. Does not close the stream.
**Since:** 20.0

### `skipFully(`java.io.Reader` reader, `long` n)`

**Returns:** `void`

Discards `n` characters of data from the reader. This method will block until the full
 amount has been skipped. Does not close the reader.
@param reader the reader to read from
@param n the number of characters to skip
@throws EOFException if this stream reaches the end before skipping all the characters
@throws IOException if an I/O error occurs

### `nullWriter()`

**Returns:** `java.io.Writer`

Returns a `Writer` that simply discards written chars.
**Since:** 15.0

### `asWriter(`java.lang.Appendable` target)`

**Returns:** `java.io.Writer`

Returns a Writer that sends all output to the given `Appendable` target. Closing the
 writer will close the target if it is `Closeable`, and flushing the writer will flush the
 target if it is `java.io.Flushable`.
@param target the object to which output will be sent
@return a new Writer object, unless target is a Writer, in which case the target is returned

