# Class: `ImmutableDoubleArray`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.ImmutableDoubleArray`

**Implements:** `java.io.Serializable`

## Description

Advantages compared to double[]:

 

   - All the many well-known advantages of immutability (read *Effective Java*, third
       edition, Item 17).
   - Has the value-based (not identity-based) #equals, #hashCode, and #toString behavior you expect.
   - Offers useful operations beyond just get and length, so you don't have to
       hunt through classes like Arrays and Doubles for them.
   - Supports a copy-free #subArray view, so methods that accept this type don't need to
       add overloads that accept start and end indexes.
   - Can be streamed without "breaking the chain": foo.getBarDoubles().stream()....
   - Access to all collection-based utilities via #asList (though at the cost of
       allocating garbage).
 


 
Disadvantages compared to double[]:

 

   - Memory footprint has a fixed overhead (about 24 bytes per instance).
   - *Some* construction use cases force the data to be copied (though several construction
       APIs are offered that don't).
   - Can't be passed directly to methods that expect double[] (though the most common
       utilities do have replacements here).
   - Dependency on com.google.common / Guava.
 


 
Advantages compared to ImmutableList
 <Double>:

 

   - Improved memory compactness and locality.
   - Can be queried without allocating garbage.
   - Access to DoubleStream features (like DoubleStream#sum) using 
       stream() instead of the awkward stream().mapToDouble(v -> v).
 


 
Disadvantages compared to ImmutableList<Double>:

 

   - Can't be passed directly to methods that expect Iterable, Collection, or
       List (though the most common utilities do have replacements here, and there is a
       lazy #asList view).

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

### `<init>(double[] array)`

**Parameters:**
- `array` (`double[]`)

### `<init>(double[] array, int start, int end)`

**Parameters:**
- `array` (`double[]`)
- `start` (`int`)
- `end` (`int`)

## Methods

### `of()`

**Returns:** [`com.google.common.primitives.ImmutableDoubleArray`](./ImmutableDoubleArray.md)

### `of(double e0)`

**Returns:** [`com.google.common.primitives.ImmutableDoubleArray`](./ImmutableDoubleArray.md)

**Parameters:**
- `e0` (`double`)

### `of(double e0, double e1)`

**Returns:** [`com.google.common.primitives.ImmutableDoubleArray`](./ImmutableDoubleArray.md)

**Parameters:**
- `e0` (`double`)
- `e1` (`double`)

### `of(double e0, double e1, double e2)`

**Returns:** [`com.google.common.primitives.ImmutableDoubleArray`](./ImmutableDoubleArray.md)

**Parameters:**
- `e0` (`double`)
- `e1` (`double`)
- `e2` (`double`)

### `of(double e0, double e1, double e2, double e3)`

**Returns:** [`com.google.common.primitives.ImmutableDoubleArray`](./ImmutableDoubleArray.md)

**Parameters:**
- `e0` (`double`)
- `e1` (`double`)
- `e2` (`double`)
- `e3` (`double`)

### `of(double e0, double e1, double e2, double e3, double e4)`

**Returns:** [`com.google.common.primitives.ImmutableDoubleArray`](./ImmutableDoubleArray.md)

**Parameters:**
- `e0` (`double`)
- `e1` (`double`)
- `e2` (`double`)
- `e3` (`double`)
- `e4` (`double`)

### `of(double e0, double e1, double e2, double e3, double e4, double e5)`

**Returns:** [`com.google.common.primitives.ImmutableDoubleArray`](./ImmutableDoubleArray.md)

**Parameters:**
- `e0` (`double`)
- `e1` (`double`)
- `e2` (`double`)
- `e3` (`double`)
- `e4` (`double`)
- `e5` (`double`)

### `of(double first, double[] rest)`

**Returns:** [`com.google.common.primitives.ImmutableDoubleArray`](./ImmutableDoubleArray.md)

The array rest must not be longer than Integer.MAX_VALUE - 1.

**Parameters:**
- `first` (`double`)
- `rest` (`double[]`)

### `copyOf(double[] values)`

**Returns:** [`com.google.common.primitives.ImmutableDoubleArray`](./ImmutableDoubleArray.md)

**Parameters:**
- `values` (`double[]`)

### `copyOf(java.util.Collection<java.lang.Double> values)`

**Returns:** [`com.google.common.primitives.ImmutableDoubleArray`](./ImmutableDoubleArray.md)

**Parameters:**
- `values` (`java.util.Collection<java.lang.Double>`)

### `copyOf(java.lang.Iterable<java.lang.Double> values)`

**Returns:** [`com.google.common.primitives.ImmutableDoubleArray`](./ImmutableDoubleArray.md)

**Performance note:** this method delegates to #copyOf(Collection) if 
 values is a Collection. Otherwise it creates a #builder and uses Builder#addAll(Iterable), with all the performance implications associated with that.

**Parameters:**
- `values` (`java.lang.Iterable<java.lang.Double>`)

### `copyOf(java.util.stream.DoubleStream stream)`

**Returns:** [`com.google.common.primitives.ImmutableDoubleArray`](./ImmutableDoubleArray.md)

**Parameters:**
- `stream` (`java.util.stream.DoubleStream`)

### `builder(int initialCapacity)`

**Returns:** `com.google.common.primitives.ImmutableDoubleArray.Builder`

The returned builder is not thread-safe.

 
**Performance note:** When feasible, initialCapacity should be the exact number
 of values that will be added, if that knowledge is readily available. It is better to guess a
 value slightly too high than slightly too low. If the value is not exact, the ImmutableDoubleArray that is built will very likely occupy more memory than strictly
 necessary; to trim memory usage, build using builder.build().trimmed().

**Parameters:**
- `initialCapacity` (`int`)

### `builder()`

**Returns:** `com.google.common.primitives.ImmutableDoubleArray.Builder`

The returned builder is not thread-safe.

 
**Performance note:** The ImmutableDoubleArray that is built will very likely
 occupy more memory than necessary; to trim memory usage, build using 
 builder.build().trimmed().

### `length()`

**Returns:** `int`

### `isEmpty()`

**Returns:** `boolean`

### `get(int index)`

**Returns:** `double`

**Parameters:**
- `index` (`int`)

### `indexOf(double target)`

**Returns:** `int`

Values are compared as if by Double#equals. Equivalent to 
 asList().indexOf(target).

**Parameters:**
- `target` (`double`)

### `lastIndexOf(double target)`

**Returns:** `int`

Values are compared as if by Double#equals. Equivalent to 
 asList().lastIndexOf(target).

**Parameters:**
- `target` (`double`)

### `contains(double target)`

**Returns:** `boolean`

Values are
 compared as if by Double#equals. Equivalent to asList().contains(target).

**Parameters:**
- `target` (`double`)

### `forEach(java.util.function.DoubleConsumer consumer)`

**Returns:** `void`

**Parameters:**
- `consumer` (`java.util.function.DoubleConsumer`)

### `stream()`

**Returns:** `java.util.stream.DoubleStream`

### `toArray()`

**Returns:** `double[]`

### `subArray(int startIndex, int endIndex)`

**Returns:** [`com.google.common.primitives.ImmutableDoubleArray`](./ImmutableDoubleArray.md)

**Performance note:** The returned array has the same full memory footprint as this one
 does (no actual copying is performed). To reduce memory usage, use subArray(start,
 end).trimmed().

**Parameters:**
- `startIndex` (`int`)
- `endIndex` (`int`)

### `spliterator()`

**Returns:** `java.util.Spliterator.OfDouble`

### `asList()`

**Returns:** `java.util.List<java.lang.Double>`

The returned list should be used once and discarded. For any usages beyond that, pass the
 returned list to ImmutableList.copyOf and use that list instead.

### `equals(java.lang.Object object)`

**Returns:** `boolean`

Values are compared as if by Double#equals.

**Parameters:**
- `object` (`java.lang.Object`)

### `areEqual(double a, double b)`

**Returns:** `boolean`

**Parameters:**
- `a` (`double`)
- `b` (`double`)

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

### `trimmed()`

**Returns:** [`com.google.common.primitives.ImmutableDoubleArray`](./ImmutableDoubleArray.md)

This is logically
 a no-op, and in some circumstances this itself is returned. However, if this instance
 is a #subArray view of a larger array, this method will copy only the appropriate range
 of values, resulting in an equivalent array with a smaller memory footprint.

### `isPartialView()`

**Returns:** `boolean`

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readResolve()`

**Returns:** `java.lang.Object`

