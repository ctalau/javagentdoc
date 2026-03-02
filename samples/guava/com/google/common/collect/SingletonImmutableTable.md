# Class: `SingletonImmutableTable`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.SingletonImmutableTable`

**Extends:** [`com.google.common.collect.ImmutableTable<R,C,V>`](./ImmutableTable.md)

## Type Parameters

- `R` extends `java.lang.Object`
- `C` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

## Fields

### `singleRowKey`

**Type:** `R`

### `singleColumnKey`

**Type:** `C`

### `singleValue`

**Type:** `V`

## Constructors

### `<init>(R rowKey, C columnKey, V value)`

**Parameters:**
- `rowKey` (`R`)
- `columnKey` (`C`)
- `value` (`V`)

### `<init>(Table.Cell<R,C,V> cell)`

**Parameters:**
- `cell` (`com.google.common.collect.Table.Cell<R,C,V>`)

## Methods

### `column(C columnKey)`

**Parameters:**
- `columnKey` (`C`)

**Returns:** [`com.google.common.collect.ImmutableMap<R,V>`](./ImmutableMap.md)

### `columnMap()`

**Returns:** [`com.google.common.collect.ImmutableMap<C,java.util.Map<R,V>>`](./ImmutableMap.md)

### `rowMap()`

**Returns:** [`com.google.common.collect.ImmutableMap<R,java.util.Map<C,V>>`](./ImmutableMap.md)

### `size()`

**Returns:** `int`

### `createCellSet()`

**Returns:** [`com.google.common.collect.ImmutableSet<com.google.common.collect.Table.Cell<R,C,V>>`](./ImmutableSet.md)

### `createValues()`

**Returns:** [`com.google.common.collect.ImmutableCollection<V>`](./ImmutableCollection.md)

### `writeReplace()`

**Returns:** `java.lang.Object`

