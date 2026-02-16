# Interface: `Table`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Table`

## Type Parameters

- `R` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `C` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A collection that associates an ordered pair of keys, called a row key and a column key, with a
 single value. A table may be sparse, with only a small fraction of row key / column key pairs
 possessing a corresponding value.

 <p>The mappings corresponding to a given row key may be viewed as a `Map` whose keys are
 the columns. The reverse is also available, associating a column with a row key / value map. Note
 that, in some implementations, data access by column key may have fewer supported operations or
 worse performance than data access by row key.

 <p>The methods returning collections or maps always return views of the underlying table.
 Updating the table can change the contents of those collections, and updating the collections
 will change the table.

 <p>All methods that modify the table are optional, and the views returned by the table may or may
 not be modifiable. When modification isn't supported, those methods will throw an `UnsupportedOperationException`.

 <h3>Implementations</h3>

 <ul>
   <li>`ImmutableTable`
   <li>`HashBasedTable`
   <li>`TreeBasedTable`
   <li>`ArrayTable`
   <li>`Tables.newCustomTable Tables.newCustomTable`
 </ul>

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/NewCollectionTypesExplained#table">`Table`</a>.
**Author:** Jared Levy
@param <R> the type of the table row keys
@param <C> the type of the table column keys
@param <V> the type of the mapped values
**Since:** 7.0

## Methods

### `contains(`java.lang.Object` rowKey, `java.lang.Object` columnKey)`

**Returns:** `boolean`

Returns `true` if the table contains a mapping with the specified row and column keys.
@param rowKey key of row to search for
@param columnKey key of column to search for

### `containsRow(`java.lang.Object` rowKey)`

**Returns:** `boolean`

Returns `true` if the table contains a mapping with the specified row key.
@param rowKey key of row to search for

### `containsColumn(`java.lang.Object` columnKey)`

**Returns:** `boolean`

Returns `true` if the table contains a mapping with the specified column.
@param columnKey key of column to search for

### `containsValue(`java.lang.Object` value)`

**Returns:** `boolean`

Returns `true` if the table contains a mapping with the specified value.
@param value value to search for

### `get(`java.lang.Object` rowKey, `java.lang.Object` columnKey)`

**Returns:** `V`

Returns the value corresponding to the given row and column keys, or `null` if no such
 mapping exists.
@param rowKey key of row to search for
@param columnKey key of column to search for

### `isEmpty()`

**Returns:** `boolean`

Returns `true` if the table contains no mappings.

### `size()`

**Returns:** `int`

Returns the number of row key / column key / value mappings in the table.

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

Compares the specified object with this table for equality. Two tables are equal when their
 cell views, as returned by `cellSet`, are equal.

### `hashCode()`

**Returns:** `int`

Returns the hash code for this table. The hash code of a table is defined as the hash code of
 its cell view, as returned by `cellSet`.

### `clear()`

**Returns:** `void`

Removes all mappings from the table.

### `put(`R` rowKey, `C` columnKey, `V` value)`

**Returns:** `V`

Associates the specified value with the specified keys. If the table already contained a
 mapping for those keys, the old value is replaced with the specified value.
@param rowKey row key that the value should be associated with
@param columnKey column key that the value should be associated with
@param value value to be associated with the specified keys
@return the value previously associated with the keys, or `null` if no mapping existed
     for the keys

### `putAll([`com.google.common.collect.Table<? extends R,? extends C,? extends V>`](./Table.md) table)`

**Returns:** `void`

Copies all mappings from the specified table to this table. The effect is equivalent to calling
 `put` with each row key / column key / value mapping in `table`.
@param table the table to add to this table

### `remove(`java.lang.Object` rowKey, `java.lang.Object` columnKey)`

**Returns:** `V`

Removes the mapping, if any, associated with the given keys.
@param rowKey row key of mapping to be removed
@param columnKey column key of mapping to be removed
@return the value previously associated with the keys, or `null` if no such value existed

### `row(`R` rowKey)`

**Returns:** `java.util.Map<C,V>`

Returns a view of all mappings that have the given row key. For each row key / column key /
 value mapping in the table with that row key, the returned map associates the column key with
 the value. If no mappings in the table have the provided row key, an empty map is returned.

 <p>Changes to the returned map will update the underlying table, and vice versa.
@param rowKey key of row to search for in the table
@return the corresponding map from column keys to values

### `column(`C` columnKey)`

**Returns:** `java.util.Map<R,V>`

Returns a view of all mappings that have the given column key. For each row key / column key /
 value mapping in the table with that column key, the returned map associates the row key with
 the value. If no mappings in the table have the provided column key, an empty map is returned.

 <p>Changes to the returned map will update the underlying table, and vice versa.
@param columnKey key of column to search for in the table
@return the corresponding map from row keys to values

### `cellSet()`

**Returns:** `java.util.Set<com.google.common.collect.Table.Cell<R,C,V>>`

Returns a set of all row key / column key / value triplets. Changes to the returned set will
 update the underlying table, and vice versa. The cell set does not support the `add` or
 `addAll` methods.
@return set of table cells consisting of row key / column key / value triplets

### `rowKeySet()`

**Returns:** `java.util.Set<R>`

Returns a set of row keys that have one or more values in the table. Changes to the set will
 update the underlying table, and vice versa.
@return set of row keys

### `columnKeySet()`

**Returns:** `java.util.Set<C>`

Returns a set of column keys that have one or more values in the table. Changes to the set will
 update the underlying table, and vice versa.
@return set of column keys

### `values()`

**Returns:** `java.util.Collection<V>`

Returns a collection of all values, which may contain duplicates. Changes to the returned
 collection will update the underlying table, and vice versa.
@return collection of values

### `rowMap()`

**Returns:** `java.util.Map<R,java.util.Map<C,V>>`

Returns a view that associates each row key with the corresponding map from column keys to
 values. Changes to the returned map will update this table. The returned map does not support
 `put()` or `putAll()`, or `setValue()` on its entries.

 <p>In contrast, the maps returned by `rowMap().get()` have the same behavior as those
 returned by `row`. Those maps may support `setValue()`, `put()`, and `putAll()`.
@return a map view from each row key to a secondary map from column keys to values

### `columnMap()`

**Returns:** `java.util.Map<C,java.util.Map<R,V>>`

Returns a view that associates each column key with the corresponding map from row keys to
 values. Changes to the returned map will update this table. The returned map does not support
 `put()` or `putAll()`, or `setValue()` on its entries.

 <p>In contrast, the maps returned by `columnMap().get()` have the same behavior as those
 returned by `column`. Those maps may support `setValue()`, `put()`, and
 `putAll()`.
@return a map view from each column key to a secondary map from row keys to values

