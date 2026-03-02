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

### `<init>(Class<K> keyTypeOrObjectUnderJ2cl, Class<V> valueTypeOrObjectUnderJ2cl)`

**Parameters:**
- `keyTypeOrObjectUnderJ2cl` (`java.lang.Class<K>`)
- `valueTypeOrObjectUnderJ2cl` (`java.lang.Class<V>`)

## Methods

### `create(Class<K> keyType, Class<V> valueType)`

**Parameters:**
- `keyType` (`java.lang.Class<K>`): the key type
- `valueType` (`java.lang.Class<V>`): the value type

**Returns:** [`com.google.common.collect.EnumBiMap<K,V>`](./EnumBiMap.md)

### `create(Map<K,V> map)`

If the specified map is an
 EnumBiMap, the new bimap has the same types as the provided map. Otherwise, the
 specified map must contain at least one mapping, in order to determine the key and value types.

**Parameters:**
- `map` (`java.util.Map<K,V>`): the map whose mappings are to be placed in this map

**Returns:** [`com.google.common.collect.EnumBiMap<K,V>`](./EnumBiMap.md)

### `inferKeyTypeOrObjectUnderJ2cl(Map<K,?> map)`

**Parameters:**
- `map` (`java.util.Map<K,?>`)

**Returns:** `java.lang.Class<K>`

### `inferValueTypeOrObjectUnderJ2cl(Map<?,V> map)`

**Parameters:**
- `map` (`java.util.Map<?,V>`)

**Returns:** `java.lang.Class<V>`

### `keyType()`

**Returns:** `java.lang.Class<K>`

### `valueType()`

**Returns:** `java.lang.Class<V>`

### `checkKey(K key)`

**Parameters:**
- `key` (`K`)

**Returns:** `K`

### `checkValue(V value)`

**Parameters:**
- `value` (`V`)

**Returns:** `V`

### `writeObject(ObjectOutputStream stream)`

**Parameters:**
- `stream` (`java.io.ObjectOutputStream`)

**Returns:** `void`

### `readObject(ObjectInputStream stream)`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

**Returns:** `void`

