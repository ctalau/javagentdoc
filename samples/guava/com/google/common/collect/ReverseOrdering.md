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

### `<init>(Ordering<? super T> forwardOrder)`

**Parameters:**
- `forwardOrder` ([`com.google.common.collect.Ordering<? super T>`](./Ordering.md))

## Methods

### `compare(T a, T b)`

**Parameters:**
- `a` (`T`)
- `b` (`T`)

**Returns:** `int`

### `reverse()`

**Returns:** [`com.google.common.collect.Ordering<S>`](./Ordering.md)

### `min(E a, E b)`

**Parameters:**
- `a` (`E`)
- `b` (`E`)

**Returns:** `E`

### `min(E a, E b, E c, E[] rest)`

**Parameters:**
- `a` (`E`)
- `b` (`E`)
- `c` (`E`)
- `rest` (`E[]`)

**Returns:** `E`

### `min(Iterator<E> iterator)`

**Parameters:**
- `iterator` (`java.util.Iterator<E>`)

**Returns:** `E`

### `min(Iterable<E> iterable)`

**Parameters:**
- `iterable` (`java.lang.Iterable<E>`)

**Returns:** `E`

### `max(E a, E b)`

**Parameters:**
- `a` (`E`)
- `b` (`E`)

**Returns:** `E`

### `max(E a, E b, E c, E[] rest)`

**Parameters:**
- `a` (`E`)
- `b` (`E`)
- `c` (`E`)
- `rest` (`E[]`)

**Returns:** `E`

### `max(Iterator<E> iterator)`

**Parameters:**
- `iterator` (`java.util.Iterator<E>`)

**Returns:** `E`

### `max(Iterable<E> iterable)`

**Parameters:**
- `iterable` (`java.lang.Iterable<E>`)

**Returns:** `E`

### `hashCode()`

**Returns:** `int`

### `equals(Object object)`

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `toString()`

**Returns:** `java.lang.String`

