# Class: `CompoundOrdering`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.CompoundOrdering`

**Extends:** [`com.google.common.collect.Ordering<T>`](./Ordering.md)

**Implements:** [`java.io.Serializable`](../../../../java/io/Serializable.md)

## Type Parameters

- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

An ordering that tries several comparators in order.

## Fields

### `comparators`

**Type:** [`java.util.Comparator<? super T>[]`](../../../../java/util/Comparator.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>([`java.util.Comparator<? super T>`](../../../../java/util/Comparator.md) primary, [`java.util.Comparator<? super T>`](../../../../java/util/Comparator.md) secondary)`

### `<init>(`java.lang.Iterable<? extends java.util.Comparator<? super T>>` comparators)`

## Methods

### `compare([`T`](T.md) left, [`T`](T.md) right)`

**Returns:** `int`

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

