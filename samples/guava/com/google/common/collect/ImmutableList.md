# Class: `ImmutableList`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableList`

**Extends:** [`com.google.common.collect.ImmutableCollection<E>`](./ImmutableCollection.md)

**Implements:** [`java.util.List<E>`](../../../../java/util/List.md), [`java.util.RandomAccess`](../../../../java/util/RandomAccess.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

A {@link List} whose contents will never change, with many other important properties detailed at
 {@link ImmutableCollection}.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/ImmutableCollectionsExplained">immutable collections</a>.
@see ImmutableMap
@see ImmutableSet
@author Kevin Bourrillion
@since 2.0

## Fields

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>()`

## Methods

### `toImmutableList()`

**Returns:** [`java.util.stream.Collector<E,?,com.google.common.collect.ImmutableList<E>>`](../../../../java/util/stream/Collector>.md)

Returns a {@code Collector} that accumulates the input elements into a new {@code
 ImmutableList}, in encounter order.
@since 21.0

### `of()`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns the empty immutable list. This list behaves and performs comparably to {@link Collections#emptyList}, and is preferable mainly for consistency and maintainability of your
 code.

 <p><b>Performance note:</b> the instance returned is a singleton.

### `of([`E`](E.md) element)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns an immutable list containing a single element. This list behaves and performs
 comparably to {@link Collections#singletonList}, but will not accept a null element. It is
 preferable mainly for consistency and maintainability of your code.
@throws NullPointerException if {@code element} is null

### `of([`E`](E.md) e1, [`E`](E.md) e2)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns an immutable list containing the given elements, in order.
@throws NullPointerException if any element is null

### `of([`E`](E.md) e1, [`E`](E.md) e2, [`E`](E.md) e3)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns an immutable list containing the given elements, in order.
@throws NullPointerException if any element is null

### `of([`E`](E.md) e1, [`E`](E.md) e2, [`E`](E.md) e3, [`E`](E.md) e4)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns an immutable list containing the given elements, in order.
@throws NullPointerException if any element is null

### `of([`E`](E.md) e1, [`E`](E.md) e2, [`E`](E.md) e3, [`E`](E.md) e4, [`E`](E.md) e5)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns an immutable list containing the given elements, in order.
@throws NullPointerException if any element is null

### `of([`E`](E.md) e1, [`E`](E.md) e2, [`E`](E.md) e3, [`E`](E.md) e4, [`E`](E.md) e5, [`E`](E.md) e6)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns an immutable list containing the given elements, in order.
@throws NullPointerException if any element is null

### `of([`E`](E.md) e1, [`E`](E.md) e2, [`E`](E.md) e3, [`E`](E.md) e4, [`E`](E.md) e5, [`E`](E.md) e6, [`E`](E.md) e7)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns an immutable list containing the given elements, in order.
@throws NullPointerException if any element is null

### `of([`E`](E.md) e1, [`E`](E.md) e2, [`E`](E.md) e3, [`E`](E.md) e4, [`E`](E.md) e5, [`E`](E.md) e6, [`E`](E.md) e7, [`E`](E.md) e8)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns an immutable list containing the given elements, in order.
@throws NullPointerException if any element is null

### `of([`E`](E.md) e1, [`E`](E.md) e2, [`E`](E.md) e3, [`E`](E.md) e4, [`E`](E.md) e5, [`E`](E.md) e6, [`E`](E.md) e7, [`E`](E.md) e8, [`E`](E.md) e9)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns an immutable list containing the given elements, in order.
@throws NullPointerException if any element is null

### `of([`E`](E.md) e1, [`E`](E.md) e2, [`E`](E.md) e3, [`E`](E.md) e4, [`E`](E.md) e5, [`E`](E.md) e6, [`E`](E.md) e7, [`E`](E.md) e8, [`E`](E.md) e9, [`E`](E.md) e10)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns an immutable list containing the given elements, in order.
@throws NullPointerException if any element is null

### `of([`E`](E.md) e1, [`E`](E.md) e2, [`E`](E.md) e3, [`E`](E.md) e4, [`E`](E.md) e5, [`E`](E.md) e6, [`E`](E.md) e7, [`E`](E.md) e8, [`E`](E.md) e9, [`E`](E.md) e10, [`E`](E.md) e11)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns an immutable list containing the given elements, in order.
@throws NullPointerException if any element is null

### `of([`E`](E.md) e1, [`E`](E.md) e2, [`E`](E.md) e3, [`E`](E.md) e4, [`E`](E.md) e5, [`E`](E.md) e6, [`E`](E.md) e7, [`E`](E.md) e8, [`E`](E.md) e9, [`E`](E.md) e10, [`E`](E.md) e11, [`E`](E.md) e12, [`E[]`](E.md) others)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns an immutable list containing the given elements, in order.

 <p>The array {@code others} must not be longer than {@code Integer.MAX_VALUE - 12}.
@throws NullPointerException if any element is null
@since 3.0 (source-compatible since 2.0)

### `copyOf(`java.lang.Iterable<? extends E>` elements)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns an immutable list containing the given elements, in order. If {@code elements} is a
 {@link Collection}, this method behaves exactly as {@link #copyOf(Collection)}; otherwise, it
 behaves exactly as {@code copyOf(elements.iterator()}.
@throws NullPointerException if {@code elements} contains a null element

### `copyOf([`java.util.Collection<? extends E>`](../../../../java/util/Collection.md) elements)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns an immutable list containing the given elements, in order.

 <p>Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.

 <p>Note that if {@code list} is a {@code List<String>}, then {@code ImmutableList.copyOf(list)}
 returns an {@code ImmutableList<String>} containing each of the strings in {@code list}, while
 {@code ImmutableList.of(list)} returns an {@code ImmutableList<List<String>>} containing one
 element (the given list itself).

 <p>This method is safe to use even when {@code elements} is a synchronized or concurrent
 collection that is currently being modified by another thread.
@throws NullPointerException if {@code elements} contains a null element

### `copyOf([`java.util.Iterator<? extends E>`](../../../../java/util/Iterator.md) elements)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns an immutable list containing the given elements, in order.
@throws NullPointerException if {@code elements} contains a null element

### `copyOf([`E[]`](E.md) elements)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns an immutable list containing the given elements, in order.
@throws NullPointerException if {@code elements} contains a null element
@since 3.0

### `sortedCopyOf(`java.lang.Iterable<? extends E>` elements)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns an immutable list containing the given elements, sorted according to their natural
 order. The sorting algorithm used is stable, so elements that compare as equal will stay in the
 order in which they appear in the input.

 <p>If your data has no duplicates, or you wish to deduplicate elements, use {@code
 ImmutableSortedSet.copyOf(elements)}; if you want a {@code List} you can use its {@code
 asList()} view.

 <p><b>Java 8 users:</b> If you want to convert a {@link java.util.stream.Stream} to a sorted
 {@code ImmutableList}, use {@code stream.sorted().collect(toImmutableList())}.
@throws NullPointerException if any element in the input is null
@since 21.0

### `sortedCopyOf([`java.util.Comparator<? super E>`](../../../../java/util/Comparator.md) comparator, `java.lang.Iterable<? extends E>` elements)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns an immutable list containing the given elements, in sorted order relative to the
 specified comparator. The sorting algorithm used is stable, so elements that compare as equal
 will stay in the order in which they appear in the input.

 <p>If your data has no duplicates, or you wish to deduplicate elements, use {@code
 ImmutableSortedSet.copyOf(comparator, elements)}; if you want a {@code List} you can use its
 {@code asList()} view.

 <p><b>Java 8 users:</b> If you want to convert a {@link java.util.stream.Stream} to a sorted
 {@code ImmutableList}, use {@code stream.sorted(comparator).collect(toImmutableList())}.
@throws NullPointerException if any element in the input is null
@since 21.0

### `construct(`java.lang.Object[]` elements)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Views the array as an immutable list. Checks for nulls; does not copy.

### `asImmutableList(`java.lang.Object[]` elements)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Views the array as an immutable list. Does not check for nulls; does not copy.

 <p>The array must be internally created.

### `asImmutableList(`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]` elements, `int` length)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Views the array as an immutable list. Copies if the specified range does not cover the complete
 array. Does not check for nulls.

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<E>`](./UnmodifiableIterator.md)

### `listIterator()`

**Returns:** [`com.google.common.collect.UnmodifiableListIterator<E>`](./UnmodifiableListIterator.md)

### `listIterator(`int` index)`

**Returns:** [`com.google.common.collect.UnmodifiableListIterator<E>`](./UnmodifiableListIterator.md)

### `forEach([`java.util.function.Consumer<? super E>`](../../../../java/util/function/Consumer.md) consumer)`

**Returns:** `void`

### `indexOf(`java.lang.Object` object)`

**Returns:** `int`

### `lastIndexOf(`java.lang.Object` object)`

**Returns:** `int`

### `contains(`java.lang.Object` object)`

**Returns:** `boolean`

### `subList(`int` fromIndex, `int` toIndex)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns an immutable list of the elements between the specified {@code fromIndex}, inclusive,
 and {@code toIndex}, exclusive. (If {@code fromIndex} and {@code toIndex} are equal, the empty
 immutable list is returned.)

 <p><b>Note:</b> in almost all circumstances, the returned {@link ImmutableList} retains a
 strong reference to {@code this}, which may prevent the original list from being garbage
 collected. If you want the original list to be eligible for garbage collection, you should
 create and use a copy of the sub list (e.g., {@code
 ImmutableList.copyOf(originalList.subList(...))}).

### `subListUnchecked(`int` fromIndex, `int` toIndex)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Called by the default implementation of {@link #subList} when {@code toIndex - fromIndex > 1},
 after index validation has already been performed.

### `addAll(`int` index, [`java.util.Collection<? extends E>`](../../../../java/util/Collection.md) newElements)`

**Returns:** `boolean`

Guaranteed to throw an exception and leave the list unmodified.
@throws UnsupportedOperationException always
@deprecated Unsupported operation.

### `set(`int` index, [`E`](E.md) element)`

**Returns:** [`E`](E.md)

Guaranteed to throw an exception and leave the list unmodified.
@throws UnsupportedOperationException always
@deprecated Unsupported operation.

### `add(`int` index, [`E`](E.md) element)`

**Returns:** `void`

Guaranteed to throw an exception and leave the list unmodified.
@throws UnsupportedOperationException always
@deprecated Unsupported operation.

### `remove(`int` index)`

**Returns:** [`E`](E.md)

Guaranteed to throw an exception and leave the list unmodified.
@throws UnsupportedOperationException always
@deprecated Unsupported operation.

### `replaceAll([`java.util.function.UnaryOperator<E>`](../../../../java/util/function/UnaryOperator.md) operator)`

**Returns:** `void`

Guaranteed to throw an exception and leave the list unmodified.
@throws UnsupportedOperationException always
@deprecated Unsupported operation.

### `sort([`java.util.@org.checkerframework.checker.nullness.qual.Nullable Comparator<? super E>`](../../../../java/util/@org/checkerframework/checker/nullness/qual/Nullable Comparator.md) c)`

**Returns:** `void`

Guaranteed to throw an exception and leave the list unmodified.
@throws UnsupportedOperationException always
@deprecated Unsupported operation.

### `asList()`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns this list instance.
@since 2.0
@deprecated There is no reason to use this; it always returns {@code this}.

### `spliterator()`

**Returns:** [`java.util.Spliterator<E>`](../../../../java/util/Spliterator.md)

### `copyIntoArray(`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]` dst, `int` offset)`

**Returns:** `int`

### `reverse()`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns a view of this immutable list in reverse order. For example, {@code ImmutableList.of(1,
 2, 3).reverse()} is equivalent to {@code ImmutableList.of(3, 2, 1)}.
@return a view of this immutable list in reverse order
@since 7.0

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `readObject([`java.io.ObjectInputStream`](../../../../java/io/ObjectInputStream.md) stream)`

**Returns:** `void`

### `writeReplace()`

**Returns:** `java.lang.Object`

### `builder()`

**Returns:** [`com.google.common.collect.ImmutableList.Builder<E>`](ImmutableList/Builder.md)

Returns a new builder. The generated builder is equivalent to the builder created by the {@link Builder} constructor.

### `builderWithExpectedSize(`int` expectedSize)`

**Returns:** [`com.google.common.collect.ImmutableList.Builder<E>`](ImmutableList/Builder.md)

Returns a new builder, expecting the specified number of elements to be added.

 <p>If {@code expectedSize} is exactly the number of elements added to the builder before {@link Builder#build} is called, the builder is likely to perform better than an unsized {@link #builder()} would have.

 <p>It is not specified if any performance benefits apply if {@code expectedSize} is close to,
 but not exactly, the number of elements added to the builder.
@since 23.1

