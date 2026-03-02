# Class: `InterruptibleTask`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.InterruptibleTask`

**Extends:** `java.util.concurrent.atomic.AtomicReference<java.lang.@org.checkerframework.checker.nullness.qual.Nullable Runnable>`

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

### `waitForInterrupt(Thread currentThread)`

**Parameters:**
- `currentThread` (`java.lang.Thread`)

**Returns:** `void`

### `isDone()`

**Returns:** `boolean`

### `runInterruptibly()`

**Returns:** `T`

### `afterRanInterruptiblySuccess(T result)`

Complete Futures here.

**Parameters:**
- `result` (`T`)

**Returns:** `void`

### `afterRanInterruptiblyFailure(Throwable error)`

Complete Futures here.

**Parameters:**
- `error` (`java.lang.Throwable`)

**Returns:** `void`

### `interruptTask()`

Because this internally calls Thread#interrupt() which can
 in turn invoke arbitrary code it is not safe to call while holding a lock.

**Returns:** `void`

### `toString()`

**Returns:** `java.lang.String`

### `toPendingString()`

**Returns:** `java.lang.String`

