# Class: `Cut`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Cut`

**Implements:** `java.lang.Comparable<com.google.common.collect.Cut<C>>`, `java.io.Serializable`

## Type Parameters

- `C` extends `java.lang.Comparable`

## Description

Represents a unique
 way of "cutting" a "number line" (actually of instances of type C, not necessarily
 "numbers") into two sections; this can be done below a certain value, above a certain value,
 below all values or above all values. With this object defined in this way, an interval can
 always be represented by a pair of Cut instances.

## Fields

### `endpoint`

**Type:** `C`

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(C endpoint)`

**Parameters:**
- `endpoint` (`C`)

## Methods

### `isLessThan(C value)`

**Parameters:**
- `value` (`C`)

**Returns:** `boolean`

### `typeAsLowerBound()`

**Returns:** [`com.google.common.collect.BoundType`](./BoundType.md)

### `typeAsUpperBound()`

**Returns:** [`com.google.common.collect.BoundType`](./BoundType.md)

### `withLowerBoundType(BoundType boundType, DiscreteDomain<C> domain)`

**Parameters:**
- `boundType` ([`com.google.common.collect.BoundType`](./BoundType.md))
- `domain` ([`com.google.common.collect.DiscreteDomain<C>`](./DiscreteDomain.md))

**Returns:** [`com.google.common.collect.Cut<C>`](./Cut.md)

### `withUpperBoundType(BoundType boundType, DiscreteDomain<C> domain)`

**Parameters:**
- `boundType` ([`com.google.common.collect.BoundType`](./BoundType.md))
- `domain` ([`com.google.common.collect.DiscreteDomain<C>`](./DiscreteDomain.md))

**Returns:** [`com.google.common.collect.Cut<C>`](./Cut.md)

### `describeAsLowerBound(StringBuilder sb)`

**Parameters:**
- `sb` (`java.lang.StringBuilder`)

**Returns:** `void`

### `describeAsUpperBound(StringBuilder sb)`

**Parameters:**
- `sb` (`java.lang.StringBuilder`)

**Returns:** `void`

### `leastValueAbove(DiscreteDomain<C> domain)`

**Parameters:**
- `domain` ([`com.google.common.collect.DiscreteDomain<C>`](./DiscreteDomain.md))

**Returns:** `C`

### `greatestValueBelow(DiscreteDomain<C> domain)`

**Parameters:**
- `domain` ([`com.google.common.collect.DiscreteDomain<C>`](./DiscreteDomain.md))

**Returns:** `C`

### `canonical(DiscreteDomain<C> domain)`

**Parameters:**
- `domain` ([`com.google.common.collect.DiscreteDomain<C>`](./DiscreteDomain.md))

**Returns:** [`com.google.common.collect.Cut<C>`](./Cut.md)

### `compareTo(Cut<C> that)`

**Parameters:**
- `that` ([`com.google.common.collect.Cut<C>`](./Cut.md))

**Returns:** `int`

### `endpoint()`

**Returns:** `C`

### `equals(Object obj)`

**Parameters:**
- `obj` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `belowAll()`

**Returns:** [`com.google.common.collect.Cut<C>`](./Cut.md)

### `aboveAll()`

**Returns:** [`com.google.common.collect.Cut<C>`](./Cut.md)

### `belowValue(C endpoint)`

**Parameters:**
- `endpoint` (`C`)

**Returns:** [`com.google.common.collect.Cut<C>`](./Cut.md)

### `aboveValue(C endpoint)`

**Parameters:**
- `endpoint` (`C`)

**Returns:** [`com.google.common.collect.Cut<C>`](./Cut.md)

