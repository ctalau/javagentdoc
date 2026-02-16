# Class: `AbstractIdleService`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.AbstractIdleService`

**Implements:** [`com.google.common.util.concurrent.Service`](./Service.md)

## Description

Base class for services that do not need a thread while "running" but may need one during startup
 and shutdown. Subclasses can implement {@link #startUp} and {@link #shutDown} methods, each which
 run in an executor which by default uses a separate thread for each method.
@author Chris Nokleberg
@since 1.0

## Fields

### `threadNameSupplier`

**Type:** [`com.google.common.base.Supplier<java.lang.String>`](../../base/Supplier.md)

### `delegate`

**Type:** [`com.google.common.util.concurrent.Service`](./Service.md)

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `startUp()`

**Returns:** `void`

Start the service.

### `shutDown()`

**Returns:** `void`

Stop the service.

### `executor()`

**Returns:** [`java.util.concurrent.Executor`](../../../../../java/util/concurrent/Executor.md)

Returns the {@link Executor} that will be used to run this service. Subclasses may override
 this method to use a custom {@link Executor}, which may configure its worker thread with a
 specific name, thread group or priority. The returned executor's {@link Executor#execute(Runnable) execute()} method is called when this service is started and
 stopped, and should return promptly.

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

Returns the name of this service. {@link AbstractIdleService} may include the name in debugging
 output.
@since 14.0

