# Class: `ObjectArrays`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ObjectArrays`

## Description

## Constructors

### `<init>()`

## Methods

### `newArray(java.lang.Class<@org.checkerframework.checker.nullness.qual.NonNull T> type, int length)`

**Returns:** `T[]`

**Parameters:**
- `type` (`java.lang.Class<@org.checkerframework.checker.nullness.qual.NonNull T>`): the component type
- `length` (`int`): the length of the new array

### `newArray(T[] reference, int length)`

**Returns:** `T[]`

**Parameters:**
- `reference` (`T[]`): any array of the desired type
- `length` (`int`): the length of the new array

### `concat(T[] first, T[] second, java.lang.Class<@org.checkerframework.checker.nullness.qual.NonNull T> type)`

**Returns:** `T[]`

**Parameters:**
- `first` (`T[]`): the first array of elements to concatenate
- `second` (`T[]`): the second array of elements to concatenate
- `type` (`java.lang.Class<@org.checkerframework.checker.nullness.qual.NonNull T>`): the component type of the returned array

### `concat(T element, T[] array)`

**Returns:** `T[]`

**Parameters:**
- `element` (`T`): the element to prepend to the front of array
- `array` (`T[]`): the array of elements to append

### `concat(T[] array, T element)`

**Returns:** `T[]`

**Parameters:**
- `array` (`T[]`): the array of elements to prepend
- `element` (`T`): the element to append to the end

### `toArrayImpl(java.util.Collection<?> c, T[] array)`

**Returns:** `T[]`

If the collection fits in the specified
 array, it is returned therein. Otherwise, a new array is allocated with the runtime type of the
 specified array and the size of the specified collection.

 
If the collection fits in the specified array with room to spare (i.e., the array has more
 elements than the collection), the element in the array immediately following the end of the
 collection is set to null. This is useful in determining the length of the collection
 *only* if the caller knows that the collection does not contain any null elements.

 
This method returns the elements in the order they are returned by the collection's
 iterator.

 
TODO(kevinb): support concurrently modified collections?

**Parameters:**
- `c` (`java.util.Collection<?>`): the collection for which to return an array of elements
- `array` (`T[]`): the array in which to place the collection elements

### `toArrayImpl(java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[] src, int offset, int len, T[] dst)`

**Returns:** `T[]`

the runtime type of the returned array is that of the specified array. If the collection
 fits in the specified array, it is returned therein. Otherwise, a new array is allocated with
 the runtime type of the specified array and the size of the specified collection.

 
If the collection fits in the specified array with room to spare (i.e., the array has more
 elements than the collection), the element in the array immediately following the end of the
 collection is set to null. This is useful in determining the length of the collection
 *only* if the caller knows that the collection does not contain any null elements.

**Parameters:**
- `src` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)
- `offset` (`int`)
- `len` (`int`)
- `dst` (`T[]`)

### `toArrayImpl(java.util.Collection<?> c)`

**Returns:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`

This method
 returns the elements in the order they are returned by the collection's iterator. The returned
 array is "safe" in that no references to it are maintained by the collection. The caller is
 thus free to modify the returned array.

 
This method assumes that the collection size doesn't change while the method is running.

 
TODO(kevinb): support concurrently modified collections?

**Parameters:**
- `c` (`java.util.Collection<?>`): the collection for which to return an array of elements

### `copyAsObjectArray(java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[] elements, int offset, int length)`

**Returns:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`

a String[].

**Parameters:**
- `elements` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)
- `offset` (`int`)
- `length` (`int`)

### `fillArray(java.lang.Iterable<?> elements, java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[] array)`

**Returns:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`

**Parameters:**
- `elements` (`java.lang.Iterable<?>`)
- `array` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)

### `swap(java.lang.Object[] array, int i, int j)`

**Returns:** `void`

**Parameters:**
- `array` (`java.lang.Object[]`)
- `i` (`int`)
- `j` (`int`)

### `checkElementsNotNull(java.lang.Object[] array)`

**Returns:** `java.lang.Object[]`

**Parameters:**
- `array` (`java.lang.Object[]`)

### `checkElementsNotNull(java.lang.Object[] array, int length)`

**Returns:** `java.lang.Object[]`

**Parameters:**
- `array` (`java.lang.Object[]`)
- `length` (`int`)

### `checkElementNotNull(java.lang.Object element, int index)`

**Returns:** `java.lang.Object`

**Parameters:**
- `element` (`java.lang.Object`)
- `index` (`int`)

