# Class: `MinMaxPriorityQueue`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.MinMaxPriorityQueue`

**Extends:** `java.util.AbstractQueue<E>`

## Type Parameters

- `E` extends `java.lang.Object`

## Description

If no comparator is
 given at creation time, the natural order of elements is used. If no maximum size is given at
 creation time, the queue is unbounded.

 
Usage example:

 

```

 MinMaxPriorityQueue<User> users = MinMaxPriorityQueue.orderedBy(userComparator)
     .maximumSize(1000)
     .create();
 
```


 
As a Queue it functions exactly as a PriorityQueue: its head element -- the
 implicit target of the methods #peek(), #poll() and #remove() -- is
 defined as the *least* element in the queue according to the queue's comparator. But unlike
 a regular priority queue, the methods #peekLast, #pollLast and #removeLast are also provided, to act on the *greatest* element in the queue instead.

 
A min-max priority queue can be configured with a maximum size. If so, each time the size of
 the queue exceeds that value, the queue automatically removes its greatest element according to
 its comparator (which might be the element that was just added). This is different from
 conventional bounded queues, which either block or reject new elements when full.

 
This implementation is based on the [min-max heap](http://portal.acm.org/citation.cfm?id=6621) developed by Atkinson, et al.
 Unlike many other double-ended priority queues, it stores elements in a single array, as compact
 as the traditional heap data structure used in PriorityQueue.

 
This class is not thread-safe, and does not accept null elements.

 
*Performance notes:*

 

   - If you only access one end of the queue, and do use a maximum size, this class will perform
       significantly worse than a PriorityQueue with manual eviction above the maximum
       size. In many cases Ordering#leastOf may work for your use case with significantly
       improved (and asymptotically superior) performance.
   - The retrieval operations #peek, #peekFirst, #peekLast, #element, and #size are constant-time.
   - The enqueuing and dequeuing operations (#offer, #add, and all the forms of
       #poll and #remove()) run in O(log n) time.
   - The #remove(Object) and #contains operations require linear (O(n))
       time.
   - If you only access one end of the queue, and don't use a maximum size, this class is
       functionally equivalent to PriorityQueue, but significantly slower.

## Fields

### `minHeap`

**Type:** [`com.google.common.collect.MinMaxPriorityQueue<E>.Heap`](./MinMaxPriorityQueue.md)

### `maxHeap`

**Type:** [`com.google.common.collect.MinMaxPriorityQueue<E>.Heap`](./MinMaxPriorityQueue.md)

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

### `<init>(MinMaxPriorityQueue.Builder<? super E> builder, int queueSize)`

**Parameters:**
- `builder` (`com.google.common.collect.MinMaxPriorityQueue.Builder<? super E>`)
- `queueSize` (`int`)

## Methods

### `create()`

**Returns:** [`com.google.common.collect.MinMaxPriorityQueue<E>`](./MinMaxPriorityQueue.md)

### `create(Iterable<? extends E> initialContents)`

**Parameters:**
- `initialContents` (`java.lang.Iterable<? extends E>`)

**Returns:** [`com.google.common.collect.MinMaxPriorityQueue<E>`](./MinMaxPriorityQueue.md)

### `orderedBy(Comparator<B> comparator)`

**Parameters:**
- `comparator` (`java.util.Comparator<B>`)

**Returns:** `com.google.common.collect.MinMaxPriorityQueue.Builder<B>`

### `expectedSize(int expectedSize)`

**Parameters:**
- `expectedSize` (`int`)

**Returns:** `com.google.common.collect.MinMaxPriorityQueue.Builder<java.lang.Comparable>`

### `maximumSize(int maximumSize)`

Each time a queue grows beyond this bound, it
 immediately removes its greatest element (according to its comparator), which might be the
 element that was just added.

**Parameters:**
- `maximumSize` (`int`)

**Returns:** `com.google.common.collect.MinMaxPriorityQueue.Builder<java.lang.Comparable>`

### `size()`

**Returns:** `int`

### `add(E element)`

If this queue has a maximum size, after adding 
 element the queue will automatically evict its greatest element (according to its comparator),
 which may be element itself.

**Parameters:**
- `element` (`E`)

**Returns:** `boolean`

### `addAll(Collection<? extends E> newElements)`

**Parameters:**
- `newElements` (`java.util.Collection<? extends E>`)

**Returns:** `boolean`

### `offer(E element)`

If this queue has a maximum size, after adding 
 element the queue will automatically evict its greatest element (according to its comparator),
 which may be element itself.

**Parameters:**
- `element` (`E`)

**Returns:** `boolean`

### `poll()`

**Returns:** `E`

### `elementData(int index)`

**Parameters:**
- `index` (`int`)

**Returns:** `E`

### `peek()`

**Returns:** `E`

### `getMaxElementIndex()`

**Returns:** `int`

### `pollFirst()`

**Returns:** `E`

### `removeFirst()`

**Returns:** `E`

### `peekFirst()`

**Returns:** `E`

### `pollLast()`

**Returns:** `E`

### `removeLast()`

**Returns:** `E`

### `peekLast()`

**Returns:** `E`

### `removeAt(int index)`

Normally this method leaves the elements at up to index - 1, inclusive, untouched.
 Under these circumstances, it returns null.

 
Occasionally, in order to maintain the heap invariant, it must swap a later element of the
 list with one before index. Under these circumstances it returns a pair of elements as
 a MoveDesc. The first one is the element that was previously at the end of the heap and
 is now at some position before index. The second element is the one that was swapped
 down to replace the element at index. This fact is used by iterator.remove so as to
 visit elements during a traversal once and only once.

**Parameters:**
- `index` (`int`)

**Returns:** `com.google.common.collect.MinMaxPriorityQueue.MoveDesc<E>`

### `fillHole(int index, E toTrickle)`

**Parameters:**
- `index` (`int`)
- `toTrickle` (`E`)

**Returns:** `com.google.common.collect.MinMaxPriorityQueue.MoveDesc<E>`

### `removeAndGet(int index)`

**Parameters:**
- `index` (`int`)

**Returns:** `E`

### `heapForIndex(int i)`

**Parameters:**
- `i` (`int`)

**Returns:** [`com.google.common.collect.MinMaxPriorityQueue<E>.Heap`](./MinMaxPriorityQueue.md)

### `isEvenLevel(int index)`

**Parameters:**
- `index` (`int`)

**Returns:** `boolean`

### `isIntact()`

This is only used in testing.

 
TODO(kevinb): move to the test class?

**Returns:** `boolean`

### `iterator()`

The iterator is *fail-fast*: If the MinMaxPriorityQueue is modified at any time after
 the iterator is created, in any way except through the iterator's own remove method, the
 iterator will generally throw a ConcurrentModificationException. Thus, in the face of
 concurrent modification, the iterator fails quickly and cleanly, rather than risking arbitrary,
 non-deterministic behavior at an undetermined time in the future.

 
Note that the fail-fast behavior of an iterator cannot be guaranteed as it is, generally
 speaking, impossible to make any hard guarantees in the presence of unsynchronized concurrent
 modification. Fail-fast iterators throw ConcurrentModificationException on a
 best-effort basis. Therefore, it would be wrong to write a program that depended on this
 exception for its correctness: *the fail-fast behavior of iterators should be used only to
 detect bugs.*

**Returns:** `java.util.Iterator<E>`

### `clear()`

**Returns:** `void`

### `toArray()`

**Returns:** `java.lang.Object[]`

### `comparator()`

Obeys the general contract of
 PriorityQueue#comparator, but returns Ordering#natural instead of null
 to indicate natural ordering.

**Returns:** `java.util.Comparator<? super E>`

### `capacity()`

**Returns:** `int`

### `initialQueueSize(int configuredExpectedSize, int maximumSize, Iterable<?> initialContents)`

**Parameters:**
- `configuredExpectedSize` (`int`)
- `maximumSize` (`int`)
- `initialContents` (`java.lang.Iterable<?>`)

**Returns:** `int`

### `growIfNeeded()`

**Returns:** `void`

### `calculateNewCapacity()`

**Returns:** `int`

### `capAtMaximumSize(int queueSize, int maximumSize)`

**Parameters:**
- `queueSize` (`int`)
- `maximumSize` (`int`)

**Returns:** `int`

