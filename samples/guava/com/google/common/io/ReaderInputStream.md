# Class: `ReaderInputStream`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.ReaderInputStream`

**Extends:** [`java.io.InputStream`](../../../../java/io/InputStream.md)

## Description

An {@link InputStream} that converts characters from a {@link Reader} into bytes using an
 arbitrary Charset.

 <p>This is an alternative to copying the data to an {@code OutputStream} via a {@code Writer},
 which is necessarily blocking. By implementing an {@code InputStream} it allows consumers to
 "pull" as much data as they can handle, which is more convenient when dealing with flow
 controlled, async APIs.
@author Chris Nokleberg

## Fields

### `reader`

**Type:** [`java.io.Reader`](../../../../java/io/Reader.md)

### `encoder`

**Type:** [`java.nio.charset.CharsetEncoder`](../../../../java/nio/charset/CharsetEncoder.md)

### `singleByte`

**Type:** `byte[]`

### `charBuffer`

**Type:** [`java.nio.CharBuffer`](../../../../java/nio/CharBuffer.md)

charBuffer holds characters that have been read from the Reader but not encoded yet. The buffer
 is perpetually "flipped" (unencoded characters between position and limit).

### `byteBuffer`

**Type:** [`java.nio.ByteBuffer`](../../../../java/nio/ByteBuffer.md)

byteBuffer holds encoded characters that have not yet been sent to the caller of the input
 stream. When encoding it is "unflipped" (encoded bytes between 0 and position) and when
 draining it is flipped (undrained bytes between position and limit).

### `endOfInput`

**Type:** `boolean`

Whether we've finished reading the reader.

### `draining`

**Type:** `boolean`

Whether we're copying encoded bytes to the caller's buffer.

### `doneFlushing`

**Type:** `boolean`

Whether we've successfully flushed the encoder.

## Constructors

### `<init>([`java.io.Reader`](../../../../java/io/Reader.md) reader, [`java.nio.charset.Charset`](../../../../java/nio/charset/Charset.md) charset, `int` bufferSize)`

Creates a new input stream that will encode the characters from {@code reader} into bytes using
 the given character set. Malformed input and unmappable characters will be replaced.
@param reader input source
@param charset character set used for encoding chars to bytes
@param bufferSize size of internal input and output buffers
@throws IllegalArgumentException if bufferSize is non-positive

### `<init>([`java.io.Reader`](../../../../java/io/Reader.md) reader, [`java.nio.charset.CharsetEncoder`](../../../../java/nio/charset/CharsetEncoder.md) encoder, `int` bufferSize)`

Creates a new input stream that will encode the characters from {@code reader} into bytes using
 the given character set encoder.
@param reader input source
@param encoder character set encoder used for encoding chars to bytes
@param bufferSize size of internal input and output buffers
@throws IllegalArgumentException if bufferSize is non-positive

## Methods

### `close()`

**Returns:** `void`

### `read()`

**Returns:** `int`

### `read(`byte[]` b, `int` off, `int` len)`

**Returns:** `int`

### `grow([`java.nio.CharBuffer`](../../../../java/nio/CharBuffer.md) buf)`

**Returns:** [`java.nio.CharBuffer`](../../../../java/nio/CharBuffer.md)

Returns a new CharBuffer identical to buf, except twice the capacity.

### `readMoreChars()`

**Returns:** `void`

Handle the case of underflow caused by needing more input characters.

### `availableCapacity([`java.nio.Buffer`](../../../../java/nio/Buffer.md) buffer)`

**Returns:** `int`

Returns the number of elements between the limit and capacity.

### `startDraining(`boolean` overflow)`

**Returns:** `void`

Flips the buffer output buffer so we can start reading bytes from it. If we are starting to
 drain because there was overflow, and there aren't actually any characters to drain, then the
 overflow must be due to a small output buffer.

### `drain(`byte[]` b, `int` off, `int` len)`

**Returns:** `int`

Copy as much of the byte buffer into the output array as possible, returning the (positive)
 number of characters copied.

