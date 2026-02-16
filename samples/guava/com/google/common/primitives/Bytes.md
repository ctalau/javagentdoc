# Class: `Bytes`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.Bytes`

## Description

Static utility methods pertaining to {@code byte} primitives, that are not already found in
 either {@link Byte} or {@link Arrays}, <i>and interpret bytes as neither signed nor unsigned</i>.
 The methods which specifically treat bytes as signed or unsigned are found in {@link SignedBytes}
 and {@link UnsignedBytes}.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/PrimitivesExplained">primitive utilities</a>.
@author Kevin Bourrillion
@since 1.0

## Constructors

### `<init>()`

## Methods

### `hashCode(`byte` value)`

**Returns:** `int`

Returns a hash code for {@code value}; equal to the result of invoking {@code ((Byte)
 value).hashCode()}.

 <p><b>Java 8 users:</b> use {@link Byte#hashCode(byte)} instead.
@param value a primitive {@code byte} value
@return a hash code for the value

### `contains(`byte[]` array, `byte` target)`

**Returns:** `boolean`

Returns {@code true} if {@code target} is present as an element anywhere in {@code array}.
@param array an array of {@code byte} values, possibly empty
@param target a primitive {@code byte} value
@return {@code true} if {@code array[i] == target} for some value of {@code i}

### `indexOf(`byte[]` array, `byte` target)`

**Returns:** `int`

Returns the index of the first appearance of the value {@code target} in {@code array}.
@param array an array of {@code byte} values, possibly empty
@param target a primitive {@code byte} value
@return the least index {@code i} for which {@code array[i] == target}, or {@code -1} if no
     such index exists.

### `indexOf(`byte[]` array, `byte` target, `int` start, `int` end)`

**Returns:** `int`

### `indexOf(`byte[]` array, `byte[]` target)`

**Returns:** `int`

Returns the start position of the first occurrence of the specified {@code target} within
 {@code array}, or {@code -1} if there is no such occurrence.

 <p>More formally, returns the lowest index {@code i} such that {@code Arrays.copyOfRange(array,
 i, i + target.length)} contains exactly the same elements as {@code target}.
@param array the array to search for the sequence {@code target}
@param target the array to search for as a sub-sequence of {@code array}

### `lastIndexOf(`byte[]` array, `byte` target)`

**Returns:** `int`

Returns the index of the last appearance of the value {@code target} in {@code array}.
@param array an array of {@code byte} values, possibly empty
@param target a primitive {@code byte} value
@return the greatest index {@code i} for which {@code array[i] == target}, or {@code -1} if no
     such index exists.

### `lastIndexOf(`byte[]` array, `byte` target, `int` start, `int` end)`

**Returns:** `int`

### `concat(`byte[][]` arrays)`

**Returns:** `byte[]`

Returns the values from each provided array combined into a single array. For example, {@code
 concat(new byte[] {a, b}, new byte[] {}, new byte[] {c}} returns the array {@code {a, b, c}}.
@param arrays zero or more {@code byte} arrays
@return a single array containing all the values from the source arrays, in order

### `ensureCapacity(`byte[]` array, `int` minLength, `int` padding)`

**Returns:** `byte[]`

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

### `toArray([`java.util.Collection<? extends java.lang.Number>`](../../../../java/util/Collection.md) collection)`

**Returns:** `byte[]`

Returns an array containing each value of {@code collection}, converted to a {@code byte} value
 in the manner of {@link Number#byteValue}.

 <p>Elements are copied from the argument collection as if by {@code collection.toArray()}.
 Calling this method is as thread-safe as calling that method.
@param collection a collection of {@code Number} instances
@return an array containing the same values as {@code collection}, in the same order, converted
     to primitives
@throws NullPointerException if {@code collection} or any of its elements is null
@since 1.0 (parameter was {@code Collection<Byte>} before 12.0)

### `asList(`byte[]` backingArray)`

**Returns:** [`java.util.List<java.lang.Byte>`](../../../../java/util/List.md)

Returns a fixed-size list backed by the specified array, similar to {@link Arrays#asList(Object[])}. The list supports {@link List#set(int, Object)}, but any attempt to
 set a value to {@code null} will result in a {@link NullPointerException}.

 <p>The returned list maintains the values, but not the identities, of {@code Byte} objects
 written to or read from it. For example, whether {@code list.get(0) == list.get(0)} is true for
 the returned list is unspecified.

 <p>The returned list is serializable.
@param backingArray the array to back the list
@return a list view of the array

### `reverse(`byte[]` array)`

**Returns:** `void`

Reverses the elements of {@code array}. This is equivalent to {@code
 Collections.reverse(Bytes.asList(array))}, but is likely to be more efficient.
@since 23.1

### `reverse(`byte[]` array, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Reverses the elements of {@code array} between {@code fromIndex} inclusive and {@code toIndex}
 exclusive. This is equivalent to {@code
 Collections.reverse(Bytes.asList(array).subList(fromIndex, toIndex))}, but is likely to be more
 efficient.
@throws IndexOutOfBoundsException if {@code fromIndex < 0}, {@code toIndex > array.length}, or
     {@code toIndex > fromIndex}
@since 23.1

### `rotate(`byte[]` array, `int` distance)`

**Returns:** `void`

Performs a right rotation of {@code array} of "distance" places, so that the first element is
 moved to index "distance", and the element at index {@code i} ends up at index {@code (distance
 + i) mod array.length}. This is equivalent to {@code Collections.rotate(Bytes.asList(array),
 distance)}, but is somewhat faster.

 <p>The provided "distance" may be negative, which will rotate left.
@since 32.0.0

### `rotate(`byte[]` array, `int` distance, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Performs a right rotation of {@code array} between {@code fromIndex} inclusive and {@code
 toIndex} exclusive. This is equivalent to {@code
 Collections.rotate(Bytes.asList(array).subList(fromIndex, toIndex), distance)}, but is somewhat
 faster.

 <p>The provided "distance" may be negative, which will rotate left.
@throws IndexOutOfBoundsException if {@code fromIndex < 0}, {@code toIndex > array.length}, or
     {@code toIndex > fromIndex}
@since 32.0.0

