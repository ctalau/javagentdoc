# Class: `CycleDetectingLockFactory`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.CycleDetectingLockFactory`

## Description

The `CycleDetectingLockFactory` creates `ReentrantLock` instances and `ReentrantReadWriteLock` instances that detect potential deadlock by checking for cycles in lock
 acquisition order.

 <p>Potential deadlocks detected when calling the `lock()`, `lockInterruptibly()`, or
 `tryLock()` methods will result in the execution of the `Policy` specified when
 creating the factory. The currently available policies are:

 <ul>
   <li>DISABLED
   <li>WARN
   <li>THROW
 </ul>

 <p>The locks created by a factory instance will detect lock acquisition cycles with locks created
 by other `CycleDetectingLockFactory` instances (except those with `Policy.DISABLED`).
 A lock's behavior when a cycle is detected, however, is defined by the `Policy` of the
 factory that created it. This allows detection of cycles across components while delegating
 control over lock behavior to individual components.

 <p>Applications are encouraged to use a `CycleDetectingLockFactory` to create any locks for
 which external/unmanaged code is executed while the lock is held. (See caveats under
 <strong>Performance</strong>).

 <p><strong>Cycle Detection</strong>

 <p>Deadlocks can arise when locks are acquired in an order that forms a cycle. In a simple
 example involving two locks and two threads, deadlock occurs when one thread acquires Lock A, and
 then Lock B, while another thread acquires Lock B, and then Lock A:

 <pre>
 Thread1: acquire(LockA) --X acquire(LockB)
 Thread2: acquire(LockB) --X acquire(LockA)
 </pre>

 <p>Neither thread will progress because each is waiting for the other. In more complex
 applications, cycles can arise from interactions among more than 2 locks:

 <pre>
 Thread1: acquire(LockA) --X acquire(LockB)
 Thread2: acquire(LockB) --X acquire(LockC)
 ...
 ThreadN: acquire(LockN) --X acquire(LockA)
 </pre>

 <p>The implementation detects cycles by constructing a directed graph in which each lock
 represents a node and each edge represents an acquisition ordering between two locks.

 <ul>
   <li>Each lock adds (and removes) itself to/from a ThreadLocal Set of acquired locks when the
       Thread acquires its first hold (and releases its last remaining hold).
   <li>Before the lock is acquired, the lock is checked against the current set of acquired
       locks---to each of the acquired locks, an edge from the soon-to-be-acquired lock is either
       verified or created.
   <li>If a new edge needs to be created, the outgoing edges of the acquired locks are traversed
       to check for a cycle that reaches the lock to be acquired. If no cycle is detected, a new
       "safe" edge is created.
   <li>If a cycle is detected, an "unsafe" (cyclic) edge is created to represent a potential
       deadlock situation, and the appropriate Policy is executed.
 </ul>

 <p>Note that detection of potential deadlock does not necessarily indicate that deadlock will
 happen, as it is possible that higher level application logic prevents the cyclic lock
 acquisition from occurring. One example of a false positive is:

 <pre>
 LockA -&gt; LockB -&gt; LockC
 LockA -&gt; LockC -&gt; LockB
 </pre>

 <p><strong>ReadWriteLocks</strong>

 <p>While `ReadWriteLock` instances have different properties and can form cycles without
 potential deadlock, this class treats `ReadWriteLock` instances as equivalent to
 traditional exclusive locks. Although this increases the false positives that the locks detect
 (i.e. cycles that will not actually result in deadlock), it simplifies the algorithm and
 implementation considerably. The assumption is that a user of this factory wishes to eliminate
 any cyclic acquisition ordering.

 <p><strong>Explicit Lock Acquisition Ordering</strong>

 <p>The `CycleDetectingLockFactory.WithExplicitOrdering` class can be used to enforce an
 application-specific ordering in addition to performing general cycle detection.

 <p><strong>Garbage Collection</strong>

 <p>In order to allow proper garbage collection of unused locks, the edges of the lock graph are
 weak references.

 <p><strong>Performance</strong>

 <p>The extra bookkeeping done by cycle detecting locks comes at some cost to performance.
 Benchmarks (as of December 2011) show that:

 <ul>
   <li>for an unnested `lock()` and `unlock()`, a cycle detecting lock takes 38ns as
       opposed to the 24ns taken by a plain lock.
   <li>for nested locking, the cost increases with the depth of the nesting:
       <ul>
         <li>2 levels: average of 64ns per lock()/unlock()
         <li>3 levels: average of 77ns per lock()/unlock()
         <li>4 levels: average of 99ns per lock()/unlock()
         <li>5 levels: average of 103ns per lock()/unlock()
         <li>10 levels: average of 184ns per lock()/unlock()
         <li>20 levels: average of 393ns per lock()/unlock()
       </ul>
 </ul>

 <p>As such, the CycleDetectingLockFactory may not be suitable for performance-critical
 applications which involve tightly-looped or deeply-nested locking algorithms.
**Author:** Darick Tong
**Since:** 13.0

## Fields

### `lockGraphNodesPerType`

**Type:** `java.util.concurrent.ConcurrentMap<java.lang.Class<? extends java.lang.Enum<?>>,java.util.Map<? extends java.lang.Enum<?>,com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode>>`

### `logger`

**Type:** [`com.google.common.util.concurrent.LazyLogger`](./LazyLogger.md)

### `policy`

**Type:** [`com.google.common.util.concurrent.CycleDetectingLockFactory.Policy`](CycleDetectingLockFactory/Policy.md)

### `acquiredLocks`

**Type:** `java.lang.ThreadLocal<java.util.ArrayList<com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode>>`

Tracks the currently acquired locks for each Thread, kept up to date by calls to `aboutToAcquire(CycleDetectingLock)` and `lockStateChanged(CycleDetectingLock)`.

## Constructors

### `<init>([`com.google.common.util.concurrent.CycleDetectingLockFactory.Policy`](CycleDetectingLockFactory/Policy.md) policy)`

## Methods

### `newInstance([`com.google.common.util.concurrent.CycleDetectingLockFactory.Policy`](CycleDetectingLockFactory/Policy.md) policy)`

**Returns:** [`com.google.common.util.concurrent.CycleDetectingLockFactory`](./CycleDetectingLockFactory.md)

Creates a new factory with the specified policy.

### `newReentrantLock(`java.lang.String` lockName)`

**Returns:** `java.util.concurrent.locks.ReentrantLock`

Equivalent to `newReentrantLock(lockName, false)`.

### `newReentrantLock(`java.lang.String` lockName, `boolean` fair)`

**Returns:** `java.util.concurrent.locks.ReentrantLock`

Creates a `ReentrantLock` with the given fairness policy. The `lockName` is used in
 the warning or exception output to help identify the locks involved in the detected deadlock.

### `newReentrantReadWriteLock(`java.lang.String` lockName)`

**Returns:** `java.util.concurrent.locks.ReentrantReadWriteLock`

Equivalent to `newReentrantReadWriteLock(lockName, false)`.

### `newReentrantReadWriteLock(`java.lang.String` lockName, `boolean` fair)`

**Returns:** `java.util.concurrent.locks.ReentrantReadWriteLock`

Creates a `ReentrantReadWriteLock` with the given fairness policy. The `lockName`
 is used in the warning or exception output to help identify the locks involved in the detected
 deadlock.

### `newInstanceWithExplicitOrdering(`java.lang.Class<E>` enumClass, [`com.google.common.util.concurrent.CycleDetectingLockFactory.Policy`](CycleDetectingLockFactory/Policy.md) policy)`

**Returns:** [`com.google.common.util.concurrent.CycleDetectingLockFactory.WithExplicitOrdering<E>`](CycleDetectingLockFactory/WithExplicitOrdering.md)

Creates a `CycleDetectingLockFactory.WithExplicitOrdering<E>`.

### `getOrCreateNodes(`java.lang.Class<E>` clazz)`

**Returns:** `java.util.Map<? extends E,com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode>`

### `createNodes(`java.lang.Class<E>` clazz)`

**Returns:** `java.util.Map<E,com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode>`

For a given Enum type, creates an immutable map from each of the Enum's values to a
 corresponding LockGraphNode, with the `allowedPriorLocks` and `disallowedPriorLocks` prepopulated with nodes according to the natural ordering of the
 associated Enum values.

### `getLockName(`java.lang.Enum<?>` rank)`

**Returns:** `java.lang.String`

For the given Enum value `rank`, returns the value's `"EnumClass.name"`, which is
 used in exception and warning output.

### `aboutToAcquire([`com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock`](CycleDetectingLockFactory/CycleDetectingLock.md) lock)`

**Returns:** `void`

CycleDetectingLock implementations must call this method before attempting to acquire the lock.

### `lockStateChanged([`com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock`](CycleDetectingLockFactory/CycleDetectingLock.md) lock)`

**Returns:** `void`

CycleDetectingLock implementations must call this method in a `finally` clause after any
 attempt to change the lock state, including both lock and unlock attempts. Failure to do so can
 result in corrupting the acquireLocks set.

