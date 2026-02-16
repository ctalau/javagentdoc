# Class: `BigIntegerMath`

**Package:** [`com.google.common.math`](README.md)

**Fully Qualified Name:** `com.google.common.math.BigIntegerMath`

## Description

A class for arithmetic on values of type {@code BigInteger}.

 <p>The implementations of many methods in this class are based on material from Henry S. Warren,
 Jr.'s <i>Hacker's Delight</i>, (Addison Wesley, 2002).

 <p>Similar functionality for {@code int} and for {@code long} can be found in {@link IntMath} and
 {@link LongMath} respectively.
@author Louis Wasserman
@since 11.0

## Fields

### `SQRT2_PRECOMPUTE_THRESHOLD`

**Type:** `int`

### `SQRT2_PRECOMPUTED_BITS`

**Type:** [`java.math.BigInteger`](../../../../java/math/BigInteger.md)

### `LN_10`

**Type:** `double`

### `LN_2`

**Type:** `double`

## Constructors

### `<init>()`

## Methods

### `ceilingPowerOfTwo([`java.math.BigInteger`](../../../../java/math/BigInteger.md) x)`

**Returns:** [`java.math.BigInteger`](../../../../java/math/BigInteger.md)

Returns the smallest power of two greater than or equal to {@code x}. This is equivalent to
 {@code BigInteger.valueOf(2).pow(log2(x, CEILING))}.
@throws IllegalArgumentException if {@code x <= 0}
@since 20.0

### `floorPowerOfTwo([`java.math.BigInteger`](../../../../java/math/BigInteger.md) x)`

**Returns:** [`java.math.BigInteger`](../../../../java/math/BigInteger.md)

Returns the largest power of two less than or equal to {@code x}. This is equivalent to {@code
 BigInteger.valueOf(2).pow(log2(x, FLOOR))}.
@throws IllegalArgumentException if {@code x <= 0}
@since 20.0

### `isPowerOfTwo([`java.math.BigInteger`](../../../../java/math/BigInteger.md) x)`

**Returns:** `boolean`

Returns {@code true} if {@code x} represents a power of two.

### `log2([`java.math.BigInteger`](../../../../java/math/BigInteger.md) x, [`java.math.RoundingMode`](../../../../java/math/RoundingMode.md) mode)`

**Returns:** `int`

Returns the base-2 logarithm of {@code x}, rounded according to the specified rounding mode.
@throws IllegalArgumentException if {@code x <= 0}
@throws ArithmeticException if {@code mode} is {@link RoundingMode#UNNECESSARY} and {@code x}
     is not a power of two

### `log10([`java.math.BigInteger`](../../../../java/math/BigInteger.md) x, [`java.math.RoundingMode`](../../../../java/math/RoundingMode.md) mode)`

**Returns:** `int`

Returns the base-10 logarithm of {@code x}, rounded according to the specified rounding mode.
@throws IllegalArgumentException if {@code x <= 0}
@throws ArithmeticException if {@code mode} is {@link RoundingMode#UNNECESSARY} and {@code x}
     is not a power of ten

### `sqrt([`java.math.BigInteger`](../../../../java/math/BigInteger.md) x, [`java.math.RoundingMode`](../../../../java/math/RoundingMode.md) mode)`

**Returns:** [`java.math.BigInteger`](../../../../java/math/BigInteger.md)

Returns the square root of {@code x}, rounded with the specified rounding mode.
@throws IllegalArgumentException if {@code x < 0}
@throws ArithmeticException if {@code mode} is {@link RoundingMode#UNNECESSARY} and {@code
     sqrt(x)} is not an integer

### `sqrtFloor([`java.math.BigInteger`](../../../../java/math/BigInteger.md) x)`

**Returns:** [`java.math.BigInteger`](../../../../java/math/BigInteger.md)

### `sqrtApproxWithDoubles([`java.math.BigInteger`](../../../../java/math/BigInteger.md) x)`

**Returns:** [`java.math.BigInteger`](../../../../java/math/BigInteger.md)

### `roundToDouble([`java.math.BigInteger`](../../../../java/math/BigInteger.md) x, [`java.math.RoundingMode`](../../../../java/math/RoundingMode.md) mode)`

**Returns:** `double`

Returns {@code x}, rounded to a {@code double} with the specified rounding mode. If {@code x}
 is precisely representable as a {@code double}, its {@code double} value will be returned;
 otherwise, the rounding will choose between the two nearest representable values with {@code
 mode}.

 <p>For the case of {@link RoundingMode#HALF_DOWN}, {@code HALF_UP}, and {@code HALF_EVEN},
 infinite {@code double} values are considered infinitely far away. For example, 2^2000 is not
 representable as a double, but {@code roundToDouble(BigInteger.valueOf(2).pow(2000), HALF_UP)}
 will return {@code Double.MAX_VALUE}, not {@code Double.POSITIVE_INFINITY}.

 <p>For the case of {@link RoundingMode#HALF_EVEN}, this implementation uses the IEEE 754
 default rounding mode: if the two nearest representable values are equally near, the one with
 the least significant bit zero is chosen. (In such cases, both of the nearest representable
 values are even integers; this method returns the one that is a multiple of a greater power of
 two.)
@throws ArithmeticException if {@code mode} is {@link RoundingMode#UNNECESSARY} and {@code x}
     is not precisely representable as a {@code double}
@since 30.0

### `divide([`java.math.BigInteger`](../../../../java/math/BigInteger.md) p, [`java.math.BigInteger`](../../../../java/math/BigInteger.md) q, [`java.math.RoundingMode`](../../../../java/math/RoundingMode.md) mode)`

**Returns:** [`java.math.BigInteger`](../../../../java/math/BigInteger.md)

Returns the result of dividing {@code p} by {@code q}, rounding using the specified {@code
 RoundingMode}.
@throws ArithmeticException if {@code q == 0}, or if {@code mode == UNNECESSARY} and {@code a}
     is not an integer multiple of {@code b}

### `factorial(`int` n)`

**Returns:** [`java.math.BigInteger`](../../../../java/math/BigInteger.md)

Returns {@code n!}, that is, the product of the first {@code n} positive integers, or {@code 1}
 if {@code n == 0}.

 <p><b>Warning:</b> the result takes <i>O(n log n)</i> space, so use cautiously.

 <p>This uses an efficient binary recursive algorithm to compute the factorial with balanced
 multiplies. It also removes all the 2s from the intermediate products (shifting them back in at
 the end).
@throws IllegalArgumentException if {@code n < 0}

### `listProduct([`java.util.List<java.math.BigInteger>`](../../../../java/util/List.md) nums)`

**Returns:** [`java.math.BigInteger`](../../../../java/math/BigInteger.md)

### `listProduct([`java.util.List<java.math.BigInteger>`](../../../../java/util/List.md) nums, `int` start, `int` end)`

**Returns:** [`java.math.BigInteger`](../../../../java/math/BigInteger.md)

### `binomial(`int` n, `int` k)`

**Returns:** [`java.math.BigInteger`](../../../../java/math/BigInteger.md)

Returns {@code n} choose {@code k}, also known as the binomial coefficient of {@code n} and
 {@code k}, that is, {@code n! / (k! (n - k)!)}.

 <p><b>Warning:</b> the result can take as much as <i>O(k log n)</i> space.
@throws IllegalArgumentException if {@code n < 0}, {@code k < 0}, or {@code k > n}

### `fitsInLong([`java.math.BigInteger`](../../../../java/math/BigInteger.md) x)`

**Returns:** `boolean`

