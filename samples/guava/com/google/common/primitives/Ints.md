# Class: `Ints`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.Ints`

**Extends:** [`com.google.common.primitives.IntsMethodsForWeb`](./IntsMethodsForWeb.md)

## Description

Static utility methods pertaining to {@code int} primitives, that are not already found in either
 {@link Integer} or {@link Arrays}.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/PrimitivesExplained">primitive utilities</a>.
@author Kevin Bourrillion
@since 1.0

## Fields

### `BYTES`

**Type:** `int`

The number of bytes required to represent a primitive {@code int} value.

 <p><b>Java 8 users:</b> use {@link Integer#BYTES} instead.

### `MAX_POWER_OF_TWO`

**Type:** `int`

The largest power of two that can be represented as an {@code int}.
@since 10.0

## Constructors

### `<init>()`

## Methods

### `hashCode(`int` value)`

**Returns:** `int`

Returns a hash code for {@code value}; equal to the result of invoking {@code ((Integer)
 value).hashCode()}.

 <p><b>Java 8 users:</b> use {@link Integer#hashCode(int)} instead.
@param value a primitive {@code int} value
@return a hash code for the value

### `checkedCast(`long` value)`

**Returns:** `int`

Returns the {@code int} value that is equal to {@code value}, if possible.
@param value any value in the range of the {@code int} type
@return the {@code int} value that equals {@code value}
@throws IllegalArgumentException if {@code value} is greater than {@link Integer#MAX_VALUE} or
     less than {@link Integer#MIN_VALUE}

### `saturatedCast(`long` value)`

**Returns:** `int`

Returns the {@code int} nearest in value to {@code value}.
@param value any {@code long} value
@return the same value cast to {@code int} if it is in the range of the {@code int} type,
     {@link Integer#MAX_VALUE} if it is too large, or {@link Integer#MIN_VALUE} if it is too
     small

### `compare(`int` a, `int` b)`

**Returns:** `int`

Compares the two specified {@code int} values. The sign of the value returned is the same as
 that of {@code ((Integer) a).compareTo(b)}.

 <p><b>Note for Java 7 and later:</b> this method should be treated as deprecated; use the
 equivalent {@link Integer#compare} method instead.
@param a the first {@code int} to compare
@param b the second {@code int} to compare
@return a negative value if {@code a} is less than {@code b}; a positive value if {@code a} is
     greater than {@code b}; or zero if they are equal

### `contains(`int[]` array, `int` target)`

**Returns:** `boolean`

Returns {@code true} if {@code target} is present as an element anywhere in {@code array}.
@param array an array of {@code int} values, possibly empty
@param target a primitive {@code int} value
@return {@code true} if {@code array[i] == target} for some value of {@code i}

### `indexOf(`int[]` array, `int` target)`

**Returns:** `int`

Returns the index of the first appearance of the value {@code target} in {@code array}.
@param array an array of {@code int} values, possibly empty
@param target a primitive {@code int} value
@return the least index {@code i} for which {@code array[i] == target}, or {@code -1} if no
     such index exists.

### `indexOf(`int[]` array, `int` target, `int` start, `int` end)`

**Returns:** `int`

### `indexOf(`int[]` array, `int[]` target)`

**Returns:** `int`

Returns the start position of the first occurrence of the specified {@code target} within
 {@code array}, or {@code -1} if there is no such occurrence.

 <p>More formally, returns the lowest index {@code i} such that {@code Arrays.copyOfRange(array,
 i, i + target.length)} contains exactly the same elements as {@code target}.
@param array the array to search for the sequence {@code target}
@param target the array to search for as a sub-sequence of {@code array}

### `lastIndexOf(`int[]` array, `int` target)`

**Returns:** `int`

Returns the index of the last appearance of the value {@code target} in {@code array}.
@param array an array of {@code int} values, possibly empty
@param target a primitive {@code int} value
@return the greatest index {@code i} for which {@code array[i] == target}, or {@code -1} if no
     such index exists.

### `lastIndexOf(`int[]` array, `int` target, `int` start, `int` end)`

**Returns:** `int`

### `min(`int[]` array)`

**Returns:** `int`

Returns the least value present in {@code array}.
@param array a <i>nonempty</i> array of {@code int} values
@return the value present in {@code array} that is less than or equal to every other value in
     the array
@throws IllegalArgumentException if {@code array} is empty

### `max(`int[]` array)`

**Returns:** `int`

Returns the greatest value present in {@code array}.
@param array a <i>nonempty</i> array of {@code int} values
@return the value present in {@code array} that is greater than or equal to every other value
     in the array
@throws IllegalArgumentException if {@code array} is empty

### `constrainToRange(`int` value, `int` min, `int` max)`

**Returns:** `int`

Returns the value nearest to {@code value} which is within the closed range {@code [min..max]}.

 <p>If {@code value} is within the range {@code [min..max]}, {@code value} is returned
 unchanged. If {@code value} is less than {@code min}, {@code min} is returned, and if {@code
 value} is greater than {@code max}, {@code max} is returned.
@param value the {@code int} value to constrain
@param min the lower bound (inclusive) of the range to constrain {@code value} to
@param max the upper bound (inclusive) of the range to constrain {@code value} to
@throws IllegalArgumentException if {@code min > max}
@since 21.0

### `concat(`int[][]` arrays)`

**Returns:** `int[]`

Returns the values from each provided array combined into a single array. For example, {@code
 concat(new int[] {a, b}, new int[] {}, new int[] {c}} returns the array {@code {a, b, c}}.
@param arrays zero or more {@code int} arrays
@return a single array containing all the values from the source arrays, in order

### `toByteArray(`int` value)`

**Returns:** `byte[]`

Returns a big-endian representation of {@code value} in a 4-element byte array; equivalent to
 {@code ByteBuffer.allocate(4).putInt(value).array()}. For example, the input value {@code
 0x12131415} would yield the byte array {@code {0x12, 0x13, 0x14, 0x15}}.

 <p>If you need to convert and concatenate several values (possibly even of different types),
 use a shared {@link java.nio.ByteBuffer} instance, or use {@link com.google.common.io.ByteStreams#newDataOutput()} to get a growable buffer.

### `fromByteArray(`byte[]` bytes)`

**Returns:** `int`

Returns the {@code int} value whose big-endian representation is stored in the first 4 bytes of
 {@code bytes}; equivalent to {@code ByteBuffer.wrap(bytes).getInt()}. For example, the input
 byte array {@code {0x12, 0x13, 0x14, 0x15, 0x33}} would yield the {@code int} value {@code
 0x12131415}.

 <p>Arguably, it's preferable to use {@link java.nio.ByteBuffer}; that library exposes much more
 flexibility at little cost in readability.
@throws IllegalArgumentException if {@code bytes} has fewer than 4 elements

### `fromBytes(`byte` b1, `byte` b2, `byte` b3, `byte` b4)`

**Returns:** `int`

Returns the {@code int} value whose byte representation is the given 4 bytes, in big-endian
 order; equivalent to {@code Ints.fromByteArray(new byte[] {b1, b2, b3, b4})}.
@since 7.0

### `stringConverter()`

**Returns:** [`com.google.common.base.Converter<java.lang.String,java.lang.Integer>`](../base/Converter.md)

Returns a serializable converter object that converts between strings and integers using {@link Integer#decode} and {@link Integer#toString()}. The returned converter throws {@link NumberFormatException} if the input string is invalid.

 <p><b>Warning:</b> please see {@link Integer#decode} to understand exactly how strings are
 parsed. For example, the string {@code "0123"} is treated as <i>octal</i> and converted to the
 value {@code 83}.
@since 16.0

### `ensureCapacity(`int[]` array, `int` minLength, `int` padding)`

**Returns:** `int[]`

Returns an array containing the same values as {@code array}, but guaranteed to be of a
 specified minimum length. If {@code array} already has a length of at least {@code minLength},
 it is returned directly. Otherwise, a new array of size {@code minLength + padding} is
 returned, containing the values of {@code array}, and zeroes in the remaining places.
@param array the source array
@param minLength the minimum length the returned array must guarantee
@param padding an extra amount to "grow" the array by if growth is necessary
@throws IllegalArgumentException if {@code minLength} or {@code padding} is negative
@return an array containing the values of {@code array}, with guaranteed minimum length {@code
     minLength}

### `join(`java.lang.String` separator, `int[]` array)`

**Returns:** `java.lang.String`

Returns a string containing the supplied {@code int} values separated by {@code separator}. For
 example, {@code join("-", 1, 2, 3)} returns the string {@code "1-2-3"}.
@param separator the text that should appear between consecutive values in the resulting string
     (but not at the start or end)
@param array an array of {@code int} values, possibly empty

### `lexicographicalComparator()`

**Returns:** [`java.util.Comparator<int[]>`](../../../../java/util/Comparator.md)

Returns a comparator that compares two {@code int} arrays <a href="http://en.wikipedia.org/wiki/Lexicographical_order">lexicographically</a>. That is, it
 compares, using {@link #compare(int, int)}), the first pair of values that follow any common
 prefix, or when one array is a prefix of the other, treats the shorter array as the lesser. For
 example, {@code [] < [1] < [1, 2] < [2]}.

 <p>The returned comparator is inconsistent with {@link Object#equals(Object)} (since arrays
 support only identity equality), but it is consistent with {@link Arrays#equals(int[], int[])}.
@since 2.0

### `sortDescending(`int[]` array)`

**Returns:** `void`

Sorts the elements of {@code array} in descending order.
@since 23.1

### `sortDescending(`int[]` array, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Sorts the elements of {@code array} between {@code fromIndex} inclusive and {@code toIndex}
 exclusive in descending order.
@since 23.1

### `reverse(`int[]` array)`

**Returns:** `void`

Reverses the elements of {@code array}. This is equivalent to {@code
 Collections.reverse(Ints.asList(array))}, but is likely to be more efficient.
@since 23.1

### `reverse(`int[]` array, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Reverses the elements of {@code array} between {@code fromIndex} inclusive and {@code toIndex}
 exclusive. This is equivalent to {@code
 Collections.reverse(Ints.asList(array).subList(fromIndex, toIndex))}, but is likely to be more
 efficient.
@throws IndexOutOfBoundsException if {@code fromIndex < 0}, {@code toIndex > array.length}, or
     {@code toIndex > fromIndex}
@since 23.1

### `rotate(`int[]` array, `int` distance)`

**Returns:** `void`

Performs a right rotation of {@code array} of "distance" places, so that the first element is
 moved to index "distance", and the element at index {@code i} ends up at index {@code (distance
 + i) mod array.length}. This is equivalent to {@code Collections.rotate(Ints.asList(array),
 distance)}, but is considerably faster and avoids allocation and garbage collection.

 <p>The provided "distance" may be negative, which will rotate left.
@since 32.0.0

### `rotate(`int[]` array, `int` distance, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Performs a right rotation of {@code array} between {@code fromIndex} inclusive and {@code
 toIndex} exclusive. This is equivalent to {@code
 Collections.rotate(Ints.asList(array).subList(fromIndex, toIndex), distance)}, but is
 considerably faster and avoids allocations and garbage collection.

 <p>The provided "distance" may be negative, which will rotate left.
@throws IndexOutOfBoundsException if {@code fromIndex < 0}, {@code toIndex > array.length}, or
     {@code toIndex > fromIndex}
@since 32.0.0

### `toArray([`java.util.Collection<? extends java.lang.Number>`](../../../../java/util/Collection.md) collection)`

**Returns:** `int[]`

Returns an array containing each value of {@code collection}, converted to a {@code int} value
 in the manner of {@link Number#intValue}.

 <p>Elements are copied from the argument collection as if by {@code collection.toArray()}.
 Calling this method is as thread-safe as calling that method.
@param collection a collection of {@code Number} instances
@return an array containing the same values as {@code collection}, in the same order, converted
     to primitives
@throws NullPointerException if {@code collection} or any of its elements is null
@since 1.0 (parameter was {@code Collection<Integer>} before 12.0)

### `asList(`int[]` backingArray)`

**Returns:** [`java.util.List<java.lang.Integer>`](../../../../java/util/List.md)

Returns a fixed-size list backed by the specified array, similar to {@link Arrays#asList(Object[])}. The list supports {@link List#set(int, Object)}, but any attempt to
 set a value to {@code null} will result in a {@link NullPointerException}.

 <p>The returned list maintains the values, but not the identities, of {@code Integer} objects
 written to or read from it. For example, whether {@code list.get(0) == list.get(0)} is true for
 the returned list is unspecified.

 <p>The returned list is serializable.

 <p><b>Note:</b> when possible, you should represent your data as an {@link ImmutableIntArray}
 instead, which has an {@link ImmutableIntArray#asList asList} view.
@param backingArray the array to back the list
@return a list view of the array

### `tryParse(`java.lang.String` string)`

**Returns:** `java.lang.Integer`

Parses the specified string as a signed decimal integer value. The ASCII character {@code '-'}
 (<code>'&#92;u002D'</code>) is recognized as the minus sign.

 <p>Unlike {@link Integer#parseInt(String)}, this method returns {@code null} instead of
 throwing an exception if parsing fails. Additionally, this method only accepts ASCII digits,
 and returns {@code null} if non-ASCII digits are present in the string.

 <p>Note that strings prefixed with ASCII {@code '+'} are rejected, even under JDK 7, despite
 the change to {@link Integer#parseInt(String)} for that version.
@param string the string representation of an integer value
@return the integer value represented by {@code string}, or {@code null} if {@code string} has
     a length of zero or cannot be parsed as an integer value
@throws NullPointerException if {@code string} is {@code null}
@since 11.0

### `tryParse(`java.lang.String` string, `int` radix)`

**Returns:** `java.lang.Integer`

Parses the specified string as a signed integer value using the specified radix. The ASCII
 character {@code '-'} (<code>'&#92;u002D'</code>) is recognized as the minus sign.

 <p>Unlike {@link Integer#parseInt(String, int)}, this method returns {@code null} instead of
 throwing an exception if parsing fails. Additionally, this method only accepts ASCII digits,
 and returns {@code null} if non-ASCII digits are present in the string.

 <p>Note that strings prefixed with ASCII {@code '+'} are rejected, even under JDK 7, despite
 the change to {@link Integer#parseInt(String, int)} for that version.
@param string the string representation of an integer value
@param radix the radix to use when parsing
@return the integer value represented by {@code string} using {@code radix}, or {@code null} if
     {@code string} has a length of zero or cannot be parsed as an integer value
@throws IllegalArgumentException if {@code radix < Character.MIN_RADIX} or {@code radix >
     Character.MAX_RADIX}
@throws NullPointerException if {@code string} is {@code null}
@since 19.0

