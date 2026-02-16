# Class: `UnsignedInteger`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.UnsignedInteger`

**Extends:** `java.lang.Number`

**Implements:** `java.lang.Comparable<com.google.common.primitives.UnsignedInteger>`

## Description

A wrapper class for unsigned `int` values, supporting arithmetic operations.

 <p>In some cases, when speed is more important than code readability, it may be faster simply to
 treat primitive `int` values as unsigned, using the methods from `UnsignedInts`.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/PrimitivesExplained#unsigned-support">unsigned
 primitive utilities</a>.
**Author:** Louis Wasserman
**Since:** 11.0

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

### `<init>(`int` value)`

## Methods

### `fromIntBits(`int` bits)`

**Returns:** [`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md)

Returns an `UnsignedInteger` corresponding to a given bit representation. The argument is
 interpreted as an unsigned 32-bit value. Specifically, the sign bit of `bits` is
 interpreted as a normal bit, and all other bits are treated as usual.

 <p>If the argument is nonnegative, the returned result will be equal to `bits`,
 otherwise, the result will be equal to `2^32 + bits`.

 <p>To represent unsigned decimal constants, consider `valueOf(long)` instead.
**Since:** 14.0

### `valueOf(`long` value)`

**Returns:** [`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md)

Returns an `UnsignedInteger` that is equal to `value`, if possible. The inverse
 operation of `longValue()`.

### `valueOf(`java.math.BigInteger` value)`

**Returns:** [`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md)

Returns a `UnsignedInteger` representing the same value as the specified `BigInteger`. This is the inverse operation of `bigIntegerValue()`.
@throws IllegalArgumentException if `value` is negative or `value >= 2^32`

### `valueOf(`java.lang.String` string)`

**Returns:** [`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md)

Returns an `UnsignedInteger` holding the value of the specified `String`, parsed as
 an unsigned `int` value.
@throws NumberFormatException if the string does not contain a parsable unsigned `int`
     value

### `valueOf(`java.lang.String` string, `int` radix)`

**Returns:** [`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md)

Returns an `UnsignedInteger` holding the value of the specified `String`, parsed as
 an unsigned `int` value in the specified radix.
@throws NumberFormatException if the string does not contain a parsable unsigned `int`
     value

### `plus([`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md) val)`

**Returns:** [`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md)

Returns the result of adding this and `val`. If the result would have more than 32 bits,
 returns the low 32 bits of the result.
**Since:** 14.0

### `minus([`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md) val)`

**Returns:** [`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md)

Returns the result of subtracting this and `val`. If the result would be negative,
 returns the low 32 bits of the result.
**Since:** 14.0

### `times([`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md) val)`

**Returns:** [`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md)

Returns the result of multiplying this and `val`. If the result would have more than 32
 bits, returns the low 32 bits of the result.
**Since:** 14.0

### `dividedBy([`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md) val)`

**Returns:** [`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md)

Returns the result of dividing this by `val`.
@throws ArithmeticException if `val` is zero
**Since:** 14.0

### `mod([`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md) val)`

**Returns:** [`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md)

Returns this mod `val`.
@throws ArithmeticException if `val` is zero
**Since:** 14.0

### `intValue()`

**Returns:** `int`

Returns the value of this `UnsignedInteger` as an `int`. This is an inverse
 operation to `fromIntBits`.

 <p>Note that if this `UnsignedInteger` holds a value `>= 2^31`, the returned value
 will be equal to `this - 2^32`.

### `longValue()`

**Returns:** `long`

Returns the value of this `UnsignedInteger` as a `long`.

### `floatValue()`

**Returns:** `float`

Returns the value of this `UnsignedInteger` as a `float`, analogous to a widening
 primitive conversion from `int` to `float`, and correctly rounded.

### `doubleValue()`

**Returns:** `double`

Returns the value of this `UnsignedInteger` as a `float`, analogous to a widening
 primitive conversion from `int` to `double`, and correctly rounded.

### `bigIntegerValue()`

**Returns:** `java.math.BigInteger`

Returns the value of this `UnsignedInteger` as a `BigInteger`.

### `compareTo([`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md) other)`

**Returns:** `int`

Compares this unsigned integer to another unsigned integer. Returns `0` if they are
 equal, a negative number if `this < other`, and a positive number if `this >
 other`.

### `hashCode()`

**Returns:** `int`

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

### `toString()`

**Returns:** `java.lang.String`

Returns a string representation of the `UnsignedInteger` value, in base 10.

### `toString(`int` radix)`

**Returns:** `java.lang.String`

Returns a string representation of the `UnsignedInteger` value, in base `radix`. If
 `radix < Character.MIN_RADIX` or `radix > Character.MAX_RADIX`, the radix `10` is used.

