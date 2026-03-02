# Class: `AbstractRangeSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.AbstractRangeSet`

**Implements:** [`com.google.common.collect.RangeSet<C>`](./RangeSet.md)

## Type Parameters

- `C` extends `java.lang.Comparable`

## Description

## Constructors

### `<init>()`

## Methods

### `contains(C value)`

**Returns:** `boolean`

**Parameters:**
- `value` (`C`)

### `rangeContaining(C value)`

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

**Parameters:**
- `value` (`C`)

### `isEmpty()`

**Returns:** `boolean`

### `add(com.google.common.collect.Range<C> range)`

**Returns:** `void`

**Parameters:**
- `range` ([`com.google.common.collect.Range<C>`](./Range.md))

### `remove(com.google.common.collect.Range<C> range)`

**Returns:** `void`

**Parameters:**
- `range` ([`com.google.common.collect.Range<C>`](./Range.md))

### `clear()`

**Returns:** `void`

### `enclosesAll(com.google.common.collect.RangeSet<C> other)`

**Returns:** `boolean`

**Parameters:**
- `other` ([`com.google.common.collect.RangeSet<C>`](./RangeSet.md))

### `addAll(com.google.common.collect.RangeSet<C> other)`

**Returns:** `void`

**Parameters:**
- `other` ([`com.google.common.collect.RangeSet<C>`](./RangeSet.md))

### `removeAll(com.google.common.collect.RangeSet<C> other)`

**Returns:** `void`

**Parameters:**
- `other` ([`com.google.common.collect.RangeSet<C>`](./RangeSet.md))

### `intersects(com.google.common.collect.Range<C> otherRange)`

**Returns:** `boolean`

**Parameters:**
- `otherRange` ([`com.google.common.collect.Range<C>`](./Range.md))

### `encloses(com.google.common.collect.Range<C> otherRange)`

**Returns:** `boolean`

**Parameters:**
- `otherRange` ([`com.google.common.collect.Range<C>`](./Range.md))

### `equals(java.lang.Object obj)`

**Returns:** `boolean`

**Parameters:**
- `obj` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

