# Class: `DoubleMath`

**Package:** [`com.google.common.math`](README.md)

**Fully Qualified Name:** `com.google.common.math.DoubleMath`

## Description

A class for arithmetic on doubles that is not covered by `java.lang.Math`.
**Author:** Louis Wasserman
**Since:** 11.0

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

### `roundIntermediate(`double` x, `java.math.RoundingMode` mode)`

**Returns:** `double`

### `roundToInt(`double` x, `java.math.RoundingMode` mode)`

**Returns:** `int`

Returns the `int` value that is equal to `x` rounded with the specified rounding
 mode, if possible.
@throws ArithmeticException if
     <ul>
       <li>`x` is infinite or NaN
       <li>`x`, after being rounded to a mathematical integer using the specified rounding
           mode, is either less than `Integer.MIN_VALUE` or greater than `Integer.MAX_VALUE`
       <li>`x` is not a mathematical integer and `mode` is `RoundingMode.UNNECESSARY`
     </ul>

### `roundToLong(`double` x, `java.math.RoundingMode` mode)`

**Returns:** `long`

Returns the `long` value that is equal to `x` rounded with the specified rounding
 mode, if possible.
@throws ArithmeticException if
     <ul>
       <li>`x` is infinite or NaN
       <li>`x`, after being rounded to a mathematical integer using the specified rounding
           mode, is either less than `Long.MIN_VALUE` or greater than `Long.MAX_VALUE`
       <li>`x` is not a mathematical integer and `mode` is `RoundingMode.UNNECESSARY`
     </ul>

### `roundToBigInteger(`double` x, `java.math.RoundingMode` mode)`

**Returns:** `java.math.BigInteger`

Returns the `BigInteger` value that is equal to `x` rounded with the specified
 rounding mode, if possible.
@throws ArithmeticException if
     <ul>
       <li>`x` is infinite or NaN
       <li>`x` is not a mathematical integer and `mode` is `RoundingMode.UNNECESSARY`
     </ul>

### `isPowerOfTwo(`double` x)`

**Returns:** `boolean`

Returns `true` if `x` is exactly equal to `2^k` for some finite integer
 `k`.

### `log2(`double` x)`

**Returns:** `double`

Returns the base 2 logarithm of a double value.

 <p>Special cases:

 <ul>
   <li>If `x` is NaN or less than zero, the result is NaN.
   <li>If `x` is positive infinity, the result is positive infinity.
   <li>If `x` is positive or negative zero, the result is negative infinity.
 </ul>

 <p>The computed result is within 1 ulp of the exact result.

 <p>If the result of this method will be immediately rounded to an `int`, `log2(double, RoundingMode)` is faster.

### `log2(`double` x, `java.math.RoundingMode` mode)`

**Returns:** `int`

Returns the base 2 logarithm of a double value, rounded with the specified rounding mode to an
 `int`.

 <p>Regardless of the rounding mode, this is faster than `(int) log2(x)`.
@throws IllegalArgumentException if `x <= 0.0`, `x` is NaN, or `x` is
     infinite

### `isMathematicalInteger(`double` x)`

**Returns:** `boolean`

Returns `true` if `x` represents a mathematical integer.

 <p>This is equivalent to, but not necessarily implemented as, the expression `!Double.isNaN(x) && !Double.isInfinite(x) && x == Math.rint(x)`.

### `factorial(`int` n)`

**Returns:** `double`

Returns `n!`, that is, the product of the first `n` positive integers, `1` if
 `n == 0`, or `n!`, or `Double.POSITIVE_INFINITY` if `n! >
 Double.MAX_VALUE`.

 <p>The result is within 1 ulp of the true value.
@throws IllegalArgumentException if `n < 0`

### `fuzzyEquals(`double` a, `double` b, `double` tolerance)`

**Returns:** `boolean`

Returns `true` if `a` and `b` are within `tolerance` of each other.

 <p>Technically speaking, this is equivalent to `Math.abs(a - b) <= tolerance ||
 Double.valueOf(a).equals(Double.valueOf(b))`.

 <p>Notable special cases include:

 <ul>
   <li>All NaNs are fuzzily equal.
   <li>If `a == b`, then `a` and `b` are always fuzzily equal.
   <li>Positive and negative zero are always fuzzily equal.
   <li>If `tolerance` is zero, and neither `a` nor `b` is NaN, then `a`
       and `b` are fuzzily equal if and only if `a == b`.
   <li>With `Double.POSITIVE_INFINITY` tolerance, all non-NaN values are fuzzily equal.
   <li>With finite tolerance, `Double.POSITIVE_INFINITY` and `Double.NEGATIVE_INFINITY` are fuzzily equal only to themselves.
 </ul>

 <p>This is reflexive and symmetric, but <em>not</em> transitive, so it is <em>not</em> an
 equivalence relation and <em>not</em> suitable for use in `Object.equals`
 implementations.
@throws IllegalArgumentException if `tolerance` is `< 0` or NaN
**Since:** 13.0

### `fuzzyCompare(`double` a, `double` b, `double` tolerance)`

**Returns:** `int`

Compares `a` and `b` "fuzzily," with a tolerance for nearly-equal values.

 <p>This method is equivalent to `fuzzyEquals(a, b, tolerance) ? 0 : Double.compare(a,
 b)`. In particular, like `Double.compare(double, double)`, it treats all NaN values as
 equal and greater than all other values (including `Double.POSITIVE_INFINITY`).

 <p>This is <em>not</em> a total ordering and is <em>not</em> suitable for use in `Comparable.compareTo` implementations. In particular, it is not transitive.
@throws IllegalArgumentException if `tolerance` is `< 0` or NaN
**Since:** 13.0

### `mean(`double[]` values)`

**Returns:** `double`

Returns the <a href="http://en.wikipedia.org/wiki/Arithmetic_mean">arithmetic mean</a> of
 `values`.

 <p>If these values are a sample drawn from a population, this is also an unbiased estimator of
 the arithmetic mean of the population.
@param values a nonempty series of values
@throws IllegalArgumentException if `values` is empty or contains any non-finite value
**Deprecated:** Use `Stats.meanOf` instead, noting the less strict handling of non-finite
     values.

### `mean(`int[]` values)`

**Returns:** `double`

Returns the <a href="http://en.wikipedia.org/wiki/Arithmetic_mean">arithmetic mean</a> of
 `values`.

 <p>If these values are a sample drawn from a population, this is also an unbiased estimator of
 the arithmetic mean of the population.
@param values a nonempty series of values
@throws IllegalArgumentException if `values` is empty
**Deprecated:** Use `Stats.meanOf` instead, noting the less strict handling of non-finite
     values.

### `mean(`long[]` values)`

**Returns:** `double`

Returns the <a href="http://en.wikipedia.org/wiki/Arithmetic_mean">arithmetic mean</a> of
 `values`.

 <p>If these values are a sample drawn from a population, this is also an unbiased estimator of
 the arithmetic mean of the population.
@param values a nonempty series of values, which will be converted to `double` values
     (this may cause loss of precision for longs of magnitude over 2^53 (slightly over 9e15))
@throws IllegalArgumentException if `values` is empty
**Deprecated:** Use `Stats.meanOf` instead, noting the less strict handling of non-finite
     values.

### `mean(`java.lang.Iterable<? extends java.lang.Number>` values)`

**Returns:** `double`

Returns the <a href="http://en.wikipedia.org/wiki/Arithmetic_mean">arithmetic mean</a> of
 `values`.

 <p>If these values are a sample drawn from a population, this is also an unbiased estimator of
 the arithmetic mean of the population.
@param values a nonempty series of values, which will be converted to `double` values
     (this may cause loss of precision)
@throws IllegalArgumentException if `values` is empty or contains any non-finite value
**Deprecated:** Use `Stats.meanOf` instead, noting the less strict handling of non-finite
     values.

### `mean(`java.util.Iterator<? extends java.lang.Number>` values)`

**Returns:** `double`

Returns the <a href="http://en.wikipedia.org/wiki/Arithmetic_mean">arithmetic mean</a> of
 `values`.

 <p>If these values are a sample drawn from a population, this is also an unbiased estimator of
 the arithmetic mean of the population.
@param values a nonempty series of values, which will be converted to `double` values
     (this may cause loss of precision)
@throws IllegalArgumentException if `values` is empty or contains any non-finite value
**Deprecated:** Use `Stats.meanOf` instead, noting the less strict handling of non-finite
     values.

### `checkFinite(`double` argument)`

**Returns:** `double`

