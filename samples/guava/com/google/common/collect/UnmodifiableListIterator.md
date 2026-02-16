# Class: `UnmodifiableListIterator`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.UnmodifiableListIterator`

**Extends:** [`com.google.common.collect.UnmodifiableIterator<E>`](./UnmodifiableIterator.md)

**Implements:** [`java.util.ListIterator<E>`](../../../../java/util/ListIterator.md)

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A list iterator that does not support {@link #remove}, {@link #add}, or {@link #set}.
@since 7.0
@author Louis Wasserman

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `add([`E`](E.md) e)`

**Returns:** `void`

Guaranteed to throw an exception and leave the underlying data unmodified.
@throws UnsupportedOperationException always
@deprecated Unsupported operation.

### `set([`E`](E.md) e)`

**Returns:** `void`

Guaranteed to throw an exception and leave the underlying data unmodified.
@throws UnsupportedOperationException always
@deprecated Unsupported operation.

