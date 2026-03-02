# Class: `PairedStatsAccumulator`

**Package:** [`com.google.common.math`](README.md)

**Fully Qualified Name:** `com.google.common.math.PairedStatsAccumulator`

## Description

points on a plane) and tracks some
 basic statistics over all the values added so far. This class is not thread safe.

## Fields

### `xStats`

**Type:** [`com.google.common.math.StatsAccumulator`](./StatsAccumulator.md)

### `yStats`

**Type:** [`com.google.common.math.StatsAccumulator`](./StatsAccumulator.md)

### `sumOfProductsOfDeltas`

**Type:** `double`

## Constructors

### `<init>()`

## Methods

### `add(double x, double y)`

**Parameters:**
- `x` (`double`)
- `y` (`double`)

**Returns:** `void`

### `addAll(PairedStats values)`

**Parameters:**
- `values` ([`com.google.common.math.PairedStats`](./PairedStats.md))

**Returns:** `void`

### `snapshot()`

**Returns:** [`com.google.common.math.PairedStats`](./PairedStats.md)

### `count()`

**Returns:** `long`

### `xStats()`

**Returns:** [`com.google.common.math.Stats`](./Stats.md)

### `yStats()`

**Returns:** [`com.google.common.math.Stats`](./Stats.md)

### `populationCovariance()`

The count must be non-zero.

 
This is guaranteed to return zero if the dataset contains a single pair of finite values. It
 is not guaranteed to return zero when the dataset consists of the same pair of values multiple
 times, due to numerical errors.

 Non-finite values

 
If the dataset contains any non-finite values (Double#POSITIVE_INFINITY, Double#NEGATIVE_INFINITY, or Double#NaN) then the result is Double#NaN.

**Returns:** `double`

### `sampleCovariance()`

The count must be greater than one.

 
This is not guaranteed to return zero when the dataset consists of the same pair of values
 multiple times, due to numerical errors.

 Non-finite values

 
If the dataset contains any non-finite values (Double#POSITIVE_INFINITY, Double#NEGATIVE_INFINITY, or Double#NaN) then the result is Double#NaN.

**Returns:** `double`

### `pearsonsCorrelationCoefficient()`

The count must greater than one, and
 the x and y values must both have non-zero population variance (i.e. 
 xStats().populationVariance() > 0.0 && yStats().populationVariance() > 0.0). The result is not
 guaranteed to be exactly +/-1 even when the data are perfectly (anti-)correlated, due to
 numerical errors. However, it is guaranteed to be in the inclusive range [-1, +1].

 Non-finite values

 
If the dataset contains any non-finite values (Double#POSITIVE_INFINITY, Double#NEGATIVE_INFINITY, or Double#NaN) then the result is Double#NaN.

**Returns:** `double`

### `leastSquaresFit()`

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

**Returns:** [`com.google.common.math.LinearTransformation`](./LinearTransformation.md)

### `ensurePositive(double value)`

**Parameters:**
- `value` (`double`)

**Returns:** `double`

### `ensureInUnitRange(double value)`

**Parameters:**
- `value` (`double`)

**Returns:** `double`

