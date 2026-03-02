# Class: `TreeRangeMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.TreeRangeMap`

**Implements:** [`com.google.common.collect.RangeMap<K,V>`](./RangeMap.md)

## Type Parameters

- `K` extends `java.lang.Comparable`
- `V` extends `java.lang.Object`

## Description

Like all RangeMap implementations, this supports neither null keys nor null values.

## Fields

### `entriesByLowerBound`

**Type:** `java.util.NavigableMap<com.google.common.collect.Cut<K>,com.google.common.collect.TreeRangeMap.RangeMapEntry<K,V>>`

### `EMPTY_SUB_RANGE_MAP`

**Type:** [`com.google.common.collect.RangeMap<java.lang.Comparable<?>,java.lang.Object>`](./RangeMap.md)

## Constructors

### `<init>()`

## Methods

### `create()`

**Returns:** [`com.google.common.collect.TreeRangeMap<K,V>`](./TreeRangeMap.md)

### `get(K key)`

**Parameters:**
- `key` (`K`)

**Returns:** `V`

### `getEntry(K key)`

**Parameters:**
- `key` (`K`)

**Returns:** `java.util.Map.Entry<com.google.common.collect.Range<K>,V>`

### `put(Range<K> range, V value)`

**Parameters:**
- `range` ([`com.google.common.collect.Range<K>`](./Range.md))
- `value` (`V`)

**Returns:** `void`

### `putCoalescing(Range<K> range, V value)`

**Parameters:**
- `range` ([`com.google.common.collect.Range<K>`](./Range.md))
- `value` (`V`)

**Returns:** `void`

### `coalescedRange(Range<K> range, V value)`

**Parameters:**
- `range` ([`com.google.common.collect.Range<K>`](./Range.md))
- `value` (`V`)

**Returns:** [`com.google.common.collect.Range<K>`](./Range.md)

### `coalesce(Range<K> range, V value, Map.Entry<Cut<K>,TreeRangeMap.RangeMapEntry<K,V>> entry)`

**Parameters:**
- `range` ([`com.google.common.collect.Range<K>`](./Range.md))
- `value` (`V`)
- `entry` (`java.util.Map.Entry<com.google.common.collect.Cut<K>,com.google.common.collect.TreeRangeMap.RangeMapEntry<K,V>>`)

**Returns:** [`com.google.common.collect.Range<K>`](./Range.md)

### `putAll(RangeMap<K,? extends V> rangeMap)`

**Parameters:**
- `rangeMap` ([`com.google.common.collect.RangeMap<K,? extends V>`](./RangeMap.md))

**Returns:** `void`

### `clear()`

**Returns:** `void`

### `span()`

**Returns:** [`com.google.common.collect.Range<K>`](./Range.md)

### `putRangeMapEntry(Cut<K> lowerBound, Cut<K> upperBound, V value)`

**Parameters:**
- `lowerBound` ([`com.google.common.collect.Cut<K>`](./Cut.md))
- `upperBound` ([`com.google.common.collect.Cut<K>`](./Cut.md))
- `value` (`V`)

**Returns:** `void`

### `remove(Range<K> rangeToRemove)`

**Parameters:**
- `rangeToRemove` ([`com.google.common.collect.Range<K>`](./Range.md))

**Returns:** `void`

### `split(Cut<K> cut)`

**Parameters:**
- `cut` ([`com.google.common.collect.Cut<K>`](./Cut.md))

**Returns:** `void`

### `merge(Range<K> range, V value, BiFunction<? super V,? super @Nullable V,? extends @Nullable V> remappingFunction)`

**Parameters:**
- `range` ([`com.google.common.collect.Range<K>`](./Range.md))
- `value` (`V`)
- `remappingFunction` (`java.util.function.BiFunction<? super V,? super @org.checkerframework.checker.nullness.qual.Nullable V,? extends @org.checkerframework.checker.nullness.qual.Nullable V>`)

**Returns:** `void`

### `asMapOfRanges()`

**Returns:** `java.util.Map<com.google.common.collect.Range<K>,V>`

### `asDescendingMapOfRanges()`

**Returns:** `java.util.Map<com.google.common.collect.Range<K>,V>`

### `subRangeMap(Range<K> subRange)`

**Parameters:**
- `subRange` ([`com.google.common.collect.Range<K>`](./Range.md))

**Returns:** [`com.google.common.collect.RangeMap<K,V>`](./RangeMap.md)

### `emptySubRangeMap()`

**Returns:** [`com.google.common.collect.RangeMap<K,V>`](./RangeMap.md)

### `equals(Object o)`

**Parameters:**
- `o` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

