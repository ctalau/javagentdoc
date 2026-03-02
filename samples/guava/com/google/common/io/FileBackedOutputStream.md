# Class: `FileBackedOutputStream`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.FileBackedOutputStream`

**Extends:** `java.io.OutputStream`

## Description

When this stream creates a temporary file, it restricts the file's permissions to the current
 user or, in the case of Android, the current app. If that is not possible (as is the case under
 the very old Android Ice Cream Sandwich release), then this stream throws an exception instead of
 creating a file that would be more accessible. (This behavior is new in Guava 32.0.0. Previous
 versions would create a file that is more accessible, as discussed in [Guava issue 2575](https://github.com/google/guava/issues/2575). TODO: b/283778848 - Fill
 in CVE number once it's available.)

 
Temporary files created by this stream may live in the local filesystem until either:

 

   - #reset is called (removing the data in this stream and deleting the file), or...
   - this stream (or, more precisely, its #asByteSource view) is finalized during
       garbage collection, **AND** this stream was not constructed with the 1-arg constructor or the 2-arg constructor passing false in the
       second parameter.
 


 
This class is thread-safe.

## Fields

### `fileThreshold`

**Type:** `int`

### `resetOnFinalize`

**Type:** `boolean`

### `source`

**Type:** [`com.google.common.io.ByteSource`](./ByteSource.md)

### `out`

**Type:** `java.io.OutputStream`

### `memory`

**Type:** `com.google.common.io.FileBackedOutputStream.MemoryOutput`

### `file`

**Type:** `java.io.File`

## Constructors

### `<init>(int fileThreshold)`

**Parameters:**
- `fileThreshold` (`int`): the number of bytes before the stream should switch to buffering to a file

### `<init>(int fileThreshold, boolean resetOnFinalize)`

**Parameters:**
- `fileThreshold` (`int`): the number of bytes before the stream should switch to buffering to a file
- `resetOnFinalize` (`boolean`): if true, the #reset method will be called when the ByteSource returned by #asByteSource is finalized.

## Methods

### `getFile()`

**Returns:** `java.io.File`

### `asByteSource()`

**Returns:** [`com.google.common.io.ByteSource`](./ByteSource.md)

### `openInputStream()`

**Returns:** `java.io.InputStream`

### `reset()`

If data was buffered to a file, it will be deleted.

**Returns:** `void`

### `write(int b)`

**Parameters:**
- `b` (`int`)

**Returns:** `void`

### `write(byte[] b)`

**Parameters:**
- `b` (`byte[]`)

**Returns:** `void`

### `write(byte[] b, int off, int len)`

**Parameters:**
- `b` (`byte[]`)
- `off` (`int`)
- `len` (`int`)

**Returns:** `void`

### `close()`

**Returns:** `void`

### `flush()`

**Returns:** `void`

### `update(int len)`

**Parameters:**
- `len` (`int`)

**Returns:** `void`

