# Class: `ArrayTable`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ArrayTable`

**Extends:** [`com.google.common.collect.AbstractTable<R,C,@org.checkerframework.checker.nullness.qual.Nullable V>`](./AbstractTable.md)

**Implements:** `java.io.Serializable`

## Type Parameters

- `R` extends `java.lang.Object`
- `C` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

**Warning:** ArrayTable is rarely the Table implementation you want. First,
 it requires that the complete universe of rows and columns be specified at construction time.
 Second, it is always backed by an array large enough to hold a value for every possible
 combination of row and column keys. (This is rarely optimal unless the table is extremely dense.)
 Finally, every possible combination of row and column keys is always considered to have a value
 associated with it: It is not possible to "remove" a value, only to replace it with null,
 which will still appear when iterating over the table's contents in a foreach loop or a call to a
 null-hostile method like ImmutableTable#copyOf. For alternatives, please see [the wiki](https://github.com/google/guava/wiki/NewCollectionTypesExplained#table).

 
The allowed row and column keys must be supplied when the table is created. The table always
 contains a mapping for every row key / column pair. The value corresponding to a given row and
 column is null unless another value is provided.

 
The table's size is constant: the product of the number of supplied row keys and the number of
 supplied column keys. The remove and clear methods are not supported by the table
 or its views. The #erase and #eraseAll methods may be used instead.

 
The ordering of the row and column keys provided when the table is constructed determines the
 iteration ordering across rows and columns in the table's views. None of the view iterators
 support Iterator#remove. If the table is modified after an iterator is created, the
 iterator remains valid.

 
This class requires less memory than the HashBasedTable and TreeBasedTable
 implementations, except when the table is sparse.

 
Null row keys or column keys are not permitted.

 
This class provides methods involving the underlying array structure, where the array indices
 correspond to the position of a row or column in the lists of allowed keys and values. See the
 #at, #set, #toArray, #rowKeyList, and #columnKeyList
 methods for more details.

 
Note that this implementation is not synchronized. If multiple threads access the same cell of
 an ArrayTable concurrently and one of the threads modifies its value, there is no
 guarantee that the new value will be fully visible to the other threads. To guarantee that
 modifications are visible, synchronize access to the table. Unlike other Table
 implementations, synchronization is unnecessary between a thread that writes to one cell and a
 thread that reads from another.

 
See the Guava User Guide article on [Table](https://github.com/google/guava/wiki/NewCollectionTypesExplained#table).

## Fields

### `rowList`

**Type:** [`com.google.common.collect.ImmutableList<R>`](./ImmutableList.md)

### `columnList`

**Type:** [`com.google.common.collect.ImmutableList<C>`](./ImmutableList.md)

### `rowKeyToIndex`

**Type:** [`com.google.common.collect.ImmutableMap<R,java.lang.Integer>`](./ImmutableMap.md)

### `columnKeyToIndex`

**Type:** [`com.google.common.collect.ImmutableMap<C,java.lang.Integer>`](./ImmutableMap.md)

### `array`

**Type:** `@org.checkerframework.checker.nullness.qual.Nullable V[][]`

### `columnMap`

**Type:** [`com.google.common.collect.ArrayTable<R,C,V>.ColumnMap`](./ArrayTable.md)

### `rowMap`

**Type:** [`com.google.common.collect.ArrayTable<R,C,V>.RowMap`](./ArrayTable.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(java.lang.Iterable<? extends R> rowKeys, java.lang.Iterable<? extends C> columnKeys)`

**Parameters:**
- `rowKeys` (`java.lang.Iterable<? extends R>`)
- `columnKeys` (`java.lang.Iterable<? extends C>`)

### `<init>(com.google.common.collect.Table<R,C,? extends @org.checkerframework.checker.nullness.qual.Nullable V> table)`

**Parameters:**
- `table` ([`com.google.common.collect.Table<R,C,? extends @org.checkerframework.checker.nullness.qual.Nullable V>`](./Table.md))

### `<init>(com.google.common.collect.ArrayTable<R,C,V> table)`

**Parameters:**
- `table` ([`com.google.common.collect.ArrayTable<R,C,V>`](./ArrayTable.md))

## Methods

### `create(java.lang.Iterable<? extends R> rowKeys, java.lang.Iterable<? extends C> columnKeys)`

**Returns:** [`com.google.common.collect.ArrayTable<R,C,V>`](./ArrayTable.md)

**Parameters:**
- `rowKeys` (`java.lang.Iterable<? extends R>`): row keys that may be stored in the generated table
- `columnKeys` (`java.lang.Iterable<? extends C>`): column keys that may be stored in the generated table

### `create(com.google.common.collect.Table<R,C,? extends @org.checkerframework.checker.nullness.qual.Nullable V> table)`

**Returns:** [`com.google.common.collect.ArrayTable<R,C,V>`](./ArrayTable.md)

If table includes a mapping with row key r and a separate mapping with
 column key c, the returned table contains a mapping with row key r and column
 key c. If that row key / column key pair in not in table, the pair maps to
 null in the generated table.

 
The returned table allows subsequent put calls with the row keys in 
 table.rowKeySet() and the column keys in table.columnKeySet(). Calling #put
 with other keys leads to an IllegalArgumentException.

 
The ordering of table.rowKeySet() and table.columnKeySet() determines the
 row and column iteration ordering of the returned table.

**Parameters:**
- `table` ([`com.google.common.collect.Table<R,C,? extends @org.checkerframework.checker.nullness.qual.Nullable V>`](./Table.md))

### `rowKeyList()`

**Returns:** [`com.google.common.collect.ImmutableList<R>`](./ImmutableList.md)

### `columnKeyList()`

**Returns:** [`com.google.common.collect.ImmutableList<C>`](./ImmutableList.md)

### `at(int rowIndex, int columnIndex)`

**Returns:** `V`

The same value is
 returned by get(rowKeyList().get(rowIndex), columnKeyList().get(columnIndex)), but this
 method runs more quickly.

**Parameters:**
- `rowIndex` (`int`): position of the row key in #rowKeyList()
- `columnIndex` (`int`): position of the row key in #columnKeyList()

### `set(int rowIndex, int columnIndex, V value)`

**Returns:** `V`

The logic 
 put(rowKeyList().get(rowIndex), columnKeyList().get(columnIndex), value) has the same
 behavior, but this method runs more quickly.

**Parameters:**
- `rowIndex` (`int`): position of the row key in #rowKeyList()
- `columnIndex` (`int`): position of the row key in #columnKeyList()
- `value` (`V`): value to store in the table

### `toArray(java.lang.Class<V> valueClass)`

**Returns:** `@org.checkerframework.checker.nullness.qual.Nullable V[][]`

The row and column indices correspond
 to the positions of the row and column in the iterables provided during table construction. If
 the table lacks a mapping for a given row and column, the corresponding array element is null.

 
Subsequent table changes will not modify the array, and vice versa.

**Parameters:**
- `valueClass` (`java.lang.Class<V>`): class of values stored in the returned array

### `clear()`

**Returns:** `void`

Use #eraseAll instead.

### `eraseAll()`

**Returns:** `void`

### `contains(java.lang.Object rowKey, java.lang.Object columnKey)`

**Returns:** `boolean`

**Parameters:**
- `rowKey` (`java.lang.Object`)
- `columnKey` (`java.lang.Object`)

### `containsColumn(java.lang.Object columnKey)`

**Returns:** `boolean`

**Parameters:**
- `columnKey` (`java.lang.Object`)

### `containsRow(java.lang.Object rowKey)`

**Returns:** `boolean`

**Parameters:**
- `rowKey` (`java.lang.Object`)

### `containsValue(java.lang.Object value)`

**Returns:** `boolean`

**Parameters:**
- `value` (`java.lang.Object`)

### `get(java.lang.Object rowKey, java.lang.Object columnKey)`

**Returns:** `V`

**Parameters:**
- `rowKey` (`java.lang.Object`)
- `columnKey` (`java.lang.Object`)

### `isEmpty()`

**Returns:** `boolean`

### `put(R rowKey, C columnKey, V value)`

**Returns:** `V`

**Parameters:**
- `rowKey` (`R`)
- `columnKey` (`C`)
- `value` (`V`)

### `putAll(com.google.common.collect.Table<? extends R,? extends C,? extends @org.checkerframework.checker.nullness.qual.Nullable V> table)`

**Returns:** `void`

If table is an ArrayTable, its null values will be stored in this table,
 possibly replacing values that were previously non-null.

**Parameters:**
- `table` ([`com.google.common.collect.Table<? extends R,? extends C,? extends @org.checkerframework.checker.nullness.qual.Nullable V>`](./Table.md))

### `remove(java.lang.Object rowKey, java.lang.Object columnKey)`

**Returns:** `V`

Use #erase instead.

**Parameters:**
- `rowKey` (`java.lang.Object`)
- `columnKey` (`java.lang.Object`)

### `erase(java.lang.Object rowKey, java.lang.Object columnKey)`

**Returns:** `V`

If
 either key is null or isn't among the keys provided during construction, this method has no
 effect.

 
This method is equivalent to put(rowKey, columnKey, null) when both provided keys
 are valid.

**Parameters:**
- `rowKey` (`java.lang.Object`): row key of mapping to be erased
- `columnKey` (`java.lang.Object`): column key of mapping to be erased

### `size()`

**Returns:** `int`

### `cellSet()`

**Returns:** `java.util.Set<com.google.common.collect.Table.Cell<R,C,@org.checkerframework.checker.nullness.qual.Nullable V>>`

Changes to the table
 will update the returned set.

 
The returned set's iterator traverses the mappings with the first row key, the mappings with
 the second row key, and so on.

 
The value in the returned cells may change if the table subsequently changes.

### `cellIterator()`

**Returns:** `java.util.Iterator<com.google.common.collect.Table.Cell<R,C,@org.checkerframework.checker.nullness.qual.Nullable V>>`

### `cellSpliterator()`

**Returns:** `java.util.Spliterator<com.google.common.collect.Table.Cell<R,C,@org.checkerframework.checker.nullness.qual.Nullable V>>`

### `getCell(int index)`

**Returns:** `com.google.common.collect.Table.Cell<R,C,@org.checkerframework.checker.nullness.qual.Nullable V>`

**Parameters:**
- `index` (`int`)

### `getValue(int index)`

**Returns:** `V`

**Parameters:**
- `index` (`int`)

### `column(C columnKey)`

**Returns:** `java.util.Map<R,@org.checkerframework.checker.nullness.qual.Nullable V>`

If the column key isn't in
 #columnKeySet(), an empty immutable map is returned.

 
Otherwise, for each row key in #rowKeySet(), the returned map associates the row key
 with the corresponding value in the table. Changes to the returned map will update the
 underlying table, and vice versa.

**Parameters:**
- `columnKey` (`C`): key of column to search for in the table

### `columnKeySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<C>`](./ImmutableSet.md)

### `columnMap()`

**Returns:** `java.util.Map<C,java.util.Map<R,@org.checkerframework.checker.nullness.qual.Nullable V>>`

### `row(R rowKey)`

**Returns:** `java.util.Map<C,@org.checkerframework.checker.nullness.qual.Nullable V>`

If the row key isn't in #rowKeySet(), an empty immutable map is returned.

 
Otherwise, for each column key in #columnKeySet(), the returned map associates the
 column key with the corresponding value in the table. Changes to the returned map will update
 the underlying table, and vice versa.

**Parameters:**
- `rowKey` (`R`): key of row to search for in the table

### `rowKeySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<R>`](./ImmutableSet.md)

### `rowMap()`

**Returns:** `java.util.Map<R,java.util.Map<C,@org.checkerframework.checker.nullness.qual.Nullable V>>`

### `values()`

**Returns:** `java.util.Collection<@org.checkerframework.checker.nullness.qual.Nullable V>`

Changes to the
 table will update the returned collection.

 
The returned collection's iterator traverses the values of the first row key, the values of
 the second row key, and so on.

### `valuesIterator()`

**Returns:** `java.util.Iterator<@org.checkerframework.checker.nullness.qual.Nullable V>`

### `valuesSpliterator()`

**Returns:** `java.util.Spliterator<@org.checkerframework.checker.nullness.qual.Nullable V>`

