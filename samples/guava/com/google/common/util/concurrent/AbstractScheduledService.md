# Class: `AbstractScheduledService`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.AbstractScheduledService`

**Implements:** [`com.google.common.util.concurrent.Service`](./Service.md)

## Description

Subclasses can implement #startUp,
 #shutDown and also a #runOneIteration method that will be executed periodically.

 
This class uses the ScheduledExecutorService returned from #executor to run
 the #startUp and #shutDown methods and also uses that service to schedule the
 #runOneIteration that will be executed periodically as specified by its Scheduler. When this service is asked to stop via #stopAsync it will cancel the periodic
 task (but not interrupt it) and wait for it to stop before running the #shutDown method.

 
Subclasses are guaranteed that the life cycle methods (#runOneIteration, #startUp and #shutDown) will never run concurrently. Notably, if any execution of #runOneIteration takes longer than its schedule defines, then subsequent executions may start
 late. Also, all life cycle methods are executed with a lock held, so subclasses can safely modify
 shared state without additional synchronization necessary for visibility to later executions of
 the life cycle methods.

 Usage Example

 
Here is a sketch of a service which crawls a website and uses the scheduling capabilities to
 rate limit itself.

 

```

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
 
```


 
This class uses the life cycle methods to read in a list of starting URIs and save the set of
 outstanding URIs when shutting down. Also, it takes advantage of the scheduling functionality to
 rate limit the number of queries we perform.

## Fields

### `logger`

**Type:** [`com.google.common.util.concurrent.LazyLogger`](./LazyLogger.md)

### `delegate`

**Type:** [`com.google.common.util.concurrent.AbstractService`](./AbstractService.md)

## Constructors

### `<init>()`

## Methods

### `runOneIteration()`

If any invocation of this method throws an exception,
 the service will transition to the Service.State#FAILED state and this method will no
 longer be called.

**Returns:** `void`

### `startUp()`

By default this method does nothing.

**Returns:** `void`

### `shutDown()`

This is guaranteed not to run concurrently with #runOneIteration.

 
By default this method does nothing.

**Returns:** `void`

### `scheduler()`

This method will only be
 called once.

**Returns:** `com.google.common.util.concurrent.AbstractScheduledService.Scheduler`

### `executor()`

If this method is overridden the
 executor will not be shutdown when this service
 terminates or fails. Subclasses may override this method to supply a custom ScheduledExecutorService
 instance. This method is guaranteed to only be called once.

 
By default this returns a new ScheduledExecutorService with a single thread pool
 that sets the name of the thread to the service name. Also, the
 pool will be shut down when the service
 terminates or fails.

**Returns:** `java.util.concurrent.ScheduledExecutorService`

### `serviceName()`

AbstractScheduledService may include the name in
 debugging output.

**Returns:** `java.lang.String`

### `toString()`

**Returns:** `java.lang.String`

### `isRunning()`

**Returns:** `boolean`

### `state()`

**Returns:** `com.google.common.util.concurrent.Service.State`

### `addListener(Service.Listener listener, Executor executor)`

**Parameters:**
- `listener` (`com.google.common.util.concurrent.Service.Listener`)
- `executor` (`java.util.concurrent.Executor`)

**Returns:** `void`

### `failureCause()`

**Returns:** `java.lang.Throwable`

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

