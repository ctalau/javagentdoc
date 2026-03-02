# Class: `ConcurrentHashMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ConcurrentHashMultiset`

**Extends:** [`com.google.common.collect.AbstractMultiset<E>`](./AbstractMultiset.md)

**Implements:** `java.io.Serializable`

## Type Parameters

- `E` extends `java.lang.Object`

## Description

Null elements are not supported.

 
See the Guava User Guide article on [Multiset](https://github.com/google/guava/wiki/NewCollectionTypesExplained#multiset).

## Fields

### `countMap`

**Type:** `java.util.concurrent.ConcurrentMap<E,java.util.concurrent.atomic.AtomicInteger>`

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(java.util.concurrent.ConcurrentMap<E,java.util.concurrent.atomic.AtomicInteger> countMap)`

**Parameters:**
- `countMap` (`java.util.concurrent.ConcurrentMap<E,java.util.concurrent.atomic.AtomicInteger>`)

## Methods

### `create()`

**Returns:** [`com.google.common.collect.ConcurrentHashMultiset<E>`](./ConcurrentHashMultiset.md)

### `create(java.lang.Iterable<? extends E> elements)`

**Returns:** [`com.google.common.collect.ConcurrentHashMultiset<E>`](./ConcurrentHashMultiset.md)

This implementation is highly efficient when elements is itself a Multiset.

**Parameters:**
- `elements` (`java.lang.Iterable<? extends E>`): the elements that the multiset should contain

### `create(java.util.concurrent.ConcurrentMap<E,java.util.concurrent.atomic.AtomicInteger> countMap)`

**Returns:** [`com.google.common.collect.ConcurrentHashMultiset<E>`](./ConcurrentHashMultiset.md)

This instance will assume ownership of countMap, and other code should not maintain
 references to the map or modify it in any way.

 
The returned multiset is serializable if the input map is.

**Parameters:**
- `countMap` (`java.util.concurrent.ConcurrentMap<E,java.util.concurrent.atomic.AtomicInteger>`): backing map for storing the elements in the multiset and their counts. It must
     be empty.

### `count(java.lang.Object element)`

**Returns:** `int`

**Parameters:**
- `element` (`java.lang.Object`): the element to look for

### `size()`

**Returns:** `int`

If the data in the multiset is modified by any other threads during this method, it is
 undefined which (if any) of these modifications will be reflected in the result.

### `toArray()`

**Returns:** `java.lang.Object[]`

### `toArray(T[] array)`

**Returns:** `T[]`

**Parameters:**
- `array` (`T[]`)

### `snapshot()`

**Returns:** `java.util.List<E>`

### `add(E element, int occurrences)`

**Returns:** `int`

**Parameters:**
- `element` (`E`): the element to add
- `occurrences` (`int`): the number of occurrences to add

### `remove(java.lang.Object element, int occurrences)`

**Returns:** `int`

If the multiset
 contains fewer than this number of occurrences to begin with, all occurrences will be removed.

**Parameters:**
- `element` (`java.lang.Object`): the element whose occurrences should be removed
- `occurrences` (`int`): the number of occurrences of the element to remove

### `removeExactly(java.lang.Object element, int occurrences)`

**Returns:** `boolean`

This method, in contrast to #remove(Object, int), has no effect when the element
 count is smaller than occurrences.

**Parameters:**
- `element` (`java.lang.Object`): the element to remove
- `occurrences` (`int`): the number of occurrences of element to remove

### `setCount(E element, int count)`

**Returns:** `int`

**Parameters:**
- `element` (`E`)
- `count` (`int`)

### `setCount(E element, int expectedOldCount, int newCount)`

**Returns:** `boolean`

If element does not appear in the multiset exactly
 expectedOldCount times, no changes will be made.

**Parameters:**
- `element` (`E`)
- `expectedOldCount` (`int`)
- `newCount` (`int`)

### `createElementSet()`

**Returns:** `java.util.Set<E>`

### `elementIterator()`

**Returns:** `java.util.Iterator<E>`

### `createEntrySet()`

**Returns:** `java.util.Set<com.google.common.collect.Multiset.Entry<E>>`

### `distinctElements()`

**Returns:** `int`

### `isEmpty()`

**Returns:** `boolean`

### `entryIterator()`

**Returns:** `java.util.Iterator<com.google.common.collect.Multiset.Entry<E>>`

### `iterator()`

**Returns:** `java.util.Iterator<E>`

### `clear()`

**Returns:** `void`

### `writeObject(java.io.ObjectOutputStream stream)`

**Returns:** `void`

**Parameters:**
- `stream` (`java.io.ObjectOutputStream`)

### `readObject(java.io.ObjectInputStream stream)`

**Returns:** `void`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

