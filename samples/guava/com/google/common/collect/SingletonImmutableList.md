# Class: `SingletonImmutableList`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.SingletonImmutableList`

**Extends:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

## Fields

### `element`

**Type:** `E`

## Constructors

### `<init>(E element)`

**Parameters:**
- `element` (`E`)

## Methods

### `get(int index)`

**Parameters:**
- `index` (`int`)

**Returns:** `E`

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<E>`](./UnmodifiableIterator.md)

### `spliterator()`

**Returns:** `java.util.Spliterator<E>`

### `size()`

**Returns:** `int`

### `subList(int fromIndex, int toIndex)`

**Parameters:**
- `fromIndex` (`int`)
- `toIndex` (`int`)

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `toString()`

**Returns:** `java.lang.String`

### `isPartialView()`

**Returns:** `boolean`

### `writeReplace()`

**Returns:** `java.lang.Object`

