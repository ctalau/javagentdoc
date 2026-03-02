# Class: `ByteStreams`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.ByteStreams`

## Description

## Fields

### `BUFFER_SIZE`

**Type:** `int`

### `ZERO_COPY_CHUNK_SIZE`

**Type:** `int`

Requires that both the input channel and the output
       channel have their own file descriptors. Generally this only happens when both channels
       are files or sockets. This performs zero copies - the bytes never enter userspace.
   - Use mmap(2) or equivalent. Requires that either the input channel or the output channel
       have file descriptors. Bytes are copied from the file into a kernel buffer, then directly
       into the other buffer (userspace). Note that if the file is very large, a naive
       implementation will effectively put the whole file in memory. On many systems with paging
       and virtual memory, this is not a problem - because it is mapped read-only, the kernel
       can always page it to disk "for free". However, on systems where killing processes
       happens all the time in normal conditions (i.e., android) the OS must make a tradeoff
       between paging memory and killing other processes - so allocating a gigantic buffer and
       then sequentially accessing it could result in other processes dying. This is solvable
       via madvise(2), but that obviously doesn't exist in java.
   - Ordinary copy. Kernel copies bytes into a kernel buffer, from a kernel buffer into a
       userspace buffer (byte[] or ByteBuffer), then copies them from that buffer into the
       destination channel.
 


 This value is intended to be large enough to make the overhead of system calls negligible,
 without being so large that it causes problems for systems with atypical memory management if
 approaches 2 or 3 are used.

### `MAX_ARRAY_LEN`

**Type:** `int`

### `TO_BYTE_ARRAY_DEQUE_SIZE`

**Type:** `int`

### `NULL_OUTPUT_STREAM`

**Type:** `java.io.OutputStream`

## Constructors

### `<init>()`

## Methods

### `createBuffer()`

**Returns:** `byte[]`

### `copy(java.io.InputStream from, java.io.OutputStream to)`

**Returns:** `long`

Does not close or flush either
 stream.

 
**Java 9 users and later:** this method should be treated as deprecated; use the
 equivalent InputStream#transferTo method instead.

**Parameters:**
- `from` (`java.io.InputStream`): the input stream to read from
- `to` (`java.io.OutputStream`): the output stream to write to

### `copy(java.nio.channels.ReadableByteChannel from, java.nio.channels.WritableByteChannel to)`

**Returns:** `long`

Does not close or flush
 either channel.

**Parameters:**
- `from` (`java.nio.channels.ReadableByteChannel`): the readable channel to read from
- `to` (`java.nio.channels.WritableByteChannel`): the writable channel to write to

### `toByteArrayInternal(java.io.InputStream in, java.util.Queue<byte[]> bufs, int totalLen)`

**Returns:** `byte[]`

**Parameters:**
- `in` (`java.io.InputStream`)
- `bufs` (`java.util.Queue<byte[]>`)
- `totalLen` (`int`)

### `combineBuffers(java.util.Queue<byte[]> bufs, int totalLen)`

**Returns:** `byte[]`

**Parameters:**
- `bufs` (`java.util.Queue<byte[]>`)
- `totalLen` (`int`)

### `toByteArray(java.io.InputStream in)`

**Returns:** `byte[]`

Does not close the stream.

**Parameters:**
- `in` (`java.io.InputStream`): the input stream to read from

### `toByteArray(java.io.InputStream in, long expectedSize)`

**Returns:** `byte[]`

The given expected size is used to
 create an initial byte array, but if the actual number of bytes read from the stream differs,
 the correct result will be returned anyway.

**Parameters:**
- `in` (`java.io.InputStream`)
- `expectedSize` (`long`)

### `exhaust(java.io.InputStream in)`

**Returns:** `long`

Returns the total number of bytes read. Does not close the stream.

**Parameters:**
- `in` (`java.io.InputStream`)

### `newDataInput(byte[] bytes)`

**Returns:** [`com.google.common.io.ByteArrayDataInput`](./ByteArrayDataInput.md)

**Parameters:**
- `bytes` (`byte[]`)

### `newDataInput(byte[] bytes, int start)`

**Returns:** [`com.google.common.io.ByteArrayDataInput`](./ByteArrayDataInput.md)

**Parameters:**
- `bytes` (`byte[]`)
- `start` (`int`)

### `newDataInput(java.io.ByteArrayInputStream byteArrayInputStream)`

**Returns:** [`com.google.common.io.ByteArrayDataInput`](./ByteArrayDataInput.md)

The given input stream is not reset before being read from by the
 returned ByteArrayDataInput.

**Parameters:**
- `byteArrayInputStream` (`java.io.ByteArrayInputStream`)

### `newDataOutput()`

**Returns:** [`com.google.common.io.ByteArrayDataOutput`](./ByteArrayDataOutput.md)

### `newDataOutput(int size)`

**Returns:** [`com.google.common.io.ByteArrayDataOutput`](./ByteArrayDataOutput.md)

**Parameters:**
- `size` (`int`)

### `newDataOutput(java.io.ByteArrayOutputStream byteArrayOutputStream)`

**Returns:** [`com.google.common.io.ByteArrayDataOutput`](./ByteArrayDataOutput.md)

The given output stream is not reset before being written to by the
 returned ByteArrayDataOutput and new data will be appended to any existing content.

 
Note that if the given output stream was not empty or is modified after the 
 ByteArrayDataOutput is created, the contract for ByteArrayDataOutput#toByteArray will
 not be honored (the bytes returned in the byte array may not be exactly what was written via
 calls to ByteArrayDataOutput).

**Parameters:**
- `byteArrayOutputStream` (`java.io.ByteArrayOutputStream`)

### `nullOutputStream()`

**Returns:** `java.io.OutputStream`

### `limit(java.io.InputStream in, long limit)`

**Returns:** `java.io.InputStream`

**Parameters:**
- `in` (`java.io.InputStream`): the input stream to be wrapped
- `limit` (`long`): the maximum number of bytes to be read

### `readFully(java.io.InputStream in, byte[] b)`

**Returns:** `void`

Does not close the stream.

**Parameters:**
- `in` (`java.io.InputStream`): the input stream to read from.
- `b` (`byte[]`): the buffer into which the data is read.

### `readFully(java.io.InputStream in, byte[] b, int off, int len)`

**Returns:** `void`

Does not close
 the stream.

**Parameters:**
- `in` (`java.io.InputStream`): the input stream to read from.
- `b` (`byte[]`): the buffer into which the data is read.
- `off` (`int`): an int specifying the offset into the data.
- `len` (`int`): an int specifying the number of bytes to read.

### `skipFully(java.io.InputStream in, long n)`

**Returns:** `void`

This method will block until the full
 amount has been skipped. Does not close the stream.

**Parameters:**
- `in` (`java.io.InputStream`): the input stream to read from
- `n` (`long`): the number of bytes to skip

### `skipUpTo(java.io.InputStream in, long n)`

**Returns:** `long`

This method will block until
 either the full amount has been skipped or until the end of the stream is reached, whichever
 happens first. Returns the total number of bytes skipped.

**Parameters:**
- `in` (`java.io.InputStream`)
- `n` (`long`)

### `skipSafely(java.io.InputStream in, long n)`

**Returns:** `long`

This prevents FileInputStream from skipping more bytes than
 actually remain in the file, something that it specifies it can do in its Javadoc despite the fact that it is violating the contract of
 InputStream.skip().

**Parameters:**
- `in` (`java.io.InputStream`)
- `n` (`long`)

### `readBytes(java.io.InputStream input, com.google.common.io.ByteProcessor<T> processor)`

**Returns:** `T`

**Parameters:**
- `input` (`java.io.InputStream`): the input stream to process
- `processor` ([`com.google.common.io.ByteProcessor<T>`](./ByteProcessor.md)): the object to which to pass the bytes of the stream

### `read(java.io.InputStream in, byte[] b, int off, int len)`

**Returns:** `int`

This
 method blocks until len bytes of input data have been read into the array, or end of
 file is detected. The number of bytes read is returned, possibly zero. Does not close the
 stream.

 
A caller can detect EOF if the number of bytes read is less than len. All subsequent
 calls on the same stream will return zero.

 
If b is null, a NullPointerException is thrown. If off is negative,
 or len is negative, or off+len is greater than the length of the array 
 b, then an IndexOutOfBoundsException is thrown. If len is zero, then no bytes
 are read. Otherwise, the first byte read is stored into element b[off], the next one
 into b[off+1], and so on. The number of bytes read is, at most, equal to len.

**Parameters:**
- `in` (`java.io.InputStream`): the input stream to read from
- `b` (`byte[]`): the buffer into which the data is read
- `off` (`int`): an int specifying the offset into the data
- `len` (`int`): an int specifying the number of bytes to read

