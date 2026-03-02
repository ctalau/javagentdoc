# Class: `AbstractExecutionThreadService`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.AbstractExecutionThreadService`

**Implements:** [`com.google.common.util.concurrent.Service`](./Service.md)

## Description

This class uses a single thread to execute the service; consider AbstractService
 if you would like to manage any threading manually.

## Fields

### `logger`

**Type:** [`com.google.common.util.concurrent.LazyLogger`](./LazyLogger.md)

### `delegate`

**Type:** [`com.google.common.util.concurrent.Service`](./Service.md)

## Constructors

### `<init>()`

## Methods

### `startUp()`

**Returns:** `void`

This method is invoked on the execution thread.

 
By default this method does nothing.

### `run()`

**Returns:** `void`

This method is invoked on the execution thread. Implementations must respond
 to stop requests. You could poll for lifecycle changes in a work loop:

 

```

   public void run() {
     while (#isRunning()) {
       // perform a unit of work
     }
   }
 
```


 
...or you could respond to stop requests by implementing #triggerShutdown(), which
 should cause #run() to return.

### `shutDown()`

**Returns:** `void`

This method is invoked on the execution thread.

 
By default this method does nothing.

### `triggerShutdown()`

**Returns:** `void`

By default this method does nothing.

 
Currently, this method is invoked while holding a lock. If an implementation of this method
 blocks, it can prevent this service from changing state. If you need to performing a blocking
 operation in order to trigger shutdown, consider instead registering a listener and
 implementing stopping. Note, however, that stopping does not run at exactly the
 same times as triggerShutdown.

### `executor()`

**Returns:** `java.util.concurrent.Executor`

Subclasses may override
 this method to use a custom Executor, which may configure its worker thread with a
 specific name, thread group or priority. The returned executor's execute() method is called when this service is started, and should
 return promptly.

 
The default implementation returns a new Executor that sets the name of its threads
 to the string returned by #serviceName

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

AbstractExecutionThreadService may include the name
 in debugging output.

 
Subclasses may override this method.

