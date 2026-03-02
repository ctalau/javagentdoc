# Class: `RegularImmutableSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.RegularImmutableSet`

**Extends:** `com.google.common.collect.ImmutableSet.CachingAsList<E>`

## Type Parameters

- `E` extends `java.lang.Object`

## Description

## Fields

### `EMPTY_ARRAY`

**Type:** `java.lang.Object[]`

### `EMPTY`

**Type:** [`com.google.common.collect.RegularImmutableSet<java.lang.Object>`](./RegularImmutableSet.md)

### `elements`

**Type:** `java.lang.Object[]`

### `hashCode`

**Type:** `int`

### `table`

**Type:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`

### `mask`

**Type:** `int`

## Constructors

### `<init>(java.lang.Object[] elements, int hashCode, java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[] table, int mask)`

**Parameters:**
- `elements` (`java.lang.Object[]`)
- `hashCode` (`int`)
- `table` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)
- `mask` (`int`)

## Methods

### `contains(java.lang.Object target)`

**Returns:** `boolean`

**Parameters:**
- `target` (`java.lang.Object`)

### `size()`

**Returns:** `int`

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<E>`](./UnmodifiableIterator.md)

### `spliterator()`

**Returns:** `java.util.Spliterator<E>`

### `internalArray()`

**Returns:** `java.lang.Object[]`

### `internalArrayStart()`

**Returns:** `int`

### `internalArrayEnd()`

**Returns:** `int`

### `copyIntoArray(java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[] dst, int offset)`

**Returns:** `int`

**Parameters:**
- `dst` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)
- `offset` (`int`)

### `createAsList()`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `isPartialView()`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `isHashCodeFast()`

**Returns:** `boolean`

### `writeReplace()`

**Returns:** `java.lang.Object`

