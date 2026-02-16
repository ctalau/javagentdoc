# Class: `Multisets`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Multisets`

## Description

Provides static utility methods for creating and working with {@link Multiset} instances.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/CollectionUtilitiesExplained#multisets">{@code
 Multisets}</a>.
@author Kevin Bourrillion
@author Mike Bostock
@author Louis Wasserman
@since 2.0

## Constructors

### `<init>()`

## Methods

### `toMultiset([`java.util.function.Function<? super T,E>`](../../../../java/util/function/Function.md) elementFunction, [`java.util.function.ToIntFunction<? super T>`](../../../../java/util/function/ToIntFunction.md) countFunction, [`java.util.function.Supplier<M>`](../../../../java/util/function/Supplier.md) multisetSupplier)`

**Returns:** [`java.util.stream.Collector<T,?,M>`](../../../../java/util/stream/Collector.md)

Returns a {@code Collector} that accumulates elements into a multiset created via the specified
 {@code Supplier}, whose elements are the result of applying {@code elementFunction} to the
 inputs, with counts equal to the result of applying {@code countFunction} to the inputs.
 Elements are added in encounter order.

 <p>If the mapped elements contain duplicates (according to {@link Object#equals}), the element
 will be added more than once, with the count summed over all appearances of the element.

 <p>Note that {@code stream.collect(toMultiset(function, e -> 1, supplier))} is equivalent to
 {@code stream.map(function).collect(Collectors.toCollection(supplier))}.

 <p>To collect to an {@link ImmutableMultiset}, use {@link ImmutableMultiset#toImmutableMultiset}.
@since 22.0

### `unmodifiableMultiset([`com.google.common.collect.Multiset<? extends E>`](./Multiset.md) multiset)`

**Returns:** [`com.google.common.collect.Multiset<E>`](./Multiset.md)

Returns an unmodifiable view of the specified multiset. Query operations on the returned
 multiset "read through" to the specified multiset, and attempts to modify the returned multiset
 result in an {@link UnsupportedOperationException}.

 <p>The returned multiset will be serializable if the specified multiset is serializable.
@param multiset the multiset for which an unmodifiable view is to be generated
@return an unmodifiable view of the multiset

### `unmodifiableMultiset([`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md) multiset)`

**Returns:** [`com.google.common.collect.Multiset<E>`](./Multiset.md)

Simply returns its argument.
@deprecated no need to use this
@since 10.0

### `unmodifiableSortedMultiset([`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md) sortedMultiset)`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

Returns an unmodifiable view of the specified sorted multiset. Query operations on the returned
 multiset "read through" to the specified multiset, and attempts to modify the returned multiset
 result in an {@link UnsupportedOperationException}.

 <p>The returned multiset will be serializable if the specified multiset is serializable.
@param sortedMultiset the sorted multiset for which an unmodifiable view is to be generated
@return an unmodifiable view of the multiset
@since 11.0

### `immutableEntry([`E`](E.md) e, `int` n)`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

Returns an immutable multiset entry with the specified element and count. The entry will be
 serializable if {@code e} is.
@param e the element to be associated with the returned entry
@param n the count to be associated with the returned entry
@throws IllegalArgumentException if {@code n} is negative

### `filter([`com.google.common.collect.Multiset<E>`](./Multiset.md) unfiltered, [`com.google.common.base.Predicate<? super E>`](../base/Predicate.md) predicate)`

**Returns:** [`com.google.common.collect.Multiset<E>`](./Multiset.md)

Returns a view of the elements of {@code unfiltered} that satisfy a predicate. The returned
 multiset is a live view of {@code unfiltered}; changes to one affect the other.

 <p>The resulting multiset's iterators, and those of its {@code entrySet()} and {@code
 elementSet()}, do not support {@code remove()}. However, all other multiset methods supported
 by {@code unfiltered} are supported by the returned multiset. When given an element that
 doesn't satisfy the predicate, the multiset's {@code add()} and {@code addAll()} methods throw
 an {@link IllegalArgumentException}. When methods such as {@code removeAll()} and {@code
 clear()} are called on the filtered multiset, only elements that satisfy the filter will be
 removed from the underlying multiset.

 <p>The returned multiset isn't threadsafe or serializable, even if {@code unfiltered} is.

 <p>Many of the filtered multiset's methods, such as {@code size()}, iterate across every
 element in the underlying multiset and determine which elements satisfy the filter. When a live
 view is <i>not</i> needed, it may be faster to copy the returned multiset and use the copy.

 <p><b>Warning:</b> {@code predicate} must be <i>consistent with equals</i>, as documented at
 {@link Predicate#apply}. Do not provide a predicate such as {@code
 Predicates.instanceOf(ArrayList.class)}, which is inconsistent with equals. (See {@link Iterables#filter(Iterable, Class)} for related functionality.)
@since 14.0

### `inferDistinctElements(`java.lang.Iterable<?>` elements)`

**Returns:** `int`

Returns the expected number of distinct elements given the specified elements. The number of
 distinct elements is only computed if {@code elements} is an instance of {@code Multiset};
 otherwise the default value of 11 is returned.

### `union([`com.google.common.collect.Multiset<? extends E>`](./Multiset.md) multiset1, [`com.google.common.collect.Multiset<? extends E>`](./Multiset.md) multiset2)`

**Returns:** [`com.google.common.collect.Multiset<E>`](./Multiset.md)

Returns an unmodifiable view of the union of two multisets. In the returned multiset, the count
 of each element is the <i>maximum</i> of its counts in the two backing multisets. The iteration
 order of the returned multiset matches that of the element set of {@code multiset1} followed by
 the members of the element set of {@code multiset2} that are not contained in {@code
 multiset1}, with repeated occurrences of the same element appearing consecutively.

 <p>Results are undefined if {@code multiset1} and {@code multiset2} are based on different
 equivalence relations (as {@code HashMultiset} and {@code TreeMultiset} are).
@since 14.0

### `intersection([`com.google.common.collect.Multiset<E>`](./Multiset.md) multiset1, [`com.google.common.collect.Multiset<?>`](./Multiset.md) multiset2)`

**Returns:** [`com.google.common.collect.Multiset<E>`](./Multiset.md)

Returns an unmodifiable view of the intersection of two multisets. In the returned multiset,
 the count of each element is the <i>minimum</i> of its counts in the two backing multisets,
 with elements that would have a count of 0 not included. The iteration order of the returned
 multiset matches that of the element set of {@code multiset1}, with repeated occurrences of the
 same element appearing consecutively.

 <p>Results are undefined if {@code multiset1} and {@code multiset2} are based on different
 equivalence relations (as {@code HashMultiset} and {@code TreeMultiset} are).
@since 2.0

### `sum([`com.google.common.collect.Multiset<? extends E>`](./Multiset.md) multiset1, [`com.google.common.collect.Multiset<? extends E>`](./Multiset.md) multiset2)`

**Returns:** [`com.google.common.collect.Multiset<E>`](./Multiset.md)

Returns an unmodifiable view of the sum of two multisets. In the returned multiset, the count
 of each element is the <i>sum</i> of its counts in the two backing multisets. The iteration
 order of the returned multiset matches that of the element set of {@code multiset1} followed by
 the members of the element set of {@code multiset2} that are not contained in {@code
 multiset1}, with repeated occurrences of the same element appearing consecutively.

 <p>Results are undefined if {@code multiset1} and {@code multiset2} are based on different
 equivalence relations (as {@code HashMultiset} and {@code TreeMultiset} are).
@since 14.0

### `difference([`com.google.common.collect.Multiset<E>`](./Multiset.md) multiset1, [`com.google.common.collect.Multiset<?>`](./Multiset.md) multiset2)`

**Returns:** [`com.google.common.collect.Multiset<E>`](./Multiset.md)

Returns an unmodifiable view of the difference of two multisets. In the returned multiset, the
 count of each element is the result of the <i>zero-truncated subtraction</i> of its count in
 the second multiset from its count in the first multiset, with elements that would have a count
 of 0 not included. The iteration order of the returned multiset matches that of the element set
 of {@code multiset1}, with repeated occurrences of the same element appearing consecutively.

 <p>Results are undefined if {@code multiset1} and {@code multiset2} are based on different
 equivalence relations (as {@code HashMultiset} and {@code TreeMultiset} are).
@since 14.0

### `containsOccurrences([`com.google.common.collect.Multiset<?>`](./Multiset.md) superMultiset, [`com.google.common.collect.Multiset<?>`](./Multiset.md) subMultiset)`

**Returns:** `boolean`

Returns {@code true} if {@code subMultiset.count(o) <= superMultiset.count(o)} for all {@code
 o}.
@since 10.0

### `retainOccurrences([`com.google.common.collect.Multiset<?>`](./Multiset.md) multisetToModify, [`com.google.common.collect.Multiset<?>`](./Multiset.md) multisetToRetain)`

**Returns:** `boolean`

Modifies {@code multisetToModify} so that its count for an element {@code e} is at most {@code
 multisetToRetain.count(e)}.

 <p>To be precise, {@code multisetToModify.count(e)} is set to {@code
 Math.min(multisetToModify.count(e), multisetToRetain.count(e))}. This is similar to {@link #intersection(Multiset, Multiset) intersection} {@code (multisetToModify, multisetToRetain)},
 but mutates {@code multisetToModify} instead of returning a view.

 <p>In contrast, {@code multisetToModify.retainAll(multisetToRetain)} keeps all occurrences of
 elements that appear at all in {@code multisetToRetain}, and deletes all occurrences of all
 other elements.
@return {@code true} if {@code multisetToModify} was changed as a result of this operation
@since 10.0

### `retainOccurrencesImpl([`com.google.common.collect.Multiset<E>`](./Multiset.md) multisetToModify, [`com.google.common.collect.Multiset<?>`](./Multiset.md) occurrencesToRetain)`

**Returns:** `boolean`

Delegate implementation which cares about the element type.

### `removeOccurrences([`com.google.common.collect.Multiset<?>`](./Multiset.md) multisetToModify, `java.lang.Iterable<?>` occurrencesToRemove)`

**Returns:** `boolean`

For each occurrence of an element {@code e} in {@code occurrencesToRemove}, removes one
 occurrence of {@code e} in {@code multisetToModify}.

 <p>Equivalently, this method modifies {@code multisetToModify} so that {@code
 multisetToModify.count(e)} is set to {@code Math.max(0, multisetToModify.count(e) -
 Iterables.frequency(occurrencesToRemove, e))}.

 <p>This is <i>not</i> the same as {@code multisetToModify.} {@link Multiset#removeAll removeAll}{@code (occurrencesToRemove)}, which removes all occurrences of elements that appear
 in {@code occurrencesToRemove}. However, this operation <i>is</i> equivalent to, albeit
 sometimes more efficient than, the following:

 <pre>{@code
 for (E e : occurrencesToRemove) {
   multisetToModify.remove(e);
 }
 }</pre>
@return {@code true} if {@code multisetToModify} was changed as a result of this operation
@since 18.0 (present in 10.0 with a requirement that the second parameter be a {@code
     Multiset})

### `removeOccurrences([`com.google.common.collect.Multiset<?>`](./Multiset.md) multisetToModify, [`com.google.common.collect.Multiset<?>`](./Multiset.md) occurrencesToRemove)`

**Returns:** `boolean`

For each occurrence of an element {@code e} in {@code occurrencesToRemove}, removes one
 occurrence of {@code e} in {@code multisetToModify}.

 <p>Equivalently, this method modifies {@code multisetToModify} so that {@code
 multisetToModify.count(e)} is set to {@code Math.max(0, multisetToModify.count(e) -
 occurrencesToRemove.count(e))}.

 <p>This is <i>not</i> the same as {@code multisetToModify.} {@link Multiset#removeAll removeAll}{@code (occurrencesToRemove)}, which removes all occurrences of elements that appear
 in {@code occurrencesToRemove}. However, this operation <i>is</i> equivalent to, albeit
 sometimes more efficient than, the following:

 <pre>{@code
 for (E e : occurrencesToRemove) {
   multisetToModify.remove(e);
 }
 }</pre>
@return {@code true} if {@code multisetToModify} was changed as a result of this operation
@since 10.0 (missing in 18.0 when only the overload taking an {@code Iterable} was present)

### `equalsImpl([`com.google.common.collect.Multiset<?>`](./Multiset.md) multiset, `java.lang.Object` object)`

**Returns:** `boolean`

An implementation of {@link Multiset#equals}.

### `addAllImpl([`com.google.common.collect.Multiset<E>`](./Multiset.md) self, [`java.util.Collection<? extends E>`](../../../../java/util/Collection.md) elements)`

**Returns:** `boolean`

An implementation of {@link Multiset#addAll}.

### `addAllImpl([`com.google.common.collect.Multiset<E>`](./Multiset.md) self, [`com.google.common.collect.Multiset<? extends E>`](./Multiset.md) elements)`

**Returns:** `boolean`

A specialization of {@code addAllImpl} for when {@code elements} is itself a Multiset.

### `removeAllImpl([`com.google.common.collect.Multiset<?>`](./Multiset.md) self, [`java.util.Collection<?>`](../../../../java/util/Collection.md) elementsToRemove)`

**Returns:** `boolean`

An implementation of {@link Multiset#removeAll}.

### `retainAllImpl([`com.google.common.collect.Multiset<?>`](./Multiset.md) self, [`java.util.Collection<?>`](../../../../java/util/Collection.md) elementsToRetain)`

**Returns:** `boolean`

An implementation of {@link Multiset#retainAll}.

### `setCountImpl([`com.google.common.collect.Multiset<E>`](./Multiset.md) self, [`E`](E.md) element, `int` count)`

**Returns:** `int`

An implementation of {@link Multiset#setCount(Object, int)}.

### `setCountImpl([`com.google.common.collect.Multiset<E>`](./Multiset.md) self, [`E`](E.md) element, `int` oldCount, `int` newCount)`

**Returns:** `boolean`

An implementation of {@link Multiset#setCount(Object, int, int)}.

### `elementIterator([`java.util.Iterator<com.google.common.collect.Multiset.Entry<E>>`](../../../../java/util/Iterator>.md) entryIterator)`

**Returns:** [`java.util.Iterator<E>`](../../../../java/util/Iterator.md)

### `iteratorImpl([`com.google.common.collect.Multiset<E>`](./Multiset.md) multiset)`

**Returns:** [`java.util.Iterator<E>`](../../../../java/util/Iterator.md)

An implementation of {@link Multiset#iterator}.

### `spliteratorImpl([`com.google.common.collect.Multiset<E>`](./Multiset.md) multiset)`

**Returns:** [`java.util.Spliterator<E>`](../../../../java/util/Spliterator.md)

### `linearTimeSizeImpl([`com.google.common.collect.Multiset<?>`](./Multiset.md) multiset)`

**Returns:** `int`

An implementation of {@link Multiset#size}.

### `cast(`java.lang.Iterable<T>` iterable)`

**Returns:** [`com.google.common.collect.Multiset<T>`](./Multiset.md)

Used to avoid http://bugs.sun.com/view_bug.do?bug_id=6558557

### `copyHighestCountFirst([`com.google.common.collect.Multiset<E>`](./Multiset.md) multiset)`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

Returns a copy of {@code multiset} as an {@link ImmutableMultiset} whose iteration order puts
 the highest count first, with ties broken by the iteration order of the original multiset.
@since 11.0

