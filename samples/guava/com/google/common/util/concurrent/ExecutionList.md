# Class: `ExecutionList`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ExecutionList`

## Description

An
 instance contains a list of listeners, each with an associated Executor, and guarantees
 that every Runnable that is added will be executed after #execute() is called. Any Runnable added after the call to execute is still
 guaranteed to execute. There is no guarantee, however, that listeners will be executed in the
 order that they are added.

 
Exceptions thrown by a listener will be propagated up to the executor. Any exception thrown
 during Executor.execute (e.g., a RejectedExecutionException or an exception
 thrown by direct execution) will be caught and logged.

## Fields

### `log`

**Type:** [`com.google.common.util.concurrent.LazyLogger`](./LazyLogger.md)

### `runnables`

**Type:** `com.google.common.util.concurrent.ExecutionList.RunnableExecutorPair`

This acts as a stack threaded through the RunnableExecutorPair#next field.

### `executed`

**Type:** `boolean`

## Constructors

### `<init>()`

## Methods

### `add(java.lang.Runnable runnable, java.util.concurrent.Executor executor)`

**Returns:** `void`

If execution has already begun, the listener is executed immediately.

 
When selecting an executor, note that directExecutor is dangerous in some cases. See
 the discussion in the ListenableFuture.addListener
 documentation.

**Parameters:**
- `runnable` (`java.lang.Runnable`)
- `executor` (`java.util.concurrent.Executor`)

### `execute()`

**Returns:** `void`

However,
 note that listeners added after this point may be executed before those previously added, and
 note that the execution order of all listeners is ultimately chosen by the implementations of
 the supplied executors.

 
This method is idempotent. Calling it several times in parallel is semantically equivalent
 to calling it exactly once.

### `executeListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor)`

**Returns:** `void`

**Parameters:**
- `runnable` (`java.lang.Runnable`)
- `executor` (`java.util.concurrent.Executor`)

