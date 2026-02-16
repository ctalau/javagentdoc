# Class: `DescendingMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.DescendingMultiset`

**Extends:** [`com.google.common.collect.ForwardingMultiset<E>`](./ForwardingMultiset.md)

**Implements:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A skeleton implementation of a descending multiset. Only needs `forwardMultiset()` and
 `entryIterator()`.
**Author:** Louis Wasserman

## Fields

### `comparator`

**Type:** `java.util.Comparator<? super E>`

### `elementSet`

**Type:** `java.util.NavigableSet<E>`

### `entrySet`

**Type:** `java.util.Set<com.google.common.collect.Multiset.Entry<E>>`

## Constructors

### `<init>()`

## Methods

### `forwardMultiset()`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

### `comparator()`

**Returns:** `java.util.Comparator<? super E>`

### `elementSet()`

**Returns:** `java.util.NavigableSet<E>`

### `pollFirstEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

### `pollLastEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

### `headMultiset(`E` toElement, [`com.google.common.collect.BoundType`](./BoundType.md) boundType)`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

### `subMultiset(`E` fromElement, [`com.google.common.collect.BoundType`](./BoundType.md) fromBoundType, `E` toElement, [`com.google.common.collect.BoundType`](./BoundType.md) toBoundType)`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

### `tailMultiset(`E` fromElement, [`com.google.common.collect.BoundType`](./BoundType.md) boundType)`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

### `delegate()`

**Returns:** [`com.google.common.collect.Multiset<E>`](./Multiset.md)

### `descendingMultiset()`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

### `firstEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

### `lastEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

### `entryIterator()`

**Returns:** `java.util.Iterator<com.google.common.collect.Multiset.Entry<E>>`

### `entrySet()`

**Returns:** `java.util.Set<com.google.common.collect.Multiset.Entry<E>>`

### `createEntrySet()`

**Returns:** `java.util.Set<com.google.common.collect.Multiset.Entry<E>>`

### `iterator()`

**Returns:** `java.util.Iterator<E>`

### `toArray()`

**Returns:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`

### `toArray(`T[]` array)`

**Returns:** `T[]`

### `toString()`

**Returns:** `java.lang.String`

