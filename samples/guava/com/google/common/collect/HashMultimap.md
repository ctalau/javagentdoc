# Class: `HashMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.HashMultimap`

**Extends:** [`com.google.common.collect.HashMultimapGwtSerializationDependencies<K,V>`](./HashMultimapGwtSerializationDependencies.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

The multimap does not store duplicate key-value pairs. Adding a new key-value pair equal to an
 existing key-value pair has no effect.

 
Keys and values may be null. All optional multimap methods are supported, and all returned
 views are modifiable.

 
This class is not threadsafe when any concurrent operations update the multimap. Concurrent
 read operations will work correctly if the last write *happens-before* any reads. To allow
 concurrent update operations, wrap your multimap with a call to Multimaps#synchronizedSetMultimap.

 
**Warning:** Do not modify either a key *or a value* of a HashMultimap in a
 way that affects its Object#equals behavior. Undefined behavior and bugs will result.

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

**Returns:** [`com.google.common.collect.HashMultimap<K,V>`](./HashMultimap.md)

This method will soon be deprecated in favor of 
 MultimapBuilder.hashKeys().hashSetValues().build().

### `create(int expectedKeys, int expectedValuesPerKey)`

**Returns:** [`com.google.common.collect.HashMultimap<K,V>`](./HashMultimap.md)

This method will soon be deprecated in favor of 
 MultimapBuilder.hashKeys(expectedKeys).hashSetValues(expectedValuesPerKey).build().

**Parameters:**
- `expectedKeys` (`int`): the expected number of distinct keys
- `expectedValuesPerKey` (`int`): the expected average number of values per key

### `create(com.google.common.collect.Multimap<? extends K,? extends V> multimap)`

**Returns:** [`com.google.common.collect.HashMultimap<K,V>`](./HashMultimap.md)

If a
 key-value mapping appears multiple times in the input multimap, it only appears once in the
 constructed multimap.

 
This method will soon be deprecated in favor of 
 MultimapBuilder.hashKeys().hashSetValues().build(multimap).

**Parameters:**
- `multimap` ([`com.google.common.collect.Multimap<? extends K,? extends V>`](./Multimap.md)): the multimap whose contents are copied to this multimap

### `createCollection()`

**Returns:** `java.util.Set<V>`

Creates an empty HashSet for a collection of values for one key.

### `writeObject(java.io.ObjectOutputStream stream)`

**Returns:** `void`

**Parameters:**
- `stream` (`java.io.ObjectOutputStream`)

### `readObject(java.io.ObjectInputStream stream)`

**Returns:** `void`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

