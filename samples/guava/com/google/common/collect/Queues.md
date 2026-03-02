# Class: `Queues`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Queues`

## Description

Also see this
 class's counterparts Lists, Sets, and Maps.

## Constructors

### `<init>()`

## Methods

### `newArrayBlockingQueue(int capacity)`

**Parameters:**
- `capacity` (`int`)

**Returns:** `java.util.concurrent.ArrayBlockingQueue<E>`

### `newArrayDeque()`

**Returns:** `java.util.ArrayDeque<E>`

### `newArrayDeque(Iterable<? extends E> elements)`

**Parameters:**
- `elements` (`java.lang.Iterable<? extends E>`)

**Returns:** `java.util.ArrayDeque<E>`

### `newConcurrentLinkedQueue()`

**Returns:** `java.util.concurrent.ConcurrentLinkedQueue<E>`

### `newConcurrentLinkedQueue(Iterable<? extends E> elements)`

**Parameters:**
- `elements` (`java.lang.Iterable<? extends E>`)

**Returns:** `java.util.concurrent.ConcurrentLinkedQueue<E>`

### `newLinkedBlockingDeque()`

**Returns:** `java.util.concurrent.LinkedBlockingDeque<E>`

### `newLinkedBlockingDeque(int capacity)`

**Parameters:**
- `capacity` (`int`)

**Returns:** `java.util.concurrent.LinkedBlockingDeque<E>`

### `newLinkedBlockingDeque(Iterable<? extends E> elements)`

**Parameters:**
- `elements` (`java.lang.Iterable<? extends E>`)

**Returns:** `java.util.concurrent.LinkedBlockingDeque<E>`

### `newLinkedBlockingQueue()`

**Returns:** `java.util.concurrent.LinkedBlockingQueue<E>`

### `newLinkedBlockingQueue(int capacity)`

**Parameters:**
- `capacity` (`int`)

**Returns:** `java.util.concurrent.LinkedBlockingQueue<E>`

### `newLinkedBlockingQueue(Iterable<? extends E> elements)`

**Parameters:**
- `elements` (`java.lang.Iterable<? extends E>`): the elements that the queue should contain, in order

**Returns:** `java.util.concurrent.LinkedBlockingQueue<E>`

### `newPriorityBlockingQueue()`

**Returns:** `java.util.concurrent.PriorityBlockingQueue<E>`

### `newPriorityBlockingQueue(Iterable<? extends E> elements)`

**Note:** If the specified iterable is a SortedSet or a PriorityQueue,
 this priority queue will be ordered according to the same ordering.

**Parameters:**
- `elements` (`java.lang.Iterable<? extends E>`)

**Returns:** `java.util.concurrent.PriorityBlockingQueue<E>`

### `newPriorityQueue()`

**Returns:** `java.util.PriorityQueue<E>`

### `newPriorityQueue(Iterable<? extends E> elements)`

**Note:** If the specified iterable is a SortedSet or a PriorityQueue,
 this priority queue will be ordered according to the same ordering.

**Parameters:**
- `elements` (`java.lang.Iterable<? extends E>`)

**Returns:** `java.util.PriorityQueue<E>`

### `newSynchronousQueue()`

**Returns:** `java.util.concurrent.SynchronousQueue<E>`

### `drain(BlockingQueue<E> q, Collection<? super E> buffer, int numElements, Duration timeout)`

**Parameters:**
- `q` (`java.util.concurrent.BlockingQueue<E>`): the blocking queue to be drained
- `buffer` (`java.util.Collection<? super E>`): where to add the transferred elements
- `numElements` (`int`): the number of elements to be waited for
- `timeout` (`java.time.Duration`): how long to wait before giving up

**Returns:** `int`

### `drain(BlockingQueue<E> q, Collection<? super E> buffer, int numElements, long timeout, TimeUnit unit)`

**Parameters:**
- `q` (`java.util.concurrent.BlockingQueue<E>`): the blocking queue to be drained
- `buffer` (`java.util.Collection<? super E>`): where to add the transferred elements
- `numElements` (`int`): the number of elements to be waited for
- `timeout` (`long`): how long to wait before giving up, in units of unit
- `unit` (`java.util.concurrent.TimeUnit`): a TimeUnit determining how to interpret the timeout parameter

**Returns:** `int`

### `drainUninterruptibly(BlockingQueue<E> q, Collection<? super E> buffer, int numElements, Duration timeout)`

In that case, the operation will
 continue as usual, and in the end the thread's interruption status will be set (no 
 InterruptedException is thrown).

**Parameters:**
- `q` (`java.util.concurrent.BlockingQueue<E>`): the blocking queue to be drained
- `buffer` (`java.util.Collection<? super E>`): where to add the transferred elements
- `numElements` (`int`): the number of elements to be waited for
- `timeout` (`java.time.Duration`): how long to wait before giving up

**Returns:** `int`

### `drainUninterruptibly(BlockingQueue<E> q, Collection<? super E> buffer, int numElements, long timeout, TimeUnit unit)`

In that case, the operation
 will continue as usual, and in the end the thread's interruption status will be set (no 
 InterruptedException is thrown).

**Parameters:**
- `q` (`java.util.concurrent.BlockingQueue<E>`): the blocking queue to be drained
- `buffer` (`java.util.Collection<? super E>`): where to add the transferred elements
- `numElements` (`int`): the number of elements to be waited for
- `timeout` (`long`): how long to wait before giving up, in units of unit
- `unit` (`java.util.concurrent.TimeUnit`): a TimeUnit determining how to interpret the timeout parameter

**Returns:** `int`

### `synchronizedQueue(Queue<E> queue)`

In order to guarantee
 serial access, it is critical that **all** access to the backing queue is accomplished
 through the returned queue.

 
It is imperative that the user manually synchronize on the returned queue when accessing the
 queue's iterator:

 

```

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
 
```


 
Failure to follow this advice may result in non-deterministic behavior.

 
The returned queue will be serializable if the specified queue is serializable.

**Parameters:**
- `queue` (`java.util.Queue<E>`): the queue to be wrapped in a synchronized view

**Returns:** `java.util.Queue<E>`

### `synchronizedDeque(Deque<E> deque)`

In order to guarantee
 serial access, it is critical that **all** access to the backing deque is accomplished
 through the returned deque.

 
It is imperative that the user manually synchronize on the returned deque when accessing any
 of the deque's iterators:

 

```

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
 
```


 
Failure to follow this advice may result in non-deterministic behavior.

 
The returned deque will be serializable if the specified deque is serializable.

**Parameters:**
- `deque` (`java.util.Deque<E>`): the deque to be wrapped in a synchronized view

**Returns:** `java.util.Deque<E>`

