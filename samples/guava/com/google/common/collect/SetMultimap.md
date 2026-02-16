# Interface: `SetMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.SetMultimap`

**Extends:** [`com.google.common.collect.Multimap<K,V>`](./Multimap.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A {@code Multimap} that cannot hold duplicate key-value pairs. Adding a key-value pair that's
 already in the multimap has no effect. See the {@link Multimap} documentation for information
 common to all multimaps.

 <p>The {@link #get}, {@link #removeAll}, and {@link #replaceValues} methods each return a {@link Set} of values, while {@link #entries} returns a {@code Set} of map entries. Though the method
 signature doesn't say so explicitly, the map returned by {@link #asMap} has {@code Set} values.

 <p>If the values corresponding to a single key should be ordered according to a {@link java.util.Comparator} (or the natural order), see the {@link SortedSetMultimap} subinterface.

 <p>Since the value collections are sets, the behavior of a {@code SetMultimap} is not specified
 if key <em>or value</em> objects already present in the multimap change in a manner that affects
 {@code equals} comparisons. Use caution if mutable objects are used as keys or values in a {@code
 SetMultimap}.

 <p><b>Warning:</b> Do not modify either a key <i>or a value</i> of a {@code SetMultimap} in a way
 that affects its {@link Object#equals} behavior. Undefined behavior and bugs will result.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/NewCollectionTypesExplained#multimap">{@code Multimap}</a>.
@author Jared Levy
@since 2.0

## Methods

### `get([`K`](K.md) key)`

**Returns:** [`java.util.Set<V>`](../../../../java/util/Set.md)

{@inheritDoc}

 <p>Because a {@code SetMultimap} has unique values for a given key, this method returns a
 {@link Set}, instead of the {@link java.util.Collection} specified in the {@link Multimap}
 interface.

### `removeAll(`java.lang.Object` key)`

**Returns:** [`java.util.Set<V>`](../../../../java/util/Set.md)

{@inheritDoc}

 <p>Because a {@code SetMultimap} has unique values for a given key, this method returns a
 {@link Set}, instead of the {@link java.util.Collection} specified in the {@link Multimap}
 interface.

### `replaceValues([`K`](K.md) key, `java.lang.Iterable<? extends V>` values)`

**Returns:** [`java.util.Set<V>`](../../../../java/util/Set.md)

{@inheritDoc}

 <p>Because a {@code SetMultimap} has unique values for a given key, this method returns a
 {@link Set}, instead of the {@link java.util.Collection} specified in the {@link Multimap}
 interface.

 <p>Any duplicates in {@code values} will be stored in the multimap once.

### `entries()`

**Returns:** [`java.util.Set<java.util.Map.Entry<K,V>>`](../../../../java/util/Set>.md)

{@inheritDoc}

 <p>Because a {@code SetMultimap} has unique values for a given key, this method returns a
 {@link Set}, instead of the {@link java.util.Collection} specified in the {@link Multimap}
 interface.

### `asMap()`

**Returns:** [`java.util.Map<K,java.util.Collection<V>>`](../../../../java/util/Map>.md)

{@inheritDoc}

 <p><b>Note:</b> The returned map's values are guaranteed to be of type {@link Set}. To obtain
 this map with the more specific generic type {@code Map<K, Set<V>>}, call {@link Multimaps#asMap(SetMultimap)} instead.

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

Compares the specified object to this multimap for equality.

 <p>Two {@code SetMultimap} instances are equal if, for each key, they contain the same values.
 Equality does not depend on the ordering of keys or values.

 <p>An empty {@code SetMultimap} is equal to any other empty {@code Multimap}, including an
 empty {@code ListMultimap}.

