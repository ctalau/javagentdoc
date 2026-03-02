# Class: `ReverseOrdering`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ReverseOrdering`

**Extends:** [`com.google.common.collect.Ordering<T>`](./Ordering.md)

**Implements:** `java.io.Serializable`

## Type Parameters

- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

## Fields

### `forwardOrder`

**Type:** [`com.google.common.collect.Ordering<? super T>`](./Ordering.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(com.google.common.collect.Ordering<? super T> forwardOrder)`

**Parameters:**
- `forwardOrder` ([`com.google.common.collect.Ordering<? super T>`](./Ordering.md))

## Methods

### `compare(T a, T b)`

**Returns:** `int`

**Parameters:**
- `a` (`T`)
- `b` (`T`)

### `reverse()`

**Returns:** [`com.google.common.collect.Ordering<S>`](./Ordering.md)

### `min(E a, E b)`

**Returns:** `E`

**Parameters:**
- `a` (`E`)
- `b` (`E`)

### `min(E a, E b, E c, E[] rest)`

**Returns:** `E`

**Parameters:**
- `a` (`E`)
- `b` (`E`)
- `c` (`E`)
- `rest` (`E[]`)

### `min(java.util.Iterator<E> iterator)`

**Returns:** `E`

**Parameters:**
- `iterator` (`java.util.Iterator<E>`)

### `min(java.lang.Iterable<E> iterable)`

**Returns:** `E`

**Parameters:**
- `iterable` (`java.lang.Iterable<E>`)

### `max(E a, E b)`

**Returns:** `E`

**Parameters:**
- `a` (`E`)
- `b` (`E`)

### `max(E a, E b, E c, E[] rest)`

**Returns:** `E`

**Parameters:**
- `a` (`E`)
- `b` (`E`)
- `c` (`E`)
- `rest` (`E[]`)

### `max(java.util.Iterator<E> iterator)`

**Returns:** `E`

**Parameters:**
- `iterator` (`java.util.Iterator<E>`)

### `max(java.lang.Iterable<E> iterable)`

**Returns:** `E`

**Parameters:**
- `iterable` (`java.lang.Iterable<E>`)

### `hashCode()`

**Returns:** `int`

### `equals(java.lang.Object object)`

**Returns:** `boolean`

**Parameters:**
- `object` (`java.lang.Object`)

### `toString()`

**Returns:** `java.lang.String`

