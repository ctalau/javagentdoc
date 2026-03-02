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

### `<init>(Range<C> range, DiscreteDomain<C> domain)`

**Parameters:**
- `range` ([`com.google.common.collect.Range<C>`](./Range.md))
- `domain` ([`com.google.common.collect.DiscreteDomain<C>`](./DiscreteDomain.md))

## Methods

### `intersectionInCurrentDomain(Range<C> other)`

**Parameters:**
- `other` ([`com.google.common.collect.Range<C>`](./Range.md))

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

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

### `tailSetImpl(C fromElement, boolean inclusive)`

**Parameters:**
- `fromElement` (`C`)
- `inclusive` (`boolean`)

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

### `indexOf(Object target)`

**Parameters:**
- `target` (`java.lang.Object`)

**Returns:** `int`

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<C>`](./UnmodifiableIterator.md)

### `descendingIterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<C>`](./UnmodifiableIterator.md)

### `equalsOrThrow(Comparable<?> left, Comparable<?> right)`

**Parameters:**
- `left` (`java.lang.Comparable<?>`)
- `right` (`java.lang.Comparable<?>`)

**Returns:** `boolean`

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

### `contains(Object object)`

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `containsAll(Collection<?> targets)`

**Parameters:**
- `targets` (`java.util.Collection<?>`)

**Returns:** `boolean`

### `isEmpty()`

**Returns:** `boolean`

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

### `equals(Object object)`

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject(ObjectInputStream stream)`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

**Returns:** `void`

