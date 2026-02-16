# Class: `UnsignedInteger`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.UnsignedInteger`

**Extends:** `java.lang.Number`

**Implements:** `java.lang.Comparable<com.google.common.primitives.UnsignedInteger>`

## Description

A wrapper class for unsigned {@code int} values, supporting arithmetic operations.

 <p>In some cases, when speed is more important than code readability, it may be faster simply to
 treat primitive {@code int} values as unsigned, using the methods from {@link UnsignedInts}.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/PrimitivesExplained#unsigned-support">unsigned
 primitive utilities</a>.
@author Louis Wasserman
@since 11.0

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

Returns an {@code UnsignedInteger} corresponding to a given bit representation. The argument is
 interpreted as an unsigned 32-bit value. Specifically, the sign bit of {@code bits} is
 interpreted as a normal bit, and all other bits are treated as usual.

 <p>If the argument is nonnegative, the returned result will be equal to {@code bits},
 otherwise, the result will be equal to {@code 2^32 + bits}.

 <p>To represent unsigned decimal constants, consider {@link #valueOf(long)} instead.
@since 14.0

### `valueOf(`long` value)`

**Returns:** [`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md)

Returns an {@code UnsignedInteger} that is equal to {@code value}, if possible. The inverse
 operation of {@link #longValue()}.

### `valueOf([`java.math.BigInteger`](../../../../java/math/BigInteger.md) value)`

**Returns:** [`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md)

Returns a {@code UnsignedInteger} representing the same value as the specified {@link BigInteger}. This is the inverse operation of {@link #bigIntegerValue()}.
@throws IllegalArgumentException if {@code value} is negative or {@code value >= 2^32}

### `valueOf(`java.lang.String` string)`

**Returns:** [`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md)

Returns an {@code UnsignedInteger} holding the value of the specified {@code String}, parsed as
 an unsigned {@code int} value.
@throws NumberFormatException if the string does not contain a parsable unsigned {@code int}
     value

### `valueOf(`java.lang.String` string, `int` radix)`

**Returns:** [`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md)

Returns an {@code UnsignedInteger} holding the value of the specified {@code String}, parsed as
 an unsigned {@code int} value in the specified radix.
@throws NumberFormatException if the string does not contain a parsable unsigned {@code int}
     value

### `plus([`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md) val)`

**Returns:** [`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md)

Returns the result of adding this and {@code val}. If the result would have more than 32 bits,
 returns the low 32 bits of the result.
@since 14.0

### `minus([`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md) val)`

**Returns:** [`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md)

Returns the result of subtracting this and {@code val}. If the result would be negative,
 returns the low 32 bits of the result.
@since 14.0

### `times([`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md) val)`

**Returns:** [`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md)

Returns the result of multiplying this and {@code val}. If the result would have more than 32
 bits, returns the low 32 bits of the result.
@since 14.0

### `dividedBy([`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md) val)`

**Returns:** [`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md)

Returns the result of dividing this by {@code val}.
@throws ArithmeticException if {@code val} is zero
@since 14.0

### `mod([`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md) val)`

**Returns:** [`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md)

Returns this mod {@code val}.
@throws ArithmeticException if {@code val} is zero
@since 14.0

### `intValue()`

**Returns:** `int`

Returns the value of this {@code UnsignedInteger} as an {@code int}. This is an inverse
 operation to {@link #fromIntBits}.

 <p>Note that if this {@code UnsignedInteger} holds a value {@code >= 2^31}, the returned value
 will be equal to {@code this - 2^32}.

### `longValue()`

**Returns:** `long`

Returns the value of this {@code UnsignedInteger} as a {@code long}.

### `floatValue()`

**Returns:** `float`

Returns the value of this {@code UnsignedInteger} as a {@code float}, analogous to a widening
 primitive conversion from {@code int} to {@code float}, and correctly rounded.

### `doubleValue()`

**Returns:** `double`

Returns the value of this {@code UnsignedInteger} as a {@code float}, analogous to a widening
 primitive conversion from {@code int} to {@code double}, and correctly rounded.

### `bigIntegerValue()`

**Returns:** [`java.math.BigInteger`](../../../../java/math/BigInteger.md)

Returns the value of this {@code UnsignedInteger} as a {@link BigInteger}.

### `compareTo([`com.google.common.primitives.UnsignedInteger`](./UnsignedInteger.md) other)`

**Returns:** `int`

Compares this unsigned integer to another unsigned integer. Returns {@code 0} if they are
 equal, a negative number if {@code this < other}, and a positive number if {@code this >
 other}.

### `hashCode()`

**Returns:** `int`

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

### `toString()`

**Returns:** `java.lang.String`

Returns a string representation of the {@code UnsignedInteger} value, in base 10.

### `toString(`int` radix)`

**Returns:** `java.lang.String`

Returns a string representation of the {@code UnsignedInteger} value, in base {@code radix}. If
 {@code radix < Character.MIN_RADIX} or {@code radix > Character.MAX_RADIX}, the radix {@code
 10} is used.

