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

**Parameters:**
- `iterationIndex` (`int`)

**Returns:** `com.google.common.collect.Table.Cell<R,C,V>`

### `createCellSet()`

**Returns:** [`com.google.common.collect.ImmutableSet<com.google.common.collect.Table.Cell<R,C,V>>`](./ImmutableSet.md)

### `getValue(int iterationIndex)`

**Parameters:**
- `iterationIndex` (`int`)

**Returns:** `V`

### `createValues()`

**Returns:** [`com.google.common.collect.ImmutableCollection<V>`](./ImmutableCollection.md)

### `forCells(List<Table.Cell<R,C,V>> cells, Comparator<? super R> rowComparator, Comparator<? super C> columnComparator)`

**Parameters:**
- `cells` (`java.util.List<com.google.common.collect.Table.Cell<R,C,V>>`)
- `rowComparator` (`java.util.Comparator<? super R>`)
- `columnComparator` (`java.util.Comparator<? super C>`)

**Returns:** [`com.google.common.collect.RegularImmutableTable<R,C,V>`](./RegularImmutableTable.md)

### `forCells(Iterable<Table.Cell<R,C,V>> cells)`

**Parameters:**
- `cells` (`java.lang.Iterable<com.google.common.collect.Table.Cell<R,C,V>>`)

**Returns:** [`com.google.common.collect.RegularImmutableTable<R,C,V>`](./RegularImmutableTable.md)

### `forCellsInternal(Iterable<Table.Cell<R,C,V>> cells, Comparator<? super R> rowComparator, Comparator<? super C> columnComparator)`

**Parameters:**
- `cells` (`java.lang.Iterable<com.google.common.collect.Table.Cell<R,C,V>>`)
- `rowComparator` (`java.util.Comparator<? super R>`)
- `columnComparator` (`java.util.Comparator<? super C>`)

**Returns:** [`com.google.common.collect.RegularImmutableTable<R,C,V>`](./RegularImmutableTable.md)

### `forOrderedComponents(ImmutableList<Table.Cell<R,C,V>> cellList, ImmutableSet<R> rowSpace, ImmutableSet<C> columnSpace)`

**Parameters:**
- `cellList` ([`com.google.common.collect.ImmutableList<com.google.common.collect.Table.Cell<R,C,V>>`](./ImmutableList.md))
- `rowSpace` ([`com.google.common.collect.ImmutableSet<R>`](./ImmutableSet.md))
- `columnSpace` ([`com.google.common.collect.ImmutableSet<C>`](./ImmutableSet.md))

**Returns:** [`com.google.common.collect.RegularImmutableTable<R,C,V>`](./RegularImmutableTable.md)

### `checkNoDuplicate(R rowKey, C columnKey, V existingValue, V newValue)`

**Parameters:**
- `rowKey` (`R`)
- `columnKey` (`C`)
- `existingValue` (`V`)
- `newValue` (`V`)

**Returns:** `void`

### `writeReplace()`

**Returns:** `java.lang.Object`

