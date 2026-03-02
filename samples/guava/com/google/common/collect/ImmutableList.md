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

This list behaves and performs comparably to Collections#emptyList, and is preferable mainly for consistency and maintainability of your
 code.

 
**Performance note:** the instance returned is a singleton.

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `of(E element)`

This list behaves and performs
 comparably to Collections#singletonList, but will not accept a null element. It is
 preferable mainly for consistency and maintainability of your code.

**Parameters:**
- `element` (`E`)

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `of(E e1, E e2)`

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `of(E e1, E e2, E e3)`

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `of(E e1, E e2, E e3, E e4)`

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)
- `e4` (`E`)

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `of(E e1, E e2, E e3, E e4, E e5)`

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)
- `e4` (`E`)
- `e5` (`E`)

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `of(E e1, E e2, E e3, E e4, E e5, E e6)`

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)
- `e4` (`E`)
- `e5` (`E`)
- `e6` (`E`)

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `of(E e1, E e2, E e3, E e4, E e5, E e6, E e7)`

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)
- `e4` (`E`)
- `e5` (`E`)
- `e6` (`E`)
- `e7` (`E`)

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8)`

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)
- `e4` (`E`)
- `e5` (`E`)
- `e6` (`E`)
- `e7` (`E`)
- `e8` (`E`)

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9)`

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

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10)`

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

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11)`

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

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11, E e12, E[] others)`

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

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `copyOf(Iterable<? extends E> elements)`

If elements is a
 Collection, this method behaves exactly as #copyOf(Collection); otherwise, it
 behaves exactly as copyOf(elements.iterator().

**Parameters:**
- `elements` (`java.lang.Iterable<? extends E>`)

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `copyOf(Collection<? extends E> elements)`

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

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `copyOf(Iterator<? extends E> elements)`

**Parameters:**
- `elements` (`java.util.Iterator<? extends E>`)

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `copyOf(E[] elements)`

**Parameters:**
- `elements` (`E[]`)

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `sortedCopyOf(Iterable<? extends E> elements)`

The sorting algorithm used is stable, so elements that compare as equal will stay in the
 order in which they appear in the input.

 
If your data has no duplicates, or you wish to deduplicate elements, use 
 ImmutableSortedSet.copyOf(elements); if you want a List you can use its 
 asList() view.

 
**Java 8 users:** If you want to convert a java.util.stream.Stream to a sorted
 ImmutableList, use stream.sorted().collect(toImmutableList()).

**Parameters:**
- `elements` (`java.lang.Iterable<? extends E>`)

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `sortedCopyOf(Comparator<? super E> comparator, Iterable<? extends E> elements)`

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

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `construct(Object[] elements)`

Checks for nulls; does not copy.

**Parameters:**
- `elements` (`java.lang.Object[]`)

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `asImmutableList(Object[] elements)`

Does not check for nulls; does not copy.

 
The array must be internally created.

**Parameters:**
- `elements` (`java.lang.Object[]`)

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `asImmutableList(lang@Nullable Object[] elements, int length)`

Copies if the specified range does not cover the complete
 array. Does not check for nulls.

**Parameters:**
- `elements` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)
- `length` (`int`)

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<E>`](./UnmodifiableIterator.md)

### `listIterator()`

**Returns:** [`com.google.common.collect.UnmodifiableListIterator<E>`](./UnmodifiableListIterator.md)

### `listIterator(int index)`

**Parameters:**
- `index` (`int`)

**Returns:** [`com.google.common.collect.UnmodifiableListIterator<E>`](./UnmodifiableListIterator.md)

### `forEach(Consumer<? super E> consumer)`

**Parameters:**
- `consumer` (`java.util.function.Consumer<? super E>`)

**Returns:** `void`

### `indexOf(Object object)`

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `int`

### `lastIndexOf(Object object)`

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `int`

### `contains(Object object)`

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `subList(int fromIndex, int toIndex)`

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

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `subListUnchecked(int fromIndex, int toIndex)`

**Parameters:**
- `fromIndex` (`int`)
- `toIndex` (`int`)

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `addAll(int index, Collection<? extends E> newElements)`

**Parameters:**
- `index` (`int`)
- `newElements` (`java.util.Collection<? extends E>`)

**Returns:** `boolean`

### `set(int index, E element)`

**Parameters:**
- `index` (`int`)
- `element` (`E`)

**Returns:** `E`

### `add(int index, E element)`

**Parameters:**
- `index` (`int`)
- `element` (`E`)

**Returns:** `void`

### `remove(int index)`

**Parameters:**
- `index` (`int`)

**Returns:** `E`

### `replaceAll(UnaryOperator<E> operator)`

**Parameters:**
- `operator` (`java.util.function.UnaryOperator<E>`)

**Returns:** `void`

### `sort(util@Nullable Comparator<? super E> c)`

**Parameters:**
- `c` (`java.util.@org.checkerframework.checker.nullness.qual.Nullable Comparator<? super E>`)

**Returns:** `void`

### `asList()`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `spliterator()`

**Returns:** `java.util.Spliterator<E>`

### `copyIntoArray(lang@Nullable Object[] dst, int offset)`

**Parameters:**
- `dst` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)
- `offset` (`int`)

**Returns:** `int`

### `reverse()`

For example, ImmutableList.of(1,
 2, 3).reverse() is equivalent to ImmutableList.of(3, 2, 1).

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `equals(Object obj)`

**Parameters:**
- `obj` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `readObject(ObjectInputStream stream)`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

**Returns:** `void`

### `writeReplace()`

**Returns:** `java.lang.Object`

### `builder()`

The generated builder is equivalent to the builder created by the Builder constructor.

**Returns:** `com.google.common.collect.ImmutableList.Builder<E>`

### `builderWithExpectedSize(int expectedSize)`

If expectedSize is exactly the number of elements added to the builder before Builder#build is called, the builder is likely to perform better than an unsized #builder() would have.

 
It is not specified if any performance benefits apply if expectedSize is close to,
 but not exactly, the number of elements added to the builder.

**Parameters:**
- `expectedSize` (`int`)

**Returns:** `com.google.common.collect.ImmutableList.Builder<E>`

