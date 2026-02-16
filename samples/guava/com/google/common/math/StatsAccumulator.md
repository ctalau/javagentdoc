# Class: `StatsAccumulator`

**Package:** [`com.google.common.math`](README.md)

**Fully Qualified Name:** `com.google.common.math.StatsAccumulator`

## Description

A mutable object which accumulates double values and tracks some basic statistics over all the
 values added so far. The values may be added singly or in groups. This class is not thread safe.
@author Pete Gillin
@author Kevin Bourrillion
@since 20.0

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

### `add(`double` value)`

**Returns:** `void`

Adds the given value to the dataset.

### `addAll(`java.lang.Iterable<? extends java.lang.Number>` values)`

**Returns:** `void`

Adds the given values to the dataset.
@param values a series of values, which will be converted to {@code double} values (this may
     cause loss of precision)

### `addAll([`java.util.Iterator<? extends java.lang.Number>`](../../../../java/util/Iterator.md) values)`

**Returns:** `void`

Adds the given values to the dataset.
@param values a series of values, which will be converted to {@code double} values (this may
     cause loss of precision)

### `addAll(`double[]` values)`

**Returns:** `void`

Adds the given values to the dataset.
@param values a series of values

### `addAll(`int[]` values)`

**Returns:** `void`

Adds the given values to the dataset.
@param values a series of values

### `addAll(`long[]` values)`

**Returns:** `void`

Adds the given values to the dataset.
@param values a series of values, which will be converted to {@code double} values (this may
     cause loss of precision for longs of magnitude over 2^53 (slightly over 9e15))

### `addAll([`java.util.stream.DoubleStream`](../../../../java/util/stream/DoubleStream.md) values)`

**Returns:** `void`

Adds the given values to the dataset. The stream will be completely consumed by this method.
@param values a series of values
@since 28.2

### `addAll([`java.util.stream.IntStream`](../../../../java/util/stream/IntStream.md) values)`

**Returns:** `void`

Adds the given values to the dataset. The stream will be completely consumed by this method.
@param values a series of values
@since 28.2

### `addAll([`java.util.stream.LongStream`](../../../../java/util/stream/LongStream.md) values)`

**Returns:** `void`

Adds the given values to the dataset. The stream will be completely consumed by this method.
@param values a series of values, which will be converted to {@code double} values (this may
     cause loss of precision for longs of magnitude over 2^53 (slightly over 9e15))
@since 28.2

### `addAll([`com.google.common.math.Stats`](./Stats.md) values)`

**Returns:** `void`

Adds the given statistics to the dataset, as if the individual values used to compute the
 statistics had been added directly.

### `addAll([`com.google.common.math.StatsAccumulator`](./StatsAccumulator.md) values)`

**Returns:** `void`

Adds the given statistics to the dataset, as if the individual values used to compute the
 statistics had been added directly.
@since 28.2

### `merge(`long` otherCount, `double` otherMean, `double` otherSumOfSquaresOfDeltas, `double` otherMin, `double` otherMax)`

**Returns:** `void`

### `snapshot()`

**Returns:** [`com.google.common.math.Stats`](./Stats.md)

Returns an immutable snapshot of the current statistics.

### `count()`

**Returns:** `long`

Returns the number of values.

### `mean()`

**Returns:** `double`

Returns the <a href="http://en.wikipedia.org/wiki/Arithmetic_mean">arithmetic mean</a> of the
 values. The count must be non-zero.

 <p>If these values are a sample drawn from a population, this is also an unbiased estimator of
 the arithmetic mean of the population.

 <h3>Non-finite values</h3>

 <p>If the dataset contains {@link Double#NaN} then the result is {@link Double#NaN}. If it
 contains both {@link Double#POSITIVE_INFINITY} and {@link Double#NEGATIVE_INFINITY} then the
 result is {@link Double#NaN}. If it contains {@link Double#POSITIVE_INFINITY} and finite values
 only or {@link Double#POSITIVE_INFINITY} only, the result is {@link Double#POSITIVE_INFINITY}.
 If it contains {@link Double#NEGATIVE_INFINITY} and finite values only or {@link Double#NEGATIVE_INFINITY} only, the result is {@link Double#NEGATIVE_INFINITY}.
@throws IllegalStateException if the dataset is empty

### `sum()`

**Returns:** `double`

Returns the sum of the values.

 <h3>Non-finite values</h3>

 <p>If the dataset contains {@link Double#NaN} then the result is {@link Double#NaN}. If it
 contains both {@link Double#POSITIVE_INFINITY} and {@link Double#NEGATIVE_INFINITY} then the
 result is {@link Double#NaN}. If it contains {@link Double#POSITIVE_INFINITY} and finite values
 only or {@link Double#POSITIVE_INFINITY} only, the result is {@link Double#POSITIVE_INFINITY}.
 If it contains {@link Double#NEGATIVE_INFINITY} and finite values only or {@link Double#NEGATIVE_INFINITY} only, the result is {@link Double#NEGATIVE_INFINITY}.

### `populationVariance()`

**Returns:** `double`

Returns the <a href="http://en.wikipedia.org/wiki/Variance#Population_variance">population
 variance</a> of the values. The count must be non-zero.

 <p>This is guaranteed to return zero if the dataset contains only exactly one finite value. It
 is not guaranteed to return zero when the dataset consists of the same value multiple times,
 due to numerical errors. However, it is guaranteed never to return a negative result.

 <h3>Non-finite values</h3>

 <p>If the dataset contains any non-finite values ({@link Double#POSITIVE_INFINITY}, {@link Double#NEGATIVE_INFINITY}, or {@link Double#NaN}) then the result is {@link Double#NaN}.
@throws IllegalStateException if the dataset is empty

### `populationStandardDeviation()`

**Returns:** `double`

Returns the <a href="http://en.wikipedia.org/wiki/Standard_deviation#Definition_of_population_values">
 population standard deviation</a> of the values. The count must be non-zero.

 <p>This is guaranteed to return zero if the dataset contains only exactly one finite value. It
 is not guaranteed to return zero when the dataset consists of the same value multiple times,
 due to numerical errors. However, it is guaranteed never to return a negative result.

 <h3>Non-finite values</h3>

 <p>If the dataset contains any non-finite values ({@link Double#POSITIVE_INFINITY}, {@link Double#NEGATIVE_INFINITY}, or {@link Double#NaN}) then the result is {@link Double#NaN}.
@throws IllegalStateException if the dataset is empty

### `sampleVariance()`

**Returns:** `double`

Returns the <a href="http://en.wikipedia.org/wiki/Variance#Sample_variance">unbiased sample
 variance</a> of the values. If this dataset is a sample drawn from a population, this is an
 unbiased estimator of the population variance of the population. The count must be greater than
 one.

 <p>This is not guaranteed to return zero when the dataset consists of the same value multiple
 times, due to numerical errors. However, it is guaranteed never to return a negative result.

 <h3>Non-finite values</h3>

 <p>If the dataset contains any non-finite values ({@link Double#POSITIVE_INFINITY}, {@link Double#NEGATIVE_INFINITY}, or {@link Double#NaN}) then the result is {@link Double#NaN}.
@throws IllegalStateException if the dataset is empty or contains a single value

### `sampleStandardDeviation()`

**Returns:** `double`

Returns the <a href="http://en.wikipedia.org/wiki/Standard_deviation#Corrected_sample_standard_deviation">
 corrected sample standard deviation</a> of the values. If this dataset is a sample drawn from a
 population, this is an estimator of the population standard deviation of the population which
 is less biased than {@link #populationStandardDeviation()} (the unbiased estimator depends on
 the distribution). The count must be greater than one.

 <p>This is not guaranteed to return zero when the dataset consists of the same value multiple
 times, due to numerical errors. However, it is guaranteed never to return a negative result.

 <h3>Non-finite values</h3>

 <p>If the dataset contains any non-finite values ({@link Double#POSITIVE_INFINITY}, {@link Double#NEGATIVE_INFINITY}, or {@link Double#NaN}) then the result is {@link Double#NaN}.
@throws IllegalStateException if the dataset is empty or contains a single value

### `min()`

**Returns:** `double`

Returns the lowest value in the dataset. The count must be non-zero.

 <h3>Non-finite values</h3>

 <p>If the dataset contains {@link Double#NaN} then the result is {@link Double#NaN}. If it
 contains {@link Double#NEGATIVE_INFINITY} and not {@link Double#NaN} then the result is {@link Double#NEGATIVE_INFINITY}. If it contains {@link Double#POSITIVE_INFINITY} and finite values
 only then the result is the lowest finite value. If it contains {@link Double#POSITIVE_INFINITY} only then the result is {@link Double#POSITIVE_INFINITY}.
@throws IllegalStateException if the dataset is empty

### `max()`

**Returns:** `double`

Returns the highest value in the dataset. The count must be non-zero.

 <h3>Non-finite values</h3>

 <p>If the dataset contains {@link Double#NaN} then the result is {@link Double#NaN}. If it
 contains {@link Double#POSITIVE_INFINITY} and not {@link Double#NaN} then the result is {@link Double#POSITIVE_INFINITY}. If it contains {@link Double#NEGATIVE_INFINITY} and finite values
 only then the result is the highest finite value. If it contains {@link Double#NEGATIVE_INFINITY} only then the result is {@link Double#NEGATIVE_INFINITY}.
@throws IllegalStateException if the dataset is empty

### `sumOfSquaresOfDeltas()`

**Returns:** `double`

### `calculateNewMeanNonFinite(`double` previousMean, `double` value)`

**Returns:** `double`

Calculates the new value for the accumulated mean when a value is added, in the case where at
 least one of the previous mean and the value is non-finite.

