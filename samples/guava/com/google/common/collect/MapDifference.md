# Interface: `MapDifference`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.MapDifference`

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

An object representing the differences between two maps.
@author Kevin Bourrillion
@since 2.0

## Methods

### `areEqual()`

**Returns:** `boolean`

Returns {@code true} if there are no differences between the two maps; that is, if the maps are
 equal.

### `entriesOnlyOnLeft()`

**Returns:** [`java.util.Map<K,V>`](../../../../java/util/Map.md)

Returns an unmodifiable map containing the entries from the left map whose keys are not present
 in the right map.

### `entriesOnlyOnRight()`

**Returns:** [`java.util.Map<K,V>`](../../../../java/util/Map.md)

Returns an unmodifiable map containing the entries from the right map whose keys are not
 present in the left map.

### `entriesInCommon()`

**Returns:** [`java.util.Map<K,V>`](../../../../java/util/Map.md)

Returns an unmodifiable map containing the entries that appear in both maps; that is, the
 intersection of the two maps.

### `entriesDiffering()`

**Returns:** [`java.util.Map<K,com.google.common.collect.MapDifference.ValueDifference<V>>`](../../../../java/util/Map>.md)

Returns an unmodifiable map describing keys that appear in both maps, but with different
 values.

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

Compares the specified object with this instance for equality. Returns {@code true} if the
 given object is also a {@code MapDifference} and the values returned by the {@link #entriesOnlyOnLeft()}, {@link #entriesOnlyOnRight()}, {@link #entriesInCommon()} and {@link #entriesDiffering()} of the two instances are equal.

### `hashCode()`

**Returns:** `int`

Returns the hash code for this instance. This is defined as the hash code of

 <pre>{@code
 Arrays.asList(entriesOnlyOnLeft(), entriesOnlyOnRight(),
     entriesInCommon(), entriesDiffering())
 }</pre>

