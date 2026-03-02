# Class: `AbstractMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.AbstractMultiset`

**Extends:** `java.util.AbstractCollection<E>`

**Implements:** [`com.google.common.collect.Multiset<E>`](./Multiset.md)

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A new multiset
 implementation can be created easily by extending this class and implementing the Multiset#entrySet() method, plus optionally overriding #add(Object, int) and #remove(Object, int) to enable modifications to the multiset.

 
The #count and #size implementations all iterate across the set returned by
 Multiset#entrySet(), as do many methods acting on the set returned by #elementSet(). Override those methods for better performance.

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

### `contains(Object element)`

**Parameters:**
- `element` (`java.lang.Object`)

**Returns:** `boolean`

### `add(E element)`

**Parameters:**
- `element` (`E`)

**Returns:** `boolean`

### `add(E element, int occurrences)`

**Parameters:**
- `element` (`E`)
- `occurrences` (`int`)

**Returns:** `int`

### `remove(Object element)`

**Parameters:**
- `element` (`java.lang.Object`)

**Returns:** `boolean`

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

### `addAll(Collection<? extends E> elementsToAdd)`

This implementation is highly efficient when elementsToAdd is itself a Multiset.

**Parameters:**
- `elementsToAdd` (`java.util.Collection<? extends E>`)

**Returns:** `boolean`

### `removeAll(Collection<?> elementsToRemove)`

**Parameters:**
- `elementsToRemove` (`java.util.Collection<?>`)

**Returns:** `boolean`

### `retainAll(Collection<?> elementsToRetain)`

**Parameters:**
- `elementsToRetain` (`java.util.Collection<?>`)

**Returns:** `boolean`

### `clear()`

**Returns:** `void`

### `elementSet()`

**Returns:** `java.util.Set<E>`

### `createElementSet()`

**Returns:** `java.util.Set<E>`

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

### `equals(Object object)`

This implementation returns true if object is a multiset of the same size
 and if, for each element, the two multisets have the same count.

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

This implementation returns the hash code of Multiset#entrySet().

**Returns:** `int`

### `toString()`

This implementation returns the result of invoking toString on Multiset#entrySet().

**Returns:** `java.lang.String`

