# Class: `RegularImmutableList`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.RegularImmutableList`

**Extends:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

## Fields

### `EMPTY`

**Type:** [`com.google.common.collect.ImmutableList<java.lang.Object>`](./ImmutableList.md)

### `array`

**Type:** `java.lang.Object[]`

## Constructors

### `<init>(java.lang.Object[] array)`

**Parameters:**
- `array` (`java.lang.Object[]`)

## Methods

### `size()`

**Returns:** `int`

### `isPartialView()`

**Returns:** `boolean`

### `internalArray()`

**Returns:** `java.lang.Object[]`

### `internalArrayStart()`

**Returns:** `int`

### `internalArrayEnd()`

**Returns:** `int`

### `copyIntoArray(java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[] dst, int dstOff)`

**Returns:** `int`

**Parameters:**
- `dst` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)
- `dstOff` (`int`)

### `get(int index)`

**Returns:** `E`

**Parameters:**
- `index` (`int`)

### `listIterator(int index)`

**Returns:** [`com.google.common.collect.UnmodifiableListIterator<E>`](./UnmodifiableListIterator.md)

**Parameters:**
- `index` (`int`)

### `spliterator()`

**Returns:** `java.util.Spliterator<E>`

### `writeReplace()`

**Returns:** `java.lang.Object`

