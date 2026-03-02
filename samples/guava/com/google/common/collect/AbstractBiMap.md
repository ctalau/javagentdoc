# Class: `AbstractBiMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.AbstractBiMap`

**Extends:** [`com.google.common.collect.ForwardingMap<K,V>`](./ForwardingMap.md)

**Implements:** [`com.google.common.collect.BiMap<K,V>`](./BiMap.md), `java.io.Serializable`

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Note that this class contains equals() calls that keep it from supporting 
 IdentityHashMap backing maps.

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

### `<init>(java.util.Map<K,V> forward, java.util.Map<V,K> backward)`

**Parameters:**
- `forward` (`java.util.Map<K,V>`)
- `backward` (`java.util.Map<V,K>`)

### `<init>(java.util.Map<K,V> backward, com.google.common.collect.AbstractBiMap<V,K> forward)`

**Parameters:**
- `backward` (`java.util.Map<K,V>`)
- `forward` ([`com.google.common.collect.AbstractBiMap<V,K>`](./AbstractBiMap.md))

## Methods

### `delegate()`

**Returns:** `java.util.Map<K,V>`

### `checkKey(K key)`

**Returns:** `K`

**Parameters:**
- `key` (`K`)

### `checkValue(V value)`

**Returns:** `V`

**Parameters:**
- `value` (`V`)

### `setDelegates(java.util.Map<K,V> forward, java.util.Map<V,K> backward)`

**Returns:** `void`

Called by the constructor and by
 subclasses during deserialization.

**Parameters:**
- `forward` (`java.util.Map<K,V>`)
- `backward` (`java.util.Map<V,K>`)

### `makeInverse(java.util.Map<V,K> backward)`

**Returns:** [`com.google.common.collect.AbstractBiMap<V,K>`](./AbstractBiMap.md)

**Parameters:**
- `backward` (`java.util.Map<V,K>`)

### `setInverse(com.google.common.collect.AbstractBiMap<V,K> inverse)`

**Returns:** `void`

**Parameters:**
- `inverse` ([`com.google.common.collect.AbstractBiMap<V,K>`](./AbstractBiMap.md))

### `containsValue(java.lang.Object value)`

**Returns:** `boolean`

**Parameters:**
- `value` (`java.lang.Object`)

### `put(K key, V value)`

**Returns:** `V`

**Parameters:**
- `key` (`K`)
- `value` (`V`)

### `forcePut(K key, V value)`

**Returns:** `V`

**Parameters:**
- `key` (`K`)
- `value` (`V`)

### `putInBothMaps(K key, V value, boolean force)`

**Returns:** `V`

**Parameters:**
- `key` (`K`)
- `value` (`V`)
- `force` (`boolean`)

### `updateInverseMap(K key, boolean containedKey, V oldValue, V newValue)`

**Returns:** `void`

**Parameters:**
- `key` (`K`)
- `containedKey` (`boolean`)
- `oldValue` (`V`)
- `newValue` (`V`)

### `remove(java.lang.Object key)`

**Returns:** `V`

**Parameters:**
- `key` (`java.lang.Object`)

### `removeFromBothMaps(java.lang.Object key)`

**Returns:** `V`

**Parameters:**
- `key` (`java.lang.Object`)

### `removeFromInverseMap(V oldValue)`

**Returns:** `void`

**Parameters:**
- `oldValue` (`V`)

### `putAll(java.util.Map<? extends K,? extends V> map)`

**Returns:** `void`

**Parameters:**
- `map` (`java.util.Map<? extends K,? extends V>`)

### `replaceAll(java.util.function.BiFunction<? super K,? super V,? extends V> function)`

**Returns:** `void`

**Parameters:**
- `function` (`java.util.function.BiFunction<? super K,? super V,? extends V>`)

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

