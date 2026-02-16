# Interface: `RangeMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.RangeMap`

## Type Parameters

- `K` extends `java.lang.Comparable`
- `V` extends `java.lang.Object`

## Description

A mapping from disjoint nonempty ranges to non-null values. Queries look up the value associated
 with the range (if any) that contains a specified key.

 <p>In contrast to `RangeSet`, no "coalescing" is done of connected ranges, even if they are mapped to the same value.
**Author:** Louis Wasserman
**Since:** 14.0

## Methods

### `get(`K` key)`

**Returns:** `V`

Returns the value associated with the specified key, or `null` if there is no such value.

 <p>Specifically, if any range in this range map contains the specified key, the value
 associated with that range is returned.

### `getEntry(`K` key)`

**Returns:** `java.util.Map.Entry<com.google.common.collect.Range<K>,V>`

Returns the range containing this key and its associated value, if such a range is present in
 the range map, or `null` otherwise.

### `span()`

**Returns:** [`com.google.common.collect.Range<K>`](./Range.md)

Returns the minimal range enclosing the ranges in this
 `RangeMap`.
@throws NoSuchElementException if this range map is empty

### `put([`com.google.common.collect.Range<K>`](./Range.md) range, `V` value)`

**Returns:** `void`

Maps a range to a specified value (optional operation).

 <p>Specifically, after a call to `put(range, value)`, if `Range.contains(Comparable) range.contains(k)`, then `get(Comparable) get(k)` will return
 `value`.

 <p>If `range` is empty, then this is a no-op.

### `putCoalescing([`com.google.common.collect.Range<K>`](./Range.md) range, `V` value)`

**Returns:** `void`

Maps a range to a specified value, coalescing this range with any existing ranges with the same
 value that are connected to this range.

 <p>The behavior of `get(Comparable) get(k)` after calling this method is identical to
 the behavior described in `put(Range, Object) put(range, value)`, however the ranges
 returned from `asMapOfRanges` will be different if there were existing entries which
 connect to the given range and value.

 <p>Even if the input range is empty, if it is connected on both sides by ranges mapped to the
 same value those two ranges will be coalesced.

 <p><b>Note:</b> coalescing requires calling `.equals()` on any connected values, which
 may be expensive depending on the value type. Using this method on range maps with large values
 such as `Collection` types is discouraged.
**Since:** 22.0

### `putAll([`com.google.common.collect.RangeMap<K,? extends V>`](./RangeMap.md) rangeMap)`

**Returns:** `void`

Puts all the associations from `rangeMap` into this range map (optional operation).

### `clear()`

**Returns:** `void`

Removes all associations from this range map (optional operation).

### `remove([`com.google.common.collect.Range<K>`](./Range.md) range)`

**Returns:** `void`

Removes all associations from this range map in the specified range (optional operation).

 <p>If `!range.contains(k)`, `get(Comparable) get(k)` will return the same result
 before and after a call to `remove(range)`. If `range.contains(k)`, then after a
 call to `remove(range)`, `get(k)` will return `null`.

### `merge([`com.google.common.collect.Range<K>`](./Range.md) range, `V` value, `java.util.function.BiFunction<? super V,? super @org.checkerframework.checker.nullness.qual.Nullable V,? extends @org.checkerframework.checker.nullness.qual.Nullable V>` remappingFunction)`

**Returns:** `void`

Merges a value into a part of the map by applying a remapping function.

 <p>If any parts of the range are already present in this map, those parts are mapped to new
 values by applying the remapping function. The remapping function accepts the map's existing
 value for that part of the range and the given value. It returns the value to be associated
 with that part of the map, or it returns `null` to clear that part of the map.

 <p>Any parts of the range not already present in this map are mapped to the specified value,
 unless the value is `null`.

 <p>Any existing entry spanning either range boundary may be split at the boundary, even if the
 merge does not affect its value. For example, if `rangeMap` had one entry `[1, 5]
 => 3` then `rangeMap.merge(Range.closed(0,2), 3, Math::max)` could yield a map with the
 entries `[0, 1) => 3, [1, 2] => 3, (2, 5] => 3`.
**Since:** 28.1

### `asMapOfRanges()`

**Returns:** `java.util.Map<com.google.common.collect.Range<K>,V>`

Returns a view of this range map as an unmodifiable `Map<Range<K>, V>`. Modifications to
 this range map are guaranteed to read through to the returned `Map`.

 <p>The returned `Map` iterates over entries in ascending order of the bounds of the
 `Range` entries.

 <p>It is guaranteed that no empty ranges will be in the returned `Map`.

### `asDescendingMapOfRanges()`

**Returns:** `java.util.Map<com.google.common.collect.Range<K>,V>`

Returns a view of this range map as an unmodifiable `Map<Range<K>, V>`. Modifications to
 this range map are guaranteed to read through to the returned `Map`.

 <p>The returned `Map` iterates over entries in descending order of the bounds of the
 `Range` entries.

 <p>It is guaranteed that no empty ranges will be in the returned `Map`.
**Since:** 19.0

### `subRangeMap([`com.google.common.collect.Range<K>`](./Range.md) range)`

**Returns:** [`com.google.common.collect.RangeMap<K,V>`](./RangeMap.md)

Returns a view of the part of this range map that intersects with `range`.

 <p>For example, if `rangeMap` had the entries `[1, 5] => "foo", (6, 8) => "bar",
 (10, \u221e) => "baz"` then `rangeMap.subRangeMap(Range.open(3, 12))` would return a range map
 with the entries `(3, 5] => "foo", (6, 8) => "bar", (10, 12) => "baz"`.

 <p>The returned range map supports all optional operations that this range map supports, except
 for `asMapOfRanges().iterator().remove()`.

 <p>The returned range map will throw an `IllegalArgumentException` on an attempt to
 insert a range not enclosed by `range`.

### `equals(`java.lang.Object` o)`

**Returns:** `boolean`

Returns `true` if `obj` is another `RangeMap` that has an equivalent `asMapOfRanges()`.

### `hashCode()`

**Returns:** `int`

Returns `asMapOfRanges().hashCode()`.

### `toString()`

**Returns:** `java.lang.String`

Returns a readable string representation of this range map.

