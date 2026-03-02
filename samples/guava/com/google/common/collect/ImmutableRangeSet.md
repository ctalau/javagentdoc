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

### `<init>(ImmutableList<Range<C>> ranges)`

**Parameters:**
- `ranges` ([`com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>>`](./ImmutableList.md))

### `<init>(ImmutableList<Range<C>> ranges, ImmutableRangeSet<C> complement)`

**Parameters:**
- `ranges` ([`com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>>`](./ImmutableList.md))
- `complement` ([`com.google.common.collect.ImmutableRangeSet<C>`](./ImmutableRangeSet.md))

## Methods

### `toImmutableRangeSet()`

As in Builder, overlapping ranges are not permitted and adjacent
 ranges will be merged.

**Returns:** `java.util.stream.Collector<com.google.common.collect.Range<E>,?,com.google.common.collect.ImmutableRangeSet<E>>`

### `of()`

**Performance note:** the instance returned is a singleton.

**Returns:** [`com.google.common.collect.ImmutableRangeSet<C>`](./ImmutableRangeSet.md)

### `of(Range<C> range)`

If range.isEmpty(), this is equivalent to ImmutableRangeSet#of().

**Parameters:**
- `range` ([`com.google.common.collect.Range<C>`](./Range.md))

**Returns:** [`com.google.common.collect.ImmutableRangeSet<C>`](./ImmutableRangeSet.md)

### `all()`

**Returns:** [`com.google.common.collect.ImmutableRangeSet<C>`](./ImmutableRangeSet.md)

### `copyOf(RangeSet<C> rangeSet)`

**Parameters:**
- `rangeSet` ([`com.google.common.collect.RangeSet<C>`](./RangeSet.md))

**Returns:** [`com.google.common.collect.ImmutableRangeSet<C>`](./ImmutableRangeSet.md)

### `copyOf(Iterable<Range<C>> ranges)`

Overlapping ranges and empty ranges are forbidden, though adjacent ranges are permitted and
 will be merged.

**Parameters:**
- `ranges` (`java.lang.Iterable<com.google.common.collect.Range<C>>`)

**Returns:** [`com.google.common.collect.ImmutableRangeSet<C>`](./ImmutableRangeSet.md)

### `unionOf(Iterable<Range<C>> ranges)`

This is the smallest RangeSet which encloses each of the specified ranges. Duplicate
 or connected ranges are permitted, and will be coalesced in the result.

**Parameters:**
- `ranges` (`java.lang.Iterable<com.google.common.collect.Range<C>>`)

**Returns:** [`com.google.common.collect.ImmutableRangeSet<C>`](./ImmutableRangeSet.md)

### `intersects(Range<C> otherRange)`

**Parameters:**
- `otherRange` ([`com.google.common.collect.Range<C>`](./Range.md))

**Returns:** `boolean`

### `encloses(Range<C> otherRange)`

**Parameters:**
- `otherRange` ([`com.google.common.collect.Range<C>`](./Range.md))

**Returns:** `boolean`

### `rangeContaining(C value)`

**Parameters:**
- `value` (`C`)

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

### `span()`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

### `isEmpty()`

**Returns:** `boolean`

### `add(Range<C> range)`

**Parameters:**
- `range` ([`com.google.common.collect.Range<C>`](./Range.md))

**Returns:** `void`

### `addAll(RangeSet<C> other)`

**Parameters:**
- `other` ([`com.google.common.collect.RangeSet<C>`](./RangeSet.md))

**Returns:** `void`

### `addAll(Iterable<Range<C>> other)`

**Parameters:**
- `other` (`java.lang.Iterable<com.google.common.collect.Range<C>>`)

**Returns:** `void`

### `remove(Range<C> range)`

**Parameters:**
- `range` ([`com.google.common.collect.Range<C>`](./Range.md))

**Returns:** `void`

### `removeAll(RangeSet<C> other)`

**Parameters:**
- `other` ([`com.google.common.collect.RangeSet<C>`](./RangeSet.md))

**Returns:** `void`

### `removeAll(Iterable<Range<C>> other)`

**Parameters:**
- `other` (`java.lang.Iterable<com.google.common.collect.Range<C>>`)

**Returns:** `void`

### `asRanges()`

**Returns:** [`com.google.common.collect.ImmutableSet<com.google.common.collect.Range<C>>`](./ImmutableSet.md)

### `asDescendingSetOfRanges()`

**Returns:** [`com.google.common.collect.ImmutableSet<com.google.common.collect.Range<C>>`](./ImmutableSet.md)

### `complement()`

**Returns:** [`com.google.common.collect.ImmutableRangeSet<C>`](./ImmutableRangeSet.md)

### `union(RangeSet<C> other)`

This is essentially the same as TreeRangeSet.create(this).addAll(other) except it
 returns an ImmutableRangeSet.

**Parameters:**
- `other` ([`com.google.common.collect.RangeSet<C>`](./RangeSet.md))

**Returns:** [`com.google.common.collect.ImmutableRangeSet<C>`](./ImmutableRangeSet.md)

### `intersection(RangeSet<C> other)`

This is essentially the same as 
 TreeRangeSet.create(this).removeAll(other.complement()) except it returns an 
 ImmutableRangeSet.

**Parameters:**
- `other` ([`com.google.common.collect.RangeSet<C>`](./RangeSet.md))

**Returns:** [`com.google.common.collect.ImmutableRangeSet<C>`](./ImmutableRangeSet.md)

### `difference(RangeSet<C> other)`

This is essentially the same as TreeRangeSet.create(this).removeAll(other) except it
 returns an ImmutableRangeSet.

**Parameters:**
- `other` ([`com.google.common.collect.RangeSet<C>`](./RangeSet.md))

**Returns:** [`com.google.common.collect.ImmutableRangeSet<C>`](./ImmutableRangeSet.md)

### `intersectRanges(Range<C> range)`

**Parameters:**
- `range` ([`com.google.common.collect.Range<C>`](./Range.md))

**Returns:** [`com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>>`](./ImmutableList.md)

### `subRangeSet(Range<C> range)`

**Parameters:**
- `range` ([`com.google.common.collect.Range<C>`](./Range.md))

**Returns:** [`com.google.common.collect.ImmutableRangeSet<C>`](./ImmutableRangeSet.md)

### `asSet(DiscreteDomain<C> domain)`

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

**Returns:** [`com.google.common.collect.ImmutableSortedSet<C>`](./ImmutableSortedSet.md)

### `isPartialView()`

This is generally
 used to determine whether copyOf implementations should make an explicit copy to avoid
 memory leaks.

**Returns:** `boolean`

### `builder()`

**Returns:** `com.google.common.collect.ImmutableRangeSet.Builder<C>`

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject(ObjectInputStream stream)`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

**Returns:** `void`

