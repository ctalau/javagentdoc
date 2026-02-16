# Class: `MinMaxPriorityQueue`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.MinMaxPriorityQueue`

**Extends:** [`java.util.AbstractQueue<E>`](../../../../java/util/AbstractQueue.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

A double-ended priority queue, which provides constant-time access to both its least element and
 its greatest element, as determined by the queue's specified comparator. If no comparator is
 given at creation time, the natural order of elements is used. If no maximum size is given at
 creation time, the queue is unbounded.

 <p>Usage example:

 <pre>{@code
 MinMaxPriorityQueue<User> users = MinMaxPriorityQueue.orderedBy(userComparator)
     .maximumSize(1000)
     .create();
 }</pre>

 <p>As a {@link Queue} it functions exactly as a {@link PriorityQueue}: its head element -- the
 implicit target of the methods {@link #peek()}, {@link #poll()} and {@link #remove()} -- is
 defined as the <i>least</i> element in the queue according to the queue's comparator. But unlike
 a regular priority queue, the methods {@link #peekLast}, {@link #pollLast} and {@link #removeLast} are also provided, to act on the <i>greatest</i> element in the queue instead.

 <p>A min-max priority queue can be configured with a maximum size. If so, each time the size of
 the queue exceeds that value, the queue automatically removes its greatest element according to
 its comparator (which might be the element that was just added). This is different from
 conventional bounded queues, which either block or reject new elements when full.

 <p>This implementation is based on the <a href="http://portal.acm.org/citation.cfm?id=6621">min-max heap</a> developed by Atkinson, et al.
 Unlike many other double-ended priority queues, it stores elements in a single array, as compact
 as the traditional heap data structure used in {@link PriorityQueue}.

 <p>This class is not thread-safe, and does not accept null elements.

 <p><i>Performance notes:</i>

 <ul>
   <li>If you only access one end of the queue, and do use a maximum size, this class will perform
       significantly worse than a {@code PriorityQueue} with manual eviction above the maximum
       size. In many cases {@link Ordering#leastOf} may work for your use case with significantly
       improved (and asymptotically superior) performance.
   <li>The retrieval operations {@link #peek}, {@link #peekFirst}, {@link #peekLast}, {@link #element}, and {@link #size} are constant-time.
   <li>The enqueuing and dequeuing operations ({@link #offer}, {@link #add}, and all the forms of
       {@link #poll} and {@link #remove()}) run in {@code O(log n) time}.
   <li>The {@link #remove(Object)} and {@link #contains} operations require linear ({@code O(n)})
       time.
   <li>If you only access one end of the queue, and don't use a maximum size, this class is
       functionally equivalent to {@link PriorityQueue}, but significantly slower.
 </ul>
@author Sverre Sundsdal
@author Torbjorn Gannholm
@since 8.0

## Fields

### `minHeap`

**Type:** [`com.google.common.collect.MinMaxPriorityQueue<E>.Heap`](MinMaxPriorityQueue/Heap.md)

### `maxHeap`

**Type:** [`com.google.common.collect.MinMaxPriorityQueue<E>.Heap`](MinMaxPriorityQueue/Heap.md)

### `maximumSize`

**Type:** `int`

### `queue`

**Type:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`

### `size`

**Type:** `int`

### `modCount`

**Type:** `int`

### `EVEN_POWERS_OF_TWO`

**Type:** `int`

### `ODD_POWERS_OF_TWO`

**Type:** `int`

### `DEFAULT_CAPACITY`

**Type:** `int`

## Constructors

### `<init>([`com.google.common.collect.MinMaxPriorityQueue.Builder<? super E>`](MinMaxPriorityQueue/Builder.md) builder, `int` queueSize)`

## Methods

### `create()`

**Returns:** [`com.google.common.collect.MinMaxPriorityQueue<E>`](./MinMaxPriorityQueue.md)

Creates a new min-max priority queue with default settings: natural order, no maximum size, no
 initial contents, and an initial expected size of 11.

### `create(`java.lang.Iterable<? extends E>` initialContents)`

**Returns:** [`com.google.common.collect.MinMaxPriorityQueue<E>`](./MinMaxPriorityQueue.md)

Creates a new min-max priority queue using natural order, no maximum size, and initially
 containing the given elements.

### `orderedBy([`java.util.Comparator<B>`](../../../../java/util/Comparator.md) comparator)`

**Returns:** [`com.google.common.collect.MinMaxPriorityQueue.Builder<B>`](MinMaxPriorityQueue/Builder.md)

Creates and returns a new builder, configured to build {@code MinMaxPriorityQueue} instances
 that use {@code comparator} to determine the least and greatest elements.

### `expectedSize(`int` expectedSize)`

**Returns:** [`com.google.common.collect.MinMaxPriorityQueue.Builder<java.lang.Comparable>`](MinMaxPriorityQueue/Builder.md)

Creates and returns a new builder, configured to build {@code MinMaxPriorityQueue} instances
 sized appropriately to hold {@code expectedSize} elements.

### `maximumSize(`int` maximumSize)`

**Returns:** [`com.google.common.collect.MinMaxPriorityQueue.Builder<java.lang.Comparable>`](MinMaxPriorityQueue/Builder.md)

Creates and returns a new builder, configured to build {@code MinMaxPriorityQueue} instances
 that are limited to {@code maximumSize} elements. Each time a queue grows beyond this bound, it
 immediately removes its greatest element (according to its comparator), which might be the
 element that was just added.

### `size()`

**Returns:** `int`

### `add([`E`](E.md) element)`

**Returns:** `boolean`

Adds the given element to this queue. If this queue has a maximum size, after adding {@code
 element} the queue will automatically evict its greatest element (according to its comparator),
 which may be {@code element} itself.
@return {@code true} always

### `addAll([`java.util.Collection<? extends E>`](../../../../java/util/Collection.md) newElements)`

**Returns:** `boolean`

### `offer([`E`](E.md) element)`

**Returns:** `boolean`

Adds the given element to this queue. If this queue has a maximum size, after adding {@code
 element} the queue will automatically evict its greatest element (according to its comparator),
 which may be {@code element} itself.

### `poll()`

**Returns:** [`E`](E.md)

### `elementData(`int` index)`

**Returns:** [`E`](E.md)

### `peek()`

**Returns:** [`E`](E.md)

### `getMaxElementIndex()`

**Returns:** `int`

Returns the index of the max element.

### `pollFirst()`

**Returns:** [`E`](E.md)

Removes and returns the least element of this queue, or returns {@code null} if the queue is
 empty.

### `removeFirst()`

**Returns:** [`E`](E.md)

Removes and returns the least element of this queue.
@throws NoSuchElementException if the queue is empty

### `peekFirst()`

**Returns:** [`E`](E.md)

Retrieves, but does not remove, the least element of this queue, or returns {@code null} if the
 queue is empty.

### `pollLast()`

**Returns:** [`E`](E.md)

Removes and returns the greatest element of this queue, or returns {@code null} if the queue is
 empty.

### `removeLast()`

**Returns:** [`E`](E.md)

Removes and returns the greatest element of this queue.
@throws NoSuchElementException if the queue is empty

### `peekLast()`

**Returns:** [`E`](E.md)

Retrieves, but does not remove, the greatest element of this queue, or returns {@code null} if
 the queue is empty.

### `removeAt(`int` index)`

**Returns:** [`com.google.common.collect.MinMaxPriorityQueue.MoveDesc<E>`](MinMaxPriorityQueue/MoveDesc.md)

Removes the element at position {@code index}.

 <p>Normally this method leaves the elements at up to {@code index - 1}, inclusive, untouched.
 Under these circumstances, it returns {@code null}.

 <p>Occasionally, in order to maintain the heap invariant, it must swap a later element of the
 list with one before {@code index}. Under these circumstances it returns a pair of elements as
 a {@link MoveDesc}. The first one is the element that was previously at the end of the heap and
 is now at some position before {@code index}. The second element is the one that was swapped
 down to replace the element at {@code index}. This fact is used by iterator.remove so as to
 visit elements during a traversal once and only once.

### `fillHole(`int` index, [`E`](E.md) toTrickle)`

**Returns:** [`com.google.common.collect.MinMaxPriorityQueue.MoveDesc<E>`](MinMaxPriorityQueue/MoveDesc.md)

### `removeAndGet(`int` index)`

**Returns:** [`E`](E.md)

Removes and returns the value at {@code index}.

### `heapForIndex(`int` i)`

**Returns:** [`com.google.common.collect.MinMaxPriorityQueue<E>.Heap`](MinMaxPriorityQueue/Heap.md)

### `isEvenLevel(`int` index)`

**Returns:** `boolean`

### `isIntact()`

**Returns:** `boolean`

Returns {@code true} if the MinMax heap structure holds. This is only used in testing.

 <p>TODO(kevinb): move to the test class?

### `iterator()`

**Returns:** [`java.util.Iterator<E>`](../../../../java/util/Iterator.md)

Returns an iterator over the elements contained in this collection, <i>in no particular
 order</i>.

 <p>The iterator is <i>fail-fast</i>: If the MinMaxPriorityQueue is modified at any time after
 the iterator is created, in any way except through the iterator's own remove method, the
 iterator will generally throw a {@link ConcurrentModificationException}. Thus, in the face of
 concurrent modification, the iterator fails quickly and cleanly, rather than risking arbitrary,
 non-deterministic behavior at an undetermined time in the future.

 <p>Note that the fail-fast behavior of an iterator cannot be guaranteed as it is, generally
 speaking, impossible to make any hard guarantees in the presence of unsynchronized concurrent
 modification. Fail-fast iterators throw {@code ConcurrentModificationException} on a
 best-effort basis. Therefore, it would be wrong to write a program that depended on this
 exception for its correctness: <i>the fail-fast behavior of iterators should be used only to
 detect bugs.</i>
@return an iterator over the elements contained in this collection

### `clear()`

**Returns:** `void`

### `toArray()`

**Returns:** `java.lang.Object[]`

### `comparator()`

**Returns:** [`java.util.Comparator<? super E>`](../../../../java/util/Comparator.md)

Returns the comparator used to order the elements in this queue. Obeys the general contract of
 {@link PriorityQueue#comparator}, but returns {@link Ordering#natural} instead of {@code null}
 to indicate natural ordering.

### `capacity()`

**Returns:** `int`

### `initialQueueSize(`int` configuredExpectedSize, `int` maximumSize, `java.lang.Iterable<?>` initialContents)`

**Returns:** `int`

### `growIfNeeded()`

**Returns:** `void`

### `calculateNewCapacity()`

**Returns:** `int`

Returns ~2x the old capacity if small; ~1.5x otherwise.

### `capAtMaximumSize(`int` queueSize, `int` maximumSize)`

**Returns:** `int`

There's no reason for the queueSize to ever be more than maxSize + 1

