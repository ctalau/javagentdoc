# Class: `SignedBytes`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.SignedBytes`

## Description

Static utility methods pertaining to {@code byte} primitives that interpret values as signed. The
 corresponding methods that treat the values as unsigned are found in {@link UnsignedBytes}, and
 the methods for which signedness is not an issue are in {@link Bytes}.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/PrimitivesExplained">primitive utilities</a>.
@author Kevin Bourrillion
@since 1.0

## Fields

### `MAX_POWER_OF_TWO`

**Type:** `byte`

The largest power of two that can be represented as a signed {@code byte}.
@since 10.0

## Constructors

### `<init>()`

## Methods

### `checkedCast(`long` value)`

**Returns:** `byte`

Returns the {@code byte} value that is equal to {@code value}, if possible.
@param value any value in the range of the {@code byte} type
@return the {@code byte} value that equals {@code value}
@throws IllegalArgumentException if {@code value} is greater than {@link Byte#MAX_VALUE} or
     less than {@link Byte#MIN_VALUE}

### `saturatedCast(`long` value)`

**Returns:** `byte`

Returns the {@code byte} nearest in value to {@code value}.
@param value any {@code long} value
@return the same value cast to {@code byte} if it is in the range of the {@code byte} type,
     {@link Byte#MAX_VALUE} if it is too large, or {@link Byte#MIN_VALUE} if it is too small

### `compare(`byte` a, `byte` b)`

**Returns:** `int`

Compares the two specified {@code byte} values. The sign of the value returned is the same as
 that of {@code ((Byte) a).compareTo(b)}.

 <p><b>Note:</b> this method behaves identically to the JDK 7 method {@link Byte#compare}.
@param a the first {@code byte} to compare
@param b the second {@code byte} to compare
@return a negative value if {@code a} is less than {@code b}; a positive value if {@code a} is
     greater than {@code b}; or zero if they are equal

### `min(`byte[]` array)`

**Returns:** `byte`

Returns the least value present in {@code array}.
@param array a <i>nonempty</i> array of {@code byte} values
@return the value present in {@code array} that is less than or equal to every other value in
     the array
@throws IllegalArgumentException if {@code array} is empty

### `max(`byte[]` array)`

**Returns:** `byte`

Returns the greatest value present in {@code array}.
@param array a <i>nonempty</i> array of {@code byte} values
@return the value present in {@code array} that is greater than or equal to every other value
     in the array
@throws IllegalArgumentException if {@code array} is empty

### `join(`java.lang.String` separator, `byte[]` array)`

**Returns:** `java.lang.String`

Returns a string containing the supplied {@code byte} values separated by {@code separator}.
 For example, {@code join(":", 0x01, 0x02, -0x01)} returns the string {@code "1:2:-1"}.
@param separator the text that should appear between consecutive values in the resulting string
     (but not at the start or end)
@param array an array of {@code byte} values, possibly empty

### `lexicographicalComparator()`

**Returns:** [`java.util.Comparator<byte[]>`](../../../../java/util/Comparator.md)

Returns a comparator that compares two {@code byte} arrays <a href="http://en.wikipedia.org/wiki/Lexicographical_order">lexicographically</a>. That is, it
 compares, using {@link #compare(byte, byte)}), the first pair of values that follow any common
 prefix, or when one array is a prefix of the other, treats the shorter array as the lesser. For
 example, {@code [] < [0x01] < [0x01, 0x80] < [0x01, 0x7F] < [0x02]}. Values are treated as
 signed.

 <p>The returned comparator is inconsistent with {@link Object#equals(Object)} (since arrays
 support only identity equality), but it is consistent with {@link java.util.Arrays#equals(byte[], byte[])}.
@since 2.0

### `sortDescending(`byte[]` array)`

**Returns:** `void`

Sorts the elements of {@code array} in descending order.
@since 23.1

### `sortDescending(`byte[]` array, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Sorts the elements of {@code array} between {@code fromIndex} inclusive and {@code toIndex}
 exclusive in descending order.
@since 23.1

