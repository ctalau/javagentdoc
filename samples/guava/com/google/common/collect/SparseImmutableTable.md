# Class: `SparseImmutableTable`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.SparseImmutableTable`

**Extends:** [`com.google.common.collect.RegularImmutableTable<R,C,V>`](./RegularImmutableTable.md)

## Type Parameters

- `R` extends `java.lang.Object`
- `C` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

A `RegularImmutableTable` optimized for sparse data.

## Fields

### `EMPTY`

**Type:** [`com.google.common.collect.ImmutableTable<java.lang.Object,java.lang.Object,java.lang.Object>`](./ImmutableTable.md)

### `rowMap`

**Type:** [`com.google.common.collect.ImmutableMap<R,com.google.common.collect.ImmutableMap<C,V>>`](./ImmutableMap>.md)

### `columnMap`

**Type:** [`com.google.common.collect.ImmutableMap<C,com.google.common.collect.ImmutableMap<R,V>>`](./ImmutableMap>.md)

### `cellRowIndices`

**Type:** `int[]`

### `cellColumnInRowIndices`

**Type:** `int[]`

## Constructors

### `<init>([`com.google.common.collect.ImmutableList<com.google.common.collect.Table.Cell<R,C,V>>`](./ImmutableList>.md) cellList, [`com.google.common.collect.ImmutableSet<R>`](./ImmutableSet.md) rowSpace, [`com.google.common.collect.ImmutableSet<C>`](./ImmutableSet.md) columnSpace)`

## Methods

### `columnMap()`

**Returns:** [`com.google.common.collect.ImmutableMap<C,java.util.Map<R,V>>`](./ImmutableMap>.md)

### `rowMap()`

**Returns:** [`com.google.common.collect.ImmutableMap<R,java.util.Map<C,V>>`](./ImmutableMap>.md)

### `size()`

**Returns:** `int`

### `getCell(`int` index)`

**Returns:** [`com.google.common.collect.Table.Cell<R,C,V>`](Table/Cell.md)

### `getValue(`int` index)`

**Returns:** `V`

### `writeReplace()`

**Returns:** `java.lang.Object`

