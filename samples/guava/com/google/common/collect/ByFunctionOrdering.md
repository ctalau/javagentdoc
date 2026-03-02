# Class: `ByFunctionOrdering`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ByFunctionOrdering`

**Extends:** [`com.google.common.collect.Ordering<F>`](./Ordering.md)

**Implements:** `java.io.Serializable`

## Type Parameters

- `F` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

## Fields

### `function`

**Type:** [`com.google.common.base.Function<F,? extends T>`](../base/Function.md)

### `ordering`

**Type:** [`com.google.common.collect.Ordering<T>`](./Ordering.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(Function<F,? extends T> function, Ordering<T> ordering)`

**Parameters:**
- `function` ([`com.google.common.base.Function<F,? extends T>`](../base/Function.md))
- `ordering` ([`com.google.common.collect.Ordering<T>`](./Ordering.md))

## Methods

### `compare(F left, F right)`

**Parameters:**
- `left` (`F`)
- `right` (`F`)

**Returns:** `int`

### `equals(Object object)`

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

