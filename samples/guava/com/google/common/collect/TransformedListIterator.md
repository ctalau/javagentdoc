# Class: `TransformedListIterator`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.TransformedListIterator`

**Extends:** [`com.google.common.collect.TransformedIterator<F,T>`](./TransformedIterator.md)

**Implements:** `java.util.ListIterator<T>`

## Type Parameters

- `F` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

This avoids the object
 overhead of constructing a Function for internal methods.

## Constructors

### `<init>(java.util.ListIterator<? extends F> backingIterator)`

**Parameters:**
- `backingIterator` (`java.util.ListIterator<? extends F>`)

## Methods

### `backingIterator()`

**Returns:** `java.util.ListIterator<? extends F>`

### `hasPrevious()`

**Returns:** `boolean`

### `previous()`

**Returns:** `T`

### `nextIndex()`

**Returns:** `int`

### `previousIndex()`

**Returns:** `int`

### `set(T element)`

**Returns:** `void`

**Parameters:**
- `element` (`T`)

### `add(T element)`

**Returns:** `void`

**Parameters:**
- `element` (`T`)

