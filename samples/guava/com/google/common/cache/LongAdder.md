# Class: `LongAdder`

**Package:** [`com.google.common.cache`](README.md)

**Fully Qualified Name:** `com.google.common.cache.LongAdder`

**Extends:** [`com.google.common.cache.Striped64`](./Striped64.md)

**Implements:** `java.io.Serializable`, [`com.google.common.cache.LongAddable`](./LongAddable.md)

## Description

When updates
 (method #add) are contended across threads, the set of variables may grow dynamically to
 reduce contention. Method #sum (or, equivalently, #longValue) returns the current
 total combined across the variables maintaining the sum.

 
This class is usually preferable to AtomicLong when multiple threads update a common
 sum that is used for purposes such as collecting statistics, not for fine-grained synchronization
 control. Under low update contention, the two classes have similar characteristics. But under
 high contention, expected throughput of this class is significantly higher, at the expense of
 higher space consumption.

 
This class extends Number, but does *not* define methods such as 
 equals, hashCode and compareTo because instances are expected to be mutated, and
 so are not useful as collection keys.

 
*jsr166e note: This class is targeted to be placed in java.util.concurrent.atomic.*

## Fields

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>()`

## Methods

### `fn(long v, long x)`

**Parameters:**
- `v` (`long`)
- `x` (`long`)

**Returns:** `long`

### `add(long x)`

**Parameters:**
- `x` (`long`): the value to add

**Returns:** `void`

### `increment()`

**Returns:** `void`

### `decrement()`

**Returns:** `void`

### `sum()`

The returned value is *NOT* an atomic snapshot; invocation in
 the absence of concurrent updates returns an accurate result, but concurrent updates that occur
 while the sum is being calculated might not be incorporated.

**Returns:** `long`

### `reset()`

This method may be a useful alternative to
 creating a new adder, but is only effective if there are no concurrent updates. Because this
 method is intrinsically racy, it should only be used when it is known that no threads are
 concurrently updating.

**Returns:** `void`

### `sumThenReset()`

This method may apply for
 example during quiescent points between multithreaded computations. If there are updates
 concurrent with this method, the returned value is *not* guaranteed to be the final
 value occurring before the reset.

**Returns:** `long`

### `toString()`

**Returns:** `java.lang.String`

### `longValue()`

**Returns:** `long`

### `intValue()`

**Returns:** `int`

### `floatValue()`

**Returns:** `float`

### `doubleValue()`

**Returns:** `double`

### `writeObject(ObjectOutputStream s)`

**Parameters:**
- `s` (`java.io.ObjectOutputStream`)

**Returns:** `void`

### `readObject(ObjectInputStream s)`

**Parameters:**
- `s` (`java.io.ObjectInputStream`)

**Returns:** `void`

