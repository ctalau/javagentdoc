# Class: `Longs`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.Longs`

## Description

See the Guava User Guide article on [primitive utilities](https://github.com/google/guava/wiki/PrimitivesExplained).

## Fields

### `BYTES`

**Type:** `int`

**Java 8 users:** use Long#BYTES instead.

### `MAX_POWER_OF_TWO`

**Type:** `long`

## Constructors

### `<init>()`

## Methods

### `hashCode(long value)`

**Returns:** `int`

This method always return the value specified by Long#hashCode() in java, which
 might be different from ((Long) value).hashCode() in GWT because Long#hashCode() in GWT does not obey the JRE contract.

 
**Java 8 users:** use Long#hashCode(long) instead.

**Parameters:**
- `value` (`long`): a primitive long value

### `compare(long a, long b)`

**Returns:** `int`

The sign of the value returned is the same as
 that of ((Long) a).compareTo(b).

 
**Note for Java 7 and later:** this method should be treated as deprecated; use the
 equivalent Long#compare method instead.

**Parameters:**
- `a` (`long`): the first long to compare
- `b` (`long`): the second long to compare

### `contains(long[] array, long target)`

**Returns:** `boolean`

**Parameters:**
- `array` (`long[]`): an array of long values, possibly empty
- `target` (`long`): a primitive long value

### `indexOf(long[] array, long target)`

**Returns:** `int`

**Parameters:**
- `array` (`long[]`): an array of long values, possibly empty
- `target` (`long`): a primitive long value

### `indexOf(long[] array, long target, int start, int end)`

**Returns:** `int`

**Parameters:**
- `array` (`long[]`)
- `target` (`long`)
- `start` (`int`)
- `end` (`int`)

### `indexOf(long[] array, long[] target)`

**Returns:** `int`

More formally, returns the lowest index i such that Arrays.copyOfRange(array,
 i, i + target.length) contains exactly the same elements as target.

**Parameters:**
- `array` (`long[]`): the array to search for the sequence target
- `target` (`long[]`): the array to search for as a sub-sequence of array

### `lastIndexOf(long[] array, long target)`

**Returns:** `int`

**Parameters:**
- `array` (`long[]`): an array of long values, possibly empty
- `target` (`long`): a primitive long value

### `lastIndexOf(long[] array, long target, int start, int end)`

**Returns:** `int`

**Parameters:**
- `array` (`long[]`)
- `target` (`long`)
- `start` (`int`)
- `end` (`int`)

### `min(long[] array)`

**Returns:** `long`

**Parameters:**
- `array` (`long[]`): a *nonempty* array of long values

### `max(long[] array)`

**Returns:** `long`

**Parameters:**
- `array` (`long[]`): a *nonempty* array of long values

### `constrainToRange(long value, long min, long max)`

**Returns:** `long`

If value is within the range [min..max], value is returned
 unchanged. If value is less than min, min is returned, and if 
 value is greater than max, max is returned.

**Parameters:**
- `value` (`long`): the long value to constrain
- `min` (`long`): the lower bound (inclusive) of the range to constrain value to
- `max` (`long`): the upper bound (inclusive) of the range to constrain value to

### `concat(long[][] arrays)`

**Returns:** `long[]`

For example, 
 concat(new long[] {a, b}, new long[] {}, new long[] {c} returns the array {a, b, c}.

**Parameters:**
- `arrays` (`long[][]`): zero or more long arrays

### `checkNoOverflow(long result)`

**Returns:** `int`

**Parameters:**
- `result` (`long`)

### `toByteArray(long value)`

**Returns:** `byte[]`

For example, the input value 
 0x1213141516171819L would yield the byte array {0x12, 0x13, 0x14, 0x15, 0x16, 0x17,
 0x18, 0x19}.

 
If you need to convert and concatenate several values (possibly even of different types),
 use a shared java.nio.ByteBuffer instance, or use com.google.common.io.ByteStreams#newDataOutput() to get a growable buffer.

**Parameters:**
- `value` (`long`)

### `fromByteArray(byte[] bytes)`

**Returns:** `long`

For example, the
 input byte array {0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19} would yield the
 long value 0x1213141516171819L.

 
Arguably, it's preferable to use java.nio.ByteBuffer; that library exposes much more
 flexibility at little cost in readability.

**Parameters:**
- `bytes` (`byte[]`)

### `fromBytes(byte b1, byte b2, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8)`

**Returns:** `long`

**Parameters:**
- `b1` (`byte`)
- `b2` (`byte`)
- `b3` (`byte`)
- `b4` (`byte`)
- `b5` (`byte`)
- `b6` (`byte`)
- `b7` (`byte`)
- `b8` (`byte`)

### `tryParse(java.lang.String string)`

**Returns:** `java.lang.Long`

The ASCII character '-' (
 `'&#92;u002D'`) is recognized as the minus sign.

 
Unlike Long#parseLong(String), this method returns null instead of throwing
 an exception if parsing fails. Additionally, this method only accepts ASCII digits, and returns
 null if non-ASCII digits are present in the string.

 
Note that strings prefixed with ASCII '+' are rejected, even under JDK 7, despite
 the change to Long#parseLong(String) for that version.

**Parameters:**
- `string` (`java.lang.String`): the string representation of a long value

### `tryParse(java.lang.String string, int radix)`

**Returns:** `java.lang.Long`

The ASCII
 character '-' (`'&#92;u002D'`) is recognized as the minus sign.

 
Unlike Long#parseLong(String, int), this method returns null instead of
 throwing an exception if parsing fails. Additionally, this method only accepts ASCII digits,
 and returns null if non-ASCII digits are present in the string.

 
Note that strings prefixed with ASCII '+' are rejected, even under JDK 7, despite
 the change to Long#parseLong(String, int) for that version.

**Parameters:**
- `string` (`java.lang.String`): the string representation of a long value
- `radix` (`int`): the radix to use when parsing

### `stringConverter()`

**Returns:** [`com.google.common.base.Converter<java.lang.String,java.lang.Long>`](../base/Converter.md)

The returned converter throws NumberFormatException if the input string is invalid.

 
**Warning:** please see Long#decode to understand exactly how strings are parsed.
 For example, the string "0123" is treated as *octal* and converted to the value
 83L.

### `ensureCapacity(long[] array, int minLength, int padding)`

**Returns:** `long[]`

If array already has a length of at least minLength,
 it is returned directly. Otherwise, a new array of size minLength + padding is
 returned, containing the values of array, and zeroes in the remaining places.

**Parameters:**
- `array` (`long[]`): the source array
- `minLength` (`int`): the minimum length the returned array must guarantee
- `padding` (`int`): an extra amount to "grow" the array by if growth is necessary

### `join(java.lang.String separator, long[] array)`

**Returns:** `java.lang.String`

For example, join("-", 1L, 2L, 3L) returns the string "1-2-3".

**Parameters:**
- `separator` (`java.lang.String`): the text that should appear between consecutive values in the resulting string
     (but not at the start or end)
- `array` (`long[]`): an array of long values, possibly empty

### `lexicographicalComparator()`

**Returns:** `java.util.Comparator<long[]>`

That is, it
 compares, using #compare(long, long)), the first pair of values that follow any common
 prefix, or when one array is a prefix of the other, treats the shorter array as the lesser. For
 example, [] < [1L] < [1L, 2L] < [2L].

 
The returned comparator is inconsistent with Object#equals(Object) (since arrays
 support only identity equality), but it is consistent with Arrays#equals(long[],
 long[]).

### `sortDescending(long[] array)`

**Returns:** `void`

**Parameters:**
- `array` (`long[]`)

### `sortDescending(long[] array, int fromIndex, int toIndex)`

**Returns:** `void`

**Parameters:**
- `array` (`long[]`)
- `fromIndex` (`int`)
- `toIndex` (`int`)

### `reverse(long[] array)`

**Returns:** `void`

This is equivalent to 
 Collections.reverse(Longs.asList(array)), but is likely to be more efficient.

**Parameters:**
- `array` (`long[]`)

### `reverse(long[] array, int fromIndex, int toIndex)`

**Returns:** `void`

This is equivalent to 
 Collections.reverse(Longs.asList(array).subList(fromIndex, toIndex)), but is likely to be more
 efficient.

**Parameters:**
- `array` (`long[]`)
- `fromIndex` (`int`)
- `toIndex` (`int`)

### `rotate(long[] array, int distance)`

**Returns:** `void`

This is equivalent to Collections.rotate(Longs.asList(array),
 distance), but is considerably faster and avoids allocation and garbage collection.

 
The provided "distance" may be negative, which will rotate left.

**Parameters:**
- `array` (`long[]`)
- `distance` (`int`)

### `rotate(long[] array, int distance, int fromIndex, int toIndex)`

**Returns:** `void`

This is equivalent to 
 Collections.rotate(Longs.asList(array).subList(fromIndex, toIndex), distance), but is
 considerably faster and avoids allocations and garbage collection.

 
The provided "distance" may be negative, which will rotate left.

**Parameters:**
- `array` (`long[]`)
- `distance` (`int`)
- `fromIndex` (`int`)
- `toIndex` (`int`)

### `toArray(java.util.Collection<? extends java.lang.Number> collection)`

**Returns:** `long[]`

Elements are copied from the argument collection as if by collection.toArray().
 Calling this method is as thread-safe as calling that method.

**Parameters:**
- `collection` (`java.util.Collection<? extends java.lang.Number>`): a collection of Number instances

### `asList(long[] backingArray)`

**Returns:** `java.util.List<java.lang.Long>`

The list supports List#set(int, Object), but any attempt to
 set a value to null will result in a NullPointerException.

 
The returned list maintains the values, but not the identities, of Long objects
 written to or read from it. For example, whether list.get(0) == list.get(0) is true for
 the returned list is unspecified.

 
The returned list is serializable.

 
**Note:** when possible, you should represent your data as an ImmutableLongArray
 instead, which has an asList view.

**Parameters:**
- `backingArray` (`long[]`): the array to back the list

