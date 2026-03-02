# Class: `ForwardingCondition`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ForwardingCondition`

**Implements:** `java.util.concurrent.locks.Condition`

## Description

## Constructors

### `<init>()`

## Methods

### `delegate()`

**Returns:** `java.util.concurrent.locks.Condition`

### `await()`

**Returns:** `void`

### `await(long time, java.util.concurrent.TimeUnit unit)`

**Returns:** `boolean`

**Parameters:**
- `time` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `awaitUninterruptibly()`

**Returns:** `void`

### `awaitNanos(long nanosTimeout)`

**Returns:** `long`

**Parameters:**
- `nanosTimeout` (`long`)

### `awaitUntil(java.util.Date deadline)`

**Returns:** `boolean`

**Parameters:**
- `deadline` (`java.util.Date`)

### `signal()`

**Returns:** `void`

### `signalAll()`

**Returns:** `void`

