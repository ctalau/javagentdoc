# Interface: `SortedIterable`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.SortedIterable`

**Extends:** `java.lang.Iterable<T>`

## Type Parameters

- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

An {@code Iterable} whose elements are sorted relative to a {@code Comparator}, typically
 provided at creation time.
@author Louis Wasserman

## Methods

### `comparator()`

**Returns:** [`java.util.Comparator<? super T>`](../../../../java/util/Comparator.md)

Returns the {@code Comparator} by which the elements of this iterable are ordered, or {@code
 Ordering.natural()} if the elements are ordered by their natural ordering.

### `iterator()`

**Returns:** [`java.util.Iterator<T>`](../../../../java/util/Iterator.md)

Returns an iterator over elements of type {@code T}. The elements are returned in nondecreasing
 order according to the associated {@link #comparator}.

