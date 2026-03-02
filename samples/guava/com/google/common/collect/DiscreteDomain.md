# Class: `DiscreteDomain`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.DiscreteDomain`

## Type Parameters

- `C` extends `java.lang.Comparable`

## Description

A discrete domain is one that supports the three basic operations: #next,
 #previous and #distance, according to their specifications. The methods #minValue and #maxValue should also be overridden for bounded types.

 
A discrete domain always represents the *entire* set of values of its type; it cannot
 represent partial domains such as "prime integers" or "strings of length 5."

 
See the Guava User Guide section on [
 DiscreteDomain](https://github.com/google/guava/wiki/RangesExplained#discrete-domains).

## Fields

### `supportsFastOffset`

**Type:** `boolean`

## Constructors

### `<init>()`

### `<init>(boolean supportsFastOffset)`

**Parameters:**
- `supportsFastOffset` (`boolean`)

## Methods

### `integers()`

This method always returns the same object. That object is serializable; deserializing it
 results in the same object too.

**Returns:** [`com.google.common.collect.DiscreteDomain<java.lang.Integer>`](./DiscreteDomain.md)

### `longs()`

This method always returns the same object. That object is serializable; deserializing it
 results in the same object too.

**Returns:** [`com.google.common.collect.DiscreteDomain<java.lang.Long>`](./DiscreteDomain.md)

### `bigIntegers()`

This method always returns the same object. That object is serializable; deserializing it
 results in the same object too.

**Returns:** [`com.google.common.collect.DiscreteDomain<java.math.BigInteger>`](./DiscreteDomain.md)

### `offset(C origin, long distance)`

**Parameters:**
- `origin` (`C`)
- `distance` (`long`)

**Returns:** `C`

### `next(C value)`

Inverse operation to #previous.

**Parameters:**
- `value` (`C`): any value of type C

**Returns:** `C`

### `previous(C value)`

Inverse operation to #next.

**Parameters:**
- `value` (`C`): any value of type C

**Returns:** `C`

### `distance(C start, C end)`

For example, if end = next(next(next(start))), then distance(start, end) == 3
 and distance(end, start) == -3. As well, distance(a, a) is always zero.

 
Note that this function is necessarily well-defined for any discrete type.

**Parameters:**
- `start` (`C`)
- `end` (`C`)

**Returns:** `long`

### `minValue()`

The minimum value is the unique
 value for which Comparable#compareTo(Object) never returns a positive value for any
 input of type C.

 
The default implementation throws NoSuchElementException.

**Returns:** `C`

### `maxValue()`

The maximum value is the unique
 value for which Comparable#compareTo(Object) never returns a negative value for any
 input of type C.

 
The default implementation throws NoSuchElementException.

**Returns:** `C`

