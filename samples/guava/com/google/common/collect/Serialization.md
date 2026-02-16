# Class: `Serialization`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Serialization`

## Description

Provides static methods for serializing collection classes.

 <p>This class assists the implementation of collection classes. Do not use this class to
 serialize collections that are defined elsewhere.
**Author:** Jared Levy

## Constructors

### `<init>()`

## Methods

### `readCount(`java.io.ObjectInputStream` stream)`

**Returns:** `int`

Reads a count corresponding to a serialized map, multiset, or multimap. It returns the size of
 a map serialized by `writeMap(Map, ObjectOutputStream)`, the number of distinct elements
 in a multiset serialized by `writeMultiset(Multiset, ObjectOutputStream)`, or the number
 of distinct keys in a multimap serialized by `writeMultimap(Multimap,
 ObjectOutputStream)`.

### `writeMap(`java.util.Map<K,V>` map, `java.io.ObjectOutputStream` stream)`

**Returns:** `void`

Stores the contents of a map in an output stream, as part of serialization. It does not support
 concurrent maps whose content may change while the method is running.

 <p>The serialized output consists of the number of entries, first key, first value, second key,
 second value, and so on.

### `populateMap(`java.util.Map<K,V>` map, `java.io.ObjectInputStream` stream)`

**Returns:** `void`

Populates a map by reading an input stream, as part of deserialization. See `writeMap`
 for the data format.

### `populateMap(`java.util.Map<K,V>` map, `java.io.ObjectInputStream` stream, `int` size)`

**Returns:** `void`

Populates a map by reading an input stream, as part of deserialization. See `writeMap`
 for the data format. The size is determined by a prior call to `readCount`.

### `writeMultiset([`com.google.common.collect.Multiset<E>`](./Multiset.md) multiset, `java.io.ObjectOutputStream` stream)`

**Returns:** `void`

Stores the contents of a multiset in an output stream, as part of serialization. It does not
 support concurrent multisets whose content may change while the method is running.

 <p>The serialized output consists of the number of distinct elements, the first element, its
 count, the second element, its count, and so on.

### `populateMultiset([`com.google.common.collect.Multiset<E>`](./Multiset.md) multiset, `java.io.ObjectInputStream` stream)`

**Returns:** `void`

Populates a multiset by reading an input stream, as part of deserialization. See `writeMultiset` for the data format.

### `populateMultiset([`com.google.common.collect.Multiset<E>`](./Multiset.md) multiset, `java.io.ObjectInputStream` stream, `int` distinctElements)`

**Returns:** `void`

Populates a multiset by reading an input stream, as part of deserialization. See `writeMultiset` for the data format. The number of distinct elements is determined by a prior
 call to `readCount`.

### `writeMultimap([`com.google.common.collect.Multimap<K,V>`](./Multimap.md) multimap, `java.io.ObjectOutputStream` stream)`

**Returns:** `void`

Stores the contents of a multimap in an output stream, as part of serialization. It does not
 support concurrent multimaps whose content may change while the method is running. The `Multimap.asMap` view determines the ordering in which data is written to the stream.

 <p>The serialized output consists of the number of distinct keys, and then for each distinct
 key: the key, the number of values for that key, and the key's values.

### `populateMultimap([`com.google.common.collect.Multimap<K,V>`](./Multimap.md) multimap, `java.io.ObjectInputStream` stream)`

**Returns:** `void`

Populates a multimap by reading an input stream, as part of deserialization. See `writeMultimap` for the data format.

### `populateMultimap([`com.google.common.collect.Multimap<K,V>`](./Multimap.md) multimap, `java.io.ObjectInputStream` stream, `int` distinctKeys)`

**Returns:** `void`

Populates a multimap by reading an input stream, as part of deserialization. See `writeMultimap` for the data format. The number of distinct keys is determined by a prior call
 to `readCount`.

### `getFieldSetter(`java.lang.Class<T>` clazz, `java.lang.String` fieldName)`

**Returns:** [`com.google.common.collect.Serialization.FieldSetter<T>`](Serialization/FieldSetter.md)

