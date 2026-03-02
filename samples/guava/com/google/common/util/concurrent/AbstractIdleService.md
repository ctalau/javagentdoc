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

**Returns:** `java.util.concurrent.Executor`

Subclasses may override
 this method to use a custom Executor, which may configure its worker thread with a
 specific name, thread group or priority. The returned executor's execute() method is called when this service is started and
 stopped, and should return promptly.

### `toString()`

**Returns:** `java.lang.String`

### `isRunning()`

**Returns:** `boolean`

### `state()`

**Returns:** `com.google.common.util.concurrent.Service.State`

### `addListener(com.google.common.util.concurrent.Service.Listener listener, java.util.concurrent.Executor executor)`

**Returns:** `void`

**Parameters:**
- `listener` (`com.google.common.util.concurrent.Service.Listener`)
- `executor` (`java.util.concurrent.Executor`)

### `failureCause()`

**Returns:** `java.lang.Throwable`

### `startAsync()`

**Returns:** [`com.google.common.util.concurrent.Service`](./Service.md)

### `stopAsync()`

**Returns:** [`com.google.common.util.concurrent.Service`](./Service.md)

### `awaitRunning()`

**Returns:** `void`

### `awaitRunning(java.time.Duration timeout)`

**Returns:** `void`

**Parameters:**
- `timeout` (`java.time.Duration`)

### `awaitRunning(long timeout, java.util.concurrent.TimeUnit unit)`

**Returns:** `void`

**Parameters:**
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `awaitTerminated()`

**Returns:** `void`

### `awaitTerminated(java.time.Duration timeout)`

**Returns:** `void`

**Parameters:**
- `timeout` (`java.time.Duration`)

### `awaitTerminated(long timeout, java.util.concurrent.TimeUnit unit)`

**Returns:** `void`

**Parameters:**
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `serviceName()`

**Returns:** `java.lang.String`

AbstractIdleService may include the name in debugging
 output.

