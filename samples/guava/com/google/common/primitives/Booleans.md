# Class: `Booleans`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.Booleans`

## Description

Static utility methods pertaining to `boolean` primitives, that are not already found in
 either `Boolean` or `Arrays`.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/PrimitivesExplained">primitive utilities</a>.
**Author:** Kevin Bourrillion
**Since:** 1.0

## Constructors

### `<init>()`

## Methods

### `trueFirst()`

**Returns:** `java.util.Comparator<java.lang.Boolean>`

Returns a `Comparator<Boolean>` that sorts `true` before `false`.

 <p>This is particularly useful in Java 8+ in combination with `Comparators.comparing`,
 e.g. `Comparators.comparing(Foo::hasBar, trueFirst())`.
**Since:** 21.0

### `falseFirst()`

**Returns:** `java.util.Comparator<java.lang.Boolean>`

Returns a `Comparator<Boolean>` that sorts `false` before `true`.

 <p>This is particularly useful in Java 8+ in combination with `Comparators.comparing`,
 e.g. `Comparators.comparing(Foo::hasBar, falseFirst())`.
**Since:** 21.0

### `hashCode(`boolean` value)`

**Returns:** `int`

Returns a hash code for `value`; equal to the result of invoking `((Boolean)
 value).hashCode()`.

 <p><b>Java 8 users:</b> use `Boolean.hashCode(boolean)` instead.
@param value a primitive `boolean` value
@return a hash code for the value

### `compare(`boolean` a, `boolean` b)`

**Returns:** `int`

Compares the two specified `boolean` values in the standard way (`false` is
 considered less than `true`). The sign of the value returned is the same as that of
 `((Boolean) a).compareTo(b)`.

 <p><b>Note for Java 7 and later:</b> this method should be treated as deprecated; use the
 equivalent `Boolean.compare` method instead.
@param a the first `boolean` to compare
@param b the second `boolean` to compare
@return a positive number if only `a` is `true`, a negative number if only `b` is true, or zero if `a == b`

### `contains(`boolean[]` array, `boolean` target)`

**Returns:** `boolean`

Returns `true` if `target` is present as an element anywhere in `array`.

 <p><b>Note:</b> consider representing the array as a `java.util.BitSet` instead,
 replacing `Booleans.contains(array, true)` with `!bitSet.isEmpty()` and `Booleans.contains(array, false)` with `bitSet.nextClearBit(0) == sizeOfBitSet`.
@param array an array of `boolean` values, possibly empty
@param target a primitive `boolean` value
@return `true` if `array[i] == target` for some value of `i`

### `indexOf(`boolean[]` array, `boolean` target)`

**Returns:** `int`

Returns the index of the first appearance of the value `target` in `array`.

 <p><b>Note:</b> consider representing the array as a `java.util.BitSet` instead, and
 using `java.util.BitSet.nextSetBit(int)` or `java.util.BitSet.nextClearBit(int)`.
@param array an array of `boolean` values, possibly empty
@param target a primitive `boolean` value
@return the least index `i` for which `array[i] == target`, or `-1` if no
     such index exists.

### `indexOf(`boolean[]` array, `boolean` target, `int` start, `int` end)`

**Returns:** `int`

### `indexOf(`boolean[]` array, `boolean[]` target)`

**Returns:** `int`

Returns the start position of the first occurrence of the specified `target` within
 `array`, or `-1` if there is no such occurrence.

 <p>More formally, returns the lowest index `i` such that `Arrays.copyOfRange(array,
 i, i + target.length)` contains exactly the same elements as `target`.
@param array the array to search for the sequence `target`
@param target the array to search for as a sub-sequence of `array`

### `lastIndexOf(`boolean[]` array, `boolean` target)`

**Returns:** `int`

Returns the index of the last appearance of the value `target` in `array`.
@param array an array of `boolean` values, possibly empty
@param target a primitive `boolean` value
@return the greatest index `i` for which `array[i] == target`, or `-1` if no
     such index exists.

### `lastIndexOf(`boolean[]` array, `boolean` target, `int` start, `int` end)`

**Returns:** `int`

### `concat(`boolean[][]` arrays)`

**Returns:** `boolean[]`

Returns the values from each provided array combined into a single array. For example, `concat(new boolean[] {a, b`, new boolean[] {}, new boolean[] {c}} returns the array `{a,
 b, c`}.
@param arrays zero or more `boolean` arrays
@return a single array containing all the values from the source arrays, in order

### `ensureCapacity(`boolean[]` array, `int` minLength, `int` padding)`

**Returns:** `boolean[]`

Returns an array containing the same values as `array`, but guaranteed to be of a
 specified minimum length. If `array` already has a length of at least `minLength`,
 it is returned directly. Otherwise, a new array of size `minLength + padding` is
 returned, containing the values of `array`, and zeroes in the remaining places.
@param array the source array
@param minLength the minimum length the returned array must guarantee
@param padding an extra amount to "grow" the array by if growth is necessary
@throws IllegalArgumentException if `minLength` or `padding` is negative
@return an array containing the values of `array`, with guaranteed minimum length `minLength`

### `join(`java.lang.String` separator, `boolean[]` array)`

**Returns:** `java.lang.String`

Returns a string containing the supplied `boolean` values separated by `separator`.
 For example, `join("-", false, true, false)` returns the string `"false-true-false"`.
@param separator the text that should appear between consecutive values in the resulting string
     (but not at the start or end)
@param array an array of `boolean` values, possibly empty

### `lexicographicalComparator()`

**Returns:** `java.util.Comparator<boolean[]>`

Returns a comparator that compares two `boolean` arrays <a href="http://en.wikipedia.org/wiki/Lexicographical_order">lexicographically</a>. That is, it
 compares, using `compare(boolean, boolean)`), the first pair of values that follow any
 common prefix, or when one array is a prefix of the other, treats the shorter array as the
 lesser. For example, `[] < [false] < [false, true] < [true]`.

 <p>The returned comparator is inconsistent with `Object.equals(Object)` (since arrays
 support only identity equality), but it is consistent with `Arrays.equals(boolean[],
 boolean[])`.
**Since:** 2.0

### `toArray(`java.util.Collection<java.lang.Boolean>` collection)`

**Returns:** `boolean[]`

Copies a collection of `Boolean` instances into a new array of primitive `boolean`
 values.

 <p>Elements are copied from the argument collection as if by `collection.toArray()`.
 Calling this method is as thread-safe as calling that method.

 <p><b>Note:</b> consider representing the collection as a `java.util.BitSet` instead.
@param collection a collection of `Boolean` objects
@return an array containing the same values as `collection`, in the same order, converted
     to primitives
@throws NullPointerException if `collection` or any of its elements is null

### `asList(`boolean[]` backingArray)`

**Returns:** `java.util.List<java.lang.Boolean>`

Returns a fixed-size list backed by the specified array, similar to `Arrays.asList(Object[])`. The list supports `List.set(int, Object)`, but any attempt to
 set a value to `null` will result in a `NullPointerException`.

 <p>There are at most two distinct objects in this list, `(Boolean) true` and `(Boolean) false`. Java guarantees that those are always represented by the same objects.

 <p>The returned list is serializable.
@param backingArray the array to back the list
@return a list view of the array

### `countTrue(`boolean[]` values)`

**Returns:** `int`

Returns the number of `values` that are `true`.
**Since:** 16.0

### `reverse(`boolean[]` array)`

**Returns:** `void`

Reverses the elements of `array`. This is equivalent to `Collections.reverse(Booleans.asList(array))`, but is likely to be more efficient.
**Since:** 23.1

### `reverse(`boolean[]` array, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Reverses the elements of `array` between `fromIndex` inclusive and `toIndex`
 exclusive. This is equivalent to `Collections.reverse(Booleans.asList(array).subList(fromIndex, toIndex))`, but is likely to be
 more efficient.
@throws IndexOutOfBoundsException if `fromIndex < 0`, `toIndex > array.length`, or
     `toIndex > fromIndex`
**Since:** 23.1

### `rotate(`boolean[]` array, `int` distance)`

**Returns:** `void`

Performs a right rotation of `array` of "distance" places, so that the first element is
 moved to index "distance", and the element at index `i` ends up at index `(distance
 + i) mod array.length`. This is equivalent to `Collections.rotate(Booleans.asList(array),
 distance)`, but is somewhat faster.

 <p>The provided "distance" may be negative, which will rotate left.
**Since:** 32.0.0

### `rotate(`boolean[]` array, `int` distance, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Performs a right rotation of `array` between `fromIndex` inclusive and `toIndex` exclusive. This is equivalent to `Collections.rotate(Booleans.asList(array).subList(fromIndex, toIndex), distance)`, but is
 somewhat faster.

 <p>The provided "distance" may be negative, which will rotate left.
@throws IndexOutOfBoundsException if `fromIndex < 0`, `toIndex > array.length`, or
     `toIndex > fromIndex`
**Since:** 32.0.0

