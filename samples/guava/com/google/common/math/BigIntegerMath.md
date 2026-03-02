# Class: `BigIntegerMath`

**Package:** [`com.google.common.math`](README.md)

**Fully Qualified Name:** `com.google.common.math.BigIntegerMath`

## Description

The implementations of many methods in this class are based on material from Henry S. Warren,
 Jr.'s *Hacker's Delight*, (Addison Wesley, 2002).

 
Similar functionality for int and for long can be found in IntMath and
 LongMath respectively.

## Fields

### `SQRT2_PRECOMPUTE_THRESHOLD`

**Type:** `int`

### `SQRT2_PRECOMPUTED_BITS`

**Type:** `java.math.BigInteger`

### `LN_10`

**Type:** `double`

### `LN_2`

**Type:** `double`

## Constructors

### `<init>()`

## Methods

### `ceilingPowerOfTwo(java.math.BigInteger x)`

**Returns:** `java.math.BigInteger`

This is equivalent to
 BigInteger.valueOf(2).pow(log2(x, CEILING)).

**Parameters:**
- `x` (`java.math.BigInteger`)

### `floorPowerOfTwo(java.math.BigInteger x)`

**Returns:** `java.math.BigInteger`

This is equivalent to 
 BigInteger.valueOf(2).pow(log2(x, FLOOR)).

**Parameters:**
- `x` (`java.math.BigInteger`)

### `isPowerOfTwo(java.math.BigInteger x)`

**Returns:** `boolean`

**Parameters:**
- `x` (`java.math.BigInteger`)

### `log2(java.math.BigInteger x, java.math.RoundingMode mode)`

**Returns:** `int`

**Parameters:**
- `x` (`java.math.BigInteger`)
- `mode` (`java.math.RoundingMode`)

### `log10(java.math.BigInteger x, java.math.RoundingMode mode)`

**Returns:** `int`

**Parameters:**
- `x` (`java.math.BigInteger`)
- `mode` (`java.math.RoundingMode`)

### `sqrt(java.math.BigInteger x, java.math.RoundingMode mode)`

**Returns:** `java.math.BigInteger`

**Parameters:**
- `x` (`java.math.BigInteger`)
- `mode` (`java.math.RoundingMode`)

### `sqrtFloor(java.math.BigInteger x)`

**Returns:** `java.math.BigInteger`

**Parameters:**
- `x` (`java.math.BigInteger`)

### `sqrtApproxWithDoubles(java.math.BigInteger x)`

**Returns:** `java.math.BigInteger`

**Parameters:**
- `x` (`java.math.BigInteger`)

### `roundToDouble(java.math.BigInteger x, java.math.RoundingMode mode)`

**Returns:** `double`

If x
 is precisely representable as a double, its double value will be returned;
 otherwise, the rounding will choose between the two nearest representable values with 
 mode.

 
For the case of RoundingMode#HALF_DOWN, HALF_UP, and HALF_EVEN,
 infinite double values are considered infinitely far away. For example, 2^2000 is not
 representable as a double, but roundToDouble(BigInteger.valueOf(2).pow(2000), HALF_UP)
 will return Double.MAX_VALUE, not Double.POSITIVE_INFINITY.

 
For the case of RoundingMode#HALF_EVEN, this implementation uses the IEEE 754
 default rounding mode: if the two nearest representable values are equally near, the one with
 the least significant bit zero is chosen. (In such cases, both of the nearest representable
 values are even integers; this method returns the one that is a multiple of a greater power of
 two.)

**Parameters:**
- `x` (`java.math.BigInteger`)
- `mode` (`java.math.RoundingMode`)

### `divide(java.math.BigInteger p, java.math.BigInteger q, java.math.RoundingMode mode)`

**Returns:** `java.math.BigInteger`

**Parameters:**
- `p` (`java.math.BigInteger`)
- `q` (`java.math.BigInteger`)
- `mode` (`java.math.RoundingMode`)

### `factorial(int n)`

**Returns:** `java.math.BigInteger`

**Warning:** the result takes *O(n log n)* space, so use cautiously.

 
This uses an efficient binary recursive algorithm to compute the factorial with balanced
 multiplies. It also removes all the 2s from the intermediate products (shifting them back in at
 the end).

**Parameters:**
- `n` (`int`)

### `listProduct(java.util.List<java.math.BigInteger> nums)`

**Returns:** `java.math.BigInteger`

**Parameters:**
- `nums` (`java.util.List<java.math.BigInteger>`)

### `listProduct(java.util.List<java.math.BigInteger> nums, int start, int end)`

**Returns:** `java.math.BigInteger`

**Parameters:**
- `nums` (`java.util.List<java.math.BigInteger>`)
- `start` (`int`)
- `end` (`int`)

### `binomial(int n, int k)`

**Returns:** `java.math.BigInteger`

**Warning:** the result can take as much as *O(k log n)* space.

**Parameters:**
- `n` (`int`)
- `k` (`int`)

### `fitsInLong(java.math.BigInteger x)`

**Returns:** `boolean`

**Parameters:**
- `x` (`java.math.BigInteger`)

