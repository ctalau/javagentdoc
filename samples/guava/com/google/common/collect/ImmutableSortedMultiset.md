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

### `toImmutableSortedMultiset(Comparator<? super E> comparator)`

Elements are sorted by the specified comparator.

 
**Warning:** comparator should be *consistent with equals* as
 explained in the Comparator documentation.

**Parameters:**
- `comparator` (`java.util.Comparator<? super E>`)

**Returns:** `java.util.stream.Collector<E,?,com.google.common.collect.ImmutableSortedMultiset<E>>`

### `toImmutableSortedMultiset(Comparator<? super E> comparator, Function<? super T,? extends E> elementFunction, ToIntFunction<? super T> countFunction)`

If the mapped elements contain duplicates (according to comparator), the first
 occurrence in encounter order appears in the resulting multiset, with count equal to the sum of
 the outputs of countFunction.applyAsInt(t) for each t mapped to that element.

**Parameters:**
- `comparator` (`java.util.Comparator<? super E>`)
- `elementFunction` (`java.util.function.Function<? super T,? extends E>`)
- `countFunction` (`java.util.function.ToIntFunction<? super T>`)

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableSortedMultiset<E>>`

### `of()`

**Performance note:** the instance returned is a singleton.

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `of(E element)`

**Parameters:**
- `element` (`E`)

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `of(E e1, E e2)`

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `of(E e1, E e2, E e3)`

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `of(E e1, E e2, E e3, E e4)`

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)
- `e4` (`E`)

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `of(E e1, E e2, E e3, E e4, E e5)`

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)
- `e4` (`E`)
- `e5` (`E`)

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `of(E e1, E e2, E e3, E e4, E e5, E e6, E[] remaining)`

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)
- `e4` (`E`)
- `e5` (`E`)
- `e6` (`E`)
- `remaining` (`E[]`)

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `copyOf(E[] elements)`

**Parameters:**
- `elements` (`E[]`)

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `copyOf(Iterable<? extends E> elements)`

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

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `copyOf(Iterator<? extends E> elements)`

This method is not type-safe, as it may be called on elements that are not mutually
 comparable.

**Parameters:**
- `elements` (`java.util.Iterator<? extends E>`)

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `copyOf(Comparator<? super E> comparator, Iterator<? extends E> elements)`

**Parameters:**
- `comparator` (`java.util.Comparator<? super E>`)
- `elements` (`java.util.Iterator<? extends E>`)

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `copyOf(Comparator<? super E> comparator, Iterable<? extends E> elements)`

This method iterates over elements at most once.

 
Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.

**Parameters:**
- `comparator` (`java.util.Comparator<? super E>`)
- `elements` (`java.lang.Iterable<? extends E>`)

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `copyOfSorted(SortedMultiset<E> sortedMultiset)`

That behavior differs from #copyOf(Iterable), which always
 uses the natural ordering of the elements.

 
Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.

 
This method is safe to use even when sortedMultiset is a synchronized or concurrent
 collection that is currently being modified by another thread.

**Parameters:**
- `sortedMultiset` ([`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md))

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `copyOfSortedEntries(Comparator<? super E> comparator, Collection<Multiset.Entry<E>> entries)`

**Parameters:**
- `comparator` (`java.util.Comparator<? super E>`)
- `entries` (`java.util.Collection<com.google.common.collect.Multiset.Entry<E>>`)

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `emptyMultiset(Comparator<? super E> comparator)`

**Parameters:**
- `comparator` (`java.util.Comparator<? super E>`)

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `comparator()`

**Returns:** `java.util.Comparator<? super E>`

### `elementSet()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `descendingMultiset()`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `pollFirstEntry()`

This implementation is guaranteed to throw an UnsupportedOperationException.

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

### `pollLastEntry()`

This implementation is guaranteed to throw an UnsupportedOperationException.

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

### `headMultiset(E upperBound, BoundType boundType)`

**Parameters:**
- `upperBound` (`E`)
- `boundType` ([`com.google.common.collect.BoundType`](./BoundType.md))

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `subMultiset(E lowerBound, BoundType lowerBoundType, E upperBound, BoundType upperBoundType)`

**Parameters:**
- `lowerBound` (`E`)
- `lowerBoundType` ([`com.google.common.collect.BoundType`](./BoundType.md))
- `upperBound` (`E`)
- `upperBoundType` ([`com.google.common.collect.BoundType`](./BoundType.md))

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `tailMultiset(E lowerBound, BoundType boundType)`

**Parameters:**
- `lowerBound` (`E`)
- `boundType` ([`com.google.common.collect.BoundType`](./BoundType.md))

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `orderedBy(Comparator<E> comparator)`

If the
 comparator has a more general type than the set being generated, such as creating a 
 SortedMultiset<Integer> with a Comparator<Number>, use the Builder constructor
 instead.

**Parameters:**
- `comparator` (`java.util.Comparator<E>`)

**Returns:** `com.google.common.collect.ImmutableSortedMultiset.Builder<E>`

### `reverseOrder()`

Note: the type parameter E extends Comparable<?> rather than 
 Comparable<? super E> as a workaround for javac [bug 6468354](http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=6468354).

**Returns:** `com.google.common.collect.ImmutableSortedMultiset.Builder<E>`

### `naturalOrder()`

The sorted multisets use Ordering#natural() as the comparator. This
 method provides more type-safety than #builder, as it can be called only for classes
 that implement Comparable.

 
Note: the type parameter E extends Comparable<?> rather than 
 Comparable<? super E> as a workaround for javac [bug 6468354](http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=6468354).

**Returns:** `com.google.common.collect.ImmutableSortedMultiset.Builder<E>`

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject(ObjectInputStream stream)`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

**Returns:** `void`

### `toImmutableMultiset()`

Use #toImmutableSortedMultiset instead. This method exists only to hide
 ImmutableMultiset#toImmutableMultiset from consumers of 
 ImmutableSortedMultiset.

**Returns:** `java.util.stream.Collector<E,?,com.google.common.collect.ImmutableMultiset<E>>`

### `toImmutableMultiset(Function<? super T,? extends E> elementFunction, ToIntFunction<? super T> countFunction)`

Use #toImmutableSortedMultiset instead. This method exists only to hide
 ImmutableMultiset#toImmutableMultiset from consumers of 
 ImmutableSortedMultiset.

**Parameters:**
- `elementFunction` (`java.util.function.Function<? super T,? extends E>`)
- `countFunction` (`java.util.function.ToIntFunction<? super T>`)

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMultiset<E>>`

### `builder()`

Use #naturalOrder, which offers better type-safety, instead. This method
 exists only to hide ImmutableMultiset#builder from consumers of 
 ImmutableSortedMultiset.

**Returns:** `com.google.common.collect.ImmutableSortedMultiset.Builder<E>`

### `of(E element)`

**You are attempting to create a multiset that may contain a non-
 Comparable element.** Proper calls will resolve to the version in 
 ImmutableSortedMultiset, not this dummy version.

**Parameters:**
- `element` (`E`)

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `of(E e1, E e2)`

**You are attempting to create a multiset that may contain a non-
 Comparable element.** Proper calls will resolve to the version in 
 ImmutableSortedMultiset, not this dummy version.

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `of(E e1, E e2, E e3)`

**You are attempting to create a multiset that may contain a non-
 Comparable element.** Proper calls will resolve to the version in 
 ImmutableSortedMultiset, not this dummy version.

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `of(E e1, E e2, E e3, E e4)`

**You are attempting to create a multiset that may contain a non-
 Comparable element.** Proper calls will resolve to the version in 
 ImmutableSortedMultiset, not this dummy version.

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)
- `e4` (`E`)

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `of(E e1, E e2, E e3, E e4, E e5)`

**You are attempting to create a multiset that may contain a non-
 Comparable element.** Proper calls will resolve to the version in 
 ImmutableSortedMultiset, not this dummy version.

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)
- `e4` (`E`)
- `e5` (`E`)

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `of(E e1, E e2, E e3, E e4, E e5, E e6, E[] remaining)`

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

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `copyOf(Z[] elements)`

**You are attempting to create a multiset that may contain non-
 Comparable elements.** Proper calls will resolve to the version in 
 ImmutableSortedMultiset, not this dummy version.

**Parameters:**
- `elements` (`Z[]`)

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<Z>`](./ImmutableSortedMultiset.md)

