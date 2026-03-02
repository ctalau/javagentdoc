# Class: `TopKSelector`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.TopKSelector`

## Type Parameters

- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

"Top" can mean the greatest or the lowest elements, specified in the factory used to
 create the TopKSelector instance.

 
If your input data is available as a Stream, prefer passing Comparators#least(int) to Stream#collect(java.util.stream.Collector). If it is available
 as an Iterable or Iterator, prefer Ordering#leastOf(Iterable, int).

 
This uses the same efficient implementation as Ordering#leastOf(Iterable, int),
 offering expected O(n + k log k) performance (worst case O(n log k)) for n calls to #offer and a call to #topK, with O(k) memory. In comparison, quickselect has the same
 asymptotics but requires O(n) memory, and a PriorityQueue implementation takes O(n log
 k). In benchmarks, this implementation performs at least as well as either implementation, and
 degrades more gracefully for worst-case input.

 
The implementation does not necessarily use a *stable* sorting algorithm; when multiple
 equivalent elements are added to it, it is undefined which will come first in the output.

## Fields

### `k`

**Type:** `int`

### `comparator`

**Type:** `java.util.Comparator<? super T>`

### `buffer`

**Type:** `@org.checkerframework.checker.nullness.qual.Nullable T[]`

### `bufferSize`

**Type:** `int`

### `threshold`

**Type:** `T`

If
 bufferSize ≥ k, then we can ignore any elements greater than this value.

## Constructors

### `<init>(java.util.Comparator<? super T> comparator, int k)`

**Parameters:**
- `comparator` (`java.util.Comparator<? super T>`)
- `k` (`int`)

## Methods

### `least(int k)`

**Returns:** [`com.google.common.collect.TopKSelector<T>`](./TopKSelector.md)

**Parameters:**
- `k` (`int`)

### `least(int k, java.util.Comparator<? super T> comparator)`

**Returns:** [`com.google.common.collect.TopKSelector<T>`](./TopKSelector.md)

**Parameters:**
- `k` (`int`)
- `comparator` (`java.util.Comparator<? super T>`)

### `greatest(int k)`

**Returns:** [`com.google.common.collect.TopKSelector<T>`](./TopKSelector.md)

**Parameters:**
- `k` (`int`)

### `greatest(int k, java.util.Comparator<? super T> comparator)`

**Returns:** [`com.google.common.collect.TopKSelector<T>`](./TopKSelector.md)

**Parameters:**
- `k` (`int`)
- `comparator` (`java.util.Comparator<? super T>`)

### `offer(T elem)`

**Returns:** `void`

This operation takes amortized
 O(1) time.

**Parameters:**
- `elem` (`T`)

### `trim()`

**Returns:** `void`

O(k) expected time, O(k log
 k) worst case.

### `partition(int left, int right, int pivotIndex)`

**Returns:** `int`

Returns the new index of the pivot element,
 pivotNewIndex, so that everything in [left, pivotNewIndex] is ≤ pivotValue and everything in
 (pivotNewIndex, right] is greater than pivotValue.

**Parameters:**
- `left` (`int`)
- `right` (`int`)
- `pivotIndex` (`int`)

### `swap(int i, int j)`

**Returns:** `void`

**Parameters:**
- `i` (`int`)
- `j` (`int`)

### `combine(com.google.common.collect.TopKSelector<T> other)`

**Returns:** [`com.google.common.collect.TopKSelector<T>`](./TopKSelector.md)

**Parameters:**
- `other` ([`com.google.common.collect.TopKSelector<T>`](./TopKSelector.md))

### `offerAll(java.lang.Iterable<? extends T> elements)`

**Returns:** `void`

This
 operation takes amortized linear time in the length of elements.

 
If all input data to this TopKSelector is in a single Iterable, prefer
 Ordering#leastOf(Iterable, int), which provides a simpler API for that use case.

**Parameters:**
- `elements` (`java.lang.Iterable<? extends T>`)

### `offerAll(java.util.Iterator<? extends T> elements)`

**Returns:** `void`

This
 operation takes amortized linear time in the length of elements. The iterator is
 consumed after this operation completes.

 
If all input data to this TopKSelector is in a single Iterator, prefer
 Ordering#leastOf(Iterator, int), which provides a simpler API for that use case.

**Parameters:**
- `elements` (`java.util.Iterator<? extends T>`)

### `topK()`

**Returns:** `java.util.List<T>`

The returned list is an unmodifiable copy and will not be affected by further changes to
 this TopKSelector. This method returns in O(k log k) time.

