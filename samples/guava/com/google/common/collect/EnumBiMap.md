# Class: `EnumBiMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.EnumBiMap`

**Extends:** [`com.google.common.collect.AbstractBiMap<K,V>`](./AbstractBiMap.md)

## Type Parameters

- `K` extends `java.lang.Enum<K>`
- `V` extends `java.lang.Enum<V>`

## Description

A {@code BiMap} backed by two {@code EnumMap} instances. Null keys and values are not permitted.
 An {@code EnumBiMap} and its inverse are both serializable.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/NewCollectionTypesExplained#bimap">{@code BiMap}</a>.
@author Mike Bostock
@since 2.0

## Fields

### `keyTypeOrObjectUnderJ2cl`

**Type:** `java.lang.Class<K>`

### `valueTypeOrObjectUnderJ2cl`

**Type:** `java.lang.Class<V>`

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(`java.lang.Class<K>` keyTypeOrObjectUnderJ2cl, `java.lang.Class<V>` valueTypeOrObjectUnderJ2cl)`

## Methods

### `create(`java.lang.Class<K>` keyType, `java.lang.Class<V>` valueType)`

**Returns:** [`com.google.common.collect.EnumBiMap<K,V>`](./EnumBiMap.md)

Returns a new, empty {@code EnumBiMap} using the specified key and value types.
@param keyType the key type
@param valueType the value type

### `create([`java.util.Map<K,V>`](../../../../java/util/Map.md) map)`

**Returns:** [`com.google.common.collect.EnumBiMap<K,V>`](./EnumBiMap.md)

Returns a new bimap with the same mappings as the specified map. If the specified map is an
 {@code EnumBiMap}, the new bimap has the same types as the provided map. Otherwise, the
 specified map must contain at least one mapping, in order to determine the key and value types.
@param map the map whose mappings are to be placed in this map
@throws IllegalArgumentException if map is not an {@code EnumBiMap} instance and contains no
     mappings

### `inferKeyTypeOrObjectUnderJ2cl([`java.util.Map<K,?>`](../../../../java/util/Map.md) map)`

**Returns:** `java.lang.Class<K>`

### `inferValueTypeOrObjectUnderJ2cl([`java.util.Map<?,V>`](../../../../java/util/Map.md) map)`

**Returns:** `java.lang.Class<V>`

### `keyType()`

**Returns:** `java.lang.Class<K>`

Returns the associated key type.

### `valueType()`

**Returns:** `java.lang.Class<V>`

Returns the associated value type.

### `checkKey([`K`](K.md) key)`

**Returns:** [`K`](K.md)

### `checkValue([`V`](V.md) value)`

**Returns:** [`V`](V.md)

### `writeObject([`java.io.ObjectOutputStream`](../../../../java/io/ObjectOutputStream.md) stream)`

**Returns:** `void`

@serialData the key class, value class, number of entries, first key, first value, second key,
     second value, and so on.

### `readObject([`java.io.ObjectInputStream`](../../../../java/io/ObjectInputStream.md) stream)`

**Returns:** `void`

