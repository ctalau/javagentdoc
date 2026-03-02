# Class: `Serialization`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Serialization`

## Description

This class assists the implementation of collection classes. Do not use this class to
 serialize collections that are defined elsewhere.

## Constructors

### `<init>()`

## Methods

### `readCount(java.io.ObjectInputStream stream)`

**Returns:** `int`

It returns the size of
 a map serialized by #writeMap(Map, ObjectOutputStream), the number of distinct elements
 in a multiset serialized by #writeMultiset(Multiset, ObjectOutputStream), or the number
 of distinct keys in a multimap serialized by #writeMultimap(Multimap,
 ObjectOutputStream).

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

### `writeMap(java.util.Map<K,V> map, java.io.ObjectOutputStream stream)`

**Returns:** `void`

It does not support
 concurrent maps whose content may change while the method is running.

 
The serialized output consists of the number of entries, first key, first value, second key,
 second value, and so on.

**Parameters:**
- `map` (`java.util.Map<K,V>`)
- `stream` (`java.io.ObjectOutputStream`)

### `populateMap(java.util.Map<K,V> map, java.io.ObjectInputStream stream)`

**Returns:** `void`

See #writeMap
 for the data format.

**Parameters:**
- `map` (`java.util.Map<K,V>`)
- `stream` (`java.io.ObjectInputStream`)

### `populateMap(java.util.Map<K,V> map, java.io.ObjectInputStream stream, int size)`

**Returns:** `void`

See #writeMap
 for the data format. The size is determined by a prior call to #readCount.

**Parameters:**
- `map` (`java.util.Map<K,V>`)
- `stream` (`java.io.ObjectInputStream`)
- `size` (`int`)

### `writeMultiset(com.google.common.collect.Multiset<E> multiset, java.io.ObjectOutputStream stream)`

**Returns:** `void`

It does not
 support concurrent multisets whose content may change while the method is running.

 
The serialized output consists of the number of distinct elements, the first element, its
 count, the second element, its count, and so on.

**Parameters:**
- `multiset` ([`com.google.common.collect.Multiset<E>`](./Multiset.md))
- `stream` (`java.io.ObjectOutputStream`)

### `populateMultiset(com.google.common.collect.Multiset<E> multiset, java.io.ObjectInputStream stream)`

**Returns:** `void`

See #writeMultiset for the data format.

**Parameters:**
- `multiset` ([`com.google.common.collect.Multiset<E>`](./Multiset.md))
- `stream` (`java.io.ObjectInputStream`)

### `populateMultiset(com.google.common.collect.Multiset<E> multiset, java.io.ObjectInputStream stream, int distinctElements)`

**Returns:** `void`

See #writeMultiset for the data format. The number of distinct elements is determined by a prior
 call to #readCount.

**Parameters:**
- `multiset` ([`com.google.common.collect.Multiset<E>`](./Multiset.md))
- `stream` (`java.io.ObjectInputStream`)
- `distinctElements` (`int`)

### `writeMultimap(com.google.common.collect.Multimap<K,V> multimap, java.io.ObjectOutputStream stream)`

**Returns:** `void`

It does not
 support concurrent multimaps whose content may change while the method is running. The Multimap#asMap view determines the ordering in which data is written to the stream.

 
The serialized output consists of the number of distinct keys, and then for each distinct
 key: the key, the number of values for that key, and the key's values.

**Parameters:**
- `multimap` ([`com.google.common.collect.Multimap<K,V>`](./Multimap.md))
- `stream` (`java.io.ObjectOutputStream`)

### `populateMultimap(com.google.common.collect.Multimap<K,V> multimap, java.io.ObjectInputStream stream)`

**Returns:** `void`

See #writeMultimap for the data format.

**Parameters:**
- `multimap` ([`com.google.common.collect.Multimap<K,V>`](./Multimap.md))
- `stream` (`java.io.ObjectInputStream`)

### `populateMultimap(com.google.common.collect.Multimap<K,V> multimap, java.io.ObjectInputStream stream, int distinctKeys)`

**Returns:** `void`

See #writeMultimap for the data format. The number of distinct keys is determined by a prior call
 to #readCount.

**Parameters:**
- `multimap` ([`com.google.common.collect.Multimap<K,V>`](./Multimap.md))
- `stream` (`java.io.ObjectInputStream`)
- `distinctKeys` (`int`)

### `getFieldSetter(java.lang.Class<T> clazz, java.lang.String fieldName)`

**Returns:** `com.google.common.collect.Serialization.FieldSetter<T>`

**Parameters:**
- `clazz` (`java.lang.Class<T>`)
- `fieldName` (`java.lang.String`)

