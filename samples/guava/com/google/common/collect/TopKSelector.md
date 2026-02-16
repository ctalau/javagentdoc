# Class: `TopKSelector`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.TopKSelector`

## Type Parameters

- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

An accumulator that selects the "top" `k` elements added to it, relative to a provided
 comparator. "Top" can mean the greatest or the lowest elements, specified in the factory used to
 create the `TopKSelector` instance.

 <p>If your input data is available as a `Stream`, prefer passing `Comparators.least(int)` to `Stream.collect(java.util.stream.Collector)`. If it is available
 as an `Iterable` or `Iterator`, prefer `Ordering.leastOf(Iterable, int)`.

 <p>This uses the same efficient implementation as `Ordering.leastOf(Iterable, int)`,
 offering expected O(n + k log k) performance (worst case O(n log k)) for n calls to `offer` and a call to `topK`, with O(k) memory. In comparison, quickselect has the same
 asymptotics but requires O(n) memory, and a `PriorityQueue` implementation takes O(n log
 k). In benchmarks, this implementation performs at least as well as either implementation, and
 degrades more gracefully for worst-case input.

 <p>The implementation does not necessarily use a <i>stable</i> sorting algorithm; when multiple
 equivalent elements are added to it, it is undefined which will come first in the output.
**Author:** Louis Wasserman

## Fields

### `k`

**Type:** `int`

### `comparator`

**Type:** `java.util.Comparator<? super T>`

### `buffer`

**Type:** [`@org.checkerframework.checker.nullness.qual.Nullable T[]`](../../../../@org/checkerframework/checker/nullness/qual/Nullable T.md)

### `bufferSize`

**Type:** `int`

### `threshold`

**Type:** `T`

The largest of the lowest k elements we've seen so far relative to this comparator. If
 bufferSize \u2265 k, then we can ignore any elements greater than this value.

## Constructors

### `<init>(`java.util.Comparator<? super T>` comparator, `int` k)`

## Methods

### `least(`int` k)`

**Returns:** [`com.google.common.collect.TopKSelector<T>`](./TopKSelector.md)

Returns a `TopKSelector` that collects the lowest `k` elements added to it,
 relative to the natural ordering of the elements, and returns them via `topK` in
 ascending order.
@throws IllegalArgumentException if `k < 0` or `k > Integer.MAX_VALUE / 2`

### `least(`int` k, `java.util.Comparator<? super T>` comparator)`

**Returns:** [`com.google.common.collect.TopKSelector<T>`](./TopKSelector.md)

Returns a `TopKSelector` that collects the lowest `k` elements added to it,
 relative to the specified comparator, and returns them via `topK` in ascending order.
@throws IllegalArgumentException if `k < 0` or `k > Integer.MAX_VALUE / 2`

### `greatest(`int` k)`

**Returns:** [`com.google.common.collect.TopKSelector<T>`](./TopKSelector.md)

Returns a `TopKSelector` that collects the greatest `k` elements added to it,
 relative to the natural ordering of the elements, and returns them via `topK` in
 descending order.
@throws IllegalArgumentException if `k < 0` or `k > Integer.MAX_VALUE / 2`

### `greatest(`int` k, `java.util.Comparator<? super T>` comparator)`

**Returns:** [`com.google.common.collect.TopKSelector<T>`](./TopKSelector.md)

Returns a `TopKSelector` that collects the greatest `k` elements added to it,
 relative to the specified comparator, and returns them via `topK` in descending order.
@throws IllegalArgumentException if `k < 0` or `k > Integer.MAX_VALUE / 2`

### `offer(`T` elem)`

**Returns:** `void`

Adds `elem` as a candidate for the top `k` elements. This operation takes amortized
 O(1) time.

### `trim()`

**Returns:** `void`

Quickselects the top k elements from the 2k elements in the buffer. O(k) expected time, O(k log
 k) worst case.

### `partition(`int` left, `int` right, `int` pivotIndex)`

**Returns:** `int`

Partitions the contents of buffer in the range [left, right] around the pivot element
 previously stored in buffer[pivotValue]. Returns the new index of the pivot element,
 pivotNewIndex, so that everything in [left, pivotNewIndex] is \u2264 pivotValue and everything in
 (pivotNewIndex, right] is greater than pivotValue.

### `swap(`int` i, `int` j)`

**Returns:** `void`

### `combine([`com.google.common.collect.TopKSelector<T>`](./TopKSelector.md) other)`

**Returns:** [`com.google.common.collect.TopKSelector<T>`](./TopKSelector.md)

### `offerAll(`java.lang.Iterable<? extends T>` elements)`

**Returns:** `void`

Adds each member of `elements` as a candidate for the top `k` elements. This
 operation takes amortized linear time in the length of `elements`.

 <p>If all input data to this `TopKSelector` is in a single `Iterable`, prefer
 `Ordering.leastOf(Iterable, int)`, which provides a simpler API for that use case.

### `offerAll(`java.util.Iterator<? extends T>` elements)`

**Returns:** `void`

Adds each member of `elements` as a candidate for the top `k` elements. This
 operation takes amortized linear time in the length of `elements`. The iterator is
 consumed after this operation completes.

 <p>If all input data to this `TopKSelector` is in a single `Iterator`, prefer
 `Ordering.leastOf(Iterator, int)`, which provides a simpler API for that use case.

### `topK()`

**Returns:** `java.util.List<T>`

Returns the top `k` elements offered to this `TopKSelector`, or all elements if
 fewer than `k` have been offered, in the order specified by the factory used to create
 this `TopKSelector`.

 <p>The returned list is an unmodifiable copy and will not be affected by further changes to
 this `TopKSelector`. This method returns in O(k log k) time.

