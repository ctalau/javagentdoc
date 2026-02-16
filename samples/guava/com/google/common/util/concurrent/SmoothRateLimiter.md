# Class: `SmoothRateLimiter`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.SmoothRateLimiter`

**Extends:** [`com.google.common.util.concurrent.RateLimiter`](./RateLimiter.md)

## Fields

### `storedPermits`

**Type:** `double`

The currently stored permits.

### `maxPermits`

**Type:** `double`

The maximum number of stored permits.

### `stableIntervalMicros`

**Type:** `double`

The interval between two unit requests, at our stable rate. E.g., a stable rate of 5 permits
 per second has a stable interval of 200ms.

### `nextFreeTicketMicros`

**Type:** `long`

The time when the next request (no matter its size) will be granted. After granting a request,
 this is pushed further in the future. Large requests push this further than small requests.

## Constructors

### `<init>([`com.google.common.util.concurrent.RateLimiter.SleepingStopwatch`](RateLimiter/SleepingStopwatch.md) stopwatch)`

## Methods

### `doSetRate(`double` permitsPerSecond, `long` nowMicros)`

**Returns:** `void`

### `doSetRate(`double` permitsPerSecond, `double` stableIntervalMicros)`

**Returns:** `void`

### `doGetRate()`

**Returns:** `double`

### `queryEarliestAvailable(`long` nowMicros)`

**Returns:** `long`

### `reserveEarliestAvailable(`int` requiredPermits, `long` nowMicros)`

**Returns:** `long`

### `storedPermitsToWaitTime(`double` storedPermits, `double` permitsToTake)`

**Returns:** `long`

Translates a specified portion of our currently stored permits which we want to spend/acquire,
 into a throttling time. Conceptually, this evaluates the integral of the underlying function we
 use, for the range of [(storedPermits - permitsToTake), storedPermits].

 <p>This always holds: {@code 0 <= permitsToTake <= storedPermits}

### `coolDownIntervalMicros()`

**Returns:** `double`

Returns the number of microseconds during cool down that we have to wait to get a new permit.

### `resync(`long` nowMicros)`

**Returns:** `void`

Updates {@code storedPermits} and {@code nextFreeTicketMicros} based on the current time.

