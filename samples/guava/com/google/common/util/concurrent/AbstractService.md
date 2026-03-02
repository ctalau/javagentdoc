# Class: `AbstractService`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.AbstractService`

**Implements:** [`com.google.common.util.concurrent.Service`](./Service.md)

## Description

Its subclasses must manage threads manually; consider AbstractExecutionThreadService if you need only a single execution thread.

## Fields

### `STARTING_EVENT`

**Type:** `com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener>`

### `RUNNING_EVENT`

**Type:** `com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener>`

### `STOPPING_FROM_STARTING_EVENT`

**Type:** `com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener>`

### `STOPPING_FROM_RUNNING_EVENT`

**Type:** `com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener>`

### `TERMINATED_FROM_NEW_EVENT`

**Type:** `com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener>`

### `TERMINATED_FROM_STARTING_EVENT`

**Type:** `com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener>`

### `TERMINATED_FROM_RUNNING_EVENT`

**Type:** `com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener>`

### `TERMINATED_FROM_STOPPING_EVENT`

**Type:** `com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener>`

### `monitor`

**Type:** [`com.google.common.util.concurrent.Monitor`](./Monitor.md)

### `isStartable`

**Type:** `com.google.common.util.concurrent.Monitor.Guard`

### `isStoppable`

**Type:** `com.google.common.util.concurrent.Monitor.Guard`

### `hasReachedRunning`

**Type:** `com.google.common.util.concurrent.Monitor.Guard`

### `isStopped`

**Type:** `com.google.common.util.concurrent.Monitor.Guard`

### `listeners`

**Type:** [`com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.Service.Listener>`](./ListenerCallQueue.md)

### `snapshot`

**Type:** `com.google.common.util.concurrent.AbstractService.StateSnapshot`

This should be written with the lock held but can be read
 without it because it is an immutable object in a volatile field. This is desirable so that
 methods like #state, #failureCause and notably #toString can be run
 without grabbing the lock.

 
To update this field correctly the lock must be held to guarantee that the state is
 consistent.

## Constructors

### `<init>()`

## Methods

### `terminatedEvent(com.google.common.util.concurrent.Service.State from)`

**Returns:** `com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener>`

**Parameters:**
- `from` (`com.google.common.util.concurrent.Service.State`)

### `stoppingEvent(com.google.common.util.concurrent.Service.State from)`

**Returns:** `com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener>`

**Parameters:**
- `from` (`com.google.common.util.concurrent.Service.State`)

### `doStart()`

**Returns:** `void`

The invocation of
 this method should cause a call to #notifyStarted(), either during this method's run,
 or after it has returned. If startup fails, the invocation should cause a call to #notifyFailed(Throwable) instead.

 
This method should return promptly; prefer to do work on a different thread where it is
 convenient. It is invoked exactly once on service startup, even when #startAsync is
 called multiple times.

### `doStop()`

**Returns:** `void`

The invocation of this method should
 cause a call to #notifyStopped(), either during this method's run, or after it has
 returned. If shutdown fails, the invocation should cause a call to #notifyFailed(Throwable) instead.

 
This method should return promptly; prefer to do work on a different thread where it is
 convenient. It is invoked exactly once on service shutdown, even when #stopAsync is
 called multiple times.

 
If #stopAsync is called on a State#STARTING service, this method is not
 invoked immediately. Instead, it will be deferred until after the service is State#RUNNING. Services that need to cancel startup work can override #doCancelStart.

### `doCancelStart()`

**Returns:** `void`

#startAsync has been called but #notifyStarted has not). Subclasses can override the
 method to cancel pending work and then call #notifyStopped to stop the service.

 
This method should return promptly; prefer to do work on a different thread where it is
 convenient. It is invoked exactly once on service shutdown, even when #stopAsync is
 called multiple times.

 
When this method is called #state() will return State#STOPPING, which is the
 external state observable by the caller of #stopAsync.

### `startAsync()`

**Returns:** [`com.google.common.util.concurrent.Service`](./Service.md)

### `stopAsync()`

**Returns:** [`com.google.common.util.concurrent.Service`](./Service.md)

### `awaitRunning()`

**Returns:** `void`

### `awaitRunning(java.time.Duration timeout)`

**Returns:** `void`

**Parameters:**
- `timeout` (`java.time.Duration`)

### `awaitRunning(long timeout, java.util.concurrent.TimeUnit unit)`

**Returns:** `void`

**Parameters:**
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `awaitTerminated()`

**Returns:** `void`

### `awaitTerminated(java.time.Duration timeout)`

**Returns:** `void`

**Parameters:**
- `timeout` (`java.time.Duration`)

### `awaitTerminated(long timeout, java.util.concurrent.TimeUnit unit)`

**Returns:** `void`

**Parameters:**
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `checkCurrentState(com.google.common.util.concurrent.Service.State expected)`

**Returns:** `void`

**Parameters:**
- `expected` (`com.google.common.util.concurrent.Service.State`)

### `notifyStarted()`

**Returns:** `void`

It will cause
 the service to transition from State#STARTING to State#RUNNING.

### `notifyStopped()`

**Returns:** `void`

It will cause
 the service to transition from State#STARTING or State#STOPPING to State#TERMINATED.

### `notifyFailed(java.lang.Throwable cause)`

**Returns:** `void`

The service will
 **not be stopped** if it is running. Invoke this method when a service has failed critically
 or otherwise cannot be started nor stopped.

**Parameters:**
- `cause` (`java.lang.Throwable`)

### `isRunning()`

**Returns:** `boolean`

### `state()`

**Returns:** `com.google.common.util.concurrent.Service.State`

### `failureCause()`

**Returns:** `java.lang.Throwable`

### `addListener(com.google.common.util.concurrent.Service.Listener listener, java.util.concurrent.Executor executor)`

**Returns:** `void`

**Parameters:**
- `listener` (`com.google.common.util.concurrent.Service.Listener`)
- `executor` (`java.util.concurrent.Executor`)

### `toString()`

**Returns:** `java.lang.String`

### `dispatchListenerEvents()`

**Returns:** `void`

### `enqueueStartingEvent()`

**Returns:** `void`

### `enqueueRunningEvent()`

**Returns:** `void`

### `enqueueStoppingEvent(com.google.common.util.concurrent.Service.State from)`

**Returns:** `void`

**Parameters:**
- `from` (`com.google.common.util.concurrent.Service.State`)

### `enqueueTerminatedEvent(com.google.common.util.concurrent.Service.State from)`

**Returns:** `void`

**Parameters:**
- `from` (`com.google.common.util.concurrent.Service.State`)

### `enqueueFailedEvent(com.google.common.util.concurrent.Service.State from, java.lang.Throwable cause)`

**Returns:** `void`

**Parameters:**
- `from` (`com.google.common.util.concurrent.Service.State`)
- `cause` (`java.lang.Throwable`)

