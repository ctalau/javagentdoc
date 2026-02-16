# Interface: `PeekingIterator`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.PeekingIterator`

**Extends:** `java.util.Iterator<E>`

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

An iterator that supports a one-element lookahead while iterating.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/CollectionHelpersExplained#peekingiterator">`PeekingIterator`</a>.
**Author:** Mick Killianey
**Since:** 2.0

## Methods

### `peek()`

**Returns:** `E`

Returns the next element in the iteration, without advancing the iteration.

 <p>Calls to `peek()` should not change the state of the iteration, except that it
 <i>may</i> prevent removal of the most recent element via `remove()`.
@throws NoSuchElementException if the iteration has no more elements according to `hasNext()`

### `next()`

**Returns:** `E`

{@inheritDoc}

 <p>The objects returned by consecutive calls to `peek()` then `next()` are
 guaranteed to be equal to each other.

### `remove()`

**Returns:** `void`

{@inheritDoc}

 <p>Implementations may or may not support removal when a call to `peek()` has occurred
 since the most recent call to `next()`.
@throws IllegalStateException if there has been a call to `peek()` since the most recent
     call to `next()` and this implementation does not support this sequence of calls
     (optional)

