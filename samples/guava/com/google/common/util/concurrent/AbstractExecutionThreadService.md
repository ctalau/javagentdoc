# Class: `AbstractExecutionThreadService`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.AbstractExecutionThreadService`

**Implements:** [`com.google.common.util.concurrent.Service`](./Service.md)

## Description

Base class for services that can implement {@link #startUp}, {@link #run} and {@link #shutDown}
 methods. This class uses a single thread to execute the service; consider {@link AbstractService}
 if you would like to manage any threading manually.
@author Jesse Wilson
@since 1.0

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
     while ({@link #isRunning()}) {
       // perform a unit of work
     }
   }
 </pre>

 <p>...or you could respond to stop requests by implementing {@link #triggerShutdown()}, which
 should cause {@link #run()} to return.

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
 implementing {@code stopping}. Note, however, that {@code stopping} does not run at exactly the
 same times as {@code triggerShutdown}.

### `executor()`

**Returns:** [`java.util.concurrent.Executor`](../../../../../java/util/concurrent/Executor.md)

Returns the {@link Executor} that will be used to run this service. Subclasses may override
 this method to use a custom {@link Executor}, which may configure its worker thread with a
 specific name, thread group or priority. The returned executor's {@link Executor#execute(Runnable) execute()} method is called when this service is started, and should
 return promptly.

 <p>The default implementation returns a new {@link Executor} that sets the name of its threads
 to the string returned by {@link #serviceName}

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

### `serviceName()`

**Returns:** `java.lang.String`

Returns the name of this service. {@link AbstractExecutionThreadService} may include the name
 in debugging output.

 <p>Subclasses may override this method.
@since 14.0 (present in 10.0 as getServiceName)

