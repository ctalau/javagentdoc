# Class: `SingletonImmutableList`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.SingletonImmutableList`

**Extends:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

Implementation of {@link ImmutableList} with exactly one element.
@author Hayward Chan

## Fields

### `element`

**Type:** [`E`](E.md)

## Constructors

### `<init>([`E`](E.md) element)`

## Methods

### `get(`int` index)`

**Returns:** [`E`](E.md)

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<E>`](./UnmodifiableIterator.md)

### `spliterator()`

**Returns:** [`java.util.Spliterator<E>`](../../../../java/util/Spliterator.md)

### `size()`

**Returns:** `int`

### `subList(`int` fromIndex, `int` toIndex)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `toString()`

**Returns:** `java.lang.String`

### `isPartialView()`

**Returns:** `boolean`

### `writeReplace()`

**Returns:** `java.lang.Object`

