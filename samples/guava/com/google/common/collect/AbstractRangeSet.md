# Class: `AbstractRangeSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.AbstractRangeSet`

**Implements:** [`com.google.common.collect.RangeSet<C>`](./RangeSet.md)

## Type Parameters

- `C` extends `java.lang.Comparable`

## Description

A skeletal implementation of `RangeSet`.
**Author:** Louis Wasserman

## Constructors

### `<init>()`

## Methods

### `contains(`C` value)`

**Returns:** `boolean`

### `rangeContaining(`C` value)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

### `isEmpty()`

**Returns:** `boolean`

### `add([`com.google.common.collect.Range<C>`](./Range.md) range)`

**Returns:** `void`

### `remove([`com.google.common.collect.Range<C>`](./Range.md) range)`

**Returns:** `void`

### `clear()`

**Returns:** `void`

### `enclosesAll([`com.google.common.collect.RangeSet<C>`](./RangeSet.md) other)`

**Returns:** `boolean`

### `addAll([`com.google.common.collect.RangeSet<C>`](./RangeSet.md) other)`

**Returns:** `void`

### `removeAll([`com.google.common.collect.RangeSet<C>`](./RangeSet.md) other)`

**Returns:** `void`

### `intersects([`com.google.common.collect.Range<C>`](./Range.md) otherRange)`

**Returns:** `boolean`

### `encloses([`com.google.common.collect.Range<C>`](./Range.md) otherRange)`

**Returns:** `boolean`

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

