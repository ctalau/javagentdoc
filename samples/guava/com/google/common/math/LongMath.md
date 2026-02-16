# Class: `LongMath`

**Package:** [`com.google.common.math`](README.md)

**Fully Qualified Name:** `com.google.common.math.LongMath`

## Description

A class for arithmetic on values of type {@code long}. Where possible, methods are defined and
 named analogously to their {@code BigInteger} counterparts.

 <p>The implementations of many methods in this class are based on material from Henry S. Warren,
 Jr.'s <i>Hacker's Delight</i>, (Addison Wesley, 2002).

 <p>Similar functionality for {@code int} and for {@link BigInteger} can be found in {@link IntMath} and {@link BigIntegerMath} respectively. For other common operations on {@code long}
 values, see {@link com.google.common.primitives.Longs}.
@author Louis Wasserman
@since 11.0

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

Returns the smallest power of two greater than or equal to {@code x}. This is equivalent to
 {@code checkedPow(2, log2(x, CEILING))}.
@throws IllegalArgumentException if {@code x <= 0}
@throws ArithmeticException of the next-higher power of two is not representable as a {@code
     long}, i.e. when {@code x > 2^62}
@since 20.0

### `floorPowerOfTwo(`long` x)`

**Returns:** `long`

Returns the largest power of two less than or equal to {@code x}. This is equivalent to {@code
 checkedPow(2, log2(x, FLOOR))}.
@throws IllegalArgumentException if {@code x <= 0}
@since 20.0

### `isPowerOfTwo(`long` x)`

**Returns:** `boolean`

Returns {@code true} if {@code x} represents a power of two.

 <p>This differs from {@code Long.bitCount(x) == 1}, because {@code
 Long.bitCount(Long.MIN_VALUE) == 1}, but {@link Long#MIN_VALUE} is not a power of two.

### `lessThanBranchFree(`long` x, `long` y)`

**Returns:** `int`

Returns 1 if {@code x < y} as unsigned longs, and 0 otherwise. Assumes that x - y fits into a
 signed long. The implementation is branch-free, and benchmarks suggest it is measurably faster
 than the straightforward ternary expression.

### `log2(`long` x, [`java.math.RoundingMode`](../../../../java/math/RoundingMode.md) mode)`

**Returns:** `int`

Returns the base-2 logarithm of {@code x}, rounded according to the specified rounding mode.
@throws IllegalArgumentException if {@code x <= 0}
@throws ArithmeticException if {@code mode} is {@link RoundingMode#UNNECESSARY} and {@code x}
     is not a power of two

### `log10(`long` x, [`java.math.RoundingMode`](../../../../java/math/RoundingMode.md) mode)`

**Returns:** `int`

Returns the base-10 logarithm of {@code x}, rounded according to the specified rounding mode.
@throws IllegalArgumentException if {@code x <= 0}
@throws ArithmeticException if {@code mode} is {@link RoundingMode#UNNECESSARY} and {@code x}
     is not a power of ten

### `log10Floor(`long` x)`

**Returns:** `int`

### `pow(`long` b, `int` k)`

**Returns:** `long`

Returns {@code b} to the {@code k}th power. Even if the result overflows, it will be equal to
 {@code BigInteger.valueOf(b).pow(k).longValue()}. This implementation runs in {@code O(log k)}
 time.
@throws IllegalArgumentException if {@code k < 0}

### `sqrt(`long` x, [`java.math.RoundingMode`](../../../../java/math/RoundingMode.md) mode)`

**Returns:** `long`

Returns the square root of {@code x}, rounded with the specified rounding mode.
@throws IllegalArgumentException if {@code x < 0}
@throws ArithmeticException if {@code mode} is {@link RoundingMode#UNNECESSARY} and {@code
     sqrt(x)} is not an integer

### `divide(`long` p, `long` q, [`java.math.RoundingMode`](../../../../java/math/RoundingMode.md) mode)`

**Returns:** `long`

Returns the result of dividing {@code p} by {@code q}, rounding using the specified {@code
 RoundingMode}.
@throws ArithmeticException if {@code q == 0}, or if {@code mode == UNNECESSARY} and {@code a}
     is not an integer multiple of {@code b}

### `mod(`long` x, `int` m)`

**Returns:** `int`

Returns {@code x mod m}, a non-negative value less than {@code m}. This differs from {@code x %
 m}, which might be negative.

 <p>For example:

 <pre>{@code
 mod(7, 4) == 3
 mod(-7, 4) == 1
 mod(-1, 4) == 3
 mod(-8, 4) == 0
 mod(8, 4) == 0
 }</pre>
@throws ArithmeticException if {@code m <= 0}
@see <a href="http://docs.oracle.com/javase/specs/jls/se7/html/jls-15.html#jls-15.17.3">
     Remainder Operator</a>

### `mod(`long` x, `long` m)`

**Returns:** `long`

Returns {@code x mod m}, a non-negative value less than {@code m}. This differs from {@code x %
 m}, which might be negative.

 <p>For example:

 <pre>{@code
 mod(7, 4) == 3
 mod(-7, 4) == 1
 mod(-1, 4) == 3
 mod(-8, 4) == 0
 mod(8, 4) == 0
 }</pre>
@throws ArithmeticException if {@code m <= 0}
@see <a href="http://docs.oracle.com/javase/specs/jls/se7/html/jls-15.html#jls-15.17.3">
     Remainder Operator</a>

### `gcd(`long` a, `long` b)`

**Returns:** `long`

Returns the greatest common divisor of {@code a, b}. Returns {@code 0} if {@code a == 0 && b ==
 0}.
@throws IllegalArgumentException if {@code a < 0} or {@code b < 0}

### `checkedAdd(`long` a, `long` b)`

**Returns:** `long`

Returns the sum of {@code a} and {@code b}, provided it does not overflow.
@throws ArithmeticException if {@code a + b} overflows in signed {@code long} arithmetic

### `checkedSubtract(`long` a, `long` b)`

**Returns:** `long`

Returns the difference of {@code a} and {@code b}, provided it does not overflow.
@throws ArithmeticException if {@code a - b} overflows in signed {@code long} arithmetic

### `checkedMultiply(`long` a, `long` b)`

**Returns:** `long`

Returns the product of {@code a} and {@code b}, provided it does not overflow.
@throws ArithmeticException if {@code a * b} overflows in signed {@code long} arithmetic

### `checkedPow(`long` b, `int` k)`

**Returns:** `long`

Returns the {@code b} to the {@code k}th power, provided it does not overflow.
@throws ArithmeticException if {@code b} to the {@code k}th power overflows in signed {@code
     long} arithmetic

### `saturatedAdd(`long` a, `long` b)`

**Returns:** `long`

Returns the sum of {@code a} and {@code b} unless it would overflow or underflow in which case
 {@code Long.MAX_VALUE} or {@code Long.MIN_VALUE} is returned, respectively.
@since 20.0

### `saturatedSubtract(`long` a, `long` b)`

**Returns:** `long`

Returns the difference of {@code a} and {@code b} unless it would overflow or underflow in
 which case {@code Long.MAX_VALUE} or {@code Long.MIN_VALUE} is returned, respectively.
@since 20.0

### `saturatedMultiply(`long` a, `long` b)`

**Returns:** `long`

Returns the product of {@code a} and {@code b} unless it would overflow or underflow in which
 case {@code Long.MAX_VALUE} or {@code Long.MIN_VALUE} is returned, respectively.
@since 20.0

### `saturatedPow(`long` b, `int` k)`

**Returns:** `long`

Returns the {@code b} to the {@code k}th power, unless it would overflow or underflow in which
 case {@code Long.MAX_VALUE} or {@code Long.MIN_VALUE} is returned, respectively.
@since 20.0

### `factorial(`int` n)`

**Returns:** `long`

Returns {@code n!}, that is, the product of the first {@code n} positive integers, {@code 1} if
 {@code n == 0}, or {@link Long#MAX_VALUE} if the result does not fit in a {@code long}.
@throws IllegalArgumentException if {@code n < 0}

### `binomial(`int` n, `int` k)`

**Returns:** `long`

Returns {@code n} choose {@code k}, also known as the binomial coefficient of {@code n} and
 {@code k}, or {@link Long#MAX_VALUE} if the result does not fit in a {@code long}.
@throws IllegalArgumentException if {@code n < 0}, {@code k < 0}, or {@code k > n}

### `multiplyFraction(`long` x, `long` numerator, `long` denominator)`

**Returns:** `long`

Returns (x * numerator / denominator), which is assumed to come out to an integral value.

### `fitsInInt(`long` x)`

**Returns:** `boolean`

### `mean(`long` x, `long` y)`

**Returns:** `long`

Returns the arithmetic mean of {@code x} and {@code y}, rounded toward negative infinity. This
 method is resilient to overflow.
@since 14.0

### `isPrime(`long` n)`

**Returns:** `boolean`

Returns {@code true} if {@code n} is a <a href="http://mathworld.wolfram.com/PrimeNumber.html">prime number</a>: an integer <i>greater
 than one</i> that cannot be factored into a product of <i>smaller</i> positive integers.
 Returns {@code false} if {@code n} is zero, one, or a composite number (one which <i>can</i> be
 factored into smaller positive integers).

 <p>To test larger numbers, use {@link BigInteger#isProbablePrime}.
@throws IllegalArgumentException if {@code n} is negative
@since 20.0

### `roundToDouble(`long` x, [`java.math.RoundingMode`](../../../../java/math/RoundingMode.md) mode)`

**Returns:** `double`

Returns {@code x}, rounded to a {@code double} with the specified rounding mode. If {@code x}
 is precisely representable as a {@code double}, its {@code double} value will be returned;
 otherwise, the rounding will choose between the two nearest representable values with {@code
 mode}.

 <p>For the case of {@link RoundingMode#HALF_EVEN}, this implementation uses the IEEE 754
 default rounding mode: if the two nearest representable values are equally near, the one with
 the least significant bit zero is chosen. (In such cases, both of the nearest representable
 values are even integers; this method returns the one that is a multiple of a greater power of
 two.)
@throws ArithmeticException if {@code mode} is {@link RoundingMode#UNNECESSARY} and {@code x}
     is not precisely representable as a {@code double}
@since 30.0

