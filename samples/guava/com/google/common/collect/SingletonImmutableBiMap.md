# Class: `SingletonImmutableBiMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.SingletonImmutableBiMap`

**Extends:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

Implementation of `ImmutableMap` with exactly one entry.
**Author:** Jesse Wilson
**Author:** Kevin Bourrillion

## Fields

### `singleKey`

**Type:** `K`

### `singleValue`

**Type:** `V`

### `inverse`

**Type:** [`com.google.common.collect.ImmutableBiMap<V,K>`](./ImmutableBiMap.md)

### `lazyInverse`

**Type:** [`com.google.common.collect.ImmutableBiMap<V,K>`](./ImmutableBiMap.md)

## Constructors

### `<init>(`K` singleKey, `V` singleValue)`

### `<init>(`K` singleKey, `V` singleValue, [`com.google.common.collect.ImmutableBiMap<V,K>`](./ImmutableBiMap.md) inverse)`

## Methods

### `get(`java.lang.Object` key)`

**Returns:** `V`

### `size()`

**Returns:** `int`

### `forEach(`java.util.function.BiConsumer<? super K,? super V>` action)`

**Returns:** `void`

### `containsKey(`java.lang.Object` key)`

**Returns:** `boolean`

### `containsValue(`java.lang.Object` value)`

**Returns:** `boolean`

### `isPartialView()`

**Returns:** `boolean`

### `createEntrySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<java.util.Map.Entry<K,V>>`](./ImmutableSet>.md)

### `createKeySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<K>`](./ImmutableSet.md)

### `inverse()`

**Returns:** [`com.google.common.collect.ImmutableBiMap<V,K>`](./ImmutableBiMap.md)

### `writeReplace()`

**Returns:** `java.lang.Object`

