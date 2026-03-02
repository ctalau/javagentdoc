# Class: `ExplicitOrdering`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ExplicitOrdering`

**Extends:** [`com.google.common.collect.Ordering<T>`](./Ordering.md)

**Implements:** `java.io.Serializable`

## Type Parameters

- `T` extends `java.lang.Object`

## Description

## Fields

### `rankMap`

**Type:** [`com.google.common.collect.ImmutableMap<T,java.lang.Integer>`](./ImmutableMap.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(java.util.List<T> valuesInOrder)`

**Parameters:**
- `valuesInOrder` (`java.util.List<T>`)

### `<init>(com.google.common.collect.ImmutableMap<T,java.lang.Integer> rankMap)`

**Parameters:**
- `rankMap` ([`com.google.common.collect.ImmutableMap<T,java.lang.Integer>`](./ImmutableMap.md))

## Methods

### `compare(T left, T right)`

**Returns:** `int`

**Parameters:**
- `left` (`T`)
- `right` (`T`)

### `rank(T value)`

**Returns:** `int`

**Parameters:**
- `value` (`T`)

### `equals(java.lang.Object object)`

**Returns:** `boolean`

**Parameters:**
- `object` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

