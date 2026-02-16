# Interface: `RangeSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.RangeSet`

## Type Parameters

- `C` extends `java.lang.Comparable`

## Description

A set comprising zero or more nonempty, disconnected ranges of type `C`.

 <p>Implementations that choose to support the `add(Range)` operation are required to
 ignore empty ranges and coalesce connected ranges. For example:

 <pre>`RangeSet<Integer> rangeSet = TreeRangeSet.create();
 rangeSet.add(Range.closed(1, 10)); // {[1, 10]`
 rangeSet.add(Range.closedOpen(11, 15)); // disconnected range; {[1, 10], [11, 15)}
 rangeSet.add(Range.closedOpen(15, 20)); // connected range; {[1, 10], [11, 20)}
 rangeSet.add(Range.openClosed(0, 0)); // empty range; {[1, 10], [11, 20)}
 rangeSet.remove(Range.open(5, 10)); // splits [1, 10]; {[1, 5], [10, 10], [11, 20)}
 }</pre>

 <p>Note that the behavior of `Range.isEmpty()` and `Range.isConnected(Range)` may not
 be as expected on discrete ranges. See the Javadoc of those methods for details.

 <p>For a `Set` whose contents are specified by a `Range`, see `ContiguousSet`.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/NewCollectionTypesExplained#rangeset">RangeSets</a>.
**Author:** Kevin Bourrillion
**Author:** Louis Wasserman
**Since:** 14.0

## Methods

### `contains(`C` value)`

**Returns:** `boolean`

Determines whether any of this range set's member ranges contains `value`.

### `rangeContaining(`C` value)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns the unique range from this range set that contains `value`, or `null` if this range set does not contain `value`.

### `intersects([`com.google.common.collect.Range<C>`](./Range.md) otherRange)`

**Returns:** `boolean`

Returns `true` if there exists a non-empty range enclosed by both a member range in this
 range set and the specified range. This is equivalent to calling `subRangeSet(otherRange)` and testing whether the resulting range set is non-empty.
**Since:** 20.0

### `encloses([`com.google.common.collect.Range<C>`](./Range.md) otherRange)`

**Returns:** `boolean`

Returns `true` if there exists a member range in this range set which encloses the specified range.

### `enclosesAll([`com.google.common.collect.RangeSet<C>`](./RangeSet.md) other)`

**Returns:** `boolean`

Returns `true` if for each member range in `other` there exists a member range in
 this range set which encloses it. It follows that `this.contains(value)` whenever `other.contains(value)`. Returns `true` if `other` is empty.

 <p>This is equivalent to checking if this range set `encloses` each of the ranges in
 `other`.

### `enclosesAll(`java.lang.Iterable<com.google.common.collect.Range<C>>` other)`

**Returns:** `boolean`

Returns `true` if for each range in `other` there exists a member range in this
 range set which encloses it. Returns `true` if `other`
 is empty.

 <p>This is equivalent to checking if this range set `encloses` each range in `other`.
**Since:** 21.0

### `isEmpty()`

**Returns:** `boolean`

Returns `true` if this range set contains no ranges.

### `span()`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Returns the minimal range which encloses all ranges in this
 range set.
@throws NoSuchElementException if this range set is empty

### `asRanges()`

**Returns:** `java.util.Set<com.google.common.collect.Range<C>>`

Returns a view of the disconnected ranges that make up this
 range set. The returned set may be empty. The iterators returned by its `Iterable.iterator` method return the ranges in increasing order of lower bound (equivalently,
 of upper bound).

### `asDescendingSetOfRanges()`

**Returns:** `java.util.Set<com.google.common.collect.Range<C>>`

Returns a descending view of the disconnected ranges that make
 up this range set. The returned set may be empty. The iterators returned by its `Iterable.iterator` method return the ranges in decreasing order of lower bound (equivalently,
 of upper bound).
**Since:** 19.0

### `complement()`

**Returns:** [`com.google.common.collect.RangeSet<C>`](./RangeSet.md)

Returns a view of the complement of this `RangeSet`.

 <p>The returned view supports the `add` operation if this `RangeSet` supports
 `remove`, and vice versa.

### `subRangeSet([`com.google.common.collect.Range<C>`](./Range.md) view)`

**Returns:** [`com.google.common.collect.RangeSet<C>`](./RangeSet.md)

Returns a view of the intersection of this `RangeSet` with the specified range.

 <p>The returned view supports all optional operations supported by this `RangeSet`, with
 the caveat that an `IllegalArgumentException` is thrown on an attempt to add any range not enclosed by `view`.

### `add([`com.google.common.collect.Range<C>`](./Range.md) range)`

**Returns:** `void`

Adds the specified range to this `RangeSet` (optional operation). That is, for equal
 range sets a and b, the result of `a.add(range)` is that `a` will be the minimal
 range set for which both `a.enclosesAll(b)` and `a.encloses(range)`.

 <p>Note that `range` will be coalesced with any ranges in
 the range set that are connected with it. Moreover, if
 `range` is empty, this is a no-op.
@throws UnsupportedOperationException if this range set does not support the `add`
     operation

### `remove([`com.google.common.collect.Range<C>`](./Range.md) range)`

**Returns:** `void`

Removes the specified range from this `RangeSet` (optional operation). After this
 operation, if `range.contains(c)`, `this.contains(c)` will return `false`.

 <p>If `range` is empty, this is a no-op.
@throws UnsupportedOperationException if this range set does not support the `remove`
     operation

### `clear()`

**Returns:** `void`

Removes all ranges from this `RangeSet` (optional operation). After this operation,
 `this.contains(c)` will return false for all `c`.

 <p>This is equivalent to `remove(Range.all())`.
@throws UnsupportedOperationException if this range set does not support the `clear`
     operation

### `addAll([`com.google.common.collect.RangeSet<C>`](./RangeSet.md) other)`

**Returns:** `void`

Adds all of the ranges from the specified range set to this range set (optional operation).
 After this operation, this range set is the minimal range set that encloses both the original range set and `other`.

 <p>This is equivalent to calling `add` on each of the ranges in `other` in turn.
@throws UnsupportedOperationException if this range set does not support the `addAll`
     operation

### `addAll(`java.lang.Iterable<com.google.common.collect.Range<C>>` ranges)`

**Returns:** `void`

Adds all of the specified ranges to this range set (optional operation). After this operation,
 this range set is the minimal range set that encloses both
 the original range set and each range in `other`.

 <p>This is equivalent to calling `add` on each of the ranges in `other` in turn.
@throws UnsupportedOperationException if this range set does not support the `addAll`
     operation
**Since:** 21.0

### `removeAll([`com.google.common.collect.RangeSet<C>`](./RangeSet.md) other)`

**Returns:** `void`

Removes all of the ranges from the specified range set from this range set (optional
 operation). After this operation, if `other.contains(c)`, `this.contains(c)` will
 return `false`.

 <p>This is equivalent to calling `remove` on each of the ranges in `other` in
 turn.
@throws UnsupportedOperationException if this range set does not support the `removeAll`
     operation

### `removeAll(`java.lang.Iterable<com.google.common.collect.Range<C>>` ranges)`

**Returns:** `void`

Removes all of the specified ranges from this range set (optional operation).

 <p>This is equivalent to calling `remove` on each of the ranges in `other` in
 turn.
@throws UnsupportedOperationException if this range set does not support the `removeAll`
     operation
**Since:** 21.0

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

Returns `true` if `obj` is another `RangeSet` that contains the same ranges
 according to `Range.equals(Object)`.

### `hashCode()`

**Returns:** `int`

Returns `asRanges().hashCode()`.

### `toString()`

**Returns:** `java.lang.String`

Returns a readable string representation of this range set. For example, if this `RangeSet` consisted of `Range.closed(1, 3)` and `Range.greaterThan(4)`, this might
 return `" [1..3](4..+\u221e)`"}.

