# Class: `Bytes`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.Bytes`

## Description

The methods which specifically treat bytes as signed or unsigned are found in SignedBytes
 and UnsignedBytes.

 
See the Guava User Guide article on [primitive utilities](https://github.com/google/guava/wiki/PrimitivesExplained).

## Constructors

### `<init>()`

## Methods

### `hashCode(byte value)`

**Java 8 users:** use Byte#hashCode(byte) instead.

**Parameters:**
- `value` (`byte`): a primitive byte value

**Returns:** `int`

### `contains(byte[] array, byte target)`

**Parameters:**
- `array` (`byte[]`): an array of byte values, possibly empty
- `target` (`byte`): a primitive byte value

**Returns:** `boolean`

### `indexOf(byte[] array, byte target)`

**Parameters:**
- `array` (`byte[]`): an array of byte values, possibly empty
- `target` (`byte`): a primitive byte value

**Returns:** `int`

### `indexOf(byte[] array, byte target, int start, int end)`

**Parameters:**
- `array` (`byte[]`)
- `target` (`byte`)
- `start` (`int`)
- `end` (`int`)

**Returns:** `int`

### `indexOf(byte[] array, byte[] target)`

More formally, returns the lowest index i such that Arrays.copyOfRange(array,
 i, i + target.length) contains exactly the same elements as target.

**Parameters:**
- `array` (`byte[]`): the array to search for the sequence target
- `target` (`byte[]`): the array to search for as a sub-sequence of array

**Returns:** `int`

### `lastIndexOf(byte[] array, byte target)`

**Parameters:**
- `array` (`byte[]`): an array of byte values, possibly empty
- `target` (`byte`): a primitive byte value

**Returns:** `int`

### `lastIndexOf(byte[] array, byte target, int start, int end)`

**Parameters:**
- `array` (`byte[]`)
- `target` (`byte`)
- `start` (`int`)
- `end` (`int`)

**Returns:** `int`

### `concat(byte[][] arrays)`

For example, 
 concat(new byte[] {a, b}, new byte[] {}, new byte[] {c} returns the array {a, b, c}.

**Parameters:**
- `arrays` (`byte[][]`): zero or more byte arrays

**Returns:** `byte[]`

### `ensureCapacity(byte[] array, int minLength, int padding)`

If array already has a length of at least minLength,
 it is returned directly. Otherwise, a new array of size minLength + padding is
 returned, containing the values of array, and zeroes in the remaining places.

**Parameters:**
- `array` (`byte[]`): the source array
- `minLength` (`int`): the minimum length the returned array must guarantee
- `padding` (`int`): an extra amount to "grow" the array by if growth is necessary

**Returns:** `byte[]`

### `toArray(Collection<? extends Number> collection)`

Elements are copied from the argument collection as if by collection.toArray().
 Calling this method is as thread-safe as calling that method.

**Parameters:**
- `collection` (`java.util.Collection<? extends java.lang.Number>`): a collection of Number instances

**Returns:** `byte[]`

### `asList(byte[] backingArray)`

The list supports List#set(int, Object), but any attempt to
 set a value to null will result in a NullPointerException.

 
The returned list maintains the values, but not the identities, of Byte objects
 written to or read from it. For example, whether list.get(0) == list.get(0) is true for
 the returned list is unspecified.

 
The returned list is serializable.

**Parameters:**
- `backingArray` (`byte[]`): the array to back the list

**Returns:** `java.util.List<java.lang.Byte>`

### `reverse(byte[] array)`

This is equivalent to 
 Collections.reverse(Bytes.asList(array)), but is likely to be more efficient.

**Parameters:**
- `array` (`byte[]`)

**Returns:** `void`

### `reverse(byte[] array, int fromIndex, int toIndex)`

This is equivalent to 
 Collections.reverse(Bytes.asList(array).subList(fromIndex, toIndex)), but is likely to be more
 efficient.

**Parameters:**
- `array` (`byte[]`)
- `fromIndex` (`int`)
- `toIndex` (`int`)

**Returns:** `void`

### `rotate(byte[] array, int distance)`

This is equivalent to Collections.rotate(Bytes.asList(array),
 distance), but is somewhat faster.

 
The provided "distance" may be negative, which will rotate left.

**Parameters:**
- `array` (`byte[]`)
- `distance` (`int`)

**Returns:** `void`

### `rotate(byte[] array, int distance, int fromIndex, int toIndex)`

This is equivalent to 
 Collections.rotate(Bytes.asList(array).subList(fromIndex, toIndex), distance), but is somewhat
 faster.

 
The provided "distance" may be negative, which will rotate left.

**Parameters:**
- `array` (`byte[]`)
- `distance` (`int`)
- `fromIndex` (`int`)
- `toIndex` (`int`)

**Returns:** `void`

