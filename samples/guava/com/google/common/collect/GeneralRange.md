# Class: `GeneralRange`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.GeneralRange`

**Implements:** [`java.io.Serializable`](../../../../java/io/Serializable.md)

## Type Parameters

- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A generalized interval on any ordering, for internal use. Supports {@code null}. Unlike {@link Range}, this allows the use of an arbitrary comparator. This is designed for use in the
 implementation of subcollections of sorted collection types.

 <p>Whenever possible, use {@code Range} instead, which is better supported.
@author Louis Wasserman

## Fields

### `comparator`

**Type:** [`java.util.Comparator<? super T>`](../../../../java/util/Comparator.md)

### `hasLowerBound`

**Type:** `boolean`

### `lowerEndpoint`

**Type:** [`T`](T.md)

### `lowerBoundType`

**Type:** [`com.google.common.collect.BoundType`](./BoundType.md)

### `hasUpperBound`

**Type:** `boolean`

### `upperEndpoint`

**Type:** [`T`](T.md)

### `upperBoundType`

**Type:** [`com.google.common.collect.BoundType`](./BoundType.md)

### `reverse`

**Type:** [`com.google.common.collect.GeneralRange<T>`](./GeneralRange.md)

## Constructors

### `<init>([`java.util.Comparator<? super T>`](../../../../java/util/Comparator.md) comparator, `boolean` hasLowerBound, [`T`](T.md) lowerEndpoint, [`com.google.common.collect.BoundType`](./BoundType.md) lowerBoundType, `boolean` hasUpperBound, [`T`](T.md) upperEndpoint, [`com.google.common.collect.BoundType`](./BoundType.md) upperBoundType)`

## Methods

### `from([`com.google.common.collect.Range<T>`](./Range.md) range)`

**Returns:** [`com.google.common.collect.GeneralRange<T>`](./GeneralRange.md)

Converts a Range to a GeneralRange.

### `all([`java.util.Comparator<? super T>`](../../../../java/util/Comparator.md) comparator)`

**Returns:** [`com.google.common.collect.GeneralRange<T>`](./GeneralRange.md)

Returns the whole range relative to the specified comparator.

### `downTo([`java.util.Comparator<? super T>`](../../../../java/util/Comparator.md) comparator, [`T`](T.md) endpoint, [`com.google.common.collect.BoundType`](./BoundType.md) boundType)`

**Returns:** [`com.google.common.collect.GeneralRange<T>`](./GeneralRange.md)

Returns everything above the endpoint relative to the specified comparator, with the specified
 endpoint behavior.

### `upTo([`java.util.Comparator<? super T>`](../../../../java/util/Comparator.md) comparator, [`T`](T.md) endpoint, [`com.google.common.collect.BoundType`](./BoundType.md) boundType)`

**Returns:** [`com.google.common.collect.GeneralRange<T>`](./GeneralRange.md)

Returns everything below the endpoint relative to the specified comparator, with the specified
 endpoint behavior.

### `range([`java.util.Comparator<? super T>`](../../../../java/util/Comparator.md) comparator, [`T`](T.md) lower, [`com.google.common.collect.BoundType`](./BoundType.md) lowerType, [`T`](T.md) upper, [`com.google.common.collect.BoundType`](./BoundType.md) upperType)`

**Returns:** [`com.google.common.collect.GeneralRange<T>`](./GeneralRange.md)

Returns everything between the endpoints relative to the specified comparator, with the
 specified endpoint behavior.

### `comparator()`

**Returns:** [`java.util.Comparator<? super T>`](../../../../java/util/Comparator.md)

### `hasLowerBound()`

**Returns:** `boolean`

### `hasUpperBound()`

**Returns:** `boolean`

### `isEmpty()`

**Returns:** `boolean`

### `tooLow([`T`](T.md) t)`

**Returns:** `boolean`

### `tooHigh([`T`](T.md) t)`

**Returns:** `boolean`

### `contains([`T`](T.md) t)`

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

**Returns:** [`T`](T.md)

### `getLowerBoundType()`

**Returns:** [`com.google.common.collect.BoundType`](./BoundType.md)

### `getUpperEndpoint()`

**Returns:** [`T`](T.md)

### `getUpperBoundType()`

**Returns:** [`com.google.common.collect.BoundType`](./BoundType.md)

