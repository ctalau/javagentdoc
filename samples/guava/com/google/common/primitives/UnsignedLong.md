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

The argument is
 interpreted as an unsigned 64-bit value. Specifically, the sign bit of bits is
 interpreted as a normal bit, and all other bits are treated as usual.

 
If the argument is nonnegative, the returned result will be equal to bits,
 otherwise, the result will be equal to 2^64 + bits.

 
To represent decimal constants less than 2^63, consider #valueOf(long)
 instead.

**Parameters:**
- `bits` (`long`)

**Returns:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

### `valueOf(long value)`

**Parameters:**
- `value` (`long`)

**Returns:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

### `valueOf(BigInteger value)`

This is the inverse operation of #bigIntegerValue().

**Parameters:**
- `value` (`java.math.BigInteger`)

**Returns:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

### `valueOf(String string)`

**Parameters:**
- `string` (`java.lang.String`)

**Returns:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

### `valueOf(String string, int radix)`

**Parameters:**
- `string` (`java.lang.String`)
- `radix` (`int`)

**Returns:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

### `plus(UnsignedLong val)`

If the result would have more than 64 bits,
 returns the low 64 bits of the result.

**Parameters:**
- `val` ([`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md))

**Returns:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

### `minus(UnsignedLong val)`

If the result would have more than 64
 bits, returns the low 64 bits of the result.

**Parameters:**
- `val` ([`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md))

**Returns:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

### `times(UnsignedLong val)`

If the result would have more than 64
 bits, returns the low 64 bits of the result.

**Parameters:**
- `val` ([`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md))

**Returns:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

### `dividedBy(UnsignedLong val)`

**Parameters:**
- `val` ([`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md))

**Returns:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

### `mod(UnsignedLong val)`

**Parameters:**
- `val` ([`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md))

**Returns:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

### `intValue()`

**Returns:** `int`

### `longValue()`

This is an inverse operation
 to #fromLongBits.

 
Note that if this UnsignedLong holds a value >= 2^63, the returned value
 will be equal to this - 2^64.

**Returns:** `long`

### `floatValue()`

**Returns:** `float`

### `doubleValue()`

**Returns:** `double`

### `bigIntegerValue()`

**Returns:** `java.math.BigInteger`

### `compareTo(UnsignedLong o)`

**Parameters:**
- `o` ([`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md))

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

