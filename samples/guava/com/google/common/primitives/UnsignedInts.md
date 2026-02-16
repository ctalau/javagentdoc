# Class: `UnsignedInts`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.UnsignedInts`

## Description

Static utility methods pertaining to {@code int} primitives that interpret values as
 <i>unsigned</i> (that is, any negative value {@code x} is treated as the positive value {@code
 2^32 + x}). The methods for which signedness is not an issue are in {@link Ints}, as well as
 signed versions of methods for which signedness is an issue.

 <p>In addition, this class provides several static methods for converting an {@code int} to a
 {@code String} and a {@code String} to an {@code int} that treat the {@code int} as an unsigned
 number.

 <p>Users of these utilities must be <i>extremely careful</i> not to mix up signed and unsigned
 {@code int} values. When possible, it is recommended that the {@link UnsignedInteger} wrapper
 class be used, at a small efficiency penalty, to enforce the distinction in the type system.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/PrimitivesExplained#unsigned-support">unsigned
 primitive utilities</a>.
@author Louis Wasserman
@since 11.0

## Fields

### `INT_MASK`

**Type:** `long`

## Constructors

### `<init>()`

## Methods

### `flip(`int` value)`

**Returns:** `int`

### `compare(`int` a, `int` b)`

**Returns:** `int`

Compares the two specified {@code int} values, treating them as unsigned values between {@code
 0} and {@code 2^32 - 1} inclusive.

 <p><b>Java 8 users:</b> use {@link Integer#compareUnsigned(int, int)} instead.
@param a the first unsigned {@code int} to compare
@param b the second unsigned {@code int} to compare
@return a negative value if {@code a} is less than {@code b}; a positive value if {@code a} is
     greater than {@code b}; or zero if they are equal

### `toLong(`int` value)`

**Returns:** `long`

Returns the value of the given {@code int} as a {@code long}, when treated as unsigned.

 <p><b>Java 8 users:</b> use {@link Integer#toUnsignedLong(int)} instead.

### `checkedCast(`long` value)`

**Returns:** `int`

Returns the {@code int} value that, when treated as unsigned, is equal to {@code value}, if
 possible.
@param value a value between 0 and 2<sup>32</sup>-1 inclusive
@return the {@code int} value that, when treated as unsigned, equals {@code value}
@throws IllegalArgumentException if {@code value} is negative or greater than or equal to
     2<sup>32</sup>
@since 21.0

### `saturatedCast(`long` value)`

**Returns:** `int`

Returns the {@code int} value that, when treated as unsigned, is nearest in value to {@code
 value}.
@param value any {@code long} value
@return {@code 2^32 - 1} if {@code value >= 2^32}, {@code 0} if {@code value <= 0}, and {@code
     value} cast to {@code int} otherwise
@since 21.0

### `min(`int[]` array)`

**Returns:** `int`

Returns the least value present in {@code array}, treating values as unsigned.
@param array a <i>nonempty</i> array of unsigned {@code int} values
@return the value present in {@code array} that is less than or equal to every other value in
     the array according to {@link #compare}
@throws IllegalArgumentException if {@code array} is empty

### `max(`int[]` array)`

**Returns:** `int`

Returns the greatest value present in {@code array}, treating values as unsigned.
@param array a <i>nonempty</i> array of unsigned {@code int} values
@return the value present in {@code array} that is greater than or equal to every other value
     in the array according to {@link #compare}
@throws IllegalArgumentException if {@code array} is empty

### `join(`java.lang.String` separator, `int[]` array)`

**Returns:** `java.lang.String`

Returns a string containing the supplied unsigned {@code int} values separated by {@code
 separator}. For example, {@code join("-", 1, 2, 3)} returns the string {@code "1-2-3"}.
@param separator the text that should appear between consecutive values in the resulting string
     (but not at the start or end)
@param array an array of unsigned {@code int} values, possibly empty

### `lexicographicalComparator()`

**Returns:** [`java.util.Comparator<int[]>`](../../../../java/util/Comparator.md)

Returns a comparator that compares two arrays of unsigned {@code int} values <a href="http://en.wikipedia.org/wiki/Lexicographical_order">lexicographically</a>. That is, it
 compares, using {@link #compare(int, int)}), the first pair of values that follow any common
 prefix, or when one array is a prefix of the other, treats the shorter array as the lesser. For
 example, {@code [] < [1] < [1, 2] < [2] < [1 << 31]}.

 <p>The returned comparator is inconsistent with {@link Object#equals(Object)} (since arrays
 support only identity equality), but it is consistent with {@link Arrays#equals(int[], int[])}.

### `sort(`int[]` array)`

**Returns:** `void`

Sorts the array, treating its elements as unsigned 32-bit integers.
@since 23.1

### `sort(`int[]` array, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Sorts the array between {@code fromIndex} inclusive and {@code toIndex} exclusive, treating its
 elements as unsigned 32-bit integers.
@since 23.1

### `sortDescending(`int[]` array)`

**Returns:** `void`

Sorts the elements of {@code array} in descending order, interpreting them as unsigned 32-bit
 integers.
@since 23.1

### `sortDescending(`int[]` array, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Sorts the elements of {@code array} between {@code fromIndex} inclusive and {@code toIndex}
 exclusive in descending order, interpreting them as unsigned 32-bit integers.
@since 23.1

### `divide(`int` dividend, `int` divisor)`

**Returns:** `int`

Returns dividend / divisor, where the dividend and divisor are treated as unsigned 32-bit
 quantities.

 <p><b>Java 8 users:</b> use {@link Integer#divideUnsigned(int, int)} instead.
@param dividend the dividend (numerator)
@param divisor the divisor (denominator)
@throws ArithmeticException if divisor is 0

### `remainder(`int` dividend, `int` divisor)`

**Returns:** `int`

Returns dividend % divisor, where the dividend and divisor are treated as unsigned 32-bit
 quantities.

 <p><b>Java 8 users:</b> use {@link Integer#remainderUnsigned(int, int)} instead.
@param dividend the dividend (numerator)
@param divisor the divisor (denominator)
@throws ArithmeticException if divisor is 0

### `decode(`java.lang.String` stringValue)`

**Returns:** `int`

Returns the unsigned {@code int} value represented by the given string.

 <p>Accepts a decimal, hexadecimal, or octal number given by specifying the following prefix:

 <ul>
   <li>{@code 0x}<i>HexDigits</i>
   <li>{@code 0X}<i>HexDigits</i>
   <li>{@code #}<i>HexDigits</i>
   <li>{@code 0}<i>OctalDigits</i>
 </ul>
@throws NumberFormatException if the string does not contain a valid unsigned {@code int} value
@since 13.0

### `parseUnsignedInt(`java.lang.String` s)`

**Returns:** `int`

Returns the unsigned {@code int} value represented by the given decimal string.

 <p><b>Java 8 users:</b> use {@link Integer#parseUnsignedInt(String)} instead.
@throws NumberFormatException if the string does not contain a valid unsigned {@code int} value
@throws NullPointerException if {@code s} is null (in contrast to {@link Integer#parseInt(String)})

### `parseUnsignedInt(`java.lang.String` string, `int` radix)`

**Returns:** `int`

Returns the unsigned {@code int} value represented by a string with the given radix.

 <p><b>Java 8 users:</b> use {@link Integer#parseUnsignedInt(String, int)} instead.
@param string the string containing the unsigned integer representation to be parsed.
@param radix the radix to use while parsing {@code s}; must be between {@link Character#MIN_RADIX} and {@link Character#MAX_RADIX}.
@throws NumberFormatException if the string does not contain a valid unsigned {@code int}, or
     if supplied radix is invalid.
@throws NullPointerException if {@code s} is null (in contrast to {@link Integer#parseInt(String)})

### `toString(`int` x)`

**Returns:** `java.lang.String`

Returns a string representation of x, where x is treated as unsigned.

 <p><b>Java 8 users:</b> use {@link Integer#toUnsignedString(int)} instead.

### `toString(`int` x, `int` radix)`

**Returns:** `java.lang.String`

Returns a string representation of {@code x} for the given radix, where {@code x} is treated as
 unsigned.

 <p><b>Java 8 users:</b> use {@link Integer#toUnsignedString(int, int)} instead.
@param x the value to convert to a string.
@param radix the radix to use while working with {@code x}
@throws IllegalArgumentException if {@code radix} is not between {@link Character#MIN_RADIX}
     and {@link Character#MAX_RADIX}.

