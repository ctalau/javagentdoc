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

### `<init>(com.google.common.collect.DiscreteDomain<C> domain)`

**Parameters:**
- `domain` ([`com.google.common.collect.DiscreteDomain<C>`](./DiscreteDomain.md))

## Methods

### `create(com.google.common.collect.Range<C> range, com.google.common.collect.DiscreteDomain<C> domain)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

**Parameters:**
- `range` ([`com.google.common.collect.Range<C>`](./Range.md))
- `domain` ([`com.google.common.collect.DiscreteDomain<C>`](./DiscreteDomain.md))

### `closed(int lower, int upper)`

**Returns:** [`com.google.common.collect.ContiguousSet<java.lang.Integer>`](./ContiguousSet.md)

(These are the same values contained in 
 Range.closed(lower, upper).)

**Parameters:**
- `lower` (`int`)
- `upper` (`int`)

### `closed(long lower, long upper)`

**Returns:** [`com.google.common.collect.ContiguousSet<java.lang.Long>`](./ContiguousSet.md)

(These are the same values contained in 
 Range.closed(lower, upper).)

**Parameters:**
- `lower` (`long`)
- `upper` (`long`)

### `closedOpen(int lower, int upper)`

**Returns:** [`com.google.common.collect.ContiguousSet<java.lang.Integer>`](./ContiguousSet.md)

If the endpoints are equal, an empty set is returned. (These are the
 same values contained in Range.closedOpen(lower, upper).)

**Parameters:**
- `lower` (`int`)
- `upper` (`int`)

### `closedOpen(long lower, long upper)`

**Returns:** [`com.google.common.collect.ContiguousSet<java.lang.Long>`](./ContiguousSet.md)

If the endpoints are equal, an empty set is returned. (These are the
 same values contained in Range.closedOpen(lower, upper).)

**Parameters:**
- `lower` (`long`)
- `upper` (`long`)

### `headSet(C toElement)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

**Parameters:**
- `toElement` (`C`)

### `headSet(C toElement, boolean inclusive)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

**Parameters:**
- `toElement` (`C`)
- `inclusive` (`boolean`)

### `subSet(C fromElement, C toElement)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

**Parameters:**
- `fromElement` (`C`)
- `toElement` (`C`)

### `subSet(C fromElement, boolean fromInclusive, C toElement, boolean toInclusive)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

**Parameters:**
- `fromElement` (`C`)
- `fromInclusive` (`boolean`)
- `toElement` (`C`)
- `toInclusive` (`boolean`)

### `tailSet(C fromElement)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

**Parameters:**
- `fromElement` (`C`)

### `tailSet(C fromElement, boolean inclusive)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

**Parameters:**
- `fromElement` (`C`)
- `inclusive` (`boolean`)

### `headSetImpl(C toElement, boolean inclusive)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

**Parameters:**
- `toElement` (`C`)
- `inclusive` (`boolean`)

### `subSetImpl(C fromElement, boolean fromInclusive, C toElement, boolean toInclusive)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

**Parameters:**
- `fromElement` (`C`)
- `fromInclusive` (`boolean`)
- `toElement` (`C`)
- `toInclusive` (`boolean`)

### `tailSetImpl(C fromElement, boolean inclusive)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

**Parameters:**
- `fromElement` (`C`)
- `inclusive` (`boolean`)

### `intersection(com.google.common.collect.ContiguousSet<C> other)`

**Returns:** [`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md)

This method should always be used instead of Sets#intersection for ContiguousSet instances.

**Parameters:**
- `other` ([`com.google.common.collect.ContiguousSet<C>`](./ContiguousSet.md))

### `range()`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

This is equivalent to range(CLOSED, CLOSED).

### `range(com.google.common.collect.BoundType lowerBoundType, com.google.common.collect.BoundType upperBoundType)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

Note that this method will return ranges with unbounded endpoints if BoundType#OPEN
 is requested for a domain minimum or maximum. For example, if set was created from the
 range [1..Integer.MAX_VALUE] then set.range(CLOSED, OPEN) must return 
 [1..∞).

**Parameters:**
- `lowerBoundType` ([`com.google.common.collect.BoundType`](./BoundType.md))
- `upperBoundType` ([`com.google.common.collect.BoundType`](./BoundType.md))

### `createDescendingSet()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<C>`](./ImmutableSortedSet.md)

### `toString()`

**Returns:** `java.lang.String`

### `builder()`

**Returns:** `com.google.common.collect.ImmutableSortedSet.Builder<E>`

ContiguousSet instances are constructed with #create. This
 method exists only to hide ImmutableSet#builder from consumers of 
 ContiguousSet.

### `writeReplace()`

**Returns:** `java.lang.Object`

