# Class: `OverflowAvoidingLockSupport`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.OverflowAvoidingLockSupport`

## Description

Works around an android bug, where parking for more than INT_MAX seconds can produce an abort
 signal on 32 bit devices running Android Q.

## Fields

### `MAX_NANOSECONDS_THRESHOLD`

**Type:** `long`

## Constructors

### `<init>()`

## Methods

### `parkNanos(`java.lang.Object` blocker, `long` nanos)`

**Returns:** `void`

