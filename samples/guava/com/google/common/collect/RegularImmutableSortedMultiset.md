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

### `<init>(Comparator<? super E> comparator)`

**Parameters:**
- `comparator` (`java.util.Comparator<? super E>`)

### `<init>(RegularImmutableSortedSet<E> elementSet, long[] cumulativeCounts, int offset, int length)`

**Parameters:**
- `elementSet` ([`com.google.common.collect.RegularImmutableSortedSet<E>`](./RegularImmutableSortedSet.md))
- `cumulativeCounts` (`long[]`)
- `offset` (`int`)
- `length` (`int`)

## Methods

### `getCount(int index)`

**Parameters:**
- `index` (`int`)

**Returns:** `int`

### `getEntry(int index)`

**Parameters:**
- `index` (`int`)

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

### `forEachEntry(ObjIntConsumer<? super E> action)`

**Parameters:**
- `action` (`java.util.function.ObjIntConsumer<? super E>`)

**Returns:** `void`

### `firstEntry()`

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

### `lastEntry()`

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

### `count(Object element)`

**Parameters:**
- `element` (`java.lang.Object`)

**Returns:** `int`

### `size()`

**Returns:** `int`

### `elementSet()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

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

### `getSubMultiset(int from, int to)`

**Parameters:**
- `from` (`int`)
- `to` (`int`)

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `isPartialView()`

**Returns:** `boolean`

### `writeReplace()`

**Returns:** `java.lang.Object`

