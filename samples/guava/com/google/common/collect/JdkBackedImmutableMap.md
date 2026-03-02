# Class: `JdkBackedImmutableMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.JdkBackedImmutableMap`

**Extends:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

## Fields

### `delegateMap`

**Type:** `java.util.Map<K,V>`

### `entries`

**Type:** [`com.google.common.collect.ImmutableList<java.util.Map.Entry<K,V>>`](./ImmutableList.md)

## Constructors

### `<init>(Map<K,V> delegateMap, ImmutableList<Map.Entry<K,V>> entries)`

**Parameters:**
- `delegateMap` (`java.util.Map<K,V>`)
- `entries` ([`com.google.common.collect.ImmutableList<java.util.Map.Entry<K,V>>`](./ImmutableList.md))

## Methods

### `create(int n, Map@Nullable Entry<K,V>[] entryArray, boolean throwIfDuplicateKeys)`

Used when probable hash flooding is
 detected. This implementation may replace the entries in entryArray with its own entry objects
 (though they will have the same key/value contents), and will take ownership of entryArray.

**Parameters:**
- `n` (`int`)
- `entryArray` (`java.util.Map.@org.checkerframework.checker.nullness.qual.Nullable Entry<K,V>[]`)
- `throwIfDuplicateKeys` (`boolean`)

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

### `size()`

**Returns:** `int`

### `get(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `V`

### `createEntrySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<java.util.Map.Entry<K,V>>`](./ImmutableSet.md)

### `forEach(BiConsumer<? super K,? super V> action)`

**Parameters:**
- `action` (`java.util.function.BiConsumer<? super K,? super V>`)

**Returns:** `void`

### `createKeySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<K>`](./ImmutableSet.md)

### `createValues()`

**Returns:** [`com.google.common.collect.ImmutableCollection<V>`](./ImmutableCollection.md)

### `isPartialView()`

**Returns:** `boolean`

### `writeReplace()`

**Returns:** `java.lang.Object`

