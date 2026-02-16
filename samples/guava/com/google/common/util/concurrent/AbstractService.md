# Class: `AbstractService`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.AbstractService`

**Implements:** [`com.google.common.util.concurrent.Service`](./Service.md)

## Description

Base class for implementing services that can handle `doStart` and `doStop`
 requests, responding to them with `notifyStarted()` and `notifyStopped()`
 callbacks. Its subclasses must manage threads manually; consider `AbstractExecutionThreadService` if you need only a single execution thread.
**Author:** Jesse Wilson
**Author:** Luke Sandberg
**Since:** 1.0

## Fields

### `STARTING_EVENT`

**Type:** [`com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener>`](ListenerCallQueue/Event.md)

### `RUNNING_EVENT`

**Type:** [`com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener>`](ListenerCallQueue/Event.md)

### `STOPPING_FROM_STARTING_EVENT`

**Type:** [`com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener>`](ListenerCallQueue/Event.md)

### `STOPPING_FROM_RUNNING_EVENT`

**Type:** [`com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener>`](ListenerCallQueue/Event.md)

### `TERMINATED_FROM_NEW_EVENT`

**Type:** [`com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener>`](ListenerCallQueue/Event.md)

### `TERMINATED_FROM_STARTING_EVENT`

**Type:** [`com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener>`](ListenerCallQueue/Event.md)

### `TERMINATED_FROM_RUNNING_EVENT`

**Type:** [`com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener>`](ListenerCallQueue/Event.md)

### `TERMINATED_FROM_STOPPING_EVENT`

**Type:** [`com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener>`](ListenerCallQueue/Event.md)

### `monitor`

**Type:** [`com.google.common.util.concurrent.Monitor`](./Monitor.md)

### `isStartable`

**Type:** [`com.google.common.util.concurrent.Monitor.Guard`](Monitor/Guard.md)

### `isStoppable`

**Type:** [`com.google.common.util.concurrent.Monitor.Guard`](Monitor/Guard.md)

### `hasReachedRunning`

**Type:** [`com.google.common.util.concurrent.Monitor.Guard`](Monitor/Guard.md)

### `isStopped`

**Type:** [`com.google.common.util.concurrent.Monitor.Guard`](Monitor/Guard.md)

### `listeners`

**Type:** [`com.google.common.util.concurrent.ListenerCallQueue<com.google.common.util.concurrent.Service.Listener>`](./ListenerCallQueue.md)

The listeners to notify during a state transition.

### `snapshot`

**Type:** [`com.google.common.util.concurrent.AbstractService.StateSnapshot`](AbstractService/StateSnapshot.md)

The current state of the service. This should be written with the lock held but can be read
 without it because it is an immutable object in a volatile field. This is desirable so that
 methods like `state`, `failureCause` and notably `toString` can be run
 without grabbing the lock.

 <p>To update this field correctly the lock must be held to guarantee that the state is
 consistent.

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `terminatedEvent([`com.google.common.util.concurrent.Service.State`](Service/State.md) from)`

**Returns:** [`com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener>`](ListenerCallQueue/Event.md)

### `stoppingEvent([`com.google.common.util.concurrent.Service.State`](Service/State.md) from)`

**Returns:** [`com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.Service.Listener>`](ListenerCallQueue/Event.md)

### `doStart()`

**Returns:** `void`

This method is called by `startAsync` to initiate service startup. The invocation of
 this method should cause a call to `notifyStarted()`, either during this method's run,
 or after it has returned. If startup fails, the invocation should cause a call to `notifyFailed(Throwable)` instead.

 <p>This method should return promptly; prefer to do work on a different thread where it is
 convenient. It is invoked exactly once on service startup, even when `startAsync` is
 called multiple times.

### `doStop()`

**Returns:** `void`

This method should be used to initiate service shutdown. The invocation of this method should
 cause a call to `notifyStopped()`, either during this method's run, or after it has
 returned. If shutdown fails, the invocation should cause a call to `notifyFailed(Throwable)` instead.

 <p>This method should return promptly; prefer to do work on a different thread where it is
 convenient. It is invoked exactly once on service shutdown, even when `stopAsync` is
 called multiple times.

 <p>If `stopAsync` is called on a `State.STARTING` service, this method is not
 invoked immediately. Instead, it will be deferred until after the service is `State.RUNNING`. Services that need to cancel startup work can override `doCancelStart`.

### `doCancelStart()`

**Returns:** `void`

This method is called by `stopAsync` when the service is still starting (i.e. `startAsync` has been called but `notifyStarted` has not). Subclasses can override the
 method to cancel pending work and then call `notifyStopped` to stop the service.

 <p>This method should return promptly; prefer to do work on a different thread where it is
 convenient. It is invoked exactly once on service shutdown, even when `stopAsync` is
 called multiple times.

 <p>When this method is called `state()` will return `State.STOPPING`, which is the
 external state observable by the caller of `stopAsync`.
**Since:** 27.0

### `startAsync()`

**Returns:** [`com.google.common.util.concurrent.Service`](./Service.md)

### `stopAsync()`

**Returns:** [`com.google.common.util.concurrent.Service`](./Service.md)

### `awaitRunning()`

**Returns:** `void`

### `awaitRunning(`java.time.Duration` timeout)`

**Returns:** `void`

**Since:** 28.0

### `awaitRunning(`long` timeout, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `void`

### `awaitTerminated()`

**Returns:** `void`

### `awaitTerminated(`java.time.Duration` timeout)`

**Returns:** `void`

**Since:** 28.0

### `awaitTerminated(`long` timeout, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `void`

### `checkCurrentState([`com.google.common.util.concurrent.Service.State`](Service/State.md) expected)`

**Returns:** `void`

Checks that the current state is equal to the expected state.

### `notifyStarted()`

**Returns:** `void`

Implementing classes should invoke this method once their service has started. It will cause
 the service to transition from `State.STARTING` to `State.RUNNING`.
@throws IllegalStateException if the service is not `State.STARTING`.

### `notifyStopped()`

**Returns:** `void`

Implementing classes should invoke this method once their service has stopped. It will cause
 the service to transition from `State.STARTING` or `State.STOPPING` to `State.TERMINATED`.
@throws IllegalStateException if the service is not one of `State.STOPPING`, `State.STARTING`, or `State.RUNNING`.

### `notifyFailed(`java.lang.Throwable` cause)`

**Returns:** `void`

Invoke this method to transition the service to the `State.FAILED`. The service will
 <b>not be stopped</b> if it is running. Invoke this method when a service has failed critically
 or otherwise cannot be started nor stopped.

### `isRunning()`

**Returns:** `boolean`

### `state()`

**Returns:** [`com.google.common.util.concurrent.Service.State`](Service/State.md)

### `failureCause()`

**Returns:** `java.lang.Throwable`

**Since:** 14.0

### `addListener([`com.google.common.util.concurrent.Service.Listener`](Service/Listener.md) listener, `java.util.concurrent.Executor` executor)`

**Returns:** `void`

**Since:** 13.0

### `toString()`

**Returns:** `java.lang.String`

### `dispatchListenerEvents()`

**Returns:** `void`

Attempts to execute all the listeners in `listeners` while not holding the `monitor`.

### `enqueueStartingEvent()`

**Returns:** `void`

### `enqueueRunningEvent()`

**Returns:** `void`

### `enqueueStoppingEvent([`com.google.common.util.concurrent.Service.State`](Service/State.md) from)`

**Returns:** `void`

### `enqueueTerminatedEvent([`com.google.common.util.concurrent.Service.State`](Service/State.md) from)`

**Returns:** `void`

### `enqueueFailedEvent([`com.google.common.util.concurrent.Service.State`](Service/State.md) from, `java.lang.Throwable` cause)`

**Returns:** `void`

