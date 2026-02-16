# Class: `TopKSelector`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.TopKSelector`

## Type Parameters

- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

An accumulator that selects the "top" {@code k} elements added to it, relative to a provided
 comparator. "Top" can mean the greatest or the lowest elements, specified in the factory used to
 create the {@code TopKSelector} instance.

 <p>If your input data is available as a {@link Stream}, prefer passing {@link Comparators#least(int)} to {@link Stream#collect(java.util.stream.Collector)}. If it is available
 as an {@link Iterable} or {@link Iterator}, prefer {@link Ordering#leastOf(Iterable, int)}.

 <p>This uses the same efficient implementation as {@link Ordering#leastOf(Iterable, int)},
 offering expected O(n + k log k) performance (worst case O(n log k)) for n calls to {@link #offer} and a call to {@link #topK}, with O(k) memory. In comparison, quickselect has the same
 asymptotics but requires O(n) memory, and a {@code PriorityQueue} implementation takes O(n log
 k). In benchmarks, this implementation performs at least as well as either implementation, and
 degrades more gracefully for worst-case input.

 <p>The implementation does not necessarily use a <i>stable</i> sorting algorithm; when multiple
 equivalent elements are added to it, it is undefined which will come first in the output.
@author Louis Wasserman

## Fields

### `k`

**Type:** `int`

### `comparator`

**Type:** [`java.util.Comparator<? super T>`](../../../../java/util/Comparator.md)

### `buffer`

**Type:** [`@org.checkerframework.checker.nullness.qual.Nullable T[]`](../../../../@org/checkerframework/checker/nullness/qual/Nullable T.md)

### `bufferSize`

**Type:** `int`

### `threshold`

**Type:** [`T`](T.md)

The largest of the lowest k elements we've seen so far relative to this comparator. If
 bufferSize \u2265 k, then we can ignore any elements greater than this value.

## Constructors

### `<init>([`java.util.Comparator<? super T>`](../../../../java/util/Comparator.md) comparator, `int` k)`

## Methods

### `least(`int` k)`

**Returns:** [`com.google.common.collect.TopKSelector<T>`](./TopKSelector.md)

Returns a {@code TopKSelector} that collects the lowest {@code k} elements added to it,
 relative to the natural ordering of the elements, and returns them via {@link #topK} in
 ascending order.
@throws IllegalArgumentException if {@code k < 0} or {@code k > Integer.MAX_VALUE / 2}

### `least(`int` k, [`java.util.Comparator<? super T>`](../../../../java/util/Comparator.md) comparator)`

**Returns:** [`com.google.common.collect.TopKSelector<T>`](./TopKSelector.md)

Returns a {@code TopKSelector} that collects the lowest {@code k} elements added to it,
 relative to the specified comparator, and returns them via {@link #topK} in ascending order.
@throws IllegalArgumentException if {@code k < 0} or {@code k > Integer.MAX_VALUE / 2}

### `greatest(`int` k)`

**Returns:** [`com.google.common.collect.TopKSelector<T>`](./TopKSelector.md)

Returns a {@code TopKSelector} that collects the greatest {@code k} elements added to it,
 relative to the natural ordering of the elements, and returns them via {@link #topK} in
 descending order.
@throws IllegalArgumentException if {@code k < 0} or {@code k > Integer.MAX_VALUE / 2}

### `greatest(`int` k, [`java.util.Comparator<? super T>`](../../../../java/util/Comparator.md) comparator)`

**Returns:** [`com.google.common.collect.TopKSelector<T>`](./TopKSelector.md)

Returns a {@code TopKSelector} that collects the greatest {@code k} elements added to it,
 relative to the specified comparator, and returns them via {@link #topK} in descending order.
@throws IllegalArgumentException if {@code k < 0} or {@code k > Integer.MAX_VALUE / 2}

### `offer([`T`](T.md) elem)`

**Returns:** `void`

Adds {@code elem} as a candidate for the top {@code k} elements. This operation takes amortized
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

Adds each member of {@code elements} as a candidate for the top {@code k} elements. This
 operation takes amortized linear time in the length of {@code elements}.

 <p>If all input data to this {@code TopKSelector} is in a single {@code Iterable}, prefer
 {@link Ordering#leastOf(Iterable, int)}, which provides a simpler API for that use case.

### `offerAll([`java.util.Iterator<? extends T>`](../../../../java/util/Iterator.md) elements)`

**Returns:** `void`

Adds each member of {@code elements} as a candidate for the top {@code k} elements. This
 operation takes amortized linear time in the length of {@code elements}. The iterator is
 consumed after this operation completes.

 <p>If all input data to this {@code TopKSelector} is in a single {@code Iterator}, prefer
 {@link Ordering#leastOf(Iterator, int)}, which provides a simpler API for that use case.

### `topK()`

**Returns:** [`java.util.List<T>`](../../../../java/util/List.md)

Returns the top {@code k} elements offered to this {@code TopKSelector}, or all elements if
 fewer than {@code k} have been offered, in the order specified by the factory used to create
 this {@code TopKSelector}.

 <p>The returned list is an unmodifiable copy and will not be affected by further changes to
 this {@code TopKSelector}. This method returns in O(k log k) time.

