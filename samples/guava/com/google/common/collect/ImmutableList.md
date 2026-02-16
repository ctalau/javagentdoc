# Class: `ImmutableList`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableList`

**Extends:** [`com.google.common.collect.ImmutableCollection<E>`](./ImmutableCollection.md)

**Implements:** `java.util.List<E>`, `java.util.RandomAccess`

## Type Parameters

- `E` extends `java.lang.Object`

## Description

A `List` whose contents will never change, with many other important properties detailed at
 `ImmutableCollection`.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/ImmutableCollectionsExplained">immutable collections</a>.
**See:** ImmutableMap
**See:** ImmutableSet
**Author:** Kevin Bourrillion
**Since:** 2.0

## Fields

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>()`

## Methods

### `toImmutableList()`

**Returns:** `java.util.stream.Collector<E,?,com.google.common.collect.ImmutableList<E>>`

Returns a `Collector` that accumulates the input elements into a new `ImmutableList`, in encounter order.
**Since:** 21.0

### `of()`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns the empty immutable list. This list behaves and performs comparably to `Collections.emptyList`, and is preferable mainly for consistency and maintainability of your
 code.

 <p><b>Performance note:</b> the instance returned is a singleton.

### `of(`E` element)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns an immutable list containing a single element. This list behaves and performs
 comparably to `Collections.singletonList`, but will not accept a null element. It is
 preferable mainly for consistency and maintainability of your code.
@throws NullPointerException if `element` is null

### `of(`E` e1, `E` e2)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns an immutable list containing the given elements, in order.
@throws NullPointerException if any element is null

### `of(`E` e1, `E` e2, `E` e3)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns an immutable list containing the given elements, in order.
@throws NullPointerException if any element is null

### `of(`E` e1, `E` e2, `E` e3, `E` e4)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns an immutable list containing the given elements, in order.
@throws NullPointerException if any element is null

### `of(`E` e1, `E` e2, `E` e3, `E` e4, `E` e5)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns an immutable list containing the given elements, in order.
@throws NullPointerException if any element is null

### `of(`E` e1, `E` e2, `E` e3, `E` e4, `E` e5, `E` e6)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns an immutable list containing the given elements, in order.
@throws NullPointerException if any element is null

### `of(`E` e1, `E` e2, `E` e3, `E` e4, `E` e5, `E` e6, `E` e7)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns an immutable list containing the given elements, in order.
@throws NullPointerException if any element is null

### `of(`E` e1, `E` e2, `E` e3, `E` e4, `E` e5, `E` e6, `E` e7, `E` e8)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns an immutable list containing the given elements, in order.
@throws NullPointerException if any element is null

### `of(`E` e1, `E` e2, `E` e3, `E` e4, `E` e5, `E` e6, `E` e7, `E` e8, `E` e9)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns an immutable list containing the given elements, in order.
@throws NullPointerException if any element is null

### `of(`E` e1, `E` e2, `E` e3, `E` e4, `E` e5, `E` e6, `E` e7, `E` e8, `E` e9, `E` e10)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns an immutable list containing the given elements, in order.
@throws NullPointerException if any element is null

### `of(`E` e1, `E` e2, `E` e3, `E` e4, `E` e5, `E` e6, `E` e7, `E` e8, `E` e9, `E` e10, `E` e11)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns an immutable list containing the given elements, in order.
@throws NullPointerException if any element is null

### `of(`E` e1, `E` e2, `E` e3, `E` e4, `E` e5, `E` e6, `E` e7, `E` e8, `E` e9, `E` e10, `E` e11, `E` e12, `E[]` others)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns an immutable list containing the given elements, in order.

 <p>The array `others` must not be longer than `Integer.MAX_VALUE - 12`.
@throws NullPointerException if any element is null
**Since:** 3.0 (source-compatible since 2.0)

### `copyOf(`java.lang.Iterable<? extends E>` elements)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns an immutable list containing the given elements, in order. If `elements` is a
 `Collection`, this method behaves exactly as `copyOf(Collection)`; otherwise, it
 behaves exactly as `copyOf(elements.iterator()`.
@throws NullPointerException if `elements` contains a null element

### `copyOf(`java.util.Collection<? extends E>` elements)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns an immutable list containing the given elements, in order.

 <p>Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.

 <p>Note that if `list` is a `List<String>`, then `ImmutableList.copyOf(list)`
 returns an `ImmutableList<String>` containing each of the strings in `list`, while
 `ImmutableList.of(list)` returns an `ImmutableList<List<String>>` containing one
 element (the given list itself).

 <p>This method is safe to use even when `elements` is a synchronized or concurrent
 collection that is currently being modified by another thread.
@throws NullPointerException if `elements` contains a null element

### `copyOf(`java.util.Iterator<? extends E>` elements)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns an immutable list containing the given elements, in order.
@throws NullPointerException if `elements` contains a null element

### `copyOf(`E[]` elements)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns an immutable list containing the given elements, in order.
@throws NullPointerException if `elements` contains a null element
**Since:** 3.0

### `sortedCopyOf(`java.lang.Iterable<? extends E>` elements)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns an immutable list containing the given elements, sorted according to their natural
 order. The sorting algorithm used is stable, so elements that compare as equal will stay in the
 order in which they appear in the input.

 <p>If your data has no duplicates, or you wish to deduplicate elements, use `ImmutableSortedSet.copyOf(elements)`; if you want a `List` you can use its `asList()` view.

 <p><b>Java 8 users:</b> If you want to convert a `java.util.stream.Stream` to a sorted
 `ImmutableList`, use `stream.sorted().collect(toImmutableList())`.
@throws NullPointerException if any element in the input is null
**Since:** 21.0

### `sortedCopyOf(`java.util.Comparator<? super E>` comparator, `java.lang.Iterable<? extends E>` elements)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns an immutable list containing the given elements, in sorted order relative to the
 specified comparator. The sorting algorithm used is stable, so elements that compare as equal
 will stay in the order in which they appear in the input.

 <p>If your data has no duplicates, or you wish to deduplicate elements, use `ImmutableSortedSet.copyOf(comparator, elements)`; if you want a `List` you can use its
 `asList()` view.

 <p><b>Java 8 users:</b> If you want to convert a `java.util.stream.Stream` to a sorted
 `ImmutableList`, use `stream.sorted(comparator).collect(toImmutableList())`.
@throws NullPointerException if any element in the input is null
**Since:** 21.0

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

### `forEach(`java.util.function.Consumer<? super E>` consumer)`

**Returns:** `void`

### `indexOf(`java.lang.Object` object)`

**Returns:** `int`

### `lastIndexOf(`java.lang.Object` object)`

**Returns:** `int`

### `contains(`java.lang.Object` object)`

**Returns:** `boolean`

### `subList(`int` fromIndex, `int` toIndex)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns an immutable list of the elements between the specified `fromIndex`, inclusive,
 and `toIndex`, exclusive. (If `fromIndex` and `toIndex` are equal, the empty
 immutable list is returned.)

 <p><b>Note:</b> in almost all circumstances, the returned `ImmutableList` retains a
 strong reference to `this`, which may prevent the original list from being garbage
 collected. If you want the original list to be eligible for garbage collection, you should
 create and use a copy of the sub list (e.g., `ImmutableList.copyOf(originalList.subList(...))`).

### `subListUnchecked(`int` fromIndex, `int` toIndex)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Called by the default implementation of `subList` when `toIndex - fromIndex > 1`,
 after index validation has already been performed.

### `addAll(`int` index, `java.util.Collection<? extends E>` newElements)`

**Returns:** `boolean`

Guaranteed to throw an exception and leave the list unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `set(`int` index, `E` element)`

**Returns:** `E`

Guaranteed to throw an exception and leave the list unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `add(`int` index, `E` element)`

**Returns:** `void`

Guaranteed to throw an exception and leave the list unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `remove(`int` index)`

**Returns:** `E`

Guaranteed to throw an exception and leave the list unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `replaceAll(`java.util.function.UnaryOperator<E>` operator)`

**Returns:** `void`

Guaranteed to throw an exception and leave the list unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `sort(`java.util.@org.checkerframework.checker.nullness.qual.Nullable Comparator<? super E>` c)`

**Returns:** `void`

Guaranteed to throw an exception and leave the list unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `asList()`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns this list instance.
**Since:** 2.0
**Deprecated:**There is no reason to use this; it always returns `this`.

### `spliterator()`

**Returns:** `java.util.Spliterator<E>`

### `copyIntoArray(`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]` dst, `int` offset)`

**Returns:** `int`

### `reverse()`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Returns a view of this immutable list in reverse order. For example, `ImmutableList.of(1,
 2, 3).reverse()` is equivalent to `ImmutableList.of(3, 2, 1)`.
@return a view of this immutable list in reverse order
**Since:** 7.0

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `readObject(`java.io.ObjectInputStream` stream)`

**Returns:** `void`

### `writeReplace()`

**Returns:** `java.lang.Object`

### `builder()`

**Returns:** [`com.google.common.collect.ImmutableList.Builder<E>`](ImmutableList/Builder.md)

Returns a new builder. The generated builder is equivalent to the builder created by the `Builder` constructor.

### `builderWithExpectedSize(`int` expectedSize)`

**Returns:** [`com.google.common.collect.ImmutableList.Builder<E>`](ImmutableList/Builder.md)

Returns a new builder, expecting the specified number of elements to be added.

 <p>If `expectedSize` is exactly the number of elements added to the builder before `Builder.build` is called, the builder is likely to perform better than an unsized `builder()` would have.

 <p>It is not specified if any performance benefits apply if `expectedSize` is close to,
 but not exactly, the number of elements added to the builder.
**Since:** 23.1

