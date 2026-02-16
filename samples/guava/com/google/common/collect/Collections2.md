# Class: `Collections2`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Collections2`

## Description

Provides static methods for working with {@code Collection} instances.

 <p><b>Java 8 users:</b> several common uses for this class are now more comprehensively addressed
 by the new {@link java.util.stream.Stream} library. Read the method documentation below for
 comparisons. These methods are not being deprecated, but we gently encourage you to migrate to
 streams.
@author Chris Povirk
@author Mike Bostock
@author Jared Levy
@since 2.0

## Constructors

### `<init>()`

## Methods

### `filter([`java.util.Collection<E>`](../../../../java/util/Collection.md) unfiltered, [`com.google.common.base.Predicate<? super E>`](../base/Predicate.md) predicate)`

**Returns:** [`java.util.Collection<E>`](../../../../java/util/Collection.md)

Returns the elements of {@code unfiltered} that satisfy a predicate. The returned collection is
 a live view of {@code unfiltered}; changes to one affect the other.

 <p>The resulting collection's iterator does not support {@code remove()}, but all other
 collection methods are supported. When given an element that doesn't satisfy the predicate, the
 collection's {@code add()} and {@code addAll()} methods throw an {@link IllegalArgumentException}. When methods such as {@code removeAll()} and {@code clear()} are
 called on the filtered collection, only elements that satisfy the filter will be removed from
 the underlying collection.

 <p>The returned collection isn't threadsafe or serializable, even if {@code unfiltered} is.

 <p>Many of the filtered collection's methods, such as {@code size()}, iterate across every
 element in the underlying collection and determine which elements satisfy the filter. When a
 live view is <i>not</i> needed, it may be faster to copy {@code Iterables.filter(unfiltered,
 predicate)} and use the copy.

 <p><b>Warning:</b> {@code predicate} must be <i>consistent with equals</i>, as documented at
 {@link Predicate#apply}. Do not provide a predicate such as {@code
 Predicates.instanceOf(ArrayList.class)}, which is inconsistent with equals. (See {@link Iterables#filter(Iterable, Class)} for related functionality.)

 <p><b>{@code Stream} equivalent:</b> {@link java.util.stream.Stream#filter Stream.filter}.

### `safeContains([`java.util.Collection<?>`](../../../../java/util/Collection.md) collection, `java.lang.Object` object)`

**Returns:** `boolean`

Delegates to {@link Collection#contains}. Returns {@code false} if the {@code contains} method
 throws a {@code ClassCastException} or {@code NullPointerException}.

### `safeRemove([`java.util.Collection<?>`](../../../../java/util/Collection.md) collection, `java.lang.Object` object)`

**Returns:** `boolean`

Delegates to {@link Collection#remove}. Returns {@code false} if the {@code remove} method
 throws a {@code ClassCastException} or {@code NullPointerException}.

### `transform([`java.util.Collection<F>`](../../../../java/util/Collection.md) fromCollection, [`com.google.common.base.Function<? super F,T>`](../base/Function.md) function)`

**Returns:** [`java.util.Collection<T>`](../../../../java/util/Collection.md)

Returns a collection that applies {@code function} to each element of {@code fromCollection}.
 The returned collection is a live view of {@code fromCollection}; changes to one affect the
 other.

 <p>The returned collection's {@code add()} and {@code addAll()} methods throw an {@link UnsupportedOperationException}. All other collection methods are supported, as long as {@code
 fromCollection} supports them.

 <p>The returned collection isn't threadsafe or serializable, even if {@code fromCollection} is.

 <p>When a live view is <i>not</i> needed, it may be faster to copy the transformed collection
 and use the copy.

 <p>If the input {@code Collection} is known to be a {@code List}, consider {@link Lists#transform}. If only an {@code Iterable} is available, use {@link Iterables#transform}.

 <p><b>{@code Stream} equivalent:</b> {@link java.util.stream.Stream#map Stream.map}.

### `containsAllImpl([`java.util.Collection<?>`](../../../../java/util/Collection.md) self, [`java.util.Collection<?>`](../../../../java/util/Collection.md) c)`

**Returns:** `boolean`

Returns {@code true} if the collection {@code self} contains all of the elements in the
 collection {@code c}.

 <p>This method iterates over the specified collection {@code c}, checking each element returned
 by the iterator in turn to see if it is contained in the specified collection {@code self}. If
 all elements are so contained, {@code true} is returned, otherwise {@code false}.
@param self a collection which might contain all elements in {@code c}
@param c a collection whose elements might be contained by {@code self}

### `toStringImpl([`java.util.Collection<?>`](../../../../java/util/Collection.md) collection)`

**Returns:** `java.lang.String`

An implementation of {@link Collection#toString()}.

### `newStringBuilderForCollection(`int` size)`

**Returns:** `java.lang.StringBuilder`

Returns best-effort-sized StringBuilder based on the given collection size.

### `orderedPermutations(`java.lang.Iterable<E>` elements)`

**Returns:** [`java.util.Collection<java.util.List<E>>`](../../../../java/util/Collection>.md)

Returns a {@link Collection} of all the permutations of the specified {@link Iterable}.

 <p><i>Notes:</i> This is an implementation of the algorithm for Lexicographical Permutations
 Generation, described in Knuth's "The Art of Computer Programming", Volume 4, Chapter 7,
 Section 7.2.1.2. The iteration order follows the lexicographical order. This means that the
 first permutation will be in ascending order, and the last will be in descending order.

 <p>Duplicate elements are considered equal. For example, the list [1, 1] will have only one
 permutation, instead of two. This is why the elements have to implement {@link Comparable}.

 <p>An empty iterable has only one permutation, which is an empty list.

 <p>This method is equivalent to {@code Collections2.orderedPermutations(list,
 Ordering.natural())}.
@param elements the original iterable whose elements have to be permuted.
@return an immutable {@link Collection} containing all the different permutations of the
     original iterable.
@throws NullPointerException if the specified iterable is null or has any null elements.
@since 12.0

### `orderedPermutations(`java.lang.Iterable<E>` elements, [`java.util.Comparator<? super E>`](../../../../java/util/Comparator.md) comparator)`

**Returns:** [`java.util.Collection<java.util.List<E>>`](../../../../java/util/Collection>.md)

Returns a {@link Collection} of all the permutations of the specified {@link Iterable} using
 the specified {@link Comparator} for establishing the lexicographical ordering.

 <p>Examples:

 <pre>{@code
 for (List<String> perm : orderedPermutations(asList("b", "c", "a"))) {
   println(perm);
 }
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
@return an immutable {@link Collection} containing all the different permutations of the
     original iterable.
@throws NullPointerException If the specified iterable is null, has any null elements, or if
     the specified comparator is null.
@since 12.0

### `permutations([`java.util.Collection<E>`](../../../../java/util/Collection.md) elements)`

**Returns:** [`java.util.Collection<java.util.List<E>>`](../../../../java/util/Collection>.md)

Returns a {@link Collection} of all the permutations of the specified {@link Collection}.

 <p><i>Notes:</i> This is an implementation of the Plain Changes algorithm for permutations
 generation, described in Knuth's "The Art of Computer Programming", Volume 4, Chapter 7,
 Section 7.2.1.2.

 <p>If the input list contains equal elements, some of the generated permutations will be equal.

 <p>An empty collection has only one permutation, which is an empty list.
@param elements the original collection whose elements have to be permuted.
@return an immutable {@link Collection} containing all the different permutations of the
     original collection.
@throws NullPointerException if the specified collection is null or has any null elements.
@since 12.0

### `isPermutation([`java.util.List<?>`](../../../../java/util/List.md) first, [`java.util.List<?>`](../../../../java/util/List.md) second)`

**Returns:** `boolean`

Returns {@code true} if the second list is a permutation of the first.

