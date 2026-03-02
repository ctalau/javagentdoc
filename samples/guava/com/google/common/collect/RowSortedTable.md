# Interface: `RowSortedTable`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.RowSortedTable`

**Extends:** [`com.google.common.collect.Table<R,C,V>`](./Table.md)

## Type Parameters

- `R` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `C` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

The #rowKeySet method returns a SortedSet and the #rowMap method
 returns a SortedMap, instead of the Set and Map specified by the Table interface.

## Methods

### `rowKeySet()`

This method returns a SortedSet, instead of the Set specified in the Table interface.

**Returns:** `java.util.SortedSet<R>`

### `rowMap()`

This method returns a SortedMap, instead of the Map specified in the Table interface.

**Returns:** `java.util.SortedMap<R,java.util.Map<C,V>>`

