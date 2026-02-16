# Class: `ImmutableSortedSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableSortedSet`

**Extends:** [`com.google.common.collect.ImmutableSet.CachingAsList<E>`](ImmutableSet/CachingAsList.md)

**Implements:** [`java.util.NavigableSet<E>`](../../../../java/util/NavigableSet.md), [`com.google.common.collect.SortedIterable<E>`](./SortedIterable.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

A {@link NavigableSet} whose contents will never change, with many other important properties
 detailed at {@link ImmutableCollection}.

 <p><b>Warning:</b> as with any sorted collection, you are strongly advised not to use a {@link Comparator} or {@link Comparable} type whose comparison behavior is <i>inconsistent with
 equals</i>. That is, {@code a.compareTo(b)} or {@code comparator.compare(a, b)} should equal zero
 <i>if and only if</i> {@code a.equals(b)}. If this advice is not followed, the resulting
 collection will not correctly obey its specification.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/ImmutableCollectionsExplained">immutable collections</a>.
@author Jared Levy
@author Louis Wasserman
@since 2.0 (implements {@code NavigableSet} since 12.0)

## Fields

### `SPLITERATOR_CHARACTERISTICS`

**Type:** `int`

### `comparator`

**Type:** [`java.util.Comparator<? super E>`](../../../../java/util/Comparator.md)

### `descendingSet`

**Type:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>([`java.util.Comparator<? super E>`](../../../../java/util/Comparator.md) comparator)`

## Methods

### `toImmutableSortedSet([`java.util.Comparator<? super E>`](../../../../java/util/Comparator.md) comparator)`

**Returns:** [`java.util.stream.Collector<E,?,com.google.common.collect.ImmutableSortedSet<E>>`](../../../../java/util/stream/Collector>.md)

Returns a {@code Collector} that accumulates the input elements into a new {@code
 ImmutableSortedSet}, ordered by the specified comparator.

 <p>If the elements contain duplicates (according to the comparator), only the first duplicate
 in encounter order will appear in the result.
@since 21.0

### `emptySet([`java.util.Comparator<? super E>`](../../../../java/util/Comparator.md) comparator)`

**Returns:** [`com.google.common.collect.RegularImmutableSortedSet<E>`](./RegularImmutableSortedSet.md)

### `of()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Returns the empty immutable sorted set.

 <p><b>Performance note:</b> the instance returned is a singleton.

### `of([`E`](E.md) element)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Returns an immutable sorted set containing a single element.

### `of([`E`](E.md) e1, [`E`](E.md) e2)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Returns an immutable sorted set containing the given elements sorted by their natural ordering.
 When multiple elements are equivalent according to {@link Comparable#compareTo}, only the first
 one specified is included.
@throws NullPointerException if any element is null

### `of([`E`](E.md) e1, [`E`](E.md) e2, [`E`](E.md) e3)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Returns an immutable sorted set containing the given elements sorted by their natural ordering.
 When multiple elements are equivalent according to {@link Comparable#compareTo}, only the first
 one specified is included.
@throws NullPointerException if any element is null

### `of([`E`](E.md) e1, [`E`](E.md) e2, [`E`](E.md) e3, [`E`](E.md) e4)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Returns an immutable sorted set containing the given elements sorted by their natural ordering.
 When multiple elements are equivalent according to {@link Comparable#compareTo}, only the first
 one specified is included.
@throws NullPointerException if any element is null

### `of([`E`](E.md) e1, [`E`](E.md) e2, [`E`](E.md) e3, [`E`](E.md) e4, [`E`](E.md) e5)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Returns an immutable sorted set containing the given elements sorted by their natural ordering.
 When multiple elements are equivalent according to {@link Comparable#compareTo}, only the first
 one specified is included.
@throws NullPointerException if any element is null

### `of([`E`](E.md) e1, [`E`](E.md) e2, [`E`](E.md) e3, [`E`](E.md) e4, [`E`](E.md) e5, [`E`](E.md) e6, [`E[]`](E.md) remaining)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Returns an immutable sorted set containing the given elements sorted by their natural ordering.
 When multiple elements are equivalent according to {@link Comparable#compareTo}, only the first
 one specified is included.
@throws NullPointerException if any element is null
@since 3.0 (source-compatible since 2.0)

### `copyOf([`E[]`](E.md) elements)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Returns an immutable sorted set containing the given elements sorted by their natural ordering.
 When multiple elements are equivalent according to {@link Comparable#compareTo}, only the first
 one specified is included.
@throws NullPointerException if any of {@code elements} is null
@since 3.0

### `copyOf(`java.lang.Iterable<? extends E>` elements)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Returns an immutable sorted set containing the given elements sorted by their natural ordering.
 When multiple elements are equivalent according to {@code compareTo()}, only the first one
 specified is included. To create a copy of a {@code SortedSet} that preserves the comparator,
 call {@link #copyOfSorted} instead. This method iterates over {@code elements} at most once.

 <p>Note that if {@code s} is a {@code Set<String>}, then {@code ImmutableSortedSet.copyOf(s)}
 returns an {@code ImmutableSortedSet<String>} containing each of the strings in {@code s},
 while {@code ImmutableSortedSet.of(s)} returns an {@code ImmutableSortedSet<Set<String>>}
 containing one element (the given set itself).

 <p>Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.

 <p>This method is not type-safe, as it may be called on elements that are not mutually
 comparable.
@throws ClassCastException if the elements are not mutually comparable
@throws NullPointerException if any of {@code elements} is null

### `copyOf([`java.util.Collection<? extends E>`](../../../../java/util/Collection.md) elements)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Returns an immutable sorted set containing the given elements sorted by their natural ordering.
 When multiple elements are equivalent according to {@code compareTo()}, only the first one
 specified is included. To create a copy of a {@code SortedSet} that preserves the comparator,
 call {@link #copyOfSorted} instead. This method iterates over {@code elements} at most once.

 <p>Note that if {@code s} is a {@code Set<String>}, then {@code ImmutableSortedSet.copyOf(s)}
 returns an {@code ImmutableSortedSet<String>} containing each of the strings in {@code s},
 while {@code ImmutableSortedSet.of(s)} returns an {@code ImmutableSortedSet<Set<String>>}
 containing one element (the given set itself).

 <p><b>Note:</b> Despite what the method name suggests, if {@code elements} is an {@code
 ImmutableSortedSet}, it may be returned instead of a copy.

 <p>This method is not type-safe, as it may be called on elements that are not mutually
 comparable.

 <p>This method is safe to use even when {@code elements} is a synchronized or concurrent
 collection that is currently being modified by another thread.
@throws ClassCastException if the elements are not mutually comparable
@throws NullPointerException if any of {@code elements} is null
@since 7.0 (source-compatible since 2.0)

### `copyOf([`java.util.Iterator<? extends E>`](../../../../java/util/Iterator.md) elements)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Returns an immutable sorted set containing the given elements sorted by their natural ordering.
 When multiple elements are equivalent according to {@code compareTo()}, only the first one
 specified is included.

 <p>This method is not type-safe, as it may be called on elements that are not mutually
 comparable.
@throws ClassCastException if the elements are not mutually comparable
@throws NullPointerException if any of {@code elements} is null

### `copyOf([`java.util.Comparator<? super E>`](../../../../java/util/Comparator.md) comparator, [`java.util.Iterator<? extends E>`](../../../../java/util/Iterator.md) elements)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Returns an immutable sorted set containing the given elements sorted by the given {@code
 Comparator}. When multiple elements are equivalent according to {@code compareTo()}, only the
 first one specified is included.
@throws NullPointerException if {@code comparator} or any of {@code elements} is null

### `copyOf([`java.util.Comparator<? super E>`](../../../../java/util/Comparator.md) comparator, `java.lang.Iterable<? extends E>` elements)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Returns an immutable sorted set containing the given elements sorted by the given {@code
 Comparator}. When multiple elements are equivalent according to {@code compare()}, only the
 first one specified is included. This method iterates over {@code elements} at most once.

 <p>Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.
@throws NullPointerException if {@code comparator} or any of {@code elements} is null

### `copyOf([`java.util.Comparator<? super E>`](../../../../java/util/Comparator.md) comparator, [`java.util.Collection<? extends E>`](../../../../java/util/Collection.md) elements)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Returns an immutable sorted set containing the given elements sorted by the given {@code
 Comparator}. When multiple elements are equivalent according to {@code compareTo()}, only the
 first one specified is included.

 <p>Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.

 <p>This method is safe to use even when {@code elements} is a synchronized or concurrent
 collection that is currently being modified by another thread.
@throws NullPointerException if {@code comparator} or any of {@code elements} is null
@since 7.0 (source-compatible since 2.0)

### `copyOfSorted([`java.util.SortedSet<E>`](../../../../java/util/SortedSet.md) sortedSet)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Returns an immutable sorted set containing the elements of a sorted set, sorted by the same
 {@code Comparator}. That behavior differs from {@link #copyOf(Iterable)}, which always uses the
 natural ordering of the elements.

 <p>Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.

 <p>This method is safe to use even when {@code sortedSet} is a synchronized or concurrent
 collection that is currently being modified by another thread.
@throws NullPointerException if {@code sortedSet} or any of its elements is null

### `construct([`java.util.Comparator<? super E>`](../../../../java/util/Comparator.md) comparator, `int` n, [`E[]`](E.md) contents)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Constructs an {@code ImmutableSortedSet} from the first {@code n} elements of {@code contents}.
 If {@code k} is the size of the returned {@code ImmutableSortedSet}, then the sorted unique
 elements are in the first {@code k} positions of {@code contents}, and {@code contents[i] ==
 null} for {@code k <= i < n}.

 <p>This method takes ownership of {@code contents}; do not modify {@code contents} after this
 returns.
@throws NullPointerException if any of the first {@code n} elements of {@code contents} is null

### `orderedBy([`java.util.Comparator<E>`](../../../../java/util/Comparator.md) comparator)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet.Builder<E>`](ImmutableSortedSet/Builder.md)

Returns a builder that creates immutable sorted sets with an explicit comparator. If the
 comparator has a more general type than the set being generated, such as creating a {@code
 SortedSet<Integer>} with a {@code Comparator<Number>}, use the {@link Builder} constructor
 instead.
@throws NullPointerException if {@code comparator} is null

### `reverseOrder()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet.Builder<E>`](ImmutableSortedSet/Builder.md)

Returns a builder that creates immutable sorted sets whose elements are ordered by the reverse
 of their natural ordering.

### `naturalOrder()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet.Builder<E>`](ImmutableSortedSet/Builder.md)

Returns a builder that creates immutable sorted sets whose elements are ordered by their
 natural ordering. The sorted sets use {@link Ordering#natural()} as the comparator. This method
 provides more type-safety than {@link #builder}, as it can be called only for classes that
 implement {@link Comparable}.

### `unsafeCompare(`java.lang.Object` a, `java.lang.Object` b)`

**Returns:** `int`

### `unsafeCompare([`java.util.Comparator<?>`](../../../../java/util/Comparator.md) comparator, `java.lang.Object` a, `java.lang.Object` b)`

**Returns:** `int`

### `comparator()`

**Returns:** [`java.util.Comparator<? super E>`](../../../../java/util/Comparator.md)

Returns the comparator that orders the elements, which is {@link Ordering#natural()} when the
 natural ordering of the elements is used. Note that its behavior is not consistent with {@link SortedSet#comparator()}, which returns {@code null} to indicate natural ordering.

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<E>`](./UnmodifiableIterator.md)

### `headSet([`E`](E.md) toElement)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

{@inheritDoc}

 <p>This method returns a serializable {@code ImmutableSortedSet}.

 <p>The {@link SortedSet#headSet} documentation states that a subset of a subset throws an
 {@link IllegalArgumentException} if passed a {@code toElement} greater than an earlier {@code
 toElement}. However, this method doesn't throw an exception in that situation, but instead
 keeps the original {@code toElement}.

### `headSet([`E`](E.md) toElement, `boolean` inclusive)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

@since 12.0

### `subSet([`E`](E.md) fromElement, [`E`](E.md) toElement)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

{@inheritDoc}

 <p>This method returns a serializable {@code ImmutableSortedSet}.

 <p>The {@link SortedSet#subSet} documentation states that a subset of a subset throws an {@link IllegalArgumentException} if passed a {@code fromElement} smaller than an earlier {@code
 fromElement}. However, this method doesn't throw an exception in that situation, but instead
 keeps the original {@code fromElement}. Similarly, this method keeps the original {@code
 toElement}, instead of throwing an exception, if passed a {@code toElement} greater than an
 earlier {@code toElement}.

### `subSet([`E`](E.md) fromElement, `boolean` fromInclusive, [`E`](E.md) toElement, `boolean` toInclusive)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

@since 12.0

### `tailSet([`E`](E.md) fromElement)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

{@inheritDoc}

 <p>This method returns a serializable {@code ImmutableSortedSet}.

 <p>The {@link SortedSet#tailSet} documentation states that a subset of a subset throws an
 {@link IllegalArgumentException} if passed a {@code fromElement} smaller than an earlier {@code
 fromElement}. However, this method doesn't throw an exception in that situation, but instead
 keeps the original {@code fromElement}.

### `tailSet([`E`](E.md) fromElement, `boolean` inclusive)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

@since 12.0

### `headSetImpl([`E`](E.md) toElement, `boolean` inclusive)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `subSetImpl([`E`](E.md) fromElement, `boolean` fromInclusive, [`E`](E.md) toElement, `boolean` toInclusive)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `tailSetImpl([`E`](E.md) fromElement, `boolean` inclusive)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `lower([`E`](E.md) e)`

**Returns:** [`E`](E.md)

@since 12.0

### `floor([`E`](E.md) e)`

**Returns:** [`E`](E.md)

@since 12.0

### `ceiling([`E`](E.md) e)`

**Returns:** [`E`](E.md)

@since 12.0

### `higher([`E`](E.md) e)`

**Returns:** [`E`](E.md)

@since 12.0

### `first()`

**Returns:** [`E`](E.md)

### `last()`

**Returns:** [`E`](E.md)

### `pollFirst()`

**Returns:** [`E`](E.md)

Guaranteed to throw an exception and leave the set unmodified.
@since 12.0
@throws UnsupportedOperationException always
@deprecated Unsupported operation.

### `pollLast()`

**Returns:** [`E`](E.md)

Guaranteed to throw an exception and leave the set unmodified.
@since 12.0
@throws UnsupportedOperationException always
@deprecated Unsupported operation.

### `descendingSet()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

@since 12.0

### `createDescendingSet()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

### `spliterator()`

**Returns:** [`java.util.Spliterator<E>`](../../../../java/util/Spliterator.md)

### `descendingIterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<E>`](./UnmodifiableIterator.md)

@since 12.0

### `indexOf(`java.lang.Object` target)`

**Returns:** `int`

Returns the position of an element within the set, or -1 if not present.

### `readObject([`java.io.ObjectInputStream`](../../../../java/io/ObjectInputStream.md) unused)`

**Returns:** `void`

### `writeReplace()`

**Returns:** `java.lang.Object`

### `toImmutableSet()`

**Returns:** [`java.util.stream.Collector<E,?,com.google.common.collect.ImmutableSet<E>>`](../../../../java/util/stream/Collector>.md)

Not supported. Use {@link #toImmutableSortedSet} instead. This method exists only to hide
 {@link ImmutableSet#toImmutableSet} from consumers of {@code ImmutableSortedSet}.
@throws UnsupportedOperationException always
@deprecated Use {@link ImmutableSortedSet#toImmutableSortedSet}.
@since 21.0

### `builder()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet.Builder<E>`](ImmutableSortedSet/Builder.md)

Not supported. Use {@link #naturalOrder}, which offers better type-safety, instead. This method
 exists only to hide {@link ImmutableSet#builder} from consumers of {@code ImmutableSortedSet}.
@throws UnsupportedOperationException always
@deprecated Use {@link ImmutableSortedSet#naturalOrder}, which offers better type-safety.

### `builderWithExpectedSize(`int` expectedSize)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet.Builder<E>`](ImmutableSortedSet/Builder.md)

Not supported. This method exists only to hide {@link ImmutableSet#builderWithExpectedSize}
 from consumers of {@code ImmutableSortedSet}.
@throws UnsupportedOperationException always
@deprecated Not supported by ImmutableSortedSet.

### `of([`E`](E.md) element)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Not supported. <b>You are attempting to create a set that may contain a non-{@code Comparable}
 element.</b> Proper calls will resolve to the version in {@code ImmutableSortedSet}, not this
 dummy version.
@throws UnsupportedOperationException always
@deprecated <b>Pass a parameter of type {@code Comparable} to use {@link ImmutableSortedSet#of(Comparable)}.</b>

### `of([`E`](E.md) e1, [`E`](E.md) e2)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Not supported. <b>You are attempting to create a set that may contain a non-{@code Comparable}
 element.</b> Proper calls will resolve to the version in {@code ImmutableSortedSet}, not this
 dummy version.
@throws UnsupportedOperationException always
@deprecated <b>Pass the parameters of type {@code Comparable} to use {@link ImmutableSortedSet#of(Comparable, Comparable)}.</b>

### `of([`E`](E.md) e1, [`E`](E.md) e2, [`E`](E.md) e3)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Not supported. <b>You are attempting to create a set that may contain a non-{@code Comparable}
 element.</b> Proper calls will resolve to the version in {@code ImmutableSortedSet}, not this
 dummy version.
@throws UnsupportedOperationException always
@deprecated <b>Pass the parameters of type {@code Comparable} to use {@link ImmutableSortedSet#of(Comparable, Comparable, Comparable)}.</b>

### `of([`E`](E.md) e1, [`E`](E.md) e2, [`E`](E.md) e3, [`E`](E.md) e4)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Not supported. <b>You are attempting to create a set that may contain a non-{@code Comparable}
 element.</b> Proper calls will resolve to the version in {@code ImmutableSortedSet}, not this
 dummy version.
@throws UnsupportedOperationException always
@deprecated <b>Pass the parameters of type {@code Comparable} to use {@link ImmutableSortedSet#of(Comparable, Comparable, Comparable, Comparable)}. </b>

### `of([`E`](E.md) e1, [`E`](E.md) e2, [`E`](E.md) e3, [`E`](E.md) e4, [`E`](E.md) e5)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Not supported. <b>You are attempting to create a set that may contain a non-{@code Comparable}
 element.</b> Proper calls will resolve to the version in {@code ImmutableSortedSet}, not this
 dummy version.
@throws UnsupportedOperationException always
@deprecated <b>Pass the parameters of type {@code Comparable} to use {@link ImmutableSortedSet#of( Comparable, Comparable, Comparable, Comparable, Comparable)}. </b>

### `of([`E`](E.md) e1, [`E`](E.md) e2, [`E`](E.md) e3, [`E`](E.md) e4, [`E`](E.md) e5, [`E`](E.md) e6, [`E[]`](E.md) remaining)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<E>`](./ImmutableSortedSet.md)

Not supported. <b>You are attempting to create a set that may contain a non-{@code Comparable}
 element.</b> Proper calls will resolve to the version in {@code ImmutableSortedSet}, not this
 dummy version.
@throws UnsupportedOperationException always
@deprecated <b>Pass the parameters of type {@code Comparable} to use {@link ImmutableSortedSet#of(Comparable, Comparable, Comparable, Comparable, Comparable,
     Comparable, Comparable...)}. </b>

### `copyOf([`Z[]`](Z.md) elements)`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<Z>`](./ImmutableSortedSet.md)

Not supported. <b>You are attempting to create a set that may contain non-{@code Comparable}
 elements.</b> Proper calls will resolve to the version in {@code ImmutableSortedSet}, not this
 dummy version.
@throws UnsupportedOperationException always
@deprecated <b>Pass parameters of type {@code Comparable} to use {@link ImmutableSortedSet#copyOf(Comparable[])}.</b>

