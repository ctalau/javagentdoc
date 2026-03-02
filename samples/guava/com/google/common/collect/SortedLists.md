# Class: `SortedLists`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.SortedLists`

## Description

In this documentation, the terms *greatest*, *greater*, *least*, and
 *lesser* are considered to refer to the comparator on the elements, and the terms
 *first* and *last* are considered to refer to the elements' ordering in a list.

## Constructors

### `<init>()`

## Methods

### `binarySearch(List<? extends E> list, E e, SortedLists.KeyPresentBehavior presentBehavior, SortedLists.KeyAbsentBehavior absentBehavior)`

Equivalent to #binarySearch(List, Function, Object, Comparator, KeyPresentBehavior,
 KeyAbsentBehavior) using Ordering#natural.

**Parameters:**
- `list` (`java.util.List<? extends E>`)
- `e` (`E`)
- `presentBehavior` (`com.google.common.collect.SortedLists.KeyPresentBehavior`)
- `absentBehavior` (`com.google.common.collect.SortedLists.KeyAbsentBehavior`)

**Returns:** `int`

### `binarySearch(List<E> list, Function<? super E,K> keyFunction, K key, SortedLists.KeyPresentBehavior presentBehavior, SortedLists.KeyAbsentBehavior absentBehavior)`

Equivalent to #binarySearch(List, Function, Object, Comparator, KeyPresentBehavior,
 KeyAbsentBehavior) using Ordering#natural.

**Parameters:**
- `list` (`java.util.List<E>`)
- `keyFunction` ([`com.google.common.base.Function<? super E,K>`](../base/Function.md))
- `key` (`K`)
- `presentBehavior` (`com.google.common.collect.SortedLists.KeyPresentBehavior`)
- `absentBehavior` (`com.google.common.collect.SortedLists.KeyAbsentBehavior`)

**Returns:** `int`

### `binarySearch(List<E> list, Function<? super E,K> keyFunction, K key, Comparator<? super K> keyComparator, SortedLists.KeyPresentBehavior presentBehavior, SortedLists.KeyAbsentBehavior absentBehavior)`

Equivalent to #binarySearch(List, Object, Comparator, KeyPresentBehavior,
 KeyAbsentBehavior) using Lists.transform(list,
 keyFunction).

**Parameters:**
- `list` (`java.util.List<E>`)
- `keyFunction` ([`com.google.common.base.Function<? super E,K>`](../base/Function.md))
- `key` (`K`)
- `keyComparator` (`java.util.Comparator<? super K>`)
- `presentBehavior` (`com.google.common.collect.SortedLists.KeyPresentBehavior`)
- `absentBehavior` (`com.google.common.collect.SortedLists.KeyAbsentBehavior`)

**Returns:** `int`

### `binarySearch(List<? extends E> list, E key, Comparator<? super E> comparator, SortedLists.KeyPresentBehavior presentBehavior, SortedLists.KeyAbsentBehavior absentBehavior)`

The
 list must be sorted into ascending order according to the specified comparator (as by the
 Collections.sort(List, Comparator) method), prior to
 making this call. If it is not sorted, the results are undefined.

 
If there are elements in the list which compare as equal to the key, the choice of KeyPresentBehavior decides which index is returned. If no elements compare as equal to the
 key, the choice of KeyAbsentBehavior decides which index is returned.

 
This method runs in log(n) time on random-access lists, which offer near-constant-time
 access to each list element.

**Parameters:**
- `list` (`java.util.List<? extends E>`): the list to be searched.
- `key` (`E`): the value to be searched for.
- `comparator` (`java.util.Comparator<? super E>`): the comparator by which the list is ordered.
- `presentBehavior` (`com.google.common.collect.SortedLists.KeyPresentBehavior`): the specification for what to do if at least one element of the list
       compares as equal to the key.
- `absentBehavior` (`com.google.common.collect.SortedLists.KeyAbsentBehavior`): the specification for what to do if no elements of the list compare as
       equal to the key.

**Returns:** `int`

