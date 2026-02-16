# Class: `ObjectArrays`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ObjectArrays`

## Description

Static utility methods pertaining to object arrays.
**Author:** Kevin Bourrillion
**Since:** 2.0

## Constructors

### `<init>()`

## Methods

### `newArray(`java.lang.Class<@org.checkerframework.checker.nullness.qual.NonNull T>` type, `int` length)`

**Returns:** `T[]`

Returns a new array of the given length with the specified component type.
@param type the component type
@param length the length of the new array

### `newArray(`T[]` reference, `int` length)`

**Returns:** `T[]`

Returns a new array of the given length with the same type as a reference array.
@param reference any array of the desired type
@param length the length of the new array

### `concat(`T[]` first, `T[]` second, `java.lang.Class<@org.checkerframework.checker.nullness.qual.NonNull T>` type)`

**Returns:** `T[]`

Returns a new array that contains the concatenated contents of two arrays.
@param first the first array of elements to concatenate
@param second the second array of elements to concatenate
@param type the component type of the returned array

### `concat(`T` element, `T[]` array)`

**Returns:** `T[]`

Returns a new array that prepends `element` to `array`.
@param element the element to prepend to the front of `array`
@param array the array of elements to append
@return an array whose size is one larger than `array`, with `element` occupying
     the first position, and the elements of `array` occupying the remaining elements.

### `concat(`T[]` array, `T` element)`

**Returns:** `T[]`

Returns a new array that appends `element` to `array`.
@param array the array of elements to prepend
@param element the element to append to the end
@return an array whose size is one larger than `array`, with the same contents as `array`, plus `element` occupying the last position.

### `toArrayImpl(`java.util.Collection<?>` c, `T[]` array)`

**Returns:** `T[]`

Returns an array containing all of the elements in the specified collection; the runtime type
 of the returned array is that of the specified array. If the collection fits in the specified
 array, it is returned therein. Otherwise, a new array is allocated with the runtime type of the
 specified array and the size of the specified collection.

 <p>If the collection fits in the specified array with room to spare (i.e., the array has more
 elements than the collection), the element in the array immediately following the end of the
 collection is set to `null`. This is useful in determining the length of the collection
 <i>only</i> if the caller knows that the collection does not contain any null elements.

 <p>This method returns the elements in the order they are returned by the collection's
 iterator.

 <p>TODO(kevinb): support concurrently modified collections?
@param c the collection for which to return an array of elements
@param array the array in which to place the collection elements
@throws ArrayStoreException if the runtime type of the specified array is not a supertype of
     the runtime type of every element in the specified collection

### `toArrayImpl(`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]` src, `int` offset, `int` len, `T[]` dst)`

**Returns:** `T[]`

Implementation of `Collection.toArray(Object[])` for collections backed by an object
 array. the runtime type of the returned array is that of the specified array. If the collection
 fits in the specified array, it is returned therein. Otherwise, a new array is allocated with
 the runtime type of the specified array and the size of the specified collection.

 <p>If the collection fits in the specified array with room to spare (i.e., the array has more
 elements than the collection), the element in the array immediately following the end of the
 collection is set to `null`. This is useful in determining the length of the collection
 <i>only</i> if the caller knows that the collection does not contain any null elements.

### `toArrayImpl(`java.util.Collection<?>` c)`

**Returns:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`

Returns an array containing all of the elements in the specified collection. This method
 returns the elements in the order they are returned by the collection's iterator. The returned
 array is "safe" in that no references to it are maintained by the collection. The caller is
 thus free to modify the returned array.

 <p>This method assumes that the collection size doesn't change while the method is running.

 <p>TODO(kevinb): support concurrently modified collections?
@param c the collection for which to return an array of elements

### `copyAsObjectArray(`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]` elements, `int` offset, `int` length)`

**Returns:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`

Returns a copy of the specified subrange of the specified array that is literally an Object[],
 and not e.g. a `String[]`.

### `fillArray(`java.lang.Iterable<?>` elements, `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]` array)`

**Returns:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`

### `swap(`java.lang.Object[]` array, `int` i, `int` j)`

**Returns:** `void`

Swaps `array[i]` with `array[j]`.

### `checkElementsNotNull(`java.lang.Object[]` array)`

**Returns:** `java.lang.Object[]`

### `checkElementsNotNull(`java.lang.Object[]` array, `int` length)`

**Returns:** `java.lang.Object[]`

### `checkElementNotNull(`java.lang.Object` element, `int` index)`

**Returns:** `java.lang.Object`

