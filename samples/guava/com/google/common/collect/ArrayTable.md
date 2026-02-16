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

Fixed-size `Table` implementation backed by a two-dimensional array.

 <p><b>Warning:</b> `ArrayTable` is rarely the `Table` implementation you want. First,
 it requires that the complete universe of rows and columns be specified at construction time.
 Second, it is always backed by an array large enough to hold a value for every possible
 combination of row and column keys. (This is rarely optimal unless the table is extremely dense.)
 Finally, every possible combination of row and column keys is always considered to have a value
 associated with it: It is not possible to "remove" a value, only to replace it with `null`,
 which will still appear when iterating over the table's contents in a foreach loop or a call to a
 null-hostile method like `ImmutableTable.copyOf`. For alternatives, please see <a href="https://github.com/google/guava/wiki/NewCollectionTypesExplained#table">the wiki</a>.

 <p>The allowed row and column keys must be supplied when the table is created. The table always
 contains a mapping for every row key / column pair. The value corresponding to a given row and
 column is null unless another value is provided.

 <p>The table's size is constant: the product of the number of supplied row keys and the number of
 supplied column keys. The `remove` and `clear` methods are not supported by the table
 or its views. The `erase` and `eraseAll` methods may be used instead.

 <p>The ordering of the row and column keys provided when the table is constructed determines the
 iteration ordering across rows and columns in the table's views. None of the view iterators
 support `Iterator.remove`. If the table is modified after an iterator is created, the
 iterator remains valid.

 <p>This class requires less memory than the `HashBasedTable` and `TreeBasedTable`
 implementations, except when the table is sparse.

 <p>Null row keys or column keys are not permitted.

 <p>This class provides methods involving the underlying array structure, where the array indices
 correspond to the position of a row or column in the lists of allowed keys and values. See the
 `at`, `set`, `toArray`, `rowKeyList`, and `columnKeyList`
 methods for more details.

 <p>Note that this implementation is not synchronized. If multiple threads access the same cell of
 an `ArrayTable` concurrently and one of the threads modifies its value, there is no
 guarantee that the new value will be fully visible to the other threads. To guarantee that
 modifications are visible, synchronize access to the table. Unlike other `Table`
 implementations, synchronization is unnecessary between a thread that writes to one cell and a
 thread that reads from another.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/NewCollectionTypesExplained#table">`Table`</a>.
**Author:** Jared Levy
**Since:** 10.0

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

**Type:** [`@org.checkerframework.checker.nullness.qual.Nullable V[][]`](../../../../@org/checkerframework/checker/nullness/qual/Nullable V.md)

### `columnMap`

**Type:** [`com.google.common.collect.ArrayTable<R,C,V>.ColumnMap`](ArrayTable/ColumnMap.md)

### `rowMap`

**Type:** [`com.google.common.collect.ArrayTable<R,C,V>.RowMap`](ArrayTable/RowMap.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(`java.lang.Iterable<? extends R>` rowKeys, `java.lang.Iterable<? extends C>` columnKeys)`

### `<init>([`com.google.common.collect.Table<R,C,? extends @org.checkerframework.checker.nullness.qual.Nullable V>`](./Table.md) table)`

### `<init>([`com.google.common.collect.ArrayTable<R,C,V>`](./ArrayTable.md) table)`

## Methods

### `create(`java.lang.Iterable<? extends R>` rowKeys, `java.lang.Iterable<? extends C>` columnKeys)`

**Returns:** [`com.google.common.collect.ArrayTable<R,C,V>`](./ArrayTable.md)

Creates an `ArrayTable` filled with `null`.
@param rowKeys row keys that may be stored in the generated table
@param columnKeys column keys that may be stored in the generated table
@throws NullPointerException if any of the provided keys is null
@throws IllegalArgumentException if `rowKeys` or `columnKeys` contains duplicates
     or if exactly one of `rowKeys` or `columnKeys` is empty.

### `create([`com.google.common.collect.Table<R,C,? extends @org.checkerframework.checker.nullness.qual.Nullable V>`](./Table.md) table)`

**Returns:** [`com.google.common.collect.ArrayTable<R,C,V>`](./ArrayTable.md)

Creates an `ArrayTable` with the mappings in the provided table.

 <p>If `table` includes a mapping with row key `r` and a separate mapping with
 column key `c`, the returned table contains a mapping with row key `r` and column
 key `c`. If that row key / column key pair in not in `table`, the pair maps to
 `null` in the generated table.

 <p>The returned table allows subsequent `put` calls with the row keys in `table.rowKeySet()` and the column keys in `table.columnKeySet()`. Calling `put`
 with other keys leads to an `IllegalArgumentException`.

 <p>The ordering of `table.rowKeySet()` and `table.columnKeySet()` determines the
 row and column iteration ordering of the returned table.
@throws NullPointerException if `table` has a null key

### `rowKeyList()`

**Returns:** [`com.google.common.collect.ImmutableList<R>`](./ImmutableList.md)

Returns, as an immutable list, the row keys provided when the table was constructed, including
 those that are mapped to null values only.

### `columnKeyList()`

**Returns:** [`com.google.common.collect.ImmutableList<C>`](./ImmutableList.md)

Returns, as an immutable list, the column keys provided when the table was constructed,
 including those that are mapped to null values only.

### `at(`int` rowIndex, `int` columnIndex)`

**Returns:** `V`

Returns the value corresponding to the specified row and column indices. The same value is
 returned by `get(rowKeyList().get(rowIndex), columnKeyList().get(columnIndex))`, but this
 method runs more quickly.
@param rowIndex position of the row key in `rowKeyList()`
@param columnIndex position of the row key in `columnKeyList()`
@return the value with the specified row and column
@throws IndexOutOfBoundsException if either index is negative, `rowIndex` is greater than
     or equal to the number of allowed row keys, or `columnIndex` is greater than or equal
     to the number of allowed column keys

### `set(`int` rowIndex, `int` columnIndex, `V` value)`

**Returns:** `V`

Associates `value` with the specified row and column indices. The logic `put(rowKeyList().get(rowIndex), columnKeyList().get(columnIndex), value)` has the same
 behavior, but this method runs more quickly.
@param rowIndex position of the row key in `rowKeyList()`
@param columnIndex position of the row key in `columnKeyList()`
@param value value to store in the table
@return the previous value with the specified row and column
@throws IndexOutOfBoundsException if either index is negative, `rowIndex` is greater than
     or equal to the number of allowed row keys, or `columnIndex` is greater than or equal
     to the number of allowed column keys

### `toArray(`java.lang.Class<V>` valueClass)`

**Returns:** [`@org.checkerframework.checker.nullness.qual.Nullable V[][]`](../../../../@org/checkerframework/checker/nullness/qual/Nullable V.md)

Returns a two-dimensional array with the table contents. The row and column indices correspond
 to the positions of the row and column in the iterables provided during table construction. If
 the table lacks a mapping for a given row and column, the corresponding array element is null.

 <p>Subsequent table changes will not modify the array, and vice versa.
@param valueClass class of values stored in the returned array

### `clear()`

**Returns:** `void`

Not supported. Use `eraseAll` instead.
@throws UnsupportedOperationException always
**Deprecated:**Use `eraseAll`

### `eraseAll()`

**Returns:** `void`

Associates the value `null` with every pair of allowed row and column keys.

### `contains(`java.lang.Object` rowKey, `java.lang.Object` columnKey)`

**Returns:** `boolean`

Returns `true` if the provided keys are among the keys provided when the table was
 constructed.

### `containsColumn(`java.lang.Object` columnKey)`

**Returns:** `boolean`

Returns `true` if the provided column key is among the column keys provided when the
 table was constructed.

### `containsRow(`java.lang.Object` rowKey)`

**Returns:** `boolean`

Returns `true` if the provided row key is among the row keys provided when the table was
 constructed.

### `containsValue(`java.lang.Object` value)`

**Returns:** `boolean`

### `get(`java.lang.Object` rowKey, `java.lang.Object` columnKey)`

**Returns:** `V`

### `isEmpty()`

**Returns:** `boolean`

Returns `true` if `rowKeyList().size == 0` or `columnKeyList().size() == 0`.

### `put(`R` rowKey, `C` columnKey, `V` value)`

**Returns:** `V`

{@inheritDoc}
@throws IllegalArgumentException if `rowKey` is not in `rowKeySet()` or `columnKey` is not in `columnKeySet()`.

### `putAll([`com.google.common.collect.Table<? extends R,? extends C,? extends @org.checkerframework.checker.nullness.qual.Nullable V>`](./Table.md) table)`

**Returns:** `void`

{@inheritDoc}

 <p>If `table` is an `ArrayTable`, its null values will be stored in this table,
 possibly replacing values that were previously non-null.
@throws NullPointerException if `table` has a null key
@throws IllegalArgumentException if any of the provided table's row keys or column keys is not
     in `rowKeySet()` or `columnKeySet()`

### `remove(`java.lang.Object` rowKey, `java.lang.Object` columnKey)`

**Returns:** `V`

Not supported. Use `erase` instead.
@throws UnsupportedOperationException always
**Deprecated:**Use `erase`

### `erase(`java.lang.Object` rowKey, `java.lang.Object` columnKey)`

**Returns:** `V`

Associates the value `null` with the specified keys, assuming both keys are valid. If
 either key is null or isn't among the keys provided during construction, this method has no
 effect.

 <p>This method is equivalent to `put(rowKey, columnKey, null)` when both provided keys
 are valid.
@param rowKey row key of mapping to be erased
@param columnKey column key of mapping to be erased
@return the value previously associated with the keys, or `null` if no mapping existed
     for the keys

### `size()`

**Returns:** `int`

### `cellSet()`

**Returns:** `java.util.Set<com.google.common.collect.Table.Cell<R,C,@org.checkerframework.checker.nullness.qual.Nullable V>>`

Returns an unmodifiable set of all row key / column key / value triplets. Changes to the table
 will update the returned set.

 <p>The returned set's iterator traverses the mappings with the first row key, the mappings with
 the second row key, and so on.

 <p>The value in the returned cells may change if the table subsequently changes.
@return set of table cells consisting of row key / column key / value triplets

### `cellIterator()`

**Returns:** `java.util.Iterator<com.google.common.collect.Table.Cell<R,C,@org.checkerframework.checker.nullness.qual.Nullable V>>`

### `cellSpliterator()`

**Returns:** `java.util.Spliterator<com.google.common.collect.Table.Cell<R,C,@org.checkerframework.checker.nullness.qual.Nullable V>>`

### `getCell(`int` index)`

**Returns:** [`com.google.common.collect.Table.Cell<R,C,@org.checkerframework.checker.nullness.qual.Nullable V>`](Table/Cell.md)

### `getValue(`int` index)`

**Returns:** `V`

### `column(`C` columnKey)`

**Returns:** `java.util.Map<R,@org.checkerframework.checker.nullness.qual.Nullable V>`

Returns a view of all mappings that have the given column key. If the column key isn't in
 `columnKeySet()`, an empty immutable map is returned.

 <p>Otherwise, for each row key in `rowKeySet()`, the returned map associates the row key
 with the corresponding value in the table. Changes to the returned map will update the
 underlying table, and vice versa.
@param columnKey key of column to search for in the table
@return the corresponding map from row keys to values

### `columnKeySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<C>`](./ImmutableSet.md)

Returns an immutable set of the valid column keys, including those that are associated with
 null values only.
@return immutable set of column keys

### `columnMap()`

**Returns:** `java.util.Map<C,java.util.Map<R,@org.checkerframework.checker.nullness.qual.Nullable V>>`

### `row(`R` rowKey)`

**Returns:** `java.util.Map<C,@org.checkerframework.checker.nullness.qual.Nullable V>`

Returns a view of all mappings that have the given row key. If the row key isn't in `rowKeySet()`, an empty immutable map is returned.

 <p>Otherwise, for each column key in `columnKeySet()`, the returned map associates the
 column key with the corresponding value in the table. Changes to the returned map will update
 the underlying table, and vice versa.
@param rowKey key of row to search for in the table
@return the corresponding map from column keys to values

### `rowKeySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<R>`](./ImmutableSet.md)

Returns an immutable set of the valid row keys, including those that are associated with null
 values only.
@return immutable set of row keys

### `rowMap()`

**Returns:** `java.util.Map<R,java.util.Map<C,@org.checkerframework.checker.nullness.qual.Nullable V>>`

### `values()`

**Returns:** `java.util.Collection<@org.checkerframework.checker.nullness.qual.Nullable V>`

Returns an unmodifiable collection of all values, which may contain duplicates. Changes to the
 table will update the returned collection.

 <p>The returned collection's iterator traverses the values of the first row key, the values of
 the second row key, and so on.
@return collection of values

### `valuesIterator()`

**Returns:** `java.util.Iterator<@org.checkerframework.checker.nullness.qual.Nullable V>`

### `valuesSpliterator()`

**Returns:** `java.util.Spliterator<@org.checkerframework.checker.nullness.qual.Nullable V>`

