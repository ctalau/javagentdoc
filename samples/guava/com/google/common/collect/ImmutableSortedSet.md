# Class: `ImmutableSortedSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableSortedSet`

**Extends:** [`com.google.common.collect.ImmutableSet.CachingAsList<E>`](ImmutableSet/CachingAsList.md)

**Implements:** `java.util.NavigableSet<E>`, [`com.google.common.collect.SortedIterable<E>`](./SortedIterable.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

A `NavigableSet` whose contents will never change, with many other important properties
 detailed at `ImmutableCollection`.

 <p><b>Warning:</b> as with any sorted collection, you are strongly advised not to use a `Comparator` or `Comparable` type whose comparison behavior is <i>inconsistent with
 equals</i>. That is, `a.compareTo(b)` or `comparator.compare(a, b)` should equal zero
 <i>if and only if</i> `a.equals(b)`. If this advice is not followed, the resulting
 collection will not correctly obey its specification.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/ImmutableCollectionsExplained">immutable collections</a>.
**Author:** Jared Levy
**Author:** Louis Wasserman
**Since:** 2.0 (implements `NavigableSet` since 12.0)

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

### `<init>(`java.util.Comparator<? super E>` comparator)`

## Methods

### `toImmutableSortedSet(`java.util.Comparator<? super E>` comparator)`

**Returns:** `java.util.stream.Collector<E,?,com.google.common.collect.ImmutableSortedSet<E>>`

Returns a `Collector` that accumulates the input elements into a new `ImmutableSortedSet`, ordered by the specified comparator.

 <p>If the elements contain duplicates (according to the comparator), only the first duplicate
 in encounter order will appear in the result.
**Since:** 21.0

### `emptySet(`java.util.Comparator<? super E>` comparator)`

**Returns:** [`com.google.common.collect.RegularImmutableSortedSet<E>`](./RegularImmutableSortedSet.md)

### `of()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Returns the empty immutable sorted set.

 <p><b>Performance note:</b> the instance returned is a singleton.

### `of(`E` element)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Returns an immutable sorted set containing a single element.

### `of(`E` e1, `E` e2)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Returns an immutable sorted set containing the given elements sorted by their natural ordering.
 When multiple elements are equivalent according to `Comparable.compareTo`, only the first
 one specified is included.
@throws NullPointerException if any element is null

### `of(`E` e1, `E` e2, `E` e3)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Returns an immutable sorted set containing the given elements sorted by their natural ordering.
 When multiple elements are equivalent according to `Comparable.compareTo`, only the first
 one specified is included.
@throws NullPointerException if any element is null

### `of(`E` e1, `E` e2, `E` e3, `E` e4)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Returns an immutable sorted set containing the given elements sorted by their natural ordering.
 When multiple elements are equivalent according to `Comparable.compareTo`, only the first
 one specified is included.
@throws NullPointerException if any element is null

### `of(`E` e1, `E` e2, `E` e3, `E` e4, `E` e5)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Returns an immutable sorted set containing the given elements sorted by their natural ordering.
 When multiple elements are equivalent according to `Comparable.compareTo`, only the first
 one specified is included.
@throws NullPointerException if any element is null

### `of(`E` e1, `E` e2, `E` e3, `E` e4, `E` e5, `E` e6, `E[]` remaining)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Returns an immutable sorted set containing the given elements sorted by their natural ordering.
 When multiple elements are equivalent according to `Comparable.compareTo`, only the first
 one specified is included.
@throws NullPointerException if any element is null
**Since:** 3.0 (source-compatible since 2.0)

### `copyOf(`E[]` elements)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Returns an immutable sorted set containing the given elements sorted by their natural ordering.
 When multiple elements are equivalent according to `Comparable.compareTo`, only the first
 one specified is included.
@throws NullPointerException if any of `elements` is null
**Since:** 3.0

### `copyOf(`java.lang.Iterable<? extends E>` elements)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Returns an immutable sorted set containing the given elements sorted by their natural ordering.
 When multiple elements are equivalent according to `compareTo()`, only the first one
 specified is included. To create a copy of a `SortedSet` that preserves the comparator,
 call `copyOfSorted` instead. This method iterates over `elements` at most once.

 <p>Note that if `s` is a `Set<String>`, then `ImmutableSortedSet.copyOf(s)`
 returns an `ImmutableSortedSet<String>` containing each of the strings in `s`,
 while `ImmutableSortedSet.of(s)` returns an `ImmutableSortedSet<Set<String>>`
 containing one element (the given set itself).

 <p>Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.

 <p>This method is not type-safe, as it may be called on elements that are not mutually
 comparable.
@throws ClassCastException if the elements are not mutually comparable
@throws NullPointerException if any of `elements` is null

### `copyOf(`java.util.Collection<? extends E>` elements)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Returns an immutable sorted set containing the given elements sorted by their natural ordering.
 When multiple elements are equivalent according to `compareTo()`, only the first one
 specified is included. To create a copy of a `SortedSet` that preserves the comparator,
 call `copyOfSorted` instead. This method iterates over `elements` at most once.

 <p>Note that if `s` is a `Set<String>`, then `ImmutableSortedSet.copyOf(s)`
 returns an `ImmutableSortedSet<String>` containing each of the strings in `s`,
 while `ImmutableSortedSet.of(s)` returns an `ImmutableSortedSet<Set<String>>`
 containing one element (the given set itself).

 <p><b>Note:</b> Despite what the method name suggests, if `elements` is an `ImmutableSortedSet`, it may be returned instead of a copy.

 <p>This method is not type-safe, as it may be called on elements that are not mutually
 comparable.

 <p>This method is safe to use even when `elements` is a synchronized or concurrent
 collection that is currently being modified by another thread.
@throws ClassCastException if the elements are not mutually comparable
@throws NullPointerException if any of `elements` is null
**Since:** 7.0 (source-compatible since 2.0)

### `copyOf(`java.util.Iterator<? extends E>` elements)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Returns an immutable sorted set containing the given elements sorted by their natural ordering.
 When multiple elements are equivalent according to `compareTo()`, only the first one
 specified is included.

 <p>This method is not type-safe, as it may be called on elements that are not mutually
 comparable.
@throws ClassCastException if the elements are not mutually comparable
@throws NullPointerException if any of `elements` is null

### `copyOf(`java.util.Comparator<? super E>` comparator, `java.util.Iterator<? extends E>` elements)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Returns an immutable sorted set containing the given elements sorted by the given `Comparator`. When multiple elements are equivalent according to `compareTo()`, only the
 first one specified is included.
@throws NullPointerException if `comparator` or any of `elements` is null

### `copyOf(`java.util.Comparator<? super E>` comparator, `java.lang.Iterable<? extends E>` elements)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Returns an immutable sorted set containing the given elements sorted by the given `Comparator`. When multiple elements are equivalent according to `compare()`, only the
 first one specified is included. This method iterates over `elements` at most once.

 <p>Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.
@throws NullPointerException if `comparator` or any of `elements` is null

### `copyOf(`java.util.Comparator<? super E>` comparator, `java.util.Collection<? extends E>` elements)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Returns an immutable sorted set containing the given elements sorted by the given `Comparator`. When multiple elements are equivalent according to `compareTo()`, only the
 first one specified is included.

 <p>Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.

 <p>This method is safe to use even when `elements` is a synchronized or concurrent
 collection that is currently being modified by another thread.
@throws NullPointerException if `comparator` or any of `elements` is null
**Since:** 7.0 (source-compatible since 2.0)

### `copyOfSorted(`java.util.SortedSet<E>` sortedSet)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Returns an immutable sorted set containing the elements of a sorted set, sorted by the same
 `Comparator`. That behavior differs from `copyOf(Iterable)`, which always uses the
 natural ordering of the elements.

 <p>Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.

 <p>This method is safe to use even when `sortedSet` is a synchronized or concurrent
 collection that is currently being modified by another thread.
@throws NullPointerException if `sortedSet` or any of its elements is null

### `construct(`java.util.Comparator<? super E>` comparator, `int` n, `E[]` contents)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Constructs an `ImmutableSortedSet` from the first `n` elements of `contents`.
 If `k` is the size of the returned `ImmutableSortedSet`, then the sorted unique
 elements are in the first `k` positions of `contents`, and `contents[i] ==
 null` for `k <= i < n`.

 <p>This method takes ownership of `contents`; do not modify `contents` after this
 returns.
@throws NullPointerException if any of the first `n` elements of `contents` is null

### `orderedBy(`java.util.Comparator<E>` comparator)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet.Builder<E>`](ImmutableSortedSet/Builder.md)

Returns a builder that creates immutable sorted sets with an explicit comparator. If the
 comparator has a more general type than the set being generated, such as creating a `SortedSet<Integer>` with a `Comparator<Number>`, use the `Builder` constructor
 instead.
@throws NullPointerException if `comparator` is null

### `reverseOrder()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet.Builder<E>`](ImmutableSortedSet/Builder.md)

Returns a builder that creates immutable sorted sets whose elements are ordered by the reverse
 of their natural ordering.

### `naturalOrder()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet.Builder<E>`](ImmutableSortedSet/Builder.md)

Returns a builder that creates immutable sorted sets whose elements are ordered by their
 natural ordering. The sorted sets use `Ordering.natural()` as the comparator. This method
 provides more type-safety than `builder`, as it can be called only for classes that
 implement `Comparable`.

### `unsafeCompare(`java.lang.Object` a, `java.lang.Object` b)`

**Returns:** `int`

### `unsafeCompare(`java.util.Comparator<?>` comparator, `java.lang.Object` a, `java.lang.Object` b)`

**Returns:** `int`

### `comparator()`

**Returns:** `java.util.Comparator<? super E>`

Returns the comparator that orders the elements, which is `Ordering.natural()` when the
 natural ordering of the elements is used. Note that its behavior is not consistent with `SortedSet.comparator()`, which returns `null` to indicate natural ordering.

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<E>`](./UnmodifiableIterator.md)

### `headSet(`E` toElement)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

{@inheritDoc}

 <p>This method returns a serializable `ImmutableSortedSet`.

 <p>The `SortedSet.headSet` documentation states that a subset of a subset throws an
 `IllegalArgumentException` if passed a `toElement` greater than an earlier `toElement`. However, this method doesn't throw an exception in that situation, but instead
 keeps the original `toElement`.

### `headSet(`E` toElement, `boolean` inclusive)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

**Since:** 12.0

### `subSet(`E` fromElement, `E` toElement)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

{@inheritDoc}

 <p>This method returns a serializable `ImmutableSortedSet`.

 <p>The `SortedSet.subSet` documentation states that a subset of a subset throws an `IllegalArgumentException` if passed a `fromElement` smaller than an earlier `fromElement`. However, this method doesn't throw an exception in that situation, but instead
 keeps the original `fromElement`. Similarly, this method keeps the original `toElement`, instead of throwing an exception, if passed a `toElement` greater than an
 earlier `toElement`.

### `subSet(`E` fromElement, `boolean` fromInclusive, `E` toElement, `boolean` toInclusive)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

**Since:** 12.0

### `tailSet(`E` fromElement)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

{@inheritDoc}

 <p>This method returns a serializable `ImmutableSortedSet`.

 <p>The `SortedSet.tailSet` documentation states that a subset of a subset throws an
 `IllegalArgumentException` if passed a `fromElement` smaller than an earlier `fromElement`. However, this method doesn't throw an exception in that situation, but instead
 keeps the original `fromElement`.

### `tailSet(`E` fromElement, `boolean` inclusive)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

**Since:** 12.0

### `headSetImpl(`E` toElement, `boolean` inclusive)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `subSetImpl(`E` fromElement, `boolean` fromInclusive, `E` toElement, `boolean` toInclusive)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `tailSetImpl(`E` fromElement, `boolean` inclusive)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `lower(`E` e)`

**Returns:** `E`

**Since:** 12.0

### `floor(`E` e)`

**Returns:** `E`

**Since:** 12.0

### `ceiling(`E` e)`

**Returns:** `E`

**Since:** 12.0

### `higher(`E` e)`

**Returns:** `E`

**Since:** 12.0

### `first()`

**Returns:** `E`

### `last()`

**Returns:** `E`

### `pollFirst()`

**Returns:** `E`

Guaranteed to throw an exception and leave the set unmodified.
**Since:** 12.0
@throws UnsupportedOperationException always
**Deprecated:** Unsupported operation.

### `pollLast()`

**Returns:** `E`

Guaranteed to throw an exception and leave the set unmodified.
**Since:** 12.0
@throws UnsupportedOperationException always
**Deprecated:** Unsupported operation.

### `descendingSet()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

**Since:** 12.0

### `createDescendingSet()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `spliterator()`

**Returns:** `java.util.Spliterator<E>`

### `descendingIterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<E>`](./UnmodifiableIterator.md)

**Since:** 12.0

### `indexOf(`java.lang.Object` target)`

**Returns:** `int`

Returns the position of an element within the set, or -1 if not present.

### `readObject(`java.io.ObjectInputStream` unused)`

**Returns:** `void`

### `writeReplace()`

**Returns:** `java.lang.Object`

### `toImmutableSet()`

**Returns:** `java.util.stream.Collector<E,?,com.google.common.collect.ImmutableSet<E>>`

Not supported. Use `toImmutableSortedSet` instead. This method exists only to hide
 `ImmutableSet.toImmutableSet` from consumers of `ImmutableSortedSet`.
@throws UnsupportedOperationException always
**Deprecated:** Use `ImmutableSortedSet.toImmutableSortedSet`.
**Since:** 21.0

### `builder()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet.Builder<E>`](ImmutableSortedSet/Builder.md)

Not supported. Use `naturalOrder`, which offers better type-safety, instead. This method
 exists only to hide `ImmutableSet.builder` from consumers of `ImmutableSortedSet`.
@throws UnsupportedOperationException always
**Deprecated:** Use `ImmutableSortedSet.naturalOrder`, which offers better type-safety.

### `builderWithExpectedSize(`int` expectedSize)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet.Builder<E>`](ImmutableSortedSet/Builder.md)

Not supported. This method exists only to hide `ImmutableSet.builderWithExpectedSize`
 from consumers of `ImmutableSortedSet`.
@throws UnsupportedOperationException always
**Deprecated:** Not supported by ImmutableSortedSet.

### `of(`E` element)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Not supported. <b>You are attempting to create a set that may contain a non-`Comparable`
 element.</b> Proper calls will resolve to the version in `ImmutableSortedSet`, not this
 dummy version.
@throws UnsupportedOperationException always
**Deprecated:** <b>Pass a parameter of type `Comparable` to use `ImmutableSortedSet.of(Comparable)`.</b>

### `of(`E` e1, `E` e2)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Not supported. <b>You are attempting to create a set that may contain a non-`Comparable`
 element.</b> Proper calls will resolve to the version in `ImmutableSortedSet`, not this
 dummy version.
@throws UnsupportedOperationException always
**Deprecated:** <b>Pass the parameters of type `Comparable` to use `ImmutableSortedSet.of(Comparable, Comparable)`.</b>

### `of(`E` e1, `E` e2, `E` e3)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Not supported. <b>You are attempting to create a set that may contain a non-`Comparable`
 element.</b> Proper calls will resolve to the version in `ImmutableSortedSet`, not this
 dummy version.
@throws UnsupportedOperationException always
**Deprecated:** <b>Pass the parameters of type `Comparable` to use `ImmutableSortedSet.of(Comparable, Comparable, Comparable)`.</b>

### `of(`E` e1, `E` e2, `E` e3, `E` e4)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Not supported. <b>You are attempting to create a set that may contain a non-`Comparable`
 element.</b> Proper calls will resolve to the version in `ImmutableSortedSet`, not this
 dummy version.
@throws UnsupportedOperationException always
**Deprecated:** <b>Pass the parameters of type `Comparable` to use `ImmutableSortedSet.of(Comparable, Comparable, Comparable, Comparable)`. </b>

### `of(`E` e1, `E` e2, `E` e3, `E` e4, `E` e5)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Not supported. <b>You are attempting to create a set that may contain a non-`Comparable`
 element.</b> Proper calls will resolve to the version in `ImmutableSortedSet`, not this
 dummy version.
@throws UnsupportedOperationException always
**Deprecated:** <b>Pass the parameters of type `Comparable` to use `ImmutableSortedSet.of( Comparable, Comparable, Comparable, Comparable, Comparable)`. </b>

### `of(`E` e1, `E` e2, `E` e3, `E` e4, `E` e5, `E` e6, `E[]` remaining)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Not supported. <b>You are attempting to create a set that may contain a non-`Comparable`
 element.</b> Proper calls will resolve to the version in `ImmutableSortedSet`, not this
 dummy version.
@throws UnsupportedOperationException always
**Deprecated:** <b>Pass the parameters of type `Comparable` to use `ImmutableSortedSet.of(Comparable, Comparable, Comparable, Comparable, Comparable,
     Comparable, Comparable...)`. </b>

### `copyOf(`Z[]` elements)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<Z>`](./ImmutableSortedSet.md)

Not supported. <b>You are attempting to create a set that may contain non-`Comparable`
 elements.</b> Proper calls will resolve to the version in `ImmutableSortedSet`, not this
 dummy version.
@throws UnsupportedOperationException always
**Deprecated:** <b>Pass parameters of type `Comparable` to use `ImmutableSortedSet.copyOf(Comparable[])`.</b>

