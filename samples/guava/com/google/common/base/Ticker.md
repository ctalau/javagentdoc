# Class: `Ticker`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Ticker`

## Description

A time source; returns a time value representing the number of nanoseconds elapsed since some
 fixed but arbitrary point in time. Note that most users should use `Stopwatch` instead of
 interacting with this class directly.

 <p><b>Warning:</b> this interface can only be used to measure elapsed time, not wall time.
**Author:** Kevin Bourrillion
**Since:** 10.0 (<a href="https://github.com/google/guava/wiki/Compatibility">mostly
     source-compatible</a> since 9.0)

## Fields

### `SYSTEM_TICKER`

**Type:** [`com.google.common.base.Ticker`](./Ticker.md)

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `read()`

**Returns:** `long`

Returns the number of nanoseconds elapsed since this ticker's fixed point of reference.

### `systemTicker()`

**Returns:** [`com.google.common.base.Ticker`](./Ticker.md)

A ticker that reads the current time using `System.nanoTime`.
**Since:** 10.0

