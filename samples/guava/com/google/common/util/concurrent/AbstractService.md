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

### `terminatedEvent(Service.State from)`

**Parameters:**
- `from` (`com.google.common.util.concurrent.Service.State`)

**Returns:** `com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener>`

### `stoppingEvent(Service.State from)`

**Parameters:**
- `from` (`com.google.common.util.concurrent.Service.State`)

**Returns:** `com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener>`

### `doStart()`

The invocation of
 this method should cause a call to #notifyStarted(), either during this method's run,
 or after it has returned. If startup fails, the invocation should cause a call to #notifyFailed(Throwable) instead.

 
This method should return promptly; prefer to do work on a different thread where it is
 convenient. It is invoked exactly once on service startup, even when #startAsync is
 called multiple times.

**Returns:** `void`

### `doStop()`

The invocation of this method should
 cause a call to #notifyStopped(), either during this method's run, or after it has
 returned. If shutdown fails, the invocation should cause a call to #notifyFailed(Throwable) instead.

 
This method should return promptly; prefer to do work on a different thread where it is
 convenient. It is invoked exactly once on service shutdown, even when #stopAsync is
 called multiple times.

 
If #stopAsync is called on a State#STARTING service, this method is not
 invoked immediately. Instead, it will be deferred until after the service is State#RUNNING. Services that need to cancel startup work can override #doCancelStart.

**Returns:** `void`

### `doCancelStart()`

#startAsync has been called but #notifyStarted has not). Subclasses can override the
 method to cancel pending work and then call #notifyStopped to stop the service.

 
This method should return promptly; prefer to do work on a different thread where it is
 convenient. It is invoked exactly once on service shutdown, even when #stopAsync is
 called multiple times.

 
When this method is called #state() will return State#STOPPING, which is the
 external state observable by the caller of #stopAsync.

**Returns:** `void`

### `startAsync()`

**Returns:** [`com.google.common.util.concurrent.Service`](./Service.md)

### `stopAsync()`

**Returns:** [`com.google.common.util.concurrent.Service`](./Service.md)

### `awaitRunning()`

**Returns:** `void`

### `awaitRunning(Duration timeout)`

**Parameters:**
- `timeout` (`java.time.Duration`)

**Returns:** `void`

### `awaitRunning(long timeout, TimeUnit unit)`

**Parameters:**
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `void`

### `awaitTerminated()`

**Returns:** `void`

### `awaitTerminated(Duration timeout)`

**Parameters:**
- `timeout` (`java.time.Duration`)

**Returns:** `void`

### `awaitTerminated(long timeout, TimeUnit unit)`

**Parameters:**
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `void`

### `checkCurrentState(Service.State expected)`

**Parameters:**
- `expected` (`com.google.common.util.concurrent.Service.State`)

**Returns:** `void`

### `notifyStarted()`

It will cause
 the service to transition from State#STARTING to State#RUNNING.

**Returns:** `void`

### `notifyStopped()`

It will cause
 the service to transition from State#STARTING or State#STOPPING to State#TERMINATED.

**Returns:** `void`

### `notifyFailed(Throwable cause)`

The service will
 **not be stopped** if it is running. Invoke this method when a service has failed critically
 or otherwise cannot be started nor stopped.

**Parameters:**
- `cause` (`java.lang.Throwable`)

**Returns:** `void`

### `isRunning()`

**Returns:** `boolean`

### `state()`

**Returns:** `com.google.common.util.concurrent.Service.State`

### `failureCause()`

**Returns:** `java.lang.Throwable`

### `addListener(Service.Listener listener, Executor executor)`

**Parameters:**
- `listener` (`com.google.common.util.concurrent.Service.Listener`)
- `executor` (`java.util.concurrent.Executor`)

**Returns:** `void`

### `toString()`

**Returns:** `java.lang.String`

### `dispatchListenerEvents()`

**Returns:** `void`

### `enqueueStartingEvent()`

**Returns:** `void`

### `enqueueRunningEvent()`

**Returns:** `void`

### `enqueueStoppingEvent(Service.State from)`

**Parameters:**
- `from` (`com.google.common.util.concurrent.Service.State`)

**Returns:** `void`

### `enqueueTerminatedEvent(Service.State from)`

**Parameters:**
- `from` (`com.google.common.util.concurrent.Service.State`)

**Returns:** `void`

### `enqueueFailedEvent(Service.State from, Throwable cause)`

**Parameters:**
- `from` (`com.google.common.util.concurrent.Service.State`)
- `cause` (`java.lang.Throwable`)

**Returns:** `void`

