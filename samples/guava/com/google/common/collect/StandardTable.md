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

This class provides rapid access to records by the row key alone or by both keys,
 but not by just the column key.

 
The views returned by #column, #columnKeySet(), and #columnMap() have
 iterators that don't support remove(). Otherwise, all optional operations are supported.
 Null row keys, columns keys, and values are not supported.

 
Lookups by row key are often faster than lookups by column key, because the data is stored in
 a Map<R, Map<C, V>>. A method call like column(columnKey).get(rowKey) still runs
 quickly, since the row key is provided. However, column(columnKey).size() takes longer,
 since an iteration across all row keys occurs.

 
Note that this implementation is not synchronized. If multiple threads access this table
 concurrently and one of the threads modifies the table, it must be synchronized externally.

## Fields

### `backingMap`

**Type:** `java.util.Map<R,java.util.Map<C,V>>`

### `factory`

**Type:** [`com.google.common.base.Supplier<? extends java.util.Map<C,V>>`](../base/Supplier.md)

### `columnKeySet`

**Type:** `java.util.Set<C>`

### `rowMap`

**Type:** `java.util.Map<R,java.util.Map<C,V>>`

### `columnMap`

**Type:** [`com.google.common.collect.StandardTable<R,C,V>.ColumnMap`](./StandardTable.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(Map<R,Map<C,V>> backingMap, Supplier<? extends Map<C,V>> factory)`

**Parameters:**
- `backingMap` (`java.util.Map<R,java.util.Map<C,V>>`)
- `factory` ([`com.google.common.base.Supplier<? extends java.util.Map<C,V>>`](../base/Supplier.md))

## Methods

### `contains(Object rowKey, Object columnKey)`

**Parameters:**
- `rowKey` (`java.lang.Object`)
- `columnKey` (`java.lang.Object`)

**Returns:** `boolean`

### `containsColumn(Object columnKey)`

**Parameters:**
- `columnKey` (`java.lang.Object`)

**Returns:** `boolean`

### `containsRow(Object rowKey)`

**Parameters:**
- `rowKey` (`java.lang.Object`)

**Returns:** `boolean`

### `containsValue(Object value)`

**Parameters:**
- `value` (`java.lang.Object`)

**Returns:** `boolean`

### `get(Object rowKey, Object columnKey)`

**Parameters:**
- `rowKey` (`java.lang.Object`)
- `columnKey` (`java.lang.Object`)

**Returns:** `V`

### `isEmpty()`

**Returns:** `boolean`

### `size()`

**Returns:** `int`

### `clear()`

**Returns:** `void`

### `getOrCreate(R rowKey)`

**Parameters:**
- `rowKey` (`R`)

**Returns:** `java.util.Map<C,V>`

### `put(R rowKey, C columnKey, V value)`

**Parameters:**
- `rowKey` (`R`)
- `columnKey` (`C`)
- `value` (`V`)

**Returns:** `V`

### `remove(Object rowKey, Object columnKey)`

**Parameters:**
- `rowKey` (`java.lang.Object`)
- `columnKey` (`java.lang.Object`)

**Returns:** `V`

### `removeColumn(Object column)`

**Parameters:**
- `column` (`java.lang.Object`)

**Returns:** `java.util.Map<R,V>`

### `containsMapping(Object rowKey, Object columnKey, Object value)`

**Parameters:**
- `rowKey` (`java.lang.Object`)
- `columnKey` (`java.lang.Object`)
- `value` (`java.lang.Object`)

**Returns:** `boolean`

### `removeMapping(Object rowKey, Object columnKey, Object value)`

**Parameters:**
- `rowKey` (`java.lang.Object`)
- `columnKey` (`java.lang.Object`)
- `value` (`java.lang.Object`)

**Returns:** `boolean`

### `cellSet()`

The set's iterator traverses the mappings for the first row, the mappings for the second
 row, and so on.

 
Each cell is an immutable snapshot of a row key / column key / value mapping, taken at the
 time the cell is returned by a method call to the set or its iterator.

**Returns:** `java.util.Set<com.google.common.collect.Table.Cell<R,C,V>>`

### `cellIterator()`

**Returns:** `java.util.Iterator<com.google.common.collect.Table.Cell<R,C,V>>`

### `cellSpliterator()`

**Returns:** `java.util.Spliterator<com.google.common.collect.Table.Cell<R,C,V>>`

### `row(R rowKey)`

**Parameters:**
- `rowKey` (`R`)

**Returns:** `java.util.Map<C,V>`

### `column(C columnKey)`

The returned map's views have iterators that don't support remove().

**Parameters:**
- `columnKey` (`C`)

**Returns:** `java.util.Map<R,V>`

### `rowKeySet()`

**Returns:** `java.util.Set<R>`

### `columnKeySet()`

The returned set has an iterator that does not support remove().

 
The set's iterator traverses the columns of the first row, the columns of the second row,
 etc., skipping any columns that have appeared previously.

**Returns:** `java.util.Set<C>`

### `createColumnKeyIterator()`

**Returns:** `java.util.Iterator<C>`

### `values()`

The collection's iterator traverses the values for the first row, the values for the second
 row, and so on.

**Returns:** `java.util.Collection<V>`

### `rowMap()`

**Returns:** `java.util.Map<R,java.util.Map<C,V>>`

### `createRowMap()`

**Returns:** `java.util.Map<R,java.util.Map<C,V>>`

### `columnMap()`

**Returns:** `java.util.Map<C,java.util.Map<R,V>>`

