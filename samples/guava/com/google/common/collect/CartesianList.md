# Class: `CartesianList`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.CartesianList`

**Extends:** `java.util.AbstractList<java.util.List<E>>`

**Implements:** `java.util.RandomAccess`

## Type Parameters

- `E` extends `java.lang.Object`

## Description

## Fields

### `axes`

**Type:** [`com.google.common.collect.ImmutableList<java.util.List<E>>`](./ImmutableList.md)

### `axesSizeProduct`

**Type:** `int[]`

## Constructors

### `<init>(ImmutableList<List<E>> axes)`

**Parameters:**
- `axes` ([`com.google.common.collect.ImmutableList<java.util.List<E>>`](./ImmutableList.md))

## Methods

### `create(List<? extends List<? extends E>> lists)`

**Parameters:**
- `lists` (`java.util.List<? extends java.util.List<? extends E>>`)

**Returns:** `java.util.List<java.util.List<E>>`

### `getAxisIndexForProductIndex(int index, int axis)`

**Parameters:**
- `index` (`int`)
- `axis` (`int`)

**Returns:** `int`

### `indexOf(Object o)`

**Parameters:**
- `o` (`java.lang.Object`)

**Returns:** `int`

### `lastIndexOf(Object o)`

**Parameters:**
- `o` (`java.lang.Object`)

**Returns:** `int`

### `get(int index)`

**Parameters:**
- `index` (`int`)

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `size()`

**Returns:** `int`

### `contains(Object object)`

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

