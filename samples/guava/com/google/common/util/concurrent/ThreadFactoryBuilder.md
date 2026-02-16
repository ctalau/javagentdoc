# Class: `ThreadFactoryBuilder`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ThreadFactoryBuilder`

## Description

A ThreadFactory builder, providing any combination of these features:

 <ul>
   <li>whether threads should be marked as daemon threads
   <li>a naming format
   <li>a thread priority
   <li>an uncaught exception handler
   <li>a backing thread factory
 </ul>

 <p>If no backing thread factory is provided, a default backing thread factory is used as if by
 calling `setThreadFactory(``Executors.defaultThreadFactory()``)`.
**Author:** Kurt Alfred Kluever
**Since:** 4.0

## Fields

### `nameFormat`

**Type:** `java.lang.String`

### `daemon`

**Type:** `java.lang.Boolean`

### `priority`

**Type:** `java.lang.Integer`

### `uncaughtExceptionHandler`

**Type:** `java.lang.Thread.UncaughtExceptionHandler`

### `backingThreadFactory`

**Type:** `java.util.concurrent.ThreadFactory`

## Constructors

### `<init>()`

Creates a new `ThreadFactory` builder.

## Methods

### `setNameFormat(`java.lang.String` nameFormat)`

**Returns:** [`com.google.common.util.concurrent.ThreadFactoryBuilder`](./ThreadFactoryBuilder.md)

Sets the naming format to use when naming threads (`Thread.setName`) which are created
 with this ThreadFactory.
@param nameFormat a `String.format(String, Object...)`-compatible format String, to which
     a unique integer (0, 1, etc.) will be supplied as the single parameter. This integer will
     be unique to the built instance of the ThreadFactory and will be assigned sequentially. For
     example, `"rpc-pool-%d"` will generate thread names like `"rpc-pool-0"`, `"rpc-pool-1"`, `"rpc-pool-2"`, etc.
@return this for the builder pattern

### `setDaemon(`boolean` daemon)`

**Returns:** [`com.google.common.util.concurrent.ThreadFactoryBuilder`](./ThreadFactoryBuilder.md)

Sets daemon or not for new threads created with this ThreadFactory.
@param daemon whether or not new Threads created with this ThreadFactory will be daemon threads
@return this for the builder pattern

### `setPriority(`int` priority)`

**Returns:** [`com.google.common.util.concurrent.ThreadFactoryBuilder`](./ThreadFactoryBuilder.md)

Sets the priority for new threads created with this ThreadFactory.

 <p><b>Warning:</b> relying on the thread scheduler is <a href="http://errorprone.info/bugpattern/ThreadPriorityCheck">discouraged</a>.
@param priority the priority for new Threads created with this ThreadFactory
@return this for the builder pattern

### `setUncaughtExceptionHandler(`java.lang.Thread.UncaughtExceptionHandler` uncaughtExceptionHandler)`

**Returns:** [`com.google.common.util.concurrent.ThreadFactoryBuilder`](./ThreadFactoryBuilder.md)

Sets the `UncaughtExceptionHandler` for new threads created with this ThreadFactory.
@param uncaughtExceptionHandler the uncaught exception handler for new Threads created with
     this ThreadFactory
@return this for the builder pattern

### `setThreadFactory(`java.util.concurrent.ThreadFactory` backingThreadFactory)`

**Returns:** [`com.google.common.util.concurrent.ThreadFactoryBuilder`](./ThreadFactoryBuilder.md)

Sets the backing `ThreadFactory` for new threads created with this ThreadFactory. Threads
 will be created by invoking #newThread(Runnable) on this backing `ThreadFactory`.
@param backingThreadFactory the backing `ThreadFactory` which will be delegated to during
     thread creation.
@return this for the builder pattern
**See:** MoreExecutors

### `build()`

**Returns:** `java.util.concurrent.ThreadFactory`

Returns a new thread factory using the options supplied during the building process. After
 building, it is still possible to change the options used to build the ThreadFactory and/or
 build again. State is not shared amongst built instances.
@return the fully constructed `ThreadFactory`

### `doBuild([`com.google.common.util.concurrent.ThreadFactoryBuilder`](./ThreadFactoryBuilder.md) builder)`

**Returns:** `java.util.concurrent.ThreadFactory`

### `format(`java.lang.String` format, `java.lang.Object[]` args)`

**Returns:** `java.lang.String`

