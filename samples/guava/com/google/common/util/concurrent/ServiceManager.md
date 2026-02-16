# Class: `ServiceManager`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ServiceManager`

**Implements:** [`com.google.common.util.concurrent.ServiceManagerBridge`](./ServiceManagerBridge.md)

## Description

A manager for monitoring and controlling a set of {@linkplain Service services}. This class
 provides methods for {@linkplain #startAsync() starting}, {@linkplain #stopAsync() stopping} and
 {@linkplain #servicesByState inspecting} a collection of {@linkplain Service services}.
 Additionally, users can monitor state transitions with the {@linkplain Listener listener}
 mechanism.

 <p>While it is recommended that service lifecycles be managed via this class, state transitions
 initiated via other mechanisms do not impact the correctness of its methods. For example, if the
 services are started by some mechanism besides {@link #startAsync}, the listeners will be invoked
 when appropriate and {@link #awaitHealthy} will still work as expected.

 <p>Here is a simple example of how to use a {@code ServiceManager} to start a server.

 <pre>{@code
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
 }</pre>

 <p>This class uses the ServiceManager's methods to start all of its services, to respond to
 service failure and to ensure that when the JVM is shutting down all the services are stopped.
@author Luke Sandberg
@since 14.0

## Fields

### `logger`

**Type:** [`com.google.common.util.concurrent.LazyLogger`](./LazyLogger.md)

### `HEALTHY_EVENT`

**Type:** [`com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.ServiceManager.Listener>`](ListenerCallQueue/Event.md)

### `STOPPED_EVENT`

**Type:** [`com.google.common.util.concurrent.ListenerCallQueue.Event<com.google.common.util.concurrent.ServiceManager.Listener>`](ListenerCallQueue/Event.md)

### `state`

**Type:** [`com.google.common.util.concurrent.ServiceManager.ServiceManagerState`](ServiceManager/ServiceManagerState.md)

An encapsulation of all of the state that is accessed by the {@linkplain ServiceListener service listeners}. This is extracted into its own object so that {@link ServiceListener} could
 be made {@code static} and its instances can be safely constructed and added in the {@link ServiceManager} constructor without having to close over the partially constructed {@link ServiceManager} instance (i.e. avoid leaking a pointer to {@code this}).

### `services`

**Type:** [`com.google.common.collect.ImmutableList<com.google.common.util.concurrent.Service>`](../../collect/ImmutableList.md)

## Constructors

### `<init>(`java.lang.Iterable<? extends com.google.common.util.concurrent.Service>` services)`

Constructs a new instance for managing the given services.
@param services The services to manage
@throws IllegalArgumentException if not all services are {@linkplain State#NEW new} or if there
     are any duplicate services.

## Methods

### `addListener([`com.google.common.util.concurrent.ServiceManager.Listener`](ServiceManager/Listener.md) listener, [`java.util.concurrent.Executor`](../../../../../java/util/concurrent/Executor.md) executor)`

**Returns:** `void`

Registers a {@link Listener} to be {@linkplain Executor#execute executed} on the given
 executor. The listener will not have previous state changes replayed, so it is suggested that
 listeners are added before any of the managed services are {@linkplain Service#startAsync started}.

 <p>{@code addListener} guarantees execution ordering across calls to a given listener but not
 across calls to multiple listeners. Specifically, a given listener will have its callbacks
 invoked in the same order as the underlying service enters those states. Additionally, at most
 one of the listener's callbacks will execute at once. However, multiple listeners' callbacks
 may execute concurrently, and listeners may execute in an order different from the one in which
 they were registered.

 <p>RuntimeExceptions thrown by a listener will be caught and logged. Any exception thrown
 during {@code Executor.execute} (e.g., a {@code RejectedExecutionException}) will be caught and
 logged.

 <p>When selecting an executor, note that {@code directExecutor} is dangerous in some cases. See
 the discussion in the {@link ListenableFuture#addListener ListenableFuture.addListener}
 documentation.
@param listener the listener to run when the manager changes state
@param executor the executor in which the listeners callback methods will be run.

### `startAsync()`

**Returns:** [`com.google.common.util.concurrent.ServiceManager`](./ServiceManager.md)

Initiates service {@linkplain Service#startAsync startup} on all the services being managed. It
 is only valid to call this method if all of the services are {@linkplain State#NEW new}.
@return this
@throws IllegalStateException if any of the Services are not {@link State#NEW new} when the
     method is called.

### `awaitHealthy()`

**Returns:** `void`

Waits for the {@link ServiceManager} to become {@linkplain #isHealthy() healthy}. The manager
 will become healthy after all the component services have reached the {@linkplain State#RUNNING running} state.
@throws IllegalStateException if the service manager reaches a state from which it cannot
     become {@linkplain #isHealthy() healthy}.

### `awaitHealthy([`java.time.Duration`](../../../../../java/time/Duration.md) timeout)`

**Returns:** `void`

Waits for the {@link ServiceManager} to become {@linkplain #isHealthy() healthy} for no more
 than the given time. The manager will become healthy after all the component services have
 reached the {@linkplain State#RUNNING running} state.
@param timeout the maximum time to wait
@throws TimeoutException if not all of the services have finished starting within the deadline
@throws IllegalStateException if the service manager reaches a state from which it cannot
     become {@linkplain #isHealthy() healthy}.
@since 28.0

### `awaitHealthy(`long` timeout, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** `void`

Waits for the {@link ServiceManager} to become {@linkplain #isHealthy() healthy} for no more
 than the given time. The manager will become healthy after all the component services have
 reached the {@linkplain State#RUNNING running} state.
@param timeout the maximum time to wait
@param unit the time unit of the timeout argument
@throws TimeoutException if not all of the services have finished starting within the deadline
@throws IllegalStateException if the service manager reaches a state from which it cannot
     become {@linkplain #isHealthy() healthy}.

### `stopAsync()`

**Returns:** [`com.google.common.util.concurrent.ServiceManager`](./ServiceManager.md)

Initiates service {@linkplain Service#stopAsync shutdown} if necessary on all the services
 being managed.
@return this

### `awaitStopped()`

**Returns:** `void`

Waits for the all the services to reach a terminal state. After this method returns all
 services will either be {@linkplain Service.State#TERMINATED terminated} or {@linkplain Service.State#FAILED failed}.

### `awaitStopped([`java.time.Duration`](../../../../../java/time/Duration.md) timeout)`

**Returns:** `void`

Waits for the all the services to reach a terminal state for no more than the given time. After
 this method returns all services will either be {@linkplain Service.State#TERMINATED terminated} or {@linkplain Service.State#FAILED failed}.
@param timeout the maximum time to wait
@throws TimeoutException if not all of the services have stopped within the deadline
@since 28.0

### `awaitStopped(`long` timeout, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** `void`

Waits for the all the services to reach a terminal state for no more than the given time. After
 this method returns all services will either be {@linkplain Service.State#TERMINATED terminated} or {@linkplain Service.State#FAILED failed}.
@param timeout the maximum time to wait
@param unit the time unit of the timeout argument
@throws TimeoutException if not all of the services have stopped within the deadline

### `isHealthy()`

**Returns:** `boolean`

Returns true if all services are currently in the {@linkplain State#RUNNING running} state.

 <p>Users who want more detailed information should use the {@link #servicesByState} method to
 get detailed information about which services are not running.

### `servicesByState()`

**Returns:** [`com.google.common.collect.ImmutableSetMultimap<com.google.common.util.concurrent.Service.State,com.google.common.util.concurrent.Service>`](../../collect/ImmutableSetMultimap.md)

Provides a snapshot of the current state of all the services under management.

 <p>N.B. This snapshot is guaranteed to be consistent, i.e. the set of states returned will
 correspond to a point in time view of the services.
@since 29.0 (present with return type {@code ImmutableMultimap} since 14.0)

### `startupTimes()`

**Returns:** [`com.google.common.collect.ImmutableMap<com.google.common.util.concurrent.Service,java.lang.Long>`](../../collect/ImmutableMap.md)

Returns the service load times. This value will only return startup times for services that
 have finished starting.
@return Map of services and their corresponding startup time in millis, the map entries will be
     ordered by startup time.

### `startupDurations()`

**Returns:** [`com.google.common.collect.ImmutableMap<com.google.common.util.concurrent.Service,java.time.Duration>`](../../collect/ImmutableMap.md)

Returns the service load times. This value will only return startup times for services that
 have finished starting.
@return Map of services and their corresponding startup time, the map entries will be ordered
     by startup time.
@since 31.0

### `toString()`

**Returns:** `java.lang.String`

