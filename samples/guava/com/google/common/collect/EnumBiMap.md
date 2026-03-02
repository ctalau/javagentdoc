# Class: `EnumBiMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.EnumBiMap`

**Extends:** [`com.google.common.collect.AbstractBiMap<K,V>`](./AbstractBiMap.md)

## Type Parameters

- `K` extends `java.lang.Enum<K>`
- `V` extends `java.lang.Enum<V>`

## Description

Null keys and values are not permitted.
 An EnumBiMap and its inverse are both serializable.

 
See the Guava User Guide article on [BiMap](https://github.com/google/guava/wiki/NewCollectionTypesExplained#bimap).

## Fields

### `keyTypeOrObjectUnderJ2cl`

**Type:** `java.lang.Class<K>`

### `valueTypeOrObjectUnderJ2cl`

**Type:** `java.lang.Class<V>`

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(java.lang.Class<K> keyTypeOrObjectUnderJ2cl, java.lang.Class<V> valueTypeOrObjectUnderJ2cl)`

**Parameters:**
- `keyTypeOrObjectUnderJ2cl` (`java.lang.Class<K>`)
- `valueTypeOrObjectUnderJ2cl` (`java.lang.Class<V>`)

## Methods

### `create(java.lang.Class<K> keyType, java.lang.Class<V> valueType)`

**Returns:** [`com.google.common.collect.EnumBiMap<K,V>`](./EnumBiMap.md)

**Parameters:**
- `keyType` (`java.lang.Class<K>`): the key type
- `valueType` (`java.lang.Class<V>`): the value type

### `create(java.util.Map<K,V> map)`

**Returns:** [`com.google.common.collect.EnumBiMap<K,V>`](./EnumBiMap.md)

If the specified map is an
 EnumBiMap, the new bimap has the same types as the provided map. Otherwise, the
 specified map must contain at least one mapping, in order to determine the key and value types.

**Parameters:**
- `map` (`java.util.Map<K,V>`): the map whose mappings are to be placed in this map

### `inferKeyTypeOrObjectUnderJ2cl(java.util.Map<K,?> map)`

**Returns:** `java.lang.Class<K>`

**Parameters:**
- `map` (`java.util.Map<K,?>`)

### `inferValueTypeOrObjectUnderJ2cl(java.util.Map<?,V> map)`

**Returns:** `java.lang.Class<V>`

**Parameters:**
- `map` (`java.util.Map<?,V>`)

### `keyType()`

**Returns:** `java.lang.Class<K>`

### `valueType()`

**Returns:** `java.lang.Class<V>`

### `checkKey(K key)`

**Returns:** `K`

**Parameters:**
- `key` (`K`)

### `checkValue(V value)`

**Returns:** `V`

**Parameters:**
- `value` (`V`)

### `writeObject(java.io.ObjectOutputStream stream)`

**Returns:** `void`

**Parameters:**
- `stream` (`java.io.ObjectOutputStream`)

### `readObject(java.io.ObjectInputStream stream)`

**Returns:** `void`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

