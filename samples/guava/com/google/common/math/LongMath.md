# Class: `LongMath`

**Package:** [`com.google.common.math`](README.md)

**Fully Qualified Name:** `com.google.common.math.LongMath`

## Description

Where possible, methods are defined and
 named analogously to their BigInteger counterparts.

 
The implementations of many methods in this class are based on material from Henry S. Warren,
 Jr.'s *Hacker's Delight*, (Addison Wesley, 2002).

 
Similar functionality for int and for BigInteger can be found in IntMath and BigIntegerMath respectively. For other common operations on long
 values, see com.google.common.primitives.Longs.

## Fields

### `MAX_SIGNED_POWER_OF_TWO`

**Type:** `long`

### `MAX_POWER_OF_SQRT2_UNSIGNED`

**Type:** `long`

### `maxLog10ForLeadingZeros`

**Type:** `byte[]`

### `powersOf10`

**Type:** `long[]`

### `halfPowersOf10`

**Type:** `long[]`

### `FLOOR_SQRT_MAX_LONG`

**Type:** `long`

### `factorials`

**Type:** `long[]`

### `biggestBinomials`

**Type:** `int[]`

### `biggestSimpleBinomials`

**Type:** `int[]`

### `SIEVE_30`

**Type:** `int`

### `millerRabinBaseSets`

**Type:** `long[][]`

## Constructors

### `<init>()`

## Methods

### `ceilingPowerOfTwo(long x)`

**Returns:** `long`

This is equivalent to
 checkedPow(2, log2(x, CEILING)).

**Parameters:**
- `x` (`long`)

### `floorPowerOfTwo(long x)`

**Returns:** `long`

This is equivalent to 
 checkedPow(2, log2(x, FLOOR)).

**Parameters:**
- `x` (`long`)

### `isPowerOfTwo(long x)`

**Returns:** `boolean`

This differs from Long.bitCount(x) == 1, because 
 Long.bitCount(Long.MIN_VALUE) == 1, but Long#MIN_VALUE is not a power of two.

**Parameters:**
- `x` (`long`)

### `lessThanBranchFree(long x, long y)`

**Returns:** `int`

Assumes that x - y fits into a
 signed long. The implementation is branch-free, and benchmarks suggest it is measurably faster
 than the straightforward ternary expression.

**Parameters:**
- `x` (`long`)
- `y` (`long`)

### `log2(long x, java.math.RoundingMode mode)`

**Returns:** `int`

**Parameters:**
- `x` (`long`)
- `mode` (`java.math.RoundingMode`)

### `log10(long x, java.math.RoundingMode mode)`

**Returns:** `int`

**Parameters:**
- `x` (`long`)
- `mode` (`java.math.RoundingMode`)

### `log10Floor(long x)`

**Returns:** `int`

**Parameters:**
- `x` (`long`)

### `pow(long b, int k)`

**Returns:** `long`

Even if the result overflows, it will be equal to
 BigInteger.valueOf(b).pow(k).longValue(). This implementation runs in O(log k)
 time.

**Parameters:**
- `b` (`long`)
- `k` (`int`)

### `sqrt(long x, java.math.RoundingMode mode)`

**Returns:** `long`

**Parameters:**
- `x` (`long`)
- `mode` (`java.math.RoundingMode`)

### `divide(long p, long q, java.math.RoundingMode mode)`

**Returns:** `long`

**Parameters:**
- `p` (`long`)
- `q` (`long`)
- `mode` (`java.math.RoundingMode`)

### `mod(long x, int m)`

**Returns:** `int`

This differs from x %
 m, which might be negative.

 
For example:

 

```

 mod(7, 4) == 3
 mod(-7, 4) == 1
 mod(-1, 4) == 3
 mod(-8, 4) == 0
 mod(8, 4) == 0
 
```

**Parameters:**
- `x` (`long`)
- `m` (`int`)

### `mod(long x, long m)`

**Returns:** `long`

This differs from x %
 m, which might be negative.

 
For example:

 

```

 mod(7, 4) == 3
 mod(-7, 4) == 1
 mod(-1, 4) == 3
 mod(-8, 4) == 0
 mod(8, 4) == 0
 
```

**Parameters:**
- `x` (`long`)
- `m` (`long`)

### `gcd(long a, long b)`

**Returns:** `long`

Returns 0 if a == 0 && b ==
 0.

**Parameters:**
- `a` (`long`)
- `b` (`long`)

### `checkedAdd(long a, long b)`

**Returns:** `long`

**Parameters:**
- `a` (`long`)
- `b` (`long`)

### `checkedSubtract(long a, long b)`

**Returns:** `long`

**Parameters:**
- `a` (`long`)
- `b` (`long`)

### `checkedMultiply(long a, long b)`

**Returns:** `long`

**Parameters:**
- `a` (`long`)
- `b` (`long`)

### `checkedPow(long b, int k)`

**Returns:** `long`

**Parameters:**
- `b` (`long`)
- `k` (`int`)

### `saturatedAdd(long a, long b)`

**Returns:** `long`

**Parameters:**
- `a` (`long`)
- `b` (`long`)

### `saturatedSubtract(long a, long b)`

**Returns:** `long`

**Parameters:**
- `a` (`long`)
- `b` (`long`)

### `saturatedMultiply(long a, long b)`

**Returns:** `long`

**Parameters:**
- `a` (`long`)
- `b` (`long`)

### `saturatedPow(long b, int k)`

**Returns:** `long`

**Parameters:**
- `b` (`long`)
- `k` (`int`)

### `factorial(int n)`

**Returns:** `long`

**Parameters:**
- `n` (`int`)

### `binomial(int n, int k)`

**Returns:** `long`

**Parameters:**
- `n` (`int`)
- `k` (`int`)

### `multiplyFraction(long x, long numerator, long denominator)`

**Returns:** `long`

**Parameters:**
- `x` (`long`)
- `numerator` (`long`)
- `denominator` (`long`)

### `fitsInInt(long x)`

**Returns:** `boolean`

**Parameters:**
- `x` (`long`)

### `mean(long x, long y)`

**Returns:** `long`

This
 method is resilient to overflow.

**Parameters:**
- `x` (`long`)
- `y` (`long`)

### `isPrime(long n)`

**Returns:** `boolean`

Returns false if n is zero, one, or a composite number (one which *can* be
 factored into smaller positive integers).

 
To test larger numbers, use BigInteger#isProbablePrime.

**Parameters:**
- `n` (`long`)

### `roundToDouble(long x, java.math.RoundingMode mode)`

**Returns:** `double`

If x
 is precisely representable as a double, its double value will be returned;
 otherwise, the rounding will choose between the two nearest representable values with 
 mode.

 
For the case of RoundingMode#HALF_EVEN, this implementation uses the IEEE 754
 default rounding mode: if the two nearest representable values are equally near, the one with
 the least significant bit zero is chosen. (In such cases, both of the nearest representable
 values are even integers; this method returns the one that is a multiple of a greater power of
 two.)

**Parameters:**
- `x` (`long`)
- `mode` (`java.math.RoundingMode`)

