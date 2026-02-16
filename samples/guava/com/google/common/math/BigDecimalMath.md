# Class: `BigDecimalMath`

**Package:** [`com.google.common.math`](README.md)

**Fully Qualified Name:** `com.google.common.math.BigDecimalMath`

## Description

A class for arithmetic on {@link BigDecimal} that is not covered by its built-in methods.
@author Louis Wasserman
@since 30.0

## Constructors

### `<init>()`

## Methods

### `roundToDouble([`java.math.BigDecimal`](../../../../java/math/BigDecimal.md) x, [`java.math.RoundingMode`](../../../../java/math/RoundingMode.md) mode)`

**Returns:** `double`

Returns {@code x}, rounded to a {@code double} with the specified rounding mode. If {@code x}
 is precisely representable as a {@code double}, its {@code double} value will be returned;
 otherwise, the rounding will choose between the two nearest representable values with {@code
 mode}.

 <p>For the case of {@link RoundingMode#HALF_DOWN}, {@code HALF_UP}, and {@code HALF_EVEN},
 infinite {@code double} values are considered infinitely far away. For example, 2^2000 is not
 representable as a double, but {@code roundToDouble(BigDecimal.valueOf(2).pow(2000), HALF_UP)}
 will return {@code Double.MAX_VALUE}, not {@code Double.POSITIVE_INFINITY}.

 <p>For the case of {@link RoundingMode#HALF_EVEN}, this implementation uses the IEEE 754
 default rounding mode: if the two nearest representable values are equally near, the one with
 the least significant bit zero is chosen. (In such cases, both of the nearest representable
 values are even integers; this method returns the one that is a multiple of a greater power of
 two.)
@throws ArithmeticException if {@code mode} is {@link RoundingMode#UNNECESSARY} and {@code x}
     is not precisely representable as a {@code double}
@since 30.0

