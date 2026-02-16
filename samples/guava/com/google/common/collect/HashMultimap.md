# Class: `HashMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.HashMultimap`

**Extends:** [`com.google.common.collect.HashMultimapGwtSerializationDependencies<K,V>`](./HashMultimapGwtSerializationDependencies.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Implementation of `Multimap` using hash tables.

 <p>The multimap does not store duplicate key-value pairs. Adding a new key-value pair equal to an
 existing key-value pair has no effect.

 <p>Keys and values may be null. All optional multimap methods are supported, and all returned
 views are modifiable.

 <p>This class is not threadsafe when any concurrent operations update the multimap. Concurrent
 read operations will work correctly if the last write <i>happens-before</i> any reads. To allow
 concurrent update operations, wrap your multimap with a call to `Multimaps.synchronizedSetMultimap`.

 <p><b>Warning:</b> Do not modify either a key <i>or a value</i> of a `HashMultimap` in a
 way that affects its `Object.equals` behavior. Undefined behavior and bugs will result.
**Author:** Jared Levy
**Since:** 2.0

## Fields

### `DEFAULT_VALUES_PER_KEY`

**Type:** `int`

### `expectedValuesPerKey`

**Type:** `int`

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>()`

### `<init>(`int` expectedKeys, `int` expectedValuesPerKey)`

### `<init>([`com.google.common.collect.Multimap<? extends K,? extends V>`](./Multimap.md) multimap)`

## Methods

### `create()`

**Returns:** [`com.google.common.collect.HashMultimap<K,V>`](./HashMultimap.md)

Creates a new, empty `HashMultimap` with the default initial capacities.

 <p>This method will soon be deprecated in favor of `MultimapBuilder.hashKeys().hashSetValues().build()`.

### `create(`int` expectedKeys, `int` expectedValuesPerKey)`

**Returns:** [`com.google.common.collect.HashMultimap<K,V>`](./HashMultimap.md)

Constructs an empty `HashMultimap` with enough capacity to hold the specified numbers of
 keys and values without rehashing.

 <p>This method will soon be deprecated in favor of `MultimapBuilder.hashKeys(expectedKeys).hashSetValues(expectedValuesPerKey).build()`.
@param expectedKeys the expected number of distinct keys
@param expectedValuesPerKey the expected average number of values per key
@throws IllegalArgumentException if `expectedKeys` or `expectedValuesPerKey` is
     negative

### `create([`com.google.common.collect.Multimap<? extends K,? extends V>`](./Multimap.md) multimap)`

**Returns:** [`com.google.common.collect.HashMultimap<K,V>`](./HashMultimap.md)

Constructs a `HashMultimap` with the same mappings as the specified multimap. If a
 key-value mapping appears multiple times in the input multimap, it only appears once in the
 constructed multimap.

 <p>This method will soon be deprecated in favor of `MultimapBuilder.hashKeys().hashSetValues().build(multimap)`.
@param multimap the multimap whose contents are copied to this multimap

### `createCollection()`

**Returns:** `java.util.Set<V>`

{@inheritDoc}

 <p>Creates an empty `HashSet` for a collection of values for one key.
@return a new `HashSet` containing a collection of values for one key

### `writeObject(`java.io.ObjectOutputStream` stream)`

**Returns:** `void`

@serialData expectedValuesPerKey, number of distinct keys, and then for each distinct key: the
     key, number of values for that key, and the key's values

### `readObject(`java.io.ObjectInputStream` stream)`

**Returns:** `void`

