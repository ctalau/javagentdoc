# Class: `ExplicitOrdering`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ExplicitOrdering`

**Extends:** [`com.google.common.collect.Ordering<T>`](./Ordering.md)

**Implements:** `java.io.Serializable`

## Type Parameters

- `T` extends `java.lang.Object`

## Description

An ordering that compares objects according to a given order.

## Fields

### `rankMap`

**Type:** [`com.google.common.collect.ImmutableMap<T,java.lang.Integer>`](./ImmutableMap.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(`java.util.List<T>` valuesInOrder)`

### `<init>([`com.google.common.collect.ImmutableMap<T,java.lang.Integer>`](./ImmutableMap.md) rankMap)`

## Methods

### `compare(`T` left, `T` right)`

**Returns:** `int`

### `rank(`T` value)`

**Returns:** `int`

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

