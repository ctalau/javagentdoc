# Class: `ImmutableRangeMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableRangeMap`

**Implements:** [`com.google.common.collect.RangeMap<K,V>`](./RangeMap.md), `java.io.Serializable`

## Type Parameters

- `K` extends `java.lang.Comparable<?>`
- `V` extends `java.lang.Object`

## Description

## Fields

### `EMPTY`

**Type:** [`com.google.common.collect.ImmutableRangeMap<java.lang.Comparable<?>,java.lang.Object>`](./ImmutableRangeMap.md)

### `ranges`

**Type:** [`com.google.common.collect.ImmutableList<com.google.common.collect.Range<K>>`](./ImmutableList.md)

### `values`

**Type:** [`com.google.common.collect.ImmutableList<V>`](./ImmutableList.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(com.google.common.collect.ImmutableList<com.google.common.collect.Range<K>> ranges, com.google.common.collect.ImmutableList<V> values)`

**Parameters:**
- `ranges` ([`com.google.common.collect.ImmutableList<com.google.common.collect.Range<K>>`](./ImmutableList.md))
- `values` ([`com.google.common.collect.ImmutableList<V>`](./ImmutableList.md))

## Methods

### `toImmutableRangeMap(java.util.function.Function<? super T,com.google.common.collect.Range<K>> keyFunction, java.util.function.Function<? super T,? extends V> valueFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableRangeMap<K,V>>`

As in Builder, overlapping ranges are not permitted.

**Parameters:**
- `keyFunction` (`java.util.function.Function<? super T,com.google.common.collect.Range<K>>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)

### `of()`

**Returns:** [`com.google.common.collect.ImmutableRangeMap<K,V>`](./ImmutableRangeMap.md)

**Performance note:** the instance returned is a singleton.

### `of(com.google.common.collect.Range<K> range, V value)`

**Returns:** [`com.google.common.collect.ImmutableRangeMap<K,V>`](./ImmutableRangeMap.md)

**Parameters:**
- `range` ([`com.google.common.collect.Range<K>`](./Range.md))
- `value` (`V`)

### `copyOf(com.google.common.collect.RangeMap<K,? extends V> rangeMap)`

**Returns:** [`com.google.common.collect.ImmutableRangeMap<K,V>`](./ImmutableRangeMap.md)

**Parameters:**
- `rangeMap` ([`com.google.common.collect.RangeMap<K,? extends V>`](./RangeMap.md))

### `builder()`

**Returns:** `com.google.common.collect.ImmutableRangeMap.Builder<K,V>`

### `get(K key)`

**Returns:** `V`

**Parameters:**
- `key` (`K`)

### `getEntry(K key)`

**Returns:** `java.util.Map.Entry<com.google.common.collect.Range<K>,V>`

**Parameters:**
- `key` (`K`)

### `span()`

**Returns:** [`com.google.common.collect.Range<K>`](./Range.md)

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

### `putAll(com.google.common.collect.RangeMap<K,? extends V> rangeMap)`

**Returns:** `void`

**Parameters:**
- `rangeMap` ([`com.google.common.collect.RangeMap<K,? extends V>`](./RangeMap.md))

### `clear()`

**Returns:** `void`

### `remove(com.google.common.collect.Range<K> range)`

**Returns:** `void`

**Parameters:**
- `range` ([`com.google.common.collect.Range<K>`](./Range.md))

### `merge(com.google.common.collect.Range<K> range, V value, java.util.function.BiFunction<? super V,? super @org.checkerframework.checker.nullness.qual.Nullable V,? extends @org.checkerframework.checker.nullness.qual.Nullable V> remappingFunction)`

**Returns:** `void`

**Parameters:**
- `range` ([`com.google.common.collect.Range<K>`](./Range.md))
- `value` (`V`)
- `remappingFunction` (`java.util.function.BiFunction<? super V,? super @org.checkerframework.checker.nullness.qual.Nullable V,? extends @org.checkerframework.checker.nullness.qual.Nullable V>`)

### `asMapOfRanges()`

**Returns:** [`com.google.common.collect.ImmutableMap<com.google.common.collect.Range<K>,V>`](./ImmutableMap.md)

### `asDescendingMapOfRanges()`

**Returns:** [`com.google.common.collect.ImmutableMap<com.google.common.collect.Range<K>,V>`](./ImmutableMap.md)

### `subRangeMap(com.google.common.collect.Range<K> range)`

**Returns:** [`com.google.common.collect.ImmutableRangeMap<K,V>`](./ImmutableRangeMap.md)

**Parameters:**
- `range` ([`com.google.common.collect.Range<K>`](./Range.md))

### `hashCode()`

**Returns:** `int`

### `equals(java.lang.Object o)`

**Returns:** `boolean`

**Parameters:**
- `o` (`java.lang.Object`)

### `toString()`

**Returns:** `java.lang.String`

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject(java.io.ObjectInputStream stream)`

**Returns:** `void`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

