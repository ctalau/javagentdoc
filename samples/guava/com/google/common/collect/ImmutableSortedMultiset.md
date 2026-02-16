# Class: `ImmutableSortedMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableSortedMultiset`

**Extends:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

**Implements:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

A {@link SortedMultiset} whose contents will never change, with many other important properties
 detailed at {@link ImmutableCollection}.

 <p><b>Warning:</b> as with any sorted collection, you are strongly advised not to use a {@link Comparator} or {@link Comparable} type whose comparison behavior is <i>inconsistent with
 equals</i>. That is, {@code a.compareTo(b)} or {@code comparator.compare(a, b)} should equal zero
 <i>if and only if</i> {@code a.equals(b)}. If this advice is not followed, the resulting
 collection will not correctly obey its specification.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/ImmutableCollectionsExplained">immutable collections</a>.
@author Louis Wasserman
@since 12.0

## Fields

### `descendingMultiset`

**Type:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>()`

## Methods

### `toImmutableSortedMultiset([`java.util.Comparator<? super E>`](../../../../java/util/Comparator.md) comparator)`

**Returns:** [`java.util.stream.Collector<E,?,com.google.common.collect.ImmutableSortedMultiset<E>>`](../../../../java/util/stream/Collector>.md)

Returns a {@code Collector} that accumulates the input elements into a new {@code
 ImmutableMultiset}. Elements are sorted by the specified comparator.

 <p><b>Warning:</b> {@code comparator} should be <i>consistent with {@code equals}</i> as
 explained in the {@link Comparator} documentation.
@since 21.0

### `toImmutableSortedMultiset([`java.util.Comparator<? super E>`](../../../../java/util/Comparator.md) comparator, [`java.util.function.Function<? super T,? extends E>`](../../../../java/util/function/Function.md) elementFunction, [`java.util.function.ToIntFunction<? super T>`](../../../../java/util/function/ToIntFunction.md) countFunction)`

**Returns:** [`java.util.stream.Collector<T,?,com.google.common.collect.ImmutableSortedMultiset<E>>`](../../../../java/util/stream/Collector>.md)

Returns a {@code Collector} that accumulates elements into an {@code ImmutableSortedMultiset}
 whose elements are the result of applying {@code elementFunction} to the inputs, with counts
 equal to the result of applying {@code countFunction} to the inputs.

 <p>If the mapped elements contain duplicates (according to {@code comparator}), the first
 occurrence in encounter order appears in the resulting multiset, with count equal to the sum of
 the outputs of {@code countFunction.applyAsInt(t)} for each {@code t} mapped to that element.
@since 22.0

### `of()`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

Returns the empty immutable sorted multiset.

 <p><b>Performance note:</b> the instance returned is a singleton.

### `of([`E`](E.md) element)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

Returns an immutable sorted multiset containing a single element.

### `of([`E`](E.md) e1, [`E`](E.md) e2)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

Returns an immutable sorted multiset containing the given elements sorted by their natural
 ordering.
@throws NullPointerException if any element is null

### `of([`E`](E.md) e1, [`E`](E.md) e2, [`E`](E.md) e3)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

Returns an immutable sorted multiset containing the given elements sorted by their natural
 ordering.
@throws NullPointerException if any element is null

### `of([`E`](E.md) e1, [`E`](E.md) e2, [`E`](E.md) e3, [`E`](E.md) e4)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

Returns an immutable sorted multiset containing the given elements sorted by their natural
 ordering.
@throws NullPointerException if any element is null

### `of([`E`](E.md) e1, [`E`](E.md) e2, [`E`](E.md) e3, [`E`](E.md) e4, [`E`](E.md) e5)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

Returns an immutable sorted multiset containing the given elements sorted by their natural
 ordering.
@throws NullPointerException if any element is null

### `of([`E`](E.md) e1, [`E`](E.md) e2, [`E`](E.md) e3, [`E`](E.md) e4, [`E`](E.md) e5, [`E`](E.md) e6, [`E[]`](E.md) remaining)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

Returns an immutable sorted multiset containing the given elements sorted by their natural
 ordering.
@throws NullPointerException if any element is null

### `copyOf([`E[]`](E.md) elements)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

Returns an immutable sorted multiset containing the given elements sorted by their natural
 ordering.
@throws NullPointerException if any of {@code elements} is null

### `copyOf(`java.lang.Iterable<? extends E>` elements)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

Returns an immutable sorted multiset containing the given elements sorted by their natural
 ordering. To create a copy of a {@code SortedMultiset} that preserves the comparator, call
 {@link #copyOfSorted} instead. This method iterates over {@code elements} at most once.

 <p>Note that if {@code s} is a {@code Multiset<String>}, then {@code
 ImmutableSortedMultiset.copyOf(s)} returns an {@code ImmutableSortedMultiset<String>}
 containing each of the strings in {@code s}, while {@code ImmutableSortedMultiset.of(s)}
 returns an {@code ImmutableSortedMultiset<Multiset<String>>} containing one element (the given
 multiset itself).

 <p>Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.

 <p>This method is not type-safe, as it may be called on elements that are not mutually
 comparable.
@throws ClassCastException if the elements are not mutually comparable
@throws NullPointerException if any of {@code elements} is null

### `copyOf([`java.util.Iterator<? extends E>`](../../../../java/util/Iterator.md) elements)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

Returns an immutable sorted multiset containing the given elements sorted by their natural
 ordering.

 <p>This method is not type-safe, as it may be called on elements that are not mutually
 comparable.
@throws ClassCastException if the elements are not mutually comparable
@throws NullPointerException if any of {@code elements} is null

### `copyOf([`java.util.Comparator<? super E>`](../../../../java/util/Comparator.md) comparator, [`java.util.Iterator<? extends E>`](../../../../java/util/Iterator.md) elements)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

Returns an immutable sorted multiset containing the given elements sorted by the given {@code
 Comparator}.
@throws NullPointerException if {@code comparator} or any of {@code elements} is null

### `copyOf([`java.util.Comparator<? super E>`](../../../../java/util/Comparator.md) comparator, `java.lang.Iterable<? extends E>` elements)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

Returns an immutable sorted multiset containing the given elements sorted by the given {@code
 Comparator}. This method iterates over {@code elements} at most once.

 <p>Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.
@throws NullPointerException if {@code comparator} or any of {@code elements} is null

### `copyOfSorted([`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md) sortedMultiset)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

Returns an immutable sorted multiset containing the elements of a sorted multiset, sorted by
 the same {@code Comparator}. That behavior differs from {@link #copyOf(Iterable)}, which always
 uses the natural ordering of the elements.

 <p>Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.

 <p>This method is safe to use even when {@code sortedMultiset} is a synchronized or concurrent
 collection that is currently being modified by another thread.
@throws NullPointerException if {@code sortedMultiset} or any of its elements is null

### `copyOfSortedEntries([`java.util.Comparator<? super E>`](../../../../java/util/Comparator.md) comparator, [`java.util.Collection<com.google.common.collect.Multiset.Entry<E>>`](../../../../java/util/Collection>.md) entries)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `emptyMultiset([`java.util.Comparator<? super E>`](../../../../java/util/Comparator.md) comparator)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `comparator()`

**Returns:** [`java.util.Comparator<? super E>`](../../../../java/util/Comparator.md)

### `elementSet()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `descendingMultiset()`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `pollFirstEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

{@inheritDoc}

 <p>This implementation is guaranteed to throw an {@link UnsupportedOperationException}.
@throws UnsupportedOperationException always
@deprecated Unsupported operation.

### `pollLastEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

{@inheritDoc}

 <p>This implementation is guaranteed to throw an {@link UnsupportedOperationException}.
@throws UnsupportedOperationException always
@deprecated Unsupported operation.

### `headMultiset([`E`](E.md) upperBound, [`com.google.common.collect.BoundType`](./BoundType.md) boundType)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `subMultiset([`E`](E.md) lowerBound, [`com.google.common.collect.BoundType`](./BoundType.md) lowerBoundType, [`E`](E.md) upperBound, [`com.google.common.collect.BoundType`](./BoundType.md) upperBoundType)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `tailMultiset([`E`](E.md) lowerBound, [`com.google.common.collect.BoundType`](./BoundType.md) boundType)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

### `orderedBy([`java.util.Comparator<E>`](../../../../java/util/Comparator.md) comparator)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset.Builder<E>`](ImmutableSortedMultiset/Builder.md)

Returns a builder that creates immutable sorted multisets with an explicit comparator. If the
 comparator has a more general type than the set being generated, such as creating a {@code
 SortedMultiset<Integer>} with a {@code Comparator<Number>}, use the {@link Builder} constructor
 instead.
@throws NullPointerException if {@code comparator} is null

### `reverseOrder()`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset.Builder<E>`](ImmutableSortedMultiset/Builder.md)

Returns a builder that creates immutable sorted multisets whose elements are ordered by the
 reverse of their natural ordering.

 <p>Note: the type parameter {@code E} extends {@code Comparable<?>} rather than {@code
 Comparable<? super E>} as a workaround for javac <a href="http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=6468354">bug 6468354</a>.

### `naturalOrder()`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset.Builder<E>`](ImmutableSortedMultiset/Builder.md)

Returns a builder that creates immutable sorted multisets whose elements are ordered by their
 natural ordering. The sorted multisets use {@link Ordering#natural()} as the comparator. This
 method provides more type-safety than {@link #builder}, as it can be called only for classes
 that implement {@link Comparable}.

 <p>Note: the type parameter {@code E} extends {@code Comparable<?>} rather than {@code
 Comparable<? super E>} as a workaround for javac <a href="http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=6468354">bug 6468354</a>.

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject([`java.io.ObjectInputStream`](../../../../java/io/ObjectInputStream.md) stream)`

**Returns:** `void`

### `toImmutableMultiset()`

**Returns:** [`java.util.stream.Collector<E,?,com.google.common.collect.ImmutableMultiset<E>>`](../../../../java/util/stream/Collector>.md)

Not supported. Use {@link #toImmutableSortedMultiset} instead. This method exists only to hide
 {@link ImmutableMultiset#toImmutableMultiset} from consumers of {@code
 ImmutableSortedMultiset}.
@throws UnsupportedOperationException always
@deprecated Use {@link ImmutableSortedMultiset#toImmutableSortedMultiset}.
@since 21.0

### `toImmutableMultiset([`java.util.function.Function<? super T,? extends E>`](../../../../java/util/function/Function.md) elementFunction, [`java.util.function.ToIntFunction<? super T>`](../../../../java/util/function/ToIntFunction.md) countFunction)`

**Returns:** [`java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMultiset<E>>`](../../../../java/util/stream/Collector>.md)

Not supported. Use {@link #toImmutableSortedMultiset} instead. This method exists only to hide
 {@link ImmutableMultiset#toImmutableMultiset} from consumers of {@code
 ImmutableSortedMultiset}.
@throws UnsupportedOperationException always
@deprecated Use {@link ImmutableSortedMultiset#toImmutableSortedMultiset}.
@since 22.0

### `builder()`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset.Builder<E>`](ImmutableSortedMultiset/Builder.md)

Not supported. Use {@link #naturalOrder}, which offers better type-safety, instead. This method
 exists only to hide {@link ImmutableMultiset#builder} from consumers of {@code
 ImmutableSortedMultiset}.
@throws UnsupportedOperationException always
@deprecated Use {@link ImmutableSortedMultiset#naturalOrder}, which offers better type-safety.

### `of([`E`](E.md) element)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

Not supported. <b>You are attempting to create a multiset that may contain a non-{@code
 Comparable} element.</b> Proper calls will resolve to the version in {@code
 ImmutableSortedMultiset}, not this dummy version.
@throws UnsupportedOperationException always
@deprecated <b>Pass a parameter of type {@code Comparable} to use {@link ImmutableSortedMultiset#of(Comparable)}.</b>

### `of([`E`](E.md) e1, [`E`](E.md) e2)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

Not supported. <b>You are attempting to create a multiset that may contain a non-{@code
 Comparable} element.</b> Proper calls will resolve to the version in {@code
 ImmutableSortedMultiset}, not this dummy version.
@throws UnsupportedOperationException always
@deprecated <b>Pass the parameters of type {@code Comparable} to use {@link ImmutableSortedMultiset#of(Comparable, Comparable)}.</b>

### `of([`E`](E.md) e1, [`E`](E.md) e2, [`E`](E.md) e3)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

Not supported. <b>You are attempting to create a multiset that may contain a non-{@code
 Comparable} element.</b> Proper calls will resolve to the version in {@code
 ImmutableSortedMultiset}, not this dummy version.
@throws UnsupportedOperationException always
@deprecated <b>Pass the parameters of type {@code Comparable} to use {@link ImmutableSortedMultiset#of(Comparable, Comparable, Comparable)}.</b>

### `of([`E`](E.md) e1, [`E`](E.md) e2, [`E`](E.md) e3, [`E`](E.md) e4)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

Not supported. <b>You are attempting to create a multiset that may contain a non-{@code
 Comparable} element.</b> Proper calls will resolve to the version in {@code
 ImmutableSortedMultiset}, not this dummy version.
@throws UnsupportedOperationException always
@deprecated <b>Pass the parameters of type {@code Comparable} to use {@link ImmutableSortedMultiset#of(Comparable, Comparable, Comparable, Comparable)}. </b>

### `of([`E`](E.md) e1, [`E`](E.md) e2, [`E`](E.md) e3, [`E`](E.md) e4, [`E`](E.md) e5)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

Not supported. <b>You are attempting to create a multiset that may contain a non-{@code
 Comparable} element.</b> Proper calls will resolve to the version in {@code
 ImmutableSortedMultiset}, not this dummy version.
@throws UnsupportedOperationException always
@deprecated <b>Pass the parameters of type {@code Comparable} to use {@link ImmutableSortedMultiset#of(Comparable, Comparable, Comparable, Comparable, Comparable)} .
     </b>

### `of([`E`](E.md) e1, [`E`](E.md) e2, [`E`](E.md) e3, [`E`](E.md) e4, [`E`](E.md) e5, [`E`](E.md) e6, [`E[]`](E.md) remaining)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<E>`](./ImmutableSortedMultiset.md)

Not supported. <b>You are attempting to create a multiset that may contain a non-{@code
 Comparable} element.</b> Proper calls will resolve to the version in {@code
 ImmutableSortedMultiset}, not this dummy version.
@throws UnsupportedOperationException always
@deprecated <b>Pass the parameters of type {@code Comparable} to use {@link ImmutableSortedMultiset#of(Comparable, Comparable, Comparable, Comparable, Comparable,
     Comparable, Comparable...)} . </b>

### `copyOf([`Z[]`](Z.md) elements)`

**Returns:** [`com.google.common.collect.ImmutableSortedMultiset<Z>`](./ImmutableSortedMultiset.md)

Not supported. <b>You are attempting to create a multiset that may contain non-{@code
 Comparable} elements.</b> Proper calls will resolve to the version in {@code
 ImmutableSortedMultiset}, not this dummy version.
@throws UnsupportedOperationException always
@deprecated <b>Pass parameters of type {@code Comparable} to use {@link ImmutableSortedMultiset#copyOf(Comparable[])}.</b>

