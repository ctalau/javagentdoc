# Class: `FilteredKeyMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.FilteredKeyMultimap`

**Extends:** [`com.google.common.collect.AbstractMultimap<K,V>`](./AbstractMultimap.md)

**Implements:** [`com.google.common.collect.FilteredMultimap<K,V>`](./FilteredMultimap.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Implementation of {@link Multimaps#filterKeys(Multimap, Predicate)}.
@author Louis Wasserman

## Fields

### `unfiltered`

**Type:** [`com.google.common.collect.Multimap<K,V>`](./Multimap.md)

### `keyPredicate`

**Type:** [`com.google.common.base.Predicate<? super K>`](../base/Predicate.md)

## Constructors

### `<init>([`com.google.common.collect.Multimap<K,V>`](./Multimap.md) unfiltered, [`com.google.common.base.Predicate<? super K>`](../base/Predicate.md) keyPredicate)`

## Methods

### `unfiltered()`

**Returns:** [`com.google.common.collect.Multimap<K,V>`](./Multimap.md)

### `entryPredicate()`

**Returns:** [`com.google.common.base.Predicate<? super java.util.Map.Entry<K,V>>`](../base/Predicate>.md)

### `size()`

**Returns:** `int`

### `containsKey(`java.lang.Object` key)`

**Returns:** `boolean`

### `removeAll(`java.lang.Object` key)`

**Returns:** [`java.util.Collection<V>`](../../../../java/util/Collection.md)

### `unmodifiableEmptyCollection()`

**Returns:** [`java.util.Collection<V>`](../../../../java/util/Collection.md)

### `clear()`

**Returns:** `void`

### `createKeySet()`

**Returns:** [`java.util.Set<K>`](../../../../java/util/Set.md)

### `get([`K`](K.md) key)`

**Returns:** [`java.util.Collection<V>`](../../../../java/util/Collection.md)

### `entryIterator()`

**Returns:** [`java.util.Iterator<java.util.Map.Entry<K,V>>`](../../../../java/util/Iterator>.md)

### `createEntries()`

**Returns:** [`java.util.Collection<java.util.Map.Entry<K,V>>`](../../../../java/util/Collection>.md)

### `createValues()`

**Returns:** [`java.util.Collection<V>`](../../../../java/util/Collection.md)

### `createAsMap()`

**Returns:** [`java.util.Map<K,java.util.Collection<V>>`](../../../../java/util/Map>.md)

### `createKeys()`

**Returns:** [`com.google.common.collect.Multiset<K>`](./Multiset.md)

