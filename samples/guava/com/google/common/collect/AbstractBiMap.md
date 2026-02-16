# Class: `AbstractBiMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.AbstractBiMap`

**Extends:** [`com.google.common.collect.ForwardingMap<K,V>`](./ForwardingMap.md)

**Implements:** [`com.google.common.collect.BiMap<K,V>`](./BiMap.md), [`java.io.Serializable`](../../../../java/io/Serializable.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A general-purpose bimap implementation using any two backing {@code Map} instances.

 <p>Note that this class contains {@code equals()} calls that keep it from supporting {@code
 IdentityHashMap} backing maps.
@author Kevin Bourrillion
@author Mike Bostock

## Fields

### `delegate`

**Type:** [`java.util.Map<K,V>`](../../../../java/util/Map.md)

### `inverse`

**Type:** [`com.google.common.collect.AbstractBiMap<V,K>`](./AbstractBiMap.md)

### `keySet`

**Type:** [`java.util.Set<K>`](../../../../java/util/Set.md)

### `valueSet`

**Type:** [`java.util.Set<V>`](../../../../java/util/Set.md)

### `entrySet`

**Type:** [`java.util.Set<java.util.Map.Entry<K,V>>`](../../../../java/util/Set>.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>([`java.util.Map<K,V>`](../../../../java/util/Map.md) forward, [`java.util.Map<V,K>`](../../../../java/util/Map.md) backward)`

Package-private constructor for creating a map-backed bimap.

### `<init>([`java.util.Map<K,V>`](../../../../java/util/Map.md) backward, [`com.google.common.collect.AbstractBiMap<V,K>`](./AbstractBiMap.md) forward)`

Private constructor for inverse bimap.

## Methods

### `delegate()`

**Returns:** [`java.util.Map<K,V>`](../../../../java/util/Map.md)

### `checkKey([`K`](K.md) key)`

**Returns:** [`K`](K.md)

Returns its input, or throws an exception if this is not a valid key.

### `checkValue([`V`](V.md) value)`

**Returns:** [`V`](V.md)

Returns its input, or throws an exception if this is not a valid value.

### `setDelegates([`java.util.Map<K,V>`](../../../../java/util/Map.md) forward, [`java.util.Map<V,K>`](../../../../java/util/Map.md) backward)`

**Returns:** `void`

Specifies the delegate maps going in each direction. Called by the constructor and by
 subclasses during deserialization.

### `makeInverse([`java.util.Map<V,K>`](../../../../java/util/Map.md) backward)`

**Returns:** [`com.google.common.collect.AbstractBiMap<V,K>`](./AbstractBiMap.md)

### `setInverse([`com.google.common.collect.AbstractBiMap<V,K>`](./AbstractBiMap.md) inverse)`

**Returns:** `void`

### `containsValue(`java.lang.Object` value)`

**Returns:** `boolean`

### `put([`K`](K.md) key, [`V`](V.md) value)`

**Returns:** [`V`](V.md)

### `forcePut([`K`](K.md) key, [`V`](V.md) value)`

**Returns:** [`V`](V.md)

### `putInBothMaps([`K`](K.md) key, [`V`](V.md) value, `boolean` force)`

**Returns:** [`V`](V.md)

### `updateInverseMap([`K`](K.md) key, `boolean` containedKey, [`V`](V.md) oldValue, [`V`](V.md) newValue)`

**Returns:** `void`

### `remove(`java.lang.Object` key)`

**Returns:** [`V`](V.md)

### `removeFromBothMaps(`java.lang.Object` key)`

**Returns:** [`V`](V.md)

### `removeFromInverseMap([`V`](V.md) oldValue)`

**Returns:** `void`

### `putAll([`java.util.Map<? extends K,? extends V>`](../../../../java/util/Map.md) map)`

**Returns:** `void`

### `replaceAll([`java.util.function.BiFunction<? super K,? super V,? extends V>`](../../../../java/util/function/BiFunction.md) function)`

**Returns:** `void`

### `clear()`

**Returns:** `void`

### `inverse()`

**Returns:** [`com.google.common.collect.BiMap<V,K>`](./BiMap.md)

### `keySet()`

**Returns:** [`java.util.Set<K>`](../../../../java/util/Set.md)

### `values()`

**Returns:** [`java.util.Set<V>`](../../../../java/util/Set.md)

### `entrySet()`

**Returns:** [`java.util.Set<java.util.Map.Entry<K,V>>`](../../../../java/util/Set>.md)

### `entrySetIterator()`

**Returns:** [`java.util.Iterator<java.util.Map.Entry<K,V>>`](../../../../java/util/Iterator>.md)

