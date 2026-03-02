# Class: `Striped`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.Striped`

## Type Parameters

- `L` extends `java.lang.Object`

## Description

This offers the underlying lock striping similar
 to that of ConcurrentHashMap in a reusable form, and extends it for semaphores and
 read-write locks. Conceptually, lock striping is the technique of dividing a lock into many
 *stripes*, increasing the granularity of a single lock and allowing independent operations
 to lock different stripes and proceed concurrently, instead of creating contention for a single
 lock.

 
The guarantee provided by this class is that equal keys lead to the same lock (or semaphore),
 i.e. if (key1.equals(key2)) then striped.get(key1) == striped.get(key2) (assuming
 Object#hashCode() is correctly implemented for the keys). Note that if key1 is
 **not** equal to key2, it is **not** guaranteed that 
 striped.get(key1) != striped.get(key2); the elements might nevertheless be mapped to the same
 lock. The lower the number of stripes, the higher the probability of this happening.

 
There are three flavors of this class: Striped<Lock>, Striped<Semaphore>, and
 Striped<ReadWriteLock>. For each type, two implementations are offered: strong and weak Striped<Lock>, strong and weak 
 Striped<Semaphore>, and strong and weak Striped<ReadWriteLock>. *Strong* means that all
 stripes (locks/semaphores) are initialized eagerly, and are not reclaimed unless Striped
 itself is reclaimable. *Weak* means that locks/semaphores are created lazily, and they are
 allowed to be reclaimed if nobody is holding on to them. This is useful, for example, if one
 wants to create a Striped<Lock> of many locks, but worries that in most cases only a
 small portion of these would be in use.

 
Prior to this class, one might be tempted to use Map<K, Lock>, where K
 represents the task. This maximizes concurrency by having each unique key mapped to a unique
 lock, but also maximizes memory footprint. On the other extreme, one could use a single lock for
 all tasks, which minimizes memory footprint but also minimizes concurrency. Instead of choosing
 either of these extremes, Striped allows the user to trade between required concurrency
 and memory footprint. For example, if a set of tasks are CPU-bound, one could easily create a
 very compact Striped<Lock> of availableProcessors() * 4 stripes, instead of
 possibly thousands of locks which could be created in a Map<K, Lock> structure.

## Fields

### `LARGE_LAZY_CUTOFF`

**Type:** `int`

(This assumes that in the lazy case, most stripes are unused. As
 always, if many stripes are in use, a non-lazy striped makes more sense.)

### `ALL_SET`

**Type:** `int`

## Constructors

### `<init>()`

## Methods

### `get(java.lang.Object key)`

**Returns:** `L`

It is always guaranteed that if 
 key1.equals(key2), then get(key1) == get(key2).

**Parameters:**
- `key` (`java.lang.Object`): an arbitrary, non-null key

### `getAt(int index)`

**Returns:** `L`

Valid indexes are 0, inclusively, to size(),
 exclusively.

**Parameters:**
- `index` (`int`): the index of the stripe to return; must be in [0...size())

### `indexFor(java.lang.Object key)`

**Returns:** `int`

**Parameters:**
- `key` (`java.lang.Object`)

### `size()`

**Returns:** `int`

### `bulkGet(java.lang.Iterable<? extends java.lang.Object> keys)`

**Returns:** `java.lang.Iterable<L>`

Thus, threads that use the stripes in the order returned by this method
 are guaranteed to not deadlock each other.

 
It should be noted that using a Striped<L> with relatively few stripes, and 
 bulkGet(keys) with a relative large number of keys can cause an excessive number of shared
 stripes (much like the birthday paradox, where much fewer than anticipated birthdays are needed
 for a pair of them to match). Please consider carefully the implications of the number of
 stripes, the intended concurrency level, and the typical number of keys used in a 
 bulkGet(keys) operation. See [Balls in
 Bins model](http://www.mathpages.com/home/kmath199.htm) for mathematical formulas that can be used to estimate the probability of
 collisions.

**Parameters:**
- `keys` (`java.lang.Iterable<? extends java.lang.Object>`): arbitrary non-null keys

### `custom(int stripes, com.google.common.base.Supplier<L> supplier)`

**Returns:** [`com.google.common.util.concurrent.Striped<L>`](./Striped.md)

Every lock is
 obtained from the passed supplier.

**Parameters:**
- `stripes` (`int`): the minimum number of stripes (locks) required
- `supplier` ([`com.google.common.base.Supplier<L>`](../../base/Supplier.md)): a Supplier<L> object to obtain locks from

### `lock(int stripes)`

**Returns:** [`com.google.common.util.concurrent.Striped<java.util.concurrent.locks.Lock>`](./Striped.md)

Every lock
 is reentrant.

**Parameters:**
- `stripes` (`int`): the minimum number of stripes (locks) required

### `lazyWeakLock(int stripes)`

**Returns:** [`com.google.common.util.concurrent.Striped<java.util.concurrent.locks.Lock>`](./Striped.md)

Every lock is
 reentrant.

**Parameters:**
- `stripes` (`int`): the minimum number of stripes (locks) required

### `lazy(int stripes, com.google.common.base.Supplier<L> supplier)`

**Returns:** [`com.google.common.util.concurrent.Striped<L>`](./Striped.md)

**Parameters:**
- `stripes` (`int`)
- `supplier` ([`com.google.common.base.Supplier<L>`](../../base/Supplier.md))

### `semaphore(int stripes, int permits)`

**Returns:** [`com.google.common.util.concurrent.Striped<java.util.concurrent.Semaphore>`](./Striped.md)

**Parameters:**
- `stripes` (`int`): the minimum number of stripes (semaphores) required
- `permits` (`int`): the number of permits in each semaphore

### `lazyWeakSemaphore(int stripes, int permits)`

**Returns:** [`com.google.common.util.concurrent.Striped<java.util.concurrent.Semaphore>`](./Striped.md)

**Parameters:**
- `stripes` (`int`): the minimum number of stripes (semaphores) required
- `permits` (`int`): the number of permits in each semaphore

### `readWriteLock(int stripes)`

**Returns:** [`com.google.common.util.concurrent.Striped<java.util.concurrent.locks.ReadWriteLock>`](./Striped.md)

Every lock is reentrant.

**Parameters:**
- `stripes` (`int`): the minimum number of stripes (locks) required

### `lazyWeakReadWriteLock(int stripes)`

**Returns:** [`com.google.common.util.concurrent.Striped<java.util.concurrent.locks.ReadWriteLock>`](./Striped.md)

Every lock is reentrant.

**Parameters:**
- `stripes` (`int`): the minimum number of stripes (locks) required

### `ceilToPowerOfTwo(int x)`

**Returns:** `int`

**Parameters:**
- `x` (`int`)

### `smear(int hashCode)`

**Returns:** `int`

**Parameters:**
- `hashCode` (`int`)

