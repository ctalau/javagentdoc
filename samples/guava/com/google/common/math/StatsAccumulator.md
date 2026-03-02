# Class: `StatsAccumulator`

**Package:** [`com.google.common.math`](README.md)

**Fully Qualified Name:** `com.google.common.math.StatsAccumulator`

## Description

The values may be added singly or in groups. This class is not thread safe.

## Fields

### `count`

**Type:** `long`

### `mean`

**Type:** `double`

### `sumOfSquaresOfDeltas`

**Type:** `double`

### `min`

**Type:** `double`

### `max`

**Type:** `double`

## Constructors

### `<init>()`

## Methods

### `add(double value)`

**Parameters:**
- `value` (`double`)

**Returns:** `void`

### `addAll(Iterable<? extends Number> values)`

**Parameters:**
- `values` (`java.lang.Iterable<? extends java.lang.Number>`): a series of values, which will be converted to double values (this may
       cause loss of precision)

**Returns:** `void`

### `addAll(Iterator<? extends Number> values)`

**Parameters:**
- `values` (`java.util.Iterator<? extends java.lang.Number>`): a series of values, which will be converted to double values (this may
       cause loss of precision)

**Returns:** `void`

### `addAll(double[] values)`

**Parameters:**
- `values` (`double[]`): a series of values

**Returns:** `void`

### `addAll(int[] values)`

**Parameters:**
- `values` (`int[]`): a series of values

**Returns:** `void`

### `addAll(long[] values)`

**Parameters:**
- `values` (`long[]`): a series of values, which will be converted to double values (this may
       cause loss of precision for longs of magnitude over 2^53 (slightly over 9e15))

**Returns:** `void`

### `addAll(DoubleStream values)`

The stream will be completely consumed by this method.

**Parameters:**
- `values` (`java.util.stream.DoubleStream`): a series of values

**Returns:** `void`

### `addAll(IntStream values)`

The stream will be completely consumed by this method.

**Parameters:**
- `values` (`java.util.stream.IntStream`): a series of values

**Returns:** `void`

### `addAll(LongStream values)`

The stream will be completely consumed by this method.

**Parameters:**
- `values` (`java.util.stream.LongStream`): a series of values, which will be converted to double values (this may
       cause loss of precision for longs of magnitude over 2^53 (slightly over 9e15))

**Returns:** `void`

### `addAll(Stats values)`

**Parameters:**
- `values` ([`com.google.common.math.Stats`](./Stats.md))

**Returns:** `void`

### `addAll(StatsAccumulator values)`

**Parameters:**
- `values` ([`com.google.common.math.StatsAccumulator`](./StatsAccumulator.md))

**Returns:** `void`

### `merge(long otherCount, double otherMean, double otherSumOfSquaresOfDeltas, double otherMin, double otherMax)`

**Parameters:**
- `otherCount` (`long`)
- `otherMean` (`double`)
- `otherSumOfSquaresOfDeltas` (`double`)
- `otherMin` (`double`)
- `otherMax` (`double`)

**Returns:** `void`

### `snapshot()`

**Returns:** [`com.google.common.math.Stats`](./Stats.md)

### `count()`

**Returns:** `long`

### `mean()`

The count must be non-zero.

 
If these values are a sample drawn from a population, this is also an unbiased estimator of
 the arithmetic mean of the population.

 Non-finite values

 
If the dataset contains Double#NaN then the result is Double#NaN. If it
 contains both Double#POSITIVE_INFINITY and Double#NEGATIVE_INFINITY then the
 result is Double#NaN. If it contains Double#POSITIVE_INFINITY and finite values
 only or Double#POSITIVE_INFINITY only, the result is Double#POSITIVE_INFINITY.
 If it contains Double#NEGATIVE_INFINITY and finite values only or Double#NEGATIVE_INFINITY only, the result is Double#NEGATIVE_INFINITY.

**Returns:** `double`

### `sum()`

Non-finite values

 
If the dataset contains Double#NaN then the result is Double#NaN. If it
 contains both Double#POSITIVE_INFINITY and Double#NEGATIVE_INFINITY then the
 result is Double#NaN. If it contains Double#POSITIVE_INFINITY and finite values
 only or Double#POSITIVE_INFINITY only, the result is Double#POSITIVE_INFINITY.
 If it contains Double#NEGATIVE_INFINITY and finite values only or Double#NEGATIVE_INFINITY only, the result is Double#NEGATIVE_INFINITY.

**Returns:** `double`

### `populationVariance()`

The count must be non-zero.

 
This is guaranteed to return zero if the dataset contains only exactly one finite value. It
 is not guaranteed to return zero when the dataset consists of the same value multiple times,
 due to numerical errors. However, it is guaranteed never to return a negative result.

 Non-finite values

 
If the dataset contains any non-finite values (Double#POSITIVE_INFINITY, Double#NEGATIVE_INFINITY, or Double#NaN) then the result is Double#NaN.

**Returns:** `double`

### `populationStandardDeviation()`

The count must be non-zero.

 
This is guaranteed to return zero if the dataset contains only exactly one finite value. It
 is not guaranteed to return zero when the dataset consists of the same value multiple times,
 due to numerical errors. However, it is guaranteed never to return a negative result.

 Non-finite values

 
If the dataset contains any non-finite values (Double#POSITIVE_INFINITY, Double#NEGATIVE_INFINITY, or Double#NaN) then the result is Double#NaN.

**Returns:** `double`

### `sampleVariance()`

If this dataset is a sample drawn from a population, this is an
 unbiased estimator of the population variance of the population. The count must be greater than
 one.

 
This is not guaranteed to return zero when the dataset consists of the same value multiple
 times, due to numerical errors. However, it is guaranteed never to return a negative result.

 Non-finite values

 
If the dataset contains any non-finite values (Double#POSITIVE_INFINITY, Double#NEGATIVE_INFINITY, or Double#NaN) then the result is Double#NaN.

**Returns:** `double`

### `sampleStandardDeviation()`

If this dataset is a sample drawn from a
 population, this is an estimator of the population standard deviation of the population which
 is less biased than #populationStandardDeviation() (the unbiased estimator depends on
 the distribution). The count must be greater than one.

 
This is not guaranteed to return zero when the dataset consists of the same value multiple
 times, due to numerical errors. However, it is guaranteed never to return a negative result.

 Non-finite values

 
If the dataset contains any non-finite values (Double#POSITIVE_INFINITY, Double#NEGATIVE_INFINITY, or Double#NaN) then the result is Double#NaN.

**Returns:** `double`

### `min()`

The count must be non-zero.

 Non-finite values

 
If the dataset contains Double#NaN then the result is Double#NaN. If it
 contains Double#NEGATIVE_INFINITY and not Double#NaN then the result is Double#NEGATIVE_INFINITY. If it contains Double#POSITIVE_INFINITY and finite values
 only then the result is the lowest finite value. If it contains Double#POSITIVE_INFINITY only then the result is Double#POSITIVE_INFINITY.

**Returns:** `double`

### `max()`

The count must be non-zero.

 Non-finite values

 
If the dataset contains Double#NaN then the result is Double#NaN. If it
 contains Double#POSITIVE_INFINITY and not Double#NaN then the result is Double#POSITIVE_INFINITY. If it contains Double#NEGATIVE_INFINITY and finite values
 only then the result is the highest finite value. If it contains Double#NEGATIVE_INFINITY only then the result is Double#NEGATIVE_INFINITY.

**Returns:** `double`

### `sumOfSquaresOfDeltas()`

**Returns:** `double`

### `calculateNewMeanNonFinite(double previousMean, double value)`

**Parameters:**
- `previousMean` (`double`)
- `value` (`double`)

**Returns:** `double`

