# Class: `SingletonImmutableBiMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.SingletonImmutableBiMap`

**Extends:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

Implementation of {@link ImmutableMap} with exactly one entry.
@author Jesse Wilson
@author Kevin Bourrillion

## Fields

### `singleKey`

**Type:** [`K`](K.md)

### `singleValue`

**Type:** [`V`](V.md)

### `inverse`

**Type:** [`com.google.common.collect.ImmutableBiMap<V,K>`](./ImmutableBiMap.md)

### `lazyInverse`

**Type:** [`com.google.common.collect.ImmutableBiMap<V,K>`](./ImmutableBiMap.md)

## Constructors

### `<init>([`K`](K.md) singleKey, [`V`](V.md) singleValue)`

### `<init>([`K`](K.md) singleKey, [`V`](V.md) singleValue, [`com.google.common.collect.ImmutableBiMap<V,K>`](./ImmutableBiMap.md) inverse)`

## Methods

### `get(`java.lang.Object` key)`

**Returns:** [`V`](V.md)

### `size()`

**Returns:** `int`

### `forEach([`java.util.function.BiConsumer<? super K,? super V>`](../../../../java/util/function/BiConsumer.md) action)`

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

