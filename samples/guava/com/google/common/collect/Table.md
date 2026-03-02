# Interface: `Table`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Table`

## Type Parameters

- `R` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `C` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A table may be sparse, with only a small fraction of row key / column key pairs
 possessing a corresponding value.

 
The mappings corresponding to a given row key may be viewed as a Map whose keys are
 the columns. The reverse is also available, associating a column with a row key / value map. Note
 that, in some implementations, data access by column key may have fewer supported operations or
 worse performance than data access by row key.

 
The methods returning collections or maps always return views of the underlying table.
 Updating the table can change the contents of those collections, and updating the collections
 will change the table.

 
All methods that modify the table are optional, and the views returned by the table may or may
 not be modifiable. When modification isn't supported, those methods will throw an UnsupportedOperationException.

 Implementations

 

   - ImmutableTable
   - HashBasedTable
   - TreeBasedTable
   - ArrayTable
   - Tables.newCustomTable
 


 
See the Guava User Guide article on [Table](https://github.com/google/guava/wiki/NewCollectionTypesExplained#table).

## Methods

### `contains(java.lang.Object rowKey, java.lang.Object columnKey)`

**Returns:** `boolean`

**Parameters:**
- `rowKey` (`java.lang.Object`): key of row to search for
- `columnKey` (`java.lang.Object`): key of column to search for

### `containsRow(java.lang.Object rowKey)`

**Returns:** `boolean`

**Parameters:**
- `rowKey` (`java.lang.Object`): key of row to search for

### `containsColumn(java.lang.Object columnKey)`

**Returns:** `boolean`

**Parameters:**
- `columnKey` (`java.lang.Object`): key of column to search for

### `containsValue(java.lang.Object value)`

**Returns:** `boolean`

**Parameters:**
- `value` (`java.lang.Object`): value to search for

### `get(java.lang.Object rowKey, java.lang.Object columnKey)`

**Returns:** `V`

**Parameters:**
- `rowKey` (`java.lang.Object`): key of row to search for
- `columnKey` (`java.lang.Object`): key of column to search for

### `isEmpty()`

**Returns:** `boolean`

### `size()`

**Returns:** `int`

### `equals(java.lang.Object obj)`

**Returns:** `boolean`

Two tables are equal when their
 cell views, as returned by #cellSet, are equal.

**Parameters:**
- `obj` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

The hash code of a table is defined as the hash code of
 its cell view, as returned by #cellSet.

### `clear()`

**Returns:** `void`

### `put(R rowKey, C columnKey, V value)`

**Returns:** `V`

If the table already contained a
 mapping for those keys, the old value is replaced with the specified value.

**Parameters:**
- `rowKey` (`R`): row key that the value should be associated with
- `columnKey` (`C`): column key that the value should be associated with
- `value` (`V`): value to be associated with the specified keys

### `putAll(com.google.common.collect.Table<? extends R,? extends C,? extends V> table)`

**Returns:** `void`

The effect is equivalent to calling
 #put with each row key / column key / value mapping in table.

**Parameters:**
- `table` ([`com.google.common.collect.Table<? extends R,? extends C,? extends V>`](./Table.md)): the table to add to this table

### `remove(java.lang.Object rowKey, java.lang.Object columnKey)`

**Returns:** `V`

**Parameters:**
- `rowKey` (`java.lang.Object`): row key of mapping to be removed
- `columnKey` (`java.lang.Object`): column key of mapping to be removed

### `row(R rowKey)`

**Returns:** `java.util.Map<C,V>`

For each row key / column key /
 value mapping in the table with that row key, the returned map associates the column key with
 the value. If no mappings in the table have the provided row key, an empty map is returned.

 
Changes to the returned map will update the underlying table, and vice versa.

**Parameters:**
- `rowKey` (`R`): key of row to search for in the table

### `column(C columnKey)`

**Returns:** `java.util.Map<R,V>`

For each row key / column key /
 value mapping in the table with that column key, the returned map associates the row key with
 the value. If no mappings in the table have the provided column key, an empty map is returned.

 
Changes to the returned map will update the underlying table, and vice versa.

**Parameters:**
- `columnKey` (`C`): key of column to search for in the table

### `cellSet()`

**Returns:** `java.util.Set<com.google.common.collect.Table.Cell<R,C,V>>`

Changes to the returned set will
 update the underlying table, and vice versa. The cell set does not support the add or
 addAll methods.

### `rowKeySet()`

**Returns:** `java.util.Set<R>`

Changes to the set will
 update the underlying table, and vice versa.

### `columnKeySet()`

**Returns:** `java.util.Set<C>`

Changes to the set will
 update the underlying table, and vice versa.

### `values()`

**Returns:** `java.util.Collection<V>`

Changes to the returned
 collection will update the underlying table, and vice versa.

### `rowMap()`

**Returns:** `java.util.Map<R,java.util.Map<C,V>>`

Changes to the returned map will update this table. The returned map does not support
 put() or putAll(), or setValue() on its entries.

 
In contrast, the maps returned by rowMap().get() have the same behavior as those
 returned by #row. Those maps may support setValue(), put(), and 
 putAll().

### `columnMap()`

**Returns:** `java.util.Map<C,java.util.Map<R,V>>`

Changes to the returned map will update this table. The returned map does not support
 put() or putAll(), or setValue() on its entries.

 
In contrast, the maps returned by columnMap().get() have the same behavior as those
 returned by #column. Those maps may support setValue(), put(), and
 putAll().

