# Class: `StandardTable`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.StandardTable`

**Extends:** [`com.google.common.collect.AbstractTable<R,C,V>`](./AbstractTable.md)

**Implements:** [`java.io.Serializable`](../../../../java/io/Serializable.md)

## Type Parameters

- `R` extends `java.lang.Object`
- `C` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

{@link Table} implementation backed by a map that associates row keys with column key / value
 secondary maps. This class provides rapid access to records by the row key alone or by both keys,
 but not by just the column key.

 <p>The views returned by {@link #column}, {@link #columnKeySet()}, and {@link #columnMap()} have
 iterators that don't support {@code remove()}. Otherwise, all optional operations are supported.
 Null row keys, columns keys, and values are not supported.

 <p>Lookups by row key are often faster than lookups by column key, because the data is stored in
 a {@code Map<R, Map<C, V>>}. A method call like {@code column(columnKey).get(rowKey)} still runs
 quickly, since the row key is provided. However, {@code column(columnKey).size()} takes longer,
 since an iteration across all row keys occurs.

 <p>Note that this implementation is not synchronized. If multiple threads access this table
 concurrently and one of the threads modifies the table, it must be synchronized externally.
@author Jared Levy

## Fields

### `backingMap`

**Type:** [`java.util.Map<R,java.util.Map<C,V>>`](../../../../java/util/Map>.md)

### `factory`

**Type:** [`com.google.common.base.Supplier<? extends java.util.Map<C,V>>`](../base/Supplier>.md)

### `columnKeySet`

**Type:** [`java.util.Set<C>`](../../../../java/util/Set.md)

### `rowMap`

**Type:** [`java.util.Map<R,java.util.Map<C,V>>`](../../../../java/util/Map>.md)

### `columnMap`

**Type:** [`com.google.common.collect.StandardTable<R,C,V>.ColumnMap`](StandardTable/ColumnMap.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>([`java.util.Map<R,java.util.Map<C,V>>`](../../../../java/util/Map>.md) backingMap, [`com.google.common.base.Supplier<? extends java.util.Map<C,V>>`](../base/Supplier>.md) factory)`

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

**Returns:** [`V`](V.md)

### `isEmpty()`

**Returns:** `boolean`

### `size()`

**Returns:** `int`

### `clear()`

**Returns:** `void`

### `getOrCreate([`R`](R.md) rowKey)`

**Returns:** [`java.util.Map<C,V>`](../../../../java/util/Map.md)

### `put([`R`](R.md) rowKey, [`C`](C.md) columnKey, [`V`](V.md) value)`

**Returns:** [`V`](V.md)

### `remove(`java.lang.Object` rowKey, `java.lang.Object` columnKey)`

**Returns:** [`V`](V.md)

### `removeColumn(`java.lang.Object` column)`

**Returns:** [`java.util.Map<R,V>`](../../../../java/util/Map.md)

### `containsMapping(`java.lang.Object` rowKey, `java.lang.Object` columnKey, `java.lang.Object` value)`

**Returns:** `boolean`

### `removeMapping(`java.lang.Object` rowKey, `java.lang.Object` columnKey, `java.lang.Object` value)`

**Returns:** `boolean`

Remove a row key / column key / value mapping, if present.

### `cellSet()`

**Returns:** [`java.util.Set<com.google.common.collect.Table.Cell<R,C,V>>`](../../../../java/util/Set>.md)

{@inheritDoc}

 <p>The set's iterator traverses the mappings for the first row, the mappings for the second
 row, and so on.

 <p>Each cell is an immutable snapshot of a row key / column key / value mapping, taken at the
 time the cell is returned by a method call to the set or its iterator.

### `cellIterator()`

**Returns:** [`java.util.Iterator<com.google.common.collect.Table.Cell<R,C,V>>`](../../../../java/util/Iterator>.md)

### `cellSpliterator()`

**Returns:** [`java.util.Spliterator<com.google.common.collect.Table.Cell<R,C,V>>`](../../../../java/util/Spliterator>.md)

### `row([`R`](R.md) rowKey)`

**Returns:** [`java.util.Map<C,V>`](../../../../java/util/Map.md)

### `column([`C`](C.md) columnKey)`

**Returns:** [`java.util.Map<R,V>`](../../../../java/util/Map.md)

{@inheritDoc}

 <p>The returned map's views have iterators that don't support {@code remove()}.

### `rowKeySet()`

**Returns:** [`java.util.Set<R>`](../../../../java/util/Set.md)

### `columnKeySet()`

**Returns:** [`java.util.Set<C>`](../../../../java/util/Set.md)

{@inheritDoc}

 <p>The returned set has an iterator that does not support {@code remove()}.

 <p>The set's iterator traverses the columns of the first row, the columns of the second row,
 etc., skipping any columns that have appeared previously.

### `createColumnKeyIterator()`

**Returns:** [`java.util.Iterator<C>`](../../../../java/util/Iterator.md)

Creates an iterator that returns each column value with duplicates omitted.

### `values()`

**Returns:** [`java.util.Collection<V>`](../../../../java/util/Collection.md)

{@inheritDoc}

 <p>The collection's iterator traverses the values for the first row, the values for the second
 row, and so on.

### `rowMap()`

**Returns:** [`java.util.Map<R,java.util.Map<C,V>>`](../../../../java/util/Map>.md)

### `createRowMap()`

**Returns:** [`java.util.Map<R,java.util.Map<C,V>>`](../../../../java/util/Map>.md)

### `columnMap()`

**Returns:** [`java.util.Map<C,java.util.Map<R,V>>`](../../../../java/util/Map>.md)

