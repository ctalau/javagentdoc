# Class: `Doubles`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.Doubles`

**Extends:** [`com.google.common.primitives.DoublesMethodsForWeb`](./DoublesMethodsForWeb.md)

## Description

See the Guava User Guide article on [primitive utilities](https://github.com/google/guava/wiki/PrimitivesExplained).

## Fields

### `BYTES`

**Type:** `int`

**Java 8 users:** use Double#BYTES instead.

### `FLOATING_POINT_PATTERN`

**Type:** `java.util.regex.Pattern`

All valid inputs must pass this regex, but it's semantically fine if not all inputs
 that pass this regex are valid -- only a performance hit is incurred, not a semantics bug.

## Constructors

### `<init>()`

## Methods

### `hashCode(double value)`

**Returns:** `int`

**Java 8 users:** use Double#hashCode(double) instead.

**Parameters:**
- `value` (`double`): a primitive double value

### `compare(double a, double b)`

**Returns:** `int`

The sign of the value returned is the same as
 that of `((Double) a).compareTo(b)`. As with that
 method, NaN is treated as greater than all other values, and 0.0 > -0.0.

 
**Note:** this method simply delegates to the JDK method Double#compare. It is
 provided for consistency with the other primitive types, whose compare methods were not added
 to the JDK until JDK 7.

**Parameters:**
- `a` (`double`): the first double to compare
- `b` (`double`): the second double to compare

### `isFinite(double value)`

**Returns:** `boolean`

This is equivalent to, but not
 necessarily implemented as, !(Double.isInfinite(value) || Double.isNaN(value)).

 
**Java 8 users:** use Double#isFinite(double) instead.

**Parameters:**
- `value` (`double`)

### `contains(double[] array, double target)`

**Returns:** `boolean`

Note
 that this always returns false when target is NaN.

**Parameters:**
- `array` (`double[]`): an array of double values, possibly empty
- `target` (`double`): a primitive double value

### `indexOf(double[] array, double target)`

**Returns:** `int`

Note
 that this always returns -1 when target is NaN.

**Parameters:**
- `array` (`double[]`): an array of double values, possibly empty
- `target` (`double`): a primitive double value

### `indexOf(double[] array, double target, int start, int end)`

**Returns:** `int`

**Parameters:**
- `array` (`double[]`)
- `target` (`double`)
- `start` (`int`)
- `end` (`int`)

### `indexOf(double[] array, double[] target)`

**Returns:** `int`

More formally, returns the lowest index i such that Arrays.copyOfRange(array,
 i, i + target.length) contains exactly the same elements as target.

 
Note that this always returns -1 when target contains NaN.

**Parameters:**
- `array` (`double[]`): the array to search for the sequence target
- `target` (`double[]`): the array to search for as a sub-sequence of array

### `lastIndexOf(double[] array, double target)`

**Returns:** `int`

Note
 that this always returns -1 when target is NaN.

**Parameters:**
- `array` (`double[]`): an array of double values, possibly empty
- `target` (`double`): a primitive double value

### `lastIndexOf(double[] array, double target, int start, int end)`

**Returns:** `int`

**Parameters:**
- `array` (`double[]`)
- `target` (`double`)
- `start` (`int`)
- `end` (`int`)

### `min(double[] array)`

**Returns:** `double`

**Parameters:**
- `array` (`double[]`): a *nonempty* array of double values

### `max(double[] array)`

**Returns:** `double`

**Parameters:**
- `array` (`double[]`): a *nonempty* array of double values

### `constrainToRange(double value, double min, double max)`

**Returns:** `double`

If value is within the range [min..max], value is returned
 unchanged. If value is less than min, min is returned, and if 
 value is greater than max, max is returned.

**Parameters:**
- `value` (`double`): the double value to constrain
- `min` (`double`): the lower bound (inclusive) of the range to constrain value to
- `max` (`double`): the upper bound (inclusive) of the range to constrain value to

### `concat(double[][] arrays)`

**Returns:** `double[]`

For example, 
 concat(new double[] {a, b}, new double[] {}, new double[] {c} returns the array {a, b,
 c}.

**Parameters:**
- `arrays` (`double[][]`): zero or more double arrays

### `stringConverter()`

**Returns:** [`com.google.common.base.Converter<java.lang.String,java.lang.Double>`](../base/Converter.md)

### `ensureCapacity(double[] array, int minLength, int padding)`

**Returns:** `double[]`

If array already has a length of at least minLength,
 it is returned directly. Otherwise, a new array of size minLength + padding is
 returned, containing the values of array, and zeroes in the remaining places.

**Parameters:**
- `array` (`double[]`): the source array
- `minLength` (`int`): the minimum length the returned array must guarantee
- `padding` (`int`): an extra amount to "grow" the array by if growth is necessary

### `join(java.lang.String separator, double[] array)`

**Returns:** `java.lang.String`

For example,
 join("-", 1.0, 2.0, 3.0) returns the string "1.0-2.0-3.0".

 
Note that Double#toString(double) formats double differently in GWT
 sometimes. In the previous example, it returns the string "1-2-3".

**Parameters:**
- `separator` (`java.lang.String`): the text that should appear between consecutive values in the resulting string
     (but not at the start or end)
- `array` (`double[]`): an array of double values, possibly empty

### `lexicographicalComparator()`

**Returns:** `java.util.Comparator<double[]>`

That is, it
 compares, using #compare(double, double)), the first pair of values that follow any
 common prefix, or when one array is a prefix of the other, treats the shorter array as the
 lesser. For example, [] < [1.0] < [1.0, 2.0] < [2.0].

 
The returned comparator is inconsistent with Object#equals(Object) (since arrays
 support only identity equality), but it is consistent with Arrays#equals(double[],
 double[]).

### `sortDescending(double[] array)`

**Returns:** `void`

Note that this method uses the total order imposed by Double#compare, which treats
 all NaN values as equal and 0.0 as greater than -0.0.

**Parameters:**
- `array` (`double[]`)

### `sortDescending(double[] array, int fromIndex, int toIndex)`

**Returns:** `void`

Note that this method uses the total order imposed by Double#compare, which treats
 all NaN values as equal and 0.0 as greater than -0.0.

**Parameters:**
- `array` (`double[]`)
- `fromIndex` (`int`)
- `toIndex` (`int`)

### `reverse(double[] array)`

**Returns:** `void`

This is equivalent to 
 Collections.reverse(Doubles.asList(array)), but is likely to be more efficient.

**Parameters:**
- `array` (`double[]`)

### `reverse(double[] array, int fromIndex, int toIndex)`

**Returns:** `void`

This is equivalent to 
 Collections.reverse(Doubles.asList(array).subList(fromIndex, toIndex)), but is likely to be
 more efficient.

**Parameters:**
- `array` (`double[]`)
- `fromIndex` (`int`)
- `toIndex` (`int`)

### `rotate(double[] array, int distance)`

**Returns:** `void`

This is equivalent to Collections.rotate(Bytes.asList(array),
 distance), but is considerably faster and avoids allocation and garbage collection.

 
The provided "distance" may be negative, which will rotate left.

**Parameters:**
- `array` (`double[]`)
- `distance` (`int`)

### `rotate(double[] array, int distance, int fromIndex, int toIndex)`

**Returns:** `void`

This is equivalent to 
 Collections.rotate(Bytes.asList(array).subList(fromIndex, toIndex), distance), but is
 considerably faster and avoids allocations and garbage collection.

 
The provided "distance" may be negative, which will rotate left.

**Parameters:**
- `array` (`double[]`)
- `distance` (`int`)
- `fromIndex` (`int`)
- `toIndex` (`int`)

### `toArray(java.util.Collection<? extends java.lang.Number> collection)`

**Returns:** `double[]`

Elements are copied from the argument collection as if by collection.toArray().
 Calling this method is as thread-safe as calling that method.

**Parameters:**
- `collection` (`java.util.Collection<? extends java.lang.Number>`): a collection of Number instances

### `asList(double[] backingArray)`

**Returns:** `java.util.List<java.lang.Double>`

The list supports List#set(int, Object), but any attempt to
 set a value to null will result in a NullPointerException.

 
The returned list maintains the values, but not the identities, of Double objects
 written to or read from it. For example, whether list.get(0) == list.get(0) is true for
 the returned list is unspecified.

 
The returned list may have unexpected behavior if it contains NaN, or if NaN
 is used as a parameter to any of its methods.

 
The returned list is serializable.

 
**Note:** when possible, you should represent your data as an ImmutableDoubleArray instead, which has an asList view.

**Parameters:**
- `backingArray` (`double[]`): the array to back the list

### `fpPattern()`

**Returns:** `java.util.regex.Pattern`

### `tryParse(java.lang.String string)`

**Returns:** `java.lang.Double`

The ASCII character
 '-' (`'&#92;u002D'`) is recognized as the minus sign.

 
Unlike Double#parseDouble(String), this method returns null instead of
 throwing an exception if parsing fails. Valid inputs are exactly those accepted by Double#valueOf(String), except that leading and trailing whitespace is not permitted.

 
This implementation is likely to be faster than Double.parseDouble if many failures
 are expected.

**Parameters:**
- `string` (`java.lang.String`): the string representation of a double value

