# Class: `LinearTransformation`

**Package:** [`com.google.common.math`](README.md)

**Fully Qualified Name:** `com.google.common.math.LinearTransformation`

## Description

The representation of a linear transformation between real numbers {@code x} and {@code y}.
 Graphically, this is the specification of a straight line on a plane. The transformation can be
 expressed as {@code y = m * x + c} for finite {@code m} and {@code c}, unless it is a vertical
 transformation in which case {@code x} has a constant value for all {@code y}. In the
 non-vertical case, {@code m} is the slope of the transformation (and a horizontal transformation
 has zero slope).
@author Pete Gillin
@since 20.0

## Constructors

### `<init>()`

## Methods

### `mapping(`double` x1, `double` y1)`

**Returns:** [`com.google.common.math.LinearTransformation.LinearTransformationBuilder`](LinearTransformation/LinearTransformationBuilder.md)

Start building an instance which maps {@code x = x1} to {@code y = y1}. Both arguments must be
 finite. Call either {@link LinearTransformationBuilder#and} or {@link LinearTransformationBuilder#withSlope} on the returned object to finish building the instance.

### `vertical(`double` x)`

**Returns:** [`com.google.common.math.LinearTransformation`](./LinearTransformation.md)

Builds an instance representing a vertical transformation with a constant value of {@code x}.
 (The inverse of this will be a horizontal transformation.)

### `horizontal(`double` y)`

**Returns:** [`com.google.common.math.LinearTransformation`](./LinearTransformation.md)

Builds an instance representing a horizontal transformation with a constant value of {@code y}.
 (The inverse of this will be a vertical transformation.)

### `forNaN()`

**Returns:** [`com.google.common.math.LinearTransformation`](./LinearTransformation.md)

Builds an instance for datasets which contains {@link Double#NaN}. The {@link #isHorizontal}
 and {@link #isVertical} methods return {@code false} and the {@link #slope}, and {@link #transform} methods all return {@link Double#NaN}. The {@link #inverse} method returns the same
 instance.

### `isVertical()`

**Returns:** `boolean`

Returns whether this is a vertical transformation.

### `isHorizontal()`

**Returns:** `boolean`

Returns whether this is a horizontal transformation.

### `slope()`

**Returns:** `double`

Returns the slope of the transformation, i.e. the rate of change of {@code y} with respect to
 {@code x}. This must not be called on a vertical transformation (i.e. when {@link #isVertical()} is true).

### `transform(`double` x)`

**Returns:** `double`

Returns the {@code y} corresponding to the given {@code x}. This must not be called on a
 vertical transformation (i.e. when {@link #isVertical()} is true).

### `inverse()`

**Returns:** [`com.google.common.math.LinearTransformation`](./LinearTransformation.md)

Returns the inverse linear transformation. The inverse of a horizontal transformation is a
 vertical transformation, and vice versa. The inverse of the {@link #forNaN} transformation is
 itself. In all other cases, the inverse is a transformation such that applying both the
 original transformation and its inverse to a value gives you the original value give-or-take
 numerical errors. Calling this method multiple times on the same instance will always return
 the same instance. Calling this method on the result of calling this method on an instance will
 always return that original instance.

