# Class: `Striped64`

**Package:** [`com.google.common.cache`](README.md)

**Fully Qualified Name:** `com.google.common.cache.Striped64`

**Extends:** `java.lang.Number`

## Description

The class extends Number so that concrete subclasses must publicly do
 so.

## Fields

### `threadHashCode`

**Type:** `java.lang.ThreadLocal<int @org.checkerframework.checker.nullness.qual.Nullable []>`

Unlike the JDK8 version of this
 class, we use a suboptimal int[] representation to avoid introducing a new type that can impede
 class-unloading when ThreadLocals are not removed.

### `rng`

**Type:** `java.util.Random`

### `NCPU`

**Type:** `int`

### `cells`

**Type:** `com.google.common.cache.Striped64.Cell[]`

When non-null, size is a power of 2.

### `base`

**Type:** `long`

Updated via CAS.

### `busy`

**Type:** `int`

### `UNSAFE`

**Type:** `sun.misc.Unsafe`

### `baseOffset`

**Type:** `long`

### `busyOffset`

**Type:** `long`

## Constructors

### `<init>()`

## Methods

### `casBase(long cmp, long val)`

**Returns:** `boolean`

**Parameters:**
- `cmp` (`long`)
- `val` (`long`)

### `casBusy()`

**Returns:** `boolean`

### `fn(long currentValue, long newValue)`

**Returns:** `long`

Subclasses should open-code this update
 function for most uses, but the virtualized form is needed within retryUpdate.

**Parameters:**
- `currentValue` (`long`): the current value (of either base or a cell)
- `newValue` (`long`): the argument from a user update call

### `retryUpdate(long x, int[] hc, boolean wasUncontended)`

**Returns:** `void`

See above for explanation. This method suffers the usual non-modularity problems of
 optimistic retry code, relying on rechecked sets of reads.

**Parameters:**
- `x` (`long`): the value
- `hc` (`int[]`): the hash code holder
- `wasUncontended` (`boolean`): false if CAS failed before call

### `internalReset(long initialValue)`

**Returns:** `void`

**Parameters:**
- `initialValue` (`long`)

### `getUnsafe()`

**Returns:** `sun.misc.Unsafe`

Suitable for use in a 3rd party package. Replace with a simple call
 to Unsafe.getUnsafe when integrating into a jdk.

