# Class: `JdkBackedImmutableBiMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.JdkBackedImmutableBiMap`

**Extends:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

## Fields

### `entries`

**Type:** [`com.google.common.collect.ImmutableList<java.util.Map.Entry<K,V>>`](./ImmutableList.md)

### `forwardDelegate`

**Type:** `java.util.Map<K,V>`

### `backwardDelegate`

**Type:** `java.util.Map<V,K>`

### `inverse`

**Type:** [`com.google.common.collect.JdkBackedImmutableBiMap<V,K>`](./JdkBackedImmutableBiMap.md)

## Constructors

### `<init>(ImmutableList<Map.Entry<K,V>> entries, Map<K,V> forwardDelegate, Map<V,K> backwardDelegate)`

**Parameters:**
- `entries` ([`com.google.common.collect.ImmutableList<java.util.Map.Entry<K,V>>`](./ImmutableList.md))
- `forwardDelegate` (`java.util.Map<K,V>`)
- `backwardDelegate` (`java.util.Map<V,K>`)

## Methods

### `create(int n, Map@Nullable Entry<K,V>[] entryArray)`

**Parameters:**
- `n` (`int`)
- `entryArray` (`java.util.Map.@org.checkerframework.checker.nullness.qual.Nullable Entry<K,V>[]`)

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

### `size()`

**Returns:** `int`

### `inverse()`

**Returns:** [`com.google.common.collect.ImmutableBiMap<V,K>`](./ImmutableBiMap.md)

### `get(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `V`

### `createEntrySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<java.util.Map.Entry<K,V>>`](./ImmutableSet.md)

### `createKeySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<K>`](./ImmutableSet.md)

### `isPartialView()`

**Returns:** `boolean`

### `writeReplace()`

**Returns:** `java.lang.Object`

