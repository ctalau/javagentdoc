# Class: `ToDoubleRounder`

**Package:** [`com.google.common.math`](README.md)

**Fully Qualified Name:** `com.google.common.math.ToDoubleRounder`

## Type Parameters

- `X` extends `java.lang.Number`, `java.lang.Comparable<X>`

## Description

Helper type to implement rounding `X` to a representable `double` value according to
 a `RoundingMode`.

## Constructors

### `<init>()`

## Methods

### `roundToDoubleArbitrarily(`X` x)`

**Returns:** `double`

Returns x rounded to either the greatest double less than or equal to the precise value of x,
 or the least double greater than or equal to the precise value of x.

### `sign(`X` x)`

**Returns:** `int`

Returns the sign of x: either -1, 0, or 1.

### `toX(`double` d, `java.math.RoundingMode` mode)`

**Returns:** `X`

Returns d's value as an X, rounded with the specified mode.

### `minus(`X` a, `X` b)`

**Returns:** `X`

Returns a - b, guaranteed that both arguments are nonnegative.

### `roundToDouble(`X` x, `java.math.RoundingMode` mode)`

**Returns:** `double`

Rounds `x` to a `double`.

