# Class: `EmptyContiguousSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.EmptyContiguousSet`

**Extends:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

## Type Parameters

- `C` extends `java.lang.Comparable`

## Description

An empty contiguous set.
**Author:** Gregory Kick

## Constructors

### `<init>([`com.google.common.collect.DiscreteDomain<C>`](./DiscreteDomain.md) domain)`

## Methods

### `first()`

**Returns:** `C`

### `last()`

**Returns:** `C`

### `size()`

**Returns:** `int`

### `intersection([`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md) other)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

### `range()`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

### `range([`com.google.common.collect.BoundType`](./BoundType.md) lowerBoundType, [`com.google.common.collect.BoundType`](./BoundType.md) upperBoundType)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

### `headSetImpl(`C` toElement, `boolean` inclusive)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

### `subSetImpl(`C` fromElement, `boolean` fromInclusive, `C` toElement, `boolean` toInclusive)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

### `tailSetImpl(`C` fromElement, `boolean` fromInclusive)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

### `contains(`java.lang.Object` object)`

**Returns:** `boolean`

### `indexOf(`java.lang.Object` target)`

**Returns:** `int`

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<C>`](./UnmodifiableIterator.md)

### `descendingIterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<C>`](./UnmodifiableIterator.md)

### `isPartialView()`

**Returns:** `boolean`

### `isEmpty()`

**Returns:** `boolean`

### `asList()`

**Returns:** [`com.google.common.collect.ImmutableList<C>`](./ImmutableList.md)

### `toString()`

**Returns:** `java.lang.String`

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

### `isHashCodeFast()`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject(`java.io.ObjectInputStream` stream)`

**Returns:** `void`

### `createDescendingSet()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<C>`](./ImmutableSortedSet.md)

