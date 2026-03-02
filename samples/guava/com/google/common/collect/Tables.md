# Class: `Tables`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Tables`

## Description

See the Guava User Guide article on [Tables](https://github.com/google/guava/wiki/CollectionUtilitiesExplained#tables).

## Fields

### `UNMODIFIABLE_WRAPPER`

**Type:** [`com.google.common.base.Function<? extends java.util.Map<?,?>,? extends java.util.Map<?,?>>`](../base/Function.md)

## Constructors

### `<init>()`

## Methods

### `toTable(java.util.function.Function<? super T,? extends R> rowFunction, java.util.function.Function<? super T,? extends C> columnFunction, java.util.function.Function<? super T,? extends V> valueFunction, java.util.function.Supplier<I> tableSupplier)`

**Returns:** `java.util.stream.Collector<T,?,I>`

Cells are inserted into the generated Table in encounter order.

 
If multiple input elements map to the same row and column, an IllegalStateException
 is thrown when the collection operation is performed.

 
To collect to an ImmutableTable, use ImmutableTable#toImmutableTable.

**Parameters:**
- `rowFunction` (`java.util.function.Function<? super T,? extends R>`)
- `columnFunction` (`java.util.function.Function<? super T,? extends C>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)
- `tableSupplier` (`java.util.function.Supplier<I>`)

### `toTable(java.util.function.Function<? super T,? extends R> rowFunction, java.util.function.Function<? super T,? extends C> columnFunction, java.util.function.Function<? super T,? extends V> valueFunction, java.util.function.BinaryOperator<V> mergeFunction, java.util.function.Supplier<I> tableSupplier)`

**Returns:** `java.util.stream.Collector<T,?,I>`

Cells are inserted into the generated Table in encounter order.

 
If multiple input elements map to the same row and column, the specified merging function is
 used to combine the values. Like java.util.stream.Collectors#toMap(java.util.function.Function, java.util.function.Function,
 BinaryOperator, java.util.function.Supplier), this Collector throws a 
 NullPointerException on null values returned from valueFunction, and treats nulls
 returned from mergeFunction as removals of that row/column pair.

**Parameters:**
- `rowFunction` (`java.util.function.Function<? super T,? extends R>`)
- `columnFunction` (`java.util.function.Function<? super T,? extends C>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)
- `mergeFunction` (`java.util.function.BinaryOperator<V>`)
- `tableSupplier` (`java.util.function.Supplier<I>`)

### `immutableCell(R rowKey, C columnKey, V value)`

**Returns:** `com.google.common.collect.Table.Cell<R,C,V>`

The returned cell is serializable.

**Parameters:**
- `rowKey` (`R`): the row key to be associated with the returned cell
- `columnKey` (`C`): the column key to be associated with the returned cell
- `value` (`V`): the value to be associated with the returned cell

### `transpose(com.google.common.collect.Table<R,C,V> table)`

**Returns:** [`com.google.common.collect.Table<C,R,V>`](./Table.md)

In other words,
 calling get(columnKey, rowKey) on the generated table always returns the same value as
 calling get(rowKey, columnKey) on the original table. Updating the original table
 changes the contents of the transposed table and vice versa.

 
The returned table supports update operations as long as the input table supports the
 analogous operation with swapped rows and columns. For example, in a HashBasedTable
 instance, rowKeySet().iterator() supports remove() but 
 columnKeySet().iterator() doesn't. With a transposed HashBasedTable, it's the other
 way around.

**Parameters:**
- `table` ([`com.google.common.collect.Table<R,C,V>`](./Table.md))

### `newCustomTable(java.util.Map<R,java.util.Map<C,V>> backingMap, com.google.common.base.Supplier<? extends java.util.Map<C,V>> factory)`

**Returns:** [`com.google.common.collect.Table<R,C,V>`](./Table.md)

It can generate a table based
 on arbitrary Map classes.

 
The factory-generated and backingMap classes determine the table iteration
 order. However, the table's row() method returns instances of a different class than
 factory.get() does.

 
Call this method only when the simpler factory methods in classes like HashBasedTable and TreeBasedTable won't suffice.

 
The views returned by the Table methods Table#column, Table#columnKeySet, and Table#columnMap have iterators that don't support 
 remove(). Otherwise, all optional operations are supported. Null row keys, columns keys, and
 values are not supported.

 
Lookups by row key are often faster than lookups by column key, because the data is stored
 in a Map<R, Map<C, V>>. A method call like column(columnKey).get(rowKey) still
 runs quickly, since the row key is provided. However, column(columnKey).size() takes
 longer, since an iteration across all row keys occurs.

 
Note that this implementation is not synchronized. If multiple threads access this table
 concurrently and one of the threads modifies the table, it must be synchronized externally.

 
The table is serializable if backingMap, factory, the maps generated by
 factory, and the table contents are all serializable.

 
Note: the table assumes complete ownership over of backingMap and the maps returned
 by factory. Those objects should not be manually updated and they should not use soft,
 weak, or phantom references.

**Parameters:**
- `backingMap` (`java.util.Map<R,java.util.Map<C,V>>`): place to store the mapping from each row key to its corresponding column key
     / value map
- `factory` ([`com.google.common.base.Supplier<? extends java.util.Map<C,V>>`](../base/Supplier.md)): supplier of new, empty maps that will each hold all column key / value mappings
     for a given row key

### `transformValues(com.google.common.collect.Table<R,C,V1> fromTable, com.google.common.base.Function<? super V1,V2> function)`

**Returns:** [`com.google.common.collect.Table<R,C,V2>`](./Table.md)

All other properties
 of the table, such as iteration order, are left intact.

 
Changes in the underlying table are reflected in this view. Conversely, this view supports
 removal operations, and these are reflected in the underlying table.

 
It's acceptable for the underlying table to contain null keys, and even null values provided
 that the function is capable of accepting null input. The transformed table might contain null
 values, if the function sometimes gives a null result.

 
The returned table is not thread-safe or serializable, even if the underlying table is.

 
The function is applied lazily, invoked when needed. This is necessary for the returned
 table to be a view, but it means that the function will be applied many times for bulk
 operations like Table#containsValue and Table.toString(). For this to perform
 well, function should be fast. To avoid lazy evaluation when the returned table doesn't
 need to be a view, copy the returned table into a new table of your choosing.

**Parameters:**
- `fromTable` ([`com.google.common.collect.Table<R,C,V1>`](./Table.md))
- `function` ([`com.google.common.base.Function<? super V1,V2>`](../base/Function.md))

### `unmodifiableTable(com.google.common.collect.Table<? extends R,? extends C,? extends V> table)`

**Returns:** [`com.google.common.collect.Table<R,C,V>`](./Table.md)

This method allows modules to provide
 users with "read-only" access to internal tables. Query operations on the returned table "read
 through" to the specified table, and attempts to modify the returned table, whether direct or
 via its collection views, result in an UnsupportedOperationException.

 
The returned table will be serializable if the specified table is serializable.

 
Consider using an ImmutableTable, which is guaranteed never to change.

**Parameters:**
- `table` ([`com.google.common.collect.Table<? extends R,? extends C,? extends V>`](./Table.md))

### `unmodifiableRowSortedTable(com.google.common.collect.RowSortedTable<R,? extends C,? extends V> table)`

**Returns:** [`com.google.common.collect.RowSortedTable<R,C,V>`](./RowSortedTable.md)

This method allows modules to
 provide users with "read-only" access to internal tables. Query operations on the returned
 table "read through" to the specified table, and attempts to modify the returned table, whether
 direct or via its collection views, result in an UnsupportedOperationException.

 
The returned table will be serializable if the specified table is serializable.

**Parameters:**
- `table` ([`com.google.common.collect.RowSortedTable<R,? extends C,? extends V>`](./RowSortedTable.md)): the row-sorted table for which an unmodifiable view is to be returned

### `unmodifiableWrapper()`

**Returns:** [`com.google.common.base.Function<java.util.Map<K,V>,java.util.Map<K,V>>`](../base/Function.md)

### `synchronizedTable(com.google.common.collect.Table<R,C,V> table)`

**Returns:** [`com.google.common.collect.Table<R,C,V>`](./Table.md)

In order to guarantee
 serial access, it is critical that **all** access to the backing table is accomplished
 through the returned table.

 
It is imperative that the user manually synchronize on the returned table when accessing any
 of its collection views:

 

```

 Table<R, C, V> table = Tables.synchronizedTable(HashBasedTable.<R, C, V>create());
 ...
 Map<C, V> row = table.row(rowKey);  // Needn't be in synchronized block
 ...
 synchronized (table) {  // Synchronizing on table, not row!
   Iterator<Entry<C, V>> i = row.entrySet().iterator(); // Must be in synchronized block
   while (i.hasNext()) {
     foo(i.next());
   }
 }
 
```


 
Failure to follow this advice may result in non-deterministic behavior.

 
The returned table will be serializable if the specified table is serializable.

**Parameters:**
- `table` ([`com.google.common.collect.Table<R,C,V>`](./Table.md)): the table to be wrapped in a synchronized view

### `equalsImpl(com.google.common.collect.Table<?,?,?> table, java.lang.Object obj)`

**Returns:** `boolean`

**Parameters:**
- `table` ([`com.google.common.collect.Table<?,?,?>`](./Table.md))
- `obj` (`java.lang.Object`)

