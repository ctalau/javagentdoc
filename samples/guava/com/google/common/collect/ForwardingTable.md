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

Subclasses should override one or
 more methods to modify the behavior of the backing map as desired per the [decorator pattern](http://en.wikipedia.org/wiki/Decorator_pattern).

## Constructors

### `<init>()`

## Methods

### `delegate()`

**Returns:** [`com.google.common.collect.Table<R,C,V>`](./Table.md)

### `cellSet()`

**Returns:** `java.util.Set<com.google.common.collect.Table.Cell<R,C,V>>`

### `clear()`

**Returns:** `void`

### `column(C columnKey)`

**Returns:** `java.util.Map<R,V>`

**Parameters:**
- `columnKey` (`C`)

### `columnKeySet()`

**Returns:** `java.util.Set<C>`

### `columnMap()`

**Returns:** `java.util.Map<C,java.util.Map<R,V>>`

### `contains(java.lang.Object rowKey, java.lang.Object columnKey)`

**Returns:** `boolean`

**Parameters:**
- `rowKey` (`java.lang.Object`)
- `columnKey` (`java.lang.Object`)

### `containsColumn(java.lang.Object columnKey)`

**Returns:** `boolean`

**Parameters:**
- `columnKey` (`java.lang.Object`)

### `containsRow(java.lang.Object rowKey)`

**Returns:** `boolean`

**Parameters:**
- `rowKey` (`java.lang.Object`)

### `containsValue(java.lang.Object value)`

**Returns:** `boolean`

**Parameters:**
- `value` (`java.lang.Object`)

### `get(java.lang.Object rowKey, java.lang.Object columnKey)`

**Returns:** `V`

**Parameters:**
- `rowKey` (`java.lang.Object`)
- `columnKey` (`java.lang.Object`)

### `isEmpty()`

**Returns:** `boolean`

### `put(R rowKey, C columnKey, V value)`

**Returns:** `V`

**Parameters:**
- `rowKey` (`R`)
- `columnKey` (`C`)
- `value` (`V`)

### `putAll(com.google.common.collect.Table<? extends R,? extends C,? extends V> table)`

**Returns:** `void`

**Parameters:**
- `table` ([`com.google.common.collect.Table<? extends R,? extends C,? extends V>`](./Table.md))

### `remove(java.lang.Object rowKey, java.lang.Object columnKey)`

**Returns:** `V`

**Parameters:**
- `rowKey` (`java.lang.Object`)
- `columnKey` (`java.lang.Object`)

### `row(R rowKey)`

**Returns:** `java.util.Map<C,V>`

**Parameters:**
- `rowKey` (`R`)

### `rowKeySet()`

**Returns:** `java.util.Set<R>`

### `rowMap()`

**Returns:** `java.util.Map<R,java.util.Map<C,V>>`

### `size()`

**Returns:** `int`

### `values()`

**Returns:** `java.util.Collection<V>`

### `equals(java.lang.Object obj)`

**Returns:** `boolean`

**Parameters:**
- `obj` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

