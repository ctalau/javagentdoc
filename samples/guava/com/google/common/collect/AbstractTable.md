# Class: `AbstractTable`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.AbstractTable`

**Implements:** [`com.google.common.collect.Table<R,C,V>`](./Table.md)

## Type Parameters

- `R` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `C` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

## Fields

### `cellSet`

**Type:** `java.util.Set<com.google.common.collect.Table.Cell<R,C,V>>`

### `values`

**Type:** `java.util.Collection<V>`

## Constructors

### `<init>()`

## Methods

### `containsRow(Object rowKey)`

**Parameters:**
- `rowKey` (`java.lang.Object`)

**Returns:** `boolean`

### `containsColumn(Object columnKey)`

**Parameters:**
- `columnKey` (`java.lang.Object`)

**Returns:** `boolean`

### `rowKeySet()`

**Returns:** `java.util.Set<R>`

### `columnKeySet()`

**Returns:** `java.util.Set<C>`

### `containsValue(Object value)`

**Parameters:**
- `value` (`java.lang.Object`)

**Returns:** `boolean`

### `contains(Object rowKey, Object columnKey)`

**Parameters:**
- `rowKey` (`java.lang.Object`)
- `columnKey` (`java.lang.Object`)

**Returns:** `boolean`

### `get(Object rowKey, Object columnKey)`

**Parameters:**
- `rowKey` (`java.lang.Object`)
- `columnKey` (`java.lang.Object`)

**Returns:** `V`

### `isEmpty()`

**Returns:** `boolean`

### `clear()`

**Returns:** `void`

### `remove(Object rowKey, Object columnKey)`

**Parameters:**
- `rowKey` (`java.lang.Object`)
- `columnKey` (`java.lang.Object`)

**Returns:** `V`

### `put(R rowKey, C columnKey, V value)`

**Parameters:**
- `rowKey` (`R`)
- `columnKey` (`C`)
- `value` (`V`)

**Returns:** `V`

### `putAll(Table<? extends R,? extends C,? extends V> table)`

**Parameters:**
- `table` ([`com.google.common.collect.Table<? extends R,? extends C,? extends V>`](./Table.md))

**Returns:** `void`

### `cellSet()`

**Returns:** `java.util.Set<com.google.common.collect.Table.Cell<R,C,V>>`

### `createCellSet()`

**Returns:** `java.util.Set<com.google.common.collect.Table.Cell<R,C,V>>`

### `cellIterator()`

**Returns:** `java.util.Iterator<com.google.common.collect.Table.Cell<R,C,V>>`

### `cellSpliterator()`

**Returns:** `java.util.Spliterator<com.google.common.collect.Table.Cell<R,C,V>>`

### `values()`

**Returns:** `java.util.Collection<V>`

### `createValues()`

**Returns:** `java.util.Collection<V>`

### `valuesIterator()`

**Returns:** `java.util.Iterator<V>`

### `valuesSpliterator()`

**Returns:** `java.util.Spliterator<V>`

### `equals(Object obj)`

**Parameters:**
- `obj` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

