# Class: `ServiceManager`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ServiceManager`

**Implements:** [`com.google.common.util.concurrent.ServiceManagerBridge`](./ServiceManagerBridge.md)

## Description

This class
 provides methods for starting, stopping and
 inspecting a collection of services.
 Additionally, users can monitor state transitions with the listener
 mechanism.

 
While it is recommended that service lifecycles be managed via this class, state transitions
 initiated via other mechanisms do not impact the correctness of its methods. For example, if the
 services are started by some mechanism besides #startAsync, the listeners will be invoked
 when appropriate and #awaitHealthy will still work as expected.

 
Here is a simple example of how to use a ServiceManager to start a server.

 

```

 class Server {
   public static void main(String[] args) {
     Set<Service> services = ...;
     ServiceManager manager = new ServiceManager(services);
     manager.addListener(new Listener() {
         public void stopped() {}
         public void healthy() {
           // Services have been initialized and are healthy, start accepting requests...
         }
         public void failure(Service service) {
           // Something failed, at this point we could log it, notify a load balancer, or take
           // some other action.  For now we will just exit.
           System.exit(1);
         }
       },
       MoreExecutors.directExecutor());

     Runtime.getRuntime().addShutdownHook(new Thread() {
       public void run() {
         // Give the services 5 seconds to stop to ensure that we are responsive to shutdown
         // requests.
         try {
           manager.stopAsync().awaitStopped(5, TimeUnit.SECONDS);
         } catch (TimeoutException timeout) {
           // stopping timed out
         }
       }
     });
     manager.startAsync();  // start all the services asynchronously
   }
 }
 
```


 
This class uses the ServiceManager's methods to start all of its services, to respond to
 service failure and to ensure that when the JVM is shutting down all the services are stopped.

## Fields

### `logger`

**Type:** [`com.google.common.util.concurrent.LazyLogger`](./LazyLogger.md)

### `HEALTHY_EVENT`

**Type:** `com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.ServiceManager.Listener>`

### `STOPPED_EVENT`

**Type:** `com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.ServiceManager.Listener>`

### `state`

**Type:** `com.google.common.util.concurrent.ServiceManager.ServiceManagerState`

This is extracted into its own object so that ServiceListener could
 be made static and its instances can be safely constructed and added in the ServiceManager constructor without having to close over the partially constructed ServiceManager instance (i.e. avoid leaking a pointer to this).

### `services`

**Type:** [`com.google.common.collect.ImmutableList<com.google.common.util.concurrent.Service>`](../../collect/ImmutableList.md)

## Constructors

### `<init>(Iterable<? extends Service> services)`

**Parameters:**
- `services` (`java.lang.Iterable<? extends com.google.common.util.concurrent.Service>`): The services to manage

## Methods

### `addListener(ServiceManager.Listener listener, Executor executor)`

The listener will not have previous state changes replayed, so it is suggested that
 listeners are added before any of the managed services are started.

 
addListener guarantees execution ordering across calls to a given listener but not
 across calls to multiple listeners. Specifically, a given listener will have its callbacks
 invoked in the same order as the underlying service enters those states. Additionally, at most
 one of the listener's callbacks will execute at once. However, multiple listeners' callbacks
 may execute concurrently, and listeners may execute in an order different from the one in which
 they were registered.

 
RuntimeExceptions thrown by a listener will be caught and logged. Any exception thrown
 during Executor.execute (e.g., a RejectedExecutionException) will be caught and
 logged.

 
When selecting an executor, note that directExecutor is dangerous in some cases. See
 the discussion in the ListenableFuture.addListener
 documentation.

**Parameters:**
- `listener` (`com.google.common.util.concurrent.ServiceManager.Listener`): the listener to run when the manager changes state
- `executor` (`java.util.concurrent.Executor`): the executor in which the listeners callback methods will be run.

**Returns:** `void`

### `startAsync()`

It
 is only valid to call this method if all of the services are new.

**Returns:** [`com.google.common.util.concurrent.ServiceManager`](./ServiceManager.md)

### `awaitHealthy()`

The manager
 will become healthy after all the component services have reached the running state.

**Returns:** `void`

### `awaitHealthy(Duration timeout)`

The manager will become healthy after all the component services have
 reached the running state.

**Parameters:**
- `timeout` (`java.time.Duration`): the maximum time to wait

**Returns:** `void`

### `awaitHealthy(long timeout, TimeUnit unit)`

The manager will become healthy after all the component services have
 reached the running state.

**Parameters:**
- `timeout` (`long`): the maximum time to wait
- `unit` (`java.util.concurrent.TimeUnit`): the time unit of the timeout argument

**Returns:** `void`

### `stopAsync()`

**Returns:** [`com.google.common.util.concurrent.ServiceManager`](./ServiceManager.md)

### `awaitStopped()`

After this method returns all
 services will either be terminated or failed.

**Returns:** `void`

### `awaitStopped(Duration timeout)`

After
 this method returns all services will either be terminated or failed.

**Parameters:**
- `timeout` (`java.time.Duration`): the maximum time to wait

**Returns:** `void`

### `awaitStopped(long timeout, TimeUnit unit)`

After
 this method returns all services will either be terminated or failed.

**Parameters:**
- `timeout` (`long`): the maximum time to wait
- `unit` (`java.util.concurrent.TimeUnit`): the time unit of the timeout argument

**Returns:** `void`

### `isHealthy()`

Users who want more detailed information should use the #servicesByState method to
 get detailed information about which services are not running.

**Returns:** `boolean`

### `servicesByState()`

N.B. This snapshot is guaranteed to be consistent, i.e. the set of states returned will
 correspond to a point in time view of the services.

**Returns:** [`com.google.common.collect.ImmutableSetMultimap<com.google.common.util.concurrent.Service.State,com.google.common.util.concurrent.Service>`](../../collect/ImmutableSetMultimap.md)

### `startupTimes()`

This value will only return startup times for services that
 have finished starting.

**Returns:** [`com.google.common.collect.ImmutableMap<com.google.common.util.concurrent.Service,java.lang.Long>`](../../collect/ImmutableMap.md)

### `startupDurations()`

This value will only return startup times for services that
 have finished starting.

**Returns:** [`com.google.common.collect.ImmutableMap<com.google.common.util.concurrent.Service,java.time.Duration>`](../../collect/ImmutableMap.md)

### `toString()`

**Returns:** `java.lang.String`

