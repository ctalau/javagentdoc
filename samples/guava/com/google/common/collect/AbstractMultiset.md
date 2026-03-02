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

### `contains(java.lang.Object element)`

**Returns:** `boolean`

**Parameters:**
- `element` (`java.lang.Object`)

### `add(E element)`

**Returns:** `boolean`

**Parameters:**
- `element` (`E`)

### `add(E element, int occurrences)`

**Returns:** `int`

**Parameters:**
- `element` (`E`)
- `occurrences` (`int`)

### `remove(java.lang.Object element)`

**Returns:** `boolean`

**Parameters:**
- `element` (`java.lang.Object`)

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

### `addAll(java.util.Collection<? extends E> elementsToAdd)`

**Returns:** `boolean`

This implementation is highly efficient when elementsToAdd is itself a Multiset.

**Parameters:**
- `elementsToAdd` (`java.util.Collection<? extends E>`)

### `removeAll(java.util.Collection<?> elementsToRemove)`

**Returns:** `boolean`

**Parameters:**
- `elementsToRemove` (`java.util.Collection<?>`)

### `retainAll(java.util.Collection<?> elementsToRetain)`

**Returns:** `boolean`

**Parameters:**
- `elementsToRetain` (`java.util.Collection<?>`)

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

### `equals(java.lang.Object object)`

**Returns:** `boolean`

This implementation returns true if object is a multiset of the same size
 and if, for each element, the two multisets have the same count.

**Parameters:**
- `object` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

This implementation returns the hash code of Multiset#entrySet().

### `toString()`

**Returns:** `java.lang.String`

This implementation returns the result of invoking toString on Multiset#entrySet().

