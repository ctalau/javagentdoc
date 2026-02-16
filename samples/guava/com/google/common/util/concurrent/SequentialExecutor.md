# Class: `SequentialExecutor`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.SequentialExecutor`

**Implements:** [`java.util.concurrent.Executor`](../../../../../java/util/concurrent/Executor.md)

## Description

Executor ensuring that all Runnables submitted are executed in order, using the provided
 Executor, and sequentially such that no two will ever be running at the same time.

 <p>Tasks submitted to {@link #execute(Runnable)} are executed in FIFO order.

 <p>The execution of tasks is done by one thread as long as there are tasks left in the queue.
 When a task is {@linkplain Thread#interrupt interrupted}, execution of subsequent tasks
 continues. See {@link QueueWorker#workOnQueue} for details.

 <p>{@code RuntimeException}s thrown by tasks are simply logged and the executor keeps trucking.
 If an {@code Error} is thrown, the error will propagate and execution will stop until it is
 restarted by a call to {@link #execute}.

## Fields

### `log`

**Type:** [`com.google.common.util.concurrent.LazyLogger`](./LazyLogger.md)

### `executor`

**Type:** [`java.util.concurrent.Executor`](../../../../../java/util/concurrent/Executor.md)

Underlying executor that all submitted Runnable objects are run on.

### `queue`

**Type:** [`java.util.Deque<java.lang.Runnable>`](../../../../../java/util/Deque.md)

### `workerRunningState`

**Type:** [`com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState`](SequentialExecutor/WorkerRunningState.md)

see {@link WorkerRunningState}

### `workerRunCount`

**Type:** `long`

This counter prevents an ABA issue where a thread may successfully schedule the worker, the
 worker runs and exhausts the queue, another thread enqueues a task and fails to schedule the
 worker, and then the first thread's call to delegate.execute() returns. Without this counter,
 it would observe the QUEUING state and set it to QUEUED, and the worker would never be
 scheduled again for future submissions.

### `worker`

**Type:** [`com.google.common.util.concurrent.SequentialExecutor.QueueWorker`](SequentialExecutor/QueueWorker.md)

## Constructors

### `<init>([`java.util.concurrent.Executor`](../../../../../java/util/concurrent/Executor.md) executor)`

Use {@link MoreExecutors#newSequentialExecutor}

## Methods

### `execute(`java.lang.Runnable` task)`

**Returns:** `void`

Adds a task to the queue and makes sure a worker thread is running.

 <p>If this method throws, e.g. a {@code RejectedExecutionException} from the delegate executor,
 execution of tasks will stop until a call to this method is made.

### `toString()`

**Returns:** `java.lang.String`

