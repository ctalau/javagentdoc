# Class: `Quantiles`

**Package:** [`com.google.common.math`](README.md)

**Fully Qualified Name:** `com.google.common.math.Quantiles`

## Description

Provides a fluent API for calculating <a href="http://en.wikipedia.org/wiki/Quantile">quantiles</a>.

 <h3>Examples</h3>

 <p>To compute the median:

 <pre>`double myMedian = median().compute(myDataset);
 `</pre>

 where `median()` has been statically imported.

 <p>To compute the 99th percentile:

 <pre>`double myPercentile99 = percentiles().index(99).compute(myDataset);
 `</pre>

 where `percentiles()` has been statically imported.

 <p>To compute median and the 90th and 99th percentiles:

 <pre>`Map<Integer, Double> myPercentiles =
     percentiles().indexes(50, 90, 99).compute(myDataset);
 `</pre>

 where `percentiles()` has been statically imported: `myPercentiles` maps the keys
 50, 90, and 99, to their corresponding quantile values.

 <p>To compute quartiles, use `quartiles()` instead of `percentiles()`. To compute
 arbitrary q-quantiles, use `scale scale(q)`.

 <p>These examples all take a copy of your dataset. If you have a double array, you are okay with
 it being arbitrarily reordered, and you want to avoid that copy, you can use `computeInPlace` instead of `compute`.

 <h3>Definition and notes on interpolation</h3>

 <p>The definition of the kth q-quantile of N values is as follows: define x = k * (N - 1) / q; if
 x is an integer, the result is the value which would appear at index x in the sorted dataset
 (unless there are `Double.NaN NaN` values, see below); otherwise, the result is the average
 of the values which would appear at the indexes floor(x) and ceil(x) weighted by (1-frac(x)) and
 frac(x) respectively. This is the same definition as used by Excel and by S, it is the Type 7
 definition in <a href="http://stat.ethz.ch/R-manual/R-devel/library/stats/html/quantile.html">R</a>, and it is
 described by <a href="http://en.wikipedia.org/wiki/Quantile#Estimating_the_quantiles_of_a_population">
 wikipedia</a> as providing "Linear interpolation of the modes for the order statistics for the
 uniform distribution on [0,1]."

 <h3>Handling of non-finite values</h3>

 <p>If any values in the input are `Double.NaN NaN` then all values returned are `Double.NaN NaN`. (This is the one occasion when the behaviour is not the same as you'd get from
 sorting with `java.util.Arrays.sort(double[]) Arrays.sort(double[])` or `java.util.Collections.sort(java.util.List) Collections.sort(List&lt;Double&gt;)` and selecting
 the required value(s). Those methods would sort `Double.NaN NaN` as if it is greater than
 any other value and place them at the end of the dataset, even after `Double.POSITIVE_INFINITY POSITIVE_INFINITY`.)

 <p>Otherwise, `Double.NEGATIVE_INFINITY NEGATIVE_INFINITY` and `Double.POSITIVE_INFINITY POSITIVE_INFINITY` sort to the beginning and the end of the dataset, as
 you would expect.

 <p>If required to do a weighted average between an infinity and a finite value, or between an
 infinite value and itself, the infinite value is returned. If required to do a weighted average
 between `Double.NEGATIVE_INFINITY NEGATIVE_INFINITY` and `Double.POSITIVE_INFINITY POSITIVE_INFINITY`, `Double.NaN NaN` is returned (note that this will only happen if the
 dataset contains no finite values).

 <h3>Performance</h3>

 <p>The average time complexity of the computation is O(N) in the size of the dataset. There is a
 worst case time complexity of O(N^2). You are extremely unlikely to hit this quadratic case on
 randomly ordered data (the probability decreases faster than exponentially in N), but if you are
 passing in unsanitized user data then a malicious user could force it. A light shuffle of the
 data using an unpredictable seed should normally be enough to thwart this attack.

 <p>The time taken to compute multiple quantiles on the same dataset using `Scale.indexes indexes` is generally less than the total time taken to compute each of them separately, and
 sometimes much less. For example, on a large enough dataset, computing the 90th and 99th
 percentiles together takes about 55% as long as computing them separately.

 <p>When calling `ScaleAndIndex.compute` (in either
 form), the memory requirement is 8*N bytes for the copy of the dataset plus an overhead which is
 independent of N (but depends on the quantiles being computed). When calling `ScaleAndIndex.computeInPlace computeInPlace` (in either form), only the overhead is required. The number of object allocations is independent of
 N in both cases.
**Author:** Pete Gillin
**Since:** 20.0

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

Returns whether any of the values in `dataset` are `NaN`.

### `interpolate(`double` lower, `double` upper, `double` remainder, `double` scale)`

**Returns:** `double`

Returns a value a fraction `(remainder / scale)` of the way between `lower` and
 `upper`. Assumes that `lower <= upper`. Correctly handles infinities (but not
 `NaN`).

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
   <li>`required`, `from`, and `to` should all be indexes into `array`;
   <li>`required` should be in the range [`from`, `to`];
   <li>all the values with indexes in the range [0, `from`) should be less than or equal
       to all the values with indexes in the range [`from`, `to`];
   <li>all the values with indexes in the range (`to`, `array.length - 1`] should be
       greater than or equal to all the values with indexes in the range [`from`, `to`].
 </ul>

 This method will reorder the values with indexes in the range [`from`, `to`] such
 that all the values with indexes in the range [`from`, `required`) are less than or
 equal to the value with index `required`, and all the values with indexes in the range
 (`required`, `to`] are greater than or equal to that value. Therefore, the value at
 `required` is the value which would appear at that index in the sorted dataset.

### `partition(`double[]` array, `int` from, `int` to)`

**Returns:** `int`

Performs a partition operation on the slice of `array` with elements in the range [`from`, `to`]. Uses the median of `from`, `to`, and the midpoint between them
 as a pivot. Returns the index which the slice is partitioned around, i.e. if it returns `ret` then we know that the values with indexes in [`from`, `ret`) are less than or
 equal to the value at `ret` and the values with indexes in (`ret`, `to`] are
 greater than or equal to that.

### `movePivotToStartOfSlice(`double[]` array, `int` from, `int` to)`

**Returns:** `void`

Selects the pivot to use, namely the median of the values at `from`, `to`, and
 halfway between the two (rounded down), from `array`, and ensure (by swapping elements if
 necessary) that that pivot value appears at the start of the slice i.e. at `from`.
 Expects that `from` is strictly less than `to`.

### `selectAllInPlace(`int[]` allRequired, `int` requiredFrom, `int` requiredTo, `double[]` array, `int` from, `int` to)`

**Returns:** `void`

Performs an in-place selection, like `selectInPlace`, to select all the indexes `allRequired[i]` for `i` in the range [`requiredFrom`, `requiredTo`]. These
 indexes must be sorted in the array and must all be in the range [`from`, `to`].

### `chooseNextSelection(`int[]` allRequired, `int` requiredFrom, `int` requiredTo, `int` from, `int` to)`

**Returns:** `int`

Chooses the next selection to do from the required selections. It is required that the array
 `allRequired` is sorted and that `allRequired[i]` are in the range [`from`,
 `to`] for all `i` in the range [`requiredFrom`, `requiredTo`]. The
 value returned by this method is the `i` in that range such that `allRequired[i]`
 is as close as possible to the center of the range [`from`, `to`]. Choosing the
 value closest to the center of the range first is the most efficient strategy because it
 minimizes the size of the subranges from which the remaining selections must be done.

### `swap(`double[]` array, `int` i, `int` j)`

**Returns:** `void`

Swaps the values at `i` and `j` in `array`.

