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

### `await(long time, TimeUnit unit)`

**Parameters:**
- `time` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `boolean`

### `awaitUninterruptibly()`

**Returns:** `void`

### `awaitNanos(long nanosTimeout)`

**Parameters:**
- `nanosTimeout` (`long`)

**Returns:** `long`

### `awaitUntil(Date deadline)`

**Parameters:**
- `deadline` (`java.util.Date`)

**Returns:** `boolean`

### `signal()`

**Returns:** `void`

### `signalAll()`

**Returns:** `void`

