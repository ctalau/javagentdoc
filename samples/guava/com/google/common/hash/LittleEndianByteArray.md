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

The array must have at least 8 bytes from offset (inclusive).

**Parameters:**
- `input` (`byte[]`): the input bytes
- `offset` (`int`): the offset into the array at which to start

**Returns:** `long`

### `load64Safely(byte[] input, int offset, int length)`

This
 has to explicitly reverse the order of the bytes as it packs them into the result which makes
 it slower than the native version.

**Parameters:**
- `input` (`byte[]`): the input bytes
- `offset` (`int`): the offset into the array at which to start reading
- `length` (`int`): the number of bytes from the input to read

**Returns:** `long`

### `store64(byte[] sink, int offset, long value)`

**Parameters:**
- `sink` (`byte[]`): the output byte array
- `offset` (`int`): the offset into the array at which to start writing
- `value` (`long`): the value to write

**Returns:** `void`

### `load32(byte[] source, int offset)`

**Parameters:**
- `source` (`byte[]`): the input bytes
- `offset` (`int`): the offset into the array at which to start

**Returns:** `int`

### `usingUnsafe()`

May be useful for calling code to fall back on an alternative implementation
 that is slower than Unsafe.get/store but faster than the pure-Java mask-and-shift.

**Returns:** `boolean`

