# Class: `Chars`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.Chars`

## Description

Static utility methods pertaining to `char` primitives, that are not already found in
 either `Character` or `Arrays`.

 <p>All the operations in this class treat `char` values strictly numerically; they are
 neither Unicode-aware nor locale-dependent.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/PrimitivesExplained">primitive utilities</a>.
**Author:** Kevin Bourrillion
**Since:** 1.0

## Fields

### `BYTES`

**Type:** `int`

The number of bytes required to represent a primitive `char` value.

 <p><b>Java 8 users:</b> use `Character.BYTES` instead.

## Constructors

### `<init>()`

## Methods

### `hashCode(`char` value)`

**Returns:** `int`

Returns a hash code for `value`; equal to the result of invoking `((Character)
 value).hashCode()`.

 <p><b>Java 8 users:</b> use `Character.hashCode(char)` instead.
@param value a primitive `char` value
@return a hash code for the value

### `checkedCast(`long` value)`

**Returns:** `char`

Returns the `char` value that is equal to `value`, if possible.
@param value any value in the range of the `char` type
@return the `char` value that equals `value`
@throws IllegalArgumentException if `value` is greater than `Character.MAX_VALUE`
     or less than `Character.MIN_VALUE`

### `saturatedCast(`long` value)`

**Returns:** `char`

Returns the `char` nearest in value to `value`.
@param value any `long` value
@return the same value cast to `char` if it is in the range of the `char` type,
     `Character.MAX_VALUE` if it is too large, or `Character.MIN_VALUE` if it is too
     small

### `compare(`char` a, `char` b)`

**Returns:** `int`

Compares the two specified `char` values. The sign of the value returned is the same as
 that of `((Character) a).compareTo(b)`.

 <p><b>Note for Java 7 and later:</b> this method should be treated as deprecated; use the
 equivalent `Character.compare` method instead.
@param a the first `char` to compare
@param b the second `char` to compare
@return a negative value if `a` is less than `b`; a positive value if `a` is
     greater than `b`; or zero if they are equal

### `contains(`char[]` array, `char` target)`

**Returns:** `boolean`

Returns `true` if `target` is present as an element anywhere in `array`.
@param array an array of `char` values, possibly empty
@param target a primitive `char` value
@return `true` if `array[i] == target` for some value of `i`

### `indexOf(`char[]` array, `char` target)`

**Returns:** `int`

Returns the index of the first appearance of the value `target` in `array`.
@param array an array of `char` values, possibly empty
@param target a primitive `char` value
@return the least index `i` for which `array[i] == target`, or `-1` if no
     such index exists.

### `indexOf(`char[]` array, `char` target, `int` start, `int` end)`

**Returns:** `int`

### `indexOf(`char[]` array, `char[]` target)`

**Returns:** `int`

Returns the start position of the first occurrence of the specified `target` within
 `array`, or `-1` if there is no such occurrence.

 <p>More formally, returns the lowest index `i` such that `Arrays.copyOfRange(array,
 i, i + target.length)` contains exactly the same elements as `target`.
@param array the array to search for the sequence `target`
@param target the array to search for as a sub-sequence of `array`

### `lastIndexOf(`char[]` array, `char` target)`

**Returns:** `int`

Returns the index of the last appearance of the value `target` in `array`.
@param array an array of `char` values, possibly empty
@param target a primitive `char` value
@return the greatest index `i` for which `array[i] == target`, or `-1` if no
     such index exists.

### `lastIndexOf(`char[]` array, `char` target, `int` start, `int` end)`

**Returns:** `int`

### `min(`char[]` array)`

**Returns:** `char`

Returns the least value present in `array`.
@param array a <i>nonempty</i> array of `char` values
@return the value present in `array` that is less than or equal to every other value in
     the array
@throws IllegalArgumentException if `array` is empty

### `max(`char[]` array)`

**Returns:** `char`

Returns the greatest value present in `array`.
@param array a <i>nonempty</i> array of `char` values
@return the value present in `array` that is greater than or equal to every other value
     in the array
@throws IllegalArgumentException if `array` is empty

### `constrainToRange(`char` value, `char` min, `char` max)`

**Returns:** `char`

Returns the value nearest to `value` which is within the closed range `[min..max]`.

 <p>If `value` is within the range `[min..max]`, `value` is returned
 unchanged. If `value` is less than `min`, `min` is returned, and if `value` is greater than `max`, `max` is returned.
@param value the `char` value to constrain
@param min the lower bound (inclusive) of the range to constrain `value` to
@param max the upper bound (inclusive) of the range to constrain `value` to
@throws IllegalArgumentException if `min > max`
**Since:** 21.0

### `concat(`char[][]` arrays)`

**Returns:** `char[]`

Returns the values from each provided array combined into a single array. For example, `concat(new char[] {a, b`, new char[] {}, new char[] {c}} returns the array `{a, b, c`}.
@param arrays zero or more `char` arrays
@return a single array containing all the values from the source arrays, in order

### `toByteArray(`char` value)`

**Returns:** `byte[]`

Returns a big-endian representation of `value` in a 2-element byte array; equivalent to
 `ByteBuffer.allocate(2).putChar(value).array()`. For example, the input value `'\\u5432'` would yield the byte array `{0x54, 0x32`}.

 <p>If you need to convert and concatenate several values (possibly even of different types),
 use a shared `java.nio.ByteBuffer` instance, or use `com.google.common.io.ByteStreams.newDataOutput()` to get a growable buffer.

### `fromByteArray(`byte[]` bytes)`

**Returns:** `char`

Returns the `char` value whose big-endian representation is stored in the first 2 bytes
 of `bytes`; equivalent to `ByteBuffer.wrap(bytes).getChar()`. For example, the
 input byte array `{0x54, 0x32`} would yield the `char` value `'\\u5432'`.

 <p>Arguably, it's preferable to use `java.nio.ByteBuffer`; that library exposes much more
 flexibility at little cost in readability.
@throws IllegalArgumentException if `bytes` has fewer than 2 elements

### `fromBytes(`byte` b1, `byte` b2)`

**Returns:** `char`

Returns the `char` value whose byte representation is the given 2 bytes, in big-endian
 order; equivalent to `Chars.fromByteArray(new byte[] {b1, b2`)}.
**Since:** 7.0

### `ensureCapacity(`char[]` array, `int` minLength, `int` padding)`

**Returns:** `char[]`

Returns an array containing the same values as `array`, but guaranteed to be of a
 specified minimum length. If `array` already has a length of at least `minLength`,
 it is returned directly. Otherwise, a new array of size `minLength + padding` is
 returned, containing the values of `array`, and zeroes in the remaining places.
@param array the source array
@param minLength the minimum length the returned array must guarantee
@param padding an extra amount to "grow" the array by if growth is necessary
@throws IllegalArgumentException if `minLength` or `padding` is negative
@return an array containing the values of `array`, with guaranteed minimum length `minLength`

### `join(`java.lang.String` separator, `char[]` array)`

**Returns:** `java.lang.String`

Returns a string containing the supplied `char` values separated by `separator`.
 For example, `join("-", '1', '2', '3')` returns the string `"1-2-3"`.
@param separator the text that should appear between consecutive values in the resulting string
     (but not at the start or end)
@param array an array of `char` values, possibly empty

### `lexicographicalComparator()`

**Returns:** `java.util.Comparator<char[]>`

Returns a comparator that compares two `char` arrays <a href="http://en.wikipedia.org/wiki/Lexicographical_order">lexicographically</a>; not advisable
 for sorting user-visible strings as the ordering may not match the conventions of the user's
 locale. That is, it compares, using `compare(char, char)`), the first pair of values
 that follow any common prefix, or when one array is a prefix of the other, treats the shorter
 array as the lesser. For example, `[] < ['a'] < ['a', 'b'] < ['b']`.

 <p>The returned comparator is inconsistent with `Object.equals(Object)` (since arrays
 support only identity equality), but it is consistent with `Arrays.equals(char[],
 char[])`.
**Since:** 2.0

### `toArray(`java.util.Collection<java.lang.Character>` collection)`

**Returns:** `char[]`

Copies a collection of `Character` instances into a new array of primitive `char`
 values.

 <p>Elements are copied from the argument collection as if by `collection.toArray()`.
 Calling this method is as thread-safe as calling that method.
@param collection a collection of `Character` objects
@return an array containing the same values as `collection`, in the same order, converted
     to primitives
@throws NullPointerException if `collection` or any of its elements is null

### `sortDescending(`char[]` array)`

**Returns:** `void`

Sorts the elements of `array` in descending order.
**Since:** 23.1

### `sortDescending(`char[]` array, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Sorts the elements of `array` between `fromIndex` inclusive and `toIndex`
 exclusive in descending order.
**Since:** 23.1

### `reverse(`char[]` array)`

**Returns:** `void`

Reverses the elements of `array`. This is equivalent to `Collections.reverse(Chars.asList(array))`, but is likely to be more efficient.
**Since:** 23.1

### `reverse(`char[]` array, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Reverses the elements of `array` between `fromIndex` inclusive and `toIndex`
 exclusive. This is equivalent to `Collections.reverse(Chars.asList(array).subList(fromIndex, toIndex))`, but is likely to be more
 efficient.
@throws IndexOutOfBoundsException if `fromIndex < 0`, `toIndex > array.length`, or
     `toIndex > fromIndex`
**Since:** 23.1

### `rotate(`char[]` array, `int` distance)`

**Returns:** `void`

Performs a right rotation of `array` of "distance" places, so that the first element is
 moved to index "distance", and the element at index `i` ends up at index `(distance
 + i) mod array.length`. This is equivalent to `Collections.rotate(Chars.asList(array),
 distance)`, but is considerably faster and avoids allocation and garbage collection.

 <p>The provided "distance" may be negative, which will rotate left.
**Since:** 32.0.0

### `rotate(`char[]` array, `int` distance, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Performs a right rotation of `array` between `fromIndex` inclusive and `toIndex` exclusive. This is equivalent to `Collections.rotate(Chars.asList(array).subList(fromIndex, toIndex), distance)`, but is
 considerably faster and avoids allocations and garbage collection.

 <p>The provided "distance" may be negative, which will rotate left.
@throws IndexOutOfBoundsException if `fromIndex < 0`, `toIndex > array.length`, or
     `toIndex > fromIndex`
**Since:** 32.0.0

### `asList(`char[]` backingArray)`

**Returns:** `java.util.List<java.lang.Character>`

Returns a fixed-size list backed by the specified array, similar to `Arrays.asList(Object[])`. The list supports `List.set(int, Object)`, but any attempt to
 set a value to `null` will result in a `NullPointerException`.

 <p>The returned list maintains the values, but not the identities, of `Character` objects
 written to or read from it. For example, whether `list.get(0) == list.get(0)` is true for
 the returned list is unspecified.

 <p>The returned list is serializable.
@param backingArray the array to back the list
@return a list view of the array

