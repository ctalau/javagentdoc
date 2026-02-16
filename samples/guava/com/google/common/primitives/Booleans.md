# Class: `Booleans`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.Booleans`

## Description

Static utility methods pertaining to {@code boolean} primitives, that are not already found in
 either {@link Boolean} or {@link Arrays}.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/PrimitivesExplained">primitive utilities</a>.
@author Kevin Bourrillion
@since 1.0

## Constructors

### `<init>()`

## Methods

### `trueFirst()`

**Returns:** [`java.util.Comparator<java.lang.Boolean>`](../../../../java/util/Comparator.md)

Returns a {@code Comparator<Boolean>} that sorts {@code true} before {@code false}.

 <p>This is particularly useful in Java 8+ in combination with {@code Comparators.comparing},
 e.g. {@code Comparators.comparing(Foo::hasBar, trueFirst())}.
@since 21.0

### `falseFirst()`

**Returns:** [`java.util.Comparator<java.lang.Boolean>`](../../../../java/util/Comparator.md)

Returns a {@code Comparator<Boolean>} that sorts {@code false} before {@code true}.

 <p>This is particularly useful in Java 8+ in combination with {@code Comparators.comparing},
 e.g. {@code Comparators.comparing(Foo::hasBar, falseFirst())}.
@since 21.0

### `hashCode(`boolean` value)`

**Returns:** `int`

Returns a hash code for {@code value}; equal to the result of invoking {@code ((Boolean)
 value).hashCode()}.

 <p><b>Java 8 users:</b> use {@link Boolean#hashCode(boolean)} instead.
@param value a primitive {@code boolean} value
@return a hash code for the value

### `compare(`boolean` a, `boolean` b)`

**Returns:** `int`

Compares the two specified {@code boolean} values in the standard way ({@code false} is
 considered less than {@code true}). The sign of the value returned is the same as that of
 {@code ((Boolean) a).compareTo(b)}.

 <p><b>Note for Java 7 and later:</b> this method should be treated as deprecated; use the
 equivalent {@link Boolean#compare} method instead.
@param a the first {@code boolean} to compare
@param b the second {@code boolean} to compare
@return a positive number if only {@code a} is {@code true}, a negative number if only {@code
     b} is true, or zero if {@code a == b}

### `contains(`boolean[]` array, `boolean` target)`

**Returns:** `boolean`

Returns {@code true} if {@code target} is present as an element anywhere in {@code array}.

 <p><b>Note:</b> consider representing the array as a {@link java.util.BitSet} instead,
 replacing {@code Booleans.contains(array, true)} with {@code !bitSet.isEmpty()} and {@code
 Booleans.contains(array, false)} with {@code bitSet.nextClearBit(0) == sizeOfBitSet}.
@param array an array of {@code boolean} values, possibly empty
@param target a primitive {@code boolean} value
@return {@code true} if {@code array[i] == target} for some value of {@code i}

### `indexOf(`boolean[]` array, `boolean` target)`

**Returns:** `int`

Returns the index of the first appearance of the value {@code target} in {@code array}.

 <p><b>Note:</b> consider representing the array as a {@link java.util.BitSet} instead, and
 using {@link java.util.BitSet#nextSetBit(int)} or {@link java.util.BitSet#nextClearBit(int)}.
@param array an array of {@code boolean} values, possibly empty
@param target a primitive {@code boolean} value
@return the least index {@code i} for which {@code array[i] == target}, or {@code -1} if no
     such index exists.

### `indexOf(`boolean[]` array, `boolean` target, `int` start, `int` end)`

**Returns:** `int`

### `indexOf(`boolean[]` array, `boolean[]` target)`

**Returns:** `int`

Returns the start position of the first occurrence of the specified {@code target} within
 {@code array}, or {@code -1} if there is no such occurrence.

 <p>More formally, returns the lowest index {@code i} such that {@code Arrays.copyOfRange(array,
 i, i + target.length)} contains exactly the same elements as {@code target}.
@param array the array to search for the sequence {@code target}
@param target the array to search for as a sub-sequence of {@code array}

### `lastIndexOf(`boolean[]` array, `boolean` target)`

**Returns:** `int`

Returns the index of the last appearance of the value {@code target} in {@code array}.
@param array an array of {@code boolean} values, possibly empty
@param target a primitive {@code boolean} value
@return the greatest index {@code i} for which {@code array[i] == target}, or {@code -1} if no
     such index exists.

### `lastIndexOf(`boolean[]` array, `boolean` target, `int` start, `int` end)`

**Returns:** `int`

### `concat(`boolean[][]` arrays)`

**Returns:** `boolean[]`

Returns the values from each provided array combined into a single array. For example, {@code
 concat(new boolean[] {a, b}, new boolean[] {}, new boolean[] {c}} returns the array {@code {a,
 b, c}}.
@param arrays zero or more {@code boolean} arrays
@return a single array containing all the values from the source arrays, in order

### `ensureCapacity(`boolean[]` array, `int` minLength, `int` padding)`

**Returns:** `boolean[]`

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

### `join(`java.lang.String` separator, `boolean[]` array)`

**Returns:** `java.lang.String`

Returns a string containing the supplied {@code boolean} values separated by {@code separator}.
 For example, {@code join("-", false, true, false)} returns the string {@code
 "false-true-false"}.
@param separator the text that should appear between consecutive values in the resulting string
     (but not at the start or end)
@param array an array of {@code boolean} values, possibly empty

### `lexicographicalComparator()`

**Returns:** [`java.util.Comparator<boolean[]>`](../../../../java/util/Comparator.md)

Returns a comparator that compares two {@code boolean} arrays <a href="http://en.wikipedia.org/wiki/Lexicographical_order">lexicographically</a>. That is, it
 compares, using {@link #compare(boolean, boolean)}), the first pair of values that follow any
 common prefix, or when one array is a prefix of the other, treats the shorter array as the
 lesser. For example, {@code [] < [false] < [false, true] < [true]}.

 <p>The returned comparator is inconsistent with {@link Object#equals(Object)} (since arrays
 support only identity equality), but it is consistent with {@link Arrays#equals(boolean[],
 boolean[])}.
@since 2.0

### `toArray([`java.util.Collection<java.lang.Boolean>`](../../../../java/util/Collection.md) collection)`

**Returns:** `boolean[]`

Copies a collection of {@code Boolean} instances into a new array of primitive {@code boolean}
 values.

 <p>Elements are copied from the argument collection as if by {@code collection.toArray()}.
 Calling this method is as thread-safe as calling that method.

 <p><b>Note:</b> consider representing the collection as a {@link java.util.BitSet} instead.
@param collection a collection of {@code Boolean} objects
@return an array containing the same values as {@code collection}, in the same order, converted
     to primitives
@throws NullPointerException if {@code collection} or any of its elements is null

### `asList(`boolean[]` backingArray)`

**Returns:** [`java.util.List<java.lang.Boolean>`](../../../../java/util/List.md)

Returns a fixed-size list backed by the specified array, similar to {@link Arrays#asList(Object[])}. The list supports {@link List#set(int, Object)}, but any attempt to
 set a value to {@code null} will result in a {@link NullPointerException}.

 <p>There are at most two distinct objects in this list, {@code (Boolean) true} and {@code
 (Boolean) false}. Java guarantees that those are always represented by the same objects.

 <p>The returned list is serializable.
@param backingArray the array to back the list
@return a list view of the array

### `countTrue(`boolean[]` values)`

**Returns:** `int`

Returns the number of {@code values} that are {@code true}.
@since 16.0

### `reverse(`boolean[]` array)`

**Returns:** `void`

Reverses the elements of {@code array}. This is equivalent to {@code
 Collections.reverse(Booleans.asList(array))}, but is likely to be more efficient.
@since 23.1

### `reverse(`boolean[]` array, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Reverses the elements of {@code array} between {@code fromIndex} inclusive and {@code toIndex}
 exclusive. This is equivalent to {@code
 Collections.reverse(Booleans.asList(array).subList(fromIndex, toIndex))}, but is likely to be
 more efficient.
@throws IndexOutOfBoundsException if {@code fromIndex < 0}, {@code toIndex > array.length}, or
     {@code toIndex > fromIndex}
@since 23.1

### `rotate(`boolean[]` array, `int` distance)`

**Returns:** `void`

Performs a right rotation of {@code array} of "distance" places, so that the first element is
 moved to index "distance", and the element at index {@code i} ends up at index {@code (distance
 + i) mod array.length}. This is equivalent to {@code Collections.rotate(Booleans.asList(array),
 distance)}, but is somewhat faster.

 <p>The provided "distance" may be negative, which will rotate left.
@since 32.0.0

### `rotate(`boolean[]` array, `int` distance, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Performs a right rotation of {@code array} between {@code fromIndex} inclusive and {@code
 toIndex} exclusive. This is equivalent to {@code
 Collections.rotate(Booleans.asList(array).subList(fromIndex, toIndex), distance)}, but is
 somewhat faster.

 <p>The provided "distance" may be negative, which will rotate left.
@throws IndexOutOfBoundsException if {@code fromIndex < 0}, {@code toIndex > array.length}, or
     {@code toIndex > fromIndex}
@since 32.0.0

