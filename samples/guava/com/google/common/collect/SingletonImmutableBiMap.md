# Class: `SingletonImmutableBiMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.SingletonImmutableBiMap`

**Extends:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

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

### `<init>(K singleKey, V singleValue)`

**Parameters:**
- `singleKey` (`K`)
- `singleValue` (`V`)

### `<init>(K singleKey, V singleValue, ImmutableBiMap<V,K> inverse)`

**Parameters:**
- `singleKey` (`K`)
- `singleValue` (`V`)
- `inverse` ([`com.google.common.collect.ImmutableBiMap<V,K>`](./ImmutableBiMap.md))

## Methods

### `get(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `V`

### `size()`

**Returns:** `int`

### `forEach(BiConsumer<? super K,? super V> action)`

**Parameters:**
- `action` (`java.util.function.BiConsumer<? super K,? super V>`)

**Returns:** `void`

### `containsKey(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `boolean`

### `containsValue(Object value)`

**Parameters:**
- `value` (`java.lang.Object`)

**Returns:** `boolean`

### `isPartialView()`

**Returns:** `boolean`

### `createEntrySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<java.util.Map.Entry<K,V>>`](./ImmutableSet.md)

### `createKeySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<K>`](./ImmutableSet.md)

### `inverse()`

**Returns:** [`com.google.common.collect.ImmutableBiMap<V,K>`](./ImmutableBiMap.md)

### `writeReplace()`

**Returns:** `java.lang.Object`

