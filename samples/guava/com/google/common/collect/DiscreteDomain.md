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

**Returns:** [`com.google.common.collect.DiscreteDomain<java.lang.Integer>`](./DiscreteDomain.md)

This method always returns the same object. That object is serializable; deserializing it
 results in the same object too.

### `longs()`

**Returns:** [`com.google.common.collect.DiscreteDomain<java.lang.Long>`](./DiscreteDomain.md)

This method always returns the same object. That object is serializable; deserializing it
 results in the same object too.

### `bigIntegers()`

**Returns:** [`com.google.common.collect.DiscreteDomain<java.math.BigInteger>`](./DiscreteDomain.md)

This method always returns the same object. That object is serializable; deserializing it
 results in the same object too.

### `offset(C origin, long distance)`

**Returns:** `C`

**Parameters:**
- `origin` (`C`)
- `distance` (`long`)

### `next(C value)`

**Returns:** `C`

Inverse operation to #previous.

**Parameters:**
- `value` (`C`): any value of type C

### `previous(C value)`

**Returns:** `C`

Inverse operation to #next.

**Parameters:**
- `value` (`C`): any value of type C

### `distance(C start, C end)`

**Returns:** `long`

For example, if end = next(next(next(start))), then distance(start, end) == 3
 and distance(end, start) == -3. As well, distance(a, a) is always zero.

 
Note that this function is necessarily well-defined for any discrete type.

**Parameters:**
- `start` (`C`)
- `end` (`C`)

### `minValue()`

**Returns:** `C`

The minimum value is the unique
 value for which Comparable#compareTo(Object) never returns a positive value for any
 input of type C.

 
The default implementation throws NoSuchElementException.

### `maxValue()`

**Returns:** `C`

The maximum value is the unique
 value for which Comparable#compareTo(Object) never returns a negative value for any
 input of type C.

 
The default implementation throws NoSuchElementException.

