# Class: `ImmutableSortedAsList`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableSortedAsList`

**Extends:** [`com.google.common.collect.RegularImmutableAsList<E>`](./RegularImmutableAsList.md)

**Implements:** [`com.google.common.collect.SortedIterable<E>`](./SortedIterable.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

## Constructors

### `<init>(ImmutableSortedSet<E> backingSet, ImmutableList<E> backingList)`

**Parameters:**
- `backingSet` ([`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md))
- `backingList` ([`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md))

## Methods

### `delegateCollection()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `comparator()`

**Returns:** `java.util.Comparator<? super E>`

### `indexOf(Object target)`

**Parameters:**
- `target` (`java.lang.Object`)

**Returns:** `int`

### `lastIndexOf(Object target)`

**Parameters:**
- `target` (`java.lang.Object`)

**Returns:** `int`

### `contains(Object target)`

**Parameters:**
- `target` (`java.lang.Object`)

**Returns:** `boolean`

### `subListUnchecked(int fromIndex, int toIndex)`

**Parameters:**
- `fromIndex` (`int`)
- `toIndex` (`int`)

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `spliterator()`

**Returns:** `java.util.Spliterator<E>`

### `writeReplace()`

**Returns:** `java.lang.Object`

