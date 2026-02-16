# Class: `DoubleMath`

**Package:** [`com.google.common.math`](README.md)

**Fully Qualified Name:** `com.google.common.math.DoubleMath`

## Description

A class for arithmetic on doubles that is not covered by {@link java.lang.Math}.
@author Louis Wasserman
@since 11.0

## Fields

### `MIN_INT_AS_DOUBLE`

**Type:** `double`

### `MAX_INT_AS_DOUBLE`

**Type:** `double`

### `MIN_LONG_AS_DOUBLE`

**Type:** `double`

### `MAX_LONG_AS_DOUBLE_PLUS_ONE`

**Type:** `double`

### `LN_2`

**Type:** `double`

### `MAX_FACTORIAL`

**Type:** `int`

### `everySixteenthFactorial`

**Type:** `double[]`

## Constructors

### `<init>()`

## Methods

### `roundIntermediate(`double` x, [`java.math.RoundingMode`](../../../../java/math/RoundingMode.md) mode)`

**Returns:** `double`

### `roundToInt(`double` x, [`java.math.RoundingMode`](../../../../java/math/RoundingMode.md) mode)`

**Returns:** `int`

Returns the {@code int} value that is equal to {@code x} rounded with the specified rounding
 mode, if possible.
@throws ArithmeticException if
     <ul>
       <li>{@code x} is infinite or NaN
       <li>{@code x}, after being rounded to a mathematical integer using the specified rounding
           mode, is either less than {@code Integer.MIN_VALUE} or greater than {@code
           Integer.MAX_VALUE}
       <li>{@code x} is not a mathematical integer and {@code mode} is {@link RoundingMode#UNNECESSARY}
     </ul>

### `roundToLong(`double` x, [`java.math.RoundingMode`](../../../../java/math/RoundingMode.md) mode)`

**Returns:** `long`

Returns the {@code long} value that is equal to {@code x} rounded with the specified rounding
 mode, if possible.
@throws ArithmeticException if
     <ul>
       <li>{@code x} is infinite or NaN
       <li>{@code x}, after being rounded to a mathematical integer using the specified rounding
           mode, is either less than {@code Long.MIN_VALUE} or greater than {@code
           Long.MAX_VALUE}
       <li>{@code x} is not a mathematical integer and {@code mode} is {@link RoundingMode#UNNECESSARY}
     </ul>

### `roundToBigInteger(`double` x, [`java.math.RoundingMode`](../../../../java/math/RoundingMode.md) mode)`

**Returns:** [`java.math.BigInteger`](../../../../java/math/BigInteger.md)

Returns the {@code BigInteger} value that is equal to {@code x} rounded with the specified
 rounding mode, if possible.
@throws ArithmeticException if
     <ul>
       <li>{@code x} is infinite or NaN
       <li>{@code x} is not a mathematical integer and {@code mode} is {@link RoundingMode#UNNECESSARY}
     </ul>

### `isPowerOfTwo(`double` x)`

**Returns:** `boolean`

Returns {@code true} if {@code x} is exactly equal to {@code 2^k} for some finite integer
 {@code k}.

### `log2(`double` x)`

**Returns:** `double`

Returns the base 2 logarithm of a double value.

 <p>Special cases:

 <ul>
   <li>If {@code x} is NaN or less than zero, the result is NaN.
   <li>If {@code x} is positive infinity, the result is positive infinity.
   <li>If {@code x} is positive or negative zero, the result is negative infinity.
 </ul>

 <p>The computed result is within 1 ulp of the exact result.

 <p>If the result of this method will be immediately rounded to an {@code int}, {@link #log2(double, RoundingMode)} is faster.

### `log2(`double` x, [`java.math.RoundingMode`](../../../../java/math/RoundingMode.md) mode)`

**Returns:** `int`

Returns the base 2 logarithm of a double value, rounded with the specified rounding mode to an
 {@code int}.

 <p>Regardless of the rounding mode, this is faster than {@code (int) log2(x)}.
@throws IllegalArgumentException if {@code x <= 0.0}, {@code x} is NaN, or {@code x} is
     infinite

### `isMathematicalInteger(`double` x)`

**Returns:** `boolean`

Returns {@code true} if {@code x} represents a mathematical integer.

 <p>This is equivalent to, but not necessarily implemented as, the expression {@code
 !Double.isNaN(x) && !Double.isInfinite(x) && x == Math.rint(x)}.

### `factorial(`int` n)`

**Returns:** `double`

Returns {@code n!}, that is, the product of the first {@code n} positive integers, {@code 1} if
 {@code n == 0}, or {@code n!}, or {@link Double#POSITIVE_INFINITY} if {@code n! >
 Double.MAX_VALUE}.

 <p>The result is within 1 ulp of the true value.
@throws IllegalArgumentException if {@code n < 0}

### `fuzzyEquals(`double` a, `double` b, `double` tolerance)`

**Returns:** `boolean`

Returns {@code true} if {@code a} and {@code b} are within {@code tolerance} of each other.

 <p>Technically speaking, this is equivalent to {@code Math.abs(a - b) <= tolerance ||
 Double.valueOf(a).equals(Double.valueOf(b))}.

 <p>Notable special cases include:

 <ul>
   <li>All NaNs are fuzzily equal.
   <li>If {@code a == b}, then {@code a} and {@code b} are always fuzzily equal.
   <li>Positive and negative zero are always fuzzily equal.
   <li>If {@code tolerance} is zero, and neither {@code a} nor {@code b} is NaN, then {@code a}
       and {@code b} are fuzzily equal if and only if {@code a == b}.
   <li>With {@link Double#POSITIVE_INFINITY} tolerance, all non-NaN values are fuzzily equal.
   <li>With finite tolerance, {@code Double.POSITIVE_INFINITY} and {@code
       Double.NEGATIVE_INFINITY} are fuzzily equal only to themselves.
 </ul>

 <p>This is reflexive and symmetric, but <em>not</em> transitive, so it is <em>not</em> an
 equivalence relation and <em>not</em> suitable for use in {@link Object#equals}
 implementations.
@throws IllegalArgumentException if {@code tolerance} is {@code < 0} or NaN
@since 13.0

### `fuzzyCompare(`double` a, `double` b, `double` tolerance)`

**Returns:** `int`

Compares {@code a} and {@code b} "fuzzily," with a tolerance for nearly-equal values.

 <p>This method is equivalent to {@code fuzzyEquals(a, b, tolerance) ? 0 : Double.compare(a,
 b)}. In particular, like {@link Double#compare(double, double)}, it treats all NaN values as
 equal and greater than all other values (including {@link Double#POSITIVE_INFINITY}).

 <p>This is <em>not</em> a total ordering and is <em>not</em> suitable for use in {@link Comparable#compareTo} implementations. In particular, it is not transitive.
@throws IllegalArgumentException if {@code tolerance} is {@code < 0} or NaN
@since 13.0

### `mean(`double[]` values)`

**Returns:** `double`

Returns the <a href="http://en.wikipedia.org/wiki/Arithmetic_mean">arithmetic mean</a> of
 {@code values}.

 <p>If these values are a sample drawn from a population, this is also an unbiased estimator of
 the arithmetic mean of the population.
@param values a nonempty series of values
@throws IllegalArgumentException if {@code values} is empty or contains any non-finite value
@deprecated Use {@link Stats#meanOf} instead, noting the less strict handling of non-finite
     values.

### `mean(`int[]` values)`

**Returns:** `double`

Returns the <a href="http://en.wikipedia.org/wiki/Arithmetic_mean">arithmetic mean</a> of
 {@code values}.

 <p>If these values are a sample drawn from a population, this is also an unbiased estimator of
 the arithmetic mean of the population.
@param values a nonempty series of values
@throws IllegalArgumentException if {@code values} is empty
@deprecated Use {@link Stats#meanOf} instead, noting the less strict handling of non-finite
     values.

### `mean(`long[]` values)`

**Returns:** `double`

Returns the <a href="http://en.wikipedia.org/wiki/Arithmetic_mean">arithmetic mean</a> of
 {@code values}.

 <p>If these values are a sample drawn from a population, this is also an unbiased estimator of
 the arithmetic mean of the population.
@param values a nonempty series of values, which will be converted to {@code double} values
     (this may cause loss of precision for longs of magnitude over 2^53 (slightly over 9e15))
@throws IllegalArgumentException if {@code values} is empty
@deprecated Use {@link Stats#meanOf} instead, noting the less strict handling of non-finite
     values.

### `mean(`java.lang.Iterable<? extends java.lang.Number>` values)`

**Returns:** `double`

Returns the <a href="http://en.wikipedia.org/wiki/Arithmetic_mean">arithmetic mean</a> of
 {@code values}.

 <p>If these values are a sample drawn from a population, this is also an unbiased estimator of
 the arithmetic mean of the population.
@param values a nonempty series of values, which will be converted to {@code double} values
     (this may cause loss of precision)
@throws IllegalArgumentException if {@code values} is empty or contains any non-finite value
@deprecated Use {@link Stats#meanOf} instead, noting the less strict handling of non-finite
     values.

### `mean([`java.util.Iterator<? extends java.lang.Number>`](../../../../java/util/Iterator.md) values)`

**Returns:** `double`

Returns the <a href="http://en.wikipedia.org/wiki/Arithmetic_mean">arithmetic mean</a> of
 {@code values}.

 <p>If these values are a sample drawn from a population, this is also an unbiased estimator of
 the arithmetic mean of the population.
@param values a nonempty series of values, which will be converted to {@code double} values
     (this may cause loss of precision)
@throws IllegalArgumentException if {@code values} is empty or contains any non-finite value
@deprecated Use {@link Stats#meanOf} instead, noting the less strict handling of non-finite
     values.

### `checkFinite(`double` argument)`

**Returns:** `double`

