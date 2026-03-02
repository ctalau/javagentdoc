# Class: `DenseImmutableTable`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.DenseImmutableTable`

**Extends:** [`com.google.common.collect.RegularImmutableTable<R,C,V>`](./RegularImmutableTable.md)

## Type Parameters

- `R` extends `java.lang.Object`
- `C` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

## Fields

### `rowKeyToIndex`

**Type:** [`com.google.common.collect.ImmutableMap<R,java.lang.Integer>`](./ImmutableMap.md)

### `columnKeyToIndex`

**Type:** [`com.google.common.collect.ImmutableMap<C,java.lang.Integer>`](./ImmutableMap.md)

### `rowMap`

**Type:** [`com.google.common.collect.ImmutableMap<R,com.google.common.collect.ImmutableMap<C,V>>`](./ImmutableMap.md)

### `columnMap`

**Type:** [`com.google.common.collect.ImmutableMap<C,com.google.common.collect.ImmutableMap<R,V>>`](./ImmutableMap.md)

### `rowCounts`

**Type:** `int[]`

### `columnCounts`

**Type:** `int[]`

### `values`

**Type:** `@org.checkerframework.checker.nullness.qual.Nullable V[][]`

### `cellRowIndices`

**Type:** `int[]`

### `cellColumnIndices`

**Type:** `int[]`

## Constructors

### `<init>(ImmutableList<Table.Cell<R,C,V>> cellList, ImmutableSet<R> rowSpace, ImmutableSet<C> columnSpace)`

**Parameters:**
- `cellList` ([`com.google.common.collect.ImmutableList<com.google.common.collect.Table.Cell<R,C,V>>`](./ImmutableList.md))
- `rowSpace` ([`com.google.common.collect.ImmutableSet<R>`](./ImmutableSet.md))
- `columnSpace` ([`com.google.common.collect.ImmutableSet<C>`](./ImmutableSet.md))

## Methods

### `columnMap()`

**Returns:** [`com.google.common.collect.ImmutableMap<C,java.util.Map<R,V>>`](./ImmutableMap.md)

### `rowMap()`

**Returns:** [`com.google.common.collect.ImmutableMap<R,java.util.Map<C,V>>`](./ImmutableMap.md)

### `get(Object rowKey, Object columnKey)`

**Parameters:**
- `rowKey` (`java.lang.Object`)
- `columnKey` (`java.lang.Object`)

**Returns:** `V`

### `size()`

**Returns:** `int`

### `getCell(int index)`

**Parameters:**
- `index` (`int`)

**Returns:** `com.google.common.collect.Table.Cell<R,C,V>`

### `getValue(int index)`

**Parameters:**
- `index` (`int`)

**Returns:** `V`

### `writeReplace()`

**Returns:** `java.lang.Object`

