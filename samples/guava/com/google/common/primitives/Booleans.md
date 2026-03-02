# Class: `Booleans`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.Booleans`

## Description

See the Guava User Guide article on [primitive utilities](https://github.com/google/guava/wiki/PrimitivesExplained).

## Constructors

### `<init>()`

## Methods

### `trueFirst()`

**Returns:** `java.util.Comparator<java.lang.Boolean>`

This is particularly useful in Java 8+ in combination with Comparators.comparing,
 e.g. Comparators.comparing(Foo::hasBar, trueFirst()).

### `falseFirst()`

**Returns:** `java.util.Comparator<java.lang.Boolean>`

This is particularly useful in Java 8+ in combination with Comparators.comparing,
 e.g. Comparators.comparing(Foo::hasBar, falseFirst()).

### `hashCode(boolean value)`

**Returns:** `int`

**Java 8 users:** use Boolean#hashCode(boolean) instead.

**Parameters:**
- `value` (`boolean`): a primitive boolean value

### `compare(boolean a, boolean b)`

**Returns:** `int`

The sign of the value returned is the same as that of
 ((Boolean) a).compareTo(b).

 
**Note for Java 7 and later:** this method should be treated as deprecated; use the
 equivalent Boolean#compare method instead.

**Parameters:**
- `a` (`boolean`): the first boolean to compare
- `b` (`boolean`): the second boolean to compare

### `contains(boolean[] array, boolean target)`

**Returns:** `boolean`

**Note:** consider representing the array as a java.util.BitSet instead,
 replacing Booleans.contains(array, true) with !bitSet.isEmpty() and 
 Booleans.contains(array, false) with bitSet.nextClearBit(0) == sizeOfBitSet.

**Parameters:**
- `array` (`boolean[]`): an array of boolean values, possibly empty
- `target` (`boolean`): a primitive boolean value

### `indexOf(boolean[] array, boolean target)`

**Returns:** `int`

**Note:** consider representing the array as a java.util.BitSet instead, and
 using java.util.BitSet#nextSetBit(int) or java.util.BitSet#nextClearBit(int).

**Parameters:**
- `array` (`boolean[]`): an array of boolean values, possibly empty
- `target` (`boolean`): a primitive boolean value

### `indexOf(boolean[] array, boolean target, int start, int end)`

**Returns:** `int`

**Parameters:**
- `array` (`boolean[]`)
- `target` (`boolean`)
- `start` (`int`)
- `end` (`int`)

### `indexOf(boolean[] array, boolean[] target)`

**Returns:** `int`

More formally, returns the lowest index i such that Arrays.copyOfRange(array,
 i, i + target.length) contains exactly the same elements as target.

**Parameters:**
- `array` (`boolean[]`): the array to search for the sequence target
- `target` (`boolean[]`): the array to search for as a sub-sequence of array

### `lastIndexOf(boolean[] array, boolean target)`

**Returns:** `int`

**Parameters:**
- `array` (`boolean[]`): an array of boolean values, possibly empty
- `target` (`boolean`): a primitive boolean value

### `lastIndexOf(boolean[] array, boolean target, int start, int end)`

**Returns:** `int`

**Parameters:**
- `array` (`boolean[]`)
- `target` (`boolean`)
- `start` (`int`)
- `end` (`int`)

### `concat(boolean[][] arrays)`

**Returns:** `boolean[]`

For example, 
 concat(new boolean[] {a, b}, new boolean[] {}, new boolean[] {c} returns the array {a,
 b, c}.

**Parameters:**
- `arrays` (`boolean[][]`): zero or more boolean arrays

### `ensureCapacity(boolean[] array, int minLength, int padding)`

**Returns:** `boolean[]`

If array already has a length of at least minLength,
 it is returned directly. Otherwise, a new array of size minLength + padding is
 returned, containing the values of array, and zeroes in the remaining places.

**Parameters:**
- `array` (`boolean[]`): the source array
- `minLength` (`int`): the minimum length the returned array must guarantee
- `padding` (`int`): an extra amount to "grow" the array by if growth is necessary

### `join(java.lang.String separator, boolean[] array)`

**Returns:** `java.lang.String`

For example, join("-", false, true, false) returns the string 
 "false-true-false".

**Parameters:**
- `separator` (`java.lang.String`): the text that should appear between consecutive values in the resulting string
     (but not at the start or end)
- `array` (`boolean[]`): an array of boolean values, possibly empty

### `lexicographicalComparator()`

**Returns:** `java.util.Comparator<boolean[]>`

That is, it
 compares, using #compare(boolean, boolean)), the first pair of values that follow any
 common prefix, or when one array is a prefix of the other, treats the shorter array as the
 lesser. For example, [] < [false] < [false, true] < [true].

 
The returned comparator is inconsistent with Object#equals(Object) (since arrays
 support only identity equality), but it is consistent with Arrays#equals(boolean[],
 boolean[]).

### `toArray(java.util.Collection<java.lang.Boolean> collection)`

**Returns:** `boolean[]`

Elements are copied from the argument collection as if by collection.toArray().
 Calling this method is as thread-safe as calling that method.

 
**Note:** consider representing the collection as a java.util.BitSet instead.

**Parameters:**
- `collection` (`java.util.Collection<java.lang.Boolean>`): a collection of Boolean objects

### `asList(boolean[] backingArray)`

**Returns:** `java.util.List<java.lang.Boolean>`

The list supports List#set(int, Object), but any attempt to
 set a value to null will result in a NullPointerException.

 
There are at most two distinct objects in this list, (Boolean) true and 
 (Boolean) false. Java guarantees that those are always represented by the same objects.

 
The returned list is serializable.

**Parameters:**
- `backingArray` (`boolean[]`): the array to back the list

### `countTrue(boolean[] values)`

**Returns:** `int`

**Parameters:**
- `values` (`boolean[]`)

### `reverse(boolean[] array)`

**Returns:** `void`

This is equivalent to 
 Collections.reverse(Booleans.asList(array)), but is likely to be more efficient.

**Parameters:**
- `array` (`boolean[]`)

### `reverse(boolean[] array, int fromIndex, int toIndex)`

**Returns:** `void`

This is equivalent to 
 Collections.reverse(Booleans.asList(array).subList(fromIndex, toIndex)), but is likely to be
 more efficient.

**Parameters:**
- `array` (`boolean[]`)
- `fromIndex` (`int`)
- `toIndex` (`int`)

### `rotate(boolean[] array, int distance)`

**Returns:** `void`

This is equivalent to Collections.rotate(Booleans.asList(array),
 distance), but is somewhat faster.

 
The provided "distance" may be negative, which will rotate left.

**Parameters:**
- `array` (`boolean[]`)
- `distance` (`int`)

### `rotate(boolean[] array, int distance, int fromIndex, int toIndex)`

**Returns:** `void`

This is equivalent to 
 Collections.rotate(Booleans.asList(array).subList(fromIndex, toIndex), distance), but is
 somewhat faster.

 
The provided "distance" may be negative, which will rotate left.

**Parameters:**
- `array` (`boolean[]`)
- `distance` (`int`)
- `fromIndex` (`int`)
- `toIndex` (`int`)

