# Class: `ImmutableSortedMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableSortedMultiset`

**Extends:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

**Implements:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

A `SortedMultiset` whose contents will never change, with many other important properties
 detailed at `ImmutableCollection`.

 <p><b>Warning:</b> as with any sorted collection, you are strongly advised not to use a `Comparator` or `Comparable` type whose comparison behavior is <i>inconsistent with
 equals</i>. That is, `a.compareTo(b)` or `comparator.compare(a, b)` should equal zero
 <i>if and only if</i> `a.equals(b)`. If this advice is not followed, the resulting
 collection will not correctly obey its specification.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/ImmutableCollectionsExplained">immutable collections</a>.
**Author:** Louis Wasserman
**Since:** 12.0

## Fields

### `descendingMultiset`

**Type:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>()`

## Methods

### `toImmutableSortedMultiset(`java.util.Comparator<? super E>` comparator)`

**Returns:** `java.util.stream.Collector<E,?,com.google.common.collect.ImmutableSortedMultiset<E>>`

Returns a `Collector` that accumulates the input elements into a new `ImmutableMultiset`. Elements are sorted by the specified comparator.

 <p><b>Warning:</b> `comparator` should be <i>consistent with `equals`</i> as
 explained in the `Comparator` documentation.
**Since:** 21.0

### `toImmutableSortedMultiset(`java.util.Comparator<? super E>` comparator, `java.util.function.Function<? super T,? extends E>` elementFunction, `java.util.function.ToIntFunction<? super T>` countFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableSortedMultiset<E>>`

Returns a `Collector` that accumulates elements into an `ImmutableSortedMultiset`
 whose elements are the result of applying `elementFunction` to the inputs, with counts
 equal to the result of applying `countFunction` to the inputs.

 <p>If the mapped elements contain duplicates (according to `comparator`), the first
 occurrence in encounter order appears in the resulting multiset, with count equal to the sum of
 the outputs of `countFunction.applyAsInt(t)` for each `t` mapped to that element.
**Since:** 22.0

### `of()`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

Returns the empty immutable sorted multiset.

 <p><b>Performance note:</b> the instance returned is a singleton.

### `of(`E` element)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

Returns an immutable sorted multiset containing a single element.

### `of(`E` e1, `E` e2)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

Returns an immutable sorted multiset containing the given elements sorted by their natural
 ordering.
@throws NullPointerException if any element is null

### `of(`E` e1, `E` e2, `E` e3)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

Returns an immutable sorted multiset containing the given elements sorted by their natural
 ordering.
@throws NullPointerException if any element is null

### `of(`E` e1, `E` e2, `E` e3, `E` e4)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

Returns an immutable sorted multiset containing the given elements sorted by their natural
 ordering.
@throws NullPointerException if any element is null

### `of(`E` e1, `E` e2, `E` e3, `E` e4, `E` e5)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

Returns an immutable sorted multiset containing the given elements sorted by their natural
 ordering.
@throws NullPointerException if any element is null

### `of(`E` e1, `E` e2, `E` e3, `E` e4, `E` e5, `E` e6, `E[]` remaining)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

Returns an immutable sorted multiset containing the given elements sorted by their natural
 ordering.
@throws NullPointerException if any element is null

### `copyOf(`E[]` elements)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

Returns an immutable sorted multiset containing the given elements sorted by their natural
 ordering.
@throws NullPointerException if any of `elements` is null

### `copyOf(`java.lang.Iterable<? extends E>` elements)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

Returns an immutable sorted multiset containing the given elements sorted by their natural
 ordering. To create a copy of a `SortedMultiset` that preserves the comparator, call
 `copyOfSorted` instead. This method iterates over `elements` at most once.

 <p>Note that if `s` is a `Multiset<String>`, then `ImmutableSortedMultiset.copyOf(s)` returns an `ImmutableSortedMultiset<String>`
 containing each of the strings in `s`, while `ImmutableSortedMultiset.of(s)`
 returns an `ImmutableSortedMultiset<Multiset<String>>` containing one element (the given
 multiset itself).

 <p>Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.

 <p>This method is not type-safe, as it may be called on elements that are not mutually
 comparable.
@throws ClassCastException if the elements are not mutually comparable
@throws NullPointerException if any of `elements` is null

### `copyOf(`java.util.Iterator<? extends E>` elements)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

Returns an immutable sorted multiset containing the given elements sorted by their natural
 ordering.

 <p>This method is not type-safe, as it may be called on elements that are not mutually
 comparable.
@throws ClassCastException if the elements are not mutually comparable
@throws NullPointerException if any of `elements` is null

### `copyOf(`java.util.Comparator<? super E>` comparator, `java.util.Iterator<? extends E>` elements)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

Returns an immutable sorted multiset containing the given elements sorted by the given `Comparator`.
@throws NullPointerException if `comparator` or any of `elements` is null

### `copyOf(`java.util.Comparator<? super E>` comparator, `java.lang.Iterable<? extends E>` elements)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

Returns an immutable sorted multiset containing the given elements sorted by the given `Comparator`. This method iterates over `elements` at most once.

 <p>Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.
@throws NullPointerException if `comparator` or any of `elements` is null

### `copyOfSorted([`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md) sortedMultiset)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

Returns an immutable sorted multiset containing the elements of a sorted multiset, sorted by
 the same `Comparator`. That behavior differs from `copyOf(Iterable)`, which always
 uses the natural ordering of the elements.

 <p>Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.

 <p>This method is safe to use even when `sortedMultiset` is a synchronized or concurrent
 collection that is currently being modified by another thread.
@throws NullPointerException if `sortedMultiset` or any of its elements is null

### `copyOfSortedEntries(`java.util.Comparator<? super E>` comparator, `java.util.Collection<com.google.common.collect.Multiset.Entry<E>>` entries)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `emptyMultiset(`java.util.Comparator<? super E>` comparator)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `comparator()`

**Returns:** `java.util.Comparator<? super E>`

### `elementSet()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `descendingMultiset()`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `pollFirstEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

{@inheritDoc}

 <p>This implementation is guaranteed to throw an `UnsupportedOperationException`.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `pollLastEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

{@inheritDoc}

 <p>This implementation is guaranteed to throw an `UnsupportedOperationException`.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `headMultiset(`E` upperBound, [`com.google.common.collect.BoundType`](./BoundType.md) boundType)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `subMultiset(`E` lowerBound, [`com.google.common.collect.BoundType`](./BoundType.md) lowerBoundType, `E` upperBound, [`com.google.common.collect.BoundType`](./BoundType.md) upperBoundType)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `tailMultiset(`E` lowerBound, [`com.google.common.collect.BoundType`](./BoundType.md) boundType)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `orderedBy(`java.util.Comparator<E>` comparator)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset.Builder<E>`](ImmutableSortedMultiset/Builder.md)

Returns a builder that creates immutable sorted multisets with an explicit comparator. If the
 comparator has a more general type than the set being generated, such as creating a `SortedMultiset<Integer>` with a `Comparator<Number>`, use the `Builder` constructor
 instead.
@throws NullPointerException if `comparator` is null

### `reverseOrder()`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset.Builder<E>`](ImmutableSortedMultiset/Builder.md)

Returns a builder that creates immutable sorted multisets whose elements are ordered by the
 reverse of their natural ordering.

 <p>Note: the type parameter `E` extends `Comparable<?>` rather than `Comparable<? super E>` as a workaround for javac <a href="http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=6468354">bug 6468354</a>.

### `naturalOrder()`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset.Builder<E>`](ImmutableSortedMultiset/Builder.md)

Returns a builder that creates immutable sorted multisets whose elements are ordered by their
 natural ordering. The sorted multisets use `Ordering.natural()` as the comparator. This
 method provides more type-safety than `builder`, as it can be called only for classes
 that implement `Comparable`.

 <p>Note: the type parameter `E` extends `Comparable<?>` rather than `Comparable<? super E>` as a workaround for javac <a href="http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=6468354">bug 6468354</a>.

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject(`java.io.ObjectInputStream` stream)`

**Returns:** `void`

### `toImmutableMultiset()`

**Returns:** `java.util.stream.Collector<E,?,com.google.common.collect.ImmutableMultiset<E>>`

Not supported. Use `toImmutableSortedMultiset` instead. This method exists only to hide
 `ImmutableMultiset.toImmutableMultiset` from consumers of `ImmutableSortedMultiset`.
@throws UnsupportedOperationException always
**Deprecated:**Use `ImmutableSortedMultiset.toImmutableSortedMultiset`.
**Since:** 21.0

### `toImmutableMultiset(`java.util.function.Function<? super T,? extends E>` elementFunction, `java.util.function.ToIntFunction<? super T>` countFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMultiset<E>>`

Not supported. Use `toImmutableSortedMultiset` instead. This method exists only to hide
 `ImmutableMultiset.toImmutableMultiset` from consumers of `ImmutableSortedMultiset`.
@throws UnsupportedOperationException always
**Deprecated:**Use `ImmutableSortedMultiset.toImmutableSortedMultiset`.
**Since:** 22.0

### `builder()`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset.Builder<E>`](ImmutableSortedMultiset/Builder.md)

Not supported. Use `naturalOrder`, which offers better type-safety, instead. This method
 exists only to hide `ImmutableMultiset.builder` from consumers of `ImmutableSortedMultiset`.
@throws UnsupportedOperationException always
**Deprecated:**Use `ImmutableSortedMultiset.naturalOrder`, which offers better type-safety.

### `of(`E` element)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

Not supported. <b>You are attempting to create a multiset that may contain a non-`Comparable` element.</b> Proper calls will resolve to the version in `ImmutableSortedMultiset`, not this dummy version.
@throws UnsupportedOperationException always
**Deprecated:**<b>Pass a parameter of type `Comparable` to use `ImmutableSortedMultiset.of(Comparable)`.</b>

### `of(`E` e1, `E` e2)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

Not supported. <b>You are attempting to create a multiset that may contain a non-`Comparable` element.</b> Proper calls will resolve to the version in `ImmutableSortedMultiset`, not this dummy version.
@throws UnsupportedOperationException always
**Deprecated:**<b>Pass the parameters of type `Comparable` to use `ImmutableSortedMultiset.of(Comparable, Comparable)`.</b>

### `of(`E` e1, `E` e2, `E` e3)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

Not supported. <b>You are attempting to create a multiset that may contain a non-`Comparable` element.</b> Proper calls will resolve to the version in `ImmutableSortedMultiset`, not this dummy version.
@throws UnsupportedOperationException always
**Deprecated:**<b>Pass the parameters of type `Comparable` to use `ImmutableSortedMultiset.of(Comparable, Comparable, Comparable)`.</b>

### `of(`E` e1, `E` e2, `E` e3, `E` e4)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

Not supported. <b>You are attempting to create a multiset that may contain a non-`Comparable` element.</b> Proper calls will resolve to the version in `ImmutableSortedMultiset`, not this dummy version.
@throws UnsupportedOperationException always
**Deprecated:**<b>Pass the parameters of type `Comparable` to use `ImmutableSortedMultiset.of(Comparable, Comparable, Comparable, Comparable)`. </b>

### `of(`E` e1, `E` e2, `E` e3, `E` e4, `E` e5)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

Not supported. <b>You are attempting to create a multiset that may contain a non-`Comparable` element.</b> Proper calls will resolve to the version in `ImmutableSortedMultiset`, not this dummy version.
@throws UnsupportedOperationException always
**Deprecated:**<b>Pass the parameters of type `Comparable` to use `ImmutableSortedMultiset.of(Comparable, Comparable, Comparable, Comparable, Comparable)` .
     </b>

### `of(`E` e1, `E` e2, `E` e3, `E` e4, `E` e5, `E` e6, `E[]` remaining)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

Not supported. <b>You are attempting to create a multiset that may contain a non-`Comparable` element.</b> Proper calls will resolve to the version in `ImmutableSortedMultiset`, not this dummy version.
@throws UnsupportedOperationException always
**Deprecated:**<b>Pass the parameters of type `Comparable` to use `ImmutableSortedMultiset.of(Comparable, Comparable, Comparable, Comparable, Comparable,
     Comparable, Comparable...)` . </b>

### `copyOf(`Z[]` elements)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<Z>`](./ImmutableSortedMultiset.md)

Not supported. <b>You are attempting to create a multiset that may contain non-`Comparable` elements.</b> Proper calls will resolve to the version in `ImmutableSortedMultiset`, not this dummy version.
@throws UnsupportedOperationException always
**Deprecated:**<b>Pass parameters of type `Comparable` to use `ImmutableSortedMultiset.copyOf(Comparable[])`.</b>

