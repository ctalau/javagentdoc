# Class: `StandardTable`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.StandardTable`

**Extends:** [`com.google.common.collect.AbstractTable<R,C,V>`](./AbstractTable.md)

**Implements:** `java.io.Serializable`

## Type Parameters

- `R` extends `java.lang.Object`
- `C` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

`Table` implementation backed by a map that associates row keys with column key / value
 secondary maps. This class provides rapid access to records by the row key alone or by both keys,
 but not by just the column key.

 <p>The views returned by `column`, `columnKeySet()`, and `columnMap()` have
 iterators that don't support `remove()`. Otherwise, all optional operations are supported.
 Null row keys, columns keys, and values are not supported.

 <p>Lookups by row key are often faster than lookups by column key, because the data is stored in
 a `Map<R, Map<C, V>>`. A method call like `column(columnKey).get(rowKey)` still runs
 quickly, since the row key is provided. However, `column(columnKey).size()` takes longer,
 since an iteration across all row keys occurs.

 <p>Note that this implementation is not synchronized. If multiple threads access this table
 concurrently and one of the threads modifies the table, it must be synchronized externally.
**Author:** Jared Levy

## Fields

### `backingMap`

**Type:** `java.util.Map<R,java.util.Map<C,V>>`

### `factory`

**Type:** [`com.google.common.base.Supplier<? extends java.util.Map<C,V>>`](../base/Supplier>.md)

### `columnKeySet`

**Type:** `java.util.Set<C>`

### `rowMap`

**Type:** `java.util.Map<R,java.util.Map<C,V>>`

### `columnMap`

**Type:** [`com.google.common.collect.StandardTable<R,C,V>.ColumnMap`](StandardTable/ColumnMap.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(`java.util.Map<R,java.util.Map<C,V>>` backingMap, [`com.google.common.base.Supplier<? extends java.util.Map<C,V>>`](../base/Supplier>.md) factory)`

## Methods

### `contains(`java.lang.Object` rowKey, `java.lang.Object` columnKey)`

**Returns:** `boolean`

### `containsColumn(`java.lang.Object` columnKey)`

**Returns:** `boolean`

### `containsRow(`java.lang.Object` rowKey)`

**Returns:** `boolean`

### `containsValue(`java.lang.Object` value)`

**Returns:** `boolean`

### `get(`java.lang.Object` rowKey, `java.lang.Object` columnKey)`

**Returns:** `V`

### `isEmpty()`

**Returns:** `boolean`

### `size()`

**Returns:** `int`

### `clear()`

**Returns:** `void`

### `getOrCreate(`R` rowKey)`

**Returns:** `java.util.Map<C,V>`

### `put(`R` rowKey, `C` columnKey, `V` value)`

**Returns:** `V`

### `remove(`java.lang.Object` rowKey, `java.lang.Object` columnKey)`

**Returns:** `V`

### `removeColumn(`java.lang.Object` column)`

**Returns:** `java.util.Map<R,V>`

### `containsMapping(`java.lang.Object` rowKey, `java.lang.Object` columnKey, `java.lang.Object` value)`

**Returns:** `boolean`

### `removeMapping(`java.lang.Object` rowKey, `java.lang.Object` columnKey, `java.lang.Object` value)`

**Returns:** `boolean`

Remove a row key / column key / value mapping, if present.

### `cellSet()`

**Returns:** `java.util.Set<com.google.common.collect.Table.Cell<R,C,V>>`

{@inheritDoc}

 <p>The set's iterator traverses the mappings for the first row, the mappings for the second
 row, and so on.

 <p>Each cell is an immutable snapshot of a row key / column key / value mapping, taken at the
 time the cell is returned by a method call to the set or its iterator.

### `cellIterator()`

**Returns:** `java.util.Iterator<com.google.common.collect.Table.Cell<R,C,V>>`

### `cellSpliterator()`

**Returns:** `java.util.Spliterator<com.google.common.collect.Table.Cell<R,C,V>>`

### `row(`R` rowKey)`

**Returns:** `java.util.Map<C,V>`

### `column(`C` columnKey)`

**Returns:** `java.util.Map<R,V>`

{@inheritDoc}

 <p>The returned map's views have iterators that don't support `remove()`.

### `rowKeySet()`

**Returns:** `java.util.Set<R>`

### `columnKeySet()`

**Returns:** `java.util.Set<C>`

{@inheritDoc}

 <p>The returned set has an iterator that does not support `remove()`.

 <p>The set's iterator traverses the columns of the first row, the columns of the second row,
 etc., skipping any columns that have appeared previously.

### `createColumnKeyIterator()`

**Returns:** `java.util.Iterator<C>`

Creates an iterator that returns each column value with duplicates omitted.

### `values()`

**Returns:** `java.util.Collection<V>`

{@inheritDoc}

 <p>The collection's iterator traverses the values for the first row, the values for the second
 row, and so on.

### `rowMap()`

**Returns:** `java.util.Map<R,java.util.Map<C,V>>`

### `createRowMap()`

**Returns:** `java.util.Map<R,java.util.Map<C,V>>`

### `columnMap()`

**Returns:** `java.util.Map<C,java.util.Map<R,V>>`

