# Class: `UnsignedInteger`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.UnsignedInteger`

**Extends:** `java.lang.Number`

**Implements:** `java.lang.Comparable<com.google.common.primitives.UnsignedInteger>`

## Description

In some cases, when speed is more important than code readability, it may be faster simply to
 treat primitive int values as unsigned, using the methods from UnsignedInts.

 
See the Guava User Guide article on [unsigned
 primitive utilities](https://github.com/google/guava/wiki/PrimitivesExplained#unsigned-support).

## Fields

### `ZERO`

**Type:** [`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md)

### `ONE`

**Type:** [`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md)

### `MAX_VALUE`

**Type:** [`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md)

### `value`

**Type:** `int`

## Constructors

### `<init>(int value)`

**Parameters:**
- `value` (`int`)

## Methods

### `fromIntBits(int bits)`

The argument is
 interpreted as an unsigned 32-bit value. Specifically, the sign bit of bits is
 interpreted as a normal bit, and all other bits are treated as usual.

 
If the argument is nonnegative, the returned result will be equal to bits,
 otherwise, the result will be equal to 2^32 + bits.

 
To represent unsigned decimal constants, consider #valueOf(long) instead.

**Parameters:**
- `bits` (`int`)

**Returns:** [`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md)

### `valueOf(long value)`

The inverse
 operation of #longValue().

**Parameters:**
- `value` (`long`)

**Returns:** [`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md)

### `valueOf(BigInteger value)`

This is the inverse operation of #bigIntegerValue().

**Parameters:**
- `value` (`java.math.BigInteger`)

**Returns:** [`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md)

### `valueOf(String string)`

**Parameters:**
- `string` (`java.lang.String`)

**Returns:** [`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md)

### `valueOf(String string, int radix)`

**Parameters:**
- `string` (`java.lang.String`)
- `radix` (`int`)

**Returns:** [`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md)

### `plus(UnsignedInteger val)`

If the result would have more than 32 bits,
 returns the low 32 bits of the result.

**Parameters:**
- `val` ([`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md))

**Returns:** [`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md)

### `minus(UnsignedInteger val)`

If the result would be negative,
 returns the low 32 bits of the result.

**Parameters:**
- `val` ([`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md))

**Returns:** [`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md)

### `times(UnsignedInteger val)`

If the result would have more than 32
 bits, returns the low 32 bits of the result.

**Parameters:**
- `val` ([`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md))

**Returns:** [`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md)

### `dividedBy(UnsignedInteger val)`

**Parameters:**
- `val` ([`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md))

**Returns:** [`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md)

### `mod(UnsignedInteger val)`

**Parameters:**
- `val` ([`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md))

**Returns:** [`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md)

### `intValue()`

This is an inverse
 operation to #fromIntBits.

 
Note that if this UnsignedInteger holds a value >= 2^31, the returned value
 will be equal to this - 2^32.

**Returns:** `int`

### `longValue()`

**Returns:** `long`

### `floatValue()`

**Returns:** `float`

### `doubleValue()`

**Returns:** `double`

### `bigIntegerValue()`

**Returns:** `java.math.BigInteger`

### `compareTo(UnsignedInteger other)`

Returns 0 if they are
 equal, a negative number if this < other, and a positive number if this >
 other.

**Parameters:**
- `other` ([`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md))

**Returns:** `int`

### `hashCode()`

**Returns:** `int`

### `equals(Object obj)`

**Parameters:**
- `obj` (`java.lang.Object`)

**Returns:** `boolean`

### `toString()`

**Returns:** `java.lang.String`

### `toString(int radix)`

If
 radix < Character.MIN_RADIX or radix > Character.MAX_RADIX, the radix 
 10 is used.

**Parameters:**
- `radix` (`int`)

**Returns:** `java.lang.String`

