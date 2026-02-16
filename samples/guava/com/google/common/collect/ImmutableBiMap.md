# Class: `ImmutableBiMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableBiMap`

**Extends:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

**Implements:** [`com.google.common.collect.BiMap<K,V>`](./BiMap.md)

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

A `BiMap` whose contents will never change, with many other important properties detailed
 at `ImmutableCollection`.
**Author:** Jared Levy
**Since:** 2.0

## Fields

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>()`

## Methods

### `toImmutableBiMap(`java.util.function.Function<? super T,? extends K>` keyFunction, `java.util.function.Function<? super T,? extends V>` valueFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableBiMap<K,V>>`

Returns a `Collector` that accumulates elements into an `ImmutableBiMap` whose keys
 and values are the result of applying the provided mapping functions to the input elements.
 Entries appear in the result `ImmutableBiMap` in encounter order.

 <p>If the mapped keys or values contain duplicates (according to `Object.equals(Object)`), an `IllegalArgumentException` is thrown when the collection
 operation is performed. (This differs from the `Collector` returned by `Collectors.toMap(Function, Function)`, which throws an `IllegalStateException`.)
**Since:** 21.0

### `of()`

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

Returns the empty bimap.

 <p><b>Performance note:</b> the instance returned is a singleton.

### `of(`K` k1, `V` v1)`

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

Returns an immutable bimap containing a single entry.

### `of(`K` k1, `V` v1, `K` k2, `V` v2)`

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

Returns an immutable map containing the given entries, in order.
@throws IllegalArgumentException if duplicate keys or values are added

### `of(`K` k1, `V` v1, `K` k2, `V` v2, `K` k3, `V` v3)`

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

Returns an immutable map containing the given entries, in order.
@throws IllegalArgumentException if duplicate keys or values are added

### `of(`K` k1, `V` v1, `K` k2, `V` v2, `K` k3, `V` v3, `K` k4, `V` v4)`

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

Returns an immutable map containing the given entries, in order.
@throws IllegalArgumentException if duplicate keys or values are added

### `of(`K` k1, `V` v1, `K` k2, `V` v2, `K` k3, `V` v3, `K` k4, `V` v4, `K` k5, `V` v5)`

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

Returns an immutable map containing the given entries, in order.
@throws IllegalArgumentException if duplicate keys or values are added

### `of(`K` k1, `V` v1, `K` k2, `V` v2, `K` k3, `V` v3, `K` k4, `V` v4, `K` k5, `V` v5, `K` k6, `V` v6)`

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

Returns an immutable map containing the given entries, in order.
@throws IllegalArgumentException if duplicate keys or values are added
**Since:** 31.0

### `of(`K` k1, `V` v1, `K` k2, `V` v2, `K` k3, `V` v3, `K` k4, `V` v4, `K` k5, `V` v5, `K` k6, `V` v6, `K` k7, `V` v7)`

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

Returns an immutable map containing the given entries, in order.
@throws IllegalArgumentException if duplicate keys or values are added
**Since:** 31.0

### `of(`K` k1, `V` v1, `K` k2, `V` v2, `K` k3, `V` v3, `K` k4, `V` v4, `K` k5, `V` v5, `K` k6, `V` v6, `K` k7, `V` v7, `K` k8, `V` v8)`

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

Returns an immutable map containing the given entries, in order.
@throws IllegalArgumentException if duplicate keys or values are added
**Since:** 31.0

### `of(`K` k1, `V` v1, `K` k2, `V` v2, `K` k3, `V` v3, `K` k4, `V` v4, `K` k5, `V` v5, `K` k6, `V` v6, `K` k7, `V` v7, `K` k8, `V` v8, `K` k9, `V` v9)`

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

Returns an immutable map containing the given entries, in order.
@throws IllegalArgumentException if duplicate keys or values are added
**Since:** 31.0

### `of(`K` k1, `V` v1, `K` k2, `V` v2, `K` k3, `V` v3, `K` k4, `V` v4, `K` k5, `V` v5, `K` k6, `V` v6, `K` k7, `V` v7, `K` k8, `V` v8, `K` k9, `V` v9, `K` k10, `V` v10)`

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

Returns an immutable map containing the given entries, in order.
@throws IllegalArgumentException if duplicate keys or values are added
**Since:** 31.0

### `ofEntries(`java.util.Map.Entry<? extends K,? extends V>[]` entries)`

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

Returns an immutable map containing the given entries, in order.
@throws IllegalArgumentException if duplicate keys or values are provided
**Since:** 31.0

### `builder()`

**Returns:** [`com.google.common.collect.ImmutableBiMap.Builder<K,V>`](ImmutableBiMap/Builder.md)

Returns a new builder. The generated builder is equivalent to the builder created by the `Builder` constructor.

### `builderWithExpectedSize(`int` expectedSize)`

**Returns:** [`com.google.common.collect.ImmutableBiMap.Builder<K,V>`](ImmutableBiMap/Builder.md)

Returns a new builder, expecting the specified number of entries to be added.

 <p>If `expectedSize` is exactly the number of entries added to the builder before `Builder.build` is called, the builder is likely to perform better than an unsized `builder()` would have.

 <p>It is not specified if any performance benefits apply if `expectedSize` is close to,
 but not exactly, the number of entries added to the builder.
**Since:** 23.1

### `copyOf(`java.util.Map<? extends K,? extends V>` map)`

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

Returns an immutable bimap containing the same entries as `map`. If `map` somehow
 contains entries with duplicate keys (for example, if it is a `SortedMap` whose
 comparator is not <i>consistent with equals</i>), the results of this method are undefined.

 <p>The returned `BiMap` iterates over entries in the same order as the `entrySet`
 of the original map.

 <p>Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.
@throws IllegalArgumentException if two keys have the same value or two values have the same
     key
@throws NullPointerException if any key or value in `map` is null

### `copyOf(`java.lang.Iterable<? extends java.util.Map.Entry<? extends K,? extends V>>` entries)`

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

Returns an immutable bimap containing the given entries. The returned bimap iterates over
 entries in the same order as the original iterable.
@throws IllegalArgumentException if two keys have the same value or two values have the same
     key
@throws NullPointerException if any key, value, or entry is null
**Since:** 19.0

### `inverse()`

**Returns:** [`com.google.common.collect.ImmutableBiMap<V,K>`](./ImmutableBiMap.md)

{@inheritDoc}

 <p>The inverse of an `ImmutableBiMap` is another `ImmutableBiMap`.

### `values()`

**Returns:** [`com.google.common.collect.ImmutableSet<V>`](./ImmutableSet.md)

Returns an immutable set of the values in this map, in the same order they appear in `entrySet`.

### `createValues()`

**Returns:** [`com.google.common.collect.ImmutableSet<V>`](./ImmutableSet.md)

### `forcePut(`K` key, `V` value)`

**Returns:** `V`

Guaranteed to throw an exception and leave the bimap unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject(`java.io.ObjectInputStream` stream)`

**Returns:** `void`

### `toImmutableMap(`java.util.function.Function<? super T,? extends K>` keyFunction, `java.util.function.Function<? super T,? extends V>` valueFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMap<K,V>>`

Not supported. Use `toImmutableBiMap` instead. This method exists only to hide `ImmutableMap.toImmutableMap(Function, Function)` from consumers of `ImmutableBiMap`.
@throws UnsupportedOperationException always
**Deprecated:**Use `ImmutableBiMap.toImmutableBiMap`.

### `toImmutableMap(`java.util.function.Function<? super T,? extends K>` keyFunction, `java.util.function.Function<? super T,? extends V>` valueFunction, `java.util.function.BinaryOperator<V>` mergeFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMap<K,V>>`

Not supported. This method does not make sense for `BiMap`. This method exists only to
 hide `ImmutableMap.toImmutableMap(Function, Function, BinaryOperator)` from consumers of
 `ImmutableBiMap`.
@throws UnsupportedOperationException always
**Deprecated:**

