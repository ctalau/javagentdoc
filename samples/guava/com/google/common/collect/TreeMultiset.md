# Class: `TreeMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.TreeMultiset`

**Extends:** [`com.google.common.collect.AbstractSortedMultiset<E>`](./AbstractSortedMultiset.md)

**Implements:** [`java.io.Serializable`](../../../../java/io/Serializable.md)

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A multiset which maintains the ordering of its elements, according to either their natural order
 or an explicit {@link Comparator}. In all cases, this implementation uses {@link Comparable#compareTo} or {@link Comparator#compare} instead of {@link Object#equals} to determine
 equivalence of instances.

 <p><b>Warning:</b> The comparison must be <i>consistent with equals</i> as explained by the
 {@link Comparable} class specification. Otherwise, the resulting multiset will violate the {@link java.util.Collection} contract, which is specified in terms of {@link Object#equals}.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/NewCollectionTypesExplained#multiset">{@code Multiset}</a>.
@author Louis Wasserman
@author Jared Levy
@since 2.0

## Fields

### `rootReference`

**Type:** [`com.google.common.collect.TreeMultiset.Reference<com.google.common.collect.TreeMultiset.AvlNode<E>>`](TreeMultiset/Reference>.md)

### `range`

**Type:** [`com.google.common.collect.GeneralRange<E>`](./GeneralRange.md)

### `header`

**Type:** [`com.google.common.collect.TreeMultiset.AvlNode<E>`](TreeMultiset/AvlNode.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>([`com.google.common.collect.TreeMultiset.Reference<com.google.common.collect.TreeMultiset.AvlNode<E>>`](TreeMultiset/Reference>.md) rootReference, [`com.google.common.collect.GeneralRange<E>`](./GeneralRange.md) range, [`com.google.common.collect.TreeMultiset.AvlNode<E>`](TreeMultiset/AvlNode.md) endLink)`

### `<init>([`java.util.Comparator<? super E>`](../../../../java/util/Comparator.md) comparator)`

## Methods

### `create()`

**Returns:** [`com.google.common.collect.TreeMultiset<E>`](./TreeMultiset.md)

Creates a new, empty multiset, sorted according to the elements' natural order. All elements
 inserted into the multiset must implement the {@code Comparable} interface. Furthermore, all
 such elements must be <i>mutually comparable</i>: {@code e1.compareTo(e2)} must not throw a
 {@code ClassCastException} for any elements {@code e1} and {@code e2} in the multiset. If the
 user attempts to add an element to the multiset that violates this constraint (for example, the
 user attempts to add a string element to a set whose elements are integers), the {@code
 add(Object)} call will throw a {@code ClassCastException}.

 <p>The type specification is {@code <E extends Comparable>}, instead of the more specific
 {@code <E extends Comparable<? super E>>}, to support classes defined without generics.

### `create([`java.util.Comparator<? super E>`](../../../../java/util/Comparator.md) comparator)`

**Returns:** [`com.google.common.collect.TreeMultiset<E>`](./TreeMultiset.md)

Creates a new, empty multiset, sorted according to the specified comparator. All elements
 inserted into the multiset must be <i>mutually comparable</i> by the specified comparator:
 {@code comparator.compare(e1, e2)} must not throw a {@code ClassCastException} for any elements
 {@code e1} and {@code e2} in the multiset. If the user attempts to add an element to the
 multiset that violates this constraint, the {@code add(Object)} call will throw a {@code
 ClassCastException}.
@param comparator the comparator that will be used to sort this multiset. A null value
     indicates that the elements' <i>natural ordering</i> should be used.

### `create(`java.lang.Iterable<? extends E>` elements)`

**Returns:** [`com.google.common.collect.TreeMultiset<E>`](./TreeMultiset.md)

Creates an empty multiset containing the given initial elements, sorted according to the
 elements' natural order.

 <p>This implementation is highly efficient when {@code elements} is itself a {@link Multiset}.

 <p>The type specification is {@code <E extends Comparable>}, instead of the more specific
 {@code <E extends Comparable<? super E>>}, to support classes defined without generics.

### `aggregateForEntries([`com.google.common.collect.TreeMultiset.Aggregate`](TreeMultiset/Aggregate.md) aggr)`

**Returns:** `long`

### `aggregateBelowRange([`com.google.common.collect.TreeMultiset.Aggregate`](TreeMultiset/Aggregate.md) aggr, [`com.google.common.collect.TreeMultiset.AvlNode<E>`](TreeMultiset/AvlNode.md) node)`

**Returns:** `long`

### `aggregateAboveRange([`com.google.common.collect.TreeMultiset.Aggregate`](TreeMultiset/Aggregate.md) aggr, [`com.google.common.collect.TreeMultiset.AvlNode<E>`](TreeMultiset/AvlNode.md) node)`

**Returns:** `long`

### `size()`

**Returns:** `int`

### `distinctElements()`

**Returns:** `int`

### `distinctElements([`com.google.common.collect.TreeMultiset.AvlNode<?>`](TreeMultiset/AvlNode.md) node)`

**Returns:** `int`

### `count(`java.lang.Object` element)`

**Returns:** `int`

### `add([`E`](E.md) element, `int` occurrences)`

**Returns:** `int`

### `remove(`java.lang.Object` element, `int` occurrences)`

**Returns:** `int`

### `setCount([`E`](E.md) element, `int` count)`

**Returns:** `int`

### `setCount([`E`](E.md) element, `int` oldCount, `int` newCount)`

**Returns:** `boolean`

### `clear()`

**Returns:** `void`

### `wrapEntry([`com.google.common.collect.TreeMultiset.AvlNode<E>`](TreeMultiset/AvlNode.md) baseEntry)`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

### `firstNode()`

**Returns:** [`com.google.common.collect.TreeMultiset.AvlNode<E>`](TreeMultiset/AvlNode.md)

Returns the first node in the tree that is in range.

### `lastNode()`

**Returns:** [`com.google.common.collect.TreeMultiset.AvlNode<E>`](TreeMultiset/AvlNode.md)

### `elementIterator()`

**Returns:** [`java.util.Iterator<E>`](../../../../java/util/Iterator.md)

### `entryIterator()`

**Returns:** [`java.util.Iterator<com.google.common.collect.Multiset.Entry<E>>`](../../../../java/util/Iterator>.md)

### `descendingEntryIterator()`

**Returns:** [`java.util.Iterator<com.google.common.collect.Multiset.Entry<E>>`](../../../../java/util/Iterator>.md)

### `forEachEntry([`java.util.function.ObjIntConsumer<? super E>`](../../../../java/util/function/ObjIntConsumer.md) action)`

**Returns:** `void`

### `iterator()`

**Returns:** [`java.util.Iterator<E>`](../../../../java/util/Iterator.md)

### `headMultiset([`E`](E.md) upperBound, [`com.google.common.collect.BoundType`](./BoundType.md) boundType)`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

### `tailMultiset([`E`](E.md) lowerBound, [`com.google.common.collect.BoundType`](./BoundType.md) boundType)`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

### `successor([`com.google.common.collect.TreeMultiset.AvlNode<T>`](TreeMultiset/AvlNode.md) a, [`com.google.common.collect.TreeMultiset.AvlNode<T>`](TreeMultiset/AvlNode.md) b)`

**Returns:** `void`

### `successor([`com.google.common.collect.TreeMultiset.AvlNode<T>`](TreeMultiset/AvlNode.md) a, [`com.google.common.collect.TreeMultiset.AvlNode<T>`](TreeMultiset/AvlNode.md) b, [`com.google.common.collect.TreeMultiset.AvlNode<T>`](TreeMultiset/AvlNode.md) c)`

**Returns:** `void`

### `writeObject([`java.io.ObjectOutputStream`](../../../../java/io/ObjectOutputStream.md) stream)`

**Returns:** `void`

@serialData the comparator, the number of distinct elements, the first element, its count, the
     second element, its count, and so on

### `readObject([`java.io.ObjectInputStream`](../../../../java/io/ObjectInputStream.md) stream)`

**Returns:** `void`

