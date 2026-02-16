# Class: `Quantiles`

**Package:** [`com.google.common.math`](README.md)

**Fully Qualified Name:** `com.google.common.math.Quantiles`

## Description

Provides a fluent API for calculating <a href="http://en.wikipedia.org/wiki/Quantile">quantiles</a>.

 <h3>Examples</h3>

 <p>To compute the median:

 <pre>{@code
 double myMedian = median().compute(myDataset);
 }</pre>

 where {@link #median()} has been statically imported.

 <p>To compute the 99th percentile:

 <pre>{@code
 double myPercentile99 = percentiles().index(99).compute(myDataset);
 }</pre>

 where {@link #percentiles()} has been statically imported.

 <p>To compute median and the 90th and 99th percentiles:

 <pre>{@code
 Map<Integer, Double> myPercentiles =
     percentiles().indexes(50, 90, 99).compute(myDataset);
 }</pre>

 where {@link #percentiles()} has been statically imported: {@code myPercentiles} maps the keys
 50, 90, and 99, to their corresponding quantile values.

 <p>To compute quartiles, use {@link #quartiles()} instead of {@link #percentiles()}. To compute
 arbitrary q-quantiles, use {@link #scale scale(q)}.

 <p>These examples all take a copy of your dataset. If you have a double array, you are okay with
 it being arbitrarily reordered, and you want to avoid that copy, you can use {@code
 computeInPlace} instead of {@code compute}.

 <h3>Definition and notes on interpolation</h3>

 <p>The definition of the kth q-quantile of N values is as follows: define x = k * (N - 1) / q; if
 x is an integer, the result is the value which would appear at index x in the sorted dataset
 (unless there are {@link Double#NaN NaN} values, see below); otherwise, the result is the average
 of the values which would appear at the indexes floor(x) and ceil(x) weighted by (1-frac(x)) and
 frac(x) respectively. This is the same definition as used by Excel and by S, it is the Type 7
 definition in <a href="http://stat.ethz.ch/R-manual/R-devel/library/stats/html/quantile.html">R</a>, and it is
 described by <a href="http://en.wikipedia.org/wiki/Quantile#Estimating_the_quantiles_of_a_population">
 wikipedia</a> as providing "Linear interpolation of the modes for the order statistics for the
 uniform distribution on [0,1]."

 <h3>Handling of non-finite values</h3>

 <p>If any values in the input are {@link Double#NaN NaN} then all values returned are {@link Double#NaN NaN}. (This is the one occasion when the behaviour is not the same as you'd get from
 sorting with {@link java.util.Arrays#sort(double[]) Arrays.sort(double[])} or {@link java.util.Collections#sort(java.util.List) Collections.sort(List&lt;Double&gt;)} and selecting
 the required value(s). Those methods would sort {@link Double#NaN NaN} as if it is greater than
 any other value and place them at the end of the dataset, even after {@link Double#POSITIVE_INFINITY POSITIVE_INFINITY}.)

 <p>Otherwise, {@link Double#NEGATIVE_INFINITY NEGATIVE_INFINITY} and {@link Double#POSITIVE_INFINITY POSITIVE_INFINITY} sort to the beginning and the end of the dataset, as
 you would expect.

 <p>If required to do a weighted average between an infinity and a finite value, or between an
 infinite value and itself, the infinite value is returned. If required to do a weighted average
 between {@link Double#NEGATIVE_INFINITY NEGATIVE_INFINITY} and {@link Double#POSITIVE_INFINITY POSITIVE_INFINITY}, {@link Double#NaN NaN} is returned (note that this will only happen if the
 dataset contains no finite values).

 <h3>Performance</h3>

 <p>The average time complexity of the computation is O(N) in the size of the dataset. There is a
 worst case time complexity of O(N^2). You are extremely unlikely to hit this quadratic case on
 randomly ordered data (the probability decreases faster than exponentially in N), but if you are
 passing in unsanitized user data then a malicious user could force it. A light shuffle of the
 data using an unpredictable seed should normally be enough to thwart this attack.

 <p>The time taken to compute multiple quantiles on the same dataset using {@link Scale#indexes indexes} is generally less than the total time taken to compute each of them separately, and
 sometimes much less. For example, on a large enough dataset, computing the 90th and 99th
 percentiles together takes about 55% as long as computing them separately.

 <p>When calling {@link ScaleAndIndex#compute} (in {@linkplain ScaleAndIndexes#compute either
 form}), the memory requirement is 8*N bytes for the copy of the dataset plus an overhead which is
 independent of N (but depends on the quantiles being computed). When calling {@link ScaleAndIndex#computeInPlace computeInPlace} (in {@linkplain ScaleAndIndexes#computeInPlace either form}), only the overhead is required. The number of object allocations is independent of
 N in both cases.
@author Pete Gillin
@since 20.0

## Constructors

### `<init>()`

## Methods

### `median()`

**Returns:** [`com.google.common.math.Quantiles.ScaleAndIndex`](Quantiles/ScaleAndIndex.md)

Specifies the computation of a median (i.e. the 1st 2-quantile).

### `quartiles()`

**Returns:** [`com.google.common.math.Quantiles.Scale`](Quantiles/Scale.md)

Specifies the computation of quartiles (i.e. 4-quantiles).

### `percentiles()`

**Returns:** [`com.google.common.math.Quantiles.Scale`](Quantiles/Scale.md)

Specifies the computation of percentiles (i.e. 100-quantiles).

### `scale(`int` scale)`

**Returns:** [`com.google.common.math.Quantiles.Scale`](Quantiles/Scale.md)

Specifies the computation of q-quantiles.
@param scale the scale for the quantiles to be calculated, i.e. the q of the q-quantiles, which
     must be positive

### `containsNaN(`double[]` dataset)`

**Returns:** `boolean`

Returns whether any of the values in {@code dataset} are {@code NaN}.

### `interpolate(`double` lower, `double` upper, `double` remainder, `double` scale)`

**Returns:** `double`

Returns a value a fraction {@code (remainder / scale)} of the way between {@code lower} and
 {@code upper}. Assumes that {@code lower <= upper}. Correctly handles infinities (but not
 {@code NaN}).

### `checkIndex(`int` index, `int` scale)`

**Returns:** `void`

### `longsToDoubles(`long[]` longs)`

**Returns:** `double[]`

### `intsToDoubles(`int[]` ints)`

**Returns:** `double[]`

### `selectInPlace(`int` required, `double[]` array, `int` from, `int` to)`

**Returns:** `void`

Performs an in-place selection to find the element which would appear at a given index in a
 dataset if it were sorted. The following preconditions should hold:

 <ul>
   <li>{@code required}, {@code from}, and {@code to} should all be indexes into {@code array};
   <li>{@code required} should be in the range [{@code from}, {@code to}];
   <li>all the values with indexes in the range [0, {@code from}) should be less than or equal
       to all the values with indexes in the range [{@code from}, {@code to}];
   <li>all the values with indexes in the range ({@code to}, {@code array.length - 1}] should be
       greater than or equal to all the values with indexes in the range [{@code from}, {@code
       to}].
 </ul>

 This method will reorder the values with indexes in the range [{@code from}, {@code to}] such
 that all the values with indexes in the range [{@code from}, {@code required}) are less than or
 equal to the value with index {@code required}, and all the values with indexes in the range
 ({@code required}, {@code to}] are greater than or equal to that value. Therefore, the value at
 {@code required} is the value which would appear at that index in the sorted dataset.

### `partition(`double[]` array, `int` from, `int` to)`

**Returns:** `int`

Performs a partition operation on the slice of {@code array} with elements in the range [{@code
 from}, {@code to}]. Uses the median of {@code from}, {@code to}, and the midpoint between them
 as a pivot. Returns the index which the slice is partitioned around, i.e. if it returns {@code
 ret} then we know that the values with indexes in [{@code from}, {@code ret}) are less than or
 equal to the value at {@code ret} and the values with indexes in ({@code ret}, {@code to}] are
 greater than or equal to that.

### `movePivotToStartOfSlice(`double[]` array, `int` from, `int` to)`

**Returns:** `void`

Selects the pivot to use, namely the median of the values at {@code from}, {@code to}, and
 halfway between the two (rounded down), from {@code array}, and ensure (by swapping elements if
 necessary) that that pivot value appears at the start of the slice i.e. at {@code from}.
 Expects that {@code from} is strictly less than {@code to}.

### `selectAllInPlace(`int[]` allRequired, `int` requiredFrom, `int` requiredTo, `double[]` array, `int` from, `int` to)`

**Returns:** `void`

Performs an in-place selection, like {@link #selectInPlace}, to select all the indexes {@code
 allRequired[i]} for {@code i} in the range [{@code requiredFrom}, {@code requiredTo}]. These
 indexes must be sorted in the array and must all be in the range [{@code from}, {@code to}].

### `chooseNextSelection(`int[]` allRequired, `int` requiredFrom, `int` requiredTo, `int` from, `int` to)`

**Returns:** `int`

Chooses the next selection to do from the required selections. It is required that the array
 {@code allRequired} is sorted and that {@code allRequired[i]} are in the range [{@code from},
 {@code to}] for all {@code i} in the range [{@code requiredFrom}, {@code requiredTo}]. The
 value returned by this method is the {@code i} in that range such that {@code allRequired[i]}
 is as close as possible to the center of the range [{@code from}, {@code to}]. Choosing the
 value closest to the center of the range first is the most efficient strategy because it
 minimizes the size of the subranges from which the remaining selections must be done.

### `swap(`double[]` array, `int` i, `int` j)`

**Returns:** `void`

Swaps the values at {@code i} and {@code j} in {@code array}.

