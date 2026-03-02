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

This method is invoked on the execution thread.

 
By default this method does nothing.

**Returns:** `void`

### `run()`

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

**Returns:** `void`

### `shutDown()`

This method is invoked on the execution thread.

 
By default this method does nothing.

**Returns:** `void`

### `triggerShutdown()`

By default this method does nothing.

 
Currently, this method is invoked while holding a lock. If an implementation of this method
 blocks, it can prevent this service from changing state. If you need to performing a blocking
 operation in order to trigger shutdown, consider instead registering a listener and
 implementing stopping. Note, however, that stopping does not run at exactly the
 same times as triggerShutdown.

**Returns:** `void`

### `executor()`

Subclasses may override
 this method to use a custom Executor, which may configure its worker thread with a
 specific name, thread group or priority. The returned executor's execute() method is called when this service is started, and should
 return promptly.

 
The default implementation returns a new Executor that sets the name of its threads
 to the string returned by #serviceName

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

AbstractExecutionThreadService may include the name
 in debugging output.

 
Subclasses may override this method.

**Returns:** `java.lang.String`

