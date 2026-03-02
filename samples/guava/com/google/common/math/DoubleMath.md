# Class: `DoubleMath`

**Package:** [`com.google.common.math`](README.md)

**Fully Qualified Name:** `com.google.common.math.DoubleMath`

## Description

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

### `roundIntermediate(double x, java.math.RoundingMode mode)`

**Returns:** `double`

**Parameters:**
- `x` (`double`)
- `mode` (`java.math.RoundingMode`)

### `roundToInt(double x, java.math.RoundingMode mode)`

**Returns:** `int`

**Parameters:**
- `x` (`double`)
- `mode` (`java.math.RoundingMode`)

### `roundToLong(double x, java.math.RoundingMode mode)`

**Returns:** `long`

**Parameters:**
- `x` (`double`)
- `mode` (`java.math.RoundingMode`)

### `roundToBigInteger(double x, java.math.RoundingMode mode)`

**Returns:** `java.math.BigInteger`

**Parameters:**
- `x` (`double`)
- `mode` (`java.math.RoundingMode`)

### `isPowerOfTwo(double x)`

**Returns:** `boolean`

**Parameters:**
- `x` (`double`)

### `log2(double x)`

**Returns:** `double`

Special cases:

 

   - If x is NaN or less than zero, the result is NaN.
   - If x is positive infinity, the result is positive infinity.
   - If x is positive or negative zero, the result is negative infinity.
 


 
The computed result is within 1 ulp of the exact result.

 
If the result of this method will be immediately rounded to an int, #log2(double, RoundingMode) is faster.

**Parameters:**
- `x` (`double`)

### `log2(double x, java.math.RoundingMode mode)`

**Returns:** `int`

Regardless of the rounding mode, this is faster than (int) log2(x).

**Parameters:**
- `x` (`double`)
- `mode` (`java.math.RoundingMode`)

### `isMathematicalInteger(double x)`

**Returns:** `boolean`

This is equivalent to, but not necessarily implemented as, the expression 
 !Double.isNaN(x) && !Double.isInfinite(x) && x == Math.rint(x).

**Parameters:**
- `x` (`double`)

### `factorial(int n)`

**Returns:** `double`

The result is within 1 ulp of the true value.

**Parameters:**
- `n` (`int`)

### `fuzzyEquals(double a, double b, double tolerance)`

**Returns:** `boolean`

Technically speaking, this is equivalent to Math.abs(a - b) <= tolerance ||
 Double.valueOf(a).equals(Double.valueOf(b)).

 
Notable special cases include:

 

   - All NaNs are fuzzily equal.
   - If a == b, then a and b are always fuzzily equal.
   - Positive and negative zero are always fuzzily equal.
   - If tolerance is zero, and neither a nor b is NaN, then a
       and b are fuzzily equal if and only if a == b.
   - With Double#POSITIVE_INFINITY tolerance, all non-NaN values are fuzzily equal.
   - With finite tolerance, Double.POSITIVE_INFINITY and 
       Double.NEGATIVE_INFINITY are fuzzily equal only to themselves.
 


 
This is reflexive and symmetric, but *not* transitive, so it is *not* an
 equivalence relation and *not* suitable for use in Object#equals
 implementations.

**Parameters:**
- `a` (`double`)
- `b` (`double`)
- `tolerance` (`double`)

### `fuzzyCompare(double a, double b, double tolerance)`

**Returns:** `int`

This method is equivalent to fuzzyEquals(a, b, tolerance) ? 0 : Double.compare(a,
 b). In particular, like Double#compare(double, double), it treats all NaN values as
 equal and greater than all other values (including Double#POSITIVE_INFINITY).

 
This is *not* a total ordering and is *not* suitable for use in Comparable#compareTo implementations. In particular, it is not transitive.

**Parameters:**
- `a` (`double`)
- `b` (`double`)
- `tolerance` (`double`)

### `mean(double[] values)`

**Returns:** `double`

If these values are a sample drawn from a population, this is also an unbiased estimator of
 the arithmetic mean of the population.

**Parameters:**
- `values` (`double[]`): a nonempty series of values

### `mean(int[] values)`

**Returns:** `double`

If these values are a sample drawn from a population, this is also an unbiased estimator of
 the arithmetic mean of the population.

**Parameters:**
- `values` (`int[]`): a nonempty series of values

### `mean(long[] values)`

**Returns:** `double`

If these values are a sample drawn from a population, this is also an unbiased estimator of
 the arithmetic mean of the population.

**Parameters:**
- `values` (`long[]`): a nonempty series of values, which will be converted to double values
     (this may cause loss of precision for longs of magnitude over 2^53 (slightly over 9e15))

### `mean(java.lang.Iterable<? extends java.lang.Number> values)`

**Returns:** `double`

If these values are a sample drawn from a population, this is also an unbiased estimator of
 the arithmetic mean of the population.

**Parameters:**
- `values` (`java.lang.Iterable<? extends java.lang.Number>`): a nonempty series of values, which will be converted to double values
     (this may cause loss of precision)

### `mean(java.util.Iterator<? extends java.lang.Number> values)`

**Returns:** `double`

If these values are a sample drawn from a population, this is also an unbiased estimator of
 the arithmetic mean of the population.

**Parameters:**
- `values` (`java.util.Iterator<? extends java.lang.Number>`): a nonempty series of values, which will be converted to double values
     (this may cause loss of precision)

### `checkFinite(double argument)`

**Returns:** `double`

**Parameters:**
- `argument` (`double`)

