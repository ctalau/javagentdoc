# Class: `IntMath`

**Package:** [`com.google.common.math`](README.md)

**Fully Qualified Name:** `com.google.common.math.IntMath`

## Description

A class for arithmetic on values of type {@code int}. Where possible, methods are defined and
 named analogously to their {@code BigInteger} counterparts.

 <p>The implementations of many methods in this class are based on material from Henry S. Warren,
 Jr.'s <i>Hacker's Delight</i>, (Addison Wesley, 2002).

 <p>Similar functionality for {@code long} and for {@link BigInteger} can be found in {@link LongMath} and {@link BigIntegerMath} respectively. For other common operations on {@code int}
 values, see {@link com.google.common.primitives.Ints}.
@author Louis Wasserman
@since 11.0

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

Returns the smallest power of two greater than or equal to {@code x}. This is equivalent to
 {@code checkedPow(2, log2(x, CEILING))}.
@throws IllegalArgumentException if {@code x <= 0}
@throws ArithmeticException of the next-higher power of two is not representable as an {@code
     int}, i.e. when {@code x > 2^30}
@since 20.0

### `floorPowerOfTwo(`int` x)`

**Returns:** `int`

Returns the largest power of two less than or equal to {@code x}. This is equivalent to {@code
 checkedPow(2, log2(x, FLOOR))}.
@throws IllegalArgumentException if {@code x <= 0}
@since 20.0

### `isPowerOfTwo(`int` x)`

**Returns:** `boolean`

Returns {@code true} if {@code x} represents a power of two.

 <p>This differs from {@code Integer.bitCount(x) == 1}, because {@code
 Integer.bitCount(Integer.MIN_VALUE) == 1}, but {@link Integer#MIN_VALUE} is not a power of two.

### `lessThanBranchFree(`int` x, `int` y)`

**Returns:** `int`

Returns 1 if {@code x < y} as unsigned integers, and 0 otherwise. Assumes that x - y fits into
 a signed int. The implementation is branch-free, and benchmarks suggest it is measurably (if
 narrowly) faster than the straightforward ternary expression.

### `log2(`int` x, [`java.math.RoundingMode`](../../../../java/math/RoundingMode.md) mode)`

**Returns:** `int`

Returns the base-2 logarithm of {@code x}, rounded according to the specified rounding mode.
@throws IllegalArgumentException if {@code x <= 0}
@throws ArithmeticException if {@code mode} is {@link RoundingMode#UNNECESSARY} and {@code x}
     is not a power of two

### `log10(`int` x, [`java.math.RoundingMode`](../../../../java/math/RoundingMode.md) mode)`

**Returns:** `int`

Returns the base-10 logarithm of {@code x}, rounded according to the specified rounding mode.
@throws IllegalArgumentException if {@code x <= 0}
@throws ArithmeticException if {@code mode} is {@link RoundingMode#UNNECESSARY} and {@code x}
     is not a power of ten

### `log10Floor(`int` x)`

**Returns:** `int`

### `pow(`int` b, `int` k)`

**Returns:** `int`

Returns {@code b} to the {@code k}th power. Even if the result overflows, it will be equal to
 {@code BigInteger.valueOf(b).pow(k).intValue()}. This implementation runs in {@code O(log k)}
 time.

 <p>Compare {@link #checkedPow}, which throws an {@link ArithmeticException} upon overflow.
@throws IllegalArgumentException if {@code k < 0}

### `sqrt(`int` x, [`java.math.RoundingMode`](../../../../java/math/RoundingMode.md) mode)`

**Returns:** `int`

Returns the square root of {@code x}, rounded with the specified rounding mode.
@throws IllegalArgumentException if {@code x < 0}
@throws ArithmeticException if {@code mode} is {@link RoundingMode#UNNECESSARY} and {@code
     sqrt(x)} is not an integer

### `sqrtFloor(`int` x)`

**Returns:** `int`

### `divide(`int` p, `int` q, [`java.math.RoundingMode`](../../../../java/math/RoundingMode.md) mode)`

**Returns:** `int`

Returns the result of dividing {@code p} by {@code q}, rounding using the specified {@code
 RoundingMode}.
@throws ArithmeticException if {@code q == 0}, or if {@code mode == UNNECESSARY} and {@code a}
     is not an integer multiple of {@code b}

### `mod(`int` x, `int` m)`

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

### `gcd(`int` a, `int` b)`

**Returns:** `int`

Returns the greatest common divisor of {@code a, b}. Returns {@code 0} if {@code a == 0 && b ==
 0}.
@throws IllegalArgumentException if {@code a < 0} or {@code b < 0}

### `checkedAdd(`int` a, `int` b)`

**Returns:** `int`

Returns the sum of {@code a} and {@code b}, provided it does not overflow.
@throws ArithmeticException if {@code a + b} overflows in signed {@code int} arithmetic

### `checkedSubtract(`int` a, `int` b)`

**Returns:** `int`

Returns the difference of {@code a} and {@code b}, provided it does not overflow.
@throws ArithmeticException if {@code a - b} overflows in signed {@code int} arithmetic

### `checkedMultiply(`int` a, `int` b)`

**Returns:** `int`

Returns the product of {@code a} and {@code b}, provided it does not overflow.
@throws ArithmeticException if {@code a * b} overflows in signed {@code int} arithmetic

### `checkedPow(`int` b, `int` k)`

**Returns:** `int`

Returns the {@code b} to the {@code k}th power, provided it does not overflow.

 <p>{@link #pow} may be faster, but does not check for overflow.
@throws ArithmeticException if {@code b} to the {@code k}th power overflows in signed {@code
     int} arithmetic

### `saturatedAdd(`int` a, `int` b)`

**Returns:** `int`

Returns the sum of {@code a} and {@code b} unless it would overflow or underflow in which case
 {@code Integer.MAX_VALUE} or {@code Integer.MIN_VALUE} is returned, respectively.
@since 20.0

### `saturatedSubtract(`int` a, `int` b)`

**Returns:** `int`

Returns the difference of {@code a} and {@code b} unless it would overflow or underflow in
 which case {@code Integer.MAX_VALUE} or {@code Integer.MIN_VALUE} is returned, respectively.
@since 20.0

### `saturatedMultiply(`int` a, `int` b)`

**Returns:** `int`

Returns the product of {@code a} and {@code b} unless it would overflow or underflow in which
 case {@code Integer.MAX_VALUE} or {@code Integer.MIN_VALUE} is returned, respectively.
@since 20.0

### `saturatedPow(`int` b, `int` k)`

**Returns:** `int`

Returns the {@code b} to the {@code k}th power, unless it would overflow or underflow in which
 case {@code Integer.MAX_VALUE} or {@code Integer.MIN_VALUE} is returned, respectively.
@since 20.0

### `factorial(`int` n)`

**Returns:** `int`

Returns {@code n!}, that is, the product of the first {@code n} positive integers, {@code 1} if
 {@code n == 0}, or {@link Integer#MAX_VALUE} if the result does not fit in a {@code int}.
@throws IllegalArgumentException if {@code n < 0}

### `binomial(`int` n, `int` k)`

**Returns:** `int`

Returns {@code n} choose {@code k}, also known as the binomial coefficient of {@code n} and
 {@code k}, or {@link Integer#MAX_VALUE} if the result does not fit in an {@code int}.
@throws IllegalArgumentException if {@code n < 0}, {@code k < 0} or {@code k > n}

### `mean(`int` x, `int` y)`

**Returns:** `int`

Returns the arithmetic mean of {@code x} and {@code y}, rounded towards negative infinity. This
 method is overflow resilient.
@since 14.0

### `isPrime(`int` n)`

**Returns:** `boolean`

Returns {@code true} if {@code n} is a <a href="http://mathworld.wolfram.com/PrimeNumber.html">prime number</a>: an integer <i>greater
 than one</i> that cannot be factored into a product of <i>smaller</i> positive integers.
 Returns {@code false} if {@code n} is zero, one, or a composite number (one which <i>can</i> be
 factored into smaller positive integers).

 <p>To test larger numbers, use {@link LongMath#isPrime} or {@link BigInteger#isProbablePrime}.
@throws IllegalArgumentException if {@code n} is negative
@since 20.0

