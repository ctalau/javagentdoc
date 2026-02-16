# Class: `ByteStreams`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.ByteStreams`

## Description

Provides utility methods for working with byte arrays and I/O streams.
@author Chris Nokleberg
@author Colin Decker
@since 1.0

## Fields

### `BUFFER_SIZE`

**Type:** `int`

### `ZERO_COPY_CHUNK_SIZE`

**Type:** `int`

There are three methods to implement {@link FileChannel#transferTo(long, long,
 WritableByteChannel)}:

 <ol>
   <li>Use sendfile(2) or equivalent. Requires that both the input channel and the output
       channel have their own file descriptors. Generally this only happens when both channels
       are files or sockets. This performs zero copies - the bytes never enter userspace.
   <li>Use mmap(2) or equivalent. Requires that either the input channel or the output channel
       have file descriptors. Bytes are copied from the file into a kernel buffer, then directly
       into the other buffer (userspace). Note that if the file is very large, a naive
       implementation will effectively put the whole file in memory. On many systems with paging
       and virtual memory, this is not a problem - because it is mapped read-only, the kernel
       can always page it to disk "for free". However, on systems where killing processes
       happens all the time in normal conditions (i.e., android) the OS must make a tradeoff
       between paging memory and killing other processes - so allocating a gigantic buffer and
       then sequentially accessing it could result in other processes dying. This is solvable
       via madvise(2), but that obviously doesn't exist in java.
   <li>Ordinary copy. Kernel copies bytes into a kernel buffer, from a kernel buffer into a
       userspace buffer (byte[] or ByteBuffer), then copies them from that buffer into the
       destination channel.
 </ol>

 This value is intended to be large enough to make the overhead of system calls negligible,
 without being so large that it causes problems for systems with atypical memory management if
 approaches 2 or 3 are used.

### `MAX_ARRAY_LEN`

**Type:** `int`

Max array length on JVM.

### `TO_BYTE_ARRAY_DEQUE_SIZE`

**Type:** `int`

Large enough to never need to expand, given the geometric progression of buffer sizes.

### `NULL_OUTPUT_STREAM`

**Type:** [`java.io.OutputStream`](../../../../java/io/OutputStream.md)

## Constructors

### `<init>()`

## Methods

### `createBuffer()`

**Returns:** `byte[]`

Creates a new byte array for buffering reads or writes.

### `copy([`java.io.InputStream`](../../../../java/io/InputStream.md) from, [`java.io.OutputStream`](../../../../java/io/OutputStream.md) to)`

**Returns:** `long`

Copies all bytes from the input stream to the output stream. Does not close or flush either
 stream.

 <p><b>Java 9 users and later:</b> this method should be treated as deprecated; use the
 equivalent {@link InputStream#transferTo} method instead.
@param from the input stream to read from
@param to the output stream to write to
@return the number of bytes copied
@throws IOException if an I/O error occurs

### `copy([`java.nio.channels.ReadableByteChannel`](../../../../java/nio/channels/ReadableByteChannel.md) from, [`java.nio.channels.WritableByteChannel`](../../../../java/nio/channels/WritableByteChannel.md) to)`

**Returns:** `long`

Copies all bytes from the readable channel to the writable channel. Does not close or flush
 either channel.
@param from the readable channel to read from
@param to the writable channel to write to
@return the number of bytes copied
@throws IOException if an I/O error occurs

### `toByteArrayInternal([`java.io.InputStream`](../../../../java/io/InputStream.md) in, [`java.util.Queue<byte[]>`](../../../../java/util/Queue.md) bufs, `int` totalLen)`

**Returns:** `byte[]`

Returns a byte array containing the bytes from the buffers already in {@code bufs} (which have
 a total combined length of {@code totalLen} bytes) followed by all bytes remaining in the given
 input stream.

### `combineBuffers([`java.util.Queue<byte[]>`](../../../../java/util/Queue.md) bufs, `int` totalLen)`

**Returns:** `byte[]`

### `toByteArray([`java.io.InputStream`](../../../../java/io/InputStream.md) in)`

**Returns:** `byte[]`

Reads all bytes from an input stream into a byte array. Does not close the stream.
@param in the input stream to read from
@return a byte array containing all the bytes from the stream
@throws IOException if an I/O error occurs

### `toByteArray([`java.io.InputStream`](../../../../java/io/InputStream.md) in, `long` expectedSize)`

**Returns:** `byte[]`

Reads all bytes from an input stream into a byte array. The given expected size is used to
 create an initial byte array, but if the actual number of bytes read from the stream differs,
 the correct result will be returned anyway.

### `exhaust([`java.io.InputStream`](../../../../java/io/InputStream.md) in)`

**Returns:** `long`

Reads and discards data from the given {@code InputStream} until the end of the stream is
 reached. Returns the total number of bytes read. Does not close the stream.
@since 20.0

### `newDataInput(`byte[]` bytes)`

**Returns:** [`com.google.common.io.ByteArrayDataInput`](./ByteArrayDataInput.md)

Returns a new {@link ByteArrayDataInput} instance to read from the {@code bytes} array from the
 beginning.

### `newDataInput(`byte[]` bytes, `int` start)`

**Returns:** [`com.google.common.io.ByteArrayDataInput`](./ByteArrayDataInput.md)

Returns a new {@link ByteArrayDataInput} instance to read from the {@code bytes} array,
 starting at the given position.
@throws IndexOutOfBoundsException if {@code start} is negative or greater than the length of
     the array

### `newDataInput([`java.io.ByteArrayInputStream`](../../../../java/io/ByteArrayInputStream.md) byteArrayInputStream)`

**Returns:** [`com.google.common.io.ByteArrayDataInput`](./ByteArrayDataInput.md)

Returns a new {@link ByteArrayDataInput} instance to read from the given {@code
 ByteArrayInputStream}. The given input stream is not reset before being read from by the
 returned {@code ByteArrayDataInput}.
@since 17.0

### `newDataOutput()`

**Returns:** [`com.google.common.io.ByteArrayDataOutput`](./ByteArrayDataOutput.md)

Returns a new {@link ByteArrayDataOutput} instance with a default size.

### `newDataOutput(`int` size)`

**Returns:** [`com.google.common.io.ByteArrayDataOutput`](./ByteArrayDataOutput.md)

Returns a new {@link ByteArrayDataOutput} instance sized to hold {@code size} bytes before
 resizing.
@throws IllegalArgumentException if {@code size} is negative

### `newDataOutput([`java.io.ByteArrayOutputStream`](../../../../java/io/ByteArrayOutputStream.md) byteArrayOutputStream)`

**Returns:** [`com.google.common.io.ByteArrayDataOutput`](./ByteArrayDataOutput.md)

Returns a new {@link ByteArrayDataOutput} instance which writes to the given {@code
 ByteArrayOutputStream}. The given output stream is not reset before being written to by the
 returned {@code ByteArrayDataOutput} and new data will be appended to any existing content.

 <p>Note that if the given output stream was not empty or is modified after the {@code
 ByteArrayDataOutput} is created, the contract for {@link ByteArrayDataOutput#toByteArray} will
 not be honored (the bytes returned in the byte array may not be exactly what was written via
 calls to {@code ByteArrayDataOutput}).
@since 17.0

### `nullOutputStream()`

**Returns:** [`java.io.OutputStream`](../../../../java/io/OutputStream.md)

Returns an {@link OutputStream} that simply discards written bytes.
@since 14.0 (since 1.0 as com.google.common.io.NullOutputStream)

### `limit([`java.io.InputStream`](../../../../java/io/InputStream.md) in, `long` limit)`

**Returns:** [`java.io.InputStream`](../../../../java/io/InputStream.md)

Wraps a {@link InputStream}, limiting the number of bytes which can be read.
@param in the input stream to be wrapped
@param limit the maximum number of bytes to be read
@return a length-limited {@link InputStream}
@since 14.0 (since 1.0 as com.google.common.io.LimitInputStream)

### `readFully([`java.io.InputStream`](../../../../java/io/InputStream.md) in, `byte[]` b)`

**Returns:** `void`

Attempts to read enough bytes from the stream to fill the given byte array, with the same
 behavior as {@link DataInput#readFully(byte[])}. Does not close the stream.
@param in the input stream to read from.
@param b the buffer into which the data is read.
@throws EOFException if this stream reaches the end before reading all the bytes.
@throws IOException if an I/O error occurs.

### `readFully([`java.io.InputStream`](../../../../java/io/InputStream.md) in, `byte[]` b, `int` off, `int` len)`

**Returns:** `void`

Attempts to read {@code len} bytes from the stream into the given array starting at {@code
 off}, with the same behavior as {@link DataInput#readFully(byte[], int, int)}. Does not close
 the stream.
@param in the input stream to read from.
@param b the buffer into which the data is read.
@param off an int specifying the offset into the data.
@param len an int specifying the number of bytes to read.
@throws EOFException if this stream reaches the end before reading all the bytes.
@throws IOException if an I/O error occurs.

### `skipFully([`java.io.InputStream`](../../../../java/io/InputStream.md) in, `long` n)`

**Returns:** `void`

Discards {@code n} bytes of data from the input stream. This method will block until the full
 amount has been skipped. Does not close the stream.
@param in the input stream to read from
@param n the number of bytes to skip
@throws EOFException if this stream reaches the end before skipping all the bytes
@throws IOException if an I/O error occurs, or the stream does not support skipping

### `skipUpTo([`java.io.InputStream`](../../../../java/io/InputStream.md) in, `long` n)`

**Returns:** `long`

Discards up to {@code n} bytes of data from the input stream. This method will block until
 either the full amount has been skipped or until the end of the stream is reached, whichever
 happens first. Returns the total number of bytes skipped.

### `skipSafely([`java.io.InputStream`](../../../../java/io/InputStream.md) in, `long` n)`

**Returns:** `long`

Attempts to skip up to {@code n} bytes from the given input stream, but not more than {@code
 in.available()} bytes. This prevents {@code FileInputStream} from skipping more bytes than
 actually remain in the file, something that it {@linkplain java.io.FileInputStream#skip(long) specifies} it can do in its Javadoc despite the fact that it is violating the contract of
 {@code InputStream.skip()}.

### `readBytes([`java.io.InputStream`](../../../../java/io/InputStream.md) input, [`com.google.common.io.ByteProcessor<T>`](./ByteProcessor.md) processor)`

**Returns:** [`T`](T.md)

Process the bytes of the given input stream using the given processor.
@param input the input stream to process
@param processor the object to which to pass the bytes of the stream
@return the result of the byte processor
@throws IOException if an I/O error occurs
@since 14.0

### `read([`java.io.InputStream`](../../../../java/io/InputStream.md) in, `byte[]` b, `int` off, `int` len)`

**Returns:** `int`

Reads some bytes from an input stream and stores them into the buffer array {@code b}. This
 method blocks until {@code len} bytes of input data have been read into the array, or end of
 file is detected. The number of bytes read is returned, possibly zero. Does not close the
 stream.

 <p>A caller can detect EOF if the number of bytes read is less than {@code len}. All subsequent
 calls on the same stream will return zero.

 <p>If {@code b} is null, a {@code NullPointerException} is thrown. If {@code off} is negative,
 or {@code len} is negative, or {@code off+len} is greater than the length of the array {@code
 b}, then an {@code IndexOutOfBoundsException} is thrown. If {@code len} is zero, then no bytes
 are read. Otherwise, the first byte read is stored into element {@code b[off]}, the next one
 into {@code b[off+1]}, and so on. The number of bytes read is, at most, equal to {@code len}.
@param in the input stream to read from
@param b the buffer into which the data is read
@param off an int specifying the offset into the data
@param len an int specifying the number of bytes to read
@return the number of bytes read
@throws IOException if an I/O error occurs
@throws IndexOutOfBoundsException if {@code off} is negative, if {@code len} is negative, or if
     {@code off + len} is greater than {@code b.length}

