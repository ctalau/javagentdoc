# Interface: `RangeMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.RangeMap`

## Type Parameters

- `K` extends `java.lang.Comparable`
- `V` extends `java.lang.Object`

## Description

A mapping from disjoint nonempty ranges to non-null values. Queries look up the value associated
 with the range (if any) that contains a specified key.

 <p>In contrast to {@link RangeSet}, no "coalescing" is done of {@linkplain Range#isConnected(Range) connected} ranges, even if they are mapped to the same value.
@author Louis Wasserman
@since 14.0

## Methods

### `get([`K`](K.md) key)`

**Returns:** [`V`](V.md)

Returns the value associated with the specified key, or {@code null} if there is no such value.

 <p>Specifically, if any range in this range map contains the specified key, the value
 associated with that range is returned.

### `getEntry([`K`](K.md) key)`

**Returns:** [`java.util.Map.Entry<com.google.common.collect.Range<K>,V>`](../../../../java/util/Map/Entry,V>.md)

Returns the range containing this key and its associated value, if such a range is present in
 the range map, or {@code null} otherwise.

### `span()`

**Returns:** [`com.google.common.collect.Range<K>`](./Range.md)

Returns the minimal range {@linkplain Range#encloses(Range) enclosing} the ranges in this
 {@code RangeMap}.
@throws NoSuchElementException if this range map is empty

### `put([`com.google.common.collect.Range<K>`](./Range.md) range, [`V`](V.md) value)`

**Returns:** `void`

Maps a range to a specified value (optional operation).

 <p>Specifically, after a call to {@code put(range, value)}, if {@link Range#contains(Comparable) range.contains(k)}, then {@link #get(Comparable) get(k)} will return
 {@code value}.

 <p>If {@code range} {@linkplain Range#isEmpty() is empty}, then this is a no-op.

### `putCoalescing([`com.google.common.collect.Range<K>`](./Range.md) range, [`V`](V.md) value)`

**Returns:** `void`

Maps a range to a specified value, coalescing this range with any existing ranges with the same
 value that are {@linkplain Range#isConnected connected} to this range.

 <p>The behavior of {@link #get(Comparable) get(k)} after calling this method is identical to
 the behavior described in {@link #put(Range, Object) put(range, value)}, however the ranges
 returned from {@link #asMapOfRanges} will be different if there were existing entries which
 connect to the given range and value.

 <p>Even if the input range is empty, if it is connected on both sides by ranges mapped to the
 same value those two ranges will be coalesced.

 <p><b>Note:</b> coalescing requires calling {@code .equals()} on any connected values, which
 may be expensive depending on the value type. Using this method on range maps with large values
 such as {@link Collection} types is discouraged.
@since 22.0

### `putAll([`com.google.common.collect.RangeMap<K,? extends V>`](./RangeMap.md) rangeMap)`

**Returns:** `void`

Puts all the associations from {@code rangeMap} into this range map (optional operation).

### `clear()`

**Returns:** `void`

Removes all associations from this range map (optional operation).

### `remove([`com.google.common.collect.Range<K>`](./Range.md) range)`

**Returns:** `void`

Removes all associations from this range map in the specified range (optional operation).

 <p>If {@code !range.contains(k)}, {@link #get(Comparable) get(k)} will return the same result
 before and after a call to {@code remove(range)}. If {@code range.contains(k)}, then after a
 call to {@code remove(range)}, {@code get(k)} will return {@code null}.

### `merge([`com.google.common.collect.Range<K>`](./Range.md) range, [`V`](V.md) value, [`java.util.function.BiFunction<? super V,? super @org.checkerframework.checker.nullness.qual.Nullable V,? extends @org.checkerframework.checker.nullness.qual.Nullable V>`](../../../../java/util/function/BiFunction.md) remappingFunction)`

**Returns:** `void`

Merges a value into a part of the map by applying a remapping function.

 <p>If any parts of the range are already present in this map, those parts are mapped to new
 values by applying the remapping function. The remapping function accepts the map's existing
 value for that part of the range and the given value. It returns the value to be associated
 with that part of the map, or it returns {@code null} to clear that part of the map.

 <p>Any parts of the range not already present in this map are mapped to the specified value,
 unless the value is {@code null}.

 <p>Any existing entry spanning either range boundary may be split at the boundary, even if the
 merge does not affect its value. For example, if {@code rangeMap} had one entry {@code [1, 5]
 => 3} then {@code rangeMap.merge(Range.closed(0,2), 3, Math::max)} could yield a map with the
 entries {@code [0, 1) => 3, [1, 2] => 3, (2, 5] => 3}.
@since 28.1

### `asMapOfRanges()`

**Returns:** [`java.util.Map<com.google.common.collect.Range<K>,V>`](../../../../java/util/Map,V>.md)

Returns a view of this range map as an unmodifiable {@code Map<Range<K>, V>}. Modifications to
 this range map are guaranteed to read through to the returned {@code Map}.

 <p>The returned {@code Map} iterates over entries in ascending order of the bounds of the
 {@code Range} entries.

 <p>It is guaranteed that no empty ranges will be in the returned {@code Map}.

### `asDescendingMapOfRanges()`

**Returns:** [`java.util.Map<com.google.common.collect.Range<K>,V>`](../../../../java/util/Map,V>.md)

Returns a view of this range map as an unmodifiable {@code Map<Range<K>, V>}. Modifications to
 this range map are guaranteed to read through to the returned {@code Map}.

 <p>The returned {@code Map} iterates over entries in descending order of the bounds of the
 {@code Range} entries.

 <p>It is guaranteed that no empty ranges will be in the returned {@code Map}.
@since 19.0

### `subRangeMap([`com.google.common.collect.Range<K>`](./Range.md) range)`

**Returns:** [`com.google.common.collect.RangeMap<K,V>`](./RangeMap.md)

Returns a view of the part of this range map that intersects with {@code range}.

 <p>For example, if {@code rangeMap} had the entries {@code [1, 5] => "foo", (6, 8) => "bar",
 (10, \u221e) => "baz"} then {@code rangeMap.subRangeMap(Range.open(3, 12))} would return a range map
 with the entries {@code (3, 5] => "foo", (6, 8) => "bar", (10, 12) => "baz"}.

 <p>The returned range map supports all optional operations that this range map supports, except
 for {@code asMapOfRanges().iterator().remove()}.

 <p>The returned range map will throw an {@link IllegalArgumentException} on an attempt to
 insert a range not {@linkplain Range#encloses(Range) enclosed} by {@code range}.

### `equals(`java.lang.Object` o)`

**Returns:** `boolean`

Returns {@code true} if {@code obj} is another {@code RangeMap} that has an equivalent {@link #asMapOfRanges()}.

### `hashCode()`

**Returns:** `int`

Returns {@code asMapOfRanges().hashCode()}.

### `toString()`

**Returns:** `java.lang.String`

Returns a readable string representation of this range map.

