# Class: `Doubles`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.Doubles`

**Extends:** [`com.google.common.primitives.DoublesMethodsForWeb`](./DoublesMethodsForWeb.md)

## Description

Static utility methods pertaining to {@code double} primitives, that are not already found in
 either {@link Double} or {@link Arrays}.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/PrimitivesExplained">primitive utilities</a>.
@author Kevin Bourrillion
@since 1.0

## Fields

### `BYTES`

**Type:** `int`

The number of bytes required to represent a primitive {@code double} value.

 <p><b>Java 8 users:</b> use {@link Double#BYTES} instead.
@since 10.0

### `FLOATING_POINT_PATTERN`

**Type:** [`java.util.regex.Pattern`](../../../../java/util/regex/Pattern.md)

This is adapted from the regex suggested by {@link Double#valueOf(String)} for prevalidating
 inputs. All valid inputs must pass this regex, but it's semantically fine if not all inputs
 that pass this regex are valid -- only a performance hit is incurred, not a semantics bug.

## Constructors

### `<init>()`

## Methods

### `hashCode(`double` value)`

**Returns:** `int`

Returns a hash code for {@code value}; equal to the result of invoking {@code ((Double)
 value).hashCode()}.

 <p><b>Java 8 users:</b> use {@link Double#hashCode(double)} instead.
@param value a primitive {@code double} value
@return a hash code for the value

### `compare(`double` a, `double` b)`

**Returns:** `int`

Compares the two specified {@code double} values. The sign of the value returned is the same as
 that of <code>((Double) a).{@linkplain Double#compareTo compareTo}(b)</code>. As with that
 method, {@code NaN} is treated as greater than all other values, and {@code 0.0 > -0.0}.

 <p><b>Note:</b> this method simply delegates to the JDK method {@link Double#compare}. It is
 provided for consistency with the other primitive types, whose compare methods were not added
 to the JDK until JDK 7.
@param a the first {@code double} to compare
@param b the second {@code double} to compare
@return a negative value if {@code a} is less than {@code b}; a positive value if {@code a} is
     greater than {@code b}; or zero if they are equal

### `isFinite(`double` value)`

**Returns:** `boolean`

Returns {@code true} if {@code value} represents a real number. This is equivalent to, but not
 necessarily implemented as, {@code !(Double.isInfinite(value) || Double.isNaN(value))}.

 <p><b>Java 8 users:</b> use {@link Double#isFinite(double)} instead.
@since 10.0

### `contains(`double[]` array, `double` target)`

**Returns:** `boolean`

Returns {@code true} if {@code target} is present as an element anywhere in {@code array}. Note
 that this always returns {@code false} when {@code target} is {@code NaN}.
@param array an array of {@code double} values, possibly empty
@param target a primitive {@code double} value
@return {@code true} if {@code array[i] == target} for some value of {@code i}

### `indexOf(`double[]` array, `double` target)`

**Returns:** `int`

Returns the index of the first appearance of the value {@code target} in {@code array}. Note
 that this always returns {@code -1} when {@code target} is {@code NaN}.
@param array an array of {@code double} values, possibly empty
@param target a primitive {@code double} value
@return the least index {@code i} for which {@code array[i] == target}, or {@code -1} if no
     such index exists.

### `indexOf(`double[]` array, `double` target, `int` start, `int` end)`

**Returns:** `int`

### `indexOf(`double[]` array, `double[]` target)`

**Returns:** `int`

Returns the start position of the first occurrence of the specified {@code target} within
 {@code array}, or {@code -1} if there is no such occurrence.

 <p>More formally, returns the lowest index {@code i} such that {@code Arrays.copyOfRange(array,
 i, i + target.length)} contains exactly the same elements as {@code target}.

 <p>Note that this always returns {@code -1} when {@code target} contains {@code NaN}.
@param array the array to search for the sequence {@code target}
@param target the array to search for as a sub-sequence of {@code array}

### `lastIndexOf(`double[]` array, `double` target)`

**Returns:** `int`

Returns the index of the last appearance of the value {@code target} in {@code array}. Note
 that this always returns {@code -1} when {@code target} is {@code NaN}.
@param array an array of {@code double} values, possibly empty
@param target a primitive {@code double} value
@return the greatest index {@code i} for which {@code array[i] == target}, or {@code -1} if no
     such index exists.

### `lastIndexOf(`double[]` array, `double` target, `int` start, `int` end)`

**Returns:** `int`

### `min(`double[]` array)`

**Returns:** `double`

Returns the least value present in {@code array}, using the same rules of comparison as {@link Math#min(double, double)}.
@param array a <i>nonempty</i> array of {@code double} values
@return the value present in {@code array} that is less than or equal to every other value in
     the array
@throws IllegalArgumentException if {@code array} is empty

### `max(`double[]` array)`

**Returns:** `double`

Returns the greatest value present in {@code array}, using the same rules of comparison as
 {@link Math#max(double, double)}.
@param array a <i>nonempty</i> array of {@code double} values
@return the value present in {@code array} that is greater than or equal to every other value
     in the array
@throws IllegalArgumentException if {@code array} is empty

### `constrainToRange(`double` value, `double` min, `double` max)`

**Returns:** `double`

Returns the value nearest to {@code value} which is within the closed range {@code [min..max]}.

 <p>If {@code value} is within the range {@code [min..max]}, {@code value} is returned
 unchanged. If {@code value} is less than {@code min}, {@code min} is returned, and if {@code
 value} is greater than {@code max}, {@code max} is returned.
@param value the {@code double} value to constrain
@param min the lower bound (inclusive) of the range to constrain {@code value} to
@param max the upper bound (inclusive) of the range to constrain {@code value} to
@throws IllegalArgumentException if {@code min > max}
@since 21.0

### `concat(`double[][]` arrays)`

**Returns:** `double[]`

Returns the values from each provided array combined into a single array. For example, {@code
 concat(new double[] {a, b}, new double[] {}, new double[] {c}} returns the array {@code {a, b,
 c}}.
@param arrays zero or more {@code double} arrays
@return a single array containing all the values from the source arrays, in order

### `stringConverter()`

**Returns:** [`com.google.common.base.Converter<java.lang.String,java.lang.Double>`](../base/Converter.md)

Returns a serializable converter object that converts between strings and doubles using {@link Double#valueOf} and {@link Double#toString()}.
@since 16.0

### `ensureCapacity(`double[]` array, `int` minLength, `int` padding)`

**Returns:** `double[]`

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

### `join(`java.lang.String` separator, `double[]` array)`

**Returns:** `java.lang.String`

Returns a string containing the supplied {@code double} values, converted to strings as
 specified by {@link Double#toString(double)}, and separated by {@code separator}. For example,
 {@code join("-", 1.0, 2.0, 3.0)} returns the string {@code "1.0-2.0-3.0"}.

 <p>Note that {@link Double#toString(double)} formats {@code double} differently in GWT
 sometimes. In the previous example, it returns the string {@code "1-2-3"}.
@param separator the text that should appear between consecutive values in the resulting string
     (but not at the start or end)
@param array an array of {@code double} values, possibly empty

### `lexicographicalComparator()`

**Returns:** [`java.util.Comparator<double[]>`](../../../../java/util/Comparator.md)

Returns a comparator that compares two {@code double} arrays <a href="http://en.wikipedia.org/wiki/Lexicographical_order">lexicographically</a>. That is, it
 compares, using {@link #compare(double, double)}), the first pair of values that follow any
 common prefix, or when one array is a prefix of the other, treats the shorter array as the
 lesser. For example, {@code [] < [1.0] < [1.0, 2.0] < [2.0]}.

 <p>The returned comparator is inconsistent with {@link Object#equals(Object)} (since arrays
 support only identity equality), but it is consistent with {@link Arrays#equals(double[],
 double[])}.
@since 2.0

### `sortDescending(`double[]` array)`

**Returns:** `void`

Sorts the elements of {@code array} in descending order.

 <p>Note that this method uses the total order imposed by {@link Double#compare}, which treats
 all NaN values as equal and 0.0 as greater than -0.0.
@since 23.1

### `sortDescending(`double[]` array, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Sorts the elements of {@code array} between {@code fromIndex} inclusive and {@code toIndex}
 exclusive in descending order.

 <p>Note that this method uses the total order imposed by {@link Double#compare}, which treats
 all NaN values as equal and 0.0 as greater than -0.0.
@since 23.1

### `reverse(`double[]` array)`

**Returns:** `void`

Reverses the elements of {@code array}. This is equivalent to {@code
 Collections.reverse(Doubles.asList(array))}, but is likely to be more efficient.
@since 23.1

### `reverse(`double[]` array, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Reverses the elements of {@code array} between {@code fromIndex} inclusive and {@code toIndex}
 exclusive. This is equivalent to {@code
 Collections.reverse(Doubles.asList(array).subList(fromIndex, toIndex))}, but is likely to be
 more efficient.
@throws IndexOutOfBoundsException if {@code fromIndex < 0}, {@code toIndex > array.length}, or
     {@code toIndex > fromIndex}
@since 23.1

### `rotate(`double[]` array, `int` distance)`

**Returns:** `void`

Performs a right rotation of {@code array} of "distance" places, so that the first element is
 moved to index "distance", and the element at index {@code i} ends up at index {@code (distance
 + i) mod array.length}. This is equivalent to {@code Collections.rotate(Bytes.asList(array),
 distance)}, but is considerably faster and avoids allocation and garbage collection.

 <p>The provided "distance" may be negative, which will rotate left.
@since 32.0.0

### `rotate(`double[]` array, `int` distance, `int` fromIndex, `int` toIndex)`

**Returns:** `void`

Performs a right rotation of {@code array} between {@code fromIndex} inclusive and {@code
 toIndex} exclusive. This is equivalent to {@code
 Collections.rotate(Bytes.asList(array).subList(fromIndex, toIndex), distance)}, but is
 considerably faster and avoids allocations and garbage collection.

 <p>The provided "distance" may be negative, which will rotate left.
@throws IndexOutOfBoundsException if {@code fromIndex < 0}, {@code toIndex > array.length}, or
     {@code toIndex > fromIndex}
@since 32.0.0

### `toArray([`java.util.Collection<? extends java.lang.Number>`](../../../../java/util/Collection.md) collection)`

**Returns:** `double[]`

Returns an array containing each value of {@code collection}, converted to a {@code double}
 value in the manner of {@link Number#doubleValue}.

 <p>Elements are copied from the argument collection as if by {@code collection.toArray()}.
 Calling this method is as thread-safe as calling that method.
@param collection a collection of {@code Number} instances
@return an array containing the same values as {@code collection}, in the same order, converted
     to primitives
@throws NullPointerException if {@code collection} or any of its elements is null
@since 1.0 (parameter was {@code Collection<Double>} before 12.0)

### `asList(`double[]` backingArray)`

**Returns:** [`java.util.List<java.lang.Double>`](../../../../java/util/List.md)

Returns a fixed-size list backed by the specified array, similar to {@link Arrays#asList(Object[])}. The list supports {@link List#set(int, Object)}, but any attempt to
 set a value to {@code null} will result in a {@link NullPointerException}.

 <p>The returned list maintains the values, but not the identities, of {@code Double} objects
 written to or read from it. For example, whether {@code list.get(0) == list.get(0)} is true for
 the returned list is unspecified.

 <p>The returned list may have unexpected behavior if it contains {@code NaN}, or if {@code NaN}
 is used as a parameter to any of its methods.

 <p>The returned list is serializable.

 <p><b>Note:</b> when possible, you should represent your data as an {@link ImmutableDoubleArray} instead, which has an {@link ImmutableDoubleArray#asList asList} view.
@param backingArray the array to back the list
@return a list view of the array

### `fpPattern()`

**Returns:** [`java.util.regex.Pattern`](../../../../java/util/regex/Pattern.md)

### `tryParse(`java.lang.String` string)`

**Returns:** `java.lang.Double`

Parses the specified string as a double-precision floating point value. The ASCII character
 {@code '-'} (<code>'&#92;u002D'</code>) is recognized as the minus sign.

 <p>Unlike {@link Double#parseDouble(String)}, this method returns {@code null} instead of
 throwing an exception if parsing fails. Valid inputs are exactly those accepted by {@link Double#valueOf(String)}, except that leading and trailing whitespace is not permitted.

 <p>This implementation is likely to be faster than {@code Double.parseDouble} if many failures
 are expected.
@param string the string representation of a {@code double} value
@return the floating point value represented by {@code string}, or {@code null} if {@code
     string} has a length of zero or cannot be parsed as a {@code double} value
@throws NullPointerException if {@code string} is {@code null}
@since 14.0

