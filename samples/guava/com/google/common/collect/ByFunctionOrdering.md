# Class: `ByFunctionOrdering`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ByFunctionOrdering`

**Extends:** [`com.google.common.collect.Ordering<F>`](./Ordering.md)

**Implements:** [`java.io.Serializable`](../../../../java/io/Serializable.md)

## Type Parameters

- `F` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

An ordering that orders elements by applying an order to the result of a function on those
 elements.

## Fields

### `function`

**Type:** [`com.google.common.base.Function<F,? extends T>`](../base/Function.md)

### `ordering`

**Type:** [`com.google.common.collect.Ordering<T>`](./Ordering.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>([`com.google.common.base.Function<F,? extends T>`](../base/Function.md) function, [`com.google.common.collect.Ordering<T>`](./Ordering.md) ordering)`

## Methods

### `compare([`F`](F.md) left, [`F`](F.md) right)`

**Returns:** `int`

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

