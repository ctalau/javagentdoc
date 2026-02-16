# Class: `ExecutionList`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ExecutionList`

## Description

A support class for {@code ListenableFuture} implementations to manage their listeners. An
 instance contains a list of listeners, each with an associated {@code Executor}, and guarantees
 that every {@code Runnable} that is {@linkplain #add added} will be executed after {@link #execute()} is called. Any {@code Runnable} added after the call to {@code execute} is still
 guaranteed to execute. There is no guarantee, however, that listeners will be executed in the
 order that they are added.

 <p>Exceptions thrown by a listener will be propagated up to the executor. Any exception thrown
 during {@code Executor.execute} (e.g., a {@code RejectedExecutionException} or an exception
 thrown by {@linkplain MoreExecutors#directExecutor direct execution}) will be caught and logged.
@author Nishant Thakkar
@author Sven Mawson
@since 1.0

## Fields

### `log`

**Type:** [`com.google.common.util.concurrent.LazyLogger`](./LazyLogger.md)

Logger to log exceptions caught when running runnables.

### `runnables`

**Type:** [`com.google.common.util.concurrent.ExecutionList.RunnableExecutorPair`](ExecutionList/RunnableExecutorPair.md)

The runnable, executor pairs to execute. This acts as a stack threaded through the {@link RunnableExecutorPair#next} field.

### `executed`

**Type:** `boolean`

## Constructors

### `<init>()`

Creates a new, empty {@link ExecutionList}.

## Methods

### `add(`java.lang.Runnable` runnable, [`java.util.concurrent.Executor`](../../../../../java/util/concurrent/Executor.md) executor)`

**Returns:** `void`

Adds the {@code Runnable} and accompanying {@code Executor} to the list of listeners to
 execute. If execution has already begun, the listener is executed immediately.

 <p>When selecting an executor, note that {@code directExecutor} is dangerous in some cases. See
 the discussion in the {@link ListenableFuture#addListener ListenableFuture.addListener}
 documentation.

### `execute()`

**Returns:** `void`

Runs this execution list, executing all existing pairs in the order they were added. However,
 note that listeners added after this point may be executed before those previously added, and
 note that the execution order of all listeners is ultimately chosen by the implementations of
 the supplied executors.

 <p>This method is idempotent. Calling it several times in parallel is semantically equivalent
 to calling it exactly once.
@since 10.0 (present in 1.0 as {@code run})

### `executeListener(`java.lang.Runnable` runnable, [`java.util.concurrent.Executor`](../../../../../java/util/concurrent/Executor.md) executor)`

**Returns:** `void`

Submits the given runnable to the given {@link Executor} catching and logging all {@linkplain RuntimeException runtime exceptions} thrown by the executor.

