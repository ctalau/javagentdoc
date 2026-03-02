# Class: `BigDecimalMath`

**Package:** [`com.google.common.math`](README.md)

**Fully Qualified Name:** `com.google.common.math.BigDecimalMath`

## Description

## Constructors

### `<init>()`

## Methods

### `roundToDouble(BigDecimal x, RoundingMode mode)`

If x
 is precisely representable as a double, its double value will be returned;
 otherwise, the rounding will choose between the two nearest representable values with 
 mode.

 
For the case of RoundingMode#HALF_DOWN, HALF_UP, and HALF_EVEN,
 infinite double values are considered infinitely far away. For example, 2^2000 is not
 representable as a double, but roundToDouble(BigDecimal.valueOf(2).pow(2000), HALF_UP)
 will return Double.MAX_VALUE, not Double.POSITIVE_INFINITY.

 
For the case of RoundingMode#HALF_EVEN, this implementation uses the IEEE 754
 default rounding mode: if the two nearest representable values are equally near, the one with
 the least significant bit zero is chosen. (In such cases, both of the nearest representable
 values are even integers; this method returns the one that is a multiple of a greater power of
 two.)

**Parameters:**
- `x` (`java.math.BigDecimal`)
- `mode` (`java.math.RoundingMode`)

**Returns:** `double`

