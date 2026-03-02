# Class: `PairedStats`

**Package:** [`com.google.common.math`](README.md)

**Fully Qualified Name:** `com.google.common.math.PairedStats`

**Implements:** `java.io.Serializable`

## Description

points on a plane). Build instances with PairedStatsAccumulator#snapshot.

## Fields

### `xStats`

**Type:** [`com.google.common.math.Stats`](./Stats.md)

### `yStats`

**Type:** [`com.google.common.math.Stats`](./Stats.md)

### `sumOfProductsOfDeltas`

**Type:** `double`

### `BYTES`

**Type:** `int`

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(com.google.common.math.Stats xStats, com.google.common.math.Stats yStats, double sumOfProductsOfDeltas)`

Users should use PairedStatsAccumulator#snapshot.

 
To ensure that the created instance obeys its contract, the parameters should satisfy the
 following constraints. This is the callers responsibility and is not enforced here.

 

   - Both xStats and yStats must have the same count.
   - If that count is 1, sumOfProductsOfDeltas must be exactly 0.0.
   - If that count is more than 1, sumOfProductsOfDeltas must be finite.

**Parameters:**
- `xStats` ([`com.google.common.math.Stats`](./Stats.md))
- `yStats` ([`com.google.common.math.Stats`](./Stats.md))
- `sumOfProductsOfDeltas` (`double`)

## Methods

### `count()`

**Returns:** `long`

### `xStats()`

**Returns:** [`com.google.common.math.Stats`](./Stats.md)

### `yStats()`

**Returns:** [`com.google.common.math.Stats`](./Stats.md)

### `populationCovariance()`

**Returns:** `double`

The count must be non-zero.

 
This is guaranteed to return zero if the dataset contains a single pair of finite values. It
 is not guaranteed to return zero when the dataset consists of the same pair of values multiple
 times, due to numerical errors.

 Non-finite values

 
If the dataset contains any non-finite values (Double#POSITIVE_INFINITY, Double#NEGATIVE_INFINITY, or Double#NaN) then the result is Double#NaN.

### `sampleCovariance()`

**Returns:** `double`

The count must be greater than one.

 
This is not guaranteed to return zero when the dataset consists of the same pair of values
 multiple times, due to numerical errors.

 Non-finite values

 
If the dataset contains any non-finite values (Double#POSITIVE_INFINITY, Double#NEGATIVE_INFINITY, or Double#NaN) then the result is Double#NaN.

### `pearsonsCorrelationCoefficient()`

**Returns:** `double`

The count must greater than one, and
 the x and y values must both have non-zero population variance (i.e. 
 xStats().populationVariance() > 0.0 && yStats().populationVariance() > 0.0). The result is not
 guaranteed to be exactly +/-1 even when the data are perfectly (anti-)correlated, due to
 numerical errors. However, it is guaranteed to be in the inclusive range [-1, +1].

 Non-finite values

 
If the dataset contains any non-finite values (Double#POSITIVE_INFINITY, Double#NEGATIVE_INFINITY, or Double#NaN) then the result is Double#NaN.

### `leastSquaresFit()`

**Returns:** [`com.google.common.math.LinearTransformation`](./LinearTransformation.md)

The count must be greater than one, and
 either the x or y data must have a non-zero population variance (i.e. 
 xStats().populationVariance() > 0.0 || yStats().populationVariance() > 0.0). The result is
 guaranteed to be horizontal if there is variance in the x data but not the y
 data, and vertical if there is variance in the y data but not the x data.

 
This fit minimizes the root-mean-square error in y as a function of x. This
 error is defined as the square root of the mean of the squares of the differences between the
 actual y values of the data and the values predicted by the fit for the x
 values (i.e. it is the square root of the mean of the squares of the vertical distances between
 the data points and the best fit line). For this fit, this error is a fraction sqrt(1 -
 R*R) of the population standard deviation of y, where R is the Pearson's
 correlation coefficient (as given by #pearsonsCorrelationCoefficient()).

 
The corresponding root-mean-square error in x as a function of y is a
 fraction sqrt(1/(R*R) - 1) of the population standard deviation of x. This fit
 does not normally minimize that error: to do that, you should swap the roles of x and
 y.

 Non-finite values

 
If the dataset contains any non-finite values (Double#POSITIVE_INFINITY, Double#NEGATIVE_INFINITY, or Double#NaN) then the result is LinearTransformation#forNaN().

### `equals(java.lang.Object obj)`

**Returns:** `boolean`

**Note:** This tests exact equality of the calculated statistics, including the floating
 point values. Two instances are guaranteed to be considered equal if one is copied from the
 other using second = new PairedStatsAccumulator().addAll(first).snapshot(), if both
 were obtained by calling snapshot() on the same PairedStatsAccumulator without
 adding any values in between the two calls, or if one is obtained from the other after
 round-tripping through java serialization. However, floating point rounding errors mean that it
 may be false for some instances where the statistics are mathematically equal, including
 instances constructed from the same values in a different order... or (in the general case)
 even in the same order. (It is guaranteed to return true for instances constructed from the
 same values in the same order if strictfp is in effect, or if the system architecture
 guarantees strictfp-like semantics.)

**Parameters:**
- `obj` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

**Note:** This hash code is consistent with exact equality of the calculated statistics,
 including the floating point values. See the note on #equals for details.

### `toString()`

**Returns:** `java.lang.String`

### `sumOfProductsOfDeltas()`

**Returns:** `double`

### `ensurePositive(double value)`

**Returns:** `double`

**Parameters:**
- `value` (`double`)

### `ensureInUnitRange(double value)`

**Returns:** `double`

**Parameters:**
- `value` (`double`)

### `toByteArray()`

**Returns:** `byte[]`

**Note:** No guarantees are made regarding stability of the representation between
 versions.

### `fromByteArray(byte[] byteArray)`

**Returns:** [`com.google.common.math.PairedStats`](./PairedStats.md)

**Note:** No guarantees are made regarding stability of the representation between
 versions.

**Parameters:**
- `byteArray` (`byte[]`)

