# Class: `Utf8`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Utf8`

## Description

Low-level, high-performance utility methods related to the UTF-8
 character encoding. UTF-8 is defined in section D92 of <a href="http://www.unicode.org/versions/Unicode6.2.0/ch03.pdf">The Unicode Standard Core
 Specification, Chapter 3</a>.

 <p>The variant of UTF-8 implemented by this class is the restricted definition of UTF-8
 introduced in Unicode 3.1. One implication of this is that it rejects <a href="http://www.unicode.org/versions/corrigendum1.html">"non-shortest form"</a> byte sequences,
 even though the JDK decoder may accept them.
**Author:** Martin Buchholz
**Author:** Clément Roux
**Since:** 16.0

## Constructors

### `<init>()`

## Methods

### `encodedLength(`java.lang.CharSequence` sequence)`

**Returns:** `int`

Returns the number of bytes in the UTF-8-encoded form of `sequence`. For a string, this
 method is equivalent to `string.getBytes(UTF_8).length`, but is more efficient in both
 time and space.
@throws IllegalArgumentException if `sequence` contains ill-formed UTF-16 (unpaired
     surrogates)

### `encodedLengthGeneral(`java.lang.CharSequence` sequence, `int` start)`

**Returns:** `int`

### `isWellFormed(`byte[]` bytes)`

**Returns:** `boolean`

Returns `true` if `bytes` is a <i>well-formed</i> UTF-8 byte sequence according to
 Unicode 6.0. Note that this is a stronger criterion than simply whether the bytes can be
 decoded. For example, some versions of the JDK decoder will accept "non-shortest form" byte
 sequences, but encoding never reproduces these. Such byte sequences are <i>not</i> considered
 well-formed.

 <p>This method returns `true` if and only if `Arrays.equals(bytes, new
 String(bytes, UTF_8).getBytes(UTF_8))` does, but is more efficient in both time and space.

### `isWellFormed(`byte[]` bytes, `int` off, `int` len)`

**Returns:** `boolean`

Returns whether the given byte array slice is a well-formed UTF-8 byte sequence, as defined by
 `isWellFormed(byte[])`. Note that this can be false even when `isWellFormed(bytes)` is true.
@param bytes the input buffer
@param off the offset in the buffer of the first byte to read
@param len the number of bytes to read from the buffer

### `isWellFormedSlowPath(`byte[]` bytes, `int` off, `int` end)`

**Returns:** `boolean`

### `unpairedSurrogateMsg(`int` i)`

**Returns:** `java.lang.String`

