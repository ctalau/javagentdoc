# Class: `SingletonImmutableList`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.SingletonImmutableList`

**Extends:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

Implementation of `ImmutableList` with exactly one element.
**Author:** Hayward Chan

## Fields

### `element`

**Type:** `E`

## Constructors

### `<init>(`E` element)`

## Methods

### `get(`int` index)`

**Returns:** `E`

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<E>`](./UnmodifiableIterator.md)

### `spliterator()`

**Returns:** `java.util.Spliterator<E>`

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

