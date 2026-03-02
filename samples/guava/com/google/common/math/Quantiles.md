# Class: `Quantiles`

**Package:** [`com.google.common.math`](README.md)

**Fully Qualified Name:** `com.google.common.math.Quantiles`

## Description

Examples

 
To compute the median:

 

```

 double myMedian = median().compute(myDataset);
 
```


 where #median() has been statically imported.

 
To compute the 99th percentile:

 

```

 double myPercentile99 = percentiles().index(99).compute(myDataset);
 
```


 where #percentiles() has been statically imported.

 
To compute median and the 90th and 99th percentiles:

 

```

 Map<Integer, Double> myPercentiles =
     percentiles().indexes(50, 90, 99).compute(myDataset);
 
```


 where #percentiles() has been statically imported: myPercentiles maps the keys
 50, 90, and 99, to their corresponding quantile values.

 
To compute quartiles, use #quartiles() instead of #percentiles(). To compute
 arbitrary q-quantiles, use scale(q).

 
These examples all take a copy of your dataset. If you have a double array, you are okay with
 it being arbitrarily reordered, and you want to avoid that copy, you can use 
 computeInPlace instead of compute.

 Definition and notes on interpolation

 
The definition of the kth q-quantile of N values is as follows: define x = k * (N - 1) / q; if
 x is an integer, the result is the value which would appear at index x in the sorted dataset
 (unless there are NaN values, see below); otherwise, the result is the average
 of the values which would appear at the indexes floor(x) and ceil(x) weighted by (1-frac(x)) and
 frac(x) respectively. This is the same definition as used by Excel and by S, it is the Type 7
 definition in [R](http://stat.ethz.ch/R-manual/R-devel/library/stats/html/quantile.html), and it is
 described by [
 wikipedia](http://en.wikipedia.org/wiki/Quantile#Estimating_the_quantiles_of_a_population) as providing "Linear interpolation of the modes for the order statistics for the
 uniform distribution on [0,1]."

 Handling of non-finite values

 
If any values in the input are NaN then all values returned are NaN. (This is the one occasion when the behaviour is not the same as you'd get from
 sorting with Arrays.sort(double[]) or Collections.sort(List<Double>) and selecting
 the required value(s). Those methods would sort NaN as if it is greater than
 any other value and place them at the end of the dataset, even after POSITIVE_INFINITY.)

 
Otherwise, NEGATIVE_INFINITY and POSITIVE_INFINITY sort to the beginning and the end of the dataset, as
 you would expect.

 
If required to do a weighted average between an infinity and a finite value, or between an
 infinite value and itself, the infinite value is returned. If required to do a weighted average
 between NEGATIVE_INFINITY and POSITIVE_INFINITY, NaN is returned (note that this will only happen if the
 dataset contains no finite values).

 Performance

 
The average time complexity of the computation is O(N) in the size of the dataset. There is a
 worst case time complexity of O(N^2). You are extremely unlikely to hit this quadratic case on
 randomly ordered data (the probability decreases faster than exponentially in N), but if you are
 passing in unsanitized user data then a malicious user could force it. A light shuffle of the
 data using an unpredictable seed should normally be enough to thwart this attack.

 
The time taken to compute multiple quantiles on the same dataset using indexes is generally less than the total time taken to compute each of them separately, and
 sometimes much less. For example, on a large enough dataset, computing the 90th and 99th
 percentiles together takes about 55% as long as computing them separately.

 
When calling ScaleAndIndex#compute (in either
 form), the memory requirement is 8*N bytes for the copy of the dataset plus an overhead which is
 independent of N (but depends on the quantiles being computed). When calling computeInPlace (in either form), only the overhead is required. The number of object allocations is independent of
 N in both cases.

## Constructors

### `<init>()`

## Methods

### `median()`

**Returns:** `com.google.common.math.Quantiles.ScaleAndIndex`

the 1st 2-quantile).

### `quartiles()`

**Returns:** `com.google.common.math.Quantiles.Scale`

4-quantiles).

### `percentiles()`

**Returns:** `com.google.common.math.Quantiles.Scale`

100-quantiles).

### `scale(int scale)`

**Returns:** `com.google.common.math.Quantiles.Scale`

**Parameters:**
- `scale` (`int`): the scale for the quantiles to be calculated, i.e. the q of the q-quantiles, which
     must be positive

### `containsNaN(double[] dataset)`

**Returns:** `boolean`

**Parameters:**
- `dataset` (`double[]`)

### `interpolate(double lower, double upper, double remainder, double scale)`

**Returns:** `double`

Assumes that lower <= upper. Correctly handles infinities (but not
 NaN).

**Parameters:**
- `lower` (`double`)
- `upper` (`double`)
- `remainder` (`double`)
- `scale` (`double`)

### `checkIndex(int index, int scale)`

**Returns:** `void`

**Parameters:**
- `index` (`int`)
- `scale` (`int`)

### `longsToDoubles(long[] longs)`

**Returns:** `double[]`

**Parameters:**
- `longs` (`long[]`)

### `intsToDoubles(int[] ints)`

**Returns:** `double[]`

**Parameters:**
- `ints` (`int[]`)

### `selectInPlace(int required, double[] array, int from, int to)`

**Returns:** `void`

The following preconditions should hold:

 

   - required, from, and to should all be indexes into array;
   - required should be in the range [from, to];
   - all the values with indexes in the range [0, from) should be less than or equal
       to all the values with indexes in the range [from, to];
   - all the values with indexes in the range (to, array.length - 1] should be
       greater than or equal to all the values with indexes in the range [from, 
       to].
 


 This method will reorder the values with indexes in the range [from, to] such
 that all the values with indexes in the range [from, required) are less than or
 equal to the value with index required, and all the values with indexes in the range
 (required, to] are greater than or equal to that value. Therefore, the value at
 required is the value which would appear at that index in the sorted dataset.

**Parameters:**
- `required` (`int`)
- `array` (`double[]`)
- `from` (`int`)
- `to` (`int`)

### `partition(double[] array, int from, int to)`

**Returns:** `int`

Uses the median of from, to, and the midpoint between them
 as a pivot. Returns the index which the slice is partitioned around, i.e. if it returns 
 ret then we know that the values with indexes in [from, ret) are less than or
 equal to the value at ret and the values with indexes in (ret, to] are
 greater than or equal to that.

**Parameters:**
- `array` (`double[]`)
- `from` (`int`)
- `to` (`int`)

### `movePivotToStartOfSlice(double[] array, int from, int to)`

**Returns:** `void`

at from.
 Expects that from is strictly less than to.

**Parameters:**
- `array` (`double[]`)
- `from` (`int`)
- `to` (`int`)

### `selectAllInPlace(int[] allRequired, int requiredFrom, int requiredTo, double[] array, int from, int to)`

**Returns:** `void`

These
 indexes must be sorted in the array and must all be in the range [from, to].

**Parameters:**
- `allRequired` (`int[]`)
- `requiredFrom` (`int`)
- `requiredTo` (`int`)
- `array` (`double[]`)
- `from` (`int`)
- `to` (`int`)

### `chooseNextSelection(int[] allRequired, int requiredFrom, int requiredTo, int from, int to)`

**Returns:** `int`

It is required that the array
 allRequired is sorted and that allRequired[i] are in the range [from,
 to] for all i in the range [requiredFrom, requiredTo]. The
 value returned by this method is the i in that range such that allRequired[i]
 is as close as possible to the center of the range [from, to]. Choosing the
 value closest to the center of the range first is the most efficient strategy because it
 minimizes the size of the subranges from which the remaining selections must be done.

**Parameters:**
- `allRequired` (`int[]`)
- `requiredFrom` (`int`)
- `requiredTo` (`int`)
- `from` (`int`)
- `to` (`int`)

### `swap(double[] array, int i, int j)`

**Returns:** `void`

**Parameters:**
- `array` (`double[]`)
- `i` (`int`)
- `j` (`int`)

