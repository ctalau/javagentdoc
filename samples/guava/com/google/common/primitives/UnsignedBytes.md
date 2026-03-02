# Class: `UnsignedBytes`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.UnsignedBytes`

## Description

The corresponding methods that treat the values as signed are found in SignedBytes, and the methods for which signedness is not an issue are in Bytes.

 
See the Guava User Guide article on [primitive utilities](https://github.com/google/guava/wiki/PrimitivesExplained).

## Fields

### `MAX_POWER_OF_TWO`

**Type:** `byte`

### `MAX_VALUE`

**Type:** `byte`

### `UNSIGNED_MASK`

**Type:** `int`

## Constructors

### `<init>()`

## Methods

### `toInt(byte value)`

That is, returns
 value + 256 if value is negative; value itself otherwise.

 
**Java 8 users:** use Byte#toUnsignedInt(byte) instead.

**Parameters:**
- `value` (`byte`)

**Returns:** `int`

### `checkedCast(long value)`

**Parameters:**
- `value` (`long`): a value between 0 and 255 inclusive

**Returns:** `byte`

### `saturatedCast(long value)`

**Parameters:**
- `value` (`long`): any long value

**Returns:** `byte`

### `compare(byte a, byte b)`

For example, (byte) -127 is considered greater than (byte) 127
 because it is seen as having the value of positive 129.

**Parameters:**
- `a` (`byte`): the first byte to compare
- `b` (`byte`): the second byte to compare

**Returns:** `int`

### `min(byte[] array)`

**Parameters:**
- `array` (`byte[]`): a *nonempty* array of byte values

**Returns:** `byte`

### `max(byte[] array)`

**Parameters:**
- `array` (`byte[]`): a *nonempty* array of byte values

**Returns:** `byte`

### `toString(byte x)`

**Parameters:**
- `x` (`byte`)

**Returns:** `java.lang.String`

### `toString(byte x, int radix)`

**Parameters:**
- `x` (`byte`): the value to convert to a string.
- `radix` (`int`): the radix to use while working with x

**Returns:** `java.lang.String`

### `parseUnsignedByte(String string)`

**Parameters:**
- `string` (`java.lang.String`)

**Returns:** `byte`

### `parseUnsignedByte(String string, int radix)`

**Parameters:**
- `string` (`java.lang.String`): the string containing the unsigned byte representation to be parsed.
- `radix` (`int`): the radix to use while parsing string

**Returns:** `byte`

### `join(String separator, byte[] array)`

For example, join(":", (byte) 1, (byte) 2, (byte) 255) returns the string 
 "1:2:255".

**Parameters:**
- `separator` (`java.lang.String`): the text that should appear between consecutive values in the resulting string
       (but not at the start or end)
- `array` (`byte[]`): an array of byte values, possibly empty

**Returns:** `java.lang.String`

### `lexicographicalComparator()`

That is, it
 compares, using #compare(byte, byte)), the first pair of values that follow any common
 prefix, or when one array is a prefix of the other, treats the shorter array as the lesser. For
 example, [] < [0x01] < [0x01, 0x7F] < [0x01, 0x80] < [0x02]. Values are treated as
 unsigned.

 
The returned comparator is inconsistent with Object#equals(Object) (since arrays
 support only identity equality), but it is consistent with java.util.Arrays#equals(byte[], byte[]).

**Returns:** `java.util.Comparator<byte[]>`

### `lexicographicalComparatorJavaImpl()`

**Returns:** `java.util.Comparator<byte[]>`

### `flip(byte b)`

**Parameters:**
- `b` (`byte`)

**Returns:** `byte`

### `sort(byte[] array)`

**Parameters:**
- `array` (`byte[]`)

**Returns:** `void`

### `sort(byte[] array, int fromIndex, int toIndex)`

**Parameters:**
- `array` (`byte[]`)
- `fromIndex` (`int`)
- `toIndex` (`int`)

**Returns:** `void`

### `sortDescending(byte[] array)`

**Parameters:**
- `array` (`byte[]`)

**Returns:** `void`

### `sortDescending(byte[] array, int fromIndex, int toIndex)`

**Parameters:**
- `array` (`byte[]`)
- `fromIndex` (`int`)
- `toIndex` (`int`)

**Returns:** `void`

