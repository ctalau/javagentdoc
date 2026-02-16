# Class: `LittleEndianByteArray`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.LittleEndianByteArray`

## Description

Utility functions for loading and storing values from a byte array.
**Author:** Kevin Damm
**Author:** Kyle Maddison

## Fields

### `byteArray`

**Type:** [`com.google.common.hash.LittleEndianByteArray.LittleEndianBytes`](LittleEndianByteArray/LittleEndianBytes.md)

The instance that actually does the work; delegates to Unsafe or a pure-Java fallback.

## Constructors

### `<init>()`

Deter instantiation of this class.

## Methods

### `load64(`byte[]` input, `int` offset)`

**Returns:** `long`

Load 8 bytes into long in a little endian manner, from the substring between position and
 position + 8. The array must have at least 8 bytes from offset (inclusive).
@param input the input bytes
@param offset the offset into the array at which to start
@return a long of a concatenated 8 bytes

### `load64Safely(`byte[]` input, `int` offset, `int` length)`

**Returns:** `long`

Similar to load64, but allows offset + 8 > input.length, padding the result with zeroes. This
 has to explicitly reverse the order of the bytes as it packs them into the result which makes
 it slower than the native version.
@param input the input bytes
@param offset the offset into the array at which to start reading
@param length the number of bytes from the input to read
@return a long of a concatenated 8 bytes

### `store64(`byte[]` sink, `int` offset, `long` value)`

**Returns:** `void`

Store 8 bytes into the provided array at the indicated offset, using the value provided.
@param sink the output byte array
@param offset the offset into the array at which to start writing
@param value the value to write

### `load32(`byte[]` source, `int` offset)`

**Returns:** `int`

Load 4 bytes from the provided array at the indicated offset.
@param source the input bytes
@param offset the offset into the array at which to start
@return the value found in the array in the form of a long

### `usingUnsafe()`

**Returns:** `boolean`

Indicates that the loading of Unsafe was successful and the load and store operations will be
 very efficient. May be useful for calling code to fall back on an alternative implementation
 that is slower than Unsafe.get/store but faster than the pure-Java mask-and-shift.

