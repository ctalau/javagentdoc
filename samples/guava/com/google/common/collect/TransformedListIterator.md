# Class: `TransformedListIterator`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.TransformedListIterator`

**Extends:** [`com.google.common.collect.TransformedIterator<F,T>`](./TransformedIterator.md)

**Implements:** [`java.util.ListIterator<T>`](../../../../java/util/ListIterator.md)

## Type Parameters

- `F` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

An iterator that transforms a backing list iterator; for internal use. This avoids the object
 overhead of constructing a {@link Function} for internal methods.
@author Louis Wasserman

## Constructors

### `<init>([`java.util.ListIterator<? extends F>`](../../../../java/util/ListIterator.md) backingIterator)`

## Methods

### `backingIterator()`

**Returns:** [`java.util.ListIterator<? extends F>`](../../../../java/util/ListIterator.md)

### `hasPrevious()`

**Returns:** `boolean`

### `previous()`

**Returns:** [`T`](T.md)

### `nextIndex()`

**Returns:** `int`

### `previousIndex()`

**Returns:** `int`

### `set([`T`](T.md) element)`

**Returns:** `void`

### `add([`T`](T.md) element)`

**Returns:** `void`

