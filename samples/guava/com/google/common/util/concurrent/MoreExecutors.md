# Class: `MoreExecutors`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.MoreExecutors`

## Description

Factory and utility methods for {@link java.util.concurrent.Executor}, {@link ExecutorService},
 and {@link java.util.concurrent.ThreadFactory}.
@author Eric Fellheimer
@author Kyle Littlefield
@author Justin Mahoney
@since 3.0

## Constructors

### `<init>()`

## Methods

### `getExitingExecutorService([`java.util.concurrent.ThreadPoolExecutor`](../../../../../java/util/concurrent/ThreadPoolExecutor.md) executor, [`java.time.Duration`](../../../../../java/time/Duration.md) terminationTimeout)`

**Returns:** [`java.util.concurrent.ExecutorService`](../../../../../java/util/concurrent/ExecutorService.md)

Converts the given ThreadPoolExecutor into an ExecutorService that exits when the application
 is complete. It does so by using daemon threads and adding a shutdown hook to wait for their
 completion.

 <p>This is mainly for fixed thread pools. See {@link Executors#newFixedThreadPool(int)}.
@param executor the executor to modify to make sure it exits when the application is finished
@param terminationTimeout how long to wait for the executor to finish before terminating the
     JVM
@return an unmodifiable version of the input which will not hang the JVM
@since 28.0

### `getExitingExecutorService([`java.util.concurrent.ThreadPoolExecutor`](../../../../../java/util/concurrent/ThreadPoolExecutor.md) executor, `long` terminationTimeout, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) timeUnit)`

**Returns:** [`java.util.concurrent.ExecutorService`](../../../../../java/util/concurrent/ExecutorService.md)

Converts the given ThreadPoolExecutor into an ExecutorService that exits when the application
 is complete. It does so by using daemon threads and adding a shutdown hook to wait for their
 completion.

 <p>This is mainly for fixed thread pools. See {@link Executors#newFixedThreadPool(int)}.
@param executor the executor to modify to make sure it exits when the application is finished
@param terminationTimeout how long to wait for the executor to finish before terminating the
     JVM
@param timeUnit unit of time for the time parameter
@return an unmodifiable version of the input which will not hang the JVM

### `getExitingExecutorService([`java.util.concurrent.ThreadPoolExecutor`](../../../../../java/util/concurrent/ThreadPoolExecutor.md) executor)`

**Returns:** [`java.util.concurrent.ExecutorService`](../../../../../java/util/concurrent/ExecutorService.md)

Converts the given ThreadPoolExecutor into an ExecutorService that exits when the application
 is complete. It does so by using daemon threads and adding a shutdown hook to wait for their
 completion.

 <p>This method waits 120 seconds before continuing with JVM termination, even if the executor
 has not finished its work.

 <p>This is mainly for fixed thread pools. See {@link Executors#newFixedThreadPool(int)}.
@param executor the executor to modify to make sure it exits when the application is finished
@return an unmodifiable version of the input which will not hang the JVM

### `getExitingScheduledExecutorService([`java.util.concurrent.ScheduledThreadPoolExecutor`](../../../../../java/util/concurrent/ScheduledThreadPoolExecutor.md) executor, [`java.time.Duration`](../../../../../java/time/Duration.md) terminationTimeout)`

**Returns:** [`java.util.concurrent.ScheduledExecutorService`](../../../../../java/util/concurrent/ScheduledExecutorService.md)

Converts the given ScheduledThreadPoolExecutor into a ScheduledExecutorService that exits when
 the application is complete. It does so by using daemon threads and adding a shutdown hook to
 wait for their completion.

 <p>This is mainly for fixed thread pools. See {@link Executors#newScheduledThreadPool(int)}.
@param executor the executor to modify to make sure it exits when the application is finished
@param terminationTimeout how long to wait for the executor to finish before terminating the
     JVM
@return an unmodifiable version of the input which will not hang the JVM
@since 28.0

### `getExitingScheduledExecutorService([`java.util.concurrent.ScheduledThreadPoolExecutor`](../../../../../java/util/concurrent/ScheduledThreadPoolExecutor.md) executor, `long` terminationTimeout, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) timeUnit)`

**Returns:** [`java.util.concurrent.ScheduledExecutorService`](../../../../../java/util/concurrent/ScheduledExecutorService.md)

Converts the given ScheduledThreadPoolExecutor into a ScheduledExecutorService that exits when
 the application is complete. It does so by using daemon threads and adding a shutdown hook to
 wait for their completion.

 <p>This is mainly for fixed thread pools. See {@link Executors#newScheduledThreadPool(int)}.
@param executor the executor to modify to make sure it exits when the application is finished
@param terminationTimeout how long to wait for the executor to finish before terminating the
     JVM
@param timeUnit unit of time for the time parameter
@return an unmodifiable version of the input which will not hang the JVM

### `getExitingScheduledExecutorService([`java.util.concurrent.ScheduledThreadPoolExecutor`](../../../../../java/util/concurrent/ScheduledThreadPoolExecutor.md) executor)`

**Returns:** [`java.util.concurrent.ScheduledExecutorService`](../../../../../java/util/concurrent/ScheduledExecutorService.md)

Converts the given ScheduledThreadPoolExecutor into a ScheduledExecutorService that exits when
 the application is complete. It does so by using daemon threads and adding a shutdown hook to
 wait for their completion.

 <p>This method waits 120 seconds before continuing with JVM termination, even if the executor
 has not finished its work.

 <p>This is mainly for fixed thread pools. See {@link Executors#newScheduledThreadPool(int)}.
@param executor the executor to modify to make sure it exits when the application is finished
@return an unmodifiable version of the input which will not hang the JVM

### `addDelayedShutdownHook([`java.util.concurrent.ExecutorService`](../../../../../java/util/concurrent/ExecutorService.md) service, [`java.time.Duration`](../../../../../java/time/Duration.md) terminationTimeout)`

**Returns:** `void`

Add a shutdown hook to wait for thread completion in the given {@link ExecutorService service}.
 This is useful if the given service uses daemon threads, and we want to keep the JVM from
 exiting immediately on shutdown, instead giving these daemon threads a chance to terminate
 normally.
@param service ExecutorService which uses daemon threads
@param terminationTimeout how long to wait for the executor to finish before terminating the
     JVM
@since 28.0

### `addDelayedShutdownHook([`java.util.concurrent.ExecutorService`](../../../../../java/util/concurrent/ExecutorService.md) service, `long` terminationTimeout, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) timeUnit)`

**Returns:** `void`

Add a shutdown hook to wait for thread completion in the given {@link ExecutorService service}.
 This is useful if the given service uses daemon threads, and we want to keep the JVM from
 exiting immediately on shutdown, instead giving these daemon threads a chance to terminate
 normally.
@param service ExecutorService which uses daemon threads
@param terminationTimeout how long to wait for the executor to finish before terminating the
     JVM
@param timeUnit unit of time for the time parameter

### `useDaemonThreadFactory([`java.util.concurrent.ThreadPoolExecutor`](../../../../../java/util/concurrent/ThreadPoolExecutor.md) executor)`

**Returns:** `void`

### `newDirectExecutorService()`

**Returns:** [`com.google.common.util.concurrent.ListeningExecutorService`](./ListeningExecutorService.md)

Creates an executor service that runs each task in the thread that invokes {@code
 execute/submit}, as in {@code ThreadPoolExecutor.CallerRunsPolicy}. This applies both to
 individually submitted tasks and to collections of tasks submitted via {@code invokeAll} or
 {@code invokeAny}. In the latter case, tasks will run serially on the calling thread. Tasks are
 run to completion before a {@code Future} is returned to the caller (unless the executor has
 been shutdown).

 <p>Although all tasks are immediately executed in the thread that submitted the task, this
 {@code ExecutorService} imposes a small locking overhead on each task submission in order to
 implement shutdown and termination behavior.

 <p>The implementation deviates from the {@code ExecutorService} specification with regards to
 the {@code shutdownNow} method. First, "best-effort" with regards to canceling running tasks is
 implemented as "no-effort". No interrupts or other attempts are made to stop threads executing
 tasks. Second, the returned list will always be empty, as any submitted task is considered to
 have started execution. This applies also to tasks given to {@code invokeAll} or {@code
 invokeAny} which are pending serial execution, even the subset of the tasks that have not yet
 started execution. It is unclear from the {@code ExecutorService} specification if these should
 be included, and it's much easier to implement the interpretation that they not be. Finally, a
 call to {@code shutdown} or {@code shutdownNow} may result in concurrent calls to {@code
 invokeAll/invokeAny} throwing RejectedExecutionException, although a subset of the tasks may
 already have been executed.
@since 18.0 (present as MoreExecutors.sameThreadExecutor() since 10.0)

### `directExecutor()`

**Returns:** [`java.util.concurrent.Executor`](../../../../../java/util/concurrent/Executor.md)

Returns an {@link Executor} that runs each task in the thread that invokes {@link Executor#execute execute}, as in {@code ThreadPoolExecutor.CallerRunsPolicy}.

 <p>This executor is appropriate for tasks that are lightweight and not deeply chained.
 Inappropriate {@code directExecutor} usage can cause problems, and these problems can be
 difficult to reproduce because they depend on timing. For example:

 <ul>
   <li>When a {@code ListenableFuture} listener is registered to run under {@code
       directExecutor}, the listener can execute in any of three possible threads:
       <ol>
         <li>When a thread attaches a listener to a {@code ListenableFuture} that's already
             complete, the listener runs immediately in that thread.
         <li>When a thread attaches a listener to a {@code ListenableFuture} that's
             <em>in</em>complete and the {@code ListenableFuture} later completes normally, the
             listener runs in the thread that completes the {@code ListenableFuture}.
         <li>When a listener is attached to a {@code ListenableFuture} and the {@code
             ListenableFuture} gets cancelled, the listener runs immediately in the thread that
             cancelled the {@code Future}.
       </ol>
       Given all these possibilities, it is frequently possible for listeners to execute in UI
       threads, RPC network threads, or other latency-sensitive threads. In those cases, slow
       listeners can harm responsiveness, slow the system as a whole, or worse. (See also the
       note about locking below.)
   <li>If many tasks will be triggered by the same event, one heavyweight task may delay other
       tasks -- even tasks that are not themselves {@code directExecutor} tasks.
   <li>If many such tasks are chained together (such as with {@code
       future.transform(...).transform(...).transform(...)....}), they may overflow the stack.
       (In simple cases, callers can avoid this by registering all tasks with the same {@link MoreExecutors#newSequentialExecutor} wrapper around {@code directExecutor()}. More
       complex cases may require using thread pools or making deeper changes.)
   <li>If an exception propagates out of a {@code Runnable}, it is not necessarily seen by any
       {@code UncaughtExceptionHandler} for the thread. For example, if the callback passed to
       {@link Futures#addCallback} throws an exception, that exception will be typically be
       logged by the {@link ListenableFuture} implementation, even if the thread is configured
       to do something different. In other cases, no code will catch the exception, and it may
       terminate whichever thread happens to trigger the execution.
 </ul>

 A specific warning about locking: Code that executes user-supplied tasks, such as {@code
 ListenableFuture} listeners, should take care not to do so while holding a lock. Additionally,
 as a further line of defense, prefer not to perform any locking inside a task that will be run
 under {@code directExecutor}: Not only might the wait for a lock be long, but if the running
 thread was holding a lock, the listener may deadlock or break lock isolation.

 <p>This instance is equivalent to:

 <pre>{@code
 final class DirectExecutor implements Executor {
   public void execute(Runnable r) {
     r.run();
   }
 }
 }</pre>

 <p>This should be preferred to {@link #newDirectExecutorService()} because implementing the
 {@link ExecutorService} subinterface necessitates significant performance overhead.
@since 18.0

### `newSequentialExecutor([`java.util.concurrent.Executor`](../../../../../java/util/concurrent/Executor.md) delegate)`

**Returns:** [`java.util.concurrent.Executor`](../../../../../java/util/concurrent/Executor.md)

Returns an {@link Executor} that runs each task executed sequentially, such that no two tasks
 are running concurrently.

 <p>{@linkplain Executor#execute executed} tasks have a happens-before order as defined in the
 Java Language Specification. Tasks execute with the same happens-before order that the function
 calls to {@link Executor#execute `execute()`} that submitted those tasks had.

 <p>The executor uses {@code delegate} in order to {@link Executor#execute execute} each task in
 turn, and does not create any threads of its own.

 <p>After execution begins on a thread from the {@code delegate} {@link Executor}, tasks are
 polled and executed from a task queue until there are no more tasks. The thread will not be
 released until there are no more tasks to run.

 <p>If a task is submitted while a thread is executing tasks from the task queue, the thread
 will not be released until that submitted task is also complete.

 <p>If a task is {@linkplain Thread#interrupt interrupted} while a task is running:

 <ol>
   <li>execution will not stop until the task queue is empty.
   <li>tasks will begin execution with the thread marked as not interrupted - any interruption
       applies only to the task that was running at the point of interruption.
   <li>if the thread was interrupted before the SequentialExecutor's worker begins execution,
       the interrupt will be restored to the thread after it completes so that its {@code
       delegate} Executor may process the interrupt.
   <li>subtasks are run with the thread uninterrupted and interrupts received during execution
       of a task are ignored.
 </ol>

 <p>{@code RuntimeException}s thrown by tasks are simply logged and the executor keeps trucking.
 If an {@code Error} is thrown, the error will propagate and execution will stop until the next
 time a task is submitted.

 <p>When an {@code Error} is thrown by an executed task, previously submitted tasks may never
 run. An attempt will be made to restart execution on the next call to {@code execute}. If the
 {@code delegate} has begun to reject execution, the previously submitted tasks may never run,
 despite not throwing a RejectedExecutionException synchronously with the call to {@code
 execute}. If this behaviour is problematic, use an Executor with a single thread (e.g. {@link Executors#newSingleThreadExecutor}).
@since 23.3 (since 23.1 as {@code sequentialExecutor})

### `listeningDecorator([`java.util.concurrent.ExecutorService`](../../../../../java/util/concurrent/ExecutorService.md) delegate)`

**Returns:** [`com.google.common.util.concurrent.ListeningExecutorService`](./ListeningExecutorService.md)

Creates an {@link ExecutorService} whose {@code submit} and {@code invokeAll} methods submit
 {@link ListenableFutureTask} instances to the given delegate executor. Those methods, as well
 as {@code execute} and {@code invokeAny}, are implemented in terms of calls to {@code
 delegate.execute}. All other methods are forwarded unchanged to the delegate. This implies that
 the returned {@code ListeningExecutorService} never calls the delegate's {@code submit}, {@code
 invokeAll}, and {@code invokeAny} methods, so any special handling of tasks must be implemented
 in the delegate's {@code execute} method or by wrapping the returned {@code
 ListeningExecutorService}.

 <p>If the delegate executor was already an instance of {@code ListeningExecutorService}, it is
 returned untouched, and the rest of this documentation does not apply.
@since 10.0

### `listeningDecorator([`java.util.concurrent.ScheduledExecutorService`](../../../../../java/util/concurrent/ScheduledExecutorService.md) delegate)`

**Returns:** [`com.google.common.util.concurrent.ListeningScheduledExecutorService`](./ListeningScheduledExecutorService.md)

Creates a {@link ScheduledExecutorService} whose {@code submit} and {@code invokeAll} methods
 submit {@link ListenableFutureTask} instances to the given delegate executor. Those methods, as
 well as {@code execute} and {@code invokeAny}, are implemented in terms of calls to {@code
 delegate.execute}. All other methods are forwarded unchanged to the delegate. This implies that
 the returned {@code ListeningScheduledExecutorService} never calls the delegate's {@code
 submit}, {@code invokeAll}, and {@code invokeAny} methods, so any special handling of tasks
 must be implemented in the delegate's {@code execute} method or by wrapping the returned {@code
 ListeningScheduledExecutorService}.

 <p>If the delegate executor was already an instance of {@code
 ListeningScheduledExecutorService}, it is returned untouched, and the rest of this
 documentation does not apply.
@since 10.0

### `invokeAnyImpl([`com.google.common.util.concurrent.ListeningExecutorService`](./ListeningExecutorService.md) executorService, [`java.util.Collection<? extends java.util.concurrent.Callable<T>>`](../../../../../java/util/Collection>.md) tasks, `boolean` timed, [`java.time.Duration`](../../../../../java/time/Duration.md) timeout)`

**Returns:** [`T`](T.md)

An implementation of {@link ExecutorService#invokeAny} for {@link ListeningExecutorService}
 implementations.

### `invokeAnyImpl([`com.google.common.util.concurrent.ListeningExecutorService`](./ListeningExecutorService.md) executorService, [`java.util.Collection<? extends java.util.concurrent.Callable<T>>`](../../../../../java/util/Collection>.md) tasks, `boolean` timed, `long` timeout, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** [`T`](T.md)

An implementation of {@link ExecutorService#invokeAny} for {@link ListeningExecutorService}
 implementations.

### `submitAndAddQueueListener([`com.google.common.util.concurrent.ListeningExecutorService`](./ListeningExecutorService.md) executorService, [`java.util.concurrent.Callable<T>`](../../../../../java/util/concurrent/Callable.md) task, [`java.util.concurrent.BlockingQueue<java.util.concurrent.Future<T>>`](../../../../../java/util/concurrent/BlockingQueue>.md) queue)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<T>`](./ListenableFuture.md)

Submits the task and adds a listener that adds the future to {@code queue} when it completes.

### `platformThreadFactory()`

**Returns:** [`java.util.concurrent.ThreadFactory`](../../../../../java/util/concurrent/ThreadFactory.md)

Returns a default thread factory used to create new threads.

 <p>When running on AppEngine with access to <a href="https://cloud.google.com/appengine/docs/standard/java/javadoc/">AppEngine legacy
 APIs</a>, this method returns {@code ThreadManager.currentRequestThreadFactory()}. Otherwise,
 it returns {@link Executors#defaultThreadFactory()}.
@since 14.0

### `isAppEngineWithApiClasses()`

**Returns:** `boolean`

### `newThread(`java.lang.String` name, `java.lang.Runnable` runnable)`

**Returns:** `java.lang.Thread`

Creates a thread using {@link #platformThreadFactory}, and sets its name to {@code name} unless
 changing the name is forbidden by the security manager.

### `renamingDecorator([`java.util.concurrent.Executor`](../../../../../java/util/concurrent/Executor.md) executor, [`com.google.common.base.Supplier<java.lang.String>`](../../base/Supplier.md) nameSupplier)`

**Returns:** [`java.util.concurrent.Executor`](../../../../../java/util/concurrent/Executor.md)

Creates an {@link Executor} that renames the {@link Thread threads} that its tasks run in.

 <p>The names are retrieved from the {@code nameSupplier} on the thread that is being renamed
 right before each task is run. The renaming is best effort, if a {@link SecurityManager}
 prevents the renaming then it will be skipped but the tasks will still execute.
@param executor The executor to decorate
@param nameSupplier The source of names for each task

### `renamingDecorator([`java.util.concurrent.ExecutorService`](../../../../../java/util/concurrent/ExecutorService.md) service, [`com.google.common.base.Supplier<java.lang.String>`](../../base/Supplier.md) nameSupplier)`

**Returns:** [`java.util.concurrent.ExecutorService`](../../../../../java/util/concurrent/ExecutorService.md)

Creates an {@link ExecutorService} that renames the {@link Thread threads} that its tasks run
 in.

 <p>The names are retrieved from the {@code nameSupplier} on the thread that is being renamed
 right before each task is run. The renaming is best effort, if a {@link SecurityManager}
 prevents the renaming then it will be skipped but the tasks will still execute.
@param service The executor to decorate
@param nameSupplier The source of names for each task

### `renamingDecorator([`java.util.concurrent.ScheduledExecutorService`](../../../../../java/util/concurrent/ScheduledExecutorService.md) service, [`com.google.common.base.Supplier<java.lang.String>`](../../base/Supplier.md) nameSupplier)`

**Returns:** [`java.util.concurrent.ScheduledExecutorService`](../../../../../java/util/concurrent/ScheduledExecutorService.md)

Creates a {@link ScheduledExecutorService} that renames the {@link Thread threads} that its
 tasks run in.

 <p>The names are retrieved from the {@code nameSupplier} on the thread that is being renamed
 right before each task is run. The renaming is best effort, if a {@link SecurityManager}
 prevents the renaming then it will be skipped but the tasks will still execute.
@param service The executor to decorate
@param nameSupplier The source of names for each task

### `shutdownAndAwaitTermination([`java.util.concurrent.ExecutorService`](../../../../../java/util/concurrent/ExecutorService.md) service, [`java.time.Duration`](../../../../../java/time/Duration.md) timeout)`

**Returns:** `boolean`

Shuts down the given executor service gradually, first disabling new submissions and later, if
 necessary, cancelling remaining tasks.

 <p>The method takes the following steps:

 <ol>
   <li>calls {@link ExecutorService#shutdown()}, disabling acceptance of new submitted tasks.
   <li>awaits executor service termination for half of the specified timeout.
   <li>if the timeout expires, it calls {@link ExecutorService#shutdownNow()}, cancelling
       pending tasks and interrupting running tasks.
   <li>awaits executor service termination for the other half of the specified timeout.
 </ol>

 <p>If, at any step of the process, the calling thread is interrupted, the method calls {@link ExecutorService#shutdownNow()} and returns.
@param service the {@code ExecutorService} to shut down
@param timeout the maximum time to wait for the {@code ExecutorService} to terminate
@return {@code true} if the {@code ExecutorService} was terminated successfully, {@code false}
     if the call timed out or was interrupted
@since 28.0

### `shutdownAndAwaitTermination([`java.util.concurrent.ExecutorService`](../../../../../java/util/concurrent/ExecutorService.md) service, `long` timeout, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** `boolean`

Shuts down the given executor service gradually, first disabling new submissions and later, if
 necessary, cancelling remaining tasks.

 <p>The method takes the following steps:

 <ol>
   <li>calls {@link ExecutorService#shutdown()}, disabling acceptance of new submitted tasks.
   <li>awaits executor service termination for half of the specified timeout.
   <li>if the timeout expires, it calls {@link ExecutorService#shutdownNow()}, cancelling
       pending tasks and interrupting running tasks.
   <li>awaits executor service termination for the other half of the specified timeout.
 </ol>

 <p>If, at any step of the process, the calling thread is interrupted, the method calls {@link ExecutorService#shutdownNow()} and returns.
@param service the {@code ExecutorService} to shut down
@param timeout the maximum time to wait for the {@code ExecutorService} to terminate
@param unit the time unit of the timeout argument
@return {@code true} if the {@code ExecutorService} was terminated successfully, {@code false}
     if the call timed out or was interrupted
@since 17.0

### `rejectionPropagatingExecutor([`java.util.concurrent.Executor`](../../../../../java/util/concurrent/Executor.md) delegate, [`com.google.common.util.concurrent.AbstractFuture<?>`](./AbstractFuture.md) future)`

**Returns:** [`java.util.concurrent.Executor`](../../../../../java/util/concurrent/Executor.md)

Returns an Executor that will propagate {@link RejectedExecutionException} from the delegate
 executor to the given {@code future}.

 <p>Note, the returned executor can only be used once.

