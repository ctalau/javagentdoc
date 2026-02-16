# Class: `Chars`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.Chars`

## Description

Static utility methods pertaining to {@code char} primitives, that are not already found in
 either {@link Character} or {@link Arrays}.

 <p>All the operations in this class treat {@code char} values strictly numerically; they are
 neither Unicode-aware nor locale-dependent.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/PrimitivesExplained">primitive utilities</a>.
@author Kevin Bourrillion
@since 1.0

## Fields

### `BYTES`

**Type:** `int`

The number of bytes required to represent a primitive {@code char} value.

 <p><b>Java 8 users:</b> use {@link Character#BYTES} instead.

## Constructors

### `<init>()`

## Methods

### `hashCode(`char` value)`

**Returns:** `int`

Returns a hash code for {@code value}; equal to the result of invoking {@code ((Character)
 value).hashCode()}.

 <p><b>Java 8 users:</b> use {@link Character#hashCode(char)} instead.
@param value a primitive {@code char} value
@return a hash code for the value

### `checkedCast(`long` value)`

**Returns:** `char`

Returns the {@code char} value that is equal to {@code value}, if possible.
@param value any value in the range of the {@code char} type
@return the {@code char} value that equals {@code value}
@throws IllegalArgumentException if {@code value} is greater than {@link Character#MAX_VALUE}
     or less than {@link Character#MIN_VALUE}

### `saturatedCast(`long` value)`

**Returns:** `char`

Returns the {@code char} nearest in value to {@code value}.
@param value any {@code long} value
@return the same value cast to {@code char} if it is in the range of the {@code char} type,
     {@link Character#MAX_VALUE} if it is too large, or {@link Character#MIN_VALUE} if it is too
     small

### `compare(`char` a, `char` b)`

**Returns:** `int`

Compares the two specified {@code char} values. The sign of the value returned is the same as
 that of {@code ((Character) a).compareTo(b)}.

 <p><b>Note for Java 7 and later:</b> this method should be treated as deprecated; use the
 equivalent {@link Character#compare} method instead.
@param a the first {@code char} to compare
@param b the second {@code char} to compare
@return a negative value if {@code a} is less than {@code b}; a positive value if {@code a} is
     greater than {@code b}; or zero if they are equal

### `contains(`char[]` array, `char` target)`

**Returns:** `boolean`

Returns {@code true} if {@code target} is present as an element anywhere in {@code array}.
@param array an array of {@code char} values, possibly empty
@param target a primitive {@code char} value
@return {@code true} if {@code array[i] == target} for some value of {@code i}

### `indexOf(`char[]` array, `char` target)`

**Returns:** `int`

Returns the index of the first appearance of the value {@code target} in {@code array}.
@param array an array of {@code char} values, possibly empty
@param target a primitive {@code char} value
@return the least index {@code i} for which {@code array[i] == target}, or {@code -1} if no
     such index exists.

### `indexOf(`char[]` array, `char` target, `int` start, `int` end)`

**Returns:** `int`

### `indexOf(`char[]` array, `char[]` target)`

**Returns:** `int`

Returns the start position of the first occurrence of the specified {@code target} within
 {@code array}, or {@code -1} if there is no such occurrence.

 <p>More formally, returns the lowest index {@code i} such that {@code Arrays.copyOfRange(array,
 i, i + target.length)} contains exactly the same elements as {@code target}.
@param array the array to search for the sequence {@code target}
@param target the array to search for as a sub-sequence of {@code array}

### `lastIndexOf(`char[]` array, `char` target)`

**Returns:** `int`

Returns the index of the last appearance of the value {@code target} in {@code array}.
@param array an array of {@code char} values, possibly empty
@param target a primitive {@code char} value
@return the greatest index {@code i} for which {@code array[i] == target}, or {@code -1} if no
     such index exists.

### `lastIndexOf(`char[]` array, `char` target, `int` start, `int` end)`

**Returns:** `int`

### `min(`char[]` array)`

**Returns:** `char`

Returns the least value present in {@code array}.
@param array a <i>nonempty</i> array of {@code char} values
@return the value present in {@code array} that is less than or equal to every other value in
     the array
@throws IllegalArgumentException if {@code array} is empty

### `max(`char[]` array)`

**Returns:** `char`

Returns the greatest value present in {@code array}.
@param array a <i>nonempty</i> array of {@code char} values
@return the value present in {@code array} that is greater than or equal to every other value
     in the array
@throws IllegalArgumentException if {@code array} is empty

### `constrainToRange(`char` value, `char` min, `char` max)`

**Returns:** `char`

Returns the value nearest to {@code value} which is within the closed range {@code [min..max]}.

 <p>If {@code value} is within the range {@code [min..max]}, {@code value} is returned
 unchanged. If {@code value} is less than {@code min}, {@code min} is returned, and if {@code
 value} is greater than {@code max}, {@code max} is returned.
@param value the {@code char} value to constrain
@param min the lower bound (inclusive) of the range to constrain {@code value} to
@param max the upper bound (inclusive) of the range to constrain {@code value} to
@throws IllegalArgumentException if {@code min > max}
@since 21.0

### `concat(`char[][]` arrays)`

**Returns:** `char[]`

Returns the values from each provided array combined into a single array. For example, {@code
 concat(new char[] {a, b}, new char[] {}, new char[] {c}} returns the array {@code {a, b, c}}.
@param arrays zero or more {@code char} arrays
@return a single array containing all the values from the source arrays, in order

### `toByteArray(`char` value)`

**Returns:** `byte[]`

Returns a big-endian representation of {@code value} in a 2-element byte array; equivalent to
 {@code ByteBuffer.allocate(2).putChar(value).array()}. For example, the input value {@code
 '\\u5432'} would yield the byte array {@code {0x54, 0x32}}.

 <p>If you need to convert and concatenate several values (possibly even of different types),
 use a shared {@link java.nio.ByteBuffer} instance, or use {@link com.google.common.io.ByteStreams#newDataOutput()} to get a growable buffer.

### `fromByteArray(`byte[]` bytes)`

**Returns:** `char`

Returns the {@code char} value whose big-endian representation is stored in the first 2 bytes
 of {@code bytes}; equivalent to {@code ByteBuffer.wrap(bytes).getChar()}. For example, the
 input byte array {@code {0x54, 0x32}} would yield the {@code char} value {@code '\\u5432'}.

 <p>Arguably, it's preferable to use {@link java.nio.ByteBuffer}; that library exposes much more
 flexibility at little cost in readability.
@throws IllegalArgumentException if {@code bytes} has fewer than 2 elements

### `fromBytes(`byte` b1, `byte` b2)`

**Returns:** `char`

Returns the {@code char} value whose byte representation is the given 2 bytes, in big-endian
 order; equivalent to {@code Chars.fromByteArray(new byte[] {b1, b2})}.
@since 7.0

### `ensureCapacity(`char[]` array, `int` minLength, `int` padding)`

**Returns:** `char[]`

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

### `join(`java.lang.String` separator, `char[]` array)`

**Returns:** `java.lang.String`

Returns a string containing the supplied {@code char} values separated by {@code separator}.
 For example, {@code join("-", '1', '2', '3')} returns the string {@code "1-2-3"}.
@param separator the text that should appear between consecutive values in the resulting string
     (but not at the start or end)
@param array an array of {@code char} values, possibly empty

### `lexicographicalComparator()`

**Returns:** [`java.util.Comparator<char[]>`](../../../../java/util/Comparator.md)

Returns a comparator that compares two {@code char} arrays <a href="http://en.wikipedia.org/wiki/Lexicographical_order">lexicographically</a>; not advisable
 for sorting user-visible strings as the ordering may not match the conventions of the user's
 locale. That is, it compares, using {@link #compare(char, char)}), the first pair of values
 that follow any common prefix, or when one array is a prefix of the other, treats the shorter
 array as the lesser. For example, {@code [] < ['a'] < ['a', 'b'] < ['b']}.

 <p>The returned comparator is inconsistent with {@link Object#equals(Object)} (since arrays
 support only identity equality), but it is consistent with {@link Arrays#equals(char[],
 char[])}.
@since 2.0

### `toArray([`java.util.Collection<java.lang.Character>`](../../../../java/util/Collection.md) collection)`

**Returns:** `char[]`

Copies a collection of {@code Character} instances into a new array of primitive {@code char}
 values.

 <p>Elements are copied from the argument collection as if by {@code collection.toArray()}.
 Calling this method is as thread-safe as calling that method.
@param collection a collection of {@code Character} objects
@return an array containing the same values as {@code collection}, in the same order, converted
     to primitives
@throws NullPointerException if {@code collection} or any of its elements is null

### `sortDescending(`char[]` array)`

**Returns:** `void`

Sorts the elements of {@code array} in descending order.
@since 23.1

### `sortDescending(`char[]` array, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Sorts the elements of {@code array} between {@code fromIndex} inclusive and {@code toIndex}
 exclusive in descending order.
@since 23.1

### `reverse(`char[]` array)`

**Returns:** `void`

Reverses the elements of {@code array}. This is equivalent to {@code
 Collections.reverse(Chars.asList(array))}, but is likely to be more efficient.
@since 23.1

### `reverse(`char[]` array, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Reverses the elements of {@code array} between {@code fromIndex} inclusive and {@code toIndex}
 exclusive. This is equivalent to {@code
 Collections.reverse(Chars.asList(array).subList(fromIndex, toIndex))}, but is likely to be more
 efficient.
@throws IndexOutOfBoundsException if {@code fromIndex < 0}, {@code toIndex > array.length}, or
     {@code toIndex > fromIndex}
@since 23.1

### `rotate(`char[]` array, `int` distance)`

**Returns:** `void`

Performs a right rotation of {@code array} of "distance" places, so that the first element is
 moved to index "distance", and the element at index {@code i} ends up at index {@code (distance
 + i) mod array.length}. This is equivalent to {@code Collections.rotate(Chars.asList(array),
 distance)}, but is considerably faster and avoids allocation and garbage collection.

 <p>The provided "distance" may be negative, which will rotate left.
@since 32.0.0

### `rotate(`char[]` array, `int` distance, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Performs a right rotation of {@code array} between {@code fromIndex} inclusive and {@code
 toIndex} exclusive. This is equivalent to {@code
 Collections.rotate(Chars.asList(array).subList(fromIndex, toIndex), distance)}, but is
 considerably faster and avoids allocations and garbage collection.

 <p>The provided "distance" may be negative, which will rotate left.
@throws IndexOutOfBoundsException if {@code fromIndex < 0}, {@code toIndex > array.length}, or
     {@code toIndex > fromIndex}
@since 32.0.0

### `asList(`char[]` backingArray)`

**Returns:** [`java.util.List<java.lang.Character>`](../../../../java/util/List.md)

Returns a fixed-size list backed by the specified array, similar to {@link Arrays#asList(Object[])}. The list supports {@link List#set(int, Object)}, but any attempt to
 set a value to {@code null} will result in a {@link NullPointerException}.

 <p>The returned list maintains the values, but not the identities, of {@code Character} objects
 written to or read from it. For example, whether {@code list.get(0) == list.get(0)} is true for
 the returned list is unspecified.

 <p>The returned list is serializable.
@param backingArray the array to back the list
@return a list view of the array

