# Class: `Stats`

**Package:** [`com.google.common.math`](README.md)

**Fully Qualified Name:** `com.google.common.math.Stats`

**Implements:** [`java.io.Serializable`](../../../../java/io/Serializable.md)

## Description

A bundle of statistical summary values -- sum, count, mean/average, min and max, and several
 forms of variance -- that were computed from a single set of zero or more floating-point values.

 <p>There are two ways to obtain a {@code Stats} instance:

 <ul>
   <li>If all the values you want to summarize are already known, use the appropriate {@code
       Stats.of} factory method below. Primitive arrays, iterables and iterators of any kind of
       {@code Number}, and primitive varargs are supported.
   <li>Or, to avoid storing up all the data first, create a {@link StatsAccumulator} instance,
       feed values to it as you get them, then call {@link StatsAccumulator#snapshot}.
 </ul>

 <p>Static convenience methods called {@code meanOf} are also provided for users who wish to
 calculate <i>only</i> the mean.

 <p><b>Java 8 users:</b> If you are not using any of the variance statistics, you may wish to use
 built-in JDK libraries instead of this class.
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

### `BYTES`

**Type:** `int`

The size of byte array representation in bytes.

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(`long` count, `double` mean, `double` sumOfSquaresOfDeltas, `double` min, `double` max)`

Internal constructor. Users should use {@link #of} or {@link StatsAccumulator#snapshot}.

 <p>To ensure that the created instance obeys its contract, the parameters should satisfy the
 following constraints. This is the callers responsibility and is not enforced here.

 <ul>
   <li>If {@code count} is 0, {@code mean} may have any finite value (its only usage will be to
       get multiplied by 0 to calculate the sum), and the other parameters may have any values
       (they will not be used).
   <li>If {@code count} is 1, {@code sumOfSquaresOfDeltas} must be exactly 0.0 or {@link Double#NaN}.
 </ul>

## Methods

### `of(`java.lang.Iterable<? extends java.lang.Number>` values)`

**Returns:** [`com.google.common.math.Stats`](./Stats.md)

Returns statistics over a dataset containing the given values.
@param values a series of values, which will be converted to {@code double} values (this may
     cause loss of precision)

### `of([`java.util.Iterator<? extends java.lang.Number>`](../../../../java/util/Iterator.md) values)`

**Returns:** [`com.google.common.math.Stats`](./Stats.md)

Returns statistics over a dataset containing the given values. The iterator will be completely
 consumed by this method.
@param values a series of values, which will be converted to {@code double} values (this may
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
@param values a series of values, which will be converted to {@code double} values (this may
     cause loss of precision for longs of magnitude over 2^53 (slightly over 9e15))

### `of([`java.util.stream.DoubleStream`](../../../../java/util/stream/DoubleStream.md) values)`

**Returns:** [`com.google.common.math.Stats`](./Stats.md)

Returns statistics over a dataset containing the given values. The stream will be completely
 consumed by this method.

 <p>If you have a {@code Stream<Double>} rather than a {@code DoubleStream}, you should collect
 the values using {@link #toStats()} instead.
@param values a series of values
@since 28.2

### `of([`java.util.stream.IntStream`](../../../../java/util/stream/IntStream.md) values)`

**Returns:** [`com.google.common.math.Stats`](./Stats.md)

Returns statistics over a dataset containing the given values. The stream will be completely
 consumed by this method.

 <p>If you have a {@code Stream<Integer>} rather than an {@code IntStream}, you should collect
 the values using {@link #toStats()} instead.
@param values a series of values
@since 28.2

### `of([`java.util.stream.LongStream`](../../../../java/util/stream/LongStream.md) values)`

**Returns:** [`com.google.common.math.Stats`](./Stats.md)

Returns statistics over a dataset containing the given values. The stream will be completely
 consumed by this method.

 <p>If you have a {@code Stream<Long>} rather than a {@code LongStream}, you should collect the
 values using {@link #toStats()} instead.
@param values a series of values, which will be converted to {@code double} values (this may
     cause loss of precision for longs of magnitude over 2^53 (slightly over 9e15))
@since 28.2

### `toStats()`

**Returns:** [`java.util.stream.Collector<java.lang.Number,com.google.common.math.StatsAccumulator,com.google.common.math.Stats>`](../../../../java/util/stream/Collector.md)

Returns a {@link Collector} which accumulates statistics from a {@link java.util.stream.Stream}
 of any type of boxed {@link Number} into a {@link Stats}. Use by calling {@code
 boxedNumericStream.collect(toStats())}. The numbers will be converted to {@code double} values
 (which may cause loss of precision).

 <p>If you have any of the primitive streams {@code DoubleStream}, {@code IntStream}, or {@code
 LongStream}, you should use the factory method {@link #of} instead.
@since 28.2

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

 <p>If you only want to calculate the mean, use {@link #meanOf} instead of creating a {@link Stats} instance.
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

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

{@inheritDoc}

 <p><b>Note:</b> This tests exact equality of the calculated statistics, including the floating
 point values. Two instances are guaranteed to be considered equal if one is copied from the
 other using {@code second = new StatsAccumulator().addAll(first).snapshot()}, if both were
 obtained by calling {@code snapshot()} on the same {@link StatsAccumulator} without adding any
 values in between the two calls, or if one is obtained from the other after round-tripping
 through java serialization. However, floating point rounding errors mean that it may be false
 for some instances where the statistics are mathematically equal, including instances
 constructed from the same values in a different order... or (in the general case) even in the
 same order. (It is guaranteed to return true for instances constructed from the same values in
 the same order if {@code strictfp} is in effect, or if the system architecture guarantees
 {@code strictfp}-like semantics.)

### `hashCode()`

**Returns:** `int`

{@inheritDoc}

 <p><b>Note:</b> This hash code is consistent with exact equality of the calculated statistics,
 including the floating point values. See the note on {@link #equals} for details.

### `toString()`

**Returns:** `java.lang.String`

### `sumOfSquaresOfDeltas()`

**Returns:** `double`

### `meanOf(`java.lang.Iterable<? extends java.lang.Number>` values)`

**Returns:** `double`

Returns the <a href="http://en.wikipedia.org/wiki/Arithmetic_mean">arithmetic mean</a> of the
 values. The count must be non-zero.

 <p>The definition of the mean is the same as {@link Stats#mean}.
@param values a series of values, which will be converted to {@code double} values (this may
     cause loss of precision)
@throws IllegalArgumentException if the dataset is empty

### `meanOf([`java.util.Iterator<? extends java.lang.Number>`](../../../../java/util/Iterator.md) values)`

**Returns:** `double`

Returns the <a href="http://en.wikipedia.org/wiki/Arithmetic_mean">arithmetic mean</a> of the
 values. The count must be non-zero.

 <p>The definition of the mean is the same as {@link Stats#mean}.
@param values a series of values, which will be converted to {@code double} values (this may
     cause loss of precision)
@throws IllegalArgumentException if the dataset is empty

### `meanOf(`double[]` values)`

**Returns:** `double`

Returns the <a href="http://en.wikipedia.org/wiki/Arithmetic_mean">arithmetic mean</a> of the
 values. The count must be non-zero.

 <p>The definition of the mean is the same as {@link Stats#mean}.
@param values a series of values
@throws IllegalArgumentException if the dataset is empty

### `meanOf(`int[]` values)`

**Returns:** `double`

Returns the <a href="http://en.wikipedia.org/wiki/Arithmetic_mean">arithmetic mean</a> of the
 values. The count must be non-zero.

 <p>The definition of the mean is the same as {@link Stats#mean}.
@param values a series of values
@throws IllegalArgumentException if the dataset is empty

### `meanOf(`long[]` values)`

**Returns:** `double`

Returns the <a href="http://en.wikipedia.org/wiki/Arithmetic_mean">arithmetic mean</a> of the
 values. The count must be non-zero.

 <p>The definition of the mean is the same as {@link Stats#mean}.
@param values a series of values, which will be converted to {@code double} values (this may
     cause loss of precision for longs of magnitude over 2^53 (slightly over 9e15))
@throws IllegalArgumentException if the dataset is empty

### `toByteArray()`

**Returns:** `byte[]`

Gets a byte array representation of this instance.

 <p><b>Note:</b> No guarantees are made regarding stability of the representation between
 versions.

### `writeTo([`java.nio.ByteBuffer`](../../../../java/nio/ByteBuffer.md) buffer)`

**Returns:** `void`

Writes to the given {@link ByteBuffer} a byte representation of this instance.

 <p><b>Note:</b> No guarantees are made regarding stability of the representation between
 versions.
@param buffer A {@link ByteBuffer} with at least BYTES {@link ByteBuffer#remaining}, ordered as
     {@link ByteOrder#LITTLE_ENDIAN}, to which a BYTES-long byte representation of this instance
     is written. In the process increases the position of {@link ByteBuffer} by BYTES.

### `fromByteArray(`byte[]` byteArray)`

**Returns:** [`com.google.common.math.Stats`](./Stats.md)

Creates a Stats instance from the given byte representation which was obtained by {@link #toByteArray}.

 <p><b>Note:</b> No guarantees are made regarding stability of the representation between
 versions.

### `readFrom([`java.nio.ByteBuffer`](../../../../java/nio/ByteBuffer.md) buffer)`

**Returns:** [`com.google.common.math.Stats`](./Stats.md)

Creates a Stats instance from the byte representation read from the given {@link ByteBuffer}.

 <p><b>Note:</b> No guarantees are made regarding stability of the representation between
 versions.
@param buffer A {@link ByteBuffer} with at least BYTES {@link ByteBuffer#remaining}, ordered as
     {@link ByteOrder#LITTLE_ENDIAN}, from which a BYTES-long byte representation of this
     instance is read. In the process increases the position of {@link ByteBuffer} by BYTES.

