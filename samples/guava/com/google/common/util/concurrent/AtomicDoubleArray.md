# Class: `AtomicDoubleArray`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.AtomicDoubleArray`

**Implements:** `java.io.Serializable`

## Description

See the java.util.concurrent.atomic package specification for description of the properties of atomic
 variables.

 
[]This class compares primitive double values in methods such as
 #compareAndSet by comparing their bitwise representation using Double#doubleToRawLongBits, which differs from both the primitive double == operator and
 from Double#equals, as if implemented by:

 

```

 static boolean bitEquals(double x, double y) {
   long xBits = Double.doubleToRawLongBits(x);
   long yBits = Double.doubleToRawLongBits(y);
   return xBits == yBits;
 }
 
```

## Fields

### `serialVersionUID`

**Type:** `long`

### `longs`

**Type:** `java.util.concurrent.atomic.AtomicLongArray`

## Constructors

### `<init>(int length)`

**Parameters:**
- `length` (`int`): the length of the array

### `<init>(double[] array)`

**Parameters:**
- `array` (`double[]`): the array to copy elements from

## Methods

### `length()`

**Returns:** `int`

### `get(int i)`

**Returns:** `double`

**Parameters:**
- `i` (`int`): the index

### `set(int i, double newValue)`

**Returns:** `void`

**Parameters:**
- `i` (`int`): the index
- `newValue` (`double`): the new value

### `lazySet(int i, double newValue)`

**Returns:** `void`

**Parameters:**
- `i` (`int`): the index
- `newValue` (`double`): the new value

### `getAndSet(int i, double newValue)`

**Returns:** `double`

**Parameters:**
- `i` (`int`): the index
- `newValue` (`double`): the new value

### `compareAndSet(int i, double expect, double update)`

**Returns:** `boolean`

**Parameters:**
- `i` (`int`): the index
- `expect` (`double`): the expected value
- `update` (`double`): the new value

### `weakCompareAndSet(int i, double expect, double update)`

**Returns:** `boolean`

May [
 fail spuriously](http://download.oracle.com/javase/7/docs/api/java/util/concurrent/atomic/package-summary.html#Spurious) and does not provide ordering guarantees, so is only rarely an appropriate
 alternative to compareAndSet.

**Parameters:**
- `i` (`int`): the index
- `expect` (`double`): the expected value
- `update` (`double`): the new value

### `getAndAdd(int i, double delta)`

**Returns:** `double`

**Parameters:**
- `i` (`int`): the index
- `delta` (`double`): the value to add

### `addAndGet(int i, double delta)`

**Returns:** `double`

**Parameters:**
- `i` (`int`): the index
- `delta` (`double`): the value to add

### `getAndAccumulate(int i, double x, java.util.function.DoubleBinaryOperator accumulatorFunction)`

**Returns:** `double`

**Parameters:**
- `i` (`int`): the index to update
- `x` (`double`): the update value
- `accumulatorFunction` (`java.util.function.DoubleBinaryOperator`): the accumulator function

### `accumulateAndGet(int i, double x, java.util.function.DoubleBinaryOperator accumulatorFunction)`

**Returns:** `double`

**Parameters:**
- `i` (`int`): the index to update
- `x` (`double`): the update value
- `accumulatorFunction` (`java.util.function.DoubleBinaryOperator`): the accumulator function

### `getAndUpdate(int i, java.util.function.DoubleUnaryOperator updaterFunction)`

**Returns:** `double`

**Parameters:**
- `i` (`int`): the index to update
- `updaterFunction` (`java.util.function.DoubleUnaryOperator`): the update function

### `updateAndGet(int i, java.util.function.DoubleUnaryOperator updaterFunction)`

**Returns:** `double`

**Parameters:**
- `i` (`int`): the index to update
- `updaterFunction` (`java.util.function.DoubleUnaryOperator`): the update function

### `toString()`

**Returns:** `java.lang.String`

### `writeObject(java.io.ObjectOutputStream s)`

**Returns:** `void`

**Parameters:**
- `s` (`java.io.ObjectOutputStream`)

### `readObject(java.io.ObjectInputStream s)`

**Returns:** `void`

**Parameters:**
- `s` (`java.io.ObjectInputStream`)

