# Class: `TreeBasedTable`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.TreeBasedTable`

**Extends:** [`com.google.common.collect.StandardRowSortedTable<R,C,V>`](./StandardRowSortedTable.md)

## Type Parameters

- `R` extends `java.lang.Object`
- `C` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

Implementation of `Table` whose row keys and column keys are ordered by their natural
 ordering or by supplied comparators. When constructing a `TreeBasedTable`, you may provide
 comparators for the row keys and the column keys, or you may use natural ordering for both.

 <p>The `rowKeySet` method returns a `SortedSet` and the `rowMap` method
 returns a `SortedMap`, instead of the `Set` and `Map` specified by the `Table` interface.

 <p>The views returned by `column`, `columnKeySet()`, and `columnMap()` have
 iterators that don't support `remove()`. Otherwise, all optional operations are supported.
 Null row keys, columns keys, and values are not supported.

 <p>Lookups by row key are often faster than lookups by column key, because the data is stored in
 a `Map<R, Map<C, V>>`. A method call like `column(columnKey).get(rowKey)` still runs
 quickly, since the row key is provided. However, `column(columnKey).size()` takes longer,
 since an iteration across all row keys occurs.

 <p>Because a `TreeBasedTable` has unique sorted values for a given row, both `row(rowKey)` and `rowMap().get(rowKey)` are `SortedMap` instances, instead of the
 `Map` specified in the `Table` interface.

 <p>Note that this implementation is not synchronized. If multiple threads access this table
 concurrently and one of the threads modifies the table, it must be synchronized externally.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/NewCollectionTypesExplained#table">`Table`</a>.
**Author:** Jared Levy
**Author:** Louis Wasserman
**Since:** 7.0

## Fields

### `columnComparator`

**Type:** `java.util.Comparator<? super C>`

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(`java.util.Comparator<? super R>` rowComparator, `java.util.Comparator<? super C>` columnComparator)`

## Methods

### `create()`

**Returns:** [`com.google.common.collect.TreeBasedTable<R,C,V>`](./TreeBasedTable.md)

Creates an empty `TreeBasedTable` that uses the natural orderings of both row and column
 keys.

 <p>The method signature specifies `R extends Comparable` with a raw `Comparable`,
 instead of `R extends Comparable<? super R>`, and the same for `C`. That's
 necessary to support classes defined without generics.

### `create(`java.util.Comparator<? super R>` rowComparator, `java.util.Comparator<? super C>` columnComparator)`

**Returns:** [`com.google.common.collect.TreeBasedTable<R,C,V>`](./TreeBasedTable.md)

Creates an empty `TreeBasedTable` that is ordered by the specified comparators.
@param rowComparator the comparator that orders the row keys
@param columnComparator the comparator that orders the column keys

### `create([`com.google.common.collect.TreeBasedTable<R,C,? extends V>`](./TreeBasedTable.md) table)`

**Returns:** [`com.google.common.collect.TreeBasedTable<R,C,V>`](./TreeBasedTable.md)

Creates a `TreeBasedTable` with the same mappings and sort order as the specified `TreeBasedTable`.

### `rowComparator()`

**Returns:** `java.util.Comparator<? super R>`

Returns the comparator that orders the rows. With natural ordering, `Ordering.natural()`
 is returned.
**Deprecated:**Use `table.rowKeySet().comparator()` instead.

### `columnComparator()`

**Returns:** `java.util.Comparator<? super C>`

Returns the comparator that orders the columns. With natural ordering, `Ordering.natural()` is returned.
**Deprecated:**Store the `Comparator` alongside the `Table`. Or, if you know that the
     `Table` contains at least one value, you can retrieve the `Comparator` with:
     `((SortedMap<C, V>) table.rowMap().values().iterator().next()).comparator();`.

### `row(`R` rowKey)`

**Returns:** `java.util.SortedMap<C,V>`

{@inheritDoc}

 <p>Because a `TreeBasedTable` has unique sorted values for a given row, this method
 returns a `SortedMap`, instead of the `Map` specified in the `Table`
 interface.
**Since:** 10.0 (<a href="https://github.com/google/guava/wiki/Compatibility">mostly
     source-compatible</a> since 7.0)

### `rowKeySet()`

**Returns:** `java.util.SortedSet<R>`

### `rowMap()`

**Returns:** `java.util.SortedMap<R,java.util.Map<C,V>>`

### `createColumnKeyIterator()`

**Returns:** `java.util.Iterator<C>`

Overridden column iterator to return columns values in globally sorted order.

