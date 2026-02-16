# Class: `ImmutableIntArray`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.ImmutableIntArray`

**Implements:** `java.io.Serializable`

## Description

An immutable array of `int` values, with an API resembling `List`.

 <p>Advantages compared to `int[]`:

 <ul>
   <li>All the many well-known advantages of immutability (read <i>Effective Java</i>, third
       edition, Item 17).
   <li>Has the value-based (not identity-based) `equals`, `hashCode`, and `toString` behavior you expect.
   <li>Offers useful operations beyond just `get` and `length`, so you don't have to
       hunt through classes like `Arrays` and `Ints` for them.
   <li>Supports a copy-free `subArray` view, so methods that accept this type don't need to
       add overloads that accept start and end indexes.
   <li>Can be streamed without "breaking the chain": `foo.getBarInts().stream()...`.
   <li>Access to all collection-based utilities via `asList` (though at the cost of
       allocating garbage).
 </ul>

 <p>Disadvantages compared to `int[]`:

 <ul>
   <li>Memory footprint has a fixed overhead (about 24 bytes per instance).
   <li><i>Some</i> construction use cases force the data to be copied (though several construction
       APIs are offered that don't).
   <li>Can't be passed directly to methods that expect `int[]` (though the most common
       utilities do have replacements here).
   <li>Dependency on `com.google.common` / Guava.
 </ul>

 <p>Advantages compared to `com.google.common.collect.ImmutableList``<Integer>`:

 <ul>
   <li>Improved memory compactness and locality.
   <li>Can be queried without allocating garbage.
   <li>Access to `IntStream` features (like `IntStream.sum`) using `stream()`
       instead of the awkward `stream().mapToInt(v -> v)`.
 </ul>

 <p>Disadvantages compared to `ImmutableList<Integer>`:

 <ul>
   <li>Can't be passed directly to methods that expect `Iterable`, `Collection`, or
       `List` (though the most common utilities do have replacements here, and there is a
       lazy `asList` view).
 </ul>
**Since:** 22.0

## Fields

### `EMPTY`

**Type:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

### `array`

**Type:** `int[]`

### `start`

**Type:** `int`

### `end`

**Type:** `int`

## Constructors

### `<init>(`int[]` array)`

### `<init>(`int[]` array, `int` start, `int` end)`

## Methods

### `of()`

**Returns:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

Returns the empty array.

### `of(`int` e0)`

**Returns:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

Returns an immutable array containing a single value.

### `of(`int` e0, `int` e1)`

**Returns:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

Returns an immutable array containing the given values, in order.

### `of(`int` e0, `int` e1, `int` e2)`

**Returns:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

Returns an immutable array containing the given values, in order.

### `of(`int` e0, `int` e1, `int` e2, `int` e3)`

**Returns:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

Returns an immutable array containing the given values, in order.

### `of(`int` e0, `int` e1, `int` e2, `int` e3, `int` e4)`

**Returns:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

Returns an immutable array containing the given values, in order.

### `of(`int` e0, `int` e1, `int` e2, `int` e3, `int` e4, `int` e5)`

**Returns:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

Returns an immutable array containing the given values, in order.

### `of(`int` first, `int[]` rest)`

**Returns:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

Returns an immutable array containing the given values, in order.

 <p>The array `rest` must not be longer than `Integer.MAX_VALUE - 1`.

### `copyOf(`int[]` values)`

**Returns:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

Returns an immutable array containing the given values, in order.

### `copyOf(`java.util.Collection<java.lang.Integer>` values)`

**Returns:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

Returns an immutable array containing the given values, in order.

### `copyOf(`java.lang.Iterable<java.lang.Integer>` values)`

**Returns:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

Returns an immutable array containing the given values, in order.

 <p><b>Performance note:</b> this method delegates to `copyOf(Collection)` if `values` is a `Collection`. Otherwise it creates a `builder` and uses `Builder.addAll(Iterable)`, with all the performance implications associated with that.

### `copyOf(`java.util.stream.IntStream` stream)`

**Returns:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

Returns an immutable array containing all the values from `stream`, in order.

### `builder(`int` initialCapacity)`

**Returns:** [`com.google.common.primitives.ImmutableIntArray.Builder`](ImmutableIntArray/Builder.md)

Returns a new, empty builder for `ImmutableIntArray` instances, sized to hold up to
 `initialCapacity` values without resizing. The returned builder is not thread-safe.

 <p><b>Performance note:</b> When feasible, `initialCapacity` should be the exact number
 of values that will be added, if that knowledge is readily available. It is better to guess a
 value slightly too high than slightly too low. If the value is not exact, the `ImmutableIntArray` that is built will very likely occupy more memory than strictly necessary;
 to trim memory usage, build using `builder.build().trimmed()`.

### `builder()`

**Returns:** [`com.google.common.primitives.ImmutableIntArray.Builder`](ImmutableIntArray/Builder.md)

Returns a new, empty builder for `ImmutableIntArray` instances, with a default initial
 capacity. The returned builder is not thread-safe.

 <p><b>Performance note:</b> The `ImmutableIntArray` that is built will very likely occupy
 more memory than necessary; to trim memory usage, build using `builder.build().trimmed()`.

### `length()`

**Returns:** `int`

Returns the number of values in this array.

### `isEmpty()`

**Returns:** `boolean`

Returns `true` if there are no values in this array (`length` is zero).

### `get(`int` index)`

**Returns:** `int`

Returns the `int` value present at the given index.
@throws IndexOutOfBoundsException if `index` is negative, or greater than or equal to
     `length`

### `indexOf(`int` target)`

**Returns:** `int`

Returns the smallest index for which `get` returns `target`, or `-1` if no
 such index exists. Equivalent to `asList().indexOf(target)`.

### `lastIndexOf(`int` target)`

**Returns:** `int`

Returns the largest index for which `get` returns `target`, or `-1` if no
 such index exists. Equivalent to `asList().lastIndexOf(target)`.

### `contains(`int` target)`

**Returns:** `boolean`

Returns `true` if `target` is present at any index in this array. Equivalent to
 `asList().contains(target)`.

### `forEach(`java.util.function.IntConsumer` consumer)`

**Returns:** `void`

Invokes `consumer` for each value contained in this array, in order.

### `stream()`

**Returns:** `java.util.stream.IntStream`

Returns a stream over the values in this array, in order.

### `toArray()`

**Returns:** `int[]`

Returns a new, mutable copy of this array's values, as a primitive `int[]`.

### `subArray(`int` startIndex, `int` endIndex)`

**Returns:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

Returns a new immutable array containing the values in the specified range.

 <p><b>Performance note:</b> The returned array has the same full memory footprint as this one
 does (no actual copying is performed). To reduce memory usage, use `subArray(start,
 end).trimmed()`.

### `spliterator()`

**Returns:** `java.util.Spliterator.OfInt`

### `asList()`

**Returns:** `java.util.List<java.lang.Integer>`

Returns an immutable <i>view</i> of this array's values as a `List`; note that `int` values are boxed into `Integer` instances on demand, which can be very expensive.
 The returned list should be used once and discarded. For any usages beyond that, pass the
 returned list to `com.google.common.collect.ImmutableList.copyOf(Collection) ImmutableList.copyOf` and use that list instead.

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

Returns `true` if `object` is an `ImmutableIntArray` containing the same
 values as this one, in the same order.

### `hashCode()`

**Returns:** `int`

Returns an unspecified hash code for the contents of this immutable array.

### `toString()`

**Returns:** `java.lang.String`

Returns a string representation of this array in the same form as `Arrays.toString(int[])`, for example `"[1, 2, 3]"`.

### `trimmed()`

**Returns:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

Returns an immutable array containing the same values as `this` array. This is logically
 a no-op, and in some circumstances `this` itself is returned. However, if this instance
 is a `subArray` view of a larger array, this method will copy only the appropriate range
 of values, resulting in an equivalent array with a smaller memory footprint.

### `isPartialView()`

**Returns:** `boolean`

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readResolve()`

**Returns:** `java.lang.Object`

