# Class: `Striped`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.Striped`

## Type Parameters

- `L` extends `java.lang.Object`

## Description

A striped {@code Lock/Semaphore/ReadWriteLock}. This offers the underlying lock striping similar
 to that of {@code ConcurrentHashMap} in a reusable form, and extends it for semaphores and
 read-write locks. Conceptually, lock striping is the technique of dividing a lock into many
 <i>stripes</i>, increasing the granularity of a single lock and allowing independent operations
 to lock different stripes and proceed concurrently, instead of creating contention for a single
 lock.

 <p>The guarantee provided by this class is that equal keys lead to the same lock (or semaphore),
 i.e. {@code if (key1.equals(key2))} then {@code striped.get(key1) == striped.get(key2)} (assuming
 {@link Object#hashCode()} is correctly implemented for the keys). Note that if {@code key1} is
 <strong>not</strong> equal to {@code key2}, it is <strong>not</strong> guaranteed that {@code
 striped.get(key1) != striped.get(key2)}; the elements might nevertheless be mapped to the same
 lock. The lower the number of stripes, the higher the probability of this happening.

 <p>There are three flavors of this class: {@code Striped<Lock>}, {@code Striped<Semaphore>}, and
 {@code Striped<ReadWriteLock>}. For each type, two implementations are offered: {@linkplain #lock(int) strong} and {@linkplain #lazyWeakLock(int) weak} {@code Striped<Lock>}, {@linkplain #semaphore(int, int) strong} and {@linkplain #lazyWeakSemaphore(int, int) weak} {@code
 Striped<Semaphore>}, and {@linkplain #readWriteLock(int) strong} and {@linkplain #lazyWeakReadWriteLock(int) weak} {@code Striped<ReadWriteLock>}. <i>Strong</i> means that all
 stripes (locks/semaphores) are initialized eagerly, and are not reclaimed unless {@code Striped}
 itself is reclaimable. <i>Weak</i> means that locks/semaphores are created lazily, and they are
 allowed to be reclaimed if nobody is holding on to them. This is useful, for example, if one
 wants to create a {@code Striped<Lock>} of many locks, but worries that in most cases only a
 small portion of these would be in use.

 <p>Prior to this class, one might be tempted to use {@code Map<K, Lock>}, where {@code K}
 represents the task. This maximizes concurrency by having each unique key mapped to a unique
 lock, but also maximizes memory footprint. On the other extreme, one could use a single lock for
 all tasks, which minimizes memory footprint but also minimizes concurrency. Instead of choosing
 either of these extremes, {@code Striped} allows the user to trade between required concurrency
 and memory footprint. For example, if a set of tasks are CPU-bound, one could easily create a
 very compact {@code Striped<Lock>} of {@code availableProcessors() * 4} stripes, instead of
 possibly thousands of locks which could be created in a {@code Map<K, Lock>} structure.
@author Dimitris Andreou
@since 13.0

## Fields

### `LARGE_LAZY_CUTOFF`

**Type:** `int`

If there are at least this many stripes, we assume the memory usage of a ConcurrentMap will be
 smaller than a large array. (This assumes that in the lazy case, most stripes are unused. As
 always, if many stripes are in use, a non-lazy striped makes more sense.)

### `ALL_SET`

**Type:** `int`

A bit mask were all bits are set.

## Constructors

### `<init>()`

## Methods

### `get(`java.lang.Object` key)`

**Returns:** [`L`](L.md)

Returns the stripe that corresponds to the passed key. It is always guaranteed that if {@code
 key1.equals(key2)}, then {@code get(key1) == get(key2)}.
@param key an arbitrary, non-null key
@return the stripe that the passed key corresponds to

### `getAt(`int` index)`

**Returns:** [`L`](L.md)

Returns the stripe at the specified index. Valid indexes are 0, inclusively, to {@code size()},
 exclusively.
@param index the index of the stripe to return; must be in {@code [0...size())}
@return the stripe at the specified index

### `indexFor(`java.lang.Object` key)`

**Returns:** `int`

Returns the index to which the given key is mapped, so that getAt(indexFor(key)) == get(key).

### `size()`

**Returns:** `int`

Returns the total number of stripes in this instance.

### `bulkGet(`java.lang.Iterable<? extends java.lang.Object>` keys)`

**Returns:** `java.lang.Iterable<L>`

Returns the stripes that correspond to the passed objects, in ascending (as per {@link #getAt(int)}) order. Thus, threads that use the stripes in the order returned by this method
 are guaranteed to not deadlock each other.

 <p>It should be noted that using a {@code Striped<L>} with relatively few stripes, and {@code
 bulkGet(keys)} with a relative large number of keys can cause an excessive number of shared
 stripes (much like the birthday paradox, where much fewer than anticipated birthdays are needed
 for a pair of them to match). Please consider carefully the implications of the number of
 stripes, the intended concurrency level, and the typical number of keys used in a {@code
 bulkGet(keys)} operation. See <a href="http://www.mathpages.com/home/kmath199.htm">Balls in
 Bins model</a> for mathematical formulas that can be used to estimate the probability of
 collisions.
@param keys arbitrary non-null keys
@return the stripes corresponding to the objects (one per each object, derived by delegating to
     {@link #get(Object)}; may contain duplicates), in an increasing index order.

### `custom(`int` stripes, [`com.google.common.base.Supplier<L>`](../../base/Supplier.md) supplier)`

**Returns:** [`com.google.common.util.concurrent.Striped<L>`](./Striped.md)

Creates a {@code Striped<L>} with eagerly initialized, strongly referenced locks. Every lock is
 obtained from the passed supplier.
@param stripes the minimum number of stripes (locks) required
@param supplier a {@code Supplier<L>} object to obtain locks from
@return a new {@code Striped<L>}

### `lock(`int` stripes)`

**Returns:** [`com.google.common.util.concurrent.Striped<java.util.concurrent.locks.Lock>`](./Striped.md)

Creates a {@code Striped<Lock>} with eagerly initialized, strongly referenced locks. Every lock
 is reentrant.
@param stripes the minimum number of stripes (locks) required
@return a new {@code Striped<Lock>}

### `lazyWeakLock(`int` stripes)`

**Returns:** [`com.google.common.util.concurrent.Striped<java.util.concurrent.locks.Lock>`](./Striped.md)

Creates a {@code Striped<Lock>} with lazily initialized, weakly referenced locks. Every lock is
 reentrant.
@param stripes the minimum number of stripes (locks) required
@return a new {@code Striped<Lock>}

### `lazy(`int` stripes, [`com.google.common.base.Supplier<L>`](../../base/Supplier.md) supplier)`

**Returns:** [`com.google.common.util.concurrent.Striped<L>`](./Striped.md)

### `semaphore(`int` stripes, `int` permits)`

**Returns:** [`com.google.common.util.concurrent.Striped<java.util.concurrent.Semaphore>`](./Striped.md)

Creates a {@code Striped<Semaphore>} with eagerly initialized, strongly referenced semaphores,
 with the specified number of permits.
@param stripes the minimum number of stripes (semaphores) required
@param permits the number of permits in each semaphore
@return a new {@code Striped<Semaphore>}

### `lazyWeakSemaphore(`int` stripes, `int` permits)`

**Returns:** [`com.google.common.util.concurrent.Striped<java.util.concurrent.Semaphore>`](./Striped.md)

Creates a {@code Striped<Semaphore>} with lazily initialized, weakly referenced semaphores,
 with the specified number of permits.
@param stripes the minimum number of stripes (semaphores) required
@param permits the number of permits in each semaphore
@return a new {@code Striped<Semaphore>}

### `readWriteLock(`int` stripes)`

**Returns:** [`com.google.common.util.concurrent.Striped<java.util.concurrent.locks.ReadWriteLock>`](./Striped.md)

Creates a {@code Striped<ReadWriteLock>} with eagerly initialized, strongly referenced
 read-write locks. Every lock is reentrant.
@param stripes the minimum number of stripes (locks) required
@return a new {@code Striped<ReadWriteLock>}

### `lazyWeakReadWriteLock(`int` stripes)`

**Returns:** [`com.google.common.util.concurrent.Striped<java.util.concurrent.locks.ReadWriteLock>`](./Striped.md)

Creates a {@code Striped<ReadWriteLock>} with lazily initialized, weakly referenced read-write
 locks. Every lock is reentrant.
@param stripes the minimum number of stripes (locks) required
@return a new {@code Striped<ReadWriteLock>}

### `ceilToPowerOfTwo(`int` x)`

**Returns:** `int`

### `smear(`int` hashCode)`

**Returns:** `int`

