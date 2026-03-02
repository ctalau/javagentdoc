# Class: `EmptyContiguousSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.EmptyContiguousSet`

**Extends:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

## Type Parameters

- `C` extends `java.lang.Comparable`

## Description

## Constructors

### `<init>(DiscreteDomain<C> domain)`

**Parameters:**
- `domain` ([`com.google.common.collect.DiscreteDomain<C>`](./DiscreteDomain.md))

## Methods

### `first()`

**Returns:** `C`

### `last()`

**Returns:** `C`

### `size()`

**Returns:** `int`

### `intersection(ContiguousSet<C> other)`

**Parameters:**
- `other` ([`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md))

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

### `range()`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

### `range(BoundType lowerBoundType, BoundType upperBoundType)`

**Parameters:**
- `lowerBoundType` ([`com.google.common.collect.BoundType`](./BoundType.md))
- `upperBoundType` ([`com.google.common.collect.BoundType`](./BoundType.md))

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

### `headSetImpl(C toElement, boolean inclusive)`

**Parameters:**
- `toElement` (`C`)
- `inclusive` (`boolean`)

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

### `subSetImpl(C fromElement, boolean fromInclusive, C toElement, boolean toInclusive)`

**Parameters:**
- `fromElement` (`C`)
- `fromInclusive` (`boolean`)
- `toElement` (`C`)
- `toInclusive` (`boolean`)

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

### `tailSetImpl(C fromElement, boolean fromInclusive)`

**Parameters:**
- `fromElement` (`C`)
- `fromInclusive` (`boolean`)

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

### `contains(Object object)`

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `indexOf(Object target)`

**Parameters:**
- `target` (`java.lang.Object`)

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

### `equals(Object object)`

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `isHashCodeFast()`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject(ObjectInputStream stream)`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

**Returns:** `void`

### `createDescendingSet()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<C>`](./ImmutableSortedSet.md)

