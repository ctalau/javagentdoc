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

### `<init>(java.util.Comparator<? super T> primary, java.util.Comparator<? super T> secondary)`

**Parameters:**
- `primary` (`java.util.Comparator<? super T>`)
- `secondary` (`java.util.Comparator<? super T>`)

### `<init>(java.lang.Iterable<? extends java.util.Comparator<? super T>> comparators)`

**Parameters:**
- `comparators` (`java.lang.Iterable<? extends java.util.Comparator<? super T>>`)

## Methods

### `compare(T left, T right)`

**Returns:** `int`

**Parameters:**
- `left` (`T`)
- `right` (`T`)

### `equals(java.lang.Object object)`

**Returns:** `boolean`

**Parameters:**
- `object` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

