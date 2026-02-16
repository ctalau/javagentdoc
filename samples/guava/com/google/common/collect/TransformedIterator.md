# Class: `TransformedIterator`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.TransformedIterator`

**Implements:** [`java.util.Iterator<T>`](../../../../java/util/Iterator.md)

## Type Parameters

- `F` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

An iterator that transforms a backing iterator; for internal use. This avoids the object overhead
 of constructing a {@link com.google.common.base.Function Function} for internal methods.
@author Louis Wasserman

## Fields

### `backingIterator`

**Type:** [`java.util.Iterator<? extends F>`](../../../../java/util/Iterator.md)

## Constructors

### `<init>([`java.util.Iterator<? extends F>`](../../../../java/util/Iterator.md) backingIterator)`

## Methods

### `transform([`F`](F.md) from)`

**Returns:** [`T`](T.md)

### `hasNext()`

**Returns:** `boolean`

### `next()`

**Returns:** [`T`](T.md)

### `remove()`

**Returns:** `void`

