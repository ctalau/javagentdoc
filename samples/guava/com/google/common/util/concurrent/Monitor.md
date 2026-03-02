# Class: `Monitor`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.Monitor`

## Description

This class is intended as a replacement for ReentrantLock. Code using Monitor
 is less error-prone and more readable than code using ReentrantLock, without significant
 performance loss. Monitor even has the potential for performance gain by optimizing the
 evaluation and signaling of conditions. Signaling is entirely [implicit](http://en.wikipedia.org/wiki/Monitor_(synchronization)#Implicit_signaling). By
 eliminating explicit signaling, this class can guarantee that only one thread is awakened when a
 condition becomes true (no "signaling storms" due to use of Condition.signalAll) and that no signals are lost
 (no "hangs" due to incorrect use of Condition.signal).

 
A thread is said to *occupy* a monitor if it has *entered* the monitor but not yet
 *left*. Only one thread may occupy a given monitor at any moment. A monitor is also
 reentrant, so a thread may enter a monitor any number of times, and then must leave the same
 number of times. The *enter* and *leave* operations have the same synchronization
 semantics as the built-in Java language synchronization primitives.

 
A call to any of the *enter* methods with **void** return type should always be
 followed immediately by a *try/finally* block to ensure that the current thread leaves the
 monitor cleanly:

 

```

 monitor.enter();
 try {
   // do things while occupying the monitor
 } finally {
   monitor.leave();
 }
 
```


 
A call to any of the *enter* methods with **boolean** return type should always appear
 as the condition of an *if* statement containing a *try/finally* block to ensure that
 the current thread leaves the monitor cleanly:

 

```

 if (monitor.tryEnter()) {
   try {
     // do things while occupying the monitor
   } finally {
     monitor.leave();
   }
 } else {
   // do other things since the monitor was not available
 }
 
```


 Comparison with synchronized and ReentrantLock

 
The following examples show a simple threadsafe holder expressed using synchronized,
 ReentrantLock, and Monitor.

 synchronized

 
This version is the fewest lines of code, largely because the synchronization mechanism used
 is built into the language and runtime. But the programmer has to remember to avoid a couple of
 common bugs: The wait() must be inside a while instead of an if, and
 notifyAll() must be used instead of notify() because there are two different
 logical conditions being awaited.

 

```

 public class SafeBox<V> {
   private V value;

   public synchronized V get() throws InterruptedException {
     while (value == null) {
       wait();
     }
     V result = value;
     value = null;
     notifyAll();
     return result;
   }

   public synchronized void set(V newValue) throws InterruptedException {
     while (value != null) {
       wait();
     }
     value = newValue;
     notifyAll();
   }
 }
 
```


 ReentrantLock

 
This version is much more verbose than the synchronized version, and still suffers
 from the need for the programmer to remember to use while instead of if. However,
 one advantage is that we can introduce two separate Condition objects, which allows us to
 use signal() instead of signalAll(), which may be a performance benefit.

 

```

 public class SafeBox<V> {
   private V value;
   private final ReentrantLock lock = new ReentrantLock();
   private final Condition valuePresent = lock.newCondition();
   private final Condition valueAbsent = lock.newCondition();

   public V get() throws InterruptedException {
     lock.lock();
     try {
       while (value == null) {
         valuePresent.await();
       }
       V result = value;
       value = null;
       valueAbsent.signal();
       return result;
     } finally {
       lock.unlock();
     }
   }

   public void set(V newValue) throws InterruptedException {
     lock.lock();
     try {
       while (value != null) {
         valueAbsent.await();
       }
       value = newValue;
       valuePresent.signal();
     } finally {
       lock.unlock();
     }
   }
 }
 
```


 Monitor

 
This version adds some verbosity around the Guard objects, but removes that same
 verbosity, and more, from the get and set methods. Monitor implements the
 same efficient signaling as we had to hand-code in the ReentrantLock version above.
 Finally, the programmer no longer has to hand-code the wait loop, and therefore doesn't have to
 remember to use while instead of if.

 

```

 public class SafeBox<V> {
   private V value;
   private final Monitor monitor = new Monitor();
   private final Monitor.Guard valuePresent = monitor.newGuard(() -> value != null);
   private final Monitor.Guard valueAbsent = monitor.newGuard(() -> value == null);

   public V get() throws InterruptedException {
     monitor.enterWhen(valuePresent);
     try {
       V result = value;
       value = null;
       return result;
     } finally {
       monitor.leave();
     }
   }

   public void set(V newValue) throws InterruptedException {
     monitor.enterWhen(valueAbsent);
     try {
       value = newValue;
     } finally {
       monitor.leave();
     }
   }
 }
 
```

## Fields

### `fair`

**Type:** `boolean`

### `lock`

**Type:** `java.util.concurrent.locks.ReentrantLock`

### `activeGuards`

**Type:** `com.google.common.util.concurrent.Monitor.Guard`

A linked list threaded through the Guard.next field.

## Constructors

### `<init>()`

Equivalent to 
 Monitor(false).

### `<init>(boolean fair)`

**Parameters:**
- `fair` (`boolean`): whether this monitor should use a fair ordering policy rather than a non-fair (but
     fast) one

## Methods

### `newGuard(java.util.function.BooleanSupplier isSatisfied)`

**Returns:** `com.google.common.util.concurrent.Monitor.Guard`

**Parameters:**
- `isSatisfied` (`java.util.function.BooleanSupplier`): the new guard's boolean condition (see isSatisfied())

### `enter()`

**Returns:** `void`

Blocks indefinitely.

### `enter(java.time.Duration time)`

**Returns:** `boolean`

Blocks at most the given time.

**Parameters:**
- `time` (`java.time.Duration`)

### `enter(long time, java.util.concurrent.TimeUnit unit)`

**Returns:** `boolean`

Blocks at most the given time.

**Parameters:**
- `time` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `enterInterruptibly()`

**Returns:** `void`

Blocks indefinitely, but may be interrupted.

### `enterInterruptibly(java.time.Duration time)`

**Returns:** `boolean`

Blocks at most the given time, and may be interrupted.

**Parameters:**
- `time` (`java.time.Duration`)

### `enterInterruptibly(long time, java.util.concurrent.TimeUnit unit)`

**Returns:** `boolean`

Blocks at most the given time, and may be interrupted.

**Parameters:**
- `time` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `tryEnter()`

**Returns:** `boolean`

Does not block.

 
**Note:** This method disregards the fairness setting of this monitor.

### `enterWhen(com.google.common.util.concurrent.Monitor.Guard guard)`

**Returns:** `void`

Blocks indefinitely, but may be interrupted.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)

### `enterWhen(com.google.common.util.concurrent.Monitor.Guard guard, java.time.Duration time)`

**Returns:** `boolean`

Blocks at most the given time, including both
 the time to acquire the lock and the time to wait for the guard to be satisfied, and may be
 interrupted.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)
- `time` (`java.time.Duration`)

### `enterWhen(com.google.common.util.concurrent.Monitor.Guard guard, long time, java.util.concurrent.TimeUnit unit)`

**Returns:** `boolean`

Blocks at most the given time, including both
 the time to acquire the lock and the time to wait for the guard to be satisfied, and may be
 interrupted.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)
- `time` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `enterWhenUninterruptibly(com.google.common.util.concurrent.Monitor.Guard guard)`

**Returns:** `void`

Blocks indefinitely.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)

### `enterWhenUninterruptibly(com.google.common.util.concurrent.Monitor.Guard guard, java.time.Duration time)`

**Returns:** `boolean`

Blocks at most the given time, including both
 the time to acquire the lock and the time to wait for the guard to be satisfied.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)
- `time` (`java.time.Duration`)

### `enterWhenUninterruptibly(com.google.common.util.concurrent.Monitor.Guard guard, long time, java.util.concurrent.TimeUnit unit)`

**Returns:** `boolean`

Blocks at most the given time, including both
 the time to acquire the lock and the time to wait for the guard to be satisfied.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)
- `time` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `enterIf(com.google.common.util.concurrent.Monitor.Guard guard)`

**Returns:** `boolean`

Blocks indefinitely acquiring the lock, but does
 not wait for the guard to be satisfied.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)

### `enterIf(com.google.common.util.concurrent.Monitor.Guard guard, java.time.Duration time)`

**Returns:** `boolean`

Blocks at most the given time acquiring the
 lock, but does not wait for the guard to be satisfied.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)
- `time` (`java.time.Duration`)

### `enterIf(com.google.common.util.concurrent.Monitor.Guard guard, long time, java.util.concurrent.TimeUnit unit)`

**Returns:** `boolean`

Blocks at most the given time acquiring the
 lock, but does not wait for the guard to be satisfied.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)
- `time` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `enterIfInterruptibly(com.google.common.util.concurrent.Monitor.Guard guard)`

**Returns:** `boolean`

Blocks indefinitely acquiring the lock, but does
 not wait for the guard to be satisfied, and may be interrupted.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)

### `enterIfInterruptibly(com.google.common.util.concurrent.Monitor.Guard guard, java.time.Duration time)`

**Returns:** `boolean`

Blocks at most the given time acquiring the
 lock, but does not wait for the guard to be satisfied, and may be interrupted.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)
- `time` (`java.time.Duration`)

### `enterIfInterruptibly(com.google.common.util.concurrent.Monitor.Guard guard, long time, java.util.concurrent.TimeUnit unit)`

**Returns:** `boolean`

Blocks at most the given time acquiring the
 lock, but does not wait for the guard to be satisfied, and may be interrupted.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)
- `time` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `tryEnterIf(com.google.common.util.concurrent.Monitor.Guard guard)`

**Returns:** `boolean`

Does not
 block acquiring the lock and does not wait for the guard to be satisfied.

 
**Note:** This method disregards the fairness setting of this monitor.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)

### `waitFor(com.google.common.util.concurrent.Monitor.Guard guard)`

**Returns:** `void`

Waits indefinitely, but may be interrupted. May be called
 only by a thread currently occupying this monitor.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)

### `waitFor(com.google.common.util.concurrent.Monitor.Guard guard, java.time.Duration time)`

**Returns:** `boolean`

Waits at most the given time, and may be interrupted. May
 be called only by a thread currently occupying this monitor.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)
- `time` (`java.time.Duration`)

### `waitFor(com.google.common.util.concurrent.Monitor.Guard guard, long time, java.util.concurrent.TimeUnit unit)`

**Returns:** `boolean`

Waits at most the given time, and may be interrupted. May
 be called only by a thread currently occupying this monitor.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)
- `time` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `waitForUninterruptibly(com.google.common.util.concurrent.Monitor.Guard guard)`

**Returns:** `void`

Waits indefinitely. May be called only by a thread
 currently occupying this monitor.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)

### `waitForUninterruptibly(com.google.common.util.concurrent.Monitor.Guard guard, java.time.Duration time)`

**Returns:** `boolean`

Waits at most the given time. May be called only by a
 thread currently occupying this monitor.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)
- `time` (`java.time.Duration`)

### `waitForUninterruptibly(com.google.common.util.concurrent.Monitor.Guard guard, long time, java.util.concurrent.TimeUnit unit)`

**Returns:** `boolean`

Waits at most the given time. May be called only by a
 thread currently occupying this monitor.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)
- `time` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `leave()`

**Returns:** `void`

May be called only by a thread currently occupying this monitor.

### `isFair()`

**Returns:** `boolean`

### `isOccupied()`

**Returns:** `boolean`

This method is designed for use in
 monitoring of the system state, not for synchronization control.

### `isOccupiedByCurrentThread()`

**Returns:** `boolean`

### `getOccupiedDepth()`

**Returns:** `int`

Returns 0 if the current thread is not occupying this monitor.

### `getQueueLength()`

**Returns:** `int`

The value is only
 an estimate because the number of threads may change dynamically while this method traverses
 internal data structures. This method is designed for use in monitoring of the system state,
 not for synchronization control.

### `hasQueuedThreads()`

**Returns:** `boolean`

Note that because cancellations
 may occur at any time, a true return does not guarantee that any other thread will ever
 enter this monitor. This method is designed primarily for use in monitoring of the system
 state.

### `hasQueuedThread(java.lang.Thread thread)`

**Returns:** `boolean`

Note that because
 cancellations may occur at any time, a true return does not guarantee that this thread
 will ever enter this monitor. This method is designed primarily for use in monitoring of the
 system state.

**Parameters:**
- `thread` (`java.lang.Thread`)

### `hasWaiters(com.google.common.util.concurrent.Monitor.Guard guard)`

**Returns:** `boolean`

Note that
 because timeouts and interrupts may occur at any time, a true return does not guarantee
 that the guard becoming satisfied in the future will awaken any threads. This method is
 designed primarily for use in monitoring of the system state.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)

### `getWaitQueueLength(com.google.common.util.concurrent.Monitor.Guard guard)`

**Returns:** `int`

Note that because timeouts and interrupts may occur at any time, the estimate serves only as an
 upper bound on the actual number of waiters. This method is designed for use in monitoring of
 the system state, not for synchronization control.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)

### `toSafeNanos(long time, java.util.concurrent.TimeUnit unit)`

**Returns:** `long`

Actually waiting for more than 219 years is not supported!

**Parameters:**
- `time` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `initNanoTime(long timeoutNanos)`

**Returns:** `long`

Returns 0L if and only if the
 timeout has already elapsed.

**Parameters:**
- `timeoutNanos` (`long`)

### `remainingNanos(long startTime, long timeoutNanos)`

**Returns:** `long`

Caller must have previously sanitized timeoutNanos using toSafeNanos.

**Parameters:**
- `startTime` (`long`)
- `timeoutNanos` (`long`)

### `signalNextWaiter()`

**Returns:** `void`

We manage calls to this method carefully, to signal only when necessary, but never losing a
 signal, which is the classic problem of this kind of concurrency construct. We must signal if
 the current thread is about to relinquish the lock and may have changed the state protected by
 the monitor, thereby causing some guard to be satisfied.

 
In addition, any thread that has been signalled when its guard was satisfied acquires the
 responsibility of signalling the next thread when it again relinquishes the lock. Unlike a
 normal Condition, there is no guarantee that an interrupted thread has not been signalled,
 since the concurrency control must manage multiple Conditions. So this method must generally be
 called when waits are interrupted.

 
On the other hand, if a signalled thread wakes up to discover that its guard is still not
 satisfied, it does *not* need to call this method before returning to wait. This can only
 happen due to spurious wakeup (ignorable) or another thread acquiring the lock before the
 current thread can and returning the guard to the unsatisfied state. In the latter case the
 other thread (last thread modifying the state protected by the monitor) takes over the
 responsibility of signalling the next waiter.

 
This method must not be called from within a beginWaitingFor/endWaitingFor block, or else
 the current thread's guard might be mistakenly signalled, leading to a lost signal.

### `isSatisfied(com.google.common.util.concurrent.Monitor.Guard guard)`

**Returns:** `boolean`

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)

### `signalAllWaiters()`

**Returns:** `void`

### `beginWaitingFor(com.google.common.util.concurrent.Monitor.Guard guard)`

**Returns:** `void`

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)

### `endWaitingFor(com.google.common.util.concurrent.Monitor.Guard guard)`

**Returns:** `void`

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)

### `await(com.google.common.util.concurrent.Monitor.Guard guard, boolean signalBeforeWaiting)`

**Returns:** `void`

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)
- `signalBeforeWaiting` (`boolean`)

### `awaitUninterruptibly(com.google.common.util.concurrent.Monitor.Guard guard, boolean signalBeforeWaiting)`

**Returns:** `void`

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)
- `signalBeforeWaiting` (`boolean`)

### `awaitNanos(com.google.common.util.concurrent.Monitor.Guard guard, long nanos, boolean signalBeforeWaiting)`

**Returns:** `boolean`

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)
- `nanos` (`long`)
- `signalBeforeWaiting` (`boolean`)

