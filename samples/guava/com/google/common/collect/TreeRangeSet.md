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

### `<init>(NavigableMap<Cut<C>,Range<C>> rangesByLowerCut)`

**Parameters:**
- `rangesByLowerCut` (`java.util.NavigableMap<com.google.common.collect.Cut<C>,com.google.common.collect.Range<C>>`)

## Methods

### `create()`

**Returns:** [`com.google.common.collect.TreeRangeSet<C>`](./TreeRangeSet.md)

### `create(RangeSet<C> rangeSet)`

**Parameters:**
- `rangeSet` ([`com.google.common.collect.RangeSet<C>`](./RangeSet.md))

**Returns:** [`com.google.common.collect.TreeRangeSet<C>`](./TreeRangeSet.md)

### `create(Iterable<Range<C>> ranges)`

This is the smallest RangeSet which encloses each of the specified ranges. An
 element will be contained in this RangeSet if and only if it is contained in at least
 one Range in ranges.

**Parameters:**
- `ranges` (`java.lang.Iterable<com.google.common.collect.Range<C>>`)

**Returns:** [`com.google.common.collect.TreeRangeSet<C>`](./TreeRangeSet.md)

### `asRanges()`

**Returns:** `java.util.Set<com.google.common.collect.Range<C>>`

### `asDescendingSetOfRanges()`

**Returns:** `java.util.Set<com.google.common.collect.Range<C>>`

### `rangeContaining(C value)`

**Parameters:**
- `value` (`C`)

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

### `intersects(Range<C> range)`

**Parameters:**
- `range` ([`com.google.common.collect.Range<C>`](./Range.md))

**Returns:** `boolean`

### `encloses(Range<C> range)`

**Parameters:**
- `range` ([`com.google.common.collect.Range<C>`](./Range.md))

**Returns:** `boolean`

### `rangeEnclosing(Range<C> range)`

**Parameters:**
- `range` ([`com.google.common.collect.Range<C>`](./Range.md))

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

### `span()`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

### `add(Range<C> rangeToAdd)`

**Parameters:**
- `rangeToAdd` ([`com.google.common.collect.Range<C>`](./Range.md))

**Returns:** `void`

### `remove(Range<C> rangeToRemove)`

**Parameters:**
- `rangeToRemove` ([`com.google.common.collect.Range<C>`](./Range.md))

**Returns:** `void`

### `replaceRangeWithSameLowerBound(Range<C> range)`

**Parameters:**
- `range` ([`com.google.common.collect.Range<C>`](./Range.md))

**Returns:** `void`

### `complement()`

**Returns:** [`com.google.common.collect.RangeSet<C>`](./RangeSet.md)

### `subRangeSet(Range<C> view)`

**Parameters:**
- `view` ([`com.google.common.collect.Range<C>`](./Range.md))

**Returns:** [`com.google.common.collect.RangeSet<C>`](./RangeSet.md)

