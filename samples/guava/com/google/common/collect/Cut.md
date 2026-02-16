# Class: `Cut`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Cut`

**Implements:** `java.lang.Comparable<com.google.common.collect.Cut<C>>`, [`java.io.Serializable`](../../../../java/io/Serializable.md)

## Type Parameters

- `C` extends `java.lang.Comparable`

## Description

Implementation detail for the internal structure of {@link Range} instances. Represents a unique
 way of "cutting" a "number line" (actually of instances of type {@code C}, not necessarily
 "numbers") into two sections; this can be done below a certain value, above a certain value,
 below all values or above all values. With this object defined in this way, an interval can
 always be represented by a pair of {@code Cut} instances.
@author Kevin Bourrillion

## Fields

### `endpoint`

**Type:** [`C`](C.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>([`C`](C.md) endpoint)`

## Methods

### `isLessThan([`C`](C.md) value)`

**Returns:** `boolean`

### `typeAsLowerBound()`

**Returns:** [`com.google.common.collect.BoundType`](./BoundType.md)

### `typeAsUpperBound()`

**Returns:** [`com.google.common.collect.BoundType`](./BoundType.md)

### `withLowerBoundType([`com.google.common.collect.BoundType`](./BoundType.md) boundType, [`com.google.common.collect.DiscreteDomain<C>`](./DiscreteDomain.md) domain)`

**Returns:** [`com.google.common.collect.Cut<C>`](./Cut.md)

### `withUpperBoundType([`com.google.common.collect.BoundType`](./BoundType.md) boundType, [`com.google.common.collect.DiscreteDomain<C>`](./DiscreteDomain.md) domain)`

**Returns:** [`com.google.common.collect.Cut<C>`](./Cut.md)

### `describeAsLowerBound(`java.lang.StringBuilder` sb)`

**Returns:** `void`

### `describeAsUpperBound(`java.lang.StringBuilder` sb)`

**Returns:** `void`

### `leastValueAbove([`com.google.common.collect.DiscreteDomain<C>`](./DiscreteDomain.md) domain)`

**Returns:** [`C`](C.md)

### `greatestValueBelow([`com.google.common.collect.DiscreteDomain<C>`](./DiscreteDomain.md) domain)`

**Returns:** [`C`](C.md)

### `canonical([`com.google.common.collect.DiscreteDomain<C>`](./DiscreteDomain.md) domain)`

**Returns:** [`com.google.common.collect.Cut<C>`](./Cut.md)

### `compareTo([`com.google.common.collect.Cut<C>`](./Cut.md) that)`

**Returns:** `int`

### `endpoint()`

**Returns:** [`C`](C.md)

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `belowAll()`

**Returns:** [`com.google.common.collect.Cut<C>`](./Cut.md)

### `aboveAll()`

**Returns:** [`com.google.common.collect.Cut<C>`](./Cut.md)

### `belowValue([`C`](C.md) endpoint)`

**Returns:** [`com.google.common.collect.Cut<C>`](./Cut.md)

### `aboveValue([`C`](C.md) endpoint)`

**Returns:** [`com.google.common.collect.Cut<C>`](./Cut.md)

