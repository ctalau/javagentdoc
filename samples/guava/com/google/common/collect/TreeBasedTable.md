# Class: `TreeBasedTable`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.TreeBasedTable`

**Extends:** [`com.google.common.collect.StandardRowSortedTable<R,C,V>`](./StandardRowSortedTable.md)

## Type Parameters

- `R` extends `java.lang.Object`
- `C` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

When constructing a TreeBasedTable, you may provide
 comparators for the row keys and the column keys, or you may use natural ordering for both.

 
The #rowKeySet method returns a SortedSet and the #rowMap method
 returns a SortedMap, instead of the Set and Map specified by the Table interface.

 
The views returned by #column, #columnKeySet(), and #columnMap() have
 iterators that don't support remove(). Otherwise, all optional operations are supported.
 Null row keys, columns keys, and values are not supported.

 
Lookups by row key are often faster than lookups by column key, because the data is stored in
 a Map<R, Map<C, V>>. A method call like column(columnKey).get(rowKey) still runs
 quickly, since the row key is provided. However, column(columnKey).size() takes longer,
 since an iteration across all row keys occurs.

 
Because a TreeBasedTable has unique sorted values for a given row, both 
 row(rowKey) and rowMap().get(rowKey) are SortedMap instances, instead of the
 Map specified in the Table interface.

 
Note that this implementation is not synchronized. If multiple threads access this table
 concurrently and one of the threads modifies the table, it must be synchronized externally.

 
See the Guava User Guide article on [Table](https://github.com/google/guava/wiki/NewCollectionTypesExplained#table).

## Fields

### `columnComparator`

**Type:** `java.util.Comparator<? super C>`

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(Comparator<? super R> rowComparator, Comparator<? super C> columnComparator)`

**Parameters:**
- `rowComparator` (`java.util.Comparator<? super R>`)
- `columnComparator` (`java.util.Comparator<? super C>`)

## Methods

### `create()`

The method signature specifies R extends Comparable with a raw Comparable,
 instead of R extends Comparable<? super R>, and the same for C. That's
 necessary to support classes defined without generics.

**Returns:** [`com.google.common.collect.TreeBasedTable<R,C,V>`](./TreeBasedTable.md)

### `create(Comparator<? super R> rowComparator, Comparator<? super C> columnComparator)`

**Parameters:**
- `rowComparator` (`java.util.Comparator<? super R>`): the comparator that orders the row keys
- `columnComparator` (`java.util.Comparator<? super C>`): the comparator that orders the column keys

**Returns:** [`com.google.common.collect.TreeBasedTable<R,C,V>`](./TreeBasedTable.md)

### `create(TreeBasedTable<R,C,? extends V> table)`

**Parameters:**
- `table` ([`com.google.common.collect.TreeBasedTable<R,C,? extends V>`](./TreeBasedTable.md))

**Returns:** [`com.google.common.collect.TreeBasedTable<R,C,V>`](./TreeBasedTable.md)

### `rowComparator()`

With natural ordering, Ordering#natural()
 is returned.

**Returns:** `java.util.Comparator<? super R>`

### `columnComparator()`

With natural ordering, Ordering#natural() is returned.

**Returns:** `java.util.Comparator<? super C>`

### `row(R rowKey)`

Because a TreeBasedTable has unique sorted values for a given row, this method
 returns a SortedMap, instead of the Map specified in the Table
 interface.

**Parameters:**
- `rowKey` (`R`)

**Returns:** `java.util.SortedMap<C,V>`

### `rowKeySet()`

**Returns:** `java.util.SortedSet<R>`

### `rowMap()`

**Returns:** `java.util.SortedMap<R,java.util.Map<C,V>>`

### `createColumnKeyIterator()`

**Returns:** `java.util.Iterator<C>`

