# Class: `UnmodifiableSortedMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.UnmodifiableSortedMultiset`

**Extends:** [`com.google.common.collect.Multisets.UnmodifiableMultiset<E>`](Multisets/UnmodifiableMultiset.md)

**Implements:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Implementation of `Multisets.unmodifiableSortedMultiset(SortedMultiset)`, split out into
 its own file so it can be GWT emulated (to deal with the differing elementSet() types in GWT and
 non-GWT).
**Author:** Louis Wasserman

## Fields

### `descendingMultiset`

**Type:** [`com.google.common.collect.UnmodifiableSortedMultiset<E>`](./UnmodifiableSortedMultiset.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>([`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md) delegate)`

## Methods

### `delegate()`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

### `comparator()`

**Returns:** `java.util.Comparator<? super E>`

### `createElementSet()`

**Returns:** `java.util.NavigableSet<E>`

### `elementSet()`

**Returns:** `java.util.NavigableSet<E>`

### `descendingMultiset()`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

### `firstEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

### `lastEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

### `pollFirstEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

### `pollLastEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

### `headMultiset(`E` upperBound, [`com.google.common.collect.BoundType`](./BoundType.md) boundType)`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

### `subMultiset(`E` lowerBound, [`com.google.common.collect.BoundType`](./BoundType.md) lowerBoundType, `E` upperBound, [`com.google.common.collect.BoundType`](./BoundType.md) upperBoundType)`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

### `tailMultiset(`E` lowerBound, [`com.google.common.collect.BoundType`](./BoundType.md) boundType)`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

