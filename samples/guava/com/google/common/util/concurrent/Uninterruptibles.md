# Class: `Uninterruptibles`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.Uninterruptibles`

## Description

Utilities for treating interruptible operations as uninterruptible. In all cases, if a thread is
 interrupted during such a call, the call continues to block until the result is available or the
 timeout elapses, and only then re-interrupts the thread.
@author Anthony Zana
@since 10.0

## Constructors

### `<init>()`

## Methods

### `awaitUninterruptibly([`java.util.concurrent.CountDownLatch`](../../../../../java/util/concurrent/CountDownLatch.md) latch)`

**Returns:** `void`

Invokes {@code latch.}{@link CountDownLatch#await() await()} uninterruptibly.

### `awaitUninterruptibly([`java.util.concurrent.CountDownLatch`](../../../../../java/util/concurrent/CountDownLatch.md) latch, [`java.time.Duration`](../../../../../java/time/Duration.md) timeout)`

**Returns:** `boolean`

Invokes {@code latch.}{@link CountDownLatch#await(long, TimeUnit) await(timeout, unit)}
 uninterruptibly.
@since 28.0

### `awaitUninterruptibly([`java.util.concurrent.CountDownLatch`](../../../../../java/util/concurrent/CountDownLatch.md) latch, `long` timeout, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** `boolean`

Invokes {@code latch.}{@link CountDownLatch#await(long, TimeUnit) await(timeout, unit)}
 uninterruptibly.

### `awaitUninterruptibly([`java.util.concurrent.locks.Condition`](../../../../../java/util/concurrent/locks/Condition.md) condition, [`java.time.Duration`](../../../../../java/time/Duration.md) timeout)`

**Returns:** `boolean`

Invokes {@code condition.}{@link Condition#await(long, TimeUnit) await(timeout, unit)}
 uninterruptibly.
@since 28.0

### `awaitUninterruptibly([`java.util.concurrent.locks.Condition`](../../../../../java/util/concurrent/locks/Condition.md) condition, `long` timeout, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** `boolean`

Invokes {@code condition.}{@link Condition#await(long, TimeUnit) await(timeout, unit)}
 uninterruptibly.
@since 23.6

### `joinUninterruptibly(`java.lang.Thread` toJoin)`

**Returns:** `void`

Invokes {@code toJoin.}{@link Thread#join() join()} uninterruptibly.

### `joinUninterruptibly(`java.lang.Thread` toJoin, [`java.time.Duration`](../../../../../java/time/Duration.md) timeout)`

**Returns:** `void`

Invokes {@code unit.}{@link TimeUnit#timedJoin(Thread, long) timedJoin(toJoin, timeout)}
 uninterruptibly.
@since 28.0

### `joinUninterruptibly(`java.lang.Thread` toJoin, `long` timeout, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** `void`

Invokes {@code unit.}{@link TimeUnit#timedJoin(Thread, long) timedJoin(toJoin, timeout)}
 uninterruptibly.

### `getUninterruptibly([`java.util.concurrent.Future<V>`](../../../../../java/util/concurrent/Future.md) future)`

**Returns:** [`V`](V.md)

Invokes {@code future.}{@link Future#get() get()} uninterruptibly.

 <p>Similar methods:

 <ul>
   <li>To retrieve a result from a {@code Future} that is already done, use {@link Futures#getDone Futures.getDone}.
   <li>To treat {@link InterruptedException} uniformly with other exceptions, use {@link Futures#getChecked(Future, Class) Futures.getChecked}.
   <li>To get uninterruptibility and remove checked exceptions, use {@link Futures#getUnchecked}.
 </ul>
@throws ExecutionException if the computation threw an exception
@throws CancellationException if the computation was cancelled

### `getUninterruptibly([`java.util.concurrent.Future<V>`](../../../../../java/util/concurrent/Future.md) future, [`java.time.Duration`](../../../../../java/time/Duration.md) timeout)`

**Returns:** [`V`](V.md)

Invokes {@code future.}{@link Future#get(long, TimeUnit) get(timeout, unit)} uninterruptibly.

 <p>Similar methods:

 <ul>
   <li>To retrieve a result from a {@code Future} that is already done, use {@link Futures#getDone Futures.getDone}.
   <li>To treat {@link InterruptedException} uniformly with other exceptions, use {@link Futures#getChecked(Future, Class, long, TimeUnit) Futures.getChecked}.
   <li>To get uninterruptibility and remove checked exceptions, use {@link Futures#getUnchecked}.
 </ul>
@throws ExecutionException if the computation threw an exception
@throws CancellationException if the computation was cancelled
@throws TimeoutException if the wait timed out
@since 28.0

### `getUninterruptibly([`java.util.concurrent.Future<V>`](../../../../../java/util/concurrent/Future.md) future, `long` timeout, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** [`V`](V.md)

Invokes {@code future.}{@link Future#get(long, TimeUnit) get(timeout, unit)} uninterruptibly.

 <p>Similar methods:

 <ul>
   <li>To retrieve a result from a {@code Future} that is already done, use {@link Futures#getDone Futures.getDone}.
   <li>To treat {@link InterruptedException} uniformly with other exceptions, use {@link Futures#getChecked(Future, Class, long, TimeUnit) Futures.getChecked}.
   <li>To get uninterruptibility and remove checked exceptions, use {@link Futures#getUnchecked}.
 </ul>
@throws ExecutionException if the computation threw an exception
@throws CancellationException if the computation was cancelled
@throws TimeoutException if the wait timed out

### `takeUninterruptibly([`java.util.concurrent.BlockingQueue<E>`](../../../../../java/util/concurrent/BlockingQueue.md) queue)`

**Returns:** [`E`](E.md)

Invokes {@code queue.}{@link BlockingQueue#take() take()} uninterruptibly.

### `putUninterruptibly([`java.util.concurrent.BlockingQueue<E>`](../../../../../java/util/concurrent/BlockingQueue.md) queue, [`E`](E.md) element)`

**Returns:** `void`

Invokes {@code queue.}{@link BlockingQueue#put(Object) put(element)} uninterruptibly.
@throws ClassCastException if the class of the specified element prevents it from being added
     to the given queue
@throws IllegalArgumentException if some property of the specified element prevents it from
     being added to the given queue

### `sleepUninterruptibly([`java.time.Duration`](../../../../../java/time/Duration.md) sleepFor)`

**Returns:** `void`

Invokes {@code unit.}{@link TimeUnit#sleep(long) sleep(sleepFor)} uninterruptibly.
@since 28.0

### `sleepUninterruptibly(`long` sleepFor, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** `void`

Invokes {@code unit.}{@link TimeUnit#sleep(long) sleep(sleepFor)} uninterruptibly.

### `tryAcquireUninterruptibly([`java.util.concurrent.Semaphore`](../../../../../java/util/concurrent/Semaphore.md) semaphore, [`java.time.Duration`](../../../../../java/time/Duration.md) timeout)`

**Returns:** `boolean`

Invokes {@code semaphore.}{@link Semaphore#tryAcquire(int, long, TimeUnit) tryAcquire(1,
 timeout, unit)} uninterruptibly.
@since 28.0

### `tryAcquireUninterruptibly([`java.util.concurrent.Semaphore`](../../../../../java/util/concurrent/Semaphore.md) semaphore, `long` timeout, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** `boolean`

Invokes {@code semaphore.}{@link Semaphore#tryAcquire(int, long, TimeUnit) tryAcquire(1,
 timeout, unit)} uninterruptibly.
@since 18.0

### `tryAcquireUninterruptibly([`java.util.concurrent.Semaphore`](../../../../../java/util/concurrent/Semaphore.md) semaphore, `int` permits, [`java.time.Duration`](../../../../../java/time/Duration.md) timeout)`

**Returns:** `boolean`

Invokes {@code semaphore.}{@link Semaphore#tryAcquire(int, long, TimeUnit) tryAcquire(permits,
 timeout, unit)} uninterruptibly.
@since 28.0

### `tryAcquireUninterruptibly([`java.util.concurrent.Semaphore`](../../../../../java/util/concurrent/Semaphore.md) semaphore, `int` permits, `long` timeout, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** `boolean`

Invokes {@code semaphore.}{@link Semaphore#tryAcquire(int, long, TimeUnit) tryAcquire(permits,
 timeout, unit)} uninterruptibly.
@since 18.0

### `tryLockUninterruptibly([`java.util.concurrent.locks.Lock`](../../../../../java/util/concurrent/locks/Lock.md) lock, [`java.time.Duration`](../../../../../java/time/Duration.md) timeout)`

**Returns:** `boolean`

Invokes {@code lock.}{@link Lock#tryLock(long, TimeUnit) tryLock(timeout, unit)}
 uninterruptibly.
@since 30.0

### `tryLockUninterruptibly([`java.util.concurrent.locks.Lock`](../../../../../java/util/concurrent/locks/Lock.md) lock, `long` timeout, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** `boolean`

Invokes {@code lock.}{@link Lock#tryLock(long, TimeUnit) tryLock(timeout, unit)}
 uninterruptibly.
@since 30.0

### `awaitTerminationUninterruptibly([`java.util.concurrent.ExecutorService`](../../../../../java/util/concurrent/ExecutorService.md) executor)`

**Returns:** `void`

Invokes {@code executor.}{@link ExecutorService#awaitTermination(long, TimeUnit) awaitTermination(long, TimeUnit)} uninterruptibly with no timeout.
@since 30.0

### `awaitTerminationUninterruptibly([`java.util.concurrent.ExecutorService`](../../../../../java/util/concurrent/ExecutorService.md) executor, [`java.time.Duration`](../../../../../java/time/Duration.md) timeout)`

**Returns:** `boolean`

Invokes {@code executor.}{@link ExecutorService#awaitTermination(long, TimeUnit) awaitTermination(long, TimeUnit)} uninterruptibly.
@since 30.0

### `awaitTerminationUninterruptibly([`java.util.concurrent.ExecutorService`](../../../../../java/util/concurrent/ExecutorService.md) executor, `long` timeout, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** `boolean`

Invokes {@code executor.}{@link ExecutorService#awaitTermination(long, TimeUnit) awaitTermination(long, TimeUnit)} uninterruptibly.
@since 30.0

