# Class: `Multisets`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Multisets`

## Description

See the Guava User Guide article on [
 Multisets](https://github.com/google/guava/wiki/CollectionUtilitiesExplained#multisets).

## Constructors

### `<init>()`

## Methods

### `toMultiset(java.util.function.Function<? super T,E> elementFunction, java.util.function.ToIntFunction<? super T> countFunction, java.util.function.Supplier<M> multisetSupplier)`

**Returns:** `java.util.stream.Collector<T,?,M>`

Elements are added in encounter order.

 
If the mapped elements contain duplicates (according to Object#equals), the element
 will be added more than once, with the count summed over all appearances of the element.

 
Note that stream.collect(toMultiset(function, e -> 1, supplier)) is equivalent to
 stream.map(function).collect(Collectors.toCollection(supplier)).

 
To collect to an ImmutableMultiset, use ImmutableMultiset#toImmutableMultiset.

**Parameters:**
- `elementFunction` (`java.util.function.Function<? super T,E>`)
- `countFunction` (`java.util.function.ToIntFunction<? super T>`)
- `multisetSupplier` (`java.util.function.Supplier<M>`)

### `unmodifiableMultiset(com.google.common.collect.Multiset<? extends E> multiset)`

**Returns:** [`com.google.common.collect.Multiset<E>`](./Multiset.md)

Query operations on the returned
 multiset "read through" to the specified multiset, and attempts to modify the returned multiset
 result in an UnsupportedOperationException.

 
The returned multiset will be serializable if the specified multiset is serializable.

**Parameters:**
- `multiset` ([`com.google.common.collect.Multiset<? extends E>`](./Multiset.md)): the multiset for which an unmodifiable view is to be generated

### `unmodifiableMultiset(com.google.common.collect.ImmutableMultiset<E> multiset)`

**Returns:** [`com.google.common.collect.Multiset<E>`](./Multiset.md)

**Parameters:**
- `multiset` ([`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md))

### `unmodifiableSortedMultiset(com.google.common.collect.SortedMultiset<E> sortedMultiset)`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

Query operations on the returned
 multiset "read through" to the specified multiset, and attempts to modify the returned multiset
 result in an UnsupportedOperationException.

 
The returned multiset will be serializable if the specified multiset is serializable.

**Parameters:**
- `sortedMultiset` ([`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)): the sorted multiset for which an unmodifiable view is to be generated

### `immutableEntry(E e, int n)`

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

The entry will be
 serializable if e is.

**Parameters:**
- `e` (`E`): the element to be associated with the returned entry
- `n` (`int`): the count to be associated with the returned entry

### `filter(com.google.common.collect.Multiset<E> unfiltered, com.google.common.base.Predicate<? super E> predicate)`

**Returns:** [`com.google.common.collect.Multiset<E>`](./Multiset.md)

The returned
 multiset is a live view of unfiltered; changes to one affect the other.

 
The resulting multiset's iterators, and those of its entrySet() and 
 elementSet(), do not support remove(). However, all other multiset methods supported
 by unfiltered are supported by the returned multiset. When given an element that
 doesn't satisfy the predicate, the multiset's add() and addAll() methods throw
 an IllegalArgumentException. When methods such as removeAll() and 
 clear() are called on the filtered multiset, only elements that satisfy the filter will be
 removed from the underlying multiset.

 
The returned multiset isn't threadsafe or serializable, even if unfiltered is.

 
Many of the filtered multiset's methods, such as size(), iterate across every
 element in the underlying multiset and determine which elements satisfy the filter. When a live
 view is *not* needed, it may be faster to copy the returned multiset and use the copy.

 
**Warning:** predicate must be *consistent with equals*, as documented at
 Predicate#apply. Do not provide a predicate such as 
 Predicates.instanceOf(ArrayList.class), which is inconsistent with equals. (See Iterables#filter(Iterable, Class) for related functionality.)

**Parameters:**
- `unfiltered` ([`com.google.common.collect.Multiset<E>`](./Multiset.md))
- `predicate` ([`com.google.common.base.Predicate<? super E>`](../base/Predicate.md))

### `inferDistinctElements(java.lang.Iterable<?> elements)`

**Returns:** `int`

The number of
 distinct elements is only computed if elements is an instance of Multiset;
 otherwise the default value of 11 is returned.

**Parameters:**
- `elements` (`java.lang.Iterable<?>`)

### `union(com.google.common.collect.Multiset<? extends E> multiset1, com.google.common.collect.Multiset<? extends E> multiset2)`

**Returns:** [`com.google.common.collect.Multiset<E>`](./Multiset.md)

In the returned multiset, the count
 of each element is the *maximum* of its counts in the two backing multisets. The iteration
 order of the returned multiset matches that of the element set of multiset1 followed by
 the members of the element set of multiset2 that are not contained in 
 multiset1, with repeated occurrences of the same element appearing consecutively.

 
Results are undefined if multiset1 and multiset2 are based on different
 equivalence relations (as HashMultiset and TreeMultiset are).

**Parameters:**
- `multiset1` ([`com.google.common.collect.Multiset<? extends E>`](./Multiset.md))
- `multiset2` ([`com.google.common.collect.Multiset<? extends E>`](./Multiset.md))

### `intersection(com.google.common.collect.Multiset<E> multiset1, com.google.common.collect.Multiset<?> multiset2)`

**Returns:** [`com.google.common.collect.Multiset<E>`](./Multiset.md)

In the returned multiset,
 the count of each element is the *minimum* of its counts in the two backing multisets,
 with elements that would have a count of 0 not included. The iteration order of the returned
 multiset matches that of the element set of multiset1, with repeated occurrences of the
 same element appearing consecutively.

 
Results are undefined if multiset1 and multiset2 are based on different
 equivalence relations (as HashMultiset and TreeMultiset are).

**Parameters:**
- `multiset1` ([`com.google.common.collect.Multiset<E>`](./Multiset.md))
- `multiset2` ([`com.google.common.collect.Multiset<?>`](./Multiset.md))

### `sum(com.google.common.collect.Multiset<? extends E> multiset1, com.google.common.collect.Multiset<? extends E> multiset2)`

**Returns:** [`com.google.common.collect.Multiset<E>`](./Multiset.md)

In the returned multiset, the count
 of each element is the *sum* of its counts in the two backing multisets. The iteration
 order of the returned multiset matches that of the element set of multiset1 followed by
 the members of the element set of multiset2 that are not contained in 
 multiset1, with repeated occurrences of the same element appearing consecutively.

 
Results are undefined if multiset1 and multiset2 are based on different
 equivalence relations (as HashMultiset and TreeMultiset are).

**Parameters:**
- `multiset1` ([`com.google.common.collect.Multiset<? extends E>`](./Multiset.md))
- `multiset2` ([`com.google.common.collect.Multiset<? extends E>`](./Multiset.md))

### `difference(com.google.common.collect.Multiset<E> multiset1, com.google.common.collect.Multiset<?> multiset2)`

**Returns:** [`com.google.common.collect.Multiset<E>`](./Multiset.md)

In the returned multiset, the
 count of each element is the result of the *zero-truncated subtraction* of its count in
 the second multiset from its count in the first multiset, with elements that would have a count
 of 0 not included. The iteration order of the returned multiset matches that of the element set
 of multiset1, with repeated occurrences of the same element appearing consecutively.

 
Results are undefined if multiset1 and multiset2 are based on different
 equivalence relations (as HashMultiset and TreeMultiset are).

**Parameters:**
- `multiset1` ([`com.google.common.collect.Multiset<E>`](./Multiset.md))
- `multiset2` ([`com.google.common.collect.Multiset<?>`](./Multiset.md))

### `containsOccurrences(com.google.common.collect.Multiset<?> superMultiset, com.google.common.collect.Multiset<?> subMultiset)`

**Returns:** `boolean`

**Parameters:**
- `superMultiset` ([`com.google.common.collect.Multiset<?>`](./Multiset.md))
- `subMultiset` ([`com.google.common.collect.Multiset<?>`](./Multiset.md))

### `retainOccurrences(com.google.common.collect.Multiset<?> multisetToModify, com.google.common.collect.Multiset<?> multisetToRetain)`

**Returns:** `boolean`

To be precise, multisetToModify.count(e) is set to 
 Math.min(multisetToModify.count(e), multisetToRetain.count(e)). This is similar to intersection (multisetToModify, multisetToRetain),
 but mutates multisetToModify instead of returning a view.

 
In contrast, multisetToModify.retainAll(multisetToRetain) keeps all occurrences of
 elements that appear at all in multisetToRetain, and deletes all occurrences of all
 other elements.

**Parameters:**
- `multisetToModify` ([`com.google.common.collect.Multiset<?>`](./Multiset.md))
- `multisetToRetain` ([`com.google.common.collect.Multiset<?>`](./Multiset.md))

### `retainOccurrencesImpl(com.google.common.collect.Multiset<E> multisetToModify, com.google.common.collect.Multiset<?> occurrencesToRetain)`

**Returns:** `boolean`

**Parameters:**
- `multisetToModify` ([`com.google.common.collect.Multiset<E>`](./Multiset.md))
- `occurrencesToRetain` ([`com.google.common.collect.Multiset<?>`](./Multiset.md))

### `removeOccurrences(com.google.common.collect.Multiset<?> multisetToModify, java.lang.Iterable<?> occurrencesToRemove)`

**Returns:** `boolean`

Equivalently, this method modifies multisetToModify so that 
 multisetToModify.count(e) is set to Math.max(0, multisetToModify.count(e) -
 Iterables.frequency(occurrencesToRemove, e)).

 
This is *not* the same as multisetToModify. removeAll(occurrencesToRemove), which removes all occurrences of elements that appear
 in occurrencesToRemove. However, this operation *is* equivalent to, albeit
 sometimes more efficient than, the following:

 

```

 for (E e : occurrencesToRemove) {
   multisetToModify.remove(e);
 }
 
```

**Parameters:**
- `multisetToModify` ([`com.google.common.collect.Multiset<?>`](./Multiset.md))
- `occurrencesToRemove` (`java.lang.Iterable<?>`)

### `removeOccurrences(com.google.common.collect.Multiset<?> multisetToModify, com.google.common.collect.Multiset<?> occurrencesToRemove)`

**Returns:** `boolean`

Equivalently, this method modifies multisetToModify so that 
 multisetToModify.count(e) is set to Math.max(0, multisetToModify.count(e) -
 occurrencesToRemove.count(e)).

 
This is *not* the same as multisetToModify. removeAll(occurrencesToRemove), which removes all occurrences of elements that appear
 in occurrencesToRemove. However, this operation *is* equivalent to, albeit
 sometimes more efficient than, the following:

 

```

 for (E e : occurrencesToRemove) {
   multisetToModify.remove(e);
 }
 
```

**Parameters:**
- `multisetToModify` ([`com.google.common.collect.Multiset<?>`](./Multiset.md))
- `occurrencesToRemove` ([`com.google.common.collect.Multiset<?>`](./Multiset.md))

### `equalsImpl(com.google.common.collect.Multiset<?> multiset, java.lang.Object object)`

**Returns:** `boolean`

**Parameters:**
- `multiset` ([`com.google.common.collect.Multiset<?>`](./Multiset.md))
- `object` (`java.lang.Object`)

### `addAllImpl(com.google.common.collect.Multiset<E> self, java.util.Collection<? extends E> elements)`

**Returns:** `boolean`

**Parameters:**
- `self` ([`com.google.common.collect.Multiset<E>`](./Multiset.md))
- `elements` (`java.util.Collection<? extends E>`)

### `addAllImpl(com.google.common.collect.Multiset<E> self, com.google.common.collect.Multiset<? extends E> elements)`

**Returns:** `boolean`

**Parameters:**
- `self` ([`com.google.common.collect.Multiset<E>`](./Multiset.md))
- `elements` ([`com.google.common.collect.Multiset<? extends E>`](./Multiset.md))

### `removeAllImpl(com.google.common.collect.Multiset<?> self, java.util.Collection<?> elementsToRemove)`

**Returns:** `boolean`

**Parameters:**
- `self` ([`com.google.common.collect.Multiset<?>`](./Multiset.md))
- `elementsToRemove` (`java.util.Collection<?>`)

### `retainAllImpl(com.google.common.collect.Multiset<?> self, java.util.Collection<?> elementsToRetain)`

**Returns:** `boolean`

**Parameters:**
- `self` ([`com.google.common.collect.Multiset<?>`](./Multiset.md))
- `elementsToRetain` (`java.util.Collection<?>`)

### `setCountImpl(com.google.common.collect.Multiset<E> self, E element, int count)`

**Returns:** `int`

**Parameters:**
- `self` ([`com.google.common.collect.Multiset<E>`](./Multiset.md))
- `element` (`E`)
- `count` (`int`)

### `setCountImpl(com.google.common.collect.Multiset<E> self, E element, int oldCount, int newCount)`

**Returns:** `boolean`

**Parameters:**
- `self` ([`com.google.common.collect.Multiset<E>`](./Multiset.md))
- `element` (`E`)
- `oldCount` (`int`)
- `newCount` (`int`)

### `elementIterator(java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> entryIterator)`

**Returns:** `java.util.Iterator<E>`

**Parameters:**
- `entryIterator` (`java.util.Iterator<com.google.common.collect.Multiset.Entry<E>>`)

### `iteratorImpl(com.google.common.collect.Multiset<E> multiset)`

**Returns:** `java.util.Iterator<E>`

**Parameters:**
- `multiset` ([`com.google.common.collect.Multiset<E>`](./Multiset.md))

### `spliteratorImpl(com.google.common.collect.Multiset<E> multiset)`

**Returns:** `java.util.Spliterator<E>`

**Parameters:**
- `multiset` ([`com.google.common.collect.Multiset<E>`](./Multiset.md))

### `linearTimeSizeImpl(com.google.common.collect.Multiset<?> multiset)`

**Returns:** `int`

**Parameters:**
- `multiset` ([`com.google.common.collect.Multiset<?>`](./Multiset.md))

### `cast(java.lang.Iterable<T> iterable)`

**Returns:** [`com.google.common.collect.Multiset<T>`](./Multiset.md)

**Parameters:**
- `iterable` (`java.lang.Iterable<T>`)

### `copyHighestCountFirst(com.google.common.collect.Multiset<E> multiset)`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

**Parameters:**
- `multiset` ([`com.google.common.collect.Multiset<E>`](./Multiset.md))

