# Class: `GeneralRange`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.GeneralRange`

**Implements:** `java.io.Serializable`

## Type Parameters

- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A generalized interval on any ordering, for internal use. Supports `null`. Unlike `Range`, this allows the use of an arbitrary comparator. This is designed for use in the
 implementation of subcollections of sorted collection types.

 <p>Whenever possible, use `Range` instead, which is better supported.
**Author:** Louis Wasserman

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

### `<init>(`java.util.Comparator<? super T>` comparator, `boolean` hasLowerBound, `T` lowerEndpoint, [`com.google.common.collect.BoundType`](./BoundType.md) lowerBoundType, `boolean` hasUpperBound, `T` upperEndpoint, [`com.google.common.collect.BoundType`](./BoundType.md) upperBoundType)`

## Methods

### `from([`com.google.common.collect.Range<T>`](./Range.md) range)`

**Returns:** [`com.google.common.collect.GeneralRange<T>`](./GeneralRange.md)

Converts a Range to a GeneralRange.

### `all(`java.util.Comparator<? super T>` comparator)`

**Returns:** [`com.google.common.collect.GeneralRange<T>`](./GeneralRange.md)

Returns the whole range relative to the specified comparator.

### `downTo(`java.util.Comparator<? super T>` comparator, `T` endpoint, [`com.google.common.collect.BoundType`](./BoundType.md) boundType)`

**Returns:** [`com.google.common.collect.GeneralRange<T>`](./GeneralRange.md)

Returns everything above the endpoint relative to the specified comparator, with the specified
 endpoint behavior.

### `upTo(`java.util.Comparator<? super T>` comparator, `T` endpoint, [`com.google.common.collect.BoundType`](./BoundType.md) boundType)`

**Returns:** [`com.google.common.collect.GeneralRange<T>`](./GeneralRange.md)

Returns everything below the endpoint relative to the specified comparator, with the specified
 endpoint behavior.

### `range(`java.util.Comparator<? super T>` comparator, `T` lower, [`com.google.common.collect.BoundType`](./BoundType.md) lowerType, `T` upper, [`com.google.common.collect.BoundType`](./BoundType.md) upperType)`

**Returns:** [`com.google.common.collect.GeneralRange<T>`](./GeneralRange.md)

Returns everything between the endpoints relative to the specified comparator, with the
 specified endpoint behavior.

### `comparator()`

**Returns:** `java.util.Comparator<? super T>`

### `hasLowerBound()`

**Returns:** `boolean`

### `hasUpperBound()`

**Returns:** `boolean`

### `isEmpty()`

**Returns:** `boolean`

### `tooLow(`T` t)`

**Returns:** `boolean`

### `tooHigh(`T` t)`

**Returns:** `boolean`

### `contains(`T` t)`

**Returns:** `boolean`

### `intersect([`com.google.common.collect.GeneralRange<T>`](./GeneralRange.md) other)`

**Returns:** [`com.google.common.collect.GeneralRange<T>`](./GeneralRange.md)

Returns the intersection of the two ranges, or an empty range if their intersection is empty.

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `reverse()`

**Returns:** [`com.google.common.collect.GeneralRange<T>`](./GeneralRange.md)

Returns the same range relative to the reversed comparator.

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

