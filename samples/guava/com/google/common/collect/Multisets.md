# Class: `Multisets`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Multisets`

## Description

See the Guava User Guide article on [
 Multisets](https://github.com/google/guava/wiki/CollectionUtilitiesExplained#multisets).

## Constructors

### `<init>()`

## Methods

### `toMultiset(Function<? super T,E> elementFunction, ToIntFunction<? super T> countFunction, Supplier<M> multisetSupplier)`

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

**Returns:** `java.util.stream.Collector<T,?,M>`

### `unmodifiableMultiset(Multiset<? extends E> multiset)`

Query operations on the returned
 multiset "read through" to the specified multiset, and attempts to modify the returned multiset
 result in an UnsupportedOperationException.

 
The returned multiset will be serializable if the specified multiset is serializable.

**Parameters:**
- `multiset` ([`com.google.common.collect.Multiset<? extends E>`](./Multiset.md)): the multiset for which an unmodifiable view is to be generated

**Returns:** [`com.google.common.collect.Multiset<E>`](./Multiset.md)

### `unmodifiableMultiset(ImmutableMultiset<E> multiset)`

**Parameters:**
- `multiset` ([`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md))

**Returns:** [`com.google.common.collect.Multiset<E>`](./Multiset.md)

### `unmodifiableSortedMultiset(SortedMultiset<E> sortedMultiset)`

Query operations on the returned
 multiset "read through" to the specified multiset, and attempts to modify the returned multiset
 result in an UnsupportedOperationException.

 
The returned multiset will be serializable if the specified multiset is serializable.

**Parameters:**
- `sortedMultiset` ([`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)): the sorted multiset for which an unmodifiable view is to be generated

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

### `immutableEntry(E e, int n)`

The entry will be
 serializable if e is.

**Parameters:**
- `e` (`E`): the element to be associated with the returned entry
- `n` (`int`): the count to be associated with the returned entry

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

### `filter(Multiset<E> unfiltered, Predicate<? super E> predicate)`

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

**Returns:** [`com.google.common.collect.Multiset<E>`](./Multiset.md)

### `inferDistinctElements(Iterable<?> elements)`

The number of
 distinct elements is only computed if elements is an instance of Multiset;
 otherwise the default value of 11 is returned.

**Parameters:**
- `elements` (`java.lang.Iterable<?>`)

**Returns:** `int`

### `union(Multiset<? extends E> multiset1, Multiset<? extends E> multiset2)`

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

**Returns:** [`com.google.common.collect.Multiset<E>`](./Multiset.md)

### `intersection(Multiset<E> multiset1, Multiset<?> multiset2)`

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

**Returns:** [`com.google.common.collect.Multiset<E>`](./Multiset.md)

### `sum(Multiset<? extends E> multiset1, Multiset<? extends E> multiset2)`

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

**Returns:** [`com.google.common.collect.Multiset<E>`](./Multiset.md)

### `difference(Multiset<E> multiset1, Multiset<?> multiset2)`

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

**Returns:** [`com.google.common.collect.Multiset<E>`](./Multiset.md)

### `containsOccurrences(Multiset<?> superMultiset, Multiset<?> subMultiset)`

**Parameters:**
- `superMultiset` ([`com.google.common.collect.Multiset<?>`](./Multiset.md))
- `subMultiset` ([`com.google.common.collect.Multiset<?>`](./Multiset.md))

**Returns:** `boolean`

### `retainOccurrences(Multiset<?> multisetToModify, Multiset<?> multisetToRetain)`

To be precise, multisetToModify.count(e) is set to 
 Math.min(multisetToModify.count(e), multisetToRetain.count(e)). This is similar to intersection (multisetToModify, multisetToRetain),
 but mutates multisetToModify instead of returning a view.

 
In contrast, multisetToModify.retainAll(multisetToRetain) keeps all occurrences of
 elements that appear at all in multisetToRetain, and deletes all occurrences of all
 other elements.

**Parameters:**
- `multisetToModify` ([`com.google.common.collect.Multiset<?>`](./Multiset.md))
- `multisetToRetain` ([`com.google.common.collect.Multiset<?>`](./Multiset.md))

**Returns:** `boolean`

### `retainOccurrencesImpl(Multiset<E> multisetToModify, Multiset<?> occurrencesToRetain)`

**Parameters:**
- `multisetToModify` ([`com.google.common.collect.Multiset<E>`](./Multiset.md))
- `occurrencesToRetain` ([`com.google.common.collect.Multiset<?>`](./Multiset.md))

**Returns:** `boolean`

### `removeOccurrences(Multiset<?> multisetToModify, Iterable<?> occurrencesToRemove)`

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

**Returns:** `boolean`

### `removeOccurrences(Multiset<?> multisetToModify, Multiset<?> occurrencesToRemove)`

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

**Returns:** `boolean`

### `equalsImpl(Multiset<?> multiset, Object object)`

**Parameters:**
- `multiset` ([`com.google.common.collect.Multiset<?>`](./Multiset.md))
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `addAllImpl(Multiset<E> self, Collection<? extends E> elements)`

**Parameters:**
- `self` ([`com.google.common.collect.Multiset<E>`](./Multiset.md))
- `elements` (`java.util.Collection<? extends E>`)

**Returns:** `boolean`

### `addAllImpl(Multiset<E> self, Multiset<? extends E> elements)`

**Parameters:**
- `self` ([`com.google.common.collect.Multiset<E>`](./Multiset.md))
- `elements` ([`com.google.common.collect.Multiset<? extends E>`](./Multiset.md))

**Returns:** `boolean`

### `removeAllImpl(Multiset<?> self, Collection<?> elementsToRemove)`

**Parameters:**
- `self` ([`com.google.common.collect.Multiset<?>`](./Multiset.md))
- `elementsToRemove` (`java.util.Collection<?>`)

**Returns:** `boolean`

### `retainAllImpl(Multiset<?> self, Collection<?> elementsToRetain)`

**Parameters:**
- `self` ([`com.google.common.collect.Multiset<?>`](./Multiset.md))
- `elementsToRetain` (`java.util.Collection<?>`)

**Returns:** `boolean`

### `setCountImpl(Multiset<E> self, E element, int count)`

**Parameters:**
- `self` ([`com.google.common.collect.Multiset<E>`](./Multiset.md))
- `element` (`E`)
- `count` (`int`)

**Returns:** `int`

### `setCountImpl(Multiset<E> self, E element, int oldCount, int newCount)`

**Parameters:**
- `self` ([`com.google.common.collect.Multiset<E>`](./Multiset.md))
- `element` (`E`)
- `oldCount` (`int`)
- `newCount` (`int`)

**Returns:** `boolean`

### `elementIterator(Iterator<Multiset.Entry<E>> entryIterator)`

**Parameters:**
- `entryIterator` (`java.util.Iterator<com.google.common.collect.Multiset.Entry<E>>`)

**Returns:** `java.util.Iterator<E>`

### `iteratorImpl(Multiset<E> multiset)`

**Parameters:**
- `multiset` ([`com.google.common.collect.Multiset<E>`](./Multiset.md))

**Returns:** `java.util.Iterator<E>`

### `spliteratorImpl(Multiset<E> multiset)`

**Parameters:**
- `multiset` ([`com.google.common.collect.Multiset<E>`](./Multiset.md))

**Returns:** `java.util.Spliterator<E>`

### `linearTimeSizeImpl(Multiset<?> multiset)`

**Parameters:**
- `multiset` ([`com.google.common.collect.Multiset<?>`](./Multiset.md))

**Returns:** `int`

### `cast(Iterable<T> iterable)`

**Parameters:**
- `iterable` (`java.lang.Iterable<T>`)

**Returns:** [`com.google.common.collect.Multiset<T>`](./Multiset.md)

### `copyHighestCountFirst(Multiset<E> multiset)`

**Parameters:**
- `multiset` ([`com.google.common.collect.Multiset<E>`](./Multiset.md))

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

