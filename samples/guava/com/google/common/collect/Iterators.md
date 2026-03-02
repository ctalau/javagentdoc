# Class: `Iterators`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Iterators`

## Description

Except as noted, each method has a corresponding Iterable-based method in the
 Iterables class.

 
*Performance notes:* Unless otherwise noted, all of the iterators produced in this class
 are *lazy*, which means that they only advance the backing iteration when absolutely
 necessary.

 
See the Guava User Guide section on [
 Iterators](https://github.com/google/guava/wiki/CollectionUtilitiesExplained#iterables).

## Constructors

### `<init>()`

## Methods

### `emptyIterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<T>`](./UnmodifiableIterator.md)

The Iterable equivalent of this method is ImmutableSet#of().

### `emptyListIterator()`

**Returns:** [`com.google.common.collect.UnmodifiableListIterator<T>`](./UnmodifiableListIterator.md)

The Iterable equivalent of this method is ImmutableSet#of().

### `emptyModifiableIterator()`

**Returns:** `java.util.Iterator<T>`

### `unmodifiableIterator(java.util.Iterator<? extends T> iterator)`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<T>`](./UnmodifiableIterator.md)

**Parameters:**
- `iterator` (`java.util.Iterator<? extends T>`)

### `unmodifiableIterator(com.google.common.collect.UnmodifiableIterator<T> iterator)`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<T>`](./UnmodifiableIterator.md)

**Parameters:**
- `iterator` ([`com.google.common.collect.UnmodifiableIterator<T>`](./UnmodifiableIterator.md))

### `size(java.util.Iterator<?> iterator)`

**Returns:** `int`

The iterator will be left
 exhausted: its hasNext() method will return false.

**Parameters:**
- `iterator` (`java.util.Iterator<?>`)

### `contains(java.util.Iterator<?> iterator, java.lang.Object element)`

**Returns:** `boolean`

**Parameters:**
- `iterator` (`java.util.Iterator<?>`)
- `element` (`java.lang.Object`)

### `removeAll(java.util.Iterator<?> removeFrom, java.util.Collection<?> elementsToRemove)`

**Returns:** `boolean`

The
 iterator will be left exhausted: its hasNext() method will return false.

**Parameters:**
- `removeFrom` (`java.util.Iterator<?>`): the iterator to (potentially) remove elements from
- `elementsToRemove` (`java.util.Collection<?>`): the elements to remove

### `removeIf(java.util.Iterator<T> removeFrom, com.google.common.base.Predicate<? super T> predicate)`

**Returns:** `boolean`

The iterator
 will be left exhausted: its hasNext() method will return false.

**Parameters:**
- `removeFrom` (`java.util.Iterator<T>`): the iterator to (potentially) remove elements from
- `predicate` ([`com.google.common.base.Predicate<? super T>`](../base/Predicate.md)): a predicate that determines whether an element should be removed

### `retainAll(java.util.Iterator<?> removeFrom, java.util.Collection<?> elementsToRetain)`

**Returns:** `boolean`

The iterator will be left exhausted: its hasNext() method will return
 false.

**Parameters:**
- `removeFrom` (`java.util.Iterator<?>`): the iterator to (potentially) remove elements from
- `elementsToRetain` (`java.util.Collection<?>`): the elements to retain

### `elementsEqual(java.util.Iterator<?> iterator1, java.util.Iterator<?> iterator2)`

**Returns:** `boolean`

More specifically,
 this method returns true if iterator1 and iterator2 contain the same
 number of elements and every element of iterator1 is equal to the corresponding element
 of iterator2.

 
Note that this will modify the supplied iterators, since they will have been advanced some
 number of elements forward.

**Parameters:**
- `iterator1` (`java.util.Iterator<?>`)
- `iterator2` (`java.util.Iterator<?>`)

### `toString(java.util.Iterator<?> iterator)`

**Returns:** `java.lang.String`

The iterator will be left exhausted: its hasNext() method will return false.

**Parameters:**
- `iterator` (`java.util.Iterator<?>`)

### `getOnlyElement(java.util.Iterator<T> iterator)`

**Returns:** `T`

**Parameters:**
- `iterator` (`java.util.Iterator<T>`)

### `getOnlyElement(java.util.Iterator<? extends T> iterator, T defaultValue)`

**Returns:** `T`

**Parameters:**
- `iterator` (`java.util.Iterator<? extends T>`)
- `defaultValue` (`T`)

### `toArray(java.util.Iterator<? extends T> iterator, java.lang.Class<@org.checkerframework.checker.nullness.qual.NonNull T> type)`

**Returns:** `T[]`

The iterator will be left exhausted: its 
 hasNext() method will return false.

**Parameters:**
- `iterator` (`java.util.Iterator<? extends T>`): the iterator to copy
- `type` (`java.lang.Class<@org.checkerframework.checker.nullness.qual.NonNull T>`): the type of the elements

### `addAll(java.util.Collection<T> addTo, java.util.Iterator<? extends T> iterator)`

**Returns:** `boolean`

The iterator will be left
 exhausted: its hasNext() method will return false.

**Parameters:**
- `addTo` (`java.util.Collection<T>`)
- `iterator` (`java.util.Iterator<? extends T>`)

### `frequency(java.util.Iterator<?> iterator, java.lang.Object element)`

**Returns:** `int`

The
 iterator will be left exhausted: its hasNext() method will return false.

**Parameters:**
- `iterator` (`java.util.Iterator<?>`)
- `element` (`java.lang.Object`)

### `cycle(java.lang.Iterable<T> iterable)`

**Returns:** `java.util.Iterator<T>`

The returned iterator supports remove() if the provided iterator does. After 
 remove() is called, subsequent cycles omit the removed element, which is no longer in 
 iterable. The iterator's hasNext() method returns true until iterable
 is empty.

 
**Warning:** Typical uses of the resulting iterator may produce an infinite loop. You
 should use an explicit break or be certain that you will eventually remove all the
 elements.

**Parameters:**
- `iterable` (`java.lang.Iterable<T>`)

### `cycle(T[] elements)`

**Returns:** `java.util.Iterator<T>`

The returned iterator supports remove(). After remove() is called,
 subsequent cycles omit the removed element, but elements does not change. The
 iterator's hasNext() method returns true until all of the original elements
 have been removed.

 
**Warning:** Typical uses of the resulting iterator may produce an infinite loop. You
 should use an explicit break or be certain that you will eventually remove all the
 elements.

**Parameters:**
- `elements` (`T[]`)

### `consumingForArray(@org.checkerframework.checker.nullness.qual.Nullable I[] elements)`

**Returns:** `java.util.Iterator<I>`

This can
 avoid memory leaks when an element is no longer necessary.

 
This method accepts an array with element type @Nullable T, but callers must pass an
 array whose contents are initially non-null. The @Nullable annotation indicates that
 this method will write nulls into the array during iteration.

 
This is mainly just to avoid the intermediate ArrayDeque in ConsumingQueueIterator.

**Parameters:**
- `elements` (`@org.checkerframework.checker.nullness.qual.Nullable I[]`)

### `concat(java.util.Iterator<? extends T> a, java.util.Iterator<? extends T> b)`

**Returns:** `java.util.Iterator<T>`

The returned iterator iterates across the
 elements in a, followed by the elements in b. The source iterators are not
 polled until necessary.

 
The returned iterator supports remove() when the corresponding input iterator
 supports it.

**Parameters:**
- `a` (`java.util.Iterator<? extends T>`)
- `b` (`java.util.Iterator<? extends T>`)

### `concat(java.util.Iterator<? extends T> a, java.util.Iterator<? extends T> b, java.util.Iterator<? extends T> c)`

**Returns:** `java.util.Iterator<T>`

The returned iterator iterates across the
 elements in a, followed by the elements in b, followed by the elements in
 c. The source iterators are not polled until necessary.

 
The returned iterator supports remove() when the corresponding input iterator
 supports it.

**Parameters:**
- `a` (`java.util.Iterator<? extends T>`)
- `b` (`java.util.Iterator<? extends T>`)
- `c` (`java.util.Iterator<? extends T>`)

### `concat(java.util.Iterator<? extends T> a, java.util.Iterator<? extends T> b, java.util.Iterator<? extends T> c, java.util.Iterator<? extends T> d)`

**Returns:** `java.util.Iterator<T>`

The returned iterator iterates across the
 elements in a, followed by the elements in b, followed by the elements in
 c, followed by the elements in d. The source iterators are not polled until
 necessary.

 
The returned iterator supports remove() when the corresponding input iterator
 supports it.

**Parameters:**
- `a` (`java.util.Iterator<? extends T>`)
- `b` (`java.util.Iterator<? extends T>`)
- `c` (`java.util.Iterator<? extends T>`)
- `d` (`java.util.Iterator<? extends T>`)

### `concat(java.util.Iterator<? extends T>[] inputs)`

**Returns:** `java.util.Iterator<T>`

The returned iterator iterates across the
 elements of each iterator in inputs. The input iterators are not polled until
 necessary.

 
The returned iterator supports remove() when the corresponding input iterator
 supports it.

**Parameters:**
- `inputs` (`java.util.Iterator<? extends T>[]`)

### `concat(java.util.Iterator<? extends java.util.Iterator<? extends T>> inputs)`

**Returns:** `java.util.Iterator<T>`

The returned iterator iterates across the
 elements of each iterator in inputs. The input iterators are not polled until
 necessary.

 
The returned iterator supports remove() when the corresponding input iterator
 supports it. The methods of the returned iterator may throw NullPointerException if any
 of the input iterators is null.

**Parameters:**
- `inputs` (`java.util.Iterator<? extends java.util.Iterator<? extends T>>`)

### `concatNoDefensiveCopy(java.util.Iterator<? extends T>[] inputs)`

**Returns:** `java.util.Iterator<T>`

**Parameters:**
- `inputs` (`java.util.Iterator<? extends T>[]`)

### `partition(java.util.Iterator<T> iterator, int size)`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<java.util.List<T>>`](./UnmodifiableIterator.md)

For example, partitioning an iterator containing [a, b, c, d, e] with a
 partition size of 3 yields [[a, b, c], [d, e]] -- an outer iterator containing two
 inner lists of three and two elements, all in the original order.

 
The returned lists implement java.util.RandomAccess.

 
**Note:** The current implementation eagerly allocates storage for size elements.
 As a consequence, passing values like Integer.MAX_VALUE can lead to OutOfMemoryError.

**Parameters:**
- `iterator` (`java.util.Iterator<T>`): the iterator to return a partitioned view of
- `size` (`int`): the desired size of each partition (the last may be smaller)

### `paddedPartition(java.util.Iterator<T> iterator, int size)`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<java.util.List<@org.checkerframework.checker.nullness.qual.Nullable T>>`](./UnmodifiableIterator.md)

For example, partitioning an iterator containing [a, b,
 c, d, e] with a partition size of 3 yields [[a, b, c], [d, e, null]] -- an outer
 iterator containing two inner lists of three elements each, all in the original order.

 
The returned lists implement java.util.RandomAccess.

**Parameters:**
- `iterator` (`java.util.Iterator<T>`): the iterator to return a partitioned view of
- `size` (`int`): the desired size of each partition

### `partitionImpl(java.util.Iterator<T> iterator, int size, boolean pad)`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<java.util.List<@org.checkerframework.checker.nullness.qual.Nullable T>>`](./UnmodifiableIterator.md)

**Parameters:**
- `iterator` (`java.util.Iterator<T>`)
- `size` (`int`)
- `pad` (`boolean`)

### `filter(java.util.Iterator<T> unfiltered, com.google.common.base.Predicate<? super T> retainIfTrue)`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<T>`](./UnmodifiableIterator.md)

**Parameters:**
- `unfiltered` (`java.util.Iterator<T>`)
- `retainIfTrue` ([`com.google.common.base.Predicate<? super T>`](../base/Predicate.md))

### `filter(java.util.Iterator<?> unfiltered, java.lang.Class<T> desiredType)`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<T>`](./UnmodifiableIterator.md)

**Parameters:**
- `unfiltered` (`java.util.Iterator<?>`)
- `desiredType` (`java.lang.Class<T>`)

### `any(java.util.Iterator<T> iterator, com.google.common.base.Predicate<? super T> predicate)`

**Returns:** `boolean`

**Parameters:**
- `iterator` (`java.util.Iterator<T>`)
- `predicate` ([`com.google.common.base.Predicate<? super T>`](../base/Predicate.md))

### `all(java.util.Iterator<T> iterator, com.google.common.base.Predicate<? super T> predicate)`

**Returns:** `boolean`

If iterator is empty, true is returned.

**Parameters:**
- `iterator` (`java.util.Iterator<T>`)
- `predicate` ([`com.google.common.base.Predicate<? super T>`](../base/Predicate.md))

### `find(java.util.Iterator<T> iterator, com.google.common.base.Predicate<? super T> predicate)`

**Returns:** `T`

If no such element is found, the iterator
 will be left exhausted: its hasNext() method will return false. If it is
 possible that *no* element will match, use #tryFind or #find(Iterator,
 Predicate, Object) instead.

**Parameters:**
- `iterator` (`java.util.Iterator<T>`)
- `predicate` ([`com.google.common.base.Predicate<? super T>`](../base/Predicate.md))

### `find(java.util.Iterator<? extends T> iterator, com.google.common.base.Predicate<? super T> predicate, T defaultValue)`

**Returns:** `T`

If no such
 element is found, defaultValue will be returned from this method and the iterator will
 be left exhausted: its hasNext() method will return false. Note that this can
 usually be handled more naturally using tryFind(iterator, predicate).or(defaultValue).

**Parameters:**
- `iterator` (`java.util.Iterator<? extends T>`)
- `predicate` ([`com.google.common.base.Predicate<? super T>`](../base/Predicate.md))
- `defaultValue` (`T`)

### `tryFind(java.util.Iterator<T> iterator, com.google.common.base.Predicate<? super T> predicate)`

**Returns:** [`com.google.common.base.Optional<T>`](../base/Optional.md)

If no such element is found, an empty Optional will be returned from this method and the iterator will be left exhausted: its 
 hasNext() method will return false.

 
**Warning:** avoid using a predicate that matches null. If null
 is matched in iterator, a NullPointerException will be thrown.

**Parameters:**
- `iterator` (`java.util.Iterator<T>`)
- `predicate` ([`com.google.common.base.Predicate<? super T>`](../base/Predicate.md))

### `indexOf(java.util.Iterator<T> iterator, com.google.common.base.Predicate<? super T> predicate)`

**Returns:** `int`

More formally, returns the lowest index i such that 
 predicate.apply(Iterators.get(iterator, i)) returns true, or -1 if there is no
 such index.

 
If -1 is returned, the iterator will be left exhausted: its hasNext() method will
 return false. Otherwise, the iterator will be set to the element which satisfies the
 predicate.

**Parameters:**
- `iterator` (`java.util.Iterator<T>`)
- `predicate` ([`com.google.common.base.Predicate<? super T>`](../base/Predicate.md))

### `transform(java.util.Iterator<F> fromIterator, com.google.common.base.Function<? super F,? extends T> function)`

**Returns:** `java.util.Iterator<T>`

The returned iterator supports remove() if fromIterator does. After a
 successful remove() call, fromIterator no longer contains the corresponding
 element.

**Parameters:**
- `fromIterator` (`java.util.Iterator<F>`)
- `function` ([`com.google.common.base.Function<? super F,? extends T>`](../base/Function.md))

### `get(java.util.Iterator<T> iterator, int position)`

**Returns:** `T`

**Parameters:**
- `iterator` (`java.util.Iterator<T>`)
- `position` (`int`): position of the element to return

### `get(java.util.Iterator<? extends T> iterator, int position, T defaultValue)`

**Returns:** `T`

**Parameters:**
- `iterator` (`java.util.Iterator<? extends T>`)
- `position` (`int`): position of the element to return
- `defaultValue` (`T`): the default value to return if the iterator is empty or if position
     is greater than the number of elements remaining in iterator

### `checkNonnegative(int position)`

**Returns:** `void`

**Parameters:**
- `position` (`int`)

### `getNext(java.util.Iterator<? extends T> iterator, T defaultValue)`

**Returns:** `T`

The Iterables analog to this method is Iterables#getFirst.

**Parameters:**
- `iterator` (`java.util.Iterator<? extends T>`)
- `defaultValue` (`T`): the default value to return if the iterator is empty

### `getLast(java.util.Iterator<T> iterator)`

**Returns:** `T`

**Parameters:**
- `iterator` (`java.util.Iterator<T>`)

### `getLast(java.util.Iterator<? extends T> iterator, T defaultValue)`

**Returns:** `T`

**Parameters:**
- `iterator` (`java.util.Iterator<? extends T>`)
- `defaultValue` (`T`): the default value to return if the iterator is empty

### `advance(java.util.Iterator<?> iterator, int numberToAdvance)`

**Returns:** `int`

**Parameters:**
- `iterator` (`java.util.Iterator<?>`)
- `numberToAdvance` (`int`)

### `limit(java.util.Iterator<T> iterator, int limitSize)`

**Returns:** `java.util.Iterator<T>`

If 
 iterator contains fewer than limitSize elements, the returned view contains all of its
 elements. The returned iterator supports remove() if iterator does.

**Parameters:**
- `iterator` (`java.util.Iterator<T>`): the iterator to limit
- `limitSize` (`int`): the maximum number of elements in the returned iterator

### `consumingIterator(java.util.Iterator<T> iterator)`

**Returns:** `java.util.Iterator<T>`

The provided iterator must support Iterator#remove() or else the returned iterator
 will fail on the first call to next. The returned Iterator is also not
 thread-safe.

**Parameters:**
- `iterator` (`java.util.Iterator<T>`): the iterator to remove and return elements from

### `pollNext(java.util.Iterator<T> iterator)`

**Returns:** `T`

**Parameters:**
- `iterator` (`java.util.Iterator<T>`)

### `clear(java.util.Iterator<?> iterator)`

**Returns:** `void`

**Parameters:**
- `iterator` (`java.util.Iterator<?>`)

### `forArray(T[] array)`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<T>`](./UnmodifiableIterator.md)

The returned iterator is
 a view of the array; subsequent changes to the array will be reflected in the iterator.

 
**Note:** It is often preferable to represent your data using a collection type, for
 example using Arrays#asList(Object[]), making this method unnecessary.

 
The Iterable equivalent of this method is either Arrays#asList(Object[]),
 ImmutableList#copyOf(Object[])}, or ImmutableList#of.

**Parameters:**
- `array` (`T[]`)

### `forArrayWithPosition(T[] array, int position)`

**Returns:** [`com.google.common.collect.UnmodifiableListIterator<T>`](./UnmodifiableListIterator.md)

The Iterable equivalent of this method is 
 Arrays.asList(array).listIterator(position).

**Parameters:**
- `array` (`T[]`)
- `position` (`int`)

### `singletonIterator(T value)`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<T>`](./UnmodifiableIterator.md)

The Iterable equivalent of this method is Collections#singleton.

**Parameters:**
- `value` (`T`)

### `forEnumeration(java.util.Enumeration<T> enumeration)`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<T>`](./UnmodifiableIterator.md)

This method has no equivalent in Iterables because viewing an Enumeration as
 an Iterable is impossible. However, the contents can be *copied* into a collection
 using Collections#list.

 
**Java 9 users:** use enumeration.asIterator() instead, unless it is important to
 return an UnmodifiableIterator instead of a plain Iterator.

**Parameters:**
- `enumeration` (`java.util.Enumeration<T>`)

### `asEnumeration(java.util.Iterator<T> iterator)`

**Returns:** `java.util.Enumeration<T>`

The Iterable equivalent of this method is either Collections#enumeration (if
 you have a Collection), or Iterators.asEnumeration(collection.iterator()).

**Parameters:**
- `iterator` (`java.util.Iterator<T>`)

### `peekingIterator(java.util.Iterator<? extends T> iterator)`

**Returns:** [`com.google.common.collect.PeekingIterator<T>`](./PeekingIterator.md)

Calls to the peek method with no intervening calls to next do not affect the
 iteration, and hence return the same object each time. A subsequent call to next is
 guaranteed to return the same object again. For example:

 

```

 PeekingIterator<String> peekingIterator =
     Iterators.peekingIterator(Iterators.forArray("a", "b"));
 String a1 = peekingIterator.peek(); // returns "a"
 String a2 = peekingIterator.peek(); // also returns "a"
 String a3 = peekingIterator.next(); // also returns "a"
 
```


 
Any structural changes to the underlying iteration (aside from those performed by the
 iterator's own PeekingIterator#remove() method) will leave the iterator in an undefined
 state.

 
The returned iterator does not support removal after peeking, as explained by PeekingIterator#remove().

 
Note: If the given iterator is already a PeekingIterator, it *might* be
 returned to the caller, although this is neither guaranteed to occur nor required to be
 consistent. For example, this method *might* choose to pass through recognized
 implementations of PeekingIterator when the behavior of the implementation is known to
 meet the contract guaranteed by this method.

 
There is no Iterable equivalent to this method, so use this method to wrap each
 individual iterator as it is generated.

**Parameters:**
- `iterator` (`java.util.Iterator<? extends T>`): the backing iterator. The PeekingIterator assumes ownership of this
     iterator, so users should cease making direct calls to it after calling this method.

### `peekingIterator(com.google.common.collect.PeekingIterator<T> iterator)`

**Returns:** [`com.google.common.collect.PeekingIterator<T>`](./PeekingIterator.md)

**Parameters:**
- `iterator` ([`com.google.common.collect.PeekingIterator<T>`](./PeekingIterator.md))

### `mergeSorted(java.lang.Iterable<? extends java.util.Iterator<? extends T>> iterators, java.util.Comparator<? super T> comparator)`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<T>`](./UnmodifiableIterator.md)

Equivalent entries will not be de-duplicated.

 
Callers must ensure that the source iterators are in non-descending order as this
 method does not sort its input.

 
For any equivalent elements across all iterators, it is undefined which element is
 returned first.

**Parameters:**
- `iterators` (`java.lang.Iterable<? extends java.util.Iterator<? extends T>>`)
- `comparator` (`java.util.Comparator<? super T>`)

