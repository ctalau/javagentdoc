# Class: `AtomicDouble`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.AtomicDouble`

**Extends:** `java.lang.Number`

**Implements:** `java.io.Serializable`

## Description

A `double` value that may be updated atomically. See the `java.util.concurrent.atomic` package specification for description of the properties of atomic
 variables. An `AtomicDouble` is used in applications such as atomic accumulation, and
 cannot be used as a replacement for a `Double`. However, this class does extend `Number` to allow uniform access by tools and utilities that deal with numerically-based classes.

 <p><a id="bitEquals"></a>This class compares primitive `double` values in methods such as
 `compareAndSet` by comparing their bitwise representation using `Double.doubleToRawLongBits`, which differs from both the primitive double `==` operator and
 from `Double.equals`, as if implemented by:

 <pre>`static boolean bitEquals(double x, double y) {
   long xBits = Double.doubleToRawLongBits(x);
   long yBits = Double.doubleToRawLongBits(y);
   return xBits == yBits;
 `
 }</pre>

 <p>It is possible to write a more scalable updater, at the cost of giving up strict atomicity.
 See for example <a href="http://gee.cs.oswego.edu/dl/jsr166/dist/docs/java.base/java/util/concurrent/atomic/DoubleAdder.html">
 DoubleAdder</a>.
**Author:** Doug Lea
**Author:** Martin Buchholz
**Since:** 11.0

## Fields

### `serialVersionUID`

**Type:** `long`

### `value`

**Type:** `long`

### `updater`

**Type:** `java.util.concurrent.atomic.AtomicLongFieldUpdater<com.google.common.util.concurrent.AtomicDouble>`

## Constructors

### `<init>(`double` initialValue)`

Creates a new `AtomicDouble` with the given initial value.
@param initialValue the initial value

### `<init>()`

Creates a new `AtomicDouble` with initial value `0.0`.

## Methods

### `get()`

**Returns:** `double`

Gets the current value.
@return the current value

### `set(`double` newValue)`

**Returns:** `void`

Sets to the given value.
@param newValue the new value

### `lazySet(`double` newValue)`

**Returns:** `void`

Eventually sets to the given value.
@param newValue the new value

### `getAndSet(`double` newValue)`

**Returns:** `double`

Atomically sets to the given value and returns the old value.
@param newValue the new value
@return the previous value

### `compareAndSet(`double` expect, `double` update)`

**Returns:** `boolean`

Atomically sets the value to the given updated value if the current value is <a href="#bitEquals">bitwise equal</a> to the expected value.
@param expect the expected value
@param update the new value
@return `true` if successful. False return indicates that the actual value was not
     bitwise equal to the expected value.

### `weakCompareAndSet(`double` expect, `double` update)`

**Returns:** `boolean`

Atomically sets the value to the given updated value if the current value is <a href="#bitEquals">bitwise equal</a> to the expected value.

 <p>May <a href="http://download.oracle.com/javase/7/docs/api/java/util/concurrent/atomic/package-summary.html#Spurious">
 fail spuriously</a> and does not provide ordering guarantees, so is only rarely an appropriate
 alternative to `compareAndSet`.
@param expect the expected value
@param update the new value
@return `true` if successful

### `getAndAdd(`double` delta)`

**Returns:** `double`

Atomically adds the given value to the current value.
@param delta the value to add
@return the previous value

### `addAndGet(`double` delta)`

**Returns:** `double`

Atomically adds the given value to the current value.
@param delta the value to add
@return the updated value

### `getAndAccumulate(`double` x, `java.util.function.DoubleBinaryOperator` accumulatorFunction)`

**Returns:** `double`

Atomically updates the current value with the results of applying the given function to the
 current and given values.
@param x the update value
@param accumulatorFunction the accumulator function
@return the previous value
**Since:** 31.1

### `accumulateAndGet(`double` x, `java.util.function.DoubleBinaryOperator` accumulatorFunction)`

**Returns:** `double`

Atomically updates the current value with the results of applying the given function to the
 current and given values.
@param x the update value
@param accumulatorFunction the accumulator function
@return the updated value
**Since:** 31.1

### `getAndUpdate(`java.util.function.DoubleUnaryOperator` updateFunction)`

**Returns:** `double`

Atomically updates the current value with the results of applying the given function.
@param updateFunction the update function
@return the previous value
**Since:** 31.1

### `updateAndGet(`java.util.function.DoubleUnaryOperator` updateFunction)`

**Returns:** `double`

Atomically updates the current value with the results of applying the given function.
@param updateFunction the update function
@return the updated value
**Since:** 31.1

### `toString()`

**Returns:** `java.lang.String`

Returns the String representation of the current value.
@return the String representation of the current value

### `intValue()`

**Returns:** `int`

Returns the value of this `AtomicDouble` as an `int` after a narrowing primitive
 conversion.

### `longValue()`

**Returns:** `long`

Returns the value of this `AtomicDouble` as a `long` after a narrowing primitive
 conversion.

### `floatValue()`

**Returns:** `float`

Returns the value of this `AtomicDouble` as a `float` after a narrowing primitive
 conversion.

### `doubleValue()`

**Returns:** `double`

Returns the value of this `AtomicDouble` as a `double`.

### `writeObject(`java.io.ObjectOutputStream` s)`

**Returns:** `void`

Saves the state to a stream (that is, serializes it).
@serialData The current value is emitted (a `double`).

### `readObject(`java.io.ObjectInputStream` s)`

**Returns:** `void`

Reconstitutes the instance from a stream (that is, deserializes it).

