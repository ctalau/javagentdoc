# Class: `TransformedIterator`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.TransformedIterator`

**Implements:** `java.util.Iterator<T>`

## Type Parameters

- `F` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

An iterator that transforms a backing iterator; for internal use. This avoids the object overhead
 of constructing a `com.google.common.base.Function` for internal methods.
**Author:** Louis Wasserman

## Fields

### `backingIterator`

**Type:** `java.util.Iterator<? extends F>`

## Constructors

### `<init>(`java.util.Iterator<? extends F>` backingIterator)`

## Methods

### `transform(`F` from)`

**Returns:** `T`

### `hasNext()`

**Returns:** `boolean`

### `next()`

**Returns:** `T`

### `remove()`

**Returns:** `void`

