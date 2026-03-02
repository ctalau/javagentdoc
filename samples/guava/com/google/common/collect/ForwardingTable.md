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

**Parameters:**
- `columnKey` (`C`)

**Returns:** `java.util.Map<R,V>`

### `columnKeySet()`

**Returns:** `java.util.Set<C>`

### `columnMap()`

**Returns:** `java.util.Map<C,java.util.Map<R,V>>`

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

### `remove(Object rowKey, Object columnKey)`

**Parameters:**
- `rowKey` (`java.lang.Object`)
- `columnKey` (`java.lang.Object`)

**Returns:** `V`

### `row(R rowKey)`

**Parameters:**
- `rowKey` (`R`)

**Returns:** `java.util.Map<C,V>`

### `rowKeySet()`

**Returns:** `java.util.Set<R>`

### `rowMap()`

**Returns:** `java.util.Map<R,java.util.Map<C,V>>`

### `size()`

**Returns:** `int`

### `values()`

**Returns:** `java.util.Collection<V>`

### `equals(Object obj)`

**Parameters:**
- `obj` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

