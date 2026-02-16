# Class: `AbstractTable`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.AbstractTable`

**Implements:** [`com.google.common.collect.Table<R,C,V>`](./Table.md)

## Type Parameters

- `R` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `C` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Skeletal, implementation-agnostic implementation of the {@link Table} interface.
@author Louis Wasserman

## Fields

### `cellSet`

**Type:** [`java.util.Set<com.google.common.collect.Table.Cell<R,C,V>>`](../../../../java/util/Set>.md)

### `values`

**Type:** [`java.util.Collection<V>`](../../../../java/util/Collection.md)

## Constructors

### `<init>()`

## Methods

### `containsRow(`java.lang.Object` rowKey)`

**Returns:** `boolean`

### `containsColumn(`java.lang.Object` columnKey)`

**Returns:** `boolean`

### `rowKeySet()`

**Returns:** [`java.util.Set<R>`](../../../../java/util/Set.md)

### `columnKeySet()`

**Returns:** [`java.util.Set<C>`](../../../../java/util/Set.md)

### `containsValue(`java.lang.Object` value)`

**Returns:** `boolean`

### `contains(`java.lang.Object` rowKey, `java.lang.Object` columnKey)`

**Returns:** `boolean`

### `get(`java.lang.Object` rowKey, `java.lang.Object` columnKey)`

**Returns:** [`V`](V.md)

### `isEmpty()`

**Returns:** `boolean`

### `clear()`

**Returns:** `void`

### `remove(`java.lang.Object` rowKey, `java.lang.Object` columnKey)`

**Returns:** [`V`](V.md)

### `put([`R`](R.md) rowKey, [`C`](C.md) columnKey, [`V`](V.md) value)`

**Returns:** [`V`](V.md)

### `putAll([`com.google.common.collect.Table<? extends R,? extends C,? extends V>`](./Table.md) table)`

**Returns:** `void`

### `cellSet()`

**Returns:** [`java.util.Set<com.google.common.collect.Table.Cell<R,C,V>>`](../../../../java/util/Set>.md)

### `createCellSet()`

**Returns:** [`java.util.Set<com.google.common.collect.Table.Cell<R,C,V>>`](../../../../java/util/Set>.md)

### `cellIterator()`

**Returns:** [`java.util.Iterator<com.google.common.collect.Table.Cell<R,C,V>>`](../../../../java/util/Iterator>.md)

### `cellSpliterator()`

**Returns:** [`java.util.Spliterator<com.google.common.collect.Table.Cell<R,C,V>>`](../../../../java/util/Spliterator>.md)

### `values()`

**Returns:** [`java.util.Collection<V>`](../../../../java/util/Collection.md)

### `createValues()`

**Returns:** [`java.util.Collection<V>`](../../../../java/util/Collection.md)

### `valuesIterator()`

**Returns:** [`java.util.Iterator<V>`](../../../../java/util/Iterator.md)

### `valuesSpliterator()`

**Returns:** [`java.util.Spliterator<V>`](../../../../java/util/Spliterator.md)

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

Returns the string representation {@code rowMap().toString()}.

