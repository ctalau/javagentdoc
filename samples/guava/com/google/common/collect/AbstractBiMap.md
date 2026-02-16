# Class: `AbstractBiMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.AbstractBiMap`

**Extends:** [`com.google.common.collect.ForwardingMap<K,V>`](./ForwardingMap.md)

**Implements:** [`com.google.common.collect.BiMap<K,V>`](./BiMap.md), `java.io.Serializable`

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A general-purpose bimap implementation using any two backing `Map` instances.

 <p>Note that this class contains `equals()` calls that keep it from supporting `IdentityHashMap` backing maps.
**Author:** Kevin Bourrillion
**Author:** Mike Bostock

## Fields

### `delegate`

**Type:** `java.util.Map<K,V>`

### `inverse`

**Type:** [`com.google.common.collect.AbstractBiMap<V,K>`](./AbstractBiMap.md)

### `keySet`

**Type:** `java.util.Set<K>`

### `valueSet`

**Type:** `java.util.Set<V>`

### `entrySet`

**Type:** `java.util.Set<java.util.Map.Entry<K,V>>`

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(`java.util.Map<K,V>` forward, `java.util.Map<V,K>` backward)`

Package-private constructor for creating a map-backed bimap.

### `<init>(`java.util.Map<K,V>` backward, [`com.google.common.collect.AbstractBiMap<V,K>`](./AbstractBiMap.md) forward)`

Private constructor for inverse bimap.

## Methods

### `delegate()`

**Returns:** `java.util.Map<K,V>`

### `checkKey(`K` key)`

**Returns:** `K`

Returns its input, or throws an exception if this is not a valid key.

### `checkValue(`V` value)`

**Returns:** `V`

Returns its input, or throws an exception if this is not a valid value.

### `setDelegates(`java.util.Map<K,V>` forward, `java.util.Map<V,K>` backward)`

**Returns:** `void`

Specifies the delegate maps going in each direction. Called by the constructor and by
 subclasses during deserialization.

### `makeInverse(`java.util.Map<V,K>` backward)`

**Returns:** [`com.google.common.collect.AbstractBiMap<V,K>`](./AbstractBiMap.md)

### `setInverse([`com.google.common.collect.AbstractBiMap<V,K>`](./AbstractBiMap.md) inverse)`

**Returns:** `void`

### `containsValue(`java.lang.Object` value)`

**Returns:** `boolean`

### `put(`K` key, `V` value)`

**Returns:** `V`

### `forcePut(`K` key, `V` value)`

**Returns:** `V`

### `putInBothMaps(`K` key, `V` value, `boolean` force)`

**Returns:** `V`

### `updateInverseMap(`K` key, `boolean` containedKey, `V` oldValue, `V` newValue)`

**Returns:** `void`

### `remove(`java.lang.Object` key)`

**Returns:** `V`

### `removeFromBothMaps(`java.lang.Object` key)`

**Returns:** `V`

### `removeFromInverseMap(`V` oldValue)`

**Returns:** `void`

### `putAll(`java.util.Map<? extends K,? extends V>` map)`

**Returns:** `void`

### `replaceAll(`java.util.function.BiFunction<? super K,? super V,? extends V>` function)`

**Returns:** `void`

### `clear()`

**Returns:** `void`

### `inverse()`

**Returns:** [`com.google.common.collect.BiMap<V,K>`](./BiMap.md)

### `keySet()`

**Returns:** `java.util.Set<K>`

### `values()`

**Returns:** `java.util.Set<V>`

### `entrySet()`

**Returns:** `java.util.Set<java.util.Map.Entry<K,V>>`

### `entrySetIterator()`

**Returns:** `java.util.Iterator<java.util.Map.Entry<K,V>>`

