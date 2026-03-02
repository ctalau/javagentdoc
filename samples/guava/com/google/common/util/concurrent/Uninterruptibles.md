# Class: `Uninterruptibles`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.Uninterruptibles`

## Description

In all cases, if a thread is
 interrupted during such a call, the call continues to block until the result is available or the
 timeout elapses, and only then re-interrupts the thread.

## Constructors

### `<init>()`

## Methods

### `awaitUninterruptibly(CountDownLatch latch)`

**Parameters:**
- `latch` (`java.util.concurrent.CountDownLatch`)

**Returns:** `void`

### `awaitUninterruptibly(CountDownLatch latch, Duration timeout)`

**Parameters:**
- `latch` (`java.util.concurrent.CountDownLatch`)
- `timeout` (`java.time.Duration`)

**Returns:** `boolean`

### `awaitUninterruptibly(CountDownLatch latch, long timeout, TimeUnit unit)`

**Parameters:**
- `latch` (`java.util.concurrent.CountDownLatch`)
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `boolean`

### `awaitUninterruptibly(Condition condition, Duration timeout)`

**Parameters:**
- `condition` (`java.util.concurrent.locks.Condition`)
- `timeout` (`java.time.Duration`)

**Returns:** `boolean`

### `awaitUninterruptibly(Condition condition, long timeout, TimeUnit unit)`

**Parameters:**
- `condition` (`java.util.concurrent.locks.Condition`)
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `boolean`

### `joinUninterruptibly(Thread toJoin)`

**Parameters:**
- `toJoin` (`java.lang.Thread`)

**Returns:** `void`

### `joinUninterruptibly(Thread toJoin, Duration timeout)`

**Parameters:**
- `toJoin` (`java.lang.Thread`)
- `timeout` (`java.time.Duration`)

**Returns:** `void`

### `joinUninterruptibly(Thread toJoin, long timeout, TimeUnit unit)`

**Parameters:**
- `toJoin` (`java.lang.Thread`)
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `void`

### `getUninterruptibly(Future<V> future)`

Similar methods:

 

   - To retrieve a result from a Future that is already done, use Futures.getDone.
   - To treat InterruptedException uniformly with other exceptions, use Futures.getChecked.
   - To get uninterruptibility and remove checked exceptions, use Futures#getUnchecked.

**Parameters:**
- `future` (`java.util.concurrent.Future<V>`)

**Returns:** `V`

### `getUninterruptibly(Future<V> future, Duration timeout)`

Similar methods:

 

   - To retrieve a result from a Future that is already done, use Futures.getDone.
   - To treat InterruptedException uniformly with other exceptions, use Futures.getChecked.
   - To get uninterruptibility and remove checked exceptions, use Futures#getUnchecked.

**Parameters:**
- `future` (`java.util.concurrent.Future<V>`)
- `timeout` (`java.time.Duration`)

**Returns:** `V`

### `getUninterruptibly(Future<V> future, long timeout, TimeUnit unit)`

Similar methods:

 

   - To retrieve a result from a Future that is already done, use Futures.getDone.
   - To treat InterruptedException uniformly with other exceptions, use Futures.getChecked.
   - To get uninterruptibility and remove checked exceptions, use Futures#getUnchecked.

**Parameters:**
- `future` (`java.util.concurrent.Future<V>`)
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `V`

### `takeUninterruptibly(BlockingQueue<E> queue)`

**Parameters:**
- `queue` (`java.util.concurrent.BlockingQueue<E>`)

**Returns:** `E`

### `putUninterruptibly(BlockingQueue<E> queue, E element)`

**Parameters:**
- `queue` (`java.util.concurrent.BlockingQueue<E>`)
- `element` (`E`)

**Returns:** `void`

### `sleepUninterruptibly(Duration sleepFor)`

**Parameters:**
- `sleepFor` (`java.time.Duration`)

**Returns:** `void`

### `sleepUninterruptibly(long sleepFor, TimeUnit unit)`

**Parameters:**
- `sleepFor` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `void`

### `tryAcquireUninterruptibly(Semaphore semaphore, Duration timeout)`

**Parameters:**
- `semaphore` (`java.util.concurrent.Semaphore`)
- `timeout` (`java.time.Duration`)

**Returns:** `boolean`

### `tryAcquireUninterruptibly(Semaphore semaphore, long timeout, TimeUnit unit)`

**Parameters:**
- `semaphore` (`java.util.concurrent.Semaphore`)
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `boolean`

### `tryAcquireUninterruptibly(Semaphore semaphore, int permits, Duration timeout)`

**Parameters:**
- `semaphore` (`java.util.concurrent.Semaphore`)
- `permits` (`int`)
- `timeout` (`java.time.Duration`)

**Returns:** `boolean`

### `tryAcquireUninterruptibly(Semaphore semaphore, int permits, long timeout, TimeUnit unit)`

**Parameters:**
- `semaphore` (`java.util.concurrent.Semaphore`)
- `permits` (`int`)
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `boolean`

### `tryLockUninterruptibly(Lock lock, Duration timeout)`

**Parameters:**
- `lock` (`java.util.concurrent.locks.Lock`)
- `timeout` (`java.time.Duration`)

**Returns:** `boolean`

### `tryLockUninterruptibly(Lock lock, long timeout, TimeUnit unit)`

**Parameters:**
- `lock` (`java.util.concurrent.locks.Lock`)
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `boolean`

### `awaitTerminationUninterruptibly(ExecutorService executor)`

**Parameters:**
- `executor` (`java.util.concurrent.ExecutorService`)

**Returns:** `void`

### `awaitTerminationUninterruptibly(ExecutorService executor, Duration timeout)`

**Parameters:**
- `executor` (`java.util.concurrent.ExecutorService`)
- `timeout` (`java.time.Duration`)

**Returns:** `boolean`

### `awaitTerminationUninterruptibly(ExecutorService executor, long timeout, TimeUnit unit)`

**Parameters:**
- `executor` (`java.util.concurrent.ExecutorService`)
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `boolean`

