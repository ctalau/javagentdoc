# Class: `UnmodifiableListIterator`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.UnmodifiableListIterator`

**Extends:** [`com.google.common.collect.UnmodifiableIterator<E>`](./UnmodifiableIterator.md)

**Implements:** `java.util.ListIterator<E>`

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A list iterator that does not support `remove`, `add`, or `set`.
**Since:** 7.0
**Author:** Louis Wasserman

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `add(`E` e)`

**Returns:** `void`

Guaranteed to throw an exception and leave the underlying data unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `set(`E` e)`

**Returns:** `void`

Guaranteed to throw an exception and leave the underlying data unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

