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

Elements iterate in order by the *first* appearance of that element in
 encounter order.

**Returns:** `java.util.stream.Collector<E,?,com.google.common.collect.ImmutableMultiset<E>>`

### `toImmutableMultiset(Function<? super T,? extends E> elementFunction, ToIntFunction<? super T> countFunction)`

If the mapped elements contain duplicates (according to Object#equals), the first
 occurrence in encounter order appears in the resulting multiset, with count equal to the sum of
 the outputs of countFunction.applyAsInt(t) for each t mapped to that element.

**Parameters:**
- `elementFunction` (`java.util.function.Function<? super T,? extends E>`)
- `countFunction` (`java.util.function.ToIntFunction<? super T>`)

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMultiset<E>>`

### `of()`

**Performance note:** the instance returned is a singleton.

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

### `of(E element)`

**Parameters:**
- `element` (`E`)

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

### `of(E e1, E e2)`

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

### `of(E e1, E e2, E e3)`

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

### `of(E e1, E e2, E e3, E e4)`

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)
- `e4` (`E`)

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

### `of(E e1, E e2, E e3, E e4, E e5)`

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)
- `e4` (`E`)
- `e5` (`E`)

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

### `of(E e1, E e2, E e3, E e4, E e5, E e6, E[] others)`

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)
- `e4` (`E`)
- `e5` (`E`)
- `e6` (`E`)
- `others` (`E[]`)

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

### `copyOf(E[] elements)`

**Parameters:**
- `elements` (`E[]`)

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

### `copyOf(Iterable<? extends E> elements)`

**Parameters:**
- `elements` (`java.lang.Iterable<? extends E>`)

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

### `copyOf(Iterator<? extends E> elements)`

**Parameters:**
- `elements` (`java.util.Iterator<? extends E>`)

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

### `copyFromElements(E[] elements)`

**Parameters:**
- `elements` (`E[]`)

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

### `copyFromEntries(Collection<? extends Multiset.Entry<? extends E>> entries)`

**Parameters:**
- `entries` (`java.util.Collection<? extends com.google.common.collect.Multiset.Entry<? extends E>>`)

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<E>`](./UnmodifiableIterator.md)

### `asList()`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `contains(Object object)`

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `add(E element, int occurrences)`

**Parameters:**
- `element` (`E`)
- `occurrences` (`int`)

**Returns:** `int`

### `remove(Object element, int occurrences)`

**Parameters:**
- `element` (`java.lang.Object`)
- `occurrences` (`int`)

**Returns:** `int`

### `setCount(E element, int count)`

**Parameters:**
- `element` (`E`)
- `count` (`int`)

**Returns:** `int`

### `setCount(E element, int oldCount, int newCount)`

**Parameters:**
- `element` (`E`)
- `oldCount` (`int`)
- `newCount` (`int`)

**Returns:** `boolean`

### `copyIntoArray(lang@Nullable Object[] dst, int offset)`

**Parameters:**
- `dst` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)
- `offset` (`int`)

**Returns:** `int`

### `equals(Object object)`

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

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

**Parameters:**
- `index` (`int`)

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject(ObjectInputStream stream)`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

**Returns:** `void`

### `builder()`

The generated builder is equivalent to the builder created by the Builder constructor.

**Returns:** `com.google.common.collect.ImmutableMultiset.Builder<E>`

