# Interface: `RangeMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.RangeMap`

## Type Parameters

- `K` extends `java.lang.Comparable`
- `V` extends `java.lang.Object`

## Description

Queries look up the value associated
 with the range (if any) that contains a specified key.

 
In contrast to RangeSet, no "coalescing" is done of connected ranges, even if they are mapped to the same value.

## Methods

### `get(K key)`

Specifically, if any range in this range map contains the specified key, the value
 associated with that range is returned.

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

Specifically, after a call to put(range, value), if range.contains(k), then get(k) will return
 value.

 
If range is empty, then this is a no-op.

**Parameters:**
- `range` ([`com.google.common.collect.Range<K>`](./Range.md))
- `value` (`V`)

**Returns:** `void`

### `putCoalescing(Range<K> range, V value)`

The behavior of get(k) after calling this method is identical to
 the behavior described in put(range, value), however the ranges
 returned from #asMapOfRanges will be different if there were existing entries which
 connect to the given range and value.

 
Even if the input range is empty, if it is connected on both sides by ranges mapped to the
 same value those two ranges will be coalesced.

 
**Note:** coalescing requires calling .equals() on any connected values, which
 may be expensive depending on the value type. Using this method on range maps with large values
 such as Collection types is discouraged.

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

If !range.contains(k), get(k) will return the same result
 before and after a call to remove(range). If range.contains(k), then after a
 call to remove(range), get(k) will return null.

**Parameters:**
- `range` ([`com.google.common.collect.Range<K>`](./Range.md))

**Returns:** `void`

### `merge(Range<K> range, V value, BiFunction<? super V,? super @Nullable V,? extends @Nullable V> remappingFunction)`

If any parts of the range are already present in this map, those parts are mapped to new
 values by applying the remapping function. The remapping function accepts the map's existing
 value for that part of the range and the given value. It returns the value to be associated
 with that part of the map, or it returns null to clear that part of the map.

 
Any parts of the range not already present in this map are mapped to the specified value,
 unless the value is null.

 
Any existing entry spanning either range boundary may be split at the boundary, even if the
 merge does not affect its value. For example, if rangeMap had one entry [1, 5]
 => 3 then rangeMap.merge(Range.closed(0,2), 3, Math::max) could yield a map with the
 entries [0, 1) => 3, [1, 2] => 3, (2, 5] => 3.

**Parameters:**
- `range` ([`com.google.common.collect.Range<K>`](./Range.md))
- `value` (`V`)
- `remappingFunction` (`java.util.function.BiFunction<? super V,? super @org.checkerframework.checker.nullness.qual.Nullable V,? extends @org.checkerframework.checker.nullness.qual.Nullable V>`)

**Returns:** `void`

### `asMapOfRanges()`

Modifications to
 this range map are guaranteed to read through to the returned Map.

 
The returned Map iterates over entries in ascending order of the bounds of the
 Range entries.

 
It is guaranteed that no empty ranges will be in the returned Map.

**Returns:** `java.util.Map<com.google.common.collect.Range<K>,V>`

### `asDescendingMapOfRanges()`

Modifications to
 this range map are guaranteed to read through to the returned Map.

 
The returned Map iterates over entries in descending order of the bounds of the
 Range entries.

 
It is guaranteed that no empty ranges will be in the returned Map.

**Returns:** `java.util.Map<com.google.common.collect.Range<K>,V>`

### `subRangeMap(Range<K> range)`

For example, if rangeMap had the entries [1, 5] => "foo", (6, 8) => "bar",
 (10, ∞) => "baz" then rangeMap.subRangeMap(Range.open(3, 12)) would return a range map
 with the entries (3, 5] => "foo", (6, 8) => "bar", (10, 12) => "baz".

 
The returned range map supports all optional operations that this range map supports, except
 for asMapOfRanges().iterator().remove().

 
The returned range map will throw an IllegalArgumentException on an attempt to
 insert a range not enclosed by range.

**Parameters:**
- `range` ([`com.google.common.collect.Range<K>`](./Range.md))

**Returns:** [`com.google.common.collect.RangeMap<K,V>`](./RangeMap.md)

### `equals(Object o)`

**Parameters:**
- `o` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

