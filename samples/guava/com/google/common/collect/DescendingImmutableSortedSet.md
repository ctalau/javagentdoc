# Class: `DescendingImmutableSortedSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.DescendingImmutableSortedSet`

**Extends:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

Skeletal implementation of {@link ImmutableSortedSet#descendingSet()}.
@author Louis Wasserman

## Fields

### `forward`

**Type:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

## Constructors

### `<init>([`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md) forward)`

## Methods

### `contains(`java.lang.Object` object)`

**Returns:** `boolean`

### `size()`

**Returns:** `int`

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<E>`](./UnmodifiableIterator.md)

### `headSetImpl([`E`](E.md) toElement, `boolean` inclusive)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `subSetImpl([`E`](E.md) fromElement, `boolean` fromInclusive, [`E`](E.md) toElement, `boolean` toInclusive)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `tailSetImpl([`E`](E.md) fromElement, `boolean` inclusive)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `descendingSet()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `descendingIterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<E>`](./UnmodifiableIterator.md)

### `createDescendingSet()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `lower([`E`](E.md) element)`

**Returns:** [`E`](E.md)

### `floor([`E`](E.md) element)`

**Returns:** [`E`](E.md)

### `ceiling([`E`](E.md) element)`

**Returns:** [`E`](E.md)

### `higher([`E`](E.md) element)`

**Returns:** [`E`](E.md)

### `indexOf(`java.lang.Object` target)`

**Returns:** `int`

### `isPartialView()`

**Returns:** `boolean`

### `writeReplace()`

**Returns:** `java.lang.Object`

