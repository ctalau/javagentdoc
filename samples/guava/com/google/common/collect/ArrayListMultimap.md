# Class: `ArrayListMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ArrayListMultimap`

**Extends:** [`com.google.common.collect.ArrayListMultimapGwtSerializationDependencies<K,V>`](./ArrayListMultimapGwtSerializationDependencies.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Implementation of `Multimap` that uses an `ArrayList` to store the values for a given
 key. A `HashMap` associates each key with an `ArrayList` of values.

 <p>When iterating through the collections supplied by this class, the ordering of values for a
 given key agrees with the order in which the values were added.

 <p>This multimap allows duplicate key-value pairs. After adding a new key-value pair equal to an
 existing key-value pair, the `ArrayListMultimap` will contain entries for both the new
 value and the old value.

 <p>Keys and values may be null. All optional multimap methods are supported, and all returned
 views are modifiable.

 <p>The lists returned by `get`, `removeAll`, and `replaceValues` all
 implement `java.util.RandomAccess`.

 <p>This class is not threadsafe when any concurrent operations update the multimap. Concurrent
 read operations will work correctly. To allow concurrent update operations, wrap your multimap
 with a call to `Multimaps.synchronizedListMultimap`.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/NewCollectionTypesExplained#multimap">`Multimap`</a>.
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

**Returns:** [`com.google.common.collect.ArrayListMultimap<K,V>`](./ArrayListMultimap.md)

Creates a new, empty `ArrayListMultimap` with the default initial capacities.

 <p>This method will soon be deprecated in favor of `MultimapBuilder.hashKeys().arrayListValues().build()`.

### `create(`int` expectedKeys, `int` expectedValuesPerKey)`

**Returns:** [`com.google.common.collect.ArrayListMultimap<K,V>`](./ArrayListMultimap.md)

Constructs an empty `ArrayListMultimap` with enough capacity to hold the specified
 numbers of keys and values without resizing.

 <p>This method will soon be deprecated in favor of `MultimapBuilder.hashKeys(expectedKeys).arrayListValues(expectedValuesPerKey).build()`.
@param expectedKeys the expected number of distinct keys
@param expectedValuesPerKey the expected average number of values per key
@throws IllegalArgumentException if `expectedKeys` or `expectedValuesPerKey` is
     negative

### `create([`com.google.common.collect.Multimap<? extends K,? extends V>`](./Multimap.md) multimap)`

**Returns:** [`com.google.common.collect.ArrayListMultimap<K,V>`](./ArrayListMultimap.md)

Constructs an `ArrayListMultimap` with the same mappings as the specified multimap.

 <p>This method will soon be deprecated in favor of `MultimapBuilder.hashKeys().arrayListValues().build(multimap)`.
@param multimap the multimap whose contents are copied to this multimap

### `createCollection()`

**Returns:** `java.util.List<V>`

Creates a new, empty `ArrayList` to hold the collection of values for an arbitrary key.

### `trimToSize()`

**Returns:** `void`

Reduces the memory used by this `ArrayListMultimap`, if feasible.
**Deprecated:** For a `ListMultimap` that automatically trims to size, use `ImmutableListMultimap`. If you need a mutable collection, remove the `trimToSize`
     call, or switch to a `HashMap<K, ArrayList<V>>`.

### `writeObject(`java.io.ObjectOutputStream` stream)`

**Returns:** `void`

@serialData expectedValuesPerKey, number of distinct keys, and then for each distinct key: the
     key, number of values for that key, and the key's values

### `readObject(`java.io.ObjectInputStream` stream)`

**Returns:** `void`

