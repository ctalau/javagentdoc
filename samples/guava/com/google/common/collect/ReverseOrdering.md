# Class: `ReverseOrdering`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ReverseOrdering`

**Extends:** [`com.google.common.collect.Ordering<T>`](./Ordering.md)

**Implements:** `java.io.Serializable`

## Type Parameters

- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

An ordering that uses the reverse of a given order.

## Fields

### `forwardOrder`

**Type:** [`com.google.common.collect.Ordering<? super T>`](./Ordering.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>([`com.google.common.collect.Ordering<? super T>`](./Ordering.md) forwardOrder)`

## Methods

### `compare(`T` a, `T` b)`

**Returns:** `int`

### `reverse()`

**Returns:** [`com.google.common.collect.Ordering<S>`](./Ordering.md)

### `min(`E` a, `E` b)`

**Returns:** `E`

### `min(`E` a, `E` b, `E` c, `E[]` rest)`

**Returns:** `E`

### `min(`java.util.Iterator<E>` iterator)`

**Returns:** `E`

### `min(`java.lang.Iterable<E>` iterable)`

**Returns:** `E`

### `max(`E` a, `E` b)`

**Returns:** `E`

### `max(`E` a, `E` b, `E` c, `E[]` rest)`

**Returns:** `E`

### `max(`java.util.Iterator<E>` iterator)`

**Returns:** `E`

### `max(`java.lang.Iterable<E>` iterable)`

**Returns:** `E`

### `hashCode()`

**Returns:** `int`

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

### `toString()`

**Returns:** `java.lang.String`

