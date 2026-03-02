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

This is equivalent to
 checkedPow(2, log2(x, CEILING)).

**Parameters:**
- `x` (`long`)

**Returns:** `long`

### `floorPowerOfTwo(long x)`

This is equivalent to 
 checkedPow(2, log2(x, FLOOR)).

**Parameters:**
- `x` (`long`)

**Returns:** `long`

### `isPowerOfTwo(long x)`

This differs from Long.bitCount(x) == 1, because 
 Long.bitCount(Long.MIN_VALUE) == 1, but Long#MIN_VALUE is not a power of two.

**Parameters:**
- `x` (`long`)

**Returns:** `boolean`

### `lessThanBranchFree(long x, long y)`

Assumes that x - y fits into a
 signed long. The implementation is branch-free, and benchmarks suggest it is measurably faster
 than the straightforward ternary expression.

**Parameters:**
- `x` (`long`)
- `y` (`long`)

**Returns:** `int`

### `log2(long x, RoundingMode mode)`

**Parameters:**
- `x` (`long`)
- `mode` (`java.math.RoundingMode`)

**Returns:** `int`

### `log10(long x, RoundingMode mode)`

**Parameters:**
- `x` (`long`)
- `mode` (`java.math.RoundingMode`)

**Returns:** `int`

### `log10Floor(long x)`

**Parameters:**
- `x` (`long`)

**Returns:** `int`

### `pow(long b, int k)`

Even if the result overflows, it will be equal to
 BigInteger.valueOf(b).pow(k).longValue(). This implementation runs in O(log k)
 time.

**Parameters:**
- `b` (`long`)
- `k` (`int`)

**Returns:** `long`

### `sqrt(long x, RoundingMode mode)`

**Parameters:**
- `x` (`long`)
- `mode` (`java.math.RoundingMode`)

**Returns:** `long`

### `divide(long p, long q, RoundingMode mode)`

**Parameters:**
- `p` (`long`)
- `q` (`long`)
- `mode` (`java.math.RoundingMode`)

**Returns:** `long`

### `mod(long x, int m)`

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

**Returns:** `int`

### `mod(long x, long m)`

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

**Returns:** `long`

### `gcd(long a, long b)`

Returns 0 if a == 0 && b ==
 0.

**Parameters:**
- `a` (`long`)
- `b` (`long`)

**Returns:** `long`

### `checkedAdd(long a, long b)`

**Parameters:**
- `a` (`long`)
- `b` (`long`)

**Returns:** `long`

### `checkedSubtract(long a, long b)`

**Parameters:**
- `a` (`long`)
- `b` (`long`)

**Returns:** `long`

### `checkedMultiply(long a, long b)`

**Parameters:**
- `a` (`long`)
- `b` (`long`)

**Returns:** `long`

### `checkedPow(long b, int k)`

**Parameters:**
- `b` (`long`)
- `k` (`int`)

**Returns:** `long`

### `saturatedAdd(long a, long b)`

**Parameters:**
- `a` (`long`)
- `b` (`long`)

**Returns:** `long`

### `saturatedSubtract(long a, long b)`

**Parameters:**
- `a` (`long`)
- `b` (`long`)

**Returns:** `long`

### `saturatedMultiply(long a, long b)`

**Parameters:**
- `a` (`long`)
- `b` (`long`)

**Returns:** `long`

### `saturatedPow(long b, int k)`

**Parameters:**
- `b` (`long`)
- `k` (`int`)

**Returns:** `long`

### `factorial(int n)`

**Parameters:**
- `n` (`int`)

**Returns:** `long`

### `binomial(int n, int k)`

**Parameters:**
- `n` (`int`)
- `k` (`int`)

**Returns:** `long`

### `multiplyFraction(long x, long numerator, long denominator)`

**Parameters:**
- `x` (`long`)
- `numerator` (`long`)
- `denominator` (`long`)

**Returns:** `long`

### `fitsInInt(long x)`

**Parameters:**
- `x` (`long`)

**Returns:** `boolean`

### `mean(long x, long y)`

This
 method is resilient to overflow.

**Parameters:**
- `x` (`long`)
- `y` (`long`)

**Returns:** `long`

### `isPrime(long n)`

Returns false if n is zero, one, or a composite number (one which *can* be
 factored into smaller positive integers).

 
To test larger numbers, use BigInteger#isProbablePrime.

**Parameters:**
- `n` (`long`)

**Returns:** `boolean`

### `roundToDouble(long x, RoundingMode mode)`

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

**Returns:** `double`

