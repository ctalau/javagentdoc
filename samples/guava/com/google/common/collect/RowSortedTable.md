# Interface: `RowSortedTable`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.RowSortedTable`

**Extends:** [`com.google.common.collect.Table<R,C,V>`](./Table.md)

## Type Parameters

- `R` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `C` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Interface that extends {@code Table} and whose rows are sorted.

 <p>The {@link #rowKeySet} method returns a {@link SortedSet} and the {@link #rowMap} method
 returns a {@link SortedMap}, instead of the {@link Set} and {@link Map} specified by the {@link Table} interface.
@author Warren Dukes
@since 8.0

## Methods

### `rowKeySet()`

**Returns:** [`java.util.SortedSet<R>`](../../../../java/util/SortedSet.md)

{@inheritDoc}

 <p>This method returns a {@link SortedSet}, instead of the {@code Set} specified in the {@link Table} interface.

### `rowMap()`

**Returns:** [`java.util.SortedMap<R,java.util.Map<C,V>>`](../../../../java/util/SortedMap>.md)

{@inheritDoc}

 <p>This method returns a {@link SortedMap}, instead of the {@code Map} specified in the {@link Table} interface.

