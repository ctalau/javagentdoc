# Class: `UnsignedLongs`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.UnsignedLongs`

## Description

The methods for which signedness is not an issue are in Longs, as well as
 signed versions of methods for which signedness is an issue.

 
In addition, this class provides several static methods for converting a long to a
 String and a String to a long that treat the long as an unsigned
 number.

 
Users of these utilities must be *extremely careful* not to mix up signed and unsigned
 long values. When possible, it is recommended that the UnsignedLong wrapper class
 be used, at a small efficiency penalty, to enforce the distinction in the type system.

 
See the Guava User Guide article on [unsigned
 primitive utilities](https://github.com/google/guava/wiki/PrimitivesExplained#unsigned-support).

## Fields

### `MAX_VALUE`

**Type:** `long`

## Constructors

### `<init>()`

## Methods

### `flip(long a)`

**Returns:** `long`

**Parameters:**
- `a` (`long`)

### `compare(long a, long b)`

**Returns:** `int`

**Java 8 users:** use Long#compareUnsigned(long, long) instead.

**Parameters:**
- `a` (`long`): the first unsigned long to compare
- `b` (`long`): the second unsigned long to compare

### `min(long[] array)`

**Returns:** `long`

**Parameters:**
- `array` (`long[]`): a *nonempty* array of unsigned long values

### `max(long[] array)`

**Returns:** `long`

**Parameters:**
- `array` (`long[]`): a *nonempty* array of unsigned long values

### `join(java.lang.String separator, long[] array)`

**Returns:** `java.lang.String`

For example, join("-", 1, 2, 3) returns the string "1-2-3".

**Parameters:**
- `separator` (`java.lang.String`): the text that should appear between consecutive values in the resulting string
     (but not at the start or end)
- `array` (`long[]`): an array of unsigned long values, possibly empty

### `lexicographicalComparator()`

**Returns:** `java.util.Comparator<long[]>`

That is, it
 compares, using #compare(long, long)), the first pair of values that follow any common
 prefix, or when one array is a prefix of the other, treats the shorter array as the lesser. For
 example, [] < [1L] < [1L, 2L] < [2L] < [1L << 63].

 
The returned comparator is inconsistent with Object#equals(Object) (since arrays
 support only identity equality), but it is consistent with Arrays#equals(long[],
 long[]).

### `sort(long[] array)`

**Returns:** `void`

**Parameters:**
- `array` (`long[]`)

### `sort(long[] array, int fromIndex, int toIndex)`

**Returns:** `void`

**Parameters:**
- `array` (`long[]`)
- `fromIndex` (`int`)
- `toIndex` (`int`)

### `sortDescending(long[] array)`

**Returns:** `void`

**Parameters:**
- `array` (`long[]`)

### `sortDescending(long[] array, int fromIndex, int toIndex)`

**Returns:** `void`

**Parameters:**
- `array` (`long[]`)
- `fromIndex` (`int`)
- `toIndex` (`int`)

### `divide(long dividend, long divisor)`

**Returns:** `long`

**Java 8 users:** use Long#divideUnsigned(long, long) instead.

**Parameters:**
- `dividend` (`long`): the dividend (numerator)
- `divisor` (`long`): the divisor (denominator)

### `remainder(long dividend, long divisor)`

**Returns:** `long`

**Java 8 users:** use Long#remainderUnsigned(long, long) instead.

**Parameters:**
- `dividend` (`long`): the dividend (numerator)
- `divisor` (`long`): the divisor (denominator)

### `parseUnsignedLong(java.lang.String string)`

**Returns:** `long`

**Java 8 users:** use Long#parseUnsignedLong(String) instead.

**Parameters:**
- `string` (`java.lang.String`)

### `parseUnsignedLong(java.lang.String string, int radix)`

**Returns:** `long`

**Java 8 users:** use Long#parseUnsignedLong(String, int) instead.

**Parameters:**
- `string` (`java.lang.String`): the string containing the unsigned long representation to be parsed.
- `radix` (`int`): the radix to use while parsing string

### `decode(java.lang.String stringValue)`

**Returns:** `long`

Accepts a decimal, hexadecimal, or octal number given by specifying the following prefix:

 

   - 0x*HexDigits*
   - 0X*HexDigits*
   - #*HexDigits*
   - 0*OctalDigits*

**Parameters:**
- `stringValue` (`java.lang.String`)

### `toString(long x)`

**Returns:** `java.lang.String`

**Java 8 users:** use Long#toUnsignedString(long) instead.

**Parameters:**
- `x` (`long`)

### `toString(long x, int radix)`

**Returns:** `java.lang.String`

**Java 8 users:** use Long#toUnsignedString(long, int) instead.

**Parameters:**
- `x` (`long`): the value to convert to a string.
- `radix` (`int`): the radix to use while working with x

