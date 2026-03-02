# Class: `SignedBytes`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.SignedBytes`

## Description

The
 corresponding methods that treat the values as unsigned are found in UnsignedBytes, and
 the methods for which signedness is not an issue are in Bytes.

 
See the Guava User Guide article on [primitive utilities](https://github.com/google/guava/wiki/PrimitivesExplained).

## Fields

### `MAX_POWER_OF_TWO`

**Type:** `byte`

## Constructors

### `<init>()`

## Methods

### `checkedCast(long value)`

**Returns:** `byte`

**Parameters:**
- `value` (`long`): any value in the range of the byte type

### `saturatedCast(long value)`

**Returns:** `byte`

**Parameters:**
- `value` (`long`): any long value

### `compare(byte a, byte b)`

**Returns:** `int`

The sign of the value returned is the same as
 that of ((Byte) a).compareTo(b).

 
**Note:** this method behaves identically to the JDK 7 method Byte#compare.

**Parameters:**
- `a` (`byte`): the first byte to compare
- `b` (`byte`): the second byte to compare

### `min(byte[] array)`

**Returns:** `byte`

**Parameters:**
- `array` (`byte[]`): a *nonempty* array of byte values

### `max(byte[] array)`

**Returns:** `byte`

**Parameters:**
- `array` (`byte[]`): a *nonempty* array of byte values

### `join(java.lang.String separator, byte[] array)`

**Returns:** `java.lang.String`

For example, join(":", 0x01, 0x02, -0x01) returns the string "1:2:-1".

**Parameters:**
- `separator` (`java.lang.String`): the text that should appear between consecutive values in the resulting string
     (but not at the start or end)
- `array` (`byte[]`): an array of byte values, possibly empty

### `lexicographicalComparator()`

**Returns:** `java.util.Comparator<byte[]>`

That is, it
 compares, using #compare(byte, byte)), the first pair of values that follow any common
 prefix, or when one array is a prefix of the other, treats the shorter array as the lesser. For
 example, [] < [0x01] < [0x01, 0x80] < [0x01, 0x7F] < [0x02]. Values are treated as
 signed.

 
The returned comparator is inconsistent with Object#equals(Object) (since arrays
 support only identity equality), but it is consistent with java.util.Arrays#equals(byte[], byte[]).

### `sortDescending(byte[] array)`

**Returns:** `void`

**Parameters:**
- `array` (`byte[]`)

### `sortDescending(byte[] array, int fromIndex, int toIndex)`

**Returns:** `void`

**Parameters:**
- `array` (`byte[]`)
- `fromIndex` (`int`)
- `toIndex` (`int`)

