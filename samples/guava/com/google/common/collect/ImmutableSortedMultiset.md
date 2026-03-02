# Class: `ImmutableSortedMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableSortedMultiset`

**Extends:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

**Implements:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

**Warning:** as with any sorted collection, you are strongly advised not to use a Comparator or Comparable type whose comparison behavior is *inconsistent with
 equals*. That is, a.compareTo(b) or comparator.compare(a, b) should equal zero
 *if and only if* a.equals(b). If this advice is not followed, the resulting
 collection will not correctly obey its specification.

 
See the Guava User Guide article on [immutable collections](https://github.com/google/guava/wiki/ImmutableCollectionsExplained).

## Fields

### `descendingMultiset`

**Type:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>()`

## Methods

### `toImmutableSortedMultiset(java.util.Comparator<? super E> comparator)`

**Returns:** `java.util.stream.Collector<E,?,com.google.common.collect.ImmutableSortedMultiset<E>>`

Elements are sorted by the specified comparator.

 
**Warning:** comparator should be *consistent with equals* as
 explained in the Comparator documentation.

**Parameters:**
- `comparator` (`java.util.Comparator<? super E>`)

### `toImmutableSortedMultiset(java.util.Comparator<? super E> comparator, java.util.function.Function<? super T,? extends E> elementFunction, java.util.function.ToIntFunction<? super T> countFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableSortedMultiset<E>>`

If the mapped elements contain duplicates (according to comparator), the first
 occurrence in encounter order appears in the resulting multiset, with count equal to the sum of
 the outputs of countFunction.applyAsInt(t) for each t mapped to that element.

**Parameters:**
- `comparator` (`java.util.Comparator<? super E>`)
- `elementFunction` (`java.util.function.Function<? super T,? extends E>`)
- `countFunction` (`java.util.function.ToIntFunction<? super T>`)

### `of()`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

**Performance note:** the instance returned is a singleton.

### `of(E element)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

**Parameters:**
- `element` (`E`)

### `of(E e1, E e2)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)

### `of(E e1, E e2, E e3)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)

### `of(E e1, E e2, E e3, E e4)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)
- `e4` (`E`)

### `of(E e1, E e2, E e3, E e4, E e5)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)
- `e4` (`E`)
- `e5` (`E`)

### `of(E e1, E e2, E e3, E e4, E e5, E e6, E[] remaining)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)
- `e4` (`E`)
- `e5` (`E`)
- `e6` (`E`)
- `remaining` (`E[]`)

### `copyOf(E[] elements)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

**Parameters:**
- `elements` (`E[]`)

### `copyOf(java.lang.Iterable<? extends E> elements)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

To create a copy of a SortedMultiset that preserves the comparator, call
 #copyOfSorted instead. This method iterates over elements at most once.

 
Note that if s is a Multiset<String>, then 
 ImmutableSortedMultiset.copyOf(s) returns an ImmutableSortedMultiset<String>
 containing each of the strings in s, while ImmutableSortedMultiset.of(s)
 returns an ImmutableSortedMultiset<Multiset<String>> containing one element (the given
 multiset itself).

 
Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.

 
This method is not type-safe, as it may be called on elements that are not mutually
 comparable.

**Parameters:**
- `elements` (`java.lang.Iterable<? extends E>`)

### `copyOf(java.util.Iterator<? extends E> elements)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

This method is not type-safe, as it may be called on elements that are not mutually
 comparable.

**Parameters:**
- `elements` (`java.util.Iterator<? extends E>`)

### `copyOf(java.util.Comparator<? super E> comparator, java.util.Iterator<? extends E> elements)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

**Parameters:**
- `comparator` (`java.util.Comparator<? super E>`)
- `elements` (`java.util.Iterator<? extends E>`)

### `copyOf(java.util.Comparator<? super E> comparator, java.lang.Iterable<? extends E> elements)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

This method iterates over elements at most once.

 
Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.

**Parameters:**
- `comparator` (`java.util.Comparator<? super E>`)
- `elements` (`java.lang.Iterable<? extends E>`)

### `copyOfSorted(com.google.common.collect.SortedMultiset<E> sortedMultiset)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

That behavior differs from #copyOf(Iterable), which always
 uses the natural ordering of the elements.

 
Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.

 
This method is safe to use even when sortedMultiset is a synchronized or concurrent
 collection that is currently being modified by another thread.

**Parameters:**
- `sortedMultiset` ([`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md))

### `copyOfSortedEntries(java.util.Comparator<? super E> comparator, java.util.Collection<com.google.common.collect.Multiset.Entry<E>> entries)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

**Parameters:**
- `comparator` (`java.util.Comparator<? super E>`)
- `entries` (`java.util.Collection<com.google.common.collect.Multiset.Entry<E>>`)

### `emptyMultiset(java.util.Comparator<? super E> comparator)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

**Parameters:**
- `comparator` (`java.util.Comparator<? super E>`)

### `comparator()`

**Returns:** `java.util.Comparator<? super E>`

### `elementSet()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `descendingMultiset()`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `pollFirstEntry()`

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

This implementation is guaranteed to throw an UnsupportedOperationException.

### `pollLastEntry()`

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

This implementation is guaranteed to throw an UnsupportedOperationException.

### `headMultiset(E upperBound, com.google.common.collect.BoundType boundType)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

**Parameters:**
- `upperBound` (`E`)
- `boundType` ([`com.google.common.collect.BoundType`](./BoundType.md))

### `subMultiset(E lowerBound, com.google.common.collect.BoundType lowerBoundType, E upperBound, com.google.common.collect.BoundType upperBoundType)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

**Parameters:**
- `lowerBound` (`E`)
- `lowerBoundType` ([`com.google.common.collect.BoundType`](./BoundType.md))
- `upperBound` (`E`)
- `upperBoundType` ([`com.google.common.collect.BoundType`](./BoundType.md))

### `tailMultiset(E lowerBound, com.google.common.collect.BoundType boundType)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

**Parameters:**
- `lowerBound` (`E`)
- `boundType` ([`com.google.common.collect.BoundType`](./BoundType.md))

### `orderedBy(java.util.Comparator<E> comparator)`

**Returns:** `com.google.common.collect.ImmutableSortedMultiset.Builder<E>`

If the
 comparator has a more general type than the set being generated, such as creating a 
 SortedMultiset<Integer> with a Comparator<Number>, use the Builder constructor
 instead.

**Parameters:**
- `comparator` (`java.util.Comparator<E>`)

### `reverseOrder()`

**Returns:** `com.google.common.collect.ImmutableSortedMultiset.Builder<E>`

Note: the type parameter E extends Comparable<?> rather than 
 Comparable<? super E> as a workaround for javac [bug 6468354](http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=6468354).

### `naturalOrder()`

**Returns:** `com.google.common.collect.ImmutableSortedMultiset.Builder<E>`

The sorted multisets use Ordering#natural() as the comparator. This
 method provides more type-safety than #builder, as it can be called only for classes
 that implement Comparable.

 
Note: the type parameter E extends Comparable<?> rather than 
 Comparable<? super E> as a workaround for javac [bug 6468354](http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=6468354).

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject(java.io.ObjectInputStream stream)`

**Returns:** `void`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

### `toImmutableMultiset()`

**Returns:** `java.util.stream.Collector<E,?,com.google.common.collect.ImmutableMultiset<E>>`

Use #toImmutableSortedMultiset instead. This method exists only to hide
 ImmutableMultiset#toImmutableMultiset from consumers of 
 ImmutableSortedMultiset.

### `toImmutableMultiset(java.util.function.Function<? super T,? extends E> elementFunction, java.util.function.ToIntFunction<? super T> countFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMultiset<E>>`

Use #toImmutableSortedMultiset instead. This method exists only to hide
 ImmutableMultiset#toImmutableMultiset from consumers of 
 ImmutableSortedMultiset.

**Parameters:**
- `elementFunction` (`java.util.function.Function<? super T,? extends E>`)
- `countFunction` (`java.util.function.ToIntFunction<? super T>`)

### `builder()`

**Returns:** `com.google.common.collect.ImmutableSortedMultiset.Builder<E>`

Use #naturalOrder, which offers better type-safety, instead. This method
 exists only to hide ImmutableMultiset#builder from consumers of 
 ImmutableSortedMultiset.

### `of(E element)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

**You are attempting to create a multiset that may contain a non-
 Comparable element.** Proper calls will resolve to the version in 
 ImmutableSortedMultiset, not this dummy version.

**Parameters:**
- `element` (`E`)

### `of(E e1, E e2)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

**You are attempting to create a multiset that may contain a non-
 Comparable element.** Proper calls will resolve to the version in 
 ImmutableSortedMultiset, not this dummy version.

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)

### `of(E e1, E e2, E e3)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

**You are attempting to create a multiset that may contain a non-
 Comparable element.** Proper calls will resolve to the version in 
 ImmutableSortedMultiset, not this dummy version.

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)

### `of(E e1, E e2, E e3, E e4)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

**You are attempting to create a multiset that may contain a non-
 Comparable element.** Proper calls will resolve to the version in 
 ImmutableSortedMultiset, not this dummy version.

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)
- `e4` (`E`)

### `of(E e1, E e2, E e3, E e4, E e5)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

**You are attempting to create a multiset that may contain a non-
 Comparable element.** Proper calls will resolve to the version in 
 ImmutableSortedMultiset, not this dummy version.

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)
- `e4` (`E`)
- `e5` (`E`)

### `of(E e1, E e2, E e3, E e4, E e5, E e6, E[] remaining)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

**You are attempting to create a multiset that may contain a non-
 Comparable element.** Proper calls will resolve to the version in 
 ImmutableSortedMultiset, not this dummy version.

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)
- `e4` (`E`)
- `e5` (`E`)
- `e6` (`E`)
- `remaining` (`E[]`)

### `copyOf(Z[] elements)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<Z>`](./ImmutableSortedMultiset.md)

**You are attempting to create a multiset that may contain non-
 Comparable elements.** Proper calls will resolve to the version in 
 ImmutableSortedMultiset, not this dummy version.

**Parameters:**
- `elements` (`Z[]`)

