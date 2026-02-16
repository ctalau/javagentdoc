# Class: `UnsignedBytes`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.UnsignedBytes`

## Description

Static utility methods pertaining to {@code byte} primitives that interpret values as
 <i>unsigned</i> (that is, any negative value {@code b} is treated as the positive value {@code
 256 + b}). The corresponding methods that treat the values as signed are found in {@link SignedBytes}, and the methods for which signedness is not an issue are in {@link Bytes}.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/PrimitivesExplained">primitive utilities</a>.
@author Kevin Bourrillion
@author Martin Buchholz
@author Hiroshi Yamauchi
@author Louis Wasserman
@since 1.0

## Fields

### `MAX_POWER_OF_TWO`

**Type:** `byte`

The largest power of two that can be represented as an unsigned {@code byte}.
@since 10.0

### `MAX_VALUE`

**Type:** `byte`

The largest value that fits into an unsigned byte.
@since 13.0

### `UNSIGNED_MASK`

**Type:** `int`

## Constructors

### `<init>()`

## Methods

### `toInt(`byte` value)`

**Returns:** `int`

Returns the value of the given byte as an integer, when treated as unsigned. That is, returns
 {@code value + 256} if {@code value} is negative; {@code value} itself otherwise.

 <p><b>Java 8 users:</b> use {@link Byte#toUnsignedInt(byte)} instead.
@since 6.0

### `checkedCast(`long` value)`

**Returns:** `byte`

Returns the {@code byte} value that, when treated as unsigned, is equal to {@code value}, if
 possible.
@param value a value between 0 and 255 inclusive
@return the {@code byte} value that, when treated as unsigned, equals {@code value}
@throws IllegalArgumentException if {@code value} is negative or greater than 255

### `saturatedCast(`long` value)`

**Returns:** `byte`

Returns the {@code byte} value that, when treated as unsigned, is nearest in value to {@code
 value}.
@param value any {@code long} value
@return {@code (byte) 255} if {@code value >= 255}, {@code (byte) 0} if {@code value <= 0}, and
     {@code value} cast to {@code byte} otherwise

### `compare(`byte` a, `byte` b)`

**Returns:** `int`

Compares the two specified {@code byte} values, treating them as unsigned values between 0 and
 255 inclusive. For example, {@code (byte) -127} is considered greater than {@code (byte) 127}
 because it is seen as having the value of positive {@code 129}.
@param a the first {@code byte} to compare
@param b the second {@code byte} to compare
@return a negative value if {@code a} is less than {@code b}; a positive value if {@code a} is
     greater than {@code b}; or zero if they are equal

### `min(`byte[]` array)`

**Returns:** `byte`

Returns the least value present in {@code array}, treating values as unsigned.
@param array a <i>nonempty</i> array of {@code byte} values
@return the value present in {@code array} that is less than or equal to every other value in
     the array according to {@link #compare}
@throws IllegalArgumentException if {@code array} is empty

### `max(`byte[]` array)`

**Returns:** `byte`

Returns the greatest value present in {@code array}, treating values as unsigned.
@param array a <i>nonempty</i> array of {@code byte} values
@return the value present in {@code array} that is greater than or equal to every other value
     in the array according to {@link #compare}
@throws IllegalArgumentException if {@code array} is empty

### `toString(`byte` x)`

**Returns:** `java.lang.String`

Returns a string representation of x, where x is treated as unsigned.
@since 13.0

### `toString(`byte` x, `int` radix)`

**Returns:** `java.lang.String`

Returns a string representation of {@code x} for the given radix, where {@code x} is treated as
 unsigned.
@param x the value to convert to a string.
@param radix the radix to use while working with {@code x}
@throws IllegalArgumentException if {@code radix} is not between {@link Character#MIN_RADIX}
     and {@link Character#MAX_RADIX}.
@since 13.0

### `parseUnsignedByte(`java.lang.String` string)`

**Returns:** `byte`

Returns the unsigned {@code byte} value represented by the given decimal string.
@throws NumberFormatException if the string does not contain a valid unsigned {@code byte}
     value
@throws NullPointerException if {@code string} is null (in contrast to {@link Byte#parseByte(String)})
@since 13.0

### `parseUnsignedByte(`java.lang.String` string, `int` radix)`

**Returns:** `byte`

Returns the unsigned {@code byte} value represented by a string with the given radix.
@param string the string containing the unsigned {@code byte} representation to be parsed.
@param radix the radix to use while parsing {@code string}
@throws NumberFormatException if the string does not contain a valid unsigned {@code byte} with
     the given radix, or if {@code radix} is not between {@link Character#MIN_RADIX} and {@link Character#MAX_RADIX}.
@throws NullPointerException if {@code string} is null (in contrast to {@link Byte#parseByte(String)})
@since 13.0

### `join(`java.lang.String` separator, `byte[]` array)`

**Returns:** `java.lang.String`

Returns a string containing the supplied {@code byte} values separated by {@code separator}.
 For example, {@code join(":", (byte) 1, (byte) 2, (byte) 255)} returns the string {@code
 "1:2:255"}.
@param separator the text that should appear between consecutive values in the resulting string
     (but not at the start or end)
@param array an array of {@code byte} values, possibly empty

### `lexicographicalComparator()`

**Returns:** [`java.util.Comparator<byte[]>`](../../../../java/util/Comparator.md)

Returns a comparator that compares two {@code byte} arrays <a href="http://en.wikipedia.org/wiki/Lexicographical_order">lexicographically</a>. That is, it
 compares, using {@link #compare(byte, byte)}), the first pair of values that follow any common
 prefix, or when one array is a prefix of the other, treats the shorter array as the lesser. For
 example, {@code [] < [0x01] < [0x01, 0x7F] < [0x01, 0x80] < [0x02]}. Values are treated as
 unsigned.

 <p>The returned comparator is inconsistent with {@link Object#equals(Object)} (since arrays
 support only identity equality), but it is consistent with {@link java.util.Arrays#equals(byte[], byte[])}.
@since 2.0

### `lexicographicalComparatorJavaImpl()`

**Returns:** [`java.util.Comparator<byte[]>`](../../../../java/util/Comparator.md)

### `flip(`byte` b)`

**Returns:** `byte`

### `sort(`byte[]` array)`

**Returns:** `void`

Sorts the array, treating its elements as unsigned bytes.
@since 23.1

### `sort(`byte[]` array, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Sorts the array between {@code fromIndex} inclusive and {@code toIndex} exclusive, treating its
 elements as unsigned bytes.
@since 23.1

### `sortDescending(`byte[]` array)`

**Returns:** `void`

Sorts the elements of {@code array} in descending order, interpreting them as unsigned 8-bit
 integers.
@since 23.1

### `sortDescending(`byte[]` array, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Sorts the elements of {@code array} between {@code fromIndex} inclusive and {@code toIndex}
 exclusive in descending order, interpreting them as unsigned 8-bit integers.
@since 23.1

