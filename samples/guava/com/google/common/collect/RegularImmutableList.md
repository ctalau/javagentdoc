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

### `<init>(Object[] array)`

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

### `copyIntoArray(lang@Nullable Object[] dst, int dstOff)`

**Parameters:**
- `dst` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)
- `dstOff` (`int`)

**Returns:** `int`

### `get(int index)`

**Parameters:**
- `index` (`int`)

**Returns:** `E`

### `listIterator(int index)`

**Parameters:**
- `index` (`int`)

**Returns:** [`com.google.common.collect.UnmodifiableListIterator<E>`](./UnmodifiableListIterator.md)

### `spliterator()`

**Returns:** `java.util.Spliterator<E>`

### `writeReplace()`

**Returns:** `java.lang.Object`

