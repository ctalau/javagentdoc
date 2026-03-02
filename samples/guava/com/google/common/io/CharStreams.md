# Class: `CharStreams`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.CharStreams`

## Description

Some of the methods in this class take arguments with a generic type of Readable &
 Closeable. A java.io.Reader implements both of those interfaces. Similarly for 
 Appendable & Closeable and java.io.Writer.

## Fields

### `DEFAULT_BUF_SIZE`

**Type:** `int`

## Constructors

### `<init>()`

## Methods

### `createBuffer()`

**Returns:** `java.nio.CharBuffer`

### `copy(java.lang.Readable from, java.lang.Appendable to)`

**Returns:** `long`

Does not
 close or flush either object.

**Parameters:**
- `from` (`java.lang.Readable`): the object to read from
- `to` (`java.lang.Appendable`): the object to write to

### `copyReaderToBuilder(java.io.Reader from, java.lang.StringBuilder to)`

**Returns:** `long`

Does not
 close or flush the reader.

 
This is identical to #copy(Readable, Appendable) but optimized for these specific
 types. CharBuffer has poor performance when being written into or read out of so round tripping
 all the bytes through the buffer takes a long time. With these specialized types we can just
 use a char array.

**Parameters:**
- `from` (`java.io.Reader`): the object to read from
- `to` (`java.lang.StringBuilder`): the object to write to

### `copyReaderToWriter(java.io.Reader from, java.io.Writer to)`

**Returns:** `long`

Does not close or
 flush the reader or writer.

 
This is identical to #copy(Readable, Appendable) but optimized for these specific
 types. CharBuffer has poor performance when being written into or read out of so round tripping
 all the bytes through the buffer takes a long time. With these specialized types we can just
 use a char array.

**Parameters:**
- `from` (`java.io.Reader`): the object to read from
- `to` (`java.io.Writer`): the object to write to

### `toString(java.lang.Readable r)`

**Returns:** `java.lang.String`

Does not close the
 Readable.

**Parameters:**
- `r` (`java.lang.Readable`): the object to read from

### `toStringBuilder(java.lang.Readable r)`

**Returns:** `java.lang.StringBuilder`

Does not close the Readable.

**Parameters:**
- `r` (`java.lang.Readable`): the object to read from

### `readLines(java.lang.Readable r)`

**Returns:** `java.util.List<java.lang.String>`

The lines do not include
 line-termination characters, but do include other leading and trailing whitespace.

 
Does not close the Readable. If reading files or resources you should use the Files#readLines and Resources#readLines methods.

**Parameters:**
- `r` (`java.lang.Readable`): the object to read from

### `readLines(java.lang.Readable readable, com.google.common.io.LineProcessor<T> processor)`

**Returns:** `T`

Does not close
 readable. Note that this method may not fully consume the contents of readable
 if the processor stops processing early.

**Parameters:**
- `readable` (`java.lang.Readable`)
- `processor` ([`com.google.common.io.LineProcessor<T>`](./LineProcessor.md))

### `exhaust(java.lang.Readable readable)`

**Returns:** `long`

Returns the total number of chars read. Does not close the stream.

**Parameters:**
- `readable` (`java.lang.Readable`)

### `skipFully(java.io.Reader reader, long n)`

**Returns:** `void`

This method will block until the full
 amount has been skipped. Does not close the reader.

**Parameters:**
- `reader` (`java.io.Reader`): the reader to read from
- `n` (`long`): the number of characters to skip

### `nullWriter()`

**Returns:** `java.io.Writer`

### `asWriter(java.lang.Appendable target)`

**Returns:** `java.io.Writer`

Closing the
 writer will close the target if it is Closeable, and flushing the writer will flush the
 target if it is java.io.Flushable.

**Parameters:**
- `target` (`java.lang.Appendable`): the object to which output will be sent

