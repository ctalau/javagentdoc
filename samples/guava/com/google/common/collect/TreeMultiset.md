# Class: `TreeMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.TreeMultiset`

**Extends:** [`com.google.common.collect.AbstractSortedMultiset<E>`](./AbstractSortedMultiset.md)

**Implements:** `java.io.Serializable`

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

In all cases, this implementation uses Comparable#compareTo or Comparator#compare instead of Object#equals to determine
 equivalence of instances.

 
**Warning:** The comparison must be *consistent with equals* as explained by the
 Comparable class specification. Otherwise, the resulting multiset will violate the java.util.Collection contract, which is specified in terms of Object#equals.

 
See the Guava User Guide article on [Multiset](https://github.com/google/guava/wiki/NewCollectionTypesExplained#multiset).

## Fields

### `rootReference`

**Type:** `com.google.common.collect.TreeMultiset.Reference<com.google.common.collect.TreeMultiset.AvlNode<E>>`

### `range`

**Type:** [`com.google.common.collect.GeneralRange<E>`](./GeneralRange.md)

### `header`

**Type:** `com.google.common.collect.TreeMultiset.AvlNode<E>`

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(com.google.common.collect.TreeMultiset.Reference<com.google.common.collect.TreeMultiset.AvlNode<E>> rootReference, com.google.common.collect.GeneralRange<E> range, com.google.common.collect.TreeMultiset.AvlNode<E> endLink)`

**Parameters:**
- `rootReference` (`com.google.common.collect.TreeMultiset.Reference<com.google.common.collect.TreeMultiset.AvlNode<E>>`)
- `range` ([`com.google.common.collect.GeneralRange<E>`](./GeneralRange.md))
- `endLink` (`com.google.common.collect.TreeMultiset.AvlNode<E>`)

### `<init>(java.util.Comparator<? super E> comparator)`

**Parameters:**
- `comparator` (`java.util.Comparator<? super E>`)

## Methods

### `create()`

**Returns:** [`com.google.common.collect.TreeMultiset<E>`](./TreeMultiset.md)

All elements
 inserted into the multiset must implement the Comparable interface. Furthermore, all
 such elements must be *mutually comparable*: e1.compareTo(e2) must not throw a
 ClassCastException for any elements e1 and e2 in the multiset. If the
 user attempts to add an element to the multiset that violates this constraint (for example, the
 user attempts to add a string element to a set whose elements are integers), the 
 add(Object) call will throw a ClassCastException.

 
The type specification is <E extends Comparable>, instead of the more specific
 <E extends Comparable<? super E>>, to support classes defined without generics.

### `create(java.util.Comparator<? super E> comparator)`

**Returns:** [`com.google.common.collect.TreeMultiset<E>`](./TreeMultiset.md)

All elements
 inserted into the multiset must be *mutually comparable* by the specified comparator:
 comparator.compare(e1, e2) must not throw a ClassCastException for any elements
 e1 and e2 in the multiset. If the user attempts to add an element to the
 multiset that violates this constraint, the add(Object) call will throw a 
 ClassCastException.

**Parameters:**
- `comparator` (`java.util.Comparator<? super E>`): the comparator that will be used to sort this multiset. A null value
     indicates that the elements' *natural ordering* should be used.

### `create(java.lang.Iterable<? extends E> elements)`

**Returns:** [`com.google.common.collect.TreeMultiset<E>`](./TreeMultiset.md)

This implementation is highly efficient when elements is itself a Multiset.

 
The type specification is <E extends Comparable>, instead of the more specific
 <E extends Comparable<? super E>>, to support classes defined without generics.

**Parameters:**
- `elements` (`java.lang.Iterable<? extends E>`)

### `aggregateForEntries(com.google.common.collect.TreeMultiset.Aggregate aggr)`

**Returns:** `long`

**Parameters:**
- `aggr` (`com.google.common.collect.TreeMultiset.Aggregate`)

### `aggregateBelowRange(com.google.common.collect.TreeMultiset.Aggregate aggr, com.google.common.collect.TreeMultiset.AvlNode<E> node)`

**Returns:** `long`

**Parameters:**
- `aggr` (`com.google.common.collect.TreeMultiset.Aggregate`)
- `node` (`com.google.common.collect.TreeMultiset.AvlNode<E>`)

### `aggregateAboveRange(com.google.common.collect.TreeMultiset.Aggregate aggr, com.google.common.collect.TreeMultiset.AvlNode<E> node)`

**Returns:** `long`

**Parameters:**
- `aggr` (`com.google.common.collect.TreeMultiset.Aggregate`)
- `node` (`com.google.common.collect.TreeMultiset.AvlNode<E>`)

### `size()`

**Returns:** `int`

### `distinctElements()`

**Returns:** `int`

### `distinctElements(com.google.common.collect.TreeMultiset.AvlNode<?> node)`

**Returns:** `int`

**Parameters:**
- `node` (`com.google.common.collect.TreeMultiset.AvlNode<?>`)

### `count(java.lang.Object element)`

**Returns:** `int`

**Parameters:**
- `element` (`java.lang.Object`)

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

### `clear()`

**Returns:** `void`

### `wrapEntry(com.google.common.collect.TreeMultiset.AvlNode<E> baseEntry)`

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

**Parameters:**
- `baseEntry` (`com.google.common.collect.TreeMultiset.AvlNode<E>`)

### `firstNode()`

**Returns:** `com.google.common.collect.TreeMultiset.AvlNode<E>`

### `lastNode()`

**Returns:** `com.google.common.collect.TreeMultiset.AvlNode<E>`

### `elementIterator()`

**Returns:** `java.util.Iterator<E>`

### `entryIterator()`

**Returns:** `java.util.Iterator<com.google.common.collect.Multiset.Entry<E>>`

### `descendingEntryIterator()`

**Returns:** `java.util.Iterator<com.google.common.collect.Multiset.Entry<E>>`

### `forEachEntry(java.util.function.ObjIntConsumer<? super E> action)`

**Returns:** `void`

**Parameters:**
- `action` (`java.util.function.ObjIntConsumer<? super E>`)

### `iterator()`

**Returns:** `java.util.Iterator<E>`

### `headMultiset(E upperBound, com.google.common.collect.BoundType boundType)`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

**Parameters:**
- `upperBound` (`E`)
- `boundType` ([`com.google.common.collect.BoundType`](./BoundType.md))

### `tailMultiset(E lowerBound, com.google.common.collect.BoundType boundType)`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

**Parameters:**
- `lowerBound` (`E`)
- `boundType` ([`com.google.common.collect.BoundType`](./BoundType.md))

### `successor(com.google.common.collect.TreeMultiset.AvlNode<T> a, com.google.common.collect.TreeMultiset.AvlNode<T> b)`

**Returns:** `void`

**Parameters:**
- `a` (`com.google.common.collect.TreeMultiset.AvlNode<T>`)
- `b` (`com.google.common.collect.TreeMultiset.AvlNode<T>`)

### `successor(com.google.common.collect.TreeMultiset.AvlNode<T> a, com.google.common.collect.TreeMultiset.AvlNode<T> b, com.google.common.collect.TreeMultiset.AvlNode<T> c)`

**Returns:** `void`

**Parameters:**
- `a` (`com.google.common.collect.TreeMultiset.AvlNode<T>`)
- `b` (`com.google.common.collect.TreeMultiset.AvlNode<T>`)
- `c` (`com.google.common.collect.TreeMultiset.AvlNode<T>`)

### `writeObject(java.io.ObjectOutputStream stream)`

**Returns:** `void`

**Parameters:**
- `stream` (`java.io.ObjectOutputStream`)

### `readObject(java.io.ObjectInputStream stream)`

**Returns:** `void`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

