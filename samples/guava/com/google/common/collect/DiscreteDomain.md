# Class: `DiscreteDomain`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.DiscreteDomain`

## Type Parameters

- `C` extends `java.lang.Comparable`

## Description

A descriptor for a <i>discrete</i> `Comparable` domain such as all `Integer`
 instances. A discrete domain is one that supports the three basic operations: `next`,
 `previous` and `distance`, according to their specifications. The methods `minValue` and `maxValue` should also be overridden for bounded types.

 <p>A discrete domain always represents the <i>entire</i> set of values of its type; it cannot
 represent partial domains such as "prime integers" or "strings of length 5."

 <p>See the Guava User Guide section on <a href="https://github.com/google/guava/wiki/RangesExplained#discrete-domains">`DiscreteDomain`</a>.
**Author:** Kevin Bourrillion
**Since:** 10.0

## Fields

### `supportsFastOffset`

**Type:** `boolean`

## Constructors

### `<init>()`

Constructor for use by subclasses.

### `<init>(`boolean` supportsFastOffset)`

Private constructor for built-in DiscreteDomains supporting fast offset.

## Methods

### `integers()`

**Returns:** [`com.google.common.collect.DiscreteDomain<java.lang.Integer>`](./DiscreteDomain.md)

Returns the discrete domain for values of type `Integer`.

 <p>This method always returns the same object. That object is serializable; deserializing it
 results in the same object too.
**Since:** 14.0 (since 10.0 as `DiscreteDomains.integers()`)

### `longs()`

**Returns:** [`com.google.common.collect.DiscreteDomain<java.lang.Long>`](./DiscreteDomain.md)

Returns the discrete domain for values of type `Long`.

 <p>This method always returns the same object. That object is serializable; deserializing it
 results in the same object too.
**Since:** 14.0 (since 10.0 as `DiscreteDomains.longs()`)

### `bigIntegers()`

**Returns:** [`com.google.common.collect.DiscreteDomain<java.math.BigInteger>`](./DiscreteDomain.md)

Returns the discrete domain for values of type `BigInteger`.

 <p>This method always returns the same object. That object is serializable; deserializing it
 results in the same object too.
**Since:** 15.0

### `offset(`C` origin, `long` distance)`

**Returns:** `C`

Returns, conceptually, "origin + distance", or equivalently, the result of calling `next` on `origin` `distance` times.

### `next(`C` value)`

**Returns:** `C`

Returns the unique least value of type `C` that is greater than `value`, or `null` if none exists. Inverse operation to `previous`.
@param value any value of type `C`
@return the least value greater than `value`, or `null` if `value` is `maxValue()`

### `previous(`C` value)`

**Returns:** `C`

Returns the unique greatest value of type `C` that is less than `value`, or `null` if none exists. Inverse operation to `next`.
@param value any value of type `C`
@return the greatest value less than `value`, or `null` if `value` is `minValue()`

### `distance(`C` start, `C` end)`

**Returns:** `long`

Returns a signed value indicating how many nested invocations of `next` (if positive) or
 `previous` (if negative) are needed to reach `end` starting from `start`.
 For example, if `end = next(next(next(start)))`, then `distance(start, end) == 3`
 and `distance(end, start) == -3`. As well, `distance(a, a)` is always zero.

 <p>Note that this function is necessarily well-defined for any discrete type.
@return the distance as described above, or `Long.MIN_VALUE` or `Long.MAX_VALUE` if
     the distance is too small or too large, respectively.

### `minValue()`

**Returns:** `C`

Returns the minimum value of type `C`, if it has one. The minimum value is the unique
 value for which `Comparable.compareTo(Object)` never returns a positive value for any
 input of type `C`.

 <p>The default implementation throws `NoSuchElementException`.
@return the minimum value of type `C`; never null
@throws NoSuchElementException if the type has no (practical) minimum value; for example,
     `java.math.BigInteger`

### `maxValue()`

**Returns:** `C`

Returns the maximum value of type `C`, if it has one. The maximum value is the unique
 value for which `Comparable.compareTo(Object)` never returns a negative value for any
 input of type `C`.

 <p>The default implementation throws `NoSuchElementException`.
@return the maximum value of type `C`; never null
@throws NoSuchElementException if the type has no (practical) maximum value; for example,
     `java.math.BigInteger`

