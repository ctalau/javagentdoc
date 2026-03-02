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

### `<init>(Map<K,V> forward, Map<V,K> backward)`

**Parameters:**
- `forward` (`java.util.Map<K,V>`)
- `backward` (`java.util.Map<V,K>`)

### `<init>(Map<K,V> backward, AbstractBiMap<V,K> forward)`

**Parameters:**
- `backward` (`java.util.Map<K,V>`)
- `forward` ([`com.google.common.collect.AbstractBiMap<V,K>`](./AbstractBiMap.md))

## Methods

### `delegate()`

**Returns:** `java.util.Map<K,V>`

### `checkKey(K key)`

**Parameters:**
- `key` (`K`)

**Returns:** `K`

### `checkValue(V value)`

**Parameters:**
- `value` (`V`)

**Returns:** `V`

### `setDelegates(Map<K,V> forward, Map<V,K> backward)`

Called by the constructor and by
 subclasses during deserialization.

**Parameters:**
- `forward` (`java.util.Map<K,V>`)
- `backward` (`java.util.Map<V,K>`)

**Returns:** `void`

### `makeInverse(Map<V,K> backward)`

**Parameters:**
- `backward` (`java.util.Map<V,K>`)

**Returns:** [`com.google.common.collect.AbstractBiMap<V,K>`](./AbstractBiMap.md)

### `setInverse(AbstractBiMap<V,K> inverse)`

**Parameters:**
- `inverse` ([`com.google.common.collect.AbstractBiMap<V,K>`](./AbstractBiMap.md))

**Returns:** `void`

### `containsValue(Object value)`

**Parameters:**
- `value` (`java.lang.Object`)

**Returns:** `boolean`

### `put(K key, V value)`

**Parameters:**
- `key` (`K`)
- `value` (`V`)

**Returns:** `V`

### `forcePut(K key, V value)`

**Parameters:**
- `key` (`K`)
- `value` (`V`)

**Returns:** `V`

### `putInBothMaps(K key, V value, boolean force)`

**Parameters:**
- `key` (`K`)
- `value` (`V`)
- `force` (`boolean`)

**Returns:** `V`

### `updateInverseMap(K key, boolean containedKey, V oldValue, V newValue)`

**Parameters:**
- `key` (`K`)
- `containedKey` (`boolean`)
- `oldValue` (`V`)
- `newValue` (`V`)

**Returns:** `void`

### `remove(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `V`

### `removeFromBothMaps(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `V`

### `removeFromInverseMap(V oldValue)`

**Parameters:**
- `oldValue` (`V`)

**Returns:** `void`

### `putAll(Map<? extends K,? extends V> map)`

**Parameters:**
- `map` (`java.util.Map<? extends K,? extends V>`)

**Returns:** `void`

### `replaceAll(BiFunction<? super K,? super V,? extends V> function)`

**Parameters:**
- `function` (`java.util.function.BiFunction<? super K,? super V,? extends V>`)

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

