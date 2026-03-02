# Class: `MathPreconditions`

**Package:** [`com.google.common.math`](README.md)

**Fully Qualified Name:** `com.google.common.math.MathPreconditions`

## Description

## Constructors

### `<init>()`

## Methods

### `checkPositive(String role, int x)`

**Parameters:**
- `role` (`java.lang.String`)
- `x` (`int`)

**Returns:** `int`

### `checkPositive(String role, long x)`

**Parameters:**
- `role` (`java.lang.String`)
- `x` (`long`)

**Returns:** `long`

### `checkPositive(String role, BigInteger x)`

**Parameters:**
- `role` (`java.lang.String`)
- `x` (`java.math.BigInteger`)

**Returns:** `java.math.BigInteger`

### `checkNonNegative(String role, int x)`

**Parameters:**
- `role` (`java.lang.String`)
- `x` (`int`)

**Returns:** `int`

### `checkNonNegative(String role, long x)`

**Parameters:**
- `role` (`java.lang.String`)
- `x` (`long`)

**Returns:** `long`

### `checkNonNegative(String role, BigInteger x)`

**Parameters:**
- `role` (`java.lang.String`)
- `x` (`java.math.BigInteger`)

**Returns:** `java.math.BigInteger`

### `checkNonNegative(String role, double x)`

**Parameters:**
- `role` (`java.lang.String`)
- `x` (`double`)

**Returns:** `double`

### `checkRoundingUnnecessary(boolean condition)`

**Parameters:**
- `condition` (`boolean`)

**Returns:** `void`

### `checkInRangeForRoundingInputs(boolean condition, double input, RoundingMode mode)`

**Parameters:**
- `condition` (`boolean`)
- `input` (`double`)
- `mode` (`java.math.RoundingMode`)

**Returns:** `void`

### `checkNoOverflow(boolean condition, String methodName, int a, int b)`

**Parameters:**
- `condition` (`boolean`)
- `methodName` (`java.lang.String`)
- `a` (`int`)
- `b` (`int`)

**Returns:** `void`

### `checkNoOverflow(boolean condition, String methodName, long a, long b)`

**Parameters:**
- `condition` (`boolean`)
- `methodName` (`java.lang.String`)
- `a` (`long`)
- `b` (`long`)

**Returns:** `void`

