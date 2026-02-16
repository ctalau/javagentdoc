# Class: `RegularImmutableSortedSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.RegularImmutableSortedSet`

**Extends:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

An immutable sorted set with one or more elements. TODO(jlevy): Consider separate class for a
 single-element sorted set.
@author Jared Levy
@author Louis Wasserman

## Fields

### `NATURAL_EMPTY_SET`

**Type:** [`com.google.common.collect.RegularImmutableSortedSet<java.lang.Comparable>`](./RegularImmutableSortedSet.md)

### `elements`

**Type:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

## Constructors

### `<init>([`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md) elements, [`java.util.Comparator<? super E>`](../../../../java/util/Comparator.md) comparator)`

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

**Returns:** [`java.util.Spliterator<E>`](../../../../java/util/Spliterator.md)

### `forEach([`java.util.function.Consumer<? super E>`](../../../../java/util/function/Consumer.md) action)`

**Returns:** `void`

### `size()`

**Returns:** `int`

### `contains(`java.lang.Object` o)`

**Returns:** `boolean`

### `containsAll([`java.util.Collection<?>`](../../../../java/util/Collection.md) targets)`

**Returns:** `boolean`

### `unsafeBinarySearch(`java.lang.Object` key)`

**Returns:** `int`

### `isPartialView()`

**Returns:** `boolean`

### `copyIntoArray(`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]` dst, `int` offset)`

**Returns:** `int`

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

### `first()`

**Returns:** [`E`](E.md)

### `last()`

**Returns:** [`E`](E.md)

### `lower([`E`](E.md) element)`

**Returns:** [`E`](E.md)

### `floor([`E`](E.md) element)`

**Returns:** [`E`](E.md)

### `ceiling([`E`](E.md) element)`

**Returns:** [`E`](E.md)

### `higher([`E`](E.md) element)`

**Returns:** [`E`](E.md)

### `headSetImpl([`E`](E.md) toElement, `boolean` inclusive)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `headIndex([`E`](E.md) toElement, `boolean` inclusive)`

**Returns:** `int`

### `subSetImpl([`E`](E.md) fromElement, `boolean` fromInclusive, [`E`](E.md) toElement, `boolean` toInclusive)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `tailSetImpl([`E`](E.md) fromElement, `boolean` inclusive)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `tailIndex([`E`](E.md) fromElement, `boolean` inclusive)`

**Returns:** `int`

### `unsafeComparator()`

**Returns:** [`java.util.Comparator<java.lang.Object>`](../../../../java/util/Comparator.md)

### `getSubSet(`int` newFromIndex, `int` newToIndex)`

**Returns:** [`com.google.common.collect.RegularImmutableSortedSet<E>`](./RegularImmutableSortedSet.md)

### `indexOf(`java.lang.Object` target)`

**Returns:** `int`

### `createAsList()`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `createDescendingSet()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `writeReplace()`

**Returns:** `java.lang.Object`

