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

### `newGuard(BooleanSupplier isSatisfied)`

**Parameters:**
- `isSatisfied` (`java.util.function.BooleanSupplier`): the new guard's boolean condition (see isSatisfied())

**Returns:** `com.google.common.util.concurrent.Monitor.Guard`

### `enter()`

Blocks indefinitely.

**Returns:** `void`

### `enter(Duration time)`

Blocks at most the given time.

**Parameters:**
- `time` (`java.time.Duration`)

**Returns:** `boolean`

### `enter(long time, TimeUnit unit)`

Blocks at most the given time.

**Parameters:**
- `time` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `boolean`

### `enterInterruptibly()`

Blocks indefinitely, but may be interrupted.

**Returns:** `void`

### `enterInterruptibly(Duration time)`

Blocks at most the given time, and may be interrupted.

**Parameters:**
- `time` (`java.time.Duration`)

**Returns:** `boolean`

### `enterInterruptibly(long time, TimeUnit unit)`

Blocks at most the given time, and may be interrupted.

**Parameters:**
- `time` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `boolean`

### `tryEnter()`

Does not block.

 
**Note:** This method disregards the fairness setting of this monitor.

**Returns:** `boolean`

### `enterWhen(Monitor.Guard guard)`

Blocks indefinitely, but may be interrupted.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)

**Returns:** `void`

### `enterWhen(Monitor.Guard guard, Duration time)`

Blocks at most the given time, including both
 the time to acquire the lock and the time to wait for the guard to be satisfied, and may be
 interrupted.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)
- `time` (`java.time.Duration`)

**Returns:** `boolean`

### `enterWhen(Monitor.Guard guard, long time, TimeUnit unit)`

Blocks at most the given time, including both
 the time to acquire the lock and the time to wait for the guard to be satisfied, and may be
 interrupted.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)
- `time` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `boolean`

### `enterWhenUninterruptibly(Monitor.Guard guard)`

Blocks indefinitely.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)

**Returns:** `void`

### `enterWhenUninterruptibly(Monitor.Guard guard, Duration time)`

Blocks at most the given time, including both
 the time to acquire the lock and the time to wait for the guard to be satisfied.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)
- `time` (`java.time.Duration`)

**Returns:** `boolean`

### `enterWhenUninterruptibly(Monitor.Guard guard, long time, TimeUnit unit)`

Blocks at most the given time, including both
 the time to acquire the lock and the time to wait for the guard to be satisfied.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)
- `time` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `boolean`

### `enterIf(Monitor.Guard guard)`

Blocks indefinitely acquiring the lock, but does
 not wait for the guard to be satisfied.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)

**Returns:** `boolean`

### `enterIf(Monitor.Guard guard, Duration time)`

Blocks at most the given time acquiring the
 lock, but does not wait for the guard to be satisfied.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)
- `time` (`java.time.Duration`)

**Returns:** `boolean`

### `enterIf(Monitor.Guard guard, long time, TimeUnit unit)`

Blocks at most the given time acquiring the
 lock, but does not wait for the guard to be satisfied.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)
- `time` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `boolean`

### `enterIfInterruptibly(Monitor.Guard guard)`

Blocks indefinitely acquiring the lock, but does
 not wait for the guard to be satisfied, and may be interrupted.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)

**Returns:** `boolean`

### `enterIfInterruptibly(Monitor.Guard guard, Duration time)`

Blocks at most the given time acquiring the
 lock, but does not wait for the guard to be satisfied, and may be interrupted.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)
- `time` (`java.time.Duration`)

**Returns:** `boolean`

### `enterIfInterruptibly(Monitor.Guard guard, long time, TimeUnit unit)`

Blocks at most the given time acquiring the
 lock, but does not wait for the guard to be satisfied, and may be interrupted.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)
- `time` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `boolean`

### `tryEnterIf(Monitor.Guard guard)`

Does not
 block acquiring the lock and does not wait for the guard to be satisfied.

 
**Note:** This method disregards the fairness setting of this monitor.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)

**Returns:** `boolean`

### `waitFor(Monitor.Guard guard)`

Waits indefinitely, but may be interrupted. May be called
 only by a thread currently occupying this monitor.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)

**Returns:** `void`

### `waitFor(Monitor.Guard guard, Duration time)`

Waits at most the given time, and may be interrupted. May
 be called only by a thread currently occupying this monitor.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)
- `time` (`java.time.Duration`)

**Returns:** `boolean`

### `waitFor(Monitor.Guard guard, long time, TimeUnit unit)`

Waits at most the given time, and may be interrupted. May
 be called only by a thread currently occupying this monitor.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)
- `time` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `boolean`

### `waitForUninterruptibly(Monitor.Guard guard)`

Waits indefinitely. May be called only by a thread
 currently occupying this monitor.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)

**Returns:** `void`

### `waitForUninterruptibly(Monitor.Guard guard, Duration time)`

Waits at most the given time. May be called only by a
 thread currently occupying this monitor.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)
- `time` (`java.time.Duration`)

**Returns:** `boolean`

### `waitForUninterruptibly(Monitor.Guard guard, long time, TimeUnit unit)`

Waits at most the given time. May be called only by a
 thread currently occupying this monitor.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)
- `time` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `boolean`

### `leave()`

May be called only by a thread currently occupying this monitor.

**Returns:** `void`

### `isFair()`

**Returns:** `boolean`

### `isOccupied()`

This method is designed for use in
 monitoring of the system state, not for synchronization control.

**Returns:** `boolean`

### `isOccupiedByCurrentThread()`

**Returns:** `boolean`

### `getOccupiedDepth()`

Returns 0 if the current thread is not occupying this monitor.

**Returns:** `int`

### `getQueueLength()`

The value is only
 an estimate because the number of threads may change dynamically while this method traverses
 internal data structures. This method is designed for use in monitoring of the system state,
 not for synchronization control.

**Returns:** `int`

### `hasQueuedThreads()`

Note that because cancellations
 may occur at any time, a true return does not guarantee that any other thread will ever
 enter this monitor. This method is designed primarily for use in monitoring of the system
 state.

**Returns:** `boolean`

### `hasQueuedThread(Thread thread)`

Note that because
 cancellations may occur at any time, a true return does not guarantee that this thread
 will ever enter this monitor. This method is designed primarily for use in monitoring of the
 system state.

**Parameters:**
- `thread` (`java.lang.Thread`)

**Returns:** `boolean`

### `hasWaiters(Monitor.Guard guard)`

Note that
 because timeouts and interrupts may occur at any time, a true return does not guarantee
 that the guard becoming satisfied in the future will awaken any threads. This method is
 designed primarily for use in monitoring of the system state.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)

**Returns:** `boolean`

### `getWaitQueueLength(Monitor.Guard guard)`

Note that because timeouts and interrupts may occur at any time, the estimate serves only as an
 upper bound on the actual number of waiters. This method is designed for use in monitoring of
 the system state, not for synchronization control.

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)

**Returns:** `int`

### `toSafeNanos(long time, TimeUnit unit)`

Actually waiting for more than 219 years is not supported!

**Parameters:**
- `time` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `long`

### `initNanoTime(long timeoutNanos)`

Returns 0L if and only if the
 timeout has already elapsed.

**Parameters:**
- `timeoutNanos` (`long`)

**Returns:** `long`

### `remainingNanos(long startTime, long timeoutNanos)`

Caller must have previously sanitized timeoutNanos using toSafeNanos.

**Parameters:**
- `startTime` (`long`)
- `timeoutNanos` (`long`)

**Returns:** `long`

### `signalNextWaiter()`

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

**Returns:** `void`

### `isSatisfied(Monitor.Guard guard)`

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)

**Returns:** `boolean`

### `signalAllWaiters()`

**Returns:** `void`

### `beginWaitingFor(Monitor.Guard guard)`

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)

**Returns:** `void`

### `endWaitingFor(Monitor.Guard guard)`

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)

**Returns:** `void`

### `await(Monitor.Guard guard, boolean signalBeforeWaiting)`

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)
- `signalBeforeWaiting` (`boolean`)

**Returns:** `void`

### `awaitUninterruptibly(Monitor.Guard guard, boolean signalBeforeWaiting)`

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)
- `signalBeforeWaiting` (`boolean`)

**Returns:** `void`

### `awaitNanos(Monitor.Guard guard, long nanos, boolean signalBeforeWaiting)`

**Parameters:**
- `guard` (`com.google.common.util.concurrent.Monitor.Guard`)
- `nanos` (`long`)
- `signalBeforeWaiting` (`boolean`)

**Returns:** `boolean`

