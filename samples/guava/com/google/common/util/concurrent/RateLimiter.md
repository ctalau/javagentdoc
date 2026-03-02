# Class: `RateLimiter`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.RateLimiter`

## Description

Conceptually, a rate limiter distributes permits at a configurable rate. Each
 #acquire() blocks if necessary until a permit is available, and then takes it. Once
 acquired, permits need not be released.

 
RateLimiter is safe for concurrent use: It will restrict the total rate of calls from
 all threads. Note, however, that it does not guarantee fairness.

 
Rate limiters are often used to restrict the rate at which some physical or logical resource
 is accessed. This is in contrast to java.util.concurrent.Semaphore which restricts the
 number of concurrent accesses instead of the rate (note though that concurrency and rate are
 closely related, e.g. see [Little's
 Law](http://en.wikipedia.org/wiki/Little%27s_law)).

 
A RateLimiter is defined primarily by the rate at which permits are issued. Absent
 additional configuration, permits will be distributed at a fixed rate, defined in terms of
 permits per second. Permits will be distributed smoothly, with the delay between individual
 permits being adjusted to ensure that the configured rate is maintained.

 
It is possible to configure a RateLimiter to have a warmup period during which time
 the permits issued each second steadily increases until it hits the stable rate.

 
As an example, imagine that we have a list of tasks to execute, but we don't want to submit
 more than 2 per second:

 

```

 final RateLimiter rateLimiter = RateLimiter.create(2.0); // rate is "2 permits per second"
 void submitTasks(List<Runnable> tasks, Executor executor) {
   for (Runnable task : tasks) {
     rateLimiter.acquire(); // may wait
     executor.execute(task);
   }
 }
 
```


 
As another example, imagine that we produce a stream of data, and we want to cap it at 5kb per
 second. This could be accomplished by requiring a permit per byte, and specifying a rate of 5000
 permits per second:

 

```

 final RateLimiter rateLimiter = RateLimiter.create(5000.0); // rate = 5000 permits per second
 void submitPacket(byte[] packet) {
   rateLimiter.acquire(packet.length);
   networkService.send(packet);
 }
 
```


 
It is important to note that the number of permits requested *never* affects the
 throttling of the request itself (an invocation to acquire(1) and an invocation to 
 acquire(1000) will result in exactly the same throttling, if any), but it affects the throttling
 of the *next* request. I.e., if an expensive task arrives at an idle RateLimiter, it will be
 granted immediately, but it is the *next* request that will experience extra throttling,
 thus paying for the cost of the expensive task.

## Fields

### `stopwatch`

**Type:** `com.google.common.util.concurrent.RateLimiter.SleepingStopwatch`

A separate
 object to facilitate testing.

### `mutexDoNotUseDirectly`

**Type:** `java.lang.Object`

## Constructors

### `<init>(com.google.common.util.concurrent.RateLimiter.SleepingStopwatch stopwatch)`

**Parameters:**
- `stopwatch` (`com.google.common.util.concurrent.RateLimiter.SleepingStopwatch`)

## Methods

### `create(double permitsPerSecond)`

**Returns:** [`com.google.common.util.concurrent.RateLimiter`](./RateLimiter.md)

The returned RateLimiter ensures that on average no more than 
 permitsPerSecond are issued during any given second, with sustained requests being smoothly
 spread over each second. When the incoming request rate exceeds permitsPerSecond the
 rate limiter will release one permit every (1.0 / permitsPerSecond) seconds. When the
 rate limiter is unused, bursts of up to permitsPerSecond permits will be allowed, with
 subsequent requests being smoothly limited at the stable rate of permitsPerSecond.

**Parameters:**
- `permitsPerSecond` (`double`): the rate of the returned RateLimiter, measured in how many
     permits become available per second

### `create(double permitsPerSecond, com.google.common.util.concurrent.RateLimiter.SleepingStopwatch stopwatch)`

**Returns:** [`com.google.common.util.concurrent.RateLimiter`](./RateLimiter.md)

**Parameters:**
- `permitsPerSecond` (`double`)
- `stopwatch` (`com.google.common.util.concurrent.RateLimiter.SleepingStopwatch`)

### `create(double permitsPerSecond, java.time.Duration warmupPeriod)`

**Returns:** [`com.google.common.util.concurrent.RateLimiter`](./RateLimiter.md)

Similarly,
 if the RateLimiter is left *unused* for a duration of warmupPeriod, it
 will gradually return to its "cold" state, i.e. it will go through the same warming up process
 as when it was first created.

 
The returned RateLimiter is intended for cases where the resource that actually
 fulfills the requests (e.g., a remote server) needs "warmup" time, rather than being
 immediately accessed at the stable (maximum) rate.

 
The returned RateLimiter starts in a "cold" state (i.e. the warmup period will
 follow), and if it is left unused for long enough, it will return to that state.

**Parameters:**
- `permitsPerSecond` (`double`): the rate of the returned RateLimiter, measured in how many
     permits become available per second
- `warmupPeriod` (`java.time.Duration`): the duration of the period where the RateLimiter ramps up its rate,
     before reaching its stable (maximum) rate

### `create(double permitsPerSecond, long warmupPeriod, java.util.concurrent.TimeUnit unit)`

**Returns:** [`com.google.common.util.concurrent.RateLimiter`](./RateLimiter.md)

Similarly,
 if the RateLimiter is left *unused* for a duration of warmupPeriod, it
 will gradually return to its "cold" state, i.e. it will go through the same warming up process
 as when it was first created.

 
The returned RateLimiter is intended for cases where the resource that actually
 fulfills the requests (e.g., a remote server) needs "warmup" time, rather than being
 immediately accessed at the stable (maximum) rate.

 
The returned RateLimiter starts in a "cold" state (i.e. the warmup period will
 follow), and if it is left unused for long enough, it will return to that state.

**Parameters:**
- `permitsPerSecond` (`double`): the rate of the returned RateLimiter, measured in how many
     permits become available per second
- `warmupPeriod` (`long`): the duration of the period where the RateLimiter ramps up its rate,
     before reaching its stable (maximum) rate
- `unit` (`java.util.concurrent.TimeUnit`): the time unit of the warmupPeriod argument

### `create(double permitsPerSecond, long warmupPeriod, java.util.concurrent.TimeUnit unit, double coldFactor, com.google.common.util.concurrent.RateLimiter.SleepingStopwatch stopwatch)`

**Returns:** [`com.google.common.util.concurrent.RateLimiter`](./RateLimiter.md)

**Parameters:**
- `permitsPerSecond` (`double`)
- `warmupPeriod` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)
- `coldFactor` (`double`)
- `stopwatch` (`com.google.common.util.concurrent.RateLimiter.SleepingStopwatch`)

### `mutex()`

**Returns:** `java.lang.Object`

### `setRate(double permitsPerSecond)`

**Returns:** `void`

Currently
 throttled threads will **not** be awakened as a result of this invocation, thus they do not
 observe the new rate; only subsequent requests will.

 
Note though that, since each request repays (by waiting, if necessary) the cost of the
 *previous* request, this means that the very next request after an invocation to 
 setRate will not be affected by the new rate; it will pay the cost of the previous request,
 which is in terms of the previous rate.

 
The behavior of the RateLimiter is not modified in any other way, e.g. if the 
 RateLimiter was configured with a warmup period of 20 seconds, it still has a warmup period of
 20 seconds after this method invocation.

**Parameters:**
- `permitsPerSecond` (`double`): the new stable rate of this RateLimiter

### `doSetRate(double permitsPerSecond, long nowMicros)`

**Returns:** `void`

**Parameters:**
- `permitsPerSecond` (`double`)
- `nowMicros` (`long`)

### `getRate()`

**Returns:** `double`

The initial value of this is the same as the permitsPerSecond argument
 passed in the factory method that produced this RateLimiter, and it is only updated
 after invocations to #setRate.

### `doGetRate()`

**Returns:** `double`

### `acquire()`

**Returns:** `double`

Tells the amount of time slept, if any.

 
This method is equivalent to acquire(1).

### `acquire(int permits)`

**Returns:** `double`

Tells the amount of time slept, if any.

**Parameters:**
- `permits` (`int`): the number of permits to acquire

### `reserve(int permits)`

**Returns:** `long`

**Parameters:**
- `permits` (`int`)

### `tryAcquire(java.time.Duration timeout)`

**Returns:** `boolean`

This method is equivalent to tryAcquire(1, timeout).

**Parameters:**
- `timeout` (`java.time.Duration`): the maximum time to wait for the permit. Negative values are treated as zero.

### `tryAcquire(long timeout, java.util.concurrent.TimeUnit unit)`

**Returns:** `boolean`

This method is equivalent to tryAcquire(1, timeout, unit).

**Parameters:**
- `timeout` (`long`): the maximum time to wait for the permit. Negative values are treated as zero.
- `unit` (`java.util.concurrent.TimeUnit`): the time unit of the timeout argument

### `tryAcquire(int permits)`

**Returns:** `boolean`

This method is equivalent to tryAcquire(permits, 0, anyUnit).

**Parameters:**
- `permits` (`int`): the number of permits to acquire

### `tryAcquire()`

**Returns:** `boolean`

This method is equivalent to tryAcquire(1).

### `tryAcquire(int permits, java.time.Duration timeout)`

**Returns:** `boolean`

**Parameters:**
- `permits` (`int`): the number of permits to acquire
- `timeout` (`java.time.Duration`): the maximum time to wait for the permits. Negative values are treated as zero.

### `tryAcquire(int permits, long timeout, java.util.concurrent.TimeUnit unit)`

**Returns:** `boolean`

**Parameters:**
- `permits` (`int`): the number of permits to acquire
- `timeout` (`long`): the maximum time to wait for the permits. Negative values are treated as zero.
- `unit` (`java.util.concurrent.TimeUnit`): the time unit of the timeout argument

### `canAcquire(long nowMicros, long timeoutMicros)`

**Returns:** `boolean`

**Parameters:**
- `nowMicros` (`long`)
- `timeoutMicros` (`long`)

### `reserveAndGetWaitLength(int permits, long nowMicros)`

**Returns:** `long`

**Parameters:**
- `permits` (`int`)
- `nowMicros` (`long`)

### `queryEarliestAvailable(long nowMicros)`

**Returns:** `long`

**Parameters:**
- `nowMicros` (`long`)

### `reserveEarliestAvailable(int permits, long nowMicros)`

**Returns:** `long`

**Parameters:**
- `permits` (`int`)
- `nowMicros` (`long`)

### `toString()`

**Returns:** `java.lang.String`

### `checkPermits(int permits)`

**Returns:** `void`

**Parameters:**
- `permits` (`int`)

