# Class: `AbstractIndexedListIterator`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.AbstractIndexedListIterator`

**Extends:** [`com.google.common.collect.UnmodifiableListIterator<E>`](./UnmodifiableListIterator.md)

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

It does not support #remove,
 #set, or #add.

## Fields

### `size`

**Type:** `int`

### `position`

**Type:** `int`

## Constructors

### `<init>(int size)`

That
 is, the first call to #next() will return the first element (or throw NoSuchElementException if size is zero).

**Parameters:**
- `size` (`int`)

### `<init>(int size, int position)`

That is, the first call to #nextIndex() will return position, and the first
 call to #next() will return the element at that index, if available. Calls to #previous() can retrieve the preceding position elements.

**Parameters:**
- `size` (`int`)
- `position` (`int`)

## Methods

### `get(int index)`

This method is called by #next().

**Parameters:**
- `index` (`int`)

**Returns:** `E`

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

