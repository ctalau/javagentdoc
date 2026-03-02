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

### `<init>(List<T> valuesInOrder)`

**Parameters:**
- `valuesInOrder` (`java.util.List<T>`)

### `<init>(ImmutableMap<T,Integer> rankMap)`

**Parameters:**
- `rankMap` ([`com.google.common.collect.ImmutableMap<T,java.lang.Integer>`](./ImmutableMap.md))

## Methods

### `compare(T left, T right)`

**Parameters:**
- `left` (`T`)
- `right` (`T`)

**Returns:** `int`

### `rank(T value)`

**Parameters:**
- `value` (`T`)

**Returns:** `int`

### `equals(Object object)`

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

