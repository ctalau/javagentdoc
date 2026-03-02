# Class: `MoreExecutors`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.MoreExecutors`

## Description

## Constructors

### `<init>()`

## Methods

### `getExitingExecutorService(ThreadPoolExecutor executor, Duration terminationTimeout)`

It does so by using daemon threads and adding a shutdown hook to wait for their
 completion.

 
This is mainly for fixed thread pools. See Executors#newFixedThreadPool(int).

**Parameters:**
- `executor` (`java.util.concurrent.ThreadPoolExecutor`): the executor to modify to make sure it exits when the application is finished
- `terminationTimeout` (`java.time.Duration`): how long to wait for the executor to finish before terminating the
       JVM

**Returns:** `java.util.concurrent.ExecutorService`

### `getExitingExecutorService(ThreadPoolExecutor executor, long terminationTimeout, TimeUnit timeUnit)`

It does so by using daemon threads and adding a shutdown hook to wait for their
 completion.

 
This is mainly for fixed thread pools. See Executors#newFixedThreadPool(int).

**Parameters:**
- `executor` (`java.util.concurrent.ThreadPoolExecutor`): the executor to modify to make sure it exits when the application is finished
- `terminationTimeout` (`long`): how long to wait for the executor to finish before terminating the
       JVM
- `timeUnit` (`java.util.concurrent.TimeUnit`): unit of time for the time parameter

**Returns:** `java.util.concurrent.ExecutorService`

### `getExitingExecutorService(ThreadPoolExecutor executor)`

It does so by using daemon threads and adding a shutdown hook to wait for their
 completion.

 
This method waits 120 seconds before continuing with JVM termination, even if the executor
 has not finished its work.

 
This is mainly for fixed thread pools. See Executors#newFixedThreadPool(int).

**Parameters:**
- `executor` (`java.util.concurrent.ThreadPoolExecutor`): the executor to modify to make sure it exits when the application is finished

**Returns:** `java.util.concurrent.ExecutorService`

### `getExitingScheduledExecutorService(ScheduledThreadPoolExecutor executor, Duration terminationTimeout)`

It does so by using daemon threads and adding a shutdown hook to
 wait for their completion.

 
This is mainly for fixed thread pools. See Executors#newScheduledThreadPool(int).

**Parameters:**
- `executor` (`java.util.concurrent.ScheduledThreadPoolExecutor`): the executor to modify to make sure it exits when the application is finished
- `terminationTimeout` (`java.time.Duration`): how long to wait for the executor to finish before terminating the
       JVM

**Returns:** `java.util.concurrent.ScheduledExecutorService`

### `getExitingScheduledExecutorService(ScheduledThreadPoolExecutor executor, long terminationTimeout, TimeUnit timeUnit)`

It does so by using daemon threads and adding a shutdown hook to
 wait for their completion.

 
This is mainly for fixed thread pools. See Executors#newScheduledThreadPool(int).

**Parameters:**
- `executor` (`java.util.concurrent.ScheduledThreadPoolExecutor`): the executor to modify to make sure it exits when the application is finished
- `terminationTimeout` (`long`): how long to wait for the executor to finish before terminating the
       JVM
- `timeUnit` (`java.util.concurrent.TimeUnit`): unit of time for the time parameter

**Returns:** `java.util.concurrent.ScheduledExecutorService`

### `getExitingScheduledExecutorService(ScheduledThreadPoolExecutor executor)`

It does so by using daemon threads and adding a shutdown hook to
 wait for their completion.

 
This method waits 120 seconds before continuing with JVM termination, even if the executor
 has not finished its work.

 
This is mainly for fixed thread pools. See Executors#newScheduledThreadPool(int).

**Parameters:**
- `executor` (`java.util.concurrent.ScheduledThreadPoolExecutor`): the executor to modify to make sure it exits when the application is finished

**Returns:** `java.util.concurrent.ScheduledExecutorService`

### `addDelayedShutdownHook(ExecutorService service, Duration terminationTimeout)`

This is useful if the given service uses daemon threads, and we want to keep the JVM from
 exiting immediately on shutdown, instead giving these daemon threads a chance to terminate
 normally.

**Parameters:**
- `service` (`java.util.concurrent.ExecutorService`): ExecutorService which uses daemon threads
- `terminationTimeout` (`java.time.Duration`): how long to wait for the executor to finish before terminating the
       JVM

**Returns:** `void`

### `addDelayedShutdownHook(ExecutorService service, long terminationTimeout, TimeUnit timeUnit)`

This is useful if the given service uses daemon threads, and we want to keep the JVM from
 exiting immediately on shutdown, instead giving these daemon threads a chance to terminate
 normally.

**Parameters:**
- `service` (`java.util.concurrent.ExecutorService`): ExecutorService which uses daemon threads
- `terminationTimeout` (`long`): how long to wait for the executor to finish before terminating the
       JVM
- `timeUnit` (`java.util.concurrent.TimeUnit`): unit of time for the time parameter

**Returns:** `void`

### `useDaemonThreadFactory(ThreadPoolExecutor executor)`

**Parameters:**
- `executor` (`java.util.concurrent.ThreadPoolExecutor`)

**Returns:** `void`

### `newDirectExecutorService()`

This applies both to
 individually submitted tasks and to collections of tasks submitted via invokeAll or
 invokeAny. In the latter case, tasks will run serially on the calling thread. Tasks are
 run to completion before a Future is returned to the caller (unless the executor has
 been shutdown).

 
Although all tasks are immediately executed in the thread that submitted the task, this
 ExecutorService imposes a small locking overhead on each task submission in order to
 implement shutdown and termination behavior.

 
The implementation deviates from the ExecutorService specification with regards to
 the shutdownNow method. First, "best-effort" with regards to canceling running tasks is
 implemented as "no-effort". No interrupts or other attempts are made to stop threads executing
 tasks. Second, the returned list will always be empty, as any submitted task is considered to
 have started execution. This applies also to tasks given to invokeAll or 
 invokeAny which are pending serial execution, even the subset of the tasks that have not yet
 started execution. It is unclear from the ExecutorService specification if these should
 be included, and it's much easier to implement the interpretation that they not be. Finally, a
 call to shutdown or shutdownNow may result in concurrent calls to 
 invokeAll/invokeAny throwing RejectedExecutionException, although a subset of the tasks may
 already have been executed.

**Returns:** [`com.google.common.util.concurrent.ListeningExecutorService`](./ListeningExecutorService.md)

### `directExecutor()`

This executor is appropriate for tasks that are lightweight and not deeply chained.
 Inappropriate directExecutor usage can cause problems, and these problems can be
 difficult to reproduce because they depend on timing. For example:

 

   - When a ListenableFuture listener is registered to run under 
       directExecutor, the listener can execute in any of three possible threads:
       

         - When a thread attaches a listener to a ListenableFuture that's already
             complete, the listener runs immediately in that thread.
         - When a thread attaches a listener to a ListenableFuture that's
             *in*complete and the ListenableFuture later completes normally, the
             listener runs in the thread that completes the ListenableFuture.
         - When a listener is attached to a ListenableFuture and the 
             ListenableFuture gets cancelled, the listener runs immediately in the thread that
             cancelled the Future.
       

       Given all these possibilities, it is frequently possible for listeners to execute in UI
       threads, RPC network threads, or other latency-sensitive threads. In those cases, slow
       listeners can harm responsiveness, slow the system as a whole, or worse. (See also the
       note about locking below.)
   - If many tasks will be triggered by the same event, one heavyweight task may delay other
       tasks -- even tasks that are not themselves directExecutor tasks.
   - If many such tasks are chained together (such as with 
       future.transform(...).transform(...).transform(...)....), they may overflow the stack.
       (In simple cases, callers can avoid this by registering all tasks with the same MoreExecutors#newSequentialExecutor wrapper around directExecutor(). More
       complex cases may require using thread pools or making deeper changes.)
   - If an exception propagates out of a Runnable, it is not necessarily seen by any
       UncaughtExceptionHandler for the thread. For example, if the callback passed to
       Futures#addCallback throws an exception, that exception will be typically be
       logged by the ListenableFuture implementation, even if the thread is configured
       to do something different. In other cases, no code will catch the exception, and it may
       terminate whichever thread happens to trigger the execution.
 


 A specific warning about locking: Code that executes user-supplied tasks, such as 
 ListenableFuture listeners, should take care not to do so while holding a lock. Additionally,
 as a further line of defense, prefer not to perform any locking inside a task that will be run
 under directExecutor: Not only might the wait for a lock be long, but if the running
 thread was holding a lock, the listener may deadlock or break lock isolation.

 
This instance is equivalent to:

 

```

 final class DirectExecutor implements Executor {
   public void execute(Runnable r) {
     r.run();
   }
 }
 
```


 
This should be preferred to #newDirectExecutorService() because implementing the
 ExecutorService subinterface necessitates significant performance overhead.

**Returns:** `java.util.concurrent.Executor`

### `newSequentialExecutor(Executor delegate)`

executed tasks have a happens-before order as defined in the
 Java Language Specification. Tasks execute with the same happens-before order that the function
 calls to `execute()` that submitted those tasks had.

 
The executor uses delegate in order to execute each task in
 turn, and does not create any threads of its own.

 
After execution begins on a thread from the delegate Executor, tasks are
 polled and executed from a task queue until there are no more tasks. The thread will not be
 released until there are no more tasks to run.

 
If a task is submitted while a thread is executing tasks from the task queue, the thread
 will not be released until that submitted task is also complete.

 
If a task is interrupted while a task is running:

 

   - execution will not stop until the task queue is empty.
   - tasks will begin execution with the thread marked as not interrupted - any interruption
       applies only to the task that was running at the point of interruption.
   - if the thread was interrupted before the SequentialExecutor's worker begins execution,
       the interrupt will be restored to the thread after it completes so that its 
       delegate Executor may process the interrupt.
   - subtasks are run with the thread uninterrupted and interrupts received during execution
       of a task are ignored.
 


 
RuntimeExceptions thrown by tasks are simply logged and the executor keeps trucking.
 If an Error is thrown, the error will propagate and execution will stop until the next
 time a task is submitted.

 
When an Error is thrown by an executed task, previously submitted tasks may never
 run. An attempt will be made to restart execution on the next call to execute. If the
 delegate has begun to reject execution, the previously submitted tasks may never run,
 despite not throwing a RejectedExecutionException synchronously with the call to 
 execute. If this behaviour is problematic, use an Executor with a single thread (e.g. Executors#newSingleThreadExecutor).

**Parameters:**
- `delegate` (`java.util.concurrent.Executor`)

**Returns:** `java.util.concurrent.Executor`

### `listeningDecorator(ExecutorService delegate)`

Those methods, as well
 as execute and invokeAny, are implemented in terms of calls to 
 delegate.execute. All other methods are forwarded unchanged to the delegate. This implies that
 the returned ListeningExecutorService never calls the delegate's submit, 
 invokeAll, and invokeAny methods, so any special handling of tasks must be implemented
 in the delegate's execute method or by wrapping the returned 
 ListeningExecutorService.

 
If the delegate executor was already an instance of ListeningExecutorService, it is
 returned untouched, and the rest of this documentation does not apply.

**Parameters:**
- `delegate` (`java.util.concurrent.ExecutorService`)

**Returns:** [`com.google.common.util.concurrent.ListeningExecutorService`](./ListeningExecutorService.md)

### `listeningDecorator(ScheduledExecutorService delegate)`

Those methods, as
 well as execute and invokeAny, are implemented in terms of calls to 
 delegate.execute. All other methods are forwarded unchanged to the delegate. This implies that
 the returned ListeningScheduledExecutorService never calls the delegate's 
 submit, invokeAll, and invokeAny methods, so any special handling of tasks
 must be implemented in the delegate's execute method or by wrapping the returned 
 ListeningScheduledExecutorService.

 
If the delegate executor was already an instance of 
 ListeningScheduledExecutorService, it is returned untouched, and the rest of this
 documentation does not apply.

**Parameters:**
- `delegate` (`java.util.concurrent.ScheduledExecutorService`)

**Returns:** [`com.google.common.util.concurrent.ListeningScheduledExecutorService`](./ListeningScheduledExecutorService.md)

### `invokeAnyImpl(ListeningExecutorService executorService, Collection<? extends Callable<T>> tasks, boolean timed, Duration timeout)`

**Parameters:**
- `executorService` ([`com.google.common.util.concurrent.ListeningExecutorService`](./ListeningExecutorService.md))
- `tasks` (`java.util.Collection<? extends java.util.concurrent.Callable<T>>`)
- `timed` (`boolean`)
- `timeout` (`java.time.Duration`)

**Returns:** `T`

### `invokeAnyImpl(ListeningExecutorService executorService, Collection<? extends Callable<T>> tasks, boolean timed, long timeout, TimeUnit unit)`

**Parameters:**
- `executorService` ([`com.google.common.util.concurrent.ListeningExecutorService`](./ListeningExecutorService.md))
- `tasks` (`java.util.Collection<? extends java.util.concurrent.Callable<T>>`)
- `timed` (`boolean`)
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `T`

### `submitAndAddQueueListener(ListeningExecutorService executorService, Callable<T> task, BlockingQueue<Future<T>> queue)`

**Parameters:**
- `executorService` ([`com.google.common.util.concurrent.ListeningExecutorService`](./ListeningExecutorService.md))
- `task` (`java.util.concurrent.Callable<T>`)
- `queue` (`java.util.concurrent.BlockingQueue<java.util.concurrent.Future<T>>`)

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<T>`](./ListenableFuture.md)

### `platformThreadFactory()`

When running on AppEngine with access to [AppEngine legacy
 APIs](https://cloud.google.com/appengine/docs/standard/java/javadoc/), this method returns ThreadManager.currentRequestThreadFactory(). Otherwise,
 it returns Executors#defaultThreadFactory().

**Returns:** `java.util.concurrent.ThreadFactory`

### `isAppEngineWithApiClasses()`

**Returns:** `boolean`

### `newThread(String name, Runnable runnable)`

**Parameters:**
- `name` (`java.lang.String`)
- `runnable` (`java.lang.Runnable`)

**Returns:** `java.lang.Thread`

### `renamingDecorator(Executor executor, Supplier<String> nameSupplier)`

The names are retrieved from the nameSupplier on the thread that is being renamed
 right before each task is run. The renaming is best effort, if a SecurityManager
 prevents the renaming then it will be skipped but the tasks will still execute.

**Parameters:**
- `executor` (`java.util.concurrent.Executor`): The executor to decorate
- `nameSupplier` ([`com.google.common.base.Supplier<java.lang.String>`](../../base/Supplier.md)): The source of names for each task

**Returns:** `java.util.concurrent.Executor`

### `renamingDecorator(ExecutorService service, Supplier<String> nameSupplier)`

The names are retrieved from the nameSupplier on the thread that is being renamed
 right before each task is run. The renaming is best effort, if a SecurityManager
 prevents the renaming then it will be skipped but the tasks will still execute.

**Parameters:**
- `service` (`java.util.concurrent.ExecutorService`): The executor to decorate
- `nameSupplier` ([`com.google.common.base.Supplier<java.lang.String>`](../../base/Supplier.md)): The source of names for each task

**Returns:** `java.util.concurrent.ExecutorService`

### `renamingDecorator(ScheduledExecutorService service, Supplier<String> nameSupplier)`

The names are retrieved from the nameSupplier on the thread that is being renamed
 right before each task is run. The renaming is best effort, if a SecurityManager
 prevents the renaming then it will be skipped but the tasks will still execute.

**Parameters:**
- `service` (`java.util.concurrent.ScheduledExecutorService`): The executor to decorate
- `nameSupplier` ([`com.google.common.base.Supplier<java.lang.String>`](../../base/Supplier.md)): The source of names for each task

**Returns:** `java.util.concurrent.ScheduledExecutorService`

### `shutdownAndAwaitTermination(ExecutorService service, Duration timeout)`

The method takes the following steps:

 

   - calls ExecutorService#shutdown(), disabling acceptance of new submitted tasks.
   - awaits executor service termination for half of the specified timeout.
   - if the timeout expires, it calls ExecutorService#shutdownNow(), cancelling
       pending tasks and interrupting running tasks.
   - awaits executor service termination for the other half of the specified timeout.
 


 
If, at any step of the process, the calling thread is interrupted, the method calls ExecutorService#shutdownNow() and returns.

**Parameters:**
- `service` (`java.util.concurrent.ExecutorService`): the ExecutorService to shut down
- `timeout` (`java.time.Duration`): the maximum time to wait for the ExecutorService to terminate

**Returns:** `boolean`

### `shutdownAndAwaitTermination(ExecutorService service, long timeout, TimeUnit unit)`

The method takes the following steps:

 

   - calls ExecutorService#shutdown(), disabling acceptance of new submitted tasks.
   - awaits executor service termination for half of the specified timeout.
   - if the timeout expires, it calls ExecutorService#shutdownNow(), cancelling
       pending tasks and interrupting running tasks.
   - awaits executor service termination for the other half of the specified timeout.
 


 
If, at any step of the process, the calling thread is interrupted, the method calls ExecutorService#shutdownNow() and returns.

**Parameters:**
- `service` (`java.util.concurrent.ExecutorService`): the ExecutorService to shut down
- `timeout` (`long`): the maximum time to wait for the ExecutorService to terminate
- `unit` (`java.util.concurrent.TimeUnit`): the time unit of the timeout argument

**Returns:** `boolean`

### `rejectionPropagatingExecutor(Executor delegate, AbstractFuture<?> future)`

Note, the returned executor can only be used once.

**Parameters:**
- `delegate` (`java.util.concurrent.Executor`)
- `future` ([`com.google.common.util.concurrent.AbstractFuture<?>`](./AbstractFuture.md))

**Returns:** `java.util.concurrent.Executor`

