# Interface: `PeekingIterator`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.PeekingIterator`

**Extends:** [`java.util.Iterator<E>`](../../../../java/util/Iterator.md)

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

An iterator that supports a one-element lookahead while iterating.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/CollectionHelpersExplained#peekingiterator">{@code
 PeekingIterator}</a>.
@author Mick Killianey
@since 2.0

## Methods

### `peek()`

**Returns:** [`E`](E.md)

Returns the next element in the iteration, without advancing the iteration.

 <p>Calls to {@code peek()} should not change the state of the iteration, except that it
 <i>may</i> prevent removal of the most recent element via {@link #remove()}.
@throws NoSuchElementException if the iteration has no more elements according to {@link #hasNext()}

### `next()`

**Returns:** [`E`](E.md)

{@inheritDoc}

 <p>The objects returned by consecutive calls to {@link #peek()} then {@link #next()} are
 guaranteed to be equal to each other.

### `remove()`

**Returns:** `void`

{@inheritDoc}

 <p>Implementations may or may not support removal when a call to {@link #peek()} has occurred
 since the most recent call to {@link #next()}.
@throws IllegalStateException if there has been a call to {@link #peek()} since the most recent
     call to {@link #next()} and this implementation does not support this sequence of calls
     (optional)

