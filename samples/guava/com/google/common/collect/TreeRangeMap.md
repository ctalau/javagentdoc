# Class: `TreeRangeMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.TreeRangeMap`

**Implements:** [`com.google.common.collect.RangeMap<K,V>`](./RangeMap.md)

## Type Parameters

- `K` extends `java.lang.Comparable`
- `V` extends `java.lang.Object`

## Description

An implementation of `RangeMap` based on a `TreeMap`, supporting all optional
 operations.

 <p>Like all `RangeMap` implementations, this supports neither null keys nor null values.
**Author:** Louis Wasserman
**Since:** 14.0

## Fields

### `entriesByLowerBound`

**Type:** `java.util.NavigableMap<com.google.common.collect.Cut<K>,com.google.common.collect.TreeRangeMap.RangeMapEntry<K,V>>`

### `EMPTY_SUB_RANGE_MAP`

**Type:** [`com.google.common.collect.RangeMap<java.lang.Comparable<?>,java.lang.Object>`](RangeMap,java/lang/Object>.md)

## Constructors

### `<init>()`

## Methods

### `create()`

**Returns:** [`com.google.common.collect.TreeRangeMap<K,V>`](./TreeRangeMap.md)

### `get(`K` key)`

**Returns:** `V`

### `getEntry(`K` key)`

**Returns:** `java.util.Map.Entry<com.google.common.collect.Range<K>,V>`

### `put([`com.google.common.collect.Range<K>`](./Range.md) range, `V` value)`

**Returns:** `void`

### `putCoalescing([`com.google.common.collect.Range<K>`](./Range.md) range, `V` value)`

**Returns:** `void`

### `coalescedRange([`com.google.common.collect.Range<K>`](./Range.md) range, `V` value)`

**Returns:** [`com.google.common.collect.Range<K>`](./Range.md)

Computes the coalesced range for the given range+value - does not mutate the map.

### `coalesce([`com.google.common.collect.Range<K>`](./Range.md) range, `V` value, `java.util.Map.Entry<com.google.common.collect.Cut<K>,com.google.common.collect.TreeRangeMap.RangeMapEntry<K,V>>` entry)`

**Returns:** [`com.google.common.collect.Range<K>`](./Range.md)

Returns the range that spans the given range and entry, if the entry can be coalesced.

### `putAll([`com.google.common.collect.RangeMap<K,? extends V>`](./RangeMap.md) rangeMap)`

**Returns:** `void`

### `clear()`

**Returns:** `void`

### `span()`

**Returns:** [`com.google.common.collect.Range<K>`](./Range.md)

### `putRangeMapEntry([`com.google.common.collect.Cut<K>`](./Cut.md) lowerBound, [`com.google.common.collect.Cut<K>`](./Cut.md) upperBound, `V` value)`

**Returns:** `void`

### `remove([`com.google.common.collect.Range<K>`](./Range.md) rangeToRemove)`

**Returns:** `void`

### `split([`com.google.common.collect.Cut<K>`](./Cut.md) cut)`

**Returns:** `void`

### `merge([`com.google.common.collect.Range<K>`](./Range.md) range, `V` value, `java.util.function.BiFunction<? super V,? super @org.checkerframework.checker.nullness.qual.Nullable V,? extends @org.checkerframework.checker.nullness.qual.Nullable V>` remappingFunction)`

**Returns:** `void`

### `asMapOfRanges()`

**Returns:** `java.util.Map<com.google.common.collect.Range<K>,V>`

### `asDescendingMapOfRanges()`

**Returns:** `java.util.Map<com.google.common.collect.Range<K>,V>`

### `subRangeMap([`com.google.common.collect.Range<K>`](./Range.md) subRange)`

**Returns:** [`com.google.common.collect.RangeMap<K,V>`](./RangeMap.md)

### `emptySubRangeMap()`

**Returns:** [`com.google.common.collect.RangeMap<K,V>`](./RangeMap.md)

### `equals(`java.lang.Object` o)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

