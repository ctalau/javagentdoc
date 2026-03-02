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

### `<init>(com.google.common.collect.ImmutableSortedSet<E> forward)`

**Parameters:**
- `forward` ([`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md))

## Methods

### `contains(java.lang.Object object)`

**Returns:** `boolean`

**Parameters:**
- `object` (`java.lang.Object`)

### `size()`

**Returns:** `int`

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<E>`](./UnmodifiableIterator.md)

### `headSetImpl(E toElement, boolean inclusive)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

**Parameters:**
- `toElement` (`E`)
- `inclusive` (`boolean`)

### `subSetImpl(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

**Parameters:**
- `fromElement` (`E`)
- `fromInclusive` (`boolean`)
- `toElement` (`E`)
- `toInclusive` (`boolean`)

### `tailSetImpl(E fromElement, boolean inclusive)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

**Parameters:**
- `fromElement` (`E`)
- `inclusive` (`boolean`)

### `descendingSet()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `descendingIterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<E>`](./UnmodifiableIterator.md)

### `createDescendingSet()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `lower(E element)`

**Returns:** `E`

**Parameters:**
- `element` (`E`)

### `floor(E element)`

**Returns:** `E`

**Parameters:**
- `element` (`E`)

### `ceiling(E element)`

**Returns:** `E`

**Parameters:**
- `element` (`E`)

### `higher(E element)`

**Returns:** `E`

**Parameters:**
- `element` (`E`)

### `indexOf(java.lang.Object target)`

**Returns:** `int`

**Parameters:**
- `target` (`java.lang.Object`)

### `isPartialView()`

**Returns:** `boolean`

### `writeReplace()`

**Returns:** `java.lang.Object`

