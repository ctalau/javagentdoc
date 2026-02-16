# Class: `RegularImmutableSortedMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.RegularImmutableSortedMultiset`

**Extends:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

An immutable sorted multiset with one or more distinct elements.
@author Louis Wasserman

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

### `<init>([`java.util.Comparator<? super E>`](../../../../java/util/Comparator.md) comparator)`

### `<init>([`com.google.common.collect.RegularImmutableSortedSet<E>`](./RegularImmutableSortedSet.md) elementSet, `long[]` cumulativeCounts, `int` offset, `int` length)`

## Methods

### `getCount(`int` index)`

**Returns:** `int`

### `getEntry(`int` index)`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

### `forEachEntry([`java.util.function.ObjIntConsumer<? super E>`](../../../../java/util/function/ObjIntConsumer.md) action)`

**Returns:** `void`

### `firstEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

### `lastEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

### `count(`java.lang.Object` element)`

**Returns:** `int`

### `size()`

**Returns:** `int`

### `elementSet()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `headMultiset([`E`](E.md) upperBound, [`com.google.common.collect.BoundType`](./BoundType.md) boundType)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `tailMultiset([`E`](E.md) lowerBound, [`com.google.common.collect.BoundType`](./BoundType.md) boundType)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `getSubMultiset(`int` from, `int` to)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `isPartialView()`

**Returns:** `boolean`

### `writeReplace()`

**Returns:** `java.lang.Object`

