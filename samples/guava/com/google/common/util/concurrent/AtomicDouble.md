# Class: `AtomicDouble`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.AtomicDouble`

**Extends:** `java.lang.Number`

**Implements:** `java.io.Serializable`

## Description

See the java.util.concurrent.atomic package specification for description of the properties of atomic
 variables. An AtomicDouble is used in applications such as atomic accumulation, and
 cannot be used as a replacement for a Double. However, this class does extend 
 Number to allow uniform access by tools and utilities that deal with numerically-based classes.

 
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


 
It is possible to write a more scalable updater, at the cost of giving up strict atomicity.
 See for example [
 DoubleAdder](http://gee.cs.oswego.edu/dl/jsr166/dist/docs/java.base/java/util/concurrent/atomic/DoubleAdder.html).

## Fields

### `serialVersionUID`

**Type:** `long`

### `value`

**Type:** `long`

### `updater`

**Type:** `java.util.concurrent.atomic.AtomicLongFieldUpdater<com.google.common.util.concurrent.AtomicDouble>`

## Constructors

### `<init>(double initialValue)`

**Parameters:**
- `initialValue` (`double`): the initial value

### `<init>()`

## Methods

### `get()`

**Returns:** `double`

### `set(double newValue)`

**Parameters:**
- `newValue` (`double`): the new value

**Returns:** `void`

### `lazySet(double newValue)`

**Parameters:**
- `newValue` (`double`): the new value

**Returns:** `void`

### `getAndSet(double newValue)`

**Parameters:**
- `newValue` (`double`): the new value

**Returns:** `double`

### `compareAndSet(double expect, double update)`

**Parameters:**
- `expect` (`double`): the expected value
- `update` (`double`): the new value

**Returns:** `boolean`

### `weakCompareAndSet(double expect, double update)`

May [
 fail spuriously](http://download.oracle.com/javase/7/docs/api/java/util/concurrent/atomic/package-summary.html#Spurious) and does not provide ordering guarantees, so is only rarely an appropriate
 alternative to compareAndSet.

**Parameters:**
- `expect` (`double`): the expected value
- `update` (`double`): the new value

**Returns:** `boolean`

### `getAndAdd(double delta)`

**Parameters:**
- `delta` (`double`): the value to add

**Returns:** `double`

### `addAndGet(double delta)`

**Parameters:**
- `delta` (`double`): the value to add

**Returns:** `double`

### `getAndAccumulate(double x, DoubleBinaryOperator accumulatorFunction)`

**Parameters:**
- `x` (`double`): the update value
- `accumulatorFunction` (`java.util.function.DoubleBinaryOperator`): the accumulator function

**Returns:** `double`

### `accumulateAndGet(double x, DoubleBinaryOperator accumulatorFunction)`

**Parameters:**
- `x` (`double`): the update value
- `accumulatorFunction` (`java.util.function.DoubleBinaryOperator`): the accumulator function

**Returns:** `double`

### `getAndUpdate(DoubleUnaryOperator updateFunction)`

**Parameters:**
- `updateFunction` (`java.util.function.DoubleUnaryOperator`): the update function

**Returns:** `double`

### `updateAndGet(DoubleUnaryOperator updateFunction)`

**Parameters:**
- `updateFunction` (`java.util.function.DoubleUnaryOperator`): the update function

**Returns:** `double`

### `toString()`

**Returns:** `java.lang.String`

### `intValue()`

**Returns:** `int`

### `longValue()`

**Returns:** `long`

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

