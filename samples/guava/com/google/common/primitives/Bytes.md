# Class: `Bytes`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.Bytes`

## Description

Static utility methods pertaining to `byte` primitives, that are not already found in
 either `Byte` or `Arrays`, <i>and interpret bytes as neither signed nor unsigned</i>.
 The methods which specifically treat bytes as signed or unsigned are found in `SignedBytes`
 and `UnsignedBytes`.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/PrimitivesExplained">primitive utilities</a>.
**Author:** Kevin Bourrillion
**Since:** 1.0

## Constructors

### `<init>()`

## Methods

### `hashCode(`byte` value)`

**Returns:** `int`

Returns a hash code for `value`; equal to the result of invoking `((Byte)
 value).hashCode()`.

 <p><b>Java 8 users:</b> use `Byte.hashCode(byte)` instead.
@param value a primitive `byte` value
@return a hash code for the value

### `contains(`byte[]` array, `byte` target)`

**Returns:** `boolean`

Returns `true` if `target` is present as an element anywhere in `array`.
@param array an array of `byte` values, possibly empty
@param target a primitive `byte` value
@return `true` if `array[i] == target` for some value of `i`

### `indexOf(`byte[]` array, `byte` target)`

**Returns:** `int`

Returns the index of the first appearance of the value `target` in `array`.
@param array an array of `byte` values, possibly empty
@param target a primitive `byte` value
@return the least index `i` for which `array[i] == target`, or `-1` if no
     such index exists.

### `indexOf(`byte[]` array, `byte` target, `int` start, `int` end)`

**Returns:** `int`

### `indexOf(`byte[]` array, `byte[]` target)`

**Returns:** `int`

Returns the start position of the first occurrence of the specified `target` within
 `array`, or `-1` if there is no such occurrence.

 <p>More formally, returns the lowest index `i` such that `Arrays.copyOfRange(array,
 i, i + target.length)` contains exactly the same elements as `target`.
@param array the array to search for the sequence `target`
@param target the array to search for as a sub-sequence of `array`

### `lastIndexOf(`byte[]` array, `byte` target)`

**Returns:** `int`

Returns the index of the last appearance of the value `target` in `array`.
@param array an array of `byte` values, possibly empty
@param target a primitive `byte` value
@return the greatest index `i` for which `array[i] == target`, or `-1` if no
     such index exists.

### `lastIndexOf(`byte[]` array, `byte` target, `int` start, `int` end)`

**Returns:** `int`

### `concat(`byte[][]` arrays)`

**Returns:** `byte[]`

Returns the values from each provided array combined into a single array. For example, `concat(new byte[] {a, b`, new byte[] {}, new byte[] {c}} returns the array `{a, b, c`}.
@param arrays zero or more `byte` arrays
@return a single array containing all the values from the source arrays, in order

### `ensureCapacity(`byte[]` array, `int` minLength, `int` padding)`

**Returns:** `byte[]`

Returns an array containing the same values as `array`, but guaranteed to be of a
 specified minimum length. If `array` already has a length of at least `minLength`,
 it is returned directly. Otherwise, a new array of size `minLength + padding` is
 returned, containing the values of `array`, and zeroes in the remaining places.
@param array the source array
@param minLength the minimum length the returned array must guarantee
@param padding an extra amount to "grow" the array by if growth is necessary
@throws IllegalArgumentException if `minLength` or `padding` is negative
@return an array containing the values of `array`, with guaranteed minimum length `minLength`

### `toArray(`java.util.Collection<? extends java.lang.Number>` collection)`

**Returns:** `byte[]`

Returns an array containing each value of `collection`, converted to a `byte` value
 in the manner of `Number.byteValue`.

 <p>Elements are copied from the argument collection as if by `collection.toArray()`.
 Calling this method is as thread-safe as calling that method.
@param collection a collection of `Number` instances
@return an array containing the same values as `collection`, in the same order, converted
     to primitives
@throws NullPointerException if `collection` or any of its elements is null
**Since:** 1.0 (parameter was `Collection<Byte>` before 12.0)

### `asList(`byte[]` backingArray)`

**Returns:** `java.util.List<java.lang.Byte>`

Returns a fixed-size list backed by the specified array, similar to `Arrays.asList(Object[])`. The list supports `List.set(int, Object)`, but any attempt to
 set a value to `null` will result in a `NullPointerException`.

 <p>The returned list maintains the values, but not the identities, of `Byte` objects
 written to or read from it. For example, whether `list.get(0) == list.get(0)` is true for
 the returned list is unspecified.

 <p>The returned list is serializable.
@param backingArray the array to back the list
@return a list view of the array

### `reverse(`byte[]` array)`

**Returns:** `void`

Reverses the elements of `array`. This is equivalent to `Collections.reverse(Bytes.asList(array))`, but is likely to be more efficient.
**Since:** 23.1

### `reverse(`byte[]` array, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Reverses the elements of `array` between `fromIndex` inclusive and `toIndex`
 exclusive. This is equivalent to `Collections.reverse(Bytes.asList(array).subList(fromIndex, toIndex))`, but is likely to be more
 efficient.
@throws IndexOutOfBoundsException if `fromIndex < 0`, `toIndex > array.length`, or
     `toIndex > fromIndex`
**Since:** 23.1

### `rotate(`byte[]` array, `int` distance)`

**Returns:** `void`

Performs a right rotation of `array` of "distance" places, so that the first element is
 moved to index "distance", and the element at index `i` ends up at index `(distance
 + i) mod array.length`. This is equivalent to `Collections.rotate(Bytes.asList(array),
 distance)`, but is somewhat faster.

 <p>The provided "distance" may be negative, which will rotate left.
**Since:** 32.0.0

### `rotate(`byte[]` array, `int` distance, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Performs a right rotation of `array` between `fromIndex` inclusive and `toIndex` exclusive. This is equivalent to `Collections.rotate(Bytes.asList(array).subList(fromIndex, toIndex), distance)`, but is somewhat
 faster.

 <p>The provided "distance" may be negative, which will rotate left.
@throws IndexOutOfBoundsException if `fromIndex < 0`, `toIndex > array.length`, or
     `toIndex > fromIndex`
**Since:** 32.0.0

