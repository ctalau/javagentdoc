# Class: `Stopwatch`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Stopwatch`

## Description

In contrast, *wall time* is a reading of "now" as given by a method like
 System#currentTimeMillis(), best represented as an java.time.Instant. Such values
 *can* be subtracted to obtain a Duration (such as by Duration.between), but
 doing so does *not* give a reliable measurement of elapsed time, because wall time readings
 are inherently approximate, routinely affected by periodic clock corrections. Because this class
 (by default) uses System#nanoTime, it is unaffected by these changes.

 
Use this class instead of direct calls to System#nanoTime for two reasons:

 

   - The raw long values returned by nanoTime are meaningless and unsafe to use
       in any other way than how Stopwatch uses them.
   - An alternative source of nanosecond ticks can be substituted, for example for testing or
       performance reasons, without affecting most of your code.
 


 
The one downside of Stopwatch relative to System#nanoTime() is that 
 Stopwatch requires object allocation and additional method calls, which can reduce the accuracy
 of the elapsed times reported. Stopwatch is still suitable for logging and metrics where
 reasonably accurate values are sufficient. If the uncommon case that you need to maximize
 accuracy, use System.nanoTime() directly instead.

 
Basic usage:

 

```

 Stopwatch stopwatch = Stopwatch.createStarted();
 doSomething();
 stopwatch.stop(); // optional

 Duration duration = stopwatch.elapsed();

 log.info("time: " + stopwatch); // formatted string like "12.3 ms"
 
```


 
The state-changing methods are not idempotent; it is an error to start or stop a stopwatch
 that is already in the desired state.

 
When testing code that uses this class, use #createUnstarted(Ticker) or #createStarted(Ticker) to supply a fake or mock ticker. This allows you to simulate any valid
 behavior of the stopwatch.

 
**Note:** This class is not thread-safe.

 
**Warning for Android users:** a stopwatch with default behavior may not continue to keep
 time while the device is asleep. Instead, create one like this:

 

```

 Stopwatch.createStarted(
      new Ticker() {
        public long read() {
          return android.os.SystemClock.elapsedRealtimeNanos(); // requires API Level 17
        }
      });
 
```

## Fields

### `ticker`

**Type:** [`com.google.common.base.Ticker`](./Ticker.md)

### `isRunning`

**Type:** `boolean`

### `elapsedNanos`

**Type:** `long`

### `startTick`

**Type:** `long`

## Constructors

### `<init>()`

### `<init>(Ticker ticker)`

**Parameters:**
- `ticker` ([`com.google.common.base.Ticker`](./Ticker.md))

## Methods

### `createUnstarted()`

**Returns:** [`com.google.common.base.Stopwatch`](./Stopwatch.md)

### `createUnstarted(Ticker ticker)`

**Parameters:**
- `ticker` ([`com.google.common.base.Ticker`](./Ticker.md))

**Returns:** [`com.google.common.base.Stopwatch`](./Stopwatch.md)

### `createStarted()`

**Returns:** [`com.google.common.base.Stopwatch`](./Stopwatch.md)

### `createStarted(Ticker ticker)`

**Parameters:**
- `ticker` ([`com.google.common.base.Ticker`](./Ticker.md))

**Returns:** [`com.google.common.base.Stopwatch`](./Stopwatch.md)

### `isRunning()`

**Returns:** `boolean`

### `start()`

**Returns:** [`com.google.common.base.Stopwatch`](./Stopwatch.md)

### `stop()`

Future reads will return the fixed duration that had elapsed up to this
 point.

**Returns:** [`com.google.common.base.Stopwatch`](./Stopwatch.md)

### `reset()`

**Returns:** [`com.google.common.base.Stopwatch`](./Stopwatch.md)

### `elapsedNanos()`

**Returns:** `long`

### `elapsed(TimeUnit desiredUnit)`

**Note:** the overhead of measurement can be more than a microsecond, so it is generally
 not useful to specify TimeUnit#NANOSECONDS precision here.

 
It is generally not a good idea to use an ambiguous, unitless long to represent
 elapsed time. Therefore, we recommend using #elapsed() instead, which returns a
 strongly-typed Duration instance.

**Parameters:**
- `desiredUnit` (`java.util.concurrent.TimeUnit`)

**Returns:** `long`

### `elapsed()`

Unlike #elapsed(TimeUnit), this method does not lose any precision due to rounding.

**Returns:** `java.time.Duration`

### `toString()`

**Returns:** `java.lang.String`

### `chooseUnit(long nanos)`

**Parameters:**
- `nanos` (`long`)

**Returns:** `java.util.concurrent.TimeUnit`

### `abbreviate(TimeUnit unit)`

**Parameters:**
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `java.lang.String`

