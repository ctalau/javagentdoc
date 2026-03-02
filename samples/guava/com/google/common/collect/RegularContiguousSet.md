# Class: `RegularContiguousSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.RegularContiguousSet`

**Extends:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

## Type Parameters

- `C` extends `java.lang.Comparable`

## Description

## Fields

### `range`

**Type:** [`com.google.common.collect.Range<C>`](./Range.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(com.google.common.collect.Range<C> range, com.google.common.collect.DiscreteDomain<C> domain)`

**Parameters:**
- `range` ([`com.google.common.collect.Range<C>`](./Range.md))
- `domain` ([`com.google.common.collect.DiscreteDomain<C>`](./DiscreteDomain.md))

## Methods

### `intersectionInCurrentDomain(com.google.common.collect.Range<C> other)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

**Parameters:**
- `other` ([`com.google.common.collect.Range<C>`](./Range.md))

### `headSetImpl(C toElement, boolean inclusive)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

**Parameters:**
- `toElement` (`C`)
- `inclusive` (`boolean`)

### `subSetImpl(C fromElement, boolean fromInclusive, C toElement, boolean toInclusive)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

**Parameters:**
- `fromElement` (`C`)
- `fromInclusive` (`boolean`)
- `toElement` (`C`)
- `toInclusive` (`boolean`)

### `tailSetImpl(C fromElement, boolean inclusive)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

**Parameters:**
- `fromElement` (`C`)
- `inclusive` (`boolean`)

### `indexOf(java.lang.Object target)`

**Returns:** `int`

**Parameters:**
- `target` (`java.lang.Object`)

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<C>`](./UnmodifiableIterator.md)

### `descendingIterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<C>`](./UnmodifiableIterator.md)

### `equalsOrThrow(java.lang.Comparable<?> left, java.lang.Comparable<?> right)`

**Returns:** `boolean`

**Parameters:**
- `left` (`java.lang.Comparable<?>`)
- `right` (`java.lang.Comparable<?>`)

### `isPartialView()`

**Returns:** `boolean`

### `first()`

**Returns:** `C`

### `last()`

**Returns:** `C`

### `createAsList()`

**Returns:** [`com.google.common.collect.ImmutableList<C>`](./ImmutableList.md)

### `size()`

**Returns:** `int`

### `contains(java.lang.Object object)`

**Returns:** `boolean`

**Parameters:**
- `object` (`java.lang.Object`)

### `containsAll(java.util.Collection<?> targets)`

**Returns:** `boolean`

**Parameters:**
- `targets` (`java.util.Collection<?>`)

### `isEmpty()`

**Returns:** `boolean`

### `intersection(com.google.common.collect.ContiguousSet<C> other)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

**Parameters:**
- `other` ([`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md))

### `range()`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

### `range(com.google.common.collect.BoundType lowerBoundType, com.google.common.collect.BoundType upperBoundType)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

**Parameters:**
- `lowerBoundType` ([`com.google.common.collect.BoundType`](./BoundType.md))
- `upperBoundType` ([`com.google.common.collect.BoundType`](./BoundType.md))

### `equals(java.lang.Object object)`

**Returns:** `boolean`

**Parameters:**
- `object` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject(java.io.ObjectInputStream stream)`

**Returns:** `void`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

