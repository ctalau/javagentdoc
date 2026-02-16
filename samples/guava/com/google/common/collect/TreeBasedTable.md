# Class: `TreeBasedTable`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.TreeBasedTable`

**Extends:** [`com.google.common.collect.StandardRowSortedTable<R,C,V>`](./StandardRowSortedTable.md)

## Type Parameters

- `R` extends `java.lang.Object`
- `C` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

Implementation of {@code Table} whose row keys and column keys are ordered by their natural
 ordering or by supplied comparators. When constructing a {@code TreeBasedTable}, you may provide
 comparators for the row keys and the column keys, or you may use natural ordering for both.

 <p>The {@link #rowKeySet} method returns a {@link SortedSet} and the {@link #rowMap} method
 returns a {@link SortedMap}, instead of the {@link Set} and {@link Map} specified by the {@link Table} interface.

 <p>The views returned by {@link #column}, {@link #columnKeySet()}, and {@link #columnMap()} have
 iterators that don't support {@code remove()}. Otherwise, all optional operations are supported.
 Null row keys, columns keys, and values are not supported.

 <p>Lookups by row key are often faster than lookups by column key, because the data is stored in
 a {@code Map<R, Map<C, V>>}. A method call like {@code column(columnKey).get(rowKey)} still runs
 quickly, since the row key is provided. However, {@code column(columnKey).size()} takes longer,
 since an iteration across all row keys occurs.

 <p>Because a {@code TreeBasedTable} has unique sorted values for a given row, both {@code
 row(rowKey)} and {@code rowMap().get(rowKey)} are {@link SortedMap} instances, instead of the
 {@link Map} specified in the {@link Table} interface.

 <p>Note that this implementation is not synchronized. If multiple threads access this table
 concurrently and one of the threads modifies the table, it must be synchronized externally.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/NewCollectionTypesExplained#table">{@code Table}</a>.
@author Jared Levy
@author Louis Wasserman
@since 7.0

## Fields

### `columnComparator`

**Type:** [`java.util.Comparator<? super C>`](../../../../java/util/Comparator.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>([`java.util.Comparator<? super R>`](../../../../java/util/Comparator.md) rowComparator, [`java.util.Comparator<? super C>`](../../../../java/util/Comparator.md) columnComparator)`

## Methods

### `create()`

**Returns:** [`com.google.common.collect.TreeBasedTable<R,C,V>`](./TreeBasedTable.md)

Creates an empty {@code TreeBasedTable} that uses the natural orderings of both row and column
 keys.

 <p>The method signature specifies {@code R extends Comparable} with a raw {@link Comparable},
 instead of {@code R extends Comparable<? super R>}, and the same for {@code C}. That's
 necessary to support classes defined without generics.

### `create([`java.util.Comparator<? super R>`](../../../../java/util/Comparator.md) rowComparator, [`java.util.Comparator<? super C>`](../../../../java/util/Comparator.md) columnComparator)`

**Returns:** [`com.google.common.collect.TreeBasedTable<R,C,V>`](./TreeBasedTable.md)

Creates an empty {@code TreeBasedTable} that is ordered by the specified comparators.
@param rowComparator the comparator that orders the row keys
@param columnComparator the comparator that orders the column keys

### `create([`com.google.common.collect.TreeBasedTable<R,C,? extends V>`](./TreeBasedTable.md) table)`

**Returns:** [`com.google.common.collect.TreeBasedTable<R,C,V>`](./TreeBasedTable.md)

Creates a {@code TreeBasedTable} with the same mappings and sort order as the specified {@code
 TreeBasedTable}.

### `rowComparator()`

**Returns:** [`java.util.Comparator<? super R>`](../../../../java/util/Comparator.md)

Returns the comparator that orders the rows. With natural ordering, {@link Ordering#natural()}
 is returned.
@deprecated Use {@code table.rowKeySet().comparator()} instead.

### `columnComparator()`

**Returns:** [`java.util.Comparator<? super C>`](../../../../java/util/Comparator.md)

Returns the comparator that orders the columns. With natural ordering, {@link Ordering#natural()} is returned.
@deprecated Store the {@link Comparator} alongside the {@link Table}. Or, if you know that the
     {@link Table} contains at least one value, you can retrieve the {@link Comparator} with:
     {@code ((SortedMap<C, V>) table.rowMap().values().iterator().next()).comparator();}.

### `row([`R`](R.md) rowKey)`

**Returns:** [`java.util.SortedMap<C,V>`](../../../../java/util/SortedMap.md)

{@inheritDoc}

 <p>Because a {@code TreeBasedTable} has unique sorted values for a given row, this method
 returns a {@link SortedMap}, instead of the {@link Map} specified in the {@link Table}
 interface.
@since 10.0 (<a href="https://github.com/google/guava/wiki/Compatibility">mostly
     source-compatible</a> since 7.0)

### `rowKeySet()`

**Returns:** [`java.util.SortedSet<R>`](../../../../java/util/SortedSet.md)

### `rowMap()`

**Returns:** [`java.util.SortedMap<R,java.util.Map<C,V>>`](../../../../java/util/SortedMap>.md)

### `createColumnKeyIterator()`

**Returns:** [`java.util.Iterator<C>`](../../../../java/util/Iterator.md)

Overridden column iterator to return columns values in globally sorted order.

