# Class: `PairedStats`

**Package:** [`com.google.common.math`](README.md)

**Fully Qualified Name:** `com.google.common.math.PairedStats`

**Implements:** `java.io.Serializable`

## Description

An immutable value object capturing some basic statistics about a collection of paired double
 values (e.g. points on a plane). Build instances with `PairedStatsAccumulator.snapshot`.
**Author:** Pete Gillin
**Since:** 20.0

## Fields

### `xStats`

**Type:** [`com.google.common.math.Stats`](./Stats.md)

### `yStats`

**Type:** [`com.google.common.math.Stats`](./Stats.md)

### `sumOfProductsOfDeltas`

**Type:** `double`

### `BYTES`

**Type:** `int`

The size of byte array representation in bytes.

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>([`com.google.common.math.Stats`](./Stats.md) xStats, [`com.google.common.math.Stats`](./Stats.md) yStats, `double` sumOfProductsOfDeltas)`

Internal constructor. Users should use `PairedStatsAccumulator.snapshot`.

 <p>To ensure that the created instance obeys its contract, the parameters should satisfy the
 following constraints. This is the callers responsibility and is not enforced here.

 <ul>
   <li>Both `xStats` and `yStats` must have the same `count`.
   <li>If that `count` is 1, `sumOfProductsOfDeltas` must be exactly 0.0.
   <li>If that `count` is more than 1, `sumOfProductsOfDeltas` must be finite.
 </ul>

## Methods

### `count()`

**Returns:** `long`

Returns the number of pairs in the dataset.

### `xStats()`

**Returns:** [`com.google.common.math.Stats`](./Stats.md)

Returns the statistics on the `x` values alone.

### `yStats()`

**Returns:** [`com.google.common.math.Stats`](./Stats.md)

Returns the statistics on the `y` values alone.

### `populationCovariance()`

**Returns:** `double`

Returns the population covariance of the values. The count must be non-zero.

 <p>This is guaranteed to return zero if the dataset contains a single pair of finite values. It
 is not guaranteed to return zero when the dataset consists of the same pair of values multiple
 times, due to numerical errors.

 <h3>Non-finite values</h3>

 <p>If the dataset contains any non-finite values (`Double.POSITIVE_INFINITY`, `Double.NEGATIVE_INFINITY`, or `Double.NaN`) then the result is `Double.NaN`.
@throws IllegalStateException if the dataset is empty

### `sampleCovariance()`

**Returns:** `double`

Returns the sample covariance of the values. The count must be greater than one.

 <p>This is not guaranteed to return zero when the dataset consists of the same pair of values
 multiple times, due to numerical errors.

 <h3>Non-finite values</h3>

 <p>If the dataset contains any non-finite values (`Double.POSITIVE_INFINITY`, `Double.NEGATIVE_INFINITY`, or `Double.NaN`) then the result is `Double.NaN`.
@throws IllegalStateException if the dataset is empty or contains a single pair of values

### `pearsonsCorrelationCoefficient()`

**Returns:** `double`

Returns the <a href="http://mathworld.wolfram.com/CorrelationCoefficient.html">Pearson's or
 product-moment correlation coefficient</a> of the values. The count must greater than one, and
 the `x` and `y` values must both have non-zero population variance (i.e. `xStats().populationVariance() > 0.0 && yStats().populationVariance() > 0.0`). The result is not
 guaranteed to be exactly +/-1 even when the data are perfectly (anti-)correlated, due to
 numerical errors. However, it is guaranteed to be in the inclusive range [-1, +1].

 <h3>Non-finite values</h3>

 <p>If the dataset contains any non-finite values (`Double.POSITIVE_INFINITY`, `Double.NEGATIVE_INFINITY`, or `Double.NaN`) then the result is `Double.NaN`.
@throws IllegalStateException if the dataset is empty or contains a single pair of values, or
     either the `x` and `y` dataset has zero population variance

### `leastSquaresFit()`

**Returns:** [`com.google.common.math.LinearTransformation`](./LinearTransformation.md)

Returns a linear transformation giving the best fit to the data according to <a href="http://mathworld.wolfram.com/LeastSquaresFitting.html">Ordinary Least Squares linear
 regression</a> of `y` as a function of `x`. The count must be greater than one, and
 either the `x` or `y` data must have a non-zero population variance (i.e. `xStats().populationVariance() > 0.0 || yStats().populationVariance() > 0.0`). The result is
 guaranteed to be horizontal if there is variance in the `x` data but not the `y`
 data, and vertical if there is variance in the `y` data but not the `x` data.

 <p>This fit minimizes the root-mean-square error in `y` as a function of `x`. This
 error is defined as the square root of the mean of the squares of the differences between the
 actual `y` values of the data and the values predicted by the fit for the `x`
 values (i.e. it is the square root of the mean of the squares of the vertical distances between
 the data points and the best fit line). For this fit, this error is a fraction `sqrt(1 -
 R*R)` of the population standard deviation of `y`, where `R` is the Pearson's
 correlation coefficient (as given by `pearsonsCorrelationCoefficient()`).

 <p>The corresponding root-mean-square error in `x` as a function of `y` is a
 fraction `sqrt(1/(R*R) - 1)` of the population standard deviation of `x`. This fit
 does not normally minimize that error: to do that, you should swap the roles of `x` and
 `y`.

 <h3>Non-finite values</h3>

 <p>If the dataset contains any non-finite values (`Double.POSITIVE_INFINITY`, `Double.NEGATIVE_INFINITY`, or `Double.NaN`) then the result is `LinearTransformation.forNaN()`.
@throws IllegalStateException if the dataset is empty or contains a single pair of values, or
     both the `x` and `y` dataset must have zero population variance

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

{@inheritDoc}

 <p><b>Note:</b> This tests exact equality of the calculated statistics, including the floating
 point values. Two instances are guaranteed to be considered equal if one is copied from the
 other using `second = new PairedStatsAccumulator().addAll(first).snapshot()`, if both
 were obtained by calling `snapshot()` on the same `PairedStatsAccumulator` without
 adding any values in between the two calls, or if one is obtained from the other after
 round-tripping through java serialization. However, floating point rounding errors mean that it
 may be false for some instances where the statistics are mathematically equal, including
 instances constructed from the same values in a different order... or (in the general case)
 even in the same order. (It is guaranteed to return true for instances constructed from the
 same values in the same order if `strictfp` is in effect, or if the system architecture
 guarantees `strictfp`-like semantics.)

### `hashCode()`

**Returns:** `int`

{@inheritDoc}

 <p><b>Note:</b> This hash code is consistent with exact equality of the calculated statistics,
 including the floating point values. See the note on `equals` for details.

### `toString()`

**Returns:** `java.lang.String`

### `sumOfProductsOfDeltas()`

**Returns:** `double`

### `ensurePositive(`double` value)`

**Returns:** `double`

### `ensureInUnitRange(`double` value)`

**Returns:** `double`

### `toByteArray()`

**Returns:** `byte[]`

Gets a byte array representation of this instance.

 <p><b>Note:</b> No guarantees are made regarding stability of the representation between
 versions.

### `fromByteArray(`byte[]` byteArray)`

**Returns:** [`com.google.common.math.PairedStats`](./PairedStats.md)

Creates a `PairedStats` instance from the given byte representation which was obtained by
 `toByteArray`.

 <p><b>Note:</b> No guarantees are made regarding stability of the representation between
 versions.

