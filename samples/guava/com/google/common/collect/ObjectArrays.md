# Class: `ObjectArrays`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ObjectArrays`

## Description

## Constructors

### `<init>()`

## Methods

### `newArray(Class<@NonNull T> type, int length)`

**Parameters:**
- `type` (`java.lang.Class<@org.checkerframework.checker.nullness.qual.NonNull T>`): the component type
- `length` (`int`): the length of the new array

**Returns:** `T[]`

### `newArray(T[] reference, int length)`

**Parameters:**
- `reference` (`T[]`): any array of the desired type
- `length` (`int`): the length of the new array

**Returns:** `T[]`

### `concat(T[] first, T[] second, Class<@NonNull T> type)`

**Parameters:**
- `first` (`T[]`): the first array of elements to concatenate
- `second` (`T[]`): the second array of elements to concatenate
- `type` (`java.lang.Class<@org.checkerframework.checker.nullness.qual.NonNull T>`): the component type of the returned array

**Returns:** `T[]`

### `concat(T element, T[] array)`

**Parameters:**
- `element` (`T`): the element to prepend to the front of array
- `array` (`T[]`): the array of elements to append

**Returns:** `T[]`

### `concat(T[] array, T element)`

**Parameters:**
- `array` (`T[]`): the array of elements to prepend
- `element` (`T`): the element to append to the end

**Returns:** `T[]`

### `toArrayImpl(Collection<?> c, T[] array)`

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

**Returns:** `T[]`

### `toArrayImpl(lang@Nullable Object[] src, int offset, int len, T[] dst)`

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

**Returns:** `T[]`

### `toArrayImpl(Collection<?> c)`

This method
 returns the elements in the order they are returned by the collection's iterator. The returned
 array is "safe" in that no references to it are maintained by the collection. The caller is
 thus free to modify the returned array.

 
This method assumes that the collection size doesn't change while the method is running.

 
TODO(kevinb): support concurrently modified collections?

**Parameters:**
- `c` (`java.util.Collection<?>`): the collection for which to return an array of elements

**Returns:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`

### `copyAsObjectArray(lang@Nullable Object[] elements, int offset, int length)`

a String[].

**Parameters:**
- `elements` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)
- `offset` (`int`)
- `length` (`int`)

**Returns:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`

### `fillArray(Iterable<?> elements, lang@Nullable Object[] array)`

**Parameters:**
- `elements` (`java.lang.Iterable<?>`)
- `array` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)

**Returns:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`

### `swap(Object[] array, int i, int j)`

**Parameters:**
- `array` (`java.lang.Object[]`)
- `i` (`int`)
- `j` (`int`)

**Returns:** `void`

### `checkElementsNotNull(Object[] array)`

**Parameters:**
- `array` (`java.lang.Object[]`)

**Returns:** `java.lang.Object[]`

### `checkElementsNotNull(Object[] array, int length)`

**Parameters:**
- `array` (`java.lang.Object[]`)
- `length` (`int`)

**Returns:** `java.lang.Object[]`

### `checkElementNotNull(Object element, int index)`

**Parameters:**
- `element` (`java.lang.Object`)
- `index` (`int`)

**Returns:** `java.lang.Object`

