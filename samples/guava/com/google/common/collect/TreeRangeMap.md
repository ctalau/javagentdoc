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

**Returns:** `V`

**Parameters:**
- `key` (`K`)

### `getEntry(K key)`

**Returns:** `java.util.Map.Entry<com.google.common.collect.Range<K>,V>`

**Parameters:**
- `key` (`K`)

### `put(com.google.common.collect.Range<K> range, V value)`

**Returns:** `void`

**Parameters:**
- `range` ([`com.google.common.collect.Range<K>`](./Range.md))
- `value` (`V`)

### `putCoalescing(com.google.common.collect.Range<K> range, V value)`

**Returns:** `void`

**Parameters:**
- `range` ([`com.google.common.collect.Range<K>`](./Range.md))
- `value` (`V`)

### `coalescedRange(com.google.common.collect.Range<K> range, V value)`

**Returns:** [`com.google.common.collect.Range<K>`](./Range.md)

**Parameters:**
- `range` ([`com.google.common.collect.Range<K>`](./Range.md))
- `value` (`V`)

### `coalesce(com.google.common.collect.Range<K> range, V value, java.util.Map.Entry<com.google.common.collect.Cut<K>,com.google.common.collect.TreeRangeMap.RangeMapEntry<K,V>> entry)`

**Returns:** [`com.google.common.collect.Range<K>`](./Range.md)

**Parameters:**
- `range` ([`com.google.common.collect.Range<K>`](./Range.md))
- `value` (`V`)
- `entry` (`java.util.Map.Entry<com.google.common.collect.Cut<K>,com.google.common.collect.TreeRangeMap.RangeMapEntry<K,V>>`)

### `putAll(com.google.common.collect.RangeMap<K,? extends V> rangeMap)`

**Returns:** `void`

**Parameters:**
- `rangeMap` ([`com.google.common.collect.RangeMap<K,? extends V>`](./RangeMap.md))

### `clear()`

**Returns:** `void`

### `span()`

**Returns:** [`com.google.common.collect.Range<K>`](./Range.md)

### `putRangeMapEntry(com.google.common.collect.Cut<K> lowerBound, com.google.common.collect.Cut<K> upperBound, V value)`

**Returns:** `void`

**Parameters:**
- `lowerBound` ([`com.google.common.collect.Cut<K>`](./Cut.md))
- `upperBound` ([`com.google.common.collect.Cut<K>`](./Cut.md))
- `value` (`V`)

### `remove(com.google.common.collect.Range<K> rangeToRemove)`

**Returns:** `void`

**Parameters:**
- `rangeToRemove` ([`com.google.common.collect.Range<K>`](./Range.md))

### `split(com.google.common.collect.Cut<K> cut)`

**Returns:** `void`

**Parameters:**
- `cut` ([`com.google.common.collect.Cut<K>`](./Cut.md))

### `merge(com.google.common.collect.Range<K> range, V value, java.util.function.BiFunction<? super V,? super @org.checkerframework.checker.nullness.qual.Nullable V,? extends @org.checkerframework.checker.nullness.qual.Nullable V> remappingFunction)`

**Returns:** `void`

**Parameters:**
- `range` ([`com.google.common.collect.Range<K>`](./Range.md))
- `value` (`V`)
- `remappingFunction` (`java.util.function.BiFunction<? super V,? super @org.checkerframework.checker.nullness.qual.Nullable V,? extends @org.checkerframework.checker.nullness.qual.Nullable V>`)

### `asMapOfRanges()`

**Returns:** `java.util.Map<com.google.common.collect.Range<K>,V>`

### `asDescendingMapOfRanges()`

**Returns:** `java.util.Map<com.google.common.collect.Range<K>,V>`

### `subRangeMap(com.google.common.collect.Range<K> subRange)`

**Returns:** [`com.google.common.collect.RangeMap<K,V>`](./RangeMap.md)

**Parameters:**
- `subRange` ([`com.google.common.collect.Range<K>`](./Range.md))

### `emptySubRangeMap()`

**Returns:** [`com.google.common.collect.RangeMap<K,V>`](./RangeMap.md)

### `equals(java.lang.Object o)`

**Returns:** `boolean`

**Parameters:**
- `o` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

