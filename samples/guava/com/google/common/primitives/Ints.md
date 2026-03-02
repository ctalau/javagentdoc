# Class: `Ints`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.Ints`

**Extends:** [`com.google.common.primitives.IntsMethodsForWeb`](./IntsMethodsForWeb.md)

## Description

See the Guava User Guide article on [primitive utilities](https://github.com/google/guava/wiki/PrimitivesExplained).

## Fields

### `BYTES`

**Type:** `int`

**Java 8 users:** use Integer#BYTES instead.

### `MAX_POWER_OF_TWO`

**Type:** `int`

## Constructors

### `<init>()`

## Methods

### `hashCode(int value)`

**Java 8 users:** use Integer#hashCode(int) instead.

**Parameters:**
- `value` (`int`): a primitive int value

**Returns:** `int`

### `checkedCast(long value)`

**Parameters:**
- `value` (`long`): any value in the range of the int type

**Returns:** `int`

### `saturatedCast(long value)`

**Parameters:**
- `value` (`long`): any long value

**Returns:** `int`

### `compare(int a, int b)`

The sign of the value returned is the same as
 that of ((Integer) a).compareTo(b).

 
**Note for Java 7 and later:** this method should be treated as deprecated; use the
 equivalent Integer#compare method instead.

**Parameters:**
- `a` (`int`): the first int to compare
- `b` (`int`): the second int to compare

**Returns:** `int`

### `contains(int[] array, int target)`

**Parameters:**
- `array` (`int[]`): an array of int values, possibly empty
- `target` (`int`): a primitive int value

**Returns:** `boolean`

### `indexOf(int[] array, int target)`

**Parameters:**
- `array` (`int[]`): an array of int values, possibly empty
- `target` (`int`): a primitive int value

**Returns:** `int`

### `indexOf(int[] array, int target, int start, int end)`

**Parameters:**
- `array` (`int[]`)
- `target` (`int`)
- `start` (`int`)
- `end` (`int`)

**Returns:** `int`

### `indexOf(int[] array, int[] target)`

More formally, returns the lowest index i such that Arrays.copyOfRange(array,
 i, i + target.length) contains exactly the same elements as target.

**Parameters:**
- `array` (`int[]`): the array to search for the sequence target
- `target` (`int[]`): the array to search for as a sub-sequence of array

**Returns:** `int`

### `lastIndexOf(int[] array, int target)`

**Parameters:**
- `array` (`int[]`): an array of int values, possibly empty
- `target` (`int`): a primitive int value

**Returns:** `int`

### `lastIndexOf(int[] array, int target, int start, int end)`

**Parameters:**
- `array` (`int[]`)
- `target` (`int`)
- `start` (`int`)
- `end` (`int`)

**Returns:** `int`

### `min(int[] array)`

**Parameters:**
- `array` (`int[]`): a *nonempty* array of int values

**Returns:** `int`

### `max(int[] array)`

**Parameters:**
- `array` (`int[]`): a *nonempty* array of int values

**Returns:** `int`

### `constrainToRange(int value, int min, int max)`

If value is within the range [min..max], value is returned
 unchanged. If value is less than min, min is returned, and if 
 value is greater than max, max is returned.

**Parameters:**
- `value` (`int`): the int value to constrain
- `min` (`int`): the lower bound (inclusive) of the range to constrain value to
- `max` (`int`): the upper bound (inclusive) of the range to constrain value to

**Returns:** `int`

### `concat(int[][] arrays)`

For example, 
 concat(new int[] {a, b}, new int[] {}, new int[] {c} returns the array {a, b, c}.

**Parameters:**
- `arrays` (`int[][]`): zero or more int arrays

**Returns:** `int[]`

### `toByteArray(int value)`

For example, the input value 
 0x12131415 would yield the byte array {0x12, 0x13, 0x14, 0x15}.

 
If you need to convert and concatenate several values (possibly even of different types),
 use a shared java.nio.ByteBuffer instance, or use com.google.common.io.ByteStreams#newDataOutput() to get a growable buffer.

**Parameters:**
- `value` (`int`)

**Returns:** `byte[]`

### `fromByteArray(byte[] bytes)`

For example, the input
 byte array {0x12, 0x13, 0x14, 0x15, 0x33} would yield the int value 
 0x12131415.

 
Arguably, it's preferable to use java.nio.ByteBuffer; that library exposes much more
 flexibility at little cost in readability.

**Parameters:**
- `bytes` (`byte[]`)

**Returns:** `int`

### `fromBytes(byte b1, byte b2, byte b3, byte b4)`

**Parameters:**
- `b1` (`byte`)
- `b2` (`byte`)
- `b3` (`byte`)
- `b4` (`byte`)

**Returns:** `int`

### `stringConverter()`

The returned converter throws NumberFormatException if the input string is invalid.

 
**Warning:** please see Integer#decode to understand exactly how strings are
 parsed. For example, the string "0123" is treated as *octal* and converted to the
 value 83.

**Returns:** [`com.google.common.base.Converter<java.lang.String,java.lang.Integer>`](../base/Converter.md)

### `ensureCapacity(int[] array, int minLength, int padding)`

If array already has a length of at least minLength,
 it is returned directly. Otherwise, a new array of size minLength + padding is
 returned, containing the values of array, and zeroes in the remaining places.

**Parameters:**
- `array` (`int[]`): the source array
- `minLength` (`int`): the minimum length the returned array must guarantee
- `padding` (`int`): an extra amount to "grow" the array by if growth is necessary

**Returns:** `int[]`

### `join(String separator, int[] array)`

For
 example, join("-", 1, 2, 3) returns the string "1-2-3".

**Parameters:**
- `separator` (`java.lang.String`): the text that should appear between consecutive values in the resulting string
       (but not at the start or end)
- `array` (`int[]`): an array of int values, possibly empty

**Returns:** `java.lang.String`

### `lexicographicalComparator()`

That is, it
 compares, using #compare(int, int)), the first pair of values that follow any common
 prefix, or when one array is a prefix of the other, treats the shorter array as the lesser. For
 example, [] < [1] < [1, 2] < [2].

 
The returned comparator is inconsistent with Object#equals(Object) (since arrays
 support only identity equality), but it is consistent with Arrays#equals(int[], int[]).

**Returns:** `java.util.Comparator<int[]>`

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

### `reverse(int[] array)`

This is equivalent to 
 Collections.reverse(Ints.asList(array)), but is likely to be more efficient.

**Parameters:**
- `array` (`int[]`)

**Returns:** `void`

### `reverse(int[] array, int fromIndex, int toIndex)`

This is equivalent to 
 Collections.reverse(Ints.asList(array).subList(fromIndex, toIndex)), but is likely to be more
 efficient.

**Parameters:**
- `array` (`int[]`)
- `fromIndex` (`int`)
- `toIndex` (`int`)

**Returns:** `void`

### `rotate(int[] array, int distance)`

This is equivalent to Collections.rotate(Ints.asList(array),
 distance), but is considerably faster and avoids allocation and garbage collection.

 
The provided "distance" may be negative, which will rotate left.

**Parameters:**
- `array` (`int[]`)
- `distance` (`int`)

**Returns:** `void`

### `rotate(int[] array, int distance, int fromIndex, int toIndex)`

This is equivalent to 
 Collections.rotate(Ints.asList(array).subList(fromIndex, toIndex), distance), but is
 considerably faster and avoids allocations and garbage collection.

 
The provided "distance" may be negative, which will rotate left.

**Parameters:**
- `array` (`int[]`)
- `distance` (`int`)
- `fromIndex` (`int`)
- `toIndex` (`int`)

**Returns:** `void`

### `toArray(Collection<? extends Number> collection)`

Elements are copied from the argument collection as if by collection.toArray().
 Calling this method is as thread-safe as calling that method.

**Parameters:**
- `collection` (`java.util.Collection<? extends java.lang.Number>`): a collection of Number instances

**Returns:** `int[]`

### `asList(int[] backingArray)`

The list supports List#set(int, Object), but any attempt to
 set a value to null will result in a NullPointerException.

 
The returned list maintains the values, but not the identities, of Integer objects
 written to or read from it. For example, whether list.get(0) == list.get(0) is true for
 the returned list is unspecified.

 
The returned list is serializable.

 
**Note:** when possible, you should represent your data as an ImmutableIntArray
 instead, which has an asList view.

**Parameters:**
- `backingArray` (`int[]`): the array to back the list

**Returns:** `java.util.List<java.lang.Integer>`

### `tryParse(String string)`

The ASCII character '-'
 (`'&#92;u002D'`) is recognized as the minus sign.

 
Unlike Integer#parseInt(String), this method returns null instead of
 throwing an exception if parsing fails. Additionally, this method only accepts ASCII digits,
 and returns null if non-ASCII digits are present in the string.

 
Note that strings prefixed with ASCII '+' are rejected, even under JDK 7, despite
 the change to Integer#parseInt(String) for that version.

**Parameters:**
- `string` (`java.lang.String`): the string representation of an integer value

**Returns:** `java.lang.Integer`

### `tryParse(String string, int radix)`

The ASCII
 character '-' (`'&#92;u002D'`) is recognized as the minus sign.

 
Unlike Integer#parseInt(String, int), this method returns null instead of
 throwing an exception if parsing fails. Additionally, this method only accepts ASCII digits,
 and returns null if non-ASCII digits are present in the string.

 
Note that strings prefixed with ASCII '+' are rejected, even under JDK 7, despite
 the change to Integer#parseInt(String, int) for that version.

**Parameters:**
- `string` (`java.lang.String`): the string representation of an integer value
- `radix` (`int`): the radix to use when parsing

**Returns:** `java.lang.Integer`

