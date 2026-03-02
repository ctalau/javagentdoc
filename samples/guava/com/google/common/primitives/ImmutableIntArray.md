# Class: `ImmutableIntArray`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.ImmutableIntArray`

**Implements:** `java.io.Serializable`

## Description

Advantages compared to int[]:

 

   - All the many well-known advantages of immutability (read *Effective Java*, third
       edition, Item 17).
   - Has the value-based (not identity-based) #equals, #hashCode, and #toString behavior you expect.
   - Offers useful operations beyond just get and length, so you don't have to
       hunt through classes like Arrays and Ints for them.
   - Supports a copy-free #subArray view, so methods that accept this type don't need to
       add overloads that accept start and end indexes.
   - Can be streamed without "breaking the chain": foo.getBarInts().stream()....
   - Access to all collection-based utilities via #asList (though at the cost of
       allocating garbage).
 


 
Disadvantages compared to int[]:

 

   - Memory footprint has a fixed overhead (about 24 bytes per instance).
   - *Some* construction use cases force the data to be copied (though several construction
       APIs are offered that don't).
   - Can't be passed directly to methods that expect int[] (though the most common
       utilities do have replacements here).
   - Dependency on com.google.common / Guava.
 


 
Advantages compared to ImmutableList
 <Integer>:

 

   - Improved memory compactness and locality.
   - Can be queried without allocating garbage.
   - Access to IntStream features (like IntStream#sum) using stream()
       instead of the awkward stream().mapToInt(v -> v).
 


 
Disadvantages compared to ImmutableList<Integer>:

 

   - Can't be passed directly to methods that expect Iterable, Collection, or
       List (though the most common utilities do have replacements here, and there is a
       lazy #asList view).

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

### `<init>(int[] array)`

**Parameters:**
- `array` (`int[]`)

### `<init>(int[] array, int start, int end)`

**Parameters:**
- `array` (`int[]`)
- `start` (`int`)
- `end` (`int`)

## Methods

### `of()`

**Returns:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

### `of(int e0)`

**Returns:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

**Parameters:**
- `e0` (`int`)

### `of(int e0, int e1)`

**Returns:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

**Parameters:**
- `e0` (`int`)
- `e1` (`int`)

### `of(int e0, int e1, int e2)`

**Returns:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

**Parameters:**
- `e0` (`int`)
- `e1` (`int`)
- `e2` (`int`)

### `of(int e0, int e1, int e2, int e3)`

**Returns:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

**Parameters:**
- `e0` (`int`)
- `e1` (`int`)
- `e2` (`int`)
- `e3` (`int`)

### `of(int e0, int e1, int e2, int e3, int e4)`

**Returns:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

**Parameters:**
- `e0` (`int`)
- `e1` (`int`)
- `e2` (`int`)
- `e3` (`int`)
- `e4` (`int`)

### `of(int e0, int e1, int e2, int e3, int e4, int e5)`

**Returns:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

**Parameters:**
- `e0` (`int`)
- `e1` (`int`)
- `e2` (`int`)
- `e3` (`int`)
- `e4` (`int`)
- `e5` (`int`)

### `of(int first, int[] rest)`

**Returns:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

The array rest must not be longer than Integer.MAX_VALUE - 1.

**Parameters:**
- `first` (`int`)
- `rest` (`int[]`)

### `copyOf(int[] values)`

**Returns:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

**Parameters:**
- `values` (`int[]`)

### `copyOf(java.util.Collection<java.lang.Integer> values)`

**Returns:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

**Parameters:**
- `values` (`java.util.Collection<java.lang.Integer>`)

### `copyOf(java.lang.Iterable<java.lang.Integer> values)`

**Returns:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

**Performance note:** this method delegates to #copyOf(Collection) if 
 values is a Collection. Otherwise it creates a #builder and uses Builder#addAll(Iterable), with all the performance implications associated with that.

**Parameters:**
- `values` (`java.lang.Iterable<java.lang.Integer>`)

### `copyOf(java.util.stream.IntStream stream)`

**Returns:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

**Parameters:**
- `stream` (`java.util.stream.IntStream`)

### `builder(int initialCapacity)`

**Returns:** `com.google.common.primitives.ImmutableIntArray.Builder`

The returned builder is not thread-safe.

 
**Performance note:** When feasible, initialCapacity should be the exact number
 of values that will be added, if that knowledge is readily available. It is better to guess a
 value slightly too high than slightly too low. If the value is not exact, the ImmutableIntArray that is built will very likely occupy more memory than strictly necessary;
 to trim memory usage, build using builder.build().trimmed().

**Parameters:**
- `initialCapacity` (`int`)

### `builder()`

**Returns:** `com.google.common.primitives.ImmutableIntArray.Builder`

The returned builder is not thread-safe.

 
**Performance note:** The ImmutableIntArray that is built will very likely occupy
 more memory than necessary; to trim memory usage, build using 
 builder.build().trimmed().

### `length()`

**Returns:** `int`

### `isEmpty()`

**Returns:** `boolean`

### `get(int index)`

**Returns:** `int`

**Parameters:**
- `index` (`int`)

### `indexOf(int target)`

**Returns:** `int`

Equivalent to asList().indexOf(target).

**Parameters:**
- `target` (`int`)

### `lastIndexOf(int target)`

**Returns:** `int`

Equivalent to asList().lastIndexOf(target).

**Parameters:**
- `target` (`int`)

### `contains(int target)`

**Returns:** `boolean`

Equivalent to
 asList().contains(target).

**Parameters:**
- `target` (`int`)

### `forEach(java.util.function.IntConsumer consumer)`

**Returns:** `void`

**Parameters:**
- `consumer` (`java.util.function.IntConsumer`)

### `stream()`

**Returns:** `java.util.stream.IntStream`

### `toArray()`

**Returns:** `int[]`

### `subArray(int startIndex, int endIndex)`

**Returns:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

**Performance note:** The returned array has the same full memory footprint as this one
 does (no actual copying is performed). To reduce memory usage, use subArray(start,
 end).trimmed().

**Parameters:**
- `startIndex` (`int`)
- `endIndex` (`int`)

### `spliterator()`

**Returns:** `java.util.Spliterator.OfInt`

### `asList()`

**Returns:** `java.util.List<java.lang.Integer>`

The returned list should be used once and discarded. For any usages beyond that, pass the
 returned list to ImmutableList.copyOf and use that list instead.

### `equals(java.lang.Object object)`

**Returns:** `boolean`

**Parameters:**
- `object` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

### `trimmed()`

**Returns:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

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

