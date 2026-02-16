# Class: `ExplicitOrdering`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ExplicitOrdering`

**Extends:** [`com.google.common.collect.Ordering<T>`](./Ordering.md)

**Implements:** [`java.io.Serializable`](../../../../java/io/Serializable.md)

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

### `<init>([`java.util.List<T>`](../../../../java/util/List.md) valuesInOrder)`

### `<init>([`com.google.common.collect.ImmutableMap<T,java.lang.Integer>`](./ImmutableMap.md) rankMap)`

## Methods

### `compare([`T`](T.md) left, [`T`](T.md) right)`

**Returns:** `int`

### `rank([`T`](T.md) value)`

**Returns:** `int`

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

