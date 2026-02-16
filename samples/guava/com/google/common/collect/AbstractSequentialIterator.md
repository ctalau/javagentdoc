# Class: `AbstractSequentialIterator`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.AbstractSequentialIterator`

**Extends:** [`com.google.common.collect.UnmodifiableIterator<T>`](./UnmodifiableIterator.md)

## Type Parameters

- `T` extends `java.lang.Object`

## Description

This class provides a skeletal implementation of the `Iterator` interface for sequences
 whose next element can always be derived from the previous element. Null elements are not
 supported, nor is the `remove()` method.

 <p>Example:

 <pre>`Iterator<Integer> powersOfTwo =
     new AbstractSequentialIterator<Integer>(1) {
       protected Integer computeNext(Integer previous) {
         return (previous == 1 << 30) ? null : previous * 2;
       `
     };
 }</pre>
**Author:** Chris Povirk
**Since:** 12.0 (in Guava as `AbstractLinkedIterator` since 8.0)

## Fields

### `nextOrNull`

**Type:** `T`

## Constructors

### `<init>(`T` firstOrNull)`

Creates a new iterator with the given first element, or, if `firstOrNull` is null,
 creates a new empty iterator.

## Methods

### `computeNext(`T` previous)`

**Returns:** `T`

Returns the element that follows `previous`, or returns `null` if no elements
 remain. This method is invoked during each call to `next()` in order to compute the
 result of a <i>future</i> call to `next()`.

### `hasNext()`

**Returns:** `boolean`

### `next()`

**Returns:** `T`

