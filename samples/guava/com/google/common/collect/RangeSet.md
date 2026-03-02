# Interface: `RangeSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.RangeSet`

## Type Parameters

- `C` extends `java.lang.Comparable`

## Description

Implementations that choose to support the #add(Range) operation are required to
 ignore empty ranges and coalesce connected ranges. For example:

 

```

 RangeSet<Integer> rangeSet = TreeRangeSet.create();
 rangeSet.add(Range.closed(1, 10)); // {[1, 10]}
 rangeSet.add(Range.closedOpen(11, 15)); // disconnected range; {[1, 10], [11, 15)}
 rangeSet.add(Range.closedOpen(15, 20)); // connected range; {[1, 10], [11, 20)}
 rangeSet.add(Range.openClosed(0, 0)); // empty range; {[1, 10], [11, 20)}
 rangeSet.remove(Range.open(5, 10)); // splits [1, 10]; {[1, 5], [10, 10], [11, 20)}
 
```


 
Note that the behavior of Range#isEmpty() and Range#isConnected(Range) may not
 be as expected on discrete ranges. See the Javadoc of those methods for details.

 
For a Set whose contents are specified by a Range, see ContiguousSet.

 
See the Guava User Guide article on [RangeSets](https://github.com/google/guava/wiki/NewCollectionTypesExplained#rangeset).

## Methods

### `contains(C value)`

**Returns:** `boolean`

**Parameters:**
- `value` (`C`)

### `rangeContaining(C value)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

**Parameters:**
- `value` (`C`)

### `intersects(com.google.common.collect.Range<C> otherRange)`

**Returns:** `boolean`

This is equivalent to calling 
 subRangeSet(otherRange) and testing whether the resulting range set is non-empty.

**Parameters:**
- `otherRange` ([`com.google.common.collect.Range<C>`](./Range.md))

### `encloses(com.google.common.collect.Range<C> otherRange)`

**Returns:** `boolean`

**Parameters:**
- `otherRange` ([`com.google.common.collect.Range<C>`](./Range.md))

### `enclosesAll(com.google.common.collect.RangeSet<C> other)`

**Returns:** `boolean`

It follows that 
 this.contains(value) whenever other.contains(value). Returns true if 
 other is empty.

 
This is equivalent to checking if this range set #encloses each of the ranges in
 other.

**Parameters:**
- `other` ([`com.google.common.collect.RangeSet<C>`](./RangeSet.md))

### `enclosesAll(java.lang.Iterable<com.google.common.collect.Range<C>> other)`

**Returns:** `boolean`

Returns true if other
 is empty.

 
This is equivalent to checking if this range set #encloses each range in 
 other.

**Parameters:**
- `other` (`java.lang.Iterable<com.google.common.collect.Range<C>>`)

### `isEmpty()`

**Returns:** `boolean`

### `span()`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

### `asRanges()`

**Returns:** `java.util.Set<com.google.common.collect.Range<C>>`

The returned set may be empty. The iterators returned by its Iterable#iterator method return the ranges in increasing order of lower bound (equivalently,
 of upper bound).

### `asDescendingSetOfRanges()`

**Returns:** `java.util.Set<com.google.common.collect.Range<C>>`

The returned set may be empty. The iterators returned by its Iterable#iterator method return the ranges in decreasing order of lower bound (equivalently,
 of upper bound).

### `complement()`

**Returns:** [`com.google.common.collect.RangeSet<C>`](./RangeSet.md)

The returned view supports the #add operation if this RangeSet supports
 #remove, and vice versa.

### `subRangeSet(com.google.common.collect.Range<C> view)`

**Returns:** [`com.google.common.collect.RangeSet<C>`](./RangeSet.md)

The returned view supports all optional operations supported by this RangeSet, with
 the caveat that an IllegalArgumentException is thrown on an attempt to add any range not enclosed by view.

**Parameters:**
- `view` ([`com.google.common.collect.Range<C>`](./Range.md))

### `add(com.google.common.collect.Range<C> range)`

**Returns:** `void`

That is, for equal
 range sets a and b, the result of a.add(range) is that a will be the minimal
 range set for which both a.enclosesAll(b) and a.encloses(range).

 
Note that range will be coalesced with any ranges in
 the range set that are connected with it. Moreover, if
 range is empty, this is a no-op.

**Parameters:**
- `range` ([`com.google.common.collect.Range<C>`](./Range.md))

### `remove(com.google.common.collect.Range<C> range)`

**Returns:** `void`

After this
 operation, if range.contains(c), this.contains(c) will return false.

 
If range is empty, this is a no-op.

**Parameters:**
- `range` ([`com.google.common.collect.Range<C>`](./Range.md))

### `clear()`

**Returns:** `void`

After this operation,
 this.contains(c) will return false for all c.

 
This is equivalent to remove(Range.all()).

### `addAll(com.google.common.collect.RangeSet<C> other)`

**Returns:** `void`

After this operation, this range set is the minimal range set that encloses both the original range set and other.

 
This is equivalent to calling #add on each of the ranges in other in turn.

**Parameters:**
- `other` ([`com.google.common.collect.RangeSet<C>`](./RangeSet.md))

### `addAll(java.lang.Iterable<com.google.common.collect.Range<C>> ranges)`

**Returns:** `void`

After this operation,
 this range set is the minimal range set that encloses both
 the original range set and each range in other.

 
This is equivalent to calling #add on each of the ranges in other in turn.

**Parameters:**
- `ranges` (`java.lang.Iterable<com.google.common.collect.Range<C>>`)

### `removeAll(com.google.common.collect.RangeSet<C> other)`

**Returns:** `void`

After this operation, if other.contains(c), this.contains(c) will
 return false.

 
This is equivalent to calling #remove on each of the ranges in other in
 turn.

**Parameters:**
- `other` ([`com.google.common.collect.RangeSet<C>`](./RangeSet.md))

### `removeAll(java.lang.Iterable<com.google.common.collect.Range<C>> ranges)`

**Returns:** `void`

This is equivalent to calling #remove on each of the ranges in other in
 turn.

**Parameters:**
- `ranges` (`java.lang.Iterable<com.google.common.collect.Range<C>>`)

### `equals(java.lang.Object obj)`

**Returns:** `boolean`

**Parameters:**
- `obj` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

For example, if this 
 RangeSet consisted of Range.closed(1, 3) and Range.greaterThan(4), this might
 return " [1..3](4..+∞)"}.

