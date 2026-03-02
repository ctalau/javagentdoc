# Class: `Stats`

**Package:** [`com.google.common.math`](README.md)

**Fully Qualified Name:** `com.google.common.math.Stats`

**Implements:** `java.io.Serializable`

## Description

There are two ways to obtain a Stats instance:

 

   - If all the values you want to summarize are already known, use the appropriate 
       Stats.of factory method below. Primitive arrays, iterables and iterators of any kind of
       Number, and primitive varargs are supported.
   - Or, to avoid storing up all the data first, create a StatsAccumulator instance,
       feed values to it as you get them, then call StatsAccumulator#snapshot.
 


 
Static convenience methods called meanOf are also provided for users who wish to
 calculate *only* the mean.

 
**Java 8 users:** If you are not using any of the variance statistics, you may wish to use
 built-in JDK libraries instead of this class.

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

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(long count, double mean, double sumOfSquaresOfDeltas, double min, double max)`

Users should use #of or StatsAccumulator#snapshot.

 
To ensure that the created instance obeys its contract, the parameters should satisfy the
 following constraints. This is the callers responsibility and is not enforced here.

 

   - If count is 0, mean may have any finite value (its only usage will be to
       get multiplied by 0 to calculate the sum), and the other parameters may have any values
       (they will not be used).
   - If count is 1, sumOfSquaresOfDeltas must be exactly 0.0 or Double#NaN.

**Parameters:**
- `count` (`long`)
- `mean` (`double`)
- `sumOfSquaresOfDeltas` (`double`)
- `min` (`double`)
- `max` (`double`)

## Methods

### `of(java.lang.Iterable<? extends java.lang.Number> values)`

**Returns:** [`com.google.common.math.Stats`](./Stats.md)

**Parameters:**
- `values` (`java.lang.Iterable<? extends java.lang.Number>`): a series of values, which will be converted to double values (this may
     cause loss of precision)

### `of(java.util.Iterator<? extends java.lang.Number> values)`

**Returns:** [`com.google.common.math.Stats`](./Stats.md)

The iterator will be completely
 consumed by this method.

**Parameters:**
- `values` (`java.util.Iterator<? extends java.lang.Number>`): a series of values, which will be converted to double values (this may
     cause loss of precision)

### `of(double[] values)`

**Returns:** [`com.google.common.math.Stats`](./Stats.md)

**Parameters:**
- `values` (`double[]`): a series of values

### `of(int[] values)`

**Returns:** [`com.google.common.math.Stats`](./Stats.md)

**Parameters:**
- `values` (`int[]`): a series of values

### `of(long[] values)`

**Returns:** [`com.google.common.math.Stats`](./Stats.md)

**Parameters:**
- `values` (`long[]`): a series of values, which will be converted to double values (this may
     cause loss of precision for longs of magnitude over 2^53 (slightly over 9e15))

### `of(java.util.stream.DoubleStream values)`

**Returns:** [`com.google.common.math.Stats`](./Stats.md)

The stream will be completely
 consumed by this method.

 
If you have a Stream<Double> rather than a DoubleStream, you should collect
 the values using #toStats() instead.

**Parameters:**
- `values` (`java.util.stream.DoubleStream`): a series of values

### `of(java.util.stream.IntStream values)`

**Returns:** [`com.google.common.math.Stats`](./Stats.md)

The stream will be completely
 consumed by this method.

 
If you have a Stream<Integer> rather than an IntStream, you should collect
 the values using #toStats() instead.

**Parameters:**
- `values` (`java.util.stream.IntStream`): a series of values

### `of(java.util.stream.LongStream values)`

**Returns:** [`com.google.common.math.Stats`](./Stats.md)

The stream will be completely
 consumed by this method.

 
If you have a Stream<Long> rather than a LongStream, you should collect the
 values using #toStats() instead.

**Parameters:**
- `values` (`java.util.stream.LongStream`): a series of values, which will be converted to double values (this may
     cause loss of precision for longs of magnitude over 2^53 (slightly over 9e15))

### `toStats()`

**Returns:** `java.util.stream.Collector<java.lang.Number,com.google.common.math.StatsAccumulator,com.google.common.math.Stats>`

Use by calling 
 boxedNumericStream.collect(toStats()). The numbers will be converted to double values
 (which may cause loss of precision).

 
If you have any of the primitive streams DoubleStream, IntStream, or 
 LongStream, you should use the factory method #of instead.

### `count()`

**Returns:** `long`

### `mean()`

**Returns:** `double`

The count must be non-zero.

 
If these values are a sample drawn from a population, this is also an unbiased estimator of
 the arithmetic mean of the population.

 Non-finite values

 
If the dataset contains Double#NaN then the result is Double#NaN. If it
 contains both Double#POSITIVE_INFINITY and Double#NEGATIVE_INFINITY then the
 result is Double#NaN. If it contains Double#POSITIVE_INFINITY and finite values
 only or Double#POSITIVE_INFINITY only, the result is Double#POSITIVE_INFINITY.
 If it contains Double#NEGATIVE_INFINITY and finite values only or Double#NEGATIVE_INFINITY only, the result is Double#NEGATIVE_INFINITY.

 
If you only want to calculate the mean, use #meanOf instead of creating a Stats instance.

### `sum()`

**Returns:** `double`

Non-finite values

 
If the dataset contains Double#NaN then the result is Double#NaN. If it
 contains both Double#POSITIVE_INFINITY and Double#NEGATIVE_INFINITY then the
 result is Double#NaN. If it contains Double#POSITIVE_INFINITY and finite values
 only or Double#POSITIVE_INFINITY only, the result is Double#POSITIVE_INFINITY.
 If it contains Double#NEGATIVE_INFINITY and finite values only or Double#NEGATIVE_INFINITY only, the result is Double#NEGATIVE_INFINITY.

### `populationVariance()`

**Returns:** `double`

The count must be non-zero.

 
This is guaranteed to return zero if the dataset contains only exactly one finite value. It
 is not guaranteed to return zero when the dataset consists of the same value multiple times,
 due to numerical errors. However, it is guaranteed never to return a negative result.

 Non-finite values

 
If the dataset contains any non-finite values (Double#POSITIVE_INFINITY, Double#NEGATIVE_INFINITY, or Double#NaN) then the result is Double#NaN.

### `populationStandardDeviation()`

**Returns:** `double`

The count must be non-zero.

 
This is guaranteed to return zero if the dataset contains only exactly one finite value. It
 is not guaranteed to return zero when the dataset consists of the same value multiple times,
 due to numerical errors. However, it is guaranteed never to return a negative result.

 Non-finite values

 
If the dataset contains any non-finite values (Double#POSITIVE_INFINITY, Double#NEGATIVE_INFINITY, or Double#NaN) then the result is Double#NaN.

### `sampleVariance()`

**Returns:** `double`

If this dataset is a sample drawn from a population, this is an
 unbiased estimator of the population variance of the population. The count must be greater than
 one.

 
This is not guaranteed to return zero when the dataset consists of the same value multiple
 times, due to numerical errors. However, it is guaranteed never to return a negative result.

 Non-finite values

 
If the dataset contains any non-finite values (Double#POSITIVE_INFINITY, Double#NEGATIVE_INFINITY, or Double#NaN) then the result is Double#NaN.

### `sampleStandardDeviation()`

**Returns:** `double`

If this dataset is a sample drawn from a
 population, this is an estimator of the population standard deviation of the population which
 is less biased than #populationStandardDeviation() (the unbiased estimator depends on
 the distribution). The count must be greater than one.

 
This is not guaranteed to return zero when the dataset consists of the same value multiple
 times, due to numerical errors. However, it is guaranteed never to return a negative result.

 Non-finite values

 
If the dataset contains any non-finite values (Double#POSITIVE_INFINITY, Double#NEGATIVE_INFINITY, or Double#NaN) then the result is Double#NaN.

### `min()`

**Returns:** `double`

The count must be non-zero.

 Non-finite values

 
If the dataset contains Double#NaN then the result is Double#NaN. If it
 contains Double#NEGATIVE_INFINITY and not Double#NaN then the result is Double#NEGATIVE_INFINITY. If it contains Double#POSITIVE_INFINITY and finite values
 only then the result is the lowest finite value. If it contains Double#POSITIVE_INFINITY only then the result is Double#POSITIVE_INFINITY.

### `max()`

**Returns:** `double`

The count must be non-zero.

 Non-finite values

 
If the dataset contains Double#NaN then the result is Double#NaN. If it
 contains Double#POSITIVE_INFINITY and not Double#NaN then the result is Double#POSITIVE_INFINITY. If it contains Double#NEGATIVE_INFINITY and finite values
 only then the result is the highest finite value. If it contains Double#NEGATIVE_INFINITY only then the result is Double#NEGATIVE_INFINITY.

### `equals(java.lang.Object obj)`

**Returns:** `boolean`

**Note:** This tests exact equality of the calculated statistics, including the floating
 point values. Two instances are guaranteed to be considered equal if one is copied from the
 other using second = new StatsAccumulator().addAll(first).snapshot(), if both were
 obtained by calling snapshot() on the same StatsAccumulator without adding any
 values in between the two calls, or if one is obtained from the other after round-tripping
 through java serialization. However, floating point rounding errors mean that it may be false
 for some instances where the statistics are mathematically equal, including instances
 constructed from the same values in a different order... or (in the general case) even in the
 same order. (It is guaranteed to return true for instances constructed from the same values in
 the same order if strictfp is in effect, or if the system architecture guarantees
 strictfp-like semantics.)

**Parameters:**
- `obj` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

**Note:** This hash code is consistent with exact equality of the calculated statistics,
 including the floating point values. See the note on #equals for details.

### `toString()`

**Returns:** `java.lang.String`

### `sumOfSquaresOfDeltas()`

**Returns:** `double`

### `meanOf(java.lang.Iterable<? extends java.lang.Number> values)`

**Returns:** `double`

The count must be non-zero.

 
The definition of the mean is the same as Stats#mean.

**Parameters:**
- `values` (`java.lang.Iterable<? extends java.lang.Number>`): a series of values, which will be converted to double values (this may
     cause loss of precision)

### `meanOf(java.util.Iterator<? extends java.lang.Number> values)`

**Returns:** `double`

The count must be non-zero.

 
The definition of the mean is the same as Stats#mean.

**Parameters:**
- `values` (`java.util.Iterator<? extends java.lang.Number>`): a series of values, which will be converted to double values (this may
     cause loss of precision)

### `meanOf(double[] values)`

**Returns:** `double`

The count must be non-zero.

 
The definition of the mean is the same as Stats#mean.

**Parameters:**
- `values` (`double[]`): a series of values

### `meanOf(int[] values)`

**Returns:** `double`

The count must be non-zero.

 
The definition of the mean is the same as Stats#mean.

**Parameters:**
- `values` (`int[]`): a series of values

### `meanOf(long[] values)`

**Returns:** `double`

The count must be non-zero.

 
The definition of the mean is the same as Stats#mean.

**Parameters:**
- `values` (`long[]`): a series of values, which will be converted to double values (this may
     cause loss of precision for longs of magnitude over 2^53 (slightly over 9e15))

### `toByteArray()`

**Returns:** `byte[]`

**Note:** No guarantees are made regarding stability of the representation between
 versions.

### `writeTo(java.nio.ByteBuffer buffer)`

**Returns:** `void`

**Note:** No guarantees are made regarding stability of the representation between
 versions.

**Parameters:**
- `buffer` (`java.nio.ByteBuffer`): A ByteBuffer with at least BYTES ByteBuffer#remaining, ordered as
     ByteOrder#LITTLE_ENDIAN, to which a BYTES-long byte representation of this instance
     is written. In the process increases the position of ByteBuffer by BYTES.

### `fromByteArray(byte[] byteArray)`

**Returns:** [`com.google.common.math.Stats`](./Stats.md)

**Note:** No guarantees are made regarding stability of the representation between
 versions.

**Parameters:**
- `byteArray` (`byte[]`)

### `readFrom(java.nio.ByteBuffer buffer)`

**Returns:** [`com.google.common.math.Stats`](./Stats.md)

**Note:** No guarantees are made regarding stability of the representation between
 versions.

**Parameters:**
- `buffer` (`java.nio.ByteBuffer`): A ByteBuffer with at least BYTES ByteBuffer#remaining, ordered as
     ByteOrder#LITTLE_ENDIAN, from which a BYTES-long byte representation of this
     instance is read. In the process increases the position of ByteBuffer by BYTES.

