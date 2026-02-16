# Class: `AbstractIdleService`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.AbstractIdleService`

**Implements:** [`com.google.common.util.concurrent.Service`](./Service.md)

## Description

Base class for services that do not need a thread while "running" but may need one during startup
 and shutdown. Subclasses can implement `startUp` and `shutDown` methods, each which
 run in an executor which by default uses a separate thread for each method.
**Author:** Chris Nokleberg
**Since:** 1.0

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

**Returns:** `java.util.concurrent.Executor`

Returns the `Executor` that will be used to run this service. Subclasses may override
 this method to use a custom `Executor`, which may configure its worker thread with a
 specific name, thread group or priority. The returned executor's `Executor.execute(Runnable) execute()` method is called when this service is started and
 stopped, and should return promptly.

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

Returns the name of this service. `AbstractIdleService` may include the name in debugging
 output.
**Since:** 14.0

