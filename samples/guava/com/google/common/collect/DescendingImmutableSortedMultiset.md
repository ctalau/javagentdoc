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

### `<init>(com.google.common.collect.ImmutableSortedMultiset<E> forward)`

**Parameters:**
- `forward` ([`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md))

## Methods

### `count(java.lang.Object element)`

**Returns:** `int`

**Parameters:**
- `element` (`java.lang.Object`)

### `firstEntry()`

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

### `lastEntry()`

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

### `size()`

**Returns:** `int`

### `elementSet()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `getEntry(int index)`

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

**Parameters:**
- `index` (`int`)

### `descendingMultiset()`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `headMultiset(E upperBound, com.google.common.collect.BoundType boundType)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

**Parameters:**
- `upperBound` (`E`)
- `boundType` ([`com.google.common.collect.BoundType`](./BoundType.md))

### `tailMultiset(E lowerBound, com.google.common.collect.BoundType boundType)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

**Parameters:**
- `lowerBound` (`E`)
- `boundType` ([`com.google.common.collect.BoundType`](./BoundType.md))

### `isPartialView()`

**Returns:** `boolean`

### `writeReplace()`

**Returns:** `java.lang.Object`

