# Class: `ImmutableRangeSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableRangeSet`

**Extends:** [`com.google.common.collect.AbstractRangeSet<C>`](./AbstractRangeSet.md)

**Implements:** `java.io.Serializable`

## Type Parameters

- `C` extends `java.lang.Comparable`

## Description

A `RangeSet` whose contents will never change, with many other important properties
 detailed at `ImmutableCollection`.
**Author:** Louis Wasserman
**Since:** 14.0

## Fields

### `EMPTY`

**Type:** [`com.google.common.collect.ImmutableRangeSet<java.lang.Comparable<?>>`](./ImmutableRangeSet>.md)

### `ALL`

**Type:** [`com.google.common.collect.ImmutableRangeSet<java.lang.Comparable<?>>`](./ImmutableRangeSet>.md)

### `ranges`

**Type:** [`com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>>`](./ImmutableList>.md)

### `complement`

**Type:** [`com.google.common.collect.ImmutableRangeSet<C>`](./ImmutableRangeSet.md)

## Constructors

### `<init>([`com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>>`](./ImmutableList>.md) ranges)`

### `<init>([`com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>>`](./ImmutableList>.md) ranges, [`com.google.common.collect.ImmutableRangeSet<C>`](./ImmutableRangeSet.md) complement)`

## Methods

### `toImmutableRangeSet()`

**Returns:** `java.util.stream.Collector<com.google.common.collect.Range<E>,?,com.google.common.collect.ImmutableRangeSet<E>>`

Returns a `Collector` that accumulates the input elements into a new `ImmutableRangeSet`. As in `Builder`, overlapping ranges are not permitted and adjacent
 ranges will be merged.
**Since:** 23.1

### `of()`

**Returns:** [`com.google.common.collect.ImmutableRangeSet<C>`](./ImmutableRangeSet.md)

Returns an empty immutable range set.

 <p><b>Performance note:</b> the instance returned is a singleton.

### `of([`com.google.common.collect.Range<C>`](./Range.md) range)`

**Returns:** [`com.google.common.collect.ImmutableRangeSet<C>`](./ImmutableRangeSet.md)

Returns an immutable range set containing the specified single range. If `Range.isEmpty() range.isEmpty()`, this is equivalent to `ImmutableRangeSet.of()`.

### `all()`

**Returns:** [`com.google.common.collect.ImmutableRangeSet<C>`](./ImmutableRangeSet.md)

Returns an immutable range set containing the single range `Range.all()`.

### `copyOf([`com.google.common.collect.RangeSet<C>`](./RangeSet.md) rangeSet)`

**Returns:** [`com.google.common.collect.ImmutableRangeSet<C>`](./ImmutableRangeSet.md)

Returns an immutable copy of the specified `RangeSet`.

### `copyOf(`java.lang.Iterable<com.google.common.collect.Range<C>>` ranges)`

**Returns:** [`com.google.common.collect.ImmutableRangeSet<C>`](./ImmutableRangeSet.md)

Returns an `ImmutableRangeSet` containing each of the specified disjoint ranges.
 Overlapping ranges and empty ranges are forbidden, though adjacent ranges are permitted and
 will be merged.
@throws IllegalArgumentException if any ranges overlap or are empty
**Since:** 21.0

### `unionOf(`java.lang.Iterable<com.google.common.collect.Range<C>>` ranges)`

**Returns:** [`com.google.common.collect.ImmutableRangeSet<C>`](./ImmutableRangeSet.md)

Returns an `ImmutableRangeSet` representing the union of the specified ranges.

 <p>This is the smallest `RangeSet` which encloses each of the specified ranges. Duplicate
 or connected ranges are permitted, and will be coalesced in the result.
**Since:** 21.0

### `intersects([`com.google.common.collect.Range<C>`](./Range.md) otherRange)`

**Returns:** `boolean`

### `encloses([`com.google.common.collect.Range<C>`](./Range.md) otherRange)`

**Returns:** `boolean`

### `rangeContaining(`C` value)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

### `span()`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

### `isEmpty()`

**Returns:** `boolean`

### `add([`com.google.common.collect.Range<C>`](./Range.md) range)`

**Returns:** `void`

Guaranteed to throw an exception and leave the `RangeSet` unmodified.
@throws UnsupportedOperationException always
**Deprecated:** Unsupported operation.

### `addAll([`com.google.common.collect.RangeSet<C>`](./RangeSet.md) other)`

**Returns:** `void`

Guaranteed to throw an exception and leave the `RangeSet` unmodified.
@throws UnsupportedOperationException always
**Deprecated:** Unsupported operation.

### `addAll(`java.lang.Iterable<com.google.common.collect.Range<C>>` other)`

**Returns:** `void`

Guaranteed to throw an exception and leave the `RangeSet` unmodified.
@throws UnsupportedOperationException always
**Deprecated:** Unsupported operation.

### `remove([`com.google.common.collect.Range<C>`](./Range.md) range)`

**Returns:** `void`

Guaranteed to throw an exception and leave the `RangeSet` unmodified.
@throws UnsupportedOperationException always
**Deprecated:** Unsupported operation.

### `removeAll([`com.google.common.collect.RangeSet<C>`](./RangeSet.md) other)`

**Returns:** `void`

Guaranteed to throw an exception and leave the `RangeSet` unmodified.
@throws UnsupportedOperationException always
**Deprecated:** Unsupported operation.

### `removeAll(`java.lang.Iterable<com.google.common.collect.Range<C>>` other)`

**Returns:** `void`

Guaranteed to throw an exception and leave the `RangeSet` unmodified.
@throws UnsupportedOperationException always
**Deprecated:** Unsupported operation.

### `asRanges()`

**Returns:** [`com.google.common.collect.ImmutableSet<com.google.common.collect.Range<C>>`](./ImmutableSet>.md)

### `asDescendingSetOfRanges()`

**Returns:** [`com.google.common.collect.ImmutableSet<com.google.common.collect.Range<C>>`](./ImmutableSet>.md)

### `complement()`

**Returns:** [`com.google.common.collect.ImmutableRangeSet<C>`](./ImmutableRangeSet.md)

### `union([`com.google.common.collect.RangeSet<C>`](./RangeSet.md) other)`

**Returns:** [`com.google.common.collect.ImmutableRangeSet<C>`](./ImmutableRangeSet.md)

Returns a new range set consisting of the union of this range set and `other`.

 <p>This is essentially the same as `TreeRangeSet.create(this).addAll(other)` except it
 returns an `ImmutableRangeSet`.
**Since:** 21.0

### `intersection([`com.google.common.collect.RangeSet<C>`](./RangeSet.md) other)`

**Returns:** [`com.google.common.collect.ImmutableRangeSet<C>`](./ImmutableRangeSet.md)

Returns a new range set consisting of the intersection of this range set and `other`.

 <p>This is essentially the same as `TreeRangeSet.create(this).removeAll(other.complement())` except it returns an `ImmutableRangeSet`.
**Since:** 21.0

### `difference([`com.google.common.collect.RangeSet<C>`](./RangeSet.md) other)`

**Returns:** [`com.google.common.collect.ImmutableRangeSet<C>`](./ImmutableRangeSet.md)

Returns a new range set consisting of the difference of this range set and `other`.

 <p>This is essentially the same as `TreeRangeSet.create(this).removeAll(other)` except it
 returns an `ImmutableRangeSet`.
**Since:** 21.0

### `intersectRanges([`com.google.common.collect.Range<C>`](./Range.md) range)`

**Returns:** [`com.google.common.collect.ImmutableList<com.google.common.collect.Range<C>>`](./ImmutableList>.md)

Returns a list containing the nonempty intersections of `range` with the ranges in this
 range set.

### `subRangeSet([`com.google.common.collect.Range<C>`](./Range.md) range)`

**Returns:** [`com.google.common.collect.ImmutableRangeSet<C>`](./ImmutableRangeSet.md)

Returns a view of the intersection of this range set with the given range.

### `asSet([`com.google.common.collect.DiscreteDomain<C>`](./DiscreteDomain.md) domain)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<C>`](./ImmutableSortedSet.md)

Returns an `ImmutableSortedSet` containing the same values in the given domain
 contained by this range set.

 <p><b>Note:</b> `a.asSet(d).equals(b.asSet(d))` does not imply `a.equals(b)`! For
 example, `a` and `b` could be `[2..4]` and `(1..5)`, or the empty
 ranges `[3..3)` and `[4..4)`.

 <p><b>Warning:</b> Be extremely careful what you do with the `asSet` view of a large
 range set (such as `ImmutableRangeSet.of(Range.greaterThan(0))`). Certain operations on
 such a set can be performed efficiently, but others (such as `Set.hashCode` or `Collections.frequency`) can cause major performance problems.

 <p>The returned set's `Object.toString` method returns a shorthand form of the set's
 contents, such as `"[1..100]`"}.
@throws IllegalArgumentException if neither this range nor the domain has a lower bound, or if
     neither has an upper bound

### `isPartialView()`

**Returns:** `boolean`

Returns `true` if this immutable range set's implementation contains references to
 user-created objects that aren't accessible via this range set's methods. This is generally
 used to determine whether `copyOf` implementations should make an explicit copy to avoid
 memory leaks.

### `builder()`

**Returns:** [`com.google.common.collect.ImmutableRangeSet.Builder<C>`](ImmutableRangeSet/Builder.md)

Returns a new builder for an immutable range set.

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject(`java.io.ObjectInputStream` stream)`

**Returns:** `void`

