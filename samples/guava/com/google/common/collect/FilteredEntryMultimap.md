# Class: `FilteredEntryMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.FilteredEntryMultimap`

**Extends:** [`com.google.common.collect.AbstractMultimap<K,V>`](./AbstractMultimap.md)

**Implements:** [`com.google.common.collect.FilteredMultimap<K,V>`](./FilteredMultimap.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Implementation of `Multimaps.filterEntries(Multimap, Predicate)`.
**Author:** Jared Levy
**Author:** Louis Wasserman

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

### `satisfies(`K` key, `V` value)`

**Returns:** `boolean`

### `filterCollection(`java.util.Collection<E>` collection, [`com.google.common.base.Predicate<? super E>`](../base/Predicate.md) predicate)`

**Returns:** `java.util.Collection<E>`

### `containsKey(`java.lang.Object` key)`

**Returns:** `boolean`

### `removeAll(`java.lang.Object` key)`

**Returns:** `java.util.Collection<V>`

### `unmodifiableEmptyCollection()`

**Returns:** `java.util.Collection<V>`

### `clear()`

**Returns:** `void`

### `get(`K` key)`

**Returns:** `java.util.Collection<V>`

### `createEntries()`

**Returns:** `java.util.Collection<java.util.Map.Entry<K,V>>`

### `createValues()`

**Returns:** `java.util.Collection<V>`

### `entryIterator()`

**Returns:** `java.util.Iterator<java.util.Map.Entry<K,V>>`

### `createAsMap()`

**Returns:** `java.util.Map<K,java.util.Collection<V>>`

### `createKeySet()`

**Returns:** `java.util.Set<K>`

### `removeEntriesIf([`com.google.common.base.Predicate<? super java.util.Map.Entry<K,java.util.Collection<V>>>`](../base/Predicate>>.md) predicate)`

**Returns:** `boolean`

### `createKeys()`

**Returns:** [`com.google.common.collect.Multiset<K>`](./Multiset.md)

