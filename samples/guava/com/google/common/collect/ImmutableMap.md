# Class: `ImmutableMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableMap`

**Implements:** `java.util.Map<K,V>`, `java.io.Serializable`

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

A `Map` whose contents will never change, with many other important properties detailed at
 `ImmutableCollection`.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/ImmutableCollectionsExplained">immutable collections</a>.
**Author:** Jesse Wilson
**Author:** Kevin Bourrillion
**Since:** 2.0

## Fields

### `EMPTY_ENTRY_ARRAY`

**Type:** `java.util.Map.Entry<?,?>[]`

### `entrySet`

**Type:** [`com.google.common.collect.ImmutableSet<java.util.Map.Entry<K,V>>`](./ImmutableSet>.md)

### `keySet`

**Type:** [`com.google.common.collect.ImmutableSet<K>`](./ImmutableSet.md)

### `values`

**Type:** [`com.google.common.collect.ImmutableCollection<V>`](./ImmutableCollection.md)

### `multimapView`

**Type:** [`com.google.common.collect.ImmutableSetMultimap<K,V>`](./ImmutableSetMultimap.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>()`

## Methods

### `toImmutableMap(`java.util.function.Function<? super T,? extends K>` keyFunction, `java.util.function.Function<? super T,? extends V>` valueFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMap<K,V>>`

Returns a `Collector` that accumulates elements into an `ImmutableMap` whose keys
 and values are the result of applying the provided mapping functions to the input elements.
 Entries appear in the result `ImmutableMap` in encounter order.

 <p>If the mapped keys contain duplicates (according to `Object.equals(Object)`, an `IllegalArgumentException` is thrown when the collection operation is performed. (This differs
 from the `Collector` returned by `Collectors.toMap(Function, Function)`, which
 throws an `IllegalStateException`.)
**Since:** 21.0

### `toImmutableMap(`java.util.function.Function<? super T,? extends K>` keyFunction, `java.util.function.Function<? super T,? extends V>` valueFunction, `java.util.function.BinaryOperator<V>` mergeFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMap<K,V>>`

Returns a `Collector` that accumulates elements into an `ImmutableMap` whose keys
 and values are the result of applying the provided mapping functions to the input elements.

 <p>If the mapped keys contain duplicates (according to `Object.equals(Object)`), the
 values are merged using the specified merging function. If the merging function returns `null`, then the collector removes the value that has been computed for the key thus far (though
 future occurrences of the key would reinsert it).

 <p>Entries will appear in the encounter order of the first occurrence of the key.
**Since:** 21.0

### `of()`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

Returns the empty map. This map behaves and performs comparably to `Collections.emptyMap`, and is preferable mainly for consistency and maintainability of your
 code.

 <p><b>Performance note:</b> the instance returned is a singleton.

### `of(`K` k1, `V` v1)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

Returns an immutable map containing a single entry. This map behaves and performs comparably to
 `Collections.singletonMap` but will not accept a null key or value. It is preferable
 mainly for consistency and maintainability of your code.

### `of(`K` k1, `V` v1, `K` k2, `V` v2)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

Returns an immutable map containing the given entries, in order.
@throws IllegalArgumentException if duplicate keys are provided

### `of(`K` k1, `V` v1, `K` k2, `V` v2, `K` k3, `V` v3)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

Returns an immutable map containing the given entries, in order.
@throws IllegalArgumentException if duplicate keys are provided

### `of(`K` k1, `V` v1, `K` k2, `V` v2, `K` k3, `V` v3, `K` k4, `V` v4)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

Returns an immutable map containing the given entries, in order.
@throws IllegalArgumentException if duplicate keys are provided

### `of(`K` k1, `V` v1, `K` k2, `V` v2, `K` k3, `V` v3, `K` k4, `V` v4, `K` k5, `V` v5)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

Returns an immutable map containing the given entries, in order.
@throws IllegalArgumentException if duplicate keys are provided

### `of(`K` k1, `V` v1, `K` k2, `V` v2, `K` k3, `V` v3, `K` k4, `V` v4, `K` k5, `V` v5, `K` k6, `V` v6)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

Returns an immutable map containing the given entries, in order.
@throws IllegalArgumentException if duplicate keys are provided
**Since:** 31.0

### `of(`K` k1, `V` v1, `K` k2, `V` v2, `K` k3, `V` v3, `K` k4, `V` v4, `K` k5, `V` v5, `K` k6, `V` v6, `K` k7, `V` v7)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

Returns an immutable map containing the given entries, in order.
@throws IllegalArgumentException if duplicate keys are provided
**Since:** 31.0

### `of(`K` k1, `V` v1, `K` k2, `V` v2, `K` k3, `V` v3, `K` k4, `V` v4, `K` k5, `V` v5, `K` k6, `V` v6, `K` k7, `V` v7, `K` k8, `V` v8)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

Returns an immutable map containing the given entries, in order.
@throws IllegalArgumentException if duplicate keys are provided
**Since:** 31.0

### `of(`K` k1, `V` v1, `K` k2, `V` v2, `K` k3, `V` v3, `K` k4, `V` v4, `K` k5, `V` v5, `K` k6, `V` v6, `K` k7, `V` v7, `K` k8, `V` v8, `K` k9, `V` v9)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

Returns an immutable map containing the given entries, in order.
@throws IllegalArgumentException if duplicate keys are provided
**Since:** 31.0

### `of(`K` k1, `V` v1, `K` k2, `V` v2, `K` k3, `V` v3, `K` k4, `V` v4, `K` k5, `V` v5, `K` k6, `V` v6, `K` k7, `V` v7, `K` k8, `V` v8, `K` k9, `V` v9, `K` k10, `V` v10)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

Returns an immutable map containing the given entries, in order.
@throws IllegalArgumentException if duplicate keys are provided
**Since:** 31.0

### `ofEntries(`java.util.Map.Entry<? extends K,? extends V>[]` entries)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

Returns an immutable map containing the given entries, in order.
@throws IllegalArgumentException if duplicate keys are provided
**Since:** 31.0

### `entryOf(`K` key, `V` value)`

**Returns:** `java.util.Map.Entry<K,V>`

Verifies that `key` and `value` are non-null, and returns a new immutable entry
 with those values.

 <p>A call to `Entry.setValue` on the returned entry will always throw `UnsupportedOperationException`.

### `builder()`

**Returns:** [`com.google.common.collect.ImmutableMap.Builder<K,V>`](ImmutableMap/Builder.md)

Returns a new builder. The generated builder is equivalent to the builder created by the `Builder` constructor.

### `builderWithExpectedSize(`int` expectedSize)`

**Returns:** [`com.google.common.collect.ImmutableMap.Builder<K,V>`](ImmutableMap/Builder.md)

Returns a new builder, expecting the specified number of entries to be added.

 <p>If `expectedSize` is exactly the number of entries added to the builder before `Builder.build` is called, the builder is likely to perform better than an unsized `builder()` would have.

 <p>It is not specified if any performance benefits apply if `expectedSize` is close to,
 but not exactly, the number of entries added to the builder.
**Since:** 23.1

### `checkNoConflict(`boolean` safe, `java.lang.String` conflictDescription, `java.lang.Object` entry1, `java.lang.Object` entry2)`

**Returns:** `void`

### `conflictException(`java.lang.String` conflictDescription, `java.lang.Object` entry1, `java.lang.Object` entry2)`

**Returns:** `java.lang.IllegalArgumentException`

### `copyOf(`java.util.Map<? extends K,? extends V>` map)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

Returns an immutable map containing the same entries as `map`. The returned map iterates
 over entries in the same order as the `entrySet` of the original map. If `map`
 somehow contains entries with duplicate keys (for example, if it is a `SortedMap` whose
 comparator is not <i>consistent with equals</i>), the results of this method are undefined.

 <p>Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.
@throws NullPointerException if any key or value in `map` is null

### `copyOf(`java.lang.Iterable<? extends java.util.Map.Entry<? extends K,? extends V>>` entries)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

Returns an immutable map containing the specified entries. The returned map iterates over
 entries in the same order as the original iterable.
@throws NullPointerException if any key, value, or entry is null
@throws IllegalArgumentException if two entries have the same key
**Since:** 19.0

### `copyOfEnumMap(`java.util.EnumMap<?,? extends V>` original)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,? extends V>`](./ImmutableMap.md)

### `put(`K` k, `V` v)`

**Returns:** `V`

Guaranteed to throw an exception and leave the map unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `putIfAbsent(`K` key, `V` value)`

**Returns:** `V`

Guaranteed to throw an exception and leave the map unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `replace(`K` key, `V` oldValue, `V` newValue)`

**Returns:** `boolean`

Guaranteed to throw an exception and leave the map unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `replace(`K` key, `V` value)`

**Returns:** `V`

Guaranteed to throw an exception and leave the map unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `computeIfAbsent(`K` key, `java.util.function.Function<? super K,? extends V>` mappingFunction)`

**Returns:** `V`

Guaranteed to throw an exception and leave the map unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `computeIfPresent(`K` key, `java.util.function.BiFunction<? super K,? super V,? extends @org.checkerframework.checker.nullness.qual.Nullable V>` remappingFunction)`

**Returns:** `V`

Guaranteed to throw an exception and leave the map unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `compute(`K` key, `java.util.function.BiFunction<? super K,? super @org.checkerframework.checker.nullness.qual.Nullable V,? extends @org.checkerframework.checker.nullness.qual.Nullable V>` remappingFunction)`

**Returns:** `V`

Guaranteed to throw an exception and leave the map unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `merge(`K` key, `V` value, `java.util.function.BiFunction<? super V,? super V,? extends @org.checkerframework.checker.nullness.qual.Nullable V>` function)`

**Returns:** `V`

Guaranteed to throw an exception and leave the map unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `putAll(`java.util.Map<? extends K,? extends V>` map)`

**Returns:** `void`

Guaranteed to throw an exception and leave the map unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `replaceAll(`java.util.function.BiFunction<? super K,? super V,? extends V>` function)`

**Returns:** `void`

Guaranteed to throw an exception and leave the map unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `remove(`java.lang.Object` o)`

**Returns:** `V`

Guaranteed to throw an exception and leave the map unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `remove(`java.lang.Object` key, `java.lang.Object` value)`

**Returns:** `boolean`

Guaranteed to throw an exception and leave the map unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `clear()`

**Returns:** `void`

Guaranteed to throw an exception and leave the map unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `isEmpty()`

**Returns:** `boolean`

### `containsKey(`java.lang.Object` key)`

**Returns:** `boolean`

### `containsValue(`java.lang.Object` value)`

**Returns:** `boolean`

### `get(`java.lang.Object` key)`

**Returns:** `V`

### `getOrDefault(`java.lang.Object` key, `V` defaultValue)`

**Returns:** `V`

**Since:** 21.0 (but only since 23.5 in the Android <a href="https://github.com/google/guava#guava-google-core-libraries-for-java">flavor</a>).
     Note, however, that Java 8 users can call this method with any version and flavor of Guava.

### `entrySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<java.util.Map.Entry<K,V>>`](./ImmutableSet>.md)

Returns an immutable set of the mappings in this map. The iteration order is specified by the
 method used to create this map. Typically, this is insertion order.

### `createEntrySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<java.util.Map.Entry<K,V>>`](./ImmutableSet>.md)

### `keySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<K>`](./ImmutableSet.md)

Returns an immutable set of the keys in this map, in the same order that they appear in `entrySet`.

### `createKeySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<K>`](./ImmutableSet.md)

### `keyIterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<K>`](./UnmodifiableIterator.md)

### `keySpliterator()`

**Returns:** `java.util.Spliterator<K>`

### `values()`

**Returns:** [`com.google.common.collect.ImmutableCollection<V>`](./ImmutableCollection.md)

Returns an immutable collection of the values in this map, in the same order that they appear
 in `entrySet`.

### `createValues()`

**Returns:** [`com.google.common.collect.ImmutableCollection<V>`](./ImmutableCollection.md)

### `asMultimap()`

**Returns:** [`com.google.common.collect.ImmutableSetMultimap<K,V>`](./ImmutableSetMultimap.md)

Returns a multimap view of the map.
**Since:** 14.0

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

### `isPartialView()`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `isHashCodeFast()`

**Returns:** `boolean`

### `toString()`

**Returns:** `java.lang.String`

### `writeReplace()`

**Returns:** `java.lang.Object`

Returns a serializable form of this object. Non-public subclasses should not override this
 method. Publicly-accessible subclasses must override this method and should return a subclass
 of SerializedForm whose readResolve() method returns objects of the subclass type.

### `readObject(`java.io.ObjectInputStream` stream)`

**Returns:** `void`

