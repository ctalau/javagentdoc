# Class: `IntMath`

**Package:** [`com.google.common.math`](README.md)

**Fully Qualified Name:** `com.google.common.math.IntMath`

## Description

Where possible, methods are defined and
 named analogously to their BigInteger counterparts.

 
The implementations of many methods in this class are based on material from Henry S. Warren,
 Jr.'s *Hacker's Delight*, (Addison Wesley, 2002).

 
Similar functionality for long and for BigInteger can be found in LongMath and BigIntegerMath respectively. For other common operations on int
 values, see com.google.common.primitives.Ints.

## Fields

### `MAX_SIGNED_POWER_OF_TWO`

**Type:** `int`

### `MAX_POWER_OF_SQRT2_UNSIGNED`

**Type:** `int`

### `maxLog10ForLeadingZeros`

**Type:** `byte[]`

### `powersOf10`

**Type:** `int[]`

### `halfPowersOf10`

**Type:** `int[]`

### `FLOOR_SQRT_MAX_INT`

**Type:** `int`

### `factorials`

**Type:** `int[]`

### `biggestBinomials`

**Type:** `int[]`

## Constructors

### `<init>()`

## Methods

### `ceilingPowerOfTwo(int x)`

This is equivalent to
 checkedPow(2, log2(x, CEILING)).

**Parameters:**
- `x` (`int`)

**Returns:** `int`

### `floorPowerOfTwo(int x)`

This is equivalent to 
 checkedPow(2, log2(x, FLOOR)).

**Parameters:**
- `x` (`int`)

**Returns:** `int`

### `isPowerOfTwo(int x)`

This differs from Integer.bitCount(x) == 1, because 
 Integer.bitCount(Integer.MIN_VALUE) == 1, but Integer#MIN_VALUE is not a power of two.

**Parameters:**
- `x` (`int`)

**Returns:** `boolean`

### `lessThanBranchFree(int x, int y)`

Assumes that x - y fits into
 a signed int. The implementation is branch-free, and benchmarks suggest it is measurably (if
 narrowly) faster than the straightforward ternary expression.

**Parameters:**
- `x` (`int`)
- `y` (`int`)

**Returns:** `int`

### `log2(int x, RoundingMode mode)`

**Parameters:**
- `x` (`int`)
- `mode` (`java.math.RoundingMode`)

**Returns:** `int`

### `log10(int x, RoundingMode mode)`

**Parameters:**
- `x` (`int`)
- `mode` (`java.math.RoundingMode`)

**Returns:** `int`

### `log10Floor(int x)`

**Parameters:**
- `x` (`int`)

**Returns:** `int`

### `pow(int b, int k)`

Even if the result overflows, it will be equal to
 BigInteger.valueOf(b).pow(k).intValue(). This implementation runs in O(log k)
 time.

 
Compare #checkedPow, which throws an ArithmeticException upon overflow.

**Parameters:**
- `b` (`int`)
- `k` (`int`)

**Returns:** `int`

### `sqrt(int x, RoundingMode mode)`

**Parameters:**
- `x` (`int`)
- `mode` (`java.math.RoundingMode`)

**Returns:** `int`

### `sqrtFloor(int x)`

**Parameters:**
- `x` (`int`)

**Returns:** `int`

### `divide(int p, int q, RoundingMode mode)`

**Parameters:**
- `p` (`int`)
- `q` (`int`)
- `mode` (`java.math.RoundingMode`)

**Returns:** `int`

### `mod(int x, int m)`

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
- `x` (`int`)
- `m` (`int`)

**Returns:** `int`

### `gcd(int a, int b)`

Returns 0 if a == 0 && b ==
 0.

**Parameters:**
- `a` (`int`)
- `b` (`int`)

**Returns:** `int`

### `checkedAdd(int a, int b)`

**Parameters:**
- `a` (`int`)
- `b` (`int`)

**Returns:** `int`

### `checkedSubtract(int a, int b)`

**Parameters:**
- `a` (`int`)
- `b` (`int`)

**Returns:** `int`

### `checkedMultiply(int a, int b)`

**Parameters:**
- `a` (`int`)
- `b` (`int`)

**Returns:** `int`

### `checkedPow(int b, int k)`

#pow may be faster, but does not check for overflow.

**Parameters:**
- `b` (`int`)
- `k` (`int`)

**Returns:** `int`

### `saturatedAdd(int a, int b)`

**Parameters:**
- `a` (`int`)
- `b` (`int`)

**Returns:** `int`

### `saturatedSubtract(int a, int b)`

**Parameters:**
- `a` (`int`)
- `b` (`int`)

**Returns:** `int`

### `saturatedMultiply(int a, int b)`

**Parameters:**
- `a` (`int`)
- `b` (`int`)

**Returns:** `int`

### `saturatedPow(int b, int k)`

**Parameters:**
- `b` (`int`)
- `k` (`int`)

**Returns:** `int`

### `factorial(int n)`

**Parameters:**
- `n` (`int`)

**Returns:** `int`

### `binomial(int n, int k)`

**Parameters:**
- `n` (`int`)
- `k` (`int`)

**Returns:** `int`

### `mean(int x, int y)`

This
 method is overflow resilient.

**Parameters:**
- `x` (`int`)
- `y` (`int`)

**Returns:** `int`

### `isPrime(int n)`

Returns false if n is zero, one, or a composite number (one which *can* be
 factored into smaller positive integers).

 
To test larger numbers, use LongMath#isPrime or BigInteger#isProbablePrime.

**Parameters:**
- `n` (`int`)

**Returns:** `boolean`

