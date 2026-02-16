# Interface: `ByteProcessor`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.ByteProcessor`

## Type Parameters

- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A callback interface to process bytes from a stream.

 <p>`processBytes` will be called for each chunk of data that is read, and should return
 `false` when you want to stop processing.
**Author:** Chris Nokleberg
**Since:** 1.0

## Methods

### `processBytes(`byte[]` buf, `int` off, `int` len)`

**Returns:** `boolean`

This method will be called for each chunk of bytes in an input stream. The implementation
 should process the bytes from `buf[off]` through `buf[off + len - 1]` (inclusive).
@param buf the byte array containing the data to process
@param off the initial offset into the array
@param len the length of data to be processed
@return true to continue processing, false to stop

### `getResult()`

**Returns:** `T`

Return the result of processing all the bytes.

