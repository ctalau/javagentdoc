# Class: `UnmodifiableIterator`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.UnmodifiableIterator`

**Implements:** `java.util.Iterator<E>`

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

An iterator that does not support `remove`.

 <p>`UnmodifiableIterator` is used primarily in conjunction with implementations of `ImmutableCollection`, such as `ImmutableList`. You can, however, convert an existing
 iterator to an `UnmodifiableIterator` using `Iterators.unmodifiableIterator`.
**Author:** Jared Levy
**Since:** 2.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `remove()`

**Returns:** `void`

Guaranteed to throw an exception and leave the underlying data unmodified.
@throws UnsupportedOperationException always
**Deprecated:** Unsupported operation.

