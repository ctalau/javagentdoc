# Interface: `SortedIterable`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.SortedIterable`

**Extends:** `java.lang.Iterable<T>`

## Type Parameters

- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

An `Iterable` whose elements are sorted relative to a `Comparator`, typically
 provided at creation time.
**Author:** Louis Wasserman

## Methods

### `comparator()`

**Returns:** `java.util.Comparator<? super T>`

Returns the `Comparator` by which the elements of this iterable are ordered, or `Ordering.natural()` if the elements are ordered by their natural ordering.

### `iterator()`

**Returns:** `java.util.Iterator<T>`

Returns an iterator over elements of type `T`. The elements are returned in nondecreasing
 order according to the associated `comparator`.

