# Class: `UnsignedLongs`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.UnsignedLongs`

## Description

Static utility methods pertaining to {@code long} primitives that interpret values as
 <i>unsigned</i> (that is, any negative value {@code x} is treated as the positive value {@code
 2^64 + x}). The methods for which signedness is not an issue are in {@link Longs}, as well as
 signed versions of methods for which signedness is an issue.

 <p>In addition, this class provides several static methods for converting a {@code long} to a
 {@code String} and a {@code String} to a {@code long} that treat the {@code long} as an unsigned
 number.

 <p>Users of these utilities must be <i>extremely careful</i> not to mix up signed and unsigned
 {@code long} values. When possible, it is recommended that the {@link UnsignedLong} wrapper class
 be used, at a small efficiency penalty, to enforce the distinction in the type system.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/PrimitivesExplained#unsigned-support">unsigned
 primitive utilities</a>.
@author Louis Wasserman
@author Brian Milch
@author Colin Evans
@since 10.0

## Fields

### `MAX_VALUE`

**Type:** `long`

## Constructors

### `<init>()`

## Methods

### `flip(`long` a)`

**Returns:** `long`

A (self-inverse) bijection which converts the ordering on unsigned longs to the ordering on
 longs, that is, {@code a <= b} as unsigned longs if and only if {@code flip(a) <= flip(b)} as
 signed longs.

### `compare(`long` a, `long` b)`

**Returns:** `int`

Compares the two specified {@code long} values, treating them as unsigned values between {@code
 0} and {@code 2^64 - 1} inclusive.

 <p><b>Java 8 users:</b> use {@link Long#compareUnsigned(long, long)} instead.
@param a the first unsigned {@code long} to compare
@param b the second unsigned {@code long} to compare
@return a negative value if {@code a} is less than {@code b}; a positive value if {@code a} is
     greater than {@code b}; or zero if they are equal

### `min(`long[]` array)`

**Returns:** `long`

Returns the least value present in {@code array}, treating values as unsigned.
@param array a <i>nonempty</i> array of unsigned {@code long} values
@return the value present in {@code array} that is less than or equal to every other value in
     the array according to {@link #compare}
@throws IllegalArgumentException if {@code array} is empty

### `max(`long[]` array)`

**Returns:** `long`

Returns the greatest value present in {@code array}, treating values as unsigned.
@param array a <i>nonempty</i> array of unsigned {@code long} values
@return the value present in {@code array} that is greater than or equal to every other value
     in the array according to {@link #compare}
@throws IllegalArgumentException if {@code array} is empty

### `join(`java.lang.String` separator, `long[]` array)`

**Returns:** `java.lang.String`

Returns a string containing the supplied unsigned {@code long} values separated by {@code
 separator}. For example, {@code join("-", 1, 2, 3)} returns the string {@code "1-2-3"}.
@param separator the text that should appear between consecutive values in the resulting string
     (but not at the start or end)
@param array an array of unsigned {@code long} values, possibly empty

### `lexicographicalComparator()`

**Returns:** [`java.util.Comparator<long[]>`](../../../../java/util/Comparator.md)

Returns a comparator that compares two arrays of unsigned {@code long} values <a href="http://en.wikipedia.org/wiki/Lexicographical_order">lexicographically</a>. That is, it
 compares, using {@link #compare(long, long)}), the first pair of values that follow any common
 prefix, or when one array is a prefix of the other, treats the shorter array as the lesser. For
 example, {@code [] < [1L] < [1L, 2L] < [2L] < [1L << 63]}.

 <p>The returned comparator is inconsistent with {@link Object#equals(Object)} (since arrays
 support only identity equality), but it is consistent with {@link Arrays#equals(long[],
 long[])}.

### `sort(`long[]` array)`

**Returns:** `void`

Sorts the array, treating its elements as unsigned 64-bit integers.
@since 23.1

### `sort(`long[]` array, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Sorts the array between {@code fromIndex} inclusive and {@code toIndex} exclusive, treating its
 elements as unsigned 64-bit integers.
@since 23.1

### `sortDescending(`long[]` array)`

**Returns:** `void`

Sorts the elements of {@code array} in descending order, interpreting them as unsigned 64-bit
 integers.
@since 23.1

### `sortDescending(`long[]` array, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Sorts the elements of {@code array} between {@code fromIndex} inclusive and {@code toIndex}
 exclusive in descending order, interpreting them as unsigned 64-bit integers.
@since 23.1

### `divide(`long` dividend, `long` divisor)`

**Returns:** `long`

Returns dividend / divisor, where the dividend and divisor are treated as unsigned 64-bit
 quantities.

 <p><b>Java 8 users:</b> use {@link Long#divideUnsigned(long, long)} instead.
@param dividend the dividend (numerator)
@param divisor the divisor (denominator)
@throws ArithmeticException if divisor is 0

### `remainder(`long` dividend, `long` divisor)`

**Returns:** `long`

Returns dividend % divisor, where the dividend and divisor are treated as unsigned 64-bit
 quantities.

 <p><b>Java 8 users:</b> use {@link Long#remainderUnsigned(long, long)} instead.
@param dividend the dividend (numerator)
@param divisor the divisor (denominator)
@throws ArithmeticException if divisor is 0
@since 11.0

### `parseUnsignedLong(`java.lang.String` string)`

**Returns:** `long`

Returns the unsigned {@code long} value represented by the given decimal string.

 <p><b>Java 8 users:</b> use {@link Long#parseUnsignedLong(String)} instead.
@throws NumberFormatException if the string does not contain a valid unsigned {@code long}
     value
@throws NullPointerException if {@code string} is null (in contrast to {@link Long#parseLong(String)})

### `parseUnsignedLong(`java.lang.String` string, `int` radix)`

**Returns:** `long`

Returns the unsigned {@code long} value represented by a string with the given radix.

 <p><b>Java 8 users:</b> use {@link Long#parseUnsignedLong(String, int)} instead.
@param string the string containing the unsigned {@code long} representation to be parsed.
@param radix the radix to use while parsing {@code string}
@throws NumberFormatException if the string does not contain a valid unsigned {@code long} with
     the given radix, or if {@code radix} is not between {@link Character#MIN_RADIX} and {@link Character#MAX_RADIX}.
@throws NullPointerException if {@code string} is null (in contrast to {@link Long#parseLong(String)})

### `decode(`java.lang.String` stringValue)`

**Returns:** `long`

Returns the unsigned {@code long} value represented by the given string.

 <p>Accepts a decimal, hexadecimal, or octal number given by specifying the following prefix:

 <ul>
   <li>{@code 0x}<i>HexDigits</i>
   <li>{@code 0X}<i>HexDigits</i>
   <li>{@code #}<i>HexDigits</i>
   <li>{@code 0}<i>OctalDigits</i>
 </ul>
@throws NumberFormatException if the string does not contain a valid unsigned {@code long}
     value
@since 13.0

### `toString(`long` x)`

**Returns:** `java.lang.String`

Returns a string representation of x, where x is treated as unsigned.

 <p><b>Java 8 users:</b> use {@link Long#toUnsignedString(long)} instead.

### `toString(`long` x, `int` radix)`

**Returns:** `java.lang.String`

Returns a string representation of {@code x} for the given radix, where {@code x} is treated as
 unsigned.

 <p><b>Java 8 users:</b> use {@link Long#toUnsignedString(long, int)} instead.
@param x the value to convert to a string.
@param radix the radix to use while working with {@code x}
@throws IllegalArgumentException if {@code radix} is not between {@link Character#MIN_RADIX}
     and {@link Character#MAX_RADIX}.

