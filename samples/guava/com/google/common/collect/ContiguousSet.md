# Class: `ContiguousSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ContiguousSet`

**Extends:** [`com.google.common.collect.ImmutableSortedSet<C>`](./ImmutableSortedSet.md)

## Type Parameters

- `C` extends `java.lang.Comparable`

## Description

A sorted set of contiguous values in a given {@link DiscreteDomain}. Example:

 <pre>{@code
 ContiguousSet.create(Range.closed(5, 42), DiscreteDomain.integers())
 }</pre>

 <p>Note that because bounded ranges over {@code int} and {@code long} values are so common, this
 particular example can be written as just:

 <pre>{@code
 ContiguousSet.closed(5, 42)
 }</pre>

 <p><b>Warning:</b> Be extremely careful what you do with conceptually large instances (such as
 {@code ContiguousSet.create(Range.greaterThan(0), DiscreteDomain.integers()}). Certain operations
 on such a set can be performed efficiently, but others (such as {@link Set#hashCode} or {@link Collections#frequency}) can cause major performance problems.
@author Gregory Kick
@since 10.0

## Fields

### `domain`

**Type:** [`com.google.common.collect.DiscreteDomain<C>`](./DiscreteDomain.md)

## Constructors

### `<init>([`com.google.common.collect.DiscreteDomain<C>`](./DiscreteDomain.md) domain)`

## Methods

### `create([`com.google.common.collect.Range<C>`](./Range.md) range, [`com.google.common.collect.DiscreteDomain<C>`](./DiscreteDomain.md) domain)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

Returns a {@code ContiguousSet} containing the same values in the given domain {@linkplain Range#contains contained} by the range.
@throws IllegalArgumentException if neither range nor the domain has a lower bound, or if
     neither has an upper bound
@since 13.0

### `closed(`int` lower, `int` upper)`

**Returns:** [`com.google.common.collect.ContiguousSet<java.lang.Integer>`](./ContiguousSet.md)

Returns a nonempty contiguous set containing all {@code int} values from {@code lower}
 (inclusive) to {@code upper} (inclusive). (These are the same values contained in {@code
 Range.closed(lower, upper)}.)
@throws IllegalArgumentException if {@code lower} is greater than {@code upper}
@since 23.0

### `closed(`long` lower, `long` upper)`

**Returns:** [`com.google.common.collect.ContiguousSet<java.lang.Long>`](./ContiguousSet.md)

Returns a nonempty contiguous set containing all {@code long} values from {@code lower}
 (inclusive) to {@code upper} (inclusive). (These are the same values contained in {@code
 Range.closed(lower, upper)}.)
@throws IllegalArgumentException if {@code lower} is greater than {@code upper}
@since 23.0

### `closedOpen(`int` lower, `int` upper)`

**Returns:** [`com.google.common.collect.ContiguousSet<java.lang.Integer>`](./ContiguousSet.md)

Returns a contiguous set containing all {@code int} values from {@code lower} (inclusive) to
 {@code upper} (exclusive). If the endpoints are equal, an empty set is returned. (These are the
 same values contained in {@code Range.closedOpen(lower, upper)}.)
@throws IllegalArgumentException if {@code lower} is greater than {@code upper}
@since 23.0

### `closedOpen(`long` lower, `long` upper)`

**Returns:** [`com.google.common.collect.ContiguousSet<java.lang.Long>`](./ContiguousSet.md)

Returns a contiguous set containing all {@code long} values from {@code lower} (inclusive) to
 {@code upper} (exclusive). If the endpoints are equal, an empty set is returned. (These are the
 same values contained in {@code Range.closedOpen(lower, upper)}.)
@throws IllegalArgumentException if {@code lower} is greater than {@code upper}
@since 23.0

### `headSet([`C`](C.md) toElement)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

### `headSet([`C`](C.md) toElement, `boolean` inclusive)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

@since 12.0

### `subSet([`C`](C.md) fromElement, [`C`](C.md) toElement)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

### `subSet([`C`](C.md) fromElement, `boolean` fromInclusive, [`C`](C.md) toElement, `boolean` toInclusive)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

@since 12.0

### `tailSet([`C`](C.md) fromElement)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

### `tailSet([`C`](C.md) fromElement, `boolean` inclusive)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

@since 12.0

### `headSetImpl([`C`](C.md) toElement, `boolean` inclusive)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

### `subSetImpl([`C`](C.md) fromElement, `boolean` fromInclusive, [`C`](C.md) toElement, `boolean` toInclusive)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

### `tailSetImpl([`C`](C.md) fromElement, `boolean` inclusive)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

### `intersection([`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md) other)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

Returns the set of values that are contained in both this set and the other.

 <p>This method should always be used instead of {@link Sets#intersection} for {@link ContiguousSet} instances.

### `range()`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns a range, closed on both ends, whose endpoints are the minimum and maximum values
 contained in this set. This is equivalent to {@code range(CLOSED, CLOSED)}.
@throws NoSuchElementException if this set is empty

### `range([`com.google.common.collect.BoundType`](./BoundType.md) lowerBoundType, [`com.google.common.collect.BoundType`](./BoundType.md) upperBoundType)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns the minimal range with the given boundary types for which all values in this set are
 {@linkplain Range#contains(Comparable) contained} within the range.

 <p>Note that this method will return ranges with unbounded endpoints if {@link BoundType#OPEN}
 is requested for a domain minimum or maximum. For example, if {@code set} was created from the
 range {@code [1..Integer.MAX_VALUE]} then {@code set.range(CLOSED, OPEN)} must return {@code
 [1..\u221e)}.
@throws NoSuchElementException if this set is empty

### `createDescendingSet()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<C>`](./ImmutableSortedSet.md)

### `toString()`

**Returns:** `java.lang.String`

Returns a shorthand representation of the contents such as {@code "[1..100]"}.

### `builder()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet.Builder<E>`](ImmutableSortedSet/Builder.md)

Not supported. {@code ContiguousSet} instances are constructed with {@link #create}. This
 method exists only to hide {@link ImmutableSet#builder} from consumers of {@code
 ContiguousSet}.
@throws UnsupportedOperationException always
@deprecated Use {@link #create}.

### `writeReplace()`

**Returns:** `java.lang.Object`

