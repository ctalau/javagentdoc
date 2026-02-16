# Class: `RegularContiguousSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.RegularContiguousSet`

**Extends:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

## Type Parameters

- `C` extends `java.lang.Comparable`

## Description

An implementation of {@link ContiguousSet} that contains one or more elements.
@author Gregory Kick

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

### `headSetImpl([`C`](C.md) toElement, `boolean` inclusive)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

### `subSetImpl([`C`](C.md) fromElement, `boolean` fromInclusive, [`C`](C.md) toElement, `boolean` toInclusive)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

### `tailSetImpl([`C`](C.md) fromElement, `boolean` inclusive)`

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

**Returns:** [`C`](C.md)

### `last()`

**Returns:** [`C`](C.md)

### `createAsList()`

**Returns:** [`com.google.common.collect.ImmutableList<C>`](./ImmutableList.md)

### `size()`

**Returns:** `int`

### `contains(`java.lang.Object` object)`

**Returns:** `boolean`

### `containsAll([`java.util.Collection<?>`](../../../../java/util/Collection.md) targets)`

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

### `readObject([`java.io.ObjectInputStream`](../../../../java/io/ObjectInputStream.md) stream)`

**Returns:** `void`

