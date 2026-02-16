# Class: `AbstractSequentialIterator`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.AbstractSequentialIterator`

**Extends:** [`com.google.common.collect.UnmodifiableIterator<T>`](./UnmodifiableIterator.md)

## Type Parameters

- `T` extends `java.lang.Object`

## Description

This class provides a skeletal implementation of the {@code Iterator} interface for sequences
 whose next element can always be derived from the previous element. Null elements are not
 supported, nor is the {@link #remove()} method.

 <p>Example:

 <pre>{@code
 Iterator<Integer> powersOfTwo =
     new AbstractSequentialIterator<Integer>(1) {
       protected Integer computeNext(Integer previous) {
         return (previous == 1 << 30) ? null : previous * 2;
       }
     };
 }</pre>
@author Chris Povirk
@since 12.0 (in Guava as {@code AbstractLinkedIterator} since 8.0)

## Fields

### `nextOrNull`

**Type:** [`T`](T.md)

## Constructors

### `<init>([`T`](T.md) firstOrNull)`

Creates a new iterator with the given first element, or, if {@code firstOrNull} is null,
 creates a new empty iterator.

## Methods

### `computeNext([`T`](T.md) previous)`

**Returns:** [`T`](T.md)

Returns the element that follows {@code previous}, or returns {@code null} if no elements
 remain. This method is invoked during each call to {@link #next()} in order to compute the
 result of a <i>future</i> call to {@code next()}.

### `hasNext()`

**Returns:** `boolean`

### `next()`

**Returns:** [`T`](T.md)

