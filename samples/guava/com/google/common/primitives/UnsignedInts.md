# Class: `UnsignedInts`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.UnsignedInts`

## Description

The methods for which signedness is not an issue are in Ints, as well as
 signed versions of methods for which signedness is an issue.

 
In addition, this class provides several static methods for converting an int to a
 String and a String to an int that treat the int as an unsigned
 number.

 
Users of these utilities must be *extremely careful* not to mix up signed and unsigned
 int values. When possible, it is recommended that the UnsignedInteger wrapper
 class be used, at a small efficiency penalty, to enforce the distinction in the type system.

 
See the Guava User Guide article on [unsigned
 primitive utilities](https://github.com/google/guava/wiki/PrimitivesExplained#unsigned-support).

## Fields

### `INT_MASK`

**Type:** `long`

## Constructors

### `<init>()`

## Methods

### `flip(int value)`

**Parameters:**
- `value` (`int`)

**Returns:** `int`

### `compare(int a, int b)`

**Java 8 users:** use Integer#compareUnsigned(int, int) instead.

**Parameters:**
- `a` (`int`): the first unsigned int to compare
- `b` (`int`): the second unsigned int to compare

**Returns:** `int`

### `toLong(int value)`

**Java 8 users:** use Integer#toUnsignedLong(int) instead.

**Parameters:**
- `value` (`int`)

**Returns:** `long`

### `checkedCast(long value)`

**Parameters:**
- `value` (`long`): a value between 0 and 232-1 inclusive

**Returns:** `int`

### `saturatedCast(long value)`

**Parameters:**
- `value` (`long`): any long value

**Returns:** `int`

### `min(int[] array)`

**Parameters:**
- `array` (`int[]`): a *nonempty* array of unsigned int values

**Returns:** `int`

### `max(int[] array)`

**Parameters:**
- `array` (`int[]`): a *nonempty* array of unsigned int values

**Returns:** `int`

### `join(String separator, int[] array)`

For example, join("-", 1, 2, 3) returns the string "1-2-3".

**Parameters:**
- `separator` (`java.lang.String`): the text that should appear between consecutive values in the resulting string
       (but not at the start or end)
- `array` (`int[]`): an array of unsigned int values, possibly empty

**Returns:** `java.lang.String`

### `lexicographicalComparator()`

That is, it
 compares, using #compare(int, int)), the first pair of values that follow any common
 prefix, or when one array is a prefix of the other, treats the shorter array as the lesser. For
 example, [] < [1] < [1, 2] < [2] < [1 << 31].

 
The returned comparator is inconsistent with Object#equals(Object) (since arrays
 support only identity equality), but it is consistent with Arrays#equals(int[], int[]).

**Returns:** `java.util.Comparator<int[]>`

### `sort(int[] array)`

**Parameters:**
- `array` (`int[]`)

**Returns:** `void`

### `sort(int[] array, int fromIndex, int toIndex)`

**Parameters:**
- `array` (`int[]`)
- `fromIndex` (`int`)
- `toIndex` (`int`)

**Returns:** `void`

### `sortDescending(int[] array)`

**Parameters:**
- `array` (`int[]`)

**Returns:** `void`

### `sortDescending(int[] array, int fromIndex, int toIndex)`

**Parameters:**
- `array` (`int[]`)
- `fromIndex` (`int`)
- `toIndex` (`int`)

**Returns:** `void`

### `divide(int dividend, int divisor)`

**Java 8 users:** use Integer#divideUnsigned(int, int) instead.

**Parameters:**
- `dividend` (`int`): the dividend (numerator)
- `divisor` (`int`): the divisor (denominator)

**Returns:** `int`

### `remainder(int dividend, int divisor)`

**Java 8 users:** use Integer#remainderUnsigned(int, int) instead.

**Parameters:**
- `dividend` (`int`): the dividend (numerator)
- `divisor` (`int`): the divisor (denominator)

**Returns:** `int`

### `decode(String stringValue)`

Accepts a decimal, hexadecimal, or octal number given by specifying the following prefix:

 

   - 0x*HexDigits*
   - 0X*HexDigits*
   - #*HexDigits*
   - 0*OctalDigits*

**Parameters:**
- `stringValue` (`java.lang.String`)

**Returns:** `int`

### `parseUnsignedInt(String s)`

**Java 8 users:** use Integer#parseUnsignedInt(String) instead.

**Parameters:**
- `s` (`java.lang.String`)

**Returns:** `int`

### `parseUnsignedInt(String string, int radix)`

**Java 8 users:** use Integer#parseUnsignedInt(String, int) instead.

**Parameters:**
- `string` (`java.lang.String`): the string containing the unsigned integer representation to be parsed.
- `radix` (`int`): the radix to use while parsing s; must be between Character#MIN_RADIX and Character#MAX_RADIX.

**Returns:** `int`

### `toString(int x)`

**Java 8 users:** use Integer#toUnsignedString(int) instead.

**Parameters:**
- `x` (`int`)

**Returns:** `java.lang.String`

### `toString(int x, int radix)`

**Java 8 users:** use Integer#toUnsignedString(int, int) instead.

**Parameters:**
- `x` (`int`): the value to convert to a string.
- `radix` (`int`): the radix to use while working with x

**Returns:** `java.lang.String`

