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

**Returns:** `int`

**Parameters:**
- `value` (`int`)

### `compare(int a, int b)`

**Returns:** `int`

**Java 8 users:** use Integer#compareUnsigned(int, int) instead.

**Parameters:**
- `a` (`int`): the first unsigned int to compare
- `b` (`int`): the second unsigned int to compare

### `toLong(int value)`

**Returns:** `long`

**Java 8 users:** use Integer#toUnsignedLong(int) instead.

**Parameters:**
- `value` (`int`)

### `checkedCast(long value)`

**Returns:** `int`

**Parameters:**
- `value` (`long`): a value between 0 and 232-1 inclusive

### `saturatedCast(long value)`

**Returns:** `int`

**Parameters:**
- `value` (`long`): any long value

### `min(int[] array)`

**Returns:** `int`

**Parameters:**
- `array` (`int[]`): a *nonempty* array of unsigned int values

### `max(int[] array)`

**Returns:** `int`

**Parameters:**
- `array` (`int[]`): a *nonempty* array of unsigned int values

### `join(java.lang.String separator, int[] array)`

**Returns:** `java.lang.String`

For example, join("-", 1, 2, 3) returns the string "1-2-3".

**Parameters:**
- `separator` (`java.lang.String`): the text that should appear between consecutive values in the resulting string
     (but not at the start or end)
- `array` (`int[]`): an array of unsigned int values, possibly empty

### `lexicographicalComparator()`

**Returns:** `java.util.Comparator<int[]>`

That is, it
 compares, using #compare(int, int)), the first pair of values that follow any common
 prefix, or when one array is a prefix of the other, treats the shorter array as the lesser. For
 example, [] < [1] < [1, 2] < [2] < [1 << 31].

 
The returned comparator is inconsistent with Object#equals(Object) (since arrays
 support only identity equality), but it is consistent with Arrays#equals(int[], int[]).

### `sort(int[] array)`

**Returns:** `void`

**Parameters:**
- `array` (`int[]`)

### `sort(int[] array, int fromIndex, int toIndex)`

**Returns:** `void`

**Parameters:**
- `array` (`int[]`)
- `fromIndex` (`int`)
- `toIndex` (`int`)

### `sortDescending(int[] array)`

**Returns:** `void`

**Parameters:**
- `array` (`int[]`)

### `sortDescending(int[] array, int fromIndex, int toIndex)`

**Returns:** `void`

**Parameters:**
- `array` (`int[]`)
- `fromIndex` (`int`)
- `toIndex` (`int`)

### `divide(int dividend, int divisor)`

**Returns:** `int`

**Java 8 users:** use Integer#divideUnsigned(int, int) instead.

**Parameters:**
- `dividend` (`int`): the dividend (numerator)
- `divisor` (`int`): the divisor (denominator)

### `remainder(int dividend, int divisor)`

**Returns:** `int`

**Java 8 users:** use Integer#remainderUnsigned(int, int) instead.

**Parameters:**
- `dividend` (`int`): the dividend (numerator)
- `divisor` (`int`): the divisor (denominator)

### `decode(java.lang.String stringValue)`

**Returns:** `int`

Accepts a decimal, hexadecimal, or octal number given by specifying the following prefix:

 

   - 0x*HexDigits*
   - 0X*HexDigits*
   - #*HexDigits*
   - 0*OctalDigits*

**Parameters:**
- `stringValue` (`java.lang.String`)

### `parseUnsignedInt(java.lang.String s)`

**Returns:** `int`

**Java 8 users:** use Integer#parseUnsignedInt(String) instead.

**Parameters:**
- `s` (`java.lang.String`)

### `parseUnsignedInt(java.lang.String string, int radix)`

**Returns:** `int`

**Java 8 users:** use Integer#parseUnsignedInt(String, int) instead.

**Parameters:**
- `string` (`java.lang.String`): the string containing the unsigned integer representation to be parsed.
- `radix` (`int`): the radix to use while parsing s; must be between Character#MIN_RADIX and Character#MAX_RADIX.

### `toString(int x)`

**Returns:** `java.lang.String`

**Java 8 users:** use Integer#toUnsignedString(int) instead.

**Parameters:**
- `x` (`int`)

### `toString(int x, int radix)`

**Returns:** `java.lang.String`

**Java 8 users:** use Integer#toUnsignedString(int, int) instead.

**Parameters:**
- `x` (`int`): the value to convert to a string.
- `radix` (`int`): the radix to use while working with x

