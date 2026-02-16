# Interface: `SortedMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.SortedMultiset`

**Extends:** [`com.google.common.collect.SortedMultisetBridge<E>`](./SortedMultisetBridge.md), [`com.google.common.collect.SortedIterable<E>`](./SortedIterable.md)

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A {@link Multiset} which maintains the ordering of its elements, according to either their
 natural order or an explicit {@link Comparator}. This order is reflected when iterating over the
 sorted multiset, either directly, or through its {@code elementSet} or {@code entrySet} views. In
 all cases, this implementation uses {@link Comparable#compareTo} or {@link Comparator#compare}
 instead of {@link Object#equals} to determine equivalence of instances.

 <p><b>Warning:</b> The comparison must be <i>consistent with equals</i> as explained by the
 {@link Comparable} class specification. Otherwise, the resulting multiset will violate the {@link Collection} contract, which is specified in terms of {@link Object#equals}.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/NewCollectionTypesExplained#multiset">{@code Multiset}</a>.
@author Louis Wasserman
@since 11.0

## Methods

### `comparator()`

**Returns:** [`java.util.Comparator<? super E>`](../../../../java/util/Comparator.md)

Returns the comparator that orders this multiset, or {@link Ordering#natural()} if the natural
 ordering of the elements is used.

### `firstEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

Returns the entry of the first element in this multiset, or {@code null} if this multiset is
 empty.

### `lastEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

Returns the entry of the last element in this multiset, or {@code null} if this multiset is
 empty.

### `pollFirstEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

Returns and removes the entry associated with the lowest element in this multiset, or returns
 {@code null} if this multiset is empty.

### `pollLastEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

Returns and removes the entry associated with the greatest element in this multiset, or returns
 {@code null} if this multiset is empty.

### `elementSet()`

**Returns:** [`java.util.NavigableSet<E>`](../../../../java/util/NavigableSet.md)

Returns a {@link NavigableSet} view of the distinct elements in this multiset.
@since 14.0 (present with return type {@code SortedSet} since 11.0)

### `entrySet()`

**Returns:** [`java.util.Set<com.google.common.collect.Multiset.Entry<E>>`](../../../../java/util/Set>.md)

{@inheritDoc}

 <p>The {@code entrySet}'s iterator returns entries in ascending element order according to this
 multiset's comparator.

### `iterator()`

**Returns:** [`java.util.Iterator<E>`](../../../../java/util/Iterator.md)

{@inheritDoc}

 <p>The iterator returns the elements in ascending order according to this multiset's
 comparator.

### `descendingMultiset()`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

Returns a descending view of this multiset. Modifications made to either map will be reflected
 in the other.

### `headMultiset([`E`](E.md) upperBound, [`com.google.common.collect.BoundType`](./BoundType.md) boundType)`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

Returns a view of this multiset restricted to the elements less than {@code upperBound},
 optionally including {@code upperBound} itself. The returned multiset is a view of this
 multiset, so changes to one will be reflected in the other. The returned multiset supports all
 operations that this multiset supports.

 <p>The returned multiset will throw an {@link IllegalArgumentException} on attempts to add
 elements outside its range.

### `subMultiset([`E`](E.md) lowerBound, [`com.google.common.collect.BoundType`](./BoundType.md) lowerBoundType, [`E`](E.md) upperBound, [`com.google.common.collect.BoundType`](./BoundType.md) upperBoundType)`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

Returns a view of this multiset restricted to the range between {@code lowerBound} and {@code
 upperBound}. The returned multiset is a view of this multiset, so changes to one will be
 reflected in the other. The returned multiset supports all operations that this multiset
 supports.

 <p>The returned multiset will throw an {@link IllegalArgumentException} on attempts to add
 elements outside its range.

 <p>This method is equivalent to {@code tailMultiset(lowerBound,
 lowerBoundType).headMultiset(upperBound, upperBoundType)}.

### `tailMultiset([`E`](E.md) lowerBound, [`com.google.common.collect.BoundType`](./BoundType.md) boundType)`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

Returns a view of this multiset restricted to the elements greater than {@code lowerBound},
 optionally including {@code lowerBound} itself. The returned multiset is a view of this
 multiset, so changes to one will be reflected in the other. The returned multiset supports all
 operations that this multiset supports.

 <p>The returned multiset will throw an {@link IllegalArgumentException} on attempts to add
 elements outside its range.

