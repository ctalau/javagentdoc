# Class: `Doubles`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.Doubles`

**Extends:** [`com.google.common.primitives.DoublesMethodsForWeb`](./DoublesMethodsForWeb.md)

## Description

Static utility methods pertaining to `double` primitives, that are not already found in
 either `Double` or `Arrays`.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/PrimitivesExplained">primitive utilities</a>.
**Author:** Kevin Bourrillion
**Since:** 1.0

## Fields

### `BYTES`

**Type:** `int`

The number of bytes required to represent a primitive `double` value.

 <p><b>Java 8 users:</b> use `Double.BYTES` instead.
**Since:** 10.0

### `FLOATING_POINT_PATTERN`

**Type:** `java.util.regex.Pattern`

This is adapted from the regex suggested by `Double.valueOf(String)` for prevalidating
 inputs. All valid inputs must pass this regex, but it's semantically fine if not all inputs
 that pass this regex are valid -- only a performance hit is incurred, not a semantics bug.

## Constructors

### `<init>()`

## Methods

### `hashCode(`double` value)`

**Returns:** `int`

Returns a hash code for `value`; equal to the result of invoking `((Double)
 value).hashCode()`.

 <p><b>Java 8 users:</b> use `Double.hashCode(double)` instead.
@param value a primitive `double` value
@return a hash code for the value

### `compare(`double` a, `double` b)`

**Returns:** `int`

Compares the two specified `double` values. The sign of the value returned is the same as
 that of <code>((Double) a).compareTo(b)</code>. As with that
 method, `NaN` is treated as greater than all other values, and `0.0 > -0.0`.

 <p><b>Note:</b> this method simply delegates to the JDK method `Double.compare`. It is
 provided for consistency with the other primitive types, whose compare methods were not added
 to the JDK until JDK 7.
@param a the first `double` to compare
@param b the second `double` to compare
@return a negative value if `a` is less than `b`; a positive value if `a` is
     greater than `b`; or zero if they are equal

### `isFinite(`double` value)`

**Returns:** `boolean`

Returns `true` if `value` represents a real number. This is equivalent to, but not
 necessarily implemented as, `!(Double.isInfinite(value) || Double.isNaN(value))`.

 <p><b>Java 8 users:</b> use `Double.isFinite(double)` instead.
**Since:** 10.0

### `contains(`double[]` array, `double` target)`

**Returns:** `boolean`

Returns `true` if `target` is present as an element anywhere in `array`. Note
 that this always returns `false` when `target` is `NaN`.
@param array an array of `double` values, possibly empty
@param target a primitive `double` value
@return `true` if `array[i] == target` for some value of `i`

### `indexOf(`double[]` array, `double` target)`

**Returns:** `int`

Returns the index of the first appearance of the value `target` in `array`. Note
 that this always returns `-1` when `target` is `NaN`.
@param array an array of `double` values, possibly empty
@param target a primitive `double` value
@return the least index `i` for which `array[i] == target`, or `-1` if no
     such index exists.

### `indexOf(`double[]` array, `double` target, `int` start, `int` end)`

**Returns:** `int`

### `indexOf(`double[]` array, `double[]` target)`

**Returns:** `int`

Returns the start position of the first occurrence of the specified `target` within
 `array`, or `-1` if there is no such occurrence.

 <p>More formally, returns the lowest index `i` such that `Arrays.copyOfRange(array,
 i, i + target.length)` contains exactly the same elements as `target`.

 <p>Note that this always returns `-1` when `target` contains `NaN`.
@param array the array to search for the sequence `target`
@param target the array to search for as a sub-sequence of `array`

### `lastIndexOf(`double[]` array, `double` target)`

**Returns:** `int`

Returns the index of the last appearance of the value `target` in `array`. Note
 that this always returns `-1` when `target` is `NaN`.
@param array an array of `double` values, possibly empty
@param target a primitive `double` value
@return the greatest index `i` for which `array[i] == target`, or `-1` if no
     such index exists.

### `lastIndexOf(`double[]` array, `double` target, `int` start, `int` end)`

**Returns:** `int`

### `min(`double[]` array)`

**Returns:** `double`

Returns the least value present in `array`, using the same rules of comparison as `Math.min(double, double)`.
@param array a <i>nonempty</i> array of `double` values
@return the value present in `array` that is less than or equal to every other value in
     the array
@throws IllegalArgumentException if `array` is empty

### `max(`double[]` array)`

**Returns:** `double`

Returns the greatest value present in `array`, using the same rules of comparison as
 `Math.max(double, double)`.
@param array a <i>nonempty</i> array of `double` values
@return the value present in `array` that is greater than or equal to every other value
     in the array
@throws IllegalArgumentException if `array` is empty

### `constrainToRange(`double` value, `double` min, `double` max)`

**Returns:** `double`

Returns the value nearest to `value` which is within the closed range `[min..max]`.

 <p>If `value` is within the range `[min..max]`, `value` is returned
 unchanged. If `value` is less than `min`, `min` is returned, and if `value` is greater than `max`, `max` is returned.
@param value the `double` value to constrain
@param min the lower bound (inclusive) of the range to constrain `value` to
@param max the upper bound (inclusive) of the range to constrain `value` to
@throws IllegalArgumentException if `min > max`
**Since:** 21.0

### `concat(`double[][]` arrays)`

**Returns:** `double[]`

Returns the values from each provided array combined into a single array. For example, `concat(new double[] {a, b`, new double[] {}, new double[] {c}} returns the array `{a, b,
 c`}.
@param arrays zero or more `double` arrays
@return a single array containing all the values from the source arrays, in order

### `stringConverter()`

**Returns:** [`com.google.common.base.Converter<java.lang.String,java.lang.Double>`](../base/Converter.md)

Returns a serializable converter object that converts between strings and doubles using `Double.valueOf` and `Double.toString()`.
**Since:** 16.0

### `ensureCapacity(`double[]` array, `int` minLength, `int` padding)`

**Returns:** `double[]`

Returns an array containing the same values as `array`, but guaranteed to be of a
 specified minimum length. If `array` already has a length of at least `minLength`,
 it is returned directly. Otherwise, a new array of size `minLength + padding` is
 returned, containing the values of `array`, and zeroes in the remaining places.
@param array the source array
@param minLength the minimum length the returned array must guarantee
@param padding an extra amount to "grow" the array by if growth is necessary
@throws IllegalArgumentException if `minLength` or `padding` is negative
@return an array containing the values of `array`, with guaranteed minimum length `minLength`

### `join(`java.lang.String` separator, `double[]` array)`

**Returns:** `java.lang.String`

Returns a string containing the supplied `double` values, converted to strings as
 specified by `Double.toString(double)`, and separated by `separator`. For example,
 `join("-", 1.0, 2.0, 3.0)` returns the string `"1.0-2.0-3.0"`.

 <p>Note that `Double.toString(double)` formats `double` differently in GWT
 sometimes. In the previous example, it returns the string `"1-2-3"`.
@param separator the text that should appear between consecutive values in the resulting string
     (but not at the start or end)
@param array an array of `double` values, possibly empty

### `lexicographicalComparator()`

**Returns:** `java.util.Comparator<double[]>`

Returns a comparator that compares two `double` arrays <a href="http://en.wikipedia.org/wiki/Lexicographical_order">lexicographically</a>. That is, it
 compares, using `compare(double, double)`), the first pair of values that follow any
 common prefix, or when one array is a prefix of the other, treats the shorter array as the
 lesser. For example, `[] < [1.0] < [1.0, 2.0] < [2.0]`.

 <p>The returned comparator is inconsistent with `Object.equals(Object)` (since arrays
 support only identity equality), but it is consistent with `Arrays.equals(double[],
 double[])`.
**Since:** 2.0

### `sortDescending(`double[]` array)`

**Returns:** `void`

Sorts the elements of `array` in descending order.

 <p>Note that this method uses the total order imposed by `Double.compare`, which treats
 all NaN values as equal and 0.0 as greater than -0.0.
**Since:** 23.1

### `sortDescending(`double[]` array, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Sorts the elements of `array` between `fromIndex` inclusive and `toIndex`
 exclusive in descending order.

 <p>Note that this method uses the total order imposed by `Double.compare`, which treats
 all NaN values as equal and 0.0 as greater than -0.0.
**Since:** 23.1

### `reverse(`double[]` array)`

**Returns:** `void`

Reverses the elements of `array`. This is equivalent to `Collections.reverse(Doubles.asList(array))`, but is likely to be more efficient.
**Since:** 23.1

### `reverse(`double[]` array, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Reverses the elements of `array` between `fromIndex` inclusive and `toIndex`
 exclusive. This is equivalent to `Collections.reverse(Doubles.asList(array).subList(fromIndex, toIndex))`, but is likely to be
 more efficient.
@throws IndexOutOfBoundsException if `fromIndex < 0`, `toIndex > array.length`, or
     `toIndex > fromIndex`
**Since:** 23.1

### `rotate(`double[]` array, `int` distance)`

**Returns:** `void`

Performs a right rotation of `array` of "distance" places, so that the first element is
 moved to index "distance", and the element at index `i` ends up at index `(distance
 + i) mod array.length`. This is equivalent to `Collections.rotate(Bytes.asList(array),
 distance)`, but is considerably faster and avoids allocation and garbage collection.

 <p>The provided "distance" may be negative, which will rotate left.
**Since:** 32.0.0

### `rotate(`double[]` array, `int` distance, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Performs a right rotation of `array` between `fromIndex` inclusive and `toIndex` exclusive. This is equivalent to `Collections.rotate(Bytes.asList(array).subList(fromIndex, toIndex), distance)`, but is
 considerably faster and avoids allocations and garbage collection.

 <p>The provided "distance" may be negative, which will rotate left.
@throws IndexOutOfBoundsException if `fromIndex < 0`, `toIndex > array.length`, or
     `toIndex > fromIndex`
**Since:** 32.0.0

### `toArray(`java.util.Collection<? extends java.lang.Number>` collection)`

**Returns:** `double[]`

Returns an array containing each value of `collection`, converted to a `double`
 value in the manner of `Number.doubleValue`.

 <p>Elements are copied from the argument collection as if by `collection.toArray()`.
 Calling this method is as thread-safe as calling that method.
@param collection a collection of `Number` instances
@return an array containing the same values as `collection`, in the same order, converted
     to primitives
@throws NullPointerException if `collection` or any of its elements is null
**Since:** 1.0 (parameter was `Collection<Double>` before 12.0)

### `asList(`double[]` backingArray)`

**Returns:** `java.util.List<java.lang.Double>`

Returns a fixed-size list backed by the specified array, similar to `Arrays.asList(Object[])`. The list supports `List.set(int, Object)`, but any attempt to
 set a value to `null` will result in a `NullPointerException`.

 <p>The returned list maintains the values, but not the identities, of `Double` objects
 written to or read from it. For example, whether `list.get(0) == list.get(0)` is true for
 the returned list is unspecified.

 <p>The returned list may have unexpected behavior if it contains `NaN`, or if `NaN`
 is used as a parameter to any of its methods.

 <p>The returned list is serializable.

 <p><b>Note:</b> when possible, you should represent your data as an `ImmutableDoubleArray` instead, which has an `ImmutableDoubleArray.asList asList` view.
@param backingArray the array to back the list
@return a list view of the array

### `fpPattern()`

**Returns:** `java.util.regex.Pattern`

### `tryParse(`java.lang.String` string)`

**Returns:** `java.lang.Double`

Parses the specified string as a double-precision floating point value. The ASCII character
 `'-'` (<code>'&#92;u002D'</code>) is recognized as the minus sign.

 <p>Unlike `Double.parseDouble(String)`, this method returns `null` instead of
 throwing an exception if parsing fails. Valid inputs are exactly those accepted by `Double.valueOf(String)`, except that leading and trailing whitespace is not permitted.

 <p>This implementation is likely to be faster than `Double.parseDouble` if many failures
 are expected.
@param string the string representation of a `double` value
@return the floating point value represented by `string`, or `null` if `string` has a length of zero or cannot be parsed as a `double` value
@throws NullPointerException if `string` is `null`
**Since:** 14.0

