# Class: `DiscreteDomain`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.DiscreteDomain`

## Type Parameters

- `C` extends `java.lang.Comparable`

## Description

A descriptor for a <i>discrete</i> {@code Comparable} domain such as all {@link Integer}
 instances. A discrete domain is one that supports the three basic operations: {@link #next},
 {@link #previous} and {@link #distance}, according to their specifications. The methods {@link #minValue} and {@link #maxValue} should also be overridden for bounded types.

 <p>A discrete domain always represents the <i>entire</i> set of values of its type; it cannot
 represent partial domains such as "prime integers" or "strings of length 5."

 <p>See the Guava User Guide section on <a href="https://github.com/google/guava/wiki/RangesExplained#discrete-domains">{@code
 DiscreteDomain}</a>.
@author Kevin Bourrillion
@since 10.0

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

Returns the discrete domain for values of type {@code Integer}.

 <p>This method always returns the same object. That object is serializable; deserializing it
 results in the same object too.
@since 14.0 (since 10.0 as {@code DiscreteDomains.integers()})

### `longs()`

**Returns:** [`com.google.common.collect.DiscreteDomain<java.lang.Long>`](./DiscreteDomain.md)

Returns the discrete domain for values of type {@code Long}.

 <p>This method always returns the same object. That object is serializable; deserializing it
 results in the same object too.
@since 14.0 (since 10.0 as {@code DiscreteDomains.longs()})

### `bigIntegers()`

**Returns:** [`com.google.common.collect.DiscreteDomain<java.math.BigInteger>`](./DiscreteDomain.md)

Returns the discrete domain for values of type {@code BigInteger}.

 <p>This method always returns the same object. That object is serializable; deserializing it
 results in the same object too.
@since 15.0

### `offset([`C`](C.md) origin, `long` distance)`

**Returns:** [`C`](C.md)

Returns, conceptually, "origin + distance", or equivalently, the result of calling {@link #next} on {@code origin} {@code distance} times.

### `next([`C`](C.md) value)`

**Returns:** [`C`](C.md)

Returns the unique least value of type {@code C} that is greater than {@code value}, or {@code
 null} if none exists. Inverse operation to {@link #previous}.
@param value any value of type {@code C}
@return the least value greater than {@code value}, or {@code null} if {@code value} is {@code
     maxValue()}

### `previous([`C`](C.md) value)`

**Returns:** [`C`](C.md)

Returns the unique greatest value of type {@code C} that is less than {@code value}, or {@code
 null} if none exists. Inverse operation to {@link #next}.
@param value any value of type {@code C}
@return the greatest value less than {@code value}, or {@code null} if {@code value} is {@code
     minValue()}

### `distance([`C`](C.md) start, [`C`](C.md) end)`

**Returns:** `long`

Returns a signed value indicating how many nested invocations of {@link #next} (if positive) or
 {@link #previous} (if negative) are needed to reach {@code end} starting from {@code start}.
 For example, if {@code end = next(next(next(start)))}, then {@code distance(start, end) == 3}
 and {@code distance(end, start) == -3}. As well, {@code distance(a, a)} is always zero.

 <p>Note that this function is necessarily well-defined for any discrete type.
@return the distance as described above, or {@link Long#MIN_VALUE} or {@link Long#MAX_VALUE} if
     the distance is too small or too large, respectively.

### `minValue()`

**Returns:** [`C`](C.md)

Returns the minimum value of type {@code C}, if it has one. The minimum value is the unique
 value for which {@link Comparable#compareTo(Object)} never returns a positive value for any
 input of type {@code C}.

 <p>The default implementation throws {@code NoSuchElementException}.
@return the minimum value of type {@code C}; never null
@throws NoSuchElementException if the type has no (practical) minimum value; for example,
     {@link java.math.BigInteger}

### `maxValue()`

**Returns:** [`C`](C.md)

Returns the maximum value of type {@code C}, if it has one. The maximum value is the unique
 value for which {@link Comparable#compareTo(Object)} never returns a negative value for any
 input of type {@code C}.

 <p>The default implementation throws {@code NoSuchElementException}.
@return the maximum value of type {@code C}; never null
@throws NoSuchElementException if the type has no (practical) maximum value; for example,
     {@link java.math.BigInteger}

