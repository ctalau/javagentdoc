# Class: `CompoundOrdering`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.CompoundOrdering`

**Extends:** [`com.google.common.collect.Ordering<T>`](./Ordering.md)

**Implements:** `java.io.Serializable`

## Type Parameters

- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

## Fields

### `comparators`

**Type:** `java.util.Comparator<? super T>[]`

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(Comparator<? super T> primary, Comparator<? super T> secondary)`

**Parameters:**
- `primary` (`java.util.Comparator<? super T>`)
- `secondary` (`java.util.Comparator<? super T>`)

### `<init>(Iterable<? extends Comparator<? super T>> comparators)`

**Parameters:**
- `comparators` (`java.lang.Iterable<? extends java.util.Comparator<? super T>>`)

## Methods

### `compare(T left, T right)`

**Parameters:**
- `left` (`T`)
- `right` (`T`)

**Returns:** `int`

### `equals(Object object)`

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

