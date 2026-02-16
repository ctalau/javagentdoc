# Class: `AbstractTable`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.AbstractTable`

**Implements:** [`com.google.common.collect.Table<R,C,V>`](./Table.md)

## Type Parameters

- `R` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `C` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Skeletal, implementation-agnostic implementation of the `Table` interface.
**Author:** Louis Wasserman

## Fields

### `cellSet`

**Type:** `java.util.Set<com.google.common.collect.Table.Cell<R,C,V>>`

### `values`

**Type:** `java.util.Collection<V>`

## Constructors

### `<init>()`

## Methods

### `containsRow(`java.lang.Object` rowKey)`

**Returns:** `boolean`

### `containsColumn(`java.lang.Object` columnKey)`

**Returns:** `boolean`

### `rowKeySet()`

**Returns:** `java.util.Set<R>`

### `columnKeySet()`

**Returns:** `java.util.Set<C>`

### `containsValue(`java.lang.Object` value)`

**Returns:** `boolean`

### `contains(`java.lang.Object` rowKey, `java.lang.Object` columnKey)`

**Returns:** `boolean`

### `get(`java.lang.Object` rowKey, `java.lang.Object` columnKey)`

**Returns:** `V`

### `isEmpty()`

**Returns:** `boolean`

### `clear()`

**Returns:** `void`

### `remove(`java.lang.Object` rowKey, `java.lang.Object` columnKey)`

**Returns:** `V`

### `put(`R` rowKey, `C` columnKey, `V` value)`

**Returns:** `V`

### `putAll([`com.google.common.collect.Table<? extends R,? extends C,? extends V>`](./Table.md) table)`

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

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

Returns the string representation `rowMap().toString()`.

