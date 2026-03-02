# Class: `TransformedIterator`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.TransformedIterator`

**Implements:** `java.util.Iterator<T>`

## Type Parameters

- `F` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

This avoids the object overhead
 of constructing a Function for internal methods.

## Fields

### `backingIterator`

**Type:** `java.util.Iterator<? extends F>`

## Constructors

### `<init>(java.util.Iterator<? extends F> backingIterator)`

**Parameters:**
- `backingIterator` (`java.util.Iterator<? extends F>`)

## Methods

### `transform(F from)`

**Returns:** `T`

**Parameters:**
- `from` (`F`)

### `hasNext()`

**Returns:** `boolean`

### `next()`

**Returns:** `T`

### `remove()`

**Returns:** `void`

