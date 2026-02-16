# Class: `AbstractIndexedListIterator`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.AbstractIndexedListIterator`

**Extends:** [`com.google.common.collect.UnmodifiableListIterator<E>`](./UnmodifiableListIterator.md)

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

This class provides a skeletal implementation of the {@link ListIterator} interface across a
 fixed number of elements that may be retrieved by position. It does not support {@link #remove},
 {@link #set}, or {@link #add}.
@author Jared Levy

## Fields

### `size`

**Type:** `int`

### `position`

**Type:** `int`

## Constructors

### `<init>(`int` size)`

Constructs an iterator across a sequence of the given size whose initial position is 0. That
 is, the first call to {@link #next()} will return the first element (or throw {@link NoSuchElementException} if {@code size} is zero).
@throws IllegalArgumentException if {@code size} is negative

### `<init>(`int` size, `int` position)`

Constructs an iterator across a sequence of the given size with the given initial position.
 That is, the first call to {@link #nextIndex()} will return {@code position}, and the first
 call to {@link #next()} will return the element at that index, if available. Calls to {@link #previous()} can retrieve the preceding {@code position} elements.
@throws IndexOutOfBoundsException if {@code position} is negative or is greater than {@code
     size}
@throws IllegalArgumentException if {@code size} is negative

## Methods

### `get(`int` index)`

**Returns:** [`E`](E.md)

Returns the element with the specified index. This method is called by {@link #next()}.

### `hasNext()`

**Returns:** `boolean`

### `next()`

**Returns:** [`E`](E.md)

### `nextIndex()`

**Returns:** `int`

### `hasPrevious()`

**Returns:** `boolean`

### `previous()`

**Returns:** [`E`](E.md)

### `previousIndex()`

**Returns:** `int`

