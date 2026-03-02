# Class: `ImmutableMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableMultiset`

**Extends:** [`com.google.common.collect.ImmutableMultisetGwtSerializationDependencies<E>`](./ImmutableMultisetGwtSerializationDependencies.md)

**Implements:** [`com.google.common.collect.Multiset<E>`](./Multiset.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

**Grouped iteration.** In all current implementations, duplicate elements always appear
 consecutively when iterating. Elements iterate in order by the *first* appearance of that
 element when the multiset was created.

 
See the Guava User Guide article on [immutable collections](https://github.com/google/guava/wiki/ImmutableCollectionsExplained).

## Fields

### `asList`

**Type:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `entrySet`

**Type:** [`com.google.common.collect.ImmutableSet<com.google.common.collect.Multiset.Entry<E>>`](./ImmutableSet.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>()`

## Methods

### `toImmutableMultiset()`

**Returns:** `java.util.stream.Collector<E,?,com.google.common.collect.ImmutableMultiset<E>>`

Elements iterate in order by the *first* appearance of that element in
 encounter order.

### `toImmutableMultiset(java.util.function.Function<? super T,? extends E> elementFunction, java.util.function.ToIntFunction<? super T> countFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMultiset<E>>`

If the mapped elements contain duplicates (according to Object#equals), the first
 occurrence in encounter order appears in the resulting multiset, with count equal to the sum of
 the outputs of countFunction.applyAsInt(t) for each t mapped to that element.

**Parameters:**
- `elementFunction` (`java.util.function.Function<? super T,? extends E>`)
- `countFunction` (`java.util.function.ToIntFunction<? super T>`)

### `of()`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

**Performance note:** the instance returned is a singleton.

### `of(E element)`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

**Parameters:**
- `element` (`E`)

### `of(E e1, E e2)`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)

### `of(E e1, E e2, E e3)`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)

### `of(E e1, E e2, E e3, E e4)`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)
- `e4` (`E`)

### `of(E e1, E e2, E e3, E e4, E e5)`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)
- `e4` (`E`)
- `e5` (`E`)

### `of(E e1, E e2, E e3, E e4, E e5, E e6, E[] others)`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)
- `e4` (`E`)
- `e5` (`E`)
- `e6` (`E`)
- `others` (`E[]`)

### `copyOf(E[] elements)`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

**Parameters:**
- `elements` (`E[]`)

### `copyOf(java.lang.Iterable<? extends E> elements)`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

**Parameters:**
- `elements` (`java.lang.Iterable<? extends E>`)

### `copyOf(java.util.Iterator<? extends E> elements)`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

**Parameters:**
- `elements` (`java.util.Iterator<? extends E>`)

### `copyFromElements(E[] elements)`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

**Parameters:**
- `elements` (`E[]`)

### `copyFromEntries(java.util.Collection<? extends com.google.common.collect.Multiset.Entry<? extends E>> entries)`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

**Parameters:**
- `entries` (`java.util.Collection<? extends com.google.common.collect.Multiset.Entry<? extends E>>`)

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<E>`](./UnmodifiableIterator.md)

### `asList()`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `contains(java.lang.Object object)`

**Returns:** `boolean`

**Parameters:**
- `object` (`java.lang.Object`)

### `add(E element, int occurrences)`

**Returns:** `int`

**Parameters:**
- `element` (`E`)
- `occurrences` (`int`)

### `remove(java.lang.Object element, int occurrences)`

**Returns:** `int`

**Parameters:**
- `element` (`java.lang.Object`)
- `occurrences` (`int`)

### `setCount(E element, int count)`

**Returns:** `int`

**Parameters:**
- `element` (`E`)
- `count` (`int`)

### `setCount(E element, int oldCount, int newCount)`

**Returns:** `boolean`

**Parameters:**
- `element` (`E`)
- `oldCount` (`int`)
- `newCount` (`int`)

### `copyIntoArray(java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[] dst, int offset)`

**Returns:** `int`

**Parameters:**
- `dst` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)
- `offset` (`int`)

### `equals(java.lang.Object object)`

**Returns:** `boolean`

**Parameters:**
- `object` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

### `elementSet()`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

### `entrySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<com.google.common.collect.Multiset.Entry<E>>`](./ImmutableSet.md)

### `createEntrySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<com.google.common.collect.Multiset.Entry<E>>`](./ImmutableSet.md)

### `getEntry(int index)`

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

**Parameters:**
- `index` (`int`)

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject(java.io.ObjectInputStream stream)`

**Returns:** `void`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

### `builder()`

**Returns:** `com.google.common.collect.ImmutableMultiset.Builder<E>`

The generated builder is equivalent to the builder created by the Builder constructor.

