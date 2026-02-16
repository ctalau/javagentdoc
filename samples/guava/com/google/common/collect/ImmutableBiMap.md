# Class: `ImmutableBiMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableBiMap`

**Extends:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

**Implements:** [`com.google.common.collect.BiMap<K,V>`](./BiMap.md)

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

A {@link BiMap} whose contents will never change, with many other important properties detailed
 at {@link ImmutableCollection}.
@author Jared Levy
@since 2.0

## Fields

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>()`

## Methods

### `toImmutableBiMap([`java.util.function.Function<? super T,? extends K>`](../../../../java/util/function/Function.md) keyFunction, [`java.util.function.Function<? super T,? extends V>`](../../../../java/util/function/Function.md) valueFunction)`

**Returns:** [`java.util.stream.Collector<T,?,com.google.common.collect.ImmutableBiMap<K,V>>`](../../../../java/util/stream/Collector>.md)

Returns a {@link Collector} that accumulates elements into an {@code ImmutableBiMap} whose keys
 and values are the result of applying the provided mapping functions to the input elements.
 Entries appear in the result {@code ImmutableBiMap} in encounter order.

 <p>If the mapped keys or values contain duplicates (according to {@link Object#equals(Object)}), an {@code IllegalArgumentException} is thrown when the collection
 operation is performed. (This differs from the {@code Collector} returned by {@link Collectors#toMap(Function, Function)}, which throws an {@code IllegalStateException}.)
@since 21.0

### `of()`

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

Returns the empty bimap.

 <p><b>Performance note:</b> the instance returned is a singleton.

### `of([`K`](K.md) k1, [`V`](V.md) v1)`

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

Returns an immutable bimap containing a single entry.

### `of([`K`](K.md) k1, [`V`](V.md) v1, [`K`](K.md) k2, [`V`](V.md) v2)`

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

Returns an immutable map containing the given entries, in order.
@throws IllegalArgumentException if duplicate keys or values are added

### `of([`K`](K.md) k1, [`V`](V.md) v1, [`K`](K.md) k2, [`V`](V.md) v2, [`K`](K.md) k3, [`V`](V.md) v3)`

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

Returns an immutable map containing the given entries, in order.
@throws IllegalArgumentException if duplicate keys or values are added

### `of([`K`](K.md) k1, [`V`](V.md) v1, [`K`](K.md) k2, [`V`](V.md) v2, [`K`](K.md) k3, [`V`](V.md) v3, [`K`](K.md) k4, [`V`](V.md) v4)`

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

Returns an immutable map containing the given entries, in order.
@throws IllegalArgumentException if duplicate keys or values are added

### `of([`K`](K.md) k1, [`V`](V.md) v1, [`K`](K.md) k2, [`V`](V.md) v2, [`K`](K.md) k3, [`V`](V.md) v3, [`K`](K.md) k4, [`V`](V.md) v4, [`K`](K.md) k5, [`V`](V.md) v5)`

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

Returns an immutable map containing the given entries, in order.
@throws IllegalArgumentException if duplicate keys or values are added

### `of([`K`](K.md) k1, [`V`](V.md) v1, [`K`](K.md) k2, [`V`](V.md) v2, [`K`](K.md) k3, [`V`](V.md) v3, [`K`](K.md) k4, [`V`](V.md) v4, [`K`](K.md) k5, [`V`](V.md) v5, [`K`](K.md) k6, [`V`](V.md) v6)`

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

Returns an immutable map containing the given entries, in order.
@throws IllegalArgumentException if duplicate keys or values are added
@since 31.0

### `of([`K`](K.md) k1, [`V`](V.md) v1, [`K`](K.md) k2, [`V`](V.md) v2, [`K`](K.md) k3, [`V`](V.md) v3, [`K`](K.md) k4, [`V`](V.md) v4, [`K`](K.md) k5, [`V`](V.md) v5, [`K`](K.md) k6, [`V`](V.md) v6, [`K`](K.md) k7, [`V`](V.md) v7)`

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

Returns an immutable map containing the given entries, in order.
@throws IllegalArgumentException if duplicate keys or values are added
@since 31.0

### `of([`K`](K.md) k1, [`V`](V.md) v1, [`K`](K.md) k2, [`V`](V.md) v2, [`K`](K.md) k3, [`V`](V.md) v3, [`K`](K.md) k4, [`V`](V.md) v4, [`K`](K.md) k5, [`V`](V.md) v5, [`K`](K.md) k6, [`V`](V.md) v6, [`K`](K.md) k7, [`V`](V.md) v7, [`K`](K.md) k8, [`V`](V.md) v8)`

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

Returns an immutable map containing the given entries, in order.
@throws IllegalArgumentException if duplicate keys or values are added
@since 31.0

### `of([`K`](K.md) k1, [`V`](V.md) v1, [`K`](K.md) k2, [`V`](V.md) v2, [`K`](K.md) k3, [`V`](V.md) v3, [`K`](K.md) k4, [`V`](V.md) v4, [`K`](K.md) k5, [`V`](V.md) v5, [`K`](K.md) k6, [`V`](V.md) v6, [`K`](K.md) k7, [`V`](V.md) v7, [`K`](K.md) k8, [`V`](V.md) v8, [`K`](K.md) k9, [`V`](V.md) v9)`

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

Returns an immutable map containing the given entries, in order.
@throws IllegalArgumentException if duplicate keys or values are added
@since 31.0

### `of([`K`](K.md) k1, [`V`](V.md) v1, [`K`](K.md) k2, [`V`](V.md) v2, [`K`](K.md) k3, [`V`](V.md) v3, [`K`](K.md) k4, [`V`](V.md) v4, [`K`](K.md) k5, [`V`](V.md) v5, [`K`](K.md) k6, [`V`](V.md) v6, [`K`](K.md) k7, [`V`](V.md) v7, [`K`](K.md) k8, [`V`](V.md) v8, [`K`](K.md) k9, [`V`](V.md) v9, [`K`](K.md) k10, [`V`](V.md) v10)`

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

Returns an immutable map containing the given entries, in order.
@throws IllegalArgumentException if duplicate keys or values are added
@since 31.0

### `ofEntries([`java.util.Map.Entry<? extends K,? extends V>[]`](../../../../java/util/Map/Entry.md) entries)`

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

Returns an immutable map containing the given entries, in order.
@throws IllegalArgumentException if duplicate keys or values are provided
@since 31.0

### `builder()`

**Returns:** [`com.google.common.collect.ImmutableBiMap.Builder<K,V>`](ImmutableBiMap/Builder.md)

Returns a new builder. The generated builder is equivalent to the builder created by the {@link Builder} constructor.

### `builderWithExpectedSize(`int` expectedSize)`

**Returns:** [`com.google.common.collect.ImmutableBiMap.Builder<K,V>`](ImmutableBiMap/Builder.md)

Returns a new builder, expecting the specified number of entries to be added.

 <p>If {@code expectedSize} is exactly the number of entries added to the builder before {@link Builder#build} is called, the builder is likely to perform better than an unsized {@link #builder()} would have.

 <p>It is not specified if any performance benefits apply if {@code expectedSize} is close to,
 but not exactly, the number of entries added to the builder.
@since 23.1

### `copyOf([`java.util.Map<? extends K,? extends V>`](../../../../java/util/Map.md) map)`

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

Returns an immutable bimap containing the same entries as {@code map}. If {@code map} somehow
 contains entries with duplicate keys (for example, if it is a {@code SortedMap} whose
 comparator is not <i>consistent with equals</i>), the results of this method are undefined.

 <p>The returned {@code BiMap} iterates over entries in the same order as the {@code entrySet}
 of the original map.

 <p>Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.
@throws IllegalArgumentException if two keys have the same value or two values have the same
     key
@throws NullPointerException if any key or value in {@code map} is null

### `copyOf(`java.lang.Iterable<? extends java.util.Map.Entry<? extends K,? extends V>>` entries)`

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

Returns an immutable bimap containing the given entries. The returned bimap iterates over
 entries in the same order as the original iterable.
@throws IllegalArgumentException if two keys have the same value or two values have the same
     key
@throws NullPointerException if any key, value, or entry is null
@since 19.0

### `inverse()`

**Returns:** [`com.google.common.collect.ImmutableBiMap<V,K>`](./ImmutableBiMap.md)

{@inheritDoc}

 <p>The inverse of an {@code ImmutableBiMap} is another {@code ImmutableBiMap}.

### `values()`

**Returns:** [`com.google.common.collect.ImmutableSet<V>`](./ImmutableSet.md)

Returns an immutable set of the values in this map, in the same order they appear in {@link #entrySet}.

### `createValues()`

**Returns:** [`com.google.common.collect.ImmutableSet<V>`](./ImmutableSet.md)

### `forcePut([`K`](K.md) key, [`V`](V.md) value)`

**Returns:** [`V`](V.md)

Guaranteed to throw an exception and leave the bimap unmodified.
@throws UnsupportedOperationException always
@deprecated Unsupported operation.

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject([`java.io.ObjectInputStream`](../../../../java/io/ObjectInputStream.md) stream)`

**Returns:** `void`

### `toImmutableMap([`java.util.function.Function<? super T,? extends K>`](../../../../java/util/function/Function.md) keyFunction, [`java.util.function.Function<? super T,? extends V>`](../../../../java/util/function/Function.md) valueFunction)`

**Returns:** [`java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMap<K,V>>`](../../../../java/util/stream/Collector>.md)

Not supported. Use {@link #toImmutableBiMap} instead. This method exists only to hide {@link ImmutableMap#toImmutableMap(Function, Function)} from consumers of {@code ImmutableBiMap}.
@throws UnsupportedOperationException always
@deprecated Use {@link ImmutableBiMap#toImmutableBiMap}.

### `toImmutableMap([`java.util.function.Function<? super T,? extends K>`](../../../../java/util/function/Function.md) keyFunction, [`java.util.function.Function<? super T,? extends V>`](../../../../java/util/function/Function.md) valueFunction, [`java.util.function.BinaryOperator<V>`](../../../../java/util/function/BinaryOperator.md) mergeFunction)`

**Returns:** [`java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMap<K,V>>`](../../../../java/util/stream/Collector>.md)

Not supported. This method does not make sense for {@code BiMap}. This method exists only to
 hide {@link ImmutableMap#toImmutableMap(Function, Function, BinaryOperator)} from consumers of
 {@code ImmutableBiMap}.
@throws UnsupportedOperationException always
@deprecated

