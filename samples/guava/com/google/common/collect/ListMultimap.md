# Interface: `ListMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ListMultimap`

**Extends:** [`com.google.common.collect.Multimap<K,V>`](./Multimap.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A {@code Multimap} that can hold duplicate key-value pairs and that maintains the insertion
 ordering of values for a given key. See the {@link Multimap} documentation for information common
 to all multimaps.

 <p>The {@link #get}, {@link #removeAll}, and {@link #replaceValues} methods each return a {@link List} of values. Though the method signature doesn't say so explicitly, the map returned by
 {@link #asMap} has {@code List} values.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/NewCollectionTypesExplained#multimap">{@code Multimap}</a>.
@author Jared Levy
@since 2.0

## Methods

### `get([`K`](K.md) key)`

**Returns:** [`java.util.List<V>`](../../../../java/util/List.md)

{@inheritDoc}

 <p>Because the values for a given key may have duplicates and follow the insertion ordering,
 this method returns a {@link List}, instead of the {@link java.util.Collection} specified in
 the {@link Multimap} interface.

### `removeAll(`java.lang.Object` key)`

**Returns:** [`java.util.List<V>`](../../../../java/util/List.md)

{@inheritDoc}

 <p>Because the values for a given key may have duplicates and follow the insertion ordering,
 this method returns a {@link List}, instead of the {@link java.util.Collection} specified in
 the {@link Multimap} interface.

### `replaceValues([`K`](K.md) key, `java.lang.Iterable<? extends V>` values)`

**Returns:** [`java.util.List<V>`](../../../../java/util/List.md)

{@inheritDoc}

 <p>Because the values for a given key may have duplicates and follow the insertion ordering,
 this method returns a {@link List}, instead of the {@link java.util.Collection} specified in
 the {@link Multimap} interface.

### `asMap()`

**Returns:** [`java.util.Map<K,java.util.Collection<V>>`](../../../../java/util/Map>.md)

{@inheritDoc}

 <p><b>Note:</b> The returned map's values are guaranteed to be of type {@link List}. To obtain
 this map with the more specific generic type {@code Map<K, List<V>>}, call {@link Multimaps#asMap(ListMultimap)} instead.

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

Compares the specified object to this multimap for equality.

 <p>Two {@code ListMultimap} instances are equal if, for each key, they contain the same values
 in the same order. If the value orderings disagree, the multimaps will not be considered equal.

 <p>An empty {@code ListMultimap} is equal to any other empty {@code Multimap}, including an
 empty {@code SetMultimap}.

