# Class: `MoreExecutors`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.MoreExecutors`

## Description

Factory and utility methods for `java.util.concurrent.Executor`, `ExecutorService`,
 and `java.util.concurrent.ThreadFactory`.
**Author:** Eric Fellheimer
**Author:** Kyle Littlefield
**Author:** Justin Mahoney
**Since:** 3.0

## Constructors

### `<init>()`

## Methods

### `getExitingExecutorService(`java.util.concurrent.ThreadPoolExecutor` executor, `java.time.Duration` terminationTimeout)`

**Returns:** `java.util.concurrent.ExecutorService`

Converts the given ThreadPoolExecutor into an ExecutorService that exits when the application
 is complete. It does so by using daemon threads and adding a shutdown hook to wait for their
 completion.

 <p>This is mainly for fixed thread pools. See `Executors.newFixedThreadPool(int)`.
@param executor the executor to modify to make sure it exits when the application is finished
@param terminationTimeout how long to wait for the executor to finish before terminating the
     JVM
@return an unmodifiable version of the input which will not hang the JVM
**Since:** 28.0

### `getExitingExecutorService(`java.util.concurrent.ThreadPoolExecutor` executor, `long` terminationTimeout, `java.util.concurrent.TimeUnit` timeUnit)`

**Returns:** `java.util.concurrent.ExecutorService`

Converts the given ThreadPoolExecutor into an ExecutorService that exits when the application
 is complete. It does so by using daemon threads and adding a shutdown hook to wait for their
 completion.

 <p>This is mainly for fixed thread pools. See `Executors.newFixedThreadPool(int)`.
@param executor the executor to modify to make sure it exits when the application is finished
@param terminationTimeout how long to wait for the executor to finish before terminating the
     JVM
@param timeUnit unit of time for the time parameter
@return an unmodifiable version of the input which will not hang the JVM

### `getExitingExecutorService(`java.util.concurrent.ThreadPoolExecutor` executor)`

**Returns:** `java.util.concurrent.ExecutorService`

Converts the given ThreadPoolExecutor into an ExecutorService that exits when the application
 is complete. It does so by using daemon threads and adding a shutdown hook to wait for their
 completion.

 <p>This method waits 120 seconds before continuing with JVM termination, even if the executor
 has not finished its work.

 <p>This is mainly for fixed thread pools. See `Executors.newFixedThreadPool(int)`.
@param executor the executor to modify to make sure it exits when the application is finished
@return an unmodifiable version of the input which will not hang the JVM

### `getExitingScheduledExecutorService(`java.util.concurrent.ScheduledThreadPoolExecutor` executor, `java.time.Duration` terminationTimeout)`

**Returns:** `java.util.concurrent.ScheduledExecutorService`

Converts the given ScheduledThreadPoolExecutor into a ScheduledExecutorService that exits when
 the application is complete. It does so by using daemon threads and adding a shutdown hook to
 wait for their completion.

 <p>This is mainly for fixed thread pools. See `Executors.newScheduledThreadPool(int)`.
@param executor the executor to modify to make sure it exits when the application is finished
@param terminationTimeout how long to wait for the executor to finish before terminating the
     JVM
@return an unmodifiable version of the input which will not hang the JVM
**Since:** 28.0

### `getExitingScheduledExecutorService(`java.util.concurrent.ScheduledThreadPoolExecutor` executor, `long` terminationTimeout, `java.util.concurrent.TimeUnit` timeUnit)`

**Returns:** `java.util.concurrent.ScheduledExecutorService`

Converts the given ScheduledThreadPoolExecutor into a ScheduledExecutorService that exits when
 the application is complete. It does so by using daemon threads and adding a shutdown hook to
 wait for their completion.

 <p>This is mainly for fixed thread pools. See `Executors.newScheduledThreadPool(int)`.
@param executor the executor to modify to make sure it exits when the application is finished
@param terminationTimeout how long to wait for the executor to finish before terminating the
     JVM
@param timeUnit unit of time for the time parameter
@return an unmodifiable version of the input which will not hang the JVM

### `getExitingScheduledExecutorService(`java.util.concurrent.ScheduledThreadPoolExecutor` executor)`

**Returns:** `java.util.concurrent.ScheduledExecutorService`

Converts the given ScheduledThreadPoolExecutor into a ScheduledExecutorService that exits when
 the application is complete. It does so by using daemon threads and adding a shutdown hook to
 wait for their completion.

 <p>This method waits 120 seconds before continuing with JVM termination, even if the executor
 has not finished its work.

 <p>This is mainly for fixed thread pools. See `Executors.newScheduledThreadPool(int)`.
@param executor the executor to modify to make sure it exits when the application is finished
@return an unmodifiable version of the input which will not hang the JVM

### `addDelayedShutdownHook(`java.util.concurrent.ExecutorService` service, `java.time.Duration` terminationTimeout)`

**Returns:** `void`

Add a shutdown hook to wait for thread completion in the given `ExecutorService`.
 This is useful if the given service uses daemon threads, and we want to keep the JVM from
 exiting immediately on shutdown, instead giving these daemon threads a chance to terminate
 normally.
@param service ExecutorService which uses daemon threads
@param terminationTimeout how long to wait for the executor to finish before terminating the
     JVM
**Since:** 28.0

### `addDelayedShutdownHook(`java.util.concurrent.ExecutorService` service, `long` terminationTimeout, `java.util.concurrent.TimeUnit` timeUnit)`

**Returns:** `void`

Add a shutdown hook to wait for thread completion in the given `ExecutorService`.
 This is useful if the given service uses daemon threads, and we want to keep the JVM from
 exiting immediately on shutdown, instead giving these daemon threads a chance to terminate
 normally.
@param service ExecutorService which uses daemon threads
@param terminationTimeout how long to wait for the executor to finish before terminating the
     JVM
@param timeUnit unit of time for the time parameter

### `useDaemonThreadFactory(`java.util.concurrent.ThreadPoolExecutor` executor)`

**Returns:** `void`

### `newDirectExecutorService()`

**Returns:** [`com.google.common.util.concurrent.ListeningExecutorService`](./ListeningExecutorService.md)

Creates an executor service that runs each task in the thread that invokes `execute/submit`, as in `ThreadPoolExecutor.CallerRunsPolicy`. This applies both to
 individually submitted tasks and to collections of tasks submitted via `invokeAll` or
 `invokeAny`. In the latter case, tasks will run serially on the calling thread. Tasks are
 run to completion before a `Future` is returned to the caller (unless the executor has
 been shutdown).

 <p>Although all tasks are immediately executed in the thread that submitted the task, this
 `ExecutorService` imposes a small locking overhead on each task submission in order to
 implement shutdown and termination behavior.

 <p>The implementation deviates from the `ExecutorService` specification with regards to
 the `shutdownNow` method. First, "best-effort" with regards to canceling running tasks is
 implemented as "no-effort". No interrupts or other attempts are made to stop threads executing
 tasks. Second, the returned list will always be empty, as any submitted task is considered to
 have started execution. This applies also to tasks given to `invokeAll` or `invokeAny` which are pending serial execution, even the subset of the tasks that have not yet
 started execution. It is unclear from the `ExecutorService` specification if these should
 be included, and it's much easier to implement the interpretation that they not be. Finally, a
 call to `shutdown` or `shutdownNow` may result in concurrent calls to `invokeAll/invokeAny` throwing RejectedExecutionException, although a subset of the tasks may
 already have been executed.
**Since:** 18.0 (present as MoreExecutors.sameThreadExecutor() since 10.0)

### `directExecutor()`

**Returns:** `java.util.concurrent.Executor`

Returns an `Executor` that runs each task in the thread that invokes `Executor.execute execute`, as in `ThreadPoolExecutor.CallerRunsPolicy`.

 <p>This executor is appropriate for tasks that are lightweight and not deeply chained.
 Inappropriate `directExecutor` usage can cause problems, and these problems can be
 difficult to reproduce because they depend on timing. For example:

 <ul>
   <li>When a `ListenableFuture` listener is registered to run under `directExecutor`, the listener can execute in any of three possible threads:
       <ol>
         <li>When a thread attaches a listener to a `ListenableFuture` that's already
             complete, the listener runs immediately in that thread.
         <li>When a thread attaches a listener to a `ListenableFuture` that's
             <em>in</em>complete and the `ListenableFuture` later completes normally, the
             listener runs in the thread that completes the `ListenableFuture`.
         <li>When a listener is attached to a `ListenableFuture` and the `ListenableFuture` gets cancelled, the listener runs immediately in the thread that
             cancelled the `Future`.
       </ol>
       Given all these possibilities, it is frequently possible for listeners to execute in UI
       threads, RPC network threads, or other latency-sensitive threads. In those cases, slow
       listeners can harm responsiveness, slow the system as a whole, or worse. (See also the
       note about locking below.)
   <li>If many tasks will be triggered by the same event, one heavyweight task may delay other
       tasks -- even tasks that are not themselves `directExecutor` tasks.
   <li>If many such tasks are chained together (such as with `future.transform(...).transform(...).transform(...)....`), they may overflow the stack.
       (In simple cases, callers can avoid this by registering all tasks with the same `MoreExecutors.newSequentialExecutor` wrapper around `directExecutor()`. More
       complex cases may require using thread pools or making deeper changes.)
   <li>If an exception propagates out of a `Runnable`, it is not necessarily seen by any
       `UncaughtExceptionHandler` for the thread. For example, if the callback passed to
       `Futures.addCallback` throws an exception, that exception will be typically be
       logged by the `ListenableFuture` implementation, even if the thread is configured
       to do something different. In other cases, no code will catch the exception, and it may
       terminate whichever thread happens to trigger the execution.
 </ul>

 A specific warning about locking: Code that executes user-supplied tasks, such as `ListenableFuture` listeners, should take care not to do so while holding a lock. Additionally,
 as a further line of defense, prefer not to perform any locking inside a task that will be run
 under `directExecutor`: Not only might the wait for a lock be long, but if the running
 thread was holding a lock, the listener may deadlock or break lock isolation.

 <p>This instance is equivalent to:

 <pre>`final class DirectExecutor implements Executor {
   public void execute(Runnable r) {
     r.run();
   `
 }
 }</pre>

 <p>This should be preferred to `newDirectExecutorService()` because implementing the
 `ExecutorService` subinterface necessitates significant performance overhead.
**Since:** 18.0

### `newSequentialExecutor(`java.util.concurrent.Executor` delegate)`

**Returns:** `java.util.concurrent.Executor`

Returns an `Executor` that runs each task executed sequentially, such that no two tasks
 are running concurrently.

 <p>executed tasks have a happens-before order as defined in the
 Java Language Specification. Tasks execute with the same happens-before order that the function
 calls to `Executor.execute `execute()`` that submitted those tasks had.

 <p>The executor uses `delegate` in order to `Executor.execute execute` each task in
 turn, and does not create any threads of its own.

 <p>After execution begins on a thread from the `delegate` `Executor`, tasks are
 polled and executed from a task queue until there are no more tasks. The thread will not be
 released until there are no more tasks to run.

 <p>If a task is submitted while a thread is executing tasks from the task queue, the thread
 will not be released until that submitted task is also complete.

 <p>If a task is interrupted while a task is running:

 <ol>
   <li>execution will not stop until the task queue is empty.
   <li>tasks will begin execution with the thread marked as not interrupted - any interruption
       applies only to the task that was running at the point of interruption.
   <li>if the thread was interrupted before the SequentialExecutor's worker begins execution,
       the interrupt will be restored to the thread after it completes so that its `delegate` Executor may process the interrupt.
   <li>subtasks are run with the thread uninterrupted and interrupts received during execution
       of a task are ignored.
 </ol>

 <p>`RuntimeException`s thrown by tasks are simply logged and the executor keeps trucking.
 If an `Error` is thrown, the error will propagate and execution will stop until the next
 time a task is submitted.

 <p>When an `Error` is thrown by an executed task, previously submitted tasks may never
 run. An attempt will be made to restart execution on the next call to `execute`. If the
 `delegate` has begun to reject execution, the previously submitted tasks may never run,
 despite not throwing a RejectedExecutionException synchronously with the call to `execute`. If this behaviour is problematic, use an Executor with a single thread (e.g. `Executors.newSingleThreadExecutor`).
**Since:** 23.3 (since 23.1 as `sequentialExecutor`)

### `listeningDecorator(`java.util.concurrent.ExecutorService` delegate)`

**Returns:** [`com.google.common.util.concurrent.ListeningExecutorService`](./ListeningExecutorService.md)

Creates an `ExecutorService` whose `submit` and `invokeAll` methods submit
 `ListenableFutureTask` instances to the given delegate executor. Those methods, as well
 as `execute` and `invokeAny`, are implemented in terms of calls to `delegate.execute`. All other methods are forwarded unchanged to the delegate. This implies that
 the returned `ListeningExecutorService` never calls the delegate's `submit`, `invokeAll`, and `invokeAny` methods, so any special handling of tasks must be implemented
 in the delegate's `execute` method or by wrapping the returned `ListeningExecutorService`.

 <p>If the delegate executor was already an instance of `ListeningExecutorService`, it is
 returned untouched, and the rest of this documentation does not apply.
**Since:** 10.0

### `listeningDecorator(`java.util.concurrent.ScheduledExecutorService` delegate)`

**Returns:** [`com.google.common.util.concurrent.ListeningScheduledExecutorService`](./ListeningScheduledExecutorService.md)

Creates a `ScheduledExecutorService` whose `submit` and `invokeAll` methods
 submit `ListenableFutureTask` instances to the given delegate executor. Those methods, as
 well as `execute` and `invokeAny`, are implemented in terms of calls to `delegate.execute`. All other methods are forwarded unchanged to the delegate. This implies that
 the returned `ListeningScheduledExecutorService` never calls the delegate's `submit`, `invokeAll`, and `invokeAny` methods, so any special handling of tasks
 must be implemented in the delegate's `execute` method or by wrapping the returned `ListeningScheduledExecutorService`.

 <p>If the delegate executor was already an instance of `ListeningScheduledExecutorService`, it is returned untouched, and the rest of this
 documentation does not apply.
**Since:** 10.0

### `invokeAnyImpl([`com.google.common.util.concurrent.ListeningExecutorService`](./ListeningExecutorService.md) executorService, `java.util.Collection<? extends java.util.concurrent.Callable<T>>` tasks, `boolean` timed, `java.time.Duration` timeout)`

**Returns:** `T`

An implementation of `ExecutorService.invokeAny` for `ListeningExecutorService`
 implementations.

### `invokeAnyImpl([`com.google.common.util.concurrent.ListeningExecutorService`](./ListeningExecutorService.md) executorService, `java.util.Collection<? extends java.util.concurrent.Callable<T>>` tasks, `boolean` timed, `long` timeout, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `T`

An implementation of `ExecutorService.invokeAny` for `ListeningExecutorService`
 implementations.

### `submitAndAddQueueListener([`com.google.common.util.concurrent.ListeningExecutorService`](./ListeningExecutorService.md) executorService, `java.util.concurrent.Callable<T>` task, `java.util.concurrent.BlockingQueue<java.util.concurrent.Future<T>>` queue)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<T>`](./ListenableFuture.md)

Submits the task and adds a listener that adds the future to `queue` when it completes.

### `platformThreadFactory()`

**Returns:** `java.util.concurrent.ThreadFactory`

Returns a default thread factory used to create new threads.

 <p>When running on AppEngine with access to <a href="https://cloud.google.com/appengine/docs/standard/java/javadoc/">AppEngine legacy
 APIs</a>, this method returns `ThreadManager.currentRequestThreadFactory()`. Otherwise,
 it returns `Executors.defaultThreadFactory()`.
**Since:** 14.0

### `isAppEngineWithApiClasses()`

**Returns:** `boolean`

### `newThread(`java.lang.String` name, `java.lang.Runnable` runnable)`

**Returns:** `java.lang.Thread`

Creates a thread using `platformThreadFactory`, and sets its name to `name` unless
 changing the name is forbidden by the security manager.

### `renamingDecorator(`java.util.concurrent.Executor` executor, [`com.google.common.base.Supplier<java.lang.String>`](../../base/Supplier.md) nameSupplier)`

**Returns:** `java.util.concurrent.Executor`

Creates an `Executor` that renames the `Thread` that its tasks run in.

 <p>The names are retrieved from the `nameSupplier` on the thread that is being renamed
 right before each task is run. The renaming is best effort, if a `SecurityManager`
 prevents the renaming then it will be skipped but the tasks will still execute.
@param executor The executor to decorate
@param nameSupplier The source of names for each task

### `renamingDecorator(`java.util.concurrent.ExecutorService` service, [`com.google.common.base.Supplier<java.lang.String>`](../../base/Supplier.md) nameSupplier)`

**Returns:** `java.util.concurrent.ExecutorService`

Creates an `ExecutorService` that renames the `Thread` that its tasks run
 in.

 <p>The names are retrieved from the `nameSupplier` on the thread that is being renamed
 right before each task is run. The renaming is best effort, if a `SecurityManager`
 prevents the renaming then it will be skipped but the tasks will still execute.
@param service The executor to decorate
@param nameSupplier The source of names for each task

### `renamingDecorator(`java.util.concurrent.ScheduledExecutorService` service, [`com.google.common.base.Supplier<java.lang.String>`](../../base/Supplier.md) nameSupplier)`

**Returns:** `java.util.concurrent.ScheduledExecutorService`

Creates a `ScheduledExecutorService` that renames the `Thread` that its
 tasks run in.

 <p>The names are retrieved from the `nameSupplier` on the thread that is being renamed
 right before each task is run. The renaming is best effort, if a `SecurityManager`
 prevents the renaming then it will be skipped but the tasks will still execute.
@param service The executor to decorate
@param nameSupplier The source of names for each task

### `shutdownAndAwaitTermination(`java.util.concurrent.ExecutorService` service, `java.time.Duration` timeout)`

**Returns:** `boolean`

Shuts down the given executor service gradually, first disabling new submissions and later, if
 necessary, cancelling remaining tasks.

 <p>The method takes the following steps:

 <ol>
   <li>calls `ExecutorService.shutdown()`, disabling acceptance of new submitted tasks.
   <li>awaits executor service termination for half of the specified timeout.
   <li>if the timeout expires, it calls `ExecutorService.shutdownNow()`, cancelling
       pending tasks and interrupting running tasks.
   <li>awaits executor service termination for the other half of the specified timeout.
 </ol>

 <p>If, at any step of the process, the calling thread is interrupted, the method calls `ExecutorService.shutdownNow()` and returns.
@param service the `ExecutorService` to shut down
@param timeout the maximum time to wait for the `ExecutorService` to terminate
@return `true` if the `ExecutorService` was terminated successfully, `false`
     if the call timed out or was interrupted
**Since:** 28.0

### `shutdownAndAwaitTermination(`java.util.concurrent.ExecutorService` service, `long` timeout, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `boolean`

Shuts down the given executor service gradually, first disabling new submissions and later, if
 necessary, cancelling remaining tasks.

 <p>The method takes the following steps:

 <ol>
   <li>calls `ExecutorService.shutdown()`, disabling acceptance of new submitted tasks.
   <li>awaits executor service termination for half of the specified timeout.
   <li>if the timeout expires, it calls `ExecutorService.shutdownNow()`, cancelling
       pending tasks and interrupting running tasks.
   <li>awaits executor service termination for the other half of the specified timeout.
 </ol>

 <p>If, at any step of the process, the calling thread is interrupted, the method calls `ExecutorService.shutdownNow()` and returns.
@param service the `ExecutorService` to shut down
@param timeout the maximum time to wait for the `ExecutorService` to terminate
@param unit the time unit of the timeout argument
@return `true` if the `ExecutorService` was terminated successfully, `false`
     if the call timed out or was interrupted
**Since:** 17.0

### `rejectionPropagatingExecutor(`java.util.concurrent.Executor` delegate, [`com.google.common.util.concurrent.AbstractFuture<?>`](./AbstractFuture.md) future)`

**Returns:** `java.util.concurrent.Executor`

Returns an Executor that will propagate `RejectedExecutionException` from the delegate
 executor to the given `future`.

 <p>Note, the returned executor can only be used once.

