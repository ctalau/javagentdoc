# Class: `AbstractFuture`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.AbstractFuture`

**Extends:** [`com.google.common.util.concurrent.internal.InternalFutureFailureAccess`](internal/InternalFutureFailureAccess.md)

**Implements:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

## Type Parameters

- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

An abstract implementation of `ListenableFuture`, intended for advanced users only. More
 common ways to create a `ListenableFuture` include instantiating a `SettableFuture`,
 submitting a task to a `ListeningExecutorService`, and deriving a `Future` from an
 existing one, typically using methods like `Futures.transform(ListenableFuture,
 com.google.common.base.Function, java.util.concurrent.Executor) Futures.transform` and `Futures.catching(ListenableFuture, Class, com.google.common.base.Function,
 java.util.concurrent.Executor) Futures.catching`.

 <p>This class implements all methods in `ListenableFuture`. Subclasses should provide a way
 to set the result of the computation through the protected methods `set(Object)`, `setFuture(ListenableFuture)` and `setException(Throwable)`. Subclasses may also override
 `afterDone()`, which will be invoked automatically when the future completes. Subclasses
 should rarely override other methods.
**Author:** Sven Mawson
**Author:** Luke Sandberg
**Since:** 1.0

## Fields

### `GENERATE_CANCELLATION_CAUSES`

**Type:** `boolean`

### `log`

**Type:** [`com.google.common.util.concurrent.LazyLogger`](./LazyLogger.md)

### `SPIN_THRESHOLD_NANOS`

**Type:** `long`

### `ATOMIC_HELPER`

**Type:** [`com.google.common.util.concurrent.AbstractFuture.AtomicHelper`](AbstractFuture/AtomicHelper.md)

### `NULL`

**Type:** `java.lang.Object`

A special value to represent `null`.

### `value`

**Type:** `java.lang.Object`

This field encodes the current state of the future.

 <p>The valid values are:

 <ul>
   <li>`null` initial state, nothing has happened.
   <li>`Cancellation` terminal state, `cancel` was called.
   <li>`Failure` terminal state, `setException` was called.
   <li>`SetFuture` intermediate state, `setFuture` was called.
   <li>`NULL` terminal state, `set(null)` was called.
   <li>Any other non-null value, terminal state, `set` was called with a non-null
       argument.
 </ul>

### `listeners`

**Type:** [`com.google.common.util.concurrent.AbstractFuture.Listener`](AbstractFuture/Listener.md)

All listeners.

### `waiters`

**Type:** [`com.google.common.util.concurrent.AbstractFuture.Waiter`](AbstractFuture/Waiter.md)

All waiting threads.

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `removeWaiter([`com.google.common.util.concurrent.AbstractFuture.Waiter`](AbstractFuture/Waiter.md) node)`

**Returns:** `void`

Marks the given node as 'deleted' (null waiter) and then scans the list to unlink all deleted
 nodes. This is an O(n) operation in the common case (and O(n^2) in the worst), but we are saved
 by two things.

 <ul>
   <li>This is only called when a waiting thread times out or is interrupted. Both of which
       should be rare.
   <li>The waiters list should be very short.
 </ul>

### `get(`long` timeout, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `V`

{@inheritDoc}

 <p>The default `AbstractFuture` implementation throws `InterruptedException` if the
 current thread is interrupted during the call, even if the value is already available.
@throws CancellationException {@inheritDoc}

### `get()`

**Returns:** `V`

{@inheritDoc}

 <p>The default `AbstractFuture` implementation throws `InterruptedException` if the
 current thread is interrupted during the call, even if the value is already available.
@throws CancellationException {@inheritDoc}

### `getDoneValue(`java.lang.Object` obj)`

**Returns:** `V`

Unboxes `obj`. Assumes that obj is not `null` or a `SetFuture`.

### `isDone()`

**Returns:** `boolean`

### `isCancelled()`

**Returns:** `boolean`

### `cancel(`boolean` mayInterruptIfRunning)`

**Returns:** `boolean`

{@inheritDoc}

 <p>If a cancellation attempt succeeds on a `Future` that had previously been set asynchronously, then the cancellation will also be propagated to the delegate
 `Future` that was supplied in the `setFuture` call.

 <p>Rather than override this method to perform additional cancellation work or cleanup,
 subclasses should override `afterDone`, consulting `isCancelled` and `wasInterrupted` as necessary. This ensures that the work is done even if the future is
 cancelled without a call to `cancel`, such as by calling `setFuture(cancelledFuture)`.

 <p>Beware of completing a future while holding a lock. Its listeners may do slow work or
 acquire other locks, risking deadlocks.

### `interruptTask()`

**Returns:** `void`

Subclasses can override this method to implement interruption of the future's computation. The
 method is invoked automatically by a successful call to `cancel(boolean) cancel(true)`.

 <p>The default implementation does nothing.

 <p>This method is likely to be deprecated. Prefer to override `afterDone`, checking
 `wasInterrupted` to decide whether to interrupt your task.
**Since:** 10.0

### `wasInterrupted()`

**Returns:** `boolean`

Returns true if this future was cancelled with `mayInterruptIfRunning` set to `true`.
**Since:** 14.0

### `addListener(`java.lang.Runnable` listener, `java.util.concurrent.Executor` executor)`

**Returns:** `void`

{@inheritDoc}
**Since:** 10.0

### `set(`V` value)`

**Returns:** `boolean`

Sets the result of this `Future` unless this `Future` has already been cancelled or
 set (including set asynchronously). When a call to this method returns,
 the `Future` is guaranteed to be done <b>only if</b> the call was
 accepted (in which case it returns `true`). If it returns `false`, the `Future` may have previously been set asynchronously, in which case its result may not be known
 yet. That result, though not yet known, cannot be overridden by a call to a `set*`
 method, only by a call to `cancel`.

 <p>Beware of completing a future while holding a lock. Its listeners may do slow work or
 acquire other locks, risking deadlocks.
@param value the value to be used as the result
@return true if the attempt was accepted, completing the `Future`

### `setException(`java.lang.Throwable` throwable)`

**Returns:** `boolean`

Sets the failed result of this `Future` unless this `Future` has already been
 cancelled or set (including set asynchronously). When a call to this
 method returns, the `Future` is guaranteed to be done <b>only if</b>
 the call was accepted (in which case it returns `true`). If it returns `false`, the
 `Future` may have previously been set asynchronously, in which case its result may not be
 known yet. That result, though not yet known, cannot be overridden by a call to a `set*`
 method, only by a call to `cancel`.

 <p>Beware of completing a future while holding a lock. Its listeners may do slow work or
 acquire other locks, risking deadlocks.
@param throwable the exception to be used as the failed result
@return true if the attempt was accepted, completing the `Future`

### `setFuture([`com.google.common.util.concurrent.ListenableFuture<? extends V>`](./ListenableFuture.md) future)`

**Returns:** `boolean`

Sets the result of this `Future` to match the supplied input `Future` once the
 supplied `Future` is done, unless this `Future` has already been cancelled or set
 (including "set asynchronously," defined below).

 <p>If the supplied future is done when this method is called and the call
 is accepted, then this future is guaranteed to have been completed with the supplied future by
 the time this method returns. If the supplied future is not done and the call is accepted, then
 the future will be <i>set asynchronously</i>. Note that such a result, though not yet known,
 cannot be overridden by a call to a `set*` method, only by a call to `cancel`.

 <p>If the call `setFuture(delegate)` is accepted and this `Future` is later
 cancelled, cancellation will be propagated to `delegate`. Additionally, any call to
 `setFuture` after any cancellation will propagate cancellation to the supplied `Future`.

 <p>Note that, even if the supplied future is cancelled and it causes this future to complete,
 it will never trigger interruption behavior. In particular, it will not cause this future to
 invoke the `interruptTask` method, and the `wasInterrupted` method will not
 return `true`.

 <p>Beware of completing a future while holding a lock. Its listeners may do slow work or
 acquire other locks, risking deadlocks.
@param future the future to delegate to
@return true if the attempt was accepted, indicating that the `Future` was not previously
     cancelled or set.
**Since:** 19.0

### `getFutureValue([`com.google.common.util.concurrent.ListenableFuture<?>`](./ListenableFuture.md) future)`

**Returns:** `java.lang.Object`

Returns a value that satisfies the contract of the `value` field based on the state of
 given future.

 <p>This is approximately the inverse of `getDoneValue(Object)`

### `getUninterruptibly(`java.util.concurrent.Future<V>` future)`

**Returns:** `V`

An inlined private copy of `Uninterruptibles.getUninterruptibly` used to break an
 internal dependency on other /util/concurrent classes.

### `complete([`com.google.common.util.concurrent.AbstractFuture<?>`](./AbstractFuture.md) param, `boolean` callInterruptTask)`

**Returns:** `void`

Unblocks all threads and runs all listeners.

### `afterDone()`

**Returns:** `void`

Callback method that is called exactly once after the future is completed.

 <p>If `interruptTask` is also run during completion, `afterDone` runs after it.

 <p>The default implementation of this method in `AbstractFuture` does nothing. This is
 intended for very lightweight cleanup work, for example, timing statistics or clearing fields.
 If your task does anything heavier consider, just using a listener with an executor.
**Since:** 20.0

### `tryInternalFastPathGetFailure()`

**Returns:** `java.lang.Throwable`

Usually returns `null` but, if this `Future` has failed, may <i>optionally</i>
 return the cause of the failure. "Failure" means specifically "completed with an exception"; it
 does not include "was cancelled." To be explicit: If this method returns a non-null value,
 then:

 <ul>
   <li>`isDone()` must return `true`
   <li>`isCancelled()` must return `false`
   <li>`get()` must not block, and it must throw an `ExecutionException` with the
       return value of this method as its cause
 </ul>

 <p>This method is `protected` so that classes like `com.google.common.util.concurrent.SettableFuture` do not expose it to their users as an
 instance method. In the unlikely event that you need to call this method, call `InternalFutures.tryInternalFastPathGetFailure(InternalFutureFailureAccess)`.
**Since:** 27.0

### `maybePropagateCancellationTo(`java.util.concurrent.Future<?>` related)`

**Returns:** `void`

If this future has been cancelled (and possibly interrupted), cancels (and possibly interrupts)
 the given future (if available).

### `releaseWaiters()`

**Returns:** `void`

Releases all threads in the `waiters` list, and clears the list.

### `clearListeners([`com.google.common.util.concurrent.AbstractFuture.Listener`](AbstractFuture/Listener.md) onto)`

**Returns:** [`com.google.common.util.concurrent.AbstractFuture.Listener`](AbstractFuture/Listener.md)

Clears the `listeners` list and prepends its contents to `onto`, least recently
 added first.

### `toString()`

**Returns:** `java.lang.String`

### `pendingToString()`

**Returns:** `java.lang.String`

Provide a human-readable explanation of why this future has not yet completed.
@return null if an explanation cannot be provided (e.g. because the future is done).
**Since:** 23.0

### `addPendingString(`java.lang.StringBuilder` builder)`

**Returns:** `void`

### `addDoneString(`java.lang.StringBuilder` builder)`

**Returns:** `void`

### `appendResultObject(`java.lang.StringBuilder` builder, `java.lang.Object` o)`

**Returns:** `void`

Any object can be the result of a Future, and not every object has a reasonable toString()
 implementation. Using a reconstruction of the default Object.toString() prevents OOMs and stack
 overflows, and helps avoid sensitive data inadvertently ending up in exception messages.

### `appendUserObject(`java.lang.StringBuilder` builder, `java.lang.Object` o)`

**Returns:** `void`

Helper for printing user supplied objects into our toString method.

### `executeListener(`java.lang.Runnable` runnable, `java.util.concurrent.Executor` executor)`

**Returns:** `void`

Submits the given runnable to the given `Executor` catching and logging all runtime exceptions thrown by the executor.

### `cancellationExceptionWithCause(`java.lang.String` message, `java.lang.Throwable` cause)`

**Returns:** `java.util.concurrent.CancellationException`

