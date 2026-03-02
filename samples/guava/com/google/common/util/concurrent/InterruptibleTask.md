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

### `waitForInterrupt(java.lang.Thread currentThread)`

**Returns:** `void`

**Parameters:**
- `currentThread` (`java.lang.Thread`)

### `isDone()`

**Returns:** `boolean`

### `runInterruptibly()`

**Returns:** `T`

### `afterRanInterruptiblySuccess(T result)`

**Returns:** `void`

Complete Futures here.

**Parameters:**
- `result` (`T`)

### `afterRanInterruptiblyFailure(java.lang.Throwable error)`

**Returns:** `void`

Complete Futures here.

**Parameters:**
- `error` (`java.lang.Throwable`)

### `interruptTask()`

**Returns:** `void`

Because this internally calls Thread#interrupt() which can
 in turn invoke arbitrary code it is not safe to call while holding a lock.

### `toString()`

**Returns:** `java.lang.String`

### `toPendingString()`

**Returns:** `java.lang.String`

