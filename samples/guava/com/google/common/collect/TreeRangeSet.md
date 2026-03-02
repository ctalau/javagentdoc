# Class: `TreeRangeSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.TreeRangeSet`

**Extends:** [`com.google.common.collect.AbstractRangeSet<C>`](./AbstractRangeSet.md)

**Implements:** `java.io.Serializable`

## Type Parameters

- `C` extends `java.lang.Comparable<?>`

## Description

## Fields

### `rangesByLowerBound`

**Type:** `java.util.NavigableMap<com.google.common.collect.Cut<C>,com.google.common.collect.Range<C>>`

### `asRanges`

**Type:** `java.util.Set<com.google.common.collect.Range<C>>`

### `asDescendingSetOfRanges`

**Type:** `java.util.Set<com.google.common.collect.Range<C>>`

### `complement`

**Type:** [`com.google.common.collect.RangeSet<C>`](./RangeSet.md)

## Constructors

### `<init>(java.util.NavigableMap<com.google.common.collect.Cut<C>,com.google.common.collect.Range<C>> rangesByLowerCut)`

**Parameters:**
- `rangesByLowerCut` (`java.util.NavigableMap<com.google.common.collect.Cut<C>,com.google.common.collect.Range<C>>`)

## Methods

### `create()`

**Returns:** [`com.google.common.collect.TreeRangeSet<C>`](./TreeRangeSet.md)

### `create(com.google.common.collect.RangeSet<C> rangeSet)`

**Returns:** [`com.google.common.collect.TreeRangeSet<C>`](./TreeRangeSet.md)

**Parameters:**
- `rangeSet` ([`com.google.common.collect.RangeSet<C>`](./RangeSet.md))

### `create(java.lang.Iterable<com.google.common.collect.Range<C>> ranges)`

**Returns:** [`com.google.common.collect.TreeRangeSet<C>`](./TreeRangeSet.md)

This is the smallest RangeSet which encloses each of the specified ranges. An
 element will be contained in this RangeSet if and only if it is contained in at least
 one Range in ranges.

**Parameters:**
- `ranges` (`java.lang.Iterable<com.google.common.collect.Range<C>>`)

### `asRanges()`

**Returns:** `java.util.Set<com.google.common.collect.Range<C>>`

### `asDescendingSetOfRanges()`

**Returns:** `java.util.Set<com.google.common.collect.Range<C>>`

### `rangeContaining(C value)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

**Parameters:**
- `value` (`C`)

### `intersects(com.google.common.collect.Range<C> range)`

**Returns:** `boolean`

**Parameters:**
- `range` ([`com.google.common.collect.Range<C>`](./Range.md))

### `encloses(com.google.common.collect.Range<C> range)`

**Returns:** `boolean`

**Parameters:**
- `range` ([`com.google.common.collect.Range<C>`](./Range.md))

### `rangeEnclosing(com.google.common.collect.Range<C> range)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

**Parameters:**
- `range` ([`com.google.common.collect.Range<C>`](./Range.md))

### `span()`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

### `add(com.google.common.collect.Range<C> rangeToAdd)`

**Returns:** `void`

**Parameters:**
- `rangeToAdd` ([`com.google.common.collect.Range<C>`](./Range.md))

### `remove(com.google.common.collect.Range<C> rangeToRemove)`

**Returns:** `void`

**Parameters:**
- `rangeToRemove` ([`com.google.common.collect.Range<C>`](./Range.md))

### `replaceRangeWithSameLowerBound(com.google.common.collect.Range<C> range)`

**Returns:** `void`

**Parameters:**
- `range` ([`com.google.common.collect.Range<C>`](./Range.md))

### `complement()`

**Returns:** [`com.google.common.collect.RangeSet<C>`](./RangeSet.md)

### `subRangeSet(com.google.common.collect.Range<C> view)`

**Returns:** [`com.google.common.collect.RangeSet<C>`](./RangeSet.md)

**Parameters:**
- `view` ([`com.google.common.collect.Range<C>`](./Range.md))

