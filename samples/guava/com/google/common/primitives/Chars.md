# Class: `Chars`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.Chars`

## Description

All the operations in this class treat char values strictly numerically; they are
 neither Unicode-aware nor locale-dependent.

 
See the Guava User Guide article on [primitive utilities](https://github.com/google/guava/wiki/PrimitivesExplained).

## Fields

### `BYTES`

**Type:** `int`

**Java 8 users:** use Character#BYTES instead.

## Constructors

### `<init>()`

## Methods

### `hashCode(char value)`

**Java 8 users:** use Character#hashCode(char) instead.

**Parameters:**
- `value` (`char`): a primitive char value

**Returns:** `int`

### `checkedCast(long value)`

**Parameters:**
- `value` (`long`): any value in the range of the char type

**Returns:** `char`

### `saturatedCast(long value)`

**Parameters:**
- `value` (`long`): any long value

**Returns:** `char`

### `compare(char a, char b)`

The sign of the value returned is the same as
 that of ((Character) a).compareTo(b).

 
**Note for Java 7 and later:** this method should be treated as deprecated; use the
 equivalent Character#compare method instead.

**Parameters:**
- `a` (`char`): the first char to compare
- `b` (`char`): the second char to compare

**Returns:** `int`

### `contains(char[] array, char target)`

**Parameters:**
- `array` (`char[]`): an array of char values, possibly empty
- `target` (`char`): a primitive char value

**Returns:** `boolean`

### `indexOf(char[] array, char target)`

**Parameters:**
- `array` (`char[]`): an array of char values, possibly empty
- `target` (`char`): a primitive char value

**Returns:** `int`

### `indexOf(char[] array, char target, int start, int end)`

**Parameters:**
- `array` (`char[]`)
- `target` (`char`)
- `start` (`int`)
- `end` (`int`)

**Returns:** `int`

### `indexOf(char[] array, char[] target)`

More formally, returns the lowest index i such that Arrays.copyOfRange(array,
 i, i + target.length) contains exactly the same elements as target.

**Parameters:**
- `array` (`char[]`): the array to search for the sequence target
- `target` (`char[]`): the array to search for as a sub-sequence of array

**Returns:** `int`

### `lastIndexOf(char[] array, char target)`

**Parameters:**
- `array` (`char[]`): an array of char values, possibly empty
- `target` (`char`): a primitive char value

**Returns:** `int`

### `lastIndexOf(char[] array, char target, int start, int end)`

**Parameters:**
- `array` (`char[]`)
- `target` (`char`)
- `start` (`int`)
- `end` (`int`)

**Returns:** `int`

### `min(char[] array)`

**Parameters:**
- `array` (`char[]`): a *nonempty* array of char values

**Returns:** `char`

### `max(char[] array)`

**Parameters:**
- `array` (`char[]`): a *nonempty* array of char values

**Returns:** `char`

### `constrainToRange(char value, char min, char max)`

If value is within the range [min..max], value is returned
 unchanged. If value is less than min, min is returned, and if 
 value is greater than max, max is returned.

**Parameters:**
- `value` (`char`): the char value to constrain
- `min` (`char`): the lower bound (inclusive) of the range to constrain value to
- `max` (`char`): the upper bound (inclusive) of the range to constrain value to

**Returns:** `char`

### `concat(char[][] arrays)`

For example, 
 concat(new char[] {a, b}, new char[] {}, new char[] {c} returns the array {a, b, c}.

**Parameters:**
- `arrays` (`char[][]`): zero or more char arrays

**Returns:** `char[]`

### `toByteArray(char value)`

For example, the input value 
 '\\u5432' would yield the byte array {0x54, 0x32}.

 
If you need to convert and concatenate several values (possibly even of different types),
 use a shared java.nio.ByteBuffer instance, or use com.google.common.io.ByteStreams#newDataOutput() to get a growable buffer.

**Parameters:**
- `value` (`char`)

**Returns:** `byte[]`

### `fromByteArray(byte[] bytes)`

For example, the
 input byte array {0x54, 0x32} would yield the char value '\\u5432'.

 
Arguably, it's preferable to use java.nio.ByteBuffer; that library exposes much more
 flexibility at little cost in readability.

**Parameters:**
- `bytes` (`byte[]`)

**Returns:** `char`

### `fromBytes(byte b1, byte b2)`

**Parameters:**
- `b1` (`byte`)
- `b2` (`byte`)

**Returns:** `char`

### `ensureCapacity(char[] array, int minLength, int padding)`

If array already has a length of at least minLength,
 it is returned directly. Otherwise, a new array of size minLength + padding is
 returned, containing the values of array, and zeroes in the remaining places.

**Parameters:**
- `array` (`char[]`): the source array
- `minLength` (`int`): the minimum length the returned array must guarantee
- `padding` (`int`): an extra amount to "grow" the array by if growth is necessary

**Returns:** `char[]`

### `join(String separator, char[] array)`

For example, join("-", '1', '2', '3') returns the string "1-2-3".

**Parameters:**
- `separator` (`java.lang.String`): the text that should appear between consecutive values in the resulting string
       (but not at the start or end)
- `array` (`char[]`): an array of char values, possibly empty

**Returns:** `java.lang.String`

### `lexicographicalComparator()`

That is, it compares, using #compare(char, char)), the first pair of values
 that follow any common prefix, or when one array is a prefix of the other, treats the shorter
 array as the lesser. For example, [] < ['a'] < ['a', 'b'] < ['b'].

 
The returned comparator is inconsistent with Object#equals(Object) (since arrays
 support only identity equality), but it is consistent with Arrays#equals(char[],
 char[]).

**Returns:** `java.util.Comparator<char[]>`

### `toArray(Collection<Character> collection)`

Elements are copied from the argument collection as if by collection.toArray().
 Calling this method is as thread-safe as calling that method.

**Parameters:**
- `collection` (`java.util.Collection<java.lang.Character>`): a collection of Character objects

**Returns:** `char[]`

### `sortDescending(char[] array)`

**Parameters:**
- `array` (`char[]`)

**Returns:** `void`

### `sortDescending(char[] array, int fromIndex, int toIndex)`

**Parameters:**
- `array` (`char[]`)
- `fromIndex` (`int`)
- `toIndex` (`int`)

**Returns:** `void`

### `reverse(char[] array)`

This is equivalent to 
 Collections.reverse(Chars.asList(array)), but is likely to be more efficient.

**Parameters:**
- `array` (`char[]`)

**Returns:** `void`

### `reverse(char[] array, int fromIndex, int toIndex)`

This is equivalent to 
 Collections.reverse(Chars.asList(array).subList(fromIndex, toIndex)), but is likely to be more
 efficient.

**Parameters:**
- `array` (`char[]`)
- `fromIndex` (`int`)
- `toIndex` (`int`)

**Returns:** `void`

### `rotate(char[] array, int distance)`

This is equivalent to Collections.rotate(Chars.asList(array),
 distance), but is considerably faster and avoids allocation and garbage collection.

 
The provided "distance" may be negative, which will rotate left.

**Parameters:**
- `array` (`char[]`)
- `distance` (`int`)

**Returns:** `void`

### `rotate(char[] array, int distance, int fromIndex, int toIndex)`

This is equivalent to 
 Collections.rotate(Chars.asList(array).subList(fromIndex, toIndex), distance), but is
 considerably faster and avoids allocations and garbage collection.

 
The provided "distance" may be negative, which will rotate left.

**Parameters:**
- `array` (`char[]`)
- `distance` (`int`)
- `fromIndex` (`int`)
- `toIndex` (`int`)

**Returns:** `void`

### `asList(char[] backingArray)`

The list supports List#set(int, Object), but any attempt to
 set a value to null will result in a NullPointerException.

 
The returned list maintains the values, but not the identities, of Character objects
 written to or read from it. For example, whether list.get(0) == list.get(0) is true for
 the returned list is unspecified.

 
The returned list is serializable.

**Parameters:**
- `backingArray` (`char[]`): the array to back the list

**Returns:** `java.util.List<java.lang.Character>`

