# Class: `NullsFirstOrdering`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.NullsFirstOrdering`

**Extends:** [`com.google.common.collect.Ordering<@org.checkerframework.checker.nullness.qual.Nullable T>`](./Ordering.md)

**Implements:** `java.io.Serializable`

## Type Parameters

- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

## Fields

### `ordering`

**Type:** [`com.google.common.collect.Ordering<? super T>`](./Ordering.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(Ordering<? super T> ordering)`

**Parameters:**
- `ordering` ([`com.google.common.collect.Ordering<? super T>`](./Ordering.md))

## Methods

### `compare(T left, T right)`

**Parameters:**
- `left` (`T`)
- `right` (`T`)

**Returns:** `int`

### `reverse()`

**Returns:** [`com.google.common.collect.Ordering<S>`](./Ordering.md)

### `nullsFirst()`

**Returns:** [`com.google.common.collect.Ordering<@org.checkerframework.checker.nullness.qual.Nullable S>`](./Ordering.md)

### `nullsLast()`

**Returns:** [`com.google.common.collect.Ordering<@org.checkerframework.checker.nullness.qual.Nullable S>`](./Ordering.md)

### `equals(Object object)`

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

