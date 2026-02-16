# Class: `AbstractExecutionThreadService`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.AbstractExecutionThreadService`

**Implements:** [`com.google.common.util.concurrent.Service`](./Service.md)

## Description

Base class for services that can implement `startUp`, `run` and `shutDown`
 methods. This class uses a single thread to execute the service; consider `AbstractService`
 if you would like to manage any threading manually.
**Author:** Jesse Wilson
**Since:** 1.0

## Fields

### `logger`

**Type:** [`com.google.common.util.concurrent.LazyLogger`](./LazyLogger.md)

### `delegate`

**Type:** [`com.google.common.util.concurrent.Service`](./Service.md)

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `startUp()`

**Returns:** `void`

Start the service. This method is invoked on the execution thread.

 <p>By default this method does nothing.

### `run()`

**Returns:** `void`

Run the service. This method is invoked on the execution thread. Implementations must respond
 to stop requests. You could poll for lifecycle changes in a work loop:

 <pre>
   public void run() {
     while (`isRunning()`) {
       // perform a unit of work
     }
   }
 </pre>

 <p>...or you could respond to stop requests by implementing `triggerShutdown()`, which
 should cause `run()` to return.

### `shutDown()`

**Returns:** `void`

Stop the service. This method is invoked on the execution thread.

 <p>By default this method does nothing.

### `triggerShutdown()`

**Returns:** `void`

Invoked to request the service to stop.

 <p>By default this method does nothing.

 <p>Currently, this method is invoked while holding a lock. If an implementation of this method
 blocks, it can prevent this service from changing state. If you need to performing a blocking
 operation in order to trigger shutdown, consider instead registering a listener and
 implementing `stopping`. Note, however, that `stopping` does not run at exactly the
 same times as `triggerShutdown`.

### `executor()`

**Returns:** `java.util.concurrent.Executor`

Returns the `Executor` that will be used to run this service. Subclasses may override
 this method to use a custom `Executor`, which may configure its worker thread with a
 specific name, thread group or priority. The returned executor's `Executor.execute(Runnable) execute()` method is called when this service is started, and should
 return promptly.

 <p>The default implementation returns a new `Executor` that sets the name of its threads
 to the string returned by `serviceName`

### `toString()`

**Returns:** `java.lang.String`

### `isRunning()`

**Returns:** `boolean`

### `state()`

**Returns:** [`com.google.common.util.concurrent.Service.State`](Service/State.md)

### `addListener([`com.google.common.util.concurrent.Service.Listener`](Service/Listener.md) listener, `java.util.concurrent.Executor` executor)`

**Returns:** `void`

**Since:** 13.0

### `failureCause()`

**Returns:** `java.lang.Throwable`

**Since:** 14.0

### `startAsync()`

**Returns:** [`com.google.common.util.concurrent.Service`](./Service.md)

**Since:** 15.0

### `stopAsync()`

**Returns:** [`com.google.common.util.concurrent.Service`](./Service.md)

**Since:** 15.0

### `awaitRunning()`

**Returns:** `void`

**Since:** 15.0

### `awaitRunning(`java.time.Duration` timeout)`

**Returns:** `void`

**Since:** 28.0

### `awaitRunning(`long` timeout, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `void`

**Since:** 15.0

### `awaitTerminated()`

**Returns:** `void`

**Since:** 15.0

### `awaitTerminated(`java.time.Duration` timeout)`

**Returns:** `void`

**Since:** 28.0

### `awaitTerminated(`long` timeout, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `void`

**Since:** 15.0

### `serviceName()`

**Returns:** `java.lang.String`

Returns the name of this service. `AbstractExecutionThreadService` may include the name
 in debugging output.

 <p>Subclasses may override this method.
**Since:** 14.0 (present in 10.0 as getServiceName)

