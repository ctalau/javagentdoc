# Class: `RegularImmutableList`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.RegularImmutableList`

**Extends:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

Implementation of {@link ImmutableList} backed by a simple array.
@author Kevin Bourrillion

## Fields

### `EMPTY`

**Type:** [`com.google.common.collect.ImmutableList<java.lang.Object>`](./ImmutableList.md)

### `array`

**Type:** `java.lang.Object[]`

## Constructors

### `<init>(`java.lang.Object[]` array)`

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

### `copyIntoArray(`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]` dst, `int` dstOff)`

**Returns:** `int`

### `get(`int` index)`

**Returns:** [`E`](E.md)

### `listIterator(`int` index)`

**Returns:** [`com.google.common.collect.UnmodifiableListIterator<E>`](./UnmodifiableListIterator.md)

### `spliterator()`

**Returns:** [`java.util.Spliterator<E>`](../../../../java/util/Spliterator.md)

### `writeReplace()`

**Returns:** `java.lang.Object`

