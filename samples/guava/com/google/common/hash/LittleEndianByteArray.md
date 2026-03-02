# Class: `LittleEndianByteArray`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.LittleEndianByteArray`

## Description

## Fields

### `byteArray`

**Type:** `com.google.common.hash.LittleEndianByteArray.LittleEndianBytes`

## Constructors

### `<init>()`

## Methods

### `load64(byte[] input, int offset)`

**Returns:** `long`

The array must have at least 8 bytes from offset (inclusive).

**Parameters:**
- `input` (`byte[]`): the input bytes
- `offset` (`int`): the offset into the array at which to start

### `load64Safely(byte[] input, int offset, int length)`

**Returns:** `long`

This
 has to explicitly reverse the order of the bytes as it packs them into the result which makes
 it slower than the native version.

**Parameters:**
- `input` (`byte[]`): the input bytes
- `offset` (`int`): the offset into the array at which to start reading
- `length` (`int`): the number of bytes from the input to read

### `store64(byte[] sink, int offset, long value)`

**Returns:** `void`

**Parameters:**
- `sink` (`byte[]`): the output byte array
- `offset` (`int`): the offset into the array at which to start writing
- `value` (`long`): the value to write

### `load32(byte[] source, int offset)`

**Returns:** `int`

**Parameters:**
- `source` (`byte[]`): the input bytes
- `offset` (`int`): the offset into the array at which to start

### `usingUnsafe()`

**Returns:** `boolean`

May be useful for calling code to fall back on an alternative implementation
 that is slower than Unsafe.get/store but faster than the pure-Java mask-and-shift.

