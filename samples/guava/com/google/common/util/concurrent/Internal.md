# Class: `Internal`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.Internal`

## Description

## Constructors

### `<init>()`

## Methods

### `toNanosSaturated(java.time.Duration duration)`

**Returns:** `long`

Instead of throwing ArithmeticException, this method silently saturates to either
 Long#MAX_VALUE or Long#MIN_VALUE. This behavior can be useful when decomposing
 a duration in order to call a legacy API which requires a long, TimeUnit pair.

**Parameters:**
- `duration` (`java.time.Duration`)

