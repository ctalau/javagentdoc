# Interface: `BiMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.BiMap`

**Extends:** `java.util.Map<K,V>`

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

This constraint enables bimaps to support an "inverse view", which is another
 bimap containing the same entries as this bimap but with reversed keys and values.

 Implementations

 

   - ImmutableBiMap
   - HashBiMap
   - EnumBiMap
   - EnumHashBiMap
 


 
See the Guava User Guide article on [BiMap](https://github.com/google/guava/wiki/NewCollectionTypesExplained#bimap).

## Methods

### `put(K key, V value)`

**Parameters:**
- `key` (`K`)
- `value` (`V`)

**Returns:** `V`

### `forcePut(K key, V value)`

If the bimap previously contained the
 provided key-value mapping, this method has no effect.

 
Note that a successful call to this method could cause the size of the bimap to increase by
 one, stay the same, or even decrease by one.

 
**Warning:** If an existing entry with this value is removed, the key for that entry is
 discarded and not returned.

**Parameters:**
- `key` (`K`): the key with which the specified value is to be associated
- `value` (`V`): the value to be associated with the specified key

**Returns:** `V`

### `putAll(Map<? extends K,? extends V> map)`

**Warning:** the results of calling this method may vary depending on the iteration order
 of map.

**Parameters:**
- `map` (`java.util.Map<? extends K,? extends V>`)

**Returns:** `void`

### `values()`

Because a bimap has unique values, this method returns a Set, instead of the java.util.Collection specified in the Map interface.

**Returns:** `java.util.Set<V>`

### `inverse()`

The two bimaps are backed by the same data; any changes to one will appear in
 the other.

 
**Note:**There is no guaranteed correspondence between the iteration order of a bimap and
 that of its inverse.

**Returns:** [`com.google.common.collect.BiMap<V,K>`](./BiMap.md)

