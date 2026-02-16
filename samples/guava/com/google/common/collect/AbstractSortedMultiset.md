# Class: `AbstractSortedMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.AbstractSortedMultiset`

**Extends:** [`com.google.common.collect.AbstractMultiset<E>`](./AbstractMultiset.md)

**Implements:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

This class provides a skeletal implementation of the `SortedMultiset` interface.

 <p>The `count` and `size` implementations all iterate across the set returned by
 `Multiset.entrySet()`, as do many methods acting on the set returned by `elementSet()`. Override those methods for better performance.
**Author:** Louis Wasserman

## Fields

### `comparator`

**Type:** `java.util.Comparator<? super E>`

### `descendingMultiset`

**Type:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

## Constructors

### `<init>()`

### `<init>(`java.util.Comparator<? super E>` comparator)`

## Methods

### `elementSet()`

**Returns:** `java.util.NavigableSet<E>`

### `createElementSet()`

**Returns:** `java.util.NavigableSet<E>`

### `comparator()`

**Returns:** `java.util.Comparator<? super E>`

### `firstEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

### `lastEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

### `pollFirstEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

### `pollLastEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

### `subMultiset(`E` fromElement, [`com.google.common.collect.BoundType`](./BoundType.md) fromBoundType, `E` toElement, [`com.google.common.collect.BoundType`](./BoundType.md) toBoundType)`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

### `descendingEntryIterator()`

**Returns:** `java.util.Iterator<com.google.common.collect.Multiset.Entry<E>>`

### `descendingIterator()`

**Returns:** `java.util.Iterator<E>`

### `descendingMultiset()`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

### `createDescendingMultiset()`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

