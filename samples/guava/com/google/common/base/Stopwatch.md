# Class: `Stopwatch`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Stopwatch`

## Description

An object that accurately measures <i>elapsed time</i>: the measured duration between two
 successive readings of "now" in the same process.

 <p>In contrast, <i>wall time</i> is a reading of "now" as given by a method like
 {@link System#currentTimeMillis()}, best represented as an {@link java.time.Instant}. Such values
 <i>can</i> be subtracted to obtain a {@code Duration} (such as by {@code Duration.between}), but
 doing so does <i>not</i> give a reliable measurement of elapsed time, because wall time readings
 are inherently approximate, routinely affected by periodic clock corrections. Because this class
 (by default) uses {@link System#nanoTime}, it is unaffected by these changes.

 <p>Use this class instead of direct calls to {@link System#nanoTime} for two reasons:

 <ul>
   <li>The raw {@code long} values returned by {@code nanoTime} are meaningless and unsafe to use
       in any other way than how {@code Stopwatch} uses them.
   <li>An alternative source of nanosecond ticks can be substituted, for example for testing or
       performance reasons, without affecting most of your code.
 </ul>

 <p>The one downside of {@code Stopwatch} relative to {@link System#nanoTime()} is that {@code
 Stopwatch} requires object allocation and additional method calls, which can reduce the accuracy
 of the elapsed times reported. {@code Stopwatch} is still suitable for logging and metrics where
 reasonably accurate values are sufficient. If the uncommon case that you need to maximize
 accuracy, use {@code System.nanoTime()} directly instead.

 <p>Basic usage:

 <pre>{@code
 Stopwatch stopwatch = Stopwatch.createStarted();
 doSomething();
 stopwatch.stop(); // optional

 Duration duration = stopwatch.elapsed();

 log.info("time: " + stopwatch); // formatted string like "12.3 ms"
 }</pre>

 <p>The state-changing methods are not idempotent; it is an error to start or stop a stopwatch
 that is already in the desired state.

 <p>When testing code that uses this class, use {@link #createUnstarted(Ticker)} or {@link #createStarted(Ticker)} to supply a fake or mock ticker. This allows you to simulate any valid
 behavior of the stopwatch.

 <p><b>Note:</b> This class is not thread-safe.

 <p><b>Warning for Android users:</b> a stopwatch with default behavior may not continue to keep
 time while the device is asleep. Instead, create one like this:

 <pre>{@code
 Stopwatch.createStarted(
      new Ticker() {
        public long read() {
          return android.os.SystemClock.elapsedRealtimeNanos(); // requires API Level 17
        }
      });
 }</pre>
@author Kevin Bourrillion
@since 10.0

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

### `<init>([`com.google.common.base.Ticker`](./Ticker.md) ticker)`

## Methods

### `createUnstarted()`

**Returns:** [`com.google.common.base.Stopwatch`](./Stopwatch.md)

Creates (but does not start) a new stopwatch using {@link System#nanoTime} as its time source.
@since 15.0

### `createUnstarted([`com.google.common.base.Ticker`](./Ticker.md) ticker)`

**Returns:** [`com.google.common.base.Stopwatch`](./Stopwatch.md)

Creates (but does not start) a new stopwatch, using the specified time source.
@since 15.0

### `createStarted()`

**Returns:** [`com.google.common.base.Stopwatch`](./Stopwatch.md)

Creates (and starts) a new stopwatch using {@link System#nanoTime} as its time source.
@since 15.0

### `createStarted([`com.google.common.base.Ticker`](./Ticker.md) ticker)`

**Returns:** [`com.google.common.base.Stopwatch`](./Stopwatch.md)

Creates (and starts) a new stopwatch, using the specified time source.
@since 15.0

### `isRunning()`

**Returns:** `boolean`

Returns {@code true} if {@link #start()} has been called on this stopwatch, and {@link #stop()}
 has not been called since the last call to {@code start()}.

### `start()`

**Returns:** [`com.google.common.base.Stopwatch`](./Stopwatch.md)

Starts the stopwatch.
@return this {@code Stopwatch} instance
@throws IllegalStateException if the stopwatch is already running.

### `stop()`

**Returns:** [`com.google.common.base.Stopwatch`](./Stopwatch.md)

Stops the stopwatch. Future reads will return the fixed duration that had elapsed up to this
 point.
@return this {@code Stopwatch} instance
@throws IllegalStateException if the stopwatch is already stopped.

### `reset()`

**Returns:** [`com.google.common.base.Stopwatch`](./Stopwatch.md)

Sets the elapsed time for this stopwatch to zero, and places it in a stopped state.
@return this {@code Stopwatch} instance

### `elapsedNanos()`

**Returns:** `long`

### `elapsed([`java.util.concurrent.TimeUnit`](../../../../java/util/concurrent/TimeUnit.md) desiredUnit)`

**Returns:** `long`

Returns the current elapsed time shown on this stopwatch, expressed in the desired time unit,
 with any fraction rounded down.

 <p><b>Note:</b> the overhead of measurement can be more than a microsecond, so it is generally
 not useful to specify {@link TimeUnit#NANOSECONDS} precision here.

 <p>It is generally not a good idea to use an ambiguous, unitless {@code long} to represent
 elapsed time. Therefore, we recommend using {@link #elapsed()} instead, which returns a
 strongly-typed {@code Duration} instance.
@since 14.0 (since 10.0 as {@code elapsedTime()})

### `elapsed()`

**Returns:** [`java.time.Duration`](../../../../java/time/Duration.md)

Returns the current elapsed time shown on this stopwatch as a {@link Duration}. Unlike {@link #elapsed(TimeUnit)}, this method does not lose any precision due to rounding.
@since 22.0

### `toString()`

**Returns:** `java.lang.String`

Returns a string representation of the current elapsed time.

### `chooseUnit(`long` nanos)`

**Returns:** [`java.util.concurrent.TimeUnit`](../../../../java/util/concurrent/TimeUnit.md)

### `abbreviate([`java.util.concurrent.TimeUnit`](../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** `java.lang.String`

