# Class: `Longs`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.Longs`

## Description

Static utility methods pertaining to `long` primitives, that are not already found in
 either `Long` or `Arrays`.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/PrimitivesExplained">primitive utilities</a>.
**Author:** Kevin Bourrillion
**Since:** 1.0

## Fields

### `BYTES`

**Type:** `int`

The number of bytes required to represent a primitive `long` value.

 <p><b>Java 8 users:</b> use `Long.BYTES` instead.

### `MAX_POWER_OF_TWO`

**Type:** `long`

The largest power of two that can be represented as a `long`.
**Since:** 10.0

## Constructors

### `<init>()`

## Methods

### `hashCode(`long` value)`

**Returns:** `int`

Returns a hash code for `value`; equal to the result of invoking `((Long)
 value).hashCode()`.

 <p>This method always return the value specified by `Long.hashCode()` in java, which
 might be different from `((Long) value).hashCode()` in GWT because `Long.hashCode()` in GWT does not obey the JRE contract.

 <p><b>Java 8 users:</b> use `Long.hashCode(long)` instead.
@param value a primitive `long` value
@return a hash code for the value

### `compare(`long` a, `long` b)`

**Returns:** `int`

Compares the two specified `long` values. The sign of the value returned is the same as
 that of `((Long) a).compareTo(b)`.

 <p><b>Note for Java 7 and later:</b> this method should be treated as deprecated; use the
 equivalent `Long.compare` method instead.
@param a the first `long` to compare
@param b the second `long` to compare
@return a negative value if `a` is less than `b`; a positive value if `a` is
     greater than `b`; or zero if they are equal

### `contains(`long[]` array, `long` target)`

**Returns:** `boolean`

Returns `true` if `target` is present as an element anywhere in `array`.
@param array an array of `long` values, possibly empty
@param target a primitive `long` value
@return `true` if `array[i] == target` for some value of `i`

### `indexOf(`long[]` array, `long` target)`

**Returns:** `int`

Returns the index of the first appearance of the value `target` in `array`.
@param array an array of `long` values, possibly empty
@param target a primitive `long` value
@return the least index `i` for which `array[i] == target`, or `-1` if no
     such index exists.

### `indexOf(`long[]` array, `long` target, `int` start, `int` end)`

**Returns:** `int`

### `indexOf(`long[]` array, `long[]` target)`

**Returns:** `int`

Returns the start position of the first occurrence of the specified `target` within
 `array`, or `-1` if there is no such occurrence.

 <p>More formally, returns the lowest index `i` such that `Arrays.copyOfRange(array,
 i, i + target.length)` contains exactly the same elements as `target`.
@param array the array to search for the sequence `target`
@param target the array to search for as a sub-sequence of `array`

### `lastIndexOf(`long[]` array, `long` target)`

**Returns:** `int`

Returns the index of the last appearance of the value `target` in `array`.
@param array an array of `long` values, possibly empty
@param target a primitive `long` value
@return the greatest index `i` for which `array[i] == target`, or `-1` if no
     such index exists.

### `lastIndexOf(`long[]` array, `long` target, `int` start, `int` end)`

**Returns:** `int`

### `min(`long[]` array)`

**Returns:** `long`

Returns the least value present in `array`.
@param array a <i>nonempty</i> array of `long` values
@return the value present in `array` that is less than or equal to every other value in
     the array
@throws IllegalArgumentException if `array` is empty

### `max(`long[]` array)`

**Returns:** `long`

Returns the greatest value present in `array`.
@param array a <i>nonempty</i> array of `long` values
@return the value present in `array` that is greater than or equal to every other value
     in the array
@throws IllegalArgumentException if `array` is empty

### `constrainToRange(`long` value, `long` min, `long` max)`

**Returns:** `long`

Returns the value nearest to `value` which is within the closed range `[min..max]`.

 <p>If `value` is within the range `[min..max]`, `value` is returned
 unchanged. If `value` is less than `min`, `min` is returned, and if `value` is greater than `max`, `max` is returned.
@param value the `long` value to constrain
@param min the lower bound (inclusive) of the range to constrain `value` to
@param max the upper bound (inclusive) of the range to constrain `value` to
@throws IllegalArgumentException if `min > max`
**Since:** 21.0

### `concat(`long[][]` arrays)`

**Returns:** `long[]`

Returns the values from each provided array combined into a single array. For example, `concat(new long[] {a, b`, new long[] {}, new long[] {c}} returns the array `{a, b, c`}.
@param arrays zero or more `long` arrays
@return a single array containing all the values from the source arrays, in order
@throws IllegalArgumentException if the total number of elements in `arrays` does not fit
     in an `int`

### `checkNoOverflow(`long` result)`

**Returns:** `int`

### `toByteArray(`long` value)`

**Returns:** `byte[]`

Returns a big-endian representation of `value` in an 8-element byte array; equivalent to
 `ByteBuffer.allocate(8).putLong(value).array()`. For example, the input value `0x1213141516171819L` would yield the byte array `{0x12, 0x13, 0x14, 0x15, 0x16, 0x17,
 0x18, 0x19`}.

 <p>If you need to convert and concatenate several values (possibly even of different types),
 use a shared `java.nio.ByteBuffer` instance, or use `com.google.common.io.ByteStreams.newDataOutput()` to get a growable buffer.

### `fromByteArray(`byte[]` bytes)`

**Returns:** `long`

Returns the `long` value whose big-endian representation is stored in the first 8 bytes
 of `bytes`; equivalent to `ByteBuffer.wrap(bytes).getLong()`. For example, the
 input byte array `{0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19`} would yield the
 `long` value `0x1213141516171819L`.

 <p>Arguably, it's preferable to use `java.nio.ByteBuffer`; that library exposes much more
 flexibility at little cost in readability.
@throws IllegalArgumentException if `bytes` has fewer than 8 elements

### `fromBytes(`byte` b1, `byte` b2, `byte` b3, `byte` b4, `byte` b5, `byte` b6, `byte` b7, `byte` b8)`

**Returns:** `long`

Returns the `long` value whose byte representation is the given 8 bytes, in big-endian
 order; equivalent to `Longs.fromByteArray(new byte[] {b1, b2, b3, b4, b5, b6, b7, b8`)}.
**Since:** 7.0

### `tryParse(`java.lang.String` string)`

**Returns:** `java.lang.Long`

Parses the specified string as a signed decimal long value. The ASCII character `'-'` (
 <code>'&#92;u002D'</code>) is recognized as the minus sign.

 <p>Unlike `Long.parseLong(String)`, this method returns `null` instead of throwing
 an exception if parsing fails. Additionally, this method only accepts ASCII digits, and returns
 `null` if non-ASCII digits are present in the string.

 <p>Note that strings prefixed with ASCII `'+'` are rejected, even under JDK 7, despite
 the change to `Long.parseLong(String)` for that version.
@param string the string representation of a long value
@return the long value represented by `string`, or `null` if `string` has a
     length of zero or cannot be parsed as a long value
@throws NullPointerException if `string` is `null`
**Since:** 14.0

### `tryParse(`java.lang.String` string, `int` radix)`

**Returns:** `java.lang.Long`

Parses the specified string as a signed long value using the specified radix. The ASCII
 character `'-'` (<code>'&#92;u002D'</code>) is recognized as the minus sign.

 <p>Unlike `Long.parseLong(String, int)`, this method returns `null` instead of
 throwing an exception if parsing fails. Additionally, this method only accepts ASCII digits,
 and returns `null` if non-ASCII digits are present in the string.

 <p>Note that strings prefixed with ASCII `'+'` are rejected, even under JDK 7, despite
 the change to `Long.parseLong(String, int)` for that version.
@param string the string representation of a long value
@param radix the radix to use when parsing
@return the long value represented by `string` using `radix`, or `null` if
     `string` has a length of zero or cannot be parsed as a long value
@throws IllegalArgumentException if `radix < Character.MIN_RADIX` or `radix >
     Character.MAX_RADIX`
@throws NullPointerException if `string` is `null`
**Since:** 19.0

### `stringConverter()`

**Returns:** [`com.google.common.base.Converter<java.lang.String,java.lang.Long>`](../base/Converter.md)

Returns a serializable converter object that converts between strings and longs using `Long.decode` and `Long.toString()`. The returned converter throws `NumberFormatException` if the input string is invalid.

 <p><b>Warning:</b> please see `Long.decode` to understand exactly how strings are parsed.
 For example, the string `"0123"` is treated as <i>octal</i> and converted to the value
 `83L`.
**Since:** 16.0

### `ensureCapacity(`long[]` array, `int` minLength, `int` padding)`

**Returns:** `long[]`

Returns an array containing the same values as `array`, but guaranteed to be of a
 specified minimum length. If `array` already has a length of at least `minLength`,
 it is returned directly. Otherwise, a new array of size `minLength + padding` is
 returned, containing the values of `array`, and zeroes in the remaining places.
@param array the source array
@param minLength the minimum length the returned array must guarantee
@param padding an extra amount to "grow" the array by if growth is necessary
@throws IllegalArgumentException if `minLength` or `padding` is negative
@return an array containing the values of `array`, with guaranteed minimum length `minLength`

### `join(`java.lang.String` separator, `long[]` array)`

**Returns:** `java.lang.String`

Returns a string containing the supplied `long` values separated by `separator`.
 For example, `join("-", 1L, 2L, 3L)` returns the string `"1-2-3"`.
@param separator the text that should appear between consecutive values in the resulting string
     (but not at the start or end)
@param array an array of `long` values, possibly empty

### `lexicographicalComparator()`

**Returns:** `java.util.Comparator<long[]>`

Returns a comparator that compares two `long` arrays <a href="http://en.wikipedia.org/wiki/Lexicographical_order">lexicographically</a>. That is, it
 compares, using `compare(long, long)`), the first pair of values that follow any common
 prefix, or when one array is a prefix of the other, treats the shorter array as the lesser. For
 example, `[] < [1L] < [1L, 2L] < [2L]`.

 <p>The returned comparator is inconsistent with `Object.equals(Object)` (since arrays
 support only identity equality), but it is consistent with `Arrays.equals(long[],
 long[])`.
**Since:** 2.0

### `sortDescending(`long[]` array)`

**Returns:** `void`

Sorts the elements of `array` in descending order.
**Since:** 23.1

### `sortDescending(`long[]` array, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Sorts the elements of `array` between `fromIndex` inclusive and `toIndex`
 exclusive in descending order.
**Since:** 23.1

### `reverse(`long[]` array)`

**Returns:** `void`

Reverses the elements of `array`. This is equivalent to `Collections.reverse(Longs.asList(array))`, but is likely to be more efficient.
**Since:** 23.1

### `reverse(`long[]` array, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Reverses the elements of `array` between `fromIndex` inclusive and `toIndex`
 exclusive. This is equivalent to `Collections.reverse(Longs.asList(array).subList(fromIndex, toIndex))`, but is likely to be more
 efficient.
@throws IndexOutOfBoundsException if `fromIndex < 0`, `toIndex > array.length`, or
     `toIndex > fromIndex`
**Since:** 23.1

### `rotate(`long[]` array, `int` distance)`

**Returns:** `void`

Performs a right rotation of `array` of "distance" places, so that the first element is
 moved to index "distance", and the element at index `i` ends up at index `(distance
 + i) mod array.length`. This is equivalent to `Collections.rotate(Longs.asList(array),
 distance)`, but is considerably faster and avoids allocation and garbage collection.

 <p>The provided "distance" may be negative, which will rotate left.
**Since:** 32.0.0

### `rotate(`long[]` array, `int` distance, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Performs a right rotation of `array` between `fromIndex` inclusive and `toIndex` exclusive. This is equivalent to `Collections.rotate(Longs.asList(array).subList(fromIndex, toIndex), distance)`, but is
 considerably faster and avoids allocations and garbage collection.

 <p>The provided "distance" may be negative, which will rotate left.
@throws IndexOutOfBoundsException if `fromIndex < 0`, `toIndex > array.length`, or
     `toIndex > fromIndex`
**Since:** 32.0.0

### `toArray(`java.util.Collection<? extends java.lang.Number>` collection)`

**Returns:** `long[]`

Returns an array containing each value of `collection`, converted to a `long` value
 in the manner of `Number.longValue`.

 <p>Elements are copied from the argument collection as if by `collection.toArray()`.
 Calling this method is as thread-safe as calling that method.
@param collection a collection of `Number` instances
@return an array containing the same values as `collection`, in the same order, converted
     to primitives
@throws NullPointerException if `collection` or any of its elements is null
**Since:** 1.0 (parameter was `Collection<Long>` before 12.0)

### `asList(`long[]` backingArray)`

**Returns:** `java.util.List<java.lang.Long>`

Returns a fixed-size list backed by the specified array, similar to `Arrays.asList(Object[])`. The list supports `List.set(int, Object)`, but any attempt to
 set a value to `null` will result in a `NullPointerException`.

 <p>The returned list maintains the values, but not the identities, of `Long` objects
 written to or read from it. For example, whether `list.get(0) == list.get(0)` is true for
 the returned list is unspecified.

 <p>The returned list is serializable.

 <p><b>Note:</b> when possible, you should represent your data as an `ImmutableLongArray`
 instead, which has an `ImmutableLongArray.asList asList` view.
@param backingArray the array to back the list
@return a list view of the array

