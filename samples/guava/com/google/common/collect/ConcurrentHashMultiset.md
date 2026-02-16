# Class: `ConcurrentHashMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ConcurrentHashMultiset`

**Extends:** [`com.google.common.collect.AbstractMultiset<E>`](./AbstractMultiset.md)

**Implements:** `java.io.Serializable`

## Type Parameters

- `E` extends `java.lang.Object`

## Description

A multiset that supports concurrent modifications and that provides atomic versions of most
 `Multiset` operations (exceptions where noted). Null elements are not supported.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/NewCollectionTypesExplained#multiset">`Multiset`</a>.
**Author:** Cliff L. Biffle
**Author:** mike nonemacher
**Since:** 2.0

## Fields

### `countMap`

**Type:** `java.util.concurrent.ConcurrentMap<E,java.util.concurrent.atomic.AtomicInteger>`

The number of occurrences of each element.

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(`java.util.concurrent.ConcurrentMap<E,java.util.concurrent.atomic.AtomicInteger>` countMap)`

## Methods

### `create()`

**Returns:** [`com.google.common.collect.ConcurrentHashMultiset<E>`](./ConcurrentHashMultiset.md)

Creates a new, empty `ConcurrentHashMultiset` using the default initial capacity, load
 factor, and concurrency settings.

### `create(`java.lang.Iterable<? extends E>` elements)`

**Returns:** [`com.google.common.collect.ConcurrentHashMultiset<E>`](./ConcurrentHashMultiset.md)

Creates a new `ConcurrentHashMultiset` containing the specified elements, using the
 default initial capacity, load factor, and concurrency settings.

 <p>This implementation is highly efficient when `elements` is itself a `Multiset`.
@param elements the elements that the multiset should contain

### `create(`java.util.concurrent.ConcurrentMap<E,java.util.concurrent.atomic.AtomicInteger>` countMap)`

**Returns:** [`com.google.common.collect.ConcurrentHashMultiset<E>`](./ConcurrentHashMultiset.md)

Creates a new, empty `ConcurrentHashMultiset` using `countMap` as the internal
 backing map.

 <p>This instance will assume ownership of `countMap`, and other code should not maintain
 references to the map or modify it in any way.

 <p>The returned multiset is serializable if the input map is.
@param countMap backing map for storing the elements in the multiset and their counts. It must
     be empty.
@throws IllegalArgumentException if `countMap` is not empty
**Since:** 20.0

### `count(`java.lang.Object` element)`

**Returns:** `int`

Returns the number of occurrences of `element` in this multiset.
@param element the element to look for
@return the nonnegative number of occurrences of the element

### `size()`

**Returns:** `int`

{@inheritDoc}

 <p>If the data in the multiset is modified by any other threads during this method, it is
 undefined which (if any) of these modifications will be reflected in the result.

### `toArray()`

**Returns:** `java.lang.Object[]`

### `toArray(`T[]` array)`

**Returns:** `T[]`

### `snapshot()`

**Returns:** `java.util.List<E>`

### `add(`E` element, `int` occurrences)`

**Returns:** `int`

Adds a number of occurrences of the specified element to this multiset.
@param element the element to add
@param occurrences the number of occurrences to add
@return the previous count of the element before the operation; possibly zero
@throws IllegalArgumentException if `occurrences` is negative, or if the resulting amount
     would exceed `Integer.MAX_VALUE`

### `remove(`java.lang.Object` element, `int` occurrences)`

**Returns:** `int`

Removes a number of occurrences of the specified element from this multiset. If the multiset
 contains fewer than this number of occurrences to begin with, all occurrences will be removed.
@param element the element whose occurrences should be removed
@param occurrences the number of occurrences of the element to remove
@return the count of the element before the operation; possibly zero
@throws IllegalArgumentException if `occurrences` is negative

### `removeExactly(`java.lang.Object` element, `int` occurrences)`

**Returns:** `boolean`

Removes exactly the specified number of occurrences of `element`, or makes no change if
 this is not possible.

 <p>This method, in contrast to `remove(Object, int)`, has no effect when the element
 count is smaller than `occurrences`.
@param element the element to remove
@param occurrences the number of occurrences of `element` to remove
@return `true` if the removal was possible (including if `occurrences` is zero)
@throws IllegalArgumentException if `occurrences` is negative

### `setCount(`E` element, `int` count)`

**Returns:** `int`

Adds or removes occurrences of `element` such that the `count` of the element
 becomes `count`.
@return the count of `element` in the multiset before this call
@throws IllegalArgumentException if `count` is negative

### `setCount(`E` element, `int` expectedOldCount, `int` newCount)`

**Returns:** `boolean`

Sets the number of occurrences of `element` to `newCount`, but only if the count is
 currently `expectedOldCount`. If `element` does not appear in the multiset exactly
 `expectedOldCount` times, no changes will be made.
@return `true` if the change was successful. This usually indicates that the multiset has
     been modified, but not always: in the case that `expectedOldCount == newCount`, the
     method will return `true` if the condition was met.
@throws IllegalArgumentException if `expectedOldCount` or `newCount` is negative

### `createElementSet()`

**Returns:** `java.util.Set<E>`

### `elementIterator()`

**Returns:** `java.util.Iterator<E>`

### `createEntrySet()`

**Returns:** `java.util.Set<com.google.common.collect.Multiset.Entry<E>>`

**Deprecated:** Internal method, use `entrySet()`.

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

### `writeObject(`java.io.ObjectOutputStream` stream)`

**Returns:** `void`

@serialData the ConcurrentMap of elements and their counts.

### `readObject(`java.io.ObjectInputStream` stream)`

**Returns:** `void`

