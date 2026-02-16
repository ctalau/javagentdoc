# Class: `RateLimiter`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.RateLimiter`

## Description

A rate limiter. Conceptually, a rate limiter distributes permits at a configurable rate. Each
 {@link #acquire()} blocks if necessary until a permit is available, and then takes it. Once
 acquired, permits need not be released.

 <p>{@code RateLimiter} is safe for concurrent use: It will restrict the total rate of calls from
 all threads. Note, however, that it does not guarantee fairness.

 <p>Rate limiters are often used to restrict the rate at which some physical or logical resource
 is accessed. This is in contrast to {@link java.util.concurrent.Semaphore} which restricts the
 number of concurrent accesses instead of the rate (note though that concurrency and rate are
 closely related, e.g. see <a href="http://en.wikipedia.org/wiki/Little%27s_law">Little's
 Law</a>).

 <p>A {@code RateLimiter} is defined primarily by the rate at which permits are issued. Absent
 additional configuration, permits will be distributed at a fixed rate, defined in terms of
 permits per second. Permits will be distributed smoothly, with the delay between individual
 permits being adjusted to ensure that the configured rate is maintained.

 <p>It is possible to configure a {@code RateLimiter} to have a warmup period during which time
 the permits issued each second steadily increases until it hits the stable rate.

 <p>As an example, imagine that we have a list of tasks to execute, but we don't want to submit
 more than 2 per second:

 <pre>{@code
 final RateLimiter rateLimiter = RateLimiter.create(2.0); // rate is "2 permits per second"
 void submitTasks(List<Runnable> tasks, Executor executor) {
   for (Runnable task : tasks) {
     rateLimiter.acquire(); // may wait
     executor.execute(task);
   }
 }
 }</pre>

 <p>As another example, imagine that we produce a stream of data, and we want to cap it at 5kb per
 second. This could be accomplished by requiring a permit per byte, and specifying a rate of 5000
 permits per second:

 <pre>{@code
 final RateLimiter rateLimiter = RateLimiter.create(5000.0); // rate = 5000 permits per second
 void submitPacket(byte[] packet) {
   rateLimiter.acquire(packet.length);
   networkService.send(packet);
 }
 }</pre>

 <p>It is important to note that the number of permits requested <i>never</i> affects the
 throttling of the request itself (an invocation to {@code acquire(1)} and an invocation to {@code
 acquire(1000)} will result in exactly the same throttling, if any), but it affects the throttling
 of the <i>next</i> request. I.e., if an expensive task arrives at an idle RateLimiter, it will be
 granted immediately, but it is the <i>next</i> request that will experience extra throttling,
 thus paying for the cost of the expensive task.
@author Dimitris Andreou
@since 13.0

## Fields

### `stopwatch`

**Type:** [`com.google.common.util.concurrent.RateLimiter.SleepingStopwatch`](RateLimiter/SleepingStopwatch.md)

The underlying timer; used both to measure elapsed time and sleep as necessary. A separate
 object to facilitate testing.

### `mutexDoNotUseDirectly`

**Type:** `java.lang.Object`

## Constructors

### `<init>([`com.google.common.util.concurrent.RateLimiter.SleepingStopwatch`](RateLimiter/SleepingStopwatch.md) stopwatch)`

## Methods

### `create(`double` permitsPerSecond)`

**Returns:** [`com.google.common.util.concurrent.RateLimiter`](./RateLimiter.md)

Creates a {@code RateLimiter} with the specified stable throughput, given as "permits per
 second" (commonly referred to as <i>QPS</i>, queries per second).

 <p>The returned {@code RateLimiter} ensures that on average no more than {@code
 permitsPerSecond} are issued during any given second, with sustained requests being smoothly
 spread over each second. When the incoming request rate exceeds {@code permitsPerSecond} the
 rate limiter will release one permit every {@code (1.0 / permitsPerSecond)} seconds. When the
 rate limiter is unused, bursts of up to {@code permitsPerSecond} permits will be allowed, with
 subsequent requests being smoothly limited at the stable rate of {@code permitsPerSecond}.
@param permitsPerSecond the rate of the returned {@code RateLimiter}, measured in how many
     permits become available per second
@throws IllegalArgumentException if {@code permitsPerSecond} is negative or zero

### `create(`double` permitsPerSecond, [`com.google.common.util.concurrent.RateLimiter.SleepingStopwatch`](RateLimiter/SleepingStopwatch.md) stopwatch)`

**Returns:** [`com.google.common.util.concurrent.RateLimiter`](./RateLimiter.md)

### `create(`double` permitsPerSecond, [`java.time.Duration`](../../../../../java/time/Duration.md) warmupPeriod)`

**Returns:** [`com.google.common.util.concurrent.RateLimiter`](./RateLimiter.md)

Creates a {@code RateLimiter} with the specified stable throughput, given as "permits per
 second" (commonly referred to as <i>QPS</i>, queries per second), and a <i>warmup period</i>,
 during which the {@code RateLimiter} smoothly ramps up its rate, until it reaches its maximum
 rate at the end of the period (as long as there are enough requests to saturate it). Similarly,
 if the {@code RateLimiter} is left <i>unused</i> for a duration of {@code warmupPeriod}, it
 will gradually return to its "cold" state, i.e. it will go through the same warming up process
 as when it was first created.

 <p>The returned {@code RateLimiter} is intended for cases where the resource that actually
 fulfills the requests (e.g., a remote server) needs "warmup" time, rather than being
 immediately accessed at the stable (maximum) rate.

 <p>The returned {@code RateLimiter} starts in a "cold" state (i.e. the warmup period will
 follow), and if it is left unused for long enough, it will return to that state.
@param permitsPerSecond the rate of the returned {@code RateLimiter}, measured in how many
     permits become available per second
@param warmupPeriod the duration of the period where the {@code RateLimiter} ramps up its rate,
     before reaching its stable (maximum) rate
@throws IllegalArgumentException if {@code permitsPerSecond} is negative or zero or {@code
     warmupPeriod} is negative
@since 28.0

### `create(`double` permitsPerSecond, `long` warmupPeriod, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** [`com.google.common.util.concurrent.RateLimiter`](./RateLimiter.md)

Creates a {@code RateLimiter} with the specified stable throughput, given as "permits per
 second" (commonly referred to as <i>QPS</i>, queries per second), and a <i>warmup period</i>,
 during which the {@code RateLimiter} smoothly ramps up its rate, until it reaches its maximum
 rate at the end of the period (as long as there are enough requests to saturate it). Similarly,
 if the {@code RateLimiter} is left <i>unused</i> for a duration of {@code warmupPeriod}, it
 will gradually return to its "cold" state, i.e. it will go through the same warming up process
 as when it was first created.

 <p>The returned {@code RateLimiter} is intended for cases where the resource that actually
 fulfills the requests (e.g., a remote server) needs "warmup" time, rather than being
 immediately accessed at the stable (maximum) rate.

 <p>The returned {@code RateLimiter} starts in a "cold" state (i.e. the warmup period will
 follow), and if it is left unused for long enough, it will return to that state.
@param permitsPerSecond the rate of the returned {@code RateLimiter}, measured in how many
     permits become available per second
@param warmupPeriod the duration of the period where the {@code RateLimiter} ramps up its rate,
     before reaching its stable (maximum) rate
@param unit the time unit of the warmupPeriod argument
@throws IllegalArgumentException if {@code permitsPerSecond} is negative or zero or {@code
     warmupPeriod} is negative

### `create(`double` permitsPerSecond, `long` warmupPeriod, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit, `double` coldFactor, [`com.google.common.util.concurrent.RateLimiter.SleepingStopwatch`](RateLimiter/SleepingStopwatch.md) stopwatch)`

**Returns:** [`com.google.common.util.concurrent.RateLimiter`](./RateLimiter.md)

### `mutex()`

**Returns:** `java.lang.Object`

### `setRate(`double` permitsPerSecond)`

**Returns:** `void`

Updates the stable rate of this {@code RateLimiter}, that is, the {@code permitsPerSecond}
 argument provided in the factory method that constructed the {@code RateLimiter}. Currently
 throttled threads will <b>not</b> be awakened as a result of this invocation, thus they do not
 observe the new rate; only subsequent requests will.

 <p>Note though that, since each request repays (by waiting, if necessary) the cost of the
 <i>previous</i> request, this means that the very next request after an invocation to {@code
 setRate} will not be affected by the new rate; it will pay the cost of the previous request,
 which is in terms of the previous rate.

 <p>The behavior of the {@code RateLimiter} is not modified in any other way, e.g. if the {@code
 RateLimiter} was configured with a warmup period of 20 seconds, it still has a warmup period of
 20 seconds after this method invocation.
@param permitsPerSecond the new stable rate of this {@code RateLimiter}
@throws IllegalArgumentException if {@code permitsPerSecond} is negative or zero

### `doSetRate(`double` permitsPerSecond, `long` nowMicros)`

**Returns:** `void`

### `getRate()`

**Returns:** `double`

Returns the stable rate (as {@code permits per seconds}) with which this {@code RateLimiter} is
 configured with. The initial value of this is the same as the {@code permitsPerSecond} argument
 passed in the factory method that produced this {@code RateLimiter}, and it is only updated
 after invocations to {@linkplain #setRate}.

### `doGetRate()`

**Returns:** `double`

### `acquire()`

**Returns:** `double`

Acquires a single permit from this {@code RateLimiter}, blocking until the request can be
 granted. Tells the amount of time slept, if any.

 <p>This method is equivalent to {@code acquire(1)}.
@return time spent sleeping to enforce rate, in seconds; 0.0 if not rate-limited
@since 16.0 (present in 13.0 with {@code void} return type})

### `acquire(`int` permits)`

**Returns:** `double`

Acquires the given number of permits from this {@code RateLimiter}, blocking until the request
 can be granted. Tells the amount of time slept, if any.
@param permits the number of permits to acquire
@return time spent sleeping to enforce rate, in seconds; 0.0 if not rate-limited
@throws IllegalArgumentException if the requested number of permits is negative or zero
@since 16.0 (present in 13.0 with {@code void} return type})

### `reserve(`int` permits)`

**Returns:** `long`

Reserves the given number of permits from this {@code RateLimiter} for future use, returning
 the number of microseconds until the reservation can be consumed.
@return time in microseconds to wait until the resource can be acquired, never negative

### `tryAcquire([`java.time.Duration`](../../../../../java/time/Duration.md) timeout)`

**Returns:** `boolean`

Acquires a permit from this {@code RateLimiter} if it can be obtained without exceeding the
 specified {@code timeout}, or returns {@code false} immediately (without waiting) if the permit
 would not have been granted before the timeout expired.

 <p>This method is equivalent to {@code tryAcquire(1, timeout)}.
@param timeout the maximum time to wait for the permit. Negative values are treated as zero.
@return {@code true} if the permit was acquired, {@code false} otherwise
@throws IllegalArgumentException if the requested number of permits is negative or zero
@since 28.0

### `tryAcquire(`long` timeout, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** `boolean`

Acquires a permit from this {@code RateLimiter} if it can be obtained without exceeding the
 specified {@code timeout}, or returns {@code false} immediately (without waiting) if the permit
 would not have been granted before the timeout expired.

 <p>This method is equivalent to {@code tryAcquire(1, timeout, unit)}.
@param timeout the maximum time to wait for the permit. Negative values are treated as zero.
@param unit the time unit of the timeout argument
@return {@code true} if the permit was acquired, {@code false} otherwise
@throws IllegalArgumentException if the requested number of permits is negative or zero

### `tryAcquire(`int` permits)`

**Returns:** `boolean`

Acquires permits from this {@link RateLimiter} if it can be acquired immediately without delay.

 <p>This method is equivalent to {@code tryAcquire(permits, 0, anyUnit)}.
@param permits the number of permits to acquire
@return {@code true} if the permits were acquired, {@code false} otherwise
@throws IllegalArgumentException if the requested number of permits is negative or zero
@since 14.0

### `tryAcquire()`

**Returns:** `boolean`

Acquires a permit from this {@link RateLimiter} if it can be acquired immediately without
 delay.

 <p>This method is equivalent to {@code tryAcquire(1)}.
@return {@code true} if the permit was acquired, {@code false} otherwise
@since 14.0

### `tryAcquire(`int` permits, [`java.time.Duration`](../../../../../java/time/Duration.md) timeout)`

**Returns:** `boolean`

Acquires the given number of permits from this {@code RateLimiter} if it can be obtained
 without exceeding the specified {@code timeout}, or returns {@code false} immediately (without
 waiting) if the permits would not have been granted before the timeout expired.
@param permits the number of permits to acquire
@param timeout the maximum time to wait for the permits. Negative values are treated as zero.
@return {@code true} if the permits were acquired, {@code false} otherwise
@throws IllegalArgumentException if the requested number of permits is negative or zero
@since 28.0

### `tryAcquire(`int` permits, `long` timeout, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** `boolean`

Acquires the given number of permits from this {@code RateLimiter} if it can be obtained
 without exceeding the specified {@code timeout}, or returns {@code false} immediately (without
 waiting) if the permits would not have been granted before the timeout expired.
@param permits the number of permits to acquire
@param timeout the maximum time to wait for the permits. Negative values are treated as zero.
@param unit the time unit of the timeout argument
@return {@code true} if the permits were acquired, {@code false} otherwise
@throws IllegalArgumentException if the requested number of permits is negative or zero

### `canAcquire(`long` nowMicros, `long` timeoutMicros)`

**Returns:** `boolean`

### `reserveAndGetWaitLength(`int` permits, `long` nowMicros)`

**Returns:** `long`

Reserves next ticket and returns the wait time that the caller must wait for.
@return the required wait time, never negative

### `queryEarliestAvailable(`long` nowMicros)`

**Returns:** `long`

Returns the earliest time that permits are available (with one caveat).
@return the time that permits are available, or, if permits are available immediately, an
     arbitrary past or present time

### `reserveEarliestAvailable(`int` permits, `long` nowMicros)`

**Returns:** `long`

Reserves the requested number of permits and returns the time that those permits can be used
 (with one caveat).
@return the time that the permits may be used, or, if the permits may be used immediately, an
     arbitrary past or present time

### `toString()`

**Returns:** `java.lang.String`

### `checkPermits(`int` permits)`

**Returns:** `void`

