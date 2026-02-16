# Class: `BigIntegerMath`

**Package:** [`com.google.common.math`](README.md)

**Fully Qualified Name:** `com.google.common.math.BigIntegerMath`

## Description

A class for arithmetic on values of type `BigInteger`.

 <p>The implementations of many methods in this class are based on material from Henry S. Warren,
 Jr.'s <i>Hacker's Delight</i>, (Addison Wesley, 2002).

 <p>Similar functionality for `int` and for `long` can be found in `IntMath` and
 `LongMath` respectively.
**Author:** Louis Wasserman
**Since:** 11.0

## Fields

### `SQRT2_PRECOMPUTE_THRESHOLD`

**Type:** `int`

### `SQRT2_PRECOMPUTED_BITS`

**Type:** `java.math.BigInteger`

### `LN_10`

**Type:** `double`

### `LN_2`

**Type:** `double`

## Constructors

### `<init>()`

## Methods

### `ceilingPowerOfTwo(`java.math.BigInteger` x)`

**Returns:** `java.math.BigInteger`

Returns the smallest power of two greater than or equal to `x`. This is equivalent to
 `BigInteger.valueOf(2).pow(log2(x, CEILING))`.
@throws IllegalArgumentException if `x <= 0`
**Since:** 20.0

### `floorPowerOfTwo(`java.math.BigInteger` x)`

**Returns:** `java.math.BigInteger`

Returns the largest power of two less than or equal to `x`. This is equivalent to `BigInteger.valueOf(2).pow(log2(x, FLOOR))`.
@throws IllegalArgumentException if `x <= 0`
**Since:** 20.0

### `isPowerOfTwo(`java.math.BigInteger` x)`

**Returns:** `boolean`

Returns `true` if `x` represents a power of two.

### `log2(`java.math.BigInteger` x, `java.math.RoundingMode` mode)`

**Returns:** `int`

Returns the base-2 logarithm of `x`, rounded according to the specified rounding mode.
@throws IllegalArgumentException if `x <= 0`
@throws ArithmeticException if `mode` is `RoundingMode.UNNECESSARY` and `x`
     is not a power of two

### `log10(`java.math.BigInteger` x, `java.math.RoundingMode` mode)`

**Returns:** `int`

Returns the base-10 logarithm of `x`, rounded according to the specified rounding mode.
@throws IllegalArgumentException if `x <= 0`
@throws ArithmeticException if `mode` is `RoundingMode.UNNECESSARY` and `x`
     is not a power of ten

### `sqrt(`java.math.BigInteger` x, `java.math.RoundingMode` mode)`

**Returns:** `java.math.BigInteger`

Returns the square root of `x`, rounded with the specified rounding mode.
@throws IllegalArgumentException if `x < 0`
@throws ArithmeticException if `mode` is `RoundingMode.UNNECESSARY` and `sqrt(x)` is not an integer

### `sqrtFloor(`java.math.BigInteger` x)`

**Returns:** `java.math.BigInteger`

### `sqrtApproxWithDoubles(`java.math.BigInteger` x)`

**Returns:** `java.math.BigInteger`

### `roundToDouble(`java.math.BigInteger` x, `java.math.RoundingMode` mode)`

**Returns:** `double`

Returns `x`, rounded to a `double` with the specified rounding mode. If `x`
 is precisely representable as a `double`, its `double` value will be returned;
 otherwise, the rounding will choose between the two nearest representable values with `mode`.

 <p>For the case of `RoundingMode.HALF_DOWN`, `HALF_UP`, and `HALF_EVEN`,
 infinite `double` values are considered infinitely far away. For example, 2^2000 is not
 representable as a double, but `roundToDouble(BigInteger.valueOf(2).pow(2000), HALF_UP)`
 will return `Double.MAX_VALUE`, not `Double.POSITIVE_INFINITY`.

 <p>For the case of `RoundingMode.HALF_EVEN`, this implementation uses the IEEE 754
 default rounding mode: if the two nearest representable values are equally near, the one with
 the least significant bit zero is chosen. (In such cases, both of the nearest representable
 values are even integers; this method returns the one that is a multiple of a greater power of
 two.)
@throws ArithmeticException if `mode` is `RoundingMode.UNNECESSARY` and `x`
     is not precisely representable as a `double`
**Since:** 30.0

### `divide(`java.math.BigInteger` p, `java.math.BigInteger` q, `java.math.RoundingMode` mode)`

**Returns:** `java.math.BigInteger`

Returns the result of dividing `p` by `q`, rounding using the specified `RoundingMode`.
@throws ArithmeticException if `q == 0`, or if `mode == UNNECESSARY` and `a`
     is not an integer multiple of `b`

### `factorial(`int` n)`

**Returns:** `java.math.BigInteger`

Returns `n!`, that is, the product of the first `n` positive integers, or `1`
 if `n == 0`.

 <p><b>Warning:</b> the result takes <i>O(n log n)</i> space, so use cautiously.

 <p>This uses an efficient binary recursive algorithm to compute the factorial with balanced
 multiplies. It also removes all the 2s from the intermediate products (shifting them back in at
 the end).
@throws IllegalArgumentException if `n < 0`

### `listProduct(`java.util.List<java.math.BigInteger>` nums)`

**Returns:** `java.math.BigInteger`

### `listProduct(`java.util.List<java.math.BigInteger>` nums, `int` start, `int` end)`

**Returns:** `java.math.BigInteger`

### `binomial(`int` n, `int` k)`

**Returns:** `java.math.BigInteger`

Returns `n` choose `k`, also known as the binomial coefficient of `n` and
 `k`, that is, `n! / (k! (n - k)!)`.

 <p><b>Warning:</b> the result can take as much as <i>O(k log n)</i> space.
@throws IllegalArgumentException if `n < 0`, `k < 0`, or `k > n`

### `fitsInLong(`java.math.BigInteger` x)`

**Returns:** `boolean`

