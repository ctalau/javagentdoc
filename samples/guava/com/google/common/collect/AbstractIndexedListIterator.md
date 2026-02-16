# Class: `AbstractIndexedListIterator`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.AbstractIndexedListIterator`

**Extends:** [`com.google.common.collect.UnmodifiableListIterator<E>`](./UnmodifiableListIterator.md)

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

This class provides a skeletal implementation of the `ListIterator` interface across a
 fixed number of elements that may be retrieved by position. It does not support `remove`,
 `set`, or `add`.
**Author:** Jared Levy

## Fields

### `size`

**Type:** `int`

### `position`

**Type:** `int`

## Constructors

### `<init>(`int` size)`

Constructs an iterator across a sequence of the given size whose initial position is 0. That
 is, the first call to `next()` will return the first element (or throw `NoSuchElementException` if `size` is zero).
@throws IllegalArgumentException if `size` is negative

### `<init>(`int` size, `int` position)`

Constructs an iterator across a sequence of the given size with the given initial position.
 That is, the first call to `nextIndex()` will return `position`, and the first
 call to `next()` will return the element at that index, if available. Calls to `previous()` can retrieve the preceding `position` elements.
@throws IndexOutOfBoundsException if `position` is negative or is greater than `size`
@throws IllegalArgumentException if `size` is negative

## Methods

### `get(`int` index)`

**Returns:** `E`

Returns the element with the specified index. This method is called by `next()`.

### `hasNext()`

**Returns:** `boolean`

### `next()`

**Returns:** `E`

### `nextIndex()`

**Returns:** `int`

### `hasPrevious()`

**Returns:** `boolean`

### `previous()`

**Returns:** `E`

### `previousIndex()`

**Returns:** `int`

