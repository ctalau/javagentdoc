# Class: `ReaderInputStream`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.ReaderInputStream`

**Extends:** `java.io.InputStream`

## Description

This is an alternative to copying the data to an OutputStream via a Writer,
 which is necessarily blocking. By implementing an InputStream it allows consumers to
 "pull" as much data as they can handle, which is more convenient when dealing with flow
 controlled, async APIs.

## Fields

### `reader`

**Type:** `java.io.Reader`

### `encoder`

**Type:** `java.nio.charset.CharsetEncoder`

### `singleByte`

**Type:** `byte[]`

### `charBuffer`

**Type:** `java.nio.CharBuffer`

The buffer
 is perpetually "flipped" (unencoded characters between position and limit).

### `byteBuffer`

**Type:** `java.nio.ByteBuffer`

When encoding it is "unflipped" (encoded bytes between 0 and position) and when
 draining it is flipped (undrained bytes between position and limit).

### `endOfInput`

**Type:** `boolean`

### `draining`

**Type:** `boolean`

### `doneFlushing`

**Type:** `boolean`

## Constructors

### `<init>(Reader reader, Charset charset, int bufferSize)`

Malformed input and unmappable characters will be replaced.

**Parameters:**
- `reader` (`java.io.Reader`): input source
- `charset` (`java.nio.charset.Charset`): character set used for encoding chars to bytes
- `bufferSize` (`int`): size of internal input and output buffers

### `<init>(Reader reader, CharsetEncoder encoder, int bufferSize)`

**Parameters:**
- `reader` (`java.io.Reader`): input source
- `encoder` (`java.nio.charset.CharsetEncoder`): character set encoder used for encoding chars to bytes
- `bufferSize` (`int`): size of internal input and output buffers

## Methods

### `close()`

**Returns:** `void`

### `read()`

**Returns:** `int`

### `read(byte[] b, int off, int len)`

**Parameters:**
- `b` (`byte[]`)
- `off` (`int`)
- `len` (`int`)

**Returns:** `int`

### `grow(CharBuffer buf)`

**Parameters:**
- `buf` (`java.nio.CharBuffer`)

**Returns:** `java.nio.CharBuffer`

### `readMoreChars()`

**Returns:** `void`

### `availableCapacity(Buffer buffer)`

**Parameters:**
- `buffer` (`java.nio.Buffer`)

**Returns:** `int`

### `startDraining(boolean overflow)`

If we are starting to
 drain because there was overflow, and there aren't actually any characters to drain, then the
 overflow must be due to a small output buffer.

**Parameters:**
- `overflow` (`boolean`)

**Returns:** `void`

### `drain(byte[] b, int off, int len)`

**Parameters:**
- `b` (`byte[]`)
- `off` (`int`)
- `len` (`int`)

**Returns:** `int`

