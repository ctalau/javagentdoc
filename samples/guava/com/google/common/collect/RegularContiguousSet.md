# Class: `RegularContiguousSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.RegularContiguousSet`

**Extends:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

## Type Parameters

- `C` extends `java.lang.Comparable`

## Description

An implementation of `ContiguousSet` that contains one or more elements.
**Author:** Gregory Kick

## Fields

### `range`

**Type:** [`com.google.common.collect.Range<C>`](./Range.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>([`com.google.common.collect.Range<C>`](./Range.md) range, [`com.google.common.collect.DiscreteDomain<C>`](./DiscreteDomain.md) domain)`

## Methods

### `intersectionInCurrentDomain([`com.google.common.collect.Range<C>`](./Range.md) other)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

### `headSetImpl(`C` toElement, `boolean` inclusive)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

### `subSetImpl(`C` fromElement, `boolean` fromInclusive, `C` toElement, `boolean` toInclusive)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

### `tailSetImpl(`C` fromElement, `boolean` inclusive)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

### `indexOf(`java.lang.Object` target)`

**Returns:** `int`

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<C>`](./UnmodifiableIterator.md)

### `descendingIterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<C>`](./UnmodifiableIterator.md)

### `equalsOrThrow(`java.lang.Comparable<?>` left, `java.lang.Comparable<?>` right)`

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

### `contains(`java.lang.Object` object)`

**Returns:** `boolean`

### `containsAll(`java.util.Collection<?>` targets)`

**Returns:** `boolean`

### `isEmpty()`

**Returns:** `boolean`

### `intersection([`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md) other)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

### `range()`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

### `range([`com.google.common.collect.BoundType`](./BoundType.md) lowerBoundType, [`com.google.common.collect.BoundType`](./BoundType.md) upperBoundType)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject(`java.io.ObjectInputStream` stream)`

**Returns:** `void`

