# Class: `CartesianList`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.CartesianList`

**Extends:** [`java.util.AbstractList<java.util.List<E>>`](../../../../java/util/AbstractList>.md)

**Implements:** [`java.util.RandomAccess`](../../../../java/util/RandomAccess.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

Implementation of {@link Lists#cartesianProduct(List)}.
@author Louis Wasserman

## Fields

### `axes`

**Type:** [`com.google.common.collect.ImmutableList<java.util.List<E>>`](./ImmutableList>.md)

### `axesSizeProduct`

**Type:** `int[]`

## Constructors

### `<init>([`com.google.common.collect.ImmutableList<java.util.List<E>>`](./ImmutableList>.md) axes)`

## Methods

### `create([`java.util.List<? extends java.util.List<? extends E>>`](../../../../java/util/List>.md) lists)`

**Returns:** [`java.util.List<java.util.List<E>>`](../../../../java/util/List>.md)

### `getAxisIndexForProductIndex(`int` index, `int` axis)`

**Returns:** `int`

### `indexOf(`java.lang.Object` o)`

**Returns:** `int`

### `lastIndexOf(`java.lang.Object` o)`

**Returns:** `int`

### `get(`int` index)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `size()`

**Returns:** `int`

### `contains(`java.lang.Object` object)`

**Returns:** `boolean`

