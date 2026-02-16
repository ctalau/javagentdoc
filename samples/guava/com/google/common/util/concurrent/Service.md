# Interface: `Service`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.Service`

## Description

An object with an operational state, plus asynchronous `startAsync()` and `stopAsync()` lifecycle methods to transition between states. Example services include
 webservers, RPC servers and timers.

 <p>The normal lifecycle of a service is:

 <ul>
   <li>NEW -&gt;
   <li>STARTING -&gt;
   <li>RUNNING -&gt;
   <li>STOPPING -&gt;
   <li>TERMINATED
 </ul>

 <p>There are deviations from this if there are failures or if `Service.stopAsync` is called
 before the `Service` reaches the RUNNING state. The set of legal
 transitions form a <a href="http://en.wikipedia.org/wiki/Directed_acyclic_graph">DAG</a>,
 therefore every method of the listener will be called at most once. N.B. The `State.FAILED`
 and `State.TERMINATED` states are terminal states, once a service enters either of these
 states it cannot ever leave them.

 <p>Implementors of this interface are strongly encouraged to extend one of the abstract classes
 in this package which implement this interface and make the threading and state management
 easier.
**Author:** Jesse Wilson
**Author:** Luke Sandberg
**Since:** 9.0 (in 1.0 as `com.google.common.base.Service`)

## Methods

### `startAsync()`

**Returns:** [`com.google.common.util.concurrent.Service`](./Service.md)

If the service state is `State.NEW`, this initiates service startup and returns
 immediately. A stopped service may not be restarted.
@return this
@throws IllegalStateException if the service is not `State.NEW`
**Since:** 15.0

### `isRunning()`

**Returns:** `boolean`

Returns `true` if this service is running.

### `state()`

**Returns:** [`com.google.common.util.concurrent.Service.State`](Service/State.md)

Returns the lifecycle state of the service.

### `stopAsync()`

**Returns:** [`com.google.common.util.concurrent.Service`](./Service.md)

If the service is starting or running,
 this initiates service shutdown and returns immediately. If the service is new, it is terminated without having been started nor
 stopped. If the service has already been stopped, this method returns immediately without
 taking action.
@return this
**Since:** 15.0

### `awaitRunning()`

**Returns:** `void`

Waits for the `Service` to reach the running state.
@throws IllegalStateException if the service reaches a state from which it is not possible to
     enter the `State.RUNNING` state. e.g. if the `state` is `State#TERMINATED` when this method is called then this will throw an IllegalStateException.
**Since:** 15.0

### `awaitRunning(`java.time.Duration` timeout)`

**Returns:** `void`

Waits for the `Service` to reach the running state for no more
 than the given time.
@param timeout the maximum time to wait
@throws TimeoutException if the service has not reached the given state within the deadline
@throws IllegalStateException if the service reaches a state from which it is not possible to
     enter the `State.RUNNING RUNNING` state. e.g. if the `state` is `State#TERMINATED` when this method is called then this will throw an IllegalStateException.
**Since:** 28.0

### `awaitRunning(`long` timeout, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `void`

Waits for the `Service` to reach the running state for no more
 than the given time.
@param timeout the maximum time to wait
@param unit the time unit of the timeout argument
@throws TimeoutException if the service has not reached the given state within the deadline
@throws IllegalStateException if the service reaches a state from which it is not possible to
     enter the `State.RUNNING RUNNING` state. e.g. if the `state` is `State#TERMINATED` when this method is called then this will throw an IllegalStateException.
**Since:** 15.0

### `awaitTerminated()`

**Returns:** `void`

Waits for the `Service` to reach the terminated state.
@throws IllegalStateException if the service fails.
**Since:** 15.0

### `awaitTerminated(`java.time.Duration` timeout)`

**Returns:** `void`

Waits for the `Service` to reach a terminal state (either `Service.State.TERMINATED terminated` or `Service.State.FAILED failed`) for no more than the given time.
@param timeout the maximum time to wait
@throws TimeoutException if the service has not reached the given state within the deadline
@throws IllegalStateException if the service fails.
**Since:** 28.0

### `awaitTerminated(`long` timeout, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `void`

Waits for the `Service` to reach a terminal state (either `Service.State.TERMINATED terminated` or `Service.State.FAILED failed`) for no more than the given time.
@param timeout the maximum time to wait
@param unit the time unit of the timeout argument
@throws TimeoutException if the service has not reached the given state within the deadline
@throws IllegalStateException if the service fails.
**Since:** 15.0

### `failureCause()`

**Returns:** `java.lang.Throwable`

Returns the `Throwable` that caused this service to fail.
@throws IllegalStateException if this service's state isn't FAILED.
**Since:** 14.0

### `addListener([`com.google.common.util.concurrent.Service.Listener`](Service/Listener.md) listener, `java.util.concurrent.Executor` executor)`

**Returns:** `void`

Registers a `Listener` to be executed on the given
 executor. The listener will have the corresponding transition method called whenever the
 service changes state. The listener will not have previous state changes replayed, so it is
 suggested that listeners are added before the service starts.

 <p>`addListener` guarantees execution ordering across calls to a given listener but not
 across calls to multiple listeners. Specifically, a given listener will have its callbacks
 invoked in the same order as the underlying service enters those states. Additionally, at most
 one of the listener's callbacks will execute at once. However, multiple listeners' callbacks
 may execute concurrently, and listeners may execute in an order different from the one in which
 they were registered.

 <p>RuntimeExceptions thrown by a listener will be caught and logged. Any exception thrown
 during `Executor.execute` (e.g., a `RejectedExecutionException`) will be caught and
 logged.
@param listener the listener to run when the service changes state is complete
@param executor the executor in which the listeners callback methods will be run. For fast,
     lightweight listeners that would be safe to execute in any thread, consider `MoreExecutors.directExecutor`.
**Since:** 13.0

