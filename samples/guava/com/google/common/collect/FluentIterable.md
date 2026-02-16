# Class: `FluentIterable`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.FluentIterable`

**Implements:** `java.lang.Iterable<E>`

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A discouraged (but not deprecated) precursor to Java's superior `Stream` library.

 <p>The following types of methods are provided:

 <ul>
   <li>chaining methods which return a new `FluentIterable` based in some way on the
       contents of the current one (for example `transform`)
   <li>element extraction methods which facilitate the retrieval of certain elements (for example
       `last`)
   <li>query methods which answer questions about the `FluentIterable`'s contents (for
       example `anyMatch`)
   <li>conversion methods which copy the `FluentIterable`'s contents into a new collection
       or array (for example `toList`)
 </ul>

 <p>Several lesser-used features are currently available only as static methods on the `Iterables` class.

 <p><a id="streams"></a>

 <h3>Comparison to streams</h3>

 <p>`Stream` is similar to this class, but generally more powerful, and certainly more
 standard. Key differences include:

 <ul>
   <li>A stream is <i>single-use</i>; it becomes invalid as soon as any "terminal operation" such
       as `findFirst()` or `iterator()` is invoked. (Even though `Stream`
       contains all the right method <i>signatures</i> to implement `Iterable`, it does not
       actually do so, to avoid implying repeat-iterability.) `FluentIterable`, on the other
       hand, is multiple-use, and does implement `Iterable`.
   <li>Streams offer many features not found here, including `min/max`, `distinct`,
       `reduce`, `sorted`, the very powerful `collect`, and built-in support for
       parallelizing stream operations.
   <li>`FluentIterable` contains several features not available on `Stream`, which are
       noted in the method descriptions below.
   <li>Streams include primitive-specialized variants such as `IntStream`, the use of which
       is strongly recommended.
   <li>Streams are standard Java, not requiring a third-party dependency.
 </ul>

 <h3>Example</h3>

 <p>Here is an example that accepts a list from a database call, filters it based on a predicate,
 transforms it by invoking `toString()` on each element, and returns the first 10 elements
 as a `List`:

 <pre>`ImmutableList<String> results =
     FluentIterable.from(database.getClientList())
         .filter(Client::isActiveInLastMonth)
         .transform(Object::toString)
         .limit(10)
         .toList();
 `</pre>

 The approximate stream equivalent is:

 <pre>`List<String> results =
     database.getClientList()
         .stream()
         .filter(Client::isActiveInLastMonth)
         .map(Object::toString)
         .limit(10)
         .collect(Collectors.toList());
 `</pre>
**Author:** Marcin Mikosik
**Since:** 12.0

## Fields

### `iterableDelegate`

**Type:** [`com.google.common.base.Optional<java.lang.Iterable<E>>`](../base/Optional>.md)

## Constructors

### `<init>()`

Constructor for use by subclasses.

### `<init>(`java.lang.Iterable<E>` iterable)`

## Methods

### `getDelegate()`

**Returns:** `java.lang.Iterable<E>`

### `from(`java.lang.Iterable<E>` iterable)`

**Returns:** [`com.google.common.collect.FluentIterable<E>`](./FluentIterable.md)

Returns a fluent iterable that wraps `iterable`, or `iterable` itself if it is
 already a `FluentIterable`.

 <p><b>`Stream` equivalent:</b> `Collection.stream` if `iterable` is a `Collection`; `Streams.stream(Iterable)` otherwise.

### `from(`E[]` elements)`

**Returns:** [`com.google.common.collect.FluentIterable<E>`](./FluentIterable.md)

Returns a fluent iterable containing `elements` in the specified order.

 <p>The returned iterable is an unmodifiable view of the input array.

 <p><b>`Stream` equivalent:</b> `java.util.stream.Stream.of(Object[]) Stream.of(T...)`.
**Since:** 20.0 (since 18.0 as an overload of `of`)

### `from([`com.google.common.collect.FluentIterable<E>`](./FluentIterable.md) iterable)`

**Returns:** [`com.google.common.collect.FluentIterable<E>`](./FluentIterable.md)

Construct a fluent iterable from another fluent iterable. This is obviously never necessary,
 but is intended to help call out cases where one migration from `Iterable` to `FluentIterable` has obviated the need to explicitly convert to a `FluentIterable`.
**Deprecated:**instances of `FluentIterable` don't need to be converted to `FluentIterable`

### `concat(`java.lang.Iterable<? extends T>` a, `java.lang.Iterable<? extends T>` b)`

**Returns:** [`com.google.common.collect.FluentIterable<T>`](./FluentIterable.md)

Returns a fluent iterable that combines two iterables. The returned iterable has an iterator
 that traverses the elements in `a`, followed by the elements in `b`. The source
 iterators are not polled until necessary.

 <p>The returned iterable's iterator supports `remove()` when the corresponding input
 iterator supports it.

 <p><b>`Stream` equivalent:</b> `Stream.concat`.
**Since:** 20.0

### `concat(`java.lang.Iterable<? extends T>` a, `java.lang.Iterable<? extends T>` b, `java.lang.Iterable<? extends T>` c)`

**Returns:** [`com.google.common.collect.FluentIterable<T>`](./FluentIterable.md)

Returns a fluent iterable that combines three iterables. The returned iterable has an iterator
 that traverses the elements in `a`, followed by the elements in `b`, followed by
 the elements in `c`. The source iterators are not polled until necessary.

 <p>The returned iterable's iterator supports `remove()` when the corresponding input
 iterator supports it.

 <p><b>`Stream` equivalent:</b> use nested calls to `Stream.concat`, or see the
 advice in `concat(Iterable...)`.
**Since:** 20.0

### `concat(`java.lang.Iterable<? extends T>` a, `java.lang.Iterable<? extends T>` b, `java.lang.Iterable<? extends T>` c, `java.lang.Iterable<? extends T>` d)`

**Returns:** [`com.google.common.collect.FluentIterable<T>`](./FluentIterable.md)

Returns a fluent iterable that combines four iterables. The returned iterable has an iterator
 that traverses the elements in `a`, followed by the elements in `b`, followed by
 the elements in `c`, followed by the elements in `d`. The source iterators are not
 polled until necessary.

 <p>The returned iterable's iterator supports `remove()` when the corresponding input
 iterator supports it.

 <p><b>`Stream` equivalent:</b> use nested calls to `Stream.concat`, or see the
 advice in `concat(Iterable...)`.
**Since:** 20.0

### `concat(`java.lang.Iterable<? extends T>[]` inputs)`

**Returns:** [`com.google.common.collect.FluentIterable<T>`](./FluentIterable.md)

Returns a fluent iterable that combines several iterables. The returned iterable has an
 iterator that traverses the elements of each iterable in `inputs`. The input iterators
 are not polled until necessary.

 <p>The returned iterable's iterator supports `remove()` when the corresponding input
 iterator supports it.

 <p><b>`Stream` equivalent:</b> to concatenate an arbitrary number of streams, use `Stream.of(stream1, stream2, ...).flatMap(s -> s)`. If the sources are iterables, use `Stream.of(iter1, iter2, ...).flatMap(Streams::stream)`.
@throws NullPointerException if any of the provided iterables is `null`
**Since:** 20.0

### `concat(`java.lang.Iterable<? extends java.lang.Iterable<? extends T>>` inputs)`

**Returns:** [`com.google.common.collect.FluentIterable<T>`](./FluentIterable.md)

Returns a fluent iterable that combines several iterables. The returned iterable has an
 iterator that traverses the elements of each iterable in `inputs`. The input iterators
 are not polled until necessary.

 <p>The returned iterable's iterator supports `remove()` when the corresponding input
 iterator supports it. The methods of the returned iterable may throw `NullPointerException` if any of the input iterators is `null`.

 <p><b>`Stream` equivalent:</b> `streamOfStreams.flatMap(s -> s)` or `streamOfIterables.flatMap(Streams::stream)`. (See `Streams.stream`.)
**Since:** 20.0

### `concatNoDefensiveCopy(`java.lang.Iterable<? extends T>[]` inputs)`

**Returns:** [`com.google.common.collect.FluentIterable<T>`](./FluentIterable.md)

Concatenates a varargs array of iterables without making a defensive copy of the array.

### `of()`

**Returns:** [`com.google.common.collect.FluentIterable<E>`](./FluentIterable.md)

Returns a fluent iterable containing no elements.

 <p><b>`Stream` equivalent:</b> `Stream.empty`.
**Since:** 20.0

### `of(`E` element, `E[]` elements)`

**Returns:** [`com.google.common.collect.FluentIterable<E>`](./FluentIterable.md)

Returns a fluent iterable containing the specified elements in order.

 <p><b>`Stream` equivalent:</b> `java.util.stream.Stream.of(Object[]) Stream.of(T...)`.
**Since:** 20.0

### `toString()`

**Returns:** `java.lang.String`

Returns a string representation of this fluent iterable, with the format `[e1, e2, ...,
 en]`.

 <p><b>`Stream` equivalent:</b> `stream.collect(Collectors.joining(", ", "[", "]"))`
 or (less efficiently) `stream.collect(Collectors.toList()).toString()`.

### `size()`

**Returns:** `int`

Returns the number of elements in this fluent iterable.

 <p><b>`Stream` equivalent:</b> `Stream.count`.

### `contains(`java.lang.Object` target)`

**Returns:** `boolean`

Returns `true` if this fluent iterable contains any object for which `equals(target)` is true.

 <p><b>`Stream` equivalent:</b> `stream.anyMatch(Predicate.isEqual(target))`.

### `cycle()`

**Returns:** [`com.google.common.collect.FluentIterable<E>`](./FluentIterable.md)

Returns a fluent iterable whose `Iterator` cycles indefinitely over the elements of this
 fluent iterable.

 <p>That iterator supports `remove()` if `iterable.iterator()` does. After `remove()` is called, subsequent cycles omit the removed element, which is no longer in this
 fluent iterable. The iterator's `hasNext()` method returns `true` until this fluent
 iterable is empty.

 <p><b>Warning:</b> Typical uses of the resulting iterator may produce an infinite loop. You
 should use an explicit `break` or be certain that you will eventually remove all the
 elements.

 <p><b>`Stream` equivalent:</b> if the source iterable has only a single element `e`, use `Stream.generate(() -> e)`. Otherwise, collect your stream into a collection and
 use `Stream.generate(() -> collection).flatMap(Collection::stream)`.

### `append(`java.lang.Iterable<? extends E>` other)`

**Returns:** [`com.google.common.collect.FluentIterable<E>`](./FluentIterable.md)

Returns a fluent iterable whose iterators traverse first the elements of this fluent iterable,
 followed by those of `other`. The iterators are not polled until necessary.

 <p>The returned iterable's `Iterator` supports `remove()` when the corresponding
 `Iterator` supports it.

 <p><b>`Stream` equivalent:</b> `Stream.concat`.
**Since:** 18.0

### `append(`E[]` elements)`

**Returns:** [`com.google.common.collect.FluentIterable<E>`](./FluentIterable.md)

Returns a fluent iterable whose iterators traverse first the elements of this fluent iterable,
 followed by `elements`.

 <p><b>`Stream` equivalent:</b> `Stream.concat(thisStream, Stream.of(elements))`.
**Since:** 18.0

### `filter([`com.google.common.base.Predicate<? super E>`](../base/Predicate.md) predicate)`

**Returns:** [`com.google.common.collect.FluentIterable<E>`](./FluentIterable.md)

Returns the elements from this fluent iterable that satisfy a predicate. The resulting fluent
 iterable's iterator does not support `remove()`.

 <p><b>`Stream` equivalent:</b> `Stream.filter` (same).

### `filter(`java.lang.Class<T>` type)`

**Returns:** [`com.google.common.collect.FluentIterable<T>`](./FluentIterable.md)

Returns the elements from this fluent iterable that are instances of class `type`.

 <p><b>`Stream` equivalent:</b> `stream.filter(type::isInstance).map(type::cast)`.
 This does perform a little more work than necessary, so another option is to insert an
 unchecked cast at some later point:

 <pre>
 `@SuppressWarnings("unchecked") // safe because of ::isInstance check
 ImmutableList<NewType> result =
     (ImmutableList) stream.filter(NewType.class::isInstance).collect(toImmutableList());`
 </pre>

### `anyMatch([`com.google.common.base.Predicate<? super E>`](../base/Predicate.md) predicate)`

**Returns:** `boolean`

Returns `true` if any element in this fluent iterable satisfies the predicate.

 <p><b>`Stream` equivalent:</b> `Stream.anyMatch` (same).

### `allMatch([`com.google.common.base.Predicate<? super E>`](../base/Predicate.md) predicate)`

**Returns:** `boolean`

Returns `true` if every element in this fluent iterable satisfies the predicate. If this
 fluent iterable is empty, `true` is returned.

 <p><b>`Stream` equivalent:</b> `Stream.allMatch` (same).

### `firstMatch([`com.google.common.base.Predicate<? super E>`](../base/Predicate.md) predicate)`

**Returns:** [`com.google.common.base.Optional<@org.checkerframework.checker.nullness.qual.NonNull E>`](../base/Optional.md)

Returns an `Optional` containing the first element in this fluent iterable that satisfies
 the given predicate, if such an element exists.

 <p><b>Warning:</b> avoid using a `predicate` that matches `null`. If `null`
 is matched in this fluent iterable, a `NullPointerException` will be thrown.

 <p><b>`Stream` equivalent:</b> `stream.filter(predicate).findFirst()`.

### `transform([`com.google.common.base.Function<? super E,T>`](../base/Function.md) function)`

**Returns:** [`com.google.common.collect.FluentIterable<T>`](./FluentIterable.md)

Returns a fluent iterable that applies `function` to each element of this fluent
 iterable.

 <p>The returned fluent iterable's iterator supports `remove()` if this iterable's
 iterator does. After a successful `remove()` call, this fluent iterable no longer
 contains the corresponding element.

 <p><b>`Stream` equivalent:</b> `Stream.map`.

### `transformAndConcat([`com.google.common.base.Function<? super E,? extends java.lang.Iterable<? extends T>>`](../base/Function>.md) function)`

**Returns:** [`com.google.common.collect.FluentIterable<T>`](./FluentIterable.md)

Applies `function` to each element of this fluent iterable and returns a fluent iterable
 with the concatenated combination of results. `function` returns an Iterable of results.

 <p>The returned fluent iterable's iterator supports `remove()` if this function-returned
 iterables' iterator does. After a successful `remove()` call, the returned fluent
 iterable no longer contains the corresponding element.

 <p><b>`Stream` equivalent:</b> `Stream.flatMap` (using a function that produces
 streams, not iterables).
**Since:** 13.0 (required `Function<E, Iterable<T>>` until 14.0)

### `first()`

**Returns:** [`com.google.common.base.Optional<@org.checkerframework.checker.nullness.qual.NonNull E>`](../base/Optional.md)

Returns an `Optional` containing the first element in this fluent iterable. If the
 iterable is empty, `Optional.absent()` is returned.

 <p><b>`Stream` equivalent:</b> if the goal is to obtain any element, `Stream.findAny`; if it must specifically be the <i>first</i> element, `Stream#findFirst`.
@throws NullPointerException if the first element is null; if this is a possibility, use `iterator().next()` or `Iterables.getFirst` instead.

### `last()`

**Returns:** [`com.google.common.base.Optional<@org.checkerframework.checker.nullness.qual.NonNull E>`](../base/Optional.md)

Returns an `Optional` containing the last element in this fluent iterable. If the
 iterable is empty, `Optional.absent()` is returned. If the underlying `iterable` is
 a `List` with `java.util.RandomAccess` support, then this operation is guaranteed
 to be `O(1)`.

 <p><b>`Stream` equivalent:</b> `stream.reduce((a, b) -> b)`.
@throws NullPointerException if the last element is null; if this is a possibility, use `Iterables.getLast` instead.

### `skip(`int` numberToSkip)`

**Returns:** [`com.google.common.collect.FluentIterable<E>`](./FluentIterable.md)

Returns a view of this fluent iterable that skips its first `numberToSkip` elements. If
 this fluent iterable contains fewer than `numberToSkip` elements, the returned fluent
 iterable skips all of its elements.

 <p>Modifications to this fluent iterable before a call to `iterator()` are reflected in
 the returned fluent iterable. That is, the iterator skips the first `numberToSkip`
 elements that exist when the iterator is created, not when `skip()` is called.

 <p>The returned fluent iterable's iterator supports `remove()` if the `Iterator` of
 this fluent iterable supports it. Note that it is <i>not</i> possible to delete the last
 skipped element by immediately calling `remove()` on the returned fluent iterable's
 iterator, as the `Iterator` contract states that a call to `* remove()` before a
 call to `next()` will throw an `IllegalStateException`.

 <p><b>`Stream` equivalent:</b> `Stream.skip` (same).

### `limit(`int` maxSize)`

**Returns:** [`com.google.common.collect.FluentIterable<E>`](./FluentIterable.md)

Creates a fluent iterable with the first `size` elements of this fluent iterable. If this
 fluent iterable does not contain that many elements, the returned fluent iterable will have the
 same behavior as this fluent iterable. The returned fluent iterable's iterator supports `remove()` if this fluent iterable's iterator does.

 <p><b>`Stream` equivalent:</b> `Stream.limit` (same).
@param maxSize the maximum number of elements in the returned fluent iterable
@throws IllegalArgumentException if `size` is negative

### `isEmpty()`

**Returns:** `boolean`

Determines whether this fluent iterable is empty.

 <p><b>`Stream` equivalent:</b> `!stream.findAny().isPresent()`.

### `toList()`

**Returns:** [`com.google.common.collect.ImmutableList<@org.checkerframework.checker.nullness.qual.NonNull E>`](./ImmutableList.md)

Returns an `ImmutableList` containing all of the elements from this fluent iterable in
 proper sequence.

 <p><b>`Stream` equivalent:</b> pass `ImmutableList.toImmutableList` to `stream.collect()`.
@throws NullPointerException if any element is `null`
**Since:** 14.0 (since 12.0 as `toImmutableList()`).

### `toSortedList(`java.util.Comparator<? super E>` comparator)`

**Returns:** [`com.google.common.collect.ImmutableList<@org.checkerframework.checker.nullness.qual.NonNull E>`](./ImmutableList.md)

Returns an `ImmutableList` containing all of the elements from this `FluentIterable` in the order specified by `comparator`. To produce an `ImmutableList` sorted by its natural ordering, use `toSortedList(Ordering.natural())`.

 <p><b>`Stream` equivalent:</b> pass `ImmutableList.toImmutableList` to `stream.sorted(comparator).collect()`.
@param comparator the function by which to sort list elements
@throws NullPointerException if any element of this iterable is `null`
**Since:** 14.0 (since 13.0 as `toSortedImmutableList()`).

### `toSet()`

**Returns:** [`com.google.common.collect.ImmutableSet<@org.checkerframework.checker.nullness.qual.NonNull E>`](./ImmutableSet.md)

Returns an `ImmutableSet` containing all of the elements from this fluent iterable with
 duplicates removed.

 <p><b>`Stream` equivalent:</b> pass `ImmutableSet.toImmutableSet` to `stream.collect()`.
@throws NullPointerException if any element is `null`
**Since:** 14.0 (since 12.0 as `toImmutableSet()`).

### `toSortedSet(`java.util.Comparator<? super E>` comparator)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<@org.checkerframework.checker.nullness.qual.NonNull E>`](./ImmutableSortedSet.md)

Returns an `ImmutableSortedSet` containing all of the elements from this `FluentIterable` in the order specified by `comparator`, with duplicates (determined by
 `comparator.compare(x, y) == 0`) removed. To produce an `ImmutableSortedSet` sorted
 by its natural ordering, use `toSortedSet(Ordering.natural())`.

 <p><b>`Stream` equivalent:</b> pass `ImmutableSortedSet.toImmutableSortedSet` to
 `stream.collect()`.
@param comparator the function by which to sort set elements
@throws NullPointerException if any element of this iterable is `null`
**Since:** 14.0 (since 12.0 as `toImmutableSortedSet()`).

### `toMultiset()`

**Returns:** [`com.google.common.collect.ImmutableMultiset<@org.checkerframework.checker.nullness.qual.NonNull E>`](./ImmutableMultiset.md)

Returns an `ImmutableMultiset` containing all of the elements from this fluent iterable.

 <p><b>`Stream` equivalent:</b> pass `ImmutableMultiset.toImmutableMultiset` to
 `stream.collect()`.
@throws NullPointerException if any element is null
**Since:** 19.0

### `toMap([`com.google.common.base.Function<? super E,V>`](../base/Function.md) valueFunction)`

**Returns:** [`com.google.common.collect.ImmutableMap<@org.checkerframework.checker.nullness.qual.NonNull E,V>`](./ImmutableMap.md)

Returns an immutable map whose keys are the distinct elements of this `FluentIterable`
 and whose value for each key was computed by `valueFunction`. The map's iteration order
 is the order of the first appearance of each key in this iterable.

 <p>When there are multiple instances of a key in this iterable, it is unspecified whether
 `valueFunction` will be applied to more than one instance of that key and, if it is,
 which result will be mapped to that key in the returned map.

 <p><b>`Stream` equivalent:</b> `stream.collect(ImmutableMap.toImmutableMap(k -> k,
 valueFunction))`.
@throws NullPointerException if any element of this iterable is `null`, or if `valueFunction` produces `null` for any key
**Since:** 14.0

### `index([`com.google.common.base.Function<? super E,K>`](../base/Function.md) keyFunction)`

**Returns:** [`com.google.common.collect.ImmutableListMultimap<K,@org.checkerframework.checker.nullness.qual.NonNull E>`](./ImmutableListMultimap.md)

Creates an index `ImmutableListMultimap` that contains the results of applying a
 specified function to each item in this `FluentIterable` of values. Each element of this
 iterable will be stored as a value in the resulting multimap, yielding a multimap with the same
 size as this iterable. The key used to store that value in the multimap will be the result of
 calling the function on that value. The resulting multimap is created as an immutable snapshot.
 In the returned multimap, keys appear in the order they are first encountered, and the values
 corresponding to each key appear in the same order as they are encountered.

 <p><b>`Stream` equivalent:</b> `stream.collect(Collectors.groupingBy(keyFunction))`
 behaves similarly, but returns a mutable `Map<K, List<E>>` instead, and may not preserve
 the order of entries.
@param keyFunction the function used to produce the key for each value
@throws NullPointerException if any element of this iterable is `null`, or if `keyFunction` produces `null` for any key
**Since:** 14.0

### `uniqueIndex([`com.google.common.base.Function<? super E,K>`](../base/Function.md) keyFunction)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,@org.checkerframework.checker.nullness.qual.NonNull E>`](./ImmutableMap.md)

Returns a map with the contents of this `FluentIterable` as its `values`, indexed
 by keys derived from those values. In other words, each input value produces an entry in the
 map whose key is the result of applying `keyFunction` to that value. These entries appear
 in the same order as they appeared in this fluent iterable. Example usage:

 <pre>`Color red = new Color("red", 255, 0, 0);
 ...
 FluentIterable<Color> allColors = FluentIterable.from(ImmutableSet.of(red, green, blue));

 Map<String, Color> colorForName = allColors.uniqueIndex(toStringFunction());
 assertThat(colorForName).containsEntry("red", red);
 `</pre>

 <p>If your index may associate multiple values with each key, use `index(Function) index`.

 <p><b>`Stream` equivalent:</b> `stream.collect(ImmutableMap.toImmutableMap(keyFunction, v -> v))`.
@param keyFunction the function used to produce the key for each value
@return a map mapping the result of evaluating the function `keyFunction` on each value
     in this fluent iterable to that value
@throws IllegalArgumentException if `keyFunction` produces the same key for more than one
     value in this fluent iterable
@throws NullPointerException if any element of this iterable is `null`, or if `keyFunction` produces `null` for any key
**Since:** 14.0

### `toArray(`java.lang.Class<@org.checkerframework.checker.nullness.qual.NonNull E>` type)`

**Returns:** `E[]`

Returns an array containing all of the elements from this fluent iterable in iteration order.

 <p><b>`Stream` equivalent:</b> if an object array is acceptable, use `stream.toArray()`; if `type` is a class literal such as `MyType.class`, use `stream.toArray(MyType[]::new)`. Otherwise use `stream.toArray( len -> (E[])
 Array.newInstance(type, len))`.
@param type the type of the elements
@return a newly-allocated array into which all the elements of this fluent iterable have been
     copied

### `copyInto(`C` collection)`

**Returns:** `C`

Copies all the elements from this fluent iterable to `collection`. This is equivalent to
 calling `Iterables.addAll(collection, this)`.

 <p><b>`Stream` equivalent:</b> `stream.forEachOrdered(collection::add)` or `stream.forEach(collection::add)`.
@param collection the collection to copy elements to
@return `collection`, for convenience
**Since:** 14.0

### `join([`com.google.common.base.Joiner`](../base/Joiner.md) joiner)`

**Returns:** `java.lang.String`

Returns a `String` containing all of the elements of this fluent iterable joined with
 `joiner`.

 <p><b>`Stream` equivalent:</b> `joiner.join(stream.iterator())`, or, if you are not
 using any optional `Joiner` features, `stream.collect(Collectors.joining(delimiter)`.
**Since:** 18.0

### `get(`int` position)`

**Returns:** `E`

Returns the element at the specified position in this fluent iterable.

 <p><b>`Stream` equivalent:</b> `stream.skip(position).findFirst().get()` (but note
 that this throws different exception types, and throws an exception if `null` would be
 returned).
@param position position of the element to return
@return the element at the specified position in this fluent iterable
@throws IndexOutOfBoundsException if `position` is negative or greater than or equal to
     the size of this fluent iterable

### `stream()`

**Returns:** `java.util.stream.Stream<E>`

Returns a stream of this fluent iterable's contents (similar to calling `Collection.stream` on a collection).

 <p><b>Note:</b> the earlier in the chain you can switch to `Stream` usage (ideally not
 going through `FluentIterable` at all), the more performant and idiomatic your code will
 be. This method is a transitional aid, to be used only when really necessary.
**Since:** 21.0

