# Class: `ThreadFactoryBuilder`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ThreadFactoryBuilder`

## Description

If no backing thread factory is provided, a default backing thread factory is used as if by
 calling setThreadFactory(Executors#defaultThreadFactory()).

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

## Methods

### `setNameFormat(String nameFormat)`

**Parameters:**
- `nameFormat` (`java.lang.String`): a String#format(String, Object...)-compatible format String, to which
       a unique integer (0, 1, etc.) will be supplied as the single parameter. This integer will
       be unique to the built instance of the ThreadFactory and will be assigned sequentially. For
       example, "rpc-pool-%d" will generate thread names like "rpc-pool-0", 
       "rpc-pool-1", "rpc-pool-2", etc.

**Returns:** [`com.google.common.util.concurrent.ThreadFactoryBuilder`](./ThreadFactoryBuilder.md)

### `setDaemon(boolean daemon)`

**Parameters:**
- `daemon` (`boolean`): whether or not new Threads created with this ThreadFactory will be daemon threads

**Returns:** [`com.google.common.util.concurrent.ThreadFactoryBuilder`](./ThreadFactoryBuilder.md)

### `setPriority(int priority)`

**Warning:** relying on the thread scheduler is [discouraged](http://errorprone.info/bugpattern/ThreadPriorityCheck).

**Parameters:**
- `priority` (`int`): the priority for new Threads created with this ThreadFactory

**Returns:** [`com.google.common.util.concurrent.ThreadFactoryBuilder`](./ThreadFactoryBuilder.md)

### `setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler)`

**Parameters:**
- `uncaughtExceptionHandler` (`java.lang.Thread.UncaughtExceptionHandler`): the uncaught exception handler for new Threads created with
       this ThreadFactory

**Returns:** [`com.google.common.util.concurrent.ThreadFactoryBuilder`](./ThreadFactoryBuilder.md)

### `setThreadFactory(ThreadFactory backingThreadFactory)`

Threads
 will be created by invoking #newThread(Runnable) on this backing ThreadFactory.

**Parameters:**
- `backingThreadFactory` (`java.util.concurrent.ThreadFactory`): the backing ThreadFactory which will be delegated to during
       thread creation.

**Returns:** [`com.google.common.util.concurrent.ThreadFactoryBuilder`](./ThreadFactoryBuilder.md)

### `build()`

After
 building, it is still possible to change the options used to build the ThreadFactory and/or
 build again. State is not shared amongst built instances.

**Returns:** `java.util.concurrent.ThreadFactory`

### `doBuild(ThreadFactoryBuilder builder)`

**Parameters:**
- `builder` ([`com.google.common.util.concurrent.ThreadFactoryBuilder`](./ThreadFactoryBuilder.md))

**Returns:** `java.util.concurrent.ThreadFactory`

### `format(String format, Object[] args)`

**Parameters:**
- `format` (`java.lang.String`)
- `args` (`java.lang.Object[]`)

**Returns:** `java.lang.String`

