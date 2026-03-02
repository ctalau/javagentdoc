# Class: `ContiguousSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ContiguousSet`

**Extends:** [`com.google.common.collect.ImmutableSortedSet<C>`](./ImmutableSortedSet.md)

## Type Parameters

- `C` extends `java.lang.Comparable`

## Description

Example:

 

```

 ContiguousSet.create(Range.closed(5, 42), DiscreteDomain.integers())
 
```


 
Note that because bounded ranges over int and long values are so common, this
 particular example can be written as just:

 

```

 ContiguousSet.closed(5, 42)
 
```


 
**Warning:** Be extremely careful what you do with conceptually large instances (such as
 ContiguousSet.create(Range.greaterThan(0), DiscreteDomain.integers()). Certain operations
 on such a set can be performed efficiently, but others (such as Set#hashCode or Collections#frequency) can cause major performance problems.

## Fields

### `domain`

**Type:** [`com.google.common.collect.DiscreteDomain<C>`](./DiscreteDomain.md)

## Constructors

### `<init>(DiscreteDomain<C> domain)`

**Parameters:**
- `domain` ([`com.google.common.collect.DiscreteDomain<C>`](./DiscreteDomain.md))

## Methods

### `create(Range<C> range, DiscreteDomain<C> domain)`

**Parameters:**
- `range` ([`com.google.common.collect.Range<C>`](./Range.md))
- `domain` ([`com.google.common.collect.DiscreteDomain<C>`](./DiscreteDomain.md))

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

### `closed(int lower, int upper)`

(These are the same values contained in 
 Range.closed(lower, upper).)

**Parameters:**
- `lower` (`int`)
- `upper` (`int`)

**Returns:** [`com.google.common.collect.ContiguousSet<java.lang.Integer>`](./ContiguousSet.md)

### `closed(long lower, long upper)`

(These are the same values contained in 
 Range.closed(lower, upper).)

**Parameters:**
- `lower` (`long`)
- `upper` (`long`)

**Returns:** [`com.google.common.collect.ContiguousSet<java.lang.Long>`](./ContiguousSet.md)

### `closedOpen(int lower, int upper)`

If the endpoints are equal, an empty set is returned. (These are the
 same values contained in Range.closedOpen(lower, upper).)

**Parameters:**
- `lower` (`int`)
- `upper` (`int`)

**Returns:** [`com.google.common.collect.ContiguousSet<java.lang.Integer>`](./ContiguousSet.md)

### `closedOpen(long lower, long upper)`

If the endpoints are equal, an empty set is returned. (These are the
 same values contained in Range.closedOpen(lower, upper).)

**Parameters:**
- `lower` (`long`)
- `upper` (`long`)

**Returns:** [`com.google.common.collect.ContiguousSet<java.lang.Long>`](./ContiguousSet.md)

### `headSet(C toElement)`

**Parameters:**
- `toElement` (`C`)

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

### `headSet(C toElement, boolean inclusive)`

**Parameters:**
- `toElement` (`C`)
- `inclusive` (`boolean`)

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

### `subSet(C fromElement, C toElement)`

**Parameters:**
- `fromElement` (`C`)
- `toElement` (`C`)

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

### `subSet(C fromElement, boolean fromInclusive, C toElement, boolean toInclusive)`

**Parameters:**
- `fromElement` (`C`)
- `fromInclusive` (`boolean`)
- `toElement` (`C`)
- `toInclusive` (`boolean`)

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

### `tailSet(C fromElement)`

**Parameters:**
- `fromElement` (`C`)

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

### `tailSet(C fromElement, boolean inclusive)`

**Parameters:**
- `fromElement` (`C`)
- `inclusive` (`boolean`)

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

### `headSetImpl(C toElement, boolean inclusive)`

**Parameters:**
- `toElement` (`C`)
- `inclusive` (`boolean`)

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

### `subSetImpl(C fromElement, boolean fromInclusive, C toElement, boolean toInclusive)`

**Parameters:**
- `fromElement` (`C`)
- `fromInclusive` (`boolean`)
- `toElement` (`C`)
- `toInclusive` (`boolean`)

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

### `tailSetImpl(C fromElement, boolean inclusive)`

**Parameters:**
- `fromElement` (`C`)
- `inclusive` (`boolean`)

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

### `intersection(ContiguousSet<C> other)`

This method should always be used instead of Sets#intersection for ContiguousSet instances.

**Parameters:**
- `other` ([`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md))

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

### `range()`

This is equivalent to range(CLOSED, CLOSED).

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

### `range(BoundType lowerBoundType, BoundType upperBoundType)`

Note that this method will return ranges with unbounded endpoints if BoundType#OPEN
 is requested for a domain minimum or maximum. For example, if set was created from the
 range [1..Integer.MAX_VALUE] then set.range(CLOSED, OPEN) must return 
 [1..∞).

**Parameters:**
- `lowerBoundType` ([`com.google.common.collect.BoundType`](./BoundType.md))
- `upperBoundType` ([`com.google.common.collect.BoundType`](./BoundType.md))

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

### `createDescendingSet()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<C>`](./ImmutableSortedSet.md)

### `toString()`

**Returns:** `java.lang.String`

### `builder()`

ContiguousSet instances are constructed with #create. This
 method exists only to hide ImmutableSet#builder from consumers of 
 ContiguousSet.

**Returns:** `com.google.common.collect.ImmutableSortedSet.Builder<E>`

### `writeReplace()`

**Returns:** `java.lang.Object`

