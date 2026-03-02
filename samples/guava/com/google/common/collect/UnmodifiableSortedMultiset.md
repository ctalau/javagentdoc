# Class: `UnmodifiableSortedMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.UnmodifiableSortedMultiset`

**Extends:** `com.google.common.collect.Multisets.UnmodifiableMultiset<E>`

**Implements:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

## Fields

### `descendingMultiset`

**Type:** [`com.google.common.collect.UnmodifiableSortedMultiset<E>`](./UnmodifiableSortedMultiset.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(SortedMultiset<E> delegate)`

**Parameters:**
- `delegate` ([`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md))

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

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

### `lastEntry()`

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

### `pollFirstEntry()`

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

### `pollLastEntry()`

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

### `headMultiset(E upperBound, BoundType boundType)`

**Parameters:**
- `upperBound` (`E`)
- `boundType` ([`com.google.common.collect.BoundType`](./BoundType.md))

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

### `subMultiset(E lowerBound, BoundType lowerBoundType, E upperBound, BoundType upperBoundType)`

**Parameters:**
- `lowerBound` (`E`)
- `lowerBoundType` ([`com.google.common.collect.BoundType`](./BoundType.md))
- `upperBound` (`E`)
- `upperBoundType` ([`com.google.common.collect.BoundType`](./BoundType.md))

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

### `tailMultiset(E lowerBound, BoundType boundType)`

**Parameters:**
- `lowerBound` (`E`)
- `boundType` ([`com.google.common.collect.BoundType`](./BoundType.md))

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

