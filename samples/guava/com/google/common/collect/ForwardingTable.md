# Class: `ForwardingTable`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingTable`

**Extends:** [`com.google.common.collect.ForwardingObject`](./ForwardingObject.md)

**Implements:** [`com.google.common.collect.Table<R,C,V>`](./Table.md)

## Type Parameters

- `R` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `C` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A table which forwards all its method calls to another table. Subclasses should override one or
 more methods to modify the behavior of the backing map as desired per the <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.
**Author:** Gregory Kick
**Since:** 7.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `delegate()`

**Returns:** [`com.google.common.collect.Table<R,C,V>`](./Table.md)

### `cellSet()`

**Returns:** `java.util.Set<com.google.common.collect.Table.Cell<R,C,V>>`

### `clear()`

**Returns:** `void`

### `column(`C` columnKey)`

**Returns:** `java.util.Map<R,V>`

### `columnKeySet()`

**Returns:** `java.util.Set<C>`

### `columnMap()`

**Returns:** `java.util.Map<C,java.util.Map<R,V>>`

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

### `put(`R` rowKey, `C` columnKey, `V` value)`

**Returns:** `V`

### `putAll([`com.google.common.collect.Table<? extends R,? extends C,? extends V>`](./Table.md) table)`

**Returns:** `void`

### `remove(`java.lang.Object` rowKey, `java.lang.Object` columnKey)`

**Returns:** `V`

### `row(`R` rowKey)`

**Returns:** `java.util.Map<C,V>`

### `rowKeySet()`

**Returns:** `java.util.Set<R>`

### `rowMap()`

**Returns:** `java.util.Map<R,java.util.Map<C,V>>`

### `size()`

**Returns:** `int`

### `values()`

**Returns:** `java.util.Collection<V>`

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

