# Class: `ConcurrentHashMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ConcurrentHashMultiset`

**Extends:** [`com.google.common.collect.AbstractMultiset<E>`](./AbstractMultiset.md)

**Implements:** [`java.io.Serializable`](../../../../java/io/Serializable.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

A multiset that supports concurrent modifications and that provides atomic versions of most
 {@code Multiset} operations (exceptions where noted). Null elements are not supported.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/NewCollectionTypesExplained#multiset">{@code Multiset}</a>.
@author Cliff L. Biffle
@author mike nonemacher
@since 2.0

## Fields

### `countMap`

**Type:** [`java.util.concurrent.ConcurrentMap<E,java.util.concurrent.atomic.AtomicInteger>`](../../../../java/util/concurrent/ConcurrentMap.md)

The number of occurrences of each element.

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>([`java.util.concurrent.ConcurrentMap<E,java.util.concurrent.atomic.AtomicInteger>`](../../../../java/util/concurrent/ConcurrentMap.md) countMap)`

## Methods

### `create()`

**Returns:** [`com.google.common.collect.ConcurrentHashMultiset<E>`](./ConcurrentHashMultiset.md)

Creates a new, empty {@code ConcurrentHashMultiset} using the default initial capacity, load
 factor, and concurrency settings.

### `create(`java.lang.Iterable<? extends E>` elements)`

**Returns:** [`com.google.common.collect.ConcurrentHashMultiset<E>`](./ConcurrentHashMultiset.md)

Creates a new {@code ConcurrentHashMultiset} containing the specified elements, using the
 default initial capacity, load factor, and concurrency settings.

 <p>This implementation is highly efficient when {@code elements} is itself a {@link Multiset}.
@param elements the elements that the multiset should contain

### `create([`java.util.concurrent.ConcurrentMap<E,java.util.concurrent.atomic.AtomicInteger>`](../../../../java/util/concurrent/ConcurrentMap.md) countMap)`

**Returns:** [`com.google.common.collect.ConcurrentHashMultiset<E>`](./ConcurrentHashMultiset.md)

Creates a new, empty {@code ConcurrentHashMultiset} using {@code countMap} as the internal
 backing map.

 <p>This instance will assume ownership of {@code countMap}, and other code should not maintain
 references to the map or modify it in any way.

 <p>The returned multiset is serializable if the input map is.
@param countMap backing map for storing the elements in the multiset and their counts. It must
     be empty.
@throws IllegalArgumentException if {@code countMap} is not empty
@since 20.0

### `count(`java.lang.Object` element)`

**Returns:** `int`

Returns the number of occurrences of {@code element} in this multiset.
@param element the element to look for
@return the nonnegative number of occurrences of the element

### `size()`

**Returns:** `int`

{@inheritDoc}

 <p>If the data in the multiset is modified by any other threads during this method, it is
 undefined which (if any) of these modifications will be reflected in the result.

### `toArray()`

**Returns:** `java.lang.Object[]`

### `toArray([`T[]`](T.md) array)`

**Returns:** [`T[]`](T.md)

### `snapshot()`

**Returns:** [`java.util.List<E>`](../../../../java/util/List.md)

### `add([`E`](E.md) element, `int` occurrences)`

**Returns:** `int`

Adds a number of occurrences of the specified element to this multiset.
@param element the element to add
@param occurrences the number of occurrences to add
@return the previous count of the element before the operation; possibly zero
@throws IllegalArgumentException if {@code occurrences} is negative, or if the resulting amount
     would exceed {@link Integer#MAX_VALUE}

### `remove(`java.lang.Object` element, `int` occurrences)`

**Returns:** `int`

Removes a number of occurrences of the specified element from this multiset. If the multiset
 contains fewer than this number of occurrences to begin with, all occurrences will be removed.
@param element the element whose occurrences should be removed
@param occurrences the number of occurrences of the element to remove
@return the count of the element before the operation; possibly zero
@throws IllegalArgumentException if {@code occurrences} is negative

### `removeExactly(`java.lang.Object` element, `int` occurrences)`

**Returns:** `boolean`

Removes exactly the specified number of occurrences of {@code element}, or makes no change if
 this is not possible.

 <p>This method, in contrast to {@link #remove(Object, int)}, has no effect when the element
 count is smaller than {@code occurrences}.
@param element the element to remove
@param occurrences the number of occurrences of {@code element} to remove
@return {@code true} if the removal was possible (including if {@code occurrences} is zero)
@throws IllegalArgumentException if {@code occurrences} is negative

### `setCount([`E`](E.md) element, `int` count)`

**Returns:** `int`

Adds or removes occurrences of {@code element} such that the {@link #count} of the element
 becomes {@code count}.
@return the count of {@code element} in the multiset before this call
@throws IllegalArgumentException if {@code count} is negative

### `setCount([`E`](E.md) element, `int` expectedOldCount, `int` newCount)`

**Returns:** `boolean`

Sets the number of occurrences of {@code element} to {@code newCount}, but only if the count is
 currently {@code expectedOldCount}. If {@code element} does not appear in the multiset exactly
 {@code expectedOldCount} times, no changes will be made.
@return {@code true} if the change was successful. This usually indicates that the multiset has
     been modified, but not always: in the case that {@code expectedOldCount == newCount}, the
     method will return {@code true} if the condition was met.
@throws IllegalArgumentException if {@code expectedOldCount} or {@code newCount} is negative

### `createElementSet()`

**Returns:** [`java.util.Set<E>`](../../../../java/util/Set.md)

### `elementIterator()`

**Returns:** [`java.util.Iterator<E>`](../../../../java/util/Iterator.md)

### `createEntrySet()`

**Returns:** [`java.util.Set<com.google.common.collect.Multiset.Entry<E>>`](../../../../java/util/Set>.md)

@deprecated Internal method, use {@link #entrySet()}.

### `distinctElements()`

**Returns:** `int`

### `isEmpty()`

**Returns:** `boolean`

### `entryIterator()`

**Returns:** [`java.util.Iterator<com.google.common.collect.Multiset.Entry<E>>`](../../../../java/util/Iterator>.md)

### `iterator()`

**Returns:** [`java.util.Iterator<E>`](../../../../java/util/Iterator.md)

### `clear()`

**Returns:** `void`

### `writeObject([`java.io.ObjectOutputStream`](../../../../java/io/ObjectOutputStream.md) stream)`

**Returns:** `void`

@serialData the ConcurrentMap of elements and their counts.

### `readObject([`java.io.ObjectInputStream`](../../../../java/io/ObjectInputStream.md) stream)`

**Returns:** `void`

