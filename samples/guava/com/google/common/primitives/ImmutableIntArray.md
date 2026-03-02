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

**Parameters:**
- `e0` (`int`)

**Returns:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

### `of(int e0, int e1)`

**Parameters:**
- `e0` (`int`)
- `e1` (`int`)

**Returns:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

### `of(int e0, int e1, int e2)`

**Parameters:**
- `e0` (`int`)
- `e1` (`int`)
- `e2` (`int`)

**Returns:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

### `of(int e0, int e1, int e2, int e3)`

**Parameters:**
- `e0` (`int`)
- `e1` (`int`)
- `e2` (`int`)
- `e3` (`int`)

**Returns:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

### `of(int e0, int e1, int e2, int e3, int e4)`

**Parameters:**
- `e0` (`int`)
- `e1` (`int`)
- `e2` (`int`)
- `e3` (`int`)
- `e4` (`int`)

**Returns:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

### `of(int e0, int e1, int e2, int e3, int e4, int e5)`

**Parameters:**
- `e0` (`int`)
- `e1` (`int`)
- `e2` (`int`)
- `e3` (`int`)
- `e4` (`int`)
- `e5` (`int`)

**Returns:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

### `of(int first, int[] rest)`

The array rest must not be longer than Integer.MAX_VALUE - 1.

**Parameters:**
- `first` (`int`)
- `rest` (`int[]`)

**Returns:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

### `copyOf(int[] values)`

**Parameters:**
- `values` (`int[]`)

**Returns:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

### `copyOf(Collection<Integer> values)`

**Parameters:**
- `values` (`java.util.Collection<java.lang.Integer>`)

**Returns:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

### `copyOf(Iterable<Integer> values)`

**Performance note:** this method delegates to #copyOf(Collection) if 
 values is a Collection. Otherwise it creates a #builder and uses Builder#addAll(Iterable), with all the performance implications associated with that.

**Parameters:**
- `values` (`java.lang.Iterable<java.lang.Integer>`)

**Returns:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

### `copyOf(IntStream stream)`

**Parameters:**
- `stream` (`java.util.stream.IntStream`)

**Returns:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

### `builder(int initialCapacity)`

The returned builder is not thread-safe.

 
**Performance note:** When feasible, initialCapacity should be the exact number
 of values that will be added, if that knowledge is readily available. It is better to guess a
 value slightly too high than slightly too low. If the value is not exact, the ImmutableIntArray that is built will very likely occupy more memory than strictly necessary;
 to trim memory usage, build using builder.build().trimmed().

**Parameters:**
- `initialCapacity` (`int`)

**Returns:** `com.google.common.primitives.ImmutableIntArray.Builder`

### `builder()`

The returned builder is not thread-safe.

 
**Performance note:** The ImmutableIntArray that is built will very likely occupy
 more memory than necessary; to trim memory usage, build using 
 builder.build().trimmed().

**Returns:** `com.google.common.primitives.ImmutableIntArray.Builder`

### `length()`

**Returns:** `int`

### `isEmpty()`

**Returns:** `boolean`

### `get(int index)`

**Parameters:**
- `index` (`int`)

**Returns:** `int`

### `indexOf(int target)`

Equivalent to asList().indexOf(target).

**Parameters:**
- `target` (`int`)

**Returns:** `int`

### `lastIndexOf(int target)`

Equivalent to asList().lastIndexOf(target).

**Parameters:**
- `target` (`int`)

**Returns:** `int`

### `contains(int target)`

Equivalent to
 asList().contains(target).

**Parameters:**
- `target` (`int`)

**Returns:** `boolean`

### `forEach(IntConsumer consumer)`

**Parameters:**
- `consumer` (`java.util.function.IntConsumer`)

**Returns:** `void`

### `stream()`

**Returns:** `java.util.stream.IntStream`

### `toArray()`

**Returns:** `int[]`

### `subArray(int startIndex, int endIndex)`

**Performance note:** The returned array has the same full memory footprint as this one
 does (no actual copying is performed). To reduce memory usage, use subArray(start,
 end).trimmed().

**Parameters:**
- `startIndex` (`int`)
- `endIndex` (`int`)

**Returns:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

### `spliterator()`

**Returns:** `java.util.Spliterator.OfInt`

### `asList()`

The returned list should be used once and discarded. For any usages beyond that, pass the
 returned list to ImmutableList.copyOf and use that list instead.

**Returns:** `java.util.List<java.lang.Integer>`

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

**Returns:** [`com.google.common.primitives.ImmutableIntArray`](./ImmutableIntArray.md)

### `isPartialView()`

**Returns:** `boolean`

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readResolve()`

**Returns:** `java.lang.Object`

