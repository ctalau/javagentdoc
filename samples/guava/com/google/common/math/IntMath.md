# Class: `IntMath`

**Package:** [`com.google.common.math`](README.md)

**Fully Qualified Name:** `com.google.common.math.IntMath`

## Description

A class for arithmetic on values of type `int`. Where possible, methods are defined and
 named analogously to their `BigInteger` counterparts.

 <p>The implementations of many methods in this class are based on material from Henry S. Warren,
 Jr.'s <i>Hacker's Delight</i>, (Addison Wesley, 2002).

 <p>Similar functionality for `long` and for `BigInteger` can be found in `LongMath` and `BigIntegerMath` respectively. For other common operations on `int`
 values, see `com.google.common.primitives.Ints`.
**Author:** Louis Wasserman
**Since:** 11.0

## Fields

### `MAX_SIGNED_POWER_OF_TWO`

**Type:** `int`

### `MAX_POWER_OF_SQRT2_UNSIGNED`

**Type:** `int`

The biggest half power of two that can fit in an unsigned int.

### `maxLog10ForLeadingZeros`

**Type:** `byte[]`

### `powersOf10`

**Type:** `int[]`

### `halfPowersOf10`

**Type:** `int[]`

### `FLOOR_SQRT_MAX_INT`

**Type:** `int`

### `factorials`

**Type:** `int[]`

### `biggestBinomials`

**Type:** `int[]`

## Constructors

### `<init>()`

## Methods

### `ceilingPowerOfTwo(`int` x)`

**Returns:** `int`

Returns the smallest power of two greater than or equal to `x`. This is equivalent to
 `checkedPow(2, log2(x, CEILING))`.
@throws IllegalArgumentException if `x <= 0`
@throws ArithmeticException of the next-higher power of two is not representable as an `int`, i.e. when `x > 2^30`
**Since:** 20.0

### `floorPowerOfTwo(`int` x)`

**Returns:** `int`

Returns the largest power of two less than or equal to `x`. This is equivalent to `checkedPow(2, log2(x, FLOOR))`.
@throws IllegalArgumentException if `x <= 0`
**Since:** 20.0

### `isPowerOfTwo(`int` x)`

**Returns:** `boolean`

Returns `true` if `x` represents a power of two.

 <p>This differs from `Integer.bitCount(x) == 1`, because `Integer.bitCount(Integer.MIN_VALUE) == 1`, but `Integer.MIN_VALUE` is not a power of two.

### `lessThanBranchFree(`int` x, `int` y)`

**Returns:** `int`

Returns 1 if `x < y` as unsigned integers, and 0 otherwise. Assumes that x - y fits into
 a signed int. The implementation is branch-free, and benchmarks suggest it is measurably (if
 narrowly) faster than the straightforward ternary expression.

### `log2(`int` x, `java.math.RoundingMode` mode)`

**Returns:** `int`

Returns the base-2 logarithm of `x`, rounded according to the specified rounding mode.
@throws IllegalArgumentException if `x <= 0`
@throws ArithmeticException if `mode` is `RoundingMode.UNNECESSARY` and `x`
     is not a power of two

### `log10(`int` x, `java.math.RoundingMode` mode)`

**Returns:** `int`

Returns the base-10 logarithm of `x`, rounded according to the specified rounding mode.
@throws IllegalArgumentException if `x <= 0`
@throws ArithmeticException if `mode` is `RoundingMode.UNNECESSARY` and `x`
     is not a power of ten

### `log10Floor(`int` x)`

**Returns:** `int`

### `pow(`int` b, `int` k)`

**Returns:** `int`

Returns `b` to the `k`th power. Even if the result overflows, it will be equal to
 `BigInteger.valueOf(b).pow(k).intValue()`. This implementation runs in `O(log k)`
 time.

 <p>Compare `checkedPow`, which throws an `ArithmeticException` upon overflow.
@throws IllegalArgumentException if `k < 0`

### `sqrt(`int` x, `java.math.RoundingMode` mode)`

**Returns:** `int`

Returns the square root of `x`, rounded with the specified rounding mode.
@throws IllegalArgumentException if `x < 0`
@throws ArithmeticException if `mode` is `RoundingMode.UNNECESSARY` and `sqrt(x)` is not an integer

### `sqrtFloor(`int` x)`

**Returns:** `int`

### `divide(`int` p, `int` q, `java.math.RoundingMode` mode)`

**Returns:** `int`

Returns the result of dividing `p` by `q`, rounding using the specified `RoundingMode`.
@throws ArithmeticException if `q == 0`, or if `mode == UNNECESSARY` and `a`
     is not an integer multiple of `b`

### `mod(`int` x, `int` m)`

**Returns:** `int`

Returns `x mod m`, a non-negative value less than `m`. This differs from `x %
 m`, which might be negative.

 <p>For example:

 <pre>`mod(7, 4) == 3
 mod(-7, 4) == 1
 mod(-1, 4) == 3
 mod(-8, 4) == 0
 mod(8, 4) == 0
 `</pre>
@throws ArithmeticException if `m <= 0`
**See:** <a href="http://docs.oracle.com/javase/specs/jls/se7/html/jls-15.html#jls-15.17.3">
     Remainder Operator</a>

### `gcd(`int` a, `int` b)`

**Returns:** `int`

Returns the greatest common divisor of `a, b`. Returns `0` if `a == 0 && b ==
 0`.
@throws IllegalArgumentException if `a < 0` or `b < 0`

### `checkedAdd(`int` a, `int` b)`

**Returns:** `int`

Returns the sum of `a` and `b`, provided it does not overflow.
@throws ArithmeticException if `a + b` overflows in signed `int` arithmetic

### `checkedSubtract(`int` a, `int` b)`

**Returns:** `int`

Returns the difference of `a` and `b`, provided it does not overflow.
@throws ArithmeticException if `a - b` overflows in signed `int` arithmetic

### `checkedMultiply(`int` a, `int` b)`

**Returns:** `int`

Returns the product of `a` and `b`, provided it does not overflow.
@throws ArithmeticException if `a * b` overflows in signed `int` arithmetic

### `checkedPow(`int` b, `int` k)`

**Returns:** `int`

Returns the `b` to the `k`th power, provided it does not overflow.

 <p>`pow` may be faster, but does not check for overflow.
@throws ArithmeticException if `b` to the `k`th power overflows in signed `int` arithmetic

### `saturatedAdd(`int` a, `int` b)`

**Returns:** `int`

Returns the sum of `a` and `b` unless it would overflow or underflow in which case
 `Integer.MAX_VALUE` or `Integer.MIN_VALUE` is returned, respectively.
**Since:** 20.0

### `saturatedSubtract(`int` a, `int` b)`

**Returns:** `int`

Returns the difference of `a` and `b` unless it would overflow or underflow in
 which case `Integer.MAX_VALUE` or `Integer.MIN_VALUE` is returned, respectively.
**Since:** 20.0

### `saturatedMultiply(`int` a, `int` b)`

**Returns:** `int`

Returns the product of `a` and `b` unless it would overflow or underflow in which
 case `Integer.MAX_VALUE` or `Integer.MIN_VALUE` is returned, respectively.
**Since:** 20.0

### `saturatedPow(`int` b, `int` k)`

**Returns:** `int`

Returns the `b` to the `k`th power, unless it would overflow or underflow in which
 case `Integer.MAX_VALUE` or `Integer.MIN_VALUE` is returned, respectively.
**Since:** 20.0

### `factorial(`int` n)`

**Returns:** `int`

Returns `n!`, that is, the product of the first `n` positive integers, `1` if
 `n == 0`, or `Integer.MAX_VALUE` if the result does not fit in a `int`.
@throws IllegalArgumentException if `n < 0`

### `binomial(`int` n, `int` k)`

**Returns:** `int`

Returns `n` choose `k`, also known as the binomial coefficient of `n` and
 `k`, or `Integer.MAX_VALUE` if the result does not fit in an `int`.
@throws IllegalArgumentException if `n < 0`, `k < 0` or `k > n`

### `mean(`int` x, `int` y)`

**Returns:** `int`

Returns the arithmetic mean of `x` and `y`, rounded towards negative infinity. This
 method is overflow resilient.
**Since:** 14.0

### `isPrime(`int` n)`

**Returns:** `boolean`

Returns `true` if `n` is a <a href="http://mathworld.wolfram.com/PrimeNumber.html">prime number</a>: an integer <i>greater
 than one</i> that cannot be factored into a product of <i>smaller</i> positive integers.
 Returns `false` if `n` is zero, one, or a composite number (one which <i>can</i> be
 factored into smaller positive integers).

 <p>To test larger numbers, use `LongMath.isPrime` or `BigInteger.isProbablePrime`.
@throws IllegalArgumentException if `n` is negative
**Since:** 20.0

