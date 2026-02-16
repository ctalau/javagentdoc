# Class: `FileBackedOutputStream`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.FileBackedOutputStream`

**Extends:** [`java.io.OutputStream`](../../../../java/io/OutputStream.md)

## Description

An {@link OutputStream} that starts buffering to a byte array, but switches to file buffering
 once the data reaches a configurable size.

 <p>When this stream creates a temporary file, it restricts the file's permissions to the current
 user or, in the case of Android, the current app. If that is not possible (as is the case under
 the very old Android Ice Cream Sandwich release), then this stream throws an exception instead of
 creating a file that would be more accessible. (This behavior is new in Guava 32.0.0. Previous
 versions would create a file that is more accessible, as discussed in <a href="https://github.com/google/guava/issues/2575">Guava issue 2575</a>. TODO: b/283778848 - Fill
 in CVE number once it's available.)

 <p>Temporary files created by this stream may live in the local filesystem until either:

 <ul>
   <li>{@link #reset} is called (removing the data in this stream and deleting the file), or...
   <li>this stream (or, more precisely, its {@link #asByteSource} view) is finalized during
       garbage collection, <strong>AND</strong> this stream was not constructed with {@linkplain #FileBackedOutputStream(int) the 1-arg constructor} or the {@linkplain #FileBackedOutputStream(int, boolean) 2-arg constructor} passing {@code false} in the
       second parameter.
 </ul>

 <p>This class is thread-safe.
@author Chris Nokleberg
@since 1.0

## Fields

### `fileThreshold`

**Type:** `int`

### `resetOnFinalize`

**Type:** `boolean`

### `source`

**Type:** [`com.google.common.io.ByteSource`](./ByteSource.md)

### `out`

**Type:** [`java.io.OutputStream`](../../../../java/io/OutputStream.md)

### `memory`

**Type:** [`com.google.common.io.FileBackedOutputStream.MemoryOutput`](FileBackedOutputStream/MemoryOutput.md)

### `file`

**Type:** [`java.io.File`](../../../../java/io/File.md)

## Constructors

### `<init>(`int` fileThreshold)`

Creates a new instance that uses the given file threshold, and does not reset the data when the
 {@link ByteSource} returned by {@link #asByteSource} is finalized.
@param fileThreshold the number of bytes before the stream should switch to buffering to a file
@throws IllegalArgumentException if {@code fileThreshold} is negative

### `<init>(`int` fileThreshold, `boolean` resetOnFinalize)`

Creates a new instance that uses the given file threshold, and optionally resets the data when
 the {@link ByteSource} returned by {@link #asByteSource} is finalized.
@param fileThreshold the number of bytes before the stream should switch to buffering to a file
@param resetOnFinalize if true, the {@link #reset} method will be called when the {@link ByteSource} returned by {@link #asByteSource} is finalized.
@throws IllegalArgumentException if {@code fileThreshold} is negative

## Methods

### `getFile()`

**Returns:** [`java.io.File`](../../../../java/io/File.md)

Returns the file holding the data (possibly null).

### `asByteSource()`

**Returns:** [`com.google.common.io.ByteSource`](./ByteSource.md)

Returns a readable {@link ByteSource} view of the data that has been written to this stream.
@since 15.0

### `openInputStream()`

**Returns:** [`java.io.InputStream`](../../../../java/io/InputStream.md)

### `reset()`

**Returns:** `void`

Calls {@link #close} if not already closed, and then resets this object back to its initial
 state, for reuse. If data was buffered to a file, it will be deleted.
@throws IOException if an I/O error occurred while deleting the file buffer

### `write(`int` b)`

**Returns:** `void`

### `write(`byte[]` b)`

**Returns:** `void`

### `write(`byte[]` b, `int` off, `int` len)`

**Returns:** `void`

### `close()`

**Returns:** `void`

### `flush()`

**Returns:** `void`

### `update(`int` len)`

**Returns:** `void`

Checks if writing {@code len} bytes would go over threshold, and switches to file buffering if
 so.

