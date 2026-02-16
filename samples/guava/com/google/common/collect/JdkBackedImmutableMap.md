# Class: `JdkBackedImmutableMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.JdkBackedImmutableMap`

**Extends:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

Implementation of ImmutableMap backed by a JDK HashMap, which has smartness protecting against
 hash flooding.

## Fields

### `delegateMap`

**Type:** [`java.util.Map<K,V>`](../../../../java/util/Map.md)

### `entries`

**Type:** [`com.google.common.collect.ImmutableList<java.util.Map.Entry<K,V>>`](./ImmutableList>.md)

## Constructors

### `<init>([`java.util.Map<K,V>`](../../../../java/util/Map.md) delegateMap, [`com.google.common.collect.ImmutableList<java.util.Map.Entry<K,V>>`](./ImmutableList>.md) entries)`

## Methods

### `create(`int` n, [`java.util.Map.@org.checkerframework.checker.nullness.qual.Nullable Entry<K,V>[]`](../../../../java/util/Map/@org/checkerframework/checker/nullness/qual/Nullable Entry.md) entryArray, `boolean` throwIfDuplicateKeys)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

Creates an {@code ImmutableMap} backed by a JDK HashMap. Used when probable hash flooding is
 detected. This implementation may replace the entries in entryArray with its own entry objects
 (though they will have the same key/value contents), and will take ownership of entryArray.

### `size()`

**Returns:** `int`

### `get(`java.lang.Object` key)`

**Returns:** [`V`](V.md)

### `createEntrySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<java.util.Map.Entry<K,V>>`](./ImmutableSet>.md)

### `forEach([`java.util.function.BiConsumer<? super K,? super V>`](../../../../java/util/function/BiConsumer.md) action)`

**Returns:** `void`

### `createKeySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<K>`](./ImmutableSet.md)

### `createValues()`

**Returns:** [`com.google.common.collect.ImmutableCollection<V>`](./ImmutableCollection.md)

### `isPartialView()`

**Returns:** `boolean`

### `writeReplace()`

**Returns:** `java.lang.Object`

