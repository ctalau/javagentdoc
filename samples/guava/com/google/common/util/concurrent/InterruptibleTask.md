# Class: `InterruptibleTask`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.InterruptibleTask`

**Extends:** [`java.util.concurrent.atomic.AtomicReference<java.lang.@org.checkerframework.checker.nullness.qual.Nullable Runnable>`](../../../../../java/util/concurrent/atomic/AtomicReference.md)

**Implements:** `java.lang.Runnable`

## Type Parameters

- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Fields

### `DONE`

**Type:** `java.lang.Runnable`

### `PARKED`

**Type:** `java.lang.Runnable`

### `MAX_BUSY_WAIT_SPINS`

**Type:** `int`

## Constructors

### `<init>()`

## Methods

### `run()`

**Returns:** `void`

### `waitForInterrupt(`java.lang.Thread` currentThread)`

**Returns:** `void`

### `isDone()`

**Returns:** `boolean`

Called before runInterruptibly - if true, runInterruptibly and afterRanInterruptibly will not
 be called.

### `runInterruptibly()`

**Returns:** [`T`](T.md)

Do interruptible work here - do not complete Futures here, as their listeners could be
 interrupted.

### `afterRanInterruptiblySuccess([`T`](T.md) result)`

**Returns:** `void`

Any interruption that happens as a result of calling interruptTask will arrive before this
 method is called. Complete Futures here.

### `afterRanInterruptiblyFailure(`java.lang.Throwable` error)`

**Returns:** `void`

Any interruption that happens as a result of calling interruptTask will arrive before this
 method is called. Complete Futures here.

### `interruptTask()`

**Returns:** `void`

Interrupts the running task. Because this internally calls {@link Thread#interrupt()} which can
 in turn invoke arbitrary code it is not safe to call while holding a lock.

### `toString()`

**Returns:** `java.lang.String`

### `toPendingString()`

**Returns:** `java.lang.String`

