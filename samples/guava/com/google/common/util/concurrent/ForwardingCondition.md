# Class: `ForwardingCondition`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ForwardingCondition`

**Implements:** [`java.util.concurrent.locks.Condition`](../../../../../java/util/concurrent/locks/Condition.md)

## Description

Forwarding wrapper around a {@code Condition}.

## Constructors

### `<init>()`

## Methods

### `delegate()`

**Returns:** [`java.util.concurrent.locks.Condition`](../../../../../java/util/concurrent/locks/Condition.md)

### `await()`

**Returns:** `void`

### `await(`long` time, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** `boolean`

### `awaitUninterruptibly()`

**Returns:** `void`

### `awaitNanos(`long` nanosTimeout)`

**Returns:** `long`

### `awaitUntil([`java.util.Date`](../../../../../java/util/Date.md) deadline)`

**Returns:** `boolean`

### `signal()`

**Returns:** `void`

### `signalAll()`

**Returns:** `void`

