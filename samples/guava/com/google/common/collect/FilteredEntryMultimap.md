# Class: `FilteredEntryMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.FilteredEntryMultimap`

**Extends:** [`com.google.common.collect.AbstractMultimap<K,V>`](./AbstractMultimap.md)

**Implements:** [`com.google.common.collect.FilteredMultimap<K,V>`](./FilteredMultimap.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Implementation of {@link Multimaps#filterEntries(Multimap, Predicate)}.
@author Jared Levy
@author Louis Wasserman

## Fields

### `unfiltered`

**Type:** [`com.google.common.collect.Multimap<K,V>`](./Multimap.md)

### `predicate`

**Type:** [`com.google.common.base.Predicate<? super java.util.Map.Entry<K,V>>`](../base/Predicate>.md)

## Constructors

### `<init>([`com.google.common.collect.Multimap<K,V>`](./Multimap.md) unfiltered, [`com.google.common.base.Predicate<? super java.util.Map.Entry<K,V>>`](../base/Predicate>.md) predicate)`

## Methods

### `unfiltered()`

**Returns:** [`com.google.common.collect.Multimap<K,V>`](./Multimap.md)

### `entryPredicate()`

**Returns:** [`com.google.common.base.Predicate<? super java.util.Map.Entry<K,V>>`](../base/Predicate>.md)

### `size()`

**Returns:** `int`

### `satisfies([`K`](K.md) key, [`V`](V.md) value)`

**Returns:** `boolean`

### `filterCollection([`java.util.Collection<E>`](../../../../java/util/Collection.md) collection, [`com.google.common.base.Predicate<? super E>`](../base/Predicate.md) predicate)`

**Returns:** [`java.util.Collection<E>`](../../../../java/util/Collection.md)

### `containsKey(`java.lang.Object` key)`

**Returns:** `boolean`

### `removeAll(`java.lang.Object` key)`

**Returns:** [`java.util.Collection<V>`](../../../../java/util/Collection.md)

### `unmodifiableEmptyCollection()`

**Returns:** [`java.util.Collection<V>`](../../../../java/util/Collection.md)

### `clear()`

**Returns:** `void`

### `get([`K`](K.md) key)`

**Returns:** [`java.util.Collection<V>`](../../../../java/util/Collection.md)

### `createEntries()`

**Returns:** [`java.util.Collection<java.util.Map.Entry<K,V>>`](../../../../java/util/Collection>.md)

### `createValues()`

**Returns:** [`java.util.Collection<V>`](../../../../java/util/Collection.md)

### `entryIterator()`

**Returns:** [`java.util.Iterator<java.util.Map.Entry<K,V>>`](../../../../java/util/Iterator>.md)

### `createAsMap()`

**Returns:** [`java.util.Map<K,java.util.Collection<V>>`](../../../../java/util/Map>.md)

### `createKeySet()`

**Returns:** [`java.util.Set<K>`](../../../../java/util/Set.md)

### `removeEntriesIf([`com.google.common.base.Predicate<? super java.util.Map.Entry<K,java.util.Collection<V>>>`](../base/Predicate>>.md) predicate)`

**Returns:** `boolean`

### `createKeys()`

**Returns:** [`com.google.common.collect.Multiset<K>`](./Multiset.md)

