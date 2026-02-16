# Class: `RegularImmutableTable`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.RegularImmutableTable`

**Extends:** [`com.google.common.collect.ImmutableTable<R,C,V>`](./ImmutableTable.md)

## Type Parameters

- `R` extends `java.lang.Object`
- `C` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

An implementation of `ImmutableTable` holding an arbitrary number of cells.
**Author:** Gregory Kick

## Constructors

### `<init>()`

## Methods

### `getCell(`int` iterationIndex)`

**Returns:** [`com.google.common.collect.Table.Cell<R,C,V>`](Table/Cell.md)

### `createCellSet()`

**Returns:** [`com.google.common.collect.ImmutableSet<com.google.common.collect.Table.Cell<R,C,V>>`](./ImmutableSet>.md)

### `getValue(`int` iterationIndex)`

**Returns:** `V`

### `createValues()`

**Returns:** [`com.google.common.collect.ImmutableCollection<V>`](./ImmutableCollection.md)

### `forCells(`java.util.List<com.google.common.collect.Table.Cell<R,C,V>>` cells, `java.util.Comparator<? super R>` rowComparator, `java.util.Comparator<? super C>` columnComparator)`

**Returns:** [`com.google.common.collect.RegularImmutableTable<R,C,V>`](./RegularImmutableTable.md)

### `forCells(`java.lang.Iterable<com.google.common.collect.Table.Cell<R,C,V>>` cells)`

**Returns:** [`com.google.common.collect.RegularImmutableTable<R,C,V>`](./RegularImmutableTable.md)

### `forCellsInternal(`java.lang.Iterable<com.google.common.collect.Table.Cell<R,C,V>>` cells, `java.util.Comparator<? super R>` rowComparator, `java.util.Comparator<? super C>` columnComparator)`

**Returns:** [`com.google.common.collect.RegularImmutableTable<R,C,V>`](./RegularImmutableTable.md)

### `forOrderedComponents([`com.google.common.collect.ImmutableList<com.google.common.collect.Table.Cell<R,C,V>>`](./ImmutableList>.md) cellList, [`com.google.common.collect.ImmutableSet<R>`](./ImmutableSet.md) rowSpace, [`com.google.common.collect.ImmutableSet<C>`](./ImmutableSet.md) columnSpace)`

**Returns:** [`com.google.common.collect.RegularImmutableTable<R,C,V>`](./RegularImmutableTable.md)

A factory that chooses the most space-efficient representation of the table.

### `checkNoDuplicate(`R` rowKey, `C` columnKey, `V` existingValue, `V` newValue)`

**Returns:** `void`

@throws IllegalArgumentException if `existingValue` is not null.

### `writeReplace()`

**Returns:** `java.lang.Object`

