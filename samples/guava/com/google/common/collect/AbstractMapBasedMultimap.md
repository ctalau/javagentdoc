# Class: `AbstractMapBasedMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.AbstractMapBasedMultimap`

**Extends:** [`com.google.common.collect.AbstractMultimap<K,V>`](./AbstractMultimap.md)

**Implements:** `java.io.Serializable`

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

This class represents a multimap as a map
 that associates each key with a collection of values. All methods of Multimap are
 supported, including those specified as optional in the interface.

 
To implement a multimap, a subclass must define the method #createCollection(), which
 creates an empty collection of values for a key.

 
The multimap constructor takes a map that has a single entry for each distinct key. When you
 insert a key-value pair with a key that isn't already in the multimap, 
 AbstractMapBasedMultimap calls #createCollection() to create the collection of values
 for that key. The subclass should not call #createCollection() directly, and a new
 instance should be created every time the method is called.

 
For example, the subclass could pass a java.util.TreeMap during construction, and
 #createCollection() could return a java.util.TreeSet, in which case the
 multimap's iterators would propagate through the keys and values in sorted order.

 
Keys and values may be null, as long as the underlying collection classes support null
 elements.

 
The collections created by #createCollection() may or may not allow duplicates. If the
 collection, such as a Set, does not support duplicates, an added key-value pair will
 replace an existing pair with the same key and value, if such a pair is present. With collections
 like List that allow duplicates, the collection will keep the existing key-value pairs
 while adding a new pair.

 
This class is not threadsafe when any concurrent operations update the multimap, even if the
 underlying map and #createCollection() method return threadsafe classes. Concurrent read
 operations will work correctly. To allow concurrent update operations, wrap your multimap with a
 call to Multimaps#synchronizedMultimap.

 
For serialization to work, the subclass must specify explicit readObject and 
 writeObject methods.

## Fields

### `map`

**Type:** `java.util.Map<K,java.util.Collection<V>>`

### `totalSize`

**Type:** `int`

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(java.util.Map<K,java.util.Collection<V>> map)`

**Parameters:**
- `map` (`java.util.Map<K,java.util.Collection<V>>`): place to store the mapping from each key to its corresponding values

## Methods

### `setMap(java.util.Map<K,java.util.Collection<V>> map)`

**Returns:** `void`

**Parameters:**
- `map` (`java.util.Map<K,java.util.Collection<V>>`)

### `createUnmodifiableEmptyCollection()`

**Returns:** `java.util.Collection<V>`

This is used in #removeAll on an empty key.

### `createCollection()`

**Returns:** `java.util.Collection<V>`

Collections with weak, soft, or phantom references are not supported. Each call to 
 createCollection should create a new instance.

 
The returned collection class determines whether duplicate key-value pairs are allowed.

### `createCollection(K key)`

**Returns:** `java.util.Collection<V>`

By default, it simply calls
 #createCollection(), which is the correct behavior for most implementations. The LinkedHashMultimap class overrides it.

**Parameters:**
- `key` (`K`): key to associate with values in the collection

### `backingMap()`

**Returns:** `java.util.Map<K,java.util.Collection<V>>`

### `size()`

**Returns:** `int`

### `containsKey(java.lang.Object key)`

**Returns:** `boolean`

**Parameters:**
- `key` (`java.lang.Object`)

### `put(K key, V value)`

**Returns:** `boolean`

**Parameters:**
- `key` (`K`)
- `value` (`V`)

### `getOrCreateCollection(K key)`

**Returns:** `java.util.Collection<V>`

**Parameters:**
- `key` (`K`)

### `replaceValues(K key, java.lang.Iterable<? extends V> values)`

**Returns:** `java.util.Collection<V>`

The returned collection is immutable.

**Parameters:**
- `key` (`K`)
- `values` (`java.lang.Iterable<? extends V>`)

### `removeAll(java.lang.Object key)`

**Returns:** `java.util.Collection<V>`

The returned collection is immutable.

**Parameters:**
- `key` (`java.lang.Object`)

### `unmodifiableCollectionSubclass(java.util.Collection<E> collection)`

**Returns:** `java.util.Collection<E>`

**Parameters:**
- `collection` (`java.util.Collection<E>`)

### `clear()`

**Returns:** `void`

### `get(K key)`

**Returns:** `java.util.Collection<V>`

The returned collection is not serializable.

**Parameters:**
- `key` (`K`)

### `wrapCollection(K key, java.util.Collection<V> collection)`

**Returns:** `java.util.Collection<V>`

Changes to the multimap may alter the returned collection, and vice versa.

**Parameters:**
- `key` (`K`)
- `collection` (`java.util.Collection<V>`)

### `wrapList(K key, java.util.List<V> list, com.google.common.collect.AbstractMapBasedMultimap<K,V>.WrappedCollection ancestor)`

**Returns:** `java.util.List<V>`

**Parameters:**
- `key` (`K`)
- `list` (`java.util.List<V>`)
- `ancestor` ([`com.google.common.collect.AbstractMapBasedMultimap<K,V>.WrappedCollection`](./AbstractMapBasedMultimap.md))

### `iteratorOrListIterator(java.util.Collection<E> collection)`

**Returns:** `java.util.Iterator<E>`

**Parameters:**
- `collection` (`java.util.Collection<E>`)

### `createKeySet()`

**Returns:** `java.util.Set<K>`

### `createMaybeNavigableKeySet()`

**Returns:** `java.util.Set<K>`

### `removeValuesForKey(java.lang.Object key)`

**Returns:** `void`

**Parameters:**
- `key` (`java.lang.Object`)

### `values()`

**Returns:** `java.util.Collection<V>`

The iterator generated by the returned collection traverses the values for one key, followed
 by the values of a second key, and so on.

### `createValues()`

**Returns:** `java.util.Collection<V>`

### `valueIterator()`

**Returns:** `java.util.Iterator<V>`

### `valueSpliterator()`

**Returns:** `java.util.Spliterator<V>`

### `createKeys()`

**Returns:** [`com.google.common.collect.Multiset<K>`](./Multiset.md)

### `entries()`

**Returns:** `java.util.Collection<java.util.Map.Entry<K,V>>`

The iterator generated by the returned collection traverses the values for one key, followed
 by the values of a second key, and so on.

 
Each entry is an immutable snapshot of a key-value mapping in the multimap, taken at the
 time the entry is returned by a method call to the collection or its iterator.

### `createEntries()`

**Returns:** `java.util.Collection<java.util.Map.Entry<K,V>>`

### `entryIterator()`

**Returns:** `java.util.Iterator<java.util.Map.Entry<K,V>>`

The default behavior, which traverses the values for one key, the
 values for a second key, and so on, suffices for most AbstractMapBasedMultimap
 implementations.

### `entrySpliterator()`

**Returns:** `java.util.Spliterator<java.util.Map.Entry<K,V>>`

### `forEach(java.util.function.BiConsumer<? super K,? super V> action)`

**Returns:** `void`

**Parameters:**
- `action` (`java.util.function.BiConsumer<? super K,? super V>`)

### `createAsMap()`

**Returns:** `java.util.Map<K,java.util.Collection<V>>`

### `createMaybeNavigableAsMap()`

**Returns:** `java.util.Map<K,java.util.Collection<V>>`

