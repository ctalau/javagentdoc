# Class: `SequentialExecutor`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.SequentialExecutor`

**Implements:** `java.util.concurrent.Executor`

## Description

Tasks submitted to #execute(Runnable) are executed in FIFO order.

 
The execution of tasks is done by one thread as long as there are tasks left in the queue.
 When a task is interrupted, execution of subsequent tasks
 continues. See QueueWorker#workOnQueue for details.

 
RuntimeExceptions thrown by tasks are simply logged and the executor keeps trucking.
 If an Error is thrown, the error will propagate and execution will stop until it is
 restarted by a call to #execute.

## Fields

### `log`

**Type:** [`com.google.common.util.concurrent.LazyLogger`](./LazyLogger.md)

### `executor`

**Type:** `java.util.concurrent.Executor`

### `queue`

**Type:** `java.util.Deque<java.lang.Runnable>`

### `workerRunningState`

**Type:** `com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState`

### `workerRunCount`

**Type:** `long`

Without this counter,
 it would observe the QUEUING state and set it to QUEUED, and the worker would never be
 scheduled again for future submissions.

### `worker`

**Type:** `com.google.common.util.concurrent.SequentialExecutor.QueueWorker`

## Constructors

### `<init>(Executor executor)`

**Parameters:**
- `executor` (`java.util.concurrent.Executor`)

## Methods

### `execute(Runnable task)`

If this method throws, e.g. a RejectedExecutionException from the delegate executor,
 execution of tasks will stop until a call to this method is made.

**Parameters:**
- `task` (`java.lang.Runnable`)

**Returns:** `void`

### `toString()`

**Returns:** `java.lang.String`

