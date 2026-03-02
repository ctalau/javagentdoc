# Class: `RegularImmutableTable`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.RegularImmutableTable`

**Extends:** [`com.google.common.collect.ImmutableTable<R,C,V>`](./ImmutableTable.md)

## Type Parameters

- `R` extends `java.lang.Object`
- `C` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

## Constructors

### `<init>()`

## Methods

### `getCell(int iterationIndex)`

**Returns:** `com.google.common.collect.Table.Cell<R,C,V>`

**Parameters:**
- `iterationIndex` (`int`)

### `createCellSet()`

**Returns:** [`com.google.common.collect.ImmutableSet<com.google.common.collect.Table.Cell<R,C,V>>`](./ImmutableSet.md)

### `getValue(int iterationIndex)`

**Returns:** `V`

**Parameters:**
- `iterationIndex` (`int`)

### `createValues()`

**Returns:** [`com.google.common.collect.ImmutableCollection<V>`](./ImmutableCollection.md)

### `forCells(java.util.List<com.google.common.collect.Table.Cell<R,C,V>> cells, java.util.Comparator<? super R> rowComparator, java.util.Comparator<? super C> columnComparator)`

**Returns:** [`com.google.common.collect.RegularImmutableTable<R,C,V>`](./RegularImmutableTable.md)

**Parameters:**
- `cells` (`java.util.List<com.google.common.collect.Table.Cell<R,C,V>>`)
- `rowComparator` (`java.util.Comparator<? super R>`)
- `columnComparator` (`java.util.Comparator<? super C>`)

### `forCells(java.lang.Iterable<com.google.common.collect.Table.Cell<R,C,V>> cells)`

**Returns:** [`com.google.common.collect.RegularImmutableTable<R,C,V>`](./RegularImmutableTable.md)

**Parameters:**
- `cells` (`java.lang.Iterable<com.google.common.collect.Table.Cell<R,C,V>>`)

### `forCellsInternal(java.lang.Iterable<com.google.common.collect.Table.Cell<R,C,V>> cells, java.util.Comparator<? super R> rowComparator, java.util.Comparator<? super C> columnComparator)`

**Returns:** [`com.google.common.collect.RegularImmutableTable<R,C,V>`](./RegularImmutableTable.md)

**Parameters:**
- `cells` (`java.lang.Iterable<com.google.common.collect.Table.Cell<R,C,V>>`)
- `rowComparator` (`java.util.Comparator<? super R>`)
- `columnComparator` (`java.util.Comparator<? super C>`)

### `forOrderedComponents(com.google.common.collect.ImmutableList<com.google.common.collect.Table.Cell<R,C,V>> cellList, com.google.common.collect.ImmutableSet<R> rowSpace, com.google.common.collect.ImmutableSet<C> columnSpace)`

**Returns:** [`com.google.common.collect.RegularImmutableTable<R,C,V>`](./RegularImmutableTable.md)

**Parameters:**
- `cellList` ([`com.google.common.collect.ImmutableList<com.google.common.collect.Table.Cell<R,C,V>>`](./ImmutableList.md))
- `rowSpace` ([`com.google.common.collect.ImmutableSet<R>`](./ImmutableSet.md))
- `columnSpace` ([`com.google.common.collect.ImmutableSet<C>`](./ImmutableSet.md))

### `checkNoDuplicate(R rowKey, C columnKey, V existingValue, V newValue)`

**Returns:** `void`

**Parameters:**
- `rowKey` (`R`)
- `columnKey` (`C`)
- `existingValue` (`V`)
- `newValue` (`V`)

### `writeReplace()`

**Returns:** `java.lang.Object`

