# Class: `UnsignedBytes`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.UnsignedBytes`

## Description

Static utility methods pertaining to `byte` primitives that interpret values as
 <i>unsigned</i> (that is, any negative value `b` is treated as the positive value `256 + b`). The corresponding methods that treat the values as signed are found in `SignedBytes`, and the methods for which signedness is not an issue are in `Bytes`.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/PrimitivesExplained">primitive utilities</a>.
**Author:** Kevin Bourrillion
**Author:** Martin Buchholz
**Author:** Hiroshi Yamauchi
**Author:** Louis Wasserman
**Since:** 1.0

## Fields

### `MAX_POWER_OF_TWO`

**Type:** `byte`

The largest power of two that can be represented as an unsigned `byte`.
**Since:** 10.0

### `MAX_VALUE`

**Type:** `byte`

The largest value that fits into an unsigned byte.
**Since:** 13.0

### `UNSIGNED_MASK`

**Type:** `int`

## Constructors

### `<init>()`

## Methods

### `toInt(`byte` value)`

**Returns:** `int`

Returns the value of the given byte as an integer, when treated as unsigned. That is, returns
 `value + 256` if `value` is negative; `value` itself otherwise.

 <p><b>Java 8 users:</b> use `Byte.toUnsignedInt(byte)` instead.
**Since:** 6.0

### `checkedCast(`long` value)`

**Returns:** `byte`

Returns the `byte` value that, when treated as unsigned, is equal to `value`, if
 possible.
@param value a value between 0 and 255 inclusive
@return the `byte` value that, when treated as unsigned, equals `value`
@throws IllegalArgumentException if `value` is negative or greater than 255

### `saturatedCast(`long` value)`

**Returns:** `byte`

Returns the `byte` value that, when treated as unsigned, is nearest in value to `value`.
@param value any `long` value
@return `(byte) 255` if `value >= 255`, `(byte) 0` if `value <= 0`, and
     `value` cast to `byte` otherwise

### `compare(`byte` a, `byte` b)`

**Returns:** `int`

Compares the two specified `byte` values, treating them as unsigned values between 0 and
 255 inclusive. For example, `(byte) -127` is considered greater than `(byte) 127`
 because it is seen as having the value of positive `129`.
@param a the first `byte` to compare
@param b the second `byte` to compare
@return a negative value if `a` is less than `b`; a positive value if `a` is
     greater than `b`; or zero if they are equal

### `min(`byte[]` array)`

**Returns:** `byte`

Returns the least value present in `array`, treating values as unsigned.
@param array a <i>nonempty</i> array of `byte` values
@return the value present in `array` that is less than or equal to every other value in
     the array according to `compare`
@throws IllegalArgumentException if `array` is empty

### `max(`byte[]` array)`

**Returns:** `byte`

Returns the greatest value present in `array`, treating values as unsigned.
@param array a <i>nonempty</i> array of `byte` values
@return the value present in `array` that is greater than or equal to every other value
     in the array according to `compare`
@throws IllegalArgumentException if `array` is empty

### `toString(`byte` x)`

**Returns:** `java.lang.String`

Returns a string representation of x, where x is treated as unsigned.
**Since:** 13.0

### `toString(`byte` x, `int` radix)`

**Returns:** `java.lang.String`

Returns a string representation of `x` for the given radix, where `x` is treated as
 unsigned.
@param x the value to convert to a string.
@param radix the radix to use while working with `x`
@throws IllegalArgumentException if `radix` is not between `Character.MIN_RADIX`
     and `Character.MAX_RADIX`.
**Since:** 13.0

### `parseUnsignedByte(`java.lang.String` string)`

**Returns:** `byte`

Returns the unsigned `byte` value represented by the given decimal string.
@throws NumberFormatException if the string does not contain a valid unsigned `byte`
     value
@throws NullPointerException if `string` is null (in contrast to `Byte.parseByte(String)`)
**Since:** 13.0

### `parseUnsignedByte(`java.lang.String` string, `int` radix)`

**Returns:** `byte`

Returns the unsigned `byte` value represented by a string with the given radix.
@param string the string containing the unsigned `byte` representation to be parsed.
@param radix the radix to use while parsing `string`
@throws NumberFormatException if the string does not contain a valid unsigned `byte` with
     the given radix, or if `radix` is not between `Character.MIN_RADIX` and `Character.MAX_RADIX`.
@throws NullPointerException if `string` is null (in contrast to `Byte.parseByte(String)`)
**Since:** 13.0

### `join(`java.lang.String` separator, `byte[]` array)`

**Returns:** `java.lang.String`

Returns a string containing the supplied `byte` values separated by `separator`.
 For example, `join(":", (byte) 1, (byte) 2, (byte) 255)` returns the string `"1:2:255"`.
@param separator the text that should appear between consecutive values in the resulting string
     (but not at the start or end)
@param array an array of `byte` values, possibly empty

### `lexicographicalComparator()`

**Returns:** `java.util.Comparator<byte[]>`

Returns a comparator that compares two `byte` arrays <a href="http://en.wikipedia.org/wiki/Lexicographical_order">lexicographically</a>. That is, it
 compares, using `compare(byte, byte)`), the first pair of values that follow any common
 prefix, or when one array is a prefix of the other, treats the shorter array as the lesser. For
 example, `[] < [0x01] < [0x01, 0x7F] < [0x01, 0x80] < [0x02]`. Values are treated as
 unsigned.

 <p>The returned comparator is inconsistent with `Object.equals(Object)` (since arrays
 support only identity equality), but it is consistent with `java.util.Arrays.equals(byte[], byte[])`.
**Since:** 2.0

### `lexicographicalComparatorJavaImpl()`

**Returns:** `java.util.Comparator<byte[]>`

### `flip(`byte` b)`

**Returns:** `byte`

### `sort(`byte[]` array)`

**Returns:** `void`

Sorts the array, treating its elements as unsigned bytes.
**Since:** 23.1

### `sort(`byte[]` array, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Sorts the array between `fromIndex` inclusive and `toIndex` exclusive, treating its
 elements as unsigned bytes.
**Since:** 23.1

### `sortDescending(`byte[]` array)`

**Returns:** `void`

Sorts the elements of `array` in descending order, interpreting them as unsigned 8-bit
 integers.
**Since:** 23.1

### `sortDescending(`byte[]` array, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Sorts the elements of `array` between `fromIndex` inclusive and `toIndex`
 exclusive in descending order, interpreting them as unsigned 8-bit integers.
**Since:** 23.1

