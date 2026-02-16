# Class: `AtomicDoubleArray`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.AtomicDoubleArray`

**Implements:** [`java.io.Serializable`](../../../../../java/io/Serializable.md)

## Description

A {@code double} array in which elements may be updated atomically. See the {@link java.util.concurrent.atomic} package specification for description of the properties of atomic
 variables.

 <p><a id="bitEquals"></a>This class compares primitive {@code double} values in methods such as
 {@link #compareAndSet} by comparing their bitwise representation using {@link Double#doubleToRawLongBits}, which differs from both the primitive double {@code ==} operator and
 from {@link Double#equals}, as if implemented by:

 <pre>{@code
 static boolean bitEquals(double x, double y) {
   long xBits = Double.doubleToRawLongBits(x);
   long yBits = Double.doubleToRawLongBits(y);
   return xBits == yBits;
 }
 }</pre>
@author Doug Lea
@author Martin Buchholz
@since 11.0

## Fields

### `serialVersionUID`

**Type:** `long`

### `longs`

**Type:** [`java.util.concurrent.atomic.AtomicLongArray`](../../../../../java/util/concurrent/atomic/AtomicLongArray.md)

## Constructors

### `<init>(`int` length)`

Creates a new {@code AtomicDoubleArray} of the given length, with all elements initially zero.
@param length the length of the array

### `<init>(`double[]` array)`

Creates a new {@code AtomicDoubleArray} with the same length as, and all elements copied from,
 the given array.
@param array the array to copy elements from
@throws NullPointerException if array is null

## Methods

### `length()`

**Returns:** `int`

Returns the length of the array.
@return the length of the array

### `get(`int` i)`

**Returns:** `double`

Gets the current value at position {@code i}.
@param i the index
@return the current value

### `set(`int` i, `double` newValue)`

**Returns:** `void`

Atomically sets the element at position {@code i} to the given value.
@param i the index
@param newValue the new value

### `lazySet(`int` i, `double` newValue)`

**Returns:** `void`

Eventually sets the element at position {@code i} to the given value.
@param i the index
@param newValue the new value

### `getAndSet(`int` i, `double` newValue)`

**Returns:** `double`

Atomically sets the element at position {@code i} to the given value and returns the old value.
@param i the index
@param newValue the new value
@return the previous value

### `compareAndSet(`int` i, `double` expect, `double` update)`

**Returns:** `boolean`

Atomically sets the element at position {@code i} to the given updated value if the current
 value is <a href="#bitEquals">bitwise equal</a> to the expected value.
@param i the index
@param expect the expected value
@param update the new value
@return true if successful. False return indicates that the actual value was not equal to the
     expected value.

### `weakCompareAndSet(`int` i, `double` expect, `double` update)`

**Returns:** `boolean`

Atomically sets the element at position {@code i} to the given updated value if the current
 value is <a href="#bitEquals">bitwise equal</a> to the expected value.

 <p>May <a href="http://download.oracle.com/javase/7/docs/api/java/util/concurrent/atomic/package-summary.html#Spurious">
 fail spuriously</a> and does not provide ordering guarantees, so is only rarely an appropriate
 alternative to {@code compareAndSet}.
@param i the index
@param expect the expected value
@param update the new value
@return true if successful

### `getAndAdd(`int` i, `double` delta)`

**Returns:** `double`

Atomically adds the given value to the element at index {@code i}.
@param i the index
@param delta the value to add
@return the previous value

### `addAndGet(`int` i, `double` delta)`

**Returns:** `double`

Atomically adds the given value to the element at index {@code i}.
@param i the index
@param delta the value to add
@return the updated value

### `getAndAccumulate(`int` i, `double` x, [`java.util.function.DoubleBinaryOperator`](../../../../../java/util/function/DoubleBinaryOperator.md) accumulatorFunction)`

**Returns:** `double`

Atomically updates the element at index {@code i} with the results of applying the given
 function to the current and given values.
@param i the index to update
@param x the update value
@param accumulatorFunction the accumulator function
@return the previous value
@since 31.1

### `accumulateAndGet(`int` i, `double` x, [`java.util.function.DoubleBinaryOperator`](../../../../../java/util/function/DoubleBinaryOperator.md) accumulatorFunction)`

**Returns:** `double`

Atomically updates the element at index {@code i} with the results of applying the given
 function to the current and given values.
@param i the index to update
@param x the update value
@param accumulatorFunction the accumulator function
@return the updated value
@since 31.1

### `getAndUpdate(`int` i, [`java.util.function.DoubleUnaryOperator`](../../../../../java/util/function/DoubleUnaryOperator.md) updaterFunction)`

**Returns:** `double`

Atomically updates the element at index {@code i} with the results of applying the given
 function to the current value.
@param i the index to update
@param updaterFunction the update function
@return the previous value
@since 31.1

### `updateAndGet(`int` i, [`java.util.function.DoubleUnaryOperator`](../../../../../java/util/function/DoubleUnaryOperator.md) updaterFunction)`

**Returns:** `double`

Atomically updates the element at index {@code i} with the results of applying the given
 function to the current value.
@param i the index to update
@param updaterFunction the update function
@return the updated value
@since 31.1

### `toString()`

**Returns:** `java.lang.String`

Returns the String representation of the current values of array.
@return the String representation of the current values of array

### `writeObject([`java.io.ObjectOutputStream`](../../../../../java/io/ObjectOutputStream.md) s)`

**Returns:** `void`

Saves the state to a stream (that is, serializes it).
@serialData The length of the array is emitted (int), followed by all of its elements (each a
     {@code double}) in the proper order.

### `readObject([`java.io.ObjectInputStream`](../../../../../java/io/ObjectInputStream.md) s)`

**Returns:** `void`

Reconstitutes the instance from a stream (that is, deserializes it).

