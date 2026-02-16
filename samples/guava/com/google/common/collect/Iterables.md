# Class: `Iterables`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Iterables`

## Description

An assortment of mainly legacy static utility methods that operate on or return objects of type
 `Iterable`. Except as noted, each method has a corresponding `Iterator`-based method
 in the `Iterators` class.

 <p><b>Java 8 users:</b> several common uses for this class are now more comprehensively addressed
 by the new `java.util.stream.Stream` library. Read the method documentation below for
 comparisons. This class is not being deprecated, but we gently encourage you to migrate to
 streams.

 <p><i>Performance notes:</i> Unless otherwise noted, all of the iterables produced in this class
 are <i>lazy</i>, which means that their iterators only advance the backing iteration when
 absolutely necessary.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/CollectionUtilitiesExplained#iterables">`Iterables`</a>.
**Author:** Kevin Bourrillion
**Author:** Jared Levy
**Since:** 2.0

## Constructors

### `<init>()`

## Methods

### `unmodifiableIterable(`java.lang.Iterable<? extends T>` iterable)`

**Returns:** `java.lang.Iterable<T>`

Returns an unmodifiable view of `iterable`.

### `unmodifiableIterable([`com.google.common.collect.ImmutableCollection<E>`](./ImmutableCollection.md) iterable)`

**Returns:** `java.lang.Iterable<E>`

Simply returns its argument.
**Deprecated:**no need to use this
**Since:** 10.0

### `size(`java.lang.Iterable<?>` iterable)`

**Returns:** `int`

Returns the number of elements in `iterable`.

### `contains(`java.lang.Iterable<? extends java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object>` iterable, `java.lang.Object` element)`

**Returns:** `boolean`

Returns `true` if `iterable` contains any element `o` for which `Objects.equals(o, element)` would return `true`. Otherwise returns `false`, even in
 cases where `Collection.contains` might throw `NullPointerException` or `ClassCastException`.

### `removeAll(`java.lang.Iterable<?>` removeFrom, `java.util.Collection<?>` elementsToRemove)`

**Returns:** `boolean`

Removes, from an iterable, every element that belongs to the provided collection.

 <p>This method calls `Collection.removeAll` if `iterable` is a collection, and
 `Iterators.removeAll` otherwise.
@param removeFrom the iterable to (potentially) remove elements from
@param elementsToRemove the elements to remove
@return `true` if any element was removed from `iterable`

### `retainAll(`java.lang.Iterable<?>` removeFrom, `java.util.Collection<?>` elementsToRetain)`

**Returns:** `boolean`

Removes, from an iterable, every element that does not belong to the provided collection.

 <p>This method calls `Collection.retainAll` if `iterable` is a collection, and
 `Iterators.retainAll` otherwise.
@param removeFrom the iterable to (potentially) remove elements from
@param elementsToRetain the elements to retain
@return `true` if any element was removed from `iterable`

### `removeIf(`java.lang.Iterable<T>` removeFrom, [`com.google.common.base.Predicate<? super T>`](../base/Predicate.md) predicate)`

**Returns:** `boolean`

Removes, from an iterable, every element that satisfies the provided predicate.

 <p>Removals may or may not happen immediately as each element is tested against the predicate.
 The behavior of this method is not specified if `predicate` is dependent on `removeFrom`.

 <p><b>Java 8 users:</b> if `removeFrom` is a `Collection`, use `removeFrom.removeIf(predicate)` instead.
@param removeFrom the iterable to (potentially) remove elements from
@param predicate a predicate that determines whether an element should be removed
@return `true` if any elements were removed from the iterable
@throws UnsupportedOperationException if the iterable does not support `remove()`.
**Since:** 2.0

### `removeFirstMatching(`java.lang.Iterable<T>` removeFrom, [`com.google.common.base.Predicate<? super T>`](../base/Predicate.md) predicate)`

**Returns:** `T`

Removes and returns the first matching element, or returns `null` if there is none.

### `elementsEqual(`java.lang.Iterable<?>` iterable1, `java.lang.Iterable<?>` iterable2)`

**Returns:** `boolean`

Determines whether two iterables contain equal elements in the same order. More specifically,
 this method returns `true` if `iterable1` and `iterable2` contain the same
 number of elements and every element of `iterable1` is equal to the corresponding element
 of `iterable2`.

### `toString(`java.lang.Iterable<?>` iterable)`

**Returns:** `java.lang.String`

Returns a string representation of `iterable`, with the format `[e1, e2, ..., en]`
 (that is, identical to `java.util.Arrays``.toString(Iterables.toArray(iterable))`). Note that for <i>most</i> implementations of `Collection`, `collection.toString()` also gives the same result, but that behavior is not
 generally guaranteed.

### `getOnlyElement(`java.lang.Iterable<T>` iterable)`

**Returns:** `T`

Returns the single element contained in `iterable`.

 <p><b>Java 8 users:</b> the `Stream` equivalent to this method is `stream.collect(MoreCollectors.onlyElement())`.
@throws NoSuchElementException if the iterable is empty
@throws IllegalArgumentException if the iterable contains multiple elements

### `getOnlyElement(`java.lang.Iterable<? extends T>` iterable, `T` defaultValue)`

**Returns:** `T`

Returns the single element contained in `iterable`, or `defaultValue` if the
 iterable is empty.

 <p><b>Java 8 users:</b> the `Stream` equivalent to this method is `stream.collect(MoreCollectors.toOptional()).orElse(defaultValue)`.
@throws IllegalArgumentException if the iterator contains multiple elements

### `toArray(`java.lang.Iterable<? extends T>` iterable, `java.lang.Class<@org.checkerframework.checker.nullness.qual.NonNull T>` type)`

**Returns:** `T[]`

Copies an iterable's elements into an array.
@param iterable the iterable to copy
@param type the type of the elements
@return a newly-allocated array into which all the elements of the iterable have been copied

### `toArray(`java.lang.Iterable<? extends T>` iterable, `T[]` array)`

**Returns:** `T[]`

### `toArray(`java.lang.Iterable<?>` iterable)`

**Returns:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`

Copies an iterable's elements into an array.
@param iterable the iterable to copy
@return a newly-allocated array into which all the elements of the iterable have been copied

### `castOrCopyToCollection(`java.lang.Iterable<E>` iterable)`

**Returns:** `java.util.Collection<E>`

Converts an iterable into a collection. If the iterable is already a collection, it is
 returned. Otherwise, an `java.util.ArrayList` is created with the contents of the
 iterable in the same iteration order.

### `addAll(`java.util.Collection<T>` addTo, `java.lang.Iterable<? extends T>` elementsToAdd)`

**Returns:** `boolean`

Adds all elements in `iterable` to `collection`.
@return `true` if `collection` was modified as a result of this operation.

### `frequency(`java.lang.Iterable<?>` iterable, `java.lang.Object` element)`

**Returns:** `int`

Returns the number of elements in the specified iterable that equal the specified object. This
 implementation avoids a full iteration when the iterable is a `Multiset` or `Set`.

 <p><b>Java 8 users:</b> In most cases, the `Stream` equivalent of this method is `stream.filter(element::equals).count()`. If `element` might be null, use `stream.filter(Predicate.isEqual(element)).count()` instead.
**See:** java.util.Collections#frequency(Collection, Object) Collections.frequency(Collection,
     Object)

### `cycle(`java.lang.Iterable<T>` iterable)`

**Returns:** `java.lang.Iterable<T>`

Returns an iterable whose iterators cycle indefinitely over the elements of `iterable`.

 <p>That iterator supports `remove()` if `iterable.iterator()` does. After `remove()` is called, subsequent cycles omit the removed element, which is no longer in `iterable`. The iterator's `hasNext()` method returns `true` until `iterable`
 is empty.

 <p><b>Warning:</b> Typical uses of the resulting iterator may produce an infinite loop. You
 should use an explicit `break` or be certain that you will eventually remove all the
 elements.

 <p>To cycle over the iterable `n` times, use the following: `Iterables.concat(Collections.nCopies(n, iterable))`

 <p><b>Java 8 users:</b> The `Stream` equivalent of this method is `Stream.generate(() -> iterable).flatMap(Streams::stream)`.

### `cycle(`T[]` elements)`

**Returns:** `java.lang.Iterable<T>`

Returns an iterable whose iterators cycle indefinitely over the provided elements.

 <p>After `remove` is invoked on a generated iterator, the removed element will no longer
 appear in either that iterator or any other iterator created from the same source iterable.
 That is, this method behaves exactly as `Iterables.cycle(Lists.newArrayList(elements))`.
 The iterator's `hasNext` method returns `true` until all of the original elements
 have been removed.

 <p><b>Warning:</b> Typical uses of the resulting iterator may produce an infinite loop. You
 should use an explicit `break` or be certain that you will eventually remove all the
 elements.

 <p>To cycle over the elements `n` times, use the following: `Iterables.concat(Collections.nCopies(n, Arrays.asList(elements)))`

 <p><b>Java 8 users:</b> If passing a single element `e`, the `Stream` equivalent of
 this method is `Stream.generate(() -> e)`. Otherwise, put the elements in a collection
 and use `Stream.generate(() -> collection).flatMap(Collection::stream)`.

### `concat(`java.lang.Iterable<? extends T>` a, `java.lang.Iterable<? extends T>` b)`

**Returns:** `java.lang.Iterable<T>`

Combines two iterables into a single iterable. The returned iterable has an iterator that
 traverses the elements in `a`, followed by the elements in `b`. The source
 iterators are not polled until necessary.

 <p>The returned iterable's iterator supports `remove()` when the corresponding input
 iterator supports it.

 <p><b>Java 8 users:</b> The `Stream` equivalent of this method is `Stream.concat(a,
 b)`.

### `concat(`java.lang.Iterable<? extends T>` a, `java.lang.Iterable<? extends T>` b, `java.lang.Iterable<? extends T>` c)`

**Returns:** `java.lang.Iterable<T>`

Combines three iterables into a single iterable. The returned iterable has an iterator that
 traverses the elements in `a`, followed by the elements in `b`, followed by the
 elements in `c`. The source iterators are not polled until necessary.

 <p>The returned iterable's iterator supports `remove()` when the corresponding input
 iterator supports it.

 <p><b>Java 8 users:</b> The `Stream` equivalent of this method is `Streams.concat(a, b, c)`.

### `concat(`java.lang.Iterable<? extends T>` a, `java.lang.Iterable<? extends T>` b, `java.lang.Iterable<? extends T>` c, `java.lang.Iterable<? extends T>` d)`

**Returns:** `java.lang.Iterable<T>`

Combines four iterables into a single iterable. The returned iterable has an iterator that
 traverses the elements in `a`, followed by the elements in `b`, followed by the
 elements in `c`, followed by the elements in `d`. The source iterators are not
 polled until necessary.

 <p>The returned iterable's iterator supports `remove()` when the corresponding input
 iterator supports it.

 <p><b>Java 8 users:</b> The `Stream` equivalent of this method is `Streams.concat(a, b, c, d)`.

### `concat(`java.lang.Iterable<? extends T>[]` inputs)`

**Returns:** `java.lang.Iterable<T>`

Combines multiple iterables into a single iterable. The returned iterable has an iterator that
 traverses the elements of each iterable in `inputs`. The input iterators are not polled
 until necessary.

 <p>The returned iterable's iterator supports `remove()` when the corresponding input
 iterator supports it.

 <p><b>Java 8 users:</b> The `Stream` equivalent of this method is `Streams.concat(...)`.
@throws NullPointerException if any of the provided iterables is null

### `concat(`java.lang.Iterable<? extends java.lang.Iterable<? extends T>>` inputs)`

**Returns:** `java.lang.Iterable<T>`

Combines multiple iterables into a single iterable. The returned iterable has an iterator that
 traverses the elements of each iterable in `inputs`. The input iterators are not polled
 until necessary.

 <p>The returned iterable's iterator supports `remove()` when the corresponding input
 iterator supports it. The methods of the returned iterable may throw `NullPointerException` if any of the input iterators is null.

 <p><b>Java 8 users:</b> The `Stream` equivalent of this method is `streamOfStreams.flatMap(s -> s)`.

### `partition(`java.lang.Iterable<T>` iterable, `int` size)`

**Returns:** `java.lang.Iterable<java.util.List<T>>`

Divides an iterable into unmodifiable sublists of the given size (the final iterable may be
 smaller). For example, partitioning an iterable containing `[a, b, c, d, e]` with a
 partition size of 3 yields `[[a, b, c], [d, e]]` -- an outer iterable containing two
 inner lists of three and two elements, all in the original order.

 <p>Iterators returned by the returned iterable do not support the `Iterator.remove()`
 method. The returned lists implement `RandomAccess`, whether or not the input list does.

 <p><b>Note:</b> The current implementation eagerly allocates storage for `size` elements.
 As a consequence, passing values like `Integer.MAX_VALUE` can lead to `OutOfMemoryError`.

 <p><b>Note:</b> if `iterable` is a `List`, use `Lists.partition(List, int)`
 instead.
@param iterable the iterable to return a partitioned view of
@param size the desired size of each partition (the last may be smaller)
@return an iterable of unmodifiable lists containing the elements of `iterable` divided
     into partitions
@throws IllegalArgumentException if `size` is nonpositive

### `paddedPartition(`java.lang.Iterable<T>` iterable, `int` size)`

**Returns:** `java.lang.Iterable<java.util.List<@org.checkerframework.checker.nullness.qual.Nullable T>>`

Divides an iterable into unmodifiable sublists of the given size, padding the final iterable
 with null values if necessary. For example, partitioning an iterable containing `[a, b,
 c, d, e]` with a partition size of 3 yields `[[a, b, c], [d, e, null]]` -- an outer
 iterable containing two inner lists of three elements each, all in the original order.

 <p>Iterators returned by the returned iterable do not support the `Iterator.remove()`
 method.
@param iterable the iterable to return a partitioned view of
@param size the desired size of each partition
@return an iterable of unmodifiable lists containing the elements of `iterable` divided
     into partitions (the final iterable may have trailing null elements)
@throws IllegalArgumentException if `size` is nonpositive

### `filter(`java.lang.Iterable<T>` unfiltered, [`com.google.common.base.Predicate<? super T>`](../base/Predicate.md) retainIfTrue)`

**Returns:** `java.lang.Iterable<T>`

Returns a view of `unfiltered` containing all elements that satisfy the input predicate
 `retainIfTrue`. The returned iterable's iterator does not support `remove()`.

 <p><b>`Stream` equivalent:</b> `Stream.filter`.

### `filter(`java.lang.Iterable<?>` unfiltered, `java.lang.Class<T>` desiredType)`

**Returns:** `java.lang.Iterable<T>`

Returns a view of `unfiltered` containing all elements that are of the type `desiredType`. The returned iterable's iterator does not support `remove()`.

 <p><b>`Stream` equivalent:</b> `stream.filter(type::isInstance).map(type::cast)`.
 This does perform a little more work than necessary, so another option is to insert an
 unchecked cast at some later point:

 <pre>
 `@SuppressWarnings("unchecked") // safe because of ::isInstance check
 ImmutableList<NewType> result =
     (ImmutableList) stream.filter(NewType.class::isInstance).collect(toImmutableList());`
 </pre>

### `any(`java.lang.Iterable<T>` iterable, [`com.google.common.base.Predicate<? super T>`](../base/Predicate.md) predicate)`

**Returns:** `boolean`

Returns `true` if any element in `iterable` satisfies the predicate.

 <p><b>`Stream` equivalent:</b> `Stream.anyMatch`.

### `all(`java.lang.Iterable<T>` iterable, [`com.google.common.base.Predicate<? super T>`](../base/Predicate.md) predicate)`

**Returns:** `boolean`

Returns `true` if every element in `iterable` satisfies the predicate. If `iterable` is empty, `true` is returned.

 <p><b>`Stream` equivalent:</b> `Stream.allMatch`.

### `find(`java.lang.Iterable<T>` iterable, [`com.google.common.base.Predicate<? super T>`](../base/Predicate.md) predicate)`

**Returns:** `T`

Returns the first element in `iterable` that satisfies the given predicate; use this
 method only when such an element is known to exist. If it is possible that <i>no</i> element
 will match, use `tryFind` or `find(Iterable, Predicate, Object)` instead.

 <p><b>`Stream` equivalent:</b> `stream.filter(predicate).findFirst().get()`
@throws NoSuchElementException if no element in `iterable` matches the given predicate

### `find(`java.lang.Iterable<? extends T>` iterable, [`com.google.common.base.Predicate<? super T>`](../base/Predicate.md) predicate, `T` defaultValue)`

**Returns:** `T`

Returns the first element in `iterable` that satisfies the given predicate, or `defaultValue` if none found. Note that this can usually be handled more naturally using `tryFind(iterable, predicate).or(defaultValue)`.

 <p><b>`Stream` equivalent:</b> `stream.filter(predicate).findFirst().orElse(defaultValue)`
**Since:** 7.0

### `tryFind(`java.lang.Iterable<T>` iterable, [`com.google.common.base.Predicate<? super T>`](../base/Predicate.md) predicate)`

**Returns:** [`com.google.common.base.Optional<T>`](../base/Optional.md)

Returns an `Optional` containing the first element in `iterable` that satisfies the
 given predicate, if such an element exists.

 <p><b>Warning:</b> avoid using a `predicate` that matches `null`. If `null`
 is matched in `iterable`, a NullPointerException will be thrown.

 <p><b>`Stream` equivalent:</b> `stream.filter(predicate).findFirst()`
**Since:** 11.0

### `indexOf(`java.lang.Iterable<T>` iterable, [`com.google.common.base.Predicate<? super T>`](../base/Predicate.md) predicate)`

**Returns:** `int`

Returns the index in `iterable` of the first element that satisfies the provided `predicate`, or `-1` if the Iterable has no such elements.

 <p>More formally, returns the lowest index `i` such that `predicate.apply(Iterables.get(iterable, i))` returns `true`, or `-1` if there is no
 such index.
**Since:** 2.0

### `transform(`java.lang.Iterable<F>` fromIterable, [`com.google.common.base.Function<? super F,? extends T>`](../base/Function.md) function)`

**Returns:** `java.lang.Iterable<T>`

Returns a view containing the result of applying `function` to each element of `fromIterable`.

 <p>The returned iterable's iterator supports `remove()` if `fromIterable`'s
 iterator does. After a successful `remove()` call, `fromIterable` no longer
 contains the corresponding element.

 <p>If the input `Iterable` is known to be a `List` or other `Collection`,
 consider `Lists.transform` and `Collections2.transform`.

 <p><b>`Stream` equivalent:</b> `Stream.map`

### `get(`java.lang.Iterable<T>` iterable, `int` position)`

**Returns:** `T`

Returns the element at the specified position in an iterable.

 <p><b>`Stream` equivalent:</b> `stream.skip(position).findFirst().get()` (throws
 `NoSuchElementException` if out of bounds)
@param position position of the element to return
@return the element at the specified position in `iterable`
@throws IndexOutOfBoundsException if `position` is negative or greater than or equal to
     the size of `iterable`

### `get(`java.lang.Iterable<? extends T>` iterable, `int` position, `T` defaultValue)`

**Returns:** `T`

Returns the element at the specified position in an iterable or a default value otherwise.

 <p><b>`Stream` equivalent:</b> `stream.skip(position).findFirst().orElse(defaultValue)` (returns the default value if the index
 is out of bounds)
@param position position of the element to return
@param defaultValue the default value to return if `position` is greater than or equal to
     the size of the iterable
@return the element at the specified position in `iterable` or `defaultValue` if
     `iterable` contains fewer than `position + 1` elements.
@throws IndexOutOfBoundsException if `position` is negative
**Since:** 4.0

### `getFirst(`java.lang.Iterable<? extends T>` iterable, `T` defaultValue)`

**Returns:** `T`

Returns the first element in `iterable` or `defaultValue` if the iterable is empty.
 The `Iterators` analog to this method is `Iterators.getNext`.

 <p>If no default value is desired (and the caller instead wants a `NoSuchElementException` to be thrown), it is recommended that `iterable.iterator().next()` is used instead.

 <p>To get the only element in a single-element `Iterable`, consider using `getOnlyElement(Iterable)` or `getOnlyElement(Iterable, Object)` instead.

 <p><b>`Stream` equivalent:</b> `stream.findFirst().orElse(defaultValue)`
@param defaultValue the default value to return if the iterable is empty
@return the first element of `iterable` or the default value
**Since:** 7.0

### `getLast(`java.lang.Iterable<T>` iterable)`

**Returns:** `T`

Returns the last element of `iterable`. If `iterable` is a `List` with `RandomAccess` support, then this operation is guaranteed to be `O(1)`.

 <p><b>`Stream` equivalent:</b> `Streams.findLast Streams.findLast(stream).get()`
@return the last element of `iterable`
@throws NoSuchElementException if the iterable is empty

### `getLast(`java.lang.Iterable<? extends T>` iterable, `T` defaultValue)`

**Returns:** `T`

Returns the last element of `iterable` or `defaultValue` if the iterable is empty.
 If `iterable` is a `List` with `RandomAccess` support, then this operation is
 guaranteed to be `O(1)`.

 <p><b>`Stream` equivalent:</b> `Streams.findLast(stream).orElse(defaultValue)`
@param defaultValue the value to return if `iterable` is empty
@return the last element of `iterable` or the default value
**Since:** 3.0

### `getLastInNonemptyList(`java.util.List<T>` list)`

**Returns:** `T`

### `skip(`java.lang.Iterable<T>` iterable, `int` numberToSkip)`

**Returns:** `java.lang.Iterable<T>`

Returns a view of `iterable` that skips its first `numberToSkip` elements. If
 `iterable` contains fewer than `numberToSkip` elements, the returned iterable skips
 all of its elements.

 <p>Modifications to the underlying `Iterable` before a call to `iterator()` are
 reflected in the returned iterator. That is, the iterator skips the first `numberToSkip`
 elements that exist when the `Iterator` is created, not when `skip()` is called.

 <p>The returned iterable's iterator supports `remove()` if the iterator of the underlying
 iterable supports it. Note that it is <i>not</i> possible to delete the last skipped element by
 immediately calling `remove()` on that iterator, as the `Iterator` contract states
 that a call to `remove()` before a call to `next()` will throw an `IllegalStateException`.

 <p><b>`Stream` equivalent:</b> `Stream.skip`
**Since:** 3.0

### `limit(`java.lang.Iterable<T>` iterable, `int` limitSize)`

**Returns:** `java.lang.Iterable<T>`

Returns a view of `iterable` containing its first `limitSize` elements. If `iterable` contains fewer than `limitSize` elements, the returned view contains all of its
 elements. The returned iterable's iterator supports `remove()` if `iterable`'s
 iterator does.

 <p><b>`Stream` equivalent:</b> `Stream.limit`
@param iterable the iterable to limit
@param limitSize the maximum number of elements in the returned iterable
@throws IllegalArgumentException if `limitSize` is negative
**Since:** 3.0

### `consumingIterable(`java.lang.Iterable<T>` iterable)`

**Returns:** `java.lang.Iterable<T>`

Returns a view of the supplied iterable that wraps each generated `Iterator` through
 `Iterators.consumingIterator(Iterator)`.

 <p>Note: If `iterable` is a `Queue`, the returned iterable will instead use `Queue.isEmpty` and `Queue.remove()`, since `Queue`'s iteration order is undefined.
 Calling `Iterator.hasNext()` on a generated iterator from the returned iterable may cause
 an item to be immediately dequeued for return on a subsequent call to `Iterator.next()`.

 <p>Whether the input `iterable` is a `Queue` or not, the returned `Iterable`
 is not thread-safe.
@param iterable the iterable to wrap
@return a view of the supplied iterable that wraps each generated iterator through `Iterators.consumingIterator(Iterator)`; for queues, an iterable that generates iterators
     that return and consume the queue's elements in queue order
**See:** Iterators#consumingIterator(Iterator)
**Since:** 2.0

### `isEmpty(`java.lang.Iterable<?>` iterable)`

**Returns:** `boolean`

Determines if the given iterable contains no elements.

 <p>There is no precise `Iterator` equivalent to this method, since one can only ask an
 iterator whether it has any elements <i>remaining</i> (which one does using `Iterator.hasNext`).

 <p><b>`Stream` equivalent:</b> `!stream.findAny().isPresent()`
@return `true` if the iterable contains no elements

### `mergeSorted(`java.lang.Iterable<? extends java.lang.Iterable<? extends T>>` iterables, `java.util.Comparator<? super T>` comparator)`

**Returns:** `java.lang.Iterable<T>`

Returns an iterable over the merged contents of all given `iterables`. Equivalent entries
 will not be de-duplicated.

 <p>Callers must ensure that the source `iterables` are in non-descending order as this
 method does not sort its input.

 <p>For any equivalent elements across all `iterables`, it is undefined which element is
 returned first.
**Since:** 11.0

