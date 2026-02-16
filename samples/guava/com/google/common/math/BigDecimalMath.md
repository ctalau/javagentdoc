# Class: `BigDecimalMath`

**Package:** [`com.google.common.math`](README.md)

**Fully Qualified Name:** `com.google.common.math.BigDecimalMath`

## Description

A class for arithmetic on `BigDecimal` that is not covered by its built-in methods.
**Author:** Louis Wasserman
**Since:** 30.0

## Constructors

### `<init>()`

## Methods

### `roundToDouble(`java.math.BigDecimal` x, `java.math.RoundingMode` mode)`

**Returns:** `double`

Returns `x`, rounded to a `double` with the specified rounding mode. If `x`
 is precisely representable as a `double`, its `double` value will be returned;
 otherwise, the rounding will choose between the two nearest representable values with `mode`.

 <p>For the case of `RoundingMode.HALF_DOWN`, `HALF_UP`, and `HALF_EVEN`,
 infinite `double` values are considered infinitely far away. For example, 2^2000 is not
 representable as a double, but `roundToDouble(BigDecimal.valueOf(2).pow(2000), HALF_UP)`
 will return `Double.MAX_VALUE`, not `Double.POSITIVE_INFINITY`.

 <p>For the case of `RoundingMode.HALF_EVEN`, this implementation uses the IEEE 754
 default rounding mode: if the two nearest representable values are equally near, the one with
 the least significant bit zero is chosen. (In such cases, both of the nearest representable
 values are even integers; this method returns the one that is a multiple of a greater power of
 two.)
@throws ArithmeticException if `mode` is `RoundingMode.UNNECESSARY` and `x`
     is not precisely representable as a `double`
**Since:** 30.0

