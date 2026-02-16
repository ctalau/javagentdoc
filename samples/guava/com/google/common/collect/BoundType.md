# Enum: `BoundType`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.BoundType`

## Description

Indicates whether an endpoint of some range is contained in the range itself ("closed") or not
 ("open"). If a range is unbounded on a side, it is neither open nor closed on that side; the
 bound simply does not exist.
**Since:** 10.0

## Fields

### `inclusive`

**Type:** `boolean`

## Constructors

### `<init>(`boolean` inclusive)`

## Methods

### `values()`

**Returns:** [`com.google.common.collect.BoundType[]`](./BoundType.md)

### `valueOf(`java.lang.String` name)`

**Returns:** [`com.google.common.collect.BoundType`](./BoundType.md)

### `forBoolean(`boolean` inclusive)`

**Returns:** [`com.google.common.collect.BoundType`](./BoundType.md)

Returns the bound type corresponding to a boolean value for inclusivity.

