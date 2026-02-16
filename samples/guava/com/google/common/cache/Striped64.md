# Class: `Striped64`

**Package:** [`com.google.common.cache`](README.md)

**Fully Qualified Name:** `com.google.common.cache.Striped64`

**Extends:** `java.lang.Number`

## Description

A package-local class holding common representation and mechanics for classes supporting dynamic
 striping on 64bit values. The class extends Number so that concrete subclasses must publicly do
 so.

## Fields

### `threadHashCode`

**Type:** `java.lang.ThreadLocal<int @org.checkerframework.checker.nullness.qual.Nullable []>`

ThreadLocal holding a single-slot int array holding hash code. Unlike the JDK8 version of this
 class, we use a suboptimal int[] representation to avoid introducing a new type that can impede
 class-unloading when ThreadLocals are not removed.

### `rng`

**Type:** [`java.util.Random`](../../../../java/util/Random.md)

Generator of new random hash codes

### `NCPU`

**Type:** `int`

Number of CPUS, to place bound on table size

### `cells`

**Type:** [`com.google.common.cache.Striped64.Cell[]`](Striped64/Cell.md)

Table of cells. When non-null, size is a power of 2.

### `base`

**Type:** `long`

Base value, used mainly when there is no contention, but also as a fallback during table
 initialization races. Updated via CAS.

### `busy`

**Type:** `int`

Spinlock (locked via CAS) used when resizing and/or creating Cells.

### `UNSAFE`

**Type:** [`sun.misc.Unsafe`](../../../../sun/misc/Unsafe.md)

### `baseOffset`

**Type:** `long`

### `busyOffset`

**Type:** `long`

## Constructors

### `<init>()`

Package-private default constructor

## Methods

### `casBase(`long` cmp, `long` val)`

**Returns:** `boolean`

CASes the base field.

### `casBusy()`

**Returns:** `boolean`

CASes the busy field from 0 to 1 to acquire lock.

### `fn(`long` currentValue, `long` newValue)`

**Returns:** `long`

Computes the function of current and new value. Subclasses should open-code this update
 function for most uses, but the virtualized form is needed within retryUpdate.
@param currentValue the current value (of either base or a cell)
@param newValue the argument from a user update call
@return result of the update function

### `retryUpdate(`long` x, `int[]` hc, `boolean` wasUncontended)`

**Returns:** `void`

Handles cases of updates involving initialization, resizing, creating new Cells, and/or
 contention. See above for explanation. This method suffers the usual non-modularity problems of
 optimistic retry code, relying on rechecked sets of reads.
@param x the value
@param hc the hash code holder
@param wasUncontended false if CAS failed before call

### `internalReset(`long` initialValue)`

**Returns:** `void`

Sets base and all cells to the given value.

### `getUnsafe()`

**Returns:** [`sun.misc.Unsafe`](../../../../sun/misc/Unsafe.md)

Returns a sun.misc.Unsafe. Suitable for use in a 3rd party package. Replace with a simple call
 to Unsafe.getUnsafe when integrating into a jdk.
@return a sun.misc.Unsafe

