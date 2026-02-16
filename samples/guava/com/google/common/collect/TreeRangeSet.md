# Class: `TreeRangeSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.TreeRangeSet`

**Extends:** [`com.google.common.collect.AbstractRangeSet<C>`](./AbstractRangeSet.md)

**Implements:** [`java.io.Serializable`](../../../../java/io/Serializable.md)

## Type Parameters

- `C` extends `java.lang.Comparable<?>`

## Description

An implementation of {@link RangeSet} backed by a {@link TreeMap}.
@author Louis Wasserman
@since 14.0

## Fields

### `rangesByLowerBound`

**Type:** [`java.util.NavigableMap<com.google.common.collect.Cut<C>,com.google.common.collect.Range<C>>`](../../../../java/util/NavigableMap,com/google/common/collect/Range>.md)

### `asRanges`

**Type:** [`java.util.Set<com.google.common.collect.Range<C>>`](../../../../java/util/Set>.md)

### `asDescendingSetOfRanges`

**Type:** [`java.util.Set<com.google.common.collect.Range<C>>`](../../../../java/util/Set>.md)

### `complement`

**Type:** [`com.google.common.collect.RangeSet<C>`](./RangeSet.md)

## Constructors

### `<init>([`java.util.NavigableMap<com.google.common.collect.Cut<C>,com.google.common.collect.Range<C>>`](../../../../java/util/NavigableMap,com/google/common/collect/Range>.md) rangesByLowerCut)`

## Methods

### `create()`

**Returns:** [`com.google.common.collect.TreeRangeSet<C>`](./TreeRangeSet.md)

Creates an empty {@code TreeRangeSet} instance.

### `create([`com.google.common.collect.RangeSet<C>`](./RangeSet.md) rangeSet)`

**Returns:** [`com.google.common.collect.TreeRangeSet<C>`](./TreeRangeSet.md)

Returns a {@code TreeRangeSet} initialized with the ranges in the specified range set.

### `create(`java.lang.Iterable<com.google.common.collect.Range<C>>` ranges)`

**Returns:** [`com.google.common.collect.TreeRangeSet<C>`](./TreeRangeSet.md)

Returns a {@code TreeRangeSet} representing the union of the specified ranges.

 <p>This is the smallest {@code RangeSet} which encloses each of the specified ranges. An
 element will be contained in this {@code RangeSet} if and only if it is contained in at least
 one {@code Range} in {@code ranges}.
@since 21.0

### `asRanges()`

**Returns:** [`java.util.Set<com.google.common.collect.Range<C>>`](../../../../java/util/Set>.md)

### `asDescendingSetOfRanges()`

**Returns:** [`java.util.Set<com.google.common.collect.Range<C>>`](../../../../java/util/Set>.md)

### `rangeContaining([`C`](C.md) value)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

### `intersects([`com.google.common.collect.Range<C>`](./Range.md) range)`

**Returns:** `boolean`

### `encloses([`com.google.common.collect.Range<C>`](./Range.md) range)`

**Returns:** `boolean`

### `rangeEnclosing([`com.google.common.collect.Range<C>`](./Range.md) range)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

### `span()`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

### `add([`com.google.common.collect.Range<C>`](./Range.md) rangeToAdd)`

**Returns:** `void`

### `remove([`com.google.common.collect.Range<C>`](./Range.md) rangeToRemove)`

**Returns:** `void`

### `replaceRangeWithSameLowerBound([`com.google.common.collect.Range<C>`](./Range.md) range)`

**Returns:** `void`

### `complement()`

**Returns:** [`com.google.common.collect.RangeSet<C>`](./RangeSet.md)

### `subRangeSet([`com.google.common.collect.Range<C>`](./Range.md) view)`

**Returns:** [`com.google.common.collect.RangeSet<C>`](./RangeSet.md)

