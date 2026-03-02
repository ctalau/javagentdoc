# Class: `RegularImmutableSortedMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.RegularImmutableSortedMultiset`

**Extends:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

## Fields

### `ZERO_CUMULATIVE_COUNTS`

**Type:** `long[]`

### `NATURAL_EMPTY_MULTISET`

**Type:** [`com.google.common.collect.ImmutableSortedMultiset<java.lang.Comparable>`](./ImmutableSortedMultiset.md)

### `elementSet`

**Type:** [`com.google.common.collect.RegularImmutableSortedSet<E>`](./RegularImmutableSortedSet.md)

### `cumulativeCounts`

**Type:** `long[]`

### `offset`

**Type:** `int`

### `length`

**Type:** `int`

## Constructors

### `<init>(java.util.Comparator<? super E> comparator)`

**Parameters:**
- `comparator` (`java.util.Comparator<? super E>`)

### `<init>(com.google.common.collect.RegularImmutableSortedSet<E> elementSet, long[] cumulativeCounts, int offset, int length)`

**Parameters:**
- `elementSet` ([`com.google.common.collect.RegularImmutableSortedSet<E>`](./RegularImmutableSortedSet.md))
- `cumulativeCounts` (`long[]`)
- `offset` (`int`)
- `length` (`int`)

## Methods

### `getCount(int index)`

**Returns:** `int`

**Parameters:**
- `index` (`int`)

### `getEntry(int index)`

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

**Parameters:**
- `index` (`int`)

### `forEachEntry(java.util.function.ObjIntConsumer<? super E> action)`

**Returns:** `void`

**Parameters:**
- `action` (`java.util.function.ObjIntConsumer<? super E>`)

### `firstEntry()`

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

### `lastEntry()`

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

### `count(java.lang.Object element)`

**Returns:** `int`

**Parameters:**
- `element` (`java.lang.Object`)

### `size()`

**Returns:** `int`

### `elementSet()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

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

### `getSubMultiset(int from, int to)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

**Parameters:**
- `from` (`int`)
- `to` (`int`)

### `isPartialView()`

**Returns:** `boolean`

### `writeReplace()`

**Returns:** `java.lang.Object`

