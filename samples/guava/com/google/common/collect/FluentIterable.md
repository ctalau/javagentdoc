# Class: `FluentIterable`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.FluentIterable`

**Implements:** `java.lang.Iterable<E>`

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

The following types of methods are provided:

 

   - chaining methods which return a new FluentIterable based in some way on the
       contents of the current one (for example #transform)
   - element extraction methods which facilitate the retrieval of certain elements (for example
       #last)
   - query methods which answer questions about the FluentIterable's contents (for
       example #anyMatch)
   - conversion methods which copy the FluentIterable's contents into a new collection
       or array (for example #toList)
 


 
Several lesser-used features are currently available only as static methods on the Iterables class.

 
[]

 Comparison to streams

 
Stream is similar to this class, but generally more powerful, and certainly more
 standard. Key differences include:

 

   - A stream is *single-use*; it becomes invalid as soon as any "terminal operation" such
       as findFirst() or iterator() is invoked. (Even though Stream
       contains all the right method *signatures* to implement Iterable, it does not
       actually do so, to avoid implying repeat-iterability.) FluentIterable, on the other
       hand, is multiple-use, and does implement Iterable.
   - Streams offer many features not found here, including min/max, distinct,
       reduce, sorted, the very powerful collect, and built-in support for
       parallelizing stream operations.
   - FluentIterable contains several features not available on Stream, which are
       noted in the method descriptions below.
   - Streams include primitive-specialized variants such as IntStream, the use of which
       is strongly recommended.
   - Streams are standard Java, not requiring a third-party dependency.
 


 Example

 
Here is an example that accepts a list from a database call, filters it based on a predicate,
 transforms it by invoking toString() on each element, and returns the first 10 elements
 as a List:

 

```

 ImmutableList<String> results =
     FluentIterable.from(database.getClientList())
         .filter(Client::isActiveInLastMonth)
         .transform(Object::toString)
         .limit(10)
         .toList();
 
```


 The approximate stream equivalent is:

 

```

 List<String> results =
     database.getClientList()
         .stream()
         .filter(Client::isActiveInLastMonth)
         .map(Object::toString)
         .limit(10)
         .collect(Collectors.toList());
 
```

## Fields

### `iterableDelegate`

**Type:** [`com.google.common.base.Optional<java.lang.Iterable<E>>`](../base/Optional.md)

## Constructors

### `<init>()`

### `<init>(java.lang.Iterable<E> iterable)`

**Parameters:**
- `iterable` (`java.lang.Iterable<E>`)

## Methods

### `getDelegate()`

**Returns:** `java.lang.Iterable<E>`

### `from(java.lang.Iterable<E> iterable)`

**Returns:** [`com.google.common.collect.FluentIterable<E>`](./FluentIterable.md)

**Stream equivalent:** Collection#stream if iterable is a Collection; Streams#stream(Iterable) otherwise.

**Parameters:**
- `iterable` (`java.lang.Iterable<E>`)

### `from(E[] elements)`

**Returns:** [`com.google.common.collect.FluentIterable<E>`](./FluentIterable.md)

The returned iterable is an unmodifiable view of the input array.

 
**Stream equivalent:** Stream.of(T...).

**Parameters:**
- `elements` (`E[]`)

### `from(com.google.common.collect.FluentIterable<E> iterable)`

**Returns:** [`com.google.common.collect.FluentIterable<E>`](./FluentIterable.md)

This is obviously never necessary,
 but is intended to help call out cases where one migration from Iterable to 
 FluentIterable has obviated the need to explicitly convert to a FluentIterable.

**Parameters:**
- `iterable` ([`com.google.common.collect.FluentIterable<E>`](./FluentIterable.md))

### `concat(java.lang.Iterable<? extends T> a, java.lang.Iterable<? extends T> b)`

**Returns:** [`com.google.common.collect.FluentIterable<T>`](./FluentIterable.md)

The returned iterable has an iterator
 that traverses the elements in a, followed by the elements in b. The source
 iterators are not polled until necessary.

 
The returned iterable's iterator supports remove() when the corresponding input
 iterator supports it.

 
**Stream equivalent:** Stream#concat.

**Parameters:**
- `a` (`java.lang.Iterable<? extends T>`)
- `b` (`java.lang.Iterable<? extends T>`)

### `concat(java.lang.Iterable<? extends T> a, java.lang.Iterable<? extends T> b, java.lang.Iterable<? extends T> c)`

**Returns:** [`com.google.common.collect.FluentIterable<T>`](./FluentIterable.md)

The returned iterable has an iterator
 that traverses the elements in a, followed by the elements in b, followed by
 the elements in c. The source iterators are not polled until necessary.

 
The returned iterable's iterator supports remove() when the corresponding input
 iterator supports it.

 
**Stream equivalent:** use nested calls to Stream#concat, or see the
 advice in #concat(Iterable...).

**Parameters:**
- `a` (`java.lang.Iterable<? extends T>`)
- `b` (`java.lang.Iterable<? extends T>`)
- `c` (`java.lang.Iterable<? extends T>`)

### `concat(java.lang.Iterable<? extends T> a, java.lang.Iterable<? extends T> b, java.lang.Iterable<? extends T> c, java.lang.Iterable<? extends T> d)`

**Returns:** [`com.google.common.collect.FluentIterable<T>`](./FluentIterable.md)

The returned iterable has an iterator
 that traverses the elements in a, followed by the elements in b, followed by
 the elements in c, followed by the elements in d. The source iterators are not
 polled until necessary.

 
The returned iterable's iterator supports remove() when the corresponding input
 iterator supports it.

 
**Stream equivalent:** use nested calls to Stream#concat, or see the
 advice in #concat(Iterable...).

**Parameters:**
- `a` (`java.lang.Iterable<? extends T>`)
- `b` (`java.lang.Iterable<? extends T>`)
- `c` (`java.lang.Iterable<? extends T>`)
- `d` (`java.lang.Iterable<? extends T>`)

### `concat(java.lang.Iterable<? extends T>[] inputs)`

**Returns:** [`com.google.common.collect.FluentIterable<T>`](./FluentIterable.md)

The returned iterable has an
 iterator that traverses the elements of each iterable in inputs. The input iterators
 are not polled until necessary.

 
The returned iterable's iterator supports remove() when the corresponding input
 iterator supports it.

 
**Stream equivalent:** to concatenate an arbitrary number of streams, use 
 Stream.of(stream1, stream2, ...).flatMap(s -> s). If the sources are iterables, use 
 Stream.of(iter1, iter2, ...).flatMap(Streams::stream).

**Parameters:**
- `inputs` (`java.lang.Iterable<? extends T>[]`)

### `concat(java.lang.Iterable<? extends java.lang.Iterable<? extends T>> inputs)`

**Returns:** [`com.google.common.collect.FluentIterable<T>`](./FluentIterable.md)

The returned iterable has an
 iterator that traverses the elements of each iterable in inputs. The input iterators
 are not polled until necessary.

 
The returned iterable's iterator supports remove() when the corresponding input
 iterator supports it. The methods of the returned iterable may throw 
 NullPointerException if any of the input iterators is null.

 
**Stream equivalent:** streamOfStreams.flatMap(s -> s) or 
 streamOfIterables.flatMap(Streams::stream). (See Streams#stream.)

**Parameters:**
- `inputs` (`java.lang.Iterable<? extends java.lang.Iterable<? extends T>>`)

### `concatNoDefensiveCopy(java.lang.Iterable<? extends T>[] inputs)`

**Returns:** [`com.google.common.collect.FluentIterable<T>`](./FluentIterable.md)

**Parameters:**
- `inputs` (`java.lang.Iterable<? extends T>[]`)

### `of()`

**Returns:** [`com.google.common.collect.FluentIterable<E>`](./FluentIterable.md)

**Stream equivalent:** Stream#empty.

### `of(E element, E[] elements)`

**Returns:** [`com.google.common.collect.FluentIterable<E>`](./FluentIterable.md)

**Stream equivalent:** Stream.of(T...).

**Parameters:**
- `element` (`E`)
- `elements` (`E[]`)

### `toString()`

**Returns:** `java.lang.String`

**Stream equivalent:** stream.collect(Collectors.joining(", ", "[", "]"))
 or (less efficiently) stream.collect(Collectors.toList()).toString().

### `size()`

**Returns:** `int`

**Stream equivalent:** Stream#count.

### `contains(java.lang.Object target)`

**Returns:** `boolean`

**Stream equivalent:** stream.anyMatch(Predicate.isEqual(target)).

**Parameters:**
- `target` (`java.lang.Object`)

### `cycle()`

**Returns:** [`com.google.common.collect.FluentIterable<E>`](./FluentIterable.md)

That iterator supports remove() if iterable.iterator() does. After 
 remove() is called, subsequent cycles omit the removed element, which is no longer in this
 fluent iterable. The iterator's hasNext() method returns true until this fluent
 iterable is empty.

 
**Warning:** Typical uses of the resulting iterator may produce an infinite loop. You
 should use an explicit break or be certain that you will eventually remove all the
 elements.

 
**Stream equivalent:** if the source iterable has only a single element 
 e, use Stream.generate(() -> e). Otherwise, collect your stream into a collection and
 use Stream.generate(() -> collection).flatMap(Collection::stream).

### `append(java.lang.Iterable<? extends E> other)`

**Returns:** [`com.google.common.collect.FluentIterable<E>`](./FluentIterable.md)

The iterators are not polled until necessary.

 
The returned iterable's Iterator supports remove() when the corresponding
 Iterator supports it.

 
**Stream equivalent:** Stream#concat.

**Parameters:**
- `other` (`java.lang.Iterable<? extends E>`)

### `append(E[] elements)`

**Returns:** [`com.google.common.collect.FluentIterable<E>`](./FluentIterable.md)

**Stream equivalent:** Stream.concat(thisStream, Stream.of(elements)).

**Parameters:**
- `elements` (`E[]`)

### `filter(com.google.common.base.Predicate<? super E> predicate)`

**Returns:** [`com.google.common.collect.FluentIterable<E>`](./FluentIterable.md)

The resulting fluent
 iterable's iterator does not support remove().

 
**Stream equivalent:** Stream#filter (same).

**Parameters:**
- `predicate` ([`com.google.common.base.Predicate<? super E>`](../base/Predicate.md))

### `filter(java.lang.Class<T> type)`

**Returns:** [`com.google.common.collect.FluentIterable<T>`](./FluentIterable.md)

**Stream equivalent:** stream.filter(type::isInstance).map(type::cast).
 This does perform a little more work than necessary, so another option is to insert an
 unchecked cast at some later point:

 

```

 @SuppressWarnings("unchecked") // safe because of ::isInstance check
 ImmutableList<NewType> result =
     (ImmutableList) stream.filter(NewType.class::isInstance).collect(toImmutableList());
 
```

**Parameters:**
- `type` (`java.lang.Class<T>`)

### `anyMatch(com.google.common.base.Predicate<? super E> predicate)`

**Returns:** `boolean`

**Stream equivalent:** Stream#anyMatch (same).

**Parameters:**
- `predicate` ([`com.google.common.base.Predicate<? super E>`](../base/Predicate.md))

### `allMatch(com.google.common.base.Predicate<? super E> predicate)`

**Returns:** `boolean`

If this
 fluent iterable is empty, true is returned.

 
**Stream equivalent:** Stream#allMatch (same).

**Parameters:**
- `predicate` ([`com.google.common.base.Predicate<? super E>`](../base/Predicate.md))

### `firstMatch(com.google.common.base.Predicate<? super E> predicate)`

**Returns:** [`com.google.common.base.Optional<@org.checkerframework.checker.nullness.qual.NonNull E>`](../base/Optional.md)

**Warning:** avoid using a predicate that matches null. If null
 is matched in this fluent iterable, a NullPointerException will be thrown.

 
**Stream equivalent:** stream.filter(predicate).findFirst().

**Parameters:**
- `predicate` ([`com.google.common.base.Predicate<? super E>`](../base/Predicate.md))

### `transform(com.google.common.base.Function<? super E,T> function)`

**Returns:** [`com.google.common.collect.FluentIterable<T>`](./FluentIterable.md)

The returned fluent iterable's iterator supports remove() if this iterable's
 iterator does. After a successful remove() call, this fluent iterable no longer
 contains the corresponding element.

 
**Stream equivalent:** Stream#map.

**Parameters:**
- `function` ([`com.google.common.base.Function<? super E,T>`](../base/Function.md))

### `transformAndConcat(com.google.common.base.Function<? super E,? extends java.lang.Iterable<? extends T>> function)`

**Returns:** [`com.google.common.collect.FluentIterable<T>`](./FluentIterable.md)

function returns an Iterable of results.

 
The returned fluent iterable's iterator supports remove() if this function-returned
 iterables' iterator does. After a successful remove() call, the returned fluent
 iterable no longer contains the corresponding element.

 
**Stream equivalent:** Stream#flatMap (using a function that produces
 streams, not iterables).

**Parameters:**
- `function` ([`com.google.common.base.Function<? super E,? extends java.lang.Iterable<? extends T>>`](../base/Function.md))

### `first()`

**Returns:** [`com.google.common.base.Optional<@org.checkerframework.checker.nullness.qual.NonNull E>`](../base/Optional.md)

If the
 iterable is empty, Optional.absent() is returned.

 
**Stream equivalent:** if the goal is to obtain any element, Stream#findAny; if it must specifically be the *first* element, Stream#findFirst.

### `last()`

**Returns:** [`com.google.common.base.Optional<@org.checkerframework.checker.nullness.qual.NonNull E>`](../base/Optional.md)

If the
 iterable is empty, Optional.absent() is returned. If the underlying iterable is
 a List with java.util.RandomAccess support, then this operation is guaranteed
 to be O(1).

 
**Stream equivalent:** stream.reduce((a, b) -> b).

### `skip(int numberToSkip)`

**Returns:** [`com.google.common.collect.FluentIterable<E>`](./FluentIterable.md)

If
 this fluent iterable contains fewer than numberToSkip elements, the returned fluent
 iterable skips all of its elements.

 
Modifications to this fluent iterable before a call to iterator() are reflected in
 the returned fluent iterable. That is, the iterator skips the first numberToSkip
 elements that exist when the iterator is created, not when skip() is called.

 
The returned fluent iterable's iterator supports remove() if the Iterator of
 this fluent iterable supports it. Note that it is *not* possible to delete the last
 skipped element by immediately calling remove() on the returned fluent iterable's
 iterator, as the Iterator contract states that a call to * remove() before a
 call to next() will throw an IllegalStateException.

 
**Stream equivalent:** Stream#skip (same).

**Parameters:**
- `numberToSkip` (`int`)

### `limit(int maxSize)`

**Returns:** [`com.google.common.collect.FluentIterable<E>`](./FluentIterable.md)

If this
 fluent iterable does not contain that many elements, the returned fluent iterable will have the
 same behavior as this fluent iterable. The returned fluent iterable's iterator supports 
 remove() if this fluent iterable's iterator does.

 
**Stream equivalent:** Stream#limit (same).

**Parameters:**
- `maxSize` (`int`): the maximum number of elements in the returned fluent iterable

### `isEmpty()`

**Returns:** `boolean`

**Stream equivalent:** !stream.findAny().isPresent().

### `toList()`

**Returns:** [`com.google.common.collect.ImmutableList<@org.checkerframework.checker.nullness.qual.NonNull E>`](./ImmutableList.md)

**Stream equivalent:** pass ImmutableList#toImmutableList to 
 stream.collect().

### `toSortedList(java.util.Comparator<? super E> comparator)`

**Returns:** [`com.google.common.collect.ImmutableList<@org.checkerframework.checker.nullness.qual.NonNull E>`](./ImmutableList.md)

To produce an 
 ImmutableList sorted by its natural ordering, use toSortedList(Ordering.natural()).

 
**Stream equivalent:** pass ImmutableList#toImmutableList to 
 stream.sorted(comparator).collect().

**Parameters:**
- `comparator` (`java.util.Comparator<? super E>`): the function by which to sort list elements

### `toSet()`

**Returns:** [`com.google.common.collect.ImmutableSet<@org.checkerframework.checker.nullness.qual.NonNull E>`](./ImmutableSet.md)

**Stream equivalent:** pass ImmutableSet#toImmutableSet to 
 stream.collect().

### `toSortedSet(java.util.Comparator<? super E> comparator)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<@org.checkerframework.checker.nullness.qual.NonNull E>`](./ImmutableSortedSet.md)

To produce an ImmutableSortedSet sorted
 by its natural ordering, use toSortedSet(Ordering.natural()).

 
**Stream equivalent:** pass ImmutableSortedSet#toImmutableSortedSet to
 stream.collect().

**Parameters:**
- `comparator` (`java.util.Comparator<? super E>`): the function by which to sort set elements

### `toMultiset()`

**Returns:** [`com.google.common.collect.ImmutableMultiset<@org.checkerframework.checker.nullness.qual.NonNull E>`](./ImmutableMultiset.md)

**Stream equivalent:** pass ImmutableMultiset#toImmutableMultiset to
 stream.collect().

### `toMap(com.google.common.base.Function<? super E,V> valueFunction)`

**Returns:** [`com.google.common.collect.ImmutableMap<@org.checkerframework.checker.nullness.qual.NonNull E,V>`](./ImmutableMap.md)

The map's iteration order
 is the order of the first appearance of each key in this iterable.

 
When there are multiple instances of a key in this iterable, it is unspecified whether
 valueFunction will be applied to more than one instance of that key and, if it is,
 which result will be mapped to that key in the returned map.

 
**Stream equivalent:** stream.collect(ImmutableMap.toImmutableMap(k -> k,
 valueFunction)).

**Parameters:**
- `valueFunction` ([`com.google.common.base.Function<? super E,V>`](../base/Function.md))

### `index(com.google.common.base.Function<? super E,K> keyFunction)`

**Returns:** [`com.google.common.collect.ImmutableListMultimap<K,@org.checkerframework.checker.nullness.qual.NonNull E>`](./ImmutableListMultimap.md)

Each element of this
 iterable will be stored as a value in the resulting multimap, yielding a multimap with the same
 size as this iterable. The key used to store that value in the multimap will be the result of
 calling the function on that value. The resulting multimap is created as an immutable snapshot.
 In the returned multimap, keys appear in the order they are first encountered, and the values
 corresponding to each key appear in the same order as they are encountered.

 
**Stream equivalent:** stream.collect(Collectors.groupingBy(keyFunction))
 behaves similarly, but returns a mutable Map<K, List<E>> instead, and may not preserve
 the order of entries.

**Parameters:**
- `keyFunction` ([`com.google.common.base.Function<? super E,K>`](../base/Function.md)): the function used to produce the key for each value

### `uniqueIndex(com.google.common.base.Function<? super E,K> keyFunction)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,@org.checkerframework.checker.nullness.qual.NonNull E>`](./ImmutableMap.md)

In other words, each input value produces an entry in the
 map whose key is the result of applying keyFunction to that value. These entries appear
 in the same order as they appeared in this fluent iterable. Example usage:

 

```

 Color red = new Color("red", 255, 0, 0);
 ...
 FluentIterable<Color> allColors = FluentIterable.from(ImmutableSet.of(red, green, blue));

 Map<String, Color> colorForName = allColors.uniqueIndex(toStringFunction());
 assertThat(colorForName).containsEntry("red", red);
 
```


 
If your index may associate multiple values with each key, use index.

 
**Stream equivalent:** 
 stream.collect(ImmutableMap.toImmutableMap(keyFunction, v -> v)).

**Parameters:**
- `keyFunction` ([`com.google.common.base.Function<? super E,K>`](../base/Function.md)): the function used to produce the key for each value

### `toArray(java.lang.Class<@org.checkerframework.checker.nullness.qual.NonNull E> type)`

**Returns:** `E[]`

**Stream equivalent:** if an object array is acceptable, use 
 stream.toArray(); if type is a class literal such as MyType.class, use 
 stream.toArray(MyType[]::new). Otherwise use stream.toArray( len -> (E[])
 Array.newInstance(type, len)).

**Parameters:**
- `type` (`java.lang.Class<@org.checkerframework.checker.nullness.qual.NonNull E>`): the type of the elements

### `copyInto(C collection)`

**Returns:** `C`

This is equivalent to
 calling Iterables.addAll(collection, this).

 
**Stream equivalent:** stream.forEachOrdered(collection::add) or 
 stream.forEach(collection::add).

**Parameters:**
- `collection` (`C`): the collection to copy elements to

### `join(com.google.common.base.Joiner joiner)`

**Returns:** `java.lang.String`

**Stream equivalent:** joiner.join(stream.iterator()), or, if you are not
 using any optional Joiner features, 
 stream.collect(Collectors.joining(delimiter).

**Parameters:**
- `joiner` ([`com.google.common.base.Joiner`](../base/Joiner.md))

### `get(int position)`

**Returns:** `E`

**Stream equivalent:** stream.skip(position).findFirst().get() (but note
 that this throws different exception types, and throws an exception if null would be
 returned).

**Parameters:**
- `position` (`int`): position of the element to return

### `stream()`

**Returns:** `java.util.stream.Stream<E>`

**Note:** the earlier in the chain you can switch to Stream usage (ideally not
 going through FluentIterable at all), the more performant and idiomatic your code will
 be. This method is a transitional aid, to be used only when really necessary.

