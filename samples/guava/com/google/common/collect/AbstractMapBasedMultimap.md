# Class: `AbstractMapBasedMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.AbstractMapBasedMultimap`

**Extends:** [`com.google.common.collect.AbstractMultimap<K,V>`](./AbstractMultimap.md)

**Implements:** [`java.io.Serializable`](../../../../java/io/Serializable.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Basic implementation of the {@link Multimap} interface. This class represents a multimap as a map
 that associates each key with a collection of values. All methods of {@link Multimap} are
 supported, including those specified as optional in the interface.

 <p>To implement a multimap, a subclass must define the method {@link #createCollection()}, which
 creates an empty collection of values for a key.

 <p>The multimap constructor takes a map that has a single entry for each distinct key. When you
 insert a key-value pair with a key that isn't already in the multimap, {@code
 AbstractMapBasedMultimap} calls {@link #createCollection()} to create the collection of values
 for that key. The subclass should not call {@link #createCollection()} directly, and a new
 instance should be created every time the method is called.

 <p>For example, the subclass could pass a {@link java.util.TreeMap} during construction, and
 {@link #createCollection()} could return a {@link java.util.TreeSet}, in which case the
 multimap's iterators would propagate through the keys and values in sorted order.

 <p>Keys and values may be null, as long as the underlying collection classes support null
 elements.

 <p>The collections created by {@link #createCollection()} may or may not allow duplicates. If the
 collection, such as a {@link Set}, does not support duplicates, an added key-value pair will
 replace an existing pair with the same key and value, if such a pair is present. With collections
 like {@link List} that allow duplicates, the collection will keep the existing key-value pairs
 while adding a new pair.

 <p>This class is not threadsafe when any concurrent operations update the multimap, even if the
 underlying map and {@link #createCollection()} method return threadsafe classes. Concurrent read
 operations will work correctly. To allow concurrent update operations, wrap your multimap with a
 call to {@link Multimaps#synchronizedMultimap}.

 <p>For serialization to work, the subclass must specify explicit {@code readObject} and {@code
 writeObject} methods.
@author Jared Levy
@author Louis Wasserman

## Fields

### `map`

**Type:** [`java.util.Map<K,java.util.Collection<V>>`](../../../../java/util/Map>.md)

### `totalSize`

**Type:** `int`

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>([`java.util.Map<K,java.util.Collection<V>>`](../../../../java/util/Map>.md) map)`

Creates a new multimap that uses the provided map.
@param map place to store the mapping from each key to its corresponding values
@throws IllegalArgumentException if {@code map} is not empty

## Methods

### `setMap([`java.util.Map<K,java.util.Collection<V>>`](../../../../java/util/Map>.md) map)`

**Returns:** `void`

Used during deserialization only.

### `createUnmodifiableEmptyCollection()`

**Returns:** [`java.util.Collection<V>`](../../../../java/util/Collection.md)

Creates an unmodifiable, empty collection of values.

 <p>This is used in {@link #removeAll} on an empty key.

### `createCollection()`

**Returns:** [`java.util.Collection<V>`](../../../../java/util/Collection.md)

Creates the collection of values for a single key.

 <p>Collections with weak, soft, or phantom references are not supported. Each call to {@code
 createCollection} should create a new instance.

 <p>The returned collection class determines whether duplicate key-value pairs are allowed.
@return an empty collection of values

### `createCollection([`K`](K.md) key)`

**Returns:** [`java.util.Collection<V>`](../../../../java/util/Collection.md)

Creates the collection of values for an explicitly provided key. By default, it simply calls
 {@link #createCollection()}, which is the correct behavior for most implementations. The {@link LinkedHashMultimap} class overrides it.
@param key key to associate with values in the collection
@return an empty collection of values

### `backingMap()`

**Returns:** [`java.util.Map<K,java.util.Collection<V>>`](../../../../java/util/Map>.md)

### `size()`

**Returns:** `int`

### `containsKey(`java.lang.Object` key)`

**Returns:** `boolean`

### `put([`K`](K.md) key, [`V`](V.md) value)`

**Returns:** `boolean`

### `getOrCreateCollection([`K`](K.md) key)`

**Returns:** [`java.util.Collection<V>`](../../../../java/util/Collection.md)

### `replaceValues([`K`](K.md) key, `java.lang.Iterable<? extends V>` values)`

**Returns:** [`java.util.Collection<V>`](../../../../java/util/Collection.md)

{@inheritDoc}

 <p>The returned collection is immutable.

### `removeAll(`java.lang.Object` key)`

**Returns:** [`java.util.Collection<V>`](../../../../java/util/Collection.md)

{@inheritDoc}

 <p>The returned collection is immutable.

### `unmodifiableCollectionSubclass([`java.util.Collection<E>`](../../../../java/util/Collection.md) collection)`

**Returns:** [`java.util.Collection<E>`](../../../../java/util/Collection.md)

### `clear()`

**Returns:** `void`

### `get([`K`](K.md) key)`

**Returns:** [`java.util.Collection<V>`](../../../../java/util/Collection.md)

{@inheritDoc}

 <p>The returned collection is not serializable.

### `wrapCollection([`K`](K.md) key, [`java.util.Collection<V>`](../../../../java/util/Collection.md) collection)`

**Returns:** [`java.util.Collection<V>`](../../../../java/util/Collection.md)

Generates a decorated collection that remains consistent with the values in the multimap for
 the provided key. Changes to the multimap may alter the returned collection, and vice versa.

### `wrapList([`K`](K.md) key, [`java.util.List<V>`](../../../../java/util/List.md) list, [`com.google.common.collect.AbstractMapBasedMultimap<K,V>.WrappedCollection`](AbstractMapBasedMultimap/WrappedCollection.md) ancestor)`

**Returns:** [`java.util.List<V>`](../../../../java/util/List.md)

### `iteratorOrListIterator([`java.util.Collection<E>`](../../../../java/util/Collection.md) collection)`

**Returns:** [`java.util.Iterator<E>`](../../../../java/util/Iterator.md)

### `createKeySet()`

**Returns:** [`java.util.Set<K>`](../../../../java/util/Set.md)

### `createMaybeNavigableKeySet()`

**Returns:** [`java.util.Set<K>`](../../../../java/util/Set.md)

### `removeValuesForKey(`java.lang.Object` key)`

**Returns:** `void`

Removes all values for the provided key.

### `values()`

**Returns:** [`java.util.Collection<V>`](../../../../java/util/Collection.md)

{@inheritDoc}

 <p>The iterator generated by the returned collection traverses the values for one key, followed
 by the values of a second key, and so on.

### `createValues()`

**Returns:** [`java.util.Collection<V>`](../../../../java/util/Collection.md)

### `valueIterator()`

**Returns:** [`java.util.Iterator<V>`](../../../../java/util/Iterator.md)

### `valueSpliterator()`

**Returns:** [`java.util.Spliterator<V>`](../../../../java/util/Spliterator.md)

### `createKeys()`

**Returns:** [`com.google.common.collect.Multiset<K>`](./Multiset.md)

### `entries()`

**Returns:** [`java.util.Collection<java.util.Map.Entry<K,V>>`](../../../../java/util/Collection>.md)

{@inheritDoc}

 <p>The iterator generated by the returned collection traverses the values for one key, followed
 by the values of a second key, and so on.

 <p>Each entry is an immutable snapshot of a key-value mapping in the multimap, taken at the
 time the entry is returned by a method call to the collection or its iterator.

### `createEntries()`

**Returns:** [`java.util.Collection<java.util.Map.Entry<K,V>>`](../../../../java/util/Collection>.md)

### `entryIterator()`

**Returns:** [`java.util.Iterator<java.util.Map.Entry<K,V>>`](../../../../java/util/Iterator>.md)

Returns an iterator across all key-value map entries, used by {@code entries().iterator()} and
 {@code values().iterator()}. The default behavior, which traverses the values for one key, the
 values for a second key, and so on, suffices for most {@code AbstractMapBasedMultimap}
 implementations.
@return an iterator across map entries

### `entrySpliterator()`

**Returns:** [`java.util.Spliterator<java.util.Map.Entry<K,V>>`](../../../../java/util/Spliterator>.md)

### `forEach([`java.util.function.BiConsumer<? super K,? super V>`](../../../../java/util/function/BiConsumer.md) action)`

**Returns:** `void`

### `createAsMap()`

**Returns:** [`java.util.Map<K,java.util.Collection<V>>`](../../../../java/util/Map>.md)

### `createMaybeNavigableAsMap()`

**Returns:** [`java.util.Map<K,java.util.Collection<V>>`](../../../../java/util/Map>.md)

