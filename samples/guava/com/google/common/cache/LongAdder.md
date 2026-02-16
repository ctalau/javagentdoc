# Class: `LongAdder`

**Package:** [`com.google.common.cache`](README.md)

**Fully Qualified Name:** `com.google.common.cache.LongAdder`

**Extends:** [`com.google.common.cache.Striped64`](./Striped64.md)

**Implements:** [`java.io.Serializable`](../../../../java/io/Serializable.md), [`com.google.common.cache.LongAddable`](./LongAddable.md)

## Description

One or more variables that together maintain an initially zero {@code long} sum. When updates
 (method {@link #add}) are contended across threads, the set of variables may grow dynamically to
 reduce contention. Method {@link #sum} (or, equivalently, {@link #longValue}) returns the current
 total combined across the variables maintaining the sum.

 <p>This class is usually preferable to {@link AtomicLong} when multiple threads update a common
 sum that is used for purposes such as collecting statistics, not for fine-grained synchronization
 control. Under low update contention, the two classes have similar characteristics. But under
 high contention, expected throughput of this class is significantly higher, at the expense of
 higher space consumption.

 <p>This class extends {@link Number}, but does <em>not</em> define methods such as {@code
 equals}, {@code hashCode} and {@code compareTo} because instances are expected to be mutated, and
 so are not useful as collection keys.

 <p><em>jsr166e note: This class is targeted to be placed in java.util.concurrent.atomic.</em>
@since 1.8
@author Doug Lea

## Fields

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>()`

Creates a new adder with initial sum of zero.

## Methods

### `fn(`long` v, `long` x)`

**Returns:** `long`

Version of plus for use in retryUpdate

### `add(`long` x)`

**Returns:** `void`

Adds the given value.
@param x the value to add

### `increment()`

**Returns:** `void`

Equivalent to {@code add(1)}.

### `decrement()`

**Returns:** `void`

Equivalent to {@code add(-1)}.

### `sum()`

**Returns:** `long`

Returns the current sum. The returned value is <em>NOT</em> an atomic snapshot; invocation in
 the absence of concurrent updates returns an accurate result, but concurrent updates that occur
 while the sum is being calculated might not be incorporated.
@return the sum

### `reset()`

**Returns:** `void`

Resets variables maintaining the sum to zero. This method may be a useful alternative to
 creating a new adder, but is only effective if there are no concurrent updates. Because this
 method is intrinsically racy, it should only be used when it is known that no threads are
 concurrently updating.

### `sumThenReset()`

**Returns:** `long`

Equivalent in effect to {@link #sum} followed by {@link #reset}. This method may apply for
 example during quiescent points between multithreaded computations. If there are updates
 concurrent with this method, the returned value is <em>not</em> guaranteed to be the final
 value occurring before the reset.
@return the sum

### `toString()`

**Returns:** `java.lang.String`

Returns the String representation of the {@link #sum}.
@return the String representation of the {@link #sum}

### `longValue()`

**Returns:** `long`

Equivalent to {@link #sum}.
@return the sum

### `intValue()`

**Returns:** `int`

Returns the {@link #sum} as an {@code int} after a narrowing primitive conversion.

### `floatValue()`

**Returns:** `float`

Returns the {@link #sum} as a {@code float} after a widening primitive conversion.

### `doubleValue()`

**Returns:** `double`

Returns the {@link #sum} as a {@code double} after a widening primitive conversion.

### `writeObject([`java.io.ObjectOutputStream`](../../../../java/io/ObjectOutputStream.md) s)`

**Returns:** `void`

### `readObject([`java.io.ObjectInputStream`](../../../../java/io/ObjectInputStream.md) s)`

**Returns:** `void`

