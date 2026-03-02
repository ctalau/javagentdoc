# Class: `HashBasedTable`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.HashBasedTable`

**Extends:** [`com.google.common.collect.StandardTable<R,C,V>`](./StandardTable.md)

## Type Parameters

- `R` extends `java.lang.Object`
- `C` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

This guarantees predictable iteration
 order of the various views.

 
The views returned by #column, #columnKeySet(), and #columnMap() have
 iterators that don't support remove(). Otherwise, all optional operations are supported.
 Null row keys, columns keys, and values are not supported.

 
Lookups by row key are often faster than lookups by column key, because the data is stored in
 a Map<R, Map<C, V>>. A method call like column(columnKey).get(rowKey) still runs
 quickly, since the row key is provided. However, column(columnKey).size() takes longer,
 since an iteration across all row keys occurs.

 
Note that this implementation is not synchronized. If multiple threads access this table
 concurrently and one of the threads modifies the table, it must be synchronized externally.

 
See the Guava User Guide article on [Table](https://github.com/google/guava/wiki/NewCollectionTypesExplained#table).

## Fields

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(java.util.Map<R,java.util.Map<C,V>> backingMap, com.google.common.collect.HashBasedTable.Factory<C,V> factory)`

**Parameters:**
- `backingMap` (`java.util.Map<R,java.util.Map<C,V>>`)
- `factory` (`com.google.common.collect.HashBasedTable.Factory<C,V>`)

## Methods

### `create()`

**Returns:** [`com.google.common.collect.HashBasedTable<R,C,V>`](./HashBasedTable.md)

### `create(int expectedRows, int expectedCellsPerRow)`

**Returns:** [`com.google.common.collect.HashBasedTable<R,C,V>`](./HashBasedTable.md)

**Parameters:**
- `expectedRows` (`int`): the expected number of distinct row keys
- `expectedCellsPerRow` (`int`): the expected number of column key / value mappings in each row

### `create(com.google.common.collect.Table<? extends R,? extends C,? extends V> table)`

**Returns:** [`com.google.common.collect.HashBasedTable<R,C,V>`](./HashBasedTable.md)

**Parameters:**
- `table` ([`com.google.common.collect.Table<? extends R,? extends C,? extends V>`](./Table.md)): the table to copy

