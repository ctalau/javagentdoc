# Class: `ToDoubleRounder`

**Package:** [`com.google.common.math`](README.md)

**Fully Qualified Name:** `com.google.common.math.ToDoubleRounder`

## Type Parameters

- `X` extends `java.lang.Number`, `java.lang.Comparable<X>`

## Description

Helper type to implement rounding {@code X} to a representable {@code double} value according to
 a {@link RoundingMode}.

## Constructors

### `<init>()`

## Methods

### `roundToDoubleArbitrarily([`X`](X.md) x)`

**Returns:** `double`

Returns x rounded to either the greatest double less than or equal to the precise value of x,
 or the least double greater than or equal to the precise value of x.

### `sign([`X`](X.md) x)`

**Returns:** `int`

Returns the sign of x: either -1, 0, or 1.

### `toX(`double` d, [`java.math.RoundingMode`](../../../../java/math/RoundingMode.md) mode)`

**Returns:** [`X`](X.md)

Returns d's value as an X, rounded with the specified mode.

### `minus([`X`](X.md) a, [`X`](X.md) b)`

**Returns:** [`X`](X.md)

Returns a - b, guaranteed that both arguments are nonnegative.

### `roundToDouble([`X`](X.md) x, [`java.math.RoundingMode`](../../../../java/math/RoundingMode.md) mode)`

**Returns:** `double`

Rounds {@code x} to a {@code double}.

