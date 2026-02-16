# Class: `UnsignedLong`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.UnsignedLong`

**Extends:** `java.lang.Number`

**Implements:** `java.lang.Comparable<com.google.common.primitives.UnsignedLong>`, `java.io.Serializable`

## Description

A wrapper class for unsigned `long` values, supporting arithmetic operations.

 <p>In some cases, when speed is more important than code readability, it may be faster simply to
 treat primitive `long` values as unsigned, using the methods from `UnsignedLongs`.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/PrimitivesExplained#unsigned-support">unsigned
 primitive utilities</a>.
**Author:** Louis Wasserman
**Author:** Colin Evans
**Since:** 11.0

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

### `<init>(`long` value)`

## Methods

### `fromLongBits(`long` bits)`

**Returns:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

Returns an `UnsignedLong` corresponding to a given bit representation. The argument is
 interpreted as an unsigned 64-bit value. Specifically, the sign bit of `bits` is
 interpreted as a normal bit, and all other bits are treated as usual.

 <p>If the argument is nonnegative, the returned result will be equal to `bits`,
 otherwise, the result will be equal to `2^64 + bits`.

 <p>To represent decimal constants less than `2^63`, consider `valueOf(long)`
 instead.
**Since:** 14.0

### `valueOf(`long` value)`

**Returns:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

Returns an `UnsignedLong` representing the same value as the specified `long`.
@throws IllegalArgumentException if `value` is negative
**Since:** 14.0

### `valueOf(`java.math.BigInteger` value)`

**Returns:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

Returns a `UnsignedLong` representing the same value as the specified `BigInteger`.
 This is the inverse operation of `bigIntegerValue()`.
@throws IllegalArgumentException if `value` is negative or `value >= 2^64`

### `valueOf(`java.lang.String` string)`

**Returns:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

Returns an `UnsignedLong` holding the value of the specified `String`, parsed as an
 unsigned `long` value.
@throws NumberFormatException if the string does not contain a parsable unsigned `long`
     value

### `valueOf(`java.lang.String` string, `int` radix)`

**Returns:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

Returns an `UnsignedLong` holding the value of the specified `String`, parsed as an
 unsigned `long` value in the specified radix.
@throws NumberFormatException if the string does not contain a parsable unsigned `long`
     value, or `radix` is not between `Character.MIN_RADIX` and `Character.MAX_RADIX`

### `plus([`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md) val)`

**Returns:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

Returns the result of adding this and `val`. If the result would have more than 64 bits,
 returns the low 64 bits of the result.
**Since:** 14.0

### `minus([`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md) val)`

**Returns:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

Returns the result of subtracting this and `val`. If the result would have more than 64
 bits, returns the low 64 bits of the result.
**Since:** 14.0

### `times([`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md) val)`

**Returns:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

Returns the result of multiplying this and `val`. If the result would have more than 64
 bits, returns the low 64 bits of the result.
**Since:** 14.0

### `dividedBy([`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md) val)`

**Returns:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

Returns the result of dividing this by `val`.
**Since:** 14.0

### `mod([`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md) val)`

**Returns:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

Returns this modulo `val`.
**Since:** 14.0

### `intValue()`

**Returns:** `int`

Returns the value of this `UnsignedLong` as an `int`.

### `longValue()`

**Returns:** `long`

Returns the value of this `UnsignedLong` as a `long`. This is an inverse operation
 to `fromLongBits`.

 <p>Note that if this `UnsignedLong` holds a value `>= 2^63`, the returned value
 will be equal to `this - 2^64`.

### `floatValue()`

**Returns:** `float`

Returns the value of this `UnsignedLong` as a `float`, analogous to a widening
 primitive conversion from `long` to `float`, and correctly rounded.

### `doubleValue()`

**Returns:** `double`

Returns the value of this `UnsignedLong` as a `double`, analogous to a widening
 primitive conversion from `long` to `double`, and correctly rounded.

### `bigIntegerValue()`

**Returns:** `java.math.BigInteger`

Returns the value of this `UnsignedLong` as a `BigInteger`.

### `compareTo([`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md) o)`

**Returns:** `int`

### `hashCode()`

**Returns:** `int`

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

### `toString()`

**Returns:** `java.lang.String`

Returns a string representation of the `UnsignedLong` value, in base 10.

### `toString(`int` radix)`

**Returns:** `java.lang.String`

Returns a string representation of the `UnsignedLong` value, in base `radix`. If
 `radix < Character.MIN_RADIX` or `radix > Character.MAX_RADIX`, the radix `10` is used.

