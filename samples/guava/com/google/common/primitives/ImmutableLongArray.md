# Class: `ImmutableLongArray`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.ImmutableLongArray`

**Implements:** [`java.io.Serializable`](../../../../java/io/Serializable.md)

## Description

An immutable array of {@code long} values, with an API resembling {@link List}.

 <p>Advantages compared to {@code long[]}:

 <ul>
   <li>All the many well-known advantages of immutability (read <i>Effective Java</i>, third
       edition, Item 17).
   <li>Has the value-based (not identity-based) {@link #equals}, {@link #hashCode}, and {@link #toString} behavior you expect.
   <li>Offers useful operations beyond just {@code get} and {@code length}, so you don't have to
       hunt through classes like {@link Arrays} and {@link Longs} for them.
   <li>Supports a copy-free {@link #subArray} view, so methods that accept this type don't need to
       add overloads that accept start and end indexes.
   <li>Can be streamed without "breaking the chain": {@code foo.getBarLongs().stream()...}.
   <li>Access to all collection-based utilities via {@link #asList} (though at the cost of
       allocating garbage).
 </ul>

 <p>Disadvantages compared to {@code long[]}:

 <ul>
   <li>Memory footprint has a fixed overhead (about 24 bytes per instance).
   <li><i>Some</i> construction use cases force the data to be copied (though several construction
       APIs are offered that don't).
   <li>Can't be passed directly to methods that expect {@code long[]} (though the most common
       utilities do have replacements here).
   <li>Dependency on {@code com.google.common} / Guava.
 </ul>

 <p>Advantages compared to {@link com.google.common.collect.ImmutableList ImmutableList}{@code
 <Long>}:

 <ul>
   <li>Improved memory compactness and locality.
   <li>Can be queried without allocating garbage.
   <li>Access to {@code LongStream} features (like {@link LongStream#sum}) using {@code stream()}
       instead of the awkward {@code stream().mapToLong(v -> v)}.
 </ul>

 <p>Disadvantages compared to {@code ImmutableList<Long>}:

 <ul>
   <li>Can't be passed directly to methods that expect {@code Iterable}, {@code Collection}, or
       {@code List} (though the most common utilities do have replacements here, and there is a
       lazy {@link #asList} view).
 </ul>
@since 22.0

## Fields

### `EMPTY`

**Type:** [`com.google.common.primitives.ImmutableLongArray`](./ImmutableLongArray.md)

### `array`

**Type:** `long[]`

### `start`

**Type:** `int`

### `end`

**Type:** `int`

## Constructors

### `<init>(`long[]` array)`

### `<init>(`long[]` array, `int` start, `int` end)`

## Methods

### `of()`

**Returns:** [`com.google.common.primitives.ImmutableLongArray`](./ImmutableLongArray.md)

Returns the empty array.

### `of(`long` e0)`

**Returns:** [`com.google.common.primitives.ImmutableLongArray`](./ImmutableLongArray.md)

Returns an immutable array containing a single value.

### `of(`long` e0, `long` e1)`

**Returns:** [`com.google.common.primitives.ImmutableLongArray`](./ImmutableLongArray.md)

Returns an immutable array containing the given values, in order.

### `of(`long` e0, `long` e1, `long` e2)`

**Returns:** [`com.google.common.primitives.ImmutableLongArray`](./ImmutableLongArray.md)

Returns an immutable array containing the given values, in order.

### `of(`long` e0, `long` e1, `long` e2, `long` e3)`

**Returns:** [`com.google.common.primitives.ImmutableLongArray`](./ImmutableLongArray.md)

Returns an immutable array containing the given values, in order.

### `of(`long` e0, `long` e1, `long` e2, `long` e3, `long` e4)`

**Returns:** [`com.google.common.primitives.ImmutableLongArray`](./ImmutableLongArray.md)

Returns an immutable array containing the given values, in order.

### `of(`long` e0, `long` e1, `long` e2, `long` e3, `long` e4, `long` e5)`

**Returns:** [`com.google.common.primitives.ImmutableLongArray`](./ImmutableLongArray.md)

Returns an immutable array containing the given values, in order.

### `of(`long` first, `long[]` rest)`

**Returns:** [`com.google.common.primitives.ImmutableLongArray`](./ImmutableLongArray.md)

Returns an immutable array containing the given values, in order.

 <p>The array {@code rest} must not be longer than {@code Integer.MAX_VALUE - 1}.

### `copyOf(`long[]` values)`

**Returns:** [`com.google.common.primitives.ImmutableLongArray`](./ImmutableLongArray.md)

Returns an immutable array containing the given values, in order.

### `copyOf([`java.util.Collection<java.lang.Long>`](../../../../java/util/Collection.md) values)`

**Returns:** [`com.google.common.primitives.ImmutableLongArray`](./ImmutableLongArray.md)

Returns an immutable array containing the given values, in order.

### `copyOf(`java.lang.Iterable<java.lang.Long>` values)`

**Returns:** [`com.google.common.primitives.ImmutableLongArray`](./ImmutableLongArray.md)

Returns an immutable array containing the given values, in order.

 <p><b>Performance note:</b> this method delegates to {@link #copyOf(Collection)} if {@code
 values} is a {@link Collection}. Otherwise it creates a {@link #builder} and uses {@link Builder#addAll(Iterable)}, with all the performance implications associated with that.

### `copyOf([`java.util.stream.LongStream`](../../../../java/util/stream/LongStream.md) stream)`

**Returns:** [`com.google.common.primitives.ImmutableLongArray`](./ImmutableLongArray.md)

Returns an immutable array containing all the values from {@code stream}, in order.

### `builder(`int` initialCapacity)`

**Returns:** [`com.google.common.primitives.ImmutableLongArray.Builder`](ImmutableLongArray/Builder.md)

Returns a new, empty builder for {@link ImmutableLongArray} instances, sized to hold up to
 {@code initialCapacity} values without resizing. The returned builder is not thread-safe.

 <p><b>Performance note:</b> When feasible, {@code initialCapacity} should be the exact number
 of values that will be added, if that knowledge is readily available. It is better to guess a
 value slightly too high than slightly too low. If the value is not exact, the {@link ImmutableLongArray} that is built will very likely occupy more memory than strictly necessary;
 to trim memory usage, build using {@code builder.build().trimmed()}.

### `builder()`

**Returns:** [`com.google.common.primitives.ImmutableLongArray.Builder`](ImmutableLongArray/Builder.md)

Returns a new, empty builder for {@link ImmutableLongArray} instances, with a default initial
 capacity. The returned builder is not thread-safe.

 <p><b>Performance note:</b> The {@link ImmutableLongArray} that is built will very likely
 occupy more memory than necessary; to trim memory usage, build using {@code
 builder.build().trimmed()}.

### `length()`

**Returns:** `int`

Returns the number of values in this array.

### `isEmpty()`

**Returns:** `boolean`

Returns {@code true} if there are no values in this array ({@link #length} is zero).

### `get(`int` index)`

**Returns:** `long`

Returns the {@code long} value present at the given index.
@throws IndexOutOfBoundsException if {@code index} is negative, or greater than or equal to
     {@link #length}

### `indexOf(`long` target)`

**Returns:** `int`

Returns the smallest index for which {@link #get} returns {@code target}, or {@code -1} if no
 such index exists. Equivalent to {@code asList().indexOf(target)}.

### `lastIndexOf(`long` target)`

**Returns:** `int`

Returns the largest index for which {@link #get} returns {@code target}, or {@code -1} if no
 such index exists. Equivalent to {@code asList().lastIndexOf(target)}.

### `contains(`long` target)`

**Returns:** `boolean`

Returns {@code true} if {@code target} is present at any index in this array. Equivalent to
 {@code asList().contains(target)}.

### `forEach([`java.util.function.LongConsumer`](../../../../java/util/function/LongConsumer.md) consumer)`

**Returns:** `void`

Invokes {@code consumer} for each value contained in this array, in order.

### `stream()`

**Returns:** [`java.util.stream.LongStream`](../../../../java/util/stream/LongStream.md)

Returns a stream over the values in this array, in order.

### `toArray()`

**Returns:** `long[]`

Returns a new, mutable copy of this array's values, as a primitive {@code long[]}.

### `subArray(`int` startIndex, `int` endIndex)`

**Returns:** [`com.google.common.primitives.ImmutableLongArray`](./ImmutableLongArray.md)

Returns a new immutable array containing the values in the specified range.

 <p><b>Performance note:</b> The returned array has the same full memory footprint as this one
 does (no actual copying is performed). To reduce memory usage, use {@code subArray(start,
 end).trimmed()}.

### `spliterator()`

**Returns:** [`java.util.Spliterator.OfLong`](../../../../java/util/Spliterator/OfLong.md)

### `asList()`

**Returns:** [`java.util.List<java.lang.Long>`](../../../../java/util/List.md)

Returns an immutable <i>view</i> of this array's values as a {@code List}; note that {@code
 long} values are boxed into {@link Long} instances on demand, which can be very expensive. The
 returned list should be used once and discarded. For any usages beyond that, pass the returned
 list to {@link com.google.common.collect.ImmutableList#copyOf(Collection) ImmutableList.copyOf}
 and use that list instead.

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

Returns {@code true} if {@code object} is an {@code ImmutableLongArray} containing the same
 values as this one, in the same order.

### `hashCode()`

**Returns:** `int`

Returns an unspecified hash code for the contents of this immutable array.

### `toString()`

**Returns:** `java.lang.String`

Returns a string representation of this array in the same form as {@link Arrays#toString(long[])}, for example {@code "[1, 2, 3]"}.

### `trimmed()`

**Returns:** [`com.google.common.primitives.ImmutableLongArray`](./ImmutableLongArray.md)

Returns an immutable array containing the same values as {@code this} array. This is logically
 a no-op, and in some circumstances {@code this} itself is returned. However, if this instance
 is a {@link #subArray} view of a larger array, this method will copy only the appropriate range
 of values, resulting in an equivalent array with a smaller memory footprint.

### `isPartialView()`

**Returns:** `boolean`

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readResolve()`

**Returns:** `java.lang.Object`

