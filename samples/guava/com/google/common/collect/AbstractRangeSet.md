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

**Parameters:**
- `value` (`C`)

**Returns:** `boolean`

### `rangeContaining(C value)`

**Parameters:**
- `value` (`C`)

**Returns:** [`com.google.common.collect.Range<C>`](./Range.md)

### `isEmpty()`

**Returns:** `boolean`

### `add(Range<C> range)`

**Parameters:**
- `range` ([`com.google.common.collect.Range<C>`](./Range.md))

**Returns:** `void`

### `remove(Range<C> range)`

**Parameters:**
- `range` ([`com.google.common.collect.Range<C>`](./Range.md))

**Returns:** `void`

### `clear()`

**Returns:** `void`

### `enclosesAll(RangeSet<C> other)`

**Parameters:**
- `other` ([`com.google.common.collect.RangeSet<C>`](./RangeSet.md))

**Returns:** `boolean`

### `addAll(RangeSet<C> other)`

**Parameters:**
- `other` ([`com.google.common.collect.RangeSet<C>`](./RangeSet.md))

**Returns:** `void`

### `removeAll(RangeSet<C> other)`

**Parameters:**
- `other` ([`com.google.common.collect.RangeSet<C>`](./RangeSet.md))

**Returns:** `void`

### `intersects(Range<C> otherRange)`

**Parameters:**
- `otherRange` ([`com.google.common.collect.Range<C>`](./Range.md))

**Returns:** `boolean`

### `encloses(Range<C> otherRange)`

**Parameters:**
- `otherRange` ([`com.google.common.collect.Range<C>`](./Range.md))

**Returns:** `boolean`

### `equals(Object obj)`

**Parameters:**
- `obj` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

