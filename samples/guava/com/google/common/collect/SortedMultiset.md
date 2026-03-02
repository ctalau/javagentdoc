# Interface: `SortedMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.SortedMultiset`

**Extends:** [`com.google.common.collect.SortedMultisetBridge<E>`](./SortedMultisetBridge.md), [`com.google.common.collect.SortedIterable<E>`](./SortedIterable.md)

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

This order is reflected when iterating over the
 sorted multiset, either directly, or through its elementSet or entrySet views. In
 all cases, this implementation uses Comparable#compareTo or Comparator#compare
 instead of Object#equals to determine equivalence of instances.

 
**Warning:** The comparison must be *consistent with equals* as explained by the
 Comparable class specification. Otherwise, the resulting multiset will violate the Collection contract, which is specified in terms of Object#equals.

 
See the Guava User Guide article on [Multiset](https://github.com/google/guava/wiki/NewCollectionTypesExplained#multiset).

## Methods

### `comparator()`

**Returns:** `java.util.Comparator<? super E>`

### `firstEntry()`

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

### `lastEntry()`

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

### `pollFirstEntry()`

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

### `pollLastEntry()`

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

### `elementSet()`

**Returns:** `java.util.NavigableSet<E>`

### `entrySet()`

**Returns:** `java.util.Set<com.google.common.collect.Multiset.Entry<E>>`

The entrySet's iterator returns entries in ascending element order according to this
 multiset's comparator.

### `iterator()`

**Returns:** `java.util.Iterator<E>`

The iterator returns the elements in ascending order according to this multiset's
 comparator.

### `descendingMultiset()`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

Modifications made to either map will be reflected
 in the other.

### `headMultiset(E upperBound, com.google.common.collect.BoundType boundType)`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

The returned multiset is a view of this
 multiset, so changes to one will be reflected in the other. The returned multiset supports all
 operations that this multiset supports.

 
The returned multiset will throw an IllegalArgumentException on attempts to add
 elements outside its range.

**Parameters:**
- `upperBound` (`E`)
- `boundType` ([`com.google.common.collect.BoundType`](./BoundType.md))

### `subMultiset(E lowerBound, com.google.common.collect.BoundType lowerBoundType, E upperBound, com.google.common.collect.BoundType upperBoundType)`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

The returned multiset is a view of this multiset, so changes to one will be
 reflected in the other. The returned multiset supports all operations that this multiset
 supports.

 
The returned multiset will throw an IllegalArgumentException on attempts to add
 elements outside its range.

 
This method is equivalent to tailMultiset(lowerBound,
 lowerBoundType).headMultiset(upperBound, upperBoundType).

**Parameters:**
- `lowerBound` (`E`)
- `lowerBoundType` ([`com.google.common.collect.BoundType`](./BoundType.md))
- `upperBound` (`E`)
- `upperBoundType` ([`com.google.common.collect.BoundType`](./BoundType.md))

### `tailMultiset(E lowerBound, com.google.common.collect.BoundType boundType)`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

The returned multiset is a view of this
 multiset, so changes to one will be reflected in the other. The returned multiset supports all
 operations that this multiset supports.

 
The returned multiset will throw an IllegalArgumentException on attempts to add
 elements outside its range.

**Parameters:**
- `lowerBound` (`E`)
- `boundType` ([`com.google.common.collect.BoundType`](./BoundType.md))

