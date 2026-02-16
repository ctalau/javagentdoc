# Class: `Queues`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Queues`

## Description

Static utility methods pertaining to {@link Queue} and {@link Deque} instances. Also see this
 class's counterparts {@link Lists}, {@link Sets}, and {@link Maps}.
@author Kurt Alfred Kluever
@since 11.0

## Constructors

### `<init>()`

## Methods

### `newArrayBlockingQueue(`int` capacity)`

**Returns:** [`java.util.concurrent.ArrayBlockingQueue<E>`](../../../../java/util/concurrent/ArrayBlockingQueue.md)

Creates an empty {@code ArrayBlockingQueue} with the given (fixed) capacity and nonfair access
 policy.

### `newArrayDeque()`

**Returns:** [`java.util.ArrayDeque<E>`](../../../../java/util/ArrayDeque.md)

Creates an empty {@code ArrayDeque}.
@since 12.0

### `newArrayDeque(`java.lang.Iterable<? extends E>` elements)`

**Returns:** [`java.util.ArrayDeque<E>`](../../../../java/util/ArrayDeque.md)

Creates an {@code ArrayDeque} containing the elements of the specified iterable, in the order
 they are returned by the iterable's iterator.
@since 12.0

### `newConcurrentLinkedQueue()`

**Returns:** [`java.util.concurrent.ConcurrentLinkedQueue<E>`](../../../../java/util/concurrent/ConcurrentLinkedQueue.md)

Creates an empty {@code ConcurrentLinkedQueue}.

### `newConcurrentLinkedQueue(`java.lang.Iterable<? extends E>` elements)`

**Returns:** [`java.util.concurrent.ConcurrentLinkedQueue<E>`](../../../../java/util/concurrent/ConcurrentLinkedQueue.md)

Creates a {@code ConcurrentLinkedQueue} containing the elements of the specified iterable, in
 the order they are returned by the iterable's iterator.

### `newLinkedBlockingDeque()`

**Returns:** [`java.util.concurrent.LinkedBlockingDeque<E>`](../../../../java/util/concurrent/LinkedBlockingDeque.md)

Creates an empty {@code LinkedBlockingDeque} with a capacity of {@link Integer#MAX_VALUE}.
@since 12.0

### `newLinkedBlockingDeque(`int` capacity)`

**Returns:** [`java.util.concurrent.LinkedBlockingDeque<E>`](../../../../java/util/concurrent/LinkedBlockingDeque.md)

Creates an empty {@code LinkedBlockingDeque} with the given (fixed) capacity.
@throws IllegalArgumentException if {@code capacity} is less than 1
@since 12.0

### `newLinkedBlockingDeque(`java.lang.Iterable<? extends E>` elements)`

**Returns:** [`java.util.concurrent.LinkedBlockingDeque<E>`](../../../../java/util/concurrent/LinkedBlockingDeque.md)

Creates a {@code LinkedBlockingDeque} with a capacity of {@link Integer#MAX_VALUE}, containing
 the elements of the specified iterable, in the order they are returned by the iterable's
 iterator.
@since 12.0

### `newLinkedBlockingQueue()`

**Returns:** [`java.util.concurrent.LinkedBlockingQueue<E>`](../../../../java/util/concurrent/LinkedBlockingQueue.md)

Creates an empty {@code LinkedBlockingQueue} with a capacity of {@link Integer#MAX_VALUE}.

### `newLinkedBlockingQueue(`int` capacity)`

**Returns:** [`java.util.concurrent.LinkedBlockingQueue<E>`](../../../../java/util/concurrent/LinkedBlockingQueue.md)

Creates an empty {@code LinkedBlockingQueue} with the given (fixed) capacity.
@throws IllegalArgumentException if {@code capacity} is less than 1

### `newLinkedBlockingQueue(`java.lang.Iterable<? extends E>` elements)`

**Returns:** [`java.util.concurrent.LinkedBlockingQueue<E>`](../../../../java/util/concurrent/LinkedBlockingQueue.md)

Creates a {@code LinkedBlockingQueue} with a capacity of {@link Integer#MAX_VALUE}, containing
 the elements of the specified iterable, in the order they are returned by the iterable's
 iterator.
@param elements the elements that the queue should contain, in order
@return a new {@code LinkedBlockingQueue} containing those elements

### `newPriorityBlockingQueue()`

**Returns:** [`java.util.concurrent.PriorityBlockingQueue<E>`](../../../../java/util/concurrent/PriorityBlockingQueue.md)

Creates an empty {@code PriorityBlockingQueue} with the ordering given by its elements' natural
 ordering.
@since 11.0 (but the bound of {@code E} was changed from {@code Object} to {@code Comparable}
     in 15.0)

### `newPriorityBlockingQueue(`java.lang.Iterable<? extends E>` elements)`

**Returns:** [`java.util.concurrent.PriorityBlockingQueue<E>`](../../../../java/util/concurrent/PriorityBlockingQueue.md)

Creates a {@code PriorityBlockingQueue} containing the given elements.

 <p><b>Note:</b> If the specified iterable is a {@code SortedSet} or a {@code PriorityQueue},
 this priority queue will be ordered according to the same ordering.
@since 11.0 (but the bound of {@code E} was changed from {@code Object} to {@code Comparable}
     in 15.0)

### `newPriorityQueue()`

**Returns:** [`java.util.PriorityQueue<E>`](../../../../java/util/PriorityQueue.md)

Creates an empty {@code PriorityQueue} with the ordering given by its elements' natural
 ordering.
@since 11.0 (but the bound of {@code E} was changed from {@code Object} to {@code Comparable}
     in 15.0)

### `newPriorityQueue(`java.lang.Iterable<? extends E>` elements)`

**Returns:** [`java.util.PriorityQueue<E>`](../../../../java/util/PriorityQueue.md)

Creates a {@code PriorityQueue} containing the given elements.

 <p><b>Note:</b> If the specified iterable is a {@code SortedSet} or a {@code PriorityQueue},
 this priority queue will be ordered according to the same ordering.
@since 11.0 (but the bound of {@code E} was changed from {@code Object} to {@code Comparable}
     in 15.0)

### `newSynchronousQueue()`

**Returns:** [`java.util.concurrent.SynchronousQueue<E>`](../../../../java/util/concurrent/SynchronousQueue.md)

Creates an empty {@code SynchronousQueue} with nonfair access policy.

### `drain([`java.util.concurrent.BlockingQueue<E>`](../../../../java/util/concurrent/BlockingQueue.md) q, [`java.util.Collection<? super E>`](../../../../java/util/Collection.md) buffer, `int` numElements, [`java.time.Duration`](../../../../java/time/Duration.md) timeout)`

**Returns:** `int`

Drains the queue as {@link BlockingQueue#drainTo(Collection, int)}, but if the requested {@code
 numElements} elements are not available, it will wait for them up to the specified timeout.
@param q the blocking queue to be drained
@param buffer where to add the transferred elements
@param numElements the number of elements to be waited for
@param timeout how long to wait before giving up
@return the number of elements transferred
@throws InterruptedException if interrupted while waiting
@since 28.0

### `drain([`java.util.concurrent.BlockingQueue<E>`](../../../../java/util/concurrent/BlockingQueue.md) q, [`java.util.Collection<? super E>`](../../../../java/util/Collection.md) buffer, `int` numElements, `long` timeout, [`java.util.concurrent.TimeUnit`](../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** `int`

Drains the queue as {@link BlockingQueue#drainTo(Collection, int)}, but if the requested {@code
 numElements} elements are not available, it will wait for them up to the specified timeout.
@param q the blocking queue to be drained
@param buffer where to add the transferred elements
@param numElements the number of elements to be waited for
@param timeout how long to wait before giving up, in units of {@code unit}
@param unit a {@code TimeUnit} determining how to interpret the timeout parameter
@return the number of elements transferred
@throws InterruptedException if interrupted while waiting

### `drainUninterruptibly([`java.util.concurrent.BlockingQueue<E>`](../../../../java/util/concurrent/BlockingQueue.md) q, [`java.util.Collection<? super E>`](../../../../java/util/Collection.md) buffer, `int` numElements, [`java.time.Duration`](../../../../java/time/Duration.md) timeout)`

**Returns:** `int`

Drains the queue as {@linkplain #drain(BlockingQueue, Collection, int, Duration)}, but with a
 different behavior in case it is interrupted while waiting. In that case, the operation will
 continue as usual, and in the end the thread's interruption status will be set (no {@code
 InterruptedException} is thrown).
@param q the blocking queue to be drained
@param buffer where to add the transferred elements
@param numElements the number of elements to be waited for
@param timeout how long to wait before giving up
@return the number of elements transferred
@since 28.0

### `drainUninterruptibly([`java.util.concurrent.BlockingQueue<E>`](../../../../java/util/concurrent/BlockingQueue.md) q, [`java.util.Collection<? super E>`](../../../../java/util/Collection.md) buffer, `int` numElements, `long` timeout, [`java.util.concurrent.TimeUnit`](../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** `int`

Drains the queue as {@linkplain #drain(BlockingQueue, Collection, int, long, TimeUnit)}, but
 with a different behavior in case it is interrupted while waiting. In that case, the operation
 will continue as usual, and in the end the thread's interruption status will be set (no {@code
 InterruptedException} is thrown).
@param q the blocking queue to be drained
@param buffer where to add the transferred elements
@param numElements the number of elements to be waited for
@param timeout how long to wait before giving up, in units of {@code unit}
@param unit a {@code TimeUnit} determining how to interpret the timeout parameter
@return the number of elements transferred

### `synchronizedQueue([`java.util.Queue<E>`](../../../../java/util/Queue.md) queue)`

**Returns:** [`java.util.Queue<E>`](../../../../java/util/Queue.md)

Returns a synchronized (thread-safe) queue backed by the specified queue. In order to guarantee
 serial access, it is critical that <b>all</b> access to the backing queue is accomplished
 through the returned queue.

 <p>It is imperative that the user manually synchronize on the returned queue when accessing the
 queue's iterator:

 <pre>{@code
 Queue<E> queue = Queues.synchronizedQueue(MinMaxPriorityQueue.<E>create());
 ...
 queue.add(element);  // Needn't be in synchronized block
 ...
 synchronized (queue) {  // Must synchronize on queue!
   Iterator<E> i = queue.iterator(); // Must be in synchronized block
   while (i.hasNext()) {
     foo(i.next());
   }
 }
 }</pre>

 <p>Failure to follow this advice may result in non-deterministic behavior.

 <p>The returned queue will be serializable if the specified queue is serializable.
@param queue the queue to be wrapped in a synchronized view
@return a synchronized view of the specified queue
@since 14.0

### `synchronizedDeque([`java.util.Deque<E>`](../../../../java/util/Deque.md) deque)`

**Returns:** [`java.util.Deque<E>`](../../../../java/util/Deque.md)

Returns a synchronized (thread-safe) deque backed by the specified deque. In order to guarantee
 serial access, it is critical that <b>all</b> access to the backing deque is accomplished
 through the returned deque.

 <p>It is imperative that the user manually synchronize on the returned deque when accessing any
 of the deque's iterators:

 <pre>{@code
 Deque<E> deque = Queues.synchronizedDeque(Queues.<E>newArrayDeque());
 ...
 deque.add(element);  // Needn't be in synchronized block
 ...
 synchronized (deque) {  // Must synchronize on deque!
   Iterator<E> i = deque.iterator(); // Must be in synchronized block
   while (i.hasNext()) {
     foo(i.next());
   }
 }
 }</pre>

 <p>Failure to follow this advice may result in non-deterministic behavior.

 <p>The returned deque will be serializable if the specified deque is serializable.
@param deque the deque to be wrapped in a synchronized view
@return a synchronized view of the specified deque
@since 15.0

