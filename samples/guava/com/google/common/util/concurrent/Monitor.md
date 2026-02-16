# Class: `Monitor`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.Monitor`

## Description

A synchronization abstraction supporting waiting on arbitrary boolean conditions.

 <p>This class is intended as a replacement for {@link ReentrantLock}. Code using {@code Monitor}
 is less error-prone and more readable than code using {@code ReentrantLock}, without significant
 performance loss. {@code Monitor} even has the potential for performance gain by optimizing the
 evaluation and signaling of conditions. Signaling is entirely <a href="http://en.wikipedia.org/wiki/Monitor_(synchronization)#Implicit_signaling">implicit</a>. By
 eliminating explicit signaling, this class can guarantee that only one thread is awakened when a
 condition becomes true (no "signaling storms" due to use of {@link java.util.concurrent.locks.Condition#signalAll Condition.signalAll}) and that no signals are lost
 (no "hangs" due to incorrect use of {@link java.util.concurrent.locks.Condition#signal Condition.signal}).

 <p>A thread is said to <i>occupy</i> a monitor if it has <i>entered</i> the monitor but not yet
 <i>left</i>. Only one thread may occupy a given monitor at any moment. A monitor is also
 reentrant, so a thread may enter a monitor any number of times, and then must leave the same
 number of times. The <i>enter</i> and <i>leave</i> operations have the same synchronization
 semantics as the built-in Java language synchronization primitives.

 <p>A call to any of the <i>enter</i> methods with <b>void</b> return type should always be
 followed immediately by a <i>try/finally</i> block to ensure that the current thread leaves the
 monitor cleanly:

 <pre>{@code
 monitor.enter();
 try {
   // do things while occupying the monitor
 } finally {
   monitor.leave();
 }
 }</pre>

 <p>A call to any of the <i>enter</i> methods with <b>boolean</b> return type should always appear
 as the condition of an <i>if</i> statement containing a <i>try/finally</i> block to ensure that
 the current thread leaves the monitor cleanly:

 <pre>{@code
 if (monitor.tryEnter()) {
   try {
     // do things while occupying the monitor
   } finally {
     monitor.leave();
   }
 } else {
   // do other things since the monitor was not available
 }
 }</pre>

 <h2>Comparison with {@code synchronized} and {@code ReentrantLock}</h2>

 <p>The following examples show a simple threadsafe holder expressed using {@code synchronized},
 {@link ReentrantLock}, and {@code Monitor}.

 <h3>{@code synchronized}</h3>

 <p>This version is the fewest lines of code, largely because the synchronization mechanism used
 is built into the language and runtime. But the programmer has to remember to avoid a couple of
 common bugs: The {@code wait()} must be inside a {@code while} instead of an {@code if}, and
 {@code notifyAll()} must be used instead of {@code notify()} because there are two different
 logical conditions being awaited.

 <pre>{@code
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
 }</pre>

 <h3>{@code ReentrantLock}</h3>

 <p>This version is much more verbose than the {@code synchronized} version, and still suffers
 from the need for the programmer to remember to use {@code while} instead of {@code if}. However,
 one advantage is that we can introduce two separate {@code Condition} objects, which allows us to
 use {@code signal()} instead of {@code signalAll()}, which may be a performance benefit.

 <pre>{@code
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
 }</pre>

 <h3>{@code Monitor}</h3>

 <p>This version adds some verbosity around the {@code Guard} objects, but removes that same
 verbosity, and more, from the {@code get} and {@code set} methods. {@code Monitor} implements the
 same efficient signaling as we had to hand-code in the {@code ReentrantLock} version above.
 Finally, the programmer no longer has to hand-code the wait loop, and therefore doesn't have to
 remember to use {@code while} instead of {@code if}.

 <pre>{@code
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
 }</pre>
@author Justin T. Sampson
@author Martin Buchholz
@since 10.0

## Fields

### `fair`

**Type:** `boolean`

Whether this monitor is fair.

### `lock`

**Type:** [`java.util.concurrent.locks.ReentrantLock`](../../../../../java/util/concurrent/locks/ReentrantLock.md)

The lock underlying this monitor.

### `activeGuards`

**Type:** [`com.google.common.util.concurrent.Monitor.Guard`](Monitor/Guard.md)

The guards associated with this monitor that currently have waiters ({@code waiterCount > 0}).
 A linked list threaded through the Guard.next field.

## Constructors

### `<init>()`

Creates a monitor with a non-fair (but fast) ordering policy. Equivalent to {@code
 Monitor(false)}.

### `<init>(`boolean` fair)`

Creates a monitor with the given ordering policy.
@param fair whether this monitor should use a fair ordering policy rather than a non-fair (but
     fast) one

## Methods

### `newGuard([`java.util.function.BooleanSupplier`](../../../../../java/util/function/BooleanSupplier.md) isSatisfied)`

**Returns:** [`com.google.common.util.concurrent.Monitor.Guard`](Monitor/Guard.md)

Creates a new {@linkplain Guard guard} for this monitor.
@param isSatisfied the new guard's boolean condition (see {@link Guard#isSatisfied isSatisfied()})
@since 21.0

### `enter()`

**Returns:** `void`

Enters this monitor. Blocks indefinitely.

### `enter([`java.time.Duration`](../../../../../java/time/Duration.md) time)`

**Returns:** `boolean`

Enters this monitor. Blocks at most the given time.
@return whether the monitor was entered
@since 28.0

### `enter(`long` time, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** `boolean`

Enters this monitor. Blocks at most the given time.
@return whether the monitor was entered

### `enterInterruptibly()`

**Returns:** `void`

Enters this monitor. Blocks indefinitely, but may be interrupted.
@throws InterruptedException if interrupted while waiting

### `enterInterruptibly([`java.time.Duration`](../../../../../java/time/Duration.md) time)`

**Returns:** `boolean`

Enters this monitor. Blocks at most the given time, and may be interrupted.
@return whether the monitor was entered
@throws InterruptedException if interrupted while waiting
@since 28.0

### `enterInterruptibly(`long` time, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** `boolean`

Enters this monitor. Blocks at most the given time, and may be interrupted.
@return whether the monitor was entered
@throws InterruptedException if interrupted while waiting

### `tryEnter()`

**Returns:** `boolean`

Enters this monitor if it is possible to do so immediately. Does not block.

 <p><b>Note:</b> This method disregards the fairness setting of this monitor.
@return whether the monitor was entered

### `enterWhen([`com.google.common.util.concurrent.Monitor.Guard`](Monitor/Guard.md) guard)`

**Returns:** `void`

Enters this monitor when the guard is satisfied. Blocks indefinitely, but may be interrupted.
@throws InterruptedException if interrupted while waiting

### `enterWhen([`com.google.common.util.concurrent.Monitor.Guard`](Monitor/Guard.md) guard, [`java.time.Duration`](../../../../../java/time/Duration.md) time)`

**Returns:** `boolean`

Enters this monitor when the guard is satisfied. Blocks at most the given time, including both
 the time to acquire the lock and the time to wait for the guard to be satisfied, and may be
 interrupted.
@return whether the monitor was entered, which guarantees that the guard is now satisfied
@throws InterruptedException if interrupted while waiting
@since 28.0

### `enterWhen([`com.google.common.util.concurrent.Monitor.Guard`](Monitor/Guard.md) guard, `long` time, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** `boolean`

Enters this monitor when the guard is satisfied. Blocks at most the given time, including both
 the time to acquire the lock and the time to wait for the guard to be satisfied, and may be
 interrupted.
@return whether the monitor was entered, which guarantees that the guard is now satisfied
@throws InterruptedException if interrupted while waiting

### `enterWhenUninterruptibly([`com.google.common.util.concurrent.Monitor.Guard`](Monitor/Guard.md) guard)`

**Returns:** `void`

Enters this monitor when the guard is satisfied. Blocks indefinitely.

### `enterWhenUninterruptibly([`com.google.common.util.concurrent.Monitor.Guard`](Monitor/Guard.md) guard, [`java.time.Duration`](../../../../../java/time/Duration.md) time)`

**Returns:** `boolean`

Enters this monitor when the guard is satisfied. Blocks at most the given time, including both
 the time to acquire the lock and the time to wait for the guard to be satisfied.
@return whether the monitor was entered, which guarantees that the guard is now satisfied
@since 28.0

### `enterWhenUninterruptibly([`com.google.common.util.concurrent.Monitor.Guard`](Monitor/Guard.md) guard, `long` time, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** `boolean`

Enters this monitor when the guard is satisfied. Blocks at most the given time, including both
 the time to acquire the lock and the time to wait for the guard to be satisfied.
@return whether the monitor was entered, which guarantees that the guard is now satisfied

### `enterIf([`com.google.common.util.concurrent.Monitor.Guard`](Monitor/Guard.md) guard)`

**Returns:** `boolean`

Enters this monitor if the guard is satisfied. Blocks indefinitely acquiring the lock, but does
 not wait for the guard to be satisfied.
@return whether the monitor was entered, which guarantees that the guard is now satisfied

### `enterIf([`com.google.common.util.concurrent.Monitor.Guard`](Monitor/Guard.md) guard, [`java.time.Duration`](../../../../../java/time/Duration.md) time)`

**Returns:** `boolean`

Enters this monitor if the guard is satisfied. Blocks at most the given time acquiring the
 lock, but does not wait for the guard to be satisfied.
@return whether the monitor was entered, which guarantees that the guard is now satisfied
@since 28.0

### `enterIf([`com.google.common.util.concurrent.Monitor.Guard`](Monitor/Guard.md) guard, `long` time, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** `boolean`

Enters this monitor if the guard is satisfied. Blocks at most the given time acquiring the
 lock, but does not wait for the guard to be satisfied.
@return whether the monitor was entered, which guarantees that the guard is now satisfied

### `enterIfInterruptibly([`com.google.common.util.concurrent.Monitor.Guard`](Monitor/Guard.md) guard)`

**Returns:** `boolean`

Enters this monitor if the guard is satisfied. Blocks indefinitely acquiring the lock, but does
 not wait for the guard to be satisfied, and may be interrupted.
@return whether the monitor was entered, which guarantees that the guard is now satisfied
@throws InterruptedException if interrupted while waiting

### `enterIfInterruptibly([`com.google.common.util.concurrent.Monitor.Guard`](Monitor/Guard.md) guard, [`java.time.Duration`](../../../../../java/time/Duration.md) time)`

**Returns:** `boolean`

Enters this monitor if the guard is satisfied. Blocks at most the given time acquiring the
 lock, but does not wait for the guard to be satisfied, and may be interrupted.
@return whether the monitor was entered, which guarantees that the guard is now satisfied
@since 28.0

### `enterIfInterruptibly([`com.google.common.util.concurrent.Monitor.Guard`](Monitor/Guard.md) guard, `long` time, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** `boolean`

Enters this monitor if the guard is satisfied. Blocks at most the given time acquiring the
 lock, but does not wait for the guard to be satisfied, and may be interrupted.
@return whether the monitor was entered, which guarantees that the guard is now satisfied

### `tryEnterIf([`com.google.common.util.concurrent.Monitor.Guard`](Monitor/Guard.md) guard)`

**Returns:** `boolean`

Enters this monitor if it is possible to do so immediately and the guard is satisfied. Does not
 block acquiring the lock and does not wait for the guard to be satisfied.

 <p><b>Note:</b> This method disregards the fairness setting of this monitor.
@return whether the monitor was entered, which guarantees that the guard is now satisfied

### `waitFor([`com.google.common.util.concurrent.Monitor.Guard`](Monitor/Guard.md) guard)`

**Returns:** `void`

Waits for the guard to be satisfied. Waits indefinitely, but may be interrupted. May be called
 only by a thread currently occupying this monitor.
@throws InterruptedException if interrupted while waiting

### `waitFor([`com.google.common.util.concurrent.Monitor.Guard`](Monitor/Guard.md) guard, [`java.time.Duration`](../../../../../java/time/Duration.md) time)`

**Returns:** `boolean`

Waits for the guard to be satisfied. Waits at most the given time, and may be interrupted. May
 be called only by a thread currently occupying this monitor.
@return whether the guard is now satisfied
@throws InterruptedException if interrupted while waiting
@since 28.0

### `waitFor([`com.google.common.util.concurrent.Monitor.Guard`](Monitor/Guard.md) guard, `long` time, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** `boolean`

Waits for the guard to be satisfied. Waits at most the given time, and may be interrupted. May
 be called only by a thread currently occupying this monitor.
@return whether the guard is now satisfied
@throws InterruptedException if interrupted while waiting

### `waitForUninterruptibly([`com.google.common.util.concurrent.Monitor.Guard`](Monitor/Guard.md) guard)`

**Returns:** `void`

Waits for the guard to be satisfied. Waits indefinitely. May be called only by a thread
 currently occupying this monitor.

### `waitForUninterruptibly([`com.google.common.util.concurrent.Monitor.Guard`](Monitor/Guard.md) guard, [`java.time.Duration`](../../../../../java/time/Duration.md) time)`

**Returns:** `boolean`

Waits for the guard to be satisfied. Waits at most the given time. May be called only by a
 thread currently occupying this monitor.
@return whether the guard is now satisfied
@since 28.0

### `waitForUninterruptibly([`com.google.common.util.concurrent.Monitor.Guard`](Monitor/Guard.md) guard, `long` time, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** `boolean`

Waits for the guard to be satisfied. Waits at most the given time. May be called only by a
 thread currently occupying this monitor.
@return whether the guard is now satisfied

### `leave()`

**Returns:** `void`

Leaves this monitor. May be called only by a thread currently occupying this monitor.

### `isFair()`

**Returns:** `boolean`

Returns whether this monitor is using a fair ordering policy.

### `isOccupied()`

**Returns:** `boolean`

Returns whether this monitor is occupied by any thread. This method is designed for use in
 monitoring of the system state, not for synchronization control.

### `isOccupiedByCurrentThread()`

**Returns:** `boolean`

Returns whether the current thread is occupying this monitor (has entered more times than it
 has left).

### `getOccupiedDepth()`

**Returns:** `int`

Returns the number of times the current thread has entered this monitor in excess of the number
 of times it has left. Returns 0 if the current thread is not occupying this monitor.

### `getQueueLength()`

**Returns:** `int`

Returns an estimate of the number of threads waiting to enter this monitor. The value is only
 an estimate because the number of threads may change dynamically while this method traverses
 internal data structures. This method is designed for use in monitoring of the system state,
 not for synchronization control.

### `hasQueuedThreads()`

**Returns:** `boolean`

Returns whether any threads are waiting to enter this monitor. Note that because cancellations
 may occur at any time, a {@code true} return does not guarantee that any other thread will ever
 enter this monitor. This method is designed primarily for use in monitoring of the system
 state.

### `hasQueuedThread(`java.lang.Thread` thread)`

**Returns:** `boolean`

Queries whether the given thread is waiting to enter this monitor. Note that because
 cancellations may occur at any time, a {@code true} return does not guarantee that this thread
 will ever enter this monitor. This method is designed primarily for use in monitoring of the
 system state.

### `hasWaiters([`com.google.common.util.concurrent.Monitor.Guard`](Monitor/Guard.md) guard)`

**Returns:** `boolean`

Queries whether any threads are waiting for the given guard to become satisfied. Note that
 because timeouts and interrupts may occur at any time, a {@code true} return does not guarantee
 that the guard becoming satisfied in the future will awaken any threads. This method is
 designed primarily for use in monitoring of the system state.

### `getWaitQueueLength([`com.google.common.util.concurrent.Monitor.Guard`](Monitor/Guard.md) guard)`

**Returns:** `int`

Returns an estimate of the number of threads waiting for the given guard to become satisfied.
 Note that because timeouts and interrupts may occur at any time, the estimate serves only as an
 upper bound on the actual number of waiters. This method is designed for use in monitoring of
 the system state, not for synchronization control.

### `toSafeNanos(`long` time, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** `long`

Returns unit.toNanos(time), additionally ensuring the returned value is not at risk of
 overflowing or underflowing, by bounding the value between 0 and (Long.MAX_VALUE / 4) * 3.
 Actually waiting for more than 219 years is not supported!

### `initNanoTime(`long` timeoutNanos)`

**Returns:** `long`

Returns System.nanoTime() unless the timeout has already elapsed. Returns 0L if and only if the
 timeout has already elapsed.

### `remainingNanos(`long` startTime, `long` timeoutNanos)`

**Returns:** `long`

Returns the remaining nanos until the given timeout, or 0L if the timeout has already elapsed.
 Caller must have previously sanitized timeoutNanos using toSafeNanos.

### `signalNextWaiter()`

**Returns:** `void`

Signals some other thread waiting on a satisfied guard, if one exists.

 <p>We manage calls to this method carefully, to signal only when necessary, but never losing a
 signal, which is the classic problem of this kind of concurrency construct. We must signal if
 the current thread is about to relinquish the lock and may have changed the state protected by
 the monitor, thereby causing some guard to be satisfied.

 <p>In addition, any thread that has been signalled when its guard was satisfied acquires the
 responsibility of signalling the next thread when it again relinquishes the lock. Unlike a
 normal Condition, there is no guarantee that an interrupted thread has not been signalled,
 since the concurrency control must manage multiple Conditions. So this method must generally be
 called when waits are interrupted.

 <p>On the other hand, if a signalled thread wakes up to discover that its guard is still not
 satisfied, it does *not* need to call this method before returning to wait. This can only
 happen due to spurious wakeup (ignorable) or another thread acquiring the lock before the
 current thread can and returning the guard to the unsatisfied state. In the latter case the
 other thread (last thread modifying the state protected by the monitor) takes over the
 responsibility of signalling the next waiter.

 <p>This method must not be called from within a beginWaitingFor/endWaitingFor block, or else
 the current thread's guard might be mistakenly signalled, leading to a lost signal.

### `isSatisfied([`com.google.common.util.concurrent.Monitor.Guard`](Monitor/Guard.md) guard)`

**Returns:** `boolean`

Exactly like guard.isSatisfied(), but in addition signals all waiting threads in the (hopefully
 unlikely) event that isSatisfied() throws.

### `signalAllWaiters()`

**Returns:** `void`

Signals all threads waiting on guards.

### `beginWaitingFor([`com.google.common.util.concurrent.Monitor.Guard`](Monitor/Guard.md) guard)`

**Returns:** `void`

Records that the current thread is about to wait on the specified guard.

### `endWaitingFor([`com.google.common.util.concurrent.Monitor.Guard`](Monitor/Guard.md) guard)`

**Returns:** `void`

Records that the current thread is no longer waiting on the specified guard.

### `await([`com.google.common.util.concurrent.Monitor.Guard`](Monitor/Guard.md) guard, `boolean` signalBeforeWaiting)`

**Returns:** `void`

### `awaitUninterruptibly([`com.google.common.util.concurrent.Monitor.Guard`](Monitor/Guard.md) guard, `boolean` signalBeforeWaiting)`

**Returns:** `void`

### `awaitNanos([`com.google.common.util.concurrent.Monitor.Guard`](Monitor/Guard.md) guard, `long` nanos, `boolean` signalBeforeWaiting)`

**Returns:** `boolean`

Caller should check before calling that guard is not satisfied.

