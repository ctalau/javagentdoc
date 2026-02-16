# Class: `LongMath`

**Package:** [`com.google.common.math`](README.md)

**Fully Qualified Name:** `com.google.common.math.LongMath`

## Description

A class for arithmetic on values of type `long`. Where possible, methods are defined and
 named analogously to their `BigInteger` counterparts.

 <p>The implementations of many methods in this class are based on material from Henry S. Warren,
 Jr.'s <i>Hacker's Delight</i>, (Addison Wesley, 2002).

 <p>Similar functionality for `int` and for `BigInteger` can be found in `IntMath` and `BigIntegerMath` respectively. For other common operations on `long`
 values, see `com.google.common.primitives.Longs`.
**Author:** Louis Wasserman
**Since:** 11.0

## Fields

### `MAX_SIGNED_POWER_OF_TWO`

**Type:** `long`

### `MAX_POWER_OF_SQRT2_UNSIGNED`

**Type:** `long`

The biggest half power of two that fits into an unsigned long

### `maxLog10ForLeadingZeros`

**Type:** `byte[]`

### `powersOf10`

**Type:** `long[]`

### `halfPowersOf10`

**Type:** `long[]`

### `FLOOR_SQRT_MAX_LONG`

**Type:** `long`

### `factorials`

**Type:** `long[]`

### `biggestBinomials`

**Type:** `int[]`

### `biggestSimpleBinomials`

**Type:** `int[]`

### `SIEVE_30`

**Type:** `int`

### `millerRabinBaseSets`

**Type:** `long[][]`

## Constructors

### `<init>()`

## Methods

### `ceilingPowerOfTwo(`long` x)`

**Returns:** `long`

Returns the smallest power of two greater than or equal to `x`. This is equivalent to
 `checkedPow(2, log2(x, CEILING))`.
@throws IllegalArgumentException if `x <= 0`
@throws ArithmeticException of the next-higher power of two is not representable as a `long`, i.e. when `x > 2^62`
**Since:** 20.0

### `floorPowerOfTwo(`long` x)`

**Returns:** `long`

Returns the largest power of two less than or equal to `x`. This is equivalent to `checkedPow(2, log2(x, FLOOR))`.
@throws IllegalArgumentException if `x <= 0`
**Since:** 20.0

### `isPowerOfTwo(`long` x)`

**Returns:** `boolean`

Returns `true` if `x` represents a power of two.

 <p>This differs from `Long.bitCount(x) == 1`, because `Long.bitCount(Long.MIN_VALUE) == 1`, but `Long.MIN_VALUE` is not a power of two.

### `lessThanBranchFree(`long` x, `long` y)`

**Returns:** `int`

Returns 1 if `x < y` as unsigned longs, and 0 otherwise. Assumes that x - y fits into a
 signed long. The implementation is branch-free, and benchmarks suggest it is measurably faster
 than the straightforward ternary expression.

### `log2(`long` x, `java.math.RoundingMode` mode)`

**Returns:** `int`

Returns the base-2 logarithm of `x`, rounded according to the specified rounding mode.
@throws IllegalArgumentException if `x <= 0`
@throws ArithmeticException if `mode` is `RoundingMode.UNNECESSARY` and `x`
     is not a power of two

### `log10(`long` x, `java.math.RoundingMode` mode)`

**Returns:** `int`

Returns the base-10 logarithm of `x`, rounded according to the specified rounding mode.
@throws IllegalArgumentException if `x <= 0`
@throws ArithmeticException if `mode` is `RoundingMode.UNNECESSARY` and `x`
     is not a power of ten

### `log10Floor(`long` x)`

**Returns:** `int`

### `pow(`long` b, `int` k)`

**Returns:** `long`

Returns `b` to the `k`th power. Even if the result overflows, it will be equal to
 `BigInteger.valueOf(b).pow(k).longValue()`. This implementation runs in `O(log k)`
 time.
@throws IllegalArgumentException if `k < 0`

### `sqrt(`long` x, `java.math.RoundingMode` mode)`

**Returns:** `long`

Returns the square root of `x`, rounded with the specified rounding mode.
@throws IllegalArgumentException if `x < 0`
@throws ArithmeticException if `mode` is `RoundingMode.UNNECESSARY` and `sqrt(x)` is not an integer

### `divide(`long` p, `long` q, `java.math.RoundingMode` mode)`

**Returns:** `long`

Returns the result of dividing `p` by `q`, rounding using the specified `RoundingMode`.
@throws ArithmeticException if `q == 0`, or if `mode == UNNECESSARY` and `a`
     is not an integer multiple of `b`

### `mod(`long` x, `int` m)`

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

### `mod(`long` x, `long` m)`

**Returns:** `long`

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

### `gcd(`long` a, `long` b)`

**Returns:** `long`

Returns the greatest common divisor of `a, b`. Returns `0` if `a == 0 && b ==
 0`.
@throws IllegalArgumentException if `a < 0` or `b < 0`

### `checkedAdd(`long` a, `long` b)`

**Returns:** `long`

Returns the sum of `a` and `b`, provided it does not overflow.
@throws ArithmeticException if `a + b` overflows in signed `long` arithmetic

### `checkedSubtract(`long` a, `long` b)`

**Returns:** `long`

Returns the difference of `a` and `b`, provided it does not overflow.
@throws ArithmeticException if `a - b` overflows in signed `long` arithmetic

### `checkedMultiply(`long` a, `long` b)`

**Returns:** `long`

Returns the product of `a` and `b`, provided it does not overflow.
@throws ArithmeticException if `a * b` overflows in signed `long` arithmetic

### `checkedPow(`long` b, `int` k)`

**Returns:** `long`

Returns the `b` to the `k`th power, provided it does not overflow.
@throws ArithmeticException if `b` to the `k`th power overflows in signed `long` arithmetic

### `saturatedAdd(`long` a, `long` b)`

**Returns:** `long`

Returns the sum of `a` and `b` unless it would overflow or underflow in which case
 `Long.MAX_VALUE` or `Long.MIN_VALUE` is returned, respectively.
**Since:** 20.0

### `saturatedSubtract(`long` a, `long` b)`

**Returns:** `long`

Returns the difference of `a` and `b` unless it would overflow or underflow in
 which case `Long.MAX_VALUE` or `Long.MIN_VALUE` is returned, respectively.
**Since:** 20.0

### `saturatedMultiply(`long` a, `long` b)`

**Returns:** `long`

Returns the product of `a` and `b` unless it would overflow or underflow in which
 case `Long.MAX_VALUE` or `Long.MIN_VALUE` is returned, respectively.
**Since:** 20.0

### `saturatedPow(`long` b, `int` k)`

**Returns:** `long`

Returns the `b` to the `k`th power, unless it would overflow or underflow in which
 case `Long.MAX_VALUE` or `Long.MIN_VALUE` is returned, respectively.
**Since:** 20.0

### `factorial(`int` n)`

**Returns:** `long`

Returns `n!`, that is, the product of the first `n` positive integers, `1` if
 `n == 0`, or `Long.MAX_VALUE` if the result does not fit in a `long`.
@throws IllegalArgumentException if `n < 0`

### `binomial(`int` n, `int` k)`

**Returns:** `long`

Returns `n` choose `k`, also known as the binomial coefficient of `n` and
 `k`, or `Long.MAX_VALUE` if the result does not fit in a `long`.
@throws IllegalArgumentException if `n < 0`, `k < 0`, or `k > n`

### `multiplyFraction(`long` x, `long` numerator, `long` denominator)`

**Returns:** `long`

Returns (x * numerator / denominator), which is assumed to come out to an integral value.

### `fitsInInt(`long` x)`

**Returns:** `boolean`

### `mean(`long` x, `long` y)`

**Returns:** `long`

Returns the arithmetic mean of `x` and `y`, rounded toward negative infinity. This
 method is resilient to overflow.
**Since:** 14.0

### `isPrime(`long` n)`

**Returns:** `boolean`

Returns `true` if `n` is a <a href="http://mathworld.wolfram.com/PrimeNumber.html">prime number</a>: an integer <i>greater
 than one</i> that cannot be factored into a product of <i>smaller</i> positive integers.
 Returns `false` if `n` is zero, one, or a composite number (one which <i>can</i> be
 factored into smaller positive integers).

 <p>To test larger numbers, use `BigInteger.isProbablePrime`.
@throws IllegalArgumentException if `n` is negative
**Since:** 20.0

### `roundToDouble(`long` x, `java.math.RoundingMode` mode)`

**Returns:** `double`

Returns `x`, rounded to a `double` with the specified rounding mode. If `x`
 is precisely representable as a `double`, its `double` value will be returned;
 otherwise, the rounding will choose between the two nearest representable values with `mode`.

 <p>For the case of `RoundingMode.HALF_EVEN`, this implementation uses the IEEE 754
 default rounding mode: if the two nearest representable values are equally near, the one with
 the least significant bit zero is chosen. (In such cases, both of the nearest representable
 values are even integers; this method returns the one that is a multiple of a greater power of
 two.)
@throws ArithmeticException if `mode` is `RoundingMode.UNNECESSARY` and `x`
     is not precisely representable as a `double`
**Since:** 30.0

