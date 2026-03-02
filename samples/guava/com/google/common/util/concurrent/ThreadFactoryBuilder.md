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

### `setNameFormat(java.lang.String nameFormat)`

**Returns:** [`com.google.common.util.concurrent.ThreadFactoryBuilder`](./ThreadFactoryBuilder.md)

**Parameters:**
- `nameFormat` (`java.lang.String`): a String#format(String, Object...)-compatible format String, to which
     a unique integer (0, 1, etc.) will be supplied as the single parameter. This integer will
     be unique to the built instance of the ThreadFactory and will be assigned sequentially. For
     example, "rpc-pool-%d" will generate thread names like "rpc-pool-0", 
     "rpc-pool-1", "rpc-pool-2", etc.

### `setDaemon(boolean daemon)`

**Returns:** [`com.google.common.util.concurrent.ThreadFactoryBuilder`](./ThreadFactoryBuilder.md)

**Parameters:**
- `daemon` (`boolean`): whether or not new Threads created with this ThreadFactory will be daemon threads

### `setPriority(int priority)`

**Returns:** [`com.google.common.util.concurrent.ThreadFactoryBuilder`](./ThreadFactoryBuilder.md)

**Warning:** relying on the thread scheduler is [discouraged](http://errorprone.info/bugpattern/ThreadPriorityCheck).

**Parameters:**
- `priority` (`int`): the priority for new Threads created with this ThreadFactory

### `setUncaughtExceptionHandler(java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler)`

**Returns:** [`com.google.common.util.concurrent.ThreadFactoryBuilder`](./ThreadFactoryBuilder.md)

**Parameters:**
- `uncaughtExceptionHandler` (`java.lang.Thread.UncaughtExceptionHandler`): the uncaught exception handler for new Threads created with
     this ThreadFactory

### `setThreadFactory(java.util.concurrent.ThreadFactory backingThreadFactory)`

**Returns:** [`com.google.common.util.concurrent.ThreadFactoryBuilder`](./ThreadFactoryBuilder.md)

Threads
 will be created by invoking #newThread(Runnable) on this backing ThreadFactory.

**Parameters:**
- `backingThreadFactory` (`java.util.concurrent.ThreadFactory`): the backing ThreadFactory which will be delegated to during
     thread creation.

### `build()`

**Returns:** `java.util.concurrent.ThreadFactory`

After
 building, it is still possible to change the options used to build the ThreadFactory and/or
 build again. State is not shared amongst built instances.

### `doBuild(com.google.common.util.concurrent.ThreadFactoryBuilder builder)`

**Returns:** `java.util.concurrent.ThreadFactory`

**Parameters:**
- `builder` ([`com.google.common.util.concurrent.ThreadFactoryBuilder`](./ThreadFactoryBuilder.md))

### `format(java.lang.String format, java.lang.Object[] args)`

**Returns:** `java.lang.String`

**Parameters:**
- `format` (`java.lang.String`)
- `args` (`java.lang.Object[]`)

