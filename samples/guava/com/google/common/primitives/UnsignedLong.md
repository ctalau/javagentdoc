# Class: `UnsignedLong`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.UnsignedLong`

**Extends:** `java.lang.Number`

**Implements:** `java.lang.Comparable<com.google.common.primitives.UnsignedLong>`, [`java.io.Serializable`](../../../../java/io/Serializable.md)

## Description

A wrapper class for unsigned {@code long} values, supporting arithmetic operations.

 <p>In some cases, when speed is more important than code readability, it may be faster simply to
 treat primitive {@code long} values as unsigned, using the methods from {@link UnsignedLongs}.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/PrimitivesExplained#unsigned-support">unsigned
 primitive utilities</a>.
@author Louis Wasserman
@author Colin Evans
@since 11.0

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

Returns an {@code UnsignedLong} corresponding to a given bit representation. The argument is
 interpreted as an unsigned 64-bit value. Specifically, the sign bit of {@code bits} is
 interpreted as a normal bit, and all other bits are treated as usual.

 <p>If the argument is nonnegative, the returned result will be equal to {@code bits},
 otherwise, the result will be equal to {@code 2^64 + bits}.

 <p>To represent decimal constants less than {@code 2^63}, consider {@link #valueOf(long)}
 instead.
@since 14.0

### `valueOf(`long` value)`

**Returns:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

Returns an {@code UnsignedLong} representing the same value as the specified {@code long}.
@throws IllegalArgumentException if {@code value} is negative
@since 14.0

### `valueOf([`java.math.BigInteger`](../../../../java/math/BigInteger.md) value)`

**Returns:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

Returns a {@code UnsignedLong} representing the same value as the specified {@code BigInteger}.
 This is the inverse operation of {@link #bigIntegerValue()}.
@throws IllegalArgumentException if {@code value} is negative or {@code value >= 2^64}

### `valueOf(`java.lang.String` string)`

**Returns:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

Returns an {@code UnsignedLong} holding the value of the specified {@code String}, parsed as an
 unsigned {@code long} value.
@throws NumberFormatException if the string does not contain a parsable unsigned {@code long}
     value

### `valueOf(`java.lang.String` string, `int` radix)`

**Returns:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

Returns an {@code UnsignedLong} holding the value of the specified {@code String}, parsed as an
 unsigned {@code long} value in the specified radix.
@throws NumberFormatException if the string does not contain a parsable unsigned {@code long}
     value, or {@code radix} is not between {@link Character#MIN_RADIX} and {@link Character#MAX_RADIX}

### `plus([`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md) val)`

**Returns:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

Returns the result of adding this and {@code val}. If the result would have more than 64 bits,
 returns the low 64 bits of the result.
@since 14.0

### `minus([`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md) val)`

**Returns:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

Returns the result of subtracting this and {@code val}. If the result would have more than 64
 bits, returns the low 64 bits of the result.
@since 14.0

### `times([`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md) val)`

**Returns:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

Returns the result of multiplying this and {@code val}. If the result would have more than 64
 bits, returns the low 64 bits of the result.
@since 14.0

### `dividedBy([`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md) val)`

**Returns:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

Returns the result of dividing this by {@code val}.
@since 14.0

### `mod([`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md) val)`

**Returns:** [`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md)

Returns this modulo {@code val}.
@since 14.0

### `intValue()`

**Returns:** `int`

Returns the value of this {@code UnsignedLong} as an {@code int}.

### `longValue()`

**Returns:** `long`

Returns the value of this {@code UnsignedLong} as a {@code long}. This is an inverse operation
 to {@link #fromLongBits}.

 <p>Note that if this {@code UnsignedLong} holds a value {@code >= 2^63}, the returned value
 will be equal to {@code this - 2^64}.

### `floatValue()`

**Returns:** `float`

Returns the value of this {@code UnsignedLong} as a {@code float}, analogous to a widening
 primitive conversion from {@code long} to {@code float}, and correctly rounded.

### `doubleValue()`

**Returns:** `double`

Returns the value of this {@code UnsignedLong} as a {@code double}, analogous to a widening
 primitive conversion from {@code long} to {@code double}, and correctly rounded.

### `bigIntegerValue()`

**Returns:** [`java.math.BigInteger`](../../../../java/math/BigInteger.md)

Returns the value of this {@code UnsignedLong} as a {@link BigInteger}.

### `compareTo([`com.google.common.primitives.UnsignedLong`](./UnsignedLong.md) o)`

**Returns:** `int`

### `hashCode()`

**Returns:** `int`

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

### `toString()`

**Returns:** `java.lang.String`

Returns a string representation of the {@code UnsignedLong} value, in base 10.

### `toString(`int` radix)`

**Returns:** `java.lang.String`

Returns a string representation of the {@code UnsignedLong} value, in base {@code radix}. If
 {@code radix < Character.MIN_RADIX} or {@code radix > Character.MAX_RADIX}, the radix {@code
 10} is used.

