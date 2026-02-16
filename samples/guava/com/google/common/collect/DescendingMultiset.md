# Class: `DescendingMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.DescendingMultiset`

**Extends:** [`com.google.common.collect.ForwardingMultiset<E>`](./ForwardingMultiset.md)

**Implements:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A skeleton implementation of a descending multiset. Only needs {@code forwardMultiset()} and
 {@code entryIterator()}.
@author Louis Wasserman

## Fields

### `comparator`

**Type:** [`java.util.Comparator<? super E>`](../../../../java/util/Comparator.md)

### `elementSet`

**Type:** [`java.util.NavigableSet<E>`](../../../../java/util/NavigableSet.md)

### `entrySet`

**Type:** [`java.util.Set<com.google.common.collect.Multiset.Entry<E>>`](../../../../java/util/Set>.md)

## Constructors

### `<init>()`

## Methods

### `forwardMultiset()`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

### `comparator()`

**Returns:** [`java.util.Comparator<? super E>`](../../../../java/util/Comparator.md)

### `elementSet()`

**Returns:** [`java.util.NavigableSet<E>`](../../../../java/util/NavigableSet.md)

### `pollFirstEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

### `pollLastEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

### `headMultiset([`E`](E.md) toElement, [`com.google.common.collect.BoundType`](./BoundType.md) boundType)`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

### `subMultiset([`E`](E.md) fromElement, [`com.google.common.collect.BoundType`](./BoundType.md) fromBoundType, [`E`](E.md) toElement, [`com.google.common.collect.BoundType`](./BoundType.md) toBoundType)`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

### `tailMultiset([`E`](E.md) fromElement, [`com.google.common.collect.BoundType`](./BoundType.md) boundType)`

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

**Returns:** [`java.util.Iterator<com.google.common.collect.Multiset.Entry<E>>`](../../../../java/util/Iterator>.md)

### `entrySet()`

**Returns:** [`java.util.Set<com.google.common.collect.Multiset.Entry<E>>`](../../../../java/util/Set>.md)

### `createEntrySet()`

**Returns:** [`java.util.Set<com.google.common.collect.Multiset.Entry<E>>`](../../../../java/util/Set>.md)

### `iterator()`

**Returns:** [`java.util.Iterator<E>`](../../../../java/util/Iterator.md)

### `toArray()`

**Returns:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`

### `toArray([`T[]`](T.md) array)`

**Returns:** [`T[]`](T.md)

### `toString()`

**Returns:** `java.lang.String`

