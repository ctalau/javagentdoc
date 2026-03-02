# Class: `AbstractFuture`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.AbstractFuture`

**Extends:** `com.google.common.util.concurrent.internal.InternalFutureFailureAccess`

**Implements:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

## Type Parameters

- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

More
 common ways to create a ListenableFuture include instantiating a SettableFuture,
 submitting a task to a ListeningExecutorService, and deriving a Future from an
 existing one, typically using methods like Futures.transform and Futures.catching.

 
This class implements all methods in ListenableFuture. Subclasses should provide a way
 to set the result of the computation through the protected methods #set(Object), #setFuture(ListenableFuture) and #setException(Throwable). Subclasses may also override
 #afterDone(), which will be invoked automatically when the future completes. Subclasses
 should rarely override other methods.

## Fields

### `GENERATE_CANCELLATION_CAUSES`

**Type:** `boolean`

### `log`

**Type:** [`com.google.common.util.concurrent.LazyLogger`](./LazyLogger.md)

### `SPIN_THRESHOLD_NANOS`

**Type:** `long`

### `ATOMIC_HELPER`

**Type:** `com.google.common.util.concurrent.AbstractFuture.AtomicHelper`

### `NULL`

**Type:** `java.lang.Object`

### `value`

**Type:** `java.lang.Object`

The valid values are:

 

   - null initial state, nothing has happened.
   - Cancellation terminal state, cancel was called.
   - Failure terminal state, setException was called.
   - SetFuture intermediate state, setFuture was called.
   - #NULL terminal state, set(null) was called.
   - Any other non-null value, terminal state, set was called with a non-null
       argument.

### `listeners`

**Type:** `com.google.common.util.concurrent.AbstractFuture.Listener`

### `waiters`

**Type:** `com.google.common.util.concurrent.AbstractFuture.Waiter`

## Constructors

### `<init>()`

## Methods

### `removeWaiter(AbstractFuture.Waiter node)`

This is an O(n) operation in the common case (and O(n^2) in the worst), but we are saved
 by two things.

 

   - This is only called when a waiting thread times out or is interrupted. Both of which
       should be rare.
   - The waiters list should be very short.

**Parameters:**
- `node` (`com.google.common.util.concurrent.AbstractFuture.Waiter`)

**Returns:** `void`

### `get(long timeout, TimeUnit unit)`

The default AbstractFuture implementation throws InterruptedException if the
 current thread is interrupted during the call, even if the value is already available.

**Parameters:**
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `V`

### `get()`

The default AbstractFuture implementation throws InterruptedException if the
 current thread is interrupted during the call, even if the value is already available.

**Returns:** `V`

### `getDoneValue(Object obj)`

Assumes that obj is not null or a SetFuture.

**Parameters:**
- `obj` (`java.lang.Object`)

**Returns:** `V`

### `isDone()`

**Returns:** `boolean`

### `isCancelled()`

**Returns:** `boolean`

### `cancel(boolean mayInterruptIfRunning)`

If a cancellation attempt succeeds on a Future that had previously been set asynchronously, then the cancellation will also be propagated to the delegate
 Future that was supplied in the setFuture call.

 
Rather than override this method to perform additional cancellation work or cleanup,
 subclasses should override #afterDone, consulting #isCancelled and #wasInterrupted as necessary. This ensures that the work is done even if the future is
 cancelled without a call to cancel, such as by calling 
 setFuture(cancelledFuture).

 
Beware of completing a future while holding a lock. Its listeners may do slow work or
 acquire other locks, risking deadlocks.

**Parameters:**
- `mayInterruptIfRunning` (`boolean`)

**Returns:** `boolean`

### `interruptTask()`

The
 method is invoked automatically by a successful call to cancel(true).

 
The default implementation does nothing.

 
This method is likely to be deprecated. Prefer to override #afterDone, checking
 #wasInterrupted to decide whether to interrupt your task.

**Returns:** `void`

### `wasInterrupted()`

**Returns:** `boolean`

### `addListener(Runnable listener, Executor executor)`

**Parameters:**
- `listener` (`java.lang.Runnable`)
- `executor` (`java.util.concurrent.Executor`)

**Returns:** `void`

### `set(V value)`

When a call to this method returns,
 the Future is guaranteed to be done **only if** the call was
 accepted (in which case it returns true). If it returns false, the 
 Future may have previously been set asynchronously, in which case its result may not be known
 yet. That result, though not yet known, cannot be overridden by a call to a set*
 method, only by a call to #cancel.

 
Beware of completing a future while holding a lock. Its listeners may do slow work or
 acquire other locks, risking deadlocks.

**Parameters:**
- `value` (`V`): the value to be used as the result

**Returns:** `boolean`

### `setException(Throwable throwable)`

When a call to this
 method returns, the Future is guaranteed to be done **only if**
 the call was accepted (in which case it returns true). If it returns false, the
 Future may have previously been set asynchronously, in which case its result may not be
 known yet. That result, though not yet known, cannot be overridden by a call to a set*
 method, only by a call to #cancel.

 
Beware of completing a future while holding a lock. Its listeners may do slow work or
 acquire other locks, risking deadlocks.

**Parameters:**
- `throwable` (`java.lang.Throwable`): the exception to be used as the failed result

**Returns:** `boolean`

### `setFuture(ListenableFuture<? extends V> future)`

If the supplied future is done when this method is called and the call
 is accepted, then this future is guaranteed to have been completed with the supplied future by
 the time this method returns. If the supplied future is not done and the call is accepted, then
 the future will be *set asynchronously*. Note that such a result, though not yet known,
 cannot be overridden by a call to a set* method, only by a call to #cancel.

 
If the call setFuture(delegate) is accepted and this Future is later
 cancelled, cancellation will be propagated to delegate. Additionally, any call to
 setFuture after any cancellation will propagate cancellation to the supplied 
 Future.

 
Note that, even if the supplied future is cancelled and it causes this future to complete,
 it will never trigger interruption behavior. In particular, it will not cause this future to
 invoke the #interruptTask method, and the #wasInterrupted method will not
 return true.

 
Beware of completing a future while holding a lock. Its listeners may do slow work or
 acquire other locks, risking deadlocks.

**Parameters:**
- `future` ([`com.google.common.util.concurrent.ListenableFuture<? extends V>`](./ListenableFuture.md)): the future to delegate to

**Returns:** `boolean`

### `getFutureValue(ListenableFuture<?> future)`

This is approximately the inverse of #getDoneValue(Object)

**Parameters:**
- `future` ([`com.google.common.util.concurrent.ListenableFuture<?>`](./ListenableFuture.md))

**Returns:** `java.lang.Object`

### `getUninterruptibly(Future<V> future)`

**Parameters:**
- `future` (`java.util.concurrent.Future<V>`)

**Returns:** `V`

### `complete(AbstractFuture<?> param, boolean callInterruptTask)`

**Parameters:**
- `param` ([`com.google.common.util.concurrent.AbstractFuture<?>`](./AbstractFuture.md))
- `callInterruptTask` (`boolean`)

**Returns:** `void`

### `afterDone()`

If #interruptTask is also run during completion, #afterDone runs after it.

 
The default implementation of this method in AbstractFuture does nothing. This is
 intended for very lightweight cleanup work, for example, timing statistics or clearing fields.
 If your task does anything heavier consider, just using a listener with an executor.

**Returns:** `void`

### `tryInternalFastPathGetFailure()`

"Failure" means specifically "completed with an exception"; it
 does not include "was cancelled." To be explicit: If this method returns a non-null value,
 then:

 

   - isDone() must return true
   - isCancelled() must return false
   - get() must not block, and it must throw an ExecutionException with the
       return value of this method as its cause
 


 
This method is protected so that classes like 
 com.google.common.util.concurrent.SettableFuture do not expose it to their users as an
 instance method. In the unlikely event that you need to call this method, call InternalFutures#tryInternalFastPathGetFailure(InternalFutureFailureAccess).

**Returns:** `java.lang.Throwable`

### `maybePropagateCancellationTo(Future<?> related)`

**Parameters:**
- `related` (`java.util.concurrent.Future<?>`)

**Returns:** `void`

### `releaseWaiters()`

**Returns:** `void`

### `clearListeners(AbstractFuture.Listener onto)`

**Parameters:**
- `onto` (`com.google.common.util.concurrent.AbstractFuture.Listener`)

**Returns:** `com.google.common.util.concurrent.AbstractFuture.Listener`

### `toString()`

**Returns:** `java.lang.String`

### `pendingToString()`

**Returns:** `java.lang.String`

### `addPendingString(StringBuilder builder)`

**Parameters:**
- `builder` (`java.lang.StringBuilder`)

**Returns:** `void`

### `addDoneString(StringBuilder builder)`

**Parameters:**
- `builder` (`java.lang.StringBuilder`)

**Returns:** `void`

### `appendResultObject(StringBuilder builder, Object o)`

Using a reconstruction of the default Object.toString() prevents OOMs and stack
 overflows, and helps avoid sensitive data inadvertently ending up in exception messages.

**Parameters:**
- `builder` (`java.lang.StringBuilder`)
- `o` (`java.lang.Object`)

**Returns:** `void`

### `appendUserObject(StringBuilder builder, Object o)`

**Parameters:**
- `builder` (`java.lang.StringBuilder`)
- `o` (`java.lang.Object`)

**Returns:** `void`

### `executeListener(Runnable runnable, Executor executor)`

**Parameters:**
- `runnable` (`java.lang.Runnable`)
- `executor` (`java.util.concurrent.Executor`)

**Returns:** `void`

### `cancellationExceptionWithCause(String message, Throwable cause)`

**Parameters:**
- `message` (`java.lang.String`)
- `cause` (`java.lang.Throwable`)

**Returns:** `java.util.concurrent.CancellationException`

