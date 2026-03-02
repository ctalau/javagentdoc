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

### `<init>(ImmutableList<Range<K>> ranges, ImmutableList<V> values)`

**Parameters:**
- `ranges` ([`com.google.common.collect.ImmutableList<com.google.common.collect.Range<K>>`](./ImmutableList.md))
- `values` ([`com.google.common.collect.ImmutableList<V>`](./ImmutableList.md))

## Methods

### `toImmutableRangeMap(Function<? super T,Range<K>> keyFunction, Function<? super T,? extends V> valueFunction)`

As in Builder, overlapping ranges are not permitted.

**Parameters:**
- `keyFunction` (`java.util.function.Function<? super T,com.google.common.collect.Range<K>>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableRangeMap<K,V>>`

### `of()`

**Performance note:** the instance returned is a singleton.

**Returns:** [`com.google.common.collect.ImmutableRangeMap<K,V>`](./ImmutableRangeMap.md)

### `of(Range<K> range, V value)`

**Parameters:**
- `range` ([`com.google.common.collect.Range<K>`](./Range.md))
- `value` (`V`)

**Returns:** [`com.google.common.collect.ImmutableRangeMap<K,V>`](./ImmutableRangeMap.md)

### `copyOf(RangeMap<K,? extends V> rangeMap)`

**Parameters:**
- `rangeMap` ([`com.google.common.collect.RangeMap<K,? extends V>`](./RangeMap.md))

**Returns:** [`com.google.common.collect.ImmutableRangeMap<K,V>`](./ImmutableRangeMap.md)

### `builder()`

**Returns:** `com.google.common.collect.ImmutableRangeMap.Builder<K,V>`

### `get(K key)`

**Parameters:**
- `key` (`K`)

**Returns:** `V`

### `getEntry(K key)`

**Parameters:**
- `key` (`K`)

**Returns:** `java.util.Map.Entry<com.google.common.collect.Range<K>,V>`

### `span()`

**Returns:** [`com.google.common.collect.Range<K>`](./Range.md)

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

### `putAll(RangeMap<K,? extends V> rangeMap)`

**Parameters:**
- `rangeMap` ([`com.google.common.collect.RangeMap<K,? extends V>`](./RangeMap.md))

**Returns:** `void`

### `clear()`

**Returns:** `void`

### `remove(Range<K> range)`

**Parameters:**
- `range` ([`com.google.common.collect.Range<K>`](./Range.md))

**Returns:** `void`

### `merge(Range<K> range, V value, BiFunction<? super V,? super @Nullable V,? extends @Nullable V> remappingFunction)`

**Parameters:**
- `range` ([`com.google.common.collect.Range<K>`](./Range.md))
- `value` (`V`)
- `remappingFunction` (`java.util.function.BiFunction<? super V,? super @org.checkerframework.checker.nullness.qual.Nullable V,? extends @org.checkerframework.checker.nullness.qual.Nullable V>`)

**Returns:** `void`

### `asMapOfRanges()`

**Returns:** [`com.google.common.collect.ImmutableMap<com.google.common.collect.Range<K>,V>`](./ImmutableMap.md)

### `asDescendingMapOfRanges()`

**Returns:** [`com.google.common.collect.ImmutableMap<com.google.common.collect.Range<K>,V>`](./ImmutableMap.md)

### `subRangeMap(Range<K> range)`

**Parameters:**
- `range` ([`com.google.common.collect.Range<K>`](./Range.md))

**Returns:** [`com.google.common.collect.ImmutableRangeMap<K,V>`](./ImmutableRangeMap.md)

### `hashCode()`

**Returns:** `int`

### `equals(Object o)`

**Parameters:**
- `o` (`java.lang.Object`)

**Returns:** `boolean`

### `toString()`

**Returns:** `java.lang.String`

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject(ObjectInputStream stream)`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

**Returns:** `void`

