# Class: `AbstractIdleService`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.AbstractIdleService`

**Implements:** [`com.google.common.util.concurrent.Service`](./Service.md)

## Description

Subclasses can implement #startUp and #shutDown methods, each which
 run in an executor which by default uses a separate thread for each method.

## Fields

### `threadNameSupplier`

**Type:** [`com.google.common.base.Supplier<java.lang.String>`](../../base/Supplier.md)

### `delegate`

**Type:** [`com.google.common.util.concurrent.Service`](./Service.md)

## Constructors

### `<init>()`

## Methods

### `startUp()`

**Returns:** `void`

### `shutDown()`

**Returns:** `void`

### `executor()`

Subclasses may override
 this method to use a custom Executor, which may configure its worker thread with a
 specific name, thread group or priority. The returned executor's execute() method is called when this service is started and
 stopped, and should return promptly.

**Returns:** `java.util.concurrent.Executor`

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

### `serviceName()`

AbstractIdleService may include the name in debugging
 output.

**Returns:** `java.lang.String`

