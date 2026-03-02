# Class: `UnsignedLong`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.UnsignedLong`

**Extends:** `java.lang.Number`

**Implements:** `java.lang.Comparable<com.google.common.primitives.UnsignedLong>`, `java.io.Serializable`

## Description

In some cases, when speed is more important than code readability, it may be faster simply to
 treat primitive long values as unsigned, using the methods from UnsignedLongs.

 
See the Guava User Guide article on [unsigned
 primitive utilities](https://github.com/google/guava/wiki/PrimitivesExplained#unsigned-support).

## Fields

### `UNSIGNED_MASK`

**Type:** `long`

### `ZERO`

**Type:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

### `ONE`

**Type:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

### `MAX_VALUE`

**Type:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

### `value`

**Type:** `long`

## Constructors

### `<init>(long value)`

**Parameters:**
- `value` (`long`)

## Methods

### `fromLongBits(long bits)`

**Returns:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

The argument is
 interpreted as an unsigned 64-bit value. Specifically, the sign bit of bits is
 interpreted as a normal bit, and all other bits are treated as usual.

 
If the argument is nonnegative, the returned result will be equal to bits,
 otherwise, the result will be equal to 2^64 + bits.

 
To represent decimal constants less than 2^63, consider #valueOf(long)
 instead.

**Parameters:**
- `bits` (`long`)

### `valueOf(long value)`

**Returns:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

**Parameters:**
- `value` (`long`)

### `valueOf(java.math.BigInteger value)`

**Returns:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

This is the inverse operation of #bigIntegerValue().

**Parameters:**
- `value` (`java.math.BigInteger`)

### `valueOf(java.lang.String string)`

**Returns:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

**Parameters:**
- `string` (`java.lang.String`)

### `valueOf(java.lang.String string, int radix)`

**Returns:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

**Parameters:**
- `string` (`java.lang.String`)
- `radix` (`int`)

### `plus(com.google.common.primitives.UnsignedLong val)`

**Returns:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

If the result would have more than 64 bits,
 returns the low 64 bits of the result.

**Parameters:**
- `val` ([`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md))

### `minus(com.google.common.primitives.UnsignedLong val)`

**Returns:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

If the result would have more than 64
 bits, returns the low 64 bits of the result.

**Parameters:**
- `val` ([`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md))

### `times(com.google.common.primitives.UnsignedLong val)`

**Returns:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

If the result would have more than 64
 bits, returns the low 64 bits of the result.

**Parameters:**
- `val` ([`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md))

### `dividedBy(com.google.common.primitives.UnsignedLong val)`

**Returns:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

**Parameters:**
- `val` ([`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md))

### `mod(com.google.common.primitives.UnsignedLong val)`

**Returns:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

**Parameters:**
- `val` ([`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md))

### `intValue()`

**Returns:** `int`

### `longValue()`

**Returns:** `long`

This is an inverse operation
 to #fromLongBits.

 
Note that if this UnsignedLong holds a value >= 2^63, the returned value
 will be equal to this - 2^64.

### `floatValue()`

**Returns:** `float`

### `doubleValue()`

**Returns:** `double`

### `bigIntegerValue()`

**Returns:** `java.math.BigInteger`

### `compareTo(com.google.common.primitives.UnsignedLong o)`

**Returns:** `int`

**Parameters:**
- `o` ([`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md))

### `hashCode()`

**Returns:** `int`

### `equals(java.lang.Object obj)`

**Returns:** `boolean`

**Parameters:**
- `obj` (`java.lang.Object`)

### `toString()`

**Returns:** `java.lang.String`

### `toString(int radix)`

**Returns:** `java.lang.String`

If
 radix < Character.MIN_RADIX or radix > Character.MAX_RADIX, the radix 
 10 is used.

**Parameters:**
- `radix` (`int`)

