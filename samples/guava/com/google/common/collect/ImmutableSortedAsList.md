# Class: `ImmutableSortedAsList`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableSortedAsList`

**Extends:** [`com.google.common.collect.RegularImmutableAsList<E>`](./RegularImmutableAsList.md)

**Implements:** [`com.google.common.collect.SortedIterable<E>`](./SortedIterable.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

## Constructors

### `<init>(com.google.common.collect.ImmutableSortedSet<E> backingSet, com.google.common.collect.ImmutableList<E> backingList)`

**Parameters:**
- `backingSet` ([`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md))
- `backingList` ([`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md))

## Methods

### `delegateCollection()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `comparator()`

**Returns:** `java.util.Comparator<? super E>`

### `indexOf(java.lang.Object target)`

**Returns:** `int`

**Parameters:**
- `target` (`java.lang.Object`)

### `lastIndexOf(java.lang.Object target)`

**Returns:** `int`

**Parameters:**
- `target` (`java.lang.Object`)

### `contains(java.lang.Object target)`

**Returns:** `boolean`

**Parameters:**
- `target` (`java.lang.Object`)

### `subListUnchecked(int fromIndex, int toIndex)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

**Parameters:**
- `fromIndex` (`int`)
- `toIndex` (`int`)

### `spliterator()`

**Returns:** `java.util.Spliterator<E>`

### `writeReplace()`

**Returns:** `java.lang.Object`

