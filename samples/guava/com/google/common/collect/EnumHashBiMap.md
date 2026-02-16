# Class: `EnumHashBiMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.EnumHashBiMap`

**Extends:** [`com.google.common.collect.AbstractBiMap<K,V>`](./AbstractBiMap.md)

## Type Parameters

- `K` extends `java.lang.Enum<K>`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A {@code BiMap} backed by an {@code EnumMap} instance for keys-to-values, and a {@code HashMap}
 instance for values-to-keys. Null keys are not permitted, but null values are. An {@code
 EnumHashBiMap} and its inverse are both serializable.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/NewCollectionTypesExplained#bimap">{@code BiMap}</a>.
@author Mike Bostock
@since 2.0

## Fields

### `keyTypeOrObjectUnderJ2cl`

**Type:** `java.lang.Class<K>`

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(`java.lang.Class<K>` keyType)`

## Methods

### `create(`java.lang.Class<K>` keyType)`

**Returns:** [`com.google.common.collect.EnumHashBiMap<K,V>`](./EnumHashBiMap.md)

Returns a new, empty {@code EnumHashBiMap} using the specified key type.
@param keyType the key type

### `create([`java.util.Map<K,? extends V>`](../../../../java/util/Map.md) map)`

**Returns:** [`com.google.common.collect.EnumHashBiMap<K,V>`](./EnumHashBiMap.md)

Constructs a new bimap with the same mappings as the specified map. If the specified map is an
 {@code EnumHashBiMap} or an {@link EnumBiMap}, the new bimap has the same key type as the input
 bimap. Otherwise, the specified map must contain at least one mapping, in order to determine
 the key type.
@param map the map whose mappings are to be placed in this map
@throws IllegalArgumentException if map is not an {@code EnumBiMap} or an {@code EnumHashBiMap}
     instance and contains no mappings

### `checkKey([`K`](K.md) key)`

**Returns:** [`K`](K.md)

### `put([`K`](K.md) key, [`V`](V.md) value)`

**Returns:** [`V`](V.md)

### `forcePut([`K`](K.md) key, [`V`](V.md) value)`

**Returns:** [`V`](V.md)

### `keyType()`

**Returns:** `java.lang.Class<K>`

Returns the associated key type.

### `writeObject([`java.io.ObjectOutputStream`](../../../../java/io/ObjectOutputStream.md) stream)`

**Returns:** `void`

@serialData the key class, number of entries, first key, first value, second key, second value,
     and so on.

### `readObject([`java.io.ObjectInputStream`](../../../../java/io/ObjectInputStream.md) stream)`

**Returns:** `void`

