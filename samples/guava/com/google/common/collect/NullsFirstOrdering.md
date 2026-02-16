# Class: `NullsFirstOrdering`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.NullsFirstOrdering`

**Extends:** [`com.google.common.collect.Ordering<@org.checkerframework.checker.nullness.qual.Nullable T>`](./Ordering.md)

**Implements:** `java.io.Serializable`

## Type Parameters

- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

An ordering that treats `null` as less than all other values.

## Fields

### `ordering`

**Type:** [`com.google.common.collect.Ordering<? super T>`](./Ordering.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>([`com.google.common.collect.Ordering<? super T>`](./Ordering.md) ordering)`

## Methods

### `compare(`T` left, `T` right)`

**Returns:** `int`

### `reverse()`

**Returns:** [`com.google.common.collect.Ordering<S>`](./Ordering.md)

### `nullsFirst()`

**Returns:** [`com.google.common.collect.Ordering<@org.checkerframework.checker.nullness.qual.Nullable S>`](./Ordering.md)

### `nullsLast()`

**Returns:** [`com.google.common.collect.Ordering<@org.checkerframework.checker.nullness.qual.Nullable S>`](./Ordering.md)

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

