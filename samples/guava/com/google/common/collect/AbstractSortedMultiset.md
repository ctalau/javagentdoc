# Class: `AbstractSortedMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.AbstractSortedMultiset`

**Extends:** [`com.google.common.collect.AbstractMultiset<E>`](./AbstractMultiset.md)

**Implements:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

The #count and #size implementations all iterate across the set returned by
 Multiset#entrySet(), as do many methods acting on the set returned by #elementSet(). Override those methods for better performance.

## Fields

### `comparator`

**Type:** `java.util.Comparator<? super E>`

### `descendingMultiset`

**Type:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

## Constructors

### `<init>()`

### `<init>(Comparator<? super E> comparator)`

**Parameters:**
- `comparator` (`java.util.Comparator<? super E>`)

## Methods

### `elementSet()`

**Returns:** `java.util.NavigableSet<E>`

### `createElementSet()`

**Returns:** `java.util.NavigableSet<E>`

### `comparator()`

**Returns:** `java.util.Comparator<? super E>`

### `firstEntry()`

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

### `lastEntry()`

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

### `pollFirstEntry()`

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

### `pollLastEntry()`

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

### `subMultiset(E fromElement, BoundType fromBoundType, E toElement, BoundType toBoundType)`

**Parameters:**
- `fromElement` (`E`)
- `fromBoundType` ([`com.google.common.collect.BoundType`](./BoundType.md))
- `toElement` (`E`)
- `toBoundType` ([`com.google.common.collect.BoundType`](./BoundType.md))

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

### `descendingEntryIterator()`

**Returns:** `java.util.Iterator<com.google.common.collect.Multiset.Entry<E>>`

### `descendingIterator()`

**Returns:** `java.util.Iterator<E>`

### `descendingMultiset()`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

### `createDescendingMultiset()`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

