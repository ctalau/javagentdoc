# Interface: `BiMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.BiMap`

**Extends:** `java.util.Map<K,V>`

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A bimap (or "bidirectional map") is a map that preserves the uniqueness of its values as well as
 that of its keys. This constraint enables bimaps to support an "inverse view", which is another
 bimap containing the same entries as this bimap but with reversed keys and values.

 <h3>Implementations</h3>

 <ul>
   <li>`ImmutableBiMap`
   <li>`HashBiMap`
   <li>`EnumBiMap`
   <li>`EnumHashBiMap`
 </ul>

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/NewCollectionTypesExplained#bimap">`BiMap`</a>.
**Author:** Kevin Bourrillion
**Since:** 2.0

## Methods

### `put(`K` key, `V` value)`

**Returns:** `V`

{@inheritDoc}
@throws IllegalArgumentException if the given value is already bound to a different key in this
     bimap. The bimap will remain unmodified in this event. To avoid this exception, call `forcePut` instead.

### `forcePut(`K` key, `V` value)`

**Returns:** `V`

An alternate form of `put` that silently removes any existing entry with the value `value` before proceeding with the `put` operation. If the bimap previously contained the
 provided key-value mapping, this method has no effect.

 <p>Note that a successful call to this method could cause the size of the bimap to increase by
 one, stay the same, or even decrease by one.

 <p><b>Warning:</b> If an existing entry with this value is removed, the key for that entry is
 discarded and not returned.
@param key the key with which the specified value is to be associated
@param value the value to be associated with the specified key
@return the value that was previously associated with the key, or `null` if there was no
     previous entry. (If the bimap contains null values, then `forcePut`, like `put`, returns `null` both if the key is absent and if it is present with a null
     value.)

### `putAll(`java.util.Map<? extends K,? extends V>` map)`

**Returns:** `void`

{@inheritDoc}

 <p><b>Warning:</b> the results of calling this method may vary depending on the iteration order
 of `map`.
@throws IllegalArgumentException if an attempt to `put` any entry fails. Note that some
     map entries may have been added to the bimap before the exception was thrown.

### `values()`

**Returns:** `java.util.Set<V>`

{@inheritDoc}

 <p>Because a bimap has unique values, this method returns a `Set`, instead of the `java.util.Collection` specified in the `Map` interface.

### `inverse()`

**Returns:** [`com.google.common.collect.BiMap<V,K>`](./BiMap.md)

Returns the inverse view of this bimap, which maps each of this bimap's values to its
 associated key. The two bimaps are backed by the same data; any changes to one will appear in
 the other.

 <p><b>Note:</b>There is no guaranteed correspondence between the iteration order of a bimap and
 that of its inverse.
@return the inverse view of this bimap

