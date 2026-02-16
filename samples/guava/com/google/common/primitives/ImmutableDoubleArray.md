# Class: `ImmutableDoubleArray`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.ImmutableDoubleArray`

**Implements:** `java.io.Serializable`

## Description

An immutable array of `double` values, with an API resembling `List`.

 <p>Advantages compared to `double[]`:

 <ul>
   <li>All the many well-known advantages of immutability (read <i>Effective Java</i>, third
       edition, Item 17).
   <li>Has the value-based (not identity-based) `equals`, `hashCode`, and `toString` behavior you expect.
   <li>Offers useful operations beyond just `get` and `length`, so you don't have to
       hunt through classes like `Arrays` and `Doubles` for them.
   <li>Supports a copy-free `subArray` view, so methods that accept this type don't need to
       add overloads that accept start and end indexes.
   <li>Can be streamed without "breaking the chain": `foo.getBarDoubles().stream()...`.
   <li>Access to all collection-based utilities via `asList` (though at the cost of
       allocating garbage).
 </ul>

 <p>Disadvantages compared to `double[]`:

 <ul>
   <li>Memory footprint has a fixed overhead (about 24 bytes per instance).
   <li><i>Some</i> construction use cases force the data to be copied (though several construction
       APIs are offered that don't).
   <li>Can't be passed directly to methods that expect `double[]` (though the most common
       utilities do have replacements here).
   <li>Dependency on `com.google.common` / Guava.
 </ul>

 <p>Advantages compared to `com.google.common.collect.ImmutableList``<Double>`:

 <ul>
   <li>Improved memory compactness and locality.
   <li>Can be queried without allocating garbage.
   <li>Access to `DoubleStream` features (like `DoubleStream.sum`) using `stream()` instead of the awkward `stream().mapToDouble(v -> v)`.
 </ul>

 <p>Disadvantages compared to `ImmutableList<Double>`:

 <ul>
   <li>Can't be passed directly to methods that expect `Iterable`, `Collection`, or
       `List` (though the most common utilities do have replacements here, and there is a
       lazy `asList` view).
 </ul>
**Since:** 22.0

## Fields

### `EMPTY`

**Type:** [`com.google.common.primitives.ImmutableDoubleArray`](./ImmutableDoubleArray.md)

### `array`

**Type:** `double[]`

### `start`

**Type:** `int`

### `end`

**Type:** `int`

## Constructors

### `<init>(`double[]` array)`

### `<init>(`double[]` array, `int` start, `int` end)`

## Methods

### `of()`

**Returns:** [`com.google.common.primitives.ImmutableDoubleArray`](./ImmutableDoubleArray.md)

Returns the empty array.

### `of(`double` e0)`

**Returns:** [`com.google.common.primitives.ImmutableDoubleArray`](./ImmutableDoubleArray.md)

Returns an immutable array containing a single value.

### `of(`double` e0, `double` e1)`

**Returns:** [`com.google.common.primitives.ImmutableDoubleArray`](./ImmutableDoubleArray.md)

Returns an immutable array containing the given values, in order.

### `of(`double` e0, `double` e1, `double` e2)`

**Returns:** [`com.google.common.primitives.ImmutableDoubleArray`](./ImmutableDoubleArray.md)

Returns an immutable array containing the given values, in order.

### `of(`double` e0, `double` e1, `double` e2, `double` e3)`

**Returns:** [`com.google.common.primitives.ImmutableDoubleArray`](./ImmutableDoubleArray.md)

Returns an immutable array containing the given values, in order.

### `of(`double` e0, `double` e1, `double` e2, `double` e3, `double` e4)`

**Returns:** [`com.google.common.primitives.ImmutableDoubleArray`](./ImmutableDoubleArray.md)

Returns an immutable array containing the given values, in order.

### `of(`double` e0, `double` e1, `double` e2, `double` e3, `double` e4, `double` e5)`

**Returns:** [`com.google.common.primitives.ImmutableDoubleArray`](./ImmutableDoubleArray.md)

Returns an immutable array containing the given values, in order.

### `of(`double` first, `double[]` rest)`

**Returns:** [`com.google.common.primitives.ImmutableDoubleArray`](./ImmutableDoubleArray.md)

Returns an immutable array containing the given values, in order.

 <p>The array `rest` must not be longer than `Integer.MAX_VALUE - 1`.

### `copyOf(`double[]` values)`

**Returns:** [`com.google.common.primitives.ImmutableDoubleArray`](./ImmutableDoubleArray.md)

Returns an immutable array containing the given values, in order.

### `copyOf(`java.util.Collection<java.lang.Double>` values)`

**Returns:** [`com.google.common.primitives.ImmutableDoubleArray`](./ImmutableDoubleArray.md)

Returns an immutable array containing the given values, in order.

### `copyOf(`java.lang.Iterable<java.lang.Double>` values)`

**Returns:** [`com.google.common.primitives.ImmutableDoubleArray`](./ImmutableDoubleArray.md)

Returns an immutable array containing the given values, in order.

 <p><b>Performance note:</b> this method delegates to `copyOf(Collection)` if `values` is a `Collection`. Otherwise it creates a `builder` and uses `Builder.addAll(Iterable)`, with all the performance implications associated with that.

### `copyOf(`java.util.stream.DoubleStream` stream)`

**Returns:** [`com.google.common.primitives.ImmutableDoubleArray`](./ImmutableDoubleArray.md)

Returns an immutable array containing all the values from `stream`, in order.

### `builder(`int` initialCapacity)`

**Returns:** [`com.google.common.primitives.ImmutableDoubleArray.Builder`](ImmutableDoubleArray/Builder.md)

Returns a new, empty builder for `ImmutableDoubleArray` instances, sized to hold up to
 `initialCapacity` values without resizing. The returned builder is not thread-safe.

 <p><b>Performance note:</b> When feasible, `initialCapacity` should be the exact number
 of values that will be added, if that knowledge is readily available. It is better to guess a
 value slightly too high than slightly too low. If the value is not exact, the `ImmutableDoubleArray` that is built will very likely occupy more memory than strictly
 necessary; to trim memory usage, build using `builder.build().trimmed()`.

### `builder()`

**Returns:** [`com.google.common.primitives.ImmutableDoubleArray.Builder`](ImmutableDoubleArray/Builder.md)

Returns a new, empty builder for `ImmutableDoubleArray` instances, with a default initial
 capacity. The returned builder is not thread-safe.

 <p><b>Performance note:</b> The `ImmutableDoubleArray` that is built will very likely
 occupy more memory than necessary; to trim memory usage, build using `builder.build().trimmed()`.

### `length()`

**Returns:** `int`

Returns the number of values in this array.

### `isEmpty()`

**Returns:** `boolean`

Returns `true` if there are no values in this array (`length` is zero).

### `get(`int` index)`

**Returns:** `double`

Returns the `double` value present at the given index.
@throws IndexOutOfBoundsException if `index` is negative, or greater than or equal to
     `length`

### `indexOf(`double` target)`

**Returns:** `int`

Returns the smallest index for which `get` returns `target`, or `-1` if no
 such index exists. Values are compared as if by `Double.equals`. Equivalent to `asList().indexOf(target)`.

### `lastIndexOf(`double` target)`

**Returns:** `int`

Returns the largest index for which `get` returns `target`, or `-1` if no
 such index exists. Values are compared as if by `Double.equals`. Equivalent to `asList().lastIndexOf(target)`.

### `contains(`double` target)`

**Returns:** `boolean`

Returns `true` if `target` is present at any index in this array. Values are
 compared as if by `Double.equals`. Equivalent to `asList().contains(target)`.

### `forEach(`java.util.function.DoubleConsumer` consumer)`

**Returns:** `void`

Invokes `consumer` for each value contained in this array, in order.

### `stream()`

**Returns:** `java.util.stream.DoubleStream`

Returns a stream over the values in this array, in order.

### `toArray()`

**Returns:** `double[]`

Returns a new, mutable copy of this array's values, as a primitive `double[]`.

### `subArray(`int` startIndex, `int` endIndex)`

**Returns:** [`com.google.common.primitives.ImmutableDoubleArray`](./ImmutableDoubleArray.md)

Returns a new immutable array containing the values in the specified range.

 <p><b>Performance note:</b> The returned array has the same full memory footprint as this one
 does (no actual copying is performed). To reduce memory usage, use `subArray(start,
 end).trimmed()`.

### `spliterator()`

**Returns:** `java.util.Spliterator.OfDouble`

### `asList()`

**Returns:** `java.util.List<java.lang.Double>`

Returns an immutable <i>view</i> of this array's values as a `List`; note that `double` values are boxed into `Double` instances on demand, which can be very expensive.
 The returned list should be used once and discarded. For any usages beyond that, pass the
 returned list to `com.google.common.collect.ImmutableList.copyOf(Collection) ImmutableList.copyOf` and use that list instead.

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

Returns `true` if `object` is an `ImmutableDoubleArray` containing the same
 values as this one, in the same order. Values are compared as if by `Double.equals`.

### `areEqual(`double` a, `double` b)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

Returns an unspecified hash code for the contents of this immutable array.

### `toString()`

**Returns:** `java.lang.String`

Returns a string representation of this array in the same form as `Arrays.toString(double[])`, for example `"[1, 2, 3]"`.

### `trimmed()`

**Returns:** [`com.google.common.primitives.ImmutableDoubleArray`](./ImmutableDoubleArray.md)

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

