# Class: `ImmutableRangeMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableRangeMap`

**Implements:** [`com.google.common.collect.RangeMap<K,V>`](./RangeMap.md), `java.io.Serializable`

## Type Parameters

- `K` extends `java.lang.Comparable<?>`
- `V` extends `java.lang.Object`

## Description

A `RangeMap` whose contents will never change, with many other important properties
 detailed at `ImmutableCollection`.
**Author:** Louis Wasserman
**Since:** 14.0

## Fields

### `EMPTY`

**Type:** [`com.google.common.collect.ImmutableRangeMap<java.lang.Comparable<?>,java.lang.Object>`](ImmutableRangeMap,java/lang/Object>.md)

### `ranges`

**Type:** [`com.google.common.collect.ImmutableList<com.google.common.collect.Range<K>>`](./ImmutableList>.md)

### `values`

**Type:** [`com.google.common.collect.ImmutableList<V>`](./ImmutableList.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>([`com.google.common.collect.ImmutableList<com.google.common.collect.Range<K>>`](./ImmutableList>.md) ranges, [`com.google.common.collect.ImmutableList<V>`](./ImmutableList.md) values)`

## Methods

### `toImmutableRangeMap(`java.util.function.Function<? super T,com.google.common.collect.Range<K>>` keyFunction, `java.util.function.Function<? super T,? extends V>` valueFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableRangeMap<K,V>>`

Returns a `Collector` that accumulates the input elements into a new `ImmutableRangeMap`. As in `Builder`, overlapping ranges are not permitted.
**Since:** 23.1

### `of()`

**Returns:** [`com.google.common.collect.ImmutableRangeMap<K,V>`](./ImmutableRangeMap.md)

Returns an empty immutable range map.

 <p><b>Performance note:</b> the instance returned is a singleton.

### `of([`com.google.common.collect.Range<K>`](./Range.md) range, `V` value)`

**Returns:** [`com.google.common.collect.ImmutableRangeMap<K,V>`](./ImmutableRangeMap.md)

Returns an immutable range map mapping a single range to a single value.

### `copyOf([`com.google.common.collect.RangeMap<K,? extends V>`](./RangeMap.md) rangeMap)`

**Returns:** [`com.google.common.collect.ImmutableRangeMap<K,V>`](./ImmutableRangeMap.md)

### `builder()`

**Returns:** [`com.google.common.collect.ImmutableRangeMap.Builder<K,V>`](ImmutableRangeMap/Builder.md)

Returns a new builder for an immutable range map.

### `get(`K` key)`

**Returns:** `V`

### `getEntry(`K` key)`

**Returns:** `java.util.Map.Entry<com.google.common.collect.Range<K>,V>`

### `span()`

**Returns:** [`com.google.common.collect.Range<K>`](./Range.md)

### `put([`com.google.common.collect.Range<K>`](./Range.md) range, `V` value)`

**Returns:** `void`

Guaranteed to throw an exception and leave the `RangeMap` unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `putCoalescing([`com.google.common.collect.Range<K>`](./Range.md) range, `V` value)`

**Returns:** `void`

Guaranteed to throw an exception and leave the `RangeMap` unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `putAll([`com.google.common.collect.RangeMap<K,? extends V>`](./RangeMap.md) rangeMap)`

**Returns:** `void`

Guaranteed to throw an exception and leave the `RangeMap` unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `clear()`

**Returns:** `void`

Guaranteed to throw an exception and leave the `RangeMap` unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `remove([`com.google.common.collect.Range<K>`](./Range.md) range)`

**Returns:** `void`

Guaranteed to throw an exception and leave the `RangeMap` unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `merge([`com.google.common.collect.Range<K>`](./Range.md) range, `V` value, `java.util.function.BiFunction<? super V,? super @org.checkerframework.checker.nullness.qual.Nullable V,? extends @org.checkerframework.checker.nullness.qual.Nullable V>` remappingFunction)`

**Returns:** `void`

Guaranteed to throw an exception and leave the `RangeMap` unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `asMapOfRanges()`

**Returns:** [`com.google.common.collect.ImmutableMap<com.google.common.collect.Range<K>,V>`](./ImmutableMap,V>.md)

### `asDescendingMapOfRanges()`

**Returns:** [`com.google.common.collect.ImmutableMap<com.google.common.collect.Range<K>,V>`](./ImmutableMap,V>.md)

### `subRangeMap([`com.google.common.collect.Range<K>`](./Range.md) range)`

**Returns:** [`com.google.common.collect.ImmutableRangeMap<K,V>`](./ImmutableRangeMap.md)

### `hashCode()`

**Returns:** `int`

### `equals(`java.lang.Object` o)`

**Returns:** `boolean`

### `toString()`

**Returns:** `java.lang.String`

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject(`java.io.ObjectInputStream` stream)`

**Returns:** `void`

