# Class: `DescendingImmutableSortedSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.DescendingImmutableSortedSet`

**Extends:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

## Fields

### `forward`

**Type:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

## Constructors

### `<init>(ImmutableSortedSet<E> forward)`

**Parameters:**
- `forward` ([`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md))

## Methods

### `contains(Object object)`

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `size()`

**Returns:** `int`

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<E>`](./UnmodifiableIterator.md)

### `headSetImpl(E toElement, boolean inclusive)`

**Parameters:**
- `toElement` (`E`)
- `inclusive` (`boolean`)

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `subSetImpl(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)`

**Parameters:**
- `fromElement` (`E`)
- `fromInclusive` (`boolean`)
- `toElement` (`E`)
- `toInclusive` (`boolean`)

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `tailSetImpl(E fromElement, boolean inclusive)`

**Parameters:**
- `fromElement` (`E`)
- `inclusive` (`boolean`)

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `descendingSet()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `descendingIterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<E>`](./UnmodifiableIterator.md)

### `createDescendingSet()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `lower(E element)`

**Parameters:**
- `element` (`E`)

**Returns:** `E`

### `floor(E element)`

**Parameters:**
- `element` (`E`)

**Returns:** `E`

### `ceiling(E element)`

**Parameters:**
- `element` (`E`)

**Returns:** `E`

### `higher(E element)`

**Parameters:**
- `element` (`E`)

**Returns:** `E`

### `indexOf(Object target)`

**Parameters:**
- `target` (`java.lang.Object`)

**Returns:** `int`

### `isPartialView()`

**Returns:** `boolean`

### `writeReplace()`

**Returns:** `java.lang.Object`

