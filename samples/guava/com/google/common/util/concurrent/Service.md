# Interface: `Service`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.Service`

## Description

Example services include
 webservers, RPC servers and timers.

 
The normal lifecycle of a service is:

 

   - NEW ->
   - STARTING ->
   - RUNNING ->
   - STOPPING ->
   - TERMINATED
 


 
There are deviations from this if there are failures or if Service#stopAsync is called
 before the Service reaches the RUNNING state. The set of legal
 transitions form a [DAG](http://en.wikipedia.org/wiki/Directed_acyclic_graph),
 therefore every method of the listener will be called at most once. N.B. The State#FAILED
 and State#TERMINATED states are terminal states, once a service enters either of these
 states it cannot ever leave them.

 
Implementors of this interface are strongly encouraged to extend one of the abstract classes
 in this package which implement this interface and make the threading and state management
 easier.

## Methods

### `startAsync()`

A stopped service may not be restarted.

**Returns:** [`com.google.common.util.concurrent.Service`](./Service.md)

### `isRunning()`

**Returns:** `boolean`

### `state()`

**Returns:** `com.google.common.util.concurrent.Service.State`

### `stopAsync()`

If the service is new, it is terminated without having been started nor
 stopped. If the service has already been stopped, this method returns immediately without
 taking action.

**Returns:** [`com.google.common.util.concurrent.Service`](./Service.md)

### `awaitRunning()`

**Returns:** `void`

### `awaitRunning(Duration timeout)`

**Parameters:**
- `timeout` (`java.time.Duration`): the maximum time to wait

**Returns:** `void`

### `awaitRunning(long timeout, TimeUnit unit)`

**Parameters:**
- `timeout` (`long`): the maximum time to wait
- `unit` (`java.util.concurrent.TimeUnit`): the time unit of the timeout argument

**Returns:** `void`

### `awaitTerminated()`

**Returns:** `void`

### `awaitTerminated(Duration timeout)`

**Parameters:**
- `timeout` (`java.time.Duration`): the maximum time to wait

**Returns:** `void`

### `awaitTerminated(long timeout, TimeUnit unit)`

**Parameters:**
- `timeout` (`long`): the maximum time to wait
- `unit` (`java.util.concurrent.TimeUnit`): the time unit of the timeout argument

**Returns:** `void`

### `failureCause()`

**Returns:** `java.lang.Throwable`

### `addListener(Service.Listener listener, Executor executor)`

The listener will have the corresponding transition method called whenever the
 service changes state. The listener will not have previous state changes replayed, so it is
 suggested that listeners are added before the service starts.

 
addListener guarantees execution ordering across calls to a given listener but not
 across calls to multiple listeners. Specifically, a given listener will have its callbacks
 invoked in the same order as the underlying service enters those states. Additionally, at most
 one of the listener's callbacks will execute at once. However, multiple listeners' callbacks
 may execute concurrently, and listeners may execute in an order different from the one in which
 they were registered.

 
RuntimeExceptions thrown by a listener will be caught and logged. Any exception thrown
 during Executor.execute (e.g., a RejectedExecutionException) will be caught and
 logged.

**Parameters:**
- `listener` (`com.google.common.util.concurrent.Service.Listener`): the listener to run when the service changes state is complete
- `executor` (`java.util.concurrent.Executor`): the executor in which the listeners callback methods will be run. For fast,
       lightweight listeners that would be safe to execute in any thread, consider MoreExecutors#directExecutor.

**Returns:** `void`

