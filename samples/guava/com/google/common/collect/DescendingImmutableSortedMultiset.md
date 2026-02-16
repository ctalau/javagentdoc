# Class: `DescendingImmutableSortedMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.DescendingImmutableSortedMultiset`

**Extends:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

A descending wrapper around an {@code ImmutableSortedMultiset}
@author Louis Wasserman

## Fields

### `forward`

**Type:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

## Constructors

### `<init>([`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md) forward)`

## Methods

### `count(`java.lang.Object` element)`

**Returns:** `int`

### `firstEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

### `lastEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

### `size()`

**Returns:** `int`

### `elementSet()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `getEntry(`int` index)`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

### `descendingMultiset()`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `headMultiset([`E`](E.md) upperBound, [`com.google.common.collect.BoundType`](./BoundType.md) boundType)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `tailMultiset([`E`](E.md) lowerBound, [`com.google.common.collect.BoundType`](./BoundType.md) boundType)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `isPartialView()`

**Returns:** `boolean`

### `writeReplace()`

**Returns:** `java.lang.Object`

