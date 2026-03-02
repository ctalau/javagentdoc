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

### `<init>(ImmutableList<E> elements, Comparator<? super E> comparator)`

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

### `forEach(Consumer<? super E> action)`

**Parameters:**
- `action` (`java.util.function.Consumer<? super E>`)

**Returns:** `void`

### `size()`

**Returns:** `int`

### `contains(Object o)`

**Parameters:**
- `o` (`java.lang.Object`)

**Returns:** `boolean`

### `containsAll(Collection<?> targets)`

**Parameters:**
- `targets` (`java.util.Collection<?>`)

**Returns:** `boolean`

### `unsafeBinarySearch(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `int`

### `isPartialView()`

**Returns:** `boolean`

### `copyIntoArray(lang@Nullable Object[] dst, int offset)`

**Parameters:**
- `dst` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)
- `offset` (`int`)

**Returns:** `int`

### `equals(Object object)`

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `first()`

**Returns:** `E`

### `last()`

**Returns:** `E`

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

### `headSetImpl(E toElement, boolean inclusive)`

**Parameters:**
- `toElement` (`E`)
- `inclusive` (`boolean`)

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `headIndex(E toElement, boolean inclusive)`

**Parameters:**
- `toElement` (`E`)
- `inclusive` (`boolean`)

**Returns:** `int`

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

### `tailIndex(E fromElement, boolean inclusive)`

**Parameters:**
- `fromElement` (`E`)
- `inclusive` (`boolean`)

**Returns:** `int`

### `unsafeComparator()`

**Returns:** `java.util.Comparator<java.lang.Object>`

### `getSubSet(int newFromIndex, int newToIndex)`

**Parameters:**
- `newFromIndex` (`int`)
- `newToIndex` (`int`)

**Returns:** [`com.google.common.collect.RegularImmutableSortedSet<E>`](./RegularImmutableSortedSet.md)

### `indexOf(Object target)`

**Parameters:**
- `target` (`java.lang.Object`)

**Returns:** `int`

### `createAsList()`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `createDescendingSet()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `writeReplace()`

**Returns:** `java.lang.Object`

