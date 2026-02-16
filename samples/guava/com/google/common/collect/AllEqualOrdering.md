# Class: `AllEqualOrdering`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.AllEqualOrdering`

**Extends:** [`com.google.common.collect.Ordering<java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object>`](./Ordering.md)

**Implements:** [`java.io.Serializable`](../../../../java/io/Serializable.md)

## Description

An ordering that treats all references as equals, even nulls.
@author Emily Soldal

## Fields

### `INSTANCE`

**Type:** [`com.google.common.collect.AllEqualOrdering`](./AllEqualOrdering.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>()`

## Methods

### `compare(`java.lang.Object` left, `java.lang.Object` right)`

**Returns:** `int`

### `sortedCopy(`java.lang.Iterable<E>` iterable)`

**Returns:** [`java.util.List<E>`](../../../../java/util/List.md)

### `immutableSortedCopy(`java.lang.Iterable<E>` iterable)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `reverse()`

**Returns:** [`com.google.common.collect.Ordering<S>`](./Ordering.md)

### `readResolve()`

**Returns:** `java.lang.Object`

### `toString()`

**Returns:** `java.lang.String`

