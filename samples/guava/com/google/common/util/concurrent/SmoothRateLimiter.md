# Class: `SmoothRateLimiter`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.SmoothRateLimiter`

**Extends:** [`com.google.common.util.concurrent.RateLimiter`](./RateLimiter.md)

## Fields

### `storedPermits`

**Type:** `double`

### `maxPermits`

**Type:** `double`

### `stableIntervalMicros`

**Type:** `double`

E.g., a stable rate of 5 permits
 per second has a stable interval of 200ms.

### `nextFreeTicketMicros`

**Type:** `long`

After granting a request,
 this is pushed further in the future. Large requests push this further than small requests.

## Constructors

### `<init>(com.google.common.util.concurrent.RateLimiter.SleepingStopwatch stopwatch)`

**Parameters:**
- `stopwatch` (`com.google.common.util.concurrent.RateLimiter.SleepingStopwatch`)

## Methods

### `doSetRate(double permitsPerSecond, long nowMicros)`

**Returns:** `void`

**Parameters:**
- `permitsPerSecond` (`double`)
- `nowMicros` (`long`)

### `doSetRate(double permitsPerSecond, double stableIntervalMicros)`

**Returns:** `void`

**Parameters:**
- `permitsPerSecond` (`double`)
- `stableIntervalMicros` (`double`)

### `doGetRate()`

**Returns:** `double`

### `queryEarliestAvailable(long nowMicros)`

**Returns:** `long`

**Parameters:**
- `nowMicros` (`long`)

### `reserveEarliestAvailable(int requiredPermits, long nowMicros)`

**Returns:** `long`

**Parameters:**
- `requiredPermits` (`int`)
- `nowMicros` (`long`)

### `storedPermitsToWaitTime(double storedPermits, double permitsToTake)`

**Returns:** `long`

Conceptually, this evaluates the integral of the underlying function we
 use, for the range of [(storedPermits - permitsToTake), storedPermits].

 
This always holds: 0 <= permitsToTake <= storedPermits

**Parameters:**
- `storedPermits` (`double`)
- `permitsToTake` (`double`)

### `coolDownIntervalMicros()`

**Returns:** `double`

### `resync(long nowMicros)`

**Returns:** `void`

**Parameters:**
- `nowMicros` (`long`)

