# Class: `RegularImmutableSortedSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.RegularImmutableSortedSet`

**Extends:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

TODO(jlevy): Consider separate class for a
 single-element sorted set.

## Fields

### `NATURAL_EMPTY_SET`

**Type:** [`com.google.common.collect.RegularImmutableSortedSet<java.lang.Comparable>`](./RegularImmutableSortedSet.md)

### `elements`

**Type:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

## Constructors

### `<init>(com.google.common.collect.ImmutableList<E> elements, java.util.Comparator<? super E> comparator)`

**Parameters:**
- `elements` ([`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md))
- `comparator` (`java.util.Comparator<? super E>`)

## Methods

### `internalArray()`

**Returns:** `java.lang.Object[]`

### `internalArrayStart()`

**Returns:** `int`

### `internalArrayEnd()`

**Returns:** `int`

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<E>`](./UnmodifiableIterator.md)

### `descendingIterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<E>`](./UnmodifiableIterator.md)

### `spliterator()`

**Returns:** `java.util.Spliterator<E>`

### `forEach(java.util.function.Consumer<? super E> action)`

**Returns:** `void`

**Parameters:**
- `action` (`java.util.function.Consumer<? super E>`)

### `size()`

**Returns:** `int`

### `contains(java.lang.Object o)`

**Returns:** `boolean`

**Parameters:**
- `o` (`java.lang.Object`)

### `containsAll(java.util.Collection<?> targets)`

**Returns:** `boolean`

**Parameters:**
- `targets` (`java.util.Collection<?>`)

### `unsafeBinarySearch(java.lang.Object key)`

**Returns:** `int`

**Parameters:**
- `key` (`java.lang.Object`)

### `isPartialView()`

**Returns:** `boolean`

### `copyIntoArray(java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[] dst, int offset)`

**Returns:** `int`

**Parameters:**
- `dst` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)
- `offset` (`int`)

### `equals(java.lang.Object object)`

**Returns:** `boolean`

**Parameters:**
- `object` (`java.lang.Object`)

### `first()`

**Returns:** `E`

### `last()`

**Returns:** `E`

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

### `headSetImpl(E toElement, boolean inclusive)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

**Parameters:**
- `toElement` (`E`)
- `inclusive` (`boolean`)

### `headIndex(E toElement, boolean inclusive)`

**Returns:** `int`

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

### `tailIndex(E fromElement, boolean inclusive)`

**Returns:** `int`

**Parameters:**
- `fromElement` (`E`)
- `inclusive` (`boolean`)

### `unsafeComparator()`

**Returns:** `java.util.Comparator<java.lang.Object>`

### `getSubSet(int newFromIndex, int newToIndex)`

**Returns:** [`com.google.common.collect.RegularImmutableSortedSet<E>`](./RegularImmutableSortedSet.md)

**Parameters:**
- `newFromIndex` (`int`)
- `newToIndex` (`int`)

### `indexOf(java.lang.Object target)`

**Returns:** `int`

**Parameters:**
- `target` (`java.lang.Object`)

### `createAsList()`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `createDescendingSet()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `writeReplace()`

**Returns:** `java.lang.Object`

