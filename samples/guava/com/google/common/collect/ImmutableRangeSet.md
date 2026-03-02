# Class: `ImmutableRangeSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableRangeSet`

**Extends:** [`com.google.common.collect.AbstractRangeSet<C>`](./AbstractRangeSet.md)

**Implements:** `java.io.Serializable`

## Type Parameters

- `C` extends `java.lang.Comparable`

## Description

## Fields

### `EMPTY`

**Type:** [`com.google.common.collect.ImmutableRangeSet<java.lang.Comparable<?>>`](./ImmutableRangeSet.md)

### `ALL`

**Type:** [`com.google.common.collect.ImmutableRangeSet<java.lang.Comparable<?>>`](./ImmutableRangeSet.md)

### `ranges`

**Type:** [`com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>>`](./ImmutableList.md)

### `complement`

**Type:** [`com.google.common.collect.ImmutableRangeSet<C>`](./ImmutableRangeSet.md)

## Constructors

### `<init>(com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>> ranges)`

**Parameters:**
- `ranges` ([`com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>>`](./ImmutableList.md))

### `<init>(com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>> ranges, com.google.common.collect.ImmutableRangeSet<C> complement)`

**Parameters:**
- `ranges` ([`com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>>`](./ImmutableList.md))
- `complement` ([`com.google.common.collect.ImmutableRangeSet<C>`](./ImmutableRangeSet.md))

## Methods

### `toImmutableRangeSet()`

**Returns:** `java.util.stream.Collector<com.google.common.collect.Range<E>,?,com.google.common.collect.ImmutableRangeSet<E>>`

As in Builder, overlapping ranges are not permitted and adjacent
 ranges will be merged.

### `of()`

**Returns:** [`com.google.common.collect.ImmutableRangeSet<C>`](./ImmutableRangeSet.md)

**Performance note:** the instance returned is a singleton.

### `of(com.google.common.collect.Range<C> range)`

**Returns:** [`com.google.common.collect.ImmutableRangeSet<C>`](./ImmutableRangeSet.md)

If range.isEmpty(), this is equivalent to ImmutableRangeSet#of().

**Parameters:**
- `range` ([`com.google.common.collect.Range<C>`](./Range.md))

### `all()`

**Returns:** [`com.google.common.collect.ImmutableRangeSet<C>`](./ImmutableRangeSet.md)

### `copyOf(com.google.common.collect.RangeSet<C> rangeSet)`

**Returns:** [`com.google.common.collect.ImmutableRangeSet<C>`](./ImmutableRangeSet.md)

**Parameters:**
- `rangeSet` ([`com.google.common.collect.RangeSet<C>`](./RangeSet.md))

### `copyOf(java.lang.Iterable<com.google.common.collect.Range<C>> ranges)`

**Returns:** [`com.google.common.collect.ImmutableRangeSet<C>`](./ImmutableRangeSet.md)

Overlapping ranges and empty ranges are forbidden, though adjacent ranges are permitted and
 will be merged.

**Parameters:**
- `ranges` (`java.lang.Iterable<com.google.common.collect.Range<C>>`)

### `unionOf(java.lang.Iterable<com.google.common.collect.Range<C>> ranges)`

**Returns:** [`com.google.common.collect.ImmutableRangeSet<C>`](./ImmutableRangeSet.md)

This is the smallest RangeSet which encloses each of the specified ranges. Duplicate
 or connected ranges are permitted, and will be coalesced in the result.

**Parameters:**
- `ranges` (`java.lang.Iterable<com.google.common.collect.Range<C>>`)

### `intersects(com.google.common.collect.Range<C> otherRange)`

**Returns:** `boolean`

**Parameters:**
- `otherRange` ([`com.google.common.collect.Range<C>`](./Range.md))

### `encloses(com.google.common.collect.Range<C> otherRange)`

**Returns:** `boolean`

**Parameters:**
- `otherRange` ([`com.google.common.collect.Range<C>`](./Range.md))

### `rangeContaining(C value)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

**Parameters:**
- `value` (`C`)

### `span()`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

### `isEmpty()`

**Returns:** `boolean`

### `add(com.google.common.collect.Range<C> range)`

**Returns:** `void`

**Parameters:**
- `range` ([`com.google.common.collect.Range<C>`](./Range.md))

### `addAll(com.google.common.collect.RangeSet<C> other)`

**Returns:** `void`

**Parameters:**
- `other` ([`com.google.common.collect.RangeSet<C>`](./RangeSet.md))

### `addAll(java.lang.Iterable<com.google.common.collect.Range<C>> other)`

**Returns:** `void`

**Parameters:**
- `other` (`java.lang.Iterable<com.google.common.collect.Range<C>>`)

### `remove(com.google.common.collect.Range<C> range)`

**Returns:** `void`

**Parameters:**
- `range` ([`com.google.common.collect.Range<C>`](./Range.md))

### `removeAll(com.google.common.collect.RangeSet<C> other)`

**Returns:** `void`

**Parameters:**
- `other` ([`com.google.common.collect.RangeSet<C>`](./RangeSet.md))

### `removeAll(java.lang.Iterable<com.google.common.collect.Range<C>> other)`

**Returns:** `void`

**Parameters:**
- `other` (`java.lang.Iterable<com.google.common.collect.Range<C>>`)

### `asRanges()`

**Returns:** [`com.google.common.collect.ImmutableSet<com.google.common.collect.Range<C>>`](./ImmutableSet.md)

### `asDescendingSetOfRanges()`

**Returns:** [`com.google.common.collect.ImmutableSet<com.google.common.collect.Range<C>>`](./ImmutableSet.md)

### `complement()`

**Returns:** [`com.google.common.collect.ImmutableRangeSet<C>`](./ImmutableRangeSet.md)

### `union(com.google.common.collect.RangeSet<C> other)`

**Returns:** [`com.google.common.collect.ImmutableRangeSet<C>`](./ImmutableRangeSet.md)

This is essentially the same as TreeRangeSet.create(this).addAll(other) except it
 returns an ImmutableRangeSet.

**Parameters:**
- `other` ([`com.google.common.collect.RangeSet<C>`](./RangeSet.md))

### `intersection(com.google.common.collect.RangeSet<C> other)`

**Returns:** [`com.google.common.collect.ImmutableRangeSet<C>`](./ImmutableRangeSet.md)

This is essentially the same as 
 TreeRangeSet.create(this).removeAll(other.complement()) except it returns an 
 ImmutableRangeSet.

**Parameters:**
- `other` ([`com.google.common.collect.RangeSet<C>`](./RangeSet.md))

### `difference(com.google.common.collect.RangeSet<C> other)`

**Returns:** [`com.google.common.collect.ImmutableRangeSet<C>`](./ImmutableRangeSet.md)

This is essentially the same as TreeRangeSet.create(this).removeAll(other) except it
 returns an ImmutableRangeSet.

**Parameters:**
- `other` ([`com.google.common.collect.RangeSet<C>`](./RangeSet.md))

### `intersectRanges(com.google.common.collect.Range<C> range)`

**Returns:** [`com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>>`](./ImmutableList.md)

**Parameters:**
- `range` ([`com.google.common.collect.Range<C>`](./Range.md))

### `subRangeSet(com.google.common.collect.Range<C> range)`

**Returns:** [`com.google.common.collect.ImmutableRangeSet<C>`](./ImmutableRangeSet.md)

**Parameters:**
- `range` ([`com.google.common.collect.Range<C>`](./Range.md))

### `asSet(com.google.common.collect.DiscreteDomain<C> domain)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<C>`](./ImmutableSortedSet.md)

**Note:** a.asSet(d).equals(b.asSet(d)) does not imply a.equals(b)! For
 example, a and b could be [2..4] and (1..5), or the empty
 ranges [3..3) and [4..4).

 
**Warning:** Be extremely careful what you do with the asSet view of a large
 range set (such as ImmutableRangeSet.of(Range.greaterThan(0))). Certain operations on
 such a set can be performed efficiently, but others (such as Set#hashCode or Collections#frequency) can cause major performance problems.

 
The returned set's Object#toString method returns a shorthand form of the set's
 contents, such as "[1..100]"}.

**Parameters:**
- `domain` ([`com.google.common.collect.DiscreteDomain<C>`](./DiscreteDomain.md))

### `isPartialView()`

**Returns:** `boolean`

This is generally
 used to determine whether copyOf implementations should make an explicit copy to avoid
 memory leaks.

### `builder()`

**Returns:** `com.google.common.collect.ImmutableRangeSet.Builder<C>`

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject(java.io.ObjectInputStream stream)`

**Returns:** `void`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

