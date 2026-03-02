# Class: `SparseImmutableTable`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.SparseImmutableTable`

**Extends:** [`com.google.common.collect.RegularImmutableTable<R,C,V>`](./RegularImmutableTable.md)

## Type Parameters

- `R` extends `java.lang.Object`
- `C` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

## Fields

### `EMPTY`

**Type:** [`com.google.common.collect.ImmutableTable<java.lang.Object,java.lang.Object,java.lang.Object>`](./ImmutableTable.md)

### `rowMap`

**Type:** [`com.google.common.collect.ImmutableMap<R,com.google.common.collect.ImmutableMap<C,V>>`](./ImmutableMap.md)

### `columnMap`

**Type:** [`com.google.common.collect.ImmutableMap<C,com.google.common.collect.ImmutableMap<R,V>>`](./ImmutableMap.md)

### `cellRowIndices`

**Type:** `int[]`

### `cellColumnInRowIndices`

**Type:** `int[]`

## Constructors

### `<init>(com.google.common.collect.ImmutableList<com.google.common.collect.Table.Cell<R,C,V>> cellList, com.google.common.collect.ImmutableSet<R> rowSpace, com.google.common.collect.ImmutableSet<C> columnSpace)`

**Parameters:**
- `cellList` ([`com.google.common.collect.ImmutableList<com.google.common.collect.Table.Cell<R,C,V>>`](./ImmutableList.md))
- `rowSpace` ([`com.google.common.collect.ImmutableSet<R>`](./ImmutableSet.md))
- `columnSpace` ([`com.google.common.collect.ImmutableSet<C>`](./ImmutableSet.md))

## Methods

### `columnMap()`

**Returns:** [`com.google.common.collect.ImmutableMap<C,java.util.Map<R,V>>`](./ImmutableMap.md)

### `rowMap()`

**Returns:** [`com.google.common.collect.ImmutableMap<R,java.util.Map<C,V>>`](./ImmutableMap.md)

### `size()`

**Returns:** `int`

### `getCell(int index)`

**Returns:** `com.google.common.collect.Table.Cell<R,C,V>`

**Parameters:**
- `index` (`int`)

### `getValue(int index)`

**Returns:** `V`

**Parameters:**
- `index` (`int`)

### `writeReplace()`

**Returns:** `java.lang.Object`

