# Class: `ImmutableList`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableList`

**Extends:** [`com.google.common.collect.ImmutableCollection<E>`](./ImmutableCollection.md)

**Implements:** `java.util.List<E>`, `java.util.RandomAccess`

## Type Parameters

- `E` extends `java.lang.Object`

## Description

See the Guava User Guide article on [immutable collections](https://github.com/google/guava/wiki/ImmutableCollectionsExplained).

## Fields

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>()`

## Methods

### `toImmutableList()`

**Returns:** `java.util.stream.Collector<E,?,com.google.common.collect.ImmutableList<E>>`

### `of()`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

This list behaves and performs comparably to Collections#emptyList, and is preferable mainly for consistency and maintainability of your
 code.

 
**Performance note:** the instance returned is a singleton.

### `of(E element)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

This list behaves and performs
 comparably to Collections#singletonList, but will not accept a null element. It is
 preferable mainly for consistency and maintainability of your code.

**Parameters:**
- `element` (`E`)

### `of(E e1, E e2)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)

### `of(E e1, E e2, E e3)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)

### `of(E e1, E e2, E e3, E e4)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)
- `e4` (`E`)

### `of(E e1, E e2, E e3, E e4, E e5)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)
- `e4` (`E`)
- `e5` (`E`)

### `of(E e1, E e2, E e3, E e4, E e5, E e6)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)
- `e4` (`E`)
- `e5` (`E`)
- `e6` (`E`)

### `of(E e1, E e2, E e3, E e4, E e5, E e6, E e7)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)
- `e4` (`E`)
- `e5` (`E`)
- `e6` (`E`)
- `e7` (`E`)

### `of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)
- `e4` (`E`)
- `e5` (`E`)
- `e6` (`E`)
- `e7` (`E`)
- `e8` (`E`)

### `of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)
- `e4` (`E`)
- `e5` (`E`)
- `e6` (`E`)
- `e7` (`E`)
- `e8` (`E`)
- `e9` (`E`)

### `of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)
- `e4` (`E`)
- `e5` (`E`)
- `e6` (`E`)
- `e7` (`E`)
- `e8` (`E`)
- `e9` (`E`)
- `e10` (`E`)

### `of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)
- `e4` (`E`)
- `e5` (`E`)
- `e6` (`E`)
- `e7` (`E`)
- `e8` (`E`)
- `e9` (`E`)
- `e10` (`E`)
- `e11` (`E`)

### `of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11, E e12, E[] others)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

The array others must not be longer than Integer.MAX_VALUE - 12.

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)
- `e4` (`E`)
- `e5` (`E`)
- `e6` (`E`)
- `e7` (`E`)
- `e8` (`E`)
- `e9` (`E`)
- `e10` (`E`)
- `e11` (`E`)
- `e12` (`E`)
- `others` (`E[]`)

### `copyOf(java.lang.Iterable<? extends E> elements)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

If elements is a
 Collection, this method behaves exactly as #copyOf(Collection); otherwise, it
 behaves exactly as copyOf(elements.iterator().

**Parameters:**
- `elements` (`java.lang.Iterable<? extends E>`)

### `copyOf(java.util.Collection<? extends E> elements)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.

 
Note that if list is a List<String>, then ImmutableList.copyOf(list)
 returns an ImmutableList<String> containing each of the strings in list, while
 ImmutableList.of(list) returns an ImmutableList<List<String>> containing one
 element (the given list itself).

 
This method is safe to use even when elements is a synchronized or concurrent
 collection that is currently being modified by another thread.

**Parameters:**
- `elements` (`java.util.Collection<? extends E>`)

### `copyOf(java.util.Iterator<? extends E> elements)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

**Parameters:**
- `elements` (`java.util.Iterator<? extends E>`)

### `copyOf(E[] elements)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

**Parameters:**
- `elements` (`E[]`)

### `sortedCopyOf(java.lang.Iterable<? extends E> elements)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

The sorting algorithm used is stable, so elements that compare as equal will stay in the
 order in which they appear in the input.

 
If your data has no duplicates, or you wish to deduplicate elements, use 
 ImmutableSortedSet.copyOf(elements); if you want a List you can use its 
 asList() view.

 
**Java 8 users:** If you want to convert a java.util.stream.Stream to a sorted
 ImmutableList, use stream.sorted().collect(toImmutableList()).

**Parameters:**
- `elements` (`java.lang.Iterable<? extends E>`)

### `sortedCopyOf(java.util.Comparator<? super E> comparator, java.lang.Iterable<? extends E> elements)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

The sorting algorithm used is stable, so elements that compare as equal
 will stay in the order in which they appear in the input.

 
If your data has no duplicates, or you wish to deduplicate elements, use 
 ImmutableSortedSet.copyOf(comparator, elements); if you want a List you can use its
 asList() view.

 
**Java 8 users:** If you want to convert a java.util.stream.Stream to a sorted
 ImmutableList, use stream.sorted(comparator).collect(toImmutableList()).

**Parameters:**
- `comparator` (`java.util.Comparator<? super E>`)
- `elements` (`java.lang.Iterable<? extends E>`)

### `construct(java.lang.Object[] elements)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Checks for nulls; does not copy.

**Parameters:**
- `elements` (`java.lang.Object[]`)

### `asImmutableList(java.lang.Object[] elements)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Does not check for nulls; does not copy.

 
The array must be internally created.

**Parameters:**
- `elements` (`java.lang.Object[]`)

### `asImmutableList(java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[] elements, int length)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

Copies if the specified range does not cover the complete
 array. Does not check for nulls.

**Parameters:**
- `elements` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)
- `length` (`int`)

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<E>`](./UnmodifiableIterator.md)

### `listIterator()`

**Returns:** [`com.google.common.collect.UnmodifiableListIterator<E>`](./UnmodifiableListIterator.md)

### `listIterator(int index)`

**Returns:** [`com.google.common.collect.UnmodifiableListIterator<E>`](./UnmodifiableListIterator.md)

**Parameters:**
- `index` (`int`)

### `forEach(java.util.function.Consumer<? super E> consumer)`

**Returns:** `void`

**Parameters:**
- `consumer` (`java.util.function.Consumer<? super E>`)

### `indexOf(java.lang.Object object)`

**Returns:** `int`

**Parameters:**
- `object` (`java.lang.Object`)

### `lastIndexOf(java.lang.Object object)`

**Returns:** `int`

**Parameters:**
- `object` (`java.lang.Object`)

### `contains(java.lang.Object object)`

**Returns:** `boolean`

**Parameters:**
- `object` (`java.lang.Object`)

### `subList(int fromIndex, int toIndex)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

(If fromIndex and toIndex are equal, the empty
 immutable list is returned.)

 
**Note:** in almost all circumstances, the returned ImmutableList retains a
 strong reference to this, which may prevent the original list from being garbage
 collected. If you want the original list to be eligible for garbage collection, you should
 create and use a copy of the sub list (e.g., 
 ImmutableList.copyOf(originalList.subList(...))).

**Parameters:**
- `fromIndex` (`int`)
- `toIndex` (`int`)

### `subListUnchecked(int fromIndex, int toIndex)`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

**Parameters:**
- `fromIndex` (`int`)
- `toIndex` (`int`)

### `addAll(int index, java.util.Collection<? extends E> newElements)`

**Returns:** `boolean`

**Parameters:**
- `index` (`int`)
- `newElements` (`java.util.Collection<? extends E>`)

### `set(int index, E element)`

**Returns:** `E`

**Parameters:**
- `index` (`int`)
- `element` (`E`)

### `add(int index, E element)`

**Returns:** `void`

**Parameters:**
- `index` (`int`)
- `element` (`E`)

### `remove(int index)`

**Returns:** `E`

**Parameters:**
- `index` (`int`)

### `replaceAll(java.util.function.UnaryOperator<E> operator)`

**Returns:** `void`

**Parameters:**
- `operator` (`java.util.function.UnaryOperator<E>`)

### `sort(java.util.@org.checkerframework.checker.nullness.qual.Nullable Comparator<? super E> c)`

**Returns:** `void`

**Parameters:**
- `c` (`java.util.@org.checkerframework.checker.nullness.qual.Nullable Comparator<? super E>`)

### `asList()`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `spliterator()`

**Returns:** `java.util.Spliterator<E>`

### `copyIntoArray(java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[] dst, int offset)`

**Returns:** `int`

**Parameters:**
- `dst` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)
- `offset` (`int`)

### `reverse()`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

For example, ImmutableList.of(1,
 2, 3).reverse() is equivalent to ImmutableList.of(3, 2, 1).

### `equals(java.lang.Object obj)`

**Returns:** `boolean`

**Parameters:**
- `obj` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

### `readObject(java.io.ObjectInputStream stream)`

**Returns:** `void`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

### `writeReplace()`

**Returns:** `java.lang.Object`

### `builder()`

**Returns:** `com.google.common.collect.ImmutableList.Builder<E>`

The generated builder is equivalent to the builder created by the Builder constructor.

### `builderWithExpectedSize(int expectedSize)`

**Returns:** `com.google.common.collect.ImmutableList.Builder<E>`

If expectedSize is exactly the number of elements added to the builder before Builder#build is called, the builder is likely to perform better than an unsized #builder() would have.

 
It is not specified if any performance benefits apply if expectedSize is close to,
 but not exactly, the number of elements added to the builder.

**Parameters:**
- `expectedSize` (`int`)

