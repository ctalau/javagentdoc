# Class: `Queues`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Queues`

## Description

Static utility methods pertaining to `Queue` and `Deque` instances. Also see this
 class's counterparts `Lists`, `Sets`, and `Maps`.
**Author:** Kurt Alfred Kluever
**Since:** 11.0

## Constructors

### `<init>()`

## Methods

### `newArrayBlockingQueue(`int` capacity)`

**Returns:** `java.util.concurrent.ArrayBlockingQueue<E>`

Creates an empty `ArrayBlockingQueue` with the given (fixed) capacity and nonfair access
 policy.

### `newArrayDeque()`

**Returns:** `java.util.ArrayDeque<E>`

Creates an empty `ArrayDeque`.
**Since:** 12.0

### `newArrayDeque(`java.lang.Iterable<? extends E>` elements)`

**Returns:** `java.util.ArrayDeque<E>`

Creates an `ArrayDeque` containing the elements of the specified iterable, in the order
 they are returned by the iterable's iterator.
**Since:** 12.0

### `newConcurrentLinkedQueue()`

**Returns:** `java.util.concurrent.ConcurrentLinkedQueue<E>`

Creates an empty `ConcurrentLinkedQueue`.

### `newConcurrentLinkedQueue(`java.lang.Iterable<? extends E>` elements)`

**Returns:** `java.util.concurrent.ConcurrentLinkedQueue<E>`

Creates a `ConcurrentLinkedQueue` containing the elements of the specified iterable, in
 the order they are returned by the iterable's iterator.

### `newLinkedBlockingDeque()`

**Returns:** `java.util.concurrent.LinkedBlockingDeque<E>`

Creates an empty `LinkedBlockingDeque` with a capacity of `Integer.MAX_VALUE`.
**Since:** 12.0

### `newLinkedBlockingDeque(`int` capacity)`

**Returns:** `java.util.concurrent.LinkedBlockingDeque<E>`

Creates an empty `LinkedBlockingDeque` with the given (fixed) capacity.
@throws IllegalArgumentException if `capacity` is less than 1
**Since:** 12.0

### `newLinkedBlockingDeque(`java.lang.Iterable<? extends E>` elements)`

**Returns:** `java.util.concurrent.LinkedBlockingDeque<E>`

Creates a `LinkedBlockingDeque` with a capacity of `Integer.MAX_VALUE`, containing
 the elements of the specified iterable, in the order they are returned by the iterable's
 iterator.
**Since:** 12.0

### `newLinkedBlockingQueue()`

**Returns:** `java.util.concurrent.LinkedBlockingQueue<E>`

Creates an empty `LinkedBlockingQueue` with a capacity of `Integer.MAX_VALUE`.

### `newLinkedBlockingQueue(`int` capacity)`

**Returns:** `java.util.concurrent.LinkedBlockingQueue<E>`

Creates an empty `LinkedBlockingQueue` with the given (fixed) capacity.
@throws IllegalArgumentException if `capacity` is less than 1

### `newLinkedBlockingQueue(`java.lang.Iterable<? extends E>` elements)`

**Returns:** `java.util.concurrent.LinkedBlockingQueue<E>`

Creates a `LinkedBlockingQueue` with a capacity of `Integer.MAX_VALUE`, containing
 the elements of the specified iterable, in the order they are returned by the iterable's
 iterator.
@param elements the elements that the queue should contain, in order
@return a new `LinkedBlockingQueue` containing those elements

### `newPriorityBlockingQueue()`

**Returns:** `java.util.concurrent.PriorityBlockingQueue<E>`

Creates an empty `PriorityBlockingQueue` with the ordering given by its elements' natural
 ordering.
**Since:** 11.0 (but the bound of `E` was changed from `Object` to `Comparable`
     in 15.0)

### `newPriorityBlockingQueue(`java.lang.Iterable<? extends E>` elements)`

**Returns:** `java.util.concurrent.PriorityBlockingQueue<E>`

Creates a `PriorityBlockingQueue` containing the given elements.

 <p><b>Note:</b> If the specified iterable is a `SortedSet` or a `PriorityQueue`,
 this priority queue will be ordered according to the same ordering.
**Since:** 11.0 (but the bound of `E` was changed from `Object` to `Comparable`
     in 15.0)

### `newPriorityQueue()`

**Returns:** `java.util.PriorityQueue<E>`

Creates an empty `PriorityQueue` with the ordering given by its elements' natural
 ordering.
**Since:** 11.0 (but the bound of `E` was changed from `Object` to `Comparable`
     in 15.0)

### `newPriorityQueue(`java.lang.Iterable<? extends E>` elements)`

**Returns:** `java.util.PriorityQueue<E>`

Creates a `PriorityQueue` containing the given elements.

 <p><b>Note:</b> If the specified iterable is a `SortedSet` or a `PriorityQueue`,
 this priority queue will be ordered according to the same ordering.
**Since:** 11.0 (but the bound of `E` was changed from `Object` to `Comparable`
     in 15.0)

### `newSynchronousQueue()`

**Returns:** `java.util.concurrent.SynchronousQueue<E>`

Creates an empty `SynchronousQueue` with nonfair access policy.

### `drain(`java.util.concurrent.BlockingQueue<E>` q, `java.util.Collection<? super E>` buffer, `int` numElements, `java.time.Duration` timeout)`

**Returns:** `int`

Drains the queue as `BlockingQueue.drainTo(Collection, int)`, but if the requested `numElements` elements are not available, it will wait for them up to the specified timeout.
@param q the blocking queue to be drained
@param buffer where to add the transferred elements
@param numElements the number of elements to be waited for
@param timeout how long to wait before giving up
@return the number of elements transferred
@throws InterruptedException if interrupted while waiting
**Since:** 28.0

### `drain(`java.util.concurrent.BlockingQueue<E>` q, `java.util.Collection<? super E>` buffer, `int` numElements, `long` timeout, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `int`

Drains the queue as `BlockingQueue.drainTo(Collection, int)`, but if the requested `numElements` elements are not available, it will wait for them up to the specified timeout.
@param q the blocking queue to be drained
@param buffer where to add the transferred elements
@param numElements the number of elements to be waited for
@param timeout how long to wait before giving up, in units of `unit`
@param unit a `TimeUnit` determining how to interpret the timeout parameter
@return the number of elements transferred
@throws InterruptedException if interrupted while waiting

### `drainUninterruptibly(`java.util.concurrent.BlockingQueue<E>` q, `java.util.Collection<? super E>` buffer, `int` numElements, `java.time.Duration` timeout)`

**Returns:** `int`

Drains the queue as Collection, int, Duration), but with a
 different behavior in case it is interrupted while waiting. In that case, the operation will
 continue as usual, and in the end the thread's interruption status will be set (no `InterruptedException` is thrown).
@param q the blocking queue to be drained
@param buffer where to add the transferred elements
@param numElements the number of elements to be waited for
@param timeout how long to wait before giving up
@return the number of elements transferred
**Since:** 28.0

### `drainUninterruptibly(`java.util.concurrent.BlockingQueue<E>` q, `java.util.Collection<? super E>` buffer, `int` numElements, `long` timeout, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `int`

Drains the queue as Collection, int, long, TimeUnit), but
 with a different behavior in case it is interrupted while waiting. In that case, the operation
 will continue as usual, and in the end the thread's interruption status will be set (no `InterruptedException` is thrown).
@param q the blocking queue to be drained
@param buffer where to add the transferred elements
@param numElements the number of elements to be waited for
@param timeout how long to wait before giving up, in units of `unit`
@param unit a `TimeUnit` determining how to interpret the timeout parameter
@return the number of elements transferred

### `synchronizedQueue(`java.util.Queue<E>` queue)`

**Returns:** `java.util.Queue<E>`

Returns a synchronized (thread-safe) queue backed by the specified queue. In order to guarantee
 serial access, it is critical that <b>all</b> access to the backing queue is accomplished
 through the returned queue.

 <p>It is imperative that the user manually synchronize on the returned queue when accessing the
 queue's iterator:

 <pre>`Queue<E> queue = Queues.synchronizedQueue(MinMaxPriorityQueue.<E>create());
 ...
 queue.add(element);  // Needn't be in synchronized block
 ...
 synchronized (queue) {  // Must synchronize on queue!
   Iterator<E> i = queue.iterator(); // Must be in synchronized block
   while (i.hasNext()) {
     foo(i.next());
   `
 }
 }</pre>

 <p>Failure to follow this advice may result in non-deterministic behavior.

 <p>The returned queue will be serializable if the specified queue is serializable.
@param queue the queue to be wrapped in a synchronized view
@return a synchronized view of the specified queue
**Since:** 14.0

### `synchronizedDeque(`java.util.Deque<E>` deque)`

**Returns:** `java.util.Deque<E>`

Returns a synchronized (thread-safe) deque backed by the specified deque. In order to guarantee
 serial access, it is critical that <b>all</b> access to the backing deque is accomplished
 through the returned deque.

 <p>It is imperative that the user manually synchronize on the returned deque when accessing any
 of the deque's iterators:

 <pre>`Deque<E> deque = Queues.synchronizedDeque(Queues.<E>newArrayDeque());
 ...
 deque.add(element);  // Needn't be in synchronized block
 ...
 synchronized (deque) {  // Must synchronize on deque!
   Iterator<E> i = deque.iterator(); // Must be in synchronized block
   while (i.hasNext()) {
     foo(i.next());
   `
 }
 }</pre>

 <p>Failure to follow this advice may result in non-deterministic behavior.

 <p>The returned deque will be serializable if the specified deque is serializable.
@param deque the deque to be wrapped in a synchronized view
@return a synchronized view of the specified deque
**Since:** 15.0

