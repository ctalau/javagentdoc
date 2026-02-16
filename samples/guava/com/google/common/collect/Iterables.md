# Class: `Iterables`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Iterables`

## Description

An assortment of mainly legacy static utility methods that operate on or return objects of type
 {@code Iterable}. Except as noted, each method has a corresponding {@link Iterator}-based method
 in the {@link Iterators} class.

 <p><b>Java 8 users:</b> several common uses for this class are now more comprehensively addressed
 by the new {@link java.util.stream.Stream} library. Read the method documentation below for
 comparisons. This class is not being deprecated, but we gently encourage you to migrate to
 streams.

 <p><i>Performance notes:</i> Unless otherwise noted, all of the iterables produced in this class
 are <i>lazy</i>, which means that their iterators only advance the backing iteration when
 absolutely necessary.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/CollectionUtilitiesExplained#iterables">{@code
 Iterables}</a>.
@author Kevin Bourrillion
@author Jared Levy
@since 2.0

## Constructors

### `<init>()`

## Methods

### `unmodifiableIterable(`java.lang.Iterable<? extends T>` iterable)`

**Returns:** `java.lang.Iterable<T>`

Returns an unmodifiable view of {@code iterable}.

### `unmodifiableIterable([`com.google.common.collect.ImmutableCollection<E>`](./ImmutableCollection.md) iterable)`

**Returns:** `java.lang.Iterable<E>`

Simply returns its argument.
@deprecated no need to use this
@since 10.0

### `size(`java.lang.Iterable<?>` iterable)`

**Returns:** `int`

Returns the number of elements in {@code iterable}.

### `contains(`java.lang.Iterable<? extends java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object>` iterable, `java.lang.Object` element)`

**Returns:** `boolean`

Returns {@code true} if {@code iterable} contains any element {@code o} for which {@code
 Objects.equals(o, element)} would return {@code true}. Otherwise returns {@code false}, even in
 cases where {@link Collection#contains} might throw {@link NullPointerException} or {@link ClassCastException}.

### `removeAll(`java.lang.Iterable<?>` removeFrom, [`java.util.Collection<?>`](../../../../java/util/Collection.md) elementsToRemove)`

**Returns:** `boolean`

Removes, from an iterable, every element that belongs to the provided collection.

 <p>This method calls {@link Collection#removeAll} if {@code iterable} is a collection, and
 {@link Iterators#removeAll} otherwise.
@param removeFrom the iterable to (potentially) remove elements from
@param elementsToRemove the elements to remove
@return {@code true} if any element was removed from {@code iterable}

### `retainAll(`java.lang.Iterable<?>` removeFrom, [`java.util.Collection<?>`](../../../../java/util/Collection.md) elementsToRetain)`

**Returns:** `boolean`

Removes, from an iterable, every element that does not belong to the provided collection.

 <p>This method calls {@link Collection#retainAll} if {@code iterable} is a collection, and
 {@link Iterators#retainAll} otherwise.
@param removeFrom the iterable to (potentially) remove elements from
@param elementsToRetain the elements to retain
@return {@code true} if any element was removed from {@code iterable}

### `removeIf(`java.lang.Iterable<T>` removeFrom, [`com.google.common.base.Predicate<? super T>`](../base/Predicate.md) predicate)`

**Returns:** `boolean`

Removes, from an iterable, every element that satisfies the provided predicate.

 <p>Removals may or may not happen immediately as each element is tested against the predicate.
 The behavior of this method is not specified if {@code predicate} is dependent on {@code
 removeFrom}.

 <p><b>Java 8 users:</b> if {@code removeFrom} is a {@link Collection}, use {@code
 removeFrom.removeIf(predicate)} instead.
@param removeFrom the iterable to (potentially) remove elements from
@param predicate a predicate that determines whether an element should be removed
@return {@code true} if any elements were removed from the iterable
@throws UnsupportedOperationException if the iterable does not support {@code remove()}.
@since 2.0

### `removeFirstMatching(`java.lang.Iterable<T>` removeFrom, [`com.google.common.base.Predicate<? super T>`](../base/Predicate.md) predicate)`

**Returns:** [`T`](T.md)

Removes and returns the first matching element, or returns {@code null} if there is none.

### `elementsEqual(`java.lang.Iterable<?>` iterable1, `java.lang.Iterable<?>` iterable2)`

**Returns:** `boolean`

Determines whether two iterables contain equal elements in the same order. More specifically,
 this method returns {@code true} if {@code iterable1} and {@code iterable2} contain the same
 number of elements and every element of {@code iterable1} is equal to the corresponding element
 of {@code iterable2}.

### `toString(`java.lang.Iterable<?>` iterable)`

**Returns:** `java.lang.String`

Returns a string representation of {@code iterable}, with the format {@code [e1, e2, ..., en]}
 (that is, identical to {@link java.util.Arrays Arrays}{@code
 .toString(Iterables.toArray(iterable))}). Note that for <i>most</i> implementations of {@link Collection}, {@code collection.toString()} also gives the same result, but that behavior is not
 generally guaranteed.

### `getOnlyElement(`java.lang.Iterable<T>` iterable)`

**Returns:** [`T`](T.md)

Returns the single element contained in {@code iterable}.

 <p><b>Java 8 users:</b> the {@code Stream} equivalent to this method is {@code
 stream.collect(MoreCollectors.onlyElement())}.
@throws NoSuchElementException if the iterable is empty
@throws IllegalArgumentException if the iterable contains multiple elements

### `getOnlyElement(`java.lang.Iterable<? extends T>` iterable, [`T`](T.md) defaultValue)`

**Returns:** [`T`](T.md)

Returns the single element contained in {@code iterable}, or {@code defaultValue} if the
 iterable is empty.

 <p><b>Java 8 users:</b> the {@code Stream} equivalent to this method is {@code
 stream.collect(MoreCollectors.toOptional()).orElse(defaultValue)}.
@throws IllegalArgumentException if the iterator contains multiple elements

### `toArray(`java.lang.Iterable<? extends T>` iterable, `java.lang.Class<@org.checkerframework.checker.nullness.qual.NonNull T>` type)`

**Returns:** [`T[]`](T.md)

Copies an iterable's elements into an array.
@param iterable the iterable to copy
@param type the type of the elements
@return a newly-allocated array into which all the elements of the iterable have been copied

### `toArray(`java.lang.Iterable<? extends T>` iterable, [`T[]`](T.md) array)`

**Returns:** [`T[]`](T.md)

### `toArray(`java.lang.Iterable<?>` iterable)`

**Returns:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`

Copies an iterable's elements into an array.
@param iterable the iterable to copy
@return a newly-allocated array into which all the elements of the iterable have been copied

### `castOrCopyToCollection(`java.lang.Iterable<E>` iterable)`

**Returns:** [`java.util.Collection<E>`](../../../../java/util/Collection.md)

Converts an iterable into a collection. If the iterable is already a collection, it is
 returned. Otherwise, an {@link java.util.ArrayList} is created with the contents of the
 iterable in the same iteration order.

### `addAll([`java.util.Collection<T>`](../../../../java/util/Collection.md) addTo, `java.lang.Iterable<? extends T>` elementsToAdd)`

**Returns:** `boolean`

Adds all elements in {@code iterable} to {@code collection}.
@return {@code true} if {@code collection} was modified as a result of this operation.

### `frequency(`java.lang.Iterable<?>` iterable, `java.lang.Object` element)`

**Returns:** `int`

Returns the number of elements in the specified iterable that equal the specified object. This
 implementation avoids a full iteration when the iterable is a {@link Multiset} or {@link Set}.

 <p><b>Java 8 users:</b> In most cases, the {@code Stream} equivalent of this method is {@code
 stream.filter(element::equals).count()}. If {@code element} might be null, use {@code
 stream.filter(Predicate.isEqual(element)).count()} instead.
@see java.util.Collections#frequency(Collection, Object) Collections.frequency(Collection,
     Object)

### `cycle(`java.lang.Iterable<T>` iterable)`

**Returns:** `java.lang.Iterable<T>`

Returns an iterable whose iterators cycle indefinitely over the elements of {@code iterable}.

 <p>That iterator supports {@code remove()} if {@code iterable.iterator()} does. After {@code
 remove()} is called, subsequent cycles omit the removed element, which is no longer in {@code
 iterable}. The iterator's {@code hasNext()} method returns {@code true} until {@code iterable}
 is empty.

 <p><b>Warning:</b> Typical uses of the resulting iterator may produce an infinite loop. You
 should use an explicit {@code break} or be certain that you will eventually remove all the
 elements.

 <p>To cycle over the iterable {@code n} times, use the following: {@code
 Iterables.concat(Collections.nCopies(n, iterable))}

 <p><b>Java 8 users:</b> The {@code Stream} equivalent of this method is {@code
 Stream.generate(() -> iterable).flatMap(Streams::stream)}.

### `cycle([`T[]`](T.md) elements)`

**Returns:** `java.lang.Iterable<T>`

Returns an iterable whose iterators cycle indefinitely over the provided elements.

 <p>After {@code remove} is invoked on a generated iterator, the removed element will no longer
 appear in either that iterator or any other iterator created from the same source iterable.
 That is, this method behaves exactly as {@code Iterables.cycle(Lists.newArrayList(elements))}.
 The iterator's {@code hasNext} method returns {@code true} until all of the original elements
 have been removed.

 <p><b>Warning:</b> Typical uses of the resulting iterator may produce an infinite loop. You
 should use an explicit {@code break} or be certain that you will eventually remove all the
 elements.

 <p>To cycle over the elements {@code n} times, use the following: {@code
 Iterables.concat(Collections.nCopies(n, Arrays.asList(elements)))}

 <p><b>Java 8 users:</b> If passing a single element {@code e}, the {@code Stream} equivalent of
 this method is {@code Stream.generate(() -> e)}. Otherwise, put the elements in a collection
 and use {@code Stream.generate(() -> collection).flatMap(Collection::stream)}.

### `concat(`java.lang.Iterable<? extends T>` a, `java.lang.Iterable<? extends T>` b)`

**Returns:** `java.lang.Iterable<T>`

Combines two iterables into a single iterable. The returned iterable has an iterator that
 traverses the elements in {@code a}, followed by the elements in {@code b}. The source
 iterators are not polled until necessary.

 <p>The returned iterable's iterator supports {@code remove()} when the corresponding input
 iterator supports it.

 <p><b>Java 8 users:</b> The {@code Stream} equivalent of this method is {@code Stream.concat(a,
 b)}.

### `concat(`java.lang.Iterable<? extends T>` a, `java.lang.Iterable<? extends T>` b, `java.lang.Iterable<? extends T>` c)`

**Returns:** `java.lang.Iterable<T>`

Combines three iterables into a single iterable. The returned iterable has an iterator that
 traverses the elements in {@code a}, followed by the elements in {@code b}, followed by the
 elements in {@code c}. The source iterators are not polled until necessary.

 <p>The returned iterable's iterator supports {@code remove()} when the corresponding input
 iterator supports it.

 <p><b>Java 8 users:</b> The {@code Stream} equivalent of this method is {@code
 Streams.concat(a, b, c)}.

### `concat(`java.lang.Iterable<? extends T>` a, `java.lang.Iterable<? extends T>` b, `java.lang.Iterable<? extends T>` c, `java.lang.Iterable<? extends T>` d)`

**Returns:** `java.lang.Iterable<T>`

Combines four iterables into a single iterable. The returned iterable has an iterator that
 traverses the elements in {@code a}, followed by the elements in {@code b}, followed by the
 elements in {@code c}, followed by the elements in {@code d}. The source iterators are not
 polled until necessary.

 <p>The returned iterable's iterator supports {@code remove()} when the corresponding input
 iterator supports it.

 <p><b>Java 8 users:</b> The {@code Stream} equivalent of this method is {@code
 Streams.concat(a, b, c, d)}.

### `concat(`java.lang.Iterable<? extends T>[]` inputs)`

**Returns:** `java.lang.Iterable<T>`

Combines multiple iterables into a single iterable. The returned iterable has an iterator that
 traverses the elements of each iterable in {@code inputs}. The input iterators are not polled
 until necessary.

 <p>The returned iterable's iterator supports {@code remove()} when the corresponding input
 iterator supports it.

 <p><b>Java 8 users:</b> The {@code Stream} equivalent of this method is {@code
 Streams.concat(...)}.
@throws NullPointerException if any of the provided iterables is null

### `concat(`java.lang.Iterable<? extends java.lang.Iterable<? extends T>>` inputs)`

**Returns:** `java.lang.Iterable<T>`

Combines multiple iterables into a single iterable. The returned iterable has an iterator that
 traverses the elements of each iterable in {@code inputs}. The input iterators are not polled
 until necessary.

 <p>The returned iterable's iterator supports {@code remove()} when the corresponding input
 iterator supports it. The methods of the returned iterable may throw {@code
 NullPointerException} if any of the input iterators is null.

 <p><b>Java 8 users:</b> The {@code Stream} equivalent of this method is {@code
 streamOfStreams.flatMap(s -> s)}.

### `partition(`java.lang.Iterable<T>` iterable, `int` size)`

**Returns:** `java.lang.Iterable<java.util.List<T>>`

Divides an iterable into unmodifiable sublists of the given size (the final iterable may be
 smaller). For example, partitioning an iterable containing {@code [a, b, c, d, e]} with a
 partition size of 3 yields {@code [[a, b, c], [d, e]]} -- an outer iterable containing two
 inner lists of three and two elements, all in the original order.

 <p>Iterators returned by the returned iterable do not support the {@link Iterator#remove()}
 method. The returned lists implement {@link RandomAccess}, whether or not the input list does.

 <p><b>Note:</b> The current implementation eagerly allocates storage for {@code size} elements.
 As a consequence, passing values like {@code Integer.MAX_VALUE} can lead to {@link OutOfMemoryError}.

 <p><b>Note:</b> if {@code iterable} is a {@link List}, use {@link Lists#partition(List, int)}
 instead.
@param iterable the iterable to return a partitioned view of
@param size the desired size of each partition (the last may be smaller)
@return an iterable of unmodifiable lists containing the elements of {@code iterable} divided
     into partitions
@throws IllegalArgumentException if {@code size} is nonpositive

### `paddedPartition(`java.lang.Iterable<T>` iterable, `int` size)`

**Returns:** `java.lang.Iterable<java.util.List<@org.checkerframework.checker.nullness.qual.Nullable T>>`

Divides an iterable into unmodifiable sublists of the given size, padding the final iterable
 with null values if necessary. For example, partitioning an iterable containing {@code [a, b,
 c, d, e]} with a partition size of 3 yields {@code [[a, b, c], [d, e, null]]} -- an outer
 iterable containing two inner lists of three elements each, all in the original order.

 <p>Iterators returned by the returned iterable do not support the {@link Iterator#remove()}
 method.
@param iterable the iterable to return a partitioned view of
@param size the desired size of each partition
@return an iterable of unmodifiable lists containing the elements of {@code iterable} divided
     into partitions (the final iterable may have trailing null elements)
@throws IllegalArgumentException if {@code size} is nonpositive

### `filter(`java.lang.Iterable<T>` unfiltered, [`com.google.common.base.Predicate<? super T>`](../base/Predicate.md) retainIfTrue)`

**Returns:** `java.lang.Iterable<T>`

Returns a view of {@code unfiltered} containing all elements that satisfy the input predicate
 {@code retainIfTrue}. The returned iterable's iterator does not support {@code remove()}.

 <p><b>{@code Stream} equivalent:</b> {@link Stream#filter}.

### `filter(`java.lang.Iterable<?>` unfiltered, `java.lang.Class<T>` desiredType)`

**Returns:** `java.lang.Iterable<T>`

Returns a view of {@code unfiltered} containing all elements that are of the type {@code
 desiredType}. The returned iterable's iterator does not support {@code remove()}.

 <p><b>{@code Stream} equivalent:</b> {@code stream.filter(type::isInstance).map(type::cast)}.
 This does perform a little more work than necessary, so another option is to insert an
 unchecked cast at some later point:

 <pre>
 {@code @SuppressWarnings("unchecked") // safe because of ::isInstance check
 ImmutableList<NewType> result =
     (ImmutableList) stream.filter(NewType.class::isInstance).collect(toImmutableList());}
 </pre>

### `any(`java.lang.Iterable<T>` iterable, [`com.google.common.base.Predicate<? super T>`](../base/Predicate.md) predicate)`

**Returns:** `boolean`

Returns {@code true} if any element in {@code iterable} satisfies the predicate.

 <p><b>{@code Stream} equivalent:</b> {@link Stream#anyMatch}.

### `all(`java.lang.Iterable<T>` iterable, [`com.google.common.base.Predicate<? super T>`](../base/Predicate.md) predicate)`

**Returns:** `boolean`

Returns {@code true} if every element in {@code iterable} satisfies the predicate. If {@code
 iterable} is empty, {@code true} is returned.

 <p><b>{@code Stream} equivalent:</b> {@link Stream#allMatch}.

### `find(`java.lang.Iterable<T>` iterable, [`com.google.common.base.Predicate<? super T>`](../base/Predicate.md) predicate)`

**Returns:** [`T`](T.md)

Returns the first element in {@code iterable} that satisfies the given predicate; use this
 method only when such an element is known to exist. If it is possible that <i>no</i> element
 will match, use {@link #tryFind} or {@link #find(Iterable, Predicate, Object)} instead.

 <p><b>{@code Stream} equivalent:</b> {@code stream.filter(predicate).findFirst().get()}
@throws NoSuchElementException if no element in {@code iterable} matches the given predicate

### `find(`java.lang.Iterable<? extends T>` iterable, [`com.google.common.base.Predicate<? super T>`](../base/Predicate.md) predicate, [`T`](T.md) defaultValue)`

**Returns:** [`T`](T.md)

Returns the first element in {@code iterable} that satisfies the given predicate, or {@code
 defaultValue} if none found. Note that this can usually be handled more naturally using {@code
 tryFind(iterable, predicate).or(defaultValue)}.

 <p><b>{@code Stream} equivalent:</b> {@code
 stream.filter(predicate).findFirst().orElse(defaultValue)}
@since 7.0

### `tryFind(`java.lang.Iterable<T>` iterable, [`com.google.common.base.Predicate<? super T>`](../base/Predicate.md) predicate)`

**Returns:** [`com.google.common.base.Optional<T>`](../base/Optional.md)

Returns an {@link Optional} containing the first element in {@code iterable} that satisfies the
 given predicate, if such an element exists.

 <p><b>Warning:</b> avoid using a {@code predicate} that matches {@code null}. If {@code null}
 is matched in {@code iterable}, a NullPointerException will be thrown.

 <p><b>{@code Stream} equivalent:</b> {@code stream.filter(predicate).findFirst()}
@since 11.0

### `indexOf(`java.lang.Iterable<T>` iterable, [`com.google.common.base.Predicate<? super T>`](../base/Predicate.md) predicate)`

**Returns:** `int`

Returns the index in {@code iterable} of the first element that satisfies the provided {@code
 predicate}, or {@code -1} if the Iterable has no such elements.

 <p>More formally, returns the lowest index {@code i} such that {@code
 predicate.apply(Iterables.get(iterable, i))} returns {@code true}, or {@code -1} if there is no
 such index.
@since 2.0

### `transform(`java.lang.Iterable<F>` fromIterable, [`com.google.common.base.Function<? super F,? extends T>`](../base/Function.md) function)`

**Returns:** `java.lang.Iterable<T>`

Returns a view containing the result of applying {@code function} to each element of {@code
 fromIterable}.

 <p>The returned iterable's iterator supports {@code remove()} if {@code fromIterable}'s
 iterator does. After a successful {@code remove()} call, {@code fromIterable} no longer
 contains the corresponding element.

 <p>If the input {@code Iterable} is known to be a {@code List} or other {@code Collection},
 consider {@link Lists#transform} and {@link Collections2#transform}.

 <p><b>{@code Stream} equivalent:</b> {@link Stream#map}

### `get(`java.lang.Iterable<T>` iterable, `int` position)`

**Returns:** [`T`](T.md)

Returns the element at the specified position in an iterable.

 <p><b>{@code Stream} equivalent:</b> {@code stream.skip(position).findFirst().get()} (throws
 {@code NoSuchElementException} if out of bounds)
@param position position of the element to return
@return the element at the specified position in {@code iterable}
@throws IndexOutOfBoundsException if {@code position} is negative or greater than or equal to
     the size of {@code iterable}

### `get(`java.lang.Iterable<? extends T>` iterable, `int` position, [`T`](T.md) defaultValue)`

**Returns:** [`T`](T.md)

Returns the element at the specified position in an iterable or a default value otherwise.

 <p><b>{@code Stream} equivalent:</b> {@code
 stream.skip(position).findFirst().orElse(defaultValue)} (returns the default value if the index
 is out of bounds)
@param position position of the element to return
@param defaultValue the default value to return if {@code position} is greater than or equal to
     the size of the iterable
@return the element at the specified position in {@code iterable} or {@code defaultValue} if
     {@code iterable} contains fewer than {@code position + 1} elements.
@throws IndexOutOfBoundsException if {@code position} is negative
@since 4.0

### `getFirst(`java.lang.Iterable<? extends T>` iterable, [`T`](T.md) defaultValue)`

**Returns:** [`T`](T.md)

Returns the first element in {@code iterable} or {@code defaultValue} if the iterable is empty.
 The {@link Iterators} analog to this method is {@link Iterators#getNext}.

 <p>If no default value is desired (and the caller instead wants a {@link NoSuchElementException} to be thrown), it is recommended that {@code
 iterable.iterator().next()} is used instead.

 <p>To get the only element in a single-element {@code Iterable}, consider using {@link #getOnlyElement(Iterable)} or {@link #getOnlyElement(Iterable, Object)} instead.

 <p><b>{@code Stream} equivalent:</b> {@code stream.findFirst().orElse(defaultValue)}
@param defaultValue the default value to return if the iterable is empty
@return the first element of {@code iterable} or the default value
@since 7.0

### `getLast(`java.lang.Iterable<T>` iterable)`

**Returns:** [`T`](T.md)

Returns the last element of {@code iterable}. If {@code iterable} is a {@link List} with {@link RandomAccess} support, then this operation is guaranteed to be {@code O(1)}.

 <p><b>{@code Stream} equivalent:</b> {@link Streams#findLast Streams.findLast(stream).get()}
@return the last element of {@code iterable}
@throws NoSuchElementException if the iterable is empty

### `getLast(`java.lang.Iterable<? extends T>` iterable, [`T`](T.md) defaultValue)`

**Returns:** [`T`](T.md)

Returns the last element of {@code iterable} or {@code defaultValue} if the iterable is empty.
 If {@code iterable} is a {@link List} with {@link RandomAccess} support, then this operation is
 guaranteed to be {@code O(1)}.

 <p><b>{@code Stream} equivalent:</b> {@code Streams.findLast(stream).orElse(defaultValue)}
@param defaultValue the value to return if {@code iterable} is empty
@return the last element of {@code iterable} or the default value
@since 3.0

### `getLastInNonemptyList([`java.util.List<T>`](../../../../java/util/List.md) list)`

**Returns:** [`T`](T.md)

### `skip(`java.lang.Iterable<T>` iterable, `int` numberToSkip)`

**Returns:** `java.lang.Iterable<T>`

Returns a view of {@code iterable} that skips its first {@code numberToSkip} elements. If
 {@code iterable} contains fewer than {@code numberToSkip} elements, the returned iterable skips
 all of its elements.

 <p>Modifications to the underlying {@link Iterable} before a call to {@code iterator()} are
 reflected in the returned iterator. That is, the iterator skips the first {@code numberToSkip}
 elements that exist when the {@code Iterator} is created, not when {@code skip()} is called.

 <p>The returned iterable's iterator supports {@code remove()} if the iterator of the underlying
 iterable supports it. Note that it is <i>not</i> possible to delete the last skipped element by
 immediately calling {@code remove()} on that iterator, as the {@code Iterator} contract states
 that a call to {@code remove()} before a call to {@code next()} will throw an {@link IllegalStateException}.

 <p><b>{@code Stream} equivalent:</b> {@link Stream#skip}
@since 3.0

### `limit(`java.lang.Iterable<T>` iterable, `int` limitSize)`

**Returns:** `java.lang.Iterable<T>`

Returns a view of {@code iterable} containing its first {@code limitSize} elements. If {@code
 iterable} contains fewer than {@code limitSize} elements, the returned view contains all of its
 elements. The returned iterable's iterator supports {@code remove()} if {@code iterable}'s
 iterator does.

 <p><b>{@code Stream} equivalent:</b> {@link Stream#limit}
@param iterable the iterable to limit
@param limitSize the maximum number of elements in the returned iterable
@throws IllegalArgumentException if {@code limitSize} is negative
@since 3.0

### `consumingIterable(`java.lang.Iterable<T>` iterable)`

**Returns:** `java.lang.Iterable<T>`

Returns a view of the supplied iterable that wraps each generated {@link Iterator} through
 {@link Iterators#consumingIterator(Iterator)}.

 <p>Note: If {@code iterable} is a {@link Queue}, the returned iterable will instead use {@link Queue#isEmpty} and {@link Queue#remove()}, since {@link Queue}'s iteration order is undefined.
 Calling {@link Iterator#hasNext()} on a generated iterator from the returned iterable may cause
 an item to be immediately dequeued for return on a subsequent call to {@link Iterator#next()}.

 <p>Whether the input {@code iterable} is a {@link Queue} or not, the returned {@code Iterable}
 is not thread-safe.
@param iterable the iterable to wrap
@return a view of the supplied iterable that wraps each generated iterator through {@link Iterators#consumingIterator(Iterator)}; for queues, an iterable that generates iterators
     that return and consume the queue's elements in queue order
@see Iterators#consumingIterator(Iterator)
@since 2.0

### `isEmpty(`java.lang.Iterable<?>` iterable)`

**Returns:** `boolean`

Determines if the given iterable contains no elements.

 <p>There is no precise {@link Iterator} equivalent to this method, since one can only ask an
 iterator whether it has any elements <i>remaining</i> (which one does using {@link Iterator#hasNext}).

 <p><b>{@code Stream} equivalent:</b> {@code !stream.findAny().isPresent()}
@return {@code true} if the iterable contains no elements

### `mergeSorted(`java.lang.Iterable<? extends java.lang.Iterable<? extends T>>` iterables, [`java.util.Comparator<? super T>`](../../../../java/util/Comparator.md) comparator)`

**Returns:** `java.lang.Iterable<T>`

Returns an iterable over the merged contents of all given {@code iterables}. Equivalent entries
 will not be de-duplicated.

 <p>Callers must ensure that the source {@code iterables} are in non-descending order as this
 method does not sort its input.

 <p>For any equivalent elements across all {@code iterables}, it is undefined which element is
 returned first.
@since 11.0

