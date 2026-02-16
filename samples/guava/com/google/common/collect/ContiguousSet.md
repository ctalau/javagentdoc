# Class: `ContiguousSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ContiguousSet`

**Extends:** [`com.google.common.collect.ImmutableSortedSet<C>`](./ImmutableSortedSet.md)

## Type Parameters

- `C` extends `java.lang.Comparable`

## Description

A sorted set of contiguous values in a given `DiscreteDomain`. Example:

 <pre>`ContiguousSet.create(Range.closed(5, 42), DiscreteDomain.integers())
 `</pre>

 <p>Note that because bounded ranges over `int` and `long` values are so common, this
 particular example can be written as just:

 <pre>`ContiguousSet.closed(5, 42)
 `</pre>

 <p><b>Warning:</b> Be extremely careful what you do with conceptually large instances (such as
 `ContiguousSet.create(Range.greaterThan(0), DiscreteDomain.integers()`). Certain operations
 on such a set can be performed efficiently, but others (such as `Set.hashCode` or `Collections.frequency`) can cause major performance problems.
**Author:** Gregory Kick
**Since:** 10.0

## Fields

### `domain`

**Type:** [`com.google.common.collect.DiscreteDomain<C>`](./DiscreteDomain.md)

## Constructors

### `<init>([`com.google.common.collect.DiscreteDomain<C>`](./DiscreteDomain.md) domain)`

## Methods

### `create([`com.google.common.collect.Range<C>`](./Range.md) range, [`com.google.common.collect.DiscreteDomain<C>`](./DiscreteDomain.md) domain)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

Returns a `ContiguousSet` containing the same values in the given domain contained by the range.
@throws IllegalArgumentException if neither range nor the domain has a lower bound, or if
     neither has an upper bound
**Since:** 13.0

### `closed(`int` lower, `int` upper)`

**Returns:** [`com.google.common.collect.ContiguousSet<java.lang.Integer>`](./ContiguousSet.md)

Returns a nonempty contiguous set containing all `int` values from `lower`
 (inclusive) to `upper` (inclusive). (These are the same values contained in `Range.closed(lower, upper)`.)
@throws IllegalArgumentException if `lower` is greater than `upper`
**Since:** 23.0

### `closed(`long` lower, `long` upper)`

**Returns:** [`com.google.common.collect.ContiguousSet<java.lang.Long>`](./ContiguousSet.md)

Returns a nonempty contiguous set containing all `long` values from `lower`
 (inclusive) to `upper` (inclusive). (These are the same values contained in `Range.closed(lower, upper)`.)
@throws IllegalArgumentException if `lower` is greater than `upper`
**Since:** 23.0

### `closedOpen(`int` lower, `int` upper)`

**Returns:** [`com.google.common.collect.ContiguousSet<java.lang.Integer>`](./ContiguousSet.md)

Returns a contiguous set containing all `int` values from `lower` (inclusive) to
 `upper` (exclusive). If the endpoints are equal, an empty set is returned. (These are the
 same values contained in `Range.closedOpen(lower, upper)`.)
@throws IllegalArgumentException if `lower` is greater than `upper`
**Since:** 23.0

### `closedOpen(`long` lower, `long` upper)`

**Returns:** [`com.google.common.collect.ContiguousSet<java.lang.Long>`](./ContiguousSet.md)

Returns a contiguous set containing all `long` values from `lower` (inclusive) to
 `upper` (exclusive). If the endpoints are equal, an empty set is returned. (These are the
 same values contained in `Range.closedOpen(lower, upper)`.)
@throws IllegalArgumentException if `lower` is greater than `upper`
**Since:** 23.0

### `headSet(`C` toElement)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

### `headSet(`C` toElement, `boolean` inclusive)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

**Since:** 12.0

### `subSet(`C` fromElement, `C` toElement)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

### `subSet(`C` fromElement, `boolean` fromInclusive, `C` toElement, `boolean` toInclusive)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

**Since:** 12.0

### `tailSet(`C` fromElement)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

### `tailSet(`C` fromElement, `boolean` inclusive)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

**Since:** 12.0

### `headSetImpl(`C` toElement, `boolean` inclusive)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

### `subSetImpl(`C` fromElement, `boolean` fromInclusive, `C` toElement, `boolean` toInclusive)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

### `tailSetImpl(`C` fromElement, `boolean` inclusive)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

### `intersection([`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md) other)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

Returns the set of values that are contained in both this set and the other.

 <p>This method should always be used instead of `Sets.intersection` for `ContiguousSet` instances.

### `range()`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns a range, closed on both ends, whose endpoints are the minimum and maximum values
 contained in this set. This is equivalent to `range(CLOSED, CLOSED)`.
@throws NoSuchElementException if this set is empty

### `range([`com.google.common.collect.BoundType`](./BoundType.md) lowerBoundType, [`com.google.common.collect.BoundType`](./BoundType.md) upperBoundType)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns the minimal range with the given boundary types for which all values in this set are
 contained within the range.

 <p>Note that this method will return ranges with unbounded endpoints if `BoundType.OPEN`
 is requested for a domain minimum or maximum. For example, if `set` was created from the
 range `[1..Integer.MAX_VALUE]` then `set.range(CLOSED, OPEN)` must return `[1..\u221e)`.
@throws NoSuchElementException if this set is empty

### `createDescendingSet()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<C>`](./ImmutableSortedSet.md)

### `toString()`

**Returns:** `java.lang.String`

Returns a shorthand representation of the contents such as `"[1..100]"`.

### `builder()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet.Builder<E>`](ImmutableSortedSet/Builder.md)

Not supported. `ContiguousSet` instances are constructed with `create`. This
 method exists only to hide `ImmutableSet.builder` from consumers of `ContiguousSet`.
@throws UnsupportedOperationException always
**Deprecated:** Use `create`.

### `writeReplace()`

**Returns:** `java.lang.Object`

