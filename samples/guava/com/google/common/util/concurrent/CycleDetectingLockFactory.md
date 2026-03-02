# Class: `CycleDetectingLockFactory`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.CycleDetectingLockFactory`

## Description

Potential deadlocks detected when calling the lock(), lockInterruptibly(), or
 tryLock() methods will result in the execution of the Policy specified when
 creating the factory. The currently available policies are:

 

   - DISABLED
   - WARN
   - THROW
 


 
The locks created by a factory instance will detect lock acquisition cycles with locks created
 by other CycleDetectingLockFactory instances (except those with Policy.DISABLED).
 A lock's behavior when a cycle is detected, however, is defined by the Policy of the
 factory that created it. This allows detection of cycles across components while delegating
 control over lock behavior to individual components.

 
Applications are encouraged to use a CycleDetectingLockFactory to create any locks for
 which external/unmanaged code is executed while the lock is held. (See caveats under
 **Performance**).

 
**Cycle Detection**

 
Deadlocks can arise when locks are acquired in an order that forms a cycle. In a simple
 example involving two locks and two threads, deadlock occurs when one thread acquires Lock A, and
 then Lock B, while another thread acquires Lock B, and then Lock A:

 

```

 Thread1: acquire(LockA) --X acquire(LockB)
 Thread2: acquire(LockB) --X acquire(LockA)
 
```


 
Neither thread will progress because each is waiting for the other. In more complex
 applications, cycles can arise from interactions among more than 2 locks:

 

```

 Thread1: acquire(LockA) --X acquire(LockB)
 Thread2: acquire(LockB) --X acquire(LockC)
 ...
 ThreadN: acquire(LockN) --X acquire(LockA)
 
```


 
The implementation detects cycles by constructing a directed graph in which each lock
 represents a node and each edge represents an acquisition ordering between two locks.

 

   - Each lock adds (and removes) itself to/from a ThreadLocal Set of acquired locks when the
       Thread acquires its first hold (and releases its last remaining hold).
   - Before the lock is acquired, the lock is checked against the current set of acquired
       locks---to each of the acquired locks, an edge from the soon-to-be-acquired lock is either
       verified or created.
   - If a new edge needs to be created, the outgoing edges of the acquired locks are traversed
       to check for a cycle that reaches the lock to be acquired. If no cycle is detected, a new
       "safe" edge is created.
   - If a cycle is detected, an "unsafe" (cyclic) edge is created to represent a potential
       deadlock situation, and the appropriate Policy is executed.
 


 
Note that detection of potential deadlock does not necessarily indicate that deadlock will
 happen, as it is possible that higher level application logic prevents the cyclic lock
 acquisition from occurring. One example of a false positive is:

 

```

 LockA -> LockB -> LockC
 LockA -> LockC -> LockB
 
```


 
**ReadWriteLocks**

 
While ReadWriteLock instances have different properties and can form cycles without
 potential deadlock, this class treats ReadWriteLock instances as equivalent to
 traditional exclusive locks. Although this increases the false positives that the locks detect
 (i.e. cycles that will not actually result in deadlock), it simplifies the algorithm and
 implementation considerably. The assumption is that a user of this factory wishes to eliminate
 any cyclic acquisition ordering.

 
**Explicit Lock Acquisition Ordering**

 
The CycleDetectingLockFactory.WithExplicitOrdering class can be used to enforce an
 application-specific ordering in addition to performing general cycle detection.

 
**Garbage Collection**

 
In order to allow proper garbage collection of unused locks, the edges of the lock graph are
 weak references.

 
**Performance**

 
The extra bookkeeping done by cycle detecting locks comes at some cost to performance.
 Benchmarks (as of December 2011) show that:

 

   - for an unnested lock() and unlock(), a cycle detecting lock takes 38ns as
       opposed to the 24ns taken by a plain lock.
   - for nested locking, the cost increases with the depth of the nesting:
       

         - 2 levels: average of 64ns per lock()/unlock()
         - 3 levels: average of 77ns per lock()/unlock()
         - 4 levels: average of 99ns per lock()/unlock()
         - 5 levels: average of 103ns per lock()/unlock()
         - 10 levels: average of 184ns per lock()/unlock()
         - 20 levels: average of 393ns per lock()/unlock()
       

 


 
As such, the CycleDetectingLockFactory may not be suitable for performance-critical
 applications which involve tightly-looped or deeply-nested locking algorithms.

## Fields

### `lockGraphNodesPerType`

**Type:** `java.util.concurrent.ConcurrentMap<java.lang.Class<? extends java.lang.Enum<?>>,java.util.Map<? extends java.lang.Enum<?>,com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode>>`

### `logger`

**Type:** [`com.google.common.util.concurrent.LazyLogger`](./LazyLogger.md)

### `policy`

**Type:** `com.google.common.util.concurrent.CycleDetectingLockFactory.Policy`

### `acquiredLocks`

**Type:** `java.lang.ThreadLocal<java.util.ArrayList<com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode>>`

## Constructors

### `<init>(CycleDetectingLockFactory.Policy policy)`

**Parameters:**
- `policy` (`com.google.common.util.concurrent.CycleDetectingLockFactory.Policy`)

## Methods

### `newInstance(CycleDetectingLockFactory.Policy policy)`

**Parameters:**
- `policy` (`com.google.common.util.concurrent.CycleDetectingLockFactory.Policy`)

**Returns:** [`com.google.common.util.concurrent.CycleDetectingLockFactory`](./CycleDetectingLockFactory.md)

### `newReentrantLock(String lockName)`

**Parameters:**
- `lockName` (`java.lang.String`)

**Returns:** `java.util.concurrent.locks.ReentrantLock`

### `newReentrantLock(String lockName, boolean fair)`

The lockName is used in
 the warning or exception output to help identify the locks involved in the detected deadlock.

**Parameters:**
- `lockName` (`java.lang.String`)
- `fair` (`boolean`)

**Returns:** `java.util.concurrent.locks.ReentrantLock`

### `newReentrantReadWriteLock(String lockName)`

**Parameters:**
- `lockName` (`java.lang.String`)

**Returns:** `java.util.concurrent.locks.ReentrantReadWriteLock`

### `newReentrantReadWriteLock(String lockName, boolean fair)`

The lockName
 is used in the warning or exception output to help identify the locks involved in the detected
 deadlock.

**Parameters:**
- `lockName` (`java.lang.String`)
- `fair` (`boolean`)

**Returns:** `java.util.concurrent.locks.ReentrantReadWriteLock`

### `newInstanceWithExplicitOrdering(Class<E> enumClass, CycleDetectingLockFactory.Policy policy)`

**Parameters:**
- `enumClass` (`java.lang.Class<E>`)
- `policy` (`com.google.common.util.concurrent.CycleDetectingLockFactory.Policy`)

**Returns:** `com.google.common.util.concurrent.CycleDetectingLockFactory.WithExplicitOrdering<E>`

### `getOrCreateNodes(Class<E> clazz)`

**Parameters:**
- `clazz` (`java.lang.Class<E>`)

**Returns:** `java.util.Map<? extends E,com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode>`

### `createNodes(Class<E> clazz)`

**Parameters:**
- `clazz` (`java.lang.Class<E>`)

**Returns:** `java.util.Map<E,com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode>`

### `getLockName(Enum<?> rank)`

**Parameters:**
- `rank` (`java.lang.Enum<?>`)

**Returns:** `java.lang.String`

### `aboutToAcquire(CycleDetectingLockFactory.CycleDetectingLock lock)`

**Parameters:**
- `lock` (`com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock`)

**Returns:** `void`

### `lockStateChanged(CycleDetectingLockFactory.CycleDetectingLock lock)`

Failure to do so can
 result in corrupting the acquireLocks set.

**Parameters:**
- `lock` (`com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock`)

**Returns:** `void`

