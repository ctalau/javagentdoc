# Class: `ExecutionList`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ExecutionList`

## Description

A support class for `ListenableFuture` implementations to manage their listeners. An
 instance contains a list of listeners, each with an associated `Executor`, and guarantees
 that every `Runnable` that is added will be executed after `execute()` is called. Any `Runnable` added after the call to `execute` is still
 guaranteed to execute. There is no guarantee, however, that listeners will be executed in the
 order that they are added.

 <p>Exceptions thrown by a listener will be propagated up to the executor. Any exception thrown
 during `Executor.execute` (e.g., a `RejectedExecutionException` or an exception
 thrown by direct execution) will be caught and logged.
**Author:** Nishant Thakkar
**Author:** Sven Mawson
**Since:** 1.0

## Fields

### `log`

**Type:** [`com.google.common.util.concurrent.LazyLogger`](./LazyLogger.md)

Logger to log exceptions caught when running runnables.

### `runnables`

**Type:** [`com.google.common.util.concurrent.ExecutionList.RunnableExecutorPair`](ExecutionList/RunnableExecutorPair.md)

The runnable, executor pairs to execute. This acts as a stack threaded through the `RunnableExecutorPair.next` field.

### `executed`

**Type:** `boolean`

## Constructors

### `<init>()`

Creates a new, empty `ExecutionList`.

## Methods

### `add(`java.lang.Runnable` runnable, `java.util.concurrent.Executor` executor)`

**Returns:** `void`

Adds the `Runnable` and accompanying `Executor` to the list of listeners to
 execute. If execution has already begun, the listener is executed immediately.

 <p>When selecting an executor, note that `directExecutor` is dangerous in some cases. See
 the discussion in the `ListenableFuture.addListener ListenableFuture.addListener`
 documentation.

### `execute()`

**Returns:** `void`

Runs this execution list, executing all existing pairs in the order they were added. However,
 note that listeners added after this point may be executed before those previously added, and
 note that the execution order of all listeners is ultimately chosen by the implementations of
 the supplied executors.

 <p>This method is idempotent. Calling it several times in parallel is semantically equivalent
 to calling it exactly once.
**Since:** 10.0 (present in 1.0 as `run`)

### `executeListener(`java.lang.Runnable` runnable, `java.util.concurrent.Executor` executor)`

**Returns:** `void`

Submits the given runnable to the given `Executor` catching and logging all runtime exceptions thrown by the executor.

