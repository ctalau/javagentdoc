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

### `<init>(Comparator<? super T> comparator, boolean hasLowerBound, T lowerEndpoint, BoundType lowerBoundType, boolean hasUpperBound, T upperEndpoint, BoundType upperBoundType)`

**Parameters:**
- `comparator` (`java.util.Comparator<? super T>`)
- `hasLowerBound` (`boolean`)
- `lowerEndpoint` (`T`)
- `lowerBoundType` ([`com.google.common.collect.BoundType`](./BoundType.md))
- `hasUpperBound` (`boolean`)
- `upperEndpoint` (`T`)
- `upperBoundType` ([`com.google.common.collect.BoundType`](./BoundType.md))

## Methods

### `from(Range<T> range)`

**Parameters:**
- `range` ([`com.google.common.collect.Range<T>`](./Range.md))

**Returns:** [`com.google.common.collect.GeneralRange<T>`](./GeneralRange.md)

### `all(Comparator<? super T> comparator)`

**Parameters:**
- `comparator` (`java.util.Comparator<? super T>`)

**Returns:** [`com.google.common.collect.GeneralRange<T>`](./GeneralRange.md)

### `downTo(Comparator<? super T> comparator, T endpoint, BoundType boundType)`

**Parameters:**
- `comparator` (`java.util.Comparator<? super T>`)
- `endpoint` (`T`)
- `boundType` ([`com.google.common.collect.BoundType`](./BoundType.md))

**Returns:** [`com.google.common.collect.GeneralRange<T>`](./GeneralRange.md)

### `upTo(Comparator<? super T> comparator, T endpoint, BoundType boundType)`

**Parameters:**
- `comparator` (`java.util.Comparator<? super T>`)
- `endpoint` (`T`)
- `boundType` ([`com.google.common.collect.BoundType`](./BoundType.md))

**Returns:** [`com.google.common.collect.GeneralRange<T>`](./GeneralRange.md)

### `range(Comparator<? super T> comparator, T lower, BoundType lowerType, T upper, BoundType upperType)`

**Parameters:**
- `comparator` (`java.util.Comparator<? super T>`)
- `lower` (`T`)
- `lowerType` ([`com.google.common.collect.BoundType`](./BoundType.md))
- `upper` (`T`)
- `upperType` ([`com.google.common.collect.BoundType`](./BoundType.md))

**Returns:** [`com.google.common.collect.GeneralRange<T>`](./GeneralRange.md)

### `comparator()`

**Returns:** `java.util.Comparator<? super T>`

### `hasLowerBound()`

**Returns:** `boolean`

### `hasUpperBound()`

**Returns:** `boolean`

### `isEmpty()`

**Returns:** `boolean`

### `tooLow(T t)`

**Parameters:**
- `t` (`T`)

**Returns:** `boolean`

### `tooHigh(T t)`

**Parameters:**
- `t` (`T`)

**Returns:** `boolean`

### `contains(T t)`

**Parameters:**
- `t` (`T`)

**Returns:** `boolean`

### `intersect(GeneralRange<T> other)`

**Parameters:**
- `other` ([`com.google.common.collect.GeneralRange<T>`](./GeneralRange.md))

**Returns:** [`com.google.common.collect.GeneralRange<T>`](./GeneralRange.md)

### `equals(Object obj)`

**Parameters:**
- `obj` (`java.lang.Object`)

**Returns:** `boolean`

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

