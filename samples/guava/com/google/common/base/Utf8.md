# Class: `Utf8`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Utf8`

## Description

UTF-8 is defined in section D92 of [The Unicode Standard Core
 Specification, Chapter 3](http://www.unicode.org/versions/Unicode6.2.0/ch03.pdf).

 
The variant of UTF-8 implemented by this class is the restricted definition of UTF-8
 introduced in Unicode 3.1. One implication of this is that it rejects ["non-shortest form"](http://www.unicode.org/versions/corrigendum1.html) byte sequences,
 even though the JDK decoder may accept them.

## Constructors

### `<init>()`

## Methods

### `encodedLength(CharSequence sequence)`

For a string, this
 method is equivalent to string.getBytes(UTF_8).length, but is more efficient in both
 time and space.

**Parameters:**
- `sequence` (`java.lang.CharSequence`)

**Returns:** `int`

### `encodedLengthGeneral(CharSequence sequence, int start)`

**Parameters:**
- `sequence` (`java.lang.CharSequence`)
- `start` (`int`)

**Returns:** `int`

### `isWellFormed(byte[] bytes)`

Note that this is a stronger criterion than simply whether the bytes can be
 decoded. For example, some versions of the JDK decoder will accept "non-shortest form" byte
 sequences, but encoding never reproduces these. Such byte sequences are *not* considered
 well-formed.

 
This method returns true if and only if Arrays.equals(bytes, new
 String(bytes, UTF_8).getBytes(UTF_8)) does, but is more efficient in both time and space.

**Parameters:**
- `bytes` (`byte[]`)

**Returns:** `boolean`

### `isWellFormed(byte[] bytes, int off, int len)`

Note that this can be false even when 
 isWellFormed(bytes) is true.

**Parameters:**
- `bytes` (`byte[]`): the input buffer
- `off` (`int`): the offset in the buffer of the first byte to read
- `len` (`int`): the number of bytes to read from the buffer

**Returns:** `boolean`

### `isWellFormedSlowPath(byte[] bytes, int off, int end)`

**Parameters:**
- `bytes` (`byte[]`)
- `off` (`int`)
- `end` (`int`)

**Returns:** `boolean`

### `unpairedSurrogateMsg(int i)`

**Parameters:**
- `i` (`int`)

**Returns:** `java.lang.String`

