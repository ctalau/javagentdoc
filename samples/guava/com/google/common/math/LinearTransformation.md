# Class: `LinearTransformation`

**Package:** [`com.google.common.math`](README.md)

**Fully Qualified Name:** `com.google.common.math.LinearTransformation`

## Description

The representation of a linear transformation between real numbers `x` and `y`.
 Graphically, this is the specification of a straight line on a plane. The transformation can be
 expressed as `y = m * x + c` for finite `m` and `c`, unless it is a vertical
 transformation in which case `x` has a constant value for all `y`. In the
 non-vertical case, `m` is the slope of the transformation (and a horizontal transformation
 has zero slope).
**Author:** Pete Gillin
**Since:** 20.0

## Constructors

### `<init>()`

## Methods

### `mapping(`double` x1, `double` y1)`

**Returns:** [`com.google.common.math.LinearTransformation.LinearTransformationBuilder`](LinearTransformation/LinearTransformationBuilder.md)

Start building an instance which maps `x = x1` to `y = y1`. Both arguments must be
 finite. Call either `LinearTransformationBuilder.and` or `LinearTransformationBuilder.withSlope` on the returned object to finish building the instance.

### `vertical(`double` x)`

**Returns:** [`com.google.common.math.LinearTransformation`](./LinearTransformation.md)

Builds an instance representing a vertical transformation with a constant value of `x`.
 (The inverse of this will be a horizontal transformation.)

### `horizontal(`double` y)`

**Returns:** [`com.google.common.math.LinearTransformation`](./LinearTransformation.md)

Builds an instance representing a horizontal transformation with a constant value of `y`.
 (The inverse of this will be a vertical transformation.)

### `forNaN()`

**Returns:** [`com.google.common.math.LinearTransformation`](./LinearTransformation.md)

Builds an instance for datasets which contains `Double.NaN`. The `isHorizontal`
 and `isVertical` methods return `false` and the `slope`, and `transform` methods all return `Double.NaN`. The `inverse` method returns the same
 instance.

### `isVertical()`

**Returns:** `boolean`

Returns whether this is a vertical transformation.

### `isHorizontal()`

**Returns:** `boolean`

Returns whether this is a horizontal transformation.

### `slope()`

**Returns:** `double`

Returns the slope of the transformation, i.e. the rate of change of `y` with respect to
 `x`. This must not be called on a vertical transformation (i.e. when `isVertical()` is true).

### `transform(`double` x)`

**Returns:** `double`

Returns the `y` corresponding to the given `x`. This must not be called on a
 vertical transformation (i.e. when `isVertical()` is true).

### `inverse()`

**Returns:** [`com.google.common.math.LinearTransformation`](./LinearTransformation.md)

Returns the inverse linear transformation. The inverse of a horizontal transformation is a
 vertical transformation, and vice versa. The inverse of the `forNaN` transformation is
 itself. In all other cases, the inverse is a transformation such that applying both the
 original transformation and its inverse to a value gives you the original value give-or-take
 numerical errors. Calling this method multiple times on the same instance will always return
 the same instance. Calling this method on the result of calling this method on an instance will
 always return that original instance.

