# Class: `AbstractScheduledService`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.AbstractScheduledService`

**Implements:** [`com.google.common.util.concurrent.Service`](./Service.md)

## Description

Base class for services that can implement {@link #startUp} and {@link #shutDown} but while in
 the "running" state need to perform a periodic task. Subclasses can implement {@link #startUp},
 {@link #shutDown} and also a {@link #runOneIteration} method that will be executed periodically.

 <p>This class uses the {@link ScheduledExecutorService} returned from {@link #executor} to run
 the {@link #startUp} and {@link #shutDown} methods and also uses that service to schedule the
 {@link #runOneIteration} that will be executed periodically as specified by its {@link Scheduler}. When this service is asked to stop via {@link #stopAsync} it will cancel the periodic
 task (but not interrupt it) and wait for it to stop before running the {@link #shutDown} method.

 <p>Subclasses are guaranteed that the life cycle methods ({@link #runOneIteration}, {@link #startUp} and {@link #shutDown}) will never run concurrently. Notably, if any execution of {@link #runOneIteration} takes longer than its schedule defines, then subsequent executions may start
 late. Also, all life cycle methods are executed with a lock held, so subclasses can safely modify
 shared state without additional synchronization necessary for visibility to later executions of
 the life cycle methods.

 <h3>Usage Example</h3>

 <p>Here is a sketch of a service which crawls a website and uses the scheduling capabilities to
 rate limit itself.

 <pre>{@code
 class CrawlingService extends AbstractScheduledService {
   private Set<Uri> visited;
   private Queue<Uri> toCrawl;
   protected void startUp() throws Exception {
     toCrawl = readStartingUris();
   }

   protected void runOneIteration() throws Exception {
     Uri uri = toCrawl.remove();
     Collection<Uri> newUris = crawl(uri);
     visited.add(uri);
     for (Uri newUri : newUris) {
       if (!visited.contains(newUri)) { toCrawl.add(newUri); }
     }
   }

   protected void shutDown() throws Exception {
     saveUris(toCrawl);
   }

   protected Scheduler scheduler() {
     return Scheduler.newFixedRateSchedule(0, 1, TimeUnit.SECONDS);
   }
 }
 }</pre>

 <p>This class uses the life cycle methods to read in a list of starting URIs and save the set of
 outstanding URIs when shutting down. Also, it takes advantage of the scheduling functionality to
 rate limit the number of queries we perform.
@author Luke Sandberg
@since 11.0

## Fields

### `logger`

**Type:** [`com.google.common.util.concurrent.LazyLogger`](./LazyLogger.md)

### `delegate`

**Type:** [`com.google.common.util.concurrent.AbstractService`](./AbstractService.md)

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `runOneIteration()`

**Returns:** `void`

Run one iteration of the scheduled task. If any invocation of this method throws an exception,
 the service will transition to the {@link Service.State#FAILED} state and this method will no
 longer be called.

### `startUp()`

**Returns:** `void`

Start the service.

 <p>By default this method does nothing.

### `shutDown()`

**Returns:** `void`

Stop the service. This is guaranteed not to run concurrently with {@link #runOneIteration}.

 <p>By default this method does nothing.

### `scheduler()`

**Returns:** [`com.google.common.util.concurrent.AbstractScheduledService.Scheduler`](AbstractScheduledService/Scheduler.md)

Returns the {@link Scheduler} object used to configure this service. This method will only be
 called once.

### `executor()`

**Returns:** [`java.util.concurrent.ScheduledExecutorService`](../../../../../java/util/concurrent/ScheduledExecutorService.md)

Returns the {@link ScheduledExecutorService} that will be used to execute the {@link #startUp},
 {@link #runOneIteration} and {@link #shutDown} methods. If this method is overridden the
 executor will not be {@linkplain ScheduledExecutorService#shutdown shutdown} when this service
 {@linkplain Service.State#TERMINATED terminates} or {@linkplain Service.State#TERMINATED fails}. Subclasses may override this method to supply a custom {@link ScheduledExecutorService}
 instance. This method is guaranteed to only be called once.

 <p>By default this returns a new {@link ScheduledExecutorService} with a single thread pool
 that sets the name of the thread to the {@linkplain #serviceName() service name}. Also, the
 pool will be {@linkplain ScheduledExecutorService#shutdown() shut down} when the service
 {@linkplain Service.State#TERMINATED terminates} or {@linkplain Service.State#TERMINATED fails}.

### `serviceName()`

**Returns:** `java.lang.String`

Returns the name of this service. {@link AbstractScheduledService} may include the name in
 debugging output.
@since 14.0

### `toString()`

**Returns:** `java.lang.String`

### `isRunning()`

**Returns:** `boolean`

### `state()`

**Returns:** [`com.google.common.util.concurrent.Service.State`](Service/State.md)

### `addListener([`com.google.common.util.concurrent.Service.Listener`](Service/Listener.md) listener, [`java.util.concurrent.Executor`](../../../../../java/util/concurrent/Executor.md) executor)`

**Returns:** `void`

@since 13.0

### `failureCause()`

**Returns:** `java.lang.Throwable`

@since 14.0

### `startAsync()`

**Returns:** [`com.google.common.util.concurrent.Service`](./Service.md)

@since 15.0

### `stopAsync()`

**Returns:** [`com.google.common.util.concurrent.Service`](./Service.md)

@since 15.0

### `awaitRunning()`

**Returns:** `void`

@since 15.0

### `awaitRunning([`java.time.Duration`](../../../../../java/time/Duration.md) timeout)`

**Returns:** `void`

@since 28.0

### `awaitRunning(`long` timeout, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** `void`

@since 15.0

### `awaitTerminated()`

**Returns:** `void`

@since 15.0

### `awaitTerminated([`java.time.Duration`](../../../../../java/time/Duration.md) timeout)`

**Returns:** `void`

@since 28.0

### `awaitTerminated(`long` timeout, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** `void`

@since 15.0

