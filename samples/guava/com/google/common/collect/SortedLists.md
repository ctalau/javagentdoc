# Class: `SortedLists`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.SortedLists`

## Description

Static methods pertaining to sorted {@link List} instances.

 <p>In this documentation, the terms <i>greatest</i>, <i>greater</i>, <i>least</i>, and
 <i>lesser</i> are considered to refer to the comparator on the elements, and the terms
 <i>first</i> and <i>last</i> are considered to refer to the elements' ordering in a list.
@author Louis Wasserman

## Constructors

### `<init>()`

## Methods

### `binarySearch([`java.util.List<? extends E>`](../../../../java/util/List.md) list, [`E`](E.md) e, [`com.google.common.collect.SortedLists.KeyPresentBehavior`](SortedLists/KeyPresentBehavior.md) presentBehavior, [`com.google.common.collect.SortedLists.KeyAbsentBehavior`](SortedLists/KeyAbsentBehavior.md) absentBehavior)`

**Returns:** `int`

Searches the specified naturally ordered list for the specified object using the binary search
 algorithm.

 <p>Equivalent to {@link #binarySearch(List, Function, Object, Comparator, KeyPresentBehavior,
 KeyAbsentBehavior)} using {@link Ordering#natural}.

### `binarySearch([`java.util.List<E>`](../../../../java/util/List.md) list, [`com.google.common.base.Function<? super E,K>`](../base/Function.md) keyFunction, [`K`](K.md) key, [`com.google.common.collect.SortedLists.KeyPresentBehavior`](SortedLists/KeyPresentBehavior.md) presentBehavior, [`com.google.common.collect.SortedLists.KeyAbsentBehavior`](SortedLists/KeyAbsentBehavior.md) absentBehavior)`

**Returns:** `int`

Binary searches the list for the specified key, using the specified key function.

 <p>Equivalent to {@link #binarySearch(List, Function, Object, Comparator, KeyPresentBehavior,
 KeyAbsentBehavior)} using {@link Ordering#natural}.

### `binarySearch([`java.util.List<E>`](../../../../java/util/List.md) list, [`com.google.common.base.Function<? super E,K>`](../base/Function.md) keyFunction, [`K`](K.md) key, [`java.util.Comparator<? super K>`](../../../../java/util/Comparator.md) keyComparator, [`com.google.common.collect.SortedLists.KeyPresentBehavior`](SortedLists/KeyPresentBehavior.md) presentBehavior, [`com.google.common.collect.SortedLists.KeyAbsentBehavior`](SortedLists/KeyAbsentBehavior.md) absentBehavior)`

**Returns:** `int`

Binary searches the list for the specified key, using the specified key function.

 <p>Equivalent to {@link #binarySearch(List, Object, Comparator, KeyPresentBehavior,
 KeyAbsentBehavior)} using {@link Lists#transform(List, Function) Lists.transform(list,
 keyFunction)}.

### `binarySearch([`java.util.List<? extends E>`](../../../../java/util/List.md) list, [`E`](E.md) key, [`java.util.Comparator<? super E>`](../../../../java/util/Comparator.md) comparator, [`com.google.common.collect.SortedLists.KeyPresentBehavior`](SortedLists/KeyPresentBehavior.md) presentBehavior, [`com.google.common.collect.SortedLists.KeyAbsentBehavior`](SortedLists/KeyAbsentBehavior.md) absentBehavior)`

**Returns:** `int`

Searches the specified list for the specified object using the binary search algorithm. The
 list must be sorted into ascending order according to the specified comparator (as by the
 {@link Collections#sort(List, Comparator) Collections.sort(List, Comparator)} method), prior to
 making this call. If it is not sorted, the results are undefined.

 <p>If there are elements in the list which compare as equal to the key, the choice of {@link KeyPresentBehavior} decides which index is returned. If no elements compare as equal to the
 key, the choice of {@link KeyAbsentBehavior} decides which index is returned.

 <p>This method runs in log(n) time on random-access lists, which offer near-constant-time
 access to each list element.
@param list the list to be searched.
@param key the value to be searched for.
@param comparator the comparator by which the list is ordered.
@param presentBehavior the specification for what to do if at least one element of the list
     compares as equal to the key.
@param absentBehavior the specification for what to do if no elements of the list compare as
     equal to the key.
@return the index determined by the {@code KeyPresentBehavior}, if the key is in the list;
     otherwise the index determined by the {@code KeyAbsentBehavior}.

