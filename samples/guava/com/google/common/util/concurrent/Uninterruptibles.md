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

### `awaitUninterruptibly(java.util.concurrent.CountDownLatch latch)`

**Returns:** `void`

**Parameters:**
- `latch` (`java.util.concurrent.CountDownLatch`)

### `awaitUninterruptibly(java.util.concurrent.CountDownLatch latch, java.time.Duration timeout)`

**Returns:** `boolean`

**Parameters:**
- `latch` (`java.util.concurrent.CountDownLatch`)
- `timeout` (`java.time.Duration`)

### `awaitUninterruptibly(java.util.concurrent.CountDownLatch latch, long timeout, java.util.concurrent.TimeUnit unit)`

**Returns:** `boolean`

**Parameters:**
- `latch` (`java.util.concurrent.CountDownLatch`)
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `awaitUninterruptibly(java.util.concurrent.locks.Condition condition, java.time.Duration timeout)`

**Returns:** `boolean`

**Parameters:**
- `condition` (`java.util.concurrent.locks.Condition`)
- `timeout` (`java.time.Duration`)

### `awaitUninterruptibly(java.util.concurrent.locks.Condition condition, long timeout, java.util.concurrent.TimeUnit unit)`

**Returns:** `boolean`

**Parameters:**
- `condition` (`java.util.concurrent.locks.Condition`)
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `joinUninterruptibly(java.lang.Thread toJoin)`

**Returns:** `void`

**Parameters:**
- `toJoin` (`java.lang.Thread`)

### `joinUninterruptibly(java.lang.Thread toJoin, java.time.Duration timeout)`

**Returns:** `void`

**Parameters:**
- `toJoin` (`java.lang.Thread`)
- `timeout` (`java.time.Duration`)

### `joinUninterruptibly(java.lang.Thread toJoin, long timeout, java.util.concurrent.TimeUnit unit)`

**Returns:** `void`

**Parameters:**
- `toJoin` (`java.lang.Thread`)
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `getUninterruptibly(java.util.concurrent.Future<V> future)`

**Returns:** `V`

Similar methods:

 

   - To retrieve a result from a Future that is already done, use Futures.getDone.
   - To treat InterruptedException uniformly with other exceptions, use Futures.getChecked.
   - To get uninterruptibility and remove checked exceptions, use Futures#getUnchecked.

**Parameters:**
- `future` (`java.util.concurrent.Future<V>`)

### `getUninterruptibly(java.util.concurrent.Future<V> future, java.time.Duration timeout)`

**Returns:** `V`

Similar methods:

 

   - To retrieve a result from a Future that is already done, use Futures.getDone.
   - To treat InterruptedException uniformly with other exceptions, use Futures.getChecked.
   - To get uninterruptibility and remove checked exceptions, use Futures#getUnchecked.

**Parameters:**
- `future` (`java.util.concurrent.Future<V>`)
- `timeout` (`java.time.Duration`)

### `getUninterruptibly(java.util.concurrent.Future<V> future, long timeout, java.util.concurrent.TimeUnit unit)`

**Returns:** `V`

Similar methods:

 

   - To retrieve a result from a Future that is already done, use Futures.getDone.
   - To treat InterruptedException uniformly with other exceptions, use Futures.getChecked.
   - To get uninterruptibility and remove checked exceptions, use Futures#getUnchecked.

**Parameters:**
- `future` (`java.util.concurrent.Future<V>`)
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `takeUninterruptibly(java.util.concurrent.BlockingQueue<E> queue)`

**Returns:** `E`

**Parameters:**
- `queue` (`java.util.concurrent.BlockingQueue<E>`)

### `putUninterruptibly(java.util.concurrent.BlockingQueue<E> queue, E element)`

**Returns:** `void`

**Parameters:**
- `queue` (`java.util.concurrent.BlockingQueue<E>`)
- `element` (`E`)

### `sleepUninterruptibly(java.time.Duration sleepFor)`

**Returns:** `void`

**Parameters:**
- `sleepFor` (`java.time.Duration`)

### `sleepUninterruptibly(long sleepFor, java.util.concurrent.TimeUnit unit)`

**Returns:** `void`

**Parameters:**
- `sleepFor` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `tryAcquireUninterruptibly(java.util.concurrent.Semaphore semaphore, java.time.Duration timeout)`

**Returns:** `boolean`

**Parameters:**
- `semaphore` (`java.util.concurrent.Semaphore`)
- `timeout` (`java.time.Duration`)

### `tryAcquireUninterruptibly(java.util.concurrent.Semaphore semaphore, long timeout, java.util.concurrent.TimeUnit unit)`

**Returns:** `boolean`

**Parameters:**
- `semaphore` (`java.util.concurrent.Semaphore`)
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `tryAcquireUninterruptibly(java.util.concurrent.Semaphore semaphore, int permits, java.time.Duration timeout)`

**Returns:** `boolean`

**Parameters:**
- `semaphore` (`java.util.concurrent.Semaphore`)
- `permits` (`int`)
- `timeout` (`java.time.Duration`)

### `tryAcquireUninterruptibly(java.util.concurrent.Semaphore semaphore, int permits, long timeout, java.util.concurrent.TimeUnit unit)`

**Returns:** `boolean`

**Parameters:**
- `semaphore` (`java.util.concurrent.Semaphore`)
- `permits` (`int`)
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `tryLockUninterruptibly(java.util.concurrent.locks.Lock lock, java.time.Duration timeout)`

**Returns:** `boolean`

**Parameters:**
- `lock` (`java.util.concurrent.locks.Lock`)
- `timeout` (`java.time.Duration`)

### `tryLockUninterruptibly(java.util.concurrent.locks.Lock lock, long timeout, java.util.concurrent.TimeUnit unit)`

**Returns:** `boolean`

**Parameters:**
- `lock` (`java.util.concurrent.locks.Lock`)
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `awaitTerminationUninterruptibly(java.util.concurrent.ExecutorService executor)`

**Returns:** `void`

**Parameters:**
- `executor` (`java.util.concurrent.ExecutorService`)

### `awaitTerminationUninterruptibly(java.util.concurrent.ExecutorService executor, java.time.Duration timeout)`

**Returns:** `boolean`

**Parameters:**
- `executor` (`java.util.concurrent.ExecutorService`)
- `timeout` (`java.time.Duration`)

### `awaitTerminationUninterruptibly(java.util.concurrent.ExecutorService executor, long timeout, java.util.concurrent.TimeUnit unit)`

**Returns:** `boolean`

**Parameters:**
- `executor` (`java.util.concurrent.ExecutorService`)
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

