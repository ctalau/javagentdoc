# Interface: `Service`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.Service`

## Description

An object with an operational state, plus asynchronous {@link #startAsync()} and {@link #stopAsync()} lifecycle methods to transition between states. Example services include
 webservers, RPC servers and timers.

 <p>The normal lifecycle of a service is:

 <ul>
   <li>{@linkplain State#NEW NEW} -&gt;
   <li>{@linkplain State#STARTING STARTING} -&gt;
   <li>{@linkplain State#RUNNING RUNNING} -&gt;
   <li>{@linkplain State#STOPPING STOPPING} -&gt;
   <li>{@linkplain State#TERMINATED TERMINATED}
 </ul>

 <p>There are deviations from this if there are failures or if {@link Service#stopAsync} is called
 before the {@link Service} reaches the {@linkplain State#RUNNING RUNNING} state. The set of legal
 transitions form a <a href="http://en.wikipedia.org/wiki/Directed_acyclic_graph">DAG</a>,
 therefore every method of the listener will be called at most once. N.B. The {@link State#FAILED}
 and {@link State#TERMINATED} states are terminal states, once a service enters either of these
 states it cannot ever leave them.

 <p>Implementors of this interface are strongly encouraged to extend one of the abstract classes
 in this package which implement this interface and make the threading and state management
 easier.
@author Jesse Wilson
@author Luke Sandberg
@since 9.0 (in 1.0 as {@code com.google.common.base.Service})

## Methods

### `startAsync()`

**Returns:** [`com.google.common.util.concurrent.Service`](./Service.md)

If the service state is {@link State#NEW}, this initiates service startup and returns
 immediately. A stopped service may not be restarted.
@return this
@throws IllegalStateException if the service is not {@link State#NEW}
@since 15.0

### `isRunning()`

**Returns:** `boolean`

Returns {@code true} if this service is {@linkplain State#RUNNING running}.

### `state()`

**Returns:** [`com.google.common.util.concurrent.Service.State`](Service/State.md)

Returns the lifecycle state of the service.

### `stopAsync()`

**Returns:** [`com.google.common.util.concurrent.Service`](./Service.md)

If the service is {@linkplain State#STARTING starting} or {@linkplain State#RUNNING running},
 this initiates service shutdown and returns immediately. If the service is {@linkplain State#NEW new}, it is {@linkplain State#TERMINATED terminated} without having been started nor
 stopped. If the service has already been stopped, this method returns immediately without
 taking action.
@return this
@since 15.0

### `awaitRunning()`

**Returns:** `void`

Waits for the {@link Service} to reach the {@linkplain State#RUNNING running state}.
@throws IllegalStateException if the service reaches a state from which it is not possible to
     enter the {@link State#RUNNING} state. e.g. if the {@code state} is {@code
     State#TERMINATED} when this method is called then this will throw an IllegalStateException.
@since 15.0

### `awaitRunning([`java.time.Duration`](../../../../../java/time/Duration.md) timeout)`

**Returns:** `void`

Waits for the {@link Service} to reach the {@linkplain State#RUNNING running state} for no more
 than the given time.
@param timeout the maximum time to wait
@throws TimeoutException if the service has not reached the given state within the deadline
@throws IllegalStateException if the service reaches a state from which it is not possible to
     enter the {@link State#RUNNING RUNNING} state. e.g. if the {@code state} is {@code
     State#TERMINATED} when this method is called then this will throw an IllegalStateException.
@since 28.0

### `awaitRunning(`long` timeout, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** `void`

Waits for the {@link Service} to reach the {@linkplain State#RUNNING running state} for no more
 than the given time.
@param timeout the maximum time to wait
@param unit the time unit of the timeout argument
@throws TimeoutException if the service has not reached the given state within the deadline
@throws IllegalStateException if the service reaches a state from which it is not possible to
     enter the {@link State#RUNNING RUNNING} state. e.g. if the {@code state} is {@code
     State#TERMINATED} when this method is called then this will throw an IllegalStateException.
@since 15.0

### `awaitTerminated()`

**Returns:** `void`

Waits for the {@link Service} to reach the {@linkplain State#TERMINATED terminated state}.
@throws IllegalStateException if the service {@linkplain State#FAILED fails}.
@since 15.0

### `awaitTerminated([`java.time.Duration`](../../../../../java/time/Duration.md) timeout)`

**Returns:** `void`

Waits for the {@link Service} to reach a terminal state (either {@link Service.State#TERMINATED terminated} or {@link Service.State#FAILED failed}) for no more than the given time.
@param timeout the maximum time to wait
@throws TimeoutException if the service has not reached the given state within the deadline
@throws IllegalStateException if the service {@linkplain State#FAILED fails}.
@since 28.0

### `awaitTerminated(`long` timeout, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** `void`

Waits for the {@link Service} to reach a terminal state (either {@link Service.State#TERMINATED terminated} or {@link Service.State#FAILED failed}) for no more than the given time.
@param timeout the maximum time to wait
@param unit the time unit of the timeout argument
@throws TimeoutException if the service has not reached the given state within the deadline
@throws IllegalStateException if the service {@linkplain State#FAILED fails}.
@since 15.0

### `failureCause()`

**Returns:** `java.lang.Throwable`

Returns the {@link Throwable} that caused this service to fail.
@throws IllegalStateException if this service's state isn't {@linkplain State#FAILED FAILED}.
@since 14.0

### `addListener([`com.google.common.util.concurrent.Service.Listener`](Service/Listener.md) listener, [`java.util.concurrent.Executor`](../../../../../java/util/concurrent/Executor.md) executor)`

**Returns:** `void`

Registers a {@link Listener} to be {@linkplain Executor#execute executed} on the given
 executor. The listener will have the corresponding transition method called whenever the
 service changes state. The listener will not have previous state changes replayed, so it is
 suggested that listeners are added before the service starts.

 <p>{@code addListener} guarantees execution ordering across calls to a given listener but not
 across calls to multiple listeners. Specifically, a given listener will have its callbacks
 invoked in the same order as the underlying service enters those states. Additionally, at most
 one of the listener's callbacks will execute at once. However, multiple listeners' callbacks
 may execute concurrently, and listeners may execute in an order different from the one in which
 they were registered.

 <p>RuntimeExceptions thrown by a listener will be caught and logged. Any exception thrown
 during {@code Executor.execute} (e.g., a {@code RejectedExecutionException}) will be caught and
 logged.
@param listener the listener to run when the service changes state is complete
@param executor the executor in which the listeners callback methods will be run. For fast,
     lightweight listeners that would be safe to execute in any thread, consider {@link MoreExecutors#directExecutor}.
@since 13.0

