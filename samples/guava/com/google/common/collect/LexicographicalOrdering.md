# Class: `LexicographicalOrdering`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.LexicographicalOrdering`

**Extends:** [`com.google.common.collect.Ordering<java.lang.Iterable<T>>`](./Ordering>.md)

**Implements:** [`java.io.Serializable`](../../../../java/io/Serializable.md)

## Type Parameters

- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

An ordering which sorts iterables by comparing corresponding elements pairwise.

## Fields

### `elementOrder`

**Type:** [`java.util.Comparator<? super T>`](../../../../java/util/Comparator.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>([`java.util.Comparator<? super T>`](../../../../java/util/Comparator.md) elementOrder)`

## Methods

### `compare(`java.lang.Iterable<T>` leftIterable, `java.lang.Iterable<T>` rightIterable)`

**Returns:** `int`

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

