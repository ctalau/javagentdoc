# Class: `UnmodifiableIterator`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.UnmodifiableIterator`

**Implements:** [`java.util.Iterator<E>`](../../../../java/util/Iterator.md)

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

An iterator that does not support {@link #remove}.

 <p>{@code UnmodifiableIterator} is used primarily in conjunction with implementations of {@link ImmutableCollection}, such as {@link ImmutableList}. You can, however, convert an existing
 iterator to an {@code UnmodifiableIterator} using {@link Iterators#unmodifiableIterator}.
@author Jared Levy
@since 2.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `remove()`

**Returns:** `void`

Guaranteed to throw an exception and leave the underlying data unmodified.
@throws UnsupportedOperationException always
@deprecated Unsupported operation.

