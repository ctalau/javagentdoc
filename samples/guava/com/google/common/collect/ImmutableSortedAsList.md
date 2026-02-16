# Class: `ImmutableSortedAsList`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableSortedAsList`

**Extends:** [`com.google.common.collect.RegularImmutableAsList<E>`](./RegularImmutableAsList.md)

**Implements:** [`com.google.common.collect.SortedIterable<E>`](./SortedIterable.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

List returned by `ImmutableSortedSet.asList()` when the set isn't empty.
**Author:** Jared Levy
**Author:** Louis Wasserman

## Constructors

### `<init>([`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md) backingSet, [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md) backingList)`

## Methods

### `delegateCollection()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `comparator()`

**Returns:** `java.util.Comparator<? super E>`

### `indexOf(`java.lang.Object` target)`

**Returns:** `int`

### `lastIndexOf(`java.lang.Object` target)`

**Returns:** `int`

### `contains(`java.lang.Object` target)`

**Returns:** `boolean`

### `subListUnchecked(`int` fromIndex, `int` toIndex)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `spliterator()`

**Returns:** `java.util.Spliterator<E>`

### `writeReplace()`

**Returns:** `java.lang.Object`

