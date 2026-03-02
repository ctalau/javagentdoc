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

**Parameters:**
- `i` (`int`): the index

**Returns:** `double`

### `set(int i, double newValue)`

**Parameters:**
- `i` (`int`): the index
- `newValue` (`double`): the new value

**Returns:** `void`

### `lazySet(int i, double newValue)`

**Parameters:**
- `i` (`int`): the index
- `newValue` (`double`): the new value

**Returns:** `void`

### `getAndSet(int i, double newValue)`

**Parameters:**
- `i` (`int`): the index
- `newValue` (`double`): the new value

**Returns:** `double`

### `compareAndSet(int i, double expect, double update)`

**Parameters:**
- `i` (`int`): the index
- `expect` (`double`): the expected value
- `update` (`double`): the new value

**Returns:** `boolean`

### `weakCompareAndSet(int i, double expect, double update)`

May [
 fail spuriously](http://download.oracle.com/javase/7/docs/api/java/util/concurrent/atomic/package-summary.html#Spurious) and does not provide ordering guarantees, so is only rarely an appropriate
 alternative to compareAndSet.

**Parameters:**
- `i` (`int`): the index
- `expect` (`double`): the expected value
- `update` (`double`): the new value

**Returns:** `boolean`

### `getAndAdd(int i, double delta)`

**Parameters:**
- `i` (`int`): the index
- `delta` (`double`): the value to add

**Returns:** `double`

### `addAndGet(int i, double delta)`

**Parameters:**
- `i` (`int`): the index
- `delta` (`double`): the value to add

**Returns:** `double`

### `getAndAccumulate(int i, double x, DoubleBinaryOperator accumulatorFunction)`

**Parameters:**
- `i` (`int`): the index to update
- `x` (`double`): the update value
- `accumulatorFunction` (`java.util.function.DoubleBinaryOperator`): the accumulator function

**Returns:** `double`

### `accumulateAndGet(int i, double x, DoubleBinaryOperator accumulatorFunction)`

**Parameters:**
- `i` (`int`): the index to update
- `x` (`double`): the update value
- `accumulatorFunction` (`java.util.function.DoubleBinaryOperator`): the accumulator function

**Returns:** `double`

### `getAndUpdate(int i, DoubleUnaryOperator updaterFunction)`

**Parameters:**
- `i` (`int`): the index to update
- `updaterFunction` (`java.util.function.DoubleUnaryOperator`): the update function

**Returns:** `double`

### `updateAndGet(int i, DoubleUnaryOperator updaterFunction)`

**Parameters:**
- `i` (`int`): the index to update
- `updaterFunction` (`java.util.function.DoubleUnaryOperator`): the update function

**Returns:** `double`

### `toString()`

**Returns:** `java.lang.String`

### `writeObject(ObjectOutputStream s)`

**Parameters:**
- `s` (`java.io.ObjectOutputStream`)

**Returns:** `void`

### `readObject(ObjectInputStream s)`

**Parameters:**
- `s` (`java.io.ObjectInputStream`)

**Returns:** `void`

