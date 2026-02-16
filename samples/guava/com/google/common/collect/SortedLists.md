# Class: `SortedLists`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.SortedLists`

## Description

Static methods pertaining to sorted `List` instances.

 <p>In this documentation, the terms <i>greatest</i>, <i>greater</i>, <i>least</i>, and
 <i>lesser</i> are considered to refer to the comparator on the elements, and the terms
 <i>first</i> and <i>last</i> are considered to refer to the elements' ordering in a list.
**Author:** Louis Wasserman

## Constructors

### `<init>()`

## Methods

### `binarySearch(`java.util.List<? extends E>` list, `E` e, [`com.google.common.collect.SortedLists.KeyPresentBehavior`](SortedLists/KeyPresentBehavior.md) presentBehavior, [`com.google.common.collect.SortedLists.KeyAbsentBehavior`](SortedLists/KeyAbsentBehavior.md) absentBehavior)`

**Returns:** `int`

Searches the specified naturally ordered list for the specified object using the binary search
 algorithm.

 <p>Equivalent to `binarySearch(List, Function, Object, Comparator, KeyPresentBehavior,
 KeyAbsentBehavior)` using `Ordering.natural`.

### `binarySearch(`java.util.List<E>` list, [`com.google.common.base.Function<? super E,K>`](../base/Function.md) keyFunction, `K` key, [`com.google.common.collect.SortedLists.KeyPresentBehavior`](SortedLists/KeyPresentBehavior.md) presentBehavior, [`com.google.common.collect.SortedLists.KeyAbsentBehavior`](SortedLists/KeyAbsentBehavior.md) absentBehavior)`

**Returns:** `int`

Binary searches the list for the specified key, using the specified key function.

 <p>Equivalent to `binarySearch(List, Function, Object, Comparator, KeyPresentBehavior,
 KeyAbsentBehavior)` using `Ordering.natural`.

### `binarySearch(`java.util.List<E>` list, [`com.google.common.base.Function<? super E,K>`](../base/Function.md) keyFunction, `K` key, `java.util.Comparator<? super K>` keyComparator, [`com.google.common.collect.SortedLists.KeyPresentBehavior`](SortedLists/KeyPresentBehavior.md) presentBehavior, [`com.google.common.collect.SortedLists.KeyAbsentBehavior`](SortedLists/KeyAbsentBehavior.md) absentBehavior)`

**Returns:** `int`

Binary searches the list for the specified key, using the specified key function.

 <p>Equivalent to `binarySearch(List, Object, Comparator, KeyPresentBehavior,
 KeyAbsentBehavior)` using `Lists.transform(List, Function) Lists.transform(list,
 keyFunction)`.

### `binarySearch(`java.util.List<? extends E>` list, `E` key, `java.util.Comparator<? super E>` comparator, [`com.google.common.collect.SortedLists.KeyPresentBehavior`](SortedLists/KeyPresentBehavior.md) presentBehavior, [`com.google.common.collect.SortedLists.KeyAbsentBehavior`](SortedLists/KeyAbsentBehavior.md) absentBehavior)`

**Returns:** `int`

Searches the specified list for the specified object using the binary search algorithm. The
 list must be sorted into ascending order according to the specified comparator (as by the
 `Collections.sort(List, Comparator) Collections.sort(List, Comparator)` method), prior to
 making this call. If it is not sorted, the results are undefined.

 <p>If there are elements in the list which compare as equal to the key, the choice of `KeyPresentBehavior` decides which index is returned. If no elements compare as equal to the
 key, the choice of `KeyAbsentBehavior` decides which index is returned.

 <p>This method runs in log(n) time on random-access lists, which offer near-constant-time
 access to each list element.
@param list the list to be searched.
@param key the value to be searched for.
@param comparator the comparator by which the list is ordered.
@param presentBehavior the specification for what to do if at least one element of the list
     compares as equal to the key.
@param absentBehavior the specification for what to do if no elements of the list compare as
     equal to the key.
@return the index determined by the `KeyPresentBehavior`, if the key is in the list;
     otherwise the index determined by the `KeyAbsentBehavior`.

