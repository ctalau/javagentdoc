# Class: `Booleans`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.Booleans`

## Description

See the Guava User Guide article on [primitive utilities](https://github.com/google/guava/wiki/PrimitivesExplained).

## Constructors

### `<init>()`

## Methods

### `trueFirst()`

This is particularly useful in Java 8+ in combination with Comparators.comparing,
 e.g. Comparators.comparing(Foo::hasBar, trueFirst()).

**Returns:** `java.util.Comparator<java.lang.Boolean>`

### `falseFirst()`

This is particularly useful in Java 8+ in combination with Comparators.comparing,
 e.g. Comparators.comparing(Foo::hasBar, falseFirst()).

**Returns:** `java.util.Comparator<java.lang.Boolean>`

### `hashCode(boolean value)`

**Java 8 users:** use Boolean#hashCode(boolean) instead.

**Parameters:**
- `value` (`boolean`): a primitive boolean value

**Returns:** `int`

### `compare(boolean a, boolean b)`

The sign of the value returned is the same as that of
 ((Boolean) a).compareTo(b).

 
**Note for Java 7 and later:** this method should be treated as deprecated; use the
 equivalent Boolean#compare method instead.

**Parameters:**
- `a` (`boolean`): the first boolean to compare
- `b` (`boolean`): the second boolean to compare

**Returns:** `int`

### `contains(boolean[] array, boolean target)`

**Note:** consider representing the array as a java.util.BitSet instead,
 replacing Booleans.contains(array, true) with !bitSet.isEmpty() and 
 Booleans.contains(array, false) with bitSet.nextClearBit(0) == sizeOfBitSet.

**Parameters:**
- `array` (`boolean[]`): an array of boolean values, possibly empty
- `target` (`boolean`): a primitive boolean value

**Returns:** `boolean`

### `indexOf(boolean[] array, boolean target)`

**Note:** consider representing the array as a java.util.BitSet instead, and
 using java.util.BitSet#nextSetBit(int) or java.util.BitSet#nextClearBit(int).

**Parameters:**
- `array` (`boolean[]`): an array of boolean values, possibly empty
- `target` (`boolean`): a primitive boolean value

**Returns:** `int`

### `indexOf(boolean[] array, boolean target, int start, int end)`

**Parameters:**
- `array` (`boolean[]`)
- `target` (`boolean`)
- `start` (`int`)
- `end` (`int`)

**Returns:** `int`

### `indexOf(boolean[] array, boolean[] target)`

More formally, returns the lowest index i such that Arrays.copyOfRange(array,
 i, i + target.length) contains exactly the same elements as target.

**Parameters:**
- `array` (`boolean[]`): the array to search for the sequence target
- `target` (`boolean[]`): the array to search for as a sub-sequence of array

**Returns:** `int`

### `lastIndexOf(boolean[] array, boolean target)`

**Parameters:**
- `array` (`boolean[]`): an array of boolean values, possibly empty
- `target` (`boolean`): a primitive boolean value

**Returns:** `int`

### `lastIndexOf(boolean[] array, boolean target, int start, int end)`

**Parameters:**
- `array` (`boolean[]`)
- `target` (`boolean`)
- `start` (`int`)
- `end` (`int`)

**Returns:** `int`

### `concat(boolean[][] arrays)`

For example, 
 concat(new boolean[] {a, b}, new boolean[] {}, new boolean[] {c} returns the array {a,
 b, c}.

**Parameters:**
- `arrays` (`boolean[][]`): zero or more boolean arrays

**Returns:** `boolean[]`

### `ensureCapacity(boolean[] array, int minLength, int padding)`

If array already has a length of at least minLength,
 it is returned directly. Otherwise, a new array of size minLength + padding is
 returned, containing the values of array, and zeroes in the remaining places.

**Parameters:**
- `array` (`boolean[]`): the source array
- `minLength` (`int`): the minimum length the returned array must guarantee
- `padding` (`int`): an extra amount to "grow" the array by if growth is necessary

**Returns:** `boolean[]`

### `join(String separator, boolean[] array)`

For example, join("-", false, true, false) returns the string 
 "false-true-false".

**Parameters:**
- `separator` (`java.lang.String`): the text that should appear between consecutive values in the resulting string
       (but not at the start or end)
- `array` (`boolean[]`): an array of boolean values, possibly empty

**Returns:** `java.lang.String`

### `lexicographicalComparator()`

That is, it
 compares, using #compare(boolean, boolean)), the first pair of values that follow any
 common prefix, or when one array is a prefix of the other, treats the shorter array as the
 lesser. For example, [] < [false] < [false, true] < [true].

 
The returned comparator is inconsistent with Object#equals(Object) (since arrays
 support only identity equality), but it is consistent with Arrays#equals(boolean[],
 boolean[]).

**Returns:** `java.util.Comparator<boolean[]>`

### `toArray(Collection<Boolean> collection)`

Elements are copied from the argument collection as if by collection.toArray().
 Calling this method is as thread-safe as calling that method.

 
**Note:** consider representing the collection as a java.util.BitSet instead.

**Parameters:**
- `collection` (`java.util.Collection<java.lang.Boolean>`): a collection of Boolean objects

**Returns:** `boolean[]`

### `asList(boolean[] backingArray)`

The list supports List#set(int, Object), but any attempt to
 set a value to null will result in a NullPointerException.

 
There are at most two distinct objects in this list, (Boolean) true and 
 (Boolean) false. Java guarantees that those are always represented by the same objects.

 
The returned list is serializable.

**Parameters:**
- `backingArray` (`boolean[]`): the array to back the list

**Returns:** `java.util.List<java.lang.Boolean>`

### `countTrue(boolean[] values)`

**Parameters:**
- `values` (`boolean[]`)

**Returns:** `int`

### `reverse(boolean[] array)`

This is equivalent to 
 Collections.reverse(Booleans.asList(array)), but is likely to be more efficient.

**Parameters:**
- `array` (`boolean[]`)

**Returns:** `void`

### `reverse(boolean[] array, int fromIndex, int toIndex)`

This is equivalent to 
 Collections.reverse(Booleans.asList(array).subList(fromIndex, toIndex)), but is likely to be
 more efficient.

**Parameters:**
- `array` (`boolean[]`)
- `fromIndex` (`int`)
- `toIndex` (`int`)

**Returns:** `void`

### `rotate(boolean[] array, int distance)`

This is equivalent to Collections.rotate(Booleans.asList(array),
 distance), but is somewhat faster.

 
The provided "distance" may be negative, which will rotate left.

**Parameters:**
- `array` (`boolean[]`)
- `distance` (`int`)

**Returns:** `void`

### `rotate(boolean[] array, int distance, int fromIndex, int toIndex)`

This is equivalent to 
 Collections.rotate(Booleans.asList(array).subList(fromIndex, toIndex), distance), but is
 somewhat faster.

 
The provided "distance" may be negative, which will rotate left.

**Parameters:**
- `array` (`boolean[]`)
- `distance` (`int`)
- `fromIndex` (`int`)
- `toIndex` (`int`)

**Returns:** `void`

