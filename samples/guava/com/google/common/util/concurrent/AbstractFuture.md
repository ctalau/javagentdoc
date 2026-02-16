# Class: `AbstractFuture`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.AbstractFuture`

**Extends:** [`com.google.common.util.concurrent.internal.InternalFutureFailureAccess`](internal/InternalFutureFailureAccess.md)

**Implements:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

## Type Parameters

- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

An abstract implementation of {@link ListenableFuture}, intended for advanced users only. More
 common ways to create a {@code ListenableFuture} include instantiating a {@link SettableFuture},
 submitting a task to a {@link ListeningExecutorService}, and deriving a {@code Future} from an
 existing one, typically using methods like {@link Futures#transform(ListenableFuture,
 com.google.common.base.Function, java.util.concurrent.Executor) Futures.transform} and {@link Futures#catching(ListenableFuture, Class, com.google.common.base.Function,
 java.util.concurrent.Executor) Futures.catching}.

 <p>This class implements all methods in {@code ListenableFuture}. Subclasses should provide a way
 to set the result of the computation through the protected methods {@link #set(Object)}, {@link #setFuture(ListenableFuture)} and {@link #setException(Throwable)}. Subclasses may also override
 {@link #afterDone()}, which will be invoked automatically when the future completes. Subclasses
 should rarely override other methods.
@author Sven Mawson
@author Luke Sandberg
@since 1.0

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

A special value to represent {@code null}.

### `value`

**Type:** `java.lang.Object`

This field encodes the current state of the future.

 <p>The valid values are:

 <ul>
   <li>{@code null} initial state, nothing has happened.
   <li>{@link Cancellation} terminal state, {@code cancel} was called.
   <li>{@link Failure} terminal state, {@code setException} was called.
   <li>{@link SetFuture} intermediate state, {@code setFuture} was called.
   <li>{@link #NULL} terminal state, {@code set(null)} was called.
   <li>Any other non-null value, terminal state, {@code set} was called with a non-null
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

### `get(`long` timeout, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** [`V`](V.md)

{@inheritDoc}

 <p>The default {@link AbstractFuture} implementation throws {@code InterruptedException} if the
 current thread is interrupted during the call, even if the value is already available.
@throws CancellationException {@inheritDoc}

### `get()`

**Returns:** [`V`](V.md)

{@inheritDoc}

 <p>The default {@link AbstractFuture} implementation throws {@code InterruptedException} if the
 current thread is interrupted during the call, even if the value is already available.
@throws CancellationException {@inheritDoc}

### `getDoneValue(`java.lang.Object` obj)`

**Returns:** [`V`](V.md)

Unboxes {@code obj}. Assumes that obj is not {@code null} or a {@link SetFuture}.

### `isDone()`

**Returns:** `boolean`

### `isCancelled()`

**Returns:** `boolean`

### `cancel(`boolean` mayInterruptIfRunning)`

**Returns:** `boolean`

{@inheritDoc}

 <p>If a cancellation attempt succeeds on a {@code Future} that had previously been {@linkplain #setFuture set asynchronously}, then the cancellation will also be propagated to the delegate
 {@code Future} that was supplied in the {@code setFuture} call.

 <p>Rather than override this method to perform additional cancellation work or cleanup,
 subclasses should override {@link #afterDone}, consulting {@link #isCancelled} and {@link #wasInterrupted} as necessary. This ensures that the work is done even if the future is
 cancelled without a call to {@code cancel}, such as by calling {@code
 setFuture(cancelledFuture)}.

 <p>Beware of completing a future while holding a lock. Its listeners may do slow work or
 acquire other locks, risking deadlocks.

### `interruptTask()`

**Returns:** `void`

Subclasses can override this method to implement interruption of the future's computation. The
 method is invoked automatically by a successful call to {@link #cancel(boolean) cancel(true)}.

 <p>The default implementation does nothing.

 <p>This method is likely to be deprecated. Prefer to override {@link #afterDone}, checking
 {@link #wasInterrupted} to decide whether to interrupt your task.
@since 10.0

### `wasInterrupted()`

**Returns:** `boolean`

Returns true if this future was cancelled with {@code mayInterruptIfRunning} set to {@code
 true}.
@since 14.0

### `addListener(`java.lang.Runnable` listener, [`java.util.concurrent.Executor`](../../../../../java/util/concurrent/Executor.md) executor)`

**Returns:** `void`

{@inheritDoc}
@since 10.0

### `set([`V`](V.md) value)`

**Returns:** `boolean`

Sets the result of this {@code Future} unless this {@code Future} has already been cancelled or
 set (including {@linkplain #setFuture set asynchronously}). When a call to this method returns,
 the {@code Future} is guaranteed to be {@linkplain #isDone done} <b>only if</b> the call was
 accepted (in which case it returns {@code true}). If it returns {@code false}, the {@code
 Future} may have previously been set asynchronously, in which case its result may not be known
 yet. That result, though not yet known, cannot be overridden by a call to a {@code set*}
 method, only by a call to {@link #cancel}.

 <p>Beware of completing a future while holding a lock. Its listeners may do slow work or
 acquire other locks, risking deadlocks.
@param value the value to be used as the result
@return true if the attempt was accepted, completing the {@code Future}

### `setException(`java.lang.Throwable` throwable)`

**Returns:** `boolean`

Sets the failed result of this {@code Future} unless this {@code Future} has already been
 cancelled or set (including {@linkplain #setFuture set asynchronously}). When a call to this
 method returns, the {@code Future} is guaranteed to be {@linkplain #isDone done} <b>only if</b>
 the call was accepted (in which case it returns {@code true}). If it returns {@code false}, the
 {@code Future} may have previously been set asynchronously, in which case its result may not be
 known yet. That result, though not yet known, cannot be overridden by a call to a {@code set*}
 method, only by a call to {@link #cancel}.

 <p>Beware of completing a future while holding a lock. Its listeners may do slow work or
 acquire other locks, risking deadlocks.
@param throwable the exception to be used as the failed result
@return true if the attempt was accepted, completing the {@code Future}

### `setFuture([`com.google.common.util.concurrent.ListenableFuture<? extends V>`](./ListenableFuture.md) future)`

**Returns:** `boolean`

Sets the result of this {@code Future} to match the supplied input {@code Future} once the
 supplied {@code Future} is done, unless this {@code Future} has already been cancelled or set
 (including "set asynchronously," defined below).

 <p>If the supplied future is {@linkplain #isDone done} when this method is called and the call
 is accepted, then this future is guaranteed to have been completed with the supplied future by
 the time this method returns. If the supplied future is not done and the call is accepted, then
 the future will be <i>set asynchronously</i>. Note that such a result, though not yet known,
 cannot be overridden by a call to a {@code set*} method, only by a call to {@link #cancel}.

 <p>If the call {@code setFuture(delegate)} is accepted and this {@code Future} is later
 cancelled, cancellation will be propagated to {@code delegate}. Additionally, any call to
 {@code setFuture} after any cancellation will propagate cancellation to the supplied {@code
 Future}.

 <p>Note that, even if the supplied future is cancelled and it causes this future to complete,
 it will never trigger interruption behavior. In particular, it will not cause this future to
 invoke the {@link #interruptTask} method, and the {@link #wasInterrupted} method will not
 return {@code true}.

 <p>Beware of completing a future while holding a lock. Its listeners may do slow work or
 acquire other locks, risking deadlocks.
@param future the future to delegate to
@return true if the attempt was accepted, indicating that the {@code Future} was not previously
     cancelled or set.
@since 19.0

### `getFutureValue([`com.google.common.util.concurrent.ListenableFuture<?>`](./ListenableFuture.md) future)`

**Returns:** `java.lang.Object`

Returns a value that satisfies the contract of the {@link #value} field based on the state of
 given future.

 <p>This is approximately the inverse of {@link #getDoneValue(Object)}

### `getUninterruptibly([`java.util.concurrent.Future<V>`](../../../../../java/util/concurrent/Future.md) future)`

**Returns:** [`V`](V.md)

An inlined private copy of {@link Uninterruptibles#getUninterruptibly} used to break an
 internal dependency on other /util/concurrent classes.

### `complete([`com.google.common.util.concurrent.AbstractFuture<?>`](./AbstractFuture.md) param, `boolean` callInterruptTask)`

**Returns:** `void`

Unblocks all threads and runs all listeners.

### `afterDone()`

**Returns:** `void`

Callback method that is called exactly once after the future is completed.

 <p>If {@link #interruptTask} is also run during completion, {@link #afterDone} runs after it.

 <p>The default implementation of this method in {@code AbstractFuture} does nothing. This is
 intended for very lightweight cleanup work, for example, timing statistics or clearing fields.
 If your task does anything heavier consider, just using a listener with an executor.
@since 20.0

### `tryInternalFastPathGetFailure()`

**Returns:** `java.lang.Throwable`

Usually returns {@code null} but, if this {@code Future} has failed, may <i>optionally</i>
 return the cause of the failure. "Failure" means specifically "completed with an exception"; it
 does not include "was cancelled." To be explicit: If this method returns a non-null value,
 then:

 <ul>
   <li>{@code isDone()} must return {@code true}
   <li>{@code isCancelled()} must return {@code false}
   <li>{@code get()} must not block, and it must throw an {@code ExecutionException} with the
       return value of this method as its cause
 </ul>

 <p>This method is {@code protected} so that classes like {@code
 com.google.common.util.concurrent.SettableFuture} do not expose it to their users as an
 instance method. In the unlikely event that you need to call this method, call {@link InternalFutures#tryInternalFastPathGetFailure(InternalFutureFailureAccess)}.
@since 27.0

### `maybePropagateCancellationTo([`java.util.concurrent.Future<?>`](../../../../../java/util/concurrent/Future.md) related)`

**Returns:** `void`

If this future has been cancelled (and possibly interrupted), cancels (and possibly interrupts)
 the given future (if available).

### `releaseWaiters()`

**Returns:** `void`

Releases all threads in the {@link #waiters} list, and clears the list.

### `clearListeners([`com.google.common.util.concurrent.AbstractFuture.Listener`](AbstractFuture/Listener.md) onto)`

**Returns:** [`com.google.common.util.concurrent.AbstractFuture.Listener`](AbstractFuture/Listener.md)

Clears the {@link #listeners} list and prepends its contents to {@code onto}, least recently
 added first.

### `toString()`

**Returns:** `java.lang.String`

### `pendingToString()`

**Returns:** `java.lang.String`

Provide a human-readable explanation of why this future has not yet completed.
@return null if an explanation cannot be provided (e.g. because the future is done).
@since 23.0

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

### `executeListener(`java.lang.Runnable` runnable, [`java.util.concurrent.Executor`](../../../../../java/util/concurrent/Executor.md) executor)`

**Returns:** `void`

Submits the given runnable to the given {@link Executor} catching and logging all {@linkplain RuntimeException runtime exceptions} thrown by the executor.

### `cancellationExceptionWithCause(`java.lang.String` message, `java.lang.Throwable` cause)`

**Returns:** [`java.util.concurrent.CancellationException`](../../../../../java/util/concurrent/CancellationException.md)

