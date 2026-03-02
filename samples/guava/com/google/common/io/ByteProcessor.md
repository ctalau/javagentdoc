# Interface: `ByteProcessor`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.ByteProcessor`

## Type Parameters

- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

#processBytes will be called for each chunk of data that is read, and should return
 false when you want to stop processing.

## Methods

### `processBytes(byte[] buf, int off, int len)`

The implementation
 should process the bytes from buf[off] through buf[off + len - 1] (inclusive).

**Parameters:**
- `buf` (`byte[]`): the byte array containing the data to process
- `off` (`int`): the initial offset into the array
- `len` (`int`): the length of data to be processed

**Returns:** `boolean`

### `getResult()`

**Returns:** `T`

