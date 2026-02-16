# Class: `AbstractMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.AbstractMultiset`

**Extends:** `java.util.AbstractCollection<E>`

**Implements:** [`com.google.common.collect.Multiset<E>`](./Multiset.md)

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

This class provides a skeletal implementation of the `Multiset` interface. A new multiset
 implementation can be created easily by extending this class and implementing the `Multiset.entrySet()` method, plus optionally overriding `add(Object, int)` and `remove(Object, int)` to enable modifications to the multiset.

 <p>The `count` and `size` implementations all iterate across the set returned by
 `Multiset.entrySet()`, as do many methods acting on the set returned by `elementSet()`. Override those methods for better performance.
**Author:** Kevin Bourrillion
**Author:** Louis Wasserman

## Fields

### `elementSet`

**Type:** `java.util.Set<E>`

### `entrySet`

**Type:** `java.util.Set<com.google.common.collect.Multiset.Entry<E>>`

## Constructors

### `<init>()`

## Methods

### `isEmpty()`

**Returns:** `boolean`

### `contains(`java.lang.Object` element)`

**Returns:** `boolean`

### `add(`E` element)`

**Returns:** `boolean`

### `add(`E` element, `int` occurrences)`

**Returns:** `int`

### `remove(`java.lang.Object` element)`

**Returns:** `boolean`

### `remove(`java.lang.Object` element, `int` occurrences)`

**Returns:** `int`

### `setCount(`E` element, `int` count)`

**Returns:** `int`

### `setCount(`E` element, `int` oldCount, `int` newCount)`

**Returns:** `boolean`

### `addAll(`java.util.Collection<? extends E>` elementsToAdd)`

**Returns:** `boolean`

{@inheritDoc}

 <p>This implementation is highly efficient when `elementsToAdd` is itself a `Multiset`.

### `removeAll(`java.util.Collection<?>` elementsToRemove)`

**Returns:** `boolean`

### `retainAll(`java.util.Collection<?>` elementsToRetain)`

**Returns:** `boolean`

### `clear()`

**Returns:** `void`

### `elementSet()`

**Returns:** `java.util.Set<E>`

### `createElementSet()`

**Returns:** `java.util.Set<E>`

Creates a new instance of this multiset's element set, which will be returned by `elementSet()`.

### `elementIterator()`

**Returns:** `java.util.Iterator<E>`

### `entrySet()`

**Returns:** `java.util.Set<com.google.common.collect.Multiset.Entry<E>>`

### `createEntrySet()`

**Returns:** `java.util.Set<com.google.common.collect.Multiset.Entry<E>>`

### `entryIterator()`

**Returns:** `java.util.Iterator<com.google.common.collect.Multiset.Entry<E>>`

### `distinctElements()`

**Returns:** `int`

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

{@inheritDoc}

 <p>This implementation returns `true` if `object` is a multiset of the same size
 and if, for each element, the two multisets have the same count.

### `hashCode()`

**Returns:** `int`

{@inheritDoc}

 <p>This implementation returns the hash code of `Multiset.entrySet()`.

### `toString()`

**Returns:** `java.lang.String`

{@inheritDoc}

 <p>This implementation returns the result of invoking `toString` on `Multiset.entrySet()`.

