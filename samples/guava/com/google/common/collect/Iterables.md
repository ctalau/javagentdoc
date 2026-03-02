# Class: `Iterables`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Iterables`

## Description

Except as noted, each method has a corresponding Iterator-based method
 in the Iterators class.

 
**Java 8 users:** several common uses for this class are now more comprehensively addressed
 by the new java.util.stream.Stream library. Read the method documentation below for
 comparisons. This class is not being deprecated, but we gently encourage you to migrate to
 streams.

 
*Performance notes:* Unless otherwise noted, all of the iterables produced in this class
 are *lazy*, which means that their iterators only advance the backing iteration when
 absolutely necessary.

 
See the Guava User Guide article on [
 Iterables](https://github.com/google/guava/wiki/CollectionUtilitiesExplained#iterables).

## Constructors

### `<init>()`

## Methods

### `unmodifiableIterable(java.lang.Iterable<? extends T> iterable)`

**Returns:** `java.lang.Iterable<T>`

**Parameters:**
- `iterable` (`java.lang.Iterable<? extends T>`)

### `unmodifiableIterable(com.google.common.collect.ImmutableCollection<E> iterable)`

**Returns:** `java.lang.Iterable<E>`

**Parameters:**
- `iterable` ([`com.google.common.collect.ImmutableCollection<E>`](./ImmutableCollection.md))

### `size(java.lang.Iterable<?> iterable)`

**Returns:** `int`

**Parameters:**
- `iterable` (`java.lang.Iterable<?>`)

### `contains(java.lang.Iterable<? extends java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object> iterable, java.lang.Object element)`

**Returns:** `boolean`

Otherwise returns false, even in
 cases where Collection#contains might throw NullPointerException or ClassCastException.

**Parameters:**
- `iterable` (`java.lang.Iterable<? extends java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object>`)
- `element` (`java.lang.Object`)

### `removeAll(java.lang.Iterable<?> removeFrom, java.util.Collection<?> elementsToRemove)`

**Returns:** `boolean`

This method calls Collection#removeAll if iterable is a collection, and
 Iterators#removeAll otherwise.

**Parameters:**
- `removeFrom` (`java.lang.Iterable<?>`): the iterable to (potentially) remove elements from
- `elementsToRemove` (`java.util.Collection<?>`): the elements to remove

### `retainAll(java.lang.Iterable<?> removeFrom, java.util.Collection<?> elementsToRetain)`

**Returns:** `boolean`

This method calls Collection#retainAll if iterable is a collection, and
 Iterators#retainAll otherwise.

**Parameters:**
- `removeFrom` (`java.lang.Iterable<?>`): the iterable to (potentially) remove elements from
- `elementsToRetain` (`java.util.Collection<?>`): the elements to retain

### `removeIf(java.lang.Iterable<T> removeFrom, com.google.common.base.Predicate<? super T> predicate)`

**Returns:** `boolean`

Removals may or may not happen immediately as each element is tested against the predicate.
 The behavior of this method is not specified if predicate is dependent on 
 removeFrom.

 
**Java 8 users:** if removeFrom is a Collection, use 
 removeFrom.removeIf(predicate) instead.

**Parameters:**
- `removeFrom` (`java.lang.Iterable<T>`): the iterable to (potentially) remove elements from
- `predicate` ([`com.google.common.base.Predicate<? super T>`](../base/Predicate.md)): a predicate that determines whether an element should be removed

### `removeFirstMatching(java.lang.Iterable<T> removeFrom, com.google.common.base.Predicate<? super T> predicate)`

**Returns:** `T`

**Parameters:**
- `removeFrom` (`java.lang.Iterable<T>`)
- `predicate` ([`com.google.common.base.Predicate<? super T>`](../base/Predicate.md))

### `elementsEqual(java.lang.Iterable<?> iterable1, java.lang.Iterable<?> iterable2)`

**Returns:** `boolean`

More specifically,
 this method returns true if iterable1 and iterable2 contain the same
 number of elements and every element of iterable1 is equal to the corresponding element
 of iterable2.

**Parameters:**
- `iterable1` (`java.lang.Iterable<?>`)
- `iterable2` (`java.lang.Iterable<?>`)

### `toString(java.lang.Iterable<?> iterable)`

**Returns:** `java.lang.String`

Note that for *most* implementations of Collection, collection.toString() also gives the same result, but that behavior is not
 generally guaranteed.

**Parameters:**
- `iterable` (`java.lang.Iterable<?>`)

### `getOnlyElement(java.lang.Iterable<T> iterable)`

**Returns:** `T`

**Java 8 users:** the Stream equivalent to this method is 
 stream.collect(MoreCollectors.onlyElement()).

**Parameters:**
- `iterable` (`java.lang.Iterable<T>`)

### `getOnlyElement(java.lang.Iterable<? extends T> iterable, T defaultValue)`

**Returns:** `T`

**Java 8 users:** the Stream equivalent to this method is 
 stream.collect(MoreCollectors.toOptional()).orElse(defaultValue).

**Parameters:**
- `iterable` (`java.lang.Iterable<? extends T>`)
- `defaultValue` (`T`)

### `toArray(java.lang.Iterable<? extends T> iterable, java.lang.Class<@org.checkerframework.checker.nullness.qual.NonNull T> type)`

**Returns:** `T[]`

**Parameters:**
- `iterable` (`java.lang.Iterable<? extends T>`): the iterable to copy
- `type` (`java.lang.Class<@org.checkerframework.checker.nullness.qual.NonNull T>`): the type of the elements

### `toArray(java.lang.Iterable<? extends T> iterable, T[] array)`

**Returns:** `T[]`

**Parameters:**
- `iterable` (`java.lang.Iterable<? extends T>`)
- `array` (`T[]`)

### `toArray(java.lang.Iterable<?> iterable)`

**Returns:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`

**Parameters:**
- `iterable` (`java.lang.Iterable<?>`): the iterable to copy

### `castOrCopyToCollection(java.lang.Iterable<E> iterable)`

**Returns:** `java.util.Collection<E>`

If the iterable is already a collection, it is
 returned. Otherwise, an java.util.ArrayList is created with the contents of the
 iterable in the same iteration order.

**Parameters:**
- `iterable` (`java.lang.Iterable<E>`)

### `addAll(java.util.Collection<T> addTo, java.lang.Iterable<? extends T> elementsToAdd)`

**Returns:** `boolean`

**Parameters:**
- `addTo` (`java.util.Collection<T>`)
- `elementsToAdd` (`java.lang.Iterable<? extends T>`)

### `frequency(java.lang.Iterable<?> iterable, java.lang.Object element)`

**Returns:** `int`

This
 implementation avoids a full iteration when the iterable is a Multiset or Set.

 
**Java 8 users:** In most cases, the Stream equivalent of this method is 
 stream.filter(element::equals).count(). If element might be null, use 
 stream.filter(Predicate.isEqual(element)).count() instead.

**Parameters:**
- `iterable` (`java.lang.Iterable<?>`)
- `element` (`java.lang.Object`)

### `cycle(java.lang.Iterable<T> iterable)`

**Returns:** `java.lang.Iterable<T>`

That iterator supports remove() if iterable.iterator() does. After 
 remove() is called, subsequent cycles omit the removed element, which is no longer in 
 iterable. The iterator's hasNext() method returns true until iterable
 is empty.

 
**Warning:** Typical uses of the resulting iterator may produce an infinite loop. You
 should use an explicit break or be certain that you will eventually remove all the
 elements.

 
To cycle over the iterable n times, use the following: 
 Iterables.concat(Collections.nCopies(n, iterable))

 
**Java 8 users:** The Stream equivalent of this method is 
 Stream.generate(() -> iterable).flatMap(Streams::stream).

**Parameters:**
- `iterable` (`java.lang.Iterable<T>`)

### `cycle(T[] elements)`

**Returns:** `java.lang.Iterable<T>`

After remove is invoked on a generated iterator, the removed element will no longer
 appear in either that iterator or any other iterator created from the same source iterable.
 That is, this method behaves exactly as Iterables.cycle(Lists.newArrayList(elements)).
 The iterator's hasNext method returns true until all of the original elements
 have been removed.

 
**Warning:** Typical uses of the resulting iterator may produce an infinite loop. You
 should use an explicit break or be certain that you will eventually remove all the
 elements.

 
To cycle over the elements n times, use the following: 
 Iterables.concat(Collections.nCopies(n, Arrays.asList(elements)))

 
**Java 8 users:** If passing a single element e, the Stream equivalent of
 this method is Stream.generate(() -> e). Otherwise, put the elements in a collection
 and use Stream.generate(() -> collection).flatMap(Collection::stream).

**Parameters:**
- `elements` (`T[]`)

### `concat(java.lang.Iterable<? extends T> a, java.lang.Iterable<? extends T> b)`

**Returns:** `java.lang.Iterable<T>`

The returned iterable has an iterator that
 traverses the elements in a, followed by the elements in b. The source
 iterators are not polled until necessary.

 
The returned iterable's iterator supports remove() when the corresponding input
 iterator supports it.

 
**Java 8 users:** The Stream equivalent of this method is Stream.concat(a,
 b).

**Parameters:**
- `a` (`java.lang.Iterable<? extends T>`)
- `b` (`java.lang.Iterable<? extends T>`)

### `concat(java.lang.Iterable<? extends T> a, java.lang.Iterable<? extends T> b, java.lang.Iterable<? extends T> c)`

**Returns:** `java.lang.Iterable<T>`

The returned iterable has an iterator that
 traverses the elements in a, followed by the elements in b, followed by the
 elements in c. The source iterators are not polled until necessary.

 
The returned iterable's iterator supports remove() when the corresponding input
 iterator supports it.

 
**Java 8 users:** The Stream equivalent of this method is 
 Streams.concat(a, b, c).

**Parameters:**
- `a` (`java.lang.Iterable<? extends T>`)
- `b` (`java.lang.Iterable<? extends T>`)
- `c` (`java.lang.Iterable<? extends T>`)

### `concat(java.lang.Iterable<? extends T> a, java.lang.Iterable<? extends T> b, java.lang.Iterable<? extends T> c, java.lang.Iterable<? extends T> d)`

**Returns:** `java.lang.Iterable<T>`

The returned iterable has an iterator that
 traverses the elements in a, followed by the elements in b, followed by the
 elements in c, followed by the elements in d. The source iterators are not
 polled until necessary.

 
The returned iterable's iterator supports remove() when the corresponding input
 iterator supports it.

 
**Java 8 users:** The Stream equivalent of this method is 
 Streams.concat(a, b, c, d).

**Parameters:**
- `a` (`java.lang.Iterable<? extends T>`)
- `b` (`java.lang.Iterable<? extends T>`)
- `c` (`java.lang.Iterable<? extends T>`)
- `d` (`java.lang.Iterable<? extends T>`)

### `concat(java.lang.Iterable<? extends T>[] inputs)`

**Returns:** `java.lang.Iterable<T>`

The returned iterable has an iterator that
 traverses the elements of each iterable in inputs. The input iterators are not polled
 until necessary.

 
The returned iterable's iterator supports remove() when the corresponding input
 iterator supports it.

 
**Java 8 users:** The Stream equivalent of this method is 
 Streams.concat(...).

**Parameters:**
- `inputs` (`java.lang.Iterable<? extends T>[]`)

### `concat(java.lang.Iterable<? extends java.lang.Iterable<? extends T>> inputs)`

**Returns:** `java.lang.Iterable<T>`

The returned iterable has an iterator that
 traverses the elements of each iterable in inputs. The input iterators are not polled
 until necessary.

 
The returned iterable's iterator supports remove() when the corresponding input
 iterator supports it. The methods of the returned iterable may throw 
 NullPointerException if any of the input iterators is null.

 
**Java 8 users:** The Stream equivalent of this method is 
 streamOfStreams.flatMap(s -> s).

**Parameters:**
- `inputs` (`java.lang.Iterable<? extends java.lang.Iterable<? extends T>>`)

### `partition(java.lang.Iterable<T> iterable, int size)`

**Returns:** `java.lang.Iterable<java.util.List<T>>`

For example, partitioning an iterable containing [a, b, c, d, e] with a
 partition size of 3 yields [[a, b, c], [d, e]] -- an outer iterable containing two
 inner lists of three and two elements, all in the original order.

 
Iterators returned by the returned iterable do not support the Iterator#remove()
 method. The returned lists implement RandomAccess, whether or not the input list does.

 
**Note:** The current implementation eagerly allocates storage for size elements.
 As a consequence, passing values like Integer.MAX_VALUE can lead to OutOfMemoryError.

 
**Note:** if iterable is a List, use Lists#partition(List, int)
 instead.

**Parameters:**
- `iterable` (`java.lang.Iterable<T>`): the iterable to return a partitioned view of
- `size` (`int`): the desired size of each partition (the last may be smaller)

### `paddedPartition(java.lang.Iterable<T> iterable, int size)`

**Returns:** `java.lang.Iterable<java.util.List<@org.checkerframework.checker.nullness.qual.Nullable T>>`

For example, partitioning an iterable containing [a, b,
 c, d, e] with a partition size of 3 yields [[a, b, c], [d, e, null]] -- an outer
 iterable containing two inner lists of three elements each, all in the original order.

 
Iterators returned by the returned iterable do not support the Iterator#remove()
 method.

**Parameters:**
- `iterable` (`java.lang.Iterable<T>`): the iterable to return a partitioned view of
- `size` (`int`): the desired size of each partition

### `filter(java.lang.Iterable<T> unfiltered, com.google.common.base.Predicate<? super T> retainIfTrue)`

**Returns:** `java.lang.Iterable<T>`

The returned iterable's iterator does not support remove().

 
**Stream equivalent:** Stream#filter.

**Parameters:**
- `unfiltered` (`java.lang.Iterable<T>`)
- `retainIfTrue` ([`com.google.common.base.Predicate<? super T>`](../base/Predicate.md))

### `filter(java.lang.Iterable<?> unfiltered, java.lang.Class<T> desiredType)`

**Returns:** `java.lang.Iterable<T>`

The returned iterable's iterator does not support remove().

 
**Stream equivalent:** stream.filter(type::isInstance).map(type::cast).
 This does perform a little more work than necessary, so another option is to insert an
 unchecked cast at some later point:

 

```

 @SuppressWarnings("unchecked") // safe because of ::isInstance check
 ImmutableList<NewType> result =
     (ImmutableList) stream.filter(NewType.class::isInstance).collect(toImmutableList());
 
```

**Parameters:**
- `unfiltered` (`java.lang.Iterable<?>`)
- `desiredType` (`java.lang.Class<T>`)

### `any(java.lang.Iterable<T> iterable, com.google.common.base.Predicate<? super T> predicate)`

**Returns:** `boolean`

**Stream equivalent:** Stream#anyMatch.

**Parameters:**
- `iterable` (`java.lang.Iterable<T>`)
- `predicate` ([`com.google.common.base.Predicate<? super T>`](../base/Predicate.md))

### `all(java.lang.Iterable<T> iterable, com.google.common.base.Predicate<? super T> predicate)`

**Returns:** `boolean`

If 
 iterable is empty, true is returned.

 
**Stream equivalent:** Stream#allMatch.

**Parameters:**
- `iterable` (`java.lang.Iterable<T>`)
- `predicate` ([`com.google.common.base.Predicate<? super T>`](../base/Predicate.md))

### `find(java.lang.Iterable<T> iterable, com.google.common.base.Predicate<? super T> predicate)`

**Returns:** `T`

If it is possible that *no* element
 will match, use #tryFind or #find(Iterable, Predicate, Object) instead.

 
**Stream equivalent:** stream.filter(predicate).findFirst().get()

**Parameters:**
- `iterable` (`java.lang.Iterable<T>`)
- `predicate` ([`com.google.common.base.Predicate<? super T>`](../base/Predicate.md))

### `find(java.lang.Iterable<? extends T> iterable, com.google.common.base.Predicate<? super T> predicate, T defaultValue)`

**Returns:** `T`

Note that this can usually be handled more naturally using 
 tryFind(iterable, predicate).or(defaultValue).

 
**Stream equivalent:** 
 stream.filter(predicate).findFirst().orElse(defaultValue)

**Parameters:**
- `iterable` (`java.lang.Iterable<? extends T>`)
- `predicate` ([`com.google.common.base.Predicate<? super T>`](../base/Predicate.md))
- `defaultValue` (`T`)

### `tryFind(java.lang.Iterable<T> iterable, com.google.common.base.Predicate<? super T> predicate)`

**Returns:** [`com.google.common.base.Optional<T>`](../base/Optional.md)

**Warning:** avoid using a predicate that matches null. If null
 is matched in iterable, a NullPointerException will be thrown.

 
**Stream equivalent:** stream.filter(predicate).findFirst()

**Parameters:**
- `iterable` (`java.lang.Iterable<T>`)
- `predicate` ([`com.google.common.base.Predicate<? super T>`](../base/Predicate.md))

### `indexOf(java.lang.Iterable<T> iterable, com.google.common.base.Predicate<? super T> predicate)`

**Returns:** `int`

More formally, returns the lowest index i such that 
 predicate.apply(Iterables.get(iterable, i)) returns true, or -1 if there is no
 such index.

**Parameters:**
- `iterable` (`java.lang.Iterable<T>`)
- `predicate` ([`com.google.common.base.Predicate<? super T>`](../base/Predicate.md))

### `transform(java.lang.Iterable<F> fromIterable, com.google.common.base.Function<? super F,? extends T> function)`

**Returns:** `java.lang.Iterable<T>`

The returned iterable's iterator supports remove() if fromIterable's
 iterator does. After a successful remove() call, fromIterable no longer
 contains the corresponding element.

 
If the input Iterable is known to be a List or other Collection,
 consider Lists#transform and Collections2#transform.

 
**Stream equivalent:** Stream#map

**Parameters:**
- `fromIterable` (`java.lang.Iterable<F>`)
- `function` ([`com.google.common.base.Function<? super F,? extends T>`](../base/Function.md))

### `get(java.lang.Iterable<T> iterable, int position)`

**Returns:** `T`

**Stream equivalent:** stream.skip(position).findFirst().get() (throws
 NoSuchElementException if out of bounds)

**Parameters:**
- `iterable` (`java.lang.Iterable<T>`)
- `position` (`int`): position of the element to return

### `get(java.lang.Iterable<? extends T> iterable, int position, T defaultValue)`

**Returns:** `T`

**Stream equivalent:** 
 stream.skip(position).findFirst().orElse(defaultValue) (returns the default value if the index
 is out of bounds)

**Parameters:**
- `iterable` (`java.lang.Iterable<? extends T>`)
- `position` (`int`): position of the element to return
- `defaultValue` (`T`): the default value to return if position is greater than or equal to
     the size of the iterable

### `getFirst(java.lang.Iterable<? extends T> iterable, T defaultValue)`

**Returns:** `T`

The Iterators analog to this method is Iterators#getNext.

 
If no default value is desired (and the caller instead wants a NoSuchElementException to be thrown), it is recommended that 
 iterable.iterator().next() is used instead.

 
To get the only element in a single-element Iterable, consider using #getOnlyElement(Iterable) or #getOnlyElement(Iterable, Object) instead.

 
**Stream equivalent:** stream.findFirst().orElse(defaultValue)

**Parameters:**
- `iterable` (`java.lang.Iterable<? extends T>`)
- `defaultValue` (`T`): the default value to return if the iterable is empty

### `getLast(java.lang.Iterable<T> iterable)`

**Returns:** `T`

If iterable is a List with RandomAccess support, then this operation is guaranteed to be O(1).

 
**Stream equivalent:** Streams.findLast(stream).get()

**Parameters:**
- `iterable` (`java.lang.Iterable<T>`)

### `getLast(java.lang.Iterable<? extends T> iterable, T defaultValue)`

**Returns:** `T`

If iterable is a List with RandomAccess support, then this operation is
 guaranteed to be O(1).

 
**Stream equivalent:** Streams.findLast(stream).orElse(defaultValue)

**Parameters:**
- `iterable` (`java.lang.Iterable<? extends T>`)
- `defaultValue` (`T`): the value to return if iterable is empty

### `getLastInNonemptyList(java.util.List<T> list)`

**Returns:** `T`

**Parameters:**
- `list` (`java.util.List<T>`)

### `skip(java.lang.Iterable<T> iterable, int numberToSkip)`

**Returns:** `java.lang.Iterable<T>`

If
 iterable contains fewer than numberToSkip elements, the returned iterable skips
 all of its elements.

 
Modifications to the underlying Iterable before a call to iterator() are
 reflected in the returned iterator. That is, the iterator skips the first numberToSkip
 elements that exist when the Iterator is created, not when skip() is called.

 
The returned iterable's iterator supports remove() if the iterator of the underlying
 iterable supports it. Note that it is *not* possible to delete the last skipped element by
 immediately calling remove() on that iterator, as the Iterator contract states
 that a call to remove() before a call to next() will throw an IllegalStateException.

 
**Stream equivalent:** Stream#skip

**Parameters:**
- `iterable` (`java.lang.Iterable<T>`)
- `numberToSkip` (`int`)

### `limit(java.lang.Iterable<T> iterable, int limitSize)`

**Returns:** `java.lang.Iterable<T>`

If 
 iterable contains fewer than limitSize elements, the returned view contains all of its
 elements. The returned iterable's iterator supports remove() if iterable's
 iterator does.

 
**Stream equivalent:** Stream#limit

**Parameters:**
- `iterable` (`java.lang.Iterable<T>`): the iterable to limit
- `limitSize` (`int`): the maximum number of elements in the returned iterable

### `consumingIterable(java.lang.Iterable<T> iterable)`

**Returns:** `java.lang.Iterable<T>`

Note: If iterable is a Queue, the returned iterable will instead use Queue#isEmpty and Queue#remove(), since Queue's iteration order is undefined.
 Calling Iterator#hasNext() on a generated iterator from the returned iterable may cause
 an item to be immediately dequeued for return on a subsequent call to Iterator#next().

 
Whether the input iterable is a Queue or not, the returned Iterable
 is not thread-safe.

**Parameters:**
- `iterable` (`java.lang.Iterable<T>`): the iterable to wrap

### `isEmpty(java.lang.Iterable<?> iterable)`

**Returns:** `boolean`

There is no precise Iterator equivalent to this method, since one can only ask an
 iterator whether it has any elements *remaining* (which one does using Iterator#hasNext).

 
**Stream equivalent:** !stream.findAny().isPresent()

**Parameters:**
- `iterable` (`java.lang.Iterable<?>`)

### `mergeSorted(java.lang.Iterable<? extends java.lang.Iterable<? extends T>> iterables, java.util.Comparator<? super T> comparator)`

**Returns:** `java.lang.Iterable<T>`

Equivalent entries
 will not be de-duplicated.

 
Callers must ensure that the source iterables are in non-descending order as this
 method does not sort its input.

 
For any equivalent elements across all iterables, it is undefined which element is
 returned first.

**Parameters:**
- `iterables` (`java.lang.Iterable<? extends java.lang.Iterable<? extends T>>`)
- `comparator` (`java.util.Comparator<? super T>`)

