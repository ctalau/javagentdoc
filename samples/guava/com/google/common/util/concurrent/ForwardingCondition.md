# Class: `ForwardingCondition`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ForwardingCondition`

**Implements:** `java.util.concurrent.locks.Condition`

## Description

Forwarding wrapper around a `Condition`.

## Constructors

### `<init>()`

## Methods

### `delegate()`

**Returns:** `java.util.concurrent.locks.Condition`

### `await()`

**Returns:** `void`

### `await(`long` time, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `boolean`

### `awaitUninterruptibly()`

**Returns:** `void`

### `awaitNanos(`long` nanosTimeout)`

**Returns:** `long`

### `awaitUntil(`java.util.Date` deadline)`

**Returns:** `boolean`

### `signal()`

**Returns:** `void`

### `signalAll()`

**Returns:** `void`

