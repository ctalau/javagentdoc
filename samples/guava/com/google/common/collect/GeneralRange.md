# Class: `GeneralRange`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.GeneralRange`

**Implements:** `java.io.Serializable`

## Type Parameters

- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Supports null. Unlike Range, this allows the use of an arbitrary comparator. This is designed for use in the
 implementation of subcollections of sorted collection types.

 
Whenever possible, use Range instead, which is better supported.

## Fields

### `comparator`

**Type:** `java.util.Comparator<? super T>`

### `hasLowerBound`

**Type:** `boolean`

### `lowerEndpoint`

**Type:** `T`

### `lowerBoundType`

**Type:** [`com.google.common.collect.BoundType`](./BoundType.md)

### `hasUpperBound`

**Type:** `boolean`

### `upperEndpoint`

**Type:** `T`

### `upperBoundType`

**Type:** [`com.google.common.collect.BoundType`](./BoundType.md)

### `reverse`

**Type:** [`com.google.common.collect.GeneralRange<T>`](./GeneralRange.md)

## Constructors

### `<init>(java.util.Comparator<? super T> comparator, boolean hasLowerBound, T lowerEndpoint, com.google.common.collect.BoundType lowerBoundType, boolean hasUpperBound, T upperEndpoint, com.google.common.collect.BoundType upperBoundType)`

**Parameters:**
- `comparator` (`java.util.Comparator<? super T>`)
- `hasLowerBound` (`boolean`)
- `lowerEndpoint` (`T`)
- `lowerBoundType` ([`com.google.common.collect.BoundType`](./BoundType.md))
- `hasUpperBound` (`boolean`)
- `upperEndpoint` (`T`)
- `upperBoundType` ([`com.google.common.collect.BoundType`](./BoundType.md))

## Methods

### `from(com.google.common.collect.Range<T> range)`

**Returns:** [`com.google.common.collect.GeneralRange<T>`](./GeneralRange.md)

**Parameters:**
- `range` ([`com.google.common.collect.Range<T>`](./Range.md))

### `all(java.util.Comparator<? super T> comparator)`

**Returns:** [`com.google.common.collect.GeneralRange<T>`](./GeneralRange.md)

**Parameters:**
- `comparator` (`java.util.Comparator<? super T>`)

### `downTo(java.util.Comparator<? super T> comparator, T endpoint, com.google.common.collect.BoundType boundType)`

**Returns:** [`com.google.common.collect.GeneralRange<T>`](./GeneralRange.md)

**Parameters:**
- `comparator` (`java.util.Comparator<? super T>`)
- `endpoint` (`T`)
- `boundType` ([`com.google.common.collect.BoundType`](./BoundType.md))

### `upTo(java.util.Comparator<? super T> comparator, T endpoint, com.google.common.collect.BoundType boundType)`

**Returns:** [`com.google.common.collect.GeneralRange<T>`](./GeneralRange.md)

**Parameters:**
- `comparator` (`java.util.Comparator<? super T>`)
- `endpoint` (`T`)
- `boundType` ([`com.google.common.collect.BoundType`](./BoundType.md))

### `range(java.util.Comparator<? super T> comparator, T lower, com.google.common.collect.BoundType lowerType, T upper, com.google.common.collect.BoundType upperType)`

**Returns:** [`com.google.common.collect.GeneralRange<T>`](./GeneralRange.md)

**Parameters:**
- `comparator` (`java.util.Comparator<? super T>`)
- `lower` (`T`)
- `lowerType` ([`com.google.common.collect.BoundType`](./BoundType.md))
- `upper` (`T`)
- `upperType` ([`com.google.common.collect.BoundType`](./BoundType.md))

### `comparator()`

**Returns:** `java.util.Comparator<? super T>`

### `hasLowerBound()`

**Returns:** `boolean`

### `hasUpperBound()`

**Returns:** `boolean`

### `isEmpty()`

**Returns:** `boolean`

### `tooLow(T t)`

**Returns:** `boolean`

**Parameters:**
- `t` (`T`)

### `tooHigh(T t)`

**Returns:** `boolean`

**Parameters:**
- `t` (`T`)

### `contains(T t)`

**Returns:** `boolean`

**Parameters:**
- `t` (`T`)

### `intersect(com.google.common.collect.GeneralRange<T> other)`

**Returns:** [`com.google.common.collect.GeneralRange<T>`](./GeneralRange.md)

**Parameters:**
- `other` ([`com.google.common.collect.GeneralRange<T>`](./GeneralRange.md))

### `equals(java.lang.Object obj)`

**Returns:** `boolean`

**Parameters:**
- `obj` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

### `reverse()`

**Returns:** [`com.google.common.collect.GeneralRange<T>`](./GeneralRange.md)

### `toString()`

**Returns:** `java.lang.String`

### `getLowerEndpoint()`

**Returns:** `T`

### `getLowerBoundType()`

**Returns:** [`com.google.common.collect.BoundType`](./BoundType.md)

### `getUpperEndpoint()`

**Returns:** `T`

### `getUpperBoundType()`

**Returns:** [`com.google.common.collect.BoundType`](./BoundType.md)

