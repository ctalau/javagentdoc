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

### `<init>(com.google.common.collect.ImmutableList<java.util.List<E>> axes)`

**Parameters:**
- `axes` ([`com.google.common.collect.ImmutableList<java.util.List<E>>`](./ImmutableList.md))

## Methods

### `create(java.util.List<? extends java.util.List<? extends E>> lists)`

**Returns:** `java.util.List<java.util.List<E>>`

**Parameters:**
- `lists` (`java.util.List<? extends java.util.List<? extends E>>`)

### `getAxisIndexForProductIndex(int index, int axis)`

**Returns:** `int`

**Parameters:**
- `index` (`int`)
- `axis` (`int`)

### `indexOf(java.lang.Object o)`

**Returns:** `int`

**Parameters:**
- `o` (`java.lang.Object`)

### `lastIndexOf(java.lang.Object o)`

**Returns:** `int`

**Parameters:**
- `o` (`java.lang.Object`)

### `get(int index)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

**Parameters:**
- `index` (`int`)

### `size()`

**Returns:** `int`

### `contains(java.lang.Object object)`

**Returns:** `boolean`

**Parameters:**
- `object` (`java.lang.Object`)

