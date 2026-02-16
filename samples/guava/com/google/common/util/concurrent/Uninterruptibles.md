# Class: `Uninterruptibles`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.Uninterruptibles`

## Description

Utilities for treating interruptible operations as uninterruptible. In all cases, if a thread is
 interrupted during such a call, the call continues to block until the result is available or the
 timeout elapses, and only then re-interrupts the thread.
**Author:** Anthony Zana
**Since:** 10.0

## Constructors

### `<init>()`

## Methods

### `awaitUninterruptibly(`java.util.concurrent.CountDownLatch` latch)`

**Returns:** `void`

Invokes `latch.``CountDownLatch.await() await()` uninterruptibly.

### `awaitUninterruptibly(`java.util.concurrent.CountDownLatch` latch, `java.time.Duration` timeout)`

**Returns:** `boolean`

Invokes `latch.``CountDownLatch.await(long, TimeUnit) await(timeout, unit)`
 uninterruptibly.
**Since:** 28.0

### `awaitUninterruptibly(`java.util.concurrent.CountDownLatch` latch, `long` timeout, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `boolean`

Invokes `latch.``CountDownLatch.await(long, TimeUnit) await(timeout, unit)`
 uninterruptibly.

### `awaitUninterruptibly(`java.util.concurrent.locks.Condition` condition, `java.time.Duration` timeout)`

**Returns:** `boolean`

Invokes `condition.``Condition.await(long, TimeUnit) await(timeout, unit)`
 uninterruptibly.
**Since:** 28.0

### `awaitUninterruptibly(`java.util.concurrent.locks.Condition` condition, `long` timeout, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `boolean`

Invokes `condition.``Condition.await(long, TimeUnit) await(timeout, unit)`
 uninterruptibly.
**Since:** 23.6

### `joinUninterruptibly(`java.lang.Thread` toJoin)`

**Returns:** `void`

Invokes `toJoin.``Thread.join() join()` uninterruptibly.

### `joinUninterruptibly(`java.lang.Thread` toJoin, `java.time.Duration` timeout)`

**Returns:** `void`

Invokes `unit.``TimeUnit.timedJoin(Thread, long) timedJoin(toJoin, timeout)`
 uninterruptibly.
**Since:** 28.0

### `joinUninterruptibly(`java.lang.Thread` toJoin, `long` timeout, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `void`

Invokes `unit.``TimeUnit.timedJoin(Thread, long) timedJoin(toJoin, timeout)`
 uninterruptibly.

### `getUninterruptibly(`java.util.concurrent.Future<V>` future)`

**Returns:** `V`

Invokes `future.``Future.get() get()` uninterruptibly.

 <p>Similar methods:

 <ul>
   <li>To retrieve a result from a `Future` that is already done, use `Futures.getDone Futures.getDone`.
   <li>To treat `InterruptedException` uniformly with other exceptions, use `Futures.getChecked(Future, Class) Futures.getChecked`.
   <li>To get uninterruptibility and remove checked exceptions, use `Futures.getUnchecked`.
 </ul>
@throws ExecutionException if the computation threw an exception
@throws CancellationException if the computation was cancelled

### `getUninterruptibly(`java.util.concurrent.Future<V>` future, `java.time.Duration` timeout)`

**Returns:** `V`

Invokes `future.``Future.get(long, TimeUnit) get(timeout, unit)` uninterruptibly.

 <p>Similar methods:

 <ul>
   <li>To retrieve a result from a `Future` that is already done, use `Futures.getDone Futures.getDone`.
   <li>To treat `InterruptedException` uniformly with other exceptions, use `Futures.getChecked(Future, Class, long, TimeUnit) Futures.getChecked`.
   <li>To get uninterruptibility and remove checked exceptions, use `Futures.getUnchecked`.
 </ul>
@throws ExecutionException if the computation threw an exception
@throws CancellationException if the computation was cancelled
@throws TimeoutException if the wait timed out
**Since:** 28.0

### `getUninterruptibly(`java.util.concurrent.Future<V>` future, `long` timeout, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `V`

Invokes `future.``Future.get(long, TimeUnit) get(timeout, unit)` uninterruptibly.

 <p>Similar methods:

 <ul>
   <li>To retrieve a result from a `Future` that is already done, use `Futures.getDone Futures.getDone`.
   <li>To treat `InterruptedException` uniformly with other exceptions, use `Futures.getChecked(Future, Class, long, TimeUnit) Futures.getChecked`.
   <li>To get uninterruptibility and remove checked exceptions, use `Futures.getUnchecked`.
 </ul>
@throws ExecutionException if the computation threw an exception
@throws CancellationException if the computation was cancelled
@throws TimeoutException if the wait timed out

### `takeUninterruptibly(`java.util.concurrent.BlockingQueue<E>` queue)`

**Returns:** `E`

Invokes `queue.``BlockingQueue.take() take()` uninterruptibly.

### `putUninterruptibly(`java.util.concurrent.BlockingQueue<E>` queue, `E` element)`

**Returns:** `void`

Invokes `queue.``BlockingQueue.put(Object) put(element)` uninterruptibly.
@throws ClassCastException if the class of the specified element prevents it from being added
     to the given queue
@throws IllegalArgumentException if some property of the specified element prevents it from
     being added to the given queue

### `sleepUninterruptibly(`java.time.Duration` sleepFor)`

**Returns:** `void`

Invokes `unit.``TimeUnit.sleep(long) sleep(sleepFor)` uninterruptibly.
**Since:** 28.0

### `sleepUninterruptibly(`long` sleepFor, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `void`

Invokes `unit.``TimeUnit.sleep(long) sleep(sleepFor)` uninterruptibly.

### `tryAcquireUninterruptibly(`java.util.concurrent.Semaphore` semaphore, `java.time.Duration` timeout)`

**Returns:** `boolean`

Invokes `semaphore.``Semaphore.tryAcquire(int, long, TimeUnit) tryAcquire(1,
 timeout, unit)` uninterruptibly.
**Since:** 28.0

### `tryAcquireUninterruptibly(`java.util.concurrent.Semaphore` semaphore, `long` timeout, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `boolean`

Invokes `semaphore.``Semaphore.tryAcquire(int, long, TimeUnit) tryAcquire(1,
 timeout, unit)` uninterruptibly.
**Since:** 18.0

### `tryAcquireUninterruptibly(`java.util.concurrent.Semaphore` semaphore, `int` permits, `java.time.Duration` timeout)`

**Returns:** `boolean`

Invokes `semaphore.``Semaphore.tryAcquire(int, long, TimeUnit) tryAcquire(permits,
 timeout, unit)` uninterruptibly.
**Since:** 28.0

### `tryAcquireUninterruptibly(`java.util.concurrent.Semaphore` semaphore, `int` permits, `long` timeout, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `boolean`

Invokes `semaphore.``Semaphore.tryAcquire(int, long, TimeUnit) tryAcquire(permits,
 timeout, unit)` uninterruptibly.
**Since:** 18.0

### `tryLockUninterruptibly(`java.util.concurrent.locks.Lock` lock, `java.time.Duration` timeout)`

**Returns:** `boolean`

Invokes `lock.``Lock.tryLock(long, TimeUnit) tryLock(timeout, unit)`
 uninterruptibly.
**Since:** 30.0

### `tryLockUninterruptibly(`java.util.concurrent.locks.Lock` lock, `long` timeout, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `boolean`

Invokes `lock.``Lock.tryLock(long, TimeUnit) tryLock(timeout, unit)`
 uninterruptibly.
**Since:** 30.0

### `awaitTerminationUninterruptibly(`java.util.concurrent.ExecutorService` executor)`

**Returns:** `void`

Invokes `executor.``ExecutorService.awaitTermination(long, TimeUnit) awaitTermination(long, TimeUnit)` uninterruptibly with no timeout.
**Since:** 30.0

### `awaitTerminationUninterruptibly(`java.util.concurrent.ExecutorService` executor, `java.time.Duration` timeout)`

**Returns:** `boolean`

Invokes `executor.``ExecutorService.awaitTermination(long, TimeUnit) awaitTermination(long, TimeUnit)` uninterruptibly.
**Since:** 30.0

### `awaitTerminationUninterruptibly(`java.util.concurrent.ExecutorService` executor, `long` timeout, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `boolean`

Invokes `executor.``ExecutorService.awaitTermination(long, TimeUnit) awaitTermination(long, TimeUnit)` uninterruptibly.
**Since:** 30.0

