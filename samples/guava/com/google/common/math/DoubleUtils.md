# Class: `DoubleUtils`

**Package:** [`com.google.common.math`](README.md)

**Fully Qualified Name:** `com.google.common.math.DoubleUtils`

## Description

Utilities for {@code double} primitives.
@author Louis Wasserman

## Fields

### `SIGNIFICAND_MASK`

**Type:** `long`

### `EXPONENT_MASK`

**Type:** `long`

### `SIGN_MASK`

**Type:** `long`

### `SIGNIFICAND_BITS`

**Type:** `int`

### `EXPONENT_BIAS`

**Type:** `int`

### `IMPLICIT_BIT`

**Type:** `long`

The implicit 1 bit that is omitted in significands of normal doubles.

### `ONE_BITS`

**Type:** `long`

## Constructors

### `<init>()`

## Methods

### `nextDown(`double` d)`

**Returns:** `double`

### `getSignificand(`double` d)`

**Returns:** `long`

### `isFinite(`double` d)`

**Returns:** `boolean`

### `isNormal(`double` d)`

**Returns:** `boolean`

### `scaleNormalize(`double` x)`

**Returns:** `double`

### `bigToDouble([`java.math.BigInteger`](../../../../java/math/BigInteger.md) x)`

**Returns:** `double`

### `ensureNonNegative(`double` value)`

**Returns:** `double`

Returns its argument if it is non-negative, zero if it is negative.

