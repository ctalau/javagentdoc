# Class: `AbstractMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.AbstractMultiset`

**Extends:** [`java.util.AbstractCollection<E>`](../../../../java/util/AbstractCollection.md)

**Implements:** [`com.google.common.collect.Multiset<E>`](./Multiset.md)

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

This class provides a skeletal implementation of the {@link Multiset} interface. A new multiset
 implementation can be created easily by extending this class and implementing the {@link Multiset#entrySet()} method, plus optionally overriding {@link #add(Object, int)} and {@link #remove(Object, int)} to enable modifications to the multiset.

 <p>The {@link #count} and {@link #size} implementations all iterate across the set returned by
 {@link Multiset#entrySet()}, as do many methods acting on the set returned by {@link #elementSet()}. Override those methods for better performance.
@author Kevin Bourrillion
@author Louis Wasserman

## Fields

### `elementSet`

**Type:** [`java.util.Set<E>`](../../../../java/util/Set.md)

### `entrySet`

**Type:** [`java.util.Set<com.google.common.collect.Multiset.Entry<E>>`](../../../../java/util/Set>.md)

## Constructors

### `<init>()`

## Methods

### `isEmpty()`

**Returns:** `boolean`

### `contains(`java.lang.Object` element)`

**Returns:** `boolean`

### `add([`E`](E.md) element)`

**Returns:** `boolean`

### `add([`E`](E.md) element, `int` occurrences)`

**Returns:** `int`

### `remove(`java.lang.Object` element)`

**Returns:** `boolean`

### `remove(`java.lang.Object` element, `int` occurrences)`

**Returns:** `int`

### `setCount([`E`](E.md) element, `int` count)`

**Returns:** `int`

### `setCount([`E`](E.md) element, `int` oldCount, `int` newCount)`

**Returns:** `boolean`

### `addAll([`java.util.Collection<? extends E>`](../../../../java/util/Collection.md) elementsToAdd)`

**Returns:** `boolean`

{@inheritDoc}

 <p>This implementation is highly efficient when {@code elementsToAdd} is itself a {@link Multiset}.

### `removeAll([`java.util.Collection<?>`](../../../../java/util/Collection.md) elementsToRemove)`

**Returns:** `boolean`

### `retainAll([`java.util.Collection<?>`](../../../../java/util/Collection.md) elementsToRetain)`

**Returns:** `boolean`

### `clear()`

**Returns:** `void`

### `elementSet()`

**Returns:** [`java.util.Set<E>`](../../../../java/util/Set.md)

### `createElementSet()`

**Returns:** [`java.util.Set<E>`](../../../../java/util/Set.md)

Creates a new instance of this multiset's element set, which will be returned by {@link #elementSet()}.

### `elementIterator()`

**Returns:** [`java.util.Iterator<E>`](../../../../java/util/Iterator.md)

### `entrySet()`

**Returns:** [`java.util.Set<com.google.common.collect.Multiset.Entry<E>>`](../../../../java/util/Set>.md)

### `createEntrySet()`

**Returns:** [`java.util.Set<com.google.common.collect.Multiset.Entry<E>>`](../../../../java/util/Set>.md)

### `entryIterator()`

**Returns:** [`java.util.Iterator<com.google.common.collect.Multiset.Entry<E>>`](../../../../java/util/Iterator>.md)

### `distinctElements()`

**Returns:** `int`

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

{@inheritDoc}

 <p>This implementation returns {@code true} if {@code object} is a multiset of the same size
 and if, for each element, the two multisets have the same count.

### `hashCode()`

**Returns:** `int`

{@inheritDoc}

 <p>This implementation returns the hash code of {@link Multiset#entrySet()}.

### `toString()`

**Returns:** `java.lang.String`

{@inheritDoc}

 <p>This implementation returns the result of invoking {@code toString} on {@link Multiset#entrySet()}.

