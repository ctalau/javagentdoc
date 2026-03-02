# Class: `ArrayListMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ArrayListMultimap`

**Extends:** [`com.google.common.collect.ArrayListMultimapGwtSerializationDependencies<K,V>`](./ArrayListMultimapGwtSerializationDependencies.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A HashMap associates each key with an ArrayList of values.

 
When iterating through the collections supplied by this class, the ordering of values for a
 given key agrees with the order in which the values were added.

 
This multimap allows duplicate key-value pairs. After adding a new key-value pair equal to an
 existing key-value pair, the ArrayListMultimap will contain entries for both the new
 value and the old value.

 
Keys and values may be null. All optional multimap methods are supported, and all returned
 views are modifiable.

 
The lists returned by #get, #removeAll, and #replaceValues all
 implement java.util.RandomAccess.

 
This class is not threadsafe when any concurrent operations update the multimap. Concurrent
 read operations will work correctly. To allow concurrent update operations, wrap your multimap
 with a call to Multimaps#synchronizedListMultimap.

 
See the Guava User Guide article on [Multimap](https://github.com/google/guava/wiki/NewCollectionTypesExplained#multimap).

## Fields

### `DEFAULT_VALUES_PER_KEY`

**Type:** `int`

### `expectedValuesPerKey`

**Type:** `int`

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>()`

### `<init>(int expectedKeys, int expectedValuesPerKey)`

**Parameters:**
- `expectedKeys` (`int`)
- `expectedValuesPerKey` (`int`)

### `<init>(com.google.common.collect.Multimap<? extends K,? extends V> multimap)`

**Parameters:**
- `multimap` ([`com.google.common.collect.Multimap<? extends K,? extends V>`](./Multimap.md))

## Methods

### `create()`

**Returns:** [`com.google.common.collect.ArrayListMultimap<K,V>`](./ArrayListMultimap.md)

This method will soon be deprecated in favor of 
 MultimapBuilder.hashKeys().arrayListValues().build().

### `create(int expectedKeys, int expectedValuesPerKey)`

**Returns:** [`com.google.common.collect.ArrayListMultimap<K,V>`](./ArrayListMultimap.md)

This method will soon be deprecated in favor of 
 MultimapBuilder.hashKeys(expectedKeys).arrayListValues(expectedValuesPerKey).build().

**Parameters:**
- `expectedKeys` (`int`): the expected number of distinct keys
- `expectedValuesPerKey` (`int`): the expected average number of values per key

### `create(com.google.common.collect.Multimap<? extends K,? extends V> multimap)`

**Returns:** [`com.google.common.collect.ArrayListMultimap<K,V>`](./ArrayListMultimap.md)

This method will soon be deprecated in favor of 
 MultimapBuilder.hashKeys().arrayListValues().build(multimap).

**Parameters:**
- `multimap` ([`com.google.common.collect.Multimap<? extends K,? extends V>`](./Multimap.md)): the multimap whose contents are copied to this multimap

### `createCollection()`

**Returns:** `java.util.List<V>`

### `trimToSize()`

**Returns:** `void`

### `writeObject(java.io.ObjectOutputStream stream)`

**Returns:** `void`

**Parameters:**
- `stream` (`java.io.ObjectOutputStream`)

### `readObject(java.io.ObjectInputStream stream)`

**Returns:** `void`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

