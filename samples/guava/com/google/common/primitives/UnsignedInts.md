# Class: `UnsignedInts`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.UnsignedInts`

## Description

Static utility methods pertaining to `int` primitives that interpret values as
 <i>unsigned</i> (that is, any negative value `x` is treated as the positive value `2^32 + x`). The methods for which signedness is not an issue are in `Ints`, as well as
 signed versions of methods for which signedness is an issue.

 <p>In addition, this class provides several static methods for converting an `int` to a
 `String` and a `String` to an `int` that treat the `int` as an unsigned
 number.

 <p>Users of these utilities must be <i>extremely careful</i> not to mix up signed and unsigned
 `int` values. When possible, it is recommended that the `UnsignedInteger` wrapper
 class be used, at a small efficiency penalty, to enforce the distinction in the type system.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/PrimitivesExplained#unsigned-support">unsigned
 primitive utilities</a>.
**Author:** Louis Wasserman
**Since:** 11.0

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

Compares the two specified `int` values, treating them as unsigned values between `0` and `2^32 - 1` inclusive.

 <p><b>Java 8 users:</b> use `Integer.compareUnsigned(int, int)` instead.
@param a the first unsigned `int` to compare
@param b the second unsigned `int` to compare
@return a negative value if `a` is less than `b`; a positive value if `a` is
     greater than `b`; or zero if they are equal

### `toLong(`int` value)`

**Returns:** `long`

Returns the value of the given `int` as a `long`, when treated as unsigned.

 <p><b>Java 8 users:</b> use `Integer.toUnsignedLong(int)` instead.

### `checkedCast(`long` value)`

**Returns:** `int`

Returns the `int` value that, when treated as unsigned, is equal to `value`, if
 possible.
@param value a value between 0 and 2<sup>32</sup>-1 inclusive
@return the `int` value that, when treated as unsigned, equals `value`
@throws IllegalArgumentException if `value` is negative or greater than or equal to
     2<sup>32</sup>
**Since:** 21.0

### `saturatedCast(`long` value)`

**Returns:** `int`

Returns the `int` value that, when treated as unsigned, is nearest in value to `value`.
@param value any `long` value
@return `2^32 - 1` if `value >= 2^32`, `0` if `value <= 0`, and `value` cast to `int` otherwise
**Since:** 21.0

### `min(`int[]` array)`

**Returns:** `int`

Returns the least value present in `array`, treating values as unsigned.
@param array a <i>nonempty</i> array of unsigned `int` values
@return the value present in `array` that is less than or equal to every other value in
     the array according to `compare`
@throws IllegalArgumentException if `array` is empty

### `max(`int[]` array)`

**Returns:** `int`

Returns the greatest value present in `array`, treating values as unsigned.
@param array a <i>nonempty</i> array of unsigned `int` values
@return the value present in `array` that is greater than or equal to every other value
     in the array according to `compare`
@throws IllegalArgumentException if `array` is empty

### `join(`java.lang.String` separator, `int[]` array)`

**Returns:** `java.lang.String`

Returns a string containing the supplied unsigned `int` values separated by `separator`. For example, `join("-", 1, 2, 3)` returns the string `"1-2-3"`.
@param separator the text that should appear between consecutive values in the resulting string
     (but not at the start or end)
@param array an array of unsigned `int` values, possibly empty

### `lexicographicalComparator()`

**Returns:** `java.util.Comparator<int[]>`

Returns a comparator that compares two arrays of unsigned `int` values <a href="http://en.wikipedia.org/wiki/Lexicographical_order">lexicographically</a>. That is, it
 compares, using `compare(int, int)`), the first pair of values that follow any common
 prefix, or when one array is a prefix of the other, treats the shorter array as the lesser. For
 example, `[] < [1] < [1, 2] < [2] < [1 << 31]`.

 <p>The returned comparator is inconsistent with `Object.equals(Object)` (since arrays
 support only identity equality), but it is consistent with `Arrays.equals(int[], int[])`.

### `sort(`int[]` array)`

**Returns:** `void`

Sorts the array, treating its elements as unsigned 32-bit integers.
**Since:** 23.1

### `sort(`int[]` array, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Sorts the array between `fromIndex` inclusive and `toIndex` exclusive, treating its
 elements as unsigned 32-bit integers.
**Since:** 23.1

### `sortDescending(`int[]` array)`

**Returns:** `void`

Sorts the elements of `array` in descending order, interpreting them as unsigned 32-bit
 integers.
**Since:** 23.1

### `sortDescending(`int[]` array, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Sorts the elements of `array` between `fromIndex` inclusive and `toIndex`
 exclusive in descending order, interpreting them as unsigned 32-bit integers.
**Since:** 23.1

### `divide(`int` dividend, `int` divisor)`

**Returns:** `int`

Returns dividend / divisor, where the dividend and divisor are treated as unsigned 32-bit
 quantities.

 <p><b>Java 8 users:</b> use `Integer.divideUnsigned(int, int)` instead.
@param dividend the dividend (numerator)
@param divisor the divisor (denominator)
@throws ArithmeticException if divisor is 0

### `remainder(`int` dividend, `int` divisor)`

**Returns:** `int`

Returns dividend % divisor, where the dividend and divisor are treated as unsigned 32-bit
 quantities.

 <p><b>Java 8 users:</b> use `Integer.remainderUnsigned(int, int)` instead.
@param dividend the dividend (numerator)
@param divisor the divisor (denominator)
@throws ArithmeticException if divisor is 0

### `decode(`java.lang.String` stringValue)`

**Returns:** `int`

Returns the unsigned `int` value represented by the given string.

 <p>Accepts a decimal, hexadecimal, or octal number given by specifying the following prefix:

 <ul>
   <li>`0x`<i>HexDigits</i>
   <li>`0X`<i>HexDigits</i>
   <li>`#`<i>HexDigits</i>
   <li>`0`<i>OctalDigits</i>
 </ul>
@throws NumberFormatException if the string does not contain a valid unsigned `int` value
**Since:** 13.0

### `parseUnsignedInt(`java.lang.String` s)`

**Returns:** `int`

Returns the unsigned `int` value represented by the given decimal string.

 <p><b>Java 8 users:</b> use `Integer.parseUnsignedInt(String)` instead.
@throws NumberFormatException if the string does not contain a valid unsigned `int` value
@throws NullPointerException if `s` is null (in contrast to `Integer.parseInt(String)`)

### `parseUnsignedInt(`java.lang.String` string, `int` radix)`

**Returns:** `int`

Returns the unsigned `int` value represented by a string with the given radix.

 <p><b>Java 8 users:</b> use `Integer.parseUnsignedInt(String, int)` instead.
@param string the string containing the unsigned integer representation to be parsed.
@param radix the radix to use while parsing `s`; must be between `Character.MIN_RADIX` and `Character.MAX_RADIX`.
@throws NumberFormatException if the string does not contain a valid unsigned `int`, or
     if supplied radix is invalid.
@throws NullPointerException if `s` is null (in contrast to `Integer.parseInt(String)`)

### `toString(`int` x)`

**Returns:** `java.lang.String`

Returns a string representation of x, where x is treated as unsigned.

 <p><b>Java 8 users:</b> use `Integer.toUnsignedString(int)` instead.

### `toString(`int` x, `int` radix)`

**Returns:** `java.lang.String`

Returns a string representation of `x` for the given radix, where `x` is treated as
 unsigned.

 <p><b>Java 8 users:</b> use `Integer.toUnsignedString(int, int)` instead.
@param x the value to convert to a string.
@param radix the radix to use while working with `x`
@throws IllegalArgumentException if `radix` is not between `Character.MIN_RADIX`
     and `Character.MAX_RADIX`.

