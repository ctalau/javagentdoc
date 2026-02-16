# Class: `Iterators`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Iterators`

## Description

This class contains static utility methods that operate on or return objects of type {@link Iterator}. Except as noted, each method has a corresponding {@link Iterable}-based method in the
 {@link Iterables} class.

 <p><i>Performance notes:</i> Unless otherwise noted, all of the iterators produced in this class
 are <i>lazy</i>, which means that they only advance the backing iteration when absolutely
 necessary.

 <p>See the Guava User Guide section on <a href="https://github.com/google/guava/wiki/CollectionUtilitiesExplained#iterables">{@code
 Iterators}</a>.
@author Kevin Bourrillion
@author Jared Levy
@since 2.0

## Constructors

### `<init>()`

## Methods

### `emptyIterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<T>`](./UnmodifiableIterator.md)

Returns the empty iterator.

 <p>The {@link Iterable} equivalent of this method is {@link ImmutableSet#of()}.

### `emptyListIterator()`

**Returns:** [`com.google.common.collect.UnmodifiableListIterator<T>`](./UnmodifiableListIterator.md)

Returns the empty iterator.

 <p>The {@link Iterable} equivalent of this method is {@link ImmutableSet#of()}.

### `emptyModifiableIterator()`

**Returns:** [`java.util.Iterator<T>`](../../../../java/util/Iterator.md)

Returns the empty {@code Iterator} that throws {@link IllegalStateException} instead of {@link UnsupportedOperationException} on a call to {@link Iterator#remove()}.

### `unmodifiableIterator([`java.util.Iterator<? extends T>`](../../../../java/util/Iterator.md) iterator)`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<T>`](./UnmodifiableIterator.md)

Returns an unmodifiable view of {@code iterator}.

### `unmodifiableIterator([`com.google.common.collect.UnmodifiableIterator<T>`](./UnmodifiableIterator.md) iterator)`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<T>`](./UnmodifiableIterator.md)

Simply returns its argument.
@deprecated no need to use this
@since 10.0

### `size([`java.util.Iterator<?>`](../../../../java/util/Iterator.md) iterator)`

**Returns:** `int`

Returns the number of elements remaining in {@code iterator}. The iterator will be left
 exhausted: its {@code hasNext()} method will return {@code false}.

### `contains([`java.util.Iterator<?>`](../../../../java/util/Iterator.md) iterator, `java.lang.Object` element)`

**Returns:** `boolean`

Returns {@code true} if {@code iterator} contains {@code element}.

### `removeAll([`java.util.Iterator<?>`](../../../../java/util/Iterator.md) removeFrom, [`java.util.Collection<?>`](../../../../java/util/Collection.md) elementsToRemove)`

**Returns:** `boolean`

Traverses an iterator and removes every element that belongs to the provided collection. The
 iterator will be left exhausted: its {@code hasNext()} method will return {@code false}.
@param removeFrom the iterator to (potentially) remove elements from
@param elementsToRemove the elements to remove
@return {@code true} if any element was removed from {@code iterator}

### `removeIf([`java.util.Iterator<T>`](../../../../java/util/Iterator.md) removeFrom, [`com.google.common.base.Predicate<? super T>`](../base/Predicate.md) predicate)`

**Returns:** `boolean`

Removes every element that satisfies the provided predicate from the iterator. The iterator
 will be left exhausted: its {@code hasNext()} method will return {@code false}.
@param removeFrom the iterator to (potentially) remove elements from
@param predicate a predicate that determines whether an element should be removed
@return {@code true} if any elements were removed from the iterator
@since 2.0

### `retainAll([`java.util.Iterator<?>`](../../../../java/util/Iterator.md) removeFrom, [`java.util.Collection<?>`](../../../../java/util/Collection.md) elementsToRetain)`

**Returns:** `boolean`

Traverses an iterator and removes every element that does not belong to the provided
 collection. The iterator will be left exhausted: its {@code hasNext()} method will return
 {@code false}.
@param removeFrom the iterator to (potentially) remove elements from
@param elementsToRetain the elements to retain
@return {@code true} if any element was removed from {@code iterator}

### `elementsEqual([`java.util.Iterator<?>`](../../../../java/util/Iterator.md) iterator1, [`java.util.Iterator<?>`](../../../../java/util/Iterator.md) iterator2)`

**Returns:** `boolean`

Determines whether two iterators contain equal elements in the same order. More specifically,
 this method returns {@code true} if {@code iterator1} and {@code iterator2} contain the same
 number of elements and every element of {@code iterator1} is equal to the corresponding element
 of {@code iterator2}.

 <p>Note that this will modify the supplied iterators, since they will have been advanced some
 number of elements forward.

### `toString([`java.util.Iterator<?>`](../../../../java/util/Iterator.md) iterator)`

**Returns:** `java.lang.String`

Returns a string representation of {@code iterator}, with the format {@code [e1, e2, ..., en]}.
 The iterator will be left exhausted: its {@code hasNext()} method will return {@code false}.

### `getOnlyElement([`java.util.Iterator<T>`](../../../../java/util/Iterator.md) iterator)`

**Returns:** [`T`](T.md)

Returns the single element contained in {@code iterator}.
@throws NoSuchElementException if the iterator is empty
@throws IllegalArgumentException if the iterator contains multiple elements. The state of the
     iterator is unspecified.

### `getOnlyElement([`java.util.Iterator<? extends T>`](../../../../java/util/Iterator.md) iterator, [`T`](T.md) defaultValue)`

**Returns:** [`T`](T.md)

Returns the single element contained in {@code iterator}, or {@code defaultValue} if the
 iterator is empty.
@throws IllegalArgumentException if the iterator contains multiple elements. The state of the
     iterator is unspecified.

### `toArray([`java.util.Iterator<? extends T>`](../../../../java/util/Iterator.md) iterator, `java.lang.Class<@org.checkerframework.checker.nullness.qual.NonNull T>` type)`

**Returns:** [`T[]`](T.md)

Copies an iterator's elements into an array. The iterator will be left exhausted: its {@code
 hasNext()} method will return {@code false}.
@param iterator the iterator to copy
@param type the type of the elements
@return a newly-allocated array into which all the elements of the iterator have been copied

### `addAll([`java.util.Collection<T>`](../../../../java/util/Collection.md) addTo, [`java.util.Iterator<? extends T>`](../../../../java/util/Iterator.md) iterator)`

**Returns:** `boolean`

Adds all elements in {@code iterator} to {@code collection}. The iterator will be left
 exhausted: its {@code hasNext()} method will return {@code false}.
@return {@code true} if {@code collection} was modified as a result of this operation

### `frequency([`java.util.Iterator<?>`](../../../../java/util/Iterator.md) iterator, `java.lang.Object` element)`

**Returns:** `int`

Returns the number of elements in the specified iterator that equal the specified object. The
 iterator will be left exhausted: its {@code hasNext()} method will return {@code false}.
@see Collections#frequency

### `cycle(`java.lang.Iterable<T>` iterable)`

**Returns:** [`java.util.Iterator<T>`](../../../../java/util/Iterator.md)

Returns an iterator that cycles indefinitely over the elements of {@code iterable}.

 <p>The returned iterator supports {@code remove()} if the provided iterator does. After {@code
 remove()} is called, subsequent cycles omit the removed element, which is no longer in {@code
 iterable}. The iterator's {@code hasNext()} method returns {@code true} until {@code iterable}
 is empty.

 <p><b>Warning:</b> Typical uses of the resulting iterator may produce an infinite loop. You
 should use an explicit {@code break} or be certain that you will eventually remove all the
 elements.

### `cycle([`T[]`](T.md) elements)`

**Returns:** [`java.util.Iterator<T>`](../../../../java/util/Iterator.md)

Returns an iterator that cycles indefinitely over the provided elements.

 <p>The returned iterator supports {@code remove()}. After {@code remove()} is called,
 subsequent cycles omit the removed element, but {@code elements} does not change. The
 iterator's {@code hasNext()} method returns {@code true} until all of the original elements
 have been removed.

 <p><b>Warning:</b> Typical uses of the resulting iterator may produce an infinite loop. You
 should use an explicit {@code break} or be certain that you will eventually remove all the
 elements.

### `consumingForArray([`@org.checkerframework.checker.nullness.qual.Nullable I[]`](../../../../@org/checkerframework/checker/nullness/qual/Nullable I.md) elements)`

**Returns:** [`java.util.Iterator<I>`](../../../../java/util/Iterator.md)

Returns an Iterator that walks the specified array, nulling out elements behind it. This can
 avoid memory leaks when an element is no longer necessary.

 <p>This method accepts an array with element type {@code @Nullable T}, but callers must pass an
 array whose contents are initially non-null. The {@code @Nullable} annotation indicates that
 this method will write nulls into the array during iteration.

 <p>This is mainly just to avoid the intermediate ArrayDeque in ConsumingQueueIterator.

### `concat([`java.util.Iterator<? extends T>`](../../../../java/util/Iterator.md) a, [`java.util.Iterator<? extends T>`](../../../../java/util/Iterator.md) b)`

**Returns:** [`java.util.Iterator<T>`](../../../../java/util/Iterator.md)

Combines two iterators into a single iterator. The returned iterator iterates across the
 elements in {@code a}, followed by the elements in {@code b}. The source iterators are not
 polled until necessary.

 <p>The returned iterator supports {@code remove()} when the corresponding input iterator
 supports it.

### `concat([`java.util.Iterator<? extends T>`](../../../../java/util/Iterator.md) a, [`java.util.Iterator<? extends T>`](../../../../java/util/Iterator.md) b, [`java.util.Iterator<? extends T>`](../../../../java/util/Iterator.md) c)`

**Returns:** [`java.util.Iterator<T>`](../../../../java/util/Iterator.md)

Combines three iterators into a single iterator. The returned iterator iterates across the
 elements in {@code a}, followed by the elements in {@code b}, followed by the elements in
 {@code c}. The source iterators are not polled until necessary.

 <p>The returned iterator supports {@code remove()} when the corresponding input iterator
 supports it.

### `concat([`java.util.Iterator<? extends T>`](../../../../java/util/Iterator.md) a, [`java.util.Iterator<? extends T>`](../../../../java/util/Iterator.md) b, [`java.util.Iterator<? extends T>`](../../../../java/util/Iterator.md) c, [`java.util.Iterator<? extends T>`](../../../../java/util/Iterator.md) d)`

**Returns:** [`java.util.Iterator<T>`](../../../../java/util/Iterator.md)

Combines four iterators into a single iterator. The returned iterator iterates across the
 elements in {@code a}, followed by the elements in {@code b}, followed by the elements in
 {@code c}, followed by the elements in {@code d}. The source iterators are not polled until
 necessary.

 <p>The returned iterator supports {@code remove()} when the corresponding input iterator
 supports it.

### `concat([`java.util.Iterator<? extends T>[]`](../../../../java/util/Iterator.md) inputs)`

**Returns:** [`java.util.Iterator<T>`](../../../../java/util/Iterator.md)

Combines multiple iterators into a single iterator. The returned iterator iterates across the
 elements of each iterator in {@code inputs}. The input iterators are not polled until
 necessary.

 <p>The returned iterator supports {@code remove()} when the corresponding input iterator
 supports it.
@throws NullPointerException if any of the provided iterators is null

### `concat([`java.util.Iterator<? extends java.util.Iterator<? extends T>>`](../../../../java/util/Iterator>.md) inputs)`

**Returns:** [`java.util.Iterator<T>`](../../../../java/util/Iterator.md)

Combines multiple iterators into a single iterator. The returned iterator iterates across the
 elements of each iterator in {@code inputs}. The input iterators are not polled until
 necessary.

 <p>The returned iterator supports {@code remove()} when the corresponding input iterator
 supports it. The methods of the returned iterator may throw {@code NullPointerException} if any
 of the input iterators is null.

### `concatNoDefensiveCopy([`java.util.Iterator<? extends T>[]`](../../../../java/util/Iterator.md) inputs)`

**Returns:** [`java.util.Iterator<T>`](../../../../java/util/Iterator.md)

Concats a varargs array of iterators without making a defensive copy of the array.

### `partition([`java.util.Iterator<T>`](../../../../java/util/Iterator.md) iterator, `int` size)`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<java.util.List<T>>`](./UnmodifiableIterator>.md)

Divides an iterator into unmodifiable sublists of the given size (the final list may be
 smaller). For example, partitioning an iterator containing {@code [a, b, c, d, e]} with a
 partition size of 3 yields {@code [[a, b, c], [d, e]]} -- an outer iterator containing two
 inner lists of three and two elements, all in the original order.

 <p>The returned lists implement {@link java.util.RandomAccess}.

 <p><b>Note:</b> The current implementation eagerly allocates storage for {@code size} elements.
 As a consequence, passing values like {@code Integer.MAX_VALUE} can lead to {@link OutOfMemoryError}.
@param iterator the iterator to return a partitioned view of
@param size the desired size of each partition (the last may be smaller)
@return an iterator of immutable lists containing the elements of {@code iterator} divided into
     partitions
@throws IllegalArgumentException if {@code size} is nonpositive

### `paddedPartition([`java.util.Iterator<T>`](../../../../java/util/Iterator.md) iterator, `int` size)`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<java.util.List<@org.checkerframework.checker.nullness.qual.Nullable T>>`](./UnmodifiableIterator>.md)

Divides an iterator into unmodifiable sublists of the given size, padding the final iterator
 with null values if necessary. For example, partitioning an iterator containing {@code [a, b,
 c, d, e]} with a partition size of 3 yields {@code [[a, b, c], [d, e, null]]} -- an outer
 iterator containing two inner lists of three elements each, all in the original order.

 <p>The returned lists implement {@link java.util.RandomAccess}.
@param iterator the iterator to return a partitioned view of
@param size the desired size of each partition
@return an iterator of immutable lists containing the elements of {@code iterator} divided into
     partitions (the final iterable may have trailing null elements)
@throws IllegalArgumentException if {@code size} is nonpositive

### `partitionImpl([`java.util.Iterator<T>`](../../../../java/util/Iterator.md) iterator, `int` size, `boolean` pad)`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<java.util.List<@org.checkerframework.checker.nullness.qual.Nullable T>>`](./UnmodifiableIterator>.md)

### `filter([`java.util.Iterator<T>`](../../../../java/util/Iterator.md) unfiltered, [`com.google.common.base.Predicate<? super T>`](../base/Predicate.md) retainIfTrue)`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<T>`](./UnmodifiableIterator.md)

Returns a view of {@code unfiltered} containing all elements that satisfy the input predicate
 {@code retainIfTrue}.

### `filter([`java.util.Iterator<?>`](../../../../java/util/Iterator.md) unfiltered, `java.lang.Class<T>` desiredType)`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<T>`](./UnmodifiableIterator.md)

Returns a view of {@code unfiltered} containing all elements that are of the type {@code
 desiredType}.

### `any([`java.util.Iterator<T>`](../../../../java/util/Iterator.md) iterator, [`com.google.common.base.Predicate<? super T>`](../base/Predicate.md) predicate)`

**Returns:** `boolean`

Returns {@code true} if one or more elements returned by {@code iterator} satisfy the given
 predicate.

### `all([`java.util.Iterator<T>`](../../../../java/util/Iterator.md) iterator, [`com.google.common.base.Predicate<? super T>`](../base/Predicate.md) predicate)`

**Returns:** `boolean`

Returns {@code true} if every element returned by {@code iterator} satisfies the given
 predicate. If {@code iterator} is empty, {@code true} is returned.

### `find([`java.util.Iterator<T>`](../../../../java/util/Iterator.md) iterator, [`com.google.common.base.Predicate<? super T>`](../base/Predicate.md) predicate)`

**Returns:** [`T`](T.md)

Returns the first element in {@code iterator} that satisfies the given predicate; use this
 method only when such an element is known to exist. If no such element is found, the iterator
 will be left exhausted: its {@code hasNext()} method will return {@code false}. If it is
 possible that <i>no</i> element will match, use {@link #tryFind} or {@link #find(Iterator,
 Predicate, Object)} instead.
@throws NoSuchElementException if no element in {@code iterator} matches the given predicate

### `find([`java.util.Iterator<? extends T>`](../../../../java/util/Iterator.md) iterator, [`com.google.common.base.Predicate<? super T>`](../base/Predicate.md) predicate, [`T`](T.md) defaultValue)`

**Returns:** [`T`](T.md)

Returns the first element in {@code iterator} that satisfies the given predicate. If no such
 element is found, {@code defaultValue} will be returned from this method and the iterator will
 be left exhausted: its {@code hasNext()} method will return {@code false}. Note that this can
 usually be handled more naturally using {@code tryFind(iterator, predicate).or(defaultValue)}.
@since 7.0

### `tryFind([`java.util.Iterator<T>`](../../../../java/util/Iterator.md) iterator, [`com.google.common.base.Predicate<? super T>`](../base/Predicate.md) predicate)`

**Returns:** [`com.google.common.base.Optional<T>`](../base/Optional.md)

Returns an {@link Optional} containing the first element in {@code iterator} that satisfies the
 given predicate, if such an element exists. If no such element is found, an empty {@link Optional} will be returned from this method and the iterator will be left exhausted: its {@code
 hasNext()} method will return {@code false}.

 <p><b>Warning:</b> avoid using a {@code predicate} that matches {@code null}. If {@code null}
 is matched in {@code iterator}, a NullPointerException will be thrown.
@since 11.0

### `indexOf([`java.util.Iterator<T>`](../../../../java/util/Iterator.md) iterator, [`com.google.common.base.Predicate<? super T>`](../base/Predicate.md) predicate)`

**Returns:** `int`

Returns the index in {@code iterator} of the first element that satisfies the provided {@code
 predicate}, or {@code -1} if the Iterator has no such elements.

 <p>More formally, returns the lowest index {@code i} such that {@code
 predicate.apply(Iterators.get(iterator, i))} returns {@code true}, or {@code -1} if there is no
 such index.

 <p>If -1 is returned, the iterator will be left exhausted: its {@code hasNext()} method will
 return {@code false}. Otherwise, the iterator will be set to the element which satisfies the
 {@code predicate}.
@since 2.0

### `transform([`java.util.Iterator<F>`](../../../../java/util/Iterator.md) fromIterator, [`com.google.common.base.Function<? super F,? extends T>`](../base/Function.md) function)`

**Returns:** [`java.util.Iterator<T>`](../../../../java/util/Iterator.md)

Returns a view containing the result of applying {@code function} to each element of {@code
 fromIterator}.

 <p>The returned iterator supports {@code remove()} if {@code fromIterator} does. After a
 successful {@code remove()} call, {@code fromIterator} no longer contains the corresponding
 element.

### `get([`java.util.Iterator<T>`](../../../../java/util/Iterator.md) iterator, `int` position)`

**Returns:** [`T`](T.md)

Advances {@code iterator} {@code position + 1} times, returning the element at the {@code
 position}th position.
@param position position of the element to return
@return the element at the specified position in {@code iterator}
@throws IndexOutOfBoundsException if {@code position} is negative or greater than or equal to
     the number of elements remaining in {@code iterator}

### `get([`java.util.Iterator<? extends T>`](../../../../java/util/Iterator.md) iterator, `int` position, [`T`](T.md) defaultValue)`

**Returns:** [`T`](T.md)

Advances {@code iterator} {@code position + 1} times, returning the element at the {@code
 position}th position or {@code defaultValue} otherwise.
@param position position of the element to return
@param defaultValue the default value to return if the iterator is empty or if {@code position}
     is greater than the number of elements remaining in {@code iterator}
@return the element at the specified position in {@code iterator} or {@code defaultValue} if
     {@code iterator} produces fewer than {@code position + 1} elements.
@throws IndexOutOfBoundsException if {@code position} is negative
@since 4.0

### `checkNonnegative(`int` position)`

**Returns:** `void`

### `getNext([`java.util.Iterator<? extends T>`](../../../../java/util/Iterator.md) iterator, [`T`](T.md) defaultValue)`

**Returns:** [`T`](T.md)

Returns the next element in {@code iterator} or {@code defaultValue} if the iterator is empty.
 The {@link Iterables} analog to this method is {@link Iterables#getFirst}.
@param defaultValue the default value to return if the iterator is empty
@return the next element of {@code iterator} or the default value
@since 7.0

### `getLast([`java.util.Iterator<T>`](../../../../java/util/Iterator.md) iterator)`

**Returns:** [`T`](T.md)

Advances {@code iterator} to the end, returning the last element.
@return the last element of {@code iterator}
@throws NoSuchElementException if the iterator is empty

### `getLast([`java.util.Iterator<? extends T>`](../../../../java/util/Iterator.md) iterator, [`T`](T.md) defaultValue)`

**Returns:** [`T`](T.md)

Advances {@code iterator} to the end, returning the last element or {@code defaultValue} if the
 iterator is empty.
@param defaultValue the default value to return if the iterator is empty
@return the last element of {@code iterator}
@since 3.0

### `advance([`java.util.Iterator<?>`](../../../../java/util/Iterator.md) iterator, `int` numberToAdvance)`

**Returns:** `int`

Calls {@code next()} on {@code iterator}, either {@code numberToAdvance} times or until {@code
 hasNext()} returns {@code false}, whichever comes first.
@return the number of elements the iterator was advanced
@since 13.0 (since 3.0 as {@code Iterators.skip})

### `limit([`java.util.Iterator<T>`](../../../../java/util/Iterator.md) iterator, `int` limitSize)`

**Returns:** [`java.util.Iterator<T>`](../../../../java/util/Iterator.md)

Returns a view containing the first {@code limitSize} elements of {@code iterator}. If {@code
 iterator} contains fewer than {@code limitSize} elements, the returned view contains all of its
 elements. The returned iterator supports {@code remove()} if {@code iterator} does.
@param iterator the iterator to limit
@param limitSize the maximum number of elements in the returned iterator
@throws IllegalArgumentException if {@code limitSize} is negative
@since 3.0

### `consumingIterator([`java.util.Iterator<T>`](../../../../java/util/Iterator.md) iterator)`

**Returns:** [`java.util.Iterator<T>`](../../../../java/util/Iterator.md)

Returns a view of the supplied {@code iterator} that removes each element from the supplied
 {@code iterator} as it is returned.

 <p>The provided iterator must support {@link Iterator#remove()} or else the returned iterator
 will fail on the first call to {@code next}. The returned {@link Iterator} is also not
 thread-safe.
@param iterator the iterator to remove and return elements from
@return an iterator that removes and returns elements from the supplied iterator
@since 2.0

### `pollNext([`java.util.Iterator<T>`](../../../../java/util/Iterator.md) iterator)`

**Returns:** [`T`](T.md)

Deletes and returns the next value from the iterator, or returns {@code null} if there is no
 such value.

### `clear([`java.util.Iterator<?>`](../../../../java/util/Iterator.md) iterator)`

**Returns:** `void`

Clears the iterator using its remove method.

### `forArray([`T[]`](T.md) array)`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<T>`](./UnmodifiableIterator.md)

Returns an iterator containing the elements of {@code array} in order. The returned iterator is
 a view of the array; subsequent changes to the array will be reflected in the iterator.

 <p><b>Note:</b> It is often preferable to represent your data using a collection type, for
 example using {@link Arrays#asList(Object[])}, making this method unnecessary.

 <p>The {@code Iterable} equivalent of this method is either {@link Arrays#asList(Object[])},
 {@link ImmutableList#copyOf(Object[])}}, or {@link ImmutableList#of}.

### `forArrayWithPosition([`T[]`](T.md) array, `int` position)`

**Returns:** [`com.google.common.collect.UnmodifiableListIterator<T>`](./UnmodifiableListIterator.md)

Returns a list iterator containing the elements in the specified {@code array} in order,
 starting at the specified {@code position}.

 <p>The {@code Iterable} equivalent of this method is {@code
 Arrays.asList(array).listIterator(position)}.

### `singletonIterator([`T`](T.md) value)`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<T>`](./UnmodifiableIterator.md)

Returns an iterator containing only {@code value}.

 <p>The {@link Iterable} equivalent of this method is {@link Collections#singleton}.

### `forEnumeration([`java.util.Enumeration<T>`](../../../../java/util/Enumeration.md) enumeration)`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<T>`](./UnmodifiableIterator.md)

Adapts an {@code Enumeration} to the {@code Iterator} interface.

 <p>This method has no equivalent in {@link Iterables} because viewing an {@code Enumeration} as
 an {@code Iterable} is impossible. However, the contents can be <i>copied</i> into a collection
 using {@link Collections#list}.

 <p><b>Java 9 users:</b> use {@code enumeration.asIterator()} instead, unless it is important to
 return an {@code UnmodifiableIterator} instead of a plain {@code Iterator}.

### `asEnumeration([`java.util.Iterator<T>`](../../../../java/util/Iterator.md) iterator)`

**Returns:** [`java.util.Enumeration<T>`](../../../../java/util/Enumeration.md)

Adapts an {@code Iterator} to the {@code Enumeration} interface.

 <p>The {@code Iterable} equivalent of this method is either {@link Collections#enumeration} (if
 you have a {@link Collection}), or {@code Iterators.asEnumeration(collection.iterator())}.

### `peekingIterator([`java.util.Iterator<? extends T>`](../../../../java/util/Iterator.md) iterator)`

**Returns:** [`com.google.common.collect.PeekingIterator<T>`](./PeekingIterator.md)

Returns a {@code PeekingIterator} backed by the given iterator.

 <p>Calls to the {@code peek} method with no intervening calls to {@code next} do not affect the
 iteration, and hence return the same object each time. A subsequent call to {@code next} is
 guaranteed to return the same object again. For example:

 <pre>{@code
 PeekingIterator<String> peekingIterator =
     Iterators.peekingIterator(Iterators.forArray("a", "b"));
 String a1 = peekingIterator.peek(); // returns "a"
 String a2 = peekingIterator.peek(); // also returns "a"
 String a3 = peekingIterator.next(); // also returns "a"
 }</pre>

 <p>Any structural changes to the underlying iteration (aside from those performed by the
 iterator's own {@link PeekingIterator#remove()} method) will leave the iterator in an undefined
 state.

 <p>The returned iterator does not support removal after peeking, as explained by {@link PeekingIterator#remove()}.

 <p>Note: If the given iterator is already a {@code PeekingIterator}, it <i>might</i> be
 returned to the caller, although this is neither guaranteed to occur nor required to be
 consistent. For example, this method <i>might</i> choose to pass through recognized
 implementations of {@code PeekingIterator} when the behavior of the implementation is known to
 meet the contract guaranteed by this method.

 <p>There is no {@link Iterable} equivalent to this method, so use this method to wrap each
 individual iterator as it is generated.
@param iterator the backing iterator. The {@link PeekingIterator} assumes ownership of this
     iterator, so users should cease making direct calls to it after calling this method.
@return a peeking iterator backed by that iterator. Apart from the additional {@link PeekingIterator#peek()} method, this iterator behaves exactly the same as {@code iterator}.

### `peekingIterator([`com.google.common.collect.PeekingIterator<T>`](./PeekingIterator.md) iterator)`

**Returns:** [`com.google.common.collect.PeekingIterator<T>`](./PeekingIterator.md)

Simply returns its argument.
@deprecated no need to use this
@since 10.0

### `mergeSorted(`java.lang.Iterable<? extends java.util.Iterator<? extends T>>` iterators, [`java.util.Comparator<? super T>`](../../../../java/util/Comparator.md) comparator)`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<T>`](./UnmodifiableIterator.md)

Returns an iterator over the merged contents of all given {@code iterators}, traversing every
 element of the input iterators. Equivalent entries will not be de-duplicated.

 <p>Callers must ensure that the source {@code iterators} are in non-descending order as this
 method does not sort its input.

 <p>For any equivalent elements across all {@code iterators}, it is undefined which element is
 returned first.
@since 11.0

