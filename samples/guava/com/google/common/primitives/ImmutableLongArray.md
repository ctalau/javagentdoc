# Class: `ImmutableLongArray`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.ImmutableLongArray`

**Implements:** `java.io.Serializable`

## Description

Advantages compared to long[]:

 

   - All the many well-known advantages of immutability (read *Effective Java*, third
       edition, Item 17).
   - Has the value-based (not identity-based) #equals, #hashCode, and #toString behavior you expect.
   - Offers useful operations beyond just get and length, so you don't have to
       hunt through classes like Arrays and Longs for them.
   - Supports a copy-free #subArray view, so methods that accept this type don't need to
       add overloads that accept start and end indexes.
   - Can be streamed without "breaking the chain": foo.getBarLongs().stream()....
   - Access to all collection-based utilities via #asList (though at the cost of
       allocating garbage).
 


 
Disadvantages compared to long[]:

 

   - Memory footprint has a fixed overhead (about 24 bytes per instance).
   - *Some* construction use cases force the data to be copied (though several construction
       APIs are offered that don't).
   - Can't be passed directly to methods that expect long[] (though the most common
       utilities do have replacements here).
   - Dependency on com.google.common / Guava.
 


 
Advantages compared to ImmutableList
 <Long>:

 

   - Improved memory compactness and locality.
   - Can be queried without allocating garbage.
   - Access to LongStream features (like LongStream#sum) using stream()
       instead of the awkward stream().mapToLong(v -> v).
 


 
Disadvantages compared to ImmutableList<Long>:

 

   - Can't be passed directly to methods that expect Iterable, Collection, or
       List (though the most common utilities do have replacements here, and there is a
       lazy #asList view).

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

### `<init>(long[] array)`

**Parameters:**
- `array` (`long[]`)

### `<init>(long[] array, int start, int end)`

**Parameters:**
- `array` (`long[]`)
- `start` (`int`)
- `end` (`int`)

## Methods

### `of()`

**Returns:** [`com.google.common.primitives.ImmutableLongArray`](./ImmutableLongArray.md)

### `of(long e0)`

**Parameters:**
- `e0` (`long`)

**Returns:** [`com.google.common.primitives.ImmutableLongArray`](./ImmutableLongArray.md)

### `of(long e0, long e1)`

**Parameters:**
- `e0` (`long`)
- `e1` (`long`)

**Returns:** [`com.google.common.primitives.ImmutableLongArray`](./ImmutableLongArray.md)

### `of(long e0, long e1, long e2)`

**Parameters:**
- `e0` (`long`)
- `e1` (`long`)
- `e2` (`long`)

**Returns:** [`com.google.common.primitives.ImmutableLongArray`](./ImmutableLongArray.md)

### `of(long e0, long e1, long e2, long e3)`

**Parameters:**
- `e0` (`long`)
- `e1` (`long`)
- `e2` (`long`)
- `e3` (`long`)

**Returns:** [`com.google.common.primitives.ImmutableLongArray`](./ImmutableLongArray.md)

### `of(long e0, long e1, long e2, long e3, long e4)`

**Parameters:**
- `e0` (`long`)
- `e1` (`long`)
- `e2` (`long`)
- `e3` (`long`)
- `e4` (`long`)

**Returns:** [`com.google.common.primitives.ImmutableLongArray`](./ImmutableLongArray.md)

### `of(long e0, long e1, long e2, long e3, long e4, long e5)`

**Parameters:**
- `e0` (`long`)
- `e1` (`long`)
- `e2` (`long`)
- `e3` (`long`)
- `e4` (`long`)
- `e5` (`long`)

**Returns:** [`com.google.common.primitives.ImmutableLongArray`](./ImmutableLongArray.md)

### `of(long first, long[] rest)`

The array rest must not be longer than Integer.MAX_VALUE - 1.

**Parameters:**
- `first` (`long`)
- `rest` (`long[]`)

**Returns:** [`com.google.common.primitives.ImmutableLongArray`](./ImmutableLongArray.md)

### `copyOf(long[] values)`

**Parameters:**
- `values` (`long[]`)

**Returns:** [`com.google.common.primitives.ImmutableLongArray`](./ImmutableLongArray.md)

### `copyOf(Collection<Long> values)`

**Parameters:**
- `values` (`java.util.Collection<java.lang.Long>`)

**Returns:** [`com.google.common.primitives.ImmutableLongArray`](./ImmutableLongArray.md)

### `copyOf(Iterable<Long> values)`

**Performance note:** this method delegates to #copyOf(Collection) if 
 values is a Collection. Otherwise it creates a #builder and uses Builder#addAll(Iterable), with all the performance implications associated with that.

**Parameters:**
- `values` (`java.lang.Iterable<java.lang.Long>`)

**Returns:** [`com.google.common.primitives.ImmutableLongArray`](./ImmutableLongArray.md)

### `copyOf(LongStream stream)`

**Parameters:**
- `stream` (`java.util.stream.LongStream`)

**Returns:** [`com.google.common.primitives.ImmutableLongArray`](./ImmutableLongArray.md)

### `builder(int initialCapacity)`

The returned builder is not thread-safe.

 
**Performance note:** When feasible, initialCapacity should be the exact number
 of values that will be added, if that knowledge is readily available. It is better to guess a
 value slightly too high than slightly too low. If the value is not exact, the ImmutableLongArray that is built will very likely occupy more memory than strictly necessary;
 to trim memory usage, build using builder.build().trimmed().

**Parameters:**
- `initialCapacity` (`int`)

**Returns:** `com.google.common.primitives.ImmutableLongArray.Builder`

### `builder()`

The returned builder is not thread-safe.

 
**Performance note:** The ImmutableLongArray that is built will very likely
 occupy more memory than necessary; to trim memory usage, build using 
 builder.build().trimmed().

**Returns:** `com.google.common.primitives.ImmutableLongArray.Builder`

### `length()`

**Returns:** `int`

### `isEmpty()`

**Returns:** `boolean`

### `get(int index)`

**Parameters:**
- `index` (`int`)

**Returns:** `long`

### `indexOf(long target)`

Equivalent to asList().indexOf(target).

**Parameters:**
- `target` (`long`)

**Returns:** `int`

### `lastIndexOf(long target)`

Equivalent to asList().lastIndexOf(target).

**Parameters:**
- `target` (`long`)

**Returns:** `int`

### `contains(long target)`

Equivalent to
 asList().contains(target).

**Parameters:**
- `target` (`long`)

**Returns:** `boolean`

### `forEach(LongConsumer consumer)`

**Parameters:**
- `consumer` (`java.util.function.LongConsumer`)

**Returns:** `void`

### `stream()`

**Returns:** `java.util.stream.LongStream`

### `toArray()`

**Returns:** `long[]`

### `subArray(int startIndex, int endIndex)`

**Performance note:** The returned array has the same full memory footprint as this one
 does (no actual copying is performed). To reduce memory usage, use subArray(start,
 end).trimmed().

**Parameters:**
- `startIndex` (`int`)
- `endIndex` (`int`)

**Returns:** [`com.google.common.primitives.ImmutableLongArray`](./ImmutableLongArray.md)

### `spliterator()`

**Returns:** `java.util.Spliterator.OfLong`

### `asList()`

The
 returned list should be used once and discarded. For any usages beyond that, pass the returned
 list to ImmutableList.copyOf
 and use that list instead.

**Returns:** `java.util.List<java.lang.Long>`

### `equals(Object object)`

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

### `trimmed()`

This is logically
 a no-op, and in some circumstances this itself is returned. However, if this instance
 is a #subArray view of a larger array, this method will copy only the appropriate range
 of values, resulting in an equivalent array with a smaller memory footprint.

**Returns:** [`com.google.common.primitives.ImmutableLongArray`](./ImmutableLongArray.md)

### `isPartialView()`

**Returns:** `boolean`

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readResolve()`

**Returns:** `java.lang.Object`

