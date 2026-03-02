# Class: `ImmutableSortedSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableSortedSet`

**Extends:** `com.google.common.collect.ImmutableSet.CachingAsList<E>`

**Implements:** `java.util.NavigableSet<E>`, [`com.google.common.collect.SortedIterable<E>`](./SortedIterable.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

**Warning:** as with any sorted collection, you are strongly advised not to use a Comparator or Comparable type whose comparison behavior is *inconsistent with
 equals*. That is, a.compareTo(b) or comparator.compare(a, b) should equal zero
 *if and only if* a.equals(b). If this advice is not followed, the resulting
 collection will not correctly obey its specification.

 
See the Guava User Guide article on [immutable collections](https://github.com/google/guava/wiki/ImmutableCollectionsExplained).

## Fields

### `SPLITERATOR_CHARACTERISTICS`

**Type:** `int`

### `comparator`

**Type:** `java.util.Comparator<? super E>`

### `descendingSet`

**Type:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(Comparator<? super E> comparator)`

**Parameters:**
- `comparator` (`java.util.Comparator<? super E>`)

## Methods

### `toImmutableSortedSet(Comparator<? super E> comparator)`

If the elements contain duplicates (according to the comparator), only the first duplicate
 in encounter order will appear in the result.

**Parameters:**
- `comparator` (`java.util.Comparator<? super E>`)

**Returns:** `java.util.stream.Collector<E,?,com.google.common.collect.ImmutableSortedSet<E>>`

### `emptySet(Comparator<? super E> comparator)`

**Parameters:**
- `comparator` (`java.util.Comparator<? super E>`)

**Returns:** [`com.google.common.collect.RegularImmutableSortedSet<E>`](./RegularImmutableSortedSet.md)

### `of()`

**Performance note:** the instance returned is a singleton.

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `of(E element)`

**Parameters:**
- `element` (`E`)

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `of(E e1, E e2)`

When multiple elements are equivalent according to Comparable#compareTo, only the first
 one specified is included.

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `of(E e1, E e2, E e3)`

When multiple elements are equivalent according to Comparable#compareTo, only the first
 one specified is included.

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `of(E e1, E e2, E e3, E e4)`

When multiple elements are equivalent according to Comparable#compareTo, only the first
 one specified is included.

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)
- `e4` (`E`)

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `of(E e1, E e2, E e3, E e4, E e5)`

When multiple elements are equivalent according to Comparable#compareTo, only the first
 one specified is included.

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)
- `e4` (`E`)
- `e5` (`E`)

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `of(E e1, E e2, E e3, E e4, E e5, E e6, E[] remaining)`

When multiple elements are equivalent according to Comparable#compareTo, only the first
 one specified is included.

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)
- `e4` (`E`)
- `e5` (`E`)
- `e6` (`E`)
- `remaining` (`E[]`)

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `copyOf(E[] elements)`

When multiple elements are equivalent according to Comparable#compareTo, only the first
 one specified is included.

**Parameters:**
- `elements` (`E[]`)

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `copyOf(Iterable<? extends E> elements)`

When multiple elements are equivalent according to compareTo(), only the first one
 specified is included. To create a copy of a SortedSet that preserves the comparator,
 call #copyOfSorted instead. This method iterates over elements at most once.

 
Note that if s is a Set<String>, then ImmutableSortedSet.copyOf(s)
 returns an ImmutableSortedSet<String> containing each of the strings in s,
 while ImmutableSortedSet.of(s) returns an ImmutableSortedSet<Set<String>>
 containing one element (the given set itself).

 
Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.

 
This method is not type-safe, as it may be called on elements that are not mutually
 comparable.

**Parameters:**
- `elements` (`java.lang.Iterable<? extends E>`)

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `copyOf(Collection<? extends E> elements)`

When multiple elements are equivalent according to compareTo(), only the first one
 specified is included. To create a copy of a SortedSet that preserves the comparator,
 call #copyOfSorted instead. This method iterates over elements at most once.

 
Note that if s is a Set<String>, then ImmutableSortedSet.copyOf(s)
 returns an ImmutableSortedSet<String> containing each of the strings in s,
 while ImmutableSortedSet.of(s) returns an ImmutableSortedSet<Set<String>>
 containing one element (the given set itself).

 
**Note:** Despite what the method name suggests, if elements is an 
 ImmutableSortedSet, it may be returned instead of a copy.

 
This method is not type-safe, as it may be called on elements that are not mutually
 comparable.

 
This method is safe to use even when elements is a synchronized or concurrent
 collection that is currently being modified by another thread.

**Parameters:**
- `elements` (`java.util.Collection<? extends E>`)

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `copyOf(Iterator<? extends E> elements)`

When multiple elements are equivalent according to compareTo(), only the first one
 specified is included.

 
This method is not type-safe, as it may be called on elements that are not mutually
 comparable.

**Parameters:**
- `elements` (`java.util.Iterator<? extends E>`)

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `copyOf(Comparator<? super E> comparator, Iterator<? extends E> elements)`

When multiple elements are equivalent according to compareTo(), only the
 first one specified is included.

**Parameters:**
- `comparator` (`java.util.Comparator<? super E>`)
- `elements` (`java.util.Iterator<? extends E>`)

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `copyOf(Comparator<? super E> comparator, Iterable<? extends E> elements)`

When multiple elements are equivalent according to compare(), only the
 first one specified is included. This method iterates over elements at most once.

 
Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.

**Parameters:**
- `comparator` (`java.util.Comparator<? super E>`)
- `elements` (`java.lang.Iterable<? extends E>`)

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `copyOf(Comparator<? super E> comparator, Collection<? extends E> elements)`

When multiple elements are equivalent according to compareTo(), only the
 first one specified is included.

 
Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.

 
This method is safe to use even when elements is a synchronized or concurrent
 collection that is currently being modified by another thread.

**Parameters:**
- `comparator` (`java.util.Comparator<? super E>`)
- `elements` (`java.util.Collection<? extends E>`)

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `copyOfSorted(SortedSet<E> sortedSet)`

That behavior differs from #copyOf(Iterable), which always uses the
 natural ordering of the elements.

 
Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.

 
This method is safe to use even when sortedSet is a synchronized or concurrent
 collection that is currently being modified by another thread.

**Parameters:**
- `sortedSet` (`java.util.SortedSet<E>`)

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `construct(Comparator<? super E> comparator, int n, E[] contents)`

If k is the size of the returned ImmutableSortedSet, then the sorted unique
 elements are in the first k positions of contents, and contents[i] ==
 null for k <= i < n.

 
This method takes ownership of contents; do not modify contents after this
 returns.

**Parameters:**
- `comparator` (`java.util.Comparator<? super E>`)
- `n` (`int`)
- `contents` (`E[]`)

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `orderedBy(Comparator<E> comparator)`

If the
 comparator has a more general type than the set being generated, such as creating a 
 SortedSet<Integer> with a Comparator<Number>, use the Builder constructor
 instead.

**Parameters:**
- `comparator` (`java.util.Comparator<E>`)

**Returns:** `com.google.common.collect.ImmutableSortedSet.Builder<E>`

### `reverseOrder()`

**Returns:** `com.google.common.collect.ImmutableSortedSet.Builder<E>`

### `naturalOrder()`

The sorted sets use Ordering#natural() as the comparator. This method
 provides more type-safety than #builder, as it can be called only for classes that
 implement Comparable.

**Returns:** `com.google.common.collect.ImmutableSortedSet.Builder<E>`

### `unsafeCompare(Object a, Object b)`

**Parameters:**
- `a` (`java.lang.Object`)
- `b` (`java.lang.Object`)

**Returns:** `int`

### `unsafeCompare(Comparator<?> comparator, Object a, Object b)`

**Parameters:**
- `comparator` (`java.util.Comparator<?>`)
- `a` (`java.lang.Object`)
- `b` (`java.lang.Object`)

**Returns:** `int`

### `comparator()`

Note that its behavior is not consistent with SortedSet#comparator(), which returns null to indicate natural ordering.

**Returns:** `java.util.Comparator<? super E>`

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<E>`](./UnmodifiableIterator.md)

### `headSet(E toElement)`

This method returns a serializable ImmutableSortedSet.

 
The SortedSet#headSet documentation states that a subset of a subset throws an
 IllegalArgumentException if passed a toElement greater than an earlier 
 toElement. However, this method doesn't throw an exception in that situation, but instead
 keeps the original toElement.

**Parameters:**
- `toElement` (`E`)

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `headSet(E toElement, boolean inclusive)`

**Parameters:**
- `toElement` (`E`)
- `inclusive` (`boolean`)

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `subSet(E fromElement, E toElement)`

This method returns a serializable ImmutableSortedSet.

 
The SortedSet#subSet documentation states that a subset of a subset throws an IllegalArgumentException if passed a fromElement smaller than an earlier 
 fromElement. However, this method doesn't throw an exception in that situation, but instead
 keeps the original fromElement. Similarly, this method keeps the original 
 toElement, instead of throwing an exception, if passed a toElement greater than an
 earlier toElement.

**Parameters:**
- `fromElement` (`E`)
- `toElement` (`E`)

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)`

**Parameters:**
- `fromElement` (`E`)
- `fromInclusive` (`boolean`)
- `toElement` (`E`)
- `toInclusive` (`boolean`)

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `tailSet(E fromElement)`

This method returns a serializable ImmutableSortedSet.

 
The SortedSet#tailSet documentation states that a subset of a subset throws an
 IllegalArgumentException if passed a fromElement smaller than an earlier 
 fromElement. However, this method doesn't throw an exception in that situation, but instead
 keeps the original fromElement.

**Parameters:**
- `fromElement` (`E`)

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `tailSet(E fromElement, boolean inclusive)`

**Parameters:**
- `fromElement` (`E`)
- `inclusive` (`boolean`)

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `headSetImpl(E toElement, boolean inclusive)`

**Parameters:**
- `toElement` (`E`)
- `inclusive` (`boolean`)

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `subSetImpl(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)`

**Parameters:**
- `fromElement` (`E`)
- `fromInclusive` (`boolean`)
- `toElement` (`E`)
- `toInclusive` (`boolean`)

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `tailSetImpl(E fromElement, boolean inclusive)`

**Parameters:**
- `fromElement` (`E`)
- `inclusive` (`boolean`)

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `lower(E e)`

**Parameters:**
- `e` (`E`)

**Returns:** `E`

### `floor(E e)`

**Parameters:**
- `e` (`E`)

**Returns:** `E`

### `ceiling(E e)`

**Parameters:**
- `e` (`E`)

**Returns:** `E`

### `higher(E e)`

**Parameters:**
- `e` (`E`)

**Returns:** `E`

### `first()`

**Returns:** `E`

### `last()`

**Returns:** `E`

### `pollFirst()`

**Returns:** `E`

### `pollLast()`

**Returns:** `E`

### `descendingSet()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `createDescendingSet()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `spliterator()`

**Returns:** `java.util.Spliterator<E>`

### `descendingIterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<E>`](./UnmodifiableIterator.md)

### `indexOf(Object target)`

**Parameters:**
- `target` (`java.lang.Object`)

**Returns:** `int`

### `readObject(ObjectInputStream unused)`

**Parameters:**
- `unused` (`java.io.ObjectInputStream`)

**Returns:** `void`

### `writeReplace()`

**Returns:** `java.lang.Object`

### `toImmutableSet()`

Use #toImmutableSortedSet instead. This method exists only to hide
 ImmutableSet#toImmutableSet from consumers of ImmutableSortedSet.

**Returns:** `java.util.stream.Collector<E,?,com.google.common.collect.ImmutableSet<E>>`

### `builder()`

Use #naturalOrder, which offers better type-safety, instead. This method
 exists only to hide ImmutableSet#builder from consumers of ImmutableSortedSet.

**Returns:** `com.google.common.collect.ImmutableSortedSet.Builder<E>`

### `builderWithExpectedSize(int expectedSize)`

This method exists only to hide ImmutableSet#builderWithExpectedSize
 from consumers of ImmutableSortedSet.

**Parameters:**
- `expectedSize` (`int`)

**Returns:** `com.google.common.collect.ImmutableSortedSet.Builder<E>`

### `of(E element)`

**You are attempting to create a set that may contain a non-Comparable
 element.** Proper calls will resolve to the version in ImmutableSortedSet, not this
 dummy version.

**Parameters:**
- `element` (`E`)

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `of(E e1, E e2)`

**You are attempting to create a set that may contain a non-Comparable
 element.** Proper calls will resolve to the version in ImmutableSortedSet, not this
 dummy version.

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `of(E e1, E e2, E e3)`

**You are attempting to create a set that may contain a non-Comparable
 element.** Proper calls will resolve to the version in ImmutableSortedSet, not this
 dummy version.

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `of(E e1, E e2, E e3, E e4)`

**You are attempting to create a set that may contain a non-Comparable
 element.** Proper calls will resolve to the version in ImmutableSortedSet, not this
 dummy version.

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)
- `e4` (`E`)

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `of(E e1, E e2, E e3, E e4, E e5)`

**You are attempting to create a set that may contain a non-Comparable
 element.** Proper calls will resolve to the version in ImmutableSortedSet, not this
 dummy version.

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)
- `e4` (`E`)
- `e5` (`E`)

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `of(E e1, E e2, E e3, E e4, E e5, E e6, E[] remaining)`

**You are attempting to create a set that may contain a non-Comparable
 element.** Proper calls will resolve to the version in ImmutableSortedSet, not this
 dummy version.

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)
- `e4` (`E`)
- `e5` (`E`)
- `e6` (`E`)
- `remaining` (`E[]`)

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `copyOf(Z[] elements)`

**You are attempting to create a set that may contain non-Comparable
 elements.** Proper calls will resolve to the version in ImmutableSortedSet, not this
 dummy version.

**Parameters:**
- `elements` (`Z[]`)

**Returns:** [`com.google.common.collect.ImmutableSortedSet<Z>`](./ImmutableSortedSet.md)

