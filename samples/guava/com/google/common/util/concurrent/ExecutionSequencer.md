# Class: `ExecutionSequencer`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ExecutionSequencer`

## Description

Serializes execution of tasks, somewhat like an "asynchronous `synchronized` block." Each
 enqueued callable will not be submitted to its associated executor until the
 previous callable has returned -- and, if the previous callable was an `AsyncCallable`, not
 until the `Future` it returned is done (successful, failed, or
 cancelled).

 <p>This class serializes execution of <i>submitted</i> tasks but not any <i>listeners</i> of
 those tasks.

 <p>Submitted tasks have a happens-before order as defined in the Java Language Specification.
 Tasks execute with the same happens-before order that the function calls to `submit` and
 `submitAsync` that submitted those tasks had.

 <p>This class has limited support for cancellation and other "early completions":

 <ul>
   <li>While calls to `submit` and `submitAsync` return a `Future` that can be
       cancelled, cancellation never propagates to a task that has started to run -- neither to
       the callable itself nor to any `Future` returned by an `AsyncCallable`.
       (However, cancellation can prevent an <i>unstarted</i> task from running.) Therefore, the
       next task will wait for any running callable (or pending `Future` returned by an
       `AsyncCallable`) to complete, without interrupting it (and without calling `cancel` on the `Future`). So beware: <i>Even if you cancel every preceding `Future` returned by this class, the next task may still have to wait.</i>.
   <li>Once an `AsyncCallable` returns a `Future`, this class considers that task to
       be "done" as soon as <i>that</i> `Future` completes in any way. Notably, a `Future` is "completed" even if it is cancelled while its underlying work continues on a
       thread, an RPC, etc. The `Future` is also "completed" if it fails "early" -- for
       example, if the deadline expires on a `Future` returned from `Futures.withTimeout` while the `Future` it wraps continues its underlying work. So
       beware: <i>Your `AsyncCallable` should not complete its `Future` until it is
       safe for the next task to start.</i>
 </ul>

 <p>This class is similar to `MoreExecutors.newSequentialExecutor`. This class is different
 in a few ways:

 <ul>
   <li>Each task may be associated with a different executor.
   <li>Tasks may be of type `AsyncCallable`.
   <li>Running tasks <i>cannot</i> be interrupted. (Note that `newSequentialExecutor` does
       not return `Future` objects, so it doesn't support interruption directly, either.
       However, utilities that <i>use</i> that executor have the ability to interrupt tasks
       running on it. This class, by contrast, does not expose an `Executor` API.)
 </ul>

 <p>If you don't need the features of this class, you may prefer `newSequentialExecutor` for
 its simplicity and ability to accommodate interruption.
**Since:** 26.0

## Fields

### `ref`

**Type:** `java.util.concurrent.atomic.AtomicReference<com.google.common.util.concurrent.ListenableFuture<java.lang.@org.checkerframework.checker.nullness.qual.Nullable Void>>`

This reference acts as a pointer tracking the head of a linked list of ListenableFutures.

### `latestTaskQueue`

**Type:** [`com.google.common.util.concurrent.ExecutionSequencer.ThreadConfinedTaskQueue`](ExecutionSequencer/ThreadConfinedTaskQueue.md)

## Constructors

### `<init>()`

## Methods

### `create()`

**Returns:** [`com.google.common.util.concurrent.ExecutionSequencer`](./ExecutionSequencer.md)

Creates a new instance.

### `submit(`java.util.concurrent.Callable<T>` callable, `java.util.concurrent.Executor` executor)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<T>`](./ListenableFuture.md)

Enqueues a task to run when the previous task (if any) completes.

 <p>Cancellation does not propagate from the output future to a callable that has begun to
 execute, but if the output future is cancelled before `Callable.call()` is invoked,
 `Callable.call()` will not be invoked.

### `submitAsync([`com.google.common.util.concurrent.AsyncCallable<T>`](./AsyncCallable.md) callable, `java.util.concurrent.Executor` executor)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<T>`](./ListenableFuture.md)

Enqueues a task to run when the previous task (if any) completes.

 <p>Cancellation does not propagate from the output future to the future returned from `callable` or a callable that has begun to execute, but if the output future is cancelled before
 `AsyncCallable.call()` is invoked, `AsyncCallable.call()` will not be invoked.

