# Class: `HashBiMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.HashBiMap`

**Extends:** [`com.google.common.collect.Maps.IteratorBasedAbstractMap<K,V>`](Maps/IteratorBasedAbstractMap.md)

**Implements:** [`com.google.common.collect.BiMap<K,V>`](./BiMap.md), [`java.io.Serializable`](../../../../java/io/Serializable.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A {@link BiMap} backed by two hash tables. This implementation allows null keys and values. A
 {@code HashBiMap} and its inverse are both serializable.

 <p>This implementation guarantees insertion-based iteration order of its keys.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/NewCollectionTypesExplained#bimap">{@code BiMap} </a>.
@author Louis Wasserman
@author Mike Bostock
@since 2.0

## Fields

### `LOAD_FACTOR`

**Type:** `double`

### `hashTableKToV`

**Type:** [`com.google.common.collect.HashBiMap.@org.checkerframework.checker.nullness.qual.Nullable BiEntry<K,V>[]`](HashBiMap/@org/checkerframework/checker/nullness/qual/Nullable BiEntry.md)

### `hashTableVToK`

**Type:** [`com.google.common.collect.HashBiMap.@org.checkerframework.checker.nullness.qual.Nullable BiEntry<K,V>[]`](HashBiMap/@org/checkerframework/checker/nullness/qual/Nullable BiEntry.md)

### `firstInKeyInsertionOrder`

**Type:** [`com.google.common.collect.HashBiMap.BiEntry<K,V>`](HashBiMap/BiEntry.md)

### `lastInKeyInsertionOrder`

**Type:** [`com.google.common.collect.HashBiMap.BiEntry<K,V>`](HashBiMap/BiEntry.md)

### `size`

**Type:** `int`

### `mask`

**Type:** `int`

### `modCount`

**Type:** `int`

### `inverse`

**Type:** [`com.google.common.collect.BiMap<V,K>`](./BiMap.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(`int` expectedSize)`

## Methods

### `create()`

**Returns:** [`com.google.common.collect.HashBiMap<K,V>`](./HashBiMap.md)

Returns a new, empty {@code HashBiMap} with the default initial capacity (16).

### `create(`int` expectedSize)`

**Returns:** [`com.google.common.collect.HashBiMap<K,V>`](./HashBiMap.md)

Constructs a new, empty bimap with the specified expected size.
@param expectedSize the expected number of entries
@throws IllegalArgumentException if the specified expected size is negative

### `create([`java.util.Map<? extends K,? extends V>`](../../../../java/util/Map.md) map)`

**Returns:** [`com.google.common.collect.HashBiMap<K,V>`](./HashBiMap.md)

Constructs a new bimap containing initial values from {@code map}. The bimap is created with an
 initial capacity sufficient to hold the mappings in the specified map.

### `init(`int` expectedSize)`

**Returns:** `void`

### `delete([`com.google.common.collect.HashBiMap.BiEntry<K,V>`](HashBiMap/BiEntry.md) entry)`

**Returns:** `void`

Finds and removes {@code entry} from the bucket linked lists in both the key-to-value direction
 and the value-to-key direction.

### `insert([`com.google.common.collect.HashBiMap.BiEntry<K,V>`](HashBiMap/BiEntry.md) entry, [`com.google.common.collect.HashBiMap.BiEntry<K,V>`](HashBiMap/BiEntry.md) oldEntryForKey)`

**Returns:** `void`

### `seekByKey(`java.lang.Object` key, `int` keyHash)`

**Returns:** [`com.google.common.collect.HashBiMap.BiEntry<K,V>`](HashBiMap/BiEntry.md)

### `seekByValue(`java.lang.Object` value, `int` valueHash)`

**Returns:** [`com.google.common.collect.HashBiMap.BiEntry<K,V>`](HashBiMap/BiEntry.md)

### `containsKey(`java.lang.Object` key)`

**Returns:** `boolean`

### `containsValue(`java.lang.Object` value)`

**Returns:** `boolean`

Returns {@code true} if this BiMap contains an entry whose value is equal to {@code value} (or,
 equivalently, if this inverse view contains a key that is equal to {@code value}).

 <p>Due to the property that values in a BiMap are unique, this will tend to execute in
 faster-than-linear time.
@param value the object to search for in the values of this BiMap
@return true if a mapping exists from a key to the specified value

### `get(`java.lang.Object` key)`

**Returns:** [`V`](V.md)

### `put([`K`](K.md) key, [`V`](V.md) value)`

**Returns:** [`V`](V.md)

### `put([`K`](K.md) key, [`V`](V.md) value, `boolean` force)`

**Returns:** [`V`](V.md)

### `forcePut([`K`](K.md) key, [`V`](V.md) value)`

**Returns:** [`V`](V.md)

### `putInverse([`V`](V.md) value, [`K`](K.md) key, `boolean` force)`

**Returns:** [`K`](K.md)

### `rehashIfNecessary()`

**Returns:** `void`

### `createTable(`int` length)`

**Returns:** [`com.google.common.collect.HashBiMap.@org.checkerframework.checker.nullness.qual.Nullable BiEntry<K,V>[]`](HashBiMap/@org/checkerframework/checker/nullness/qual/Nullable BiEntry.md)

### `remove(`java.lang.Object` key)`

**Returns:** [`V`](V.md)

### `clear()`

**Returns:** `void`

### `size()`

**Returns:** `int`

### `keySet()`

**Returns:** [`java.util.Set<K>`](../../../../java/util/Set.md)

### `values()`

**Returns:** [`java.util.Set<V>`](../../../../java/util/Set.md)

### `entryIterator()`

**Returns:** [`java.util.Iterator<java.util.Map.Entry<K,V>>`](../../../../java/util/Iterator>.md)

### `forEach([`java.util.function.BiConsumer<? super K,? super V>`](../../../../java/util/function/BiConsumer.md) action)`

**Returns:** `void`

### `replaceAll([`java.util.function.BiFunction<? super K,? super V,? extends V>`](../../../../java/util/function/BiFunction.md) function)`

**Returns:** `void`

### `inverse()`

**Returns:** [`com.google.common.collect.BiMap<V,K>`](./BiMap.md)

### `writeObject([`java.io.ObjectOutputStream`](../../../../java/io/ObjectOutputStream.md) stream)`

**Returns:** `void`

@serialData the number of entries, first key, first value, second key, second value, and so on.

### `readObject([`java.io.ObjectInputStream`](../../../../java/io/ObjectInputStream.md) stream)`

**Returns:** `void`

