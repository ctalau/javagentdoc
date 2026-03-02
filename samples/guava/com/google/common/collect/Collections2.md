# Class: `Collections2`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Collections2`

## Description

**Java 8 users:** several common uses for this class are now more comprehensively addressed
 by the new java.util.stream.Stream library. Read the method documentation below for
 comparisons. These methods are not being deprecated, but we gently encourage you to migrate to
 streams.

## Constructors

### `<init>()`

## Methods

### `filter(java.util.Collection<E> unfiltered, com.google.common.base.Predicate<? super E> predicate)`

**Returns:** `java.util.Collection<E>`

The returned collection is
 a live view of unfiltered; changes to one affect the other.

 
The resulting collection's iterator does not support remove(), but all other
 collection methods are supported. When given an element that doesn't satisfy the predicate, the
 collection's add() and addAll() methods throw an IllegalArgumentException. When methods such as removeAll() and clear() are
 called on the filtered collection, only elements that satisfy the filter will be removed from
 the underlying collection.

 
The returned collection isn't threadsafe or serializable, even if unfiltered is.

 
Many of the filtered collection's methods, such as size(), iterate across every
 element in the underlying collection and determine which elements satisfy the filter. When a
 live view is *not* needed, it may be faster to copy Iterables.filter(unfiltered,
 predicate) and use the copy.

 
**Warning:** predicate must be *consistent with equals*, as documented at
 Predicate#apply. Do not provide a predicate such as 
 Predicates.instanceOf(ArrayList.class), which is inconsistent with equals. (See Iterables#filter(Iterable, Class) for related functionality.)

 
**Stream equivalent:** Stream.filter.

**Parameters:**
- `unfiltered` (`java.util.Collection<E>`)
- `predicate` ([`com.google.common.base.Predicate<? super E>`](../base/Predicate.md))

### `safeContains(java.util.Collection<?> collection, java.lang.Object object)`

**Returns:** `boolean`

Returns false if the contains method
 throws a ClassCastException or NullPointerException.

**Parameters:**
- `collection` (`java.util.Collection<?>`)
- `object` (`java.lang.Object`)

### `safeRemove(java.util.Collection<?> collection, java.lang.Object object)`

**Returns:** `boolean`

Returns false if the remove method
 throws a ClassCastException or NullPointerException.

**Parameters:**
- `collection` (`java.util.Collection<?>`)
- `object` (`java.lang.Object`)

### `transform(java.util.Collection<F> fromCollection, com.google.common.base.Function<? super F,T> function)`

**Returns:** `java.util.Collection<T>`

The returned collection is a live view of fromCollection; changes to one affect the
 other.

 
The returned collection's add() and addAll() methods throw an UnsupportedOperationException. All other collection methods are supported, as long as 
 fromCollection supports them.

 
The returned collection isn't threadsafe or serializable, even if fromCollection is.

 
When a live view is *not* needed, it may be faster to copy the transformed collection
 and use the copy.

 
If the input Collection is known to be a List, consider Lists#transform. If only an Iterable is available, use Iterables#transform.

 
**Stream equivalent:** Stream.map.

**Parameters:**
- `fromCollection` (`java.util.Collection<F>`)
- `function` ([`com.google.common.base.Function<? super F,T>`](../base/Function.md))

### `containsAllImpl(java.util.Collection<?> self, java.util.Collection<?> c)`

**Returns:** `boolean`

This method iterates over the specified collection c, checking each element returned
 by the iterator in turn to see if it is contained in the specified collection self. If
 all elements are so contained, true is returned, otherwise false.

**Parameters:**
- `self` (`java.util.Collection<?>`): a collection which might contain all elements in c
- `c` (`java.util.Collection<?>`): a collection whose elements might be contained by self

### `toStringImpl(java.util.Collection<?> collection)`

**Returns:** `java.lang.String`

**Parameters:**
- `collection` (`java.util.Collection<?>`)

### `newStringBuilderForCollection(int size)`

**Returns:** `java.lang.StringBuilder`

**Parameters:**
- `size` (`int`)

### `orderedPermutations(java.lang.Iterable<E> elements)`

**Returns:** `java.util.Collection<java.util.List<E>>`

*Notes:* This is an implementation of the algorithm for Lexicographical Permutations
 Generation, described in Knuth's "The Art of Computer Programming", Volume 4, Chapter 7,
 Section 7.2.1.2. The iteration order follows the lexicographical order. This means that the
 first permutation will be in ascending order, and the last will be in descending order.

 
Duplicate elements are considered equal. For example, the list [1, 1] will have only one
 permutation, instead of two. This is why the elements have to implement Comparable.

 
An empty iterable has only one permutation, which is an empty list.

 
This method is equivalent to Collections2.orderedPermutations(list,
 Ordering.natural()).

**Parameters:**
- `elements` (`java.lang.Iterable<E>`): the original iterable whose elements have to be permuted.

### `orderedPermutations(java.lang.Iterable<E> elements, java.util.Comparator<? super E> comparator)`

**Returns:** `java.util.Collection<java.util.List<E>>`

Examples:

 

```

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
 
```


 
*Notes:* This is an implementation of the algorithm for Lexicographical Permutations
 Generation, described in Knuth's "The Art of Computer Programming", Volume 4, Chapter 7,
 Section 7.2.1.2. The iteration order follows the lexicographical order. This means that the
 first permutation will be in ascending order, and the last will be in descending order.

 
Elements that compare equal are considered equal and no new permutations are created by
 swapping them.

 
An empty iterable has only one permutation, which is an empty list.

**Parameters:**
- `elements` (`java.lang.Iterable<E>`): the original iterable whose elements have to be permuted.
- `comparator` (`java.util.Comparator<? super E>`): a comparator for the iterable's elements.

### `permutations(java.util.Collection<E> elements)`

**Returns:** `java.util.Collection<java.util.List<E>>`

*Notes:* This is an implementation of the Plain Changes algorithm for permutations
 generation, described in Knuth's "The Art of Computer Programming", Volume 4, Chapter 7,
 Section 7.2.1.2.

 
If the input list contains equal elements, some of the generated permutations will be equal.

 
An empty collection has only one permutation, which is an empty list.

**Parameters:**
- `elements` (`java.util.Collection<E>`): the original collection whose elements have to be permuted.

### `isPermutation(java.util.List<?> first, java.util.List<?> second)`

**Returns:** `boolean`

**Parameters:**
- `first` (`java.util.List<?>`)
- `second` (`java.util.List<?>`)

