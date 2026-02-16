# Class: `Stats`

**Package:** [`com.google.common.math`](README.md)

**Fully Qualified Name:** `com.google.common.math.Stats`

**Implements:** `java.io.Serializable`

## Description

A bundle of statistical summary values -- sum, count, mean/average, min and max, and several
 forms of variance -- that were computed from a single set of zero or more floating-point values.

 <p>There are two ways to obtain a `Stats` instance:

 <ul>
   <li>If all the values you want to summarize are already known, use the appropriate `Stats.of` factory method below. Primitive arrays, iterables and iterators of any kind of
       `Number`, and primitive varargs are supported.
   <li>Or, to avoid storing up all the data first, create a `StatsAccumulator` instance,
       feed values to it as you get them, then call `StatsAccumulator.snapshot`.
 </ul>

 <p>Static convenience methods called `meanOf` are also provided for users who wish to
 calculate <i>only</i> the mean.

 <p><b>Java 8 users:</b> If you are not using any of the variance statistics, you may wish to use
 built-in JDK libraries instead of this class.
**Author:** Pete Gillin
**Author:** Kevin Bourrillion
**Since:** 20.0

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

### `BYTES`

**Type:** `int`

The size of byte array representation in bytes.

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(`long` count, `double` mean, `double` sumOfSquaresOfDeltas, `double` min, `double` max)`

Internal constructor. Users should use `of` or `StatsAccumulator.snapshot`.

 <p>To ensure that the created instance obeys its contract, the parameters should satisfy the
 following constraints. This is the callers responsibility and is not enforced here.

 <ul>
   <li>If `count` is 0, `mean` may have any finite value (its only usage will be to
       get multiplied by 0 to calculate the sum), and the other parameters may have any values
       (they will not be used).
   <li>If `count` is 1, `sumOfSquaresOfDeltas` must be exactly 0.0 or `Double.NaN`.
 </ul>

## Methods

### `of(`java.lang.Iterable<? extends java.lang.Number>` values)`

**Returns:** [`com.google.common.math.Stats`](./Stats.md)

Returns statistics over a dataset containing the given values.
@param values a series of values, which will be converted to `double` values (this may
     cause loss of precision)

### `of(`java.util.Iterator<? extends java.lang.Number>` values)`

**Returns:** [`com.google.common.math.Stats`](./Stats.md)

Returns statistics over a dataset containing the given values. The iterator will be completely
 consumed by this method.
@param values a series of values, which will be converted to `double` values (this may
     cause loss of precision)

### `of(`double[]` values)`

**Returns:** [`com.google.common.math.Stats`](./Stats.md)

Returns statistics over a dataset containing the given values.
@param values a series of values

### `of(`int[]` values)`

**Returns:** [`com.google.common.math.Stats`](./Stats.md)

Returns statistics over a dataset containing the given values.
@param values a series of values

### `of(`long[]` values)`

**Returns:** [`com.google.common.math.Stats`](./Stats.md)

Returns statistics over a dataset containing the given values.
@param values a series of values, which will be converted to `double` values (this may
     cause loss of precision for longs of magnitude over 2^53 (slightly over 9e15))

### `of(`java.util.stream.DoubleStream` values)`

**Returns:** [`com.google.common.math.Stats`](./Stats.md)

Returns statistics over a dataset containing the given values. The stream will be completely
 consumed by this method.

 <p>If you have a `Stream<Double>` rather than a `DoubleStream`, you should collect
 the values using `toStats()` instead.
@param values a series of values
**Since:** 28.2

### `of(`java.util.stream.IntStream` values)`

**Returns:** [`com.google.common.math.Stats`](./Stats.md)

Returns statistics over a dataset containing the given values. The stream will be completely
 consumed by this method.

 <p>If you have a `Stream<Integer>` rather than an `IntStream`, you should collect
 the values using `toStats()` instead.
@param values a series of values
**Since:** 28.2

### `of(`java.util.stream.LongStream` values)`

**Returns:** [`com.google.common.math.Stats`](./Stats.md)

Returns statistics over a dataset containing the given values. The stream will be completely
 consumed by this method.

 <p>If you have a `Stream<Long>` rather than a `LongStream`, you should collect the
 values using `toStats()` instead.
@param values a series of values, which will be converted to `double` values (this may
     cause loss of precision for longs of magnitude over 2^53 (slightly over 9e15))
**Since:** 28.2

### `toStats()`

**Returns:** `java.util.stream.Collector<java.lang.Number,com.google.common.math.StatsAccumulator,com.google.common.math.Stats>`

Returns a `Collector` which accumulates statistics from a `java.util.stream.Stream`
 of any type of boxed `Number` into a `Stats`. Use by calling `boxedNumericStream.collect(toStats())`. The numbers will be converted to `double` values
 (which may cause loss of precision).

 <p>If you have any of the primitive streams `DoubleStream`, `IntStream`, or `LongStream`, you should use the factory method `of` instead.
**Since:** 28.2

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

 <p>If the dataset contains `Double.NaN` then the result is `Double.NaN`. If it
 contains both `Double.POSITIVE_INFINITY` and `Double.NEGATIVE_INFINITY` then the
 result is `Double.NaN`. If it contains `Double.POSITIVE_INFINITY` and finite values
 only or `Double.POSITIVE_INFINITY` only, the result is `Double.POSITIVE_INFINITY`.
 If it contains `Double.NEGATIVE_INFINITY` and finite values only or `Double.NEGATIVE_INFINITY` only, the result is `Double.NEGATIVE_INFINITY`.

 <p>If you only want to calculate the mean, use `meanOf` instead of creating a `Stats` instance.
@throws IllegalStateException if the dataset is empty

### `sum()`

**Returns:** `double`

Returns the sum of the values.

 <h3>Non-finite values</h3>

 <p>If the dataset contains `Double.NaN` then the result is `Double.NaN`. If it
 contains both `Double.POSITIVE_INFINITY` and `Double.NEGATIVE_INFINITY` then the
 result is `Double.NaN`. If it contains `Double.POSITIVE_INFINITY` and finite values
 only or `Double.POSITIVE_INFINITY` only, the result is `Double.POSITIVE_INFINITY`.
 If it contains `Double.NEGATIVE_INFINITY` and finite values only or `Double.NEGATIVE_INFINITY` only, the result is `Double.NEGATIVE_INFINITY`.

### `populationVariance()`

**Returns:** `double`

Returns the <a href="http://en.wikipedia.org/wiki/Variance#Population_variance">population
 variance</a> of the values. The count must be non-zero.

 <p>This is guaranteed to return zero if the dataset contains only exactly one finite value. It
 is not guaranteed to return zero when the dataset consists of the same value multiple times,
 due to numerical errors. However, it is guaranteed never to return a negative result.

 <h3>Non-finite values</h3>

 <p>If the dataset contains any non-finite values (`Double.POSITIVE_INFINITY`, `Double.NEGATIVE_INFINITY`, or `Double.NaN`) then the result is `Double.NaN`.
@throws IllegalStateException if the dataset is empty

### `populationStandardDeviation()`

**Returns:** `double`

Returns the <a href="http://en.wikipedia.org/wiki/Standard_deviation#Definition_of_population_values">
 population standard deviation</a> of the values. The count must be non-zero.

 <p>This is guaranteed to return zero if the dataset contains only exactly one finite value. It
 is not guaranteed to return zero when the dataset consists of the same value multiple times,
 due to numerical errors. However, it is guaranteed never to return a negative result.

 <h3>Non-finite values</h3>

 <p>If the dataset contains any non-finite values (`Double.POSITIVE_INFINITY`, `Double.NEGATIVE_INFINITY`, or `Double.NaN`) then the result is `Double.NaN`.
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

 <p>If the dataset contains any non-finite values (`Double.POSITIVE_INFINITY`, `Double.NEGATIVE_INFINITY`, or `Double.NaN`) then the result is `Double.NaN`.
@throws IllegalStateException if the dataset is empty or contains a single value

### `sampleStandardDeviation()`

**Returns:** `double`

Returns the <a href="http://en.wikipedia.org/wiki/Standard_deviation#Corrected_sample_standard_deviation">
 corrected sample standard deviation</a> of the values. If this dataset is a sample drawn from a
 population, this is an estimator of the population standard deviation of the population which
 is less biased than `populationStandardDeviation()` (the unbiased estimator depends on
 the distribution). The count must be greater than one.

 <p>This is not guaranteed to return zero when the dataset consists of the same value multiple
 times, due to numerical errors. However, it is guaranteed never to return a negative result.

 <h3>Non-finite values</h3>

 <p>If the dataset contains any non-finite values (`Double.POSITIVE_INFINITY`, `Double.NEGATIVE_INFINITY`, or `Double.NaN`) then the result is `Double.NaN`.
@throws IllegalStateException if the dataset is empty or contains a single value

### `min()`

**Returns:** `double`

Returns the lowest value in the dataset. The count must be non-zero.

 <h3>Non-finite values</h3>

 <p>If the dataset contains `Double.NaN` then the result is `Double.NaN`. If it
 contains `Double.NEGATIVE_INFINITY` and not `Double.NaN` then the result is `Double.NEGATIVE_INFINITY`. If it contains `Double.POSITIVE_INFINITY` and finite values
 only then the result is the lowest finite value. If it contains `Double.POSITIVE_INFINITY` only then the result is `Double.POSITIVE_INFINITY`.
@throws IllegalStateException if the dataset is empty

### `max()`

**Returns:** `double`

Returns the highest value in the dataset. The count must be non-zero.

 <h3>Non-finite values</h3>

 <p>If the dataset contains `Double.NaN` then the result is `Double.NaN`. If it
 contains `Double.POSITIVE_INFINITY` and not `Double.NaN` then the result is `Double.POSITIVE_INFINITY`. If it contains `Double.NEGATIVE_INFINITY` and finite values
 only then the result is the highest finite value. If it contains `Double.NEGATIVE_INFINITY` only then the result is `Double.NEGATIVE_INFINITY`.
@throws IllegalStateException if the dataset is empty

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

{@inheritDoc}

 <p><b>Note:</b> This tests exact equality of the calculated statistics, including the floating
 point values. Two instances are guaranteed to be considered equal if one is copied from the
 other using `second = new StatsAccumulator().addAll(first).snapshot()`, if both were
 obtained by calling `snapshot()` on the same `StatsAccumulator` without adding any
 values in between the two calls, or if one is obtained from the other after round-tripping
 through java serialization. However, floating point rounding errors mean that it may be false
 for some instances where the statistics are mathematically equal, including instances
 constructed from the same values in a different order... or (in the general case) even in the
 same order. (It is guaranteed to return true for instances constructed from the same values in
 the same order if `strictfp` is in effect, or if the system architecture guarantees
 `strictfp`-like semantics.)

### `hashCode()`

**Returns:** `int`

{@inheritDoc}

 <p><b>Note:</b> This hash code is consistent with exact equality of the calculated statistics,
 including the floating point values. See the note on `equals` for details.

### `toString()`

**Returns:** `java.lang.String`

### `sumOfSquaresOfDeltas()`

**Returns:** `double`

### `meanOf(`java.lang.Iterable<? extends java.lang.Number>` values)`

**Returns:** `double`

Returns the <a href="http://en.wikipedia.org/wiki/Arithmetic_mean">arithmetic mean</a> of the
 values. The count must be non-zero.

 <p>The definition of the mean is the same as `Stats.mean`.
@param values a series of values, which will be converted to `double` values (this may
     cause loss of precision)
@throws IllegalArgumentException if the dataset is empty

### `meanOf(`java.util.Iterator<? extends java.lang.Number>` values)`

**Returns:** `double`

Returns the <a href="http://en.wikipedia.org/wiki/Arithmetic_mean">arithmetic mean</a> of the
 values. The count must be non-zero.

 <p>The definition of the mean is the same as `Stats.mean`.
@param values a series of values, which will be converted to `double` values (this may
     cause loss of precision)
@throws IllegalArgumentException if the dataset is empty

### `meanOf(`double[]` values)`

**Returns:** `double`

Returns the <a href="http://en.wikipedia.org/wiki/Arithmetic_mean">arithmetic mean</a> of the
 values. The count must be non-zero.

 <p>The definition of the mean is the same as `Stats.mean`.
@param values a series of values
@throws IllegalArgumentException if the dataset is empty

### `meanOf(`int[]` values)`

**Returns:** `double`

Returns the <a href="http://en.wikipedia.org/wiki/Arithmetic_mean">arithmetic mean</a> of the
 values. The count must be non-zero.

 <p>The definition of the mean is the same as `Stats.mean`.
@param values a series of values
@throws IllegalArgumentException if the dataset is empty

### `meanOf(`long[]` values)`

**Returns:** `double`

Returns the <a href="http://en.wikipedia.org/wiki/Arithmetic_mean">arithmetic mean</a> of the
 values. The count must be non-zero.

 <p>The definition of the mean is the same as `Stats.mean`.
@param values a series of values, which will be converted to `double` values (this may
     cause loss of precision for longs of magnitude over 2^53 (slightly over 9e15))
@throws IllegalArgumentException if the dataset is empty

### `toByteArray()`

**Returns:** `byte[]`

Gets a byte array representation of this instance.

 <p><b>Note:</b> No guarantees are made regarding stability of the representation between
 versions.

### `writeTo(`java.nio.ByteBuffer` buffer)`

**Returns:** `void`

Writes to the given `ByteBuffer` a byte representation of this instance.

 <p><b>Note:</b> No guarantees are made regarding stability of the representation between
 versions.
@param buffer A `ByteBuffer` with at least BYTES `ByteBuffer.remaining`, ordered as
     `ByteOrder.LITTLE_ENDIAN`, to which a BYTES-long byte representation of this instance
     is written. In the process increases the position of `ByteBuffer` by BYTES.

### `fromByteArray(`byte[]` byteArray)`

**Returns:** [`com.google.common.math.Stats`](./Stats.md)

Creates a Stats instance from the given byte representation which was obtained by `toByteArray`.

 <p><b>Note:</b> No guarantees are made regarding stability of the representation between
 versions.

### `readFrom(`java.nio.ByteBuffer` buffer)`

**Returns:** [`com.google.common.math.Stats`](./Stats.md)

Creates a Stats instance from the byte representation read from the given `ByteBuffer`.

 <p><b>Note:</b> No guarantees are made regarding stability of the representation between
 versions.
@param buffer A `ByteBuffer` with at least BYTES `ByteBuffer.remaining`, ordered as
     `ByteOrder.LITTLE_ENDIAN`, from which a BYTES-long byte representation of this
     instance is read. In the process increases the position of `ByteBuffer` by BYTES.

