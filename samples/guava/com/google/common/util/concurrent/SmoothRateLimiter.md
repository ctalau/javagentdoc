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

### `<init>(RateLimiter.SleepingStopwatch stopwatch)`

**Parameters:**
- `stopwatch` (`com.google.common.util.concurrent.RateLimiter.SleepingStopwatch`)

## Methods

### `doSetRate(double permitsPerSecond, long nowMicros)`

**Parameters:**
- `permitsPerSecond` (`double`)
- `nowMicros` (`long`)

**Returns:** `void`

### `doSetRate(double permitsPerSecond, double stableIntervalMicros)`

**Parameters:**
- `permitsPerSecond` (`double`)
- `stableIntervalMicros` (`double`)

**Returns:** `void`

### `doGetRate()`

**Returns:** `double`

### `queryEarliestAvailable(long nowMicros)`

**Parameters:**
- `nowMicros` (`long`)

**Returns:** `long`

### `reserveEarliestAvailable(int requiredPermits, long nowMicros)`

**Parameters:**
- `requiredPermits` (`int`)
- `nowMicros` (`long`)

**Returns:** `long`

### `storedPermitsToWaitTime(double storedPermits, double permitsToTake)`

Conceptually, this evaluates the integral of the underlying function we
 use, for the range of [(storedPermits - permitsToTake), storedPermits].

 
This always holds: 0 <= permitsToTake <= storedPermits

**Parameters:**
- `storedPermits` (`double`)
- `permitsToTake` (`double`)

**Returns:** `long`

### `coolDownIntervalMicros()`

**Returns:** `double`

### `resync(long nowMicros)`

**Parameters:**
- `nowMicros` (`long`)

**Returns:** `void`

