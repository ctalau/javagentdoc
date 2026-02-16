# Class: `Collections2`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Collections2`

## Description

Provides static methods for working with `Collection` instances.

 <p><b>Java 8 users:</b> several common uses for this class are now more comprehensively addressed
 by the new `java.util.stream.Stream` library. Read the method documentation below for
 comparisons. These methods are not being deprecated, but we gently encourage you to migrate to
 streams.
**Author:** Chris Povirk
**Author:** Mike Bostock
**Author:** Jared Levy
**Since:** 2.0

## Constructors

### `<init>()`

## Methods

### `filter(`java.util.Collection<E>` unfiltered, [`com.google.common.base.Predicate<? super E>`](../base/Predicate.md) predicate)`

**Returns:** `java.util.Collection<E>`

Returns the elements of `unfiltered` that satisfy a predicate. The returned collection is
 a live view of `unfiltered`; changes to one affect the other.

 <p>The resulting collection's iterator does not support `remove()`, but all other
 collection methods are supported. When given an element that doesn't satisfy the predicate, the
 collection's `add()` and `addAll()` methods throw an `IllegalArgumentException`. When methods such as `removeAll()` and `clear()` are
 called on the filtered collection, only elements that satisfy the filter will be removed from
 the underlying collection.

 <p>The returned collection isn't threadsafe or serializable, even if `unfiltered` is.

 <p>Many of the filtered collection's methods, such as `size()`, iterate across every
 element in the underlying collection and determine which elements satisfy the filter. When a
 live view is <i>not</i> needed, it may be faster to copy `Iterables.filter(unfiltered,
 predicate)` and use the copy.

 <p><b>Warning:</b> `predicate` must be <i>consistent with equals</i>, as documented at
 `Predicate.apply`. Do not provide a predicate such as `Predicates.instanceOf(ArrayList.class)`, which is inconsistent with equals. (See `Iterables.filter(Iterable, Class)` for related functionality.)

 <p><b>`Stream` equivalent:</b> `java.util.stream.Stream.filter Stream.filter`.

### `safeContains(`java.util.Collection<?>` collection, `java.lang.Object` object)`

**Returns:** `boolean`

Delegates to `Collection.contains`. Returns `false` if the `contains` method
 throws a `ClassCastException` or `NullPointerException`.

### `safeRemove(`java.util.Collection<?>` collection, `java.lang.Object` object)`

**Returns:** `boolean`

Delegates to `Collection.remove`. Returns `false` if the `remove` method
 throws a `ClassCastException` or `NullPointerException`.

### `transform(`java.util.Collection<F>` fromCollection, [`com.google.common.base.Function<? super F,T>`](../base/Function.md) function)`

**Returns:** `java.util.Collection<T>`

Returns a collection that applies `function` to each element of `fromCollection`.
 The returned collection is a live view of `fromCollection`; changes to one affect the
 other.

 <p>The returned collection's `add()` and `addAll()` methods throw an `UnsupportedOperationException`. All other collection methods are supported, as long as `fromCollection` supports them.

 <p>The returned collection isn't threadsafe or serializable, even if `fromCollection` is.

 <p>When a live view is <i>not</i> needed, it may be faster to copy the transformed collection
 and use the copy.

 <p>If the input `Collection` is known to be a `List`, consider `Lists.transform`. If only an `Iterable` is available, use `Iterables.transform`.

 <p><b>`Stream` equivalent:</b> `java.util.stream.Stream.map Stream.map`.

### `containsAllImpl(`java.util.Collection<?>` self, `java.util.Collection<?>` c)`

**Returns:** `boolean`

Returns `true` if the collection `self` contains all of the elements in the
 collection `c`.

 <p>This method iterates over the specified collection `c`, checking each element returned
 by the iterator in turn to see if it is contained in the specified collection `self`. If
 all elements are so contained, `true` is returned, otherwise `false`.
@param self a collection which might contain all elements in `c`
@param c a collection whose elements might be contained by `self`

### `toStringImpl(`java.util.Collection<?>` collection)`

**Returns:** `java.lang.String`

An implementation of `Collection.toString()`.

### `newStringBuilderForCollection(`int` size)`

**Returns:** `java.lang.StringBuilder`

Returns best-effort-sized StringBuilder based on the given collection size.

### `orderedPermutations(`java.lang.Iterable<E>` elements)`

**Returns:** `java.util.Collection<java.util.List<E>>`

Returns a `Collection` of all the permutations of the specified `Iterable`.

 <p><i>Notes:</i> This is an implementation of the algorithm for Lexicographical Permutations
 Generation, described in Knuth's "The Art of Computer Programming", Volume 4, Chapter 7,
 Section 7.2.1.2. The iteration order follows the lexicographical order. This means that the
 first permutation will be in ascending order, and the last will be in descending order.

 <p>Duplicate elements are considered equal. For example, the list [1, 1] will have only one
 permutation, instead of two. This is why the elements have to implement `Comparable`.

 <p>An empty iterable has only one permutation, which is an empty list.

 <p>This method is equivalent to `Collections2.orderedPermutations(list,
 Ordering.natural())`.
@param elements the original iterable whose elements have to be permuted.
@return an immutable `Collection` containing all the different permutations of the
     original iterable.
@throws NullPointerException if the specified iterable is null or has any null elements.
**Since:** 12.0

### `orderedPermutations(`java.lang.Iterable<E>` elements, `java.util.Comparator<? super E>` comparator)`

**Returns:** `java.util.Collection<java.util.List<E>>`

Returns a `Collection` of all the permutations of the specified `Iterable` using
 the specified `Comparator` for establishing the lexicographical ordering.

 <p>Examples:

 <pre>`for (List<String> perm : orderedPermutations(asList("b", "c", "a"))) {
   println(perm);
 `
 // -> ["a", "b", "c"]
 // -> ["a", "c", "b"]
 // -> ["b", "a", "c"]
 // -> ["b", "c", "a"]
 // -> ["c", "a", "b"]
 // -> ["c", "b", "a"]

 for (List<Integer> perm : orderedPermutations(asList(1, 2, 2, 1))) {
   println(perm);
 }
 // -> [1, 1, 2, 2]
 // -> [1, 2, 1, 2]
 // -> [1, 2, 2, 1]
 // -> [2, 1, 1, 2]
 // -> [2, 1, 2, 1]
 // -> [2, 2, 1, 1]
 }</pre>

 <p><i>Notes:</i> This is an implementation of the algorithm for Lexicographical Permutations
 Generation, described in Knuth's "The Art of Computer Programming", Volume 4, Chapter 7,
 Section 7.2.1.2. The iteration order follows the lexicographical order. This means that the
 first permutation will be in ascending order, and the last will be in descending order.

 <p>Elements that compare equal are considered equal and no new permutations are created by
 swapping them.

 <p>An empty iterable has only one permutation, which is an empty list.
@param elements the original iterable whose elements have to be permuted.
@param comparator a comparator for the iterable's elements.
@return an immutable `Collection` containing all the different permutations of the
     original iterable.
@throws NullPointerException If the specified iterable is null, has any null elements, or if
     the specified comparator is null.
**Since:** 12.0

### `permutations(`java.util.Collection<E>` elements)`

**Returns:** `java.util.Collection<java.util.List<E>>`

Returns a `Collection` of all the permutations of the specified `Collection`.

 <p><i>Notes:</i> This is an implementation of the Plain Changes algorithm for permutations
 generation, described in Knuth's "The Art of Computer Programming", Volume 4, Chapter 7,
 Section 7.2.1.2.

 <p>If the input list contains equal elements, some of the generated permutations will be equal.

 <p>An empty collection has only one permutation, which is an empty list.
@param elements the original collection whose elements have to be permuted.
@return an immutable `Collection` containing all the different permutations of the
     original collection.
@throws NullPointerException if the specified collection is null or has any null elements.
**Since:** 12.0

### `isPermutation(`java.util.List<?>` first, `java.util.List<?>` second)`

**Returns:** `boolean`

Returns `true` if the second list is a permutation of the first.

