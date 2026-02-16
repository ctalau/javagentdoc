# Class: `DenseImmutableTable`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.DenseImmutableTable`

**Extends:** [`com.google.common.collect.RegularImmutableTable<R,C,V>`](./RegularImmutableTable.md)

## Type Parameters

- `R` extends `java.lang.Object`
- `C` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

A {@code RegularImmutableTable} optimized for dense data.

## Fields

### `rowKeyToIndex`

**Type:** [`com.google.common.collect.ImmutableMap<R,java.lang.Integer>`](./ImmutableMap.md)

### `columnKeyToIndex`

**Type:** [`com.google.common.collect.ImmutableMap<C,java.lang.Integer>`](./ImmutableMap.md)

### `rowMap`

**Type:** [`com.google.common.collect.ImmutableMap<R,com.google.common.collect.ImmutableMap<C,V>>`](./ImmutableMap>.md)

### `columnMap`

**Type:** [`com.google.common.collect.ImmutableMap<C,com.google.common.collect.ImmutableMap<R,V>>`](./ImmutableMap>.md)

### `rowCounts`

**Type:** `int[]`

### `columnCounts`

**Type:** `int[]`

### `values`

**Type:** [`@org.checkerframework.checker.nullness.qual.Nullable V[][]`](../../../../@org/checkerframework/checker/nullness/qual/Nullable V.md)

### `cellRowIndices`

**Type:** `int[]`

### `cellColumnIndices`

**Type:** `int[]`

## Constructors

### `<init>([`com.google.common.collect.ImmutableList<com.google.common.collect.Table.Cell<R,C,V>>`](./ImmutableList>.md) cellList, [`com.google.common.collect.ImmutableSet<R>`](./ImmutableSet.md) rowSpace, [`com.google.common.collect.ImmutableSet<C>`](./ImmutableSet.md) columnSpace)`

## Methods

### `columnMap()`

**Returns:** [`com.google.common.collect.ImmutableMap<C,java.util.Map<R,V>>`](./ImmutableMap>.md)

### `rowMap()`

**Returns:** [`com.google.common.collect.ImmutableMap<R,java.util.Map<C,V>>`](./ImmutableMap>.md)

### `get(`java.lang.Object` rowKey, `java.lang.Object` columnKey)`

**Returns:** [`V`](V.md)

### `size()`

**Returns:** `int`

### `getCell(`int` index)`

**Returns:** [`com.google.common.collect.Table.Cell<R,C,V>`](Table/Cell.md)

### `getValue(`int` index)`

**Returns:** [`V`](V.md)

### `writeReplace()`

**Returns:** `java.lang.Object`

