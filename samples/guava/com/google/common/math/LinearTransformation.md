# Class: `LinearTransformation`

**Package:** [`com.google.common.math`](README.md)

**Fully Qualified Name:** `com.google.common.math.LinearTransformation`

## Description

Graphically, this is the specification of a straight line on a plane. The transformation can be
 expressed as y = m * x + c for finite m and c, unless it is a vertical
 transformation in which case x has a constant value for all y. In the
 non-vertical case, m is the slope of the transformation (and a horizontal transformation
 has zero slope).

## Constructors

### `<init>()`

## Methods

### `mapping(double x1, double y1)`

Both arguments must be
 finite. Call either LinearTransformationBuilder#and or LinearTransformationBuilder#withSlope on the returned object to finish building the instance.

**Parameters:**
- `x1` (`double`)
- `y1` (`double`)

**Returns:** `com.google.common.math.LinearTransformation.LinearTransformationBuilder`

### `vertical(double x)`

(The inverse of this will be a horizontal transformation.)

**Parameters:**
- `x` (`double`)

**Returns:** [`com.google.common.math.LinearTransformation`](./LinearTransformation.md)

### `horizontal(double y)`

(The inverse of this will be a vertical transformation.)

**Parameters:**
- `y` (`double`)

**Returns:** [`com.google.common.math.LinearTransformation`](./LinearTransformation.md)

### `forNaN()`

The #isHorizontal
 and #isVertical methods return false and the #slope, and #transform methods all return Double#NaN. The #inverse method returns the same
 instance.

**Returns:** [`com.google.common.math.LinearTransformation`](./LinearTransformation.md)

### `isVertical()`

**Returns:** `boolean`

### `isHorizontal()`

**Returns:** `boolean`

### `slope()`

the rate of change of y with respect to
 x. This must not be called on a vertical transformation (i.e. when #isVertical() is true).

**Returns:** `double`

### `transform(double x)`

This must not be called on a
 vertical transformation (i.e. when #isVertical() is true).

**Parameters:**
- `x` (`double`)

**Returns:** `double`

### `inverse()`

The inverse of a horizontal transformation is a
 vertical transformation, and vice versa. The inverse of the #forNaN transformation is
 itself. In all other cases, the inverse is a transformation such that applying both the
 original transformation and its inverse to a value gives you the original value give-or-take
 numerical errors. Calling this method multiple times on the same instance will always return
 the same instance. Calling this method on the result of calling this method on an instance will
 always return that original instance.

**Returns:** [`com.google.common.math.LinearTransformation`](./LinearTransformation.md)

