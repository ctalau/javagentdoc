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

### `<init>(TreeMultiset.Reference<TreeMultiset.AvlNode<E>> rootReference, GeneralRange<E> range, TreeMultiset.AvlNode<E> endLink)`

**Parameters:**
- `rootReference` (`com.google.common.collect.TreeMultiset.Reference<com.google.common.collect.TreeMultiset.AvlNode<E>>`)
- `range` ([`com.google.common.collect.GeneralRange<E>`](./GeneralRange.md))
- `endLink` (`com.google.common.collect.TreeMultiset.AvlNode<E>`)

### `<init>(Comparator<? super E> comparator)`

**Parameters:**
- `comparator` (`java.util.Comparator<? super E>`)

## Methods

### `create()`

All elements
 inserted into the multiset must implement the Comparable interface. Furthermore, all
 such elements must be *mutually comparable*: e1.compareTo(e2) must not throw a
 ClassCastException for any elements e1 and e2 in the multiset. If the
 user attempts to add an element to the multiset that violates this constraint (for example, the
 user attempts to add a string element to a set whose elements are integers), the 
 add(Object) call will throw a ClassCastException.

 
The type specification is <E extends Comparable>, instead of the more specific
 <E extends Comparable<? super E>>, to support classes defined without generics.

**Returns:** [`com.google.common.collect.TreeMultiset<E>`](./TreeMultiset.md)

### `create(Comparator<? super E> comparator)`

All elements
 inserted into the multiset must be *mutually comparable* by the specified comparator:
 comparator.compare(e1, e2) must not throw a ClassCastException for any elements
 e1 and e2 in the multiset. If the user attempts to add an element to the
 multiset that violates this constraint, the add(Object) call will throw a 
 ClassCastException.

**Parameters:**
- `comparator` (`java.util.Comparator<? super E>`): the comparator that will be used to sort this multiset. A null value
       indicates that the elements' *natural ordering* should be used.

**Returns:** [`com.google.common.collect.TreeMultiset<E>`](./TreeMultiset.md)

### `create(Iterable<? extends E> elements)`

This implementation is highly efficient when elements is itself a Multiset.

 
The type specification is <E extends Comparable>, instead of the more specific
 <E extends Comparable<? super E>>, to support classes defined without generics.

**Parameters:**
- `elements` (`java.lang.Iterable<? extends E>`)

**Returns:** [`com.google.common.collect.TreeMultiset<E>`](./TreeMultiset.md)

### `aggregateForEntries(TreeMultiset.Aggregate aggr)`

**Parameters:**
- `aggr` (`com.google.common.collect.TreeMultiset.Aggregate`)

**Returns:** `long`

### `aggregateBelowRange(TreeMultiset.Aggregate aggr, TreeMultiset.AvlNode<E> node)`

**Parameters:**
- `aggr` (`com.google.common.collect.TreeMultiset.Aggregate`)
- `node` (`com.google.common.collect.TreeMultiset.AvlNode<E>`)

**Returns:** `long`

### `aggregateAboveRange(TreeMultiset.Aggregate aggr, TreeMultiset.AvlNode<E> node)`

**Parameters:**
- `aggr` (`com.google.common.collect.TreeMultiset.Aggregate`)
- `node` (`com.google.common.collect.TreeMultiset.AvlNode<E>`)

**Returns:** `long`

### `size()`

**Returns:** `int`

### `distinctElements()`

**Returns:** `int`

### `distinctElements(TreeMultiset.AvlNode<?> node)`

**Parameters:**
- `node` (`com.google.common.collect.TreeMultiset.AvlNode<?>`)

**Returns:** `int`

### `count(Object element)`

**Parameters:**
- `element` (`java.lang.Object`)

**Returns:** `int`

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

### `clear()`

**Returns:** `void`

### `wrapEntry(TreeMultiset.AvlNode<E> baseEntry)`

**Parameters:**
- `baseEntry` (`com.google.common.collect.TreeMultiset.AvlNode<E>`)

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

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

### `forEachEntry(ObjIntConsumer<? super E> action)`

**Parameters:**
- `action` (`java.util.function.ObjIntConsumer<? super E>`)

**Returns:** `void`

### `iterator()`

**Returns:** `java.util.Iterator<E>`

### `headMultiset(E upperBound, BoundType boundType)`

**Parameters:**
- `upperBound` (`E`)
- `boundType` ([`com.google.common.collect.BoundType`](./BoundType.md))

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

### `tailMultiset(E lowerBound, BoundType boundType)`

**Parameters:**
- `lowerBound` (`E`)
- `boundType` ([`com.google.common.collect.BoundType`](./BoundType.md))

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

### `successor(TreeMultiset.AvlNode<T> a, TreeMultiset.AvlNode<T> b)`

**Parameters:**
- `a` (`com.google.common.collect.TreeMultiset.AvlNode<T>`)
- `b` (`com.google.common.collect.TreeMultiset.AvlNode<T>`)

**Returns:** `void`

### `successor(TreeMultiset.AvlNode<T> a, TreeMultiset.AvlNode<T> b, TreeMultiset.AvlNode<T> c)`

**Parameters:**
- `a` (`com.google.common.collect.TreeMultiset.AvlNode<T>`)
- `b` (`com.google.common.collect.TreeMultiset.AvlNode<T>`)
- `c` (`com.google.common.collect.TreeMultiset.AvlNode<T>`)

**Returns:** `void`

### `writeObject(ObjectOutputStream stream)`

**Parameters:**
- `stream` (`java.io.ObjectOutputStream`)

**Returns:** `void`

### `readObject(ObjectInputStream stream)`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

**Returns:** `void`

