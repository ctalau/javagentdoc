# Class: `SignedBytes`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.SignedBytes`

## Description

Static utility methods pertaining to `byte` primitives that interpret values as signed. The
 corresponding methods that treat the values as unsigned are found in `UnsignedBytes`, and
 the methods for which signedness is not an issue are in `Bytes`.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/PrimitivesExplained">primitive utilities</a>.
**Author:** Kevin Bourrillion
**Since:** 1.0

## Fields

### `MAX_POWER_OF_TWO`

**Type:** `byte`

The largest power of two that can be represented as a signed `byte`.
**Since:** 10.0

## Constructors

### `<init>()`

## Methods

### `checkedCast(`long` value)`

**Returns:** `byte`

Returns the `byte` value that is equal to `value`, if possible.
@param value any value in the range of the `byte` type
@return the `byte` value that equals `value`
@throws IllegalArgumentException if `value` is greater than `Byte.MAX_VALUE` or
     less than `Byte.MIN_VALUE`

### `saturatedCast(`long` value)`

**Returns:** `byte`

Returns the `byte` nearest in value to `value`.
@param value any `long` value
@return the same value cast to `byte` if it is in the range of the `byte` type,
     `Byte.MAX_VALUE` if it is too large, or `Byte.MIN_VALUE` if it is too small

### `compare(`byte` a, `byte` b)`

**Returns:** `int`

Compares the two specified `byte` values. The sign of the value returned is the same as
 that of `((Byte) a).compareTo(b)`.

 <p><b>Note:</b> this method behaves identically to the JDK 7 method `Byte.compare`.
@param a the first `byte` to compare
@param b the second `byte` to compare
@return a negative value if `a` is less than `b`; a positive value if `a` is
     greater than `b`; or zero if they are equal

### `min(`byte[]` array)`

**Returns:** `byte`

Returns the least value present in `array`.
@param array a <i>nonempty</i> array of `byte` values
@return the value present in `array` that is less than or equal to every other value in
     the array
@throws IllegalArgumentException if `array` is empty

### `max(`byte[]` array)`

**Returns:** `byte`

Returns the greatest value present in `array`.
@param array a <i>nonempty</i> array of `byte` values
@return the value present in `array` that is greater than or equal to every other value
     in the array
@throws IllegalArgumentException if `array` is empty

### `join(`java.lang.String` separator, `byte[]` array)`

**Returns:** `java.lang.String`

Returns a string containing the supplied `byte` values separated by `separator`.
 For example, `join(":", 0x01, 0x02, -0x01)` returns the string `"1:2:-1"`.
@param separator the text that should appear between consecutive values in the resulting string
     (but not at the start or end)
@param array an array of `byte` values, possibly empty

### `lexicographicalComparator()`

**Returns:** `java.util.Comparator<byte[]>`

Returns a comparator that compares two `byte` arrays <a href="http://en.wikipedia.org/wiki/Lexicographical_order">lexicographically</a>. That is, it
 compares, using `compare(byte, byte)`), the first pair of values that follow any common
 prefix, or when one array is a prefix of the other, treats the shorter array as the lesser. For
 example, `[] < [0x01] < [0x01, 0x80] < [0x01, 0x7F] < [0x02]`. Values are treated as
 signed.

 <p>The returned comparator is inconsistent with `Object.equals(Object)` (since arrays
 support only identity equality), but it is consistent with `java.util.Arrays.equals(byte[], byte[])`.
**Since:** 2.0

### `sortDescending(`byte[]` array)`

**Returns:** `void`

Sorts the elements of `array` in descending order.
**Since:** 23.1

### `sortDescending(`byte[]` array, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Sorts the elements of `array` between `fromIndex` inclusive and `toIndex`
 exclusive in descending order.
**Since:** 23.1

