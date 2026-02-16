# Class: `Ints`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.Ints`

**Extends:** [`com.google.common.primitives.IntsMethodsForWeb`](./IntsMethodsForWeb.md)

## Description

Static utility methods pertaining to `int` primitives, that are not already found in either
 `Integer` or `Arrays`.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/PrimitivesExplained">primitive utilities</a>.
**Author:** Kevin Bourrillion
**Since:** 1.0

## Fields

### `BYTES`

**Type:** `int`

The number of bytes required to represent a primitive `int` value.

 <p><b>Java 8 users:</b> use `Integer.BYTES` instead.

### `MAX_POWER_OF_TWO`

**Type:** `int`

The largest power of two that can be represented as an `int`.
**Since:** 10.0

## Constructors

### `<init>()`

## Methods

### `hashCode(`int` value)`

**Returns:** `int`

Returns a hash code for `value`; equal to the result of invoking `((Integer)
 value).hashCode()`.

 <p><b>Java 8 users:</b> use `Integer.hashCode(int)` instead.
@param value a primitive `int` value
@return a hash code for the value

### `checkedCast(`long` value)`

**Returns:** `int`

Returns the `int` value that is equal to `value`, if possible.
@param value any value in the range of the `int` type
@return the `int` value that equals `value`
@throws IllegalArgumentException if `value` is greater than `Integer.MAX_VALUE` or
     less than `Integer.MIN_VALUE`

### `saturatedCast(`long` value)`

**Returns:** `int`

Returns the `int` nearest in value to `value`.
@param value any `long` value
@return the same value cast to `int` if it is in the range of the `int` type,
     `Integer.MAX_VALUE` if it is too large, or `Integer.MIN_VALUE` if it is too
     small

### `compare(`int` a, `int` b)`

**Returns:** `int`

Compares the two specified `int` values. The sign of the value returned is the same as
 that of `((Integer) a).compareTo(b)`.

 <p><b>Note for Java 7 and later:</b> this method should be treated as deprecated; use the
 equivalent `Integer.compare` method instead.
@param a the first `int` to compare
@param b the second `int` to compare
@return a negative value if `a` is less than `b`; a positive value if `a` is
     greater than `b`; or zero if they are equal

### `contains(`int[]` array, `int` target)`

**Returns:** `boolean`

Returns `true` if `target` is present as an element anywhere in `array`.
@param array an array of `int` values, possibly empty
@param target a primitive `int` value
@return `true` if `array[i] == target` for some value of `i`

### `indexOf(`int[]` array, `int` target)`

**Returns:** `int`

Returns the index of the first appearance of the value `target` in `array`.
@param array an array of `int` values, possibly empty
@param target a primitive `int` value
@return the least index `i` for which `array[i] == target`, or `-1` if no
     such index exists.

### `indexOf(`int[]` array, `int` target, `int` start, `int` end)`

**Returns:** `int`

### `indexOf(`int[]` array, `int[]` target)`

**Returns:** `int`

Returns the start position of the first occurrence of the specified `target` within
 `array`, or `-1` if there is no such occurrence.

 <p>More formally, returns the lowest index `i` such that `Arrays.copyOfRange(array,
 i, i + target.length)` contains exactly the same elements as `target`.
@param array the array to search for the sequence `target`
@param target the array to search for as a sub-sequence of `array`

### `lastIndexOf(`int[]` array, `int` target)`

**Returns:** `int`

Returns the index of the last appearance of the value `target` in `array`.
@param array an array of `int` values, possibly empty
@param target a primitive `int` value
@return the greatest index `i` for which `array[i] == target`, or `-1` if no
     such index exists.

### `lastIndexOf(`int[]` array, `int` target, `int` start, `int` end)`

**Returns:** `int`

### `min(`int[]` array)`

**Returns:** `int`

Returns the least value present in `array`.
@param array a <i>nonempty</i> array of `int` values
@return the value present in `array` that is less than or equal to every other value in
     the array
@throws IllegalArgumentException if `array` is empty

### `max(`int[]` array)`

**Returns:** `int`

Returns the greatest value present in `array`.
@param array a <i>nonempty</i> array of `int` values
@return the value present in `array` that is greater than or equal to every other value
     in the array
@throws IllegalArgumentException if `array` is empty

### `constrainToRange(`int` value, `int` min, `int` max)`

**Returns:** `int`

Returns the value nearest to `value` which is within the closed range `[min..max]`.

 <p>If `value` is within the range `[min..max]`, `value` is returned
 unchanged. If `value` is less than `min`, `min` is returned, and if `value` is greater than `max`, `max` is returned.
@param value the `int` value to constrain
@param min the lower bound (inclusive) of the range to constrain `value` to
@param max the upper bound (inclusive) of the range to constrain `value` to
@throws IllegalArgumentException if `min > max`
**Since:** 21.0

### `concat(`int[][]` arrays)`

**Returns:** `int[]`

Returns the values from each provided array combined into a single array. For example, `concat(new int[] {a, b`, new int[] {}, new int[] {c}} returns the array `{a, b, c`}.
@param arrays zero or more `int` arrays
@return a single array containing all the values from the source arrays, in order

### `toByteArray(`int` value)`

**Returns:** `byte[]`

Returns a big-endian representation of `value` in a 4-element byte array; equivalent to
 `ByteBuffer.allocate(4).putInt(value).array()`. For example, the input value `0x12131415` would yield the byte array `{0x12, 0x13, 0x14, 0x15`}.

 <p>If you need to convert and concatenate several values (possibly even of different types),
 use a shared `java.nio.ByteBuffer` instance, or use `com.google.common.io.ByteStreams.newDataOutput()` to get a growable buffer.

### `fromByteArray(`byte[]` bytes)`

**Returns:** `int`

Returns the `int` value whose big-endian representation is stored in the first 4 bytes of
 `bytes`; equivalent to `ByteBuffer.wrap(bytes).getInt()`. For example, the input
 byte array `{0x12, 0x13, 0x14, 0x15, 0x33`} would yield the `int` value `0x12131415`.

 <p>Arguably, it's preferable to use `java.nio.ByteBuffer`; that library exposes much more
 flexibility at little cost in readability.
@throws IllegalArgumentException if `bytes` has fewer than 4 elements

### `fromBytes(`byte` b1, `byte` b2, `byte` b3, `byte` b4)`

**Returns:** `int`

Returns the `int` value whose byte representation is the given 4 bytes, in big-endian
 order; equivalent to `Ints.fromByteArray(new byte[] {b1, b2, b3, b4`)}.
**Since:** 7.0

### `stringConverter()`

**Returns:** [`com.google.common.base.Converter<java.lang.String,java.lang.Integer>`](../base/Converter.md)

Returns a serializable converter object that converts between strings and integers using `Integer.decode` and `Integer.toString()`. The returned converter throws `NumberFormatException` if the input string is invalid.

 <p><b>Warning:</b> please see `Integer.decode` to understand exactly how strings are
 parsed. For example, the string `"0123"` is treated as <i>octal</i> and converted to the
 value `83`.
**Since:** 16.0

### `ensureCapacity(`int[]` array, `int` minLength, `int` padding)`

**Returns:** `int[]`

Returns an array containing the same values as `array`, but guaranteed to be of a
 specified minimum length. If `array` already has a length of at least `minLength`,
 it is returned directly. Otherwise, a new array of size `minLength + padding` is
 returned, containing the values of `array`, and zeroes in the remaining places.
@param array the source array
@param minLength the minimum length the returned array must guarantee
@param padding an extra amount to "grow" the array by if growth is necessary
@throws IllegalArgumentException if `minLength` or `padding` is negative
@return an array containing the values of `array`, with guaranteed minimum length `minLength`

### `join(`java.lang.String` separator, `int[]` array)`

**Returns:** `java.lang.String`

Returns a string containing the supplied `int` values separated by `separator`. For
 example, `join("-", 1, 2, 3)` returns the string `"1-2-3"`.
@param separator the text that should appear between consecutive values in the resulting string
     (but not at the start or end)
@param array an array of `int` values, possibly empty

### `lexicographicalComparator()`

**Returns:** `java.util.Comparator<int[]>`

Returns a comparator that compares two `int` arrays <a href="http://en.wikipedia.org/wiki/Lexicographical_order">lexicographically</a>. That is, it
 compares, using `compare(int, int)`), the first pair of values that follow any common
 prefix, or when one array is a prefix of the other, treats the shorter array as the lesser. For
 example, `[] < [1] < [1, 2] < [2]`.

 <p>The returned comparator is inconsistent with `Object.equals(Object)` (since arrays
 support only identity equality), but it is consistent with `Arrays.equals(int[], int[])`.
**Since:** 2.0

### `sortDescending(`int[]` array)`

**Returns:** `void`

Sorts the elements of `array` in descending order.
**Since:** 23.1

### `sortDescending(`int[]` array, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Sorts the elements of `array` between `fromIndex` inclusive and `toIndex`
 exclusive in descending order.
**Since:** 23.1

### `reverse(`int[]` array)`

**Returns:** `void`

Reverses the elements of `array`. This is equivalent to `Collections.reverse(Ints.asList(array))`, but is likely to be more efficient.
**Since:** 23.1

### `reverse(`int[]` array, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Reverses the elements of `array` between `fromIndex` inclusive and `toIndex`
 exclusive. This is equivalent to `Collections.reverse(Ints.asList(array).subList(fromIndex, toIndex))`, but is likely to be more
 efficient.
@throws IndexOutOfBoundsException if `fromIndex < 0`, `toIndex > array.length`, or
     `toIndex > fromIndex`
**Since:** 23.1

### `rotate(`int[]` array, `int` distance)`

**Returns:** `void`

Performs a right rotation of `array` of "distance" places, so that the first element is
 moved to index "distance", and the element at index `i` ends up at index `(distance
 + i) mod array.length`. This is equivalent to `Collections.rotate(Ints.asList(array),
 distance)`, but is considerably faster and avoids allocation and garbage collection.

 <p>The provided "distance" may be negative, which will rotate left.
**Since:** 32.0.0

### `rotate(`int[]` array, `int` distance, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Performs a right rotation of `array` between `fromIndex` inclusive and `toIndex` exclusive. This is equivalent to `Collections.rotate(Ints.asList(array).subList(fromIndex, toIndex), distance)`, but is
 considerably faster and avoids allocations and garbage collection.

 <p>The provided "distance" may be negative, which will rotate left.
@throws IndexOutOfBoundsException if `fromIndex < 0`, `toIndex > array.length`, or
     `toIndex > fromIndex`
**Since:** 32.0.0

### `toArray(`java.util.Collection<? extends java.lang.Number>` collection)`

**Returns:** `int[]`

Returns an array containing each value of `collection`, converted to a `int` value
 in the manner of `Number.intValue`.

 <p>Elements are copied from the argument collection as if by `collection.toArray()`.
 Calling this method is as thread-safe as calling that method.
@param collection a collection of `Number` instances
@return an array containing the same values as `collection`, in the same order, converted
     to primitives
@throws NullPointerException if `collection` or any of its elements is null
**Since:** 1.0 (parameter was `Collection<Integer>` before 12.0)

### `asList(`int[]` backingArray)`

**Returns:** `java.util.List<java.lang.Integer>`

Returns a fixed-size list backed by the specified array, similar to `Arrays.asList(Object[])`. The list supports `List.set(int, Object)`, but any attempt to
 set a value to `null` will result in a `NullPointerException`.

 <p>The returned list maintains the values, but not the identities, of `Integer` objects
 written to or read from it. For example, whether `list.get(0) == list.get(0)` is true for
 the returned list is unspecified.

 <p>The returned list is serializable.

 <p><b>Note:</b> when possible, you should represent your data as an `ImmutableIntArray`
 instead, which has an `ImmutableIntArray.asList asList` view.
@param backingArray the array to back the list
@return a list view of the array

### `tryParse(`java.lang.String` string)`

**Returns:** `java.lang.Integer`

Parses the specified string as a signed decimal integer value. The ASCII character `'-'`
 (<code>'&#92;u002D'</code>) is recognized as the minus sign.

 <p>Unlike `Integer.parseInt(String)`, this method returns `null` instead of
 throwing an exception if parsing fails. Additionally, this method only accepts ASCII digits,
 and returns `null` if non-ASCII digits are present in the string.

 <p>Note that strings prefixed with ASCII `'+'` are rejected, even under JDK 7, despite
 the change to `Integer.parseInt(String)` for that version.
@param string the string representation of an integer value
@return the integer value represented by `string`, or `null` if `string` has
     a length of zero or cannot be parsed as an integer value
@throws NullPointerException if `string` is `null`
**Since:** 11.0

### `tryParse(`java.lang.String` string, `int` radix)`

**Returns:** `java.lang.Integer`

Parses the specified string as a signed integer value using the specified radix. The ASCII
 character `'-'` (<code>'&#92;u002D'</code>) is recognized as the minus sign.

 <p>Unlike `Integer.parseInt(String, int)`, this method returns `null` instead of
 throwing an exception if parsing fails. Additionally, this method only accepts ASCII digits,
 and returns `null` if non-ASCII digits are present in the string.

 <p>Note that strings prefixed with ASCII `'+'` are rejected, even under JDK 7, despite
 the change to `Integer.parseInt(String, int)` for that version.
@param string the string representation of an integer value
@param radix the radix to use when parsing
@return the integer value represented by `string` using `radix`, or `null` if
     `string` has a length of zero or cannot be parsed as an integer value
@throws IllegalArgumentException if `radix < Character.MIN_RADIX` or `radix >
     Character.MAX_RADIX`
@throws NullPointerException if `string` is `null`
**Since:** 19.0

