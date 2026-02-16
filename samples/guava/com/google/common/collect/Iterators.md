# Class: `Iterators`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Iterators`

## Description

This class contains static utility methods that operate on or return objects of type `Iterator`. Except as noted, each method has a corresponding `Iterable`-based method in the
 `Iterables` class.

 <p><i>Performance notes:</i> Unless otherwise noted, all of the iterators produced in this class
 are <i>lazy</i>, which means that they only advance the backing iteration when absolutely
 necessary.

 <p>See the Guava User Guide section on <a href="https://github.com/google/guava/wiki/CollectionUtilitiesExplained#iterables">`Iterators`</a>.
**Author:** Kevin Bourrillion
**Author:** Jared Levy
**Since:** 2.0

## Constructors

### `<init>()`

## Methods

### `emptyIterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<T>`](./UnmodifiableIterator.md)

Returns the empty iterator.

 <p>The `Iterable` equivalent of this method is `ImmutableSet.of()`.

### `emptyListIterator()`

**Returns:** [`com.google.common.collect.UnmodifiableListIterator<T>`](./UnmodifiableListIterator.md)

Returns the empty iterator.

 <p>The `Iterable` equivalent of this method is `ImmutableSet.of()`.

### `emptyModifiableIterator()`

**Returns:** `java.util.Iterator<T>`

Returns the empty `Iterator` that throws `IllegalStateException` instead of `UnsupportedOperationException` on a call to `Iterator.remove()`.

### `unmodifiableIterator(`java.util.Iterator<? extends T>` iterator)`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<T>`](./UnmodifiableIterator.md)

Returns an unmodifiable view of `iterator`.

### `unmodifiableIterator([`com.google.common.collect.UnmodifiableIterator<T>`](./UnmodifiableIterator.md) iterator)`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<T>`](./UnmodifiableIterator.md)

Simply returns its argument.
**Deprecated:**no need to use this
**Since:** 10.0

### `size(`java.util.Iterator<?>` iterator)`

**Returns:** `int`

Returns the number of elements remaining in `iterator`. The iterator will be left
 exhausted: its `hasNext()` method will return `false`.

### `contains(`java.util.Iterator<?>` iterator, `java.lang.Object` element)`

**Returns:** `boolean`

Returns `true` if `iterator` contains `element`.

### `removeAll(`java.util.Iterator<?>` removeFrom, `java.util.Collection<?>` elementsToRemove)`

**Returns:** `boolean`

Traverses an iterator and removes every element that belongs to the provided collection. The
 iterator will be left exhausted: its `hasNext()` method will return `false`.
@param removeFrom the iterator to (potentially) remove elements from
@param elementsToRemove the elements to remove
@return `true` if any element was removed from `iterator`

### `removeIf(`java.util.Iterator<T>` removeFrom, [`com.google.common.base.Predicate<? super T>`](../base/Predicate.md) predicate)`

**Returns:** `boolean`

Removes every element that satisfies the provided predicate from the iterator. The iterator
 will be left exhausted: its `hasNext()` method will return `false`.
@param removeFrom the iterator to (potentially) remove elements from
@param predicate a predicate that determines whether an element should be removed
@return `true` if any elements were removed from the iterator
**Since:** 2.0

### `retainAll(`java.util.Iterator<?>` removeFrom, `java.util.Collection<?>` elementsToRetain)`

**Returns:** `boolean`

Traverses an iterator and removes every element that does not belong to the provided
 collection. The iterator will be left exhausted: its `hasNext()` method will return
 `false`.
@param removeFrom the iterator to (potentially) remove elements from
@param elementsToRetain the elements to retain
@return `true` if any element was removed from `iterator`

### `elementsEqual(`java.util.Iterator<?>` iterator1, `java.util.Iterator<?>` iterator2)`

**Returns:** `boolean`

Determines whether two iterators contain equal elements in the same order. More specifically,
 this method returns `true` if `iterator1` and `iterator2` contain the same
 number of elements and every element of `iterator1` is equal to the corresponding element
 of `iterator2`.

 <p>Note that this will modify the supplied iterators, since they will have been advanced some
 number of elements forward.

### `toString(`java.util.Iterator<?>` iterator)`

**Returns:** `java.lang.String`

Returns a string representation of `iterator`, with the format `[e1, e2, ..., en]`.
 The iterator will be left exhausted: its `hasNext()` method will return `false`.

### `getOnlyElement(`java.util.Iterator<T>` iterator)`

**Returns:** `T`

Returns the single element contained in `iterator`.
@throws NoSuchElementException if the iterator is empty
@throws IllegalArgumentException if the iterator contains multiple elements. The state of the
     iterator is unspecified.

### `getOnlyElement(`java.util.Iterator<? extends T>` iterator, `T` defaultValue)`

**Returns:** `T`

Returns the single element contained in `iterator`, or `defaultValue` if the
 iterator is empty.
@throws IllegalArgumentException if the iterator contains multiple elements. The state of the
     iterator is unspecified.

### `toArray(`java.util.Iterator<? extends T>` iterator, `java.lang.Class<@org.checkerframework.checker.nullness.qual.NonNull T>` type)`

**Returns:** `T[]`

Copies an iterator's elements into an array. The iterator will be left exhausted: its `hasNext()` method will return `false`.
@param iterator the iterator to copy
@param type the type of the elements
@return a newly-allocated array into which all the elements of the iterator have been copied

### `addAll(`java.util.Collection<T>` addTo, `java.util.Iterator<? extends T>` iterator)`

**Returns:** `boolean`

Adds all elements in `iterator` to `collection`. The iterator will be left
 exhausted: its `hasNext()` method will return `false`.
@return `true` if `collection` was modified as a result of this operation

### `frequency(`java.util.Iterator<?>` iterator, `java.lang.Object` element)`

**Returns:** `int`

Returns the number of elements in the specified iterator that equal the specified object. The
 iterator will be left exhausted: its `hasNext()` method will return `false`.
**See:** Collections#frequency

### `cycle(`java.lang.Iterable<T>` iterable)`

**Returns:** `java.util.Iterator<T>`

Returns an iterator that cycles indefinitely over the elements of `iterable`.

 <p>The returned iterator supports `remove()` if the provided iterator does. After `remove()` is called, subsequent cycles omit the removed element, which is no longer in `iterable`. The iterator's `hasNext()` method returns `true` until `iterable`
 is empty.

 <p><b>Warning:</b> Typical uses of the resulting iterator may produce an infinite loop. You
 should use an explicit `break` or be certain that you will eventually remove all the
 elements.

### `cycle(`T[]` elements)`

**Returns:** `java.util.Iterator<T>`

Returns an iterator that cycles indefinitely over the provided elements.

 <p>The returned iterator supports `remove()`. After `remove()` is called,
 subsequent cycles omit the removed element, but `elements` does not change. The
 iterator's `hasNext()` method returns `true` until all of the original elements
 have been removed.

 <p><b>Warning:</b> Typical uses of the resulting iterator may produce an infinite loop. You
 should use an explicit `break` or be certain that you will eventually remove all the
 elements.

### `consumingForArray([`@org.checkerframework.checker.nullness.qual.Nullable I[]`](../../../../@org/checkerframework/checker/nullness/qual/Nullable I.md) elements)`

**Returns:** `java.util.Iterator<I>`

Returns an Iterator that walks the specified array, nulling out elements behind it. This can
 avoid memory leaks when an element is no longer necessary.

 <p>This method accepts an array with element type `@Nullable T`, but callers must pass an
 array whose contents are initially non-null. The `@Nullable` annotation indicates that
 this method will write nulls into the array during iteration.

 <p>This is mainly just to avoid the intermediate ArrayDeque in ConsumingQueueIterator.

### `concat(`java.util.Iterator<? extends T>` a, `java.util.Iterator<? extends T>` b)`

**Returns:** `java.util.Iterator<T>`

Combines two iterators into a single iterator. The returned iterator iterates across the
 elements in `a`, followed by the elements in `b`. The source iterators are not
 polled until necessary.

 <p>The returned iterator supports `remove()` when the corresponding input iterator
 supports it.

### `concat(`java.util.Iterator<? extends T>` a, `java.util.Iterator<? extends T>` b, `java.util.Iterator<? extends T>` c)`

**Returns:** `java.util.Iterator<T>`

Combines three iterators into a single iterator. The returned iterator iterates across the
 elements in `a`, followed by the elements in `b`, followed by the elements in
 `c`. The source iterators are not polled until necessary.

 <p>The returned iterator supports `remove()` when the corresponding input iterator
 supports it.

### `concat(`java.util.Iterator<? extends T>` a, `java.util.Iterator<? extends T>` b, `java.util.Iterator<? extends T>` c, `java.util.Iterator<? extends T>` d)`

**Returns:** `java.util.Iterator<T>`

Combines four iterators into a single iterator. The returned iterator iterates across the
 elements in `a`, followed by the elements in `b`, followed by the elements in
 `c`, followed by the elements in `d`. The source iterators are not polled until
 necessary.

 <p>The returned iterator supports `remove()` when the corresponding input iterator
 supports it.

### `concat(`java.util.Iterator<? extends T>[]` inputs)`

**Returns:** `java.util.Iterator<T>`

Combines multiple iterators into a single iterator. The returned iterator iterates across the
 elements of each iterator in `inputs`. The input iterators are not polled until
 necessary.

 <p>The returned iterator supports `remove()` when the corresponding input iterator
 supports it.
@throws NullPointerException if any of the provided iterators is null

### `concat(`java.util.Iterator<? extends java.util.Iterator<? extends T>>` inputs)`

**Returns:** `java.util.Iterator<T>`

Combines multiple iterators into a single iterator. The returned iterator iterates across the
 elements of each iterator in `inputs`. The input iterators are not polled until
 necessary.

 <p>The returned iterator supports `remove()` when the corresponding input iterator
 supports it. The methods of the returned iterator may throw `NullPointerException` if any
 of the input iterators is null.

### `concatNoDefensiveCopy(`java.util.Iterator<? extends T>[]` inputs)`

**Returns:** `java.util.Iterator<T>`

Concats a varargs array of iterators without making a defensive copy of the array.

### `partition(`java.util.Iterator<T>` iterator, `int` size)`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<java.util.List<T>>`](./UnmodifiableIterator>.md)

Divides an iterator into unmodifiable sublists of the given size (the final list may be
 smaller). For example, partitioning an iterator containing `[a, b, c, d, e]` with a
 partition size of 3 yields `[[a, b, c], [d, e]]` -- an outer iterator containing two
 inner lists of three and two elements, all in the original order.

 <p>The returned lists implement `java.util.RandomAccess`.

 <p><b>Note:</b> The current implementation eagerly allocates storage for `size` elements.
 As a consequence, passing values like `Integer.MAX_VALUE` can lead to `OutOfMemoryError`.
@param iterator the iterator to return a partitioned view of
@param size the desired size of each partition (the last may be smaller)
@return an iterator of immutable lists containing the elements of `iterator` divided into
     partitions
@throws IllegalArgumentException if `size` is nonpositive

### `paddedPartition(`java.util.Iterator<T>` iterator, `int` size)`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<java.util.List<@org.checkerframework.checker.nullness.qual.Nullable T>>`](./UnmodifiableIterator>.md)

Divides an iterator into unmodifiable sublists of the given size, padding the final iterator
 with null values if necessary. For example, partitioning an iterator containing `[a, b,
 c, d, e]` with a partition size of 3 yields `[[a, b, c], [d, e, null]]` -- an outer
 iterator containing two inner lists of three elements each, all in the original order.

 <p>The returned lists implement `java.util.RandomAccess`.
@param iterator the iterator to return a partitioned view of
@param size the desired size of each partition
@return an iterator of immutable lists containing the elements of `iterator` divided into
     partitions (the final iterable may have trailing null elements)
@throws IllegalArgumentException if `size` is nonpositive

### `partitionImpl(`java.util.Iterator<T>` iterator, `int` size, `boolean` pad)`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<java.util.List<@org.checkerframework.checker.nullness.qual.Nullable T>>`](./UnmodifiableIterator>.md)

### `filter(`java.util.Iterator<T>` unfiltered, [`com.google.common.base.Predicate<? super T>`](../base/Predicate.md) retainIfTrue)`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<T>`](./UnmodifiableIterator.md)

Returns a view of `unfiltered` containing all elements that satisfy the input predicate
 `retainIfTrue`.

### `filter(`java.util.Iterator<?>` unfiltered, `java.lang.Class<T>` desiredType)`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<T>`](./UnmodifiableIterator.md)

Returns a view of `unfiltered` containing all elements that are of the type `desiredType`.

### `any(`java.util.Iterator<T>` iterator, [`com.google.common.base.Predicate<? super T>`](../base/Predicate.md) predicate)`

**Returns:** `boolean`

Returns `true` if one or more elements returned by `iterator` satisfy the given
 predicate.

### `all(`java.util.Iterator<T>` iterator, [`com.google.common.base.Predicate<? super T>`](../base/Predicate.md) predicate)`

**Returns:** `boolean`

Returns `true` if every element returned by `iterator` satisfies the given
 predicate. If `iterator` is empty, `true` is returned.

### `find(`java.util.Iterator<T>` iterator, [`com.google.common.base.Predicate<? super T>`](../base/Predicate.md) predicate)`

**Returns:** `T`

Returns the first element in `iterator` that satisfies the given predicate; use this
 method only when such an element is known to exist. If no such element is found, the iterator
 will be left exhausted: its `hasNext()` method will return `false`. If it is
 possible that <i>no</i> element will match, use `tryFind` or `find(Iterator,
 Predicate, Object)` instead.
@throws NoSuchElementException if no element in `iterator` matches the given predicate

### `find(`java.util.Iterator<? extends T>` iterator, [`com.google.common.base.Predicate<? super T>`](../base/Predicate.md) predicate, `T` defaultValue)`

**Returns:** `T`

Returns the first element in `iterator` that satisfies the given predicate. If no such
 element is found, `defaultValue` will be returned from this method and the iterator will
 be left exhausted: its `hasNext()` method will return `false`. Note that this can
 usually be handled more naturally using `tryFind(iterator, predicate).or(defaultValue)`.
**Since:** 7.0

### `tryFind(`java.util.Iterator<T>` iterator, [`com.google.common.base.Predicate<? super T>`](../base/Predicate.md) predicate)`

**Returns:** [`com.google.common.base.Optional<T>`](../base/Optional.md)

Returns an `Optional` containing the first element in `iterator` that satisfies the
 given predicate, if such an element exists. If no such element is found, an empty `Optional` will be returned from this method and the iterator will be left exhausted: its `hasNext()` method will return `false`.

 <p><b>Warning:</b> avoid using a `predicate` that matches `null`. If `null`
 is matched in `iterator`, a NullPointerException will be thrown.
**Since:** 11.0

### `indexOf(`java.util.Iterator<T>` iterator, [`com.google.common.base.Predicate<? super T>`](../base/Predicate.md) predicate)`

**Returns:** `int`

Returns the index in `iterator` of the first element that satisfies the provided `predicate`, or `-1` if the Iterator has no such elements.

 <p>More formally, returns the lowest index `i` such that `predicate.apply(Iterators.get(iterator, i))` returns `true`, or `-1` if there is no
 such index.

 <p>If -1 is returned, the iterator will be left exhausted: its `hasNext()` method will
 return `false`. Otherwise, the iterator will be set to the element which satisfies the
 `predicate`.
**Since:** 2.0

### `transform(`java.util.Iterator<F>` fromIterator, [`com.google.common.base.Function<? super F,? extends T>`](../base/Function.md) function)`

**Returns:** `java.util.Iterator<T>`

Returns a view containing the result of applying `function` to each element of `fromIterator`.

 <p>The returned iterator supports `remove()` if `fromIterator` does. After a
 successful `remove()` call, `fromIterator` no longer contains the corresponding
 element.

### `get(`java.util.Iterator<T>` iterator, `int` position)`

**Returns:** `T`

Advances `iterator` `position + 1` times, returning the element at the `position`th position.
@param position position of the element to return
@return the element at the specified position in `iterator`
@throws IndexOutOfBoundsException if `position` is negative or greater than or equal to
     the number of elements remaining in `iterator`

### `get(`java.util.Iterator<? extends T>` iterator, `int` position, `T` defaultValue)`

**Returns:** `T`

Advances `iterator` `position + 1` times, returning the element at the `position`th position or `defaultValue` otherwise.
@param position position of the element to return
@param defaultValue the default value to return if the iterator is empty or if `position`
     is greater than the number of elements remaining in `iterator`
@return the element at the specified position in `iterator` or `defaultValue` if
     `iterator` produces fewer than `position + 1` elements.
@throws IndexOutOfBoundsException if `position` is negative
**Since:** 4.0

### `checkNonnegative(`int` position)`

**Returns:** `void`

### `getNext(`java.util.Iterator<? extends T>` iterator, `T` defaultValue)`

**Returns:** `T`

Returns the next element in `iterator` or `defaultValue` if the iterator is empty.
 The `Iterables` analog to this method is `Iterables.getFirst`.
@param defaultValue the default value to return if the iterator is empty
@return the next element of `iterator` or the default value
**Since:** 7.0

### `getLast(`java.util.Iterator<T>` iterator)`

**Returns:** `T`

Advances `iterator` to the end, returning the last element.
@return the last element of `iterator`
@throws NoSuchElementException if the iterator is empty

### `getLast(`java.util.Iterator<? extends T>` iterator, `T` defaultValue)`

**Returns:** `T`

Advances `iterator` to the end, returning the last element or `defaultValue` if the
 iterator is empty.
@param defaultValue the default value to return if the iterator is empty
@return the last element of `iterator`
**Since:** 3.0

### `advance(`java.util.Iterator<?>` iterator, `int` numberToAdvance)`

**Returns:** `int`

Calls `next()` on `iterator`, either `numberToAdvance` times or until `hasNext()` returns `false`, whichever comes first.
@return the number of elements the iterator was advanced
**Since:** 13.0 (since 3.0 as `Iterators.skip`)

### `limit(`java.util.Iterator<T>` iterator, `int` limitSize)`

**Returns:** `java.util.Iterator<T>`

Returns a view containing the first `limitSize` elements of `iterator`. If `iterator` contains fewer than `limitSize` elements, the returned view contains all of its
 elements. The returned iterator supports `remove()` if `iterator` does.
@param iterator the iterator to limit
@param limitSize the maximum number of elements in the returned iterator
@throws IllegalArgumentException if `limitSize` is negative
**Since:** 3.0

### `consumingIterator(`java.util.Iterator<T>` iterator)`

**Returns:** `java.util.Iterator<T>`

Returns a view of the supplied `iterator` that removes each element from the supplied
 `iterator` as it is returned.

 <p>The provided iterator must support `Iterator.remove()` or else the returned iterator
 will fail on the first call to `next`. The returned `Iterator` is also not
 thread-safe.
@param iterator the iterator to remove and return elements from
@return an iterator that removes and returns elements from the supplied iterator
**Since:** 2.0

### `pollNext(`java.util.Iterator<T>` iterator)`

**Returns:** `T`

Deletes and returns the next value from the iterator, or returns `null` if there is no
 such value.

### `clear(`java.util.Iterator<?>` iterator)`

**Returns:** `void`

Clears the iterator using its remove method.

### `forArray(`T[]` array)`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<T>`](./UnmodifiableIterator.md)

Returns an iterator containing the elements of `array` in order. The returned iterator is
 a view of the array; subsequent changes to the array will be reflected in the iterator.

 <p><b>Note:</b> It is often preferable to represent your data using a collection type, for
 example using `Arrays.asList(Object[])`, making this method unnecessary.

 <p>The `Iterable` equivalent of this method is either `Arrays.asList(Object[])`,
 `ImmutableList.copyOf(Object[])`}, or `ImmutableList.of`.

### `forArrayWithPosition(`T[]` array, `int` position)`

**Returns:** [`com.google.common.collect.UnmodifiableListIterator<T>`](./UnmodifiableListIterator.md)

Returns a list iterator containing the elements in the specified `array` in order,
 starting at the specified `position`.

 <p>The `Iterable` equivalent of this method is `Arrays.asList(array).listIterator(position)`.

### `singletonIterator(`T` value)`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<T>`](./UnmodifiableIterator.md)

Returns an iterator containing only `value`.

 <p>The `Iterable` equivalent of this method is `Collections.singleton`.

### `forEnumeration(`java.util.Enumeration<T>` enumeration)`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<T>`](./UnmodifiableIterator.md)

Adapts an `Enumeration` to the `Iterator` interface.

 <p>This method has no equivalent in `Iterables` because viewing an `Enumeration` as
 an `Iterable` is impossible. However, the contents can be <i>copied</i> into a collection
 using `Collections.list`.

 <p><b>Java 9 users:</b> use `enumeration.asIterator()` instead, unless it is important to
 return an `UnmodifiableIterator` instead of a plain `Iterator`.

### `asEnumeration(`java.util.Iterator<T>` iterator)`

**Returns:** `java.util.Enumeration<T>`

Adapts an `Iterator` to the `Enumeration` interface.

 <p>The `Iterable` equivalent of this method is either `Collections.enumeration` (if
 you have a `Collection`), or `Iterators.asEnumeration(collection.iterator())`.

### `peekingIterator(`java.util.Iterator<? extends T>` iterator)`

**Returns:** [`com.google.common.collect.PeekingIterator<T>`](./PeekingIterator.md)

Returns a `PeekingIterator` backed by the given iterator.

 <p>Calls to the `peek` method with no intervening calls to `next` do not affect the
 iteration, and hence return the same object each time. A subsequent call to `next` is
 guaranteed to return the same object again. For example:

 <pre>`PeekingIterator<String> peekingIterator =
     Iterators.peekingIterator(Iterators.forArray("a", "b"));
 String a1 = peekingIterator.peek(); // returns "a"
 String a2 = peekingIterator.peek(); // also returns "a"
 String a3 = peekingIterator.next(); // also returns "a"
 `</pre>

 <p>Any structural changes to the underlying iteration (aside from those performed by the
 iterator's own `PeekingIterator.remove()` method) will leave the iterator in an undefined
 state.

 <p>The returned iterator does not support removal after peeking, as explained by `PeekingIterator.remove()`.

 <p>Note: If the given iterator is already a `PeekingIterator`, it <i>might</i> be
 returned to the caller, although this is neither guaranteed to occur nor required to be
 consistent. For example, this method <i>might</i> choose to pass through recognized
 implementations of `PeekingIterator` when the behavior of the implementation is known to
 meet the contract guaranteed by this method.

 <p>There is no `Iterable` equivalent to this method, so use this method to wrap each
 individual iterator as it is generated.
@param iterator the backing iterator. The `PeekingIterator` assumes ownership of this
     iterator, so users should cease making direct calls to it after calling this method.
@return a peeking iterator backed by that iterator. Apart from the additional `PeekingIterator.peek()` method, this iterator behaves exactly the same as `iterator`.

### `peekingIterator([`com.google.common.collect.PeekingIterator<T>`](./PeekingIterator.md) iterator)`

**Returns:** [`com.google.common.collect.PeekingIterator<T>`](./PeekingIterator.md)

Simply returns its argument.
**Deprecated:**no need to use this
**Since:** 10.0

### `mergeSorted(`java.lang.Iterable<? extends java.util.Iterator<? extends T>>` iterators, `java.util.Comparator<? super T>` comparator)`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<T>`](./UnmodifiableIterator.md)

Returns an iterator over the merged contents of all given `iterators`, traversing every
 element of the input iterators. Equivalent entries will not be de-duplicated.

 <p>Callers must ensure that the source `iterators` are in non-descending order as this
 method does not sort its input.

 <p>For any equivalent elements across all `iterators`, it is undefined which element is
 returned first.
**Since:** 11.0

