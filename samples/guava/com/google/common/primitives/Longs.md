# Class: `Longs`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.Longs`

## Description

Static utility methods pertaining to {@code long} primitives, that are not already found in
 either {@link Long} or {@link Arrays}.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/PrimitivesExplained">primitive utilities</a>.
@author Kevin Bourrillion
@since 1.0

## Fields

### `BYTES`

**Type:** `int`

The number of bytes required to represent a primitive {@code long} value.

 <p><b>Java 8 users:</b> use {@link Long#BYTES} instead.

### `MAX_POWER_OF_TWO`

**Type:** `long`

The largest power of two that can be represented as a {@code long}.
@since 10.0

## Constructors

### `<init>()`

## Methods

### `hashCode(`long` value)`

**Returns:** `int`

Returns a hash code for {@code value}; equal to the result of invoking {@code ((Long)
 value).hashCode()}.

 <p>This method always return the value specified by {@link Long#hashCode()} in java, which
 might be different from {@code ((Long) value).hashCode()} in GWT because {@link Long#hashCode()} in GWT does not obey the JRE contract.

 <p><b>Java 8 users:</b> use {@link Long#hashCode(long)} instead.
@param value a primitive {@code long} value
@return a hash code for the value

### `compare(`long` a, `long` b)`

**Returns:** `int`

Compares the two specified {@code long} values. The sign of the value returned is the same as
 that of {@code ((Long) a).compareTo(b)}.

 <p><b>Note for Java 7 and later:</b> this method should be treated as deprecated; use the
 equivalent {@link Long#compare} method instead.
@param a the first {@code long} to compare
@param b the second {@code long} to compare
@return a negative value if {@code a} is less than {@code b}; a positive value if {@code a} is
     greater than {@code b}; or zero if they are equal

### `contains(`long[]` array, `long` target)`

**Returns:** `boolean`

Returns {@code true} if {@code target} is present as an element anywhere in {@code array}.
@param array an array of {@code long} values, possibly empty
@param target a primitive {@code long} value
@return {@code true} if {@code array[i] == target} for some value of {@code i}

### `indexOf(`long[]` array, `long` target)`

**Returns:** `int`

Returns the index of the first appearance of the value {@code target} in {@code array}.
@param array an array of {@code long} values, possibly empty
@param target a primitive {@code long} value
@return the least index {@code i} for which {@code array[i] == target}, or {@code -1} if no
     such index exists.

### `indexOf(`long[]` array, `long` target, `int` start, `int` end)`

**Returns:** `int`

### `indexOf(`long[]` array, `long[]` target)`

**Returns:** `int`

Returns the start position of the first occurrence of the specified {@code target} within
 {@code array}, or {@code -1} if there is no such occurrence.

 <p>More formally, returns the lowest index {@code i} such that {@code Arrays.copyOfRange(array,
 i, i + target.length)} contains exactly the same elements as {@code target}.
@param array the array to search for the sequence {@code target}
@param target the array to search for as a sub-sequence of {@code array}

### `lastIndexOf(`long[]` array, `long` target)`

**Returns:** `int`

Returns the index of the last appearance of the value {@code target} in {@code array}.
@param array an array of {@code long} values, possibly empty
@param target a primitive {@code long} value
@return the greatest index {@code i} for which {@code array[i] == target}, or {@code -1} if no
     such index exists.

### `lastIndexOf(`long[]` array, `long` target, `int` start, `int` end)`

**Returns:** `int`

### `min(`long[]` array)`

**Returns:** `long`

Returns the least value present in {@code array}.
@param array a <i>nonempty</i> array of {@code long} values
@return the value present in {@code array} that is less than or equal to every other value in
     the array
@throws IllegalArgumentException if {@code array} is empty

### `max(`long[]` array)`

**Returns:** `long`

Returns the greatest value present in {@code array}.
@param array a <i>nonempty</i> array of {@code long} values
@return the value present in {@code array} that is greater than or equal to every other value
     in the array
@throws IllegalArgumentException if {@code array} is empty

### `constrainToRange(`long` value, `long` min, `long` max)`

**Returns:** `long`

Returns the value nearest to {@code value} which is within the closed range {@code [min..max]}.

 <p>If {@code value} is within the range {@code [min..max]}, {@code value} is returned
 unchanged. If {@code value} is less than {@code min}, {@code min} is returned, and if {@code
 value} is greater than {@code max}, {@code max} is returned.
@param value the {@code long} value to constrain
@param min the lower bound (inclusive) of the range to constrain {@code value} to
@param max the upper bound (inclusive) of the range to constrain {@code value} to
@throws IllegalArgumentException if {@code min > max}
@since 21.0

### `concat(`long[][]` arrays)`

**Returns:** `long[]`

Returns the values from each provided array combined into a single array. For example, {@code
 concat(new long[] {a, b}, new long[] {}, new long[] {c}} returns the array {@code {a, b, c}}.
@param arrays zero or more {@code long} arrays
@return a single array containing all the values from the source arrays, in order
@throws IllegalArgumentException if the total number of elements in {@code arrays} does not fit
     in an {@code int}

### `checkNoOverflow(`long` result)`

**Returns:** `int`

### `toByteArray(`long` value)`

**Returns:** `byte[]`

Returns a big-endian representation of {@code value} in an 8-element byte array; equivalent to
 {@code ByteBuffer.allocate(8).putLong(value).array()}. For example, the input value {@code
 0x1213141516171819L} would yield the byte array {@code {0x12, 0x13, 0x14, 0x15, 0x16, 0x17,
 0x18, 0x19}}.

 <p>If you need to convert and concatenate several values (possibly even of different types),
 use a shared {@link java.nio.ByteBuffer} instance, or use {@link com.google.common.io.ByteStreams#newDataOutput()} to get a growable buffer.

### `fromByteArray(`byte[]` bytes)`

**Returns:** `long`

Returns the {@code long} value whose big-endian representation is stored in the first 8 bytes
 of {@code bytes}; equivalent to {@code ByteBuffer.wrap(bytes).getLong()}. For example, the
 input byte array {@code {0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19}} would yield the
 {@code long} value {@code 0x1213141516171819L}.

 <p>Arguably, it's preferable to use {@link java.nio.ByteBuffer}; that library exposes much more
 flexibility at little cost in readability.
@throws IllegalArgumentException if {@code bytes} has fewer than 8 elements

### `fromBytes(`byte` b1, `byte` b2, `byte` b3, `byte` b4, `byte` b5, `byte` b6, `byte` b7, `byte` b8)`

**Returns:** `long`

Returns the {@code long} value whose byte representation is the given 8 bytes, in big-endian
 order; equivalent to {@code Longs.fromByteArray(new byte[] {b1, b2, b3, b4, b5, b6, b7, b8})}.
@since 7.0

### `tryParse(`java.lang.String` string)`

**Returns:** `java.lang.Long`

Parses the specified string as a signed decimal long value. The ASCII character {@code '-'} (
 <code>'&#92;u002D'</code>) is recognized as the minus sign.

 <p>Unlike {@link Long#parseLong(String)}, this method returns {@code null} instead of throwing
 an exception if parsing fails. Additionally, this method only accepts ASCII digits, and returns
 {@code null} if non-ASCII digits are present in the string.

 <p>Note that strings prefixed with ASCII {@code '+'} are rejected, even under JDK 7, despite
 the change to {@link Long#parseLong(String)} for that version.
@param string the string representation of a long value
@return the long value represented by {@code string}, or {@code null} if {@code string} has a
     length of zero or cannot be parsed as a long value
@throws NullPointerException if {@code string} is {@code null}
@since 14.0

### `tryParse(`java.lang.String` string, `int` radix)`

**Returns:** `java.lang.Long`

Parses the specified string as a signed long value using the specified radix. The ASCII
 character {@code '-'} (<code>'&#92;u002D'</code>) is recognized as the minus sign.

 <p>Unlike {@link Long#parseLong(String, int)}, this method returns {@code null} instead of
 throwing an exception if parsing fails. Additionally, this method only accepts ASCII digits,
 and returns {@code null} if non-ASCII digits are present in the string.

 <p>Note that strings prefixed with ASCII {@code '+'} are rejected, even under JDK 7, despite
 the change to {@link Long#parseLong(String, int)} for that version.
@param string the string representation of a long value
@param radix the radix to use when parsing
@return the long value represented by {@code string} using {@code radix}, or {@code null} if
     {@code string} has a length of zero or cannot be parsed as a long value
@throws IllegalArgumentException if {@code radix < Character.MIN_RADIX} or {@code radix >
     Character.MAX_RADIX}
@throws NullPointerException if {@code string} is {@code null}
@since 19.0

### `stringConverter()`

**Returns:** [`com.google.common.base.Converter<java.lang.String,java.lang.Long>`](../base/Converter.md)

Returns a serializable converter object that converts between strings and longs using {@link Long#decode} and {@link Long#toString()}. The returned converter throws {@link NumberFormatException} if the input string is invalid.

 <p><b>Warning:</b> please see {@link Long#decode} to understand exactly how strings are parsed.
 For example, the string {@code "0123"} is treated as <i>octal</i> and converted to the value
 {@code 83L}.
@since 16.0

### `ensureCapacity(`long[]` array, `int` minLength, `int` padding)`

**Returns:** `long[]`

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

### `join(`java.lang.String` separator, `long[]` array)`

**Returns:** `java.lang.String`

Returns a string containing the supplied {@code long} values separated by {@code separator}.
 For example, {@code join("-", 1L, 2L, 3L)} returns the string {@code "1-2-3"}.
@param separator the text that should appear between consecutive values in the resulting string
     (but not at the start or end)
@param array an array of {@code long} values, possibly empty

### `lexicographicalComparator()`

**Returns:** [`java.util.Comparator<long[]>`](../../../../java/util/Comparator.md)

Returns a comparator that compares two {@code long} arrays <a href="http://en.wikipedia.org/wiki/Lexicographical_order">lexicographically</a>. That is, it
 compares, using {@link #compare(long, long)}), the first pair of values that follow any common
 prefix, or when one array is a prefix of the other, treats the shorter array as the lesser. For
 example, {@code [] < [1L] < [1L, 2L] < [2L]}.

 <p>The returned comparator is inconsistent with {@link Object#equals(Object)} (since arrays
 support only identity equality), but it is consistent with {@link Arrays#equals(long[],
 long[])}.
@since 2.0

### `sortDescending(`long[]` array)`

**Returns:** `void`

Sorts the elements of {@code array} in descending order.
@since 23.1

### `sortDescending(`long[]` array, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Sorts the elements of {@code array} between {@code fromIndex} inclusive and {@code toIndex}
 exclusive in descending order.
@since 23.1

### `reverse(`long[]` array)`

**Returns:** `void`

Reverses the elements of {@code array}. This is equivalent to {@code
 Collections.reverse(Longs.asList(array))}, but is likely to be more efficient.
@since 23.1

### `reverse(`long[]` array, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Reverses the elements of {@code array} between {@code fromIndex} inclusive and {@code toIndex}
 exclusive. This is equivalent to {@code
 Collections.reverse(Longs.asList(array).subList(fromIndex, toIndex))}, but is likely to be more
 efficient.
@throws IndexOutOfBoundsException if {@code fromIndex < 0}, {@code toIndex > array.length}, or
     {@code toIndex > fromIndex}
@since 23.1

### `rotate(`long[]` array, `int` distance)`

**Returns:** `void`

Performs a right rotation of {@code array} of "distance" places, so that the first element is
 moved to index "distance", and the element at index {@code i} ends up at index {@code (distance
 + i) mod array.length}. This is equivalent to {@code Collections.rotate(Longs.asList(array),
 distance)}, but is considerably faster and avoids allocation and garbage collection.

 <p>The provided "distance" may be negative, which will rotate left.
@since 32.0.0

### `rotate(`long[]` array, `int` distance, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Performs a right rotation of {@code array} between {@code fromIndex} inclusive and {@code
 toIndex} exclusive. This is equivalent to {@code
 Collections.rotate(Longs.asList(array).subList(fromIndex, toIndex), distance)}, but is
 considerably faster and avoids allocations and garbage collection.

 <p>The provided "distance" may be negative, which will rotate left.
@throws IndexOutOfBoundsException if {@code fromIndex < 0}, {@code toIndex > array.length}, or
     {@code toIndex > fromIndex}
@since 32.0.0

### `toArray([`java.util.Collection<? extends java.lang.Number>`](../../../../java/util/Collection.md) collection)`

**Returns:** `long[]`

Returns an array containing each value of {@code collection}, converted to a {@code long} value
 in the manner of {@link Number#longValue}.

 <p>Elements are copied from the argument collection as if by {@code collection.toArray()}.
 Calling this method is as thread-safe as calling that method.
@param collection a collection of {@code Number} instances
@return an array containing the same values as {@code collection}, in the same order, converted
     to primitives
@throws NullPointerException if {@code collection} or any of its elements is null
@since 1.0 (parameter was {@code Collection<Long>} before 12.0)

### `asList(`long[]` backingArray)`

**Returns:** [`java.util.List<java.lang.Long>`](../../../../java/util/List.md)

Returns a fixed-size list backed by the specified array, similar to {@link Arrays#asList(Object[])}. The list supports {@link List#set(int, Object)}, but any attempt to
 set a value to {@code null} will result in a {@link NullPointerException}.

 <p>The returned list maintains the values, but not the identities, of {@code Long} objects
 written to or read from it. For example, whether {@code list.get(0) == list.get(0)} is true for
 the returned list is unspecified.

 <p>The returned list is serializable.

 <p><b>Note:</b> when possible, you should represent your data as an {@link ImmutableLongArray}
 instead, which has an {@link ImmutableLongArray#asList asList} view.
@param backingArray the array to back the list
@return a list view of the array

