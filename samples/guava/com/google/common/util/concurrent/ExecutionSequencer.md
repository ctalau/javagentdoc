# Class: `ExecutionSequencer`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ExecutionSequencer`

## Description

This class serializes execution of *submitted* tasks but not any *listeners* of
 those tasks.

 
Submitted tasks have a happens-before order as defined in the Java Language Specification.
 Tasks execute with the same happens-before order that the function calls to #submit and
 #submitAsync that submitted those tasks had.

 
This class has limited support for cancellation and other "early completions":

 

   - While calls to submit and submitAsync return a Future that can be
       cancelled, cancellation never propagates to a task that has started to run -- neither to
       the callable itself nor to any Future returned by an AsyncCallable.
       (However, cancellation can prevent an *unstarted* task from running.) Therefore, the
       next task will wait for any running callable (or pending Future returned by an
       AsyncCallable) to complete, without interrupting it (and without calling 
       cancel on the Future). So beware: *Even if you cancel every preceding 
       Future returned by this class, the next task may still have to wait.*.
   - Once an AsyncCallable returns a Future, this class considers that task to
       be "done" as soon as *that* Future completes in any way. Notably, a 
       Future is "completed" even if it is cancelled while its underlying work continues on a
       thread, an RPC, etc. The Future is also "completed" if it fails "early" -- for
       example, if the deadline expires on a Future returned from Futures#withTimeout while the Future it wraps continues its underlying work. So
       beware: *Your AsyncCallable should not complete its Future until it is
       safe for the next task to start.*
 


 
This class is similar to MoreExecutors#newSequentialExecutor. This class is different
 in a few ways:

 

   - Each task may be associated with a different executor.
   - Tasks may be of type AsyncCallable.
   - Running tasks *cannot* be interrupted. (Note that newSequentialExecutor does
       not return Future objects, so it doesn't support interruption directly, either.
       However, utilities that *use* that executor have the ability to interrupt tasks
       running on it. This class, by contrast, does not expose an Executor API.)
 


 
If you don't need the features of this class, you may prefer newSequentialExecutor for
 its simplicity and ability to accommodate interruption.

## Fields

### `ref`

**Type:** `java.util.concurrent.atomic.AtomicReference<com.google.common.util.concurrent.ListenableFuture<java.lang.@org.checkerframework.checker.nullness.qual.Nullable Void>>`

### `latestTaskQueue`

**Type:** `com.google.common.util.concurrent.ExecutionSequencer.ThreadConfinedTaskQueue`

## Constructors

### `<init>()`

## Methods

### `create()`

**Returns:** [`com.google.common.util.concurrent.ExecutionSequencer`](./ExecutionSequencer.md)

### `submit(Callable<T> callable, Executor executor)`

Cancellation does not propagate from the output future to a callable that has begun to
 execute, but if the output future is cancelled before Callable#call() is invoked,
 Callable#call() will not be invoked.

**Parameters:**
- `callable` (`java.util.concurrent.Callable<T>`)
- `executor` (`java.util.concurrent.Executor`)

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<T>`](./ListenableFuture.md)

### `submitAsync(AsyncCallable<T> callable, Executor executor)`

Cancellation does not propagate from the output future to the future returned from 
 callable or a callable that has begun to execute, but if the output future is cancelled before
 AsyncCallable#call() is invoked, AsyncCallable#call() will not be invoked.

**Parameters:**
- `callable` ([`com.google.common.util.concurrent.AsyncCallable<T>`](./AsyncCallable.md))
- `executor` (`java.util.concurrent.Executor`)

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<T>`](./ListenableFuture.md)

