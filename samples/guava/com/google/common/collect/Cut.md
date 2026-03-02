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

**Returns:** `boolean`

**Parameters:**
- `value` (`C`)

### `typeAsLowerBound()`

**Returns:** [`com.google.common.collect.BoundType`](./BoundType.md)

### `typeAsUpperBound()`

**Returns:** [`com.google.common.collect.BoundType`](./BoundType.md)

### `withLowerBoundType(com.google.common.collect.BoundType boundType, com.google.common.collect.DiscreteDomain<C> domain)`

**Returns:** [`com.google.common.collect.Cut<C>`](./Cut.md)

**Parameters:**
- `boundType` ([`com.google.common.collect.BoundType`](./BoundType.md))
- `domain` ([`com.google.common.collect.DiscreteDomain<C>`](./DiscreteDomain.md))

### `withUpperBoundType(com.google.common.collect.BoundType boundType, com.google.common.collect.DiscreteDomain<C> domain)`

**Returns:** [`com.google.common.collect.Cut<C>`](./Cut.md)

**Parameters:**
- `boundType` ([`com.google.common.collect.BoundType`](./BoundType.md))
- `domain` ([`com.google.common.collect.DiscreteDomain<C>`](./DiscreteDomain.md))

### `describeAsLowerBound(java.lang.StringBuilder sb)`

**Returns:** `void`

**Parameters:**
- `sb` (`java.lang.StringBuilder`)

### `describeAsUpperBound(java.lang.StringBuilder sb)`

**Returns:** `void`

**Parameters:**
- `sb` (`java.lang.StringBuilder`)

### `leastValueAbove(com.google.common.collect.DiscreteDomain<C> domain)`

**Returns:** `C`

**Parameters:**
- `domain` ([`com.google.common.collect.DiscreteDomain<C>`](./DiscreteDomain.md))

### `greatestValueBelow(com.google.common.collect.DiscreteDomain<C> domain)`

**Returns:** `C`

**Parameters:**
- `domain` ([`com.google.common.collect.DiscreteDomain<C>`](./DiscreteDomain.md))

### `canonical(com.google.common.collect.DiscreteDomain<C> domain)`

**Returns:** [`com.google.common.collect.Cut<C>`](./Cut.md)

**Parameters:**
- `domain` ([`com.google.common.collect.DiscreteDomain<C>`](./DiscreteDomain.md))

### `compareTo(com.google.common.collect.Cut<C> that)`

**Returns:** `int`

**Parameters:**
- `that` ([`com.google.common.collect.Cut<C>`](./Cut.md))

### `endpoint()`

**Returns:** `C`

### `equals(java.lang.Object obj)`

**Returns:** `boolean`

**Parameters:**
- `obj` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

### `belowAll()`

**Returns:** [`com.google.common.collect.Cut<C>`](./Cut.md)

### `aboveAll()`

**Returns:** [`com.google.common.collect.Cut<C>`](./Cut.md)

### `belowValue(C endpoint)`

**Returns:** [`com.google.common.collect.Cut<C>`](./Cut.md)

**Parameters:**
- `endpoint` (`C`)

### `aboveValue(C endpoint)`

**Returns:** [`com.google.common.collect.Cut<C>`](./Cut.md)

**Parameters:**
- `endpoint` (`C`)

