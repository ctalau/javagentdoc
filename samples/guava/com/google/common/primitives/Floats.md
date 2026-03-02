# Class: `Floats`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.Floats`

**Extends:** [`com.google.common.primitives.FloatsMethodsForWeb`](./FloatsMethodsForWeb.md)

## Description

See the Guava User Guide article on [primitive utilities](https://github.com/google/guava/wiki/PrimitivesExplained).

## Fields

### `BYTES`

**Type:** `int`

**Java 8 users:** use Float#BYTES instead.

## Constructors

### `<init>()`

## Methods

### `hashCode(float value)`

**Java 8 users:** use Float#hashCode(float) instead.

**Parameters:**
- `value` (`float`): a primitive float value

**Returns:** `int`

### `compare(float a, float b)`

You
 may prefer to invoke that method directly; this method exists only for consistency with the
 other utilities in this package.

 
**Note:** this method simply delegates to the JDK method Float#compare. It is
 provided for consistency with the other primitive types, whose compare methods were not added
 to the JDK until JDK 7.

**Parameters:**
- `a` (`float`): the first float to compare
- `b` (`float`): the second float to compare

**Returns:** `int`

### `isFinite(float value)`

This is equivalent to, but not
 necessarily implemented as, !(Float.isInfinite(value) || Float.isNaN(value)).

 
**Java 8 users:** use Float#isFinite(float) instead.

**Parameters:**
- `value` (`float`)

**Returns:** `boolean`

### `contains(float[] array, float target)`

Note
 that this always returns false when target is NaN.

**Parameters:**
- `array` (`float[]`): an array of float values, possibly empty
- `target` (`float`): a primitive float value

**Returns:** `boolean`

### `indexOf(float[] array, float target)`

Note
 that this always returns -1 when target is NaN.

**Parameters:**
- `array` (`float[]`): an array of float values, possibly empty
- `target` (`float`): a primitive float value

**Returns:** `int`

### `indexOf(float[] array, float target, int start, int end)`

**Parameters:**
- `array` (`float[]`)
- `target` (`float`)
- `start` (`int`)
- `end` (`int`)

**Returns:** `int`

### `indexOf(float[] array, float[] target)`

More formally, returns the lowest index i such that Arrays.copyOfRange(array,
 i, i + target.length) contains exactly the same elements as target.

 
Note that this always returns -1 when target contains NaN.

**Parameters:**
- `array` (`float[]`): the array to search for the sequence target
- `target` (`float[]`): the array to search for as a sub-sequence of array

**Returns:** `int`

### `lastIndexOf(float[] array, float target)`

Note
 that this always returns -1 when target is NaN.

**Parameters:**
- `array` (`float[]`): an array of float values, possibly empty
- `target` (`float`): a primitive float value

**Returns:** `int`

### `lastIndexOf(float[] array, float target, int start, int end)`

**Parameters:**
- `array` (`float[]`)
- `target` (`float`)
- `start` (`int`)
- `end` (`int`)

**Returns:** `int`

### `min(float[] array)`

**Parameters:**
- `array` (`float[]`): a *nonempty* array of float values

**Returns:** `float`

### `max(float[] array)`

**Parameters:**
- `array` (`float[]`): a *nonempty* array of float values

**Returns:** `float`

### `constrainToRange(float value, float min, float max)`

If value is within the range [min..max], value is returned
 unchanged. If value is less than min, min is returned, and if 
 value is greater than max, max is returned.

**Parameters:**
- `value` (`float`): the float value to constrain
- `min` (`float`): the lower bound (inclusive) of the range to constrain value to
- `max` (`float`): the upper bound (inclusive) of the range to constrain value to

**Returns:** `float`

### `concat(float[][] arrays)`

For example, 
 concat(new float[] {a, b}, new float[] {}, new float[] {c} returns the array {a, b,
 c}.

**Parameters:**
- `arrays` (`float[][]`): zero or more float arrays

**Returns:** `float[]`

### `stringConverter()`

**Returns:** [`com.google.common.base.Converter<java.lang.String,java.lang.Float>`](../base/Converter.md)

### `ensureCapacity(float[] array, int minLength, int padding)`

If array already has a length of at least minLength,
 it is returned directly. Otherwise, a new array of size minLength + padding is
 returned, containing the values of array, and zeroes in the remaining places.

**Parameters:**
- `array` (`float[]`): the source array
- `minLength` (`int`): the minimum length the returned array must guarantee
- `padding` (`int`): an extra amount to "grow" the array by if growth is necessary

**Returns:** `float[]`

### `join(String separator, float[] array)`

For example,
 join("-", 1.0f, 2.0f, 3.0f) returns the string "1.0-2.0-3.0".

 
Note that Float#toString(float) formats float differently in GWT. In the
 previous example, it returns the string "1-2-3".

**Parameters:**
- `separator` (`java.lang.String`): the text that should appear between consecutive values in the resulting string
       (but not at the start or end)
- `array` (`float[]`): an array of float values, possibly empty

**Returns:** `java.lang.String`

### `lexicographicalComparator()`

That is, it
 compares, using #compare(float, float)), the first pair of values that follow any
 common prefix, or when one array is a prefix of the other, treats the shorter array as the
 lesser. For example, [] < [1.0f] < [1.0f, 2.0f] < [2.0f].

 
The returned comparator is inconsistent with Object#equals(Object) (since arrays
 support only identity equality), but it is consistent with Arrays#equals(float[],
 float[]).

**Returns:** `java.util.Comparator<float[]>`

### `sortDescending(float[] array)`

Note that this method uses the total order imposed by Float#compare, which treats
 all NaN values as equal and 0.0 as greater than -0.0.

**Parameters:**
- `array` (`float[]`)

**Returns:** `void`

### `sortDescending(float[] array, int fromIndex, int toIndex)`

Note that this method uses the total order imposed by Float#compare, which treats
 all NaN values as equal and 0.0 as greater than -0.0.

**Parameters:**
- `array` (`float[]`)
- `fromIndex` (`int`)
- `toIndex` (`int`)

**Returns:** `void`

### `reverse(float[] array)`

This is equivalent to 
 Collections.reverse(Floats.asList(array)), but is likely to be more efficient.

**Parameters:**
- `array` (`float[]`)

**Returns:** `void`

### `reverse(float[] array, int fromIndex, int toIndex)`

This is equivalent to 
 Collections.reverse(Floats.asList(array).subList(fromIndex, toIndex)), but is likely to be
 more efficient.

**Parameters:**
- `array` (`float[]`)
- `fromIndex` (`int`)
- `toIndex` (`int`)

**Returns:** `void`

### `rotate(float[] array, int distance)`

This is equivalent to Collections.rotate(Floats.asList(array),
 distance), but is considerably faster and avoids allocation and garbage collection.

 
The provided "distance" may be negative, which will rotate left.

**Parameters:**
- `array` (`float[]`)
- `distance` (`int`)

**Returns:** `void`

### `rotate(float[] array, int distance, int fromIndex, int toIndex)`

This is equivalent to 
 Collections.rotate(Floats.asList(array).subList(fromIndex, toIndex), distance), but is
 considerably faster and avoids allocations and garbage collection.

 
The provided "distance" may be negative, which will rotate left.

**Parameters:**
- `array` (`float[]`)
- `distance` (`int`)
- `fromIndex` (`int`)
- `toIndex` (`int`)

**Returns:** `void`

### `toArray(Collection<? extends Number> collection)`

Elements are copied from the argument collection as if by collection.toArray().
 Calling this method is as thread-safe as calling that method.

**Parameters:**
- `collection` (`java.util.Collection<? extends java.lang.Number>`): a collection of Number instances

**Returns:** `float[]`

### `asList(float[] backingArray)`

The list supports List#set(int, Object), but any attempt to
 set a value to null will result in a NullPointerException.

 
The returned list maintains the values, but not the identities, of Float objects
 written to or read from it. For example, whether list.get(0) == list.get(0) is true for
 the returned list is unspecified.

 
The returned list may have unexpected behavior if it contains NaN, or if NaN
 is used as a parameter to any of its methods.

 
The returned list is serializable.

**Parameters:**
- `backingArray` (`float[]`): the array to back the list

**Returns:** `java.util.List<java.lang.Float>`

### `tryParse(String string)`

The ASCII character
 '-' (`'&#92;u002D'`) is recognized as the minus sign.

 
Unlike Float#parseFloat(String), this method returns null instead of
 throwing an exception if parsing fails. Valid inputs are exactly those accepted by Float#valueOf(String), except that leading and trailing whitespace is not permitted.

 
This implementation is likely to be faster than Float.parseFloat if many failures
 are expected.

**Parameters:**
- `string` (`java.lang.String`): the string representation of a float value

**Returns:** `java.lang.Float`

