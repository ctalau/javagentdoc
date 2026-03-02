# Class: `Shorts`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.Shorts`

**Extends:** [`com.google.common.primitives.ShortsMethodsForWeb`](./ShortsMethodsForWeb.md)

## Description

See the Guava User Guide article on [primitive utilities](https://github.com/google/guava/wiki/PrimitivesExplained).

## Fields

### `BYTES`

**Type:** `int`

**Java 8 users:** use Short#BYTES instead.

### `MAX_POWER_OF_TWO`

**Type:** `short`

## Constructors

### `<init>()`

## Methods

### `hashCode(short value)`

**Returns:** `int`

**Java 8 users:** use Short#hashCode(short) instead.

**Parameters:**
- `value` (`short`): a primitive short value

### `checkedCast(long value)`

**Returns:** `short`

**Parameters:**
- `value` (`long`): any value in the range of the short type

### `saturatedCast(long value)`

**Returns:** `short`

**Parameters:**
- `value` (`long`): any long value

### `compare(short a, short b)`

**Returns:** `int`

The sign of the value returned is the same as
 that of ((Short) a).compareTo(b).

 
**Note for Java 7 and later:** this method should be treated as deprecated; use the
 equivalent Short#compare method instead.

**Parameters:**
- `a` (`short`): the first short to compare
- `b` (`short`): the second short to compare

### `contains(short[] array, short target)`

**Returns:** `boolean`

**Parameters:**
- `array` (`short[]`): an array of short values, possibly empty
- `target` (`short`): a primitive short value

### `indexOf(short[] array, short target)`

**Returns:** `int`

**Parameters:**
- `array` (`short[]`): an array of short values, possibly empty
- `target` (`short`): a primitive short value

### `indexOf(short[] array, short target, int start, int end)`

**Returns:** `int`

**Parameters:**
- `array` (`short[]`)
- `target` (`short`)
- `start` (`int`)
- `end` (`int`)

### `indexOf(short[] array, short[] target)`

**Returns:** `int`

More formally, returns the lowest index i such that Arrays.copyOfRange(array,
 i, i + target.length) contains exactly the same elements as target.

**Parameters:**
- `array` (`short[]`): the array to search for the sequence target
- `target` (`short[]`): the array to search for as a sub-sequence of array

### `lastIndexOf(short[] array, short target)`

**Returns:** `int`

**Parameters:**
- `array` (`short[]`): an array of short values, possibly empty
- `target` (`short`): a primitive short value

### `lastIndexOf(short[] array, short target, int start, int end)`

**Returns:** `int`

**Parameters:**
- `array` (`short[]`)
- `target` (`short`)
- `start` (`int`)
- `end` (`int`)

### `min(short[] array)`

**Returns:** `short`

**Parameters:**
- `array` (`short[]`): a *nonempty* array of short values

### `max(short[] array)`

**Returns:** `short`

**Parameters:**
- `array` (`short[]`): a *nonempty* array of short values

### `constrainToRange(short value, short min, short max)`

**Returns:** `short`

If value is within the range [min..max], value is returned
 unchanged. If value is less than min, min is returned, and if 
 value is greater than max, max is returned.

**Parameters:**
- `value` (`short`): the short value to constrain
- `min` (`short`): the lower bound (inclusive) of the range to constrain value to
- `max` (`short`): the upper bound (inclusive) of the range to constrain value to

### `concat(short[][] arrays)`

**Returns:** `short[]`

For example, 
 concat(new short[] {a, b}, new short[] {}, new short[] {c} returns the array {a, b,
 c}.

**Parameters:**
- `arrays` (`short[][]`): zero or more short arrays

### `toByteArray(short value)`

**Returns:** `byte[]`

For example, the input value 
 (short) 0x1234 would yield the byte array {0x12, 0x34}.

 
If you need to convert and concatenate several values (possibly even of different types),
 use a shared java.nio.ByteBuffer instance, or use com.google.common.io.ByteStreams#newDataOutput() to get a growable buffer.

**Parameters:**
- `value` (`short`)

### `fromByteArray(byte[] bytes)`

**Returns:** `short`

For example, the
 input byte array {0x54, 0x32} would yield the short value 0x5432.

 
Arguably, it's preferable to use java.nio.ByteBuffer; that library exposes much more
 flexibility at little cost in readability.

**Parameters:**
- `bytes` (`byte[]`)

### `fromBytes(byte b1, byte b2)`

**Returns:** `short`

**Parameters:**
- `b1` (`byte`)
- `b2` (`byte`)

### `stringConverter()`

**Returns:** [`com.google.common.base.Converter<java.lang.String,java.lang.Short>`](../base/Converter.md)

The returned converter throws NumberFormatException if the input string is invalid.

 
**Warning:** please see Short#decode to understand exactly how strings are
 parsed. For example, the string "0123" is treated as *octal* and converted to the
 value 83.

### `ensureCapacity(short[] array, int minLength, int padding)`

**Returns:** `short[]`

If array already has a length of at least minLength,
 it is returned directly. Otherwise, a new array of size minLength + padding is
 returned, containing the values of array, and zeroes in the remaining places.

**Parameters:**
- `array` (`short[]`): the source array
- `minLength` (`int`): the minimum length the returned array must guarantee
- `padding` (`int`): an extra amount to "grow" the array by if growth is necessary

### `join(java.lang.String separator, short[] array)`

**Returns:** `java.lang.String`

For example, join("-", (short) 1, (short) 2, (short) 3) returns the string 
 "1-2-3".

**Parameters:**
- `separator` (`java.lang.String`): the text that should appear between consecutive values in the resulting string
     (but not at the start or end)
- `array` (`short[]`): an array of short values, possibly empty

### `lexicographicalComparator()`

**Returns:** `java.util.Comparator<short[]>`

That is, it
 compares, using #compare(short, short)), the first pair of values that follow any
 common prefix, or when one array is a prefix of the other, treats the shorter array as the
 lesser. For example, [] < [(short) 1] < [(short) 1, (short) 2] < [(short) 2].

 
The returned comparator is inconsistent with Object#equals(Object) (since arrays
 support only identity equality), but it is consistent with Arrays#equals(short[],
 short[]).

### `sortDescending(short[] array)`

**Returns:** `void`

**Parameters:**
- `array` (`short[]`)

### `sortDescending(short[] array, int fromIndex, int toIndex)`

**Returns:** `void`

**Parameters:**
- `array` (`short[]`)
- `fromIndex` (`int`)
- `toIndex` (`int`)

### `reverse(short[] array)`

**Returns:** `void`

This is equivalent to 
 Collections.reverse(Shorts.asList(array)), but is likely to be more efficient.

**Parameters:**
- `array` (`short[]`)

### `reverse(short[] array, int fromIndex, int toIndex)`

**Returns:** `void`

This is equivalent to 
 Collections.reverse(Shorts.asList(array).subList(fromIndex, toIndex)), but is likely to be
 more efficient.

**Parameters:**
- `array` (`short[]`)
- `fromIndex` (`int`)
- `toIndex` (`int`)

### `rotate(short[] array, int distance)`

**Returns:** `void`

This is equivalent to Collections.rotate(Shorts.asList(array),
 distance), but is considerably faster and avoids allocation and garbage collection.

 
The provided "distance" may be negative, which will rotate left.

**Parameters:**
- `array` (`short[]`)
- `distance` (`int`)

### `rotate(short[] array, int distance, int fromIndex, int toIndex)`

**Returns:** `void`

This is equivalent to 
 Collections.rotate(Shorts.asList(array).subList(fromIndex, toIndex), distance), but is
 considerably faster and avoids allocations and garbage collection.

 
The provided "distance" may be negative, which will rotate left.

**Parameters:**
- `array` (`short[]`)
- `distance` (`int`)
- `fromIndex` (`int`)
- `toIndex` (`int`)

### `toArray(java.util.Collection<? extends java.lang.Number> collection)`

**Returns:** `short[]`

Elements are copied from the argument collection as if by collection.toArray().
 Calling this method is as thread-safe as calling that method.

**Parameters:**
- `collection` (`java.util.Collection<? extends java.lang.Number>`): a collection of Number instances

### `asList(short[] backingArray)`

**Returns:** `java.util.List<java.lang.Short>`

The list supports List#set(int, Object), but any attempt to
 set a value to null will result in a NullPointerException.

 
The returned list maintains the values, but not the identities, of Short objects
 written to or read from it. For example, whether list.get(0) == list.get(0) is true for
 the returned list is unspecified.

 
The returned list is serializable.

**Parameters:**
- `backingArray` (`short[]`): the array to back the list

