# Class: `HashBasedTable`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.HashBasedTable`

**Extends:** [`com.google.common.collect.StandardTable<R,C,V>`](./StandardTable.md)

## Type Parameters

- `R` extends `java.lang.Object`
- `C` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

Implementation of `Table` using linked hash tables. This guarantees predictable iteration
 order of the various views.

 <p>The views returned by `column`, `columnKeySet()`, and `columnMap()` have
 iterators that don't support `remove()`. Otherwise, all optional operations are supported.
 Null row keys, columns keys, and values are not supported.

 <p>Lookups by row key are often faster than lookups by column key, because the data is stored in
 a `Map<R, Map<C, V>>`. A method call like `column(columnKey).get(rowKey)` still runs
 quickly, since the row key is provided. However, `column(columnKey).size()` takes longer,
 since an iteration across all row keys occurs.

 <p>Note that this implementation is not synchronized. If multiple threads access this table
 concurrently and one of the threads modifies the table, it must be synchronized externally.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/NewCollectionTypesExplained#table">`Table`</a>.
**Author:** Jared Levy
**Since:** 7.0

## Fields

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(`java.util.Map<R,java.util.Map<C,V>>` backingMap, [`com.google.common.collect.HashBasedTable.Factory<C,V>`](HashBasedTable/Factory.md) factory)`

## Methods

### `create()`

**Returns:** [`com.google.common.collect.HashBasedTable<R,C,V>`](./HashBasedTable.md)

Creates an empty `HashBasedTable`.

### `create(`int` expectedRows, `int` expectedCellsPerRow)`

**Returns:** [`com.google.common.collect.HashBasedTable<R,C,V>`](./HashBasedTable.md)

Creates an empty `HashBasedTable` with the specified map sizes.
@param expectedRows the expected number of distinct row keys
@param expectedCellsPerRow the expected number of column key / value mappings in each row
@throws IllegalArgumentException if `expectedRows` or `expectedCellsPerRow` is
     negative

### `create([`com.google.common.collect.Table<? extends R,? extends C,? extends V>`](./Table.md) table)`

**Returns:** [`com.google.common.collect.HashBasedTable<R,C,V>`](./HashBasedTable.md)

Creates a `HashBasedTable` with the same mappings as the specified table.
@param table the table to copy
@throws NullPointerException if any of the row keys, column keys, or values in `table` is
     null

