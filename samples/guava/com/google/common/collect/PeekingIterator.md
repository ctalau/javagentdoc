# Interface: `PeekingIterator`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.PeekingIterator`

**Extends:** `java.util.Iterator<E>`

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

See the Guava User Guide article on [
 PeekingIterator](https://github.com/google/guava/wiki/CollectionHelpersExplained#peekingiterator).

## Methods

### `peek()`

**Returns:** `E`

Calls to peek() should not change the state of the iteration, except that it
 *may* prevent removal of the most recent element via #remove().

### `next()`

**Returns:** `E`

The objects returned by consecutive calls to #peek() then #next() are
 guaranteed to be equal to each other.

### `remove()`

**Returns:** `void`

Implementations may or may not support removal when a call to #peek() has occurred
 since the most recent call to #next().

