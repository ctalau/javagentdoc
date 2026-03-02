# Class: `DescendingImmutableSortedMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.DescendingImmutableSortedMultiset`

**Extends:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

## Fields

### `forward`

**Type:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

## Constructors

### `<init>(ImmutableSortedMultiset<E> forward)`

**Parameters:**
- `forward` ([`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md))

## Methods

### `count(Object element)`

**Parameters:**
- `element` (`java.lang.Object`)

**Returns:** `int`

### `firstEntry()`

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

### `lastEntry()`

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

### `size()`

**Returns:** `int`

### `elementSet()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `getEntry(int index)`

**Parameters:**
- `index` (`int`)

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

### `descendingMultiset()`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `headMultiset(E upperBound, BoundType boundType)`

**Parameters:**
- `upperBound` (`E`)
- `boundType` ([`com.google.common.collect.BoundType`](./BoundType.md))

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `tailMultiset(E lowerBound, BoundType boundType)`

**Parameters:**
- `lowerBound` (`E`)
- `boundType` ([`com.google.common.collect.BoundType`](./BoundType.md))

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `isPartialView()`

**Returns:** `boolean`

### `writeReplace()`

**Returns:** `java.lang.Object`

